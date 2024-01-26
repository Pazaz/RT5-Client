import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
	public static int anInt4766;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "D")
	public static double aDouble15;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "[B")
	public static final byte[] aByteArray49 = new byte[520];

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!tca;II[B)Lclient!fr;")
	public static Class135 method4338(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(3) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(16) int local16 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(OpenGL.GL_VERTEX_PROGRAM_ARB, local16);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(OpenGL.GL_PROGRAM_ERROR_POSITION_ARB, Static564.anIntArray653, 0);
		if (Static564.anIntArray653[0] == -1) {
			OpenGL.glBindProgramARB(OpenGL.GL_VERTEX_PROGRAM_ARB, 0);
			return new Class135(arg0, 34336, local16);
		} else {
			OpenGL.glBindProgramARB(OpenGL.GL_VERTEX_PROGRAM_ARB, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZIII)V")
	public static void method4339(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static334.aClass291ArrayArrayArray1 == null) {
			Static163.aClass19_17.method7971(arg2, arg3, arg0, arg4, -16777216);
			return;
		}
		@Pc(19) boolean local19 = false;
		if (Static1.anInt10798 == 0) {
			if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690 < 0 || Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690 >= Static720.anInt10859 * 512 || Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694 < 0 || Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694 >= Static501.anInt7568 * 512) {
				local19 = true;
			}
		} else if (!Static421.aBoolean480) {
			local19 = true;
		}
		if (local19) {
			Static163.aClass19_17.method7971(arg2, arg3, arg0, arg4, -16777216);
			return;
		}
		Static198.anInt3276++;
		if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 != null && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690 + 256 - Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9302((byte) 45) * 256 >> 9 == Static675.anInt10156 && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694 - (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9302((byte) 48) - 1) * 256 >> 9 == Static212.anInt3466) {
			Static675.anInt10156 = -1;
			Static212.anInt3466 = -1;
			Static444.method5988();
		}
		Static710.method6711();
		if (!arg1) {
			Static527.method7083();
		}
		Static498.method6643(arg4, true, arg0, arg3, arg2);
		@Pc(153) int local153 = Static32.anInt773;
		@Pc(155) int local155 = Static242.anInt3971;
		Static582.anInt8627 = Static582.anInt8630;
		@Pc(159) int local159 = Static290.anInt4657;
		@Pc(161) int local161 = Static200.anInt3305;
		@Pc(169) int local169;
		@Pc(204) int local204;
		if (Static511.anInt7645 == 1) {
			local169 = (int) Static479.aFloat123;
			if (Static188.anInt3103 >> 8 > local169) {
				local169 = Static188.anInt3103 >> 8;
			}
			if (Static572.aBooleanArray29[4] && local169 < Static140.anIntArray222[4] + 128) {
				local169 = Static140.anIntArray222[4] + 128;
			}
			local204 = Static288.anInt4621 + (int) Static171.aFloat64 & 0x3FFF;
			Static292.method4606(local169, (local169 >> 3) * 3 + 600 << 2, local161, Static494.anInt7409, local204, Static38.anInt920, Static102.method2025(Static394.anInt6176, -29754, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690) - 200);
		} else if (Static511.anInt7645 == 4) {
			local169 = (int) Static479.aFloat123;
			if (Static188.anInt3103 >> 8 > local169) {
				local169 = Static188.anInt3103 >> 8;
			}
			if (Static572.aBooleanArray29[4] && Static140.anIntArray222[4] + 128 > local169) {
				local169 = Static140.anIntArray222[4] + 128;
			}
			local204 = (int) Static171.aFloat64 & 0x3FFF;
			Static292.method4606(local169, (local169 >> 3) * 3 + 600 << 2, local161, Static494.anInt7409, local204, Static38.anInt920, Static102.method2025(Static394.anInt6176, -29754, Static249.anInt4018, Static433.anInt6262) - 200);
		} else if (Static511.anInt7645 == 5) {
			Static110.method2079(local161);
		}
		local169 = Static170.anInt2864;
		local204 = Static359.anInt5801;
		@Pc(325) int local325 = Static110.anInt2186;
		@Pc(327) int local327 = Static598.anInt8832;
		@Pc(329) int local329 = Static323.anInt5119;
		@Pc(375) int local375;
		for (@Pc(331) int local331 = 0; local331 < 5; local331++) {
			if (Static572.aBooleanArray29[local331]) {
				local375 = (int) ((double) -Static331.anIntArray403[local331] + (double) (Static331.anIntArray403[local331] * 2 + 1) * Math.random() + Math.sin((double) Static362.anIntArray450[local331] / 100.0D * (double) Static194.anIntArray268[local331]) * (double) Static140.anIntArray222[local331]);
				if (local331 == 3) {
					Static323.anInt5119 = local375 + Static323.anInt5119 & 0x3FFF;
				}
				if (local331 == 0) {
					Static170.anInt2864 += local375 << 2;
				}
				if (local331 == 1) {
					Static359.anInt5801 += local375 << 2;
				}
				if (local331 == 2) {
					Static110.anInt2186 += local375 << 2;
				}
				if (local331 == 4) {
					Static598.anInt8832 += local375;
					if (Static598.anInt8832 < 1024) {
						Static598.anInt8832 = 1024;
					} else if (Static598.anInt8832 > 3072) {
						Static598.anInt8832 = 3072;
					}
				}
			}
		}
		if (Static170.anInt2864 < 0) {
			Static170.anInt2864 = 0;
		}
		if (Static110.anInt2186 < 0) {
			Static110.anInt2186 = 0;
		}
		if (Static170.anInt2864 > (Static619.anInt1566 << 9) - 1) {
			Static170.anInt2864 = (Static619.anInt1566 << 9) - 1;
		}
		if (Static110.anInt2186 > (Static662.anInt9843 << 9) - 1) {
			Static110.anInt2186 = (Static662.anInt9843 << 9) - 1;
		}
		Static276.method3988();
		Static163.aClass19_17.KA(local153, local159, local155 + local153, local159 + local161);
		Static501.method6716(true);
		local375 = Static251.anInt4037;
		Static460.aClass73_10.method7135(Static170.anInt2864, Static359.anInt5801, Static110.anInt2186, -Static598.anInt8832 & 0x3FFF, -Static323.anInt5119 & 0x3FFF, -Static81.anInt1644 & 0x3FFF);
		Static163.aClass19_17.method8000(Static460.aClass73_10);
		Static163.aClass19_17.DA(local155 / 2 + local153, local161 / 2 + local159, Static428.anInt6495 << 1, Static428.anInt6495 << 1);
		if (Static137.aBoolean210) {
			Static476.method6448(Static251.anInt4037);
			if (Static162.anInt2800 != Static582.anInt8627) {
				Static75.aBoolean521 = true;
			}
			Static162.anInt2800 = Static582.anInt8627;
			Static163.aClass19_17.GA(local375);
			Static163.aClass19_17.ya();
		} else if (Static456.aClass148_3 == null) {
			Static163.aClass19_17.GA(local375);
			Static163.aClass19_17.ya();
		} else {
			Static163.aClass19_17.xa(1.0F);
			Static163.aClass19_17.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			Static456.aClass148_3.method3159(local159, Static163.aClass19_17, Static323.anInt5119, local155, local375, Static81.anInt1644, local161, local153, Static436.anInt3852 << 3, Static598.anInt8832);
		}
		Static557.method7331();
		Static527.method7081(Static428.anInt6495 << 1, local161 / 2 + local159, Static428.anInt6495 << 1, local153 + local155 / 2);
		Static620.method8324(-Static323.anInt5119 & 0x3FFF, Static110.anInt2186, -Static81.anInt1644 & 0x3FFF, Static359.anInt5801, -Static598.anInt8832 & 0x3FFF, Static170.anInt2864);
		Static159.method2575();
		@Pc(688) byte local688 = Static400.aClass2_Sub34_28.aClass57_Sub4_2.method2143() == 2 ? (byte) Static198.anInt3276 : 1;
		if (Static137.aBoolean210) {
			Static648.method8483(-Static323.anInt5119 & 0x3FFF, -Static81.anInt1644 & 0x3FFF, -Static598.anInt8832 & 0x3FFF);
			Static466.method6324(local688, Static170.anInt2864, Static110.anInt2186, Static359.anInt5801, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694 >> 9, Static457.anIntArray552, Static682.anIntArray817, Static333.anInt5455, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 + 1, Static482.anIntArray588, Static400.aClass2_Sub34_28.aClass57_Sub8_1.method3176() == 0, Static582.anInt8627, Static9.anIntArray18, Static328.aByteArrayArrayArray4, Static153.anIntArray235, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690 >> 9);
		} else {
			Static283.method4100(Static333.anInt5455, Static170.anInt2864, Static359.anInt5801, Static110.anInt2186, Static328.aByteArrayArrayArray4, Static482.anIntArray588, Static9.anIntArray18, Static457.anIntArray552, Static153.anIntArray235, Static682.anIntArray817, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 + 1, local688, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690 >> 9, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694 >> 9, Static400.aClass2_Sub34_28.aClass57_Sub8_1.method3176() == 0, Static504.aBoolean579 ? Static582.anInt8627 : -1, 0, false);
		}
		Static557.method7331();
		if (Static283.anInt4574 == 11) {
			Static205.method3091(local155, local161, local159, local153);
			Static608.method8176(local159, local155, local153, local161);
			Static233.method3407(local155, local159, local153, local161);
			Static208.method3105(local155, local153, local159, local161);
		}
		Static712.method9323();
		Static110.anInt2186 = local325;
		Static170.anInt2864 = local169;
		Static598.anInt8832 = local327;
		Static359.anInt5801 = local204;
		Static323.anInt5119 = local329;
		Static288.aBoolean356 = false;
		if (Static426.aBoolean72 && Static500.aClass295_3.method6622() == 0) {
			Static426.aBoolean72 = false;
		}
		if (Static426.aBoolean72) {
			Static163.aClass19_17.method7971(local155, local161, local159, local153, -16777216);
			Static694.method9028(Static163.aClass19_17, Static32.aClass32_12.method877(Static51.anInt1052), false, Static694.aClass381_13, Static437.aClass14_9);
		}
		Static501.method6716(false);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!ge;)Lclient!pf;")
	public static Class2_Sub1 method4341(@OriginalArg(1) Class2_Sub21 arg0) {
		arg0.method7396();
		@Pc(13) int local13 = arg0.method7396();
		@Pc(17) Class2_Sub1 local17 = Static96.method8821(local13);
		local17.anInt10880 = arg0.method7396();
		@Pc(32) int local32 = arg0.method7396();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(40) int local40 = arg0.method7396();
			local17.method9416(false, arg0, local40);
		}
		local17.method9421(7);
		return local17;
	}
}
