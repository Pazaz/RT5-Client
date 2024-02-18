import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!ila", name = "i", descriptor = "Lclient!af;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!ila", name = "k", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_56 = new Class345(59, -1);

	@OriginalMember(owner = "client!ila", name = "a", descriptor = "(I)V")
	public static void method3986() {
		Static317.anInt5046 = 0;
		Static442.aBoolean499 = false;
		Static384.aClass75Array2 = new Class75[500];
		Static150.anInt2634 = 0;
		Static446.anIntArrayArrayArray9 = new int[Static299.anInt4824][Static619.anInt1566 + 1][Static662.anInt9843 + 1];
		Static663.anInt9874 = Static340.anInt5586;
		Static86.anInt1803 = Static340.anInt5586;
		Static444.anInt6751 = 0;
		Static607.aClass75Array4 = new Class75[2000];
		Static285.aClass75Array1 = new Class75[1000];
		Static469.anInt7072 = 0;
		Static560.aClass75Array3 = new Class75[500];
		if (Static665.aClass19_15 instanceof oa) {
			Static18.aBoolean20 = false;
		} else {
			Static18.aBoolean20 = true;
		}
	}

	@OriginalMember(owner = "client!ila", name = "b", descriptor = "(I)V")
	public static void method3988() {
		if (Static400.aClass2_Sub34_28.aClass57_Sub4_2.method2143() != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static198.anInt3276 - 4 & 0xFF);
		@Pc(25) int local25 = Static198.anInt3276 % Static720.anInt10859;
		@Pc(30) int local30;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local30 = 0; local30 < Static501.anInt7568; local30++) {
				Static328.aByteArrayArrayArray4[local27][local25][local30] = local21;
			}
		}
		if (Static394.anInt6176 == 3) {
			return;
		}
		for (local30 = 0; local30 < 2; local30++) {
			Static482.anIntArray588[local30] = -1000000;
			Static9.anIntArray18[local30] = 1000000;
			Static457.anIntArray552[local30] = 0;
			Static682.anIntArray817[local30] = 1000000;
			Static153.anIntArray235[local30] = 0;
		}
		@Pc(92) int local92 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690;
		@Pc(95) int local95 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694;
		@Pc(149) int local149;
		if (Static511.anInt7645 != 1 && Static692.anInt10376 == -1) {
			local149 = Static102.method2025(Static394.anInt6176, -29754, Static110.anInt2186, Static170.anInt2864);
			if (local149 - Static359.anInt5801 < 3200 && (Static280.aByteArrayArrayArray3[Static394.anInt6176][Static170.anInt2864 >> 9][Static110.anInt2186 >> 9] & 0x4) != 0) {
				Static409.method5656(Static110.anInt2186 >> 9, Static334.aClass291ArrayArrayArray1, 1, Static170.anInt2864 >> 9, false);
				return;
			}
			return;
		}
		if (Static511.anInt7645 != 1) {
			local92 = Static692.anInt10376;
			local95 = Static693.anInt10383;
		}
		if ((Static280.aByteArrayArrayArray3[Static394.anInt6176][local92 >> 9][local95 >> 9] & 0x4) != 0) {
			Static409.method5656(local95 >> 9, Static334.aClass291ArrayArrayArray1, 0, local92 >> 9, false);
		}
		if (Static598.anInt8832 >= 2560) {
			return;
		}
		local149 = Static170.anInt2864 >> 9;
		@Pc(153) int local153 = Static110.anInt2186 >> 9;
		@Pc(157) int local157 = local92 >> 9;
		@Pc(161) int local161 = local95 >> 9;
		@Pc(169) int local169;
		if (local157 > local149) {
			local169 = local157 - local149;
		} else {
			local169 = local149 - local157;
		}
		@Pc(186) int local186;
		if (local153 < local161) {
			local186 = local161 - local153;
		} else {
			local186 = local153 - local161;
		}
		if ((local169 != 0 || local186 != 0) && local169 > (-Static720.anInt10859) && local169 < Static720.anInt10859 && -Static501.anInt7568 < local186 && Static501.anInt7568 > local186) {
			@Pc(278) int local278;
			@Pc(280) int local280;
			if (local169 <= local186) {
				local278 = local169 * 65536 / local186;
				local280 = 32768;
				while (local161 != local153) {
					if (local161 > local153) {
						local153++;
					} else if (local161 < local153) {
						local153--;
					}
					if ((Static280.aByteArrayArrayArray3[Static394.anInt6176][local149][local153] & 0x4) != 0) {
						Static409.method5656(local153, Static334.aClass291ArrayArrayArray1, 1, local149, false);
						return;
					}
					local280 += local278;
					if (local280 >= 65536) {
						local280 -= 65536;
						if (local149 < local157) {
							local149++;
						} else if (local149 > local157) {
							local149--;
						}
						if ((Static280.aByteArrayArrayArray3[Static394.anInt6176][local149][local153] & 0x4) != 0) {
							Static409.method5656(local153, Static334.aClass291ArrayArrayArray1, 1, local149, false);
							return;
						}
					}
				}
				return;
			}
			local278 = local186 * 65536 / local169;
			local280 = 32768;
			while (local157 != local149) {
				if (local149 < local157) {
					local149++;
				} else if (local157 < local149) {
					local149--;
				}
				if ((Static280.aByteArrayArrayArray3[Static394.anInt6176][local149][local153] & 0x4) != 0) {
					Static409.method5656(local153, Static334.aClass291ArrayArrayArray1, 1, local149, false);
					return;
				}
				local280 += local278;
				if (local280 >= 65536) {
					if (local161 > local153) {
						local153++;
					} else if (local161 < local153) {
						local153--;
					}
					local280 -= 65536;
					if ((Static280.aByteArrayArrayArray3[Static394.anInt6176][local149][local153] & 0x4) != 0) {
						Static409.method5656(local153, Static334.aClass291ArrayArrayArray1, 1, local149, false);
						return;
					}
				}
			}
			return;
		}
		Static240.method3496((Throwable) null, "RC: " + local149 + "," + local153 + " " + local157 + "," + local161 + " " + Static691.anInt10367 + "," + Static116.anInt2270);
		return;
	}
}
