import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_1 = new Class16("", 16);

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ab", name = "H", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_1 = new Class79("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!ab", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
	public static int anInt61 = -1;

	@OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
	public static int anInt62 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILclient!wm;[[[BIBIIIIII)V")
	public static void method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg5 == 0 || arg7 == 0) {
			return;
		}
		if (arg5 == 9) {
			arg9 = arg9 + 1 & 0x3;
			arg5 = 1;
		}
		if (arg5 == 10) {
			arg9 = arg9 + 3 & 0x3;
			arg5 = 1;
		}
		if (arg5 == 11) {
			arg9 = arg9 + 3 & 0x3;
			arg5 = 8;
		}
		arg3.method2900(arg1, arg2, arg8, arg11, arg6, arg10, arg4[arg5 - 1][arg9], arg7, arg0);
	}
}
