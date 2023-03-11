import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public class Class29 {

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "Lclient!vq;")
	private final Class241 aClass241_2;

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "Z")
	public final boolean aBoolean73;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
	protected final int anInt900;

	@OriginalMember(owner = "client!mo", name = "z", descriptor = "I")
	protected final int anInt911;

	@OriginalMember(owner = "client!mo", name = "A", descriptor = "I")
	public final int anInt912;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "Lclient!fl;")
	private final Class72 aClass72_2;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!mo", name = "w", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray9;

	static {
		new Class79(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(IIIZLclient!fl;Lclient!vq;)V")
	protected Class29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class72 arg4, @OriginalArg(5) Class241 arg5) {
		this.aClass241_2 = arg5;
		this.aBoolean73 = arg3;
		this.anInt900 = arg1;
		this.anInt911 = arg2;
		this.anInt912 = arg0;
		this.aClass72_2 = arg4;
		this.aByteArrayArrayArray7 = new byte[this.anInt912][this.anInt900][this.anInt911];
		this.aByteArrayArrayArray12 = new byte[this.anInt912][this.anInt900][this.anInt911];
		this.aByteArrayArrayArray8 = new byte[this.anInt912][this.anInt900][this.anInt911];
		this.anIntArrayArrayArray8 = new int[this.anInt912][this.anInt900 + 1][this.anInt911 + 1];
		this.aByteArrayArrayArray10 = new byte[this.anInt912][this.anInt900][this.anInt911];
		this.aByteArrayArrayArray9 = new byte[this.anInt912][this.anInt900 + 1][this.anInt911 + 1];
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B[[[I[Lclient!dg;Lclient!wm;)V")
	public final void method1085(@OriginalArg(1) int[][][] arg0, @OriginalArg(2) Class46[] arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean73) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt900; local10++) {
					for (local14 = 0; local14 < this.anInt911; local14++) {
						if ((Static359.aByteArrayArrayArray16[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static359.aByteArrayArrayArray16[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg1[local28].method1636(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt912; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean73) {
				if (Static105.aBoolean162) {
					local14 = 8;
				}
				if (Static246.aBoolean312) {
					local10 = 2;
				}
				if (Static174.anInt1300 != 0) {
					local10 |= 0x1;
					if (Static183.aBoolean8 | local6 == 0) {
						local14 |= 0x10;
					}
				}
			}
			if (Static246.aBoolean312) {
				local14 |= 0x7;
			}
			@Pc(151) int[][] local151 = arg0 == null || arg0.length <= local6 ? this.anIntArrayArrayArray8[local6] : arg0[local6];
			Static25.method858(local6, arg2.method2807(this.anInt900, this.anInt911, this.anIntArrayArrayArray8[local6], local151, local10, local14));
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!tf;[[ILclient!tf;Lclient!wm;IILclient!tf;)V")
	private void method1086(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class6 arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt900; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt911; local11++) {
				if (Static158.anInt2911 == -1 || Static142.method2661(local11, Static158.anInt2911, arg4, local7)) {
					@Pc(34) byte local34 = this.aByteArrayArrayArray12[arg4][local7][local11];
					@Pc(43) byte local43 = this.aByteArrayArrayArray7[arg4][local7][local11];
					@Pc(54) int local54 = this.aByteArrayArrayArray10[arg4][local7][local11] & 0xFF;
					@Pc(65) int local65 = this.aByteArrayArrayArray8[arg4][local7][local11] & 0xFF;
					@Pc(82) Class148 local82 = local54 == 0 ? null : this.aClass72_2.method2105(local54 - 1);
					@Pc(97) Class225 local97 = local65 == 0 ? null : this.aClass241_2.method6271(local65 - 1);
					@Pc(99) int local99 = 0;
					@Pc(101) int local101 = 0;
					if (local34 != 0) {
						local101 = local82 == null ? 0 : Static297.anIntArray383[local34];
						local99 = local97 == null ? 0 : Static74.anIntArray115[local34];
					} else if (local82 != null) {
						local101 = Static297.anIntArray383[local34];
					} else if (local97 != null) {
						local99 = Static297.anIntArray383[local34];
					}
					@Pc(139) int local139 = local99 + local101;
					@Pc(141) int local141 = 0;
					if (local139 != 0) {
						@Pc(146) int[] local146 = new int[local139];
						@Pc(149) int[] local149 = new int[local139];
						@Pc(152) int[] local152 = new int[local139];
						@Pc(155) int[] local155 = new int[local139];
						@Pc(157) boolean local157 = false;
						@Pc(181) int local181;
						@Pc(187) int local187;
						if (local82 == null || local82.anInt3769 == -1 && local82.anInt3757 == -1 && local82.anInt3762 == -1) {
							for (local181 = 0; local181 < local101; local181++) {
								local146[local141] = -1;
								local141++;
							}
						} else {
							local181 = arg3.method2871() ? local82.anInt3762 : local82.anInt3759;
							if (Static141.aBoolean190) {
								local181 = -1;
							}
							for (local187 = 0; local187 < local101; local187++) {
								local152[local141] = local181;
								local155[local141] = local82.anInt3763;
								if (local82.anInt3769 == -1) {
									local146[local141] = -1;
								} else {
									local146[local141] = local82.anInt3769;
								}
								if (local82.anInt3757 == -1) {
									local149[local141] = -1;
								} else {
									local157 = true;
									local149[local141] = local82.anInt3757;
								}
								local141++;
							}
							if (!this.aBoolean73 && arg4 == 0) {
								Static199.method5241(local7, local11, local82.anInt3771, local82.anInt3766 * 8, local82.anInt3764);
							}
						}
						if (!local157) {
							local149 = null;
						}
						if (local97 == null) {
							for (local181 = 0; local181 < local99; local181++) {
								local146[local141] = -1;
								local141++;
							}
						} else {
							local181 = local97.anInt6384;
							if (Static141.aBoolean190) {
								local181 = -1;
							}
							for (local187 = 0; local187 < local99; local187++) {
								local152[local141] = local181;
								local155[local141] = local97.anInt6377;
								local146[local141] = arg1[local7][local11];
								if (local149 != null) {
									local149[local141] = -1;
								}
								local141++;
							}
						}
						local181 = Static60.anIntArray35.length;
						@Pc(341) int[] local341 = new int[local181];
						@Pc(344) int[] local344 = new int[local181];
						@Pc(351) int[] local351 = arg0 == null ? null : new int[local181];
						@Pc(360) int[] local360 = arg0 == null && arg2 == null ? null : new int[local181];
						@Pc(368) int local368;
						@Pc(372) int local372;
						@Pc(454) int local454;
						@Pc(460) int local460;
						for (@Pc(362) int local362 = 0; local362 < local181; local362++) {
							local368 = Static60.anIntArray35[local362];
							local372 = Static375.anIntArray482[local362];
							if (local43 == 0) {
								local341[local362] = local368;
								local344[local362] = local372;
							} else if (local43 == 1) {
								local341[local362] = local372;
								local344[local362] = 128 - local368;
							} else if (local43 == 2) {
								local341[local362] = 128 - local368;
								local344[local362] = 128 - local372;
							} else if (local43 == 3) {
								local341[local362] = 128 - local372;
								local344[local362] = local368;
							}
							if (local351 != null && Static375.aBooleanArrayArray6[local34][local362]) {
								local454 = local368 + (local7 << 7);
								local460 = local368 + (local11 << 7);
								local351[local362] = arg0.method5728(local454, local460) - arg5.method5728(local454, local460);
							}
							if (local360 != null) {
								if (arg0 != null && !Static375.aBooleanArrayArray6[local34][local362]) {
									local454 = (local7 << 7) + local368;
									local460 = (local11 << 7) + local368;
									local360[local362] = arg5.method5728(local454, local460) - arg0.method5728(local454, local460);
								} else if (arg2 != null && !Static329.aBooleanArrayArray4[local34][local362]) {
									local454 = (local7 << 7) + local368;
									local460 = (local11 << 7) + local368;
									local360[local362] = arg2.method5728(local454, local460) - arg5.method5728(local454, local460);
								}
							}
						}
						local368 = arg5.method5719(local7, local11);
						local372 = arg5.method5719(local7 + 1, local11);
						local454 = arg5.method5719(local7 + 1, local11 - -1);
						local460 = arg5.method5719(local7, local11 + 1);
						if (arg4 > 0) {
							@Pc(583) boolean local583 = true;
							if (local65 == 0 && local34 != 0) {
								local583 = false;
							}
							if (local54 > 0 && local82 != null && !local82.aBoolean244) {
								local583 = false;
							}
							if (local583 && local368 == local372 && local454 == local368 && local460 == local368) {
								this.aByteArrayArrayArray9[arg4][local7][local11] = (byte) (this.aByteArrayArrayArray9[arg4][local7][local11] | 0x4);
							}
						}
						@Pc(636) int local636 = 0;
						@Pc(638) int local638 = 0;
						@Pc(640) int local640 = 0;
						if (this.aBoolean73) {
							local636 = Static357.method5987(local7, local11);
							local638 = Static168.method6476(local7, local11);
							local640 = Static51.method1548(local7, local11);
						}
						arg5.method5717(local7, local11, local341, local351, local344, local360, Static221.anIntArrayArray36[local34], Static118.anIntArrayArray25[local34], Static96.anIntArrayArray17[local34], local146, local149, local152, local155, local636, local638, local640);
						Static237.method4119(arg4, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I[Lclient!dg;ILclient!bt;III)V")
	public final void method1087(@OriginalArg(0) int arg0, @OriginalArg(1) Class46[] arg1, @OriginalArg(3) Buffer arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean73) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class46 local16 = arg1[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = arg0 + local18;
						@Pc(32) int local32 = local22 + arg3;
						if (local28 >= 0 && this.anInt900 > local28 && local32 >= 0 && local32 < this.anInt911) {
							local16.method1627(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg0 + arg5;
		@Pc(76) int local76 = arg4 + arg3;
		for (local18 = 0; local18 < this.anInt912; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method1089(local28 + arg3, local22 + local10, 0, false, arg0 + local22, local76 + local28, arg2, 0, local18, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIZIIZLclient!bt;III)V")
	private void method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Buffer arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg9 == 1) {
			arg2 = 1;
		} else if (arg9 == 2) {
			arg2 = 1;
			arg7 = 1;
		} else if (arg9 == 3) {
			arg7 = 1;
		}
		@Pc(69) int local69;
		if (arg4 < 0 || arg4 >= this.anInt900 || arg0 < 0 || this.anInt911 <= arg0) {
			while (true) {
				local69 = arg6.g1();
				if (local69 == 0) {
					return;
				}
				if (local69 == 1) {
					arg6.g1();
					return;
				}
				if (local69 <= 49) {
					arg6.g1();
				}
			}
		}
		if (!this.aBoolean73 && !arg3) {
			Static359.aByteArrayArrayArray16[arg8][arg4][arg0] = 0;
		}
		while (true) {
			local69 = arg6.g1();
			if (local69 == 0) {
				if (this.aBoolean73) {
					this.anIntArrayArrayArray8[0][arg7 + arg4][arg0 + arg2] = 0;
					return;
				} else if (arg8 == 0) {
					this.anIntArrayArrayArray8[0][arg4 + arg7][arg0 + arg2] = -Static7.method6466(arg1 + 932731, arg5 + 556238) * 8;
					return;
				} else {
					this.anIntArrayArrayArray8[arg8][arg7 + arg4][arg2 + arg0] = this.anIntArrayArrayArray8[arg8 - 1][arg4 + arg7][arg0 + arg2] - 240;
					return;
				}
			}
			if (local69 == 1) {
				@Pc(152) int local152 = arg6.g1();
				if (this.aBoolean73) {
					this.anIntArrayArrayArray8[0][arg7 + arg4][arg0 + arg2] = local152 * 8;
					return;
				}
				if (local152 == 1) {
					local152 = 0;
				}
				if (arg8 == 0) {
					this.anIntArrayArrayArray8[0][arg4 + arg7][arg0 + arg2] = -local152 * 8;
					return;
				}
				this.anIntArrayArrayArray8[arg8][arg7 + arg4][arg0 + arg2] = this.anIntArrayArrayArray8[arg8 - 1][arg4 + arg7][arg0 + arg2] - local152 * 8;
				return;
			}
			if (local69 <= 49) {
				if (arg3) {
					arg6.g1();
				} else {
					this.aByteArrayArrayArray10[arg8][arg4][arg0] = arg6.method4825();
					this.aByteArrayArrayArray12[arg8][arg4][arg0] = (byte) ((local69 - 2) / 4);
					this.aByteArrayArrayArray7[arg8][arg4][arg0] = (byte) (local69 + arg9 - 2 & 0x3);
				}
			} else if (local69 <= 81) {
				if (!this.aBoolean73 && !arg3) {
					Static359.aByteArrayArrayArray16[arg8][arg4][arg0] = (byte) (local69 - 49);
				}
			} else if (!arg3) {
				this.aByteArrayArrayArray8[arg8][arg4][arg0] = (byte) (local69 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILclient!bt;[Lclient!dg;IIIIII)V")
	public final void method1091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) Class46[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(50) int local50;
		if (!this.aBoolean73) {
			@Pc(18) Class46 local18 = arg3[arg8];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = Static148.method2711(local20 & 0x7, arg6, local24 & 0x7) + arg0;
					local50 = arg5 + Static235.method3344(local20 & 0x7, arg6, local24 & 0x7);
					if (local38 > 0 && this.anInt900 - 1 > local38 && local50 > 0 && local50 < this.anInt911 - 1) {
						local18.method1627(local38, local50);
					}
				}
			}
		}
		@Pc(101) int local101 = (arg1 & 0x7) * 8;
		@Pc(107) int local107 = (arg4 & 0x1FFFFFF8) << 3;
		local20 = (arg1 & 0xFFFFFFF8) << 3;
		@Pc(115) byte local115 = 0;
		@Pc(117) byte local117 = 0;
		if (arg6 == 1) {
			local117 = 1;
		} else if (arg6 == 2) {
			local115 = 1;
			local117 = 1;
		} else if (arg6 == 3) {
			local115 = 1;
		}
		for (local50 = 0; local50 < this.anInt912; local50++) {
			for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
				for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
					if (arg7 == local50 && local144 >= local11 && local11 + 8 >= local144 && local148 >= local101 && local148 <= local101 + 8) {
						@Pc(211) int local211;
						@Pc(224) int local224;
						if (local11 + 8 == local144 || local101 + 8 == local148) {
							if (arg6 == 0) {
								local224 = arg5 + local148 - local101;
								local211 = arg0 + local144 - local11;
							} else if (arg6 == 1) {
								local224 = local11 + arg5 + 8 - local144;
								local211 = arg0 + local148 - local101;
							} else if (arg6 == 2) {
								local211 = local11 + arg0 + 8 - local144;
								local224 = local101 + arg5 + 8 - local148;
							} else {
								local224 = local144 + arg5 - local11;
								local211 = local101 + arg0 + 8 - local148;
							}
							this.method1089(local224, local107 + local144, 0, true, local211, local148 + local20, arg2, 0, arg8, 0);
						} else {
							local211 = Static148.method2711(local144 & 0x7, arg6, local148 & 0x7) + arg0;
							local224 = arg5 + Static235.method3344(local144 & 0x7, arg6, local148 & 0x7);
							this.method1089(local224, local107 + local144, local117, false, local211, local20 + local148, arg2, local115, arg8, arg6);
							if (local144 == 63 || local148 == 63) {
								@Pc(258) int local258 = local144 == 63 ? 64 : local144;
								@Pc(265) int local265 = local148 == 63 ? 64 : local148;
								@Pc(292) int local292;
								@Pc(284) int local284;
								if (arg6 == 0) {
									local292 = local258 + arg0 - local11;
									local284 = arg5 + local265 - local101;
								} else if (arg6 == 1) {
									local292 = arg0 + local265 - local101;
									local284 = local11 + arg5 + 8 - local258;
								} else if (arg6 == 2) {
									local284 = local101 + arg5 + 8 - local265;
									local292 = local11 + arg0 + 8 - local258;
								} else {
									local284 = local258 + arg5 - local11;
									local292 = local101 + arg0 + 8 - local265;
								}
								if (local292 >= 0 && this.anInt900 > local292 && local284 >= 0 && local284 < this.anInt911) {
									this.anIntArrayArrayArray8[arg8][local292][local284] = this.anIntArrayArrayArray8[arg8][local211 + local115][local117 + local224];
								}
							}
						}
					} else {
						this.method1089(-1, 0, 0, false, -1, 0, arg2, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIBII)V")
	public final void method1092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg1; local3 < arg1 + arg0; local3++) {
			for (local7 = arg2; local7 < arg2 + arg3; local7++) {
				if (local7 >= 0 && this.anInt900 > local7 && local3 >= 0 && local3 < this.anInt911) {
					this.anIntArrayArrayArray8[arg4][local7][local3] = arg4 <= 0 ? 0 : this.anIntArrayArrayArray8[arg4 - 1][local7][local3] - 240;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt900) {
			for (local7 = arg1 + 1; local7 < arg0 + arg1; local7++) {
				if (local7 >= 0 && local7 < this.anInt911) {
					this.anIntArrayArrayArray8[arg4][arg2][local7] = this.anIntArrayArrayArray8[arg4][arg2 - 1][local7];
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt911) {
			for (@Pc(154) int local154 = arg2 + 1; local154 < arg3 + arg2; local154++) {
				if (local154 >= 0 && this.anInt900 > local154) {
					this.anIntArrayArrayArray8[arg4][local154][arg1] = this.anIntArrayArrayArray8[arg4][local154][arg1 - 1];
				}
			}
		}
		if (arg2 < 0 || arg1 < 0 || arg2 >= this.anInt900 || arg1 >= this.anInt911) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray8[arg4][arg2 - 1][arg1] != 0) {
				this.anIntArrayArrayArray8[arg4][arg2][arg1] = this.anIntArrayArrayArray8[arg4][arg2 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray8[arg4][arg2][arg1 - 1] != 0) {
				this.anIntArrayArrayArray8[arg4][arg2][arg1] = this.anIntArrayArrayArray8[arg4][arg2][arg1 - 1];
				return;
			}
			if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray8[arg4][arg2 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray8[arg4][arg2][arg1] = this.anIntArrayArrayArray8[arg4][arg2 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray8[arg4][arg2 - 1][arg1] != this.anIntArrayArrayArray8[arg4 - 1][arg2 - 1][arg1]) {
			this.anIntArrayArrayArray8[arg4][arg2][arg1] = this.anIntArrayArrayArray8[arg4][arg2 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray8[arg4 - 1][arg2][arg1 - 1] != this.anIntArrayArrayArray8[arg4][arg2][arg1 - 1]) {
			this.anIntArrayArrayArray8[arg4][arg2][arg1] = this.anIntArrayArrayArray8[arg4][arg2][arg1 - 1];
			return;
		}
		if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray8[arg4 - 1][arg2 - 1][arg1 - 1] != this.anIntArrayArrayArray8[arg4][arg2 - 1][arg1 - 1]) {
			this.anIntArrayArrayArray8[arg4][arg2][arg1] = this.anIntArrayArrayArray8[arg4][arg2 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!tf;ILclient!wm;Lclient!tf;)V")
	public final void method1093(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) Class6 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt900][this.anInt911];
		if (Static65.anIntArray110 == null || Static65.anIntArray110.length != this.anInt911) {
			Static375.anIntArray481 = new int[this.anInt911];
			Static65.anIntArray110 = new int[this.anInt911];
			Static322.anIntArray404 = new int[this.anInt911];
			Static274.anIntArray352 = new int[this.anInt911];
			Static332.anIntArray428 = new int[this.anInt911];
		}
		@Pc(60) int local60;
		for (@Pc(44) int local44 = 0; local44 < this.anInt912; local44++) {
			for (local60 = 0; local60 < this.anInt911; local60++) {
				Static65.anIntArray110[local60] = 0;
				Static274.anIntArray352[local60] = 0;
				Static322.anIntArray404[local60] = 0;
				Static375.anIntArray481[local60] = 0;
				Static332.anIntArray428[local60] = 0;
			}
			for (@Pc(89) int local89 = -5; local89 < this.anInt900; local89++) {
				@Pc(99) int local99;
				@Pc(118) int local118;
				@Pc(187) int local187;
				for (@Pc(93) int local93 = 0; local93 < this.anInt911; local93++) {
					local99 = local89 + 5;
					@Pc(164) int local164;
					if (this.anInt900 > local99) {
						local118 = this.aByteArrayArrayArray8[local44][local99][local93] & 0xFF;
						if (local118 > 0) {
							@Pc(128) Class225 local128 = this.aClass241_2.method6271(local118 - 1);
							Static65.anIntArray110[local93] += local128.anInt6378;
							Static274.anIntArray352[local93] += local128.anInt6379;
							Static322.anIntArray404[local93] += local128.anInt6381;
							Static375.anIntArray481[local93] += local128.anInt6372;
							local164 = Static332.anIntArray428[local93]++;
						}
					}
					local118 = local89 - 5;
					if (local118 >= 0) {
						local187 = this.aByteArrayArrayArray8[local44][local118][local93] & 0xFF;
						if (local187 > 0) {
							@Pc(199) Class225 local199 = this.aClass241_2.method6271(local187 - 1);
							Static65.anIntArray110[local93] -= local199.anInt6378;
							Static274.anIntArray352[local93] -= local199.anInt6379;
							Static322.anIntArray404[local93] -= local199.anInt6381;
							Static375.anIntArray481[local93] -= local199.anInt6372;
							local164 = Static332.anIntArray428[local93]--;
						}
					}
				}
				if (local89 >= 0) {
					local99 = 0;
					local118 = 0;
					local187 = 0;
					@Pc(256) int local256 = 0;
					@Pc(258) int local258 = 0;
					for (@Pc(260) int local260 = -5; local260 < this.anInt911; local260++) {
						@Pc(266) int local266 = local260 + 5;
						if (local266 < this.anInt911) {
							local99 += Static65.anIntArray110[local266];
							local256 += Static375.anIntArray481[local266];
							local187 += Static322.anIntArray404[local266];
							local258 += Static332.anIntArray428[local266];
							local118 += Static274.anIntArray352[local266];
						}
						@Pc(304) int local304 = local260 - 5;
						if (local304 >= 0) {
							local256 -= Static375.anIntArray481[local304];
							local187 -= Static322.anIntArray404[local304];
							local118 -= Static274.anIntArray352[local304];
							local258 -= Static332.anIntArray428[local304];
							local99 -= Static65.anIntArray110[local304];
						}
						if (local260 >= 0 && local256 > 0 && local258 > 0) {
							local11[local89][local260] = Static181.method3381(local99 * 256 / local256, local187 / local258, local118 / local258);
						}
					}
				}
			}
			if (Static132.aBoolean179) {
				this.method1099(local44, arg1, local44 == 0 ? arg2 : null, local44 == 0 ? arg0 : null, Static365.aClass6Array4[local44], local11);
			} else {
				this.method1086(local44 == 0 ? arg2 : null, local11, local44 == 0 ? arg0 : null, arg1, local44, Static365.aClass6Array4[local44]);
			}
			this.aByteArrayArrayArray8[local44] = null;
			this.aByteArrayArrayArray10[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray7[local44] = null;
		}
		if (!this.aBoolean73) {
			if (Static174.anInt1300 != 0) {
				Static93.method2003();
			}
			if (Static246.aBoolean312) {
				Static67.method1765();
			}
		}
		for (local60 = 0; local60 < this.anInt912; local60++) {
			Static365.aClass6Array4[local60].method5718();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!tq;Lclient!mg;II[[B[ZILclient!wm;III[[BI[[B)V")
	private void method1095(@OriginalArg(0) Class225 arg0, @OriginalArg(1) Class148 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class19 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(49) int local49;
		if (arg1 != null && arg0 != null || arg0 != null && arg6 == 12 || arg1 != null && arg6 == 0) {
			@Pc(30) boolean[] local30 = arg1 != null && arg1.aBoolean245 ? Static207.aBooleanArrayArray2[arg6] : Static283.aBooleanArrayArray3[arg6];
			@Pc(59) Class148 local59;
			@Pc(76) byte local76;
			@Pc(92) int local92;
			@Pc(99) int local99;
			if (arg2 > 0) {
				if (arg11 > 0) {
					local49 = arg12[arg11 - 1][arg2 - 1] & 0xFF;
					if (local49 > 0) {
						local59 = this.aClass72_2.method2105(local49 - 1);
						if (local59.anInt3769 != -1 && local59.aBoolean245) {
							local76 = arg4[arg11 - 1][arg2 - 1];
							local92 = arg10[arg11 - 1][arg2 - 1] * 2 + 4 & 0x7;
							local99 = Static78.method5699(arg7, local59);
							if (Static375.aBooleanArrayArray6[local76][local92]) {
								Static382.anIntArray490[0] = local59.anInt3769;
								Static319.anIntArray403[0] = local99;
								Static259.anIntArray323[0] = arg7.method2871() ? local59.anInt3762 : local59.anInt3759;
								Static11.anIntArray12[0] = local59.anInt3763;
								Static6.anIntArray4[0] = local59.anInt3772;
								Static82.anIntArray120[0] = 256;
							}
						}
					}
				}
				if (arg11 < arg8 - 1) {
					local49 = arg12[arg11 + 1][arg2 - 1] & 0xFF;
					if (local49 > 0) {
						local59 = this.aClass72_2.method2105(local49 - 1);
						if (local59.anInt3769 != -1 && local59.aBoolean245) {
							local76 = arg4[arg11 + 1][arg2 - 1];
							local92 = arg10[arg11 + 1][arg2 - 1] * 2 + 6 & 0x7;
							local99 = Static78.method5699(arg7, local59);
							if (Static375.aBooleanArrayArray6[local76][local92]) {
								Static382.anIntArray490[2] = local59.anInt3769;
								Static319.anIntArray403[2] = local99;
								Static259.anIntArray323[2] = arg7.method2871() ? local59.anInt3762 : local59.anInt3759;
								Static11.anIntArray12[2] = local59.anInt3763;
								Static6.anIntArray4[2] = local59.anInt3772;
								Static82.anIntArray120[2] = 512;
							}
						}
					}
				}
			}
			if (arg9 - 1 > arg2) {
				if (arg11 > 0) {
					local49 = arg12[arg11 - 1][arg2 + 1] & 0xFF;
					if (local49 > 0) {
						local59 = this.aClass72_2.method2105(local49 - 1);
						if (local59.anInt3769 != -1 && local59.aBoolean245) {
							local76 = arg4[arg11 - 1][arg2 + 1];
							local92 = arg10[arg11 - 1][arg2 + 1] * 2 + 2 & 0x7;
							local99 = Static78.method5699(arg7, local59);
							if (Static375.aBooleanArrayArray6[local76][local92]) {
								Static382.anIntArray490[6] = local59.anInt3769;
								Static319.anIntArray403[6] = local99;
								Static259.anIntArray323[6] = arg7.method2871() ? local59.anInt3762 : local59.anInt3759;
								Static11.anIntArray12[6] = local59.anInt3763;
								Static6.anIntArray4[6] = local59.anInt3772;
								Static82.anIntArray120[6] = 64;
							}
						}
					}
				}
				if (arg11 < arg8 - 1) {
					local49 = arg12[arg11 + 1][arg2 + 1] & 0xFF;
					if (local49 > 0) {
						local59 = this.aClass72_2.method2105(local49 - 1);
						if (local59.anInt3769 != -1 && local59.aBoolean245) {
							local76 = arg4[arg11 + 1][arg2 + 1];
							local92 = arg10[arg11 + 1][arg2 + 1] * 2 & 0x7;
							local99 = Static78.method5699(arg7, local59);
							if (Static375.aBooleanArrayArray6[local76][local92]) {
								Static382.anIntArray490[4] = local59.anInt3769;
								Static319.anIntArray403[4] = local99;
								Static259.anIntArray323[4] = arg7.method2871() ? local59.anInt3762 : local59.anInt3759;
								Static11.anIntArray12[4] = local59.anInt3763;
								Static6.anIntArray4[4] = local59.anInt3772;
								Static82.anIntArray120[4] = 128;
							}
						}
					}
				}
			}
			@Pc(523) int local523;
			@Pc(528) int local528;
			@Pc(530) int local530;
			@Pc(512) byte local512;
			if (arg2 > 0) {
				local49 = arg12[arg11][arg2 - 1] & 0xFF;
				if (local49 > 0) {
					local59 = this.aClass72_2.method2105(local49 - 1);
					if (local59.anInt3769 != -1) {
						local76 = arg4[arg11][arg2 - 1];
						local512 = arg10[arg11][arg2 - 1];
						if (local59.aBoolean245) {
							local99 = 2;
							local523 = local512 * 2 + 4;
							local528 = Static78.method5699(arg7, local59);
							for (local530 = 0; local530 < 3; local530++) {
								local99 &= 0x7;
								local523 &= 0x7;
								if (Static375.aBooleanArrayArray6[local76][local523] && local59.anInt3772 >= Static6.anIntArray4[local99]) {
									Static382.anIntArray490[local99] = local59.anInt3769;
									Static319.anIntArray403[local99] = local528;
									Static259.anIntArray323[local99] = arg7.method2871() ? local59.anInt3762 : local59.anInt3759;
									Static11.anIntArray12[local99] = local59.anInt3763;
									if (Static6.anIntArray4[local99] == local59.anInt3772) {
										Static82.anIntArray120[local99] |= 0x20;
									} else {
										Static82.anIntArray120[local99] = 32;
									}
									Static6.anIntArray4[local99] = local59.anInt3772;
								}
								local523++;
								local99--;
							}
							if (!local30[arg3 & 0x3]) {
								arg5[0] = Static207.aBooleanArrayArray2[local76][local512 + 2 & 0x3];
							}
						} else if (!local30[arg3 & 0x3]) {
							arg5[0] = Static283.aBooleanArrayArray3[local76][local512 + 2 & 0x3];
						}
					}
				}
			}
			if (arg2 < arg9 - 1) {
				local49 = arg12[arg11][arg2 + 1] & 0xFF;
				if (local49 > 0) {
					local59 = this.aClass72_2.method2105(local49 - 1);
					if (local59.anInt3769 != -1) {
						local76 = arg4[arg11][arg2 + 1];
						local512 = arg10[arg11][arg2 + 1];
						if (local59.aBoolean245) {
							local99 = 4;
							local523 = local512 * 2 + 2;
							local528 = Static78.method5699(arg7, local59);
							for (local530 = 0; local530 < 3; local530++) {
								local99 &= 0x7;
								local523 &= 0x7;
								if (Static375.aBooleanArrayArray6[local76][local523] && local59.anInt3772 >= Static6.anIntArray4[local99]) {
									Static382.anIntArray490[local99] = local59.anInt3769;
									Static319.anIntArray403[local99] = local528;
									Static259.anIntArray323[local99] = arg7.method2871() ? local59.anInt3762 : local59.anInt3759;
									Static11.anIntArray12[local99] = local59.anInt3763;
									if (local59.anInt3772 == Static6.anIntArray4[local99]) {
										Static82.anIntArray120[local99] |= 0x10;
									} else {
										Static82.anIntArray120[local99] = 16;
									}
									Static6.anIntArray4[local99] = local59.anInt3772;
								}
								local99++;
								local523--;
							}
							if (!local30[arg3 + 2 & 0x3]) {
								arg5[2] = Static207.aBooleanArrayArray2[local76][local512 & 0x3];
							}
						} else if (!local30[arg3 + 2 & 0x3]) {
							arg5[2] = Static283.aBooleanArrayArray3[local76][local512 & 0x3];
						}
					}
				}
			}
			if (arg11 > 0) {
				local49 = arg12[arg11 - 1][arg2] & 0xFF;
				if (local49 > 0) {
					local59 = this.aClass72_2.method2105(local49 - 1);
					if (local59.anInt3769 != -1) {
						local76 = arg4[arg11 - 1][arg2];
						local512 = arg10[arg11 - 1][arg2];
						if (local59.aBoolean245) {
							local99 = 6;
							local523 = local512 * 2 + 4;
							local528 = Static78.method5699(arg7, local59);
							for (local530 = 0; local530 < 3; local530++) {
								local523 &= 0x7;
								local99 &= 0x7;
								if (Static375.aBooleanArrayArray6[local76][local523] && Static6.anIntArray4[local99] <= local59.anInt3772) {
									Static382.anIntArray490[local99] = local59.anInt3769;
									Static319.anIntArray403[local99] = local528;
									Static259.anIntArray323[local99] = arg7.method2871() ? local59.anInt3762 : local59.anInt3759;
									Static11.anIntArray12[local99] = local59.anInt3763;
									if (Static6.anIntArray4[local99] == local59.anInt3772) {
										Static82.anIntArray120[local99] |= 0x8;
									} else {
										Static82.anIntArray120[local99] = 8;
									}
									Static6.anIntArray4[local99] = local59.anInt3772;
								}
								local523--;
								local99++;
							}
							if (!local30[arg3 + 3 & 0x3]) {
								arg5[3] = Static207.aBooleanArrayArray2[local76][local512 + 1 & 0x3];
							}
						} else if (!local30[arg3 + 3 & 0x3]) {
							arg5[3] = Static283.aBooleanArrayArray3[local76][local512 + 1 & 0x3];
						}
					}
				}
			}
			if (arg11 < arg8 - 1) {
				local49 = arg12[arg11 + 1][arg2] & 0xFF;
				if (local49 > 0) {
					local59 = this.aClass72_2.method2105(local49 - 1);
					if (local59.anInt3769 != -1) {
						local76 = arg4[arg11 + 1][arg2];
						local512 = arg10[arg11 + 1][arg2];
						if (local59.aBoolean245) {
							local99 = 4;
							local523 = local512 * 2 + 6;
							local528 = Static78.method5699(arg7, local59);
							for (local530 = 0; local530 < 3; local530++) {
								local99 &= 0x7;
								local523 &= 0x7;
								if (Static375.aBooleanArrayArray6[local76][local523] && local59.anInt3772 >= Static6.anIntArray4[local99]) {
									Static382.anIntArray490[local99] = local59.anInt3769;
									Static319.anIntArray403[local99] = local528;
									Static259.anIntArray323[local99] = arg7.method2871() ? local59.anInt3762 : local59.anInt3759;
									Static11.anIntArray12[local99] = local59.anInt3763;
									if (Static6.anIntArray4[local99] == local59.anInt3772) {
										Static82.anIntArray120[local99] |= 0x4;
									} else {
										Static82.anIntArray120[local99] = 4;
									}
									Static6.anIntArray4[local99] = local59.anInt3772;
								}
								local99--;
								local523++;
							}
							if (!local30[arg3 + 1 & 0x3]) {
								arg5[1] = Static207.aBooleanArrayArray2[local76][local512 + 3 & 0x3];
							}
						} else if (!local30[arg3 + 1 & 0x3]) {
							arg5[1] = Static283.aBooleanArrayArray3[local76][local512 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg1 == null) {
			return;
		}
		@Pc(1242) int local1242 = Static78.method5699(arg7, arg1);
		if (!arg1.aBoolean245) {
			return;
		}
		for (local49 = 0; local49 < 8; local49++) {
			@Pc(1257) int local1257 = local49 - arg3 * 2 & 0x7;
			if (Static375.aBooleanArrayArray6[arg6][local49] && arg1.anInt3772 >= Static6.anIntArray4[local1257]) {
				Static382.anIntArray490[local1257] = arg1.anInt3769;
				Static319.anIntArray403[local1257] = local1242;
				Static259.anIntArray323[local1257] = arg7.method2871() ? arg1.anInt3762 : arg1.anInt3759;
				Static11.anIntArray12[local1257] = arg1.anInt3763;
				if (Static6.anIntArray4[local1257] == arg1.anInt3772) {
					Static82.anIntArray120[local1257] |= 0x2;
				} else {
					Static82.anIntArray120[local1257] = 2;
				}
				Static6.anIntArray4[local1257] = arg1.anInt3772;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ[[I)V")
	public final void method1097(@OriginalArg(2) int[][] arg0) {
		@Pc(14) int[][] local14 = this.anIntArrayArrayArray8[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt900 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt911 + 1; local20++) {
				local14[local16][local20] += arg0[local16][local20];
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIBI)V")
	public final void method1098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt912; local3++) {
			this.method1092(64, arg0, arg1, 64, local3);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILclient!wm;Lclient!tf;Lclient!tf;Lclient!tf;[[I)V")
	private void method1099(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class6 arg3, @OriginalArg(5) Class6 arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(18) byte[][] local18 = this.aByteArrayArrayArray12[arg0];
		@Pc(23) byte[][] local23 = this.aByteArrayArrayArray7[arg0];
		@Pc(28) byte[][] local28 = this.aByteArrayArrayArray8[arg0];
		@Pc(33) byte[][] local33 = this.aByteArrayArrayArray10[arg0];
		for (@Pc(35) int local35 = 0; local35 < this.anInt900; local35++) {
			@Pc(49) int local49 = local35 >= this.anInt900 - 1 ? local35 : local35 + 1;
			for (@Pc(51) int local51 = 0; local51 < this.anInt911; local51++) {
				@Pc(65) int local65 = local51 >= this.anInt911 - 1 ? local51 : local51 + 1;
				if (Static158.anInt2911 == -1 || Static142.method2661(local51, Static158.anInt2911, arg0, local35)) {
					@Pc(79) boolean local79 = false;
					@Pc(81) boolean local81 = false;
					@Pc(84) boolean[] local84 = new boolean[4];
					@Pc(90) int local90 = local18[local35][local51];
					@Pc(96) int local96 = local23[local35][local51];
					@Pc(104) int local104 = local33[local35][local51] & 0xFF;
					@Pc(112) int local112 = local28[local35][local51] & 0xFF;
					@Pc(120) int local120 = local28[local35][local65] & 0xFF;
					@Pc(128) int local128 = local28[local49][local65] & 0xFF;
					@Pc(136) int local136 = local28[local49][local51] & 0xFF;
					if (local104 != 0 || local112 != 0) {
						@Pc(158) Class148 local158 = local104 == 0 ? null : this.aClass72_2.method2105(local104 - 1);
						if (local90 == 0 && local158 == null) {
							local90 = 12;
						}
						@Pc(179) Class225 local179 = local112 == 0 ? null : this.aClass241_2.method6271(local112 - 1);
						@Pc(181) Class148 local181 = local158;
						if (local158 != null) {
							if (local158.anInt3769 == -1 && local158.anInt3757 == -1) {
								local181 = local158;
								local158 = null;
							} else if (local179 != null && local90 != 0) {
								local81 = local158.aBoolean245;
							}
						}
						@Pc(275) int local275;
						@Pc(320) int local320;
						@Pc(370) int local370;
						@Pc(380) int local380;
						if ((local90 == 0 || local90 == 12) && local35 > 0 && local51 > 0 && this.anInt900 > local35 && this.anInt911 > local51) {
							@Pc(252) int local252 = local28[local49][local65] == local112 ? 1 : -1;
							local275 = local112 == local28[local35 - 1][local51 - 1] ? 1 : -1;
							@Pc(290) int local290 = local28[local49][local51 - 1] == local112 ? 1 : -1;
							if (local112 == local28[local35][local51 - 1]) {
								local275++;
								local290++;
							} else {
								local290--;
								local275--;
							}
							local320 = local28[local35 - 1][local65] == local112 ? 1 : -1;
							if (local112 == local28[local49][local51]) {
								local290++;
								local252++;
							} else {
								local252--;
								local290--;
							}
							if (local112 == local28[local35][local65]) {
								local320++;
								local252++;
							} else {
								local252--;
								local320--;
							}
							if (local28[local35 - 1][local51] == local112) {
								local320++;
								local275++;
							} else {
								local320--;
								local275--;
							}
							local370 = local275 - local252;
							if (local370 < 0) {
								local370 = -local370;
							}
							local380 = local290 - local320;
							if (local380 < 0) {
								local380 = -local380;
							}
							if (local370 == local380) {
								local370 = arg4.method5719(local35, local51) - arg4.method5719(local49, local65);
								if (local370 < 0) {
									local370 = -local370;
								}
								local380 = arg4.method5719(local49, local51) - arg4.method5719(local35, local65);
								if (local380 < 0) {
									local380 = -local380;
								}
							}
							local96 = local370 < local380 ? 1 : 0;
						}
						for (local275 = 0; local275 < 13; local275++) {
							Static6.anIntArray4[local275] = -1;
							Static82.anIntArray120[local275] = 1;
						}
						@Pc(462) boolean[] local462 = local158 != null && local158.aBoolean245 ? Static207.aBooleanArrayArray2[local90] : Static283.aBooleanArrayArray3[local90];
						this.method1095(local179, local158, local51, local96, local18, local84, local90, arg1, this.anInt900, this.anInt911, local23, local35, local33);
						@Pc(491) boolean local491 = local158 != null && local158.anInt3769 != local158.anInt3757;
						if (!local491) {
							for (local320 = 0; local320 < 8; local320++) {
								if (Static6.anIntArray4[local320] >= 0 && Static382.anIntArray490[local320] != Static319.anIntArray403[local320]) {
									local491 = true;
									break;
								}
							}
						}
						if (!local462[local96 + 1 & 0x3]) {
							local84[1] = Static152.method2764(local84[1], (Static82.anIntArray120[2] & Static82.anIntArray120[4]) == 0);
						}
						if (!local462[local96 + 3 & 0x3]) {
							local84[3] = Static152.method2764(local84[3], (Static82.anIntArray120[6] & Static82.anIntArray120[0]) == 0);
						}
						if (!local462[local96 & 0x3]) {
							local84[0] = Static152.method2764(local84[0], (Static82.anIntArray120[2] & Static82.anIntArray120[0]) == 0);
						}
						if (!local462[local96 + 2 & 0x3]) {
							local84[2] = Static152.method2764(local84[2], (Static82.anIntArray120[4] & Static82.anIntArray120[6]) == 0);
						}
						if (!local81 && (local90 == 0 || local90 == 12)) {
							if (local84[0] && !local84[1] && !local84[2] && local84[3]) {
								local84[0] = local84[3] = false;
								local96 = 0;
								local90 = local90 == 0 ? 13 : 14;
							} else if (local84[0] && local84[1] && !local84[2] && !local84[3]) {
								local96 = 3;
								local90 = local90 == 0 ? 13 : 14;
								local84[0] = local84[1] = false;
							} else if (!local84[0] && local84[1] && local84[2] && !local84[3]) {
								local84[1] = local84[2] = false;
								local90 = local90 == 0 ? 13 : 14;
								local96 = 2;
							} else if (!local84[0] && !local84[1] && local84[2] && local84[3]) {
								local96 = 1;
								local84[2] = local84[3] = false;
								local90 = local90 == 0 ? 13 : 14;
							}
						}
						@Pc(798) boolean local798 = !local81 && !local84[0] && !local84[2] && !local84[1] && !local84[3];
						@Pc(800) int[] local800 = null;
						@Pc(830) int[] local830;
						@Pc(826) int[] local826;
						@Pc(814) int[] local814;
						if (local798) {
							local380 = local158 == null ? 0 : Static297.anIntArray383[local90];
							local814 = Static96.anIntArrayArray17[local90];
							local370 = local179 == null ? 0 : Static74.anIntArray115[local90];
							local826 = Static118.anIntArrayArray25[local90];
							local830 = Static221.anIntArrayArray36[local90];
						} else if (local81) {
							local814 = Static67.anIntArrayArray15[local90];
							local370 = local179 == null ? 0 : Static54.anIntArray102[local90];
							local826 = Static342.anIntArrayArray48[local90];
							local800 = Static158.anIntArrayArray22[local90];
							local830 = Static361.anIntArrayArray59[local90];
							local380 = local158 == null ? 0 : Static96.anIntArray127[local90];
						} else {
							local830 = Static191.anIntArrayArray13[local90];
							local800 = Static286.anIntArrayArray45[local90];
							local370 = local179 == null ? 0 : Static161.anIntArray187[local90];
							local380 = local158 == null ? 0 : Static323.anIntArray407[local90];
							local814 = Static162.anIntArrayArray23[local90];
							local826 = Static285.anIntArrayArray44[local90];
						}
						@Pc(903) int local903 = local370 + local380;
						if (local903 <= 0) {
							Static237.method4119(arg0, local35, local51);
						} else {
							if (local84[0]) {
								local903++;
							}
							if (local84[2]) {
								local903++;
							}
							if (local84[1]) {
								local903++;
							}
							if (local84[3]) {
								local903++;
							}
							@Pc(933) int local933 = 0;
							@Pc(935) int local935 = 0;
							@Pc(939) int local939 = local903 * 3;
							@Pc(946) int[] local946 = local491 ? new int[local939] : null;
							@Pc(949) int[] local949 = new int[local939];
							@Pc(952) int[] local952 = new int[local939];
							@Pc(955) int[] local955 = new int[local939];
							@Pc(958) int[] local958 = new int[local939];
							@Pc(961) int[] local961 = new int[local939];
							@Pc(968) int[] local968 = arg2 == null ? null : new int[local939];
							@Pc(977) int[] local977 = arg2 == null && arg3 == null ? null : new int[local939];
							@Pc(979) int local979 = -1;
							@Pc(981) int local981 = -1;
							@Pc(983) int local983 = 256;
							@Pc(1134) byte local1134;
							@Pc(1033) int local1033;
							@Pc(1035) int local1035;
							@Pc(1267) int local1267;
							@Pc(1273) int local1273;
							@Pc(1282) int local1282;
							@Pc(1286) int local1286;
							@Pc(1302) int local1302;
							@Pc(1290) int local1290;
							@Pc(1300) int local1300;
							@Pc(1354) int local1354;
							@Pc(1360) int local1360;
							if (local158 != null) {
								local979 = local158.anInt3769;
								local981 = arg1.method2871() ? local158.anInt3762 : local158.anInt3759;
								local983 = local158.anInt3763;
								local1033 = Static78.method5699(arg1, local158);
								for (local1035 = 0; local1035 < local380; local1035++) {
									if (local84[-local96 & 0x3] && local800[0] == local933) {
										Static67.anIntArray111[0] = local830[local933];
										Static67.anIntArray111[1] = 1;
										Static67.anIntArray111[2] = local814[local933];
										Static67.anIntArray111[3] = 1;
										Static67.anIntArray111[4] = local826[local933];
										Static67.anIntArray111[5] = local814[local933];
										local1134 = 6;
									} else if (local84[2 - local96 & 0x3] && local933 == local800[2]) {
										Static67.anIntArray111[0] = local830[local933];
										Static67.anIntArray111[1] = 5;
										Static67.anIntArray111[2] = local814[local933];
										Static67.anIntArray111[3] = 5;
										Static67.anIntArray111[4] = local826[local933];
										Static67.anIntArray111[5] = local814[local933];
										local1134 = 6;
									} else if (local84[1 - local96 & 0x3] && local933 == local800[1]) {
										Static67.anIntArray111[0] = local830[local933];
										Static67.anIntArray111[1] = 3;
										Static67.anIntArray111[2] = local814[local933];
										Static67.anIntArray111[3] = 3;
										Static67.anIntArray111[4] = local826[local933];
										Static67.anIntArray111[5] = local814[local933];
										local1134 = 6;
									} else if (local84[3 - local96 & 0x3] && local800[3] == local933) {
										Static67.anIntArray111[0] = local830[local933];
										Static67.anIntArray111[1] = 7;
										Static67.anIntArray111[2] = local814[local933];
										Static67.anIntArray111[3] = 7;
										Static67.anIntArray111[4] = local826[local933];
										Static67.anIntArray111[5] = local814[local933];
										local1134 = 6;
									} else {
										Static67.anIntArray111[0] = local830[local933];
										Static67.anIntArray111[1] = local826[local933];
										Static67.anIntArray111[2] = local814[local933];
										local1134 = 3;
									}
									local933++;
									for (local1267 = 0; local1267 < local1134; local1267++) {
										local1273 = Static67.anIntArray111[local1267];
										local1282 = local1273 - local96 * 2 & 0x7;
										local1286 = Static60.anIntArray35[local1273];
										local1290 = Static375.anIntArray482[local1273];
										if (local96 == 1) {
											local1300 = 128 - local1286;
											local1302 = local1290;
										} else if (local96 == 2) {
											local1302 = 128 - local1286;
											local1300 = 128 - local1290;
										} else if (local96 == 3) {
											local1302 = 128 - local1290;
											local1300 = local1286;
										} else {
											local1300 = local1290;
											local1302 = local1286;
										}
										local949[local935] = local1302;
										local952[local935] = local1300;
										if (local968 != null && Static375.aBooleanArrayArray6[local90][local1273]) {
											local1354 = local1302 + (local35 << 7);
											local1360 = local1300 + (local51 << 7);
											local968[local935] = arg2.method5728(local1354, local1360) - arg4.method5728(local1354, local1360);
										}
										if (local977 != null) {
											if (arg2 != null && !Static375.aBooleanArrayArray6[local90][local1273]) {
												local1354 = local1302 + (local35 << 7);
												local1360 = local1300 + (local51 << 7);
												local977[local935] = arg4.method5728(local1354, local1360) - arg2.method5728(local1354, local1360);
											} else if (arg3 != null && !Static329.aBooleanArrayArray4[local90][local1273]) {
												local1354 = local1302 + (local35 << 7);
												local1360 = local1300 + (local51 << 7);
												local977[local935] = arg3.method5728(local1354, local1360) - arg4.method5728(local1354, local1360);
											}
										}
										if (local1273 < 8 && local158.anInt3772 < Static6.anIntArray4[local1282]) {
											if (local946 != null) {
												local946[local935] = Static319.anIntArray403[local1282];
											}
											local961[local935] = Static11.anIntArray12[local1282];
											local958[local935] = Static259.anIntArray323[local1282];
											local955[local935] = Static382.anIntArray490[local1282];
										} else {
											if (local946 != null) {
												local946[local935] = local1033;
											}
											local958[local935] = arg1.method2871() ? local158.anInt3762 : local158.anInt3759;
											local961[local935] = local158.anInt3763;
											local955[local935] = local979;
										}
										local935++;
									}
								}
								if (!this.aBoolean73 && arg0 == 0) {
									Static199.method5241(local35, local51, local158.anInt3771, local158.anInt3766 * 8, local158.anInt3764);
								}
								if (local90 != 12 && local158.anInt3769 != -1 && local158.aBoolean246) {
									local79 = true;
								}
							} else if (local798) {
								local933 = Static297.anIntArray383[local90];
							} else if (local81) {
								local933 = Static96.anIntArray127[local90];
							} else {
								local933 = Static323.anIntArray407[local90];
							}
							if (local179 != null) {
								if (local128 == 0) {
									local128 = local112;
								}
								if (local136 == 0) {
									local136 = local112;
								}
								if (local120 == 0) {
									local120 = local112;
								}
								@Pc(1581) Class225 local1581 = this.aClass241_2.method6271(local112 - 1);
								@Pc(1589) Class225 local1589 = this.aClass241_2.method6271(local120 - 1);
								@Pc(1597) Class225 local1597 = this.aClass241_2.method6271(local128 - 1);
								@Pc(1605) Class225 local1605 = this.aClass241_2.method6271(local136 - 1);
								for (local1282 = 0; local1282 < local370; local1282++) {
									if (local84[-local96 & 0x3] && local800[0] == local933) {
										Static67.anIntArray111[0] = local830[local933];
										Static67.anIntArray111[1] = 1;
										Static67.anIntArray111[2] = local814[local933];
										Static67.anIntArray111[3] = 1;
										Static67.anIntArray111[4] = local826[local933];
										Static67.anIntArray111[5] = local814[local933];
										local1134 = 6;
									} else if (local84[2 - local96 & 0x3] && local933 == local800[2]) {
										Static67.anIntArray111[0] = local830[local933];
										Static67.anIntArray111[1] = 5;
										Static67.anIntArray111[2] = local814[local933];
										Static67.anIntArray111[3] = 5;
										Static67.anIntArray111[4] = local826[local933];
										local1134 = 6;
										Static67.anIntArray111[5] = local814[local933];
									} else if (local84[1 - local96 & 0x3] && local933 == local800[1]) {
										Static67.anIntArray111[0] = local830[local933];
										Static67.anIntArray111[1] = 3;
										Static67.anIntArray111[2] = local814[local933];
										Static67.anIntArray111[3] = 3;
										Static67.anIntArray111[4] = local826[local933];
										Static67.anIntArray111[5] = local814[local933];
										local1134 = 6;
									} else if (local84[3 - local96 & 0x3] && local800[3] == local933) {
										Static67.anIntArray111[0] = local830[local933];
										Static67.anIntArray111[1] = 7;
										Static67.anIntArray111[2] = local814[local933];
										Static67.anIntArray111[3] = 7;
										Static67.anIntArray111[4] = local826[local933];
										Static67.anIntArray111[5] = local814[local933];
										local1134 = 6;
									} else {
										Static67.anIntArray111[0] = local830[local933];
										Static67.anIntArray111[1] = local826[local933];
										Static67.anIntArray111[2] = local814[local933];
										local1134 = 3;
									}
									local933++;
									for (local1286 = 0; local1286 < local1134; local1286++) {
										local1302 = Static67.anIntArray111[local1286];
										local1290 = local1302 - local96 * 2 & 0x7;
										local1300 = Static60.anIntArray35[local1302];
										local1360 = Static375.anIntArray482[local1302];
										@Pc(1875) int local1875;
										if (local96 == 1) {
											local1354 = local1360;
											local1875 = 128 - local1300;
										} else if (local96 == 2) {
											local1875 = 128 - local1360;
											local1354 = 128 - local1300;
										} else if (local96 == 3) {
											local1875 = local1300;
											local1354 = 128 - local1360;
										} else {
											local1354 = local1300;
											local1875 = local1360;
										}
										local949[local935] = local1354;
										local952[local935] = local1875;
										@Pc(1931) int local1931;
										@Pc(1938) int local1938;
										if (local968 != null && Static375.aBooleanArrayArray6[local90][local1302]) {
											local1931 = local1354 + (local35 << 7);
											local1938 = (local51 << 7) + local1875;
											local968[local935] = arg2.method5728(local1931, local1938) - arg4.method5728(local1931, local1938);
										}
										if (local977 != null) {
											if (arg2 != null && !Static375.aBooleanArrayArray6[local90][local1302]) {
												local1931 = (local35 << 7) + local1354;
												local1938 = (local51 << 7) + local1875;
												local977[local935] = arg4.method5728(local1931, local1938) - arg2.method5728(local1931, local1938);
											} else if (arg3 != null && !Static329.aBooleanArrayArray4[local90][local1302]) {
												local1931 = local1354 + (local35 << 7);
												local1938 = local1875 + (local51 << 7);
												local977[local935] = arg3.method5728(local1931, local1938) - arg4.method5728(local1931, local1938);
											}
										}
										if (local1302 < 8 && Static6.anIntArray4[local1290] >= 0) {
											if (local946 != null) {
												local946[local935] = Static319.anIntArray403[local1290];
											}
											local961[local935] = Static11.anIntArray12[local1290];
											local958[local935] = Static259.anIntArray323[local1290];
											local955[local935] = Static382.anIntArray490[local1290];
										} else {
											if (local81 && Static375.aBooleanArrayArray6[local90][local1302]) {
												local958[local935] = local981;
												local961[local935] = local983;
												local955[local935] = local979;
											} else if (local1354 == 0 && local1875 == 0) {
												local955[local935] = arg5[local35][local51];
												local958[local935] = local1581.anInt6384;
												local961[local935] = local1581.anInt6377;
											} else if (local1354 == 0 && local1875 == 128) {
												local955[local935] = arg5[local35][local65];
												local958[local935] = local1589.anInt6384;
												local961[local935] = local1589.anInt6377;
											} else if (local1354 == 128 && local1875 == 128) {
												local955[local935] = arg5[local49][local65];
												local958[local935] = local1597.anInt6384;
												local961[local935] = local1597.anInt6377;
											} else if (local1354 == 128 && local1875 == 0) {
												local955[local935] = arg5[local49][local51];
												local958[local935] = local1605.anInt6384;
												local961[local935] = local1605.anInt6377;
											} else {
												if (local1354 < 64) {
													if (local1875 < 64) {
														local958[local935] = local1581.anInt6384;
														local961[local935] = local1581.anInt6377;
													} else {
														local958[local935] = local1589.anInt6384;
														local961[local935] = local1589.anInt6377;
													}
												} else if (local1875 >= 64) {
													local958[local935] = local1597.anInt6384;
													local961[local935] = local1597.anInt6377;
												} else {
													local958[local935] = local1605.anInt6384;
													local961[local935] = local1605.anInt6377;
												}
												local1931 = Static289.method5020(local1354 << 7 >> 7, arg5[local49][local51], arg5[local35][local51]);
												local1938 = Static289.method5020(local1354 << 7 >> 7, arg5[local49][local65], arg5[local35][local65]);
												local955[local935] = Static289.method5020(local1875 << 7 >> 7, local1938, local1931);
											}
											if (local946 != null) {
												local946[local935] = local955[local935];
											}
										}
										local935++;
									}
								}
								if (local90 != 0 && local179.aBoolean430) {
									local79 = true;
								}
							}
							local1033 = arg4.method5719(local35, local51);
							local1035 = arg4.method5719(local49, local51);
							local1267 = arg4.method5719(local49, local65);
							local1273 = arg4.method5719(local35, local65);
							if (arg0 > 0) {
								@Pc(2351) boolean local2351 = true;
								if (local112 == 0 && local90 != 0) {
									local2351 = false;
								}
								if (local104 > 0 && local181 != null && !local181.aBoolean244) {
									local2351 = false;
								}
								if (local2351 && local1035 == local1033 && local1267 == local1033 && local1273 == local1033) {
									this.aByteArrayArrayArray9[arg0][local35][local51] = (byte) (this.aByteArrayArrayArray9[arg0][local35][local51] | 0x4);
								}
							}
							local1282 = 0;
							local1286 = 0;
							local1302 = 0;
							if (this.aBoolean73) {
								local1282 = Static357.method5987(local35, local51);
								local1286 = Static168.method6476(local35, local51);
								local1302 = Static51.method1548(local35, local51);
							}
							arg4.method5727(local35, local51, local949, local968, local952, local977, local955, local946, local958, local961, local1282, local1286, local1302, local79);
							Static237.method4119(arg0, local35, local51);
						}
					}
				}
			}
		}
	}
}
