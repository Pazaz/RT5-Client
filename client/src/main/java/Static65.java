import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "Lclient!fl;")
	public static Interface4 anInterface4_2;

	@OriginalMember(owner = "client!eg", name = "S", descriptor = "[Lclient!kj;")
	public static final Class1_Sub1_Sub14[] aClass1_Sub1_Sub14Array1 = new Class1_Sub1_Sub14[14];

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([Lclient!bi;IZII[BIIIIILclient!nr;)[I")
	public static int[] method1532(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class40 arg10) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(17) int local17 = (arg7 & 0x7) * 8;
		@Pc(21) byte local21;
		if (arg2) {
			local21 = 1;
		} else {
			local21 = 4;
		}
		@Pc(33) int local33;
		@Pc(37) int local37;
		if (!arg2) {
			@Pc(31) Class22 local31 = arg0[arg8];
			for (local33 = 0; local33 < 8; local33++) {
				for (local37 = 0; local37 < 8; local37++) {
					@Pc(51) int local51 = Static308.method5419(arg6, local37 & 0x7, local33 & 0x7) + arg9;
					@Pc(63) int local63 = arg4 + Static98.method902(local37 & 0x7, local33 & 0x7, arg6);
					if (local51 > 0 && local51 < Static25.anInt850 - 1 && local63 > 0 && local63 < Static219.anInt4987 - 1) {
						local31.method520(local51, local63);
					}
				}
			}
		}
		@Pc(107) Class1_Sub16 local107 = new Class1_Sub16(arg5);
		local33 = (arg1 & 0xFFFFFFF8) << 3;
		local37 = (arg7 & 0xFFFFFFF8) << 3;
		@Pc(126) byte local126 = 0;
		@Pc(128) byte local128 = 0;
		if (arg6 == 1) {
			local128 = 1;
		} else if (arg6 == 2) {
			local126 = 1;
			local128 = 1;
		} else if (arg6 == 3) {
			local126 = 1;
		}
		@Pc(231) int local231;
		@Pc(224) int local224;
		@Pc(365) int local365;
		@Pc(372) int local372;
		@Pc(392) int local392;
		@Pc(384) int local384;
		for (@Pc(155) int local155 = 0; local155 < local21; local155++) {
			for (@Pc(159) int local159 = 0; local159 < 64; local159++) {
				for (@Pc(163) int local163 = 0; local163 < 64; local163++) {
					if (arg3 != local155 || local159 < local11 || local11 + 8 < local159 || local163 < local17 || local17 + 8 < local163) {
						Static304.method5335(arg2, 0, -1, 0, false, local107, 0, 0, 0, -1, 0);
					} else if (local159 == local11 + 8 || local163 == local17 + 8) {
						if (arg6 == 0) {
							local231 = arg9 + local159 - local11;
							local224 = local163 + arg4 - local17;
						} else if (arg6 == 1) {
							local224 = local11 + arg4 + 8 - local159;
							local231 = arg9 + local163 - local17;
						} else if (arg6 == 2) {
							local231 = local11 + arg9 + 8 - local159;
							local224 = local17 + arg4 + 8 - local163;
						} else {
							local231 = arg9 + local17 + 8 - local163;
							local224 = local159 + arg4 - local11;
						}
						Static304.method5335(arg2, local37 + local163, local231, 0, true, local107, arg8, 0, 0, local224, local159 + local33);
					} else {
						local231 = Static308.method5419(arg6, local163 & 0x7, local159 & 0x7) + arg9;
						local224 = arg4 + Static98.method902(local163 & 0x7, local159 & 0x7, arg6);
						Static304.method5335(arg2, local163 + local37, local231, arg6, false, local107, arg8, local128, local126, local224, local159 + local33);
						if (local159 == 63 || local163 == 63) {
							local365 = local159 == 63 ? 64 : local159;
							local372 = local163 == 63 ? 64 : local163;
							if (arg6 == 0) {
								local384 = arg4 + local372 - local17;
								local392 = local365 + arg9 - local11;
							} else if (arg6 == 1) {
								local384 = arg4 + local11 + 8 - local365;
								local392 = local372 + arg9 - local17;
							} else if (arg6 == 2) {
								local392 = local11 + arg9 + 8 - local365;
								local384 = arg4 + local17 + 8 - local372;
							} else {
								local384 = local365 + arg4 - local11;
								local392 = local17 + arg9 + 8 - local372;
							}
							if (local392 >= 0 && Static25.anInt850 > local392 && local384 >= 0 && local384 < Static219.anInt4987) {
								Static220.anIntArrayArrayArray9[arg8][local392][local384] = Static220.anIntArrayArrayArray9[arg8][local126 + local231][local224 + local128];
							}
						}
					}
				}
			}
		}
		@Pc(528) boolean local528 = false;
		@Pc(634) int local634;
		@Pc(638) int local638;
		@Pc(672) int local672;
		while (local107.anInt6813 < local107.aByteArray86.length) {
			local231 = local107.method5761();
			if (local231 == 128) {
				Static102.anIntArray167[0] = local107.method5749();
				Static102.anIntArray167[1] = local107.method5762();
				Static102.anIntArray167[2] = local107.method5762();
				Static102.anIntArray167[3] = local107.method5762();
				local528 = true;
				Static102.anIntArray167[4] = local107.method5749();
			} else {
				if (local231 != 129) {
					local107.anInt6813--;
					break;
				}
				if (Static39.aByteArrayArrayArray2 == null) {
					Static39.aByteArrayArrayArray2 = new byte[4][][];
				}
				for (local224 = 0; local224 < 4; local224++) {
					@Pc(589) byte local589 = local107.method5772();
					if (local589 == 0 && Static39.aByteArrayArrayArray2[arg8] != null) {
						if (arg3 >= local224) {
							local372 = arg9;
							local392 = arg9 + 7;
							local384 = arg4;
							if (arg4 < 0) {
								local384 = 0;
							} else if (arg4 >= Static219.anInt4987) {
								local384 = Static219.anInt4987;
							}
							local634 = arg4 + 7;
							if (local392 < 0) {
								local392 = 0;
							} else if (Static25.anInt850 <= local392) {
								local392 = Static25.anInt850;
							}
							if (arg9 < 0) {
								local372 = 0;
							} else if (Static25.anInt850 <= arg9) {
								local372 = Static25.anInt850;
							}
							if (local634 < 0) {
								local634 = 0;
							} else if (local634 >= Static219.anInt4987) {
								local634 = Static219.anInt4987;
							}
							while (local392 > local372) {
								while (local634 > local384) {
									Static39.aByteArrayArrayArray2[arg8][local372][local384] = 0;
									local384++;
								}
								local372++;
							}
						}
					} else if (local589 == 1) {
						if (Static39.aByteArrayArrayArray2[arg8] == null) {
							Static39.aByteArrayArrayArray2[arg8] = new byte[Static25.anInt850 + 1][Static219.anInt4987 + 1];
						}
						for (local372 = 0; local372 < 64; local372 += 4) {
							for (local392 = 0; local392 < 64; local392 += 4) {
								@Pc(629) byte local629 = local107.method5772();
								if (local224 <= arg3) {
									for (local634 = local372; local634 < local372 + 4; local634++) {
										for (local638 = local392; local638 < local392 + 4; local638++) {
											if (local11 <= local634 && local11 + 8 > local634 && local17 <= local638 && local17 + 8 > local17) {
												local672 = Static308.method5419(arg6, local638 & 0x7, local634 & 0x7) + arg9;
												@Pc(684) int local684 = Static98.method902(local638 & 0x7, local634 & 0x7, arg6) + arg4;
												if (local672 >= 0 && local672 < Static25.anInt850 && local684 >= 0 && Static219.anInt4987 > local684) {
													Static39.aByteArrayArrayArray2[arg8][local672][local684] = local629;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (!arg2) {
			@Pc(857) Class157 local857 = null;
			label279: while (true) {
				label272: do {
					while (true) {
						while (local107.aByteArray86.length > local107.anInt6813) {
							local224 = local107.method5761();
							if (local224 == 0) {
								local857 = new Class157(local107);
							} else {
								if (local224 == 1) {
									local365 = local107.method5761();
									continue label272;
								}
								if (local224 != 2) {
									throw new IllegalStateException();
								}
								if (local857 == null) {
									local857 = new Class157();
								}
								local857.method4520(local107);
							}
						}
						if (local857 != null) {
							Static138.method3055(arg9 >> 3, arg4 >> 3, local857);
						}
						break label279;
					}
				} while (local365 <= 0);
				for (local372 = 0; local372 < local365; local372++) {
					@Pc(882) Class1_Sub9_Sub1 local882 = new Class1_Sub9_Sub1(local107);
					if (local882.anInt4598 == 31) {
						@Pc(896) Class105 local896 = Static127.method2888(local107.method5749());
						local882.method3960(local896.anInt3674, local896.anInt3677, local896.anInt3682, local896.anInt3683);
					}
					local384 = local882.anInt4580 >> 7;
					local634 = local882.anInt4576 >> 7;
					if (local882.anInt4587 == arg3 && local11 <= local384 && local11 + 8 > local384 && local17 <= local634 && local17 + 8 > local634) {
						local638 = Static70.method1646(local882.anInt4580 & 0x3FF, local882.anInt4576 & 0x3FF, arg6) + (arg9 << 7);
						local672 = (arg4 << 7) + Static160.method6133(local882.anInt4580 & 0x3FF, local882.anInt4576 & 0x3FF, arg6);
						local882.anInt4576 = local672;
						local882.anInt4580 = local638;
						local384 = local882.anInt4580 >> 7;
						local634 = local882.anInt4576 >> 7;
						if (local384 >= 0 && local634 >= 0 && local384 < Static25.anInt850 && Static219.anInt4987 > local634) {
							local882.anInt4572 = Static220.anIntArrayArrayArray9[arg3][local384][local634] - local882.anInt4572;
							if (arg10.method2709() > 0) {
								Static96.method2040(local882);
							}
						}
					}
				}
			}
		}
		if (Static39.aByteArrayArrayArray2 != null && Static39.aByteArrayArrayArray2[arg8] != null) {
			local231 = arg9 + 7;
			local224 = arg4 + 7;
			for (local365 = arg9; local365 < local231; local365++) {
				for (local372 = arg4; local372 < local224; local372++) {
					Static39.aByteArrayArrayArray2[arg8][local365][local372] = 0;
				}
			}
		}
		if (local528) {
			return Static102.anIntArray167;
		} else {
			return null;
		}
	}
}
