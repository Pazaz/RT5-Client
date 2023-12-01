import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	public static int anInt3318;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "[Lclient!wk;")
	public static final SynthSound[] aClass247Array2 = new SynthSound[50];

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public static int anInt3317 = -1;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)Z")
	public static boolean method3310() {
		try {
			if (MusicPlayer.state == 2) {
				if (MusicPlayer.song == null) {
					MusicPlayer.song = Static407.method5448(MusicPlayer.songArchive, Static105.anInt2183, Static341.anInt6376);
					if (MusicPlayer.song == null) {
						return false;
					}
				}
				if (MusicPlayer.soundBank == null) {
					MusicPlayer.soundBank = new SoundBank(Static123.aClass197_30, Static177.aClass197_48);
				}
				if (MusicPlayer.stream.method4281(MusicPlayer.soundBank, MusicPlayer.song, Static111.aClass197_25)) {
					MusicPlayer.stream.releaseInstruments();
					MusicPlayer.stream.setVolume(Static356.anInt6641);
					MusicPlayer.stream.method4273(MusicPlayer.song, Static384.aBoolean485);
					MusicPlayer.song = null;
					MusicPlayer.songArchive = null;
					MusicPlayer.soundBank = null;
					MusicPlayer.state = 0;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			MusicPlayer.stream.method4274();
			MusicPlayer.state = 0;
			MusicPlayer.soundBank = null;
			MusicPlayer.songArchive = null;
			MusicPlayer.song = null;
		}
		return false;
	}
}
