import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!gr", name = "N", descriptor = "I")
	public static int anInt2582;

	@OriginalMember(owner = "client!gr", name = "R", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
	public static int anInt2577 = 0;

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!gr", name = "I", descriptor = "Lclient!we;")
	public static final Class215 aClass215_41 = new Class215(50);

	@OriginalMember(owner = "client!gr", name = "P", descriptor = "[I")
	public static final int[] anIntArray168 = new int[100];

	@OriginalMember(owner = "client!gr", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString95 = "glow2:";

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)I")
	public static int method2151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static10.anIntArray31[arg0 & 0x3] : Static67.anIntArray8[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)V")
	public static void method2152() {
		@Pc(9) Class215 local9 = Static304.aClass215_91;
		synchronized (Static304.aClass215_91) {
			Static304.aClass215_91.method6052();
		}
		local9 = Static80.aClass215_34;
		synchronized (Static80.aClass215_34) {
			Static80.aClass215_34.method6052();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg4) {
			Static21.method518(arg1, arg5, arg0, arg2, arg4, arg6);
		} else if (arg5 - arg4 >= Static239.anInt5299 && arg5 + arg4 <= Static179.anInt4229 && Static180.anInt4240 <= arg2 - arg3 && arg2 + arg3 <= Static197.anInt4520) {
			Static341.method6030(arg0, arg1, arg5, arg6, arg3, arg2, arg4);
		} else {
			Static117.method2579(arg6, arg1, arg0, arg2, arg5, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)V")
	public static void method2155() {
		@Pc(5) Class215 local5 = Static87.aClass215_38;
		synchronized (Static87.aClass215_38) {
			Static87.aClass215_38.method6063(5);
		}
		local5 = Static209.aClass215_67;
		synchronized (Static209.aClass215_67) {
			Static209.aClass215_67.method6063(5);
		}
		local5 = Static286.aClass215_86;
		synchronized (Static286.aClass215_86) {
			Static286.aClass215_86.method6063(5);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLclient!qj;Lclient!qj;)V")
	public static void method2156(@OriginalArg(1) Class162 arg0, @OriginalArg(2) Class162 arg1) {
		Static246.aClass162_223 = arg1;
		Static299.aClass162_215 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!oc;III[Z)V")
	public static void method2157(@OriginalArg(0) Class1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static118.aClass77Array1 == Static137.aClass77Array2) {
			return;
		}
		@Pc(9) int local9 = Static336.aClass77Array3[arg1].method3994(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class77 local22 = Static336.aClass77Array3[local11];
				if (local22 != null) {
					local22.method3995(arg0, arg2, local9 - local22.method3994(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZILjava/lang/String;Lclient!dr;)V")
	public static void method2158(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(24) int local24 = Static208.aClass63_6.method1845(250, arg1, null);
		@Pc(33) int local33 = Static208.aClass63_6.method1844(arg1, 250, null) * 13;
		Static221.aClass40_6.method2717(6, 6, local24 + 4 + 4, local33 + 4 + 4, -16777216, 0);
		Static221.aClass40_6.method2712(6, 6, local24 + 4 + 4, local33 + 4 + 4, -1, 0);
		arg2.method4836(null, null, 0, 1, 10, -1, 0, -1, local33, 0, arg1, null, 10, local24, 1);
		Static16.method455(6, local33 + 4 + 4, 6, local24 + 4 + 4);
		if (arg0) {
			Static221.aClass40_6.method2710();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)Lclient!hh;")
	public static Class83 method2159(@OriginalArg(0) int arg0) {
		@Pc(5) Class215 local5 = Static124.aClass215_49;
		@Pc(14) Class83 local14;
		synchronized (Static124.aClass215_49) {
			local14 = (Class83) Static124.aClass215_49.method6057((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(38) byte[] local38 = Static312.aClass162_207.method4636(arg0, 32);
		local14 = new Class83();
		if (local38 != null) {
			local14.method2375(new Class1_Sub16(local38));
		}
		local14.method2374();
		@Pc(56) Class215 local56 = Static124.aClass215_49;
		synchronized (Static124.aClass215_49) {
			Static124.aClass215_49.method6050(local14, (long) arg0);
			return local14;
		}
	}
}
