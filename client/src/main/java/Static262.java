import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_251 = new Class145(72, 7);

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_145 = new Class79("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	public static int anInt6999 = 2;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIILclient!nk;Lclient!kf;IB)V")
	public static void method6249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class161 arg5, @OriginalArg(6) Class78 arg6, @OriginalArg(7) int arg7) {
		@Pc(19) int local19 = arg2 * arg2 + arg3 * arg3;
		if (local19 > arg1) {
			return;
		}
		@Pc(37) int local37 = Math.min(arg5.anInt4248 / 2, arg5.anInt4261 / 2);
		if (local37 * local37 >= local19) {
			Static376.method6288(arg6, arg2, arg7, arg3, Static123.aClass13Array10[arg0], arg4, arg5);
			return;
		}
		local37 -= 10;
		@Pc(66) int local66;
		if (Static314.anInt5911 == 4) {
			local66 = (int) Static277.aFloat67 & 0x3FFF;
		} else {
			local66 = (int) Static277.aFloat67 + Static6.anInt158 & 0x3FFF;
		}
		@Pc(77) int local77 = Class19.anIntArray178[local66];
		@Pc(81) int local81 = Class19.anIntArray177[local66];
		if (Static314.anInt5911 != 4) {
			local77 = local77 * 256 / (Static97.anInt2005 + 256);
			local81 = local81 * 256 / (Static97.anInt2005 + 256);
		}
		@Pc(112) int local112 = local81 * arg2 + arg3 * local77 >> 15;
		@Pc(123) int local123 = arg3 * local81 - arg2 * local77 >> 15;
		@Pc(129) double local129 = Math.atan2((double) local112, (double) local123);
		@Pc(136) int local136 = (int) (Math.sin(local129) * (double) local37);
		@Pc(143) int local143 = (int) ((double) local37 * Math.cos(local129));
		Static116.aClass13Array8[arg0].method6386((float) arg5.anInt4248 / 2.0F + (float) arg7 + (float) local136, (float) -local143 + (float) arg5.anInt4261 / 2.0F + (float) arg4, 4096, (int) (-local129 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!qg;)V")
	public static void method6252(@OriginalArg(1) Packet arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static325.anInt6079; local15++) {
			@Pc(21) int local21 = Static52.anIntArray100[local15];
			@Pc(25) Class11_Sub5_Sub2_Sub1 local25 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local21];
			@Pc(29) int local29 = arg0.g1();
			if ((local29 & 0x2) != 0) {
				local29 += arg0.g1() << 8;
			}
			Static303.method5212(arg0, local21, local25, local29);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void report(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static174.method1509(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static342.method5153(local7);
			local7 = Static200.method3647(local7, "%3a", ":");
			local7 = Static200.method3647(local7, "%40", "@");
			local7 = Static200.method3647(local7, "%26", "&");
			local7 = Static200.method3647(local7, "%23", "#");
			if (Static392.aClass152_6.applet != null) {
				@Pc(103) PrivilegedRequest local103 = Static392.aClass152_6.openUrlStream(new URL(Static392.aClass152_6.applet.getCodeBase(), "clienterror.ws?c=" + Static277.anInt5115 + "&u=" + Static241.aLong130 + "&v1=" + Signlink.javaVendor + "&v2=" + Signlink.javaVersion + "&e=" + local7));
				while (local103.status == 0) {
					Static231.method4023(1L);
				}
				if (local103.status == 1) {
					@Pc(121) DataInputStream local121 = (DataInputStream) local103.result;
					local121.read();
					local121.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	public static void method6254() {
		Static217.method3795(Static218.aClass177_Sub1_2.anInt4883);
		@Pc(18) int local18 = (Static136.anInt6778 >> 10) + (Static164.anInt3140 >> 3);
		@Pc(27) int local27 = (Static211.anInt3777 >> 10) + (Static148.anInt2719 >> 3);
		Static355.anInt6585 = Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 = 0;
		Static17.aClass11_Sub5_Sub2_Sub1_3.method4064(8, 8);
		Static51.anIntArray98 = new int[18];
		Static106.aByteArrayArray6 = new byte[18][];
		Static232.aByteArrayArray9 = new byte[18][];
		Static82.aByteArrayArray5 = new byte[18][];
		Static62.anIntArray155 = new int[18];
		Static270.aByteArrayArray15 = new byte[18][];
		Static190.anIntArray208 = new int[18];
		Static221.anIntArray314 = new int[18];
		Static210.aByteArrayArray7 = new byte[18][];
		Static374.anIntArray480 = new int[18];
		Static291.anIntArray372 = new int[18];
		Static277.anIntArrayArray43 = new int[18][4];
		@Pc(78) int local78 = 0;
		@Pc(97) int local97;
		for (@Pc(87) int local87 = (local18 - (Static373.anInt7033 >> 4)) / 8; local87 <= ((Static373.anInt7033 >> 4) + local18) / 8; local87++) {
			for (local97 = (local27 - (Static242.anInt4449 >> 4)) / 8; local97 <= (local27 + (Static242.anInt4449 >> 4)) / 8; local97++) {
				@Pc(105) int local105 = local97 + (local87 << 8);
				Static291.anIntArray372[local78] = local105;
				Static221.anIntArray314[local78] = Static288.aClass197_70.method5075("m" + local87 + "_" + local97);
				Static374.anIntArray480[local78] = Static288.aClass197_70.method5075("l" + local87 + "_" + local97);
				Static190.anIntArray208[local78] = Static288.aClass197_70.method5075("n" + local87 + "_" + local97);
				Static51.anIntArray98[local78] = Static288.aClass197_70.method5075("um" + local87 + "_" + local97);
				Static62.anIntArray155[local78] = Static288.aClass197_70.method5075("ul" + local87 + "_" + local97);
				if (Static190.anIntArray208[local78] == -1) {
					Static221.anIntArray314[local78] = -1;
					Static374.anIntArray480[local78] = -1;
					Static51.anIntArray98[local78] = -1;
					Static62.anIntArray155[local78] = -1;
				}
				local78++;
			}
		}
		for (local97 = local78; local97 < Static190.anIntArray208.length; local97++) {
			Static190.anIntArray208[local97] = -1;
			Static221.anIntArray314[local97] = -1;
			Static374.anIntArray480[local97] = -1;
			Static51.anIntArray98[local97] = -1;
			Static62.anIntArray155[local97] = -1;
		}
		Static373.method6267(true, local18, false, local27);
	}
}
