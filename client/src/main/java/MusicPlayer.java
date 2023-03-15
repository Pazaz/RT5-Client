import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MusicPlayer {

	@OriginalMember(owner = "client!fk", name = "xb", descriptor = "I")
	public static int titleSong;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIII)V")
	public static void playSong(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg1 * client.preferences.anInt4889 >> 8;
		if (arg2 == -1 && !Static393.aBoolean486) {
			Static368.method6192();
		} else if (arg2 != -1 && (Static171.anInt3268 != arg2 || !Static64.method1704()) && local6 != 0 && !Static393.aBoolean486) {
			Static180.method3367(arg2, arg0, local6, client.jsArchive6);
		}
		Static171.anInt3268 = arg2;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
	public static void playJingle(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 * client.preferences.anInt4889 >> 8;
		if (local15 != 0 && arg0 != -1) {
			Static94.method2042(local15, arg0, client.jsArchive11);
			Static393.aBoolean486 = true;
		}
	}

}
