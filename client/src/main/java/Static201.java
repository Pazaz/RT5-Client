import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!as;")
	public static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!qj;")
	public static Class162 aClass162_148;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!sc;")
	public static Class181 aClass181_3;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "F")
	public static float aFloat53;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	public static int anInt4274;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
	public static int anInt4275;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "[B")
	private static byte[] aByteArray59;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
	public static int anInt4276;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
	public static int anInt4277;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "[B")
	private static byte[] aByteArray60;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "[S")
	private static short[] aShortArray86;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
	public static int anInt4278;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
	public static int anInt4279;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
	public static int anInt4280;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
	public static int anInt4281;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
	public static int anInt4282;

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "Lclient!sf;")
	private static Class183 aClass183_21;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
	public static int anInt4283;

	@OriginalMember(owner = "client!ne", name = "A", descriptor = "[B")
	private static byte[] aByteArray61;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
	public static int anInt4284;

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "[S")
	private static short[] aShortArray87;

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "[[[Lclient!ep;")
	private static Class58[][][] aClass58ArrayArrayArray2;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "[B")
	private static byte[] aByteArray62;

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "[I")
	private static int[] anIntArray307;

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "[B")
	private static byte[] aByteArray63;

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
	public static int anInt4285;

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
	public static int anInt4286;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!sf;")
	private static final Class183 aClass183_20 = new Class183(16);

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public static int anInt4272 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "[S")
	private static final short[] aShortArray85 = new short[1];

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public static int anInt4273 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[B")
	private static final byte[] aByteArray58 = new byte[1];

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Lclient!mi;")
	public static final Class130 aClass130_28 = new Class130();

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!nr;IIII[S[B)V")
	private static void method3672(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class189 local13 = Static83.method1840(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.anInt6201;
			if (local16 != -1) {
				@Pc(23) Class59 local23 = Static155.method3333(local16);
				@Pc(47) Class29 local47 = local23.method1744(local13.aBoolean441 ? local13.aBoolean437 : false, local13.aBoolean439 ? arg6[local4] >> 6 & 0x3 : 0, arg0);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method5850() >> 2;
					@Pc(63) int local63 = arg4 * local47.method5832() >> 2;
					if (local23.aBoolean139) {
						@Pc(69) int local69 = local13.anInt6195;
						@Pc(72) int local72 = local13.anInt6173;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt2067 == 0) {
							local47.method5834(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method5835(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt2067 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!nr;Lclient!il;IIII[I[I)V")
	private static void method3674(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class1_Sub16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method5761();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method5761();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray60[arg4 + arg5 * anInt4275] = (byte) local21;
					aByteArray62[arg4 + arg5 * anInt4275] = 0;
				} else {
					aByteArray62[arg4 + arg5 * anInt4275] = (byte) local21;
					aByteArray59[arg4 + arg5 * anInt4275] = 0;
					aByteArray60[arg4 + arg5 * anInt4275] = arg1.method5772();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method5761();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method5761();
				local127 = arg1.method5761();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method5761();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray60[arg4 + arg5 * anInt4275] = (byte) local123;
				aByteArray62[arg4 + arg5 * anInt4275] = (byte) local125;
				aByteArray59[arg4 + arg5 * anInt4275] = (byte) local127;
				if (local139 == 1) {
					aShortArray86[arg4 + arg5 * anInt4275] = (short) (arg1.method5749() + 1);
					aByteArray61[arg4 + arg5 * anInt4275] = arg1.method5772();
				} else if (local139 > 1) {
					aShortArray86[arg4 + arg5 * anInt4275] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5749();
						local218[local220] = arg1.method5772();
					}
					aClass183_21.method5055((long) (arg4 << 16 | arg5), new Class1_Sub38(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5749();
						local218[local220] = arg1.method5772();
					}
				}
				if (aClass58ArrayArrayArray2[local118 - 1][arg2 - (anInt4281 >> 6)][arg3 - (anInt4283 >> 6)] == null) {
					aClass58ArrayArrayArray2[local118 - 1][arg2 - (anInt4281 >> 6)][arg3 - (anInt4283 >> 6)] = new Class58();
				}
				@Pc(338) Class2_Sub1 local338 = new Class2_Sub1(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass58ArrayArrayArray2[local118 - 1][arg2 - (anInt4281 >> 6)][arg3 - (anInt4283 >> 6)].method1670(local338);
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Lclient!rr;")
	public static Class179 method3675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class179 local3 = new Class179();
		for (@Pc(8) Class1_Sub1_Sub3 local8 = (Class1_Sub1_Sub3) aClass183_20.method5052(); local8 != null; local8 = (Class1_Sub1_Sub3) aClass183_20.method5050()) {
			if (local8.aBoolean40 && local8.method415(arg1, arg0)) {
				local3.method4927(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()V")
	public static void method3676() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass181_3.anInt5956; local4++) {
			@Pc(32) boolean local32 = aClass1_Sub1_Sub3_2.method412(aClass181_3.anIntArray451[local4] >> 14 & 0x3FFF, aClass181_3.anIntArray451[local4] >> 28 & 0x3, aClass181_3.anIntArray451[local4] & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class1_Sub21 local42 = new Class1_Sub21(aClass181_3.anIntArray452[local4]);
				local42.anInt4150 = local2[1] - anInt4281;
				local42.anInt4154 = local2[2] - anInt4283;
				aClass130_28.method3760(local42);
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!nr;)Lclient!mi;")
	public static Class130 method3677(@OriginalArg(0) Class40 arg0) {
		@Pc(3) int local3 = anInt4285 - anInt4282;
		@Pc(7) int local7 = anInt4279 - anInt4280;
		@Pc(15) int local15 = (anInt4276 - anInt4286 << 16) / local3;
		@Pc(23) int local23 = (anInt4277 - anInt4278 << 16) / local7;
		return method3684(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!qj;)V")
	public static void method3678(@OriginalArg(0) Class162 arg0) {
		aClass162_148 = arg0;
		aClass183_20.method5051();
		@Pc(9) int local9 = aClass162_148.method4631("details");
		@Pc(14) int[] local14 = aClass162_148.method4621(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class1_Sub1_Sub3 local25 = Static43.method1272(local14[local16], local9, aClass162_148);
			aClass183_20.method5055((long) local25.anInt580, local25);
		}
		Static239.method4518(false);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!nr;IIIIIII[S[BZ)V")
	private static void method3679(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method2717(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray307[arg6];
					if (arg10 || local32 != 0) {
						arg0.method2717(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static99.method2074(local20, anInt4274, arg7 >> 6 & 0x3, arg4, anIntArray307[arg6], local32, arg1, arg2, arg3, arg5, arg0, aByteArrayArrayArray11);
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		if (arg3 == 1) {
			local20 = arg1;
		} else {
			local20 = arg1 + arg3 - 1;
		}
		if (arg4 == 1) {
			local32 = arg2;
		} else {
			local32 = arg2 + arg4 - 1;
		}
		for (@Pc(100) int local100 = 0; local100 < arg8.length; local100++) {
			@Pc(107) int local107 = arg9[local100] & 0x3F;
			if (local107 == 0 || local107 == 2 || local107 == 3 || local107 == 9) {
				@Pc(126) Class189 local126 = Static83.method1840(arg8[local100] & 0xFFFF);
				if (local126.anInt6201 == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt6170 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method2704(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method2720(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method2704(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method2720(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method2704(arg1, arg2, arg4, -1, 0);
							arg0.method2720(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method2704(local20, arg2, arg4, -1, 0);
							arg0.method2720(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method2704(local20, arg2, arg4, -1, 0);
							arg0.method2720(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method2704(arg1, arg2, arg4, -1, 0);
							arg0.method2720(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method2720(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method2720(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method2720(local20, local32, 1, local132, 0);
						} else {
							arg0.method2720(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method2720(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method2720(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Lclient!nr;)V")
	public static void method3680(@OriginalArg(0) Class40 arg0) {
		@Pc(3) int local3 = anInt4285 - anInt4282;
		@Pc(7) int local7 = anInt4279 - anInt4280;
		@Pc(15) int local15 = (anInt4276 - anInt4286 << 16) / local3;
		@Pc(23) int local23 = (anInt4277 - anInt4278 << 16) / local7;
		method3681(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!nr;IIII)V")
	private static void method3681(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt4285 - anInt4282;
		@Pc(7) int local7 = anInt4279 - anInt4280;
		if (anInt4285 < anInt4275) {
			local3++;
		}
		if (anInt4279 < anInt4284) {
			local7++;
		}
		@Pc(28) int local28;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(70) int local70;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(172) int local172;
		@Pc(174) int local174;
		@Pc(176) int local176;
		@Pc(178) int local178;
		for (@Pc(17) int local17 = 0; local17 < local3; local17++) {
			local28 = (arg1 * local17 >> 16) + anInt4286;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt4286;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt4282 + local17;
				if (local50 >= 0 && local50 < anInt4275) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt4277 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt4277 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt4280;
							local172 = local50 + local93 * anInt4275;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt4284) {
								local174 = (aByteArray63[local172] & 0xFF) << 16 | aShortArray87[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray62[local172] & 0xFF;
								local178 = aShortArray86[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass1_Sub1_Sub3_2.anInt585 != -1) {
									local174 = aClass1_Sub1_Sub3_2.anInt585 | 0xFF000000;
								} else if ((local17 + anInt4282 & 0x4) == (local57 + anInt4279 & 0x4)) {
									local174 = anIntArray307[Static168.anInt4070 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method2717(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method3679(arg0, local28, local70, local44, local84, local174, local176, aByteArray59[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class1_Sub38 local280 = (Class1_Sub38) aClass183_21.method5053((long) (local50 << 16 | local93));
								if (local280 != null) {
									method3679(arg0, local28, local70, local44, local84, local174, local176, aByteArray59[local172], local280.aShortArray108, local280.aByteArray78, true);
								}
							} else {
								aShortArray85[0] = (short) (local178 - 1);
								aByteArray58[0] = aByteArray61[local172];
								method3679(arg0, local28, local70, local44, local84, local174, local176, aByteArray59[local172], aShortArray85, aByteArray58, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt4277 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt4277 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass1_Sub1_Sub3_2.anInt585 != -1) {
							local93 = aClass1_Sub1_Sub3_2.anInt585 | 0xFF000000;
						} else if ((local17 + anInt4282 & 0x4) == (local57 + anInt4279 & 0x4)) {
							local93 = anIntArray307[Static168.anInt4070 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method2717(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt4286;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt4286;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt4282;
				if (local57 >= 0 && local57 < anInt4275) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt4277 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt4277 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt4280;
							if (local172 >= 0 && local172 < anInt4284) {
								local174 = aShortArray86[local57 + local172 * anInt4275] & 0xFFFF;
								if (local174 <= 0) {
									method3672(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class1_Sub38 local457 = (Class1_Sub38) aClass183_21.method5053((long) (local57 << 16 | local172));
									if (local457 != null) {
										method3672(arg0, local40, local80, local50, local93, local457.aShortArray108, local457.aByteArray78);
									}
								} else {
									aShortArray85[0] = (short) (local174 - 1);
									aByteArray58[0] = aByteArray61[local57 + local172 * anInt4275];
									method3672(arg0, local40, local80, local50, local93, aShortArray85, aByteArray58);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt4282 >> 6;
		local44 = anInt4280 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt4285 >> 6;
		local57 = anInt4279 >> 6;
		if (local50 >= aClass58ArrayArrayArray2[0].length) {
			local50 = aClass58ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass58ArrayArrayArray2[0][0].length) {
			local57 = aClass58ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class58 local587 = aClass58ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt4281 >> 6)) * 64;
						local174 = (local84 + (anInt4283 >> 6)) * 64;
						for (@Pc(610) Class2_Sub1 local610 = (Class2_Sub1) local587.method1672(); local610 != null; local610 = (Class2_Sub1) local587.method1675()) {
							local178 = local172 + local610.aByte12 - anInt4281 - anInt4282;
							local629 = local174 + local610.aByte13 - anInt4283 - anInt4280;
							local639 = (arg1 * local178 >> 16) + anInt4286;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt4286;
							local663 = anInt4277 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt4277 - (arg2 * local629 >> 16);
							method3679(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt1194, local610.aByte10 & 0xFF, local610.aByte11, local610.aShortArray12, local610.aByteArray6, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class58 local725 = aClass58ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt4281 >> 6)) * 64;
						local176 = (local93 + (anInt4283 >> 6)) * 64;
						for (@Pc(748) Class2_Sub1 local748 = (Class2_Sub1) local725.method1672(); local748 != null; local748 = (Class2_Sub1) local725.method1675()) {
							local629 = local174 + local748.aByte12 - anInt4281 - anInt4282;
							local639 = local176 + local748.aByte13 - anInt4283 - anInt4280;
							local651 = (arg1 * local629 >> 16) + anInt4286;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt4286;
							local673 = anInt4277 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt4277 - (arg2 * local639 >> 16);
							method3672(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray12, local748.aByteArray6);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!fl;II)V")
	public static void method3682(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static186.anInt4355; local1++) {
			anIntArray307[local1 + 1] = method3683(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!fl;III)I")
	private static int method3683(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class191 local3 = Static295.method5207(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt6233;
		if (local10 >= 0 && arg0.method165(local10).aBoolean108) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt6243 >= 0) {
			local26 = local3.anInt6243;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static139.anIntArray247[Static192.method3828(Static58.method1399(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static139.anIntArray247[Static192.method3828(Static58.method1399(arg0.method165(local10).aShort27)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt6235 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt6235;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static139.anIntArray247[Static192.method3828(Static58.method1399(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Lclient!nr;IIII)Lclient!mi;")
	private static Class130 method3684(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class1_Sub21 local4 = (Class1_Sub21) aClass130_28.method3749(); local4 != null; local4 = (Class1_Sub21) aClass130_28.method3756()) {
			method3692(arg0, local4, arg1, arg2);
		}
		return aClass130_28;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt4282 = arg0 - anInt4281;
		anInt4279 = arg1 - anInt4283;
		anInt4285 = arg2 - anInt4281;
		anInt4280 = arg3 - anInt4283;
		anInt4286 = arg4;
		anInt4278 = arg5;
		anInt4276 = arg6;
		anInt4277 = arg7;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()V")
	public static void method3686() {
		aByteArray60 = null;
		aByteArray63 = null;
		aShortArray87 = null;
		aByteArray62 = null;
		aByteArray59 = null;
		aShortArray86 = null;
		aByteArray61 = null;
		aClass183_21 = null;
		aClass58ArrayArrayArray2 = null;
		anIntArray307 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!nr;II)V")
	public static void method3687(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub16 local9 = new Class1_Sub16(aClass162_148.method4642(aClass1_Sub1_Sub3_2.aString20, "area"));
		@Pc(13) int local13 = local9.method5761();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method5761();
		}
		@Pc(33) int local33 = local9.method5761();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method5761();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt6813 < local9.aByteArray86.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method5761() == 0) {
					local58 = local9.method5761();
					local62 = local9.method5761();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt4281;
							local84 = local62 * 64 + local67 - anInt4283;
							method3674(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method5761();
					local62 = local9.method5761();
					local64 = local9.method5761();
					local67 = local9.method5761();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt4281;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt4283;
							method3674(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray63 = new byte[anInt4275 * anInt4284];
			aShortArray87 = new short[anInt4275 * anInt4284];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt4275 * anInt4284];
				for (local64 = 0; local64 < aClass58ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass58ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class58 local205 = aClass58ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class2_Sub1 local212 = (Class2_Sub1) local205.method1672(); local212 != null; local212 = (Class2_Sub1) local205.method1675()) {
								local191[local64 * 64 + local212.aByte12 + (local67 * 64 + local212.aByte13) * anInt4275] = (byte) local212.anInt1194;
							}
						}
					}
				}
				method3690(local191, aByteArray63, aShortArray87, arg1, arg2);
				for (local67 = 0; local67 < aClass58ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass58ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class58 local276 = aClass58ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class2_Sub1 local283 = (Class2_Sub1) local276.method1672(); local283 != null; local283 = (Class2_Sub1) local276.method1675()) {
								local148 = local67 * 64 + local283.aByte12 + (local76 * 64 + local283.aByte13) * anInt4275;
								local283.anInt1194 = (aByteArray63[local148] & 0xFF) << 16 | aShortArray87[local148] & 0xFFFF;
								if (local283.anInt1194 != 0) {
									local283.anInt1194 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method3690(aByteArray60, aByteArray63, aShortArray87, arg1, arg2);
			aByteArray60 = null;
			method3688();
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "()V")
	private static void method3688() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(48) int local48;
		for (@Pc(1) int local1 = 0; local1 < anInt4275; local1++) {
			for (local4 = 0; local4 < anInt4284; local4++) {
				local15 = aShortArray86[local1 + local4 * anInt4275] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class1_Sub38 local31 = (Class1_Sub38) aClass183_21.method5053((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray108.length; local35++) {
								@Pc(45) Class189 local45 = Static83.method1840(local31.aShortArray108[local35] & 0xFFFF);
								local48 = local45.anInt6184;
								if (local45.anIntArray470 != null) {
									local45 = local45.method5210();
									if (local45 != null) {
										local48 = local45.anInt6184;
									}
								}
								if (local48 != -1) {
									@Pc(68) Class1_Sub21 local68 = new Class1_Sub21(local48);
									local68.anInt4150 = local1;
									local68.anInt4154 = local4;
									aClass130_28.method3760(local68);
								}
							}
						}
					} else {
						@Pc(91) Class189 local91 = Static83.method1840(local15 - 1);
						local35 = local91.anInt6184;
						if (local91.anIntArray470 != null) {
							local91 = local91.method5210();
							if (local91 != null) {
								local35 = local91.anInt6184;
							}
						}
						if (local35 != -1) {
							@Pc(114) Class1_Sub21 local114 = new Class1_Sub21(local35);
							local114.anInt4150 = local1;
							local114.anInt4154 = local4;
							aClass130_28.method3760(local114);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass58ArrayArrayArray2[0].length; local15++) {
				for (@Pc(140) int local140 = 0; local140 < aClass58ArrayArrayArray2[0][0].length; local140++) {
					@Pc(149) Class58 local149 = aClass58ArrayArrayArray2[local4][local15][local140];
					if (local149 != null) {
						for (@Pc(156) Class2_Sub1 local156 = (Class2_Sub1) local149.method1672(); local156 != null; local156 = (Class2_Sub1) local149.method1675()) {
							if (local156.aShortArray12 != null) {
								for (local48 = 0; local48 < local156.aShortArray12.length; local48++) {
									@Pc(172) Class189 local172 = Static83.method1840(local156.aShortArray12[local48] & 0xFFFF);
									@Pc(175) int local175 = local172.anInt6184;
									if (local172.anIntArray470 != null) {
										local172 = local172.method5210();
										if (local172 != null) {
											local175 = local172.anInt6184;
										}
									}
									if (local175 != -1) {
										@Pc(195) Class1_Sub21 local195 = new Class1_Sub21(local175);
										local195.anInt4150 = (local15 + (anInt4281 >> 6)) * 64 + local156.aByte12 - anInt4281;
										local195.anInt4154 = (local140 + (anInt4283 >> 6)) * 64 + local156.aByte13 - anInt4283;
										aClass130_28.method3760(local195);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)Lclient!as;")
	public static Class1_Sub1_Sub3 method3689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub1_Sub3 local4 = (Class1_Sub1_Sub3) aClass183_20.method5052(); local4 != null; local4 = (Class1_Sub1_Sub3) aClass183_20.method5050()) {
			if (local4.aBoolean40 && local4.method415(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([B[B[SII)V")
	private static void method3690(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt4284];
		@Pc(5) int[] local5 = new int[anInt4284];
		@Pc(8) int[] local8 = new int[anInt4284];
		@Pc(11) int[] local11 = new int[anInt4284];
		@Pc(14) int[] local14 = new int[anInt4284];
		for (@Pc(16) int local16 = -5; local16 < anInt4275; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt4284; local27++) {
				@Pc(49) Class119 local49;
				@Pc(85) int local85;
				if (local21 < anInt4275) {
					local41 = arg0[local21 + local27 * anInt4275] & 0xFF;
					if (local41 > 0) {
						local49 = Static293.method5171(local41 - 1);
						local2[local27] += local49.anInt4095;
						local5[local27] += local49.anInt4097;
						local8[local27] += local49.anInt4098;
						local11[local27] += local49.anInt4100;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt4275] & 0xFF;
					if (local41 > 0) {
						local49 = Static293.method5171(local41 - 1);
						local2[local27] -= local49.anInt4095;
						local5[local27] -= local49.anInt4097;
						local8[local27] -= local49.anInt4098;
						local11[local27] -= local49.anInt4100;
						local85 = local14[local27]--;
					}
				}
			}
			if (local16 >= 0) {
				local41 = 0;
				@Pc(157) int local157 = 0;
				@Pc(159) int local159 = 0;
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				for (@Pc(165) int local165 = -5; local165 < anInt4284; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt4284) {
						local41 += local2[local170];
						local157 += local5[local170];
						local159 += local8[local170];
						local161 += local11[local170];
						local163 += local14[local170];
					}
					@Pc(207) int local207 = local165 - 5;
					if (local207 >= 0) {
						local41 -= local2[local207];
						local157 -= local5[local207];
						local159 -= local8[local207];
						local161 -= local11[local207];
						local163 -= local14[local207];
					}
					if (local165 >= 0 && local163 > 0) {
						@Pc(259) int local259;
						if ((arg0[local16 + local165 * anInt4275] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt4275;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static283.method5058(local157 / local163, local159 / local163, local41 * 256 / local161);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt4275;
							@Pc(331) int local331 = Static139.anIntArray247[Static192.method3828(Static11.method6087(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "()V")
	public static void method3691() {
		aByteArray60 = new byte[anInt4275 * anInt4284];
		aByteArray62 = new byte[anInt4275 * anInt4284];
		aByteArray59 = new byte[anInt4275 * anInt4284];
		aShortArray86 = new short[anInt4275 * anInt4284];
		aByteArray61 = new byte[anInt4275 * anInt4284];
		aClass183_21 = new Class183(1024);
		aClass58ArrayArrayArray2 = new Class58[3][anInt4275 >> 6][anInt4284 >> 6];
		anIntArray307 = new int[Static186.anInt4355 + 1];
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!nr;Lclient!lo;IIII)V")
	private static void method3692(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class1_Sub21 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt4156 = anInt4286 + (arg2 * (arg1.anInt4150 - anInt4282) >> 16);
		arg1.anInt4157 = anInt4277 - (arg3 * (arg1.anInt4154 - anInt4280) >> 16);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method3693(@OriginalArg(0) int arg0) {
		aClass1_Sub1_Sub3_2 = (Class1_Sub1_Sub3) aClass183_20.method5053((long) arg0);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Lclient!as;")
	public static Class1_Sub1_Sub3 method3694(@OriginalArg(0) int arg0) {
		return (Class1_Sub1_Sub3) aClass183_20.method5053((long) arg0);
	}
}
