import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!l", name = "k", descriptor = "I")
	public static int anInt4026;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!mi;")
	public static final Class130 aClass130_23 = new Class130();

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	public static int anInt4022 = -1;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
	public static final int[] anIntArray283 = new int[] { 2, 0, -2, 7, 0, 1, 14, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 1, -1, 8, 5, 0, 0, -1, -1, 2, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 5, 0, 0, 8, 0, 0, 0, 0, 0, 5, 0, 0, 8, 7, 0, 9, 0, -2, 0, 0, 8, 0, 1, 0, 3, 2, 0, 0, 0, -2, 0, 10, -1, 3, -1, -2, 0, 3, 0, 0, 28, 7, 3, 0, 0, 0, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -2, -2, 0, 10, 0, 0, 7, 14, 0, 4, 0, 0, 12, -1, -2, 8, 11, 0, 3, 0, 0, 2, -1, 0, 8, -1, 0, 0, 20, 0, 6, -1, 0, -2, 12, -1, 0, 0, 0, 12, -2, -1, 0, 0, 0, 6, 0, 0, 0, 6, 0, 8, 8, -1, 10, 0, 0, 2, 5, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 4, 0, 0, 3, 0, 3, 12, 0, 0, 12, -1, 0, 0, 0, 0, 0, 0, 2, 0, -2, 6, 0, 0, 10, 2, 1, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 6, 0, 3, 0, 15, 0, 0, -1, 0, -1, 17, 0, 2, 0, 4, 0, 8, 0, 0, 0, 0, 0, 0, 0, 6, 2, 0, -1, 1, 6, 6, -2, 0, 0, 0, 4, 0 };

	@OriginalMember(owner = "client!l", name = "q", descriptor = "[S")
	public static final short[] aShortArray61 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Z")
	public static boolean aBoolean285 = true;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Z")
	public static boolean aBoolean286 = false;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	public static void method3459() {
		if (Static266.anIntArray417 != null && Static110.anIntArray232 != null) {
			return;
		}
		Static266.anIntArray417 = new int[256];
		Static110.anIntArray232 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static266.anIntArray417[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static110.anIntArray232[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	public static void method3461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static339.anInt7358 = arg0;
		Static264.anInt5616 = arg2;
		Static304.anInt6381 = arg1;
		Static32.anInt7023 = arg3;
		Static350.anInt7319 = arg4;
		if (Static264.anInt5616 >= 100) {
			@Pc(26) int local26 = Static32.anInt7023 * 128 + 64;
			@Pc(32) int local32 = Static339.anInt7358 * 128 + 64;
			@Pc(41) int local41 = Static309.method5429(local32, local26, Static39.anInt1215) - Static304.anInt6381;
			@Pc(46) int local46 = local26 - Static3.anInt92;
			@Pc(51) int local51 = local41 - Static138.anInt3429;
			@Pc(56) int local56 = local32 - Static88.anInt2339;
			@Pc(68) int local68 = (int) Math.sqrt((double) (local46 * local46 + local56 * local56));
			Static130.anInt6778 = (int) (Math.atan2((double) local51, (double) local68) * 2607.5945876176133D) & 0x3FFF;
			Static89.anInt2374 = (int) (-2607.5945876176133D * Math.atan2((double) local46, (double) local56)) & 0x3FFF;
			if (Static130.anInt6778 < 1024) {
				Static130.anInt6778 = 1024;
			}
			if (Static130.anInt6778 > 3072) {
				Static130.anInt6778 = 3072;
			}
		}
		Static303.anInt6342 = 2;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lclient!ib;")
	public static Class1_Sub1_Sub11 method3462(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub11 local10 = (Class1_Sub1_Sub11) Static59.aClass143_11.method4323((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static212.aClass162_245.method4636(arg0, 5);
		local10 = new Class1_Sub1_Sub11();
		if (local20 != null) {
			local10.method2643(new Class1_Sub16(local20));
		}
		Static59.aClass143_11.method4322(local10, (long) arg0);
		return local10;
	}
}
