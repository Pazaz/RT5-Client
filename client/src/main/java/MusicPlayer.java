import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MusicPlayer {

	@OriginalMember(owner = "client!fk", name = "xb", descriptor = "I")
	public static int titleSong;
	@OriginalMember(owner = "client!jt", name = "db", descriptor = "I")
	public static int groupId = -1;
	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public static int state = 0;
	@OriginalMember(owner = "client!f", name = "F", descriptor = "Lclient!od;")
	public static MidiPcmStream stream;
	@OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
	public static int volumeFadeRate;
	@OriginalMember(owner = "client!it", name = "f", descriptor = "Lclient!sl;")
	public static Song song;
	@OriginalMember(owner = "client!jl", name = "eb", descriptor = "Lclient!bk;")
	public static SoundBank soundBank;
	@OriginalMember(owner = "client!go", name = "p", descriptor = "Lclient!r;")
	public static Js5 songArchive;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIII)V")
	public static void playSong(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg1 * client.preferences.musicVolume >> 8;
		if (arg2 == -1 && !MidiPlayer.jingle) {
			MidiPlayer.method6192();
		} else if (arg2 != -1 && (groupId != arg2 || !Static64.method1704()) && local6 != 0 && !MidiPlayer.jingle) {
			Static180.method3367(arg2, arg0, local6, client.jsArchive6);
		}
		groupId = arg2;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
	public static void playJingle(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 * client.preferences.musicVolume >> 8;
		if (local15 != 0 && arg0 != -1) {
			MidiPlayer.playImmediate(local15, arg0, client.jsArchive11);
			MidiPlayer.jingle = true;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
	public static void mainLogic() {
		try {
			if (state == 1) {
				@Pc(16) int local16 = stream.getVolume();
				if (local16 > 0 && stream.isValid()) {
					local16 -= volumeFadeRate;
					if (local16 < 0) {
						local16 = 0;
					}
					stream.setVolume(local16);
				} else {
					stream.method4274();
					stream.clearInstruments();
					song = null;
					soundBank = null;
					if (songArchive == null) {
						state = 0;
					} else {
						state = 2;
					}
				}
			}
		} catch (@Pc(57) Exception local57) {
			local57.printStackTrace();
			stream.method4274();
			soundBank = null;
			state = 0;
			songArchive = null;
			song = null;
		}
	}

}
