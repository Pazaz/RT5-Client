import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	public static int anInt5141 = 0;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString181 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)Lclient!qr;")
	public static Class165 method4385(@OriginalArg(0) int arg0) {
		@Pc(5) Class215 local5 = Static223.aClass215_70;
		@Pc(14) Class165 local14;
		synchronized (Static223.aClass215_70) {
			local14 = (Class165) Static223.aClass215_70.method6057((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static1.aClass162_8.method4636(Static84.method1871(arg0), Static204.method4069(arg0));
		local14 = new Class165();
		local14.anInt5565 = arg0;
		if (local34 != null) {
			local14.method4755(new Class1_Sub16(local34));
		}
		local14.method4757();
		@Pc(60) Class215 local60 = Static223.aClass215_70;
		synchronized (Static223.aClass215_70) {
			Static223.aClass215_70.method6050(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method4387() {
		for (@Pc(10) Class2_Sub5 local10 = (Class2_Sub5) Static19.aClass58_1.method1674(); local10 != null; local10 = (Class2_Sub5) Static19.aClass58_1.method1674()) {
			Static39.method955(local10);
		}
		Static37.method936();
		Static37.method931();
		Static37.method922();
		Static37.method929();
		Static37.method933();
		Static37.method935();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!qj;I)Lclient!fi;")
	public static Class63 method4388(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1) {
		@Pc(15) byte[] local15 = arg1.method4630(arg0);
		return local15 == null ? null : new Class63(local15);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)Lclient!pd;")
	public static Class1_Sub1_Sub18 method4389(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub18 local10 = (Class1_Sub1_Sub18) Static143.aClass143_6.method4323((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static181.aClass162_149.method4636(arg0, 11);
		local10 = new Class1_Sub1_Sub18();
		if (local20 != null) {
			local10.method4381(new Class1_Sub16(local20));
		}
		Static143.aClass143_6.method4322(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
	public static void method4390() {
		Static79.method3956((long) Static197.anInt4521, Static221.aClass40_6);
		if (Static295.anInt6177 != -1) {
			Static219.method4285(Static295.anInt6177);
		}
		for (@Pc(23) int local23 = 0; local23 < Static266.anInt5654; local23++) {
			if (Static230.aBooleanArray16[local23]) {
				Static31.aBooleanArray2[local23] = true;
			}
			Static323.aBooleanArray26[local23] = Static230.aBooleanArray16[local23];
			Static230.aBooleanArray16[local23] = false;
		}
		Static234.anInt5226 = Static197.anInt4521;
		if (Static221.aClass40_6.method2767()) {
			Static38.aBoolean74 = true;
		}
		Static122.aClass177_8 = null;
		if (Static295.anInt6177 != -1) {
			Static266.anInt5654 = 0;
			Static68.method1589();
		}
		Static221.aClass40_6.method2788();
		Static50.method1357(Static77.anInt2093);
		Static55.anInt1622 = 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)V")
	public static void method4391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static250.aClass215_76 = new Class215(arg1);
		Static160.aClass215_100 = new Class215(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method4392() {
		Static47.anInt1523 = -1;
		Static268.anInt5668 = -1;
		Static286.anInt6044 = 0;
		Static30.anInt3905 = -1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZILclient!nr;BILclient!bi;IIIIIIZ)V")
	public static void method4394(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class22 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!Static13.method5497() && !Static58.method1400(arg7, arg9, arg6, Static331.anInt6843)) {
			return;
		}
		if (Static302.anInt6301 > arg6) {
			Static302.anInt6301 = arg6;
		}
		@Pc(29) Class189 local29 = Static83.method1840(arg1);
		if (Static130.anInt6754 == 1 && local29.aBoolean432) {
			return;
		}
		@Pc(52) int local52;
		@Pc(49) int local49;
		if (arg8 == 1 || arg8 == 3) {
			local52 = local29.anInt6173;
			local49 = local29.anInt6195;
		} else {
			local49 = local29.anInt6173;
			local52 = local29.anInt6195;
		}
		@Pc(78) int local78;
		@Pc(82) int local82;
		if (Static25.anInt850 < arg7 + local52) {
			local78 = arg7;
			local82 = arg7 + 1;
		} else {
			local78 = (local52 >> 1) + arg7;
			local82 = (local52 + 1 >> 1) + arg7;
		}
		@Pc(105) int local105;
		@Pc(109) int local109;
		if (Static219.anInt4987 < local49 + arg9) {
			local105 = arg9;
			local109 = arg9 + 1;
		} else {
			local109 = (local49 + 1 >> 1) + arg9;
			local105 = (local49 >> 1) + arg9;
		}
		@Pc(129) Class77 local129 = Static118.aClass77Array1[arg3];
		@Pc(152) int local152 = local129.method3986(local78, local105) + local129.method3986(local82, local105) + local129.method3986(local78, local109) + local129.method3986(local82, local109) >> 2;
		@Pc(160) int local160 = (arg7 << 7) + (local52 << 6);
		@Pc(169) int local169 = (arg9 << 7) + (local49 << 6);
		@Pc(180) boolean local180 = arg0 && !arg11 && local29.aBoolean433;
		if (local29.method5219()) {
			Static67.method143(null, arg8, arg9, null, arg6, local29, arg7);
		}
		@Pc(214) boolean local214 = arg10 == -1 && local29.anInt6208 == -1 && local29.anIntArray472 == null && local29.anIntArray470 == null && !local29.aBoolean430;
		if (Static150.aBoolean258 && local29.anInt6186 != 1) {
			return;
		}
		if (arg5 != 22) {
			@Pc(351) Class7_Sub1 local351;
			@Pc(314) Class7_Sub1_Sub5 local314;
			@Pc(347) int local347;
			@Pc(410) int local410;
			if (arg5 == 10 || arg5 == 11) {
				local314 = null;
				if (local214) {
					@Pc(343) Class7_Sub1_Sub5 local343 = new Class7_Sub1_Sub5(arg2, local29, arg6, arg3, local160, local152, local169, arg11, arg7, local52 + arg7 - 1, arg9, local49 + arg9 - 1, arg5, arg8, local180);
					local347 = local343.method4682();
					local314 = local343;
					local351 = local343;
				} else {
					local347 = 15;
					local351 = new Class7_Sub1_Sub3(arg2, local29, arg5, arg8, arg6, arg3, local160, local152, local169, arg11, arg7, arg7 + local52 - 1, arg9, arg9 + local49 - 1, arg10);
				}
				if (Static195.method3856(local351, false)) {
					if (local314 != null && local314.method5682()) {
						local314.method5685(arg2);
					}
					if (local29.aBoolean431 && arg0) {
						if (local347 > 30) {
							local347 = 30;
						}
						for (local410 = 0; local410 <= local52; local410++) {
							for (@Pc(414) int local414 = 0; local414 <= local49; local414++) {
								local129.method3989(arg7 + local410, local414 + arg9, local347);
							}
						}
					}
				}
				if (local29.anInt6187 != 0 && arg4 != null) {
					arg4.method507(local52, local29.aBoolean438, local49, arg7, arg9, !local29.aBoolean442);
				}
			} else if (arg5 >= 12 && arg5 <= 17 || arg5 >= 18 && arg5 <= 21) {
				if (local214) {
					local314 = new Class7_Sub1_Sub5(arg2, local29, arg6, arg3, local160, local152, local169, arg11, arg7, arg7 + local52 - 1, arg9, arg9 + local49 - 1, arg5, arg8, local180);
					local351 = local314;
					if (local314.method5682()) {
						local314.method5685(arg2);
					}
				} else {
					local351 = new Class7_Sub1_Sub3(arg2, local29, arg5, arg8, arg6, arg3, local160, local152, local169, arg11, arg7, local52 + arg7 - 1, arg9, arg9 + local49 - 1, arg10);
				}
				Static195.method3856(local351, false);
				if (arg0 && !arg11 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg6 > 0 && local29.anInt6186 != 0) {
					Static190.aByteArrayArrayArray15[arg6][arg7][arg9] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7][arg9] | 0x4);
				}
				if (local29.anInt6187 != 0 && arg4 != null) {
					arg4.method507(local52, local29.aBoolean438, local49, arg7, arg9, !local29.aBoolean442);
				}
			} else {
				@Pc(635) Class7_Sub2_Sub2 local635;
				@Pc(645) Class7_Sub2 local645;
				if (arg5 == 0) {
					if (local214) {
						local635 = new Class7_Sub2_Sub2(arg2, local29, arg3, local160, local152, local169, arg11, arg5, arg8, local180);
						if (local635.method5682()) {
							local635.method5685(arg2);
						}
						local645 = local635;
					} else {
						local645 = new Class7_Sub2_Sub1(arg2, local29, 0, arg8, arg6, arg3, local160, local152, local169, arg11, arg10);
					}
					Static100.method3998(arg6, arg7, arg9, local645, null);
					if (arg0) {
						if (arg8 == 0) {
							if (local29.aBoolean431) {
								local129.method3989(arg7, arg9, 50);
								local129.method3989(arg7, arg9 + 1, 50);
							}
							if (local29.anInt6186 == 1 && !arg11) {
								Static190.aByteArrayArrayArray15[arg6][arg7][arg9] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7][arg9] | 0x1);
							}
						} else if (arg8 == 1) {
							if (local29.aBoolean431) {
								local129.method3989(arg7, arg9 + 1, 50);
								local129.method3989(arg7 + 1, arg9 - -1, 50);
							}
							if (local29.anInt6186 == 1 && !arg11) {
								Static190.aByteArrayArrayArray15[arg6][arg7][arg9 + 1] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7][arg9 + 1] | 0x2);
							}
						} else if (arg8 == 2) {
							if (local29.aBoolean431) {
								local129.method3989(arg7 + 1, arg9, 50);
								local129.method3989(arg7 + 1, arg9 + 1, 50);
							}
							if (local29.anInt6186 == 1 && !arg11) {
								Static190.aByteArrayArrayArray15[arg6][arg7 + 1][arg9] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7 + 1][arg9] | 0x1);
							}
						} else if (arg8 == 3) {
							if (local29.aBoolean431) {
								local129.method3989(arg7, arg9, 50);
								local129.method3989(arg7 + 1, arg9, 50);
							}
							if (local29.anInt6186 == 1 && !arg11) {
								Static190.aByteArrayArrayArray15[arg6][arg7][arg9] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7][arg9] | 0x2);
							}
						}
					}
					if (local29.anInt6187 != 0 && arg4 != null) {
						arg4.method508(!local29.aBoolean442, local29.aBoolean438, arg7, arg8, arg5, arg9);
					}
					if (local29.anInt6175 != 16) {
						Static228.method4353(arg6, arg7, arg9, local29.anInt6175);
					}
				} else if (arg5 == 1) {
					if (local214) {
						local635 = new Class7_Sub2_Sub2(arg2, local29, arg3, local160, local152, local169, arg11, arg5, arg8, local180);
						if (local635.method5682()) {
							local635.method5685(arg2);
						}
						local645 = local635;
					} else {
						local645 = new Class7_Sub2_Sub1(arg2, local29, 1, arg8, arg6, arg3, local160, local152, local169, arg11, arg10);
					}
					Static100.method3998(arg6, arg7, arg9, local645, null);
					if (local29.aBoolean431 && arg0) {
						if (arg8 == 0) {
							local129.method3989(arg7, arg9 + 1, 50);
						} else if (arg8 == 1) {
							local129.method3989(arg7 + 1, arg9 - -1, 50);
						} else if (arg8 == 2) {
							local129.method3989(arg7 + 1, arg9, 50);
						} else if (arg8 == 3) {
							local129.method3989(arg7, arg9, 50);
						}
					}
					if (local29.anInt6187 != 0 && arg4 != null) {
						arg4.method508(!local29.aBoolean442, local29.aBoolean438, arg7, arg8, arg5, arg9);
					}
				} else if (arg5 == 2) {
					local347 = arg8 + 1 & 0x3;
					@Pc(1075) Class7_Sub2 local1075;
					if (local214) {
						@Pc(1049) Class7_Sub2_Sub2 local1049 = new Class7_Sub2_Sub2(arg2, local29, arg3, local160, local152, local169, arg11, arg5, arg8 + 4, local180);
						@Pc(1063) Class7_Sub2_Sub2 local1063 = new Class7_Sub2_Sub2(arg2, local29, arg3, local160, local152, local169, arg11, arg5, local347, local180);
						if (local1049.method5682()) {
							local1049.method5685(arg2);
						}
						local645 = local1049;
						local1075 = local1063;
						if (local1063.method5682()) {
							local1063.method5685(arg2);
						}
					} else {
						local645 = new Class7_Sub2_Sub1(arg2, local29, 2, arg8 + 4, arg6, arg3, local160, local152, local169, arg11, arg10);
						local1075 = new Class7_Sub2_Sub1(arg2, local29, 2, local347, arg6, arg3, local160, local152, local169, arg11, arg10);
					}
					Static100.method3998(arg6, arg7, arg9, local645, local1075);
					if (local29.anInt6186 == 1 && arg0 && !arg11) {
						if (arg8 == 0) {
							Static190.aByteArrayArrayArray15[arg6][arg7][arg9] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7][arg9] | 0x1);
							Static190.aByteArrayArrayArray15[arg6][arg7][arg9 + 1] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7][arg9 + 1] | 0x2);
						} else if (arg8 == 1) {
							Static190.aByteArrayArrayArray15[arg6][arg7][arg9 + 1] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7][arg9 + 1] | 0x2);
							Static190.aByteArrayArrayArray15[arg6][arg7 + 1][arg9] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7 + 1][arg9] | 0x1);
						} else if (arg8 == 2) {
							Static190.aByteArrayArrayArray15[arg6][arg7 + 1][arg9] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7 + 1][arg9] | 0x1);
							Static190.aByteArrayArrayArray15[arg6][arg7][arg9] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7][arg9] | 0x2);
						} else if (arg8 == 3) {
							Static190.aByteArrayArrayArray15[arg6][arg7][arg9] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7][arg9] | 0x2);
							Static190.aByteArrayArrayArray15[arg6][arg7][arg9] = (byte) (Static190.aByteArrayArrayArray15[arg6][arg7][arg9] | 0x1);
						}
					}
					if (local29.anInt6187 != 0 && arg4 != null) {
						arg4.method508(!local29.aBoolean442, local29.aBoolean438, arg7, arg8, arg5, arg9);
					}
					if (local29.anInt6175 != 16) {
						Static228.method4353(arg6, arg7, arg9, local29.anInt6175);
					}
				} else if (arg5 == 3) {
					if (local214) {
						local635 = new Class7_Sub2_Sub2(arg2, local29, arg3, local160, local152, local169, arg11, arg5, arg8, local180);
						if (local635.method5682()) {
							local635.method5685(arg2);
						}
						local645 = local635;
					} else {
						local645 = new Class7_Sub2_Sub1(arg2, local29, 3, arg8, arg6, arg3, local160, local152, local169, arg11, arg10);
					}
					Static100.method3998(arg6, arg7, arg9, local645, null);
					if (local29.aBoolean431 && arg0) {
						if (arg8 == 0) {
							local129.method3989(arg7, arg9 + 1, 50);
						} else if (arg8 == 1) {
							local129.method3989(arg7 + 1, arg9 + 1, 50);
						} else if (arg8 == 2) {
							local129.method3989(arg7 + 1, arg9, 50);
						} else if (arg8 == 3) {
							local129.method3989(arg7, arg9, 50);
						}
					}
					if (local29.anInt6187 != 0 && arg4 != null) {
						arg4.method508(!local29.aBoolean442, local29.aBoolean438, arg7, arg8, arg5, arg9);
					}
				} else if (arg5 == 9) {
					if (local214) {
						local314 = new Class7_Sub1_Sub5(arg2, local29, arg6, arg3, local160, local152, local169, arg11, arg7, arg7, arg9, arg9, arg5, arg8, local180);
						if (local314.method5682()) {
							local314.method5685(arg2);
						}
						local351 = local314;
					} else {
						local351 = new Class7_Sub1_Sub3(arg2, local29, arg5, arg8, arg6, arg3, local160, local152, local169, arg11, arg7, arg7 + local52 - 1, arg9, arg9 + local49 - 1, arg10);
					}
					Static195.method3856(local351, false);
					if (local29.anInt6187 != 0 && arg4 != null) {
						arg4.method507(local52, local29.aBoolean438, local49, arg7, arg9, !local29.aBoolean442);
					}
					if (local29.anInt6175 != 16) {
						Static228.method4353(arg6, arg7, arg9, local29.anInt6175);
					}
				} else {
					@Pc(1605) Class7_Sub3 local1605;
					if (arg5 == 4) {
						if (local214) {
							@Pc(1595) Class7_Sub3_Sub2 local1595 = new Class7_Sub3_Sub2(arg2, local29, arg3, local160, local152, local169, arg11, 0, 0, 0, arg5, arg8);
							if (local1595.method5682()) {
								local1595.method5685(arg2);
							}
							local1605 = local1595;
						} else {
							local1605 = new Class7_Sub3_Sub1(arg2, local29, arg5, arg8, arg6, arg3, local160, local152, local169, arg11, 0, 0, 0, arg10);
						}
						Static305.method5379(arg6, arg7, arg9, local1605, null);
					} else {
						@Pc(1637) int local1637;
						@Pc(1643) Interface6 local1643;
						@Pc(1678) Class7_Sub3_Sub2 local1678;
						if (arg5 == 5) {
							local1637 = 16;
							local1643 = (Interface6) Static56.method1394(arg6, arg7, arg9);
							if (local1643 != null) {
								local1637 = Static83.method1840(local1643.method5686()).anInt6175;
							}
							if (local214) {
								local1678 = new Class7_Sub3_Sub2(arg2, local29, arg3, local160, local152, local169, arg11, 0, local1637 * Static162.anIntArray278[arg8], Static354.anIntArray605[arg8] * local1637, arg5, arg8);
								if (local1678.method5682()) {
									local1678.method5685(arg2);
								}
								local1605 = local1678;
							} else {
								local1605 = new Class7_Sub3_Sub1(arg2, local29, arg5, arg8, arg6, arg3, local160, local152, local169, arg11, 0, local1637 * Static162.anIntArray278[arg8], Static354.anIntArray605[arg8] * local1637, arg10);
							}
							Static305.method5379(arg6, arg7, arg9, local1605, null);
						} else if (arg5 == 6) {
							local1637 = 8;
							local1643 = (Interface6) Static56.method1394(arg6, arg7, arg9);
							if (local1643 != null) {
								local1637 = Static83.method1840(local1643.method5686()).anInt6175 / 2;
							}
							if (local214) {
								local1678 = new Class7_Sub3_Sub2(arg2, local29, arg3, local160, local152, local169, arg11, arg8, local1637 * Static162.anIntArray278[arg8], local1637 * Static354.anIntArray605[arg8], arg5, arg8 + 4);
								if (local1678.method5682()) {
									local1678.method5685(arg2);
								}
								local1605 = local1678;
							} else {
								local1605 = new Class7_Sub3_Sub1(arg2, local29, arg5, arg8 + 4, arg6, arg3, local160, local152, local169, arg11, arg8, Static32.anIntArray573[arg8] * local1637, Static170.anIntArray286[arg8] * local1637, arg10);
							}
							Static305.method5379(arg6, arg7, arg9, local1605, null);
						} else if (arg5 == 7) {
							local1637 = arg8 + 2 & 0x3;
							if (local214) {
								@Pc(1879) Class7_Sub3_Sub2 local1879 = new Class7_Sub3_Sub2(arg2, local29, arg3, local160, local152, local169, arg11, local1637, 0, 0, arg5, local1637 + 4);
								if (local1879.method5682()) {
									local1879.method5685(arg2);
								}
								local1605 = local1879;
							} else {
								local1605 = new Class7_Sub3_Sub1(arg2, local29, arg5, local1637 + 4, arg6, arg3, local160, local152, local169, arg11, local1637, 0, 0, arg10);
							}
							Static305.method5379(arg6, arg7, arg9, local1605, null);
						} else if (arg5 == 8) {
							local347 = arg8 + 2 & 0x3;
							local410 = 8;
							@Pc(1913) Interface6 local1913 = (Interface6) Static56.method1394(arg6, arg7, arg9);
							if (local1913 != null) {
								local410 = Static83.method1840(local1913.method5686()).anInt6175 / 2;
							}
							@Pc(1954) Class7_Sub3 local1954;
							@Pc(1974) Class7_Sub3 local1974;
							if (local214) {
								local1954 = new Class7_Sub3_Sub2(arg2, local29, arg3, local160, local152, local169, arg11, arg8, local410 * Static32.anIntArray573[arg8], Static170.anIntArray286[arg8] * local410, arg5, arg8 + 4);
								local1974 = new Class7_Sub3_Sub2(arg2, local29, arg3, local160, local152, local169, arg11, arg8, 0, 0, arg5, local347 + 4);
								if (local1954.method5682()) {
									local1954.method5685(arg2);
								}
								if (local1974.method5682()) {
									local1974.method5685(arg2);
								}
							} else {
								local1954 = new Class7_Sub3_Sub1(arg2, local29, arg5, arg8 + 4, arg6, arg3, local160, local152, local169, arg11, arg8, local410 * Static32.anIntArray573[arg8], local410 * Static170.anIntArray286[arg8], arg10);
								local1974 = new Class7_Sub3_Sub1(arg2, local29, arg5, local347 + 4, arg6, arg3, local160, local152, local169, arg11, arg8, 0, 0, arg10);
							}
							Static305.method5379(arg6, arg7, arg9, local1954, local1974);
						}
					}
				}
			}
		} else if (Static218.aBoolean342 || local29.anInt6170 != 0 || local29.anInt6187 == 1 || local29.aBoolean429) {
			@Pc(259) Class7_Sub5 local259;
			if (local214) {
				@Pc(257) Class7_Sub5_Sub2 local257 = new Class7_Sub5_Sub2(arg2, local29, arg3, local160, local152, local169, arg11, arg8, local180);
				local259 = local257;
				if (local257.method5682()) {
					local257.method5685(arg2);
				}
			} else {
				local259 = new Class7_Sub5_Sub1(arg2, local29, arg8, arg6, arg3, local160, local152, local169, arg11, arg10);
			}
			Static248.method4599(arg6, arg7, arg9, local259);
			if (local29.anInt6187 == 1 && arg4 != null) {
				arg4.method522(arg7, arg9);
			}
		}
	}
}
