import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
	public static int anInt9329;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!hda;")
	public static Class158 aClass158_16 = null;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!rka;I)V")
	public static void method8217(@OriginalArg(0) int arg0, @OriginalArg(1) PacketBit arg1) {
		@Pc(16) boolean local16 = arg1.gBit(1) == 1;
		if (local16) {
			Static321.anIntArray388[Static652.anInt9713++] = arg0;
		}
		@Pc(33) int local33 = arg1.gBit(2);
		@Pc(37) Class8_Sub2_Sub1_Sub2_Sub1 local37 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[arg0];
		if (local33 != 0) {
			@Pc(165) int local165;
			@Pc(170) int local170;
			@Pc(175) int local175;
			if (local33 == 1) {
				local165 = arg1.gBit(3);
				local170 = local37.anIntArray879[0];
				local175 = local37.anIntArray878[0];
				if (local165 == 0) {
					local175--;
					local170--;
				} else if (local165 == 1) {
					local175--;
				} else if (local165 == 2) {
					local175--;
					local170++;
				} else if (local165 == 3) {
					local170--;
				} else if (local165 == 4) {
					local170++;
				} else if (local165 == 5) {
					local175++;
					local170--;
				} else if (local165 == 6) {
					local175++;
				} else if (local165 == 7) {
					local170++;
					local175++;
				}
				if (local16) {
					local37.anInt1448 = local175;
					local37.anInt1441 = local170;
					local37.aBoolean127 = true;
				} else {
					local37.method1425(local175, local170, Static139.aByteArray30[arg0]);
				}
			} else if (local33 == 2) {
				local165 = arg1.gBit(4);
				local170 = local37.anIntArray879[0];
				local175 = local37.anIntArray878[0];
				if (local165 == 0) {
					local170 -= 2;
					local175 -= 2;
				} else if (local165 == 1) {
					local170--;
					local175 -= 2;
				} else if (local165 == 2) {
					local175 -= 2;
				} else if (local165 == 3) {
					local170++;
					local175 -= 2;
				} else if (local165 == 4) {
					local175 -= 2;
					local170 += 2;
				} else if (local165 == 5) {
					local175--;
					local170 -= 2;
				} else if (local165 == 6) {
					local170 += 2;
					local175--;
				} else if (local165 == 7) {
					local170 -= 2;
				} else if (local165 == 8) {
					local170 += 2;
				} else if (local165 == 9) {
					local170 -= 2;
					local175++;
				} else if (local165 == 10) {
					local170 += 2;
					local175++;
				} else if (local165 == 11) {
					local175 += 2;
					local170 -= 2;
				} else if (local165 == 12) {
					local175 += 2;
					local170--;
				} else if (local165 == 13) {
					local175 += 2;
				} else if (local165 == 14) {
					local175 += 2;
					local170++;
				} else if (local165 == 15) {
					local170 += 2;
					local175 += 2;
				}
				if (local16) {
					local37.anInt1441 = local170;
					local37.anInt1448 = local175;
					local37.aBoolean127 = true;
				} else {
					local37.method1425(local175, local170, Static139.aByteArray30[arg0]);
				}
			} else {
				local165 = arg1.gBit(1);
				@Pc(539) int local539;
				@Pc(551) int local551;
				@Pc(566) int local566;
				@Pc(573) int local573;
				if (local165 == 0) {
					local170 = arg1.gBit(12);
					local175 = local170 >> 10;
					local539 = local170 >> 5 & 0x1F;
					if (local539 > 15) {
						local539 -= 32;
					}
					local551 = local170 & 0x1F;
					if (local551 > 15) {
						local551 -= 32;
					}
					local566 = local37.anIntArray879[0] + local539;
					local573 = local551 + local37.anIntArray878[0];
					if (local16) {
						local37.anInt1441 = local566;
						local37.aBoolean127 = true;
						local37.anInt1448 = local573;
					} else {
						local37.method1425(local573, local566, Static139.aByteArray30[arg0]);
					}
					local37.aByte144 = local37.aByte143 = (byte) (local37.aByte144 + local175 & 0x3);
					if (Static441.method5968(local573, local566)) {
						local37.aByte143++;
					}
					if (Static312.anInt5000 == arg0) {
						if (local37.aByte144 != Static394.anInt6176) {
							Static75.aBoolean521 = true;
						}
						Static394.anInt6176 = local37.aByte144;
					}
				} else {
					local170 = arg1.gBit(30);
					local175 = local170 >> 28;
					local539 = local170 >> 14 & 0x3FFF;
					local551 = local170 & 0x3FFF;
					local566 = (local37.anIntArray879[0] + Static691.anInt10367 + local539 & 0x3FFF) - Static691.anInt10367;
					local573 = (local551 + local37.anIntArray878[0] + Static116.anInt2270 & 0x3FFF) - Static116.anInt2270;
					if (local16) {
						local37.aBoolean127 = true;
						local37.anInt1448 = local573;
						local37.anInt1441 = local566;
					} else {
						local37.method1425(local573, local566, Static139.aByteArray30[arg0]);
					}
					local37.aByte144 = local37.aByte143 = (byte) (local175 + local37.aByte144 & 0x3);
					if (Static441.method5968(local573, local566)) {
						local37.aByte143++;
					}
					if (Static312.anInt5000 == arg0) {
						Static394.anInt6176 = local37.aByte144;
					}
				}
			}
		} else if (local16) {
			local37.aBoolean127 = false;
		} else if (Static312.anInt5000 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(70) Class350 local70 = Static246.aClass350Array1[arg0] = new Class350();
			local70.anInt9324 = (local37.aByte144 << 28) + ((Static691.anInt10367 + local37.anIntArray879[0] >> 6 << 14) + (Static116.anInt2270 + local37.anIntArray878[0] >> 6));
			if (local37.anInt1467 == -1) {
				local70.anInt9326 = local37.aClass126_7.method2673(16383);
			} else {
				local70.anInt9326 = local37.anInt1467;
			}
			local70.anInt9322 = local37.anInt10722;
			local70.aBoolean711 = local37.aBoolean128;
			local70.aBoolean712 = local37.aBoolean125;
			if (local37.anInt1452 > 0) {
				Static76.method1552(local37);
			}
			Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[arg0] = null;
			if (arg1.gBit(1) != 0) {
				Static383.method5379(arg0, arg1);
			}
		}
	}
}
