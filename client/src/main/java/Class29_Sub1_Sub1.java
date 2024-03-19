import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class29_Sub1_Sub1 extends Class29_Sub1 {

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "[I")
	private final int[] anIntArray64;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!cs;[III)V")
	public Class29_Sub1_Sub1(@OriginalArg(0) Class40_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anIntArray64 = arg1;
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!cs;[IIIII)V")
	public Class29_Sub1_Sub1(@OriginalArg(0) Class40_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg4, arg5);
		this.anIntArray64 = new int[arg4 * arg5];
		@Pc(15) int local15 = arg3 - super.anInt5388;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg5; local19++) {
			for (@Pc(22) int local22 = 0; local22 < arg4; local22++) {
				@Pc(28) int local28 = arg1[arg2++];
				if (local28 >>> 24 == 255) {
					@Pc(37) int local37 = local28 & 0xFFFFFF;
					if (local37 == 0) {
						this.anIntArray64[local17++] = 1;
					} else {
						this.anIntArray64[local17++] = local37;
					}
				} else {
					this.anIntArray64[local17++] = 0;
				}
			}
			arg2 += local15;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (super.aClass40_Sub1_9.method1233()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(20) int local20 = super.aClass40_Sub1_9.anInt1412;
			@Pc(29) int local29 = super.anInt5387 + super.anInt5388 + super.anInt5370;
			@Pc(38) int local38 = super.anInt5395 + super.anInt5394 + super.anInt5396;
			@Pc(44) int local44 = (local29 << 16) / arg2;
			@Pc(50) int local50 = (local38 << 16) / arg3;
			@Pc(64) int local64;
			if (super.anInt5387 > 0) {
				local64 = ((super.anInt5387 << 16) + local44 - 1) / local44;
				arg0 += local64;
				local14 = local64 * local44 - (super.anInt5387 << 16);
			}
			if (super.anInt5395 > 0) {
				local64 = ((super.anInt5395 << 16) + local50 - 1) / local50;
				arg1 += local64;
				local16 = local64 * local50 - (super.anInt5395 << 16);
			}
			if (super.anInt5388 < local29) {
				arg2 = ((super.anInt5388 << 16) + local44 - local14 - 1) / local44;
			}
			if (super.anInt5394 < local38) {
				arg3 = ((super.anInt5394 << 16) + local50 - local16 - 1) / local50;
			}
			local64 = arg0 + arg1 * local20;
			@Pc(152) int local152 = local20 - arg2;
			if (arg1 + arg3 > super.aClass40_Sub1_9.anInt1410) {
				arg3 -= arg1 + arg3 - super.aClass40_Sub1_9.anInt1410;
			}
			@Pc(180) int local180;
			if (arg1 < super.aClass40_Sub1_9.anInt1435) {
				local180 = super.aClass40_Sub1_9.anInt1435 - arg1;
				arg3 -= local180;
				local64 += local180 * local20;
				local16 += local50 * local180;
			}
			if (arg0 + arg2 > super.aClass40_Sub1_9.lb) {
				local180 = arg0 + arg2 - super.aClass40_Sub1_9.lb;
				arg2 -= local180;
				local152 += local180;
			}
			if (arg0 < super.aClass40_Sub1_9.anInt1438) {
				local180 = super.aClass40_Sub1_9.anInt1438 - arg0;
				arg2 -= local180;
				local64 += local180;
				local14 += local44 * local180;
				local152 += local180;
			}
			@Pc(252) int[] local252 = super.aClass40_Sub1_9.anIntArray90;
			@Pc(258) int local258;
			@Pc(261) int local261;
			@Pc(269) int local269;
			@Pc(272) int local272;
			@Pc(330) int local330;
			@Pc(338) int local338;
			@Pc(341) int local341;
			@Pc(351) int local351;
			@Pc(359) int local359;
			@Pc(367) int local367;
			@Pc(375) int local375;
			if (arg6 != 0) {
				@Pc(752) int local752;
				@Pc(760) int local760;
				@Pc(772) int local772;
				if (arg6 == 1) {
					if (arg4 == 0) {
						local258 = local14;
						for (local261 = -arg3; local261 < 0; local261++) {
							local269 = (local16 >> 16) * super.anInt5388;
							for (local272 = -arg2; local272 < 0; local272++) {
								local330 = this.anIntArray64[(local14 >> 16) + local269];
								if (local330 == 0) {
									local64++;
								} else {
									local252[local64++] = local330;
								}
								local14 += local44;
							}
							local16 += local50;
							local14 = local258;
							local64 += local152;
						}
					} else if (arg4 == 1) {
						local258 = local14;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							local261 = arg5 >>> 24;
							local269 = 256 - local261;
							for (local272 = -arg3; local272 < 0; local272++) {
								local330 = (local16 >> 16) * super.anInt5388;
								for (local338 = -arg2; local338 < 0; local338++) {
									local341 = this.anIntArray64[(local14 >> 16) + local330];
									if (local341 == 0) {
										local64++;
									} else {
										local351 = local252[local64];
										local252[local64++] = ((local341 & 0xFF00FF) * local261 + (local351 & 0xFF00FF) * local269 & 0xFF00FF00) + ((local341 & 0xFF00) * local261 + (local351 & 0xFF00) * local269 & 0xFF0000) >> 8;
									}
									local14 += local44;
								}
								local16 += local50;
								local14 = local258;
								local64 += local152;
							}
						} else {
							local261 = arg5 >> 16 & 0xFF;
							local269 = arg5 >> 8 & 0xFF;
							local272 = arg5 & 0xFF;
							local330 = arg5 >>> 24;
							local338 = 256 - local330;
							for (local341 = -arg3; local341 < 0; local341++) {
								local351 = (local16 >> 16) * super.anInt5388;
								for (local359 = -arg2; local359 < 0; local359++) {
									local367 = this.anIntArray64[(local14 >> 16) + local351];
									if (local367 == 0) {
										local64++;
									} else if (local330 == 255) {
										local375 = (local367 & 0xFF0000) * local261 & 0xFF000000;
										local752 = (local367 & 0xFF00) * local269 & 0xFF0000;
										local760 = (local367 & 0xFF) * local272 & 0xFF00;
										local252[local64++] = (local375 | local752 | local760) >>> 8;
									} else {
										local375 = (local367 & 0xFF0000) * local261 & 0xFF000000;
										local752 = (local367 & 0xFF00) * local269 & 0xFF0000;
										local760 = (local367 & 0xFF) * local272 & 0xFF00;
										local367 = (local375 | local752 | local760) >>> 8;
										local772 = local252[local64];
										local252[local64++] = ((local367 & 0xFF00FF) * local330 + (local772 & 0xFF00FF) * local338 & 0xFF00FF00) + ((local367 & 0xFF00) * local330 + (local772 & 0xFF00) * local338 & 0xFF0000) >> 8;
									}
									local14 += local44;
								}
								local16 += local50;
								local14 = local258;
								local64 += local152;
							}
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (arg6 != 2) {
					throw new IllegalArgumentException();
				} else if (arg4 == 0) {
					local258 = local14;
					for (local261 = -arg3; local261 < 0; local261++) {
						local269 = (local16 >> 16) * super.anInt5388;
						for (local272 = -arg2; local272 < 0; local272++) {
							local330 = this.anIntArray64[(local14 >> 16) + local269];
							if (local330 == 0) {
								local64++;
							} else {
								local338 = local252[local64];
								local341 = local330 + local338;
								local351 = (local330 & 0xFF00FF) + (local338 & 0xFF00FF);
								local338 = (local351 & 0x1000100) + (local341 - local351 & 0x10000);
								local252[local64++] = local341 - local338 | local338 - (local338 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local258;
						local64 += local152;
					}
				} else if (arg4 == 1) {
					local258 = local14;
					local261 = arg5 >> 16 & 0xFF;
					local269 = arg5 >> 8 & 0xFF;
					local272 = arg5 & 0xFF;
					for (local330 = -arg3; local330 < 0; local330++) {
						local338 = (local16 >> 16) * super.anInt5388;
						for (local341 = -arg2; local341 < 0; local341++) {
							local351 = this.anIntArray64[(local14 >> 16) + local338];
							if (local351 == 0) {
								local64++;
							} else {
								local359 = (local351 & 0xFF0000) * local261 & 0xFF000000;
								local367 = (local351 & 0xFF00) * local269 & 0xFF0000;
								local375 = (local351 & 0xFF) * local272 & 0xFF00;
								local351 = (local359 | local367 | local375) >>> 8;
								local752 = local252[local64];
								local760 = local351 + local752;
								local772 = (local351 & 0xFF00FF) + (local752 & 0xFF00FF);
								@Pc(1179) int local1179 = (local772 & 0x1000100) + (local760 - local772 & 0x10000);
								local252[local64++] = local760 - local1179 | local1179 - (local1179 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local258;
						local64 += local152;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 == 0) {
				local258 = local14;
				for (local261 = -arg3; local261 < 0; local261++) {
					local269 = (local16 >> 16) * super.anInt5388;
					for (local272 = -arg2; local272 < 0; local272++) {
						local252[local64++] = this.anIntArray64[(local14 >> 16) + local269];
						local14 += local44;
					}
					local16 += local50;
					local14 = local258;
					local64 += local152;
				}
			} else if (arg4 == 1) {
				local258 = arg5 >> 16 & 0xFF;
				local261 = arg5 >> 8 & 0xFF;
				local269 = arg5 & 0xFF;
				local272 = local14;
				for (local330 = -arg3; local330 < 0; local330++) {
					local338 = (local16 >> 16) * super.anInt5388;
					for (local341 = -arg2; local341 < 0; local341++) {
						local351 = this.anIntArray64[(local14 >> 16) + local338];
						local359 = (local351 & 0xFF0000) * local258 & 0xFF000000;
						local367 = (local351 & 0xFF00) * local261 & 0xFF0000;
						local375 = (local351 & 0xFF) * local269 & 0xFF00;
						local252[local64++] = (local359 | local367 | local375) >>> 8;
						local14 += local44;
					}
					local16 += local50;
					local14 = local272;
					local64 += local152;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	@Override
	public void method5833(@OriginalArg(2) int arg0) {
		throw new IllegalStateException("Can't capture alpha into a java_sprite_24");
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
	@Override
	protected void method4587(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass40_Sub1_9.anIntArray90;
		@Pc(637) int local637;
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(48) int local48;
		@Pc(51) int local51;
		@Pc(162) int local162;
		@Pc(188) int local188;
		@Pc(192) int local192;
		@Pc(196) int local196;
		@Pc(268) int local268;
		if (Static34.anInt5377 == 0) {
			if (Static34.anInt5390 == 0) {
				local9 = Static34.anInt5378;
				while (local9 < 0) {
					local12 = Static34.anInt5384;
					local14 = Static34.anInt5382;
					local16 = Static34.anInt5399;
					local18 = Static34.anInt5398;
					if (local14 >= 0 && local16 >= 0 && local14 - (super.anInt5388 << 12) < 0 && local16 - (super.anInt5394 << 12) < 0) {
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt5388 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 0) {
								local162 = this.anIntArray64[local48];
								if (local162 != 0) {
									local3[local51] = local162;
								}
							} else if (arg0 == 1) {
								local162 = this.anIntArray64[local48];
								if (local162 != 0) {
									if ((Static34.anInt5385 & 0xFFFFFF) == 16777215) {
										local188 = Static34.anInt5385 >>> 24;
										local192 = 256 - local188;
										local196 = local3[local51];
										local3[local51] = ((local162 & 0xFF00FF) * local188 + (local196 & 0xFF00FF) * local192 & 0xFF00FF00) + ((local162 & 0xFF00) * local188 + (local196 & 0xFF00) * local192 & 0xFF0000) >> 8;
									} else if (Static34.anInt5371 == 255) {
										local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
										local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
										local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
										local3[local51] = (local188 | local192 | local196) >>> 8;
									} else {
										local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
										local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
										local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
										local162 = (local188 | local192 | local196) >>> 8;
										local268 = local3[local51];
										local3[local51] = ((local162 & 0xFF00FF) * Static34.anInt5371 + (local268 & 0xFF00FF) * Static34.anInt5386 & 0xFF00FF00) + ((local162 & 0xFF00) * Static34.anInt5371 + (local268 & 0xFF00) * Static34.anInt5386 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 2) {
								local162 = this.anIntArray64[local48];
								if (local162 != 0) {
									local188 = (local162 & 0xFF00FF) * Static34.anInt5371 & 0xFF00FF00;
									local192 = (local162 & 0xFF00) * Static34.anInt5371 & 0xFF0000;
									local3[local51++] = ((local188 | local192) >>> 8) + Static34.anInt5381;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local18++;
						}
					}
					local9++;
					Static34.anInt5384 += Static34.anInt5397;
				}
			} else if (Static34.anInt5390 < 0) {
				local9 = Static34.anInt5378;
				while (local9 < 0) {
					local12 = Static34.anInt5384;
					local14 = Static34.anInt5382;
					local16 = Static34.anInt5399 + Static34.anInt5373;
					local18 = Static34.anInt5398;
					if (local14 >= 0 && local14 - (super.anInt5388 << 12) < 0) {
						@Pc(630) int local630;
						if ((local630 = local16 - (super.anInt5394 << 12)) >= 0) {
							local637 = (Static34.anInt5390 - local630) / Static34.anInt5390;
							local18 += local637;
							local16 += Static34.anInt5390 * local637;
							local12 += local637;
						}
						@Pc(658) int local658;
						if ((local658 = (local16 - Static34.anInt5390) / Static34.anInt5390) > local18) {
							local18 = local658;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt5388 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 0) {
								local162 = this.anIntArray64[local48];
								if (local162 != 0) {
									local3[local51] = local162;
								}
							} else if (arg0 == 1) {
								local162 = this.anIntArray64[local48];
								if (local162 != 0) {
									if ((Static34.anInt5385 & 0xFFFFFF) == 16777215) {
										local188 = Static34.anInt5385 >>> 24;
										local192 = 256 - local188;
										local196 = local3[local51];
										local3[local51] = ((local162 & 0xFF00FF) * local188 + (local196 & 0xFF00FF) * local192 & 0xFF00FF00) + ((local162 & 0xFF00) * local188 + (local196 & 0xFF00) * local192 & 0xFF0000) >> 8;
									} else if (Static34.anInt5371 == 255) {
										local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
										local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
										local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
										local3[local51] = (local188 | local192 | local196) >>> 8;
									} else {
										local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
										local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
										local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
										local162 = (local188 | local192 | local196) >>> 8;
										local268 = local3[local51];
										local3[local51] = ((local162 & 0xFF00FF) * Static34.anInt5371 + (local268 & 0xFF00FF) * Static34.anInt5386 & 0xFF00FF00) + ((local162 & 0xFF00) * Static34.anInt5371 + (local268 & 0xFF00) * Static34.anInt5386 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 2) {
								local162 = this.anIntArray64[local48];
								if (local162 != 0) {
									local188 = (local162 & 0xFF00FF) * Static34.anInt5371 & 0xFF00FF00;
									local192 = (local162 & 0xFF00) * Static34.anInt5371 & 0xFF0000;
									local3[local51++] = ((local188 | local192) >>> 8) + Static34.anInt5381;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static34.anInt5390;
							local18++;
						}
					}
					local9++;
					Static34.anInt5382 += Static34.anInt5372;
					Static34.anInt5384 += Static34.anInt5397;
				}
			} else {
				local9 = Static34.anInt5378;
				while (local9 < 0) {
					local12 = Static34.anInt5384;
					local14 = Static34.anInt5382;
					local16 = Static34.anInt5399 + Static34.anInt5373;
					local18 = Static34.anInt5398;
					if (local14 >= 0 && local14 - (super.anInt5388 << 12) < 0) {
						if (local16 < 0) {
							local637 = (Static34.anInt5390 - local16 - 1) / Static34.anInt5390;
							local18 += local637;
							local16 += Static34.anInt5390 * local637;
							local12 += local637;
						}
						@Pc(1292) int local1292;
						if ((local1292 = (local16 + 1 - (super.anInt5394 << 12) - Static34.anInt5390) / Static34.anInt5390) > local18) {
							local18 = local1292;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt5388 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 0) {
								local162 = this.anIntArray64[local48];
								if (local162 != 0) {
									local3[local51] = local162;
								}
							} else if (arg0 == 1) {
								local162 = this.anIntArray64[local48];
								if (local162 != 0) {
									if ((Static34.anInt5385 & 0xFFFFFF) == 16777215) {
										local188 = Static34.anInt5385 >>> 24;
										local192 = 256 - local188;
										local196 = local3[local51];
										local3[local51] = ((local162 & 0xFF00FF) * local188 + (local196 & 0xFF00FF) * local192 & 0xFF00FF00) + ((local162 & 0xFF00) * local188 + (local196 & 0xFF00) * local192 & 0xFF0000) >> 8;
									} else if (Static34.anInt5371 == 255) {
										local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
										local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
										local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
										local3[local51] = (local188 | local192 | local196) >>> 8;
									} else {
										local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
										local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
										local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
										local162 = (local188 | local192 | local196) >>> 8;
										local268 = local3[local51];
										local3[local51] = ((local162 & 0xFF00FF) * Static34.anInt5371 + (local268 & 0xFF00FF) * Static34.anInt5386 & 0xFF00FF00) + ((local162 & 0xFF00) * Static34.anInt5371 + (local268 & 0xFF00) * Static34.anInt5386 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 2) {
								local162 = this.anIntArray64[local48];
								if (local162 != 0) {
									local188 = (local162 & 0xFF00FF) * Static34.anInt5371 & 0xFF00FF00;
									local192 = (local162 & 0xFF00) * Static34.anInt5371 & 0xFF0000;
									local3[local51++] = ((local188 | local192) >>> 8) + Static34.anInt5381;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static34.anInt5390;
							local18++;
						}
					}
					local9++;
					Static34.anInt5382 += Static34.anInt5372;
					Static34.anInt5384 += Static34.anInt5397;
				}
			}
		} else if (Static34.anInt5377 < 0) {
			if (Static34.anInt5390 == 0) {
				local9 = Static34.anInt5378;
				while (local9 < 0) {
					local12 = Static34.anInt5384;
					local14 = Static34.anInt5382 + Static34.anInt5391;
					local16 = Static34.anInt5399;
					local18 = Static34.anInt5398;
					if (local16 >= 0 && local16 - (super.anInt5394 << 12) < 0) {
						@Pc(1900) int local1900;
						if ((local1900 = local14 - (super.anInt5388 << 12)) >= 0) {
							local637 = (Static34.anInt5377 - local1900) / Static34.anInt5377;
							local18 += local637;
							local14 += Static34.anInt5377 * local637;
							local12 += local637;
						}
						@Pc(1928) int local1928;
						if ((local1928 = (local14 - Static34.anInt5377) / Static34.anInt5377) > local18) {
							local18 = local1928;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt5388 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 0) {
								local162 = this.anIntArray64[local48];
								if (local162 != 0) {
									local3[local51] = local162;
								}
							} else if (arg0 == 1) {
								local162 = this.anIntArray64[local48];
								if (local162 != 0) {
									if ((Static34.anInt5385 & 0xFFFFFF) == 16777215) {
										local188 = Static34.anInt5385 >>> 24;
										local192 = 256 - local188;
										local196 = local3[local51];
										local3[local51] = ((local162 & 0xFF00FF) * local188 + (local196 & 0xFF00FF) * local192 & 0xFF00FF00) + ((local162 & 0xFF00) * local188 + (local196 & 0xFF00) * local192 & 0xFF0000) >> 8;
									} else if (Static34.anInt5371 == 255) {
										local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
										local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
										local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
										local3[local51] = (local188 | local192 | local196) >>> 8;
									} else {
										local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
										local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
										local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
										local162 = (local188 | local192 | local196) >>> 8;
										local268 = local3[local51];
										local3[local51] = ((local162 & 0xFF00FF) * Static34.anInt5371 + (local268 & 0xFF00FF) * Static34.anInt5386 & 0xFF00FF00) + ((local162 & 0xFF00) * Static34.anInt5371 + (local268 & 0xFF00) * Static34.anInt5386 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 2) {
								local162 = this.anIntArray64[local48];
								if (local162 != 0) {
									local188 = (local162 & 0xFF00FF) * Static34.anInt5371 & 0xFF00FF00;
									local192 = (local162 & 0xFF00) * Static34.anInt5371 & 0xFF0000;
									local3[local51++] = ((local188 | local192) >>> 8) + Static34.anInt5381;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local14 += Static34.anInt5377;
							local18++;
						}
					}
					local9++;
					Static34.anInt5399 += Static34.anInt5379;
					Static34.anInt5384 += Static34.anInt5397;
				}
			} else if (Static34.anInt5390 < 0) {
				local9 = Static34.anInt5378;
				while (local9 < 0) {
					local12 = Static34.anInt5384;
					local14 = Static34.anInt5382 + Static34.anInt5391;
					local16 = Static34.anInt5399 + Static34.anInt5373;
					local18 = Static34.anInt5398;
					@Pc(2527) int local2527;
					if ((local2527 = local14 - (super.anInt5388 << 12)) >= 0) {
						local637 = (Static34.anInt5377 - local2527) / Static34.anInt5377;
						local18 += local637;
						local14 += Static34.anInt5377 * local637;
						local16 += Static34.anInt5390 * local637;
						local12 += local637;
					}
					@Pc(2561) int local2561;
					if ((local2561 = (local14 - Static34.anInt5377) / Static34.anInt5377) > local18) {
						local18 = local2561;
					}
					@Pc(2573) int local2573;
					if ((local2573 = local16 - (super.anInt5394 << 12)) >= 0) {
						local637 = (Static34.anInt5390 - local2573) / Static34.anInt5390;
						local18 += local637;
						local14 += Static34.anInt5377 * local637;
						local16 += Static34.anInt5390 * local637;
						local12 += local637;
					}
					@Pc(2607) int local2607;
					if ((local2607 = (local16 - Static34.anInt5390) / Static34.anInt5390) > local18) {
						local18 = local2607;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt5388 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 0) {
							local162 = this.anIntArray64[local48];
							if (local162 != 0) {
								local3[local51] = local162;
							}
						} else if (arg0 == 1) {
							local162 = this.anIntArray64[local48];
							if (local162 != 0) {
								if ((Static34.anInt5385 & 0xFFFFFF) == 16777215) {
									local188 = Static34.anInt5385 >>> 24;
									local192 = 256 - local188;
									local196 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * local188 + (local196 & 0xFF00FF) * local192 & 0xFF00FF00) + ((local162 & 0xFF00) * local188 + (local196 & 0xFF00) * local192 & 0xFF0000) >> 8;
								} else if (Static34.anInt5371 == 255) {
									local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
									local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
									local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
									local3[local51] = (local188 | local192 | local196) >>> 8;
								} else {
									local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
									local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
									local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
									local162 = (local188 | local192 | local196) >>> 8;
									local268 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * Static34.anInt5371 + (local268 & 0xFF00FF) * Static34.anInt5386 & 0xFF00FF00) + ((local162 & 0xFF00) * Static34.anInt5371 + (local268 & 0xFF00) * Static34.anInt5386 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 2) {
							local162 = this.anIntArray64[local48];
							if (local162 != 0) {
								local188 = (local162 & 0xFF00FF) * Static34.anInt5371 & 0xFF00FF00;
								local192 = (local162 & 0xFF00) * Static34.anInt5371 & 0xFF0000;
								local3[local51++] = ((local188 | local192) >>> 8) + Static34.anInt5381;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static34.anInt5377;
						local16 += Static34.anInt5390;
						local18++;
					}
					local9++;
					Static34.anInt5382 += Static34.anInt5372;
					Static34.anInt5399 += Static34.anInt5379;
					Static34.anInt5384 += Static34.anInt5397;
				}
			} else {
				local9 = Static34.anInt5378;
				while (local9 < 0) {
					local12 = Static34.anInt5384;
					local14 = Static34.anInt5382 + Static34.anInt5391;
					local16 = Static34.anInt5399 + Static34.anInt5373;
					local18 = Static34.anInt5398;
					@Pc(3212) int local3212;
					if ((local3212 = local14 - (super.anInt5388 << 12)) >= 0) {
						local637 = (Static34.anInt5377 - local3212) / Static34.anInt5377;
						local18 += local637;
						local14 += Static34.anInt5377 * local637;
						local16 += Static34.anInt5390 * local637;
						local12 += local637;
					}
					@Pc(3246) int local3246;
					if ((local3246 = (local14 - Static34.anInt5377) / Static34.anInt5377) > local18) {
						local18 = local3246;
					}
					if (local16 < 0) {
						local637 = (Static34.anInt5390 - local16 - 1) / Static34.anInt5390;
						local18 += local637;
						local14 += Static34.anInt5377 * local637;
						local16 += Static34.anInt5390 * local637;
						local12 += local637;
					}
					@Pc(3294) int local3294;
					if ((local3294 = (local16 + 1 - (super.anInt5394 << 12) - Static34.anInt5390) / Static34.anInt5390) > local18) {
						local18 = local3294;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt5388 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 0) {
							local162 = this.anIntArray64[local48];
							if (local162 != 0) {
								local3[local51] = local162;
							}
						} else if (arg0 == 1) {
							local162 = this.anIntArray64[local48];
							if (local162 != 0) {
								if ((Static34.anInt5385 & 0xFFFFFF) == 16777215) {
									local188 = Static34.anInt5385 >>> 24;
									local192 = 256 - local188;
									local196 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * local188 + (local196 & 0xFF00FF) * local192 & 0xFF00FF00) + ((local162 & 0xFF00) * local188 + (local196 & 0xFF00) * local192 & 0xFF0000) >> 8;
								} else if (Static34.anInt5371 == 255) {
									local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
									local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
									local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
									local3[local51] = (local188 | local192 | local196) >>> 8;
								} else {
									local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
									local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
									local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
									local162 = (local188 | local192 | local196) >>> 8;
									local268 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * Static34.anInt5371 + (local268 & 0xFF00FF) * Static34.anInt5386 & 0xFF00FF00) + ((local162 & 0xFF00) * Static34.anInt5371 + (local268 & 0xFF00) * Static34.anInt5386 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 2) {
							local162 = this.anIntArray64[local48];
							if (local162 != 0) {
								local188 = (local162 & 0xFF00FF) * Static34.anInt5371 & 0xFF00FF00;
								local192 = (local162 & 0xFF00) * Static34.anInt5371 & 0xFF0000;
								local3[local51++] = ((local188 | local192) >>> 8) + Static34.anInt5381;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static34.anInt5377;
						local16 += Static34.anInt5390;
						local18++;
					}
					local9++;
					Static34.anInt5382 += Static34.anInt5372;
					Static34.anInt5399 += Static34.anInt5379;
					Static34.anInt5384 += Static34.anInt5397;
				}
			}
		} else if (Static34.anInt5390 == 0) {
			local9 = Static34.anInt5378;
			while (local9 < 0) {
				local12 = Static34.anInt5384;
				local14 = Static34.anInt5382 + Static34.anInt5391;
				local16 = Static34.anInt5399;
				local18 = Static34.anInt5398;
				if (local16 >= 0 && local16 - (super.anInt5394 << 12) < 0) {
					if (local14 < 0) {
						local637 = (Static34.anInt5377 - local14 - 1) / Static34.anInt5377;
						local18 += local637;
						local14 += Static34.anInt5377 * local637;
						local12 += local637;
					}
					@Pc(3938) int local3938;
					if ((local3938 = (local14 + 1 - (super.anInt5388 << 12) - Static34.anInt5377) / Static34.anInt5377) > local18) {
						local18 = local3938;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt5388 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 0) {
							local162 = this.anIntArray64[local48];
							if (local162 != 0) {
								local3[local51] = local162;
							}
						} else if (arg0 == 1) {
							local162 = this.anIntArray64[local48];
							if (local162 != 0) {
								if ((Static34.anInt5385 & 0xFFFFFF) == 16777215) {
									local188 = Static34.anInt5385 >>> 24;
									local192 = 256 - local188;
									local196 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * local188 + (local196 & 0xFF00FF) * local192 & 0xFF00FF00) + ((local162 & 0xFF00) * local188 + (local196 & 0xFF00) * local192 & 0xFF0000) >> 8;
								} else if (Static34.anInt5371 == 255) {
									local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
									local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
									local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
									local3[local51] = (local188 | local192 | local196) >>> 8;
								} else {
									local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
									local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
									local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
									local162 = (local188 | local192 | local196) >>> 8;
									local268 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * Static34.anInt5371 + (local268 & 0xFF00FF) * Static34.anInt5386 & 0xFF00FF00) + ((local162 & 0xFF00) * Static34.anInt5371 + (local268 & 0xFF00) * Static34.anInt5386 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 2) {
							local162 = this.anIntArray64[local48];
							if (local162 != 0) {
								local188 = (local162 & 0xFF00FF) * Static34.anInt5371 & 0xFF00FF00;
								local192 = (local162 & 0xFF00) * Static34.anInt5371 & 0xFF0000;
								local3[local51++] = ((local188 | local192) >>> 8) + Static34.anInt5381;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static34.anInt5377;
						local18++;
					}
				}
				local9++;
				Static34.anInt5382 += Static34.anInt5372;
				Static34.anInt5399 += Static34.anInt5379;
				Static34.anInt5384 += Static34.anInt5397;
			}
		} else if (Static34.anInt5390 < 0) {
			for (local9 = Static34.anInt5378; local9 < 0; local9++) {
				local12 = Static34.anInt5384;
				local14 = Static34.anInt5382 + Static34.anInt5391;
				local16 = Static34.anInt5399 + Static34.anInt5373;
				local18 = Static34.anInt5398;
				if (local14 < 0) {
					local637 = (Static34.anInt5377 - local14 - 1) / Static34.anInt5377;
					local18 += local637;
					local14 += Static34.anInt5377 * local637;
					local16 += Static34.anInt5390 * local637;
					local12 += local637;
				}
				@Pc(4577) int local4577;
				if ((local4577 = (local14 + 1 - (super.anInt5388 << 12) - Static34.anInt5377) / Static34.anInt5377) > local18) {
					local18 = local4577;
				}
				@Pc(4589) int local4589;
				if ((local4589 = local16 - (super.anInt5394 << 12)) >= 0) {
					local637 = (Static34.anInt5390 - local4589) / Static34.anInt5390;
					local18 += local637;
					local14 += Static34.anInt5377 * local637;
					local16 += Static34.anInt5390 * local637;
					local12 += local637;
				}
				@Pc(4623) int local4623;
				if ((local4623 = (local16 - Static34.anInt5390) / Static34.anInt5390) > local18) {
					local18 = local4623;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt5388 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 0) {
						local162 = this.anIntArray64[local48];
						if (local162 != 0) {
							local3[local51] = local162;
						}
					} else if (arg0 == 1) {
						local162 = this.anIntArray64[local48];
						if (local162 != 0) {
							if ((Static34.anInt5385 & 0xFFFFFF) == 16777215) {
								local188 = Static34.anInt5385 >>> 24;
								local192 = 256 - local188;
								local196 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local188 + (local196 & 0xFF00FF) * local192 & 0xFF00FF00) + ((local162 & 0xFF00) * local188 + (local196 & 0xFF00) * local192 & 0xFF0000) >> 8;
							} else if (Static34.anInt5371 == 255) {
								local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
								local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
								local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
								local3[local51] = (local188 | local192 | local196) >>> 8;
							} else {
								local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
								local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
								local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
								local162 = (local188 | local192 | local196) >>> 8;
								local268 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * Static34.anInt5371 + (local268 & 0xFF00FF) * Static34.anInt5386 & 0xFF00FF00) + ((local162 & 0xFF00) * Static34.anInt5371 + (local268 & 0xFF00) * Static34.anInt5386 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 2) {
						local162 = this.anIntArray64[local48];
						if (local162 != 0) {
							local188 = (local162 & 0xFF00FF) * Static34.anInt5371 & 0xFF00FF00;
							local192 = (local162 & 0xFF00) * Static34.anInt5371 & 0xFF0000;
							local3[local51++] = ((local188 | local192) >>> 8) + Static34.anInt5381;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static34.anInt5377;
					local16 += Static34.anInt5390;
					local18++;
				}
				Static34.anInt5382 += Static34.anInt5372;
				Static34.anInt5399 += Static34.anInt5379;
				Static34.anInt5384 += Static34.anInt5397;
			}
		} else {
			for (local9 = Static34.anInt5378; local9 < 0; local9++) {
				local12 = Static34.anInt5384;
				local14 = Static34.anInt5382 + Static34.anInt5391;
				local16 = Static34.anInt5399 + Static34.anInt5373;
				local18 = Static34.anInt5398;
				if (local14 < 0) {
					local637 = (Static34.anInt5377 - local14 - 1) / Static34.anInt5377;
					local18 += local637;
					local14 += Static34.anInt5377 * local637;
					local16 += Static34.anInt5390 * local637;
					local12 += local637;
				}
				@Pc(5264) int local5264;
				if ((local5264 = (local14 + 1 - (super.anInt5388 << 12) - Static34.anInt5377) / Static34.anInt5377) > local18) {
					local18 = local5264;
				}
				if (local16 < 0) {
					local637 = (Static34.anInt5390 - local16 - 1) / Static34.anInt5390;
					local18 += local637;
					local14 += Static34.anInt5377 * local637;
					local16 += Static34.anInt5390 * local637;
					local12 += local637;
				}
				@Pc(5312) int local5312;
				if ((local5312 = (local16 + 1 - (super.anInt5394 << 12) - Static34.anInt5390) / Static34.anInt5390) > local18) {
					local18 = local5312;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt5388 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 0) {
						local162 = this.anIntArray64[local48];
						if (local162 != 0) {
							local3[local51] = local162;
						}
					} else if (arg0 == 1) {
						local162 = this.anIntArray64[local48];
						if (local162 != 0) {
							if ((Static34.anInt5385 & 0xFFFFFF) == 16777215) {
								local188 = Static34.anInt5385 >>> 24;
								local192 = 256 - local188;
								local196 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local188 + (local196 & 0xFF00FF) * local192 & 0xFF00FF00) + ((local162 & 0xFF00) * local188 + (local196 & 0xFF00) * local192 & 0xFF0000) >> 8;
							} else if (Static34.anInt5371 == 255) {
								local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
								local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
								local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
								local3[local51] = (local188 | local192 | local196) >>> 8;
							} else {
								local188 = (local162 & 0xFF0000) * Static34.anInt5374 & 0xFF000000;
								local192 = (local162 & 0xFF00) * Static34.anInt5400 & 0xFF0000;
								local196 = (local162 & 0xFF) * Static34.anInt5383 & 0xFF00;
								local162 = (local188 | local192 | local196) >>> 8;
								local268 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * Static34.anInt5371 + (local268 & 0xFF00FF) * Static34.anInt5386 & 0xFF00FF00) + ((local162 & 0xFF00) * Static34.anInt5371 + (local268 & 0xFF00) * Static34.anInt5386 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 2) {
						local162 = this.anIntArray64[local48];
						if (local162 != 0) {
							local188 = (local162 & 0xFF00FF) * Static34.anInt5371 & 0xFF00FF00;
							local192 = (local162 & 0xFF00) * Static34.anInt5371 & 0xFF0000;
							local3[local51++] = ((local188 | local192) >>> 8) + Static34.anInt5381;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static34.anInt5377;
					local16 += Static34.anInt5390;
					local18++;
				}
				Static34.anInt5382 += Static34.anInt5372;
				Static34.anInt5399 += Static34.anInt5379;
				Static34.anInt5384 += Static34.anInt5397;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method4585(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass40_Sub1_9.anIntArray90;
		@Pc(181) int local181;
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(53) int local53;
		@Pc(58) int local58;
		@Pc(64) int local64;
		@Pc(111) int local111;
		if (Static34.anInt5377 == 0) {
			if (Static34.anInt5390 == 0) {
				local9 = Static34.anInt5378;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static34.anInt5384;
						local25 = Static34.anInt5382;
						local27 = Static34.anInt5399;
						local29 = Static34.anInt5398;
						if (local25 >= 0 && local27 >= 0 && local25 - (super.anInt5388 << 12) < 0 && local27 - (super.anInt5394 << 12) < 0) {
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static34.anInt5384 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static34.anInt5377 * local64;
								local27 += Static34.anInt5390 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray64[(local27 >> 12) * super.anInt5388 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local29++;
							}
						}
					}
					local9++;
					Static34.anInt5384 += Static34.anInt5397;
				}
			} else if (Static34.anInt5390 < 0) {
				local9 = Static34.anInt5378;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static34.anInt5384;
						local25 = Static34.anInt5382;
						local27 = Static34.anInt5399 + Static34.anInt5373;
						local29 = Static34.anInt5398;
						if (local25 >= 0 && local25 - (super.anInt5388 << 12) < 0) {
							@Pc(174) int local174;
							if ((local174 = local27 - (super.anInt5394 << 12)) >= 0) {
								local181 = (Static34.anInt5390 - local174) / Static34.anInt5390;
								local29 += local181;
								local27 += Static34.anInt5390 * local181;
								local23 += local181;
							}
							@Pc(202) int local202;
							if ((local202 = (local27 - Static34.anInt5390) / Static34.anInt5390) > local29) {
								local29 = local202;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static34.anInt5384 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static34.anInt5377 * local64;
								local27 += Static34.anInt5390 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray64[(local27 >> 12) * super.anInt5388 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local27 += Static34.anInt5390;
								local29++;
							}
						}
					}
					local9++;
					Static34.anInt5382 += Static34.anInt5372;
					Static34.anInt5384 += Static34.anInt5397;
				}
			} else {
				local9 = Static34.anInt5378;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static34.anInt5384;
						local25 = Static34.anInt5382;
						local27 = Static34.anInt5399 + Static34.anInt5373;
						local29 = Static34.anInt5398;
						if (local25 >= 0 && local25 - (super.anInt5388 << 12) < 0) {
							if (local27 < 0) {
								local181 = (Static34.anInt5390 - local27 - 1) / Static34.anInt5390;
								local29 += local181;
								local27 += Static34.anInt5390 * local181;
								local23 += local181;
							}
							@Pc(369) int local369;
							if ((local369 = (local27 + 1 - (super.anInt5394 << 12) - Static34.anInt5390) / Static34.anInt5390) > local29) {
								local29 = local369;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static34.anInt5384 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static34.anInt5377 * local64;
								local27 += Static34.anInt5390 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray64[(local27 >> 12) * super.anInt5388 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local27 += Static34.anInt5390;
								local29++;
							}
						}
					}
					local9++;
					Static34.anInt5382 += Static34.anInt5372;
					Static34.anInt5384 += Static34.anInt5397;
				}
			}
		} else if (Static34.anInt5377 < 0) {
			if (Static34.anInt5390 == 0) {
				local9 = Static34.anInt5378;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static34.anInt5384;
						local25 = Static34.anInt5382 + Static34.anInt5391;
						local27 = Static34.anInt5399;
						local29 = Static34.anInt5398;
						if (local27 >= 0 && local27 - (super.anInt5394 << 12) < 0) {
							@Pc(510) int local510;
							if ((local510 = local25 - (super.anInt5388 << 12)) >= 0) {
								local181 = (Static34.anInt5377 - local510) / Static34.anInt5377;
								local29 += local181;
								local25 += Static34.anInt5377 * local181;
								local23 += local181;
							}
							@Pc(538) int local538;
							if ((local538 = (local25 - Static34.anInt5377) / Static34.anInt5377) > local29) {
								local29 = local538;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static34.anInt5384 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static34.anInt5377 * local64;
								local27 += Static34.anInt5390 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray64[(local27 >> 12) * super.anInt5388 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local25 += Static34.anInt5377;
								local29++;
							}
						}
					}
					local9++;
					Static34.anInt5399 += Static34.anInt5379;
					Static34.anInt5384 += Static34.anInt5397;
				}
			} else if (Static34.anInt5390 < 0) {
				local9 = Static34.anInt5378;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static34.anInt5384;
						local25 = Static34.anInt5382 + Static34.anInt5391;
						local27 = Static34.anInt5399 + Static34.anInt5373;
						local29 = Static34.anInt5398;
						@Pc(670) int local670;
						if ((local670 = local25 - (super.anInt5388 << 12)) >= 0) {
							local181 = (Static34.anInt5377 - local670) / Static34.anInt5377;
							local29 += local181;
							local25 += Static34.anInt5377 * local181;
							local27 += Static34.anInt5390 * local181;
							local23 += local181;
						}
						@Pc(704) int local704;
						if ((local704 = (local25 - Static34.anInt5377) / Static34.anInt5377) > local29) {
							local29 = local704;
						}
						@Pc(716) int local716;
						if ((local716 = local27 - (super.anInt5394 << 12)) >= 0) {
							local181 = (Static34.anInt5390 - local716) / Static34.anInt5390;
							local29 += local181;
							local25 += Static34.anInt5377 * local181;
							local27 += Static34.anInt5390 * local181;
							local23 += local181;
						}
						@Pc(750) int local750;
						if ((local750 = (local27 - Static34.anInt5390) / Static34.anInt5390) > local29) {
							local29 = local750;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static34.anInt5384 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static34.anInt5377 * local64;
							local27 += Static34.anInt5390 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray64[(local27 >> 12) * super.anInt5388 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = local111;
							}
							local25 += Static34.anInt5377;
							local27 += Static34.anInt5390;
							local29++;
						}
					}
					local9++;
					Static34.anInt5382 += Static34.anInt5372;
					Static34.anInt5399 += Static34.anInt5379;
					Static34.anInt5384 += Static34.anInt5397;
				}
			} else {
				local9 = Static34.anInt5378;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static34.anInt5384;
						local25 = Static34.anInt5382 + Static34.anInt5391;
						local27 = Static34.anInt5399 + Static34.anInt5373;
						local29 = Static34.anInt5398;
						@Pc(888) int local888;
						if ((local888 = local25 - (super.anInt5388 << 12)) >= 0) {
							local181 = (Static34.anInt5377 - local888) / Static34.anInt5377;
							local29 += local181;
							local25 += Static34.anInt5377 * local181;
							local27 += Static34.anInt5390 * local181;
							local23 += local181;
						}
						@Pc(922) int local922;
						if ((local922 = (local25 - Static34.anInt5377) / Static34.anInt5377) > local29) {
							local29 = local922;
						}
						if (local27 < 0) {
							local181 = (Static34.anInt5390 - local27 - 1) / Static34.anInt5390;
							local29 += local181;
							local25 += Static34.anInt5377 * local181;
							local27 += Static34.anInt5390 * local181;
							local23 += local181;
						}
						@Pc(970) int local970;
						if ((local970 = (local27 + 1 - (super.anInt5394 << 12) - Static34.anInt5390) / Static34.anInt5390) > local29) {
							local29 = local970;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static34.anInt5384 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static34.anInt5377 * local64;
							local27 += Static34.anInt5390 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray64[(local27 >> 12) * super.anInt5388 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = local111;
							}
							local25 += Static34.anInt5377;
							local27 += Static34.anInt5390;
							local29++;
						}
					}
					local9++;
					Static34.anInt5382 += Static34.anInt5372;
					Static34.anInt5399 += Static34.anInt5379;
					Static34.anInt5384 += Static34.anInt5397;
				}
			}
		} else if (Static34.anInt5390 == 0) {
			local9 = Static34.anInt5378;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static34.anInt5384;
					local25 = Static34.anInt5382 + Static34.anInt5391;
					local27 = Static34.anInt5399;
					local29 = Static34.anInt5398;
					if (local27 >= 0 && local27 - (super.anInt5394 << 12) < 0) {
						if (local25 < 0) {
							local181 = (Static34.anInt5377 - local25 - 1) / Static34.anInt5377;
							local29 += local181;
							local25 += Static34.anInt5377 * local181;
							local23 += local181;
						}
						@Pc(1147) int local1147;
						if ((local1147 = (local25 + 1 - (super.anInt5388 << 12) - Static34.anInt5377) / Static34.anInt5377) > local29) {
							local29 = local1147;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static34.anInt5384 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static34.anInt5377 * local64;
							local27 += Static34.anInt5390 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray64[(local27 >> 12) * super.anInt5388 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = local111;
							}
							local25 += Static34.anInt5377;
							local29++;
						}
					}
				}
				local9++;
				Static34.anInt5382 += Static34.anInt5372;
				Static34.anInt5399 += Static34.anInt5379;
				Static34.anInt5384 += Static34.anInt5397;
			}
		} else if (Static34.anInt5390 < 0) {
			local9 = Static34.anInt5378;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static34.anInt5384;
					local25 = Static34.anInt5382 + Static34.anInt5391;
					local27 = Static34.anInt5399 + Static34.anInt5373;
					local29 = Static34.anInt5398;
					if (local25 < 0) {
						local181 = (Static34.anInt5377 - local25 - 1) / Static34.anInt5377;
						local29 += local181;
						local25 += Static34.anInt5377 * local181;
						local27 += Static34.anInt5390 * local181;
						local23 += local181;
					}
					@Pc(1319) int local1319;
					if ((local1319 = (local25 + 1 - (super.anInt5388 << 12) - Static34.anInt5377) / Static34.anInt5377) > local29) {
						local29 = local1319;
					}
					@Pc(1331) int local1331;
					if ((local1331 = local27 - (super.anInt5394 << 12)) >= 0) {
						local181 = (Static34.anInt5390 - local1331) / Static34.anInt5390;
						local29 += local181;
						local25 += Static34.anInt5377 * local181;
						local27 += Static34.anInt5390 * local181;
						local23 += local181;
					}
					@Pc(1365) int local1365;
					if ((local1365 = (local27 - Static34.anInt5390) / Static34.anInt5390) > local29) {
						local29 = local1365;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static34.anInt5384 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static34.anInt5377 * local64;
						local27 += Static34.anInt5390 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray64[(local27 >> 12) * super.anInt5388 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = local111;
						}
						local25 += Static34.anInt5377;
						local27 += Static34.anInt5390;
						local29++;
					}
				}
				local9++;
				Static34.anInt5382 += Static34.anInt5372;
				Static34.anInt5399 += Static34.anInt5379;
				Static34.anInt5384 += Static34.anInt5397;
			}
		} else {
			local9 = Static34.anInt5378;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static34.anInt5384;
					local25 = Static34.anInt5382 + Static34.anInt5391;
					local27 = Static34.anInt5399 + Static34.anInt5373;
					local29 = Static34.anInt5398;
					if (local25 < 0) {
						local181 = (Static34.anInt5377 - local25 - 1) / Static34.anInt5377;
						local29 += local181;
						local25 += Static34.anInt5377 * local181;
						local27 += Static34.anInt5390 * local181;
						local23 += local181;
					}
					@Pc(1539) int local1539;
					if ((local1539 = (local25 + 1 - (super.anInt5388 << 12) - Static34.anInt5377) / Static34.anInt5377) > local29) {
						local29 = local1539;
					}
					if (local27 < 0) {
						local181 = (Static34.anInt5390 - local27 - 1) / Static34.anInt5390;
						local29 += local181;
						local25 += Static34.anInt5377 * local181;
						local27 += Static34.anInt5390 * local181;
						local23 += local181;
					}
					@Pc(1587) int local1587;
					if ((local1587 = (local27 + 1 - (super.anInt5394 << 12) - Static34.anInt5390) / Static34.anInt5390) > local29) {
						local29 = local1587;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static34.anInt5384 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static34.anInt5377 * local64;
						local27 += Static34.anInt5390 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray64[(local27 >> 12) * super.anInt5388 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = local111;
						}
						local25 += Static34.anInt5377;
						local27 += Static34.anInt5390;
						local29++;
					}
				}
				local9++;
				Static34.anInt5382 += Static34.anInt5372;
				Static34.anInt5399 += Static34.anInt5379;
				Static34.anInt5384 += Static34.anInt5397;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (super.aClass40_Sub1_9.method1233()) {
			throw new IllegalStateException();
		}
		@Pc(11) int local11 = super.aClass40_Sub1_9.anInt1412;
		arg0 += super.anInt5387;
		arg1 += super.anInt5395;
		@Pc(27) int local27 = arg1 * local11 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = super.anInt5394;
		@Pc(35) int local35 = super.anInt5388;
		@Pc(39) int local39 = local11 - local35;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg1 < super.aClass40_Sub1_9.anInt1435) {
			local52 = super.aClass40_Sub1_9.anInt1435 - arg1;
			local32 -= local52;
			arg1 = super.aClass40_Sub1_9.anInt1435;
			local29 = local52 * local35;
			local27 += local52 * local11;
		}
		if (arg1 + local32 > super.aClass40_Sub1_9.anInt1410) {
			local32 -= arg1 + local32 - super.aClass40_Sub1_9.anInt1410;
		}
		if (arg0 < super.aClass40_Sub1_9.anInt1438) {
			local52 = super.aClass40_Sub1_9.anInt1438 - arg0;
			local35 -= local52;
			arg0 = super.aClass40_Sub1_9.anInt1438;
			local29 += local52;
			local27 += local52;
			local41 = local52;
			local39 += local52;
		}
		if (arg0 + local35 > super.aClass40_Sub1_9.lb) {
			local52 = arg0 + local35 - super.aClass40_Sub1_9.lb;
			local35 -= local52;
			local41 += local52;
			local39 += local52;
		}
		if (local35 <= 0 || local32 <= 0) {
			return;
		}
		@Pc(160) int[] local160 = super.aClass40_Sub1_9.anIntArray90;
		@Pc(424) int local424;
		@Pc(431) int local431;
		@Pc(438) int local438;
		if (arg2 == 0) {
			for (local424 = -local32; local424 < 0; local424++) {
				local431 = local27 + local35 - 3;
				while (local27 < local431) {
					local438 = this.anIntArray64[local29++];
					if (local438 == 0) {
						local27++;
					} else {
						local160[local27++] = local438;
					}
					local438 = this.anIntArray64[local29++];
					if (local438 == 0) {
						local27++;
					} else {
						local160[local27++] = local438;
					}
					local438 = this.anIntArray64[local29++];
					if (local438 == 0) {
						local27++;
					} else {
						local160[local27++] = local438;
					}
					local438 = this.anIntArray64[local29++];
					if (local438 == 0) {
						local27++;
					} else {
						local160[local27++] = local438;
					}
				}
				local431 += 3;
				while (local27 < local431) {
					local438 = this.anIntArray64[local29++];
					if (local438 == 0) {
						local27++;
					} else {
						local160[local27++] = local438;
					}
				}
				local27 += local39;
				local29 += local41;
			}
			return;
		}
		@Pc(550) int local550;
		@Pc(557) int local557;
		@Pc(563) int local563;
		@Pc(644) int local644;
		if (arg2 == 1) {
			if ((arg3 & 0xFFFFFF) == 16777215) {
				local424 = arg3 >>> 24;
				local431 = 256 - local424;
				for (local438 = -local32; local438 < 0; local438++) {
					for (local550 = -local35; local550 < 0; local550++) {
						local557 = this.anIntArray64[local29++];
						if (local557 == 0) {
							local27++;
						} else {
							local563 = local160[local27];
							local160[local27++] = ((local557 & 0xFF00FF) * local424 + (local563 & 0xFF00FF) * local431 & 0xFF00FF00) + ((local557 & 0xFF00) * local424 + (local563 & 0xFF00) * local431 & 0xFF0000) >> 8;
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else {
				local424 = arg3 >> 16 & 0xFF;
				local431 = arg3 >> 8 & 0xFF;
				local438 = arg3 & 0xFF;
				local550 = arg3 >>> 24;
				local557 = 256 - local550;
				for (local563 = -local32; local563 < 0; local563++) {
					for (local644 = -local35; local644 < 0; local644++) {
						@Pc(651) int local651 = this.anIntArray64[local29++];
						if (local651 == 0) {
							local27++;
						} else {
							@Pc(664) int local664;
							@Pc(672) int local672;
							@Pc(680) int local680;
							if (local550 == 255) {
								local664 = (local651 & 0xFF0000) * local424 & 0xFF000000;
								local672 = (local651 & 0xFF00) * local431 & 0xFF0000;
								local680 = (local651 & 0xFF) * local438 & 0xFF00;
								local160[local27++] = (local664 | local672 | local680) >>> 8;
							} else {
								local664 = (local651 & 0xFF0000) * local424 & 0xFF000000;
								local672 = (local651 & 0xFF00) * local431 & 0xFF0000;
								local680 = (local651 & 0xFF) * local438 & 0xFF00;
								local651 = (local664 | local672 | local680) >>> 8;
								@Pc(692) int local692 = local160[local27];
								local160[local27++] = ((local651 & 0xFF00FF) * local550 + (local692 & 0xFF00FF) * local557 & 0xFF00FF00) + ((local651 & 0xFF00) * local550 + (local692 & 0xFF00) * local557 & 0xFF0000) >> 8;
							}
						}
					}
					local27 += local39;
					local29 += local41;
				}
			}
		} else if (arg2 == 2) {
			local424 = arg3 >>> 24;
			local431 = 256 - local424;
			local438 = (arg3 & 0xFF00FF) * local431 & 0xFF00FF00;
			local550 = (arg3 & 0xFF00) * local431 & 0xFF0000;
			@Pc(811) int local811 = (local438 | local550) >>> 8;
			for (local557 = -local32; local557 < 0; local557++) {
				for (local563 = -local35; local563 < 0; local563++) {
					local644 = this.anIntArray64[local29++];
					if (local644 == 0) {
						local27++;
					} else {
						local438 = (local644 & 0xFF00FF) * local424 & 0xFF00FF00;
						local550 = (local644 & 0xFF00) * local424 & 0xFF0000;
						local160[local27++] = ((local438 | local550) >>> 8) + local811;
					}
				}
				local27 += local39;
				local29 += local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!sn;II)V")
	@Override
	public void method5848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class142 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass40_Sub1_9.method1233()) {
			throw new IllegalStateException();
		}
		arg0 += super.anInt5387;
		arg1 += super.anInt5395;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = super.aClass40_Sub1_9.anInt1412;
		@Pc(26) int local26 = super.anInt5388;
		@Pc(29) int local29 = super.anInt5394;
		@Pc(33) int local33 = local23 - local26;
		@Pc(35) int local35 = 0;
		@Pc(41) int local41 = arg0 + arg1 * local23;
		@Pc(52) int local52;
		if (arg1 < super.aClass40_Sub1_9.anInt1435) {
			local52 = super.aClass40_Sub1_9.anInt1435 - arg1;
			local29 -= local52;
			arg1 = super.aClass40_Sub1_9.anInt1435;
			local19 = local52 * local26;
			local41 += local52 * local23;
		}
		if (arg1 + local29 > super.aClass40_Sub1_9.anInt1410) {
			local29 -= arg1 + local29 - super.aClass40_Sub1_9.anInt1410;
		}
		if (arg0 < super.aClass40_Sub1_9.anInt1438) {
			local52 = super.aClass40_Sub1_9.anInt1438 - arg0;
			local26 -= local52;
			arg0 = super.aClass40_Sub1_9.anInt1438;
			local19 += local52;
			local41 += local52;
			local35 = local52;
			local33 += local52;
		}
		if (arg0 + local26 > super.aClass40_Sub1_9.lb) {
			local52 = arg0 + local26 - super.aClass40_Sub1_9.lb;
			local26 -= local52;
			local35 += local52;
			local33 += local52;
		}
		if (local26 <= 0 || local29 <= 0) {
			return;
		}
		@Pc(159) Class142_Sub1 local159 = (Class142_Sub1) arg2;
		@Pc(162) int[] local162 = local159.anIntArray371;
		@Pc(165) int[] local165 = local159.anIntArray372;
		@Pc(169) int[] local169 = super.aClass40_Sub1_9.anIntArray90;
		@Pc(171) int local171 = arg1;
		if (arg4 > arg1) {
			local171 = arg4;
			local41 += (arg4 - arg1) * local23;
			local19 += (arg4 - arg1) * super.anInt5388;
		}
		@Pc(210) int local210 = arg4 + local162.length < arg1 + local29 ? arg4 + local162.length : arg1 + local29;
		for (@Pc(212) int local212 = local171; local212 < local210; local212++) {
			@Pc(221) int local221 = local162[local212 - arg4] + arg3;
			@Pc(227) int local227 = local165[local212 - arg4];
			@Pc(229) int local229 = local26;
			@Pc(236) int local236;
			if (arg0 > local221) {
				local236 = arg0 - local221;
				if (local236 >= local227) {
					local19 += local26 + local35;
					local41 += local26 + local33;
					continue;
				}
				local227 -= local236;
			} else {
				local236 = local221 - arg0;
				if (local236 >= local26) {
					local19 += local26 + local35;
					local41 += local26 + local33;
					continue;
				}
				local19 += local236;
				local229 = local26 - local236;
				local41 += local236;
			}
			local236 = 0;
			if (local229 < local227) {
				local227 = local229;
			} else {
				local236 = local229 - local227;
			}
			for (@Pc(304) int local304 = -local227; local304 < 0; local304++) {
				@Pc(311) int local311 = this.anIntArray64[local19++];
				if (local311 == 0) {
					local41++;
				} else {
					local169[local41++] = local311;
				}
			}
			local19 += local236 + local35;
			local41 += local236 + local33;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass40_Sub1_9.anIntArray90;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(15) int local15 = (arg1 + local5) * super.anInt5388 + arg0;
			@Pc(25) int local25 = local5 * super.aClass40_Sub1_9.anInt1412;
			for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
				this.anIntArray64[local15 + local27] = local3[local25 + local27];
			}
		}
	}
}
