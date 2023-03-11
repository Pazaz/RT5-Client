import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class2_Sub3_Sub30 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
	private int anInt5701 = 6;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub30() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3996(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(26) int[] local26 = this.method6473(0, arg0);
			@Pc(32) int[] local32 = this.method6473(1, arg0);
			@Pc(35) int local35 = this.anInt5701;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static227.anInt4036; local35++) {
					local11[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static227.anInt4036; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static227.anInt4036; local35++) {
					local11[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(166) int local166;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static227.anInt4036; local35++) {
						local166 = local32[local35];
						local11[local35] = local166 == 0 ? 4096 : (local26[local35] << 12) / local166;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static227.anInt4036; local35++) {
						local11[local35] = 4096 - ((4096 - local26[local35]) * (4096 - local32[local35]) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static227.anInt4036; local35++) {
						local166 = local32[local35];
						local11[local35] = local166 < 2048 ? local166 * local26[local35] >> 11 : 4096 - ((4096 - local26[local35]) * (-local166 + 4096) >> 11);
					}
				} else {
					@Pc(277) int local277;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static227.anInt4036; local35++) {
							local277 = local26[local35];
							local11[local35] = local277 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local277);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static227.anInt4036; local35++) {
							local277 = local26[local35];
							local11[local35] = local277 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local277;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static227.anInt4036; local35++) {
							local277 = local26[local35];
							local166 = local32[local35];
							local11[local35] = local166 <= local277 ? local166 : local277;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static227.anInt4036; local35++) {
							local277 = local26[local35];
							local166 = local32[local35];
							local11[local35] = local277 <= local166 ? local166 : local277;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static227.anInt4036; local35++) {
							local166 = local32[local35];
							local277 = local26[local35];
							local11[local35] = local277 <= local166 ? local166 - local277 : local277 + -local166;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static227.anInt4036; local35++) {
							local166 = local32[local35];
							local277 = local26[local35];
							local11[local35] = local166 + local277 - (local277 * local166 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6479(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6277(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(26) int[][] local26 = this.method6483(0, arg0);
			@Pc(32) int[][] local32 = this.method6483(1, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt5701;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static227.anInt4036; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static227.anInt4036; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static227.anInt4036; local71++) {
					local36[local71] = local60[local71] * local48[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(270) int local270;
				@Pc(266) int local266;
				@Pc(274) int local274;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static227.anInt4036; local71++) {
						local266 = local64[local71];
						local270 = local60[local71];
						local274 = local68[local71];
						local36[local71] = local270 == 0 ? 4096 : (local48[local71] << 12) / local270;
						local40[local71] = local266 == 0 ? 4096 : (local52[local71] << 12) / local266;
						local44[local71] = local274 == 0 ? 4096 : (local56[local71] << 12) / local274;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static227.anInt4036; local71++) {
						local36[local71] = 4096 - ((4096 - local60[local71]) * (-local48[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (-local64[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static227.anInt4036; local71++) {
						local266 = local64[local71];
						local270 = local60[local71];
						local274 = local68[local71];
						local36[local71] = local270 >= 2048 ? 4096 - ((4096 - local48[local71]) * (4096 - local270) >> 11) : local270 * local48[local71] >> 11;
						local40[local71] = local266 >= 2048 ? 4096 - ((4096 - local266) * (4096 - local52[local71]) >> 11) : local266 * local52[local71] >> 11;
						local44[local71] = local274 < 2048 ? local274 * local56[local71] >> 11 : 4096 - ((4096 - local274) * (-local56[local71] + 4096) >> 11);
					}
				} else {
					@Pc(535) int local535;
					@Pc(531) int local531;
					@Pc(527) int local527;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static227.anInt4036; local71++) {
							local527 = local56[local71];
							local531 = local52[local71];
							local535 = local48[local71];
							local36[local71] = local535 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local535);
							local40[local71] = local531 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local531);
							local44[local71] = local527 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local527);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static227.anInt4036; local71++) {
							local535 = local48[local71];
							local527 = local56[local71];
							local531 = local52[local71];
							local36[local71] = local535 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local535;
							local40[local71] = local531 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local531;
							local44[local71] = local527 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local527;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static227.anInt4036; local71++) {
							local266 = local64[local71];
							local531 = local52[local71];
							local270 = local60[local71];
							local274 = local68[local71];
							local535 = local48[local71];
							local527 = local56[local71];
							local36[local71] = local535 >= local270 ? local270 : local535;
							local40[local71] = local266 <= local531 ? local266 : local531;
							local44[local71] = local527 < local274 ? local527 : local274;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static227.anInt4036; local71++) {
							local274 = local68[local71];
							local527 = local56[local71];
							local266 = local64[local71];
							local531 = local52[local71];
							local270 = local60[local71];
							local535 = local48[local71];
							local36[local71] = local535 > local270 ? local535 : local270;
							local40[local71] = local531 > local266 ? local531 : local266;
							local44[local71] = local274 >= local527 ? local274 : local527;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static227.anInt4036; local71++) {
							local266 = local64[local71];
							local527 = local56[local71];
							local535 = local48[local71];
							local274 = local68[local71];
							local531 = local52[local71];
							local270 = local60[local71];
							local36[local71] = local270 >= local535 ? local270 - local535 : local535 + -local270;
							local40[local71] = local531 > local266 ? local531 - local266 : local266 + -local531;
							local44[local71] = local274 >= local527 ? local274 - local527 : -local274 + local527;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static227.anInt4036; local71++) {
							local531 = local52[local71];
							local274 = local68[local71];
							local535 = local48[local71];
							local270 = local60[local71];
							local266 = local64[local71];
							local527 = local56[local71];
							local36[local71] = local270 + local535 - (local535 * local270 >> 11);
							local40[local71] = local531 + local266 - (local266 * local531 >> 11);
							local44[local71] = local274 + local527 - (local274 * local527 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt5701 = arg1.g1();
		} else if (arg0 == 1) {
			super.aBoolean487 = arg1.g1() == 1;
		}
	}
}
