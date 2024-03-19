import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class1_Sub2_Sub27 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pf", name = "gb", descriptor = "I")
	private int anInt5191;

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
	private int anInt5176 = 1024;

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
	private int anInt5180 = 1024;

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "I")
	private int anInt5183 = 2048;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
	private int anInt5182 = 0;

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
	private int anInt5181 = 1024;

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
	private int anInt5178 = 409;

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
	private int anInt5185 = 0;

	@OriginalMember(owner = "client!pf", name = "fb", descriptor = "I")
	private int anInt5190 = 819;

	@OriginalMember(owner = "client!pf", name = "ib", descriptor = "I")
	private int anInt5192 = 1024;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
	@Override
	public void method6090() {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[[ILjava/util/Random;IIIB)V")
	private void method4420(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(27) int local27 = this.anInt5192 > 0 ? 4096 - Static228.method4354(arg2, this.anInt5192) : 4096;
		@Pc(35) int local35 = this.anInt5176 * this.anInt5191 >> 12;
		@Pc(48) int local48 = this.anInt5191 - (local35 > 0 ? Static228.method4354(arg2, local35) : 0);
		if (Static64.anInt1755 <= arg0) {
			arg0 -= Static64.anInt1755;
		}
		@Pc(64) int local64;
		@Pc(87) int local87;
		if (local48 <= 0) {
			if (Static64.anInt1755 >= arg4 + arg0) {
				for (local64 = 0; local64 < arg3; local64++) {
					Static360.method2012(arg1[local64 + arg5], arg0, arg4, local27);
				}
			} else {
				local64 = Static64.anInt1755 - arg0;
				for (local87 = 0; local87 < arg3; local87++) {
					@Pc(96) int[] local96 = arg1[arg5 + local87];
					Static360.method2012(local96, arg0, local64, local27);
					Static360.method2012(local96, 0, arg4 - local64, local27);
				}
			}
		} else if (arg3 > 0 && arg4 > 0) {
			local64 = arg4 / 2;
			local87 = arg3 / 2;
			@Pc(142) int local142 = local64 >= local48 ? local48 : local64;
			@Pc(149) int local149 = local87 < local48 ? local87 : local48;
			@Pc(154) int local154 = arg0 + local142;
			@Pc(160) int local160 = arg4 - local142 * 2;
			for (@Pc(162) int local162 = 0; local162 < arg3; local162++) {
				@Pc(170) int[] local170 = arg1[arg5 + local162];
				@Pc(179) int local179;
				@Pc(187) int local187;
				@Pc(195) int local195;
				if (local162 < local149) {
					local179 = local162 * local27 / local149;
					if (this.anInt5182 == 0) {
						for (local187 = 0; local187 < local142; local187++) {
							local195 = local27 * local187 / local142;
							local170[arg0 + local187 & Static145.anInt3608] = local170[Static145.anInt3608 & arg4 + arg0 - local187 - 1] = local179 * local195 >> 12;
						}
					} else {
						for (local187 = 0; local187 < local142; local187++) {
							local195 = local27 * local187 / local142;
							local170[Static145.anInt3608 & arg0 + local187] = local170[arg4 + arg0 - local187 - 1 & Static145.anInt3608] = local195 < local179 ? local195 : local179;
						}
					}
					if (local160 + local154 <= Static64.anInt1755) {
						Static360.method2012(local170, local154, local160, local179);
					} else {
						local187 = Static64.anInt1755 - local154;
						Static360.method2012(local170, local154, local187, local179);
						Static360.method2012(local170, 0, local160 - local187, local179);
					}
				} else {
					local179 = arg3 - local162 - 1;
					if (local149 > local179) {
						local187 = local27 * local179 / local149;
						@Pc(331) int local331;
						if (this.anInt5182 == 0) {
							for (local195 = 0; local195 < local142; local195++) {
								local331 = local195 * local27 / local142;
								local170[Static145.anInt3608 & local195 + arg0] = local170[arg0 + arg4 - local195 - 1 & Static145.anInt3608] = local187 * local331 >> 12;
							}
						} else {
							for (local195 = 0; local195 < local142; local195++) {
								local331 = local195 * local27 / local142;
								local170[Static145.anInt3608 & arg0 + local195] = local170[Static145.anInt3608 & arg4 + arg0 - local195 - 1] = local331 < local187 ? local331 : local187;
							}
						}
						if (Static64.anInt1755 >= local160 + local154) {
							Static360.method2012(local170, local154, local160, local187);
						} else {
							local195 = Static64.anInt1755 - local154;
							Static360.method2012(local170, local154, local195, local187);
							Static360.method2012(local170, 0, local160 - local195, local187);
						}
					} else {
						for (local187 = 0; local187 < local142; local187++) {
							local170[local187 + arg0 & Static145.anInt3608] = local170[arg0 + arg4 - local187 - 1 & Static145.anInt3608] = local187 * local27 / local142;
						}
						if (local154 + local160 <= Static64.anInt1755) {
							Static360.method2012(local170, local154, local160, local27);
						} else {
							local195 = Static64.anInt1755 - local154;
							Static360.method2012(local170, local154, local195, local27);
							Static360.method2012(local170, 0, local160 - local195, local27);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt5185 = arg1.method5761();
		} else if (arg0 == 1) {
			this.anInt5181 = arg1.method5749();
		} else if (arg0 == 2) {
			this.anInt5183 = arg1.method5749();
		} else if (arg0 == 3) {
			this.anInt5178 = arg1.method5749();
		} else if (arg0 == 4) {
			this.anInt5190 = arg1.method5749();
		} else if (arg0 == 5) {
			this.anInt5180 = arg1.method5749();
		} else if (arg0 == 6) {
			this.anInt5182 = arg1.method5761();
		} else if (arg0 == 7) {
			this.anInt5176 = arg1.method5749();
		} else if (arg0 == 8) {
			this.anInt5192 = arg1.method5749();
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass201_41.method5513(arg0);
		if (!super.aClass201_41.aBoolean471) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass201_41.method5514();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static64.anInt1755 * this.anInt5181 >> 12;
		@Pc(52) int local52 = this.anInt5183 * Static64.anInt1755 >> 12;
		@Pc(59) int local59 = this.anInt5178 * Static53.anInt1598 >> 12;
		@Pc(66) int local66 = this.anInt5190 * Static53.anInt1598 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt5191 = this.anInt5180 * (Static64.anInt1755 / 8) >> 12;
		@Pc(91) int local91 = Static64.anInt1755 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt5185);
		while (true) {
			while (true) {
				@Pc(118) int local118 = Static228.method4354(local106, local52 - local45) + local45;
				@Pc(129) int local129 = local59 + Static228.method4354(local106, local66 - local59);
				@Pc(133) int local133 = local118 + local28;
				if (local133 > Static64.anInt1755) {
					local133 = Static64.anInt1755;
					local118 = Static64.anInt1755 - local28;
				}
				@Pc(150) int local150;
				@Pc(160) int local160;
				if (local34) {
					local150 = 0;
				} else {
					@Pc(154) int local154 = local30;
					@Pc(158) int[] local158 = local99[local30];
					local160 = 0;
					@Pc(164) int local164 = local133 + local22;
					if (local164 < 0) {
						local164 += Static64.anInt1755;
					}
					if (local164 > Static64.anInt1755) {
						local164 -= Static64.anInt1755;
					}
					local150 = local158[2];
					while (true) {
						@Pc(189) int[] local189 = local99[local154];
						if (local189[0] <= local164 && local189[1] >= local164) {
							if (local30 != local154) {
								@Pc(227) int local227 = local22 + local28;
								if (local227 < 0) {
									local227 += Static64.anInt1755;
								}
								if (local227 > Static64.anInt1755) {
									local227 -= Static64.anInt1755;
								}
								for (@Pc(249) int local249 = 1; local249 <= local160; local249++) {
									@Pc(260) int[] local260 = local99[(local30 + local249) % local36];
									local150 = Math.max(local150, local260[2]);
								}
								for (@Pc(272) int local272 = 0; local272 <= local160; local272++) {
									@Pc(283) int[] local283 = local99[(local30 + local272) % local36];
									@Pc(287) int local287 = local283[2];
									if (local150 != local287) {
										@Pc(298) int local298 = local283[0];
										@Pc(302) int local302 = local283[1];
										@Pc(313) int local313;
										@Pc(317) int local317;
										if (local227 < local164) {
											local313 = Math.max(local227, local298);
											local317 = Math.min(local164, local302);
										} else if (local298 == 0) {
											local317 = Math.min(local164, local302);
											local313 = 0;
										} else {
											local313 = Math.max(local227, local298);
											local317 = Static64.anInt1755;
										}
										this.method4420(local313 + local26, local20, local106, local150 - local287, -local313 + local317, local287);
									}
								}
							}
							local30 = local154;
							break;
						}
						local154++;
						if (local154 >= local36) {
							local154 = 0;
						}
						local160++;
					}
				}
				if (local150 + local129 <= Static53.anInt1598) {
					local32 = false;
				} else {
					local129 = Static53.anInt1598 - local150;
				}
				@Pc(400) int[] local400;
				if (Static64.anInt1755 == local133) {
					this.method4420(local28 + local24, local20, local106, local129, local118, local150);
					if (local32) {
						return local11;
					}
					local32 = true;
					local400 = local95[local38++];
					local400[0] = local28;
					local400[2] = local150 + local129;
					local400[1] = local133;
					@Pc(416) int[][] local416 = local99;
					local99 = local95;
					local95 = local416;
					local36 = local38;
					local38 = 0;
					local26 = local24;
					local24 = Static228.method4354(local106, Static64.anInt1755);
					local22 = local24 - local26;
					local28 = 0;
					local160 = local22;
					if (local22 < 0) {
						local160 = local22 + Static64.anInt1755;
					}
					local30 = 0;
					if (local160 > Static64.anInt1755) {
						local160 -= Static64.anInt1755;
					}
					while (true) {
						@Pc(466) int[] local466 = local99[local30];
						if (local466[0] <= local160 && local466[1] >= local160) {
							local34 = false;
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local400 = local95[local38++];
					local400[1] = local133;
					local400[2] = local150 + local129;
					local400[0] = local28;
					this.method4420(local24 + local28, local20, local106, local129, local118, local150);
					local28 = local133;
				}
			}
		}
	}
}
