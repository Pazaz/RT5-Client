import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	public static int anInt7240;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "Lclient!bu;")
	public static Class29_Sub1 aClass29_Sub1_120;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!h;")
	public static final Class89 aClass89_257 = new Class89(90, 12);

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "Lclient!ad;")
	public static final Class4 aClass4_151 = new Class4(16);

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_267 = new Class145(39, 3);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!dg;IIIIIIIIII)Z")
	public static boolean method6463(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg9 - 64;
		Static301.anIntArrayArray49[64][64] = 99;
		@Pc(28) int local28 = arg3 - 64;
		Static13.anIntArrayArray4[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static47.anIntArray90[0] = arg9;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static257.anIntArray257[0] = arg3;
		@Pc(55) int[][] local55 = arg0.anIntArrayArray14;
		while (local50 != local47) {
			local7 = Static47.anIntArray90[local47];
			local9 = Static257.anIntArray257[local47];
			@Pc(71) int local71 = local9 - arg0.anInt1484;
			local47 = local47 + 1 & 0xFFF;
			@Pc(82) int local82 = local9 - local28;
			@Pc(86) int local86 = local7 - local18;
			@Pc(92) int local92 = local7 - arg0.anInt1468;
			if (arg6 == -4) {
				if (local7 == arg5 && local9 == arg4) {
					Static182.anInt3422 = local9;
					Static184.anInt3435 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static24.method856(arg8, local9, arg4, local7, arg5, 1, arg1, 1)) {
					Static182.anInt3422 = local9;
					Static184.anInt3435 = local7;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg0.method1637(arg8, local7, arg4, 1, arg7, arg5, local9, 1, arg1)) {
					Static182.anInt3422 = local9;
					Static184.anInt3435 = local7;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg0.method1640(arg7, arg5, arg8, local7, arg4, arg1, local9, 1)) {
					Static184.anInt3435 = local7;
					Static182.anInt3422 = local9;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg0.method1629(1, arg5, arg6, arg4, arg2, local9, local7)) {
					Static184.anInt3435 = local7;
					Static182.anInt3422 = local9;
					return true;
				}
			} else if (arg0.method1630(arg2, 1, local9, local7, arg6, arg4, arg5)) {
				Static182.anInt3422 = local9;
				Static184.anInt3435 = local7;
				return true;
			}
			@Pc(236) int local236 = Static13.anIntArrayArray4[local86][local82] + 1;
			if (local86 > 0 && Static301.anIntArrayArray49[local86 - 1][local82] == 0 && (local55[local92 - 1][local71] & 0x42240000) == 0) {
				Static47.anIntArray90[local50] = local7 - 1;
				Static257.anIntArray257[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static301.anIntArrayArray49[local86 - 1][local82] = 2;
				Static13.anIntArrayArray4[local86 - 1][local82] = local236;
			}
			if (local86 < 127 && Static301.anIntArrayArray49[local86 + 1][local82] == 0 && (local55[local92 + 1][local71] & 0x60240000) == 0) {
				Static47.anIntArray90[local50] = local7 + 1;
				Static257.anIntArray257[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static301.anIntArrayArray49[local86 + 1][local82] = 8;
				Static13.anIntArrayArray4[local86 + 1][local82] = local236;
			}
			if (local82 > 0 && Static301.anIntArrayArray49[local86][local82 - 1] == 0 && (local55[local92][local71 - 1] & 0x40A40000) == 0) {
				Static47.anIntArray90[local50] = local7;
				Static257.anIntArray257[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static301.anIntArrayArray49[local86][local82 - 1] = 1;
				Static13.anIntArrayArray4[local86][local82 - 1] = local236;
			}
			if (local82 < 127 && Static301.anIntArrayArray49[local86][local82 + 1] == 0 && (local55[local92][local71 + 1] & 0x48240000) == 0) {
				Static47.anIntArray90[local50] = local7;
				Static257.anIntArray257[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static301.anIntArrayArray49[local86][local82 + 1] = 4;
				Static13.anIntArrayArray4[local86][local82 + 1] = local236;
			}
			if (local86 > 0 && local82 > 0 && Static301.anIntArrayArray49[local86 - 1][local82 - 1] == 0 && (local55[local92 - 1][local71 - 1] & 0x43A40000) == 0 && (local55[local92 - 1][local71] & 0x42240000) == 0 && (local55[local92][local71 - 1] & 0x40A40000) == 0) {
				Static47.anIntArray90[local50] = local7 - 1;
				Static257.anIntArray257[local50] = local9 - 1;
				Static301.anIntArrayArray49[local86 - 1][local82 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static13.anIntArrayArray4[local86 - 1][local82 - 1] = local236;
			}
			if (local86 < 127 && local82 > 0 && Static301.anIntArrayArray49[local86 + 1][local82 - 1] == 0 && (local55[local92 + 1][local71 - 1] & 0x60E40000) == 0 && (local55[local92 + 1][local71] & 0x60240000) == 0 && (local55[local92][local71 - 1] & 0x40A40000) == 0) {
				Static47.anIntArray90[local50] = local7 + 1;
				Static257.anIntArray257[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static301.anIntArrayArray49[local86 + 1][local82 - 1] = 9;
				Static13.anIntArrayArray4[local86 + 1][local82 - 1] = local236;
			}
			if (local86 > 0 && local82 < 127 && Static301.anIntArrayArray49[local86 - 1][local82 + 1] == 0 && (local55[local92 - 1][local71 + 1] & 0x4E240000) == 0 && (local55[local92 - 1][local71] & 0x42240000) == 0 && (local55[local92][local71 + 1] & 0x48240000) == 0) {
				Static47.anIntArray90[local50] = local7 - 1;
				Static257.anIntArray257[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static301.anIntArrayArray49[local86 - 1][local82 + 1] = 6;
				Static13.anIntArrayArray4[local86 - 1][local82 + 1] = local236;
			}
			if (local86 < 127 && local82 < 127 && Static301.anIntArrayArray49[local86 + 1][local82 + 1] == 0 && (local55[local92 + 1][local71 + 1] & 0x78240000) == 0 && (local55[local92 + 1][local71] & 0x60240000) == 0 && (local55[local92][local71 + 1] & 0x48240000) == 0) {
				Static47.anIntArray90[local50] = local7 + 1;
				Static257.anIntArray257[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static301.anIntArrayArray49[local86 + 1][local82 + 1] = 12;
				Static13.anIntArrayArray4[local86 + 1][local82 + 1] = local236;
			}
		}
		Static184.anInt3435 = local7;
		Static182.anInt3422 = local9;
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!qg;II)V")
	public static void method6464(@OriginalArg(0) Class2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method4868(1) == 1;
		if (local15) {
			Static52.anIntArray100[Static325.anInt6079++] = arg1;
		}
		@Pc(30) int local30 = arg0.method4868(2);
		@Pc(34) Class11_Sub5_Sub2_Sub1 local34 = Static12.aClass11_Sub5_Sub2_Sub1Array1[arg1];
		if (local30 != 0) {
			@Pc(136) int local136;
			@Pc(141) int local141;
			@Pc(146) int local146;
			if (local30 == 1) {
				local136 = arg0.method4868(3);
				local141 = local34.anIntArray316[0];
				local146 = local34.anIntArray317[0];
				if (local136 == 0) {
					local146--;
					local141--;
				} else if (local136 == 1) {
					local146--;
				} else if (local136 == 2) {
					local146--;
					local141++;
				} else if (local136 == 3) {
					local141--;
				} else if (local136 == 4) {
					local141++;
				} else if (local136 == 5) {
					local146++;
					local141--;
				} else if (local136 == 6) {
					local146++;
				} else if (local136 == 7) {
					local141++;
					local146++;
				}
				if (local15) {
					local34.anInt4169 = local141;
					local34.anInt4181 = local146;
					local34.aBoolean276 = true;
				} else {
					local34.method4068(local146, local141, Static335.aByteArray92[arg1]);
				}
			} else if (local30 == 2) {
				local136 = arg0.method4868(4);
				local141 = local34.anIntArray316[0];
				local146 = local34.anIntArray317[0];
				if (local136 == 0) {
					local141 -= 2;
					local146 -= 2;
				} else if (local136 == 1) {
					local141--;
					local146 -= 2;
				} else if (local136 == 2) {
					local146 -= 2;
				} else if (local136 == 3) {
					local141++;
					local146 -= 2;
				} else if (local136 == 4) {
					local141 += 2;
					local146 -= 2;
				} else if (local136 == 5) {
					local146--;
					local141 -= 2;
				} else if (local136 == 6) {
					local146--;
					local141 += 2;
				} else if (local136 == 7) {
					local141 -= 2;
				} else if (local136 == 8) {
					local141 += 2;
				} else if (local136 == 9) {
					local146++;
					local141 -= 2;
				} else if (local136 == 10) {
					local146++;
					local141 += 2;
				} else if (local136 == 11) {
					local141 -= 2;
					local146 += 2;
				} else if (local136 == 12) {
					local141--;
					local146 += 2;
				} else if (local136 == 13) {
					local146 += 2;
				} else if (local136 == 14) {
					local146 += 2;
					local141++;
				} else if (local136 == 15) {
					local146 += 2;
					local141 += 2;
				}
				if (local15) {
					local34.anInt4181 = local146;
					local34.aBoolean276 = true;
					local34.anInt4169 = local141;
				} else {
					local34.method4068(local146, local141, Static335.aByteArray92[arg1]);
				}
			} else {
				local136 = arg0.method4868(1);
				@Pc(411) int local411;
				@Pc(419) int local419;
				@Pc(432) int local432;
				@Pc(439) int local439;
				if (local136 == 0) {
					local141 = arg0.method4868(12);
					local146 = local141 >> 10;
					local411 = local141 >> 5 & 0x1F;
					if (local411 > 15) {
						local411 -= 32;
					}
					local419 = local141 & 0x1F;
					if (local419 > 15) {
						local419 -= 32;
					}
					local432 = local411 + local34.anIntArray316[0];
					local439 = local419 + local34.anIntArray317[0];
					if (local15) {
						local34.anInt4181 = local439;
						local34.aBoolean276 = true;
						local34.anInt4169 = local432;
					} else {
						local34.method4068(local439, local432, Static335.aByteArray92[arg1]);
					}
					local34.aByte78 = (byte) (local146 + local34.aByte78 & 0x3);
					if (arg1 == Static234.anInt4226) {
						Static355.anInt6585 = local34.aByte78;
					}
				} else {
					local141 = arg0.method4868(30);
					local146 = local141 >> 28;
					local411 = local141 >> 14 & 0x3FFF;
					local419 = local141 & 0x3FFF;
					local432 = (local411 + Static164.anInt3140 + local34.anIntArray316[0] & 0x3FFF) - Static164.anInt3140;
					local439 = (local34.anIntArray317[0] + Static148.anInt2719 + local419 & 0x3FFF) - Static148.anInt2719;
					if (local15) {
						local34.aBoolean276 = true;
						local34.anInt4181 = local439;
						local34.anInt4169 = local432;
					} else {
						local34.method4068(local439, local432, Static335.aByteArray92[arg1]);
					}
					local34.aByte78 = (byte) (local34.aByte78 + local146 & 0x3);
					if (Static234.anInt4226 == arg1) {
						Static355.anInt6585 = local34.aByte78;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean276 = false;
		} else if (arg1 == Static234.anInt4226) {
			throw new RuntimeException("s:lr");
		} else {
			Static360.anIntArray422[arg1] = (Static164.anInt3140 + local34.anIntArray316[0] >> 6 << 14) + (local34.aByte78 << 28) + (Static148.anInt2719 + local34.anIntArray317[0] >> 6);
			if (local34.anInt4174 == -1) {
				Static324.anIntArray410[arg1] = local34.aClass248_7.method6441();
			} else {
				Static324.anIntArray410[arg1] = local34.anInt4174;
			}
			Static225.anIntArray260[arg1] = local34.anInt4611;
			if (local34.anInt4182 > 0) {
				Static298.method2423(local34);
			}
			Static12.aClass11_Sub5_Sub2_Sub1Array1[arg1] = null;
			if (arg0.method4868(1) != 0) {
				Static386.method6033(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!nk;B)Lclient!nk;")
	public static Class161 method6465(@OriginalArg(0) Class161 arg0) {
		if (arg0.anInt4275 != -1) {
			return Static6.method140(arg0.anInt4275);
		}
		@Pc(25) int local25 = arg0.anInt4317 >>> 16;
		@Pc(30) Class137 local30 = new Class137(Static329.aClass4_130);
		for (@Pc(35) Class2_Sub7 local35 = (Class2_Sub7) local30.method3561(); local35 != null; local35 = (Class2_Sub7) local30.method3560()) {
			if (local35.anInt1370 == local25) {
				return Static6.method140((int) local35.aLong232);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZI)I")
	public static int method6466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static106.method2235(4, arg0 + 45365, arg1 - -91923) + (Static106.method2235(2, arg0 + 10294, arg1 + 37821) - 128 >> 1) + (Static106.method2235(1, arg0, arg1) - 128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Lclient!ac;")
	public static Class3_Sub1 method6467(@OriginalArg(0) int arg0) {
		return Static70.aBoolean130 && arg0 >= Static375.anInt7042 && Static312.anInt5843 >= arg0 ? Static295.aClass3_Sub1Array1[arg0 - Static375.anInt7042] : null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	public static void method6469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub2_Sub7 local12 = Static316.method5413(14, arg1);
		local12.method2311();
		local12.anInt2289 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!bh;IZ)V")
	public static void method6470(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (Static237.aBoolean297) {
			Static237.aBoolean297 = false;
			arg1 = 0;
		}
		if (Static311.aClass21_2 != null && Static311.aClass21_2.method854(arg0)) {
			return;
		}
		Static311.aClass21_2 = arg0;
		Static1.aLong1 = MonotonicClock.currentTimeMillis();
		Static52.anInt1394 = arg1;
		Static261.anInt4803 = arg1;
		if (Static261.anInt4803 != 0) {
			Static175.anInt3351 = Static364.anInt6817;
			Static355.anInt6565 = Static113.anInt2337;
			Static67.aFloat31 = Static156.aFloat35;
			Static102.aFloat41 = Static141.aFloat34;
			Static228.anInt4046 = Static99.anInt2095;
			Static339.aFloat76 = Static164.aFloat38;
			Static218.aFloat30 = Static347.aFloat77;
			Static79.aClass42_4 = Static24.aClass42_2;
			Static233.aFloat63 = Static317.aFloat74;
			Static192.aFloat40 = Static134.aFloat33;
			return;
		}
		Static140.method2623();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!nk;I)Z")
	public static boolean method6472(@OriginalArg(0) Class161 arg0) {
		if (arg0.anInt4273 == Static180.anInt3410) {
			Static86.anInt1870 = 250;
			return true;
		} else {
			return false;
		}
	}
}
