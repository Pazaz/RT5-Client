import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static684 {

	@OriginalMember(owner = "client!vla", name = "k", descriptor = "Z")
	public static boolean aBoolean775;

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "[Lclient!qe;")
	public static Class302[] aClass302Array1;

	@OriginalMember(owner = "client!vla", name = "i", descriptor = "I")
	public static int anInt10304 = 0;

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(ZIIIB)V")
	public static void method8931(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static1.anInt10798 == 4) {
			Static1.anInt10798 = 0;
			Static717.anInt10817 = -1;
		}
		if (!arg0 && Static62.anInt1465 == arg1 && Static525.anInt8907 == arg3 && (Static164.anInt2808 == Static394.anInt6176 || Static400.aClass2_Sub34_28.aClass57_Sub19_2.method5960() == 1)) {
			return;
		}
		Static525.anInt8907 = arg3;
		Static62.anInt1465 = arg1;
		Static164.anInt2808 = Static394.anInt6176;
		if (Static400.aClass2_Sub34_28.aClass57_Sub19_2.method5960() == 1) {
			Static164.anInt2808 = 0;
		}
		Static81.method1586(arg2);
		Static694.method9028(Static163.aClass19_17, Static32.aClass32_12.method877(Static51.anInt1052), true, Static694.aClass381_13, Static437.aClass14_9);
		@Pc(74) int local74 = Static691.anInt10367;
		Static691.anInt10367 = (Static62.anInt1465 - (Static720.anInt10859 >> 4)) * 8;
		@Pc(85) int local85 = Static116.anInt2270;
		Static116.anInt2270 = (Static525.anInt8907 - (Static501.anInt7568 >> 4)) * 8;
		Static162.aClass2_Sub2_Sub13_2 = Static30.method5078(Static62.anInt1465 * 8, Static525.anInt8907 * 8);
		Static42.aClass255_2 = null;
		@Pc(109) int local109 = Static691.anInt10367 - local74;
		@Pc(113) int local113 = Static116.anInt2270 - local85;
		@Pc(134) int local134;
		@Pc(136) int local136;
		@Pc(193) int local193;
		@Pc(308) int local308;
		if (arg2 == 12) {
			for (local308 = 0; local308 < Static416.anInt6378; local308++) {
				@Pc(313) Class2_Sub45 local313 = Static592.aClass2_Sub45Array1[local308];
				if (local313 != null) {
					@Pc(318) Class8_Sub2_Sub1_Sub2_Sub2 local318 = local313.aClass8_Sub2_Sub1_Sub2_Sub2_2;
					for (local136 = 0; local136 < local318.anIntArray879.length; local136++) {
						local318.anIntArray879[local136] -= local109;
						local318.anIntArray878[local136] -= local113;
					}
					local318.anInt10690 -= local109 * 512;
					local318.anInt10694 -= local113 * 512;
				}
			}
		} else {
			@Pc(120) boolean local120 = false;
			Static390.anInt6126 = 0;
			@Pc(128) int local128 = (Static720.anInt10859 - 1) * 512;
			local134 = Static501.anInt7568 * 512 - 512;
			for (local136 = 0; local136 < Static416.anInt6378; local136++) {
				@Pc(141) Class2_Sub45 local141 = Static592.aClass2_Sub45Array1[local136];
				if (local141 != null) {
					@Pc(146) Class8_Sub2_Sub1_Sub2_Sub2 local146 = local141.aClass8_Sub2_Sub1_Sub2_Sub2_2;
					local146.anInt10694 -= local113 * 512;
					local146.anInt10690 -= local109 * 512;
					if (local146.anInt10690 >= 0 && local128 >= local146.anInt10690 && local146.anInt10694 >= 0 && local134 >= local146.anInt10694) {
						@Pc(191) boolean local191 = true;
						for (local193 = 0; local193 < local146.anIntArray879.length; local193++) {
							local146.anIntArray879[local193] -= local109;
							local146.anIntArray878[local193] -= local113;
							if (local146.anIntArray879[local193] < 0 || local146.anIntArray879[local193] >= Static720.anInt10859 || local146.anIntArray878[local193] < 0 || Static501.anInt7568 <= local146.anIntArray878[local193]) {
								local191 = false;
							}
						}
						if (local191) {
							Static103.anIntArray187[Static390.anInt6126++] = local146.anInt10740;
						} else {
							local146.method9328((Class268) null);
							local120 = true;
							local141.method9457();
						}
					} else {
						local146.method9328((Class268) null);
						local120 = true;
						local141.method9457();
					}
				}
			}
			if (local120) {
				Static416.anInt6378 = Static18.aClass28_2.method739();
				Static18.aClass28_2.method743(Static592.aClass2_Sub45Array1);
			}
		}
		for (local308 = 0; local308 < 2048; local308++) {
			@Pc(389) Class8_Sub2_Sub1_Sub2_Sub1 local389 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local308];
			if (local389 != null) {
				for (local134 = 0; local134 < local389.anIntArray879.length; local134++) {
					local389.anIntArray879[local134] -= local109;
					local389.anIntArray878[local134] -= local113;
				}
				local389.anInt10694 -= local113 * 512;
				local389.anInt10690 -= local109 * 512;
			}
		}
		@Pc(446) Class254[] local446 = Static527.aClass254Array1;
		for (local134 = 0; local134 < local446.length; local134++) {
			@Pc(453) Class254 local453 = local446[local134];
			if (local453 != null) {
				local453.anInt6362 -= local113 * 512;
				local453.anInt6369 -= local109 * 512;
			}
		}
		@Pc(485) Class2_Sub25 local485;
		for (local485 = (Class2_Sub25) Static159.aClass339_15.method7699(65280); local485 != null; local485 = (Class2_Sub25) Static159.aClass339_15.method7706()) {
			local485.anInt4016 -= local109;
			local485.anInt4006 -= local113;
			if (Static117.anInt2282 != 4 && (local485.anInt4016 < 0 || local485.anInt4006 < 0 || local485.anInt4016 >= Static720.anInt10859 || local485.anInt4006 >= Static501.anInt7568)) {
				local485.method9457();
			}
		}
		for (local485 = (Class2_Sub25) Static227.aClass339_18.method7699(65280); local485 != null; local485 = (Class2_Sub25) Static227.aClass339_18.method7706()) {
			local485.anInt4006 -= local113;
			local485.anInt4016 -= local109;
			if (Static117.anInt2282 != 4 && (local485.anInt4016 < 0 || local485.anInt4006 < 0 || local485.anInt4016 >= Static720.anInt10859 || local485.anInt4006 >= Static501.anInt7568)) {
				local485.method9457();
			}
		}
		if (Static117.anInt2282 != 4) {
			for (@Pc(608) Class2_Sub17 local608 = (Class2_Sub17) Static497.aClass28_35.method736(); local608 != null; local608 = (Class2_Sub17) Static497.aClass28_35.method740()) {
				@Pc(615) int local615 = (int) (local608.aLong328 & 0x3FFFL);
				@Pc(619) int local619 = local615 - Static691.anInt10367;
				local193 = (int) (local608.aLong328 >> 14 & 0x3FFFL);
				@Pc(632) int local632 = local193 - Static116.anInt2270;
				if (local619 < 0 || local632 < 0 || local619 >= Static720.anInt10859 || local632 >= Static501.anInt7568) {
					local608.method9457();
				}
			}
		}
		if (Static675.anInt10156 != 0) {
			Static212.anInt3466 -= local113;
			Static675.anInt10156 -= local109;
		}
		Static368.method5273();
		if (arg2 != 12) {
			Static441.anInt6689 -= local109;
			Static121.anInt2333 -= local109;
			Static709.anInt10667 -= local113;
			Static110.anInt2186 -= local113 * 512;
			Static170.anInt2864 -= local109 * 512;
			Static12.anInt5741 -= local113;
			if (Math.abs(local109) > Static720.anInt10859 || Math.abs(local113) > Static501.anInt7568) {
				Static218.method3187();
			}
		} else if (Static511.anInt7645 == 4) {
			Static433.anInt6262 -= local109 * 512;
			Static38.anInt920 -= local113 * 512;
			Static249.anInt4018 -= local113 * 512;
			Static494.anInt7409 -= local109 * 512;
		} else {
			Static693.anInt10383 = -1;
			Static692.anInt10376 = -1;
			Static511.anInt7645 = 1;
		}
		Static533.method7119();
		Static244.method3512();
		Static346.aClass28_29.method737();
		Static505.aClass339_77.method7700();
		Static422.aClass130_9.method2789();
		Static105.method2044();
	}
}
