import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString192 = " is already on your friend list.";

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString193 = "Loading fonts - ";

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "[I")
	public static final int[] anIntArray398 = new int[5];

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZCLjava/lang/String;)I")
	public static int method4605(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Z")
	public static boolean method4606() {
		return Static344.anInt7239 == 0 ? Static200.aClass1_Sub3_Sub1_1.method2221() : true;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZZ)V")
	public static void method4608(@OriginalArg(0) boolean arg0) {
		Static24.aBoolean52 = arg0;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(76) int local76;
		@Pc(209) int local209;
		@Pc(213) int local213;
		if (!Static24.aBoolean52) {
			@Pc(401) int local401 = Static299.aClass1_Sub16_Sub2_3.method5758();
			local33 = Static299.aClass1_Sub16_Sub2_3.method5749();
			local37 = Static299.aClass1_Sub16_Sub2_3.method5761();
			@Pc(420) boolean local420 = Static299.aClass1_Sub16_Sub2_3.method5738() == 1;
			local45 = (Static200.anInt4591 - Static299.aClass1_Sub16_Sub2_3.anInt6813) / 16;
			Static80.anIntArrayArray8 = new int[local45][4];
			for (local49 = 0; local49 < local45; local49++) {
				for (local53 = 0; local53 < 4; local53++) {
					Static80.anIntArrayArray8[local49][local53] = Static299.aClass1_Sub16_Sub2_3.method5730();
				}
			}
			local53 = Static299.aClass1_Sub16_Sub2_3.method5738();
			local61 = Static299.aClass1_Sub16_Sub2_3.method5749();
			local65 = Static299.aClass1_Sub16_Sub2_3.method5749();
			Static133.method3026(local37);
			Static112.anIntArray204 = new int[local45];
			Static114.anIntArray483 = new int[local45];
			Static304.anIntArray487 = null;
			Static340.aByteArrayArray57 = new byte[local45][];
			Static264.anIntArray414 = new int[local45];
			Static93.aByteArrayArray22 = new byte[local45][];
			Static49.anIntArray98 = new int[local45];
			Static171.aByteArrayArray36 = null;
			Static102.anIntArray163 = new int[local45];
			Static32.aByteArrayArray56 = new byte[local45][];
			Static139.aByteArrayArray26 = new byte[local45][];
			@Pc(510) boolean local510 = false;
			if ((local401 / 8 == 48 || local401 / 8 == 49) && local65 / 8 == 48) {
				local510 = true;
			}
			local45 = 0;
			if (local401 / 8 == 48 && local65 / 8 == 148) {
				local510 = true;
			}
			for (local76 = (local401 - (Static25.anInt850 >> 4)) / 8; local76 <= ((Static25.anInt850 >> 4) + local401) / 8; local76++) {
				for (local209 = (local65 - (Static219.anInt4987 >> 4)) / 8; local209 <= ((Static219.anInt4987 >> 4) + local65) / 8; local209++) {
					local213 = local209 + (local76 << 8);
					if (local510 && (local209 == 49 || local209 == 149 || local209 == 147 || local76 == 50 || local76 == 49 && local209 == 47)) {
						Static112.anIntArray204[local45] = local213;
						Static264.anIntArray414[local45] = -1;
						Static114.anIntArray483[local45] = -1;
						Static49.anIntArray98[local45] = -1;
						Static102.anIntArray163[local45] = -1;
					} else {
						Static112.anIntArray204[local45] = local213;
						Static264.anIntArray414[local45] = Static50.aClass162_56.method4631("m" + local76 + "_" + local209);
						Static114.anIntArray483[local45] = Static50.aClass162_56.method4631("l" + local76 + "_" + local209);
						Static49.anIntArray98[local45] = Static50.aClass162_56.method4631("um" + local76 + "_" + local209);
						Static102.anIntArray163[local45] = Static50.aClass162_56.method4631("ul" + local76 + "_" + local209);
					}
					local45++;
				}
			}
			Static191.method3801(false, local65, local420, local401, local33, local53, local61);
			return;
		}
		@Pc(29) boolean local29 = Static299.aClass1_Sub16_Sub2_3.method5729() == 1;
		local33 = Static299.aClass1_Sub16_Sub2_3.method5749();
		local37 = Static299.aClass1_Sub16_Sub2_3.method5738();
		@Pc(41) int local41 = Static299.aClass1_Sub16_Sub2_3.method5758();
		local45 = Static299.aClass1_Sub16_Sub2_3.method5769();
		local49 = Static299.aClass1_Sub16_Sub2_3.method5766();
		local53 = Static299.aClass1_Sub16_Sub2_3.method5749();
		Static133.method3026(local37);
		Static299.aClass1_Sub16_Sub2_3.method5798();
		@Pc(69) int local69;
		for (local61 = 0; local61 < 4; local61++) {
			for (local65 = 0; local65 < Static25.anInt850 >> 3; local65++) {
				for (local69 = 0; local69 < Static219.anInt4987 >> 3; local69++) {
					local76 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
					if (local76 == 1) {
						Static226.anIntArrayArrayArray10[local61][local65][local69] = Static299.aClass1_Sub16_Sub2_3.method5800(26);
					} else {
						Static226.anIntArrayArrayArray10[local61][local65][local69] = -1;
					}
				}
			}
		}
		Static299.aClass1_Sub16_Sub2_3.method5792();
		local65 = (Static200.anInt4591 - Static299.aClass1_Sub16_Sub2_3.anInt6813) / 16;
		Static80.anIntArrayArray8 = new int[local65][4];
		for (local69 = 0; local69 < local65; local69++) {
			for (local76 = 0; local76 < 4; local76++) {
				Static80.anIntArrayArray8[local69][local76] = Static299.aClass1_Sub16_Sub2_3.method5730();
			}
		}
		Static102.anIntArray163 = new int[local65];
		Static112.anIntArray204 = new int[local65];
		Static304.anIntArray487 = null;
		Static139.aByteArrayArray26 = new byte[local65][];
		Static340.aByteArrayArray57 = new byte[local65][];
		Static171.aByteArrayArray36 = null;
		Static264.anIntArray414 = new int[local65];
		Static49.anIntArray98 = new int[local65];
		Static114.anIntArray483 = new int[local65];
		Static93.aByteArrayArray22 = new byte[local65][];
		Static32.aByteArrayArray56 = new byte[local65][];
		local65 = 0;
		for (local76 = 0; local76 < 4; local76++) {
			for (local209 = 0; local209 < Static25.anInt850 >> 3; local209++) {
				for (local213 = 0; local213 < Static219.anInt4987 >> 3; local213++) {
					@Pc(223) int local223 = Static226.anIntArrayArrayArray10[local76][local209][local213];
					if (local223 != -1) {
						@Pc(233) int local233 = local223 >> 14 & 0x3FF;
						@Pc(239) int local239 = local223 >> 3 & 0x7FF;
						@Pc(249) int local249 = (local233 / 8 << 8) + local239 / 8;
						for (@Pc(251) int local251 = 0; local251 < local65; local251++) {
							if (Static112.anIntArray204[local251] == local249) {
								local249 = -1;
								break;
							}
						}
						if (local249 != -1) {
							Static112.anIntArray204[local65] = local249;
							@Pc(288) int local288 = local249 >> 8 & 0xFF;
							@Pc(292) int local292 = local249 & 0xFF;
							Static264.anIntArray414[local65] = Static50.aClass162_56.method4631("m" + local288 + "_" + local292);
							Static114.anIntArray483[local65] = Static50.aClass162_56.method4631("l" + local288 + "_" + local292);
							Static49.anIntArray98[local65] = Static50.aClass162_56.method4631("um" + local288 + "_" + local292);
							Static102.anIntArray163[local65] = Static50.aClass162_56.method4631("ul" + local288 + "_" + local292);
							local65++;
						}
					}
				}
			}
		}
		Static191.method3801(false, local33, local29, local53, local45, local49, local41);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIII)V")
	public static void method4609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static209.method4125(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg0;
		@Pc(24) int local24 = -arg0;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(37) int[] local37 = Static87.anIntArrayArray9[arg2];
		@Pc(42) int local42 = arg3 - local15;
		Static12.method349(local42, local37, arg4, arg3 - arg0);
		@Pc(55) int local55 = local15 + arg3;
		Static12.method349(local55, local37, arg1, local42);
		Static12.method349(arg3 + arg0, local37, arg4, local55);
		while (local10 < local21) {
			local33 += 2;
			local31 += 2;
			local24 += local31;
			local29 += local33;
			if (local29 >= 0 && local26 >= 1) {
				Static175.anIntArray292[local26] = local10;
				local26--;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(123) int[] local123;
			@Pc(129) int[] local129;
			@Pc(133) int local133;
			@Pc(137) int local137;
			@Pc(142) int local142;
			@Pc(146) int local146;
			@Pc(150) int local150;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				if (local15 > local21) {
					local123 = Static87.anIntArrayArray9[local21 + arg2];
					local129 = Static87.anIntArrayArray9[arg2 - local21];
					local133 = Static175.anIntArray292[local21];
					local137 = local10 + arg3;
					local142 = arg3 - local10;
					local146 = arg3 + local133;
					local150 = arg3 - local133;
					Static12.method349(local150, local123, arg4, local142);
					Static12.method349(local146, local123, arg1, local150);
					Static12.method349(local137, local123, arg4, local146);
					Static12.method349(local150, local129, arg4, local142);
					Static12.method349(local146, local129, arg1, local150);
					Static12.method349(local137, local129, arg4, local146);
				} else {
					local123 = Static87.anIntArrayArray9[arg2 + local21];
					local129 = Static87.anIntArrayArray9[arg2 - local21];
					local133 = arg3 + local10;
					local137 = arg3 - local10;
					Static12.method349(local133, local123, arg4, local137);
					Static12.method349(local133, local129, arg4, local137);
				}
			}
			local123 = Static87.anIntArrayArray9[local10 + arg2];
			local129 = Static87.anIntArrayArray9[arg2 - local10];
			local133 = local21 + arg3;
			local137 = arg3 - local21;
			if (local10 >= local15) {
				Static12.method349(local133, local123, arg4, local137);
				Static12.method349(local133, local129, arg4, local137);
			} else {
				local142 = local26 < local10 ? Static175.anIntArray292[local10] : local26;
				local146 = local142 + arg3;
				local150 = arg3 - local142;
				Static12.method349(local150, local123, arg4, local137);
				Static12.method349(local146, local123, arg1, local150);
				Static12.method349(local133, local123, arg4, local146);
				Static12.method349(local150, local129, arg4, local137);
				Static12.method349(local146, local129, arg1, local150);
				Static12.method349(local133, local129, arg4, local146);
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)J")
	public static long method4610() {
		return Static150.aClass106_1.method6135();
	}
}
