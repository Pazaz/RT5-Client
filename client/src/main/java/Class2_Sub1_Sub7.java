import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
	private int anInt2125;

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
	private int anInt2126 = 2048;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
	private int anInt2122 = 1024;

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
	private int anInt2118 = 0;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
	private int anInt2123 = 819;

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
	private int anInt2124 = 0;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
	private int anInt2119 = 1024;

	@OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
	private int anInt2131 = 1024;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	private int anInt2132 = 409;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
	private int anInt2133 = 1024;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (arg0 <= 107) {
			Static102.method2027(true, -62, 43, true);
		}
		if (!super.aClass180_41.aBoolean338) {
			return local11;
		}
		@Pc(31) int[][] local31 = super.aClass180_41.method3932();
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) boolean local43 = true;
		@Pc(45) boolean local45 = true;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(56) int local56 = Static608.anInt9289 * this.anInt2131 >> 12;
		@Pc(63) int local63 = this.anInt2126 * Static608.anInt9289 >> 12;
		@Pc(70) int local70 = Static2.anInt53 * this.anInt2132 >> 12;
		@Pc(77) int local77 = this.anInt2123 * Static2.anInt53 >> 12;
		if (local77 <= 1) {
			return local31[arg1];
		}
		this.anInt2125 = Static608.anInt9289 / 8 * this.anInt2122 >> 12;
		@Pc(101) int local101 = Static608.anInt9289 / local56 + 1;
		@Pc(105) int[][] local105 = new int[local101][3];
		@Pc(109) int[][] local109 = new int[local101][3];
		@Pc(116) Random local116 = new Random((long) this.anInt2124);
		while (true) {
			while (true) {
				@Pc(126) int local126 = local56 + Static623.method8326(-5208, local63 - local56, local116);
				@Pc(136) int local136 = local70 + Static623.method8326(-5208, local77 - local70, local116);
				@Pc(141) int local141 = local39 + local126;
				if (local141 > Static608.anInt9289) {
					local126 = Static608.anInt9289 - local39;
					local141 = Static608.anInt9289;
				}
				@Pc(157) int local157;
				@Pc(167) int local167;
				if (local45) {
					local157 = 0;
				} else {
					@Pc(161) int local161 = local41;
					@Pc(165) int[] local165 = local109[local41];
					local167 = 0;
					@Pc(171) int local171 = local33 + local141;
					if (local171 < 0) {
						local171 += Static608.anInt9289;
					}
					if (Static608.anInt9289 < local171) {
						local171 -= Static608.anInt9289;
					}
					local157 = local165[2];
					while (true) {
						@Pc(192) int[] local192 = local109[local161];
						if (local192[0] <= local171 && local192[1] >= local171) {
							if (local161 != local41) {
								@Pc(234) int local234 = local33 + local39;
								if (local234 < 0) {
									local234 += Static608.anInt9289;
								}
								if (Static608.anInt9289 < local234) {
									local234 -= Static608.anInt9289;
								}
								for (@Pc(249) int local249 = 1; local249 <= local167; local249++) {
									@Pc(259) int[] local259 = local109[(local249 + local41) % local47];
									local157 = Math.max(local157, local259[2]);
								}
								for (@Pc(275) int local275 = 0; local275 <= local167; local275++) {
									@Pc(285) int[] local285 = local109[(local275 + local41) % local47];
									@Pc(289) int local289 = local285[2];
									if (local289 != local157) {
										@Pc(300) int local300 = local285[0];
										@Pc(304) int local304 = local285[1];
										@Pc(311) int local311;
										@Pc(315) int local315;
										if (local234 < local171) {
											local311 = Math.max(local234, local300);
											local315 = Math.min(local171, local304);
										} else if (local300 == 0) {
											local311 = 0;
											local315 = Math.min(local171, local304);
										} else {
											local311 = Math.max(local234, local300);
											local315 = Static608.anInt9289;
										}
										this.method2023(local31, local157 - local289, local116, local289, local37 + local311, -local311 + local315, (byte) -58);
									}
								}
							}
							local41 = local161;
							break;
						}
						local167++;
						@Pc(212) int local212 = ~local47;
						local161++;
						if (local212 >= ~local161) {
							local161 = 0;
						}
					}
				}
				if (local157 + local136 > Static2.anInt53) {
					local136 = Static2.anInt53 - local157;
				} else {
					local43 = false;
				}
				@Pc(406) int[] local406;
				if (local141 == Static608.anInt9289) {
					this.method2023(local31, local136, local116, local157, local35 + local39, local126, (byte) -58);
					if (local43) {
						return local11;
					}
					local43 = true;
					local406 = local105[local49++];
					local406[1] = local141;
					local406[2] = local136 + local157;
					local406[0] = local39;
					@Pc(422) int[][] local422 = local109;
					local109 = local105;
					local47 = local49;
					local105 = local422;
					local49 = 0;
					local37 = local35;
					local35 = Static623.method8326(-5208, Static608.anInt9289, local116);
					local33 = local35 - local37;
					local39 = 0;
					local167 = local33;
					if (local33 < 0) {
						local167 = local33 + Static608.anInt9289;
					}
					if (Static608.anInt9289 < local167) {
						local167 -= Static608.anInt9289;
					}
					local41 = 0;
					while (true) {
						@Pc(468) int[] local468 = local109[local41];
						if (local167 >= local468[0] && local167 <= local468[1]) {
							local45 = false;
							break;
						}
						local41++;
						if (local41 >= local47) {
							local41 = 0;
						}
					}
				} else {
					local406 = local105[local49++];
					local406[2] = local136 + local157;
					local406[1] = local141;
					local406[0] = local39;
					this.method2023(local31, local136, local116, local157, local39 + local35, local126, (byte) -58);
					local39 = local141;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	@Override
	public void method9421(@OriginalArg(0) int arg0) {
		if (arg0 != 7) {
			this.method2023((int[][]) null, 27, (Random) null, 76, -2, -58, (byte) 89);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([[IILjava/util/Random;IIIB)V")
	private void method2023(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		@Pc(22) int local22 = this.anInt2133 <= 0 ? 4096 : 4096 - Static623.method8326(arg6 - 5150, this.anInt2133, arg2);
		@Pc(30) int local30 = this.anInt2119 * this.anInt2125 >> 12;
		@Pc(49) int local49 = this.anInt2125 - (local30 <= 0 ? 0 : Static623.method8326(arg6 ^ 0x146E, local30, arg2));
		if (Static608.anInt9289 <= arg4) {
			arg4 -= Static608.anInt9289;
		}
		if (arg6 != -58) {
			return;
		}
		@Pc(82) int local82;
		@Pc(84) int local84;
		if (local49 <= 0) {
			if (Static608.anInt9289 < arg5 + arg4) {
				local82 = Static608.anInt9289 - arg4;
				for (local84 = 0; local84 < arg1; local84++) {
					@Pc(92) int[] local92 = arg0[local84 + arg3];
					Static734.method7690(local92, arg4, local82, local22);
					Static734.method7690(local92, 0, arg5 - local82, local22);
				}
			} else {
				for (local82 = 0; local82 < arg1; local82++) {
					Static734.method7690(arg0[local82 + arg3], arg4, arg5, local22);
				}
			}
		} else if (arg1 > 0 && arg5 > 0) {
			local82 = arg5 / 2;
			local84 = arg1 / 2;
			@Pc(166) int local166 = local49 > local82 ? local82 : local49;
			@Pc(178) int local178 = local84 >= local49 ? local49 : local84;
			@Pc(182) int local182 = local166 + arg4;
			@Pc(189) int local189 = arg5 - local166 * 2;
			for (@Pc(191) int local191 = 0; local191 < arg1; local191++) {
				@Pc(199) int[] local199 = arg0[arg3 + local191];
				@Pc(212) int local212;
				@Pc(217) int local217;
				@Pc(225) int local225;
				if (local191 < local178) {
					local212 = local22 * local191 / local178;
					if (this.anInt2118 == 0) {
						for (local217 = 0; local217 < local166; local217++) {
							local225 = local217 * local22 / local166;
							local199[local217 + arg4 & Static576.anInt8580] = local199[Static576.anInt8580 & arg5 + arg4 - local217 - 1] = local225 * local212 >> 12;
						}
					} else {
						for (local217 = 0; local217 < local166; local217++) {
							local225 = local217 * local22 / local166;
							local199[Static576.anInt8580 & local217 + arg4] = local199[Static576.anInt8580 & arg4 + arg5 - local217 - 1] = local212 > local225 ? local225 : local212;
						}
					}
					if (Static608.anInt9289 < local182 + local189) {
						local217 = Static608.anInt9289 - local182;
						Static734.method7690(local199, local182, local217, local212);
						Static734.method7690(local199, 0, local189 - local217, local212);
					} else {
						Static734.method7690(local199, local182, local189, local212);
					}
				} else {
					local212 = arg1 - local191 - 1;
					if (local212 < local178) {
						local217 = local212 * local22 / local178;
						@Pc(372) int local372;
						if (this.anInt2118 == 0) {
							for (local225 = 0; local225 < local166; local225++) {
								local372 = local22 * local225 / local166;
								local199[arg4 + local225 & Static576.anInt8580] = local199[arg5 + arg4 - local225 - 1 & Static576.anInt8580] = local217 * local372 >> 12;
							}
						} else {
							for (local225 = 0; local225 < local166; local225++) {
								local372 = local225 * local22 / local166;
								local199[Static576.anInt8580 & arg4 + local225] = local199[arg4 + arg5 - local225 - 1 & Static576.anInt8580] = local217 > local372 ? local372 : local217;
							}
						}
						if (Static608.anInt9289 >= local189 + local182) {
							Static734.method7690(local199, local182, local189, local217);
						} else {
							local225 = Static608.anInt9289 - local182;
							Static734.method7690(local199, local182, local225, local217);
							Static734.method7690(local199, 0, local189 - local225, local217);
						}
					} else {
						for (local217 = 0; local217 < local166; local217++) {
							local199[Static576.anInt8580 & arg4 + local217] = local199[Static576.anInt8580 & arg5 + arg4 - local217 - 1] = local217 * local22 / local166;
						}
						if (Static608.anInt9289 >= local182 + local189) {
							Static734.method7690(local199, local182, local189, local22);
						} else {
							local225 = Static608.anInt9289 - local182;
							Static734.method7690(local199, local182, local225, local22);
							Static734.method7690(local199, 0, local189 - local225, local22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			this.method9411(39, 29);
		}
		if (arg2 == 0) {
			this.anInt2124 = arg1.g1();
		} else if (arg2 == 1) {
			this.anInt2131 = arg1.g2();
		} else if (arg2 == 2) {
			this.anInt2126 = arg1.g2();
		} else if (arg2 == 3) {
			this.anInt2132 = arg1.g2();
		} else if (arg2 == 4) {
			this.anInt2123 = arg1.g2();
		} else if (arg2 == 5) {
			this.anInt2122 = arg1.g2();
		} else if (arg2 == 6) {
			this.anInt2118 = arg1.g1();
		} else if (arg2 == 7) {
			this.anInt2119 = arg1.g2();
		} else if (arg2 == 8) {
			this.anInt2133 = arg1.g2();
		}
	}
}
