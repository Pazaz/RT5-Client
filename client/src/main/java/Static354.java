import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static354 {

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Z")
	public static boolean stereo;

	@OriginalMember(owner = "client!un", name = "I", descriptor = "Lclient!cc;")
	public static PrivilegedRequest aClass32_5;

	@OriginalMember(owner = "client!un", name = "L", descriptor = "Z")
	private static boolean aBoolean96;

	@OriginalMember(owner = "client!un", name = "M", descriptor = "Z")
	private static boolean aBoolean97;

	@OriginalMember(owner = "client!un", name = "N", descriptor = "I")
	private static int anInt1182;

	@OriginalMember(owner = "client!un", name = "O", descriptor = "Z")
	private static boolean aBoolean98;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method1381(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static322.anInt6029 = 7;
		Static256.anInt4716 = 0x1 << Static322.anInt6029;
		Static253.anInt4693 = Static256.anInt4716 >> 1;
		Static313.anInt5876 = (int) Math.sqrt((double) (Static253.anInt4693 * Static253.anInt4693 + Static253.anInt4693 * Static253.anInt4693));
		Static72.anInt1684 = arg0;
		Static210.anInt3773 = arg1;
		Static212.anInt3788 = arg2;
		Static390.aClass67ArrayArrayArray5 = new Class67[4][Static72.anInt1684][Static210.anInt3773];
		Static330.aClass6Array3 = new Class6[4];
		if (arg3) {
			Static82.anIntArrayArray16 = new int[Static72.anInt1684][Static210.anInt3773];
			Static314.aByteArrayArray17 = new byte[Static72.anInt1684][Static210.anInt3773];
			Static32.aByteArrayArray4 = new byte[Static72.anInt1684][Static210.anInt3773];
			Static90.aClass67ArrayArrayArray4 = new Class67[1][Static72.anInt1684][Static210.anInt3773];
			Static186.aClass6Array2 = new Class6[1];
		} else {
			Static82.anIntArrayArray16 = null;
			Static314.aByteArrayArray17 = null;
			Static32.aByteArrayArray4 = null;
			Static90.aClass67ArrayArrayArray4 = null;
			Static186.aClass6Array2 = null;
		}
		if (arg4) {
			Static51.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static306.aClass2_Sub26_Sub1Array2 = new Class2_Sub26_Sub1[65535];
			Static351.aBooleanArray57 = new boolean[65535];
			Static164.anInt3139 = 0;
		} else {
			Static51.aLongArrayArrayArray1 = null;
			Static306.aClass2_Sub26_Sub1Array2 = null;
			Static351.aBooleanArray57 = null;
			Static164.anInt3139 = 0;
		}
		Static341.method5767(false);
		Static246.aClass58Array3 = new Class58[500];
		Static266.anInt4901 = 0;
		Static183.aClass58Array2 = new Class58[500];
		Static66.anInt1622 = 0;
		Static165.anIntArrayArrayArray9 = new int[4][Static72.anInt1684 + 1][Static210.anInt3773 + 1];
		Static98.aClass11_Sub5Array1 = new Entity[5000];
		Static378.anInt7077 = 0;
		Static6.aBooleanArrayArray1 = new boolean[Static212.anInt3788 + Static212.anInt3788 + 1][Static212.anInt3788 + Static212.anInt3788 + 1];
		Static364.aBooleanArrayArray5 = new boolean[Static212.anInt3788 + Static212.anInt3788 + 2][Static212.anInt3788 + Static212.anInt3788 + 2];
		Static163.aClass15_1 = null;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZLclient!bt;)Lclient!oq;")
	public static Class173_Sub1 method1393(@OriginalArg(1) Buffer arg0) {
		return new Class173_Sub1(arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.ig3(), arg0.g1());
	}
}
