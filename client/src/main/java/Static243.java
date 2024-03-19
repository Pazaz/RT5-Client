import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
	public static int anInt5366;

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean376 = true;

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "Lclient!we;")
	public static final Class215 aClass215_75 = new Class215(8);

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "[I")
	public static final int[] anIntArray395 = new int[5];

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "Lclient!ld;")
	public static final Class57 aClass57_1 = Static197.method3895();

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!qj;I)V")
	public static void method4559(@OriginalArg(0) Class162 arg0) {
		Static324.aClass162_227 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZLclient!vp;)V")
	public static void method4560(@OriginalArg(1) Class7_Sub1_Sub1_Sub2 arg0) {
		@Pc(15) Class1_Sub20 local15 = (Class1_Sub20) Static195.aClass183_22.method5053((long) arg0.anInt7070);
		if (local15 == null) {
			Static67.method143(arg0, 0, arg0.anIntArray579[0], null, Static39.anInt1215, null, arg0.anIntArray578[0]);
		} else {
			local15.method3451();
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)Lclient!ll;")
	public static Class122 method4561(@OriginalArg(0) int arg0) {
		@Pc(5) Class215 local5 = Static304.aClass215_91;
		@Pc(14) Class122 local14;
		synchronized (Static304.aClass215_91) {
			local14 = (Class122) Static304.aClass215_91.method6057((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(36) byte[] local36 = Static122.aClass162_108.method4636(Static245.method2662(arg0), Static264.method4785(arg0));
		local14 = new Class122();
		local14.anInt4137 = arg0;
		if (local36 != null) {
			local14.method3544(new Class1_Sub16(local36));
		}
		@Pc(59) Class215 local59 = Static304.aClass215_91;
		synchronized (Static304.aClass215_91) {
			Static304.aClass215_91.method6050(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public static void method4562() {
		try {
			if (Static344.anInt7239 == 1) {
				@Pc(16) int local16 = Static200.aClass1_Sub3_Sub1_1.method2218();
				if (local16 > 0 && Static200.aClass1_Sub3_Sub1_1.method2221()) {
					local16 -= Static288.anInt6077;
					if (local16 < 0) {
						local16 = 0;
					}
					Static200.aClass1_Sub3_Sub1_1.method2222(local16);
				} else {
					Static200.aClass1_Sub3_Sub1_1.method2213();
					Static200.aClass1_Sub3_Sub1_1.method2219();
					if (Static254.aClass162_195 == null) {
						Static344.anInt7239 = 0;
					} else {
						Static344.anInt7239 = 2;
					}
					Static296.aClass1_Sub28_2 = null;
					Static24.aClass85_1 = null;
				}
			}
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			Static200.aClass1_Sub3_Sub1_1.method2213();
			Static344.anInt7239 = 0;
			Static296.aClass1_Sub28_2 = null;
			Static254.aClass162_195 = null;
			Static24.aClass85_1 = null;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([BZIILclient!nr;I[Lclient!bi;)V")
	public static void method4564(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class40 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class22[] arg5) {
		@Pc(10) Class1_Sub16 local10 = new Class1_Sub16(arg0);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method5764();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method5744();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local10.method5761();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				@Pc(77) int local77 = arg4 + local57;
				@Pc(82) int local82 = local51 + arg2;
				if (local77 > 0 && local82 > 0 && Static25.anInt850 - 1 > local77 && local82 < Static219.anInt4987 - 1) {
					@Pc(102) Class22 local102 = null;
					if (!arg1) {
						@Pc(106) int local106 = local61;
						if ((Static62.aByteArrayArrayArray3[1][local77][local82] & 0x2) == 2) {
							local106 = local61 - 1;
						}
						if (local106 >= 0) {
							local102 = arg5[local106];
						}
					}
					Static231.method4394(true, local17, arg3, local61, local102, local69, local61, local77, local73, local82, -1, arg1);
				}
			}
		}
	}
}
