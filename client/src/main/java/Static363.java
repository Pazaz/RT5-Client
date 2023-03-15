import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
	public static int anInt6801;

	@OriginalMember(owner = "client!vf", name = "N", descriptor = "Z")
	public static boolean aBoolean464 = true;

	@OriginalMember(owner = "client!vf", name = "U", descriptor = "Lclient!ld;")
	public static final LinkedList aClass135_39 = new LinkedList();

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
	public static void method6090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg1 > arg0) {
			for (local10 = arg0; local10 < arg1; local10++) {
				Static357.anIntArrayArray58[local10][arg3] = arg2;
			}
		} else {
			for (local10 = arg1; local10 < arg0; local10++) {
				Static357.anIntArrayArray58[local10][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V")
	public static void method6091() {
		if (client.preferences.method4492(Static77.anInt1762) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static163.anInt3086 - 4 & 0xFF);
		@Pc(25) int local25 = Static163.anInt3086 % Static373.anInt7033;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static242.anInt4449; local31++) {
				Static230.aByteArrayArrayArray13[local27][local25][local31] = local21;
			}
		}
		if (Static355.anInt6585 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static353.anIntArray448[local31] = -1000000;
			Static107.anIntArray136[local31] = 1000000;
			Static248.anIntArray318[local31] = 0;
			Static86.anIntArray122[local31] = 1000000;
			Static324.anIntArray409[local31] = 0;
		}
		@Pc(94) int local94;
		if (Camera.anInt5911 != 1) {
			local94 = Static386.method6032(Static136.anInt6778, Static211.anInt3777, Static355.anInt6585);
			if (local94 - Static102.anInt3592 < 800 && (Static359.aByteArrayArrayArray16[Static355.anInt6585][Static136.anInt6778 >> 7][Static211.anInt3777 >> 7] & 0x4) != 0) {
				Static81.method3667(Scene.aClass67ArrayArrayArray3, false, Static136.anInt6778 >> 7, Static211.anInt3777 >> 7, 1);
				return;
			}
			return;
		}
		if ((Static359.aByteArrayArrayArray16[Static355.anInt6585][PlayerList.self.xFine >> 7][PlayerList.self.zFine >> 7] & 0x4) != 0) {
			Static81.method3667(Scene.aClass67ArrayArrayArray3, false, PlayerList.self.xFine >> 7, PlayerList.self.zFine >> 7, 0);
		}
		if (Static265.anInt4857 >= 2560) {
			return;
		}
		local94 = Static136.anInt6778 >> 7;
		@Pc(175) int local175 = Static211.anInt3777 >> 7;
		@Pc(180) int local180 = PlayerList.self.xFine >> 7;
		@Pc(185) int local185 = PlayerList.self.zFine >> 7;
		@Pc(196) int local196;
		if (local180 <= local94) {
			local196 = local94 - local180;
		} else {
			local196 = local180 - local94;
		}
		@Pc(210) int local210;
		if (local185 <= local175) {
			local210 = local175 - local185;
		} else {
			local210 = local185 - local175;
		}
		if (local196 == 0 && local210 == 0 || local196 <= -Static373.anInt7033 || Static373.anInt7033 <= local196 || local210 <= -Static242.anInt4449 || local210 >= Static242.anInt4449) {
			Static262.report(null, "RC: " + local94 + "," + local175 + " " + local180 + "," + local185 + " " + Camera.originX + "," + Camera.originZ);
			return;
		}
		@Pc(290) int local290;
		@Pc(292) int local292;
		if (local210 >= local196) {
			local290 = local196 * 65536 / local210;
			local292 = 32768;
			while (local185 != local175) {
				if (local185 > local175) {
					local175++;
				} else if (local175 > local185) {
					local175--;
				}
				if ((Static359.aByteArrayArrayArray16[Static355.anInt6585][local94][local175] & 0x4) != 0) {
					Static81.method3667(Scene.aClass67ArrayArrayArray3, false, local94, local175, 1);
					return;
				}
				local292 += local290;
				if (local292 >= 65536) {
					local292 -= 65536;
					if (local94 < local180) {
						local94++;
					} else if (local94 > local180) {
						local94--;
					}
					if ((Static359.aByteArrayArrayArray16[Static355.anInt6585][local94][local175] & 0x4) != 0) {
						Static81.method3667(Scene.aClass67ArrayArrayArray3, false, local94, local175, 1);
						return;
					}
				}
			}
			return;
		}
		local290 = local210 * 65536 / local196;
		local292 = 32768;
		while (local94 != local180) {
			if (local94 < local180) {
				local94++;
			} else if (local180 < local94) {
				local94--;
			}
			if ((Static359.aByteArrayArrayArray16[Static355.anInt6585][local94][local175] & 0x4) != 0) {
				Static81.method3667(Scene.aClass67ArrayArrayArray3, false, local94, local175, 1);
				return;
			}
			local292 += local290;
			if (local292 >= 65536) {
				local292 -= 65536;
				if (local175 < local185) {
					local175++;
				} else if (local185 < local175) {
					local175--;
				}
				if ((Static359.aByteArrayArrayArray16[Static355.anInt6585][local94][local175] & 0x4) != 0) {
					Static81.method3667(Scene.aClass67ArrayArrayArray3, false, local94, local175, 1);
					return;
				}
			}
		}
	}
}
