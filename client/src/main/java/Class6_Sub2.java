import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
	private int anInt6321;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	private int anInt6322;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
	private int anInt6323;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "[[Lclient!cp;")
	private Class38[][] aClass38ArrayArray1;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "[[Lclient!re;")
	private Class201[][] aClass201ArrayArray1;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
	private int anInt6325;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
	private int anInt6326;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "[[Lclient!ce;")
	private Class34[][] aClass34ArrayArray1;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
	private int anInt6327;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
	private int anInt6328;

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
	private int anInt6329;

	@OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
	private int anInt6331;

	@OriginalMember(owner = "client!tn", name = "A", descriptor = "I")
	private int anInt6333;

	@OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
	private int anInt6334;

	@OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
	private int anInt6335;

	@OriginalMember(owner = "client!tn", name = "F", descriptor = "[[Lclient!le;")
	private Class136[][] aClass136ArrayArray1;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "Lclient!j;")
	private final Class19_Sub2 aClass19_Sub2_9;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	private final int anInt6324;

	@OriginalMember(owner = "client!tn", name = "D", descriptor = "[[I")
	public final int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
	private final int anInt6332;

	@OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
	private int anInt6330;

	@OriginalMember(owner = "client!tn", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!j;IIII[[I[[II)V")
	public Class6_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass19_Sub2_9 = arg0;
		this.anInt6324 = arg2;
		this.anIntArrayArray54 = arg5;
		this.anInt6332 = arg7;
		this.anInt6330 = 0;
		while (arg7 > 1) {
			this.anInt6330++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray20 = new byte[arg3 + 1][arg4 + 1];
		@Pc(47) int local47 = this.aClass19_Sub2_9.anInt2852 >> 9;
		for (@Pc(49) int local49 = 1; local49 < arg4; local49++) {
			for (@Pc(52) int local52 = 1; local52 < arg3; local52++) {
				@Pc(71) int local71 = arg6[local52 + 1][local49] - arg6[local52 - 1][local49];
				@Pc(87) int local87 = arg6[local52][local49 + 1] - arg6[local52][local49 - 1];
				@Pc(100) int local100 = (int) Math.sqrt((double) (local71 * local71 + local87 * local87 + 65536));
				@Pc(106) int local106 = (local71 << 8) / local100;
				@Pc(110) int local110 = -65536 / local100;
				@Pc(116) int local116 = (local87 << 8) / local100;
				@Pc(138) int local138 = local47 + (this.aClass19_Sub2_9.anInt2845 * local106 + this.aClass19_Sub2_9.anInt2840 * local110 + this.aClass19_Sub2_9.anInt2850 * local116 >> 17);
				local138 >>= 0x1;
				if (local138 < 2) {
					local138 = 2;
				} else if (local138 > 126) {
					local138 = 126;
				}
				this.aByteArrayArray20[local52][local49] = (byte) local138;
			}
		}
		this.aByteArrayArray19 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
	@Override
	public void method5723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray19[arg0][arg1] < arg2) {
			this.aByteArrayArray19[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "()V")
	@Override
	public void method5718() {
		this.aByteArrayArray20 = null;
		this.aByteArrayArray19 = null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIII[[ZLclient!gf;[I[I)V")
	private void method5733(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class81 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean168 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass38ArrayArray1[local22][local25] != null) {
						@Pc(50) Class38 local50 = this.aClass38ArrayArray1[local22][local25];
						if (local50.aShort11 != -1 && (local50.aByte5 & 0x2) == 0 && local50.anInt1252 == -1) {
							local69 = this.aClass19_Sub2_9.method2907(local50.aShort11);
							arg5.method2286(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static253.method4368(local69, local50.aShort15 & 0xFFFF), Static253.method4368(local69, local50.aShort12 & 0xFFFF), Static253.method4368(local69, local50.aShort14 & 0xFFFF));
							arg5.method2286(local20, local20, local20 - 4, local16, local16 + 4, local16, Static253.method4368(local69, local50.aShort13 & 0xFFFF), Static253.method4368(local69, local50.aShort14 & 0xFFFF), Static253.method4368(local69, local50.aShort12 & 0xFFFF));
						} else if (local50.anInt1252 == -1) {
							arg5.method2286(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort15 & 0xFFFF, local50.aShort12 & 0xFFFF, local50.aShort14 & 0xFFFF);
							arg5.method2286(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort13 & 0xFFFF, local50.aShort14 & 0xFFFF, local50.aShort12 & 0xFFFF);
						} else {
							local69 = local50.anInt1252;
							arg5.method2286(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method2286(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass34ArrayArray1[local22][local25] != null) {
						@Pc(249) Class34 local249 = this.aClass34ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort10; local69++) {
							arg6[local69] = local16 + (local249.anIntArray80[local69] - local22 * this.anInt6332) * 4 / this.anInt6332;
							arg7[local69] = local20 - (local249.anIntArray83[local69] - local25 * this.anInt6332) * 4 / this.anInt6332;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort9; local297++) {
							@Pc(303) short local303 = local249.aShortArray14[local297];
							@Pc(308) short local308 = local249.aShortArray15[local297];
							@Pc(313) short local313 = local249.aShortArray12[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray82 != null && local249.anIntArray82[local297] != -1) {
								local351 = local249.anIntArray82[local297];
								arg5.method2286(local329, local333, local337, local317, local321, local325, Static253.method4368(local351, local249.aShortArray16[local303]), Static253.method4368(local351, local249.aShortArray16[local308]), Static253.method4368(local351, local249.aShortArray16[local313]));
							} else if (local249.aShortArray13 == null || local249.aShortArray13[local297] == -1) {
								local351 = local249.anIntArray81[local297];
								arg5.method2286(local329, local333, local337, local317, local321, local325, Static253.method4368(local351, local249.aShortArray16[local303]), Static253.method4368(local351, local249.aShortArray16[local308]), Static253.method4368(local351, local249.aShortArray16[local313]));
							} else {
								local351 = this.aClass19_Sub2_9.method2907(local249.aShortArray13[local297]);
								arg5.method2286(local329, local333, local337, local317, local321, local325, Static253.method4368(local351, local249.aShortArray16[local303]), Static253.method4368(local351, local249.aShortArray16[local308]), Static253.method4368(local351, local249.aShortArray16[local313]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean168 = true;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(II)I")
	@Override
	public int method5728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt6330;
		@Pc(9) int local9 = arg1 >> this.anInt6330;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt6320 - 1 || local9 > super.anInt6319 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt6332 - 1;
		@Pc(41) int local41 = arg1 & this.anInt6332 - 1;
		@Pc(67) int local67 = this.anIntArrayArray54[local4][local9] * (this.anInt6332 - local34) + this.anIntArrayArray54[local4 + 1][local9] * local34 >> this.anInt6330;
		@Pc(97) int local97 = this.anIntArrayArray54[local4][local9 + 1] * (this.anInt6332 - local34) + this.anIntArrayArray54[local4 + 1][local9 + 1] * local34 >> this.anInt6330;
		return local67 * (this.anInt6332 - local41) + local97 * local41 >> this.anInt6330;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILclient!kb;)Lclient!kb;")
	@Override
	public Class2_Sub2_Sub4 method5730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub4 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)Z")
	private boolean method5734(@OriginalArg(0) int arg0) {
		if ((this.anInt6324 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)I")
	@Override
	public int method5719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray54[arg0][arg1];
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(Lclient!kb;IIIIZ)V")
	@Override
	public void method5725(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(Lclient!kb;IIIIZ)Z")
	@Override
	public boolean method5731(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V")
	@Override
	public void method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class250 local4 = this.aClass19_Sub2_9.method2905(Thread.currentThread());
		local4.aClass81_2.anInt2264 = 0;
		if (this.aClass201ArrayArray1 != null) {
			this.method5735(arg0, arg1, this.aClass19_Sub2_9.aBoolean199, local4.aClass81_2, local4.anIntArray508, local4.anIntArray516, local4.anIntArray504);
		} else if (this.aClass38ArrayArray1 != null) {
			this.method5736(arg0, arg1, local4.aClass81_2, local4.anIntArray508, local4.anIntArray516, local4.anIntArray504);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZLclient!gf;[I[I[I)V")
	private void method5735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class81 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class201 local6 = this.aClass201ArrayArray1[arg0][arg1];
		@Pc(29) int local29;
		@Pc(255) int local255;
		@Pc(311) int local311;
		@Pc(367) int local367;
		@Pc(423) int local423;
		@Pc(283) int local283;
		@Pc(339) int local339;
		@Pc(395) int local395;
		@Pc(451) int local451;
		@Pc(244) int local244;
		@Pc(300) int local300;
		@Pc(356) int local356;
		@Pc(412) int local412;
		@Pc(272) int local272;
		@Pc(328) int local328;
		@Pc(384) int local384;
		@Pc(440) int local440;
		@Pc(78) int local78;
		@Pc(101) int local101;
		@Pc(124) int local124;
		@Pc(147) int local147;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(163) int local163;
		@Pc(56) int local56;
		@Pc(61) int local61;
		@Pc(222) int local222;
		@Pc(227) int local227;
		@Pc(616) int local616;
		if (local6 == null) {
			@Pc(1426) Class136 local1426 = this.aClass136ArrayArray1[arg0][arg1];
			if (local1426 != null) {
				for (local423 = 0; local423 < local1426.aShort41; local423++) {
					@Pc(1436) short local1436 = local1426.aShortArray62[local423];
					local29 = local1426.aShortArray63[local423];
					@Pc(1446) short local1446 = local1426.aShortArray60[local423];
					local367 = this.anInt6326 + (this.anInt6321 * local1436 + this.anInt6335 * local29 + this.anInt6323 * local1446 >> 15);
					if (local367 <= this.aClass19_Sub2_9.anInt2843) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass19_Sub2_9.anInt2867;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1426.aShortArray61[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass19_Sub2_9.aBoolean198) {
						local283 = local367 - this.aClass19_Sub2_9.anInt2867;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt6329 + (this.anInt6333 * local1436 + this.anInt6328 * local29 + this.anInt6331 * local1446 >> 15);
					local311 = this.anInt6325 + (this.anInt6327 * local1436 + this.anInt6322 * local29 + this.anInt6334 * local1446 >> 15);
					arg4[local423] = arg3.anInt2266 + local255 * this.aClass19_Sub2_9.anInt2851 / local367;
					arg5[local423] = arg3.anInt2263 + local311 * this.aClass19_Sub2_9.anInt2841 / local367;
				}
				if (local1426.aShortArray59 != null) {
					local283 = this.anIntArrayArray54[arg0][arg1];
					local339 = this.anIntArrayArray54[arg0 + 1][arg1];
					local395 = this.anIntArrayArray54[arg0][arg1 + 1];
					local451 = arg0 * this.anInt6332;
					local244 = local451 + this.anInt6332;
					local300 = arg1 * this.anInt6332;
					local356 = local300 + this.anInt6332;
					local412 = this.anInt6329 + (this.anInt6333 * local451 + this.anInt6328 * local283 + this.anInt6331 * local300 >> 15);
					local272 = this.anInt6325 + (this.anInt6327 * local451 + this.anInt6322 * local283 + this.anInt6334 * local300 >> 15);
					local328 = this.anInt6326 + (this.anInt6321 * local451 + this.anInt6335 * local283 + this.anInt6323 * local300 >> 15);
					local384 = this.anInt6329 + (this.anInt6333 * local244 + this.anInt6328 * local339 + this.anInt6331 * local300 >> 15);
					local440 = this.anInt6325 + (this.anInt6327 * local244 + this.anInt6322 * local339 + this.anInt6334 * local300 >> 15);
					local78 = this.anInt6326 + (this.anInt6321 * local244 + this.anInt6335 * local339 + this.anInt6323 * local300 >> 15);
					local101 = this.anInt6329 + (this.anInt6333 * local451 + this.anInt6328 * local395 + this.anInt6331 * local356 >> 15);
					local124 = this.anInt6325 + (this.anInt6327 * local451 + this.anInt6322 * local395 + this.anInt6334 * local356 >> 15);
					local147 = this.anInt6326 + (this.anInt6321 * local451 + this.anInt6335 * local395 + this.anInt6323 * local356 >> 15);
					for (local36 = 0; local36 < local1426.aShort42; local36++) {
						local38 = local36 * 3;
						local40 = local38 + 1;
						local42 = local40 + 1;
						local163 = arg4[local38];
						local56 = arg4[local40];
						local61 = arg4[local42];
						local222 = arg5[local38];
						local227 = arg5[local40];
						local616 = arg5[local42];
						@Pc(1886) int local1886 = arg6[local38] + arg6[local40] + arg6[local42];
						if ((local163 - local56) * (local616 - local227) - (local222 - local227) * (local61 - local56) > 0) {
							arg3.aBoolean169 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt2265 || local56 > arg3.anInt2265 || local61 > arg3.anInt2265;
							@Pc(1930) short local1930 = local1426.aShortArray59[local36];
							if (local1886 < 765) {
								if (local1930 != -1 && this.method5734(this.aClass19_Sub2_9.anInterface2_5.method2658(local1930).aByte67)) {
									arg3.anInt2264 = 100;
								}
								if (local1886 > 0) {
									if (local1930 != -1) {
										arg3.method2280(local222, local227, local616, local163, local56, local61, this.aClass19_Sub2_9.anInt2853, arg6[local38], arg6[local40], arg6[local42], local1426.anIntArray209[local38], local1426.anIntArray209[local40], local1426.anIntArray209[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1930);
									} else if ((local1426.anIntArray209[local38] & 0xFFFFFF) != 0) {
										arg3.method2289(local222, local227, local616, local163, local56, local61, Static231.method4024(local1426.anIntArray209[local38], arg6[local38] << 24 | this.aClass19_Sub2_9.anInt2853), Static231.method4024(local1426.anIntArray209[local40], arg6[local40] << 24 | this.aClass19_Sub2_9.anInt2853), Static231.method4024(local1426.anIntArray209[local42], arg6[local42] << 24 | this.aClass19_Sub2_9.anInt2853));
									}
								} else if (local1930 != -1) {
									arg3.method2290(local222, local227, local616, local163, local56, local61, local1426.anIntArray209[local38], local1426.anIntArray209[local40], local1426.anIntArray209[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1930);
								} else if ((local1426.anIntArray209[local38] & 0xFFFFFF) != 0) {
									arg3.method2289(local222, local227, local616, local163, local56, local61, local1426.anIntArray209[local38], local1426.anIntArray209[local40], local1426.anIntArray209[local42]);
								}
								arg3.anInt2264 = 0;
							} else {
								arg3.method2282(local222, local227, local616, local163, local56, local61, this.aClass19_Sub2_9.anInt2853);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1426.aShort42; local283++) {
					local339 = local283 * 3;
					local395 = local339 + 1;
					local451 = local395 + 1;
					local244 = arg4[local339];
					local300 = arg4[local395];
					local356 = arg4[local451];
					local412 = arg5[local339];
					local272 = arg5[local395];
					local328 = arg5[local451];
					local384 = arg6[local339] + arg6[local395] + arg6[local451];
					if ((local244 - local300) * (local328 - local272) - (local412 - local272) * (local356 - local300) > 0) {
						arg3.aBoolean169 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt2265 || local300 > arg3.anInt2265 || local356 > arg3.anInt2265;
						if (local384 >= 765) {
							arg3.method2282(local412, local272, local328, local244, local300, local356, this.aClass19_Sub2_9.anInt2853);
						} else if (local384 > 0) {
							if ((local1426.anIntArray209[local339] & 0xFFFFFF) != 0) {
								arg3.method2289(local412, local272, local328, local244, local300, local356, Static263.method4467(arg6[local339], this.aClass19_Sub2_9.anInt2853, local1426.anIntArray209[local339]), Static263.method4467(arg6[local395], this.aClass19_Sub2_9.anInt2853, local1426.anIntArray209[local395]), Static263.method4467(arg6[local451], this.aClass19_Sub2_9.anInt2853, local1426.anIntArray209[local451]));
							}
						} else if ((local1426.anIntArray209[local339] & 0xFFFFFF) != 0) {
							arg3.method2289(local412, local272, local328, local244, local300, local356, local1426.anIntArray209[local339], local1426.anIntArray209[local395], local1426.anIntArray209[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte60 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt6332;
			@Pc(24) int local24 = local19 + this.anInt6332;
			local29 = arg1 * this.anInt6332;
			@Pc(34) int local34 = local29 + this.anInt6332;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte60 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray54[arg0][arg1];
				local61 = this.anIntArrayArray54[arg0 + 1][arg1];
				local222 = this.anIntArrayArray54[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray54[arg0][arg1 + 1];
				local78 = this.anInt6326 + (this.anInt6321 * local19 + this.anInt6335 * local56 + this.anInt6323 * local29 >> 15);
				if (local78 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local101 = this.anInt6326 + (this.anInt6321 * local24 + this.anInt6335 * local61 + this.anInt6323 * local29 >> 15);
				if (local101 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local124 = this.anInt6326 + (this.anInt6321 * local24 + this.anInt6335 * local222 + this.anInt6323 * local34 >> 15);
				if (local124 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local147 = this.anInt6326 + (this.anInt6321 * local19 + this.anInt6335 * local227 + this.anInt6323 * local34 >> 15);
				if (local147 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass19_Sub2_9.anInt2867;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local616 = local6.aShort83 * local163 / 255;
						if (local616 > 0) {
							local56 -= local616;
						}
					}
					local163 = local101 - this.aClass19_Sub2_9.anInt2867;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local616 = local6.aShort82 * local163 / 255;
						if (local616 > 0) {
							local61 -= local616;
						}
					}
					local163 = local124 - this.aClass19_Sub2_9.anInt2867;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local616 = local6.aShort81 * local163 / 255;
						if (local616 > 0) {
							local222 -= local616;
						}
					}
					local163 = local147 - this.aClass19_Sub2_9.anInt2867;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local616 = local6.aShort85 * local163 / 255;
						if (local616 > 0) {
							local227 -= local616;
						}
					}
				} else if (this.aClass19_Sub2_9.aBoolean198) {
					local163 = local78 - this.aClass19_Sub2_9.anInt2867;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass19_Sub2_9.anInt2867;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass19_Sub2_9.anInt2867;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass19_Sub2_9.anInt2867;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt6329 + (this.anInt6333 * local19 + this.anInt6328 * local56 + this.anInt6331 * local29 >> 15);
				local255 = arg3.anInt2266 + local244 * this.aClass19_Sub2_9.anInt2851 / local78;
				local272 = this.anInt6325 + (this.anInt6327 * local19 + this.anInt6322 * local56 + this.anInt6334 * local29 >> 15);
				local283 = arg3.anInt2263 + local272 * this.aClass19_Sub2_9.anInt2841 / local78;
				local300 = this.anInt6329 + (this.anInt6333 * local24 + this.anInt6328 * local61 + this.anInt6331 * local29 >> 15);
				local311 = arg3.anInt2266 + local300 * this.aClass19_Sub2_9.anInt2851 / local101;
				local328 = this.anInt6325 + (this.anInt6327 * local24 + this.anInt6322 * local61 + this.anInt6334 * local29 >> 15);
				local339 = arg3.anInt2263 + local328 * this.aClass19_Sub2_9.anInt2841 / local101;
				local356 = this.anInt6329 + (this.anInt6333 * local24 + this.anInt6328 * local222 + this.anInt6331 * local34 >> 15);
				local367 = arg3.anInt2266 + local356 * this.aClass19_Sub2_9.anInt2851 / local124;
				local384 = this.anInt6325 + (this.anInt6327 * local24 + this.anInt6322 * local222 + this.anInt6334 * local34 >> 15);
				local395 = arg3.anInt2263 + local384 * this.aClass19_Sub2_9.anInt2841 / local124;
				local412 = this.anInt6329 + (this.anInt6333 * local19 + this.anInt6328 * local227 + this.anInt6331 * local34 >> 15);
				local423 = arg3.anInt2266 + local412 * this.aClass19_Sub2_9.anInt2851 / local147;
				local440 = this.anInt6325 + (this.anInt6327 * local19 + this.anInt6322 * local227 + this.anInt6334 * local34 >> 15);
				local451 = arg3.anInt2263 + local440 * this.aClass19_Sub2_9.anInt2841 / local147;
			} else {
				local56 = this.anIntArrayArray54[arg0][arg1];
				local61 = this.anInt6335 * local56;
				local78 = this.anInt6326 + (this.anInt6321 * local19 + local61 + this.anInt6323 * local29 >> 15);
				if (local78 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local101 = this.anInt6326 + (this.anInt6321 * local24 + local61 + this.anInt6323 * local29 >> 15);
				if (local101 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local124 = this.anInt6326 + (this.anInt6321 * local24 + local61 + this.anInt6323 * local34 >> 15);
				if (local124 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local147 = this.anInt6326 + (this.anInt6321 * local19 + local61 + this.anInt6323 * local34 >> 15);
				if (local147 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				if (this.aClass19_Sub2_9.aBoolean198) {
					local163 = local78 - this.aClass19_Sub2_9.anInt2867;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass19_Sub2_9.anInt2867;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass19_Sub2_9.anInt2867;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass19_Sub2_9.anInt2867;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt6328 * local56;
				local227 = this.anInt6322 * local56;
				local244 = this.anInt6329 + (this.anInt6333 * local19 + local222 + this.anInt6331 * local29 >> 15);
				local255 = arg3.anInt2266 + local244 * this.aClass19_Sub2_9.anInt2851 / local78;
				local272 = this.anInt6325 + (this.anInt6327 * local19 + local227 + this.anInt6334 * local29 >> 15);
				local283 = arg3.anInt2263 + local272 * this.aClass19_Sub2_9.anInt2841 / local78;
				local300 = this.anInt6329 + (this.anInt6333 * local24 + local222 + this.anInt6331 * local29 >> 15);
				local311 = arg3.anInt2266 + local300 * this.aClass19_Sub2_9.anInt2851 / local101;
				local328 = this.anInt6325 + (this.anInt6327 * local24 + local227 + this.anInt6334 * local29 >> 15);
				local339 = arg3.anInt2263 + local328 * this.aClass19_Sub2_9.anInt2841 / local101;
				local356 = this.anInt6329 + (this.anInt6333 * local24 + local222 + this.anInt6331 * local34 >> 15);
				local367 = arg3.anInt2266 + local356 * this.aClass19_Sub2_9.anInt2851 / local124;
				local384 = this.anInt6325 + (this.anInt6327 * local24 + local227 + this.anInt6334 * local34 >> 15);
				local395 = arg3.anInt2263 + local384 * this.aClass19_Sub2_9.anInt2841 / local124;
				local412 = this.anInt6329 + (this.anInt6333 * local19 + local222 + this.anInt6331 * local34 >> 15);
				local423 = arg3.anInt2266 + local412 * this.aClass19_Sub2_9.anInt2851 / local147;
				local440 = this.anInt6325 + (this.anInt6327 * local19 + local227 + this.anInt6334 * local34 >> 15);
				local451 = arg3.anInt2263 + local440 * this.aClass19_Sub2_9.anInt2841 / local147;
			}
			@Pc(1038) boolean local1038 = local6.aShort84 != -1 && this.method5734(this.aClass19_Sub2_9.anInterface2_5.method2658(local6.aShort84).aByte67);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean169 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt2265 || local423 > arg3.anInt2265 || local311 > arg3.anInt2265;
				if (local61 < 765) {
					if (local1038) {
						arg3.anInt2264 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort84 >= 0) {
							arg3.method2280(local395, local451, local339, local367, local423, local311, this.aClass19_Sub2_9.anInt2853, local40, local42, local38, local6.anInt5612, local6.anInt5611, local6.anInt5609, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort84);
						} else {
							arg3.method2289(local395, local451, local339, local367, local423, local311, Static231.method4024(local6.anInt5612, local40 << 24 | this.aClass19_Sub2_9.anInt2853), Static231.method4024(local6.anInt5611, local42 << 24 | this.aClass19_Sub2_9.anInt2853), Static231.method4024(local6.anInt5609, local38 << 24 | this.aClass19_Sub2_9.anInt2853));
						}
					} else if (local6.aShort84 >= 0) {
						arg3.method2290(local395, local451, local339, local367, local423, local311, local6.anInt5612, local6.anInt5611, local6.anInt5609, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort84);
					} else {
						arg3.method2289(local395, local451, local339, local367, local423, local311, local6.anInt5612, local6.anInt5611, local6.anInt5609);
					}
					arg3.anInt2264 = 0;
				} else {
					arg3.method2282(local395, local451, local339, local367, local423, local311, this.aClass19_Sub2_9.anInt2853);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean169 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt2265 || local311 > arg3.anInt2265 || local423 > arg3.anInt2265;
				if (local61 < 765) {
					if (local1038) {
						arg3.anInt2264 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort84 >= 0) {
							arg3.method2280(local283, local339, local451, local255, local311, local423, this.aClass19_Sub2_9.anInt2853, local36, local38, local42, local6.anInt5610, local6.anInt5609, local6.anInt5611, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort84);
						} else {
							arg3.method2289(local283, local339, local451, local255, local311, local423, Static231.method4024(local6.anInt5610, local36 << 24 | this.aClass19_Sub2_9.anInt2853), Static231.method4024(local6.anInt5609, local38 << 24 | this.aClass19_Sub2_9.anInt2853), Static231.method4024(local6.anInt5611, local42 << 24 | this.aClass19_Sub2_9.anInt2853));
						}
					} else if (local6.aShort84 >= 0) {
						arg3.method2290(local283, local339, local451, local255, local311, local423, local6.anInt5610, local6.anInt5609, local6.anInt5611, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort84);
					} else {
						arg3.method2289(local283, local339, local451, local255, local311, local423, local6.anInt5610, local6.anInt5609, local6.anInt5611);
					}
					arg3.anInt2264 = 0;
					return;
				}
				arg3.method2282(local283, local339, local451, local255, local311, local423, this.aClass19_Sub2_9.anInt2853);
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILclient!gf;[I[I[I)V")
	private void method5736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class38 local6 = this.aClass38ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(181) int local181;
		@Pc(237) int local237;
		@Pc(293) int local293;
		@Pc(349) int local349;
		@Pc(209) int local209;
		@Pc(170) int local170;
		@Pc(226) int local226;
		@Pc(282) int local282;
		@Pc(338) int local338;
		@Pc(198) int local198;
		@Pc(254) int local254;
		@Pc(310) int local310;
		@Pc(366) int local366;
		@Pc(68) int local68;
		@Pc(91) int local91;
		@Pc(114) int local114;
		@Pc(137) int local137;
		@Pc(46) int local46;
		@Pc(265) int local265;
		@Pc(321) int local321;
		@Pc(377) int local377;
		if (local6 == null) {
			@Pc(996) Class34 local996 = this.aClass34ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort10; local349++) {
					local24 = local996.anIntArray80[local349];
					local29 = local996.anIntArray79[local349];
					local34 = local996.anIntArray83[local349];
					local293 = this.anInt6326 + (this.anInt6321 * local24 + this.anInt6335 * local29 + this.anInt6323 * local34 >> 15);
					if (local293 <= this.aClass19_Sub2_9.anInt2843) {
						return;
					}
					local181 = this.anInt6329 + (this.anInt6333 * local24 + this.anInt6328 * local29 + this.anInt6331 * local34 >> 15);
					local237 = this.anInt6325 + (this.anInt6327 * local24 + this.anInt6322 * local29 + this.anInt6334 * local34 >> 15);
					arg3[local349] = arg2.anInt2266 + local181 * this.aClass19_Sub2_9.anInt2851 / local293;
					arg4[local349] = arg2.anInt2263 + local237 * this.aClass19_Sub2_9.anInt2841 / local293;
				}
				if (local996.aShortArray13 != null) {
					local209 = this.anIntArrayArray54[arg0][arg1];
					local265 = this.anIntArrayArray54[arg0 + 1][arg1];
					local321 = this.anIntArrayArray54[arg0][arg1 + 1];
					local377 = arg0 * this.anInt6332;
					local170 = local377 + this.anInt6332;
					local226 = arg1 * this.anInt6332;
					local282 = local226 + this.anInt6332;
					local338 = this.anInt6329 + (this.anInt6333 * local377 + this.anInt6328 * local209 + this.anInt6331 * local226 >> 15);
					local198 = this.anInt6325 + (this.anInt6327 * local377 + this.anInt6322 * local209 + this.anInt6334 * local226 >> 15);
					local254 = this.anInt6326 + (this.anInt6321 * local377 + this.anInt6335 * local209 + this.anInt6323 * local226 >> 15);
					local310 = this.anInt6329 + (this.anInt6333 * local170 + this.anInt6328 * local265 + this.anInt6331 * local226 >> 15);
					local366 = this.anInt6325 + (this.anInt6327 * local170 + this.anInt6322 * local265 + this.anInt6334 * local226 >> 15);
					local68 = this.anInt6326 + (this.anInt6321 * local170 + this.anInt6335 * local265 + this.anInt6323 * local226 >> 15);
					local91 = this.anInt6329 + (this.anInt6333 * local377 + this.anInt6328 * local321 + this.anInt6331 * local282 >> 15);
					local114 = this.anInt6325 + (this.anInt6327 * local377 + this.anInt6322 * local321 + this.anInt6334 * local282 >> 15);
					local137 = this.anInt6326 + (this.anInt6321 * local377 + this.anInt6335 * local321 + this.anInt6323 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort9; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray14[local46];
						@Pc(1354) short local1354 = local996.aShortArray15[local46];
						@Pc(1359) short local1359 = local996.aShortArray12[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean169 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt2265 || local1367 > arg2.anInt2265 || local1371 > arg2.anInt2265;
							@Pc(1427) short local1427 = local996.aShortArray13[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray81[local46];
								if (local1482 != -1) {
									arg2.method2286(local1375, local1379, local1383, local1363, local1367, local1371, Static253.method4368(local1482, local996.aShortArray16[local1349]), Static253.method4368(local1482, local996.aShortArray16[local1354]), Static253.method4368(local1482, local996.aShortArray16[local1359]));
								}
							} else {
								if (this.method5734(this.aClass19_Sub2_9.anInterface2_5.method2658(local1427).aByte67)) {
									arg2.anInt2264 = 100;
								}
								arg2.method2290(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray16[local1349], local996.aShortArray16[local1354], local996.aShortArray16[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt2264 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort9; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray14[local209];
					@Pc(1533) short local1533 = local996.aShortArray15[local209];
					@Pc(1538) short local1538 = local996.aShortArray12[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray81[local209];
						if (local310 != -1) {
							arg2.aBoolean169 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt2265 || local226 > arg2.anInt2265 || local282 > arg2.anInt2265;
							arg2.method2286(local338, local198, local254, local170, local226, local282, Static253.method4368(local310, local996.aShortArray16[local1528]), Static253.method4368(local310, local996.aShortArray16[local1533]), Static253.method4368(local310, local996.aShortArray16[local1538]));
						}
					}
				}
			}
		} else if ((local6.aByte5 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt6332;
			local24 = local19 + this.anInt6332;
			local29 = arg1 * this.anInt6332;
			local34 = local29 + this.anInt6332;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte5 & 0x1) == 0) {
				local46 = this.anIntArrayArray54[arg0][arg1];
				local51 = this.anIntArrayArray54[arg0 + 1][arg1];
				local148 = this.anIntArrayArray54[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray54[arg0][arg1 + 1];
				local68 = this.anInt6326 + (this.anInt6321 * local19 + this.anInt6335 * local46 + this.anInt6323 * local29 >> 15);
				if (local68 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local91 = this.anInt6326 + (this.anInt6321 * local24 + this.anInt6335 * local51 + this.anInt6323 * local29 >> 15);
				if (local91 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local114 = this.anInt6326 + (this.anInt6321 * local24 + this.anInt6335 * local148 + this.anInt6323 * local34 >> 15);
				if (local114 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local137 = this.anInt6326 + (this.anInt6321 * local19 + this.anInt6335 * local153 + this.anInt6323 * local34 >> 15);
				if (local137 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local170 = this.anInt6329 + (this.anInt6333 * local19 + this.anInt6328 * local46 + this.anInt6331 * local29 >> 15);
				local181 = arg2.anInt2266 + local170 * this.aClass19_Sub2_9.anInt2851 / local68;
				local198 = this.anInt6325 + (this.anInt6327 * local19 + this.anInt6322 * local46 + this.anInt6334 * local29 >> 15);
				local209 = arg2.anInt2263 + local198 * this.aClass19_Sub2_9.anInt2841 / local68;
				local226 = this.anInt6329 + (this.anInt6333 * local24 + this.anInt6328 * local51 + this.anInt6331 * local29 >> 15);
				local237 = arg2.anInt2266 + local226 * this.aClass19_Sub2_9.anInt2851 / local91;
				local254 = this.anInt6325 + (this.anInt6327 * local24 + this.anInt6322 * local51 + this.anInt6334 * local29 >> 15);
				local265 = arg2.anInt2263 + local254 * this.aClass19_Sub2_9.anInt2841 / local91;
				local282 = this.anInt6329 + (this.anInt6333 * local24 + this.anInt6328 * local148 + this.anInt6331 * local34 >> 15);
				local293 = arg2.anInt2266 + local282 * this.aClass19_Sub2_9.anInt2851 / local114;
				local310 = this.anInt6325 + (this.anInt6327 * local24 + this.anInt6322 * local148 + this.anInt6334 * local34 >> 15);
				local321 = arg2.anInt2263 + local310 * this.aClass19_Sub2_9.anInt2841 / local114;
				local338 = this.anInt6329 + (this.anInt6333 * local19 + this.anInt6328 * local153 + this.anInt6331 * local34 >> 15);
				local349 = arg2.anInt2266 + local338 * this.aClass19_Sub2_9.anInt2851 / local137;
				local366 = this.anInt6325 + (this.anInt6327 * local19 + this.anInt6322 * local153 + this.anInt6334 * local34 >> 15);
				local377 = arg2.anInt2263 + local366 * this.aClass19_Sub2_9.anInt2841 / local137;
			} else {
				local46 = this.anIntArrayArray54[arg0][arg1];
				local51 = this.anInt6335 * local46;
				local68 = this.anInt6326 + (this.anInt6321 * local19 + local51 + this.anInt6323 * local29 >> 15);
				if (local68 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local91 = this.anInt6326 + (this.anInt6321 * local24 + local51 + this.anInt6323 * local29 >> 15);
				if (local91 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local114 = this.anInt6326 + (this.anInt6321 * local24 + local51 + this.anInt6323 * local34 >> 15);
				if (local114 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local137 = this.anInt6326 + (this.anInt6321 * local19 + local51 + this.anInt6323 * local34 >> 15);
				if (local137 <= this.aClass19_Sub2_9.anInt2843) {
					return;
				}
				local148 = this.anInt6328 * local46;
				local153 = this.anInt6322 * local46;
				local170 = this.anInt6329 + (this.anInt6333 * local19 + local148 + this.anInt6331 * local29 >> 15);
				local181 = arg2.anInt2266 + local170 * this.aClass19_Sub2_9.anInt2851 / local68;
				local198 = this.anInt6325 + (this.anInt6327 * local19 + local153 + this.anInt6334 * local29 >> 15);
				local209 = arg2.anInt2263 + local198 * this.aClass19_Sub2_9.anInt2841 / local68;
				local226 = this.anInt6329 + (this.anInt6333 * local24 + local148 + this.anInt6331 * local29 >> 15);
				local237 = arg2.anInt2266 + local226 * this.aClass19_Sub2_9.anInt2851 / local91;
				local254 = this.anInt6325 + (this.anInt6327 * local24 + local153 + this.anInt6334 * local29 >> 15);
				local265 = arg2.anInt2263 + local254 * this.aClass19_Sub2_9.anInt2841 / local91;
				local282 = this.anInt6329 + (this.anInt6333 * local24 + local148 + this.anInt6331 * local34 >> 15);
				local293 = arg2.anInt2266 + local282 * this.aClass19_Sub2_9.anInt2851 / local114;
				local310 = this.anInt6325 + (this.anInt6327 * local24 + local153 + this.anInt6334 * local34 >> 15);
				local321 = arg2.anInt2263 + local310 * this.aClass19_Sub2_9.anInt2841 / local114;
				local338 = this.anInt6329 + (this.anInt6333 * local19 + local148 + this.anInt6331 * local34 >> 15);
				local349 = arg2.anInt2266 + local338 * this.aClass19_Sub2_9.anInt2851 / local137;
				local366 = this.anInt6325 + (this.anInt6327 * local19 + local153 + this.anInt6334 * local34 >> 15);
				local377 = arg2.anInt2263 + local366 * this.aClass19_Sub2_9.anInt2841 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean169 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt2265 || local349 > arg2.anInt2265 || local237 > arg2.anInt2265;
				if (local6.aShort11 >= 0) {
					if (this.method5734(this.aClass19_Sub2_9.anInterface2_5.method2658(local6.aShort11).aByte67)) {
						arg2.anInt2264 = 100;
					}
					arg2.method2290(local321, local377, local265, local293, local349, local237, local6.aShort15 & 0xFFFF, local6.aShort12 & 0xFFFF, local6.aShort14 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort11);
					arg2.anInt2264 = 0;
				} else {
					arg2.method2286(local321, local377, local265, local293, local349, local237, local6.aShort15 & 0xFFFF, local6.aShort12 & 0xFFFF, local6.aShort14 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean169 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt2265 || local237 > arg2.anInt2265 || local349 > arg2.anInt2265;
				if (local6.aShort11 >= 0) {
					if (this.method5734(this.aClass19_Sub2_9.anInterface2_5.method2658(local6.aShort11).aByte67)) {
						arg2.anInt2264 = 100;
					}
					arg2.method2290(local209, local265, local377, local181, local237, local349, local6.aShort13 & 0xFFFF, local6.aShort14 & 0xFFFF, local6.aShort12 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort11);
					arg2.anInt2264 = 0;
					return;
				}
				arg2.method2286(local209, local265, local377, local181, local237, local349, local6.aShort13 & 0xFFFF, local6.aShort14 & 0xFFFF, local6.aShort12 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5722(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class250 local4 = this.aClass19_Sub2_9.method2905(Thread.currentThread());
		@Pc(7) Class81 local7 = local4.aClass81_2;
		local7.anInt2264 = 0;
		local7.aBoolean169 = false;
		if (this.aClass201ArrayArray1 != null) {
			this.method5737(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray508, local4.anIntArray516);
		} else if (this.aClass38ArrayArray1 != null) {
			this.method5733(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray508, local4.anIntArray516);
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(IIIIIII[[ZLclient!gf;[I[I)V")
	private void method5737(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class81 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean168 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass201ArrayArray1[local22][local25] != null) {
						@Pc(50) Class201 local50 = this.aClass201ArrayArray1[local22][local25];
						if (local50.aShort84 != -1 && (local50.aByte60 & 0x2) == 0 && local50.anInt5613 == 0) {
							local68 = this.aClass19_Sub2_9.method2907(local50.aShort84);
							arg5.method2286(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static253.method4368(local68, local50.anInt5612), Static253.method4368(local68, local50.anInt5611), Static253.method4368(local68, local50.anInt5609));
							arg5.method2286(local20, local20, local20 - 4, local16, local16 + 4, local16, Static253.method4368(local68, local50.anInt5610), Static253.method4368(local68, local50.anInt5609), Static253.method4368(local68, local50.anInt5611));
						} else if (local50.anInt5613 == 0) {
							arg5.method2289(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt5612, local50.anInt5611, local50.anInt5609);
							arg5.method2289(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt5610, local50.anInt5609, local50.anInt5611);
						} else {
							local68 = local50.anInt5613;
							arg5.method2289(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static231.method4024(local68, local50.anInt5612 & 0xFF000000), Static231.method4024(local68, local50.anInt5611 & 0xFF000000), Static231.method4024(local68, local50.anInt5609 & 0xFF000000));
							arg5.method2289(local20, local20, local20 - 4, local16, local16 + 4, local16, Static231.method4024(local68, local50.anInt5610 & 0xFF000000), Static231.method4024(local68, local50.anInt5609 & 0xFF000000), Static231.method4024(local68, local50.anInt5611 & 0xFF000000));
						}
					} else if (this.aClass136ArrayArray1[local22][local25] != null) {
						@Pc(259) Class136 local259 = this.aClass136ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort41; local68++) {
							arg6[local68] = local16 + (local259.aShortArray62[local68] - local22 * this.anInt6332) * 4 / this.anInt6332;
							arg7[local68] = local20 - (local259.aShortArray60[local68] - local25 * this.anInt6332) * 4 / this.anInt6332;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort42; local307++) {
							@Pc(312) int local312 = local307 * 3;
							@Pc(316) int local316 = local312 + 1;
							@Pc(320) int local320 = local316 + 1;
							@Pc(324) int local324 = arg6[local312];
							@Pc(328) int local328 = arg6[local316];
							@Pc(332) int local332 = arg6[local320];
							@Pc(336) int local336 = arg7[local312];
							@Pc(340) int local340 = arg7[local316];
							@Pc(344) int local344 = arg7[local320];
							@Pc(369) int local369;
							if (local259.anIntArray210 != null && local259.anIntArray210[local307] != 0 && (local259.aShortArray59 == null || local259.aShortArray59 != null && local259.aShortArray59[local307] == -1)) {
								local369 = local259.anIntArray210[local307];
								arg5.method2289(local336, local340, local344, local324, local328, local332, Static231.method4024(local369, -(local259.anIntArray209[local312] & -16777216) - 16777216), Static231.method4024(local369, -(local259.anIntArray209[local316] & -16777216) - 16777216), Static231.method4024(local369, -(local259.anIntArray209[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray59 == null || local259.aShortArray59[local307] == -1) {
								arg5.method2289(local336, local340, local344, local324, local328, local332, local259.anIntArray209[local312], local259.anIntArray209[local316], local259.anIntArray209[local320]);
							} else {
								local369 = this.aClass19_Sub2_9.method2907(local259.aShortArray59[local307]);
								arg5.method2286(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean168 = true;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!kb;IIIIZ)V")
	@Override
	public void method5724(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!of;[I)V")
	@Override
	public void method5721(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass201ArrayArray1 == null) {
			this.aClass201ArrayArray1 = new Class201[super.anInt6320][super.anInt6319];
			this.aClass136ArrayArray1 = new Class136[super.anInt6320][super.anInt6319];
		} else if (this.aClass38ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static181.anIntArray204[Static26.method863(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static181.anIntArray204[Static26.method863(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg6[local104] != arg6[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == this.anInt6332 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt6332 && arg4[local116] == this.anInt6332) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt6332) {
					if (local110 != -1 && arg6[local110] != arg6[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt6332 && arg2[local244] != arg2[0] - this.anInt6332) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt6332 && arg4[local244] != arg4[0] - this.anInt6332) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(527) int local527;
		if (local102) {
			@Pc(334) Class201 local334 = new Class201();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt5613 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte60 = (byte) (local334.aByte60 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray54[arg0][arg1] == this.anIntArrayArray54[arg0 + 1][arg1] && this.anIntArrayArray54[arg0][arg1] == this.anIntArrayArray54[arg0 + 1][arg1 + 1] && this.anIntArrayArray54[arg0][arg1] == this.anIntArrayArray54[arg0][arg1 + 1]) {
				local334.aByte60 = (byte) (local334.aByte60 | 0x1);
			}
			if (local342 == -1 || (local334.aByte60 & 0x2) != 0 || this.aClass19_Sub2_9.anInterface2_5.method2658(local342).aBoolean438) {
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local104] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt5610 = Static263.method4467(local527, arg10, Static408.method5732(arg6[local104] >> 8, this.aByteArrayArray20[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]));
				if (local334.anInt5613 != 0) {
					local334.anInt5610 |= this.aByteArrayArray19[arg0][arg1] + 255 - this.aByteArrayArray20[arg0][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local106] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt5609 = Static263.method4467(local527, arg10, Static408.method5732(arg6[local106] >> 8, this.aByteArrayArray20[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]));
				if (local334.anInt5613 != 0) {
					local334.anInt5609 |= this.aByteArrayArray19[arg0 + 1][arg1] + 255 - this.aByteArrayArray20[arg0 + 1][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local108] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt5612 = Static263.method4467(local527, arg10, Static408.method5732(arg6[local108] >> 8, this.aByteArrayArray20[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]));
				if (local334.anInt5613 != 0) {
					local334.anInt5612 |= this.aByteArrayArray19[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray20[arg0 + 1][arg1 + 1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local110] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt5611 = Static263.method4467(local527, arg10, Static408.method5732(arg6[local110] >> 8, this.aByteArrayArray20[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]));
				if (local334.anInt5613 != 0) {
					local334.anInt5611 |= this.aByteArrayArray19[arg0][arg1 + 1] + 255 - this.aByteArrayArray20[arg0][arg1 + 1] << 25;
				}
				local334.aShort84 = -1;
			} else {
				local334.anInt5610 = this.aByteArrayArray20[arg0][arg1] - this.aByteArrayArray19[arg0][arg1];
				local334.anInt5609 = this.aByteArrayArray20[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1];
				local334.anInt5612 = this.aByteArrayArray20[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1];
				local334.anInt5611 = this.aByteArrayArray20[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1];
				local334.aShort84 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort81 = (short) arg5[local108];
				local334.aShort85 = (short) arg5[local110];
				local334.aShort82 = (short) arg5[local106];
				local334.aShort83 = (short) arg5[local104];
			}
			this.aClass201ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class136 local888 = new Class136();
		local888.aShort41 = (short) arg2.length;
		local888.aShort42 = (short) (arg2.length / 3);
		local888.aShortArray62 = new short[local888.aShort41];
		local888.aShortArray63 = new short[local888.aShort41];
		local888.aShortArray60 = new short[local888.aShort41];
		local888.anIntArray209 = new int[local888.aShort41];
		if (arg5 != null) {
			local888.aShortArray61 = new short[local888.aShort41];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort41; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray20[arg0][arg1] - this.aByteArrayArray19[arg0][arg1];
			} else if (local342 == 0 && local527 == this.anInt6332) {
				local958 = this.aByteArrayArray20[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1];
			} else if (local342 == this.anInt6332 && local527 == this.anInt6332) {
				local958 = this.aByteArrayArray20[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt6332 && local527 == 0) {
				local958 = this.aByteArrayArray20[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray20[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]) * (this.anInt6332 - local342) + (this.aByteArrayArray20[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray20[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]) * (this.anInt6332 - local342) + (this.aByteArrayArray20[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (this.anInt6332 - local527) + local1126 * local527 >> this.anInt6330 * 2;
			}
			@Pc(1150) short local1150 = (short) ((arg0 << this.anInt6330) + local342);
			@Pc(1158) short local1158 = (short) ((arg1 << this.anInt6330) + local527);
			local888.aShortArray62[local244] = local1150;
			local888.aShortArray60[local244] = local1158;
			local888.aShortArray63[local244] = (short) (this.method5728(local1150, local1158) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass19_Sub2_9.anInterface2_5.method2658(arg8[local244]).aBoolean438) {
				local888.anIntArray209[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray61[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray209[local244] = Static263.method4467(local1226, arg10, Static408.method5732(arg6[local244] >> 8, local958));
				if (arg7 != null) {
					local888.anIntArray209[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray209[local244] = 0;
			} else {
				local888.anIntArray209[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort42; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass19_Sub2_9.anInterface2_5.method2658(arg8[local527 * 3]).aBoolean438) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray210 = new int[local888.aShort42];
		}
		if (local1296) {
			local888.aShortArray59 = new short[local888.aShort42];
			local888.aShortArray64 = new short[local888.aShort42];
		}
		for (local958 = 0; local958 < local888.aShort42; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray210[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass19_Sub2_9.anInterface2_5.method2658(local1384).aBoolean438) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass19_Sub2_9.anInterface2_5.method2658(local1384).aBoolean438) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass19_Sub2_9.anInterface2_5.method2658(local1384).aBoolean438) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray59[local958] = (short) local1384;
					local888.aShortArray64[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass19_Sub2_9.anInterface2_5.method2658(local1384).aBoolean438) {
							local888.anIntArray209[local1079] = Static181.anIntArray204[Static26.method863(this.aClass19_Sub2_9.anInterface2_5.method2658(local1384).aShort87 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass19_Sub2_9.anInterface2_5.method2658(local1384).aBoolean438) {
							local888.anIntArray209[local1126] = Static181.anIntArray204[Static26.method863(this.aClass19_Sub2_9.anInterface2_5.method2658(local1384).aShort87 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass19_Sub2_9.anInterface2_5.method2658(local1384).aBoolean438) {
							local888.anIntArray209[local1226] = Static181.anIntArray204[Static26.method863(this.aClass19_Sub2_9.anInterface2_5.method2658(local1384).aShort87 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray59[local958] = -1;
				}
			}
		}
		this.aClass136ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass38ArrayArray1 == null) {
			this.aClass38ArrayArray1 = new Class38[super.anInt6320][super.anInt6319];
			this.aClass34ArrayArray1 = new Class34[super.anInt6320][super.anInt6319];
		} else if (this.aClass201ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg6[local57]];
				local70 = arg4[arg6[local57]];
				if (local64 != 0 && local64 != this.anInt6332 || local70 != 0 && local70 != this.anInt6332) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class34 local95 = new Class34();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort10 = local99;
			local95.aShortArray16 = new short[local99];
			local95.anIntArray80 = new int[local99];
			local95.anIntArray79 = new int[local99];
			local95.anIntArray83 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray16[local124] = (short) (this.aByteArrayArray20[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt6332) {
					local95.aShortArray16[local124] = (short) (this.aByteArrayArray20[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]);
				} else if (local129 == this.anInt6332 && local133 == this.anInt6332) {
					local95.aShortArray16[local124] = (short) (this.aByteArrayArray20[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt6332 && local133 == 0) {
					local95.aShortArray16[local124] = (short) (this.aByteArrayArray20[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray20[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]) * (this.anInt6332 - local129) + (this.aByteArrayArray20[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray20[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]) * (this.anInt6332 - local129) + (this.aByteArrayArray20[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray16[local124] = (short) (local288 * (this.anInt6332 - local133) + local335 * local133 >> this.anInt6330 * 2);
				}
				local288 = (arg0 << this.anInt6330) + local129;
				local335 = (arg1 << this.anInt6330) + local133;
				local95.anIntArray80[local124] = local288;
				local95.anIntArray83[local124] = local335;
				local95.anIntArray79[local124] = this.method5728(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray16[local124] < 2) {
					local95.aShortArray16[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass19_Sub2_9.anInterface2_5.method2658(arg11[local288]).aBoolean438) {
					local412 = true;
				}
			}
			local95.anIntArray81 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray82 = new int[local133];
			}
			local95.aShortArray14 = new short[local133];
			local95.aShortArray15 = new short[local133];
			local95.aShortArray12 = new short[local133];
			if (local412) {
				local95.aShortArray13 = new short[local133];
				local95.aShortArray17 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray81[local95.aShort9] = Static26.method863(arg9[local335]);
					} else {
						local95.anIntArray81[local95.aShort9] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray82[local95.aShort9] = -1;
						} else {
							local95.anIntArray82[local95.aShort9] = Static26.method863(arg10[local335]);
						}
					}
					local95.aShortArray14[local95.aShort9] = (short) arg6[local335];
					local95.aShortArray15[local95.aShort9] = (short) arg7[local335];
					local95.aShortArray12[local95.aShort9] = (short) arg8[local335];
					if (local412) {
						if (arg11[local335] == -1 || this.aClass19_Sub2_9.anInterface2_5.method2658(arg11[local335]).aBoolean438) {
							local95.aShortArray13[local95.aShort9] = -1;
						} else {
							local95.aShortArray13[local95.aShort9] = (short) arg11[local335];
							local95.aShortArray17[local95.aShort9] = (short) arg12[local335];
						}
					}
					local95.aShort9++;
				}
			}
			this.aClass34ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(641) Class38 local641 = new Class38();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local641.anInt1252 = Static253.method4368(Static26.method863(arg10[0]), this.aByteArrayArray20[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				if (local64 == -1) {
					local641.aByte5 = (byte) (local641.aByte5 | 0x2);
				}
			}
			if (this.anIntArrayArray54[arg0][arg1] == this.anIntArrayArray54[arg0 + 1][arg1] && this.anIntArrayArray54[arg0][arg1] == this.anIntArrayArray54[arg0 + 1][arg1 + 1] && this.anIntArrayArray54[arg0][arg1] == this.anIntArrayArray54[arg0][arg1 + 1]) {
				local641.aByte5 = (byte) (local641.aByte5 | 0x1);
			}
			if (local70 == -1 || (local641.aByte5 & 0x2) != 0 || this.aClass19_Sub2_9.anInterface2_5.method2658(local70).aBoolean438) {
				@Pc(842) short local842 = Static26.method863(local64);
				local641.aShort13 = (short) Static253.method4368(local842, this.aByteArrayArray20[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				local641.aShort14 = (short) Static253.method4368(local842, this.aByteArrayArray20[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]);
				local641.aShort15 = (short) Static253.method4368(local842, this.aByteArrayArray20[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]);
				local641.aShort12 = (short) Static253.method4368(local842, this.aByteArrayArray20[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]);
				local641.aShort11 = -1;
			} else {
				local641.aShort13 = (short) (this.aByteArrayArray20[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				local641.aShort14 = (short) (this.aByteArrayArray20[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]);
				local641.aShort15 = (short) (this.aByteArrayArray20[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]);
				local641.aShort12 = (short) (this.aByteArrayArray20[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]);
				local641.aShort11 = (short) local70;
			}
			this.aClass38ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class14_Sub1 local3 = this.aClass19_Sub2_9.aClass14_Sub1_2;
		this.anInt6333 = local3.anInt505;
		this.anInt6328 = local3.anInt500;
		this.anInt6331 = local3.anInt497;
		this.anInt6329 = local3.anInt498;
		this.anInt6327 = local3.anInt507;
		this.anInt6322 = local3.anInt506;
		this.anInt6334 = local3.anInt499;
		this.anInt6325 = local3.anInt496;
		this.anInt6321 = local3.anInt504;
		this.anInt6335 = local3.anInt502;
		this.anInt6323 = local3.anInt503;
		this.anInt6326 = local3.anInt501;
	}
}
