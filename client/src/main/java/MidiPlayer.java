import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class MidiPlayer {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Z")
	public static boolean jingle = false;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!r;Lclient!r;Lclient!r;Lclient!od;I)Z")
	public static boolean init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) MidiPcmStream arg3) {
		MusicPlayer.stream = arg3;
		Static123.aClass197_30 = arg2;
		Static177.aClass197_48 = arg0;
		Static111.aClass197_25 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIZILclient!r;)V")
	public static void playImmediate(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Js5 arg2) {
		Static341.anInt6376 = 0;
		Static105.anInt2183 = arg1;
		MusicPlayer.volumeFadeRate = 10000;
		Static384.aBoolean485 = false;
		MusicPlayer.songArchive = arg2;
		MusicPlayer.state = 1;
		Static356.anInt6641 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "(I)V")
	public static void method6192() {
		MusicPlayer.stream.method4274();
		MusicPlayer.songArchive = null;
		MusicPlayer.state = 1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)V")
	public static void method5211(@OriginalArg(0) int arg0) {
		if (MusicPlayer.state == 0) {
			MusicPlayer.stream.setVolume(arg0);
		} else {
			Static356.anInt6641 = arg0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public static void playFadeOut() {
		Static384.aBoolean485 = false;
		MusicPlayer.state = 1;
		Static105.anInt2183 = -1;
		MusicPlayer.songArchive = null;
		Static341.anInt6376 = -1;
		Static356.anInt6641 = 0;
		MusicPlayer.volumeFadeRate = 2;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILclient!r;ZI)V")
	public static void playFadeIn(@OriginalArg(0) int arg0, @OriginalArg(4) Js5 arg1, @OriginalArg(6) int arg2) {
		Static341.anInt6376 = 0;
		MusicPlayer.songArchive = arg1;
		Static105.anInt2183 = arg2;
		MusicPlayer.volumeFadeRate = 2;
		Static356.anInt6641 = arg0;
		MusicPlayer.state = 1;
		Static384.aBoolean485 = false;
	}

}
