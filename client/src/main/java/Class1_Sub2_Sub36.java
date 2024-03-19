import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class1_Sub2_Sub36 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vn", name = "X", descriptor = "I")
	private int anInt6983 = 6;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub36() {
		super(2, false);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt6983 = arg1.method5761();
		} else if (arg0 == 1) {
			super.aBoolean515 = arg1.method5761() == 1;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(27) int[][] local27 = this.method6082(0, arg0);
			@Pc(33) int[][] local33 = this.method6082(1, arg0);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			@Pc(72) int local72 = this.anInt6983;
			if (local72 == 1) {
				for (local72 = 0; local72 < Static64.anInt1755; local72++) {
					local37[local72] = local61[local72] + local49[local72];
					local41[local72] = local65[local72] + local53[local72];
					local45[local72] = local57[local72] + local69[local72];
				}
			} else if (local72 == 2) {
				for (local72 = 0; local72 < Static64.anInt1755; local72++) {
					local37[local72] = local49[local72] - local61[local72];
					local41[local72] = local53[local72] - local65[local72];
					local45[local72] = local57[local72] - local69[local72];
				}
			} else if (local72 == 3) {
				for (local72 = 0; local72 < Static64.anInt1755; local72++) {
					local37[local72] = local49[local72] * local61[local72] >> 12;
					local41[local72] = local53[local72] * local65[local72] >> 12;
					local45[local72] = local69[local72] * local57[local72] >> 12;
				}
			} else {
				@Pc(264) int local264;
				@Pc(260) int local260;
				@Pc(268) int local268;
				if (local72 == 4) {
					for (local72 = 0; local72 < Static64.anInt1755; local72++) {
						local260 = local65[local72];
						local264 = local61[local72];
						local268 = local69[local72];
						local37[local72] = local264 == 0 ? 4096 : (local49[local72] << 12) / local264;
						local41[local72] = local260 == 0 ? 4096 : (local53[local72] << 12) / local260;
						local45[local72] = local268 == 0 ? 4096 : (local57[local72] << 12) / local268;
					}
				} else if (local72 == 5) {
					for (local72 = 0; local72 < Static64.anInt1755; local72++) {
						local37[local72] = 4096 - ((4096 - local61[local72]) * (-local49[local72] + 4096) >> 12);
						local41[local72] = 4096 - ((4096 - local65[local72]) * (-local53[local72] + 4096) >> 12);
						local45[local72] = 4096 - ((4096 - local57[local72]) * (-local69[local72] + 4096) >> 12);
					}
				} else if (local72 == 6) {
					for (local72 = 0; local72 < Static64.anInt1755; local72++) {
						local260 = local65[local72];
						local268 = local69[local72];
						local264 = local61[local72];
						local37[local72] = local264 < 2048 ? local49[local72] * local264 >> 11 : 4096 - ((4096 - local264) * (-local49[local72] + 4096) >> 11);
						local41[local72] = local260 >= 2048 ? 4096 - ((4096 - local260) * (4096 - local53[local72]) >> 11) : local260 * local53[local72] >> 11;
						local45[local72] = local268 < 2048 ? local268 * local57[local72] >> 11 : 4096 - ((4096 - local57[local72]) * (-local268 + 4096) >> 11);
					}
				} else {
					@Pc(520) int local520;
					@Pc(516) int local516;
					@Pc(524) int local524;
					if (local72 == 7) {
						for (local72 = 0; local72 < Static64.anInt1755; local72++) {
							local516 = local53[local72];
							local520 = local49[local72];
							local524 = local57[local72];
							local37[local72] = local520 == 4096 ? 4096 : (local61[local72] << 12) / (4096 - local520);
							local41[local72] = local516 == 4096 ? 4096 : (local65[local72] << 12) / (4096 - local516);
							local45[local72] = local524 == 4096 ? 4096 : (local69[local72] << 12) / (4096 - local524);
						}
					} else if (local72 == 8) {
						for (local72 = 0; local72 < Static64.anInt1755; local72++) {
							local520 = local49[local72];
							local516 = local53[local72];
							local524 = local57[local72];
							local37[local72] = local520 == 0 ? 0 : 4096 - (4096 - local61[local72] << 12) / local520;
							local41[local72] = local516 == 0 ? 0 : 4096 - (4096 - local65[local72] << 12) / local516;
							local45[local72] = local524 == 0 ? 0 : 4096 - (4096 - local69[local72] << 12) / local524;
						}
					} else if (local72 == 9) {
						for (local72 = 0; local72 < Static64.anInt1755; local72++) {
							local260 = local65[local72];
							local524 = local57[local72];
							local268 = local69[local72];
							local520 = local49[local72];
							local264 = local61[local72];
							local516 = local53[local72];
							local37[local72] = local520 >= local264 ? local264 : local520;
							local41[local72] = local260 > local516 ? local516 : local260;
							local45[local72] = local268 <= local524 ? local268 : local524;
						}
					} else if (local72 == 10) {
						for (local72 = 0; local72 < Static64.anInt1755; local72++) {
							local268 = local69[local72];
							local260 = local65[local72];
							local524 = local57[local72];
							local264 = local61[local72];
							local516 = local53[local72];
							local520 = local49[local72];
							local37[local72] = local520 <= local264 ? local264 : local520;
							local41[local72] = local516 <= local260 ? local260 : local516;
							local45[local72] = local268 >= local524 ? local268 : local524;
						}
					} else if (local72 == 11) {
						for (local72 = 0; local72 < Static64.anInt1755; local72++) {
							local520 = local49[local72];
							local260 = local65[local72];
							local264 = local61[local72];
							local516 = local53[local72];
							local524 = local57[local72];
							local268 = local69[local72];
							local37[local72] = local520 <= local264 ? local264 - local520 : local520 + -local264;
							local41[local72] = local516 <= local260 ? local260 - local516 : -local260 + local516;
							local45[local72] = local524 <= local268 ? local268 - local524 : local524 + -local268;
						}
					} else if (local72 == 12) {
						for (local72 = 0; local72 < Static64.anInt1755; local72++) {
							local516 = local53[local72];
							local524 = local57[local72];
							local268 = local69[local72];
							local260 = local65[local72];
							local520 = local49[local72];
							local264 = local61[local72];
							local37[local72] = local264 + local520 - (local520 * local264 >> 11);
							local41[local72] = local516 + local260 - (local516 * local260 >> 11);
							local45[local72] = local268 + local524 - (local524 * local268 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(26) int[] local26 = this.method6078(0, arg0);
			@Pc(32) int[] local32 = this.method6078(1, arg0);
			@Pc(35) int local35 = this.anInt6983;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static64.anInt1755; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static64.anInt1755; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static64.anInt1755; local35++) {
					local16[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(163) int local163;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static64.anInt1755; local35++) {
						local163 = local32[local35];
						local16[local35] = local163 == 0 ? 4096 : (local26[local35] << 12) / local163;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static64.anInt1755; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static64.anInt1755; local35++) {
						local163 = local32[local35];
						local16[local35] = local163 >= 2048 ? 4096 - ((4096 - local163) * (-local26[local35] + 4096) >> 11) : local26[local35] * local163 >> 11;
					}
				} else {
					@Pc(272) int local272;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static64.anInt1755; local35++) {
							local272 = local26[local35];
							local16[local35] = local272 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local272);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static64.anInt1755; local35++) {
							local272 = local26[local35];
							local16[local35] = local272 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local272;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static64.anInt1755; local35++) {
							local272 = local26[local35];
							local163 = local32[local35];
							local16[local35] = local163 > local272 ? local272 : local163;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static64.anInt1755; local35++) {
							local272 = local26[local35];
							local163 = local32[local35];
							local16[local35] = local163 < local272 ? local272 : local163;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static64.anInt1755; local35++) {
							local163 = local32[local35];
							local272 = local26[local35];
							local16[local35] = local163 >= local272 ? local163 - local272 : local272 + -local163;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static64.anInt1755; local35++) {
							local163 = local32[local35];
							local272 = local26[local35];
							local16[local35] = local272 + local163 - (local163 * local272 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
