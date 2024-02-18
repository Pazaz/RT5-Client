import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!md", name = "L", descriptor = "I")
	private int anInt6101 = 6;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub18() {
		super(2, false);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt6101 = arg1.method7396();
		} else if (arg2 == 1) {
			super.aBoolean824 = arg1.method7396() == 1;
		}
		if (arg0) {
			Static389.aClass225_157 = null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (arg0 <= 107) {
			Static389.aString64 = null;
		}
		if (super.aClass180_41.aBoolean338) {
			@Pc(28) int[] local28 = this.method9422(arg1, 0);
			@Pc(34) int[] local34 = this.method9422(arg1, 1);
			@Pc(37) int local37 = this.anInt6101;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static608.anInt9289; local37++) {
					local11[local37] = local28[local37] + local34[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static608.anInt9289; local37++) {
					local11[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static608.anInt9289; local37++) {
					local11[local37] = local34[local37] * local28[local37] >> 12;
				}
			} else {
				@Pc(202) int local202;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static608.anInt9289; local37++) {
						local202 = local34[local37];
						local11[local37] = local202 == 0 ? 4096 : (local28[local37] << 12) / local202;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static608.anInt9289; local37++) {
						local11[local37] = 4096 - ((4096 - local34[local37]) * (-local28[local37] + 4096) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static608.anInt9289; local37++) {
						local202 = local34[local37];
						local11[local37] = local202 < 2048 ? local202 * local28[local37] >> 11 : 4096 - ((4096 - local202) * (-local28[local37] + 4096) >> 11);
					}
				} else {
					@Pc(330) int local330;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static608.anInt9289; local37++) {
							local330 = local28[local37];
							local11[local37] = local330 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local330);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static608.anInt9289; local37++) {
							local330 = local28[local37];
							local11[local37] = local330 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local330;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static608.anInt9289; local37++) {
							local330 = local28[local37];
							local202 = local34[local37];
							local11[local37] = local202 > local330 ? local330 : local202;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static608.anInt9289; local37++) {
							local202 = local34[local37];
							local330 = local28[local37];
							local11[local37] = local202 < local330 ? local330 : local202;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static608.anInt9289; local37++) {
							local330 = local28[local37];
							local202 = local34[local37];
							local11[local37] = local202 < local330 ? local330 - local202 : -local330 + local202;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static608.anInt9289; local37++) {
							local202 = local34[local37];
							local330 = local28[local37];
							local11[local37] = local330 + local202 - (local330 * local202 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737) {
			@Pc(30) int[][] local30 = this.method9413(0, arg0);
			@Pc(36) int[][] local36 = this.method9413(1, arg0);
			@Pc(40) int[] local40 = local11[0];
			@Pc(44) int[] local44 = local11[1];
			@Pc(48) int[] local48 = local11[2];
			@Pc(52) int[] local52 = local30[0];
			@Pc(56) int[] local56 = local30[1];
			@Pc(60) int[] local60 = local30[2];
			@Pc(64) int[] local64 = local36[0];
			@Pc(68) int[] local68 = local36[1];
			@Pc(72) int[] local72 = local36[2];
			@Pc(75) int local75 = this.anInt6101;
			if (local75 == 1) {
				for (local75 = 0; local75 < Static608.anInt9289; local75++) {
					local40[local75] = local64[local75] + local52[local75];
					local44[local75] = local56[local75] + local68[local75];
					local48[local75] = local72[local75] + local60[local75];
				}
			} else if (local75 == 2) {
				for (local75 = 0; local75 < Static608.anInt9289; local75++) {
					local40[local75] = local52[local75] - local64[local75];
					local44[local75] = local56[local75] - local68[local75];
					local48[local75] = local60[local75] - local72[local75];
				}
			} else if (local75 == 3) {
				for (local75 = 0; local75 < Static608.anInt9289; local75++) {
					local40[local75] = local52[local75] * local64[local75] >> 12;
					local44[local75] = local68[local75] * local56[local75] >> 12;
					local48[local75] = local72[local75] * local60[local75] >> 12;
				}
			} else {
				@Pc(317) int local317;
				@Pc(309) int local309;
				@Pc(313) int local313;
				if (local75 == 4) {
					for (local75 = 0; local75 < Static608.anInt9289; local75++) {
						local309 = local68[local75];
						local313 = local72[local75];
						local317 = local64[local75];
						local40[local75] = local317 == 0 ? 4096 : (local52[local75] << 12) / local317;
						local44[local75] = local309 == 0 ? 4096 : (local56[local75] << 12) / local309;
						local48[local75] = local313 == 0 ? 4096 : (local60[local75] << 12) / local313;
					}
				} else if (local75 == 5) {
					for (local75 = 0; local75 < Static608.anInt9289; local75++) {
						local40[local75] = 4096 - ((4096 - local64[local75]) * (-local52[local75] + 4096) >> 12);
						local44[local75] = 4096 - ((4096 - local68[local75]) * (4096 - local56[local75]) >> 12);
						local48[local75] = 4096 - ((4096 - local60[local75]) * (-local72[local75] + 4096) >> 12);
					}
				} else if (local75 == 6) {
					for (local75 = 0; local75 < Static608.anInt9289; local75++) {
						local317 = local64[local75];
						local313 = local72[local75];
						local309 = local68[local75];
						local40[local75] = local317 >= 2048 ? 4096 - ((4096 - local317) * (-local52[local75] + 4096) >> 11) : local317 * local52[local75] >> 11;
						local44[local75] = local309 < 2048 ? local56[local75] * local309 >> 11 : 4096 - ((4096 - local309) * (-local56[local75] + 4096) >> 11);
						local48[local75] = local313 >= 2048 ? 4096 - ((4096 - local313) * (-local60[local75] + 4096) >> 11) : local313 * local60[local75] >> 11;
					}
				} else {
					@Pc(580) int local580;
					@Pc(576) int local576;
					@Pc(572) int local572;
					if (local75 == 7) {
						for (local75 = 0; local75 < Static608.anInt9289; local75++) {
							local572 = local60[local75];
							local576 = local56[local75];
							local580 = local52[local75];
							local40[local75] = local580 == 4096 ? 4096 : (local64[local75] << 12) / (4096 - local580);
							local44[local75] = local576 == 4096 ? 4096 : (local68[local75] << 12) / (4096 - local576);
							local48[local75] = local572 == 4096 ? 4096 : (local72[local75] << 12) / (4096 - local572);
						}
					} else if (local75 == 8) {
						for (local75 = 0; local75 < Static608.anInt9289; local75++) {
							local572 = local60[local75];
							local580 = local52[local75];
							local576 = local56[local75];
							local40[local75] = local580 == 0 ? 0 : 4096 - (4096 - local64[local75] << 12) / local580;
							local44[local75] = local576 == 0 ? 0 : 4096 - (4096 - local68[local75] << 12) / local576;
							local48[local75] = local572 == 0 ? 0 : 4096 - (4096 - local72[local75] << 12) / local572;
						}
					} else if (local75 == 9) {
						for (local75 = 0; local75 < Static608.anInt9289; local75++) {
							local576 = local56[local75];
							local309 = local68[local75];
							local572 = local60[local75];
							local317 = local64[local75];
							local580 = local52[local75];
							local313 = local72[local75];
							local40[local75] = local317 > local580 ? local580 : local317;
							local44[local75] = local309 <= local576 ? local309 : local576;
							local48[local75] = local313 <= local572 ? local313 : local572;
						}
					} else if (local75 == 10) {
						for (local75 = 0; local75 < Static608.anInt9289; local75++) {
							local313 = local72[local75];
							local580 = local52[local75];
							local309 = local68[local75];
							local317 = local64[local75];
							local572 = local60[local75];
							local576 = local56[local75];
							local40[local75] = local580 > local317 ? local580 : local317;
							local44[local75] = local309 < local576 ? local576 : local309;
							local48[local75] = local572 <= local313 ? local313 : local572;
						}
					} else if (local75 == 11) {
						for (local75 = 0; local75 < Static608.anInt9289; local75++) {
							local317 = local64[local75];
							local576 = local56[local75];
							local309 = local68[local75];
							local572 = local60[local75];
							local580 = local52[local75];
							local313 = local72[local75];
							local40[local75] = local317 < local580 ? local580 - local317 : local317 - local580;
							local44[local75] = local309 >= local576 ? local309 - local576 : local576 + -local309;
							local48[local75] = local572 <= local313 ? local313 - local572 : local572 - local313;
						}
					} else if (local75 == 12) {
						for (local75 = 0; local75 < Static608.anInt9289; local75++) {
							local576 = local56[local75];
							local309 = local68[local75];
							local313 = local72[local75];
							local580 = local52[local75];
							local572 = local60[local75];
							local317 = local64[local75];
							local40[local75] = local317 + local580 - (local580 * local317 >> 11);
							local44[local75] = local576 + local309 - (local309 * local576 >> 11);
							local48[local75] = local313 + local572 - (local313 * local572 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
