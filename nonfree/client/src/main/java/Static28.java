import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "[Lclient!st;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "Z")
	public static boolean aBoolean43 = false;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILclient!ha;ILclient!hda;I)V")
	public static void method746(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(3) Class158 arg2, @OriginalArg(4) int arg3) {
		@Pc(23) Class159 local23 = arg2.method3393(arg1);
		if (local23 == null) {
			return;
		}
		@Pc(30) Class1 local30 = local23.aClass1_1;
		arg1.KA(arg3, arg0, arg3 + arg2.anInt3802, arg0 - -arg2.anInt3746);
		if (Static578.anInt8595 == 2 || Static578.anInt8595 == 5 || Static12.aClass23_26 == null) {
			arg1.A(-16777216, local30, arg3, arg0);
			return;
		}
		@Pc(90) int local90;
		@Pc(93) int local93;
		@Pc(87) int local87;
		@Pc(79) int local79;
		if (Static511.anInt7645 == 4) {
			local87 = (int) -Static171.aFloat64 & 0x3FFF;
			local79 = 4096;
			local93 = Static249.anInt4018;
			local90 = Static433.anInt6262;
		} else {
			local79 = 4096 - Static660.anInt9835 * 16;
			local87 = (int) -Static171.aFloat64 + Static29.anInt723 & 0x3FFF;
			local90 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690;
			local93 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694;
		}
		@Pc(120) int local120 = local90 / 128 + 208 + 48 - Static720.anInt10859 * 2;
		@Pc(137) int local137 = Static501.anInt7568 * 4 + 48 - local93 / 128 - (Static501.anInt7568 - 104) * 2;
		Static12.aClass23_26.method8185((float) arg3 + (float) arg2.anInt3802 / 2.0F, (float) arg2.anInt3746 / 2.0F + (float) arg0, (float) local120, (float) local137, local79, local87 << 2, local30, arg3, arg0);
		@Pc(190) int local190;
		@Pc(200) int local200;
		@Pc(211) int local211;
		@Pc(222) int local222;
		for (@Pc(171) Class2_Sub38 local171 = (Class2_Sub38) Static612.aClass339_67.method7699(65280); local171 != null; local171 = (Class2_Sub38) Static612.aClass339_67.method7706()) {
			@Pc(178) int local178 = local171.anInt6379;
			local190 = (Static42.aClass255_2.anIntArray495[local178] >> 14 & 0x3FFF) - Static691.anInt10367;
			local200 = (Static42.aClass255_2.anIntArray495[local178] & 0x3FFF) - Static116.anInt2270;
			local211 = local190 * 4 + 2 - local90 / 128;
			local222 = local200 * 4 + 2 - local93 / 128;
			Static620.method8322(local222, arg3, local30, arg1, Static42.aClass255_2.anIntArray496[local178], arg0, local211, arg2);
		}
		for (local190 = 0; local190 < Static536.anInt8148; local190++) {
			local200 = Static566.anIntArray654[local190] * 4 + 2 - local90 / 128;
			local211 = Static350.anIntArray433[local190] * 4 + 2 - local93 / 128;
			@Pc(287) Class54 local287 = Static354.aClass142_4.method3063(Static533.anIntArray628[local190], 105);
			if (local287.anIntArray113 != null) {
				local287 = local287.method1301(13, Static34.aClass304_1);
				if (local287 == null || local287.anInt1233 == -1) {
					continue;
				}
			}
			Static620.method8322(local211, arg3, local30, arg1, local287.anInt1233, arg0, local200, arg2);
		}
		@Pc(381) int local381;
		@Pc(392) int local392;
		for (@Pc(334) Class2_Sub17 local334 = (Class2_Sub17) Static497.aClass28_35.method736(); local334 != null; local334 = (Class2_Sub17) Static497.aClass28_35.method740()) {
			local211 = (int) (local334.aLong328 >> 28 & 0x3L);
			if (Static643.anInt9604 == local211) {
				local222 = (int) (local334.aLong328 & 0x3FFFL) - Static691.anInt10367;
				@Pc(370) int local370 = (int) (local334.aLong328 >> 14 & 0x3FFFL) - Static116.anInt2270;
				local381 = local222 * 4 + 2 - local90 / 128;
				local392 = local370 * 4 + 2 - local93 / 128;
				Static6.method107(arg0, local30, Static471.aClass23Array11[0], local392, local381, arg2, arg3);
			}
		}
		@Pc(490) int local490;
		for (local211 = 0; local211 < Static390.anInt6126; local211++) {
			@Pc(427) Class2_Sub45 local427 = (Class2_Sub45) Static18.aClass28_2.method738((long) Static103.anIntArray187[local211]);
			if (local427 != null) {
				@Pc(432) Class8_Sub2_Sub1_Sub2_Sub2 local432 = local427.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				if (local432.method9322() && local432.aByte144 == Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144) {
					@Pc(446) Class268 local446 = local432.aClass268_1;
					if (local446 != null && local446.anIntArray532 != null) {
						local446 = local446.method5985(65535, Static34.aClass304_1);
					}
					if (local446 != null && local446.aBoolean507 && local446.aBoolean505) {
						local392 = local432.anInt10690 / 128 - local90 / 128;
						local490 = local432.anInt10694 / 128 - local93 / 128;
						if (local446.anInt6733 == -1) {
							Static6.method107(arg0, local30, Static471.aClass23Array11[1], local490, local392, arg2, arg3);
						} else {
							Static620.method8322(local490, arg3, local30, arg1, local446.anInt6733, arg0, local392, arg2);
						}
					}
				}
			}
		}
		local222 = Static338.anInt5564;
		@Pc(531) int[] local531 = Static210.anIntArray280;
		@Pc(585) int local585;
		@Pc(589) int local589;
		@Pc(622) int local622;
		for (local381 = 0; local381 < local222; local381++) {
			@Pc(541) Class8_Sub2_Sub1_Sub2_Sub1 local541 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local531[local381]];
			if (local541 != null && local541.method1417() && !local541.aBoolean124 && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 != local541 && local541.aByte144 == Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144) {
				local490 = local541.anInt10690 / 128 - local90 / 128;
				local585 = local541.anInt10694 / 128 - local93 / 128;
				@Pc(587) boolean local587 = false;
				for (local589 = 0; local589 < Static327.anInt5392; local589++) {
					if (local541.aString9.equals(Static330.aStringArray25[local589]) && Static371.anIntArray455[local589] != 0) {
						local587 = true;
						break;
					}
				}
				@Pc(620) boolean local620 = false;
				for (local622 = 0; local622 < Static706.anInt10633; local622++) {
					if (local541.aString9.equals(Static87.aClass241Array1[local622].aString66)) {
						local620 = true;
						break;
					}
				}
				@Pc(652) boolean local652 = false;
				if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1433 != 0 && local541.anInt1433 != 0 && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1433 == local541.anInt1433) {
					local652 = true;
				}
				if (local541.aBoolean128) {
					Static6.method107(arg0, local30, Static471.aClass23Array11[6], local585, local490, arg2, arg3);
				} else if (local652) {
					Static6.method107(arg0, local30, Static471.aClass23Array11[4], local585, local490, arg2, arg3);
				} else if (local541.aBoolean125) {
					Static6.method107(arg0, local30, Static471.aClass23Array11[7], local585, local490, arg2, arg3);
				} else if (local587) {
					Static6.method107(arg0, local30, Static471.aClass23Array11[3], local585, local490, arg2, arg3);
				} else if (local620) {
					Static6.method107(arg0, local30, Static471.aClass23Array11[5], local585, local490, arg2, arg3);
				} else {
					Static6.method107(arg0, local30, Static471.aClass23Array11[2], local585, local490, arg2, arg3);
				}
			}
		}
		@Pc(788) Class254[] local788 = Static527.aClass254Array1;
		@Pc(878) int local878;
		for (local490 = 0; local490 < local788.length; local490++) {
			@Pc(796) Class254 local796 = local788[local490];
			if (local796 != null && local796.anInt6363 != 0 && Static333.anInt5455 % 20 < 10) {
				@Pc(843) int local843;
				if (local796.anInt6363 == 1) {
					@Pc(828) Class2_Sub45 local828 = (Class2_Sub45) Static18.aClass28_2.method738((long) local796.anInt6366);
					if (local828 != null) {
						@Pc(833) Class8_Sub2_Sub1_Sub2_Sub2 local833 = local828.aClass8_Sub2_Sub1_Sub2_Sub2_2;
						local843 = local833.anInt10690 / 128 - local90 / 128;
						local622 = local833.anInt10694 / 128 - local93 / 128;
						Static114.method2132(local843, arg3, 360000L, local30, local796.anInt6367, arg0, local622, arg2);
					}
				}
				if (local796.anInt6363 == 2) {
					local878 = local796.anInt6369 / 128 - local90 / 128;
					local589 = local796.anInt6362 / 128 - local93 / 128;
					@Pc(893) long local893 = (long) (local796.anInt6364 << 7);
					@Pc(897) long local897 = local893 * local893;
					Static114.method2132(local878, arg3, local897, local30, local796.anInt6367, arg0, local589, arg2);
				}
				if (local796.anInt6363 == 10 && local796.anInt6366 >= 0 && local796.anInt6366 < Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3.length) {
					@Pc(932) Class8_Sub2_Sub1_Sub2_Sub1 local932 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local796.anInt6366];
					if (local932 != null) {
						local589 = local932.anInt10690 / 128 - local90 / 128;
						local843 = local932.anInt10694 / 128 - local93 / 128;
						Static114.method2132(local589, arg3, 360000L, local30, local796.anInt6367, arg0, local843, arg2);
					}
				}
			}
		}
		if (Static511.anInt7645 == 4) {
			return;
		}
		if (Static675.anInt10156 != 0) {
			local585 = Static675.anInt10156 * 4 + (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9302((byte) 50) + -1) * 2 + 2 - local90 / 128;
			local878 = Static212.anInt3466 * 4 + Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9302((byte) 127) * 2 + 2 - local93 / 128 - 2;
			Static6.method107(arg0, local30, Static691.aClass23Array15[Static266.aBoolean583 ? 1 : 0], local878, local585, arg2, arg3);
		}
		if (!Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aBoolean124) {
			arg1.method7971(3, 3, arg0 + arg2.anInt3746 / 2 - 1, arg2.anInt3802 / 2 + arg3 + -1, -1);
			return;
		}
	}
}
