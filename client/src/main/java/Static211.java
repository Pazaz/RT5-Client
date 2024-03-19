import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
	public static int anInt3180;

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "Lclient!os;")
	public static Class146 aClass146_7;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IILclient!ud;Ljava/awt/Canvas;ILclient!fl;)Lclient!nr;")
	public static synchronized Class40 method2701(@OriginalArg(0) int arg0, @OriginalArg(2) Class199 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface4 arg4) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			if (!Static13.aBooleanArray23[local14]) {
				local12 = local14;
				break;
			}
		}
		if (local12 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(52) Class40 local52;
		if (arg3 == 0) {
			local52 = Static122.method2625(local12, arg2, arg4);
		} else if (arg3 == 1) {
			local52 = Static57.method4841(local12, arg4, arg2, arg0, arg1);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static13.aBooleanArray23[local12] = true;
		return local52;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZI)V")
	public static void method2742() {
		Static62.aClass215_22.method6063(5);
	}

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "(I)V")
	public static void method2744() {
		Static145.method3188(Static158.aClass177_11);
		Static13.anInt6489++;
		if (Static43.aBoolean94 && Static12.aBoolean37) {
			@Pc(24) int local24 = Static229.anInt5102;
			local24 -= Static309.anInt6462;
			@Pc(30) int local30 = Static85.anInt2268;
			if (local24 < Static285.anInt6033) {
				local24 = Static285.anInt6033;
			}
			local30 -= Static60.anInt6015;
			if (local30 < Static24.anInt802) {
				local30 = Static24.anInt802;
			}
			if (local24 + Static158.aClass177_11.anInt5803 > Static337.aClass177_21.anInt5803 + Static285.anInt6033) {
				local24 = Static285.anInt6033 + Static337.aClass177_21.anInt5803 - Static158.aClass177_11.anInt5803;
			}
			if (local30 + Static158.aClass177_11.anInt5816 > Static24.anInt802 - -Static337.aClass177_21.anInt5816) {
				local30 = Static337.aClass177_21.anInt5816 + Static24.anInt802 - Static158.aClass177_11.anInt5816;
			}
			@Pc(107) int local107 = local24 - Static227.anInt5079;
			@Pc(112) int local112 = local30 - Static183.anInt4314;
			@Pc(115) int local115 = Static158.aClass177_11.anInt5768;
			if (Static13.anInt6489 > Static158.aClass177_11.anInt5760 && (local107 > local115 || -local115 > local107 || local115 < local112 || local112 < -local115)) {
				Static109.aBoolean183 = true;
			}
			@Pc(151) int local151 = Static337.aClass177_21.anInt5811 + local24 - Static285.anInt6033;
			@Pc(159) int local159 = Static337.aClass177_21.anInt5806 + local30 - Static24.anInt802;
			@Pc(168) Class1_Sub15 local168;
			if (Static158.aClass177_11.anObjectArray12 != null && Static109.aBoolean183) {
				local168 = new Class1_Sub15();
				local168.anObjectArray4 = Static158.aClass177_11.anObjectArray12;
				local168.anInt3114 = local151;
				local168.aClass177_9 = Static158.aClass177_11;
				local168.anInt3117 = local159;
				Static267.method4825(local168);
			}
			if (Static237.anInt5288 == 0) {
				if (Static109.aBoolean183) {
					if (Static158.aClass177_11.anObjectArray23 != null) {
						local168 = new Class1_Sub15();
						local168.anInt3117 = local159;
						local168.aClass177_9 = Static158.aClass177_11;
						local168.aClass177_10 = Static43.aClass177_2;
						local168.anInt3114 = local151;
						local168.anObjectArray4 = Static158.aClass177_11.anObjectArray23;
						Static267.method4825(local168);
					}
					if (Static43.aClass177_2 != null && Static37.method917(Static158.aClass177_11) != null) {
						Static31.method698(Static158.aClass177_11.anInt5828, Static158.aClass177_11.anInt5776, Static43.aClass177_2.anInt5828, Static43.aClass177_2.anInt5776);
					}
				} else if ((Static255.anInt5508 == 1 || Static353.method6159()) && Static237.anInt5285 > 2) {
					Static260.method4750(2);
				} else if (Static156.method3334()) {
					Static260.method4750(1);
				}
				Static158.aClass177_11 = null;
			}
		} else if (Static13.anInt6489 > 1) {
			Static158.aClass177_11 = null;
		}
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(Z)V")
	public static void method2754() {
		@Pc(8) int local8 = Static171.aByteArrayArray36.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static171.aByteArrayArray36[local10] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static214.anInt4866; local25++) {
					if (Static112.anIntArray204[local10] == Static264.anIntArray413[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static264.anIntArray413[Static214.anInt4866] = Static112.anIntArray204[local10];
					local23 = Static214.anInt4866++;
				}
				@Pc(68) Class1_Sub16 local68 = new Class1_Sub16(Static171.aByteArrayArray36[local10]);
				@Pc(70) int local70 = 0;
				while (Static171.aByteArrayArray36[local10].length > local68.anInt6813 && local70 < 511 && Static49.anInt1559 < 1023) {
					@Pc(89) int local89 = local23 | local70++ << 6;
					@Pc(93) int local93 = local68.method5749();
					@Pc(97) int local97 = local93 >> 14;
					@Pc(103) int local103 = local93 >> 7 & 0x3F;
					@Pc(107) int local107 = local93 & 0x3F;
					@Pc(119) int local119 = local103 + (Static112.anIntArray204[local10] >> 8) * 64 - Static149.anInt3667;
					@Pc(132) int local132 = (Static112.anIntArray204[local10] & 0xFF) * 64 + local107 - Static96.anInt2446;
					@Pc(138) Class75 local138 = Static123.method2640(local68.method5749());
					if (Static84.aClass7_Sub1_Sub1_Sub1Array1[local89] == null && (local138.aByte32 & 0x1) > 0 && local97 == Static331.anInt6843 && local119 >= 0 && local119 + local138.anInt2458 < Static25.anInt850 && local132 >= 0 && Static219.anInt4987 > local132 + local138.anInt2458) {
						Static84.aClass7_Sub1_Sub1_Sub1Array1[local89] = new Class7_Sub1_Sub1_Sub1();
						Static84.aClass7_Sub1_Sub1_Sub1Array1[local89].anInt7070 = local89;
						@Pc(193) Class7_Sub1_Sub1_Sub1 local193 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local89];
						Static185.anIntArray309[Static49.anInt1559++] = local89;
						local193.anInt7079 = Static197.anInt4521;
						local193.method330(local138);
						local193.method5978(local193.aClass75_1.anInt2458);
						local193.anInt7100 = local193.aClass75_1.anInt2465 << 3;
						if (local193.anInt7100 == 0) {
							local193.method5976(0);
						} else {
							local193.method5976(Static224.anIntArray394[local193.aClass75_1.aByte29 - 1]);
						}
						local193.method5966(local119, true, local193.method5973(), local97, local132);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIII)V")
	public static void method2766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static321.anInt6612 = arg0;
		Static256.anInt5549 = arg5;
		Static259.anInt4936 = arg2;
		Static17.anInt647 = arg3;
		Static253.anInt5458 = arg1;
		Static181.anInt4292 = arg4;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(ZI)V")
	public static void method2798(@OriginalArg(0) boolean arg0) {
		Static109.aBoolean182 = arg0;
		Static32.aBoolean504 = !Static13.method5497();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIILclient!nr;ILclient!sn;IILclient!ro;)V")
	public static void method2802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class40 arg3, @OriginalArg(5) Class142 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class177 arg7) {
		@Pc(13) Class107 local13 = Static292.method5169(arg2);
		if (local13 == null || !local13.aBoolean266 || !local13.method3291()) {
			return;
		}
		@Pc(34) int local34;
		if (local13.anIntArray271 != null) {
			@Pc(32) int[] local32 = new int[local13.anIntArray271.length];
			@Pc(48) int local48;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static303.anInt6342 == 4) {
					local48 = (int) Static188.aFloat17 & 0x3FFF;
				} else {
					local48 = Static238.anInt5295 + (int) Static188.aFloat17 & 0x3FFF;
				}
				@Pc(59) int local59 = Class39.anIntArray88[local48];
				@Pc(63) int local63 = Class39.anIntArray87[local48];
				if (Static303.anInt6342 != 4) {
					local59 = local59 * 256 / (Static312.anInt6009 + 256);
					local63 = local63 * 256 / (Static312.anInt6009 + 256);
				}
				local32[local34 * 2] = (local63 * (arg1 + local13.anIntArray271[local34 * 2] * 4) + (local13.anIntArray271[local34 * 2 + 1] * 4 + arg5) * local59 >> 15) + arg7.anInt5803 / 2 + arg6;
				local32[local34 * 2 + 1] = arg0 + arg7.anInt5816 / 2 - ((local13.anIntArray271[local34 * 2 + 1] * 4 + arg5) * local63 - (local13.anIntArray271[local34 * 2] * 4 + arg1) * local59 >> 15);
			}
			Static193.method3830(arg3, local32, local13.anInt3775, arg7.anIntArray446, arg7.anIntArray431);
			for (local48 = 0; local48 < local32.length / 2 - 1; local48++) {
				arg3.method2770(local32[local48 * 2], local32[local48 * 2 + 1], local32[(local48 + 1) * 2], local32[local48 * 2 + 1 + 2], local13.anInt3790, arg4, arg6, arg0);
			}
			arg3.method2770(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local13.anInt3790, arg4, arg6, arg0);
		}
		@Pc(264) Class29 local264 = null;
		if (local13.anInt3793 != -1) {
			local264 = local13.method3285(false, arg3);
			if (local264 != null) {
				Static22.method554(arg6, arg5, arg4, local264, arg0, arg7, arg1);
			}
		}
		if (local13.aString138 == null) {
			return;
		}
		local34 = 0;
		if (local264 != null) {
			local34 = local264.method5838();
		}
		@Pc(298) Class30 local298 = Static321.aClass30_4;
		@Pc(300) Class63 local300 = Static268.aClass63_7;
		if (local13.anInt3783 == 1) {
			local300 = Static208.aClass63_6;
			local298 = Static290.aClass30_3;
		}
		if (local13.anInt3783 == 2) {
			local300 = Static140.aClass63_4;
			local298 = Static150.aClass30_2;
		}
		Static15.method444(arg7, arg1, local300, local298, arg4, local34, local13.aString138, arg6, arg5, arg0, local13.anInt3767);
		return;
	}
}
