import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	public static int anInt9503;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_110 = new Class345(78, -1);

	@OriginalMember(owner = "client!u", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_111 = new Class345(83, 18);

	@OriginalMember(owner = "client!u", name = "e", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[4];

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_229 = new Class225(89, -1);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ge;I)Lclient!is;")
	public static Class138 method8359(@OriginalArg(0) Packet arg0) {
		@Pc(10) Class403 local10 = Static33.method882()[arg0.g1()];
		@Pc(17) Class103 local17 = Static313.method4544()[arg0.g1()];
		@Pc(21) int local21 = arg0.g2s();
		@Pc(25) int local25 = arg0.g2s();
		@Pc(29) int local29 = arg0.g2();
		@Pc(33) int local33 = arg0.g2();
		@Pc(37) int local37 = arg0.g2s();
		@Pc(47) int local47 = arg0.g4();
		@Pc(51) int local51 = arg0.g4();
		return new Class138(local10, local17, local21, local25, local29, local33, local37, local47, local51);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(III)Z")
	public static boolean method8364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | Static558.method2895(arg0, arg1) || Static198.method2957(arg0, arg1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!tg;IIBI)V")
	public static void method8366(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt9353 == -1 && arg1.anIntArray718 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		@Pc(33) int local33 = arg1.anInt9358 * Static400.aClass2_Sub34_28.aClass57_Sub25_1.method7208() >> 8;
		if (arg1.anInt9362 < arg3) {
			local23 = arg3 - arg1.anInt9362;
		} else if (arg1.anInt9357 > arg3) {
			local23 = arg1.anInt9357 - arg3;
		}
		if (arg1.anInt9349 < arg4) {
			local23 += arg4 - arg1.anInt9349;
		} else if (arg1.anInt9352 > arg4) {
			local23 += arg1.anInt9352 - arg4;
		}
		if (arg1.anInt9356 == 0 || arg1.anInt9356 < local23 - 256 || Static400.aClass2_Sub34_28.aClass57_Sub25_1.method7208() == 0 || arg2 != arg1.anInt9350) {
			if (arg1.aClass2_Sub6_Sub2_4 != null) {
				Static336.aClass2_Sub6_Sub3_1.method5883(arg1.aClass2_Sub6_Sub2_4);
				arg1.aClass2_Sub6_Sub2_4 = null;
				arg1.aClass2_Sub53_3 = null;
				arg1.aClass2_Sub49_Sub1_4 = null;
			}
			if (arg1.aClass2_Sub6_Sub2_3 != null) {
				Static336.aClass2_Sub6_Sub3_1.method5883(arg1.aClass2_Sub6_Sub2_3);
				arg1.aClass2_Sub53_2 = null;
				arg1.aClass2_Sub6_Sub2_3 = null;
				arg1.aClass2_Sub49_Sub1_3 = null;
			}
			return;
		}
		local23 -= 256;
		if (local23 < 0) {
			local23 = 0;
		}
		@Pc(172) int local172 = arg1.anInt9356 - arg1.anInt9355;
		if (local172 < 0) {
			local172 = arg1.anInt9356;
		}
		@Pc(182) int local182 = local33;
		@Pc(187) int local187 = local23 - arg1.anInt9355;
		if (local187 > 0 && local172 > 0) {
			local182 = (local172 - local187) * local33 / local172;
		}
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9302((byte) 71);
		@Pc(214) int local214 = 8192;
		@Pc(225) int local225 = (arg1.anInt9362 + arg1.anInt9357) / 2 - arg3;
		@Pc(236) int local236 = (arg1.anInt9349 + arg1.anInt9352) / 2 - arg4;
		@Pc(264) int local264;
		@Pc(275) int local275;
		if (local225 != 0 || local236 != 0) {
			local264 = -Static323.anInt5119 - (int) (Math.atan2((double) local225, (double) local236) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local264 > 8192) {
				local264 = 16384 - local264;
			}
			if (local23 <= 0) {
				local275 = 8192;
			} else if (local23 >= 4096) {
				local275 = 16384;
			} else {
				local275 = local23 * 8192 / 4096 + 8192;
			}
			local214 = (16384 - local275 >> 1) + local264 * local275 / 8192;
		}
		@Pc(391) Class2_Sub6_Sub2 local391;
		if (arg1.aClass2_Sub6_Sub2_4 != null) {
			arg1.aClass2_Sub6_Sub2_4.method3327(local182);
			arg1.aClass2_Sub6_Sub2_4.method3333(local214);
		} else if (arg1.anInt9353 >= 0) {
			local264 = arg1.anInt9360 == 256 && arg1.anInt9359 == 256 ? 256 : Static159.method2572(arg1.anInt9359, arg1.anInt9360);
			if (arg1.aBoolean714) {
				if (arg1.aClass2_Sub53_3 == null) {
					arg1.aClass2_Sub53_3 = Static650.method8498(Static147.aClass330_26, arg1.anInt9353);
				}
				if (arg1.aClass2_Sub53_3 != null) {
					if (arg1.aClass2_Sub49_Sub1_4 == null) {
						arg1.aClass2_Sub49_Sub1_4 = arg1.aClass2_Sub53_3.method8502(new int[] { 22050 });
					}
					if (arg1.aClass2_Sub49_Sub1_4 != null) {
						local391 = Static730.method3346(arg1.aClass2_Sub49_Sub1_4, local264, local182 << 6, local214);
						local391.method3318(-1);
						Static336.aClass2_Sub6_Sub3_1.method5882(local391);
						arg1.aClass2_Sub6_Sub2_4 = local391;
					}
				}
			} else {
				@Pc(408) Class89 local408 = Static729.method2245(Static281.aClass330_60, arg1.anInt9353, 0);
				if (local408 != null) {
					@Pc(415) Class2_Sub49_Sub1 local415 = local408.method2247().method7821(Static681.aClass224_2);
					@Pc(423) Class2_Sub6_Sub2 local423 = Static730.method3346(local415, local264, local182 << 6, local214);
					local423.method3318(-1);
					Static336.aClass2_Sub6_Sub3_1.method5882(local423);
					arg1.aClass2_Sub6_Sub2_4 = local423;
				}
			}
		}
		if (arg1.aClass2_Sub6_Sub2_3 != null) {
			arg1.aClass2_Sub6_Sub2_3.method3327(local182);
			arg1.aClass2_Sub6_Sub2_3.method3333(local214);
			if (!arg1.aClass2_Sub6_Sub2_3.method9458()) {
				arg1.aClass2_Sub6_Sub2_3 = null;
				arg1.aClass2_Sub53_2 = null;
				arg1.aClass2_Sub49_Sub1_3 = null;
			}
		} else if (arg1.anIntArray718 != null && (arg1.anInt9351 -= arg0) <= 0) {
			local264 = arg1.anInt9360 == 256 && arg1.anInt9359 == 256 ? 256 : arg1.anInt9359 + (int) ((double) (arg1.anInt9360 - arg1.anInt9359) * Math.random());
			if (!arg1.aBoolean715) {
				local275 = (int) ((double) arg1.anIntArray718.length * Math.random());
				@Pc(536) Class89 local536 = Static729.method2245(Static281.aClass330_60, arg1.anIntArray718[local275], 0);
				if (local536 != null) {
					@Pc(543) Class2_Sub49_Sub1 local543 = local536.method2247().method7821(Static681.aClass224_2);
					@Pc(551) Class2_Sub6_Sub2 local551 = Static730.method3346(local543, local264, local182 << 6, local214);
					local551.method3318(0);
					Static336.aClass2_Sub6_Sub3_1.method5882(local551);
					arg1.anInt9351 = (int) (Math.random() * (double) (arg1.anInt9354 - arg1.anInt9365)) + arg1.anInt9365;
					arg1.aClass2_Sub6_Sub2_3 = local551;
					return;
				}
				return;
			}
			if (arg1.aClass2_Sub53_2 == null) {
				local275 = (int) (Math.random() * (double) arg1.anIntArray718.length);
				arg1.aClass2_Sub53_2 = Static650.method8498(Static147.aClass330_26, arg1.anIntArray718[local275]);
			}
			if (arg1.aClass2_Sub53_2 != null) {
				if (arg1.aClass2_Sub49_Sub1_3 == null) {
					arg1.aClass2_Sub49_Sub1_3 = arg1.aClass2_Sub53_2.method8502(new int[] { 22050 });
				}
				if (arg1.aClass2_Sub49_Sub1_3 != null) {
					local391 = Static730.method3346(arg1.aClass2_Sub49_Sub1_3, local264, local182 << 6, local214);
					local391.method3318(0);
					Static336.aClass2_Sub6_Sub3_1.method5882(local391);
					arg1.anInt9351 = (int) ((double) (arg1.anInt9354 - arg1.anInt9365) * Math.random()) + arg1.anInt9365;
					arg1.aClass2_Sub6_Sub2_3 = local391;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!eo;ZZ)V")
	public static void method8368(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean813 = arg1;
		if (Static661.aBoolean457) {
			Static684.aClass302Array1[Static684.aClass302Array1.length - 1].method6812(arg0);
		} else {
			Static658.method8591(arg0, Static501.aClass2_Sub7Array4);
		}
	}
}
