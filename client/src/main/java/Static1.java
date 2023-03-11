import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!ro;")
	public static Class206 aClass206_1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "J")
	public static long aLong1 = 0L;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method2() {
		@Pc(8) int local8 = Static210.aByteArrayArray7.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static210.aByteArrayArray7[local10] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static48.anInt1254; local25++) {
					if (Static266.anIntArray334[local25] == Static291.anIntArray372[local10]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static266.anIntArray334[Static48.anInt1254] = Static291.anIntArray372[local10];
					local23 = Static48.anInt1254++;
				}
				@Pc(65) Buffer local65 = new Buffer(Static210.aByteArrayArray7[local10]);
				@Pc(67) int local67 = 0;
				while (Static210.aByteArrayArray7[local10].length > local65.pos && local67 < 511 && Static166.anInt3187 < 1023) {
					@Pc(88) int local88 = local23 | local67++ << 6;
					@Pc(92) int local92 = local65.g2();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(119) int local119 = local102 + (Static291.anIntArray372[local10] >> 8) * 64 - Static164.anInt3140;
					@Pc(132) int local132 = local106 + (Static291.anIntArray372[local10] & 0xFF) * 64 - Static148.anInt2719;
					@Pc(139) Class71 local139 = Static6.aClass219_1.method5570(local65.g2());
					if (Static365.aClass11_Sub5_Sub2_Sub2Array1[local88] == null && (local139.aByte16 & 0x1) > 0 && Static44.anInt1115 == local96 && local119 >= 0 && local119 + local139.anInt2041 < Static373.anInt7033 && local132 >= 0 && local132 + local139.anInt2041 < Static242.anInt4449) {
						Static365.aClass11_Sub5_Sub2_Sub2Array1[local88] = new Class11_Sub5_Sub2_Sub2();
						Static365.aClass11_Sub5_Sub2_Sub2Array1[local88].anInt4619 = local88;
						@Pc(187) Class11_Sub5_Sub2_Sub2 local187 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local88];
						Static211.anIntArray230[Static166.anInt3187++] = local88;
						local187.anInt4610 = Static114.anInt2348;
						local187.method4342(local139);
						local187.method4322(local187.aClass71_1.anInt2041);
						local187.anInt4604 = local187.aClass71_1.anInt2044 << 3;
						if (local187.anInt4604 == 0) {
							local187.method4330(0);
						} else {
							local187.method4330(local187.aClass71_1.aByte17 + 4 << 11 & 0x3863);
						}
						local187.method4339(local187.method4328(), local96, local119, true, local132);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZIZBLjava/lang/String;IILjava/lang/String;IJ)V")
	public static void method3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) long arg9) {
		if (!Static375.aBoolean477 && Static268.anInt4959 < 500) {
			@Pc(16) int local16 = arg8 == -1 ? Static107.anInt2219 : arg8;
			@Pc(30) Class2_Sub5 local30 = new Class2_Sub5(arg4, arg7, local16, arg6, arg0, arg9, arg5, arg2, arg1, arg3);
			Static129.aClass135_19.method3540(local30);
			Static268.anInt4959++;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!nb;ZIIIII)V")
	public static void method4(@OriginalArg(0) Class157 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static243.anInt4503 >= 50 || (arg0 == null || arg0.anIntArrayArray33 == null || arg0.anIntArrayArray33.length <= arg5 || arg0.anIntArrayArray33[arg5] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray33[arg5][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray33[arg5].length > 1) {
			local65 = (int) ((double) arg0.anIntArrayArray33[arg5].length * Math.random());
			if (local65 > 0) {
				local40 = arg0.anIntArrayArray33[arg5][local65];
			}
		}
		@Pc(78) int local78 = local36 & 0x1F;
		if (local78 == 0) {
			if (arg1) {
				Static29.method939(local46, 255, 0, local40);
			}
		} else if (Static218.aClass177_Sub1_2.anInt4882 != 0) {
			Static256.anIntArray321[Static243.anInt4503] = local40;
			Static329.anIntArray419[Static243.anInt4503] = local46;
			Static237.anIntArray283[Static243.anInt4503] = 0;
			Static196.aClass247Array2[Static243.anInt4503] = null;
			Static223.anIntArray256[Static243.anInt4503] = 255;
			local65 = (arg3 - 64) / 128;
			@Pc(136) int local136 = (arg4 - 64) / 128;
			Static162.anIntArray188[Static243.anInt4503] = local78 + (local136 << 8) + (arg2 << 24) + (local65 << 16);
			Static243.anInt4503++;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qg;I)V")
	public static void method5(@OriginalArg(0) Packet arg0) {
		@Pc(7) int local7 = 0;
		arg0.accessBits();
		@Pc(20) int local20;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < Static31.anInt751; local14++) {
			local20 = Static85.anIntArray121[local14];
			if ((Static36.aByteArray7[local20] & 0x1) == 0) {
				if (local7 > 0) {
					Static36.aByteArray7[local20] = (byte) (Static36.aByteArray7[local20] | 0x2);
					local7--;
				} else {
					local48 = arg0.gBit(1);
					if (local48 == 0) {
						local7 = Static100.method2161(arg0);
						Static36.aByteArray7[local20] = (byte) (Static36.aByteArray7[local20] | 0x2);
					} else {
						Static7.method6464(arg0, local20);
					}
				}
			}
		}
		arg0.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.accessBits();
		@Pc(126) int local126;
		for (local20 = 0; local20 < Static31.anInt751; local20++) {
			local48 = Static85.anIntArray121[local20];
			if ((Static36.aByteArray7[local48] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static36.aByteArray7[local48] = (byte) (Static36.aByteArray7[local48] | 0x2);
				} else {
					local126 = arg0.gBit(1);
					if (local126 == 0) {
						local7 = Static100.method2161(arg0);
						Static36.aByteArray7[local48] = (byte) (Static36.aByteArray7[local48] | 0x2);
					} else {
						Static7.method6464(arg0, local48);
					}
				}
			}
		}
		arg0.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.accessBits();
		@Pc(210) int local210;
		for (local48 = 0; local48 < Static192.anInt3547; local48++) {
			local126 = Static239.anIntArray284[local48];
			if ((Static36.aByteArray7[local126] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static36.aByteArray7[local126] = (byte) (Static36.aByteArray7[local126] | 0x2);
				} else {
					local210 = arg0.gBit(1);
					if (local210 == 0) {
						local7 = Static100.method2161(arg0);
						Static36.aByteArray7[local126] = (byte) (Static36.aByteArray7[local126] | 0x2);
					} else if (Static386.method6033(arg0, local126)) {
						Static36.aByteArray7[local126] = (byte) (Static36.aByteArray7[local126] | 0x2);
					}
				}
			}
		}
		arg0.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.accessBits();
		for (local126 = 0; local126 < Static192.anInt3547; local126++) {
			local210 = Static239.anIntArray284[local126];
			if ((Static36.aByteArray7[local210] & 0x1) == 0) {
				if (local7 > 0) {
					Static36.aByteArray7[local210] = (byte) (Static36.aByteArray7[local210] | 0x2);
					local7--;
				} else {
					@Pc(301) int local301 = arg0.gBit(1);
					if (local301 == 0) {
						local7 = Static100.method2161(arg0);
						Static36.aByteArray7[local210] = (byte) (Static36.aByteArray7[local210] | 0x2);
					} else if (Static386.method6033(arg0, local210)) {
						Static36.aByteArray7[local210] = (byte) (Static36.aByteArray7[local210] | 0x2);
					}
				}
			}
		}
		arg0.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static31.anInt751 = 0;
		Static192.anInt3547 = 0;
		for (local210 = 1; local210 < 2048; local210++) {
			Static36.aByteArray7[local210] = (byte) (Static36.aByteArray7[local210] >> 1);
			@Pc(366) Class11_Sub5_Sub2_Sub1 local366 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local210];
			if (local366 == null) {
				Static239.anIntArray284[Static192.anInt3547++] = local210;
			} else {
				Static85.anIntArray121[Static31.anInt751++] = local210;
			}
		}
	}
}
