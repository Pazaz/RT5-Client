import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public static int anInt4554;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!uh;")
	public static Class202 aClass202_1 = new Class202();

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public static int anInt4555 = 0;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public static int anInt4559 = 0;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString165 = "Checking for updates - ";

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString166 = "Close";

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
	public static void method3938(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub1_Sub10 local13 = Static122.method2624(5, arg0);
		local13.method2536();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method3939() {
		Static344.aClass40_9.method2705(((float) Static216.anInt4909 * 0.1F + 0.7F) * Static137.aFloat45);
		Static344.aClass40_9.method2776(Static179.anInt4232, Static239.aFloat64, Static278.aFloat49, (float) Static137.anInt3414, (float) Static256.anInt5542, (float) Static222.anInt5047);
		Static344.aClass40_9.method2716(Static307.aClass94_4);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!nr;ILclient!kb;Lclient!lo;)V")
	public static void method3940(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class107 arg1, @OriginalArg(3) Class1_Sub21 arg2) {
		@Pc(10) Class29 local10 = arg1.method3292(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5840();
		if (local10.method5838() > local16) {
			local16 = local10.method5838();
		}
		@Pc(28) int local28 = arg2.anInt4156;
		@Pc(31) int local31 = arg2.anInt4157;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg1.aString138 != null) {
			local33 = Static268.aClass63_7.method1848(null, arg1.aString138, Static91.aStringArray18, null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static91.aStringArray18[local51];
				if (local51 < local33 - 1) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static99.aClass146_5.method4339(local57);
				if (local35 < local74) {
					local35 = local74;
				}
			}
			local37 = Static99.aClass146_5.method4335() * local33 + Static99.aClass146_5.method4340() / 2;
		}
		local51 = arg2.anInt4156 + local16 / 2;
		@Pc(104) int local104 = arg2.anInt4157;
		if (local28 < Static201.anInt4286 + local16) {
			local28 = Static201.anInt4286;
			local51 = local35 / 2 + local16 / 2 + Static201.anInt4286 + 5 + 10;
		} else if (local28 > Static201.anInt4276 - local16) {
			local28 = Static201.anInt4276 - local16;
			local51 = Static201.anInt4276 - local35 / 2 - local16 / 2 - 5 - 10;
		}
		if (local16 + Static201.anInt4278 > local31) {
			local104 = local16 / 2 + Static201.anInt4278 + 10;
			local31 = Static201.anInt4278;
		} else if (local31 > Static201.anInt4277 - local16) {
			local31 = Static201.anInt4277 - local16;
			local104 = Static201.anInt4277 - local37 - local16 / 2 - 10;
		}
		local74 = (int) (Math.atan2((double) (local28 - arg2.anInt4156), (double) (local31 - arg2.anInt4157)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5843((float) local28 + (float) local16 / 2.0F, (float) local31 + (float) local16 / 2.0F, 4096, local74);
		@Pc(240) int local240 = -2;
		@Pc(242) int local242 = -2;
		@Pc(244) int local244 = -2;
		@Pc(246) int local246 = -2;
		if (arg1.aString138 != null) {
			local240 = local51 - local35 / 2 - 5;
			local242 = local104;
			local244 = local240 + local35 + 10;
			local246 = Static99.aClass146_5.method4335() * local33 + local104 + 3;
			if (arg1.anInt3781 != 0) {
				arg0.method2745(local244 - local240, local246 + -local104, local240, local104, arg1.anInt3781);
			}
			if (arg1.anInt3784 != 0) {
				arg0.method2806(local246 - local104, local240, local244 - local240, local104, arg1.anInt3784);
			}
			for (@Pc(319) int local319 = 0; local319 < local33; local319++) {
				@Pc(325) String local325 = Static91.aStringArray18[local319];
				if (local33 - 1 > local319) {
					local325 = local325.substring(0, local325.length() - 4);
				}
				Static99.aClass146_5.method4341(arg0, local325, local51, local104, arg1.anInt3767);
				local104 += Static99.aClass146_5.method4335();
			}
		}
		if (arg1.anInt3793 == -1 && arg1.aString138 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(380) Class1_Sub42 local380 = new Class1_Sub42(arg2);
		local380.anInt7205 = local31 - local16;
		local380.anInt7208 = local28 - local16;
		local380.anInt7211 = local28 + local16;
		local380.anInt7206 = local244;
		local380.anInt7204 = local246;
		local380.anInt7203 = local242;
		local380.anInt7202 = local240;
		local380.anInt7212 = local31 + local16;
		Static112.aClass130_10.method3760(local380);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!il;Lclient!ud;IB)V")
	public static void method3941(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub8 local9 = new Class1_Sub8();
		local9.anInt2058 = arg0.method5761();
		local9.anInt2056 = arg0.method5730();
		local9.anIntArray133 = new int[local9.anInt2058];
		local9.aClass145Array2 = new Class145[local9.anInt2058];
		local9.anIntArray134 = new int[local9.anInt2058];
		local9.anIntArray131 = new int[local9.anInt2058];
		local9.aClass145Array1 = new Class145[local9.anInt2058];
		local9.aByteArrayArrayArray4 = new byte[local9.anInt2058][][];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt2058; local56++) {
			try {
				@Pc(62) int local62 = arg0.method5761();
				@Pc(74) String local74;
				@Pc(78) String local78;
				@Pc(80) int local80;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local74 = arg0.method5776();
					local78 = arg0.method5776();
					local80 = 0;
					if (local62 == 1) {
						local80 = arg0.method5730();
					}
					local9.anIntArray131[local56] = local62;
					local9.anIntArray134[local56] = local80;
					local9.aClass145Array2[local56] = arg1.method5463(local78, Static49.method1356(local74));
				} else if (local62 == 3 || local62 == 4) {
					local74 = arg0.method5776();
					local78 = arg0.method5776();
					local80 = arg0.method5761();
					@Pc(131) String[] local131 = new String[local80];
					for (@Pc(133) int local133 = 0; local133 < local80; local133++) {
						local131[local133] = arg0.method5776();
					}
					@Pc(152) byte[][] local152 = new byte[local80][];
					@Pc(165) int local165;
					if (local62 == 3) {
						for (@Pc(159) int local159 = 0; local159 < local80; local159++) {
							local165 = arg0.method5730();
							local152[local159] = new byte[local165];
							arg0.method5774(local165, local152[local159]);
						}
					}
					local9.anIntArray131[local56] = local62;
					@Pc(194) Class[] local194 = new Class[local80];
					for (local165 = 0; local165 < local80; local165++) {
						local194[local165] = Static49.method1356(local131[local165]);
					}
					local9.aClass145Array1[local56] = arg1.method5470(local78, local194, Static49.method1356(local74));
					local9.aByteArrayArrayArray4[local56] = local152;
				}
			} catch (@Pc(233) ClassNotFoundException local233) {
				local9.anIntArray133[local56] = -1;
			} catch (@Pc(240) SecurityException local240) {
				local9.anIntArray133[local56] = -2;
			} catch (@Pc(247) NullPointerException local247) {
				local9.anIntArray133[local56] = -3;
			} catch (@Pc(254) Exception local254) {
				local9.anIntArray133[local56] = -4;
			} catch (@Pc(261) Throwable local261) {
				local9.anIntArray133[local56] = -5;
			}
		}
		Static92.aClass130_7.method3760(local9);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)Z")
	public static boolean method3942(@OriginalArg(1) int arg0) {
		if (Static99.aBooleanArray8[arg0]) {
			return true;
		} else if (Static240.aClass162_190.method4639(arg0)) {
			@Pc(23) int local23 = Static240.aClass162_190.method4640(arg0);
			if (local23 == 0) {
				Static99.aBooleanArray8[arg0] = true;
				return true;
			}
			if (Class1_Sub2_Sub10.lb[arg0] == null) {
				Class1_Sub2_Sub10.lb[arg0] = new Class177[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Class1_Sub2_Sub10.lb[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static240.aClass162_190.method4636(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class177 local73 = Class1_Sub2_Sub10.lb[arg0][local47] = new Class177();
						local73.anInt5828 = local47 + (arg0 << 16);
						if (local61[0] == -1) {
							local73.method4909(new Class1_Sub16(local61));
						} else {
							local73.method4903(new Class1_Sub16(local61));
						}
					}
				}
			}
			Static99.aBooleanArray8[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
