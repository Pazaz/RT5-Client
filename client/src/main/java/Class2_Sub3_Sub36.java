import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class2_Sub3_Sub36 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vl", name = "db", descriptor = "I")
	private int anInt6927;

	@OriginalMember(owner = "client!vl", name = "P", descriptor = "I")
	private int anInt6916 = 409;

	@OriginalMember(owner = "client!vl", name = "S", descriptor = "I")
	private int anInt6918 = 2048;

	@OriginalMember(owner = "client!vl", name = "T", descriptor = "I")
	private int anInt6919 = 0;

	@OriginalMember(owner = "client!vl", name = "U", descriptor = "I")
	private int anInt6920 = 1024;

	@OriginalMember(owner = "client!vl", name = "W", descriptor = "I")
	private int anInt6922 = 1024;

	@OriginalMember(owner = "client!vl", name = "O", descriptor = "I")
	private int anInt6915 = 1024;

	@OriginalMember(owner = "client!vl", name = "V", descriptor = "I")
	private int anInt6921 = 819;

	@OriginalMember(owner = "client!vl", name = "Z", descriptor = "I")
	private int anInt6924 = 0;

	@OriginalMember(owner = "client!vl", name = "eb", descriptor = "I")
	private int anInt6928 = 1024;

	static {
		new Class79("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
	@Override
	public void method6480() {
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3996(arg0);
		if (!super.aClass158_41.aBoolean265) {
			return local11;
		}
		@Pc(26) int[][] local26 = super.aClass158_41.method3998();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt6915 * Static227.anInt4036 >> 12;
		@Pc(58) int local58 = this.anInt6918 * Static227.anInt4036 >> 12;
		@Pc(65) int local65 = Static24.anInt638 * this.anInt6916 >> 12;
		@Pc(72) int local72 = this.anInt6921 * Static24.anInt638 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt6927 = Static227.anInt4036 / 8 * this.anInt6922 >> 12;
		@Pc(97) int local97 = Static227.anInt4036 / local51 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt6919);
		while (true) {
			while (true) {
				@Pc(121) int local121 = local51 + Static382.method6361(local58 - local51, local112);
				@Pc(131) int local131 = local65 + Static382.method6361(local72 - local65, local112);
				@Pc(135) int local135 = local34 + local121;
				if (Static227.anInt4036 < local135) {
					local135 = Static227.anInt4036;
					local121 = Static227.anInt4036 - local34;
				}
				@Pc(176) int local176;
				@Pc(155) int local155;
				if (local40) {
					local176 = 0;
				} else {
					@Pc(149) int local149 = local36;
					@Pc(153) int[] local153 = local105[local36];
					local155 = 0;
					@Pc(159) int local159 = local28 + local135;
					if (local159 < 0) {
						local159 += Static227.anInt4036;
					}
					if (Static227.anInt4036 < local159) {
						local159 -= Static227.anInt4036;
					}
					local176 = local153[2];
					while (true) {
						@Pc(180) int[] local180 = local105[local149];
						if (local159 >= local180[0] && local180[1] >= local159) {
							if (local149 != local36) {
								@Pc(222) int local222 = local28 + local34;
								if (local222 < 0) {
									local222 += Static227.anInt4036;
								}
								if (local222 > Static227.anInt4036) {
									local222 -= Static227.anInt4036;
								}
								for (@Pc(241) int local241 = 1; local241 <= local155; local241++) {
									@Pc(252) int[] local252 = local105[(local36 + local241) % local42];
									local176 = Math.max(local176, local252[2]);
								}
								for (@Pc(268) int local268 = 0; local268 <= local155; local268++) {
									@Pc(279) int[] local279 = local105[(local36 + local268) % local42];
									@Pc(283) int local283 = local279[2];
									if (local283 != local176) {
										@Pc(294) int local294 = local279[0];
										@Pc(298) int local298 = local279[1];
										@Pc(305) int local305;
										@Pc(309) int local309;
										if (local159 > local222) {
											local305 = Math.max(local222, local294);
											local309 = Math.min(local159, local298);
										} else if (local294 == 0) {
											local309 = Math.min(local159, local298);
											local305 = 0;
										} else {
											local305 = Math.max(local222, local294);
											local309 = Static227.anInt4036;
										}
										this.method6191(local283, local309 - local305, local112, local305 + local32, local176 + -local283, local26);
									}
								}
							}
							local36 = local149;
							break;
						}
						local155++;
						local149++;
						if (local149 >= local42) {
							local149 = 0;
						}
					}
				}
				if (Static24.anInt638 >= local131 + local176) {
					local38 = false;
				} else {
					local131 = Static24.anInt638 - local176;
				}
				@Pc(385) int[] local385;
				if (Static227.anInt4036 == local135) {
					this.method6191(local176, local121, local112, local30 + local34, local131, local26);
					if (local38) {
						return local11;
					}
					local38 = true;
					local385 = local101[local44++];
					local385[0] = local34;
					local385[2] = local176 + local131;
					local385[1] = local135;
					@Pc(452) int[][] local452 = local105;
					local105 = local101;
					local101 = local452;
					local42 = local44;
					local44 = 0;
					local32 = local30;
					local30 = Static382.method6361(Static227.anInt4036, local112);
					local28 = local30 - local32;
					local34 = 0;
					local155 = local28;
					if (local28 < 0) {
						local155 = local28 + Static227.anInt4036;
					}
					if (local155 > Static227.anInt4036) {
						local155 -= Static227.anInt4036;
					}
					local36 = 0;
					while (true) {
						@Pc(495) int[] local495 = local105[local36];
						if (local495[0] <= local155 && local495[1] >= local155) {
							local40 = false;
							break;
						}
						local36++;
						if (local42 <= local36) {
							local36 = 0;
						}
					}
				} else {
					local385 = local101[local44++];
					local385[2] = local176 + local131;
					local385[0] = local34;
					local385[1] = local135;
					this.method6191(local176, local121, local112, local30 + local34, local131, local26);
					local34 = local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIILjava/util/Random;II[[I)V")
	private void method6191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(21) int local21 = this.anInt6920 > 0 ? 4096 - Static382.method6361(this.anInt6920, arg2) : 4096;
		@Pc(29) int local29 = this.anInt6928 * this.anInt6927 >> 12;
		@Pc(50) int local50 = this.anInt6927 - (local29 > 0 ? Static382.method6361(local29, arg2) : 0);
		if (Static227.anInt4036 <= arg3) {
			arg3 -= Static227.anInt4036;
		}
		@Pc(77) int local77;
		@Pc(104) int local104;
		if (local50 <= 0) {
			if (Static227.anInt4036 >= arg3 + arg1) {
				for (local77 = 0; local77 < arg4; local77++) {
					Static404.method4610(arg5[arg0 + local77], arg3, arg1, local21);
				}
			} else {
				local77 = Static227.anInt4036 - arg3;
				for (local104 = 0; local104 < arg4; local104++) {
					@Pc(112) int[] local112 = arg5[local104 + arg0];
					Static404.method4610(local112, arg3, local77, local21);
					Static404.method4610(local112, 0, arg1 - local77, local21);
				}
			}
		} else if (arg4 > 0 && arg1 > 0) {
			local77 = arg1 / 2;
			local104 = arg4 / 2;
			@Pc(160) int local160 = local50 <= local77 ? local50 : local77;
			@Pc(171) int local171 = local104 < local50 ? local104 : local50;
			@Pc(175) int local175 = local160 + arg3;
			@Pc(182) int local182 = arg1 - local160 * 2;
			for (@Pc(184) int local184 = 0; local184 < arg4; local184++) {
				@Pc(192) int[] local192 = arg5[arg0 + local184];
				@Pc(205) int local205;
				@Pc(213) int local213;
				@Pc(221) int local221;
				if (local184 < local171) {
					local205 = local184 * local21 / local171;
					if (this.anInt6924 == 0) {
						for (local213 = 0; local213 < local160; local213++) {
							local221 = local21 * local213 / local160;
							local192[Static73.anInt1721 & arg3 + local213] = local192[arg3 + arg1 - local213 - 1 & Static73.anInt1721] = local221 * local205 >> 12;
						}
					} else {
						for (local213 = 0; local213 < local160; local213++) {
							local221 = local213 * local21 / local160;
							local192[arg3 + local213 & Static73.anInt1721] = local192[arg1 + arg3 - local213 - 1 & Static73.anInt1721] = local205 <= local221 ? local205 : local221;
						}
					}
					if (local175 + local182 > Static227.anInt4036) {
						local213 = Static227.anInt4036 - local175;
						Static404.method4610(local192, local175, local213, local205);
						Static404.method4610(local192, 0, local182 - local213, local205);
					} else {
						Static404.method4610(local192, local175, local182, local205);
					}
				} else {
					local205 = arg4 - local184 - 1;
					if (local205 < local171) {
						local213 = local21 * local205 / local171;
						@Pc(378) int local378;
						if (this.anInt6924 == 0) {
							for (local221 = 0; local221 < local160; local221++) {
								local378 = local21 * local221 / local160;
								local192[local221 + arg3 & Static73.anInt1721] = local192[arg1 + arg3 - local221 - 1 & Static73.anInt1721] = local378 * local213 >> 12;
							}
						} else {
							for (local221 = 0; local221 < local160; local221++) {
								local378 = local21 * local221 / local160;
								local192[arg3 + local221 & Static73.anInt1721] = local192[arg1 + arg3 - local221 - 1 & Static73.anInt1721] = local378 < local213 ? local378 : local213;
							}
						}
						if (Static227.anInt4036 < local182 + local175) {
							local221 = Static227.anInt4036 - local175;
							Static404.method4610(local192, local175, local221, local213);
							Static404.method4610(local192, 0, local182 - local221, local213);
						} else {
							Static404.method4610(local192, local175, local182, local213);
						}
					} else {
						for (local213 = 0; local213 < local160; local213++) {
							local192[arg3 + local213 & Static73.anInt1721] = local192[Static73.anInt1721 & arg3 + arg1 - local213 - 1] = local21 * local213 / local160;
						}
						if (Static227.anInt4036 < local182 + local175) {
							local221 = Static227.anInt4036 - local175;
							Static404.method4610(local192, local175, local221, local21);
							Static404.method4610(local192, 0, local182 - local221, local21);
						} else {
							Static404.method4610(local192, local175, local182, local21);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt6919 = arg1.method4815();
		} else if (arg0 == 1) {
			this.anInt6915 = arg1.method4829();
		} else if (arg0 == 2) {
			this.anInt6918 = arg1.method4829();
		} else if (arg0 == 3) {
			this.anInt6916 = arg1.method4829();
		} else if (arg0 == 4) {
			this.anInt6921 = arg1.method4829();
		} else if (arg0 == 5) {
			this.anInt6922 = arg1.method4829();
		} else if (arg0 == 6) {
			this.anInt6924 = arg1.method4815();
		} else if (arg0 == 7) {
			this.anInt6928 = arg1.method4829();
		} else if (arg0 == 8) {
			this.anInt6920 = arg1.method4829();
		}
	}
}
