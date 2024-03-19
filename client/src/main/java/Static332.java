import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!vi", name = "V", descriptor = "Lclient!nr;")
	public static Class40 aClass40_8;

	@OriginalMember(owner = "client!vi", name = "P", descriptor = "Lclient!cn;")
	public static Class35 aClass35_1 = new Class35();

	@OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
	public static int anInt6876 = 20;

	@OriginalMember(owner = "client!vi", name = "T", descriptor = "[J")
	public static final long[] aLongArray9 = new long[100];

	@OriginalMember(owner = "client!vi", name = "U", descriptor = "[I")
	public static final int[] anIntArray556 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!nr;ZBII[Lclient!bi;[BII)[I")
	public static int[] method5831(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class22[] arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (!arg2) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				@Pc(15) Class22 local15 = arg5[local9];
				for (local17 = 0; local17 < 64; local17++) {
					for (local21 = 0; local21 < 64; local21++) {
						local28 = arg0 + local17;
						local32 = arg8 + local21;
						if (local28 >= 0 && local28 < Static25.anInt850 && local32 >= 0 && local32 < Static219.anInt4987) {
							local15.method520(local28, local32);
						}
					}
				}
			}
		}
		@Pc(77) Class1_Sub16 local77 = new Class1_Sub16(arg6);
		@Pc(82) int local82 = arg3 + arg0;
		local17 = arg7 + arg8;
		for (local21 = 0; local21 < arg4; local21++) {
			for (local28 = 0; local28 < 64; local28++) {
				for (local32 = 0; local32 < 64; local32++) {
					Static304.method5335(arg2, local17 + local32, local28 + arg0, 0, false, local77, local21, 0, 0, arg8 + local32, local28 + local82);
				}
			}
		}
		@Pc(142) boolean local142 = false;
		@Pc(144) boolean local144 = false;
		@Pc(152) int local152;
		@Pc(175) int local175;
		@Pc(192) int local192;
		@Pc(196) int local196;
		@Pc(227) int local227;
		@Pc(198) int local198;
		while (local77.anInt6813 < local77.aByteArray86.length) {
			local152 = local77.method5761();
			if (local152 == 128) {
				Static102.anIntArray167[0] = local77.method5749();
				Static102.anIntArray167[1] = local77.method5762();
				Static102.anIntArray167[2] = local77.method5762();
				Static102.anIntArray167[3] = local77.method5762();
				Static102.anIntArray167[4] = local77.method5749();
				local142 = true;
			} else {
				if (local152 != 129) {
					local77.anInt6813--;
					break;
				}
				if (Static39.aByteArrayArrayArray2 == null) {
					Static39.aByteArrayArrayArray2 = new byte[4][][];
				}
				for (local175 = 0; local175 < 4; local175++) {
					@Pc(181) byte local181 = local77.method5772();
					if (local181 == 0 && Static39.aByteArrayArrayArray2[local175] != null) {
						local192 = arg0;
						local196 = arg0 + 64;
						local198 = arg8;
						if (arg8 < 0) {
							local198 = 0;
						} else if (arg8 >= Static219.anInt4987) {
							local198 = Static219.anInt4987;
						}
						if (local196 < 0) {
							local196 = 0;
						} else if (local196 >= Static25.anInt850) {
							local196 = Static25.anInt850;
						}
						local227 = arg8 + 64;
						if (arg0 < 0) {
							local192 = 0;
						} else if (Static25.anInt850 <= arg0) {
							local192 = Static25.anInt850;
						}
						if (local227 < 0) {
							local227 = 0;
						} else if (Static219.anInt4987 <= local227) {
							local227 = Static219.anInt4987;
						}
						while (local196 > local192) {
							while (local198 < local227) {
								Static39.aByteArrayArrayArray2[local175][local192][local198] = 0;
								local198++;
							}
							local192++;
						}
					} else if (local181 == 1) {
						if (Static39.aByteArrayArrayArray2[local175] == null) {
							Static39.aByteArrayArrayArray2[local175] = new byte[Static25.anInt850 + 1][Static219.anInt4987 + 1];
						}
						for (local192 = 0; local192 < 64; local192 += 4) {
							for (local196 = 0; local196 < 64; local196 += 4) {
								@Pc(433) byte local433 = local77.method5772();
								for (local227 = local192 + arg0; local227 < arg0 + local192 + 4; local227++) {
									for (@Pc(443) int local443 = arg8 + local196; local443 < local196 + arg8 + 4; local443++) {
										if (local227 >= 0 && Static25.anInt850 > local227 && local443 >= 0 && Static219.anInt4987 > local443) {
											Static39.aByteArrayArrayArray2[local175][local227][local443] = local433;
										}
									}
								}
							}
						}
					} else if (local181 == 2) {
						if (Static39.aByteArrayArrayArray2[local175] == null) {
							Static39.aByteArrayArrayArray2[local175] = new byte[Static25.anInt850 + 1][Static219.anInt4987 + 1];
						}
						if (local175 > 0) {
							local192 = arg0;
							local196 = arg0 + 64;
							local198 = arg8;
							if (arg0 < 0) {
								local192 = 0;
							} else if (arg0 >= Static25.anInt850) {
								local192 = Static25.anInt850;
							}
							if (local196 < 0) {
								local196 = 0;
							} else if (Static25.anInt850 <= local196) {
								local196 = Static25.anInt850;
							}
							if (arg8 < 0) {
								local198 = 0;
							} else if (arg8 >= Static219.anInt4987) {
								local198 = Static219.anInt4987;
							}
							local227 = arg8 + 64;
							if (local227 < 0) {
								local227 = 0;
							} else if (Static219.anInt4987 <= local227) {
								local227 = Static219.anInt4987;
							}
							while (local196 > local192) {
								while (local227 > local198) {
									Static39.aByteArrayArrayArray2[local175][local192][local198] = Static39.aByteArrayArrayArray2[local175 - 1][local192][local198];
									local198++;
								}
								local192++;
							}
						}
					}
				}
				local144 = true;
			}
		}
		@Pc(582) int local582;
		if (!arg2) {
			@Pc(556) Class157 local556 = null;
			while (true) {
				while (local77.aByteArray86.length > local77.anInt6813) {
					local175 = local77.method5761();
					if (local175 == 0) {
						local556 = new Class157(local77);
					} else if (local175 == 1) {
						local582 = local77.method5761();
						if (local582 > 0) {
							for (local192 = 0; local192 < local582; local192++) {
								@Pc(596) Class1_Sub9_Sub1 local596 = new Class1_Sub9_Sub1(local77);
								if (local596.anInt4598 == 31) {
									@Pc(610) Class105 local610 = Static127.method2888(local77.method5749());
									local596.method3960(local610.anInt3674, local610.anInt3677, local610.anInt3682, local610.anInt3683);
								}
								local596.anInt4576 += arg8 << 7;
								local596.anInt4580 += arg0 << 7;
								local198 = local596.anInt4580 >> 7;
								local227 = local596.anInt4576 >> 7;
								if (local198 >= 0 && local227 >= 0 && Static25.anInt850 > local198 && Static219.anInt4987 > local227) {
									local596.anInt4572 = Static220.anIntArrayArrayArray9[local596.anInt4587][local198][local227] - local596.anInt4572;
									if (arg1.method2709() > 0) {
										Static96.method2040(local596);
									}
								}
							}
						}
					} else if (local175 == 2) {
						if (local556 == null) {
							local556 = new Class157();
						}
						local556.method4520(local77);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local556 != null) {
					for (local175 = 0; local175 < 8; local175++) {
						for (local582 = 0; local582 < 8; local582++) {
							local192 = local175 + (arg0 >> 3);
							local196 = local582 + (arg8 >> 3);
							if (local192 >= 0 && local192 < Static25.anInt850 >> 3 && local196 >= 0 && Static219.anInt4987 >> 3 > local196) {
								Static138.method3055(local192, local196, local556);
							}
						}
					}
				}
				break;
			}
		}
		if (!local144 && Static39.aByteArrayArrayArray2 != null) {
			for (local152 = 0; local152 < 4; local152++) {
				if (Static39.aByteArrayArrayArray2[local152] != null) {
					for (local175 = 0; local175 < 16; local175++) {
						for (local582 = 0; local582 < 16; local582++) {
							local192 = (arg0 >> 2) + local175;
							local196 = (arg8 >> 2) + local582;
							if (local192 >= 0 && local192 < 26 && local196 >= 0 && local196 < 26) {
								Static39.aByteArrayArrayArray2[local152][local192][local196] = 0;
							}
						}
					}
				}
			}
		}
		if (local142) {
			return Static102.anIntArray167;
		} else {
			return null;
		}
	}
}
