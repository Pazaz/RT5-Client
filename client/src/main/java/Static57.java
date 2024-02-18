import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_10 = new Class345(11, 7);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(FIIFI[FIIIIIF[FI)V")
	public static void method1224(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) float[] arg11, @OriginalArg(13) int arg12) {
		@Pc(5) int local5 = arg6 - arg4;
		@Pc(13) int local13 = arg2 - arg8;
		@Pc(17) int local17 = arg7 - arg9;
		@Pc(38) float local38 = arg11[2] * (float) local17 + (float) local13 * arg11[0] + arg11[1] * (float) local5;
		@Pc(59) float local59 = (float) local17 * arg11[5] + arg11[3] * (float) local13 + arg11[4] * (float) local5;
		@Pc(93) float local93 = arg11[8] * (float) local17 + (float) local5 * arg11[7] + arg11[6] * (float) local13;
		@Pc(133) float local133;
		@Pc(126) float local126;
		if (arg1 == 0) {
			local126 = arg10 + 0.5F - local93;
			local133 = local38 + arg0 + 0.5F;
		} else if (arg1 == 1) {
			local133 = arg0 + local38 + 0.5F;
			local126 = arg10 + local93 + 0.5F;
		} else if (arg1 == 2) {
			local133 = arg0 + 0.5F - local38;
			local126 = arg3 + 0.5F - local59;
		} else if (arg1 == 3) {
			local133 = local38 + arg0 + 0.5F;
			local126 = arg3 + 0.5F - local59;
		} else if (arg1 == 4) {
			local133 = arg10 + local93 + 0.5F;
			local126 = arg3 + 0.5F - local59;
		} else {
			local126 = arg3 + 0.5F - local59;
			local133 = arg10 + 0.5F - local93;
		}
		@Pc(227) float local227;
		if (arg12 == 1) {
			local227 = local133;
			local133 = -local126;
			local126 = local227;
		} else if (arg12 == 2) {
			local126 = -local126;
			local133 = -local133;
		} else if (arg12 == 3) {
			local227 = local133;
			local133 = local126;
			local126 = -local227;
		}
		arg5[1] = local126;
		arg5[0] = local133;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIZILclient!sb;Z)V")
	public static void method1225(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class330 arg2) {
		Static676.aClass330_121 = arg2;
		Static497.aBoolean564 = false;
		Static190.anInt3112 = 2;
		Static117.aClass2_Sub6_Sub1_2 = null;
		Static24.anInt595 = arg1;
		Static96.anInt10171 = 1;
		Static174.anInt2918 = 0;
		Static99.anInt2077 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([SB)[S")
	public static short[] method1230(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static734.method7692(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1231(@OriginalArg(1) String arg0) {
		if (!Static156.aBoolean223 || (Static717.anInt10822 & 0x18) == 0) {
			return;
		}
		@Pc(22) boolean local22 = false;
		@Pc(24) int local24 = Static338.anInt5564;
		@Pc(26) int[] local26 = Static210.anIntArray280;
		for (@Pc(28) int local28 = 0; local28 < local24; local28++) {
			@Pc(35) Class8_Sub2_Sub1_Sub2_Sub1 local35 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local26[local28]];
			if (local35.aString9 != null && local35.aString9.equalsIgnoreCase(arg0) && (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 == local35 && (Static717.anInt10822 & 0x10) != 0 || (Static717.anInt10822 & 0x8) != 0)) {
				@Pc(75) Class2_Sub19 local75 = Static293.method4335(Static664.aClass345_115, Static405.aClass153_2.aIsaacRandom_1);
				local75.aPacketBit_1.ip2(local26[local28]);
				local75.aPacketBit_1.p4_alt1(Static450.anInt6819);
				local75.aPacketBit_1.p2(Static162.anInt2799);
				local75.aPacketBit_1.p1_alt3(0);
				local75.aPacketBit_1.p2_alt3(Static77.anInt1614);
				Static405.aClass153_2.method3275(local75);
				Static147.method2419(0, local35.anIntArray878[0], local35.method9302((byte) 65), true, local35.anIntArray879[0], 0, -2, local35.method9302((byte) 81));
				local22 = true;
				break;
			}
		}
		if (!local22) {
			Static67.method6098(Static32.aClass32_21.method877(Static51.anInt1052) + arg0);
		}
		if (Static156.aBoolean223) {
			Static470.method6384();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method1232(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg2.length() > 320 || !Static470.method6387()) {
			return;
		}
		Static367.method5268();
		Static470.anInt7113 = arg0;
		Static59.aString63 = arg1;
		Static449.aString75 = arg2;
		Static81.method1586(6);
	}
}
