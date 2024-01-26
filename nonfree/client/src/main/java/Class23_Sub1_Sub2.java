import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class23_Sub1_Sub2 extends Class23_Sub1 {

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "[I")
	public final int[] anIntArray528;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!iaa;[IIIIIZ)V")
	public Class23_Sub1_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg4, arg5);
		if (arg6) {
			this.anIntArray528 = new int[arg4 * arg5];
		} else {
			this.anIntArray528 = arg1;
		}
		@Pc(21) int local21 = arg3 - super.anInt9302;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg5; local25++) {
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				this.anIntArray528[local23++] = arg1[arg2++];
			}
			arg2 += local21;
		}
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!iaa;II)V")
	public Class23_Sub1_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1, arg2);
		this.anIntArray528 = new int[arg1 * arg2];
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!iaa;[III)V")
	public Class23_Sub1_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anIntArray528 = arg1;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass19_Sub2_10.method3785()) {
			throw new IllegalStateException();
		}
		@Pc(12) int local12 = super.aClass19_Sub2_10.anInt4207;
		arg0 += super.anInt9298;
		arg1 += super.anInt9308;
		@Pc(28) int local28 = arg1 * local12 + arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = super.anInt9306;
		@Pc(36) int local36 = super.anInt9302;
		@Pc(40) int local40 = local12 - local36;
		@Pc(42) int local42 = 0;
		@Pc(53) int local53;
		if (arg1 < super.aClass19_Sub2_10.anInt4186) {
			local53 = super.aClass19_Sub2_10.anInt4186 - arg1;
			local33 -= local53;
			arg1 = super.aClass19_Sub2_10.anInt4186;
			local30 = local53 * local36;
			local28 += local53 * local12;
		}
		if (arg1 + local33 > super.aClass19_Sub2_10.anInt4196) {
			local33 -= arg1 + local33 - super.aClass19_Sub2_10.anInt4196;
		}
		if (arg0 < super.aClass19_Sub2_10.anInt4192) {
			local53 = super.aClass19_Sub2_10.anInt4192 - arg0;
			local36 -= local53;
			arg0 = super.aClass19_Sub2_10.anInt4192;
			local30 += local53;
			local28 += local53;
			local42 = local53;
			local40 += local53;
		}
		if (arg0 + local36 > super.aClass19_Sub2_10.anInt4200) {
			local53 = arg0 + local36 - super.aClass19_Sub2_10.anInt4200;
			local36 -= local53;
			local42 += local53;
			local40 += local53;
		}
		if (local36 <= 0 || local33 <= 0) {
			return;
		}
		@Pc(164) int[] local164 = super.aClass19_Sub2_10.anIntArray319;
		@Pc(174) int local174;
		@Pc(181) int local181;
		@Pc(267) int local267;
		@Pc(270) int local270;
		@Pc(274) int local274;
		@Pc(281) int local281;
		@Pc(289) int local289;
		@Pc(297) int local297;
		@Pc(305) int local305;
		@Pc(433) int local433;
		if (arg4 != 0) {
			@Pc(734) int local734;
			@Pc(742) int local742;
			@Pc(754) int local754;
			if (arg4 == 1) {
				if (arg2 == 1) {
					for (local174 = -local33; local174 < 0; local174++) {
						for (local181 = -local36; local181 < 0; local181++) {
							local267 = this.anIntArray528[local30++];
							local270 = local267 >>> 24;
							local274 = 256 - local270;
							local281 = local164[local28];
							local164[local28++] = ((local267 & 0xFF00FF) * local270 + (local281 & 0xFF00FF) * local274 >> 8 & 0xFFFF00FF) + (((local267 & 0xFF00FF00) >>> 8) * local270 + ((local281 & 0xFF00FF00) >>> 8) * local274 & 0xFF00FF00);
						}
						local28 += local40;
						local30 += local42;
					}
				} else if (arg2 == 0) {
					if ((arg3 & 0xFFFFFF) == 16777215) {
						for (local174 = -local33; local174 < 0; local174++) {
							for (local181 = -local36; local181 < 0; local181++) {
								local267 = this.anIntArray528[local30++];
								local270 = (local267 >>> 24) * (arg3 >>> 24) >> 8;
								local274 = 256 - local270;
								local281 = local164[local28];
								local164[local28++] = ((local267 & 0xFF00FF) * local270 + (local281 & 0xFF00FF) * local274 & 0xFF00FF00) + ((local267 & 0xFF00) * local270 + (local281 & 0xFF00) * local274 & 0xFF0000) >> 8;
							}
							local28 += local40;
							local30 += local42;
						}
					} else {
						local174 = arg3 >> 16 & 0xFF;
						local181 = arg3 >> 8 & 0xFF;
						local267 = arg3 & 0xFF;
						for (local270 = -local33; local270 < 0; local270++) {
							for (local274 = -local36; local274 < 0; local274++) {
								local281 = this.anIntArray528[local30++];
								local289 = (local281 >>> 24) * (arg3 >>> 24) >> 8;
								local297 = 256 - local289;
								if (local289 == 255) {
									local305 = (local281 & 0xFF0000) * local174 & 0xFF000000;
									local734 = (local281 & 0xFF00) * local181 & 0xFF0000;
									local742 = (local281 & 0xFF) * local267 & 0xFF00;
									local164[local28++] = (local305 | local734 | local742) >>> 8;
								} else {
									local305 = (local281 & 0xFF0000) * local174 & 0xFF000000;
									local734 = (local281 & 0xFF00) * local181 & 0xFF0000;
									local742 = (local281 & 0xFF) * local267 & 0xFF00;
									local281 = (local305 | local734 | local742) >>> 8;
									local754 = local164[local28];
									local164[local28++] = ((local281 & 0xFF00FF) * local289 + (local754 & 0xFF00FF) * local297 & 0xFF00FF00) + ((local281 & 0xFF00) * local289 + (local754 & 0xFF00) * local297 & 0xFF0000) >> 8;
								}
							}
							local28 += local40;
							local30 += local42;
						}
					}
				} else if (arg2 == 3) {
					for (local174 = -local33; local174 < 0; local174++) {
						for (local181 = -local36; local181 < 0; local181++) {
							local267 = this.anIntArray528[local30++];
							local270 = local267 + arg3;
							local274 = (local267 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local281 = (local274 & 0x1000100) + (local270 - local274 & 0x10000);
							local281 = local270 - local281 | local281 - (local281 >>> 8);
							local289 = (local281 >>> 24) * (arg3 >>> 24) >> 8;
							local297 = 256 - local289;
							if (local289 != 255) {
								local267 = local281;
								local281 = local164[local28];
								local281 = ((local267 & 0xFF00FF) * local289 + (local281 & 0xFF00FF) * local297 & 0xFF00FF00) + ((local267 & 0xFF00) * local289 + (local281 & 0xFF00) * local297 & 0xFF0000) >> 8;
							}
							local164[local28++] = local281;
						}
						local28 += local40;
						local30 += local42;
					}
				} else if (arg2 == 2) {
					local174 = arg3 >>> 24;
					local181 = 256 - local174;
					local267 = (arg3 & 0xFF00FF) * local181 & 0xFF00FF00;
					local270 = (arg3 & 0xFF00) * local181 & 0xFF0000;
					local433 = (local267 | local270) >>> 8;
					for (local274 = -local33; local274 < 0; local274++) {
						for (local281 = -local36; local281 < 0; local281++) {
							local289 = this.anIntArray528[local30++];
							local297 = local289 >>> 24;
							local305 = 256 - local297;
							local267 = (local289 & 0xFF00FF) * local174 & 0xFF00FF00;
							local270 = (local289 & 0xFF00) * local174 & 0xFF0000;
							local289 = ((local267 | local270) >>> 8) + local433;
							local734 = local164[local28];
							local164[local28++] = ((local289 & 0xFF00FF) * local297 + (local734 & 0xFF00FF) * local305 & 0xFF00FF00) + ((local289 & 0xFF00) * local297 + (local734 & 0xFF00) * local305 & 0xFF0000) >> 8;
						}
						local28 += local40;
						local30 += local42;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 != 2) {
				throw new IllegalArgumentException();
			} else if (arg2 == 1) {
				for (local174 = -local33; local174 < 0; local174++) {
					for (local181 = -local36; local181 < 0; local181++) {
						local267 = this.anIntArray528[local30++];
						if (local267 == 0) {
							local28++;
						} else {
							local270 = local164[local28];
							local274 = local267 + local270;
							local281 = (local267 & 0xFF00FF) + (local270 & 0xFF00FF);
							local270 = (local281 & 0x1000100) + (local274 - local281 & 0x10000);
							local164[local28++] = local274 - local270 | local270 - (local270 >>> 8);
						}
					}
					local28 += local40;
					local30 += local42;
				}
			} else if (arg2 == 0) {
				local174 = arg3 >> 16 & 0xFF;
				local181 = arg3 >> 8 & 0xFF;
				local267 = arg3 & 0xFF;
				for (local270 = -local33; local270 < 0; local270++) {
					for (local274 = -local36; local274 < 0; local274++) {
						local281 = this.anIntArray528[local30++];
						if (local281 == 0) {
							local28++;
						} else {
							local289 = (local281 & 0xFF0000) * local174 & 0xFF000000;
							local297 = (local281 & 0xFF00) * local181 & 0xFF0000;
							local305 = (local281 & 0xFF) * local267 & 0xFF00;
							local281 = (local289 | local297 | local305) >>> 8;
							local734 = local164[local28];
							local742 = local281 + local734;
							local754 = (local281 & 0xFF00FF) + (local734 & 0xFF00FF);
							local734 = (local754 & 0x1000100) + (local742 - local754 & 0x10000);
							local164[local28++] = local742 - local734 | local734 - (local734 >>> 8);
						}
					}
					local28 += local40;
					local30 += local42;
				}
			} else if (arg2 == 3) {
				for (local174 = -local33; local174 < 0; local174++) {
					for (local181 = -local36; local181 < 0; local181++) {
						local267 = this.anIntArray528[local30++];
						local270 = local267 + arg3;
						local274 = (local267 & 0xFF00FF) + (arg3 & 0xFF00FF);
						local281 = (local274 & 0x1000100) + (local270 - local274 & 0x10000);
						local267 = local270 - local281 | local281 - (local281 >>> 8);
						local281 = local164[local28];
						local270 = local267 + local281;
						local274 = (local267 & 0xFF00FF) + (local281 & 0xFF00FF);
						local281 = (local274 & 0x1000100) + (local270 - local274 & 0x10000);
						local164[local28++] = local270 - local281 | local281 - (local281 >>> 8);
					}
					local28 += local40;
					local30 += local42;
				}
			} else if (arg2 == 2) {
				local174 = arg3 >>> 24;
				local181 = 256 - local174;
				local267 = (arg3 & 0xFF00FF) * local181 & 0xFF00FF00;
				local270 = (arg3 & 0xFF00) * local181 & 0xFF0000;
				local433 = (local267 | local270) >>> 8;
				for (local274 = -local33; local274 < 0; local274++) {
					for (local281 = -local36; local281 < 0; local281++) {
						local289 = this.anIntArray528[local30++];
						if (local289 == 0) {
							local28++;
						} else {
							local267 = (local289 & 0xFF00FF) * local174 & 0xFF00FF00;
							local270 = (local289 & 0xFF00) * local174 & 0xFF0000;
							local289 = ((local267 | local270) >>> 8) + local433;
							local297 = local164[local28];
							local305 = local289 + local297;
							local734 = (local289 & 0xFF00FF) + (local297 & 0xFF00FF);
							@Pc(1505) int local1505 = (local734 & 0x1000100) + (local305 - local734 & 0x10000);
							local164[local28++] = local305 - local1505 | local1505 - (local1505 >>> 8);
						}
					}
					local28 += local40;
					local30 += local42;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg2 == 1) {
			for (local174 = -local33; local174 < 0; local174++) {
				local181 = local28 + local36 - 3;
				while (local28 < local181) {
					local164[local28++] = this.anIntArray528[local30++];
					local164[local28++] = this.anIntArray528[local30++];
					local164[local28++] = this.anIntArray528[local30++];
					local164[local28++] = this.anIntArray528[local30++];
				}
				local181 += 3;
				while (local28 < local181) {
					local164[local28++] = this.anIntArray528[local30++];
				}
				local28 += local40;
				local30 += local42;
			}
		} else if (arg2 == 0) {
			local174 = arg3 >> 16 & 0xFF;
			local181 = arg3 >> 8 & 0xFF;
			local267 = arg3 & 0xFF;
			for (local270 = -local33; local270 < 0; local270++) {
				for (local274 = -local36; local274 < 0; local274++) {
					local281 = this.anIntArray528[local30++];
					local289 = (local281 & 0xFF0000) * local174 & 0xFF000000;
					local297 = (local281 & 0xFF00) * local181 & 0xFF0000;
					local305 = (local281 & 0xFF) * local267 & 0xFF00;
					local164[local28++] = (local289 | local297 | local305) >>> 8;
				}
				local28 += local40;
				local30 += local42;
			}
		} else if (arg2 == 3) {
			for (local174 = -local33; local174 < 0; local174++) {
				for (local181 = -local36; local181 < 0; local181++) {
					local267 = this.anIntArray528[local30++];
					local270 = local267 + arg3;
					local274 = (local267 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local281 = (local274 & 0x1000100) + (local270 - local274 & 0x10000);
					local164[local28++] = local270 - local281 | local281 - (local281 >>> 8);
				}
				local28 += local40;
				local30 += local42;
			}
		} else if (arg2 == 2) {
			local174 = arg3 >>> 24;
			local181 = 256 - local174;
			local267 = (arg3 & 0xFF00FF) * local181 & 0xFF00FF00;
			local270 = (arg3 & 0xFF00) * local181 & 0xFF0000;
			local433 = (local267 | local270) >>> 8;
			for (local274 = -local33; local274 < 0; local274++) {
				for (local281 = -local36; local281 < 0; local281++) {
					local289 = this.anIntArray528[local30++];
					local267 = (local289 & 0xFF00FF) * local174 & 0xFF00FF00;
					local270 = (local289 & 0xFF00) * local174 & 0xFF0000;
					local164[local28++] = ((local267 | local270) >>> 8) + local433;
				}
				local28 += local40;
				local30 += local42;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)V")
	@Override
	protected void method8209(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass19_Sub2_10.anIntArray319;
		@Pc(956) int local956;
		@Pc(11) int local11;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(223) int local223;
		@Pc(227) int local227;
		@Pc(231) int local231;
		@Pc(235) int local235;
		@Pc(348) int local348;
		@Pc(356) int local356;
		@Pc(368) int local368;
		if (Static513.anInt9321 == 0) {
			if (Static513.anInt9309 == 0) {
				local11 = Static513.anInt9297;
				while (local11 < 0) {
					local14 = Static513.anInt9292;
					local16 = Static513.anInt9310;
					local18 = Static513.anInt9317;
					local20 = Static513.anInt9303;
					if (local16 >= 0 && local18 >= 0 && local16 - (super.anInt9302 << 12) < 0 && local18 - (super.anInt9306 << 12) < 0) {
						while (local20 < 0) {
							local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
							local60 = local14++;
							if (arg0 == 1) {
								local223 = this.anIntArray528[local57];
								local227 = local223 >>> 24;
								local231 = 256 - local227;
								local235 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
							} else if (arg0 == 0) {
								local223 = this.anIntArray528[local57];
								local227 = (local223 >>> 24) * Static513.anInt9304 >> 8;
								local231 = 256 - local227;
								if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
									local235 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
								} else if (local227 == 255) {
									local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local3[local60] = (local235 | local348 | local356) >>> 8;
								} else {
									local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local223 = (local235 | local348 | local356) >>> 8;
									local368 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * local227 + (local368 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local368 & 0xFF00) * local231 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 3) {
								local223 = this.anIntArray528[local57];
								local227 = Static513.anInt9313;
								local231 = local223 + local227;
								local235 = (local223 & 0xFF00FF) + (local227 & 0xFF00FF);
								local348 = (local235 & 0x1000100) + (local231 - local235 & 0x10000);
								local348 = local231 - local348 | local348 - (local348 >>> 8);
								local356 = (local223 >>> 24) * Static513.anInt9304 >> 8;
								local368 = 256 - local356;
								if (local356 != 255) {
									local223 = local348;
									local348 = local3[local60];
									local348 = ((local223 & 0xFF00FF) * local356 + (local348 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local223 & 0xFF00) * local356 + (local348 & 0xFF00) * local368 & 0xFF0000) >> 8;
								}
								local3[local60] = local348;
							} else if (arg0 == 2) {
								local223 = this.anIntArray528[local57];
								local227 = local223 >>> 24;
								local231 = 256 - local227;
								local235 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
								local348 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
								local223 = ((local235 | local348) >>> 8) + Static513.anInt9305;
								local356 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local356 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local356 & 0xFF00) * local231 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local20++;
						}
					}
					local11++;
					Static513.anInt9292 += Static513.anInt9291;
				}
			} else if (Static513.anInt9309 < 0) {
				local11 = Static513.anInt9297;
				while (local11 < 0) {
					local14 = Static513.anInt9292;
					local16 = Static513.anInt9310;
					local18 = Static513.anInt9317 + Static513.anInt9316;
					local20 = Static513.anInt9303;
					if (local16 >= 0 && local16 - (super.anInt9302 << 12) < 0) {
						@Pc(949) int local949;
						if ((local949 = local18 - (super.anInt9306 << 12)) >= 0) {
							local956 = (Static513.anInt9309 - local949) / Static513.anInt9309;
							local20 += local956;
							local18 += Static513.anInt9309 * local956;
							local14 += local956;
						}
						@Pc(977) int local977;
						if ((local977 = (local18 - Static513.anInt9309) / Static513.anInt9309) > local20) {
							local20 = local977;
						}
						while (local20 < 0) {
							local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
							local60 = local14++;
							if (arg0 == 1) {
								local223 = this.anIntArray528[local57];
								local227 = local223 >>> 24;
								local231 = 256 - local227;
								local235 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
							} else if (arg0 == 0) {
								local223 = this.anIntArray528[local57];
								local227 = (local223 >>> 24) * Static513.anInt9304 >> 8;
								local231 = 256 - local227;
								if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
									local235 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
								} else if (local227 == 255) {
									local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local3[local60] = (local235 | local348 | local356) >>> 8;
								} else {
									local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local223 = (local235 | local348 | local356) >>> 8;
									local368 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * local227 + (local368 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local368 & 0xFF00) * local231 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 3) {
								local223 = this.anIntArray528[local57];
								local227 = Static513.anInt9313;
								local231 = local223 + local227;
								local235 = (local223 & 0xFF00FF) + (local227 & 0xFF00FF);
								local348 = (local235 & 0x1000100) + (local231 - local235 & 0x10000);
								local348 = local231 - local348 | local348 - (local348 >>> 8);
								local356 = (local223 >>> 24) * Static513.anInt9304 >> 8;
								local368 = 256 - local356;
								if (local356 != 255) {
									local223 = local348;
									local348 = local3[local60];
									local348 = ((local223 & 0xFF00FF) * local356 + (local348 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local223 & 0xFF00) * local356 + (local348 & 0xFF00) * local368 & 0xFF0000) >> 8;
								}
								local3[local60] = local348;
							} else if (arg0 == 2) {
								local223 = this.anIntArray528[local57];
								local227 = local223 >>> 24;
								local231 = 256 - local227;
								local235 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
								local348 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
								local223 = ((local235 | local348) >>> 8) + Static513.anInt9305;
								local356 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local356 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local356 & 0xFF00) * local231 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local18 += Static513.anInt9309;
							local20++;
						}
					}
					local11++;
					Static513.anInt9310 += Static513.anInt9311;
					Static513.anInt9292 += Static513.anInt9291;
				}
			} else {
				local11 = Static513.anInt9297;
				while (local11 < 0) {
					local14 = Static513.anInt9292;
					local16 = Static513.anInt9310;
					local18 = Static513.anInt9317 + Static513.anInt9316;
					local20 = Static513.anInt9303;
					if (local16 >= 0 && local16 - (super.anInt9302 << 12) < 0) {
						if (local18 < 0) {
							local956 = (Static513.anInt9309 - local18 - 1) / Static513.anInt9309;
							local20 += local956;
							local18 += Static513.anInt9309 * local956;
							local14 += local956;
						}
						@Pc(1923) int local1923;
						if ((local1923 = (local18 + 1 - (super.anInt9306 << 12) - Static513.anInt9309) / Static513.anInt9309) > local20) {
							local20 = local1923;
						}
						while (local20 < 0) {
							local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
							local60 = local14++;
							if (arg0 == 1) {
								local223 = this.anIntArray528[local57];
								local227 = local223 >>> 24;
								local231 = 256 - local227;
								local235 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
							} else if (arg0 == 0) {
								local223 = this.anIntArray528[local57];
								local227 = (local223 >>> 24) * Static513.anInt9304 >> 8;
								local231 = 256 - local227;
								if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
									local235 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
								} else if (local227 == 255) {
									local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local3[local60] = (local235 | local348 | local356) >>> 8;
								} else {
									local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local223 = (local235 | local348 | local356) >>> 8;
									local368 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * local227 + (local368 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local368 & 0xFF00) * local231 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 3) {
								local223 = this.anIntArray528[local57];
								local227 = Static513.anInt9313;
								local231 = local223 + local227;
								local235 = (local223 & 0xFF00FF) + (local227 & 0xFF00FF);
								local348 = (local235 & 0x1000100) + (local231 - local235 & 0x10000);
								local348 = local231 - local348 | local348 - (local348 >>> 8);
								local356 = (local223 >>> 24) * Static513.anInt9304 >> 8;
								local368 = 256 - local356;
								if (local356 != 255) {
									local223 = local348;
									local348 = local3[local60];
									local348 = ((local223 & 0xFF00FF) * local356 + (local348 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local223 & 0xFF00) * local356 + (local348 & 0xFF00) * local368 & 0xFF0000) >> 8;
								}
								local3[local60] = local348;
							} else if (arg0 == 2) {
								local223 = this.anIntArray528[local57];
								local227 = local223 >>> 24;
								local231 = 256 - local227;
								local235 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
								local348 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
								local223 = ((local235 | local348) >>> 8) + Static513.anInt9305;
								local356 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local356 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local356 & 0xFF00) * local231 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local18 += Static513.anInt9309;
							local20++;
						}
					}
					local11++;
					Static513.anInt9310 += Static513.anInt9311;
					Static513.anInt9292 += Static513.anInt9291;
				}
			}
		} else if (Static513.anInt9321 < 0) {
			if (Static513.anInt9309 == 0) {
				local11 = Static513.anInt9297;
				while (local11 < 0) {
					local14 = Static513.anInt9292;
					local16 = Static513.anInt9310 + Static513.anInt9318;
					local18 = Static513.anInt9317;
					local20 = Static513.anInt9303;
					if (local18 >= 0 && local18 - (super.anInt9306 << 12) < 0) {
						@Pc(2843) int local2843;
						if ((local2843 = local16 - (super.anInt9302 << 12)) >= 0) {
							local956 = (Static513.anInt9321 - local2843) / Static513.anInt9321;
							local20 += local956;
							local16 += Static513.anInt9321 * local956;
							local14 += local956;
						}
						@Pc(2871) int local2871;
						if ((local2871 = (local16 - Static513.anInt9321) / Static513.anInt9321) > local20) {
							local20 = local2871;
						}
						while (local20 < 0) {
							local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
							local60 = local14++;
							if (arg0 == 1) {
								local223 = this.anIntArray528[local57];
								local227 = local223 >>> 24;
								local231 = 256 - local227;
								local235 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
							} else if (arg0 == 0) {
								local223 = this.anIntArray528[local57];
								local227 = (local223 >>> 24) * Static513.anInt9304 >> 8;
								local231 = 256 - local227;
								if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
									local235 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
								} else if (local227 == 255) {
									local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local3[local60] = (local235 | local348 | local356) >>> 8;
								} else {
									local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local223 = (local235 | local348 | local356) >>> 8;
									local368 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * local227 + (local368 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local368 & 0xFF00) * local231 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 3) {
								local223 = this.anIntArray528[local57];
								local227 = Static513.anInt9313;
								local231 = local223 + local227;
								local235 = (local223 & 0xFF00FF) + (local227 & 0xFF00FF);
								local348 = (local235 & 0x1000100) + (local231 - local235 & 0x10000);
								local348 = local231 - local348 | local348 - (local348 >>> 8);
								local356 = (local223 >>> 24) * Static513.anInt9304 >> 8;
								local368 = 256 - local356;
								if (local356 != 255) {
									local223 = local348;
									local348 = local3[local60];
									local348 = ((local223 & 0xFF00FF) * local356 + (local348 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local223 & 0xFF00) * local356 + (local348 & 0xFF00) * local368 & 0xFF0000) >> 8;
								}
								local3[local60] = local348;
							} else if (arg0 == 2) {
								local223 = this.anIntArray528[local57];
								local227 = local223 >>> 24;
								local231 = 256 - local227;
								local235 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
								local348 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
								local223 = ((local235 | local348) >>> 8) + Static513.anInt9305;
								local356 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local356 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local356 & 0xFF00) * local231 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static513.anInt9321;
							local20++;
						}
					}
					local11++;
					Static513.anInt9317 += Static513.anInt9293;
					Static513.anInt9292 += Static513.anInt9291;
				}
			} else if (Static513.anInt9309 < 0) {
				local11 = Static513.anInt9297;
				while (local11 < 0) {
					local14 = Static513.anInt9292;
					local16 = Static513.anInt9310 + Static513.anInt9318;
					local18 = Static513.anInt9317 + Static513.anInt9316;
					local20 = Static513.anInt9303;
					@Pc(3778) int local3778;
					if ((local3778 = local16 - (super.anInt9302 << 12)) >= 0) {
						local956 = (Static513.anInt9321 - local3778) / Static513.anInt9321;
						local20 += local956;
						local16 += Static513.anInt9321 * local956;
						local18 += Static513.anInt9309 * local956;
						local14 += local956;
					}
					@Pc(3812) int local3812;
					if ((local3812 = (local16 - Static513.anInt9321) / Static513.anInt9321) > local20) {
						local20 = local3812;
					}
					@Pc(3824) int local3824;
					if ((local3824 = local18 - (super.anInt9306 << 12)) >= 0) {
						local956 = (Static513.anInt9309 - local3824) / Static513.anInt9309;
						local20 += local956;
						local16 += Static513.anInt9321 * local956;
						local18 += Static513.anInt9309 * local956;
						local14 += local956;
					}
					@Pc(3858) int local3858;
					if ((local3858 = (local18 - Static513.anInt9309) / Static513.anInt9309) > local20) {
						local20 = local3858;
					}
					while (local20 < 0) {
						local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
						local60 = local14++;
						if (arg0 == 1) {
							local223 = this.anIntArray528[local57];
							local227 = local223 >>> 24;
							local231 = 256 - local227;
							local235 = local3[local60];
							local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
						} else if (arg0 == 0) {
							local223 = this.anIntArray528[local57];
							local227 = (local223 >>> 24) * Static513.anInt9304 >> 8;
							local231 = 256 - local227;
							if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
								local235 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
							} else if (local227 == 255) {
								local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
								local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
								local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
								local3[local60] = (local235 | local348 | local356) >>> 8;
							} else {
								local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
								local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
								local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
								local223 = (local235 | local348 | local356) >>> 8;
								local368 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local368 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local368 & 0xFF00) * local231 & 0xFF0000) >> 8;
							}
						} else if (arg0 == 3) {
							local223 = this.anIntArray528[local57];
							local227 = Static513.anInt9313;
							local231 = local223 + local227;
							local235 = (local223 & 0xFF00FF) + (local227 & 0xFF00FF);
							local348 = (local235 & 0x1000100) + (local231 - local235 & 0x10000);
							local348 = local231 - local348 | local348 - (local348 >>> 8);
							local356 = (local223 >>> 24) * Static513.anInt9304 >> 8;
							local368 = 256 - local356;
							if (local356 != 255) {
								local223 = local348;
								local348 = local3[local60];
								local348 = ((local223 & 0xFF00FF) * local356 + (local348 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local223 & 0xFF00) * local356 + (local348 & 0xFF00) * local368 & 0xFF0000) >> 8;
							}
							local3[local60] = local348;
						} else if (arg0 == 2) {
							local223 = this.anIntArray528[local57];
							local227 = local223 >>> 24;
							local231 = 256 - local227;
							local235 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
							local348 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
							local223 = ((local235 | local348) >>> 8) + Static513.anInt9305;
							local356 = local3[local60];
							local3[local60] = ((local223 & 0xFF00FF) * local227 + (local356 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local356 & 0xFF00) * local231 & 0xFF0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
						local16 += Static513.anInt9321;
						local18 += Static513.anInt9309;
						local20++;
					}
					local11++;
					Static513.anInt9310 += Static513.anInt9311;
					Static513.anInt9317 += Static513.anInt9293;
					Static513.anInt9292 += Static513.anInt9291;
				}
			} else {
				local11 = Static513.anInt9297;
				while (local11 < 0) {
					local14 = Static513.anInt9292;
					local16 = Static513.anInt9310 + Static513.anInt9318;
					local18 = Static513.anInt9317 + Static513.anInt9316;
					local20 = Static513.anInt9303;
					@Pc(4771) int local4771;
					if ((local4771 = local16 - (super.anInt9302 << 12)) >= 0) {
						local956 = (Static513.anInt9321 - local4771) / Static513.anInt9321;
						local20 += local956;
						local16 += Static513.anInt9321 * local956;
						local18 += Static513.anInt9309 * local956;
						local14 += local956;
					}
					@Pc(4805) int local4805;
					if ((local4805 = (local16 - Static513.anInt9321) / Static513.anInt9321) > local20) {
						local20 = local4805;
					}
					if (local18 < 0) {
						local956 = (Static513.anInt9309 - local18 - 1) / Static513.anInt9309;
						local20 += local956;
						local16 += Static513.anInt9321 * local956;
						local18 += Static513.anInt9309 * local956;
						local14 += local956;
					}
					@Pc(4853) int local4853;
					if ((local4853 = (local18 + 1 - (super.anInt9306 << 12) - Static513.anInt9309) / Static513.anInt9309) > local20) {
						local20 = local4853;
					}
					while (local20 < 0) {
						local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
						local60 = local14++;
						if (arg0 == 1) {
							local223 = this.anIntArray528[local57];
							local227 = local223 >>> 24;
							local231 = 256 - local227;
							local235 = local3[local60];
							local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
						} else if (arg0 == 0) {
							local223 = this.anIntArray528[local57];
							local227 = (local223 >>> 24) * Static513.anInt9304 >> 8;
							local231 = 256 - local227;
							if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
								local235 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
							} else if (local227 == 255) {
								local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
								local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
								local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
								local3[local60] = (local235 | local348 | local356) >>> 8;
							} else {
								local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
								local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
								local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
								local223 = (local235 | local348 | local356) >>> 8;
								local368 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local368 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local368 & 0xFF00) * local231 & 0xFF0000) >> 8;
							}
						} else if (arg0 == 3) {
							local223 = this.anIntArray528[local57];
							local227 = Static513.anInt9313;
							local231 = local223 + local227;
							local235 = (local223 & 0xFF00FF) + (local227 & 0xFF00FF);
							local348 = (local235 & 0x1000100) + (local231 - local235 & 0x10000);
							local348 = local231 - local348 | local348 - (local348 >>> 8);
							local356 = (local223 >>> 24) * Static513.anInt9304 >> 8;
							local368 = 256 - local356;
							if (local356 != 255) {
								local223 = local348;
								local348 = local3[local60];
								local348 = ((local223 & 0xFF00FF) * local356 + (local348 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local223 & 0xFF00) * local356 + (local348 & 0xFF00) * local368 & 0xFF0000) >> 8;
							}
							local3[local60] = local348;
						} else if (arg0 == 2) {
							local223 = this.anIntArray528[local57];
							local227 = local223 >>> 24;
							local231 = 256 - local227;
							local235 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
							local348 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
							local223 = ((local235 | local348) >>> 8) + Static513.anInt9305;
							local356 = local3[local60];
							local3[local60] = ((local223 & 0xFF00FF) * local227 + (local356 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local356 & 0xFF00) * local231 & 0xFF0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
						local16 += Static513.anInt9321;
						local18 += Static513.anInt9309;
						local20++;
					}
					local11++;
					Static513.anInt9310 += Static513.anInt9311;
					Static513.anInt9317 += Static513.anInt9293;
					Static513.anInt9292 += Static513.anInt9291;
				}
			}
		} else if (Static513.anInt9309 == 0) {
			local11 = Static513.anInt9297;
			while (local11 < 0) {
				local14 = Static513.anInt9292;
				local16 = Static513.anInt9310 + Static513.anInt9318;
				local18 = Static513.anInt9317;
				local20 = Static513.anInt9303;
				if (local18 >= 0 && local18 - (super.anInt9306 << 12) < 0) {
					if (local16 < 0) {
						local956 = (Static513.anInt9321 - local16 - 1) / Static513.anInt9321;
						local20 += local956;
						local16 += Static513.anInt9321 * local956;
						local14 += local956;
					}
					@Pc(5809) int local5809;
					if ((local5809 = (local16 + 1 - (super.anInt9302 << 12) - Static513.anInt9321) / Static513.anInt9321) > local20) {
						local20 = local5809;
					}
					while (local20 < 0) {
						local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
						local60 = local14++;
						if (arg0 == 1) {
							local223 = this.anIntArray528[local57];
							local227 = local223 >>> 24;
							local231 = 256 - local227;
							local235 = local3[local60];
							local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
						} else if (arg0 == 0) {
							local223 = this.anIntArray528[local57];
							local227 = (local223 >>> 24) * Static513.anInt9304 >> 8;
							local231 = 256 - local227;
							if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
								local235 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
							} else if (local227 == 255) {
								local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
								local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
								local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
								local3[local60] = (local235 | local348 | local356) >>> 8;
							} else {
								local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
								local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
								local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
								local223 = (local235 | local348 | local356) >>> 8;
								local368 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local227 + (local368 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local368 & 0xFF00) * local231 & 0xFF0000) >> 8;
							}
						} else if (arg0 == 3) {
							local223 = this.anIntArray528[local57];
							local227 = Static513.anInt9313;
							local231 = local223 + local227;
							local235 = (local223 & 0xFF00FF) + (local227 & 0xFF00FF);
							local348 = (local235 & 0x1000100) + (local231 - local235 & 0x10000);
							local348 = local231 - local348 | local348 - (local348 >>> 8);
							local356 = (local223 >>> 24) * Static513.anInt9304 >> 8;
							local368 = 256 - local356;
							if (local356 != 255) {
								local223 = local348;
								local348 = local3[local60];
								local348 = ((local223 & 0xFF00FF) * local356 + (local348 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local223 & 0xFF00) * local356 + (local348 & 0xFF00) * local368 & 0xFF0000) >> 8;
							}
							local3[local60] = local348;
						} else if (arg0 == 2) {
							local223 = this.anIntArray528[local57];
							local227 = local223 >>> 24;
							local231 = 256 - local227;
							local235 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
							local348 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
							local223 = ((local235 | local348) >>> 8) + Static513.anInt9305;
							local356 = local3[local60];
							local3[local60] = ((local223 & 0xFF00FF) * local227 + (local356 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local356 & 0xFF00) * local231 & 0xFF0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
						local16 += Static513.anInt9321;
						local20++;
					}
				}
				local11++;
				Static513.anInt9310 += Static513.anInt9311;
				Static513.anInt9317 += Static513.anInt9293;
				Static513.anInt9292 += Static513.anInt9291;
			}
		} else if (Static513.anInt9309 < 0) {
			for (local11 = Static513.anInt9297; local11 < 0; local11++) {
				local14 = Static513.anInt9292;
				local16 = Static513.anInt9310 + Static513.anInt9318;
				local18 = Static513.anInt9317 + Static513.anInt9316;
				local20 = Static513.anInt9303;
				if (local16 < 0) {
					local956 = (Static513.anInt9321 - local16 - 1) / Static513.anInt9321;
					local20 += local956;
					local16 += Static513.anInt9321 * local956;
					local18 += Static513.anInt9309 * local956;
					local14 += local956;
				}
				@Pc(6756) int local6756;
				if ((local6756 = (local16 + 1 - (super.anInt9302 << 12) - Static513.anInt9321) / Static513.anInt9321) > local20) {
					local20 = local6756;
				}
				@Pc(6768) int local6768;
				if ((local6768 = local18 - (super.anInt9306 << 12)) >= 0) {
					local956 = (Static513.anInt9309 - local6768) / Static513.anInt9309;
					local20 += local956;
					local16 += Static513.anInt9321 * local956;
					local18 += Static513.anInt9309 * local956;
					local14 += local956;
				}
				@Pc(6802) int local6802;
				if ((local6802 = (local18 - Static513.anInt9309) / Static513.anInt9309) > local20) {
					local20 = local6802;
				}
				while (local20 < 0) {
					local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
					local60 = local14++;
					if (arg0 == 1) {
						local223 = this.anIntArray528[local57];
						local227 = local223 >>> 24;
						local231 = 256 - local227;
						local235 = local3[local60];
						local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
					} else if (arg0 == 0) {
						local223 = this.anIntArray528[local57];
						local227 = (local223 >>> 24) * Static513.anInt9304 >> 8;
						local231 = 256 - local227;
						if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
							local235 = local3[local60];
							local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
						} else if (local227 == 255) {
							local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
							local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
							local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
							local3[local60] = (local235 | local348 | local356) >>> 8;
						} else {
							local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
							local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
							local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
							local223 = (local235 | local348 | local356) >>> 8;
							local368 = local3[local60];
							local3[local60] = ((local223 & 0xFF00FF) * local227 + (local368 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local368 & 0xFF00) * local231 & 0xFF0000) >> 8;
						}
					} else if (arg0 == 3) {
						local223 = this.anIntArray528[local57];
						local227 = Static513.anInt9313;
						local231 = local223 + local227;
						local235 = (local223 & 0xFF00FF) + (local227 & 0xFF00FF);
						local348 = (local235 & 0x1000100) + (local231 - local235 & 0x10000);
						local348 = local231 - local348 | local348 - (local348 >>> 8);
						local356 = (local223 >>> 24) * Static513.anInt9304 >> 8;
						local368 = 256 - local356;
						if (local356 != 255) {
							local223 = local348;
							local348 = local3[local60];
							local348 = ((local223 & 0xFF00FF) * local356 + (local348 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local223 & 0xFF00) * local356 + (local348 & 0xFF00) * local368 & 0xFF0000) >> 8;
						}
						local3[local60] = local348;
					} else if (arg0 == 2) {
						local223 = this.anIntArray528[local57];
						local227 = local223 >>> 24;
						local231 = 256 - local227;
						local235 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
						local348 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
						local223 = ((local235 | local348) >>> 8) + Static513.anInt9305;
						local356 = local3[local60];
						local3[local60] = ((local223 & 0xFF00FF) * local227 + (local356 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local356 & 0xFF00) * local231 & 0xFF0000) >> 8;
					} else {
						throw new IllegalArgumentException();
					}
					local16 += Static513.anInt9321;
					local18 += Static513.anInt9309;
					local20++;
				}
				Static513.anInt9310 += Static513.anInt9311;
				Static513.anInt9317 += Static513.anInt9293;
				Static513.anInt9292 += Static513.anInt9291;
			}
		} else {
			for (local11 = Static513.anInt9297; local11 < 0; local11++) {
				local14 = Static513.anInt9292;
				local16 = Static513.anInt9310 + Static513.anInt9318;
				local18 = Static513.anInt9317 + Static513.anInt9316;
				local20 = Static513.anInt9303;
				if (local16 < 0) {
					local956 = (Static513.anInt9321 - local16 - 1) / Static513.anInt9321;
					local20 += local956;
					local16 += Static513.anInt9321 * local956;
					local18 += Static513.anInt9309 * local956;
					local14 += local956;
				}
				@Pc(7751) int local7751;
				if ((local7751 = (local16 + 1 - (super.anInt9302 << 12) - Static513.anInt9321) / Static513.anInt9321) > local20) {
					local20 = local7751;
				}
				if (local18 < 0) {
					local956 = (Static513.anInt9309 - local18 - 1) / Static513.anInt9309;
					local20 += local956;
					local16 += Static513.anInt9321 * local956;
					local18 += Static513.anInt9309 * local956;
					local14 += local956;
				}
				@Pc(7799) int local7799;
				if ((local7799 = (local18 + 1 - (super.anInt9306 << 12) - Static513.anInt9309) / Static513.anInt9309) > local20) {
					local20 = local7799;
				}
				while (local20 < 0) {
					local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
					local60 = local14++;
					if (arg0 == 1) {
						local223 = this.anIntArray528[local57];
						local227 = local223 >>> 24;
						local231 = 256 - local227;
						local235 = local3[local60];
						local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
					} else if (arg0 == 0) {
						local223 = this.anIntArray528[local57];
						local227 = (local223 >>> 24) * Static513.anInt9304 >> 8;
						local231 = 256 - local227;
						if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
							local235 = local3[local60];
							local3[local60] = ((local223 & 0xFF00FF) * local227 + (local235 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local235 & 0xFF00) * local231 & 0xFF0000) >> 8;
						} else if (local227 == 255) {
							local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
							local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
							local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
							local3[local60] = (local235 | local348 | local356) >>> 8;
						} else {
							local235 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
							local348 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
							local356 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
							local223 = (local235 | local348 | local356) >>> 8;
							local368 = local3[local60];
							local3[local60] = ((local223 & 0xFF00FF) * local227 + (local368 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local368 & 0xFF00) * local231 & 0xFF0000) >> 8;
						}
					} else if (arg0 == 3) {
						local223 = this.anIntArray528[local57];
						local227 = Static513.anInt9313;
						local231 = local223 + local227;
						local235 = (local223 & 0xFF00FF) + (local227 & 0xFF00FF);
						local348 = (local235 & 0x1000100) + (local231 - local235 & 0x10000);
						local348 = local231 - local348 | local348 - (local348 >>> 8);
						local356 = (local223 >>> 24) * Static513.anInt9304 >> 8;
						local368 = 256 - local356;
						if (local356 != 255) {
							local223 = local348;
							local348 = local3[local60];
							local348 = ((local223 & 0xFF00FF) * local356 + (local348 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local223 & 0xFF00) * local356 + (local348 & 0xFF00) * local368 & 0xFF0000) >> 8;
						}
						local3[local60] = local348;
					} else if (arg0 == 2) {
						local223 = this.anIntArray528[local57];
						local227 = local223 >>> 24;
						local231 = 256 - local227;
						local235 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
						local348 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
						local223 = ((local235 | local348) >>> 8) + Static513.anInt9305;
						local356 = local3[local60];
						local3[local60] = ((local223 & 0xFF00FF) * local227 + (local356 & 0xFF00FF) * local231 & 0xFF00FF00) + ((local223 & 0xFF00) * local227 + (local356 & 0xFF00) * local231 & 0xFF0000) >> 8;
					} else {
						throw new IllegalArgumentException();
					}
					local16 += Static513.anInt9321;
					local18 += Static513.anInt9309;
					local20++;
				}
				Static513.anInt9310 += Static513.anInt9311;
				Static513.anInt9317 += Static513.anInt9293;
				Static513.anInt9292 += Static513.anInt9291;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(20) int local20 = super.anInt9298 + super.anInt9302 + super.anInt9295;
		@Pc(29) int local29 = super.anInt9308 + super.anInt9306 + super.anInt9294;
		@Pc(35) int local35 = (local20 << 16) / arg3;
		@Pc(41) int local41 = (local29 << 16) / arg4;
		@Pc(55) int local55;
		if (super.anInt9298 > 0) {
			local55 = ((super.anInt9298 << 16) + local35 - 1) / local35;
			arg0 += local55;
			local9 = local55 * local35 - (super.anInt9298 << 16);
		}
		if (super.anInt9308 > 0) {
			local55 = ((super.anInt9308 << 16) + local41 - 1) / local41;
			arg1 += local55;
			local11 = local55 * local41 - (super.anInt9308 << 16);
		}
		if (super.anInt9302 < local20) {
			arg3 = ((super.anInt9302 << 16) + local35 - local9 - 1) / local35;
		}
		if (super.anInt9306 < local29) {
			arg4 = ((super.anInt9306 << 16) + local41 - local11 - 1) / local41;
		}
		local55 = arg0 + arg1 * super.aClass19_Sub2_10.anInt4207;
		@Pc(147) int local147 = super.aClass19_Sub2_10.anInt4207 - arg3;
		if (arg1 + arg4 > super.aClass19_Sub2_10.anInt4196) {
			arg4 -= arg1 + arg4 - super.aClass19_Sub2_10.anInt4196;
		}
		@Pc(175) int local175;
		if (arg1 < super.aClass19_Sub2_10.anInt4186) {
			local175 = super.aClass19_Sub2_10.anInt4186 - arg1;
			arg4 -= local175;
			local55 += local175 * super.aClass19_Sub2_10.anInt4207;
			local11 += local41 * local175;
		}
		if (arg0 + arg3 > super.aClass19_Sub2_10.anInt4200) {
			local175 = arg0 + arg3 - super.aClass19_Sub2_10.anInt4200;
			arg3 -= local175;
			local147 += local175;
		}
		if (arg0 < super.aClass19_Sub2_10.anInt4192) {
			local175 = super.aClass19_Sub2_10.anInt4192 - arg0;
			arg3 -= local175;
			local55 += local175;
			local9 += local35 * local175;
			local147 += local175;
		}
		@Pc(249) float[] local249 = super.aClass19_Sub2_10.aFloatArray24;
		@Pc(253) int[] local253 = super.aClass19_Sub2_10.anIntArray319;
		@Pc(262) int local262;
		@Pc(265) int local265;
		@Pc(273) int local273;
		@Pc(276) int local276;
		@Pc(348) int local348;
		@Pc(356) int local356;
		@Pc(359) int local359;
		@Pc(376) int local376;
		@Pc(384) int local384;
		@Pc(392) int local392;
		@Pc(400) int local400;
		@Pc(569) int local569;
		if (arg7 != 0) {
			@Pc(975) int local975;
			@Pc(983) int local983;
			@Pc(995) int local995;
			if (arg7 == 1) {
				if (arg5 == 1) {
					local262 = local9;
					for (local265 = -arg4; local265 < 0; local265++) {
						local273 = (local11 >> 16) * super.anInt9302;
						for (local276 = -arg3; local276 < 0; local276++) {
							if ((float) arg2 < local249[local55]) {
								local348 = this.anIntArray528[(local9 >> 16) + local273];
								local356 = local348 >>> 24;
								local359 = 256 - local356;
								local376 = local253[local55];
								local253[local55] = ((local348 & 0xFF00FF) * local356 + (local376 & 0xFF00FF) * local359 >> 8 & 0xFFFF00FF) + (((local348 & 0xFF00FF00) >>> 8) * local356 + ((local376 & 0xFF00FF00) >>> 8) * local359 & 0xFF00FF00);
								local249[local55] = (float) arg2;
							}
							local9 += local35;
							local55++;
						}
						local11 += local41;
						local9 = local262;
						local55 += local147;
					}
				} else if (arg5 == 0) {
					local262 = local9;
					if ((arg6 & 0xFFFFFF) == 16777215) {
						for (local265 = -arg4; local265 < 0; local265++) {
							local273 = (local11 >> 16) * super.anInt9302;
							for (local276 = -arg3; local276 < 0; local276++) {
								if ((float) arg2 < local249[local55]) {
									local348 = this.anIntArray528[(local9 >> 16) + local273];
									local356 = (local348 >>> 24) * (arg6 >>> 24) >> 8;
									local359 = 256 - local356;
									local376 = local253[local55];
									local253[local55] = ((local348 & 0xFF00FF) * local356 + (local376 & 0xFF00FF) * local359 & 0xFF00FF00) + ((local348 & 0xFF00) * local356 + (local376 & 0xFF00) * local359 & 0xFF0000) >> 8;
									local249[local55] = (float) arg2;
								}
								local9 += local35;
								local55++;
							}
							local11 += local41;
							local9 = local262;
							local55 += local147;
						}
					} else {
						local265 = arg6 >> 16 & 0xFF;
						local273 = arg6 >> 8 & 0xFF;
						local276 = arg6 & 0xFF;
						for (local348 = -arg4; local348 < 0; local348++) {
							local356 = (local11 >> 16) * super.anInt9302;
							for (local359 = -arg3; local359 < 0; local359++) {
								if ((float) arg2 < local249[local55]) {
									local376 = this.anIntArray528[(local9 >> 16) + local356];
									local384 = (local376 >>> 24) * (arg6 >>> 24) >> 8;
									local392 = 256 - local384;
									if (local384 == 255) {
										local400 = (local376 & 0xFF0000) * local265 & 0xFF000000;
										local975 = (local376 & 0xFF00) * local273 & 0xFF0000;
										local983 = (local376 & 0xFF) * local276 & 0xFF00;
										local253[local55] = (local400 | local975 | local983) >>> 8;
										local249[local55] = (float) arg2;
									} else {
										local400 = (local376 & 0xFF0000) * local265 & 0xFF000000;
										local975 = (local376 & 0xFF00) * local273 & 0xFF0000;
										local983 = (local376 & 0xFF) * local276 & 0xFF00;
										local376 = (local400 | local975 | local983) >>> 8;
										local995 = local253[local55];
										local253[local55] = ((local376 & 0xFF00FF) * local384 + (local995 & 0xFF00FF) * local392 & 0xFF00FF00) + ((local376 & 0xFF00) * local384 + (local995 & 0xFF00) * local392 & 0xFF0000) >> 8;
										local249[local55] = (float) arg2;
										@Pc(1038) int local1038 = (local995 >>> 24) + local384;
										if (local1038 > 255) {
											local1038 = 255;
										}
										local253[local55] |= local1038 << 24;
									}
								}
								local9 += local35;
								local55++;
							}
							local11 += local41;
							local9 = local262;
							local55 += local147;
						}
					}
				} else if (arg5 == 3) {
					local262 = local9;
					for (local265 = -arg4; local265 < 0; local265++) {
						local273 = (local11 >> 16) * super.anInt9302;
						for (local276 = -arg3; local276 < 0; local276++) {
							if ((float) arg2 < local249[local55]) {
								local348 = this.anIntArray528[(local9 >> 16) + local273];
								local356 = local348 + arg6;
								local359 = (local348 & 0xFF00FF) + (arg6 & 0xFF00FF);
								local376 = (local359 & 0x1000100) + (local356 - local359 & 0x10000);
								local376 = local356 - local376 | local376 - (local376 >>> 8);
								local384 = (local376 >>> 24) * (arg6 >>> 24) >> 8;
								local392 = 256 - local384;
								if (local384 != 255) {
									local348 = local376;
									local376 = local253[local55];
									local376 = ((local348 & 0xFF00FF) * local384 + (local376 & 0xFF00FF) * local392 & 0xFF00FF00) + ((local348 & 0xFF00) * local384 + (local376 & 0xFF00) * local392 & 0xFF0000) >> 8;
								}
								local253[local55] = local376;
								local249[local55] = (float) arg2;
							}
							local9 += local35;
							local55++;
						}
						local11 += local41;
						local9 = local262;
						local55 += local147;
					}
				} else if (arg5 == 2) {
					local262 = arg6 >>> 24;
					local265 = 256 - local262;
					local273 = (arg6 & 0xFF00FF) * local265 & 0xFF00FF00;
					local276 = (arg6 & 0xFF00) * local265 & 0xFF0000;
					local569 = (local273 | local276) >>> 8;
					local348 = local9;
					for (local356 = -arg4; local356 < 0; local356++) {
						local359 = (local11 >> 16) * super.anInt9302;
						for (local376 = -arg3; local376 < 0; local376++) {
							if ((float) arg2 < local249[local55]) {
								local384 = this.anIntArray528[(local9 >> 16) + local359];
								local392 = local384 >>> 24;
								local400 = 256 - local392;
								local273 = (local384 & 0xFF00FF) * local262 & 0xFF00FF00;
								local276 = (local384 & 0xFF00) * local262 & 0xFF0000;
								local384 = ((local273 | local276) >>> 8) + local569;
								local975 = local253[local55];
								local253[local55] = ((local384 & 0xFF00FF) * local392 + (local975 & 0xFF00FF) * local400 & 0xFF00FF00) + ((local384 & 0xFF00) * local392 + (local975 & 0xFF00) * local400 & 0xFF0000) >> 8;
								local249[local55] = (float) arg2;
							}
							local9 += local35;
							local55++;
						}
						local11 += local41;
						local9 = local348;
						local55 += local147;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg7 != 2) {
				throw new IllegalArgumentException();
			} else if (arg5 == 1) {
				local262 = local9;
				for (local265 = -arg4; local265 < 0; local265++) {
					local273 = (local11 >> 16) * super.anInt9302;
					for (local276 = -arg3; local276 < 0; local276++) {
						if ((float) arg2 < local249[local55]) {
							local348 = this.anIntArray528[(local9 >> 16) + local273];
							if (local348 != 0) {
								local356 = local253[local55];
								local359 = local348 + local356;
								local376 = (local348 & 0xFF00FF) + (local356 & 0xFF00FF);
								local356 = (local376 & 0x1000100) + (local359 - local376 & 0x10000);
								local253[local55] = local359 - local356 | local356 - (local356 >>> 8);
								local249[local55] = (float) arg2;
							}
						}
						local9 += local35;
						local55++;
					}
					local11 += local41;
					local9 = local262;
					local55 += local147;
				}
			} else if (arg5 == 0) {
				local262 = local9;
				local265 = arg6 >> 16 & 0xFF;
				local273 = arg6 >> 8 & 0xFF;
				local276 = arg6 & 0xFF;
				for (local348 = -arg4; local348 < 0; local348++) {
					local356 = (local11 >> 16) * super.anInt9302;
					for (local359 = -arg3; local359 < 0; local359++) {
						if ((float) arg2 < local249[local55]) {
							local376 = this.anIntArray528[(local9 >> 16) + local356];
							if (local376 != 0) {
								local384 = (local376 & 0xFF0000) * local265 & 0xFF000000;
								local392 = (local376 & 0xFF00) * local273 & 0xFF0000;
								local400 = (local376 & 0xFF) * local276 & 0xFF00;
								local376 = (local384 | local392 | local400) >>> 8;
								local975 = local253[local55];
								local983 = local376 + local975;
								local995 = (local376 & 0xFF00FF) + (local975 & 0xFF00FF);
								local975 = (local995 & 0x1000100) + (local983 - local995 & 0x10000);
								local253[local55] = local983 - local975 | local975 - (local975 >>> 8);
								local249[local55] = (float) arg2;
							}
						}
						local9 += local35;
						local55++;
					}
					local11 += local41;
					local9 = local262;
					local55 += local147;
				}
			} else if (arg5 == 3) {
				local262 = local9;
				for (local265 = -arg4; local265 < 0; local265++) {
					local273 = (local11 >> 16) * super.anInt9302;
					for (local276 = -arg3; local276 < 0; local276++) {
						if ((float) arg2 < local249[local55]) {
							local348 = this.anIntArray528[(local9 >> 16) + local273];
							local356 = local348 + arg6;
							local359 = (local348 & 0xFF00FF) + (arg6 & 0xFF00FF);
							local376 = (local359 & 0x1000100) + (local356 - local359 & 0x10000);
							local348 = local356 - local376 | local376 - (local376 >>> 8);
							local376 = local253[local55];
							local356 = local348 + local376;
							local359 = (local348 & 0xFF00FF) + (local376 & 0xFF00FF);
							local376 = (local359 & 0x1000100) + (local356 - local359 & 0x10000);
							local253[local55] = local356 - local376 | local376 - (local376 >>> 8);
							local249[local55] = (float) arg2;
						}
						local9 += local35;
						local55++;
					}
					local11 += local41;
					local9 = local262;
					local55 += local147;
				}
			} else if (arg5 == 2) {
				local262 = arg6 >>> 24;
				local265 = 256 - local262;
				local273 = (arg6 & 0xFF00FF) * local265 & 0xFF00FF00;
				local276 = (arg6 & 0xFF00) * local265 & 0xFF0000;
				local569 = (local273 | local276) >>> 8;
				local348 = local9;
				for (local356 = -arg4; local356 < 0; local356++) {
					local359 = (local11 >> 16) * super.anInt9302;
					for (local376 = -arg3; local376 < 0; local376++) {
						if ((float) arg2 < local249[local55]) {
							local384 = this.anIntArray528[(local9 >> 16) + local359];
							if (local384 != 0) {
								local273 = (local384 & 0xFF00FF) * local262 & 0xFF00FF00;
								local276 = (local384 & 0xFF00) * local262 & 0xFF0000;
								local384 = ((local273 | local276) >>> 8) + local569;
								local392 = local253[local55];
								local400 = local384 + local392;
								local975 = (local384 & 0xFF00FF) + (local392 & 0xFF00FF);
								@Pc(1946) int local1946 = (local975 & 0x1000100) + (local400 - local975 & 0x10000);
								local253[local55] = local400 - local1946 | local1946 - (local1946 >>> 8);
								local249[local55] = (float) arg2;
							}
						}
						local9 += local35;
						local55++;
					}
					local11 += local41;
					local9 = local348;
					local55 += local147;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg5 == 1) {
			local262 = local9;
			for (local265 = -arg4; local265 < 0; local265++) {
				local273 = (local11 >> 16) * super.anInt9302;
				for (local276 = -arg3; local276 < 0; local276++) {
					if ((float) arg2 < local249[local55]) {
						local253[local55] = this.anIntArray528[(local9 >> 16) + local273];
						local249[local55] = (float) arg2;
					}
					local9 += local35;
					local55++;
				}
				local11 += local41;
				local9 = local262;
				local55 += local147;
			}
		} else if (arg5 == 0) {
			local262 = arg6 >> 16 & 0xFF;
			local265 = arg6 >> 8 & 0xFF;
			local273 = arg6 & 0xFF;
			local276 = local9;
			for (local348 = -arg4; local348 < 0; local348++) {
				local356 = (local11 >> 16) * super.anInt9302;
				for (local359 = -arg3; local359 < 0; local359++) {
					if ((float) arg2 < local249[local55]) {
						local376 = this.anIntArray528[(local9 >> 16) + local356];
						local384 = (local376 & 0xFF0000) * local262 & 0xFF000000;
						local392 = (local376 & 0xFF00) * local265 & 0xFF0000;
						local400 = (local376 & 0xFF) * local273 & 0xFF00;
						local253[local55] = (local384 | local392 | local400) >>> 8;
						local249[local55] = (float) arg2;
					}
					local9 += local35;
					local55++;
				}
				local11 += local41;
				local9 = local276;
				local55 += local147;
			}
		} else if (arg5 == 3) {
			local262 = local9;
			for (local265 = -arg4; local265 < 0; local265++) {
				local273 = (local11 >> 16) * super.anInt9302;
				for (local276 = -arg3; local276 < 0; local276++) {
					if ((float) arg2 < local249[local55]) {
						local348 = this.anIntArray528[(local9 >> 16) + local273];
						local356 = local348 + arg6;
						local359 = (local348 & 0xFF00FF) + (arg6 & 0xFF00FF);
						local376 = (local359 & 0x1000100) + (local356 - local359 & 0x10000);
						local253[local55] = local356 - local376 | local376 - (local376 >>> 8);
						local249[local55] = (float) arg2;
					}
					local9 += local35;
					local55++;
				}
				local11 += local41;
				local9 = local262;
				local55 += local147;
			}
		} else if (arg5 == 2) {
			local262 = arg6 >>> 24;
			local265 = 256 - local262;
			local273 = (arg6 & 0xFF00FF) * local265 & 0xFF00FF00;
			local276 = (arg6 & 0xFF00) * local265 & 0xFF0000;
			local569 = (local273 | local276) >>> 8;
			local348 = local9;
			for (local356 = -arg4; local356 < 0; local356++) {
				local359 = (local11 >> 16) * super.anInt9302;
				for (local376 = -arg3; local376 < 0; local376++) {
					if ((float) arg2 < local249[local55]) {
						local384 = this.anIntArray528[(local9 >> 16) + local359];
						local273 = (local384 & 0xFF00FF) * local262 & 0xFF00FF00;
						local276 = (local384 & 0xFF00) * local262 & 0xFF0000;
						local253[local55] = ((local273 | local276) >>> 8) + local569;
						local249[local55] = (float) arg2;
					}
					local9 += local35;
					local55++;
				}
				local11 += local41;
				local9 = local348;
				local55 += local147;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)V")
	@Override
	public void method8196() {
		@Pc(203) int[] local203 = super.aClass19_Sub2_10.anIntArray319;
		for (@Pc(205) int local205 = 0; local205 < super.anInt9306; local205++) {
			@Pc(211) int local211 = local205 * super.anInt9302;
			@Pc(221) int local221 = local205 * super.aClass19_Sub2_10.anInt4207;
			for (@Pc(223) int local223 = 0; local223 < super.anInt9302; local223++) {
				this.anIntArray528[local211 + local223] = this.anIntArray528[local211 + local223] & 0xFFFFFF | (local203[local221 + local223] == 0 ? 0 : -16777216);
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method8210(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass19_Sub2_10.anIntArray319;
		@Pc(236) int local236;
		@Pc(11) int local11;
		@Pc(16) int local16;
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(64) int local64;
		@Pc(69) int local69;
		@Pc(75) int local75;
		@Pc(122) int local122;
		@Pc(126) int local126;
		@Pc(130) int local130;
		@Pc(134) int local134;
		if (Static513.anInt9321 == 0) {
			if (Static513.anInt9309 == 0) {
				local11 = Static513.anInt9297;
				while (local11 < 0) {
					local16 = local11 + arg3;
					if (local16 >= 0) {
						if (local16 >= arg0.length) {
							return;
						}
						local28 = Static513.anInt9292;
						local30 = Static513.anInt9310;
						local32 = Static513.anInt9317;
						local34 = Static513.anInt9303;
						if (local30 >= 0 && local32 >= 0 && local30 - (super.anInt9302 << 12) < 0 && local32 - (super.anInt9306 << 12) < 0) {
							local64 = arg0[local16] - arg2;
							local69 = -arg1[local16];
							local75 = local64 + Static513.anInt9292 - local28;
							if (local75 > 0) {
								local28 += local75;
								local34 += local75;
								local30 += Static513.anInt9321 * local75;
								local32 += Static513.anInt9309 * local75;
							} else {
								local69 -= local75;
							}
							if (local34 < local69) {
								local34 = local69;
							}
							while (local34 < 0) {
								local122 = this.anIntArray528[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
								local126 = local122 >>> 24;
								local130 = 256 - local126;
								local134 = local3[local28];
								local3[local28++] = ((local122 & 0xFF00FF) * local126 + (local134 & 0xFF00FF) * local130 & 0xFF00FF00) + ((local122 & 0xFF00) * local126 + (local134 & 0xFF00) * local130 & 0xFF0000) >> 8;
								local34++;
							}
						}
					}
					local11++;
					Static513.anInt9292 += Static513.anInt9291;
				}
			} else if (Static513.anInt9309 < 0) {
				local11 = Static513.anInt9297;
				while (local11 < 0) {
					local16 = local11 + arg3;
					if (local16 >= 0) {
						if (local16 >= arg0.length) {
							return;
						}
						local28 = Static513.anInt9292;
						local30 = Static513.anInt9310;
						local32 = Static513.anInt9317 + Static513.anInt9316;
						local34 = Static513.anInt9303;
						if (local30 >= 0 && local30 - (super.anInt9302 << 12) < 0) {
							@Pc(229) int local229;
							if ((local229 = local32 - (super.anInt9306 << 12)) >= 0) {
								local236 = (Static513.anInt9309 - local229) / Static513.anInt9309;
								local34 += local236;
								local32 += Static513.anInt9309 * local236;
								local28 += local236;
							}
							@Pc(257) int local257;
							if ((local257 = (local32 - Static513.anInt9309) / Static513.anInt9309) > local34) {
								local34 = local257;
							}
							local64 = arg0[local16] - arg2;
							local69 = -arg1[local16];
							local75 = local64 + Static513.anInt9292 - local28;
							if (local75 > 0) {
								local28 += local75;
								local34 += local75;
								local30 += Static513.anInt9321 * local75;
								local32 += Static513.anInt9309 * local75;
							} else {
								local69 -= local75;
							}
							if (local34 < local69) {
								local34 = local69;
							}
							while (local34 < 0) {
								local122 = this.anIntArray528[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
								local126 = local122 >>> 24;
								local130 = 256 - local126;
								local134 = local3[local28];
								local3[local28++] = ((local122 & 0xFF00FF) * local126 + (local134 & 0xFF00FF) * local130 & 0xFF00FF00) + ((local122 & 0xFF00) * local126 + (local134 & 0xFF00) * local130 & 0xFF0000) >> 8;
								local32 += Static513.anInt9309;
								local34++;
							}
						}
					}
					local11++;
					Static513.anInt9310 += Static513.anInt9311;
					Static513.anInt9292 += Static513.anInt9291;
				}
			} else {
				local11 = Static513.anInt9297;
				while (local11 < 0) {
					local16 = local11 + arg3;
					if (local16 >= 0) {
						if (local16 >= arg0.length) {
							return;
						}
						local28 = Static513.anInt9292;
						local30 = Static513.anInt9310;
						local32 = Static513.anInt9317 + Static513.anInt9316;
						local34 = Static513.anInt9303;
						if (local30 >= 0 && local30 - (super.anInt9302 << 12) < 0) {
							if (local32 < 0) {
								local236 = (Static513.anInt9309 - local32 - 1) / Static513.anInt9309;
								local34 += local236;
								local32 += Static513.anInt9309 * local236;
								local28 += local236;
							}
							@Pc(470) int local470;
							if ((local470 = (local32 + 1 - (super.anInt9306 << 12) - Static513.anInt9309) / Static513.anInt9309) > local34) {
								local34 = local470;
							}
							local64 = arg0[local16] - arg2;
							local69 = -arg1[local16];
							local75 = local64 + Static513.anInt9292 - local28;
							if (local75 > 0) {
								local28 += local75;
								local34 += local75;
								local30 += Static513.anInt9321 * local75;
								local32 += Static513.anInt9309 * local75;
							} else {
								local69 -= local75;
							}
							if (local34 < local69) {
								local34 = local69;
							}
							while (local34 < 0) {
								local122 = this.anIntArray528[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
								local126 = local122 >>> 24;
								local130 = 256 - local126;
								local134 = local3[local28];
								local3[local28++] = ((local122 & 0xFF00FF) * local126 + (local134 & 0xFF00FF) * local130 & 0xFF00FF00) + ((local122 & 0xFF00) * local126 + (local134 & 0xFF00) * local130 & 0xFF0000) >> 8;
								local32 += Static513.anInt9309;
								local34++;
							}
						}
					}
					local11++;
					Static513.anInt9310 += Static513.anInt9311;
					Static513.anInt9292 += Static513.anInt9291;
				}
			}
		} else if (Static513.anInt9321 < 0) {
			if (Static513.anInt9309 == 0) {
				local11 = Static513.anInt9297;
				while (local11 < 0) {
					local16 = local11 + arg3;
					if (local16 >= 0) {
						if (local16 >= arg0.length) {
							return;
						}
						local28 = Static513.anInt9292;
						local30 = Static513.anInt9310 + Static513.anInt9318;
						local32 = Static513.anInt9317;
						local34 = Static513.anInt9303;
						if (local32 >= 0 && local32 - (super.anInt9306 << 12) < 0) {
							@Pc(657) int local657;
							if ((local657 = local30 - (super.anInt9302 << 12)) >= 0) {
								local236 = (Static513.anInt9321 - local657) / Static513.anInt9321;
								local34 += local236;
								local30 += Static513.anInt9321 * local236;
								local28 += local236;
							}
							@Pc(685) int local685;
							if ((local685 = (local30 - Static513.anInt9321) / Static513.anInt9321) > local34) {
								local34 = local685;
							}
							local64 = arg0[local16] - arg2;
							local69 = -arg1[local16];
							local75 = local64 + Static513.anInt9292 - local28;
							if (local75 > 0) {
								local28 += local75;
								local34 += local75;
								local30 += Static513.anInt9321 * local75;
								local32 += Static513.anInt9309 * local75;
							} else {
								local69 -= local75;
							}
							if (local34 < local69) {
								local34 = local69;
							}
							while (local34 < 0) {
								local122 = this.anIntArray528[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
								local126 = local122 >>> 24;
								local130 = 256 - local126;
								local134 = local3[local28];
								local3[local28++] = ((local122 & 0xFF00FF) * local126 + (local134 & 0xFF00FF) * local130 & 0xFF00FF00) + ((local122 & 0xFF00) * local126 + (local134 & 0xFF00) * local130 & 0xFF0000) >> 8;
								local30 += Static513.anInt9321;
								local34++;
							}
						}
					}
					local11++;
					Static513.anInt9317 += Static513.anInt9293;
					Static513.anInt9292 += Static513.anInt9291;
				}
			} else if (Static513.anInt9309 < 0) {
				local11 = Static513.anInt9297;
				while (local11 < 0) {
					local16 = local11 + arg3;
					if (local16 >= 0) {
						if (local16 >= arg0.length) {
							return;
						}
						local28 = Static513.anInt9292;
						local30 = Static513.anInt9310 + Static513.anInt9318;
						local32 = Static513.anInt9317 + Static513.anInt9316;
						local34 = Static513.anInt9303;
						@Pc(859) int local859;
						if ((local859 = local30 - (super.anInt9302 << 12)) >= 0) {
							local236 = (Static513.anInt9321 - local859) / Static513.anInt9321;
							local34 += local236;
							local30 += Static513.anInt9321 * local236;
							local32 += Static513.anInt9309 * local236;
							local28 += local236;
						}
						@Pc(893) int local893;
						if ((local893 = (local30 - Static513.anInt9321) / Static513.anInt9321) > local34) {
							local34 = local893;
						}
						@Pc(905) int local905;
						if ((local905 = local32 - (super.anInt9306 << 12)) >= 0) {
							local236 = (Static513.anInt9309 - local905) / Static513.anInt9309;
							local34 += local236;
							local30 += Static513.anInt9321 * local236;
							local32 += Static513.anInt9309 * local236;
							local28 += local236;
						}
						@Pc(939) int local939;
						if ((local939 = (local32 - Static513.anInt9309) / Static513.anInt9309) > local34) {
							local34 = local939;
						}
						local64 = arg0[local16] - arg2;
						local69 = -arg1[local16];
						local75 = local64 + Static513.anInt9292 - local28;
						if (local75 > 0) {
							local28 += local75;
							local34 += local75;
							local30 += Static513.anInt9321 * local75;
							local32 += Static513.anInt9309 * local75;
						} else {
							local69 -= local75;
						}
						if (local34 < local69) {
							local34 = local69;
						}
						while (local34 < 0) {
							local122 = this.anIntArray528[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
							local126 = local122 >>> 24;
							local130 = 256 - local126;
							local134 = local3[local28];
							local3[local28++] = ((local122 & 0xFF00FF) * local126 + (local134 & 0xFF00FF) * local130 & 0xFF00FF00) + ((local122 & 0xFF00) * local126 + (local134 & 0xFF00) * local130 & 0xFF0000) >> 8;
							local30 += Static513.anInt9321;
							local32 += Static513.anInt9309;
							local34++;
						}
					}
					local11++;
					Static513.anInt9310 += Static513.anInt9311;
					Static513.anInt9317 += Static513.anInt9293;
					Static513.anInt9292 += Static513.anInt9291;
				}
			} else {
				local11 = Static513.anInt9297;
				while (local11 < 0) {
					local16 = local11 + arg3;
					if (local16 >= 0) {
						if (local16 >= arg0.length) {
							return;
						}
						local28 = Static513.anInt9292;
						local30 = Static513.anInt9310 + Static513.anInt9318;
						local32 = Static513.anInt9317 + Static513.anInt9316;
						local34 = Static513.anInt9303;
						@Pc(1119) int local1119;
						if ((local1119 = local30 - (super.anInt9302 << 12)) >= 0) {
							local236 = (Static513.anInt9321 - local1119) / Static513.anInt9321;
							local34 += local236;
							local30 += Static513.anInt9321 * local236;
							local32 += Static513.anInt9309 * local236;
							local28 += local236;
						}
						@Pc(1153) int local1153;
						if ((local1153 = (local30 - Static513.anInt9321) / Static513.anInt9321) > local34) {
							local34 = local1153;
						}
						if (local32 < 0) {
							local236 = (Static513.anInt9309 - local32 - 1) / Static513.anInt9309;
							local34 += local236;
							local30 += Static513.anInt9321 * local236;
							local32 += Static513.anInt9309 * local236;
							local28 += local236;
						}
						@Pc(1201) int local1201;
						if ((local1201 = (local32 + 1 - (super.anInt9306 << 12) - Static513.anInt9309) / Static513.anInt9309) > local34) {
							local34 = local1201;
						}
						local64 = arg0[local16] - arg2;
						local69 = -arg1[local16];
						local75 = local64 + Static513.anInt9292 - local28;
						if (local75 > 0) {
							local28 += local75;
							local34 += local75;
							local30 += Static513.anInt9321 * local75;
							local32 += Static513.anInt9309 * local75;
						} else {
							local69 -= local75;
						}
						if (local34 < local69) {
							local34 = local69;
						}
						while (local34 < 0) {
							local122 = this.anIntArray528[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
							local126 = local122 >>> 24;
							local130 = 256 - local126;
							local134 = local3[local28];
							local3[local28++] = ((local122 & 0xFF00FF) * local126 + (local134 & 0xFF00FF) * local130 & 0xFF00FF00) + ((local122 & 0xFF00) * local126 + (local134 & 0xFF00) * local130 & 0xFF0000) >> 8;
							local30 += Static513.anInt9321;
							local32 += Static513.anInt9309;
							local34++;
						}
					}
					local11++;
					Static513.anInt9310 += Static513.anInt9311;
					Static513.anInt9317 += Static513.anInt9293;
					Static513.anInt9292 += Static513.anInt9291;
				}
			}
		} else if (Static513.anInt9309 == 0) {
			local11 = Static513.anInt9297;
			while (local11 < 0) {
				local16 = local11 + arg3;
				if (local16 >= 0) {
					if (local16 >= arg0.length) {
						return;
					}
					local28 = Static513.anInt9292;
					local30 = Static513.anInt9310 + Static513.anInt9318;
					local32 = Static513.anInt9317;
					local34 = Static513.anInt9303;
					if (local32 >= 0 && local32 - (super.anInt9306 << 12) < 0) {
						if (local30 < 0) {
							local236 = (Static513.anInt9321 - local30 - 1) / Static513.anInt9321;
							local34 += local236;
							local30 += Static513.anInt9321 * local236;
							local28 += local236;
						}
						@Pc(1424) int local1424;
						if ((local1424 = (local30 + 1 - (super.anInt9302 << 12) - Static513.anInt9321) / Static513.anInt9321) > local34) {
							local34 = local1424;
						}
						local64 = arg0[local16] - arg2;
						local69 = -arg1[local16];
						local75 = local64 + Static513.anInt9292 - local28;
						if (local75 > 0) {
							local28 += local75;
							local34 += local75;
							local30 += Static513.anInt9321 * local75;
							local32 += Static513.anInt9309 * local75;
						} else {
							local69 -= local75;
						}
						if (local34 < local69) {
							local34 = local69;
						}
						while (local34 < 0) {
							local122 = this.anIntArray528[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
							local126 = local122 >>> 24;
							local130 = 256 - local126;
							local134 = local3[local28];
							local3[local28++] = ((local122 & 0xFF00FF) * local126 + (local134 & 0xFF00FF) * local130 & 0xFF00FF00) + ((local122 & 0xFF00) * local126 + (local134 & 0xFF00) * local130 & 0xFF0000) >> 8;
							local30 += Static513.anInt9321;
							local34++;
						}
					}
				}
				local11++;
				Static513.anInt9310 += Static513.anInt9311;
				Static513.anInt9317 += Static513.anInt9293;
				Static513.anInt9292 += Static513.anInt9291;
			}
		} else if (Static513.anInt9309 < 0) {
			local11 = Static513.anInt9297;
			while (local11 < 0) {
				local16 = local11 + arg3;
				if (local16 >= 0) {
					if (local16 >= arg0.length) {
						return;
					}
					local28 = Static513.anInt9292;
					local30 = Static513.anInt9310 + Static513.anInt9318;
					local32 = Static513.anInt9317 + Static513.anInt9316;
					local34 = Static513.anInt9303;
					if (local30 < 0) {
						local236 = (Static513.anInt9321 - local30 - 1) / Static513.anInt9321;
						local34 += local236;
						local30 += Static513.anInt9321 * local236;
						local32 += Static513.anInt9309 * local236;
						local28 += local236;
					}
					@Pc(1638) int local1638;
					if ((local1638 = (local30 + 1 - (super.anInt9302 << 12) - Static513.anInt9321) / Static513.anInt9321) > local34) {
						local34 = local1638;
					}
					@Pc(1650) int local1650;
					if ((local1650 = local32 - (super.anInt9306 << 12)) >= 0) {
						local236 = (Static513.anInt9309 - local1650) / Static513.anInt9309;
						local34 += local236;
						local30 += Static513.anInt9321 * local236;
						local32 += Static513.anInt9309 * local236;
						local28 += local236;
					}
					@Pc(1684) int local1684;
					if ((local1684 = (local32 - Static513.anInt9309) / Static513.anInt9309) > local34) {
						local34 = local1684;
					}
					local64 = arg0[local16] - arg2;
					local69 = -arg1[local16];
					local75 = local64 + Static513.anInt9292 - local28;
					if (local75 > 0) {
						local28 += local75;
						local34 += local75;
						local30 += Static513.anInt9321 * local75;
						local32 += Static513.anInt9309 * local75;
					} else {
						local69 -= local75;
					}
					if (local34 < local69) {
						local34 = local69;
					}
					while (local34 < 0) {
						local122 = this.anIntArray528[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
						local126 = local122 >>> 24;
						local130 = 256 - local126;
						local134 = local3[local28];
						local3[local28++] = ((local122 & 0xFF00FF) * local126 + (local134 & 0xFF00FF) * local130 & 0xFF00FF00) + ((local122 & 0xFF00) * local126 + (local134 & 0xFF00) * local130 & 0xFF0000) >> 8;
						local30 += Static513.anInt9321;
						local32 += Static513.anInt9309;
						local34++;
					}
				}
				local11++;
				Static513.anInt9310 += Static513.anInt9311;
				Static513.anInt9317 += Static513.anInt9293;
				Static513.anInt9292 += Static513.anInt9291;
			}
		} else {
			local11 = Static513.anInt9297;
			while (local11 < 0) {
				local16 = local11 + arg3;
				if (local16 >= 0) {
					if (local16 >= arg0.length) {
						return;
					}
					local28 = Static513.anInt9292;
					local30 = Static513.anInt9310 + Static513.anInt9318;
					local32 = Static513.anInt9317 + Static513.anInt9316;
					local34 = Static513.anInt9303;
					if (local30 < 0) {
						local236 = (Static513.anInt9321 - local30 - 1) / Static513.anInt9321;
						local34 += local236;
						local30 += Static513.anInt9321 * local236;
						local32 += Static513.anInt9309 * local236;
						local28 += local236;
					}
					@Pc(1900) int local1900;
					if ((local1900 = (local30 + 1 - (super.anInt9302 << 12) - Static513.anInt9321) / Static513.anInt9321) > local34) {
						local34 = local1900;
					}
					if (local32 < 0) {
						local236 = (Static513.anInt9309 - local32 - 1) / Static513.anInt9309;
						local34 += local236;
						local30 += Static513.anInt9321 * local236;
						local32 += Static513.anInt9309 * local236;
						local28 += local236;
					}
					@Pc(1948) int local1948;
					if ((local1948 = (local32 + 1 - (super.anInt9306 << 12) - Static513.anInt9309) / Static513.anInt9309) > local34) {
						local34 = local1948;
					}
					local64 = arg0[local16] - arg2;
					local69 = -arg1[local16];
					local75 = local64 + Static513.anInt9292 - local28;
					if (local75 > 0) {
						local28 += local75;
						local34 += local75;
						local30 += Static513.anInt9321 * local75;
						local32 += Static513.anInt9309 * local75;
					} else {
						local69 -= local75;
					}
					if (local34 < local69) {
						local34 = local69;
					}
					while (local34 < 0) {
						local122 = this.anIntArray528[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
						local126 = local122 >>> 24;
						local130 = 256 - local126;
						local134 = local3[local28];
						local3[local28++] = ((local122 & 0xFF00FF) * local126 + (local134 & 0xFF00FF) * local130 & 0xFF00FF00) + ((local122 & 0xFF00) * local126 + (local134 & 0xFF00) * local130 & 0xFF0000) >> 8;
						local30 += Static513.anInt9321;
						local32 += Static513.anInt9309;
						local34++;
					}
				}
				local11++;
				Static513.anInt9310 += Static513.anInt9311;
				Static513.anInt9317 += Static513.anInt9293;
				Static513.anInt9292 += Static513.anInt9291;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int[] local3 = super.aClass19_Sub2_10.anIntArray319;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(14) int local14 = (arg1 + local5) * arg2 + arg0;
			@Pc(22) int local22 = (arg5 + local5) * arg2 + arg4;
			for (@Pc(24) int local24 = 0; local24 < arg2; local24++) {
				this.anIntArray528[local14 + local24] = local3[local22 + local24] & 0xFFFFFF;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass19_Sub2_10.method3785()) {
			throw new IllegalStateException();
		}
		arg0 += super.anInt9298;
		arg1 += super.anInt9308;
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = super.aClass19_Sub2_10.anInt4207;
		@Pc(27) int local27 = super.anInt9302;
		@Pc(30) int local30 = super.anInt9306;
		@Pc(34) int local34 = local24 - local27;
		@Pc(36) int local36 = 0;
		@Pc(42) int local42 = arg0 + arg1 * local24;
		@Pc(53) int local53;
		if (arg1 < super.aClass19_Sub2_10.anInt4186) {
			local53 = super.aClass19_Sub2_10.anInt4186 - arg1;
			local30 -= local53;
			arg1 = super.aClass19_Sub2_10.anInt4186;
			local20 = local53 * local27;
			local42 += local53 * local24;
		}
		if (arg1 + local30 > super.aClass19_Sub2_10.anInt4196) {
			local30 -= arg1 + local30 - super.aClass19_Sub2_10.anInt4196;
		}
		if (arg0 < super.aClass19_Sub2_10.anInt4192) {
			local53 = super.aClass19_Sub2_10.anInt4192 - arg0;
			local27 -= local53;
			arg0 = super.aClass19_Sub2_10.anInt4192;
			local20 += local53;
			local42 += local53;
			local36 = local53;
			local34 += local53;
		}
		if (arg0 + local27 > super.aClass19_Sub2_10.anInt4200) {
			local53 = arg0 + local27 - super.aClass19_Sub2_10.anInt4200;
			local27 -= local53;
			local36 += local53;
			local34 += local53;
		}
		if (local27 <= 0 || local30 <= 0) {
			return;
		}
		@Pc(163) Class1_Sub1 local163 = (Class1_Sub1) arg2;
		@Pc(166) int[] local166 = local163.anIntArray334;
		@Pc(169) int[] local169 = local163.anIntArray335;
		@Pc(173) int[] local173 = super.aClass19_Sub2_10.anIntArray319;
		@Pc(175) int local175 = arg1;
		if (arg4 > arg1) {
			local175 = arg4;
			local42 += (arg4 - arg1) * local24;
			local20 += (arg4 - arg1) * super.anInt9302;
		}
		@Pc(215) int local215 = arg4 + local166.length < arg1 + local30 ? arg4 + local166.length : arg1 + local30;
		for (@Pc(217) int local217 = local175; local217 < local215; local217++) {
			@Pc(226) int local226 = local166[local217 - arg4] + arg3;
			@Pc(232) int local232 = local169[local217 - arg4];
			@Pc(234) int local234 = local27;
			@Pc(241) int local241;
			if (arg0 > local226) {
				local241 = arg0 - local226;
				if (local241 >= local232) {
					local20 += local27 + local36;
					local42 += local27 + local34;
					continue;
				}
				local232 -= local241;
			} else {
				local241 = local226 - arg0;
				if (local241 >= local27) {
					local20 += local27 + local36;
					local42 += local27 + local34;
					continue;
				}
				local20 += local241;
				local234 = local27 - local241;
				local42 += local241;
			}
			local241 = 0;
			if (local234 < local232) {
				local232 = local234;
			} else {
				local241 = local234 - local232;
			}
			for (@Pc(309) int local309 = -local232; local309 < 0; local309++) {
				@Pc(316) int local316 = this.anIntArray528[local20++];
				@Pc(320) int local320 = local316 >>> 24;
				@Pc(324) int local324 = 256 - local320;
				@Pc(328) int local328 = local173[local42];
				local173[local42++] = ((local316 & 0xFF00FF) * local320 + (local328 & 0xFF00FF) * local324 & 0xFF00FF00) + ((local316 & 0xFF00) * local320 + (local328 & 0xFF00) * local324 & 0xFF0000) >> 8;
			}
			local20 += local241 + local36;
			local42 += local241 + local34;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (super.aClass19_Sub2_10.method3785()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(18) int local18 = 0;
			@Pc(20) int local20 = 0;
			@Pc(24) int local24 = super.aClass19_Sub2_10.anInt4207;
			@Pc(33) int local33 = super.anInt9298 + super.anInt9302 + super.anInt9295;
			@Pc(42) int local42 = super.anInt9308 + super.anInt9306 + super.anInt9294;
			@Pc(48) int local48 = (local33 << 16) / arg2;
			@Pc(54) int local54 = (local42 << 16) / arg3;
			@Pc(68) int local68;
			if (super.anInt9298 > 0) {
				local68 = ((super.anInt9298 << 16) + local48 - 1) / local48;
				arg0 += local68;
				local18 = local68 * local48 - (super.anInt9298 << 16);
			}
			if (super.anInt9308 > 0) {
				local68 = ((super.anInt9308 << 16) + local54 - 1) / local54;
				arg1 += local68;
				local20 = local68 * local54 - (super.anInt9308 << 16);
			}
			if (super.anInt9302 < local33) {
				arg2 = ((super.anInt9302 << 16) + local48 - local18 - 1) / local48;
			}
			if (super.anInt9306 < local42) {
				arg3 = ((super.anInt9306 << 16) + local54 - local20 - 1) / local54;
			}
			local68 = arg0 + arg1 * local24;
			@Pc(156) int local156 = local24 - arg2;
			if (arg1 + arg3 > super.aClass19_Sub2_10.anInt4196) {
				arg3 -= arg1 + arg3 - super.aClass19_Sub2_10.anInt4196;
			}
			@Pc(184) int local184;
			if (arg1 < super.aClass19_Sub2_10.anInt4186) {
				local184 = super.aClass19_Sub2_10.anInt4186 - arg1;
				arg3 -= local184;
				local68 += local184 * local24;
				local20 += local54 * local184;
			}
			if (arg0 + arg2 > super.aClass19_Sub2_10.anInt4200) {
				local184 = arg0 + arg2 - super.aClass19_Sub2_10.anInt4200;
				arg2 -= local184;
				local156 += local184;
			}
			if (arg0 < super.aClass19_Sub2_10.anInt4192) {
				local184 = super.aClass19_Sub2_10.anInt4192 - arg0;
				arg2 -= local184;
				local68 += local184;
				local18 += local48 * local184;
				local156 += local184;
			}
			@Pc(256) int[] local256 = super.aClass19_Sub2_10.anIntArray319;
			@Pc(265) int local265;
			@Pc(268) int local268;
			@Pc(276) int local276;
			@Pc(279) int local279;
			@Pc(337) int local337;
			@Pc(345) int local345;
			@Pc(348) int local348;
			@Pc(358) int local358;
			@Pc(366) int local366;
			@Pc(374) int local374;
			@Pc(382) int local382;
			@Pc(534) int local534;
			if (arg6 != 0) {
				@Pc(897) int local897;
				@Pc(905) int local905;
				@Pc(917) int local917;
				if (arg6 == 1) {
					if (arg4 == 1) {
						local265 = local18;
						for (local268 = -arg3; local268 < 0; local268++) {
							local276 = (local20 >> 16) * super.anInt9302;
							for (local279 = -arg2; local279 < 0; local279++) {
								local337 = this.anIntArray528[(local18 >> 16) + local276];
								local345 = local337 >>> 24;
								local348 = 256 - local345;
								local358 = local256[local68];
								local256[local68++] = ((local337 & 0xFF00FF) * local345 + (local358 & 0xFF00FF) * local348 >> 8 & 0xFFFF00FF) + (((local337 & 0xFF00FF00) >>> 8) * local345 + ((local358 & 0xFF00FF00) >>> 8) * local348 & 0xFF00FF00);
								local18 += local48;
							}
							local20 += local54;
							local18 = local265;
							local68 += local156;
						}
					} else if (arg4 == 0) {
						local265 = local18;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							for (local268 = -arg3; local268 < 0; local268++) {
								local276 = (local20 >> 16) * super.anInt9302;
								for (local279 = -arg2; local279 < 0; local279++) {
									local337 = this.anIntArray528[(local18 >> 16) + local276];
									local345 = (local337 >>> 24) * (arg5 >>> 24) >> 8;
									local348 = 256 - local345;
									local358 = local256[local68];
									local256[local68++] = ((local337 & 0xFF00FF) * local345 + (local358 & 0xFF00FF) * local348 & 0xFF00FF00) + ((local337 & 0xFF00) * local345 + (local358 & 0xFF00) * local348 & 0xFF0000) >> 8;
									local18 += local48;
								}
								local20 += local54;
								local18 = local265;
								local68 += local156;
							}
						} else {
							local268 = arg5 >> 16 & 0xFF;
							local276 = arg5 >> 8 & 0xFF;
							local279 = arg5 & 0xFF;
							for (local337 = -arg3; local337 < 0; local337++) {
								local345 = (local20 >> 16) * super.anInt9302;
								for (local348 = -arg2; local348 < 0; local348++) {
									local358 = this.anIntArray528[(local18 >> 16) + local345];
									local366 = (local358 >>> 24) * (arg5 >>> 24) >> 8;
									local374 = 256 - local366;
									if (local366 == 255) {
										local382 = (local358 & 0xFF0000) * local268 & 0xFF000000;
										local897 = (local358 & 0xFF00) * local276 & 0xFF0000;
										local905 = (local358 & 0xFF) * local279 & 0xFF00;
										local256[local68++] = (local382 | local897 | local905) >>> 8;
									} else {
										local382 = (local358 & 0xFF0000) * local268 & 0xFF000000;
										local897 = (local358 & 0xFF00) * local276 & 0xFF0000;
										local905 = (local358 & 0xFF) * local279 & 0xFF00;
										local358 = (local382 | local897 | local905) >>> 8;
										local917 = local256[local68];
										local256[local68++] = ((local358 & 0xFF00FF) * local366 + (local917 & 0xFF00FF) * local374 & 0xFF00FF00) + ((local358 & 0xFF00) * local366 + (local917 & 0xFF00) * local374 & 0xFF0000) >> 8;
									}
									local18 += local48;
								}
								local20 += local54;
								local18 = local265;
								local68 += local156;
							}
						}
					} else if (arg4 == 3) {
						local265 = local18;
						for (local268 = -arg3; local268 < 0; local268++) {
							local276 = (local20 >> 16) * super.anInt9302;
							for (local279 = -arg2; local279 < 0; local279++) {
								local337 = this.anIntArray528[(local18 >> 16) + local276];
								local345 = local337 + arg5;
								local348 = (local337 & 0xFF00FF) + (arg5 & 0xFF00FF);
								local358 = (local348 & 0x1000100) + (local345 - local348 & 0x10000);
								local358 = local345 - local358 | local358 - (local358 >>> 8);
								local366 = (local358 >>> 24) * (arg5 >>> 24) >> 8;
								local374 = 256 - local366;
								if (local366 != 255) {
									local337 = local358;
									local358 = local256[local68];
									local358 = ((local337 & 0xFF00FF) * local366 + (local358 & 0xFF00FF) * local374 & 0xFF00FF00) + ((local337 & 0xFF00) * local366 + (local358 & 0xFF00) * local374 & 0xFF0000) >> 8;
								}
								local256[local68++] = local358;
								local18 += local48;
							}
							local20 += local54;
							local18 = local265;
							local68 += local156;
						}
					} else if (arg4 == 2) {
						local265 = arg5 >>> 24;
						local268 = 256 - local265;
						local276 = (arg5 & 0xFF00FF) * local268 & 0xFF00FF00;
						local279 = (arg5 & 0xFF00) * local268 & 0xFF0000;
						local534 = (local276 | local279) >>> 8;
						local337 = local18;
						for (local345 = -arg3; local345 < 0; local345++) {
							local348 = (local20 >> 16) * super.anInt9302;
							for (local358 = -arg2; local358 < 0; local358++) {
								local366 = this.anIntArray528[(local18 >> 16) + local348];
								local374 = local366 >>> 24;
								local382 = 256 - local374;
								local276 = (local366 & 0xFF00FF) * local265 & 0xFF00FF00;
								local279 = (local366 & 0xFF00) * local265 & 0xFF0000;
								local366 = ((local276 | local279) >>> 8) + local534;
								local897 = local256[local68];
								local256[local68++] = ((local366 & 0xFF00FF) * local374 + (local897 & 0xFF00FF) * local382 & 0xFF00FF00) + ((local366 & 0xFF00) * local374 + (local897 & 0xFF00) * local382 & 0xFF0000) >> 8;
								local18 += local48;
							}
							local20 += local54;
							local18 = local337;
							local68 += local156;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (arg6 != 2) {
					throw new IllegalArgumentException();
				} else if (arg4 == 1) {
					local265 = local18;
					for (local268 = -arg3; local268 < 0; local268++) {
						local276 = (local20 >> 16) * super.anInt9302;
						for (local279 = -arg2; local279 < 0; local279++) {
							local337 = this.anIntArray528[(local18 >> 16) + local276];
							if (local337 == 0) {
								local68++;
							} else {
								local345 = local256[local68];
								local348 = local337 + local345;
								local358 = (local337 & 0xFF00FF) + (local345 & 0xFF00FF);
								local345 = (local358 & 0x1000100) + (local348 - local358 & 0x10000);
								local256[local68++] = local348 - local345 | local345 - (local345 >>> 8);
							}
							local18 += local48;
						}
						local20 += local54;
						local18 = local265;
						local68 += local156;
					}
				} else if (arg4 == 0) {
					local265 = local18;
					local268 = arg5 >> 16 & 0xFF;
					local276 = arg5 >> 8 & 0xFF;
					local279 = arg5 & 0xFF;
					for (local337 = -arg3; local337 < 0; local337++) {
						local345 = (local20 >> 16) * super.anInt9302;
						for (local348 = -arg2; local348 < 0; local348++) {
							local358 = this.anIntArray528[(local18 >> 16) + local345];
							if (local358 == 0) {
								local68++;
							} else {
								local366 = (local358 & 0xFF0000) * local268 & 0xFF000000;
								local374 = (local358 & 0xFF00) * local276 & 0xFF0000;
								local382 = (local358 & 0xFF) * local279 & 0xFF00;
								local358 = (local366 | local374 | local382) >>> 8;
								local897 = local256[local68];
								local905 = local358 + local897;
								local917 = (local358 & 0xFF00FF) + (local897 & 0xFF00FF);
								local897 = (local917 & 0x1000100) + (local905 - local917 & 0x10000);
								local256[local68++] = local905 - local897 | local897 - (local897 >>> 8);
							}
							local18 += local48;
						}
						local20 += local54;
						local18 = local265;
						local68 += local156;
					}
				} else if (arg4 == 3) {
					local265 = local18;
					for (local268 = -arg3; local268 < 0; local268++) {
						local276 = (local20 >> 16) * super.anInt9302;
						for (local279 = -arg2; local279 < 0; local279++) {
							local337 = this.anIntArray528[(local18 >> 16) + local276];
							local345 = local337 + arg5;
							local348 = (local337 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local358 = (local348 & 0x1000100) + (local345 - local348 & 0x10000);
							local337 = local345 - local358 | local358 - (local358 >>> 8);
							local358 = local256[local68];
							local345 = local337 + local358;
							local348 = (local337 & 0xFF00FF) + (local358 & 0xFF00FF);
							local358 = (local348 & 0x1000100) + (local345 - local348 & 0x10000);
							local256[local68++] = local345 - local358 | local358 - (local358 >>> 8);
							local18 += local48;
						}
						local20 += local54;
						local18 = local265;
						local68 += local156;
					}
				} else if (arg4 == 2) {
					local265 = arg5 >>> 24;
					local268 = 256 - local265;
					local276 = (arg5 & 0xFF00FF) * local268 & 0xFF00FF00;
					local279 = (arg5 & 0xFF00) * local268 & 0xFF0000;
					local534 = (local276 | local279) >>> 8;
					local337 = local18;
					for (local345 = -arg3; local345 < 0; local345++) {
						local348 = (local20 >> 16) * super.anInt9302;
						for (local358 = -arg2; local358 < 0; local358++) {
							local366 = this.anIntArray528[(local18 >> 16) + local348];
							if (local366 == 0) {
								local68++;
							} else {
								local276 = (local366 & 0xFF00FF) * local265 & 0xFF00FF00;
								local279 = (local366 & 0xFF00) * local265 & 0xFF0000;
								local366 = ((local276 | local279) >>> 8) + local534;
								local374 = local256[local68];
								local382 = local366 + local374;
								local897 = (local366 & 0xFF00FF) + (local374 & 0xFF00FF);
								@Pc(1776) int local1776 = (local897 & 0x1000100) + (local382 - local897 & 0x10000);
								local256[local68++] = local382 - local1776 | local1776 - (local1776 >>> 8);
							}
							local18 += local48;
						}
						local20 += local54;
						local18 = local337;
						local68 += local156;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 == 1) {
				local265 = local18;
				for (local268 = -arg3; local268 < 0; local268++) {
					local276 = (local20 >> 16) * super.anInt9302;
					for (local279 = -arg2; local279 < 0; local279++) {
						local256[local68++] = this.anIntArray528[(local18 >> 16) + local276];
						local18 += local48;
					}
					local20 += local54;
					local18 = local265;
					local68 += local156;
				}
			} else if (arg4 == 0) {
				local265 = arg5 >> 16 & 0xFF;
				local268 = arg5 >> 8 & 0xFF;
				local276 = arg5 & 0xFF;
				local279 = local18;
				for (local337 = -arg3; local337 < 0; local337++) {
					local345 = (local20 >> 16) * super.anInt9302;
					for (local348 = -arg2; local348 < 0; local348++) {
						local358 = this.anIntArray528[(local18 >> 16) + local345];
						local366 = (local358 & 0xFF0000) * local265 & 0xFF000000;
						local374 = (local358 & 0xFF00) * local268 & 0xFF0000;
						local382 = (local358 & 0xFF) * local276 & 0xFF00;
						local256[local68++] = (local366 | local374 | local382) >>> 8;
						local18 += local48;
					}
					local20 += local54;
					local18 = local279;
					local68 += local156;
				}
			} else if (arg4 == 3) {
				local265 = local18;
				for (local268 = -arg3; local268 < 0; local268++) {
					local276 = (local20 >> 16) * super.anInt9302;
					for (local279 = -arg2; local279 < 0; local279++) {
						local337 = this.anIntArray528[(local18 >> 16) + local276];
						local345 = local337 + arg5;
						local348 = (local337 & 0xFF00FF) + (arg5 & 0xFF00FF);
						local358 = (local348 & 0x1000100) + (local345 - local348 & 0x10000);
						local256[local68++] = local345 - local358 | local358 - (local358 >>> 8);
						local18 += local48;
					}
					local20 += local54;
					local18 = local265;
					local68 += local156;
				}
			} else if (arg4 == 2) {
				local265 = arg5 >>> 24;
				local268 = 256 - local265;
				local276 = (arg5 & 0xFF00FF) * local268 & 0xFF00FF00;
				local279 = (arg5 & 0xFF00) * local268 & 0xFF0000;
				local534 = (local276 | local279) >>> 8;
				local337 = local18;
				for (local345 = -arg3; local345 < 0; local345++) {
					local348 = (local20 >> 16) * super.anInt9302;
					for (local358 = -arg2; local358 < 0; local358++) {
						local366 = this.anIntArray528[(local18 >> 16) + local348];
						local276 = (local366 & 0xFF00FF) * local265 & 0xFF00FF00;
						local279 = (local366 & 0xFF00) * local265 & 0xFF0000;
						local256[local68++] = ((local276 | local279) >>> 8) + local534;
						local18 += local48;
					}
					local20 += local54;
					local18 = local337;
					local68 += local156;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(20) int local20 = super.anInt9298 + super.anInt9302 + super.anInt9295;
		@Pc(29) int local29 = super.anInt9308 + super.anInt9306 + super.anInt9294;
		@Pc(35) int local35 = (local20 << 16) / arg3;
		@Pc(41) int local41 = (local29 << 16) / arg4;
		@Pc(55) int local55;
		if (super.anInt9298 > 0) {
			local55 = ((super.anInt9298 << 16) + local35 - 1) / local35;
			arg0 += local55;
			local9 = local55 * local35 - (super.anInt9298 << 16);
		}
		if (super.anInt9308 > 0) {
			local55 = ((super.anInt9308 << 16) + local41 - 1) / local41;
			arg1 += local55;
			local11 = local55 * local41 - (super.anInt9308 << 16);
		}
		if (super.anInt9302 < local20) {
			arg3 = ((super.anInt9302 << 16) + local35 - local9 - 1) / local35;
		}
		if (super.anInt9306 < local29) {
			arg4 = ((super.anInt9306 << 16) + local41 - local11 - 1) / local41;
		}
		local55 = arg0 + arg1 * super.aClass19_Sub2_10.anInt4207;
		@Pc(147) int local147 = super.aClass19_Sub2_10.anInt4207 - arg3;
		if (arg1 + arg4 > super.aClass19_Sub2_10.anInt4196) {
			arg4 -= arg1 + arg4 - super.aClass19_Sub2_10.anInt4196;
		}
		@Pc(175) int local175;
		if (arg1 < super.aClass19_Sub2_10.anInt4186) {
			local175 = super.aClass19_Sub2_10.anInt4186 - arg1;
			arg4 -= local175;
			local55 += local175 * super.aClass19_Sub2_10.anInt4207;
			local11 += local41 * local175;
		}
		if (arg0 + arg3 > super.aClass19_Sub2_10.anInt4200) {
			local175 = arg0 + arg3 - super.aClass19_Sub2_10.anInt4200;
			arg3 -= local175;
			local147 += local175;
		}
		if (arg0 < super.aClass19_Sub2_10.anInt4192) {
			local175 = super.aClass19_Sub2_10.anInt4192 - arg0;
			arg3 -= local175;
			local55 += local175;
			local9 += local35 * local175;
			local147 += local175;
		}
		@Pc(249) float[] local249 = super.aClass19_Sub2_10.aFloatArray24;
		@Pc(253) int[] local253 = super.aClass19_Sub2_10.anIntArray319;
		@Pc(262) int local262;
		@Pc(265) int local265;
		@Pc(273) int local273;
		@Pc(276) int local276;
		@Pc(348) int local348;
		@Pc(356) int local356;
		@Pc(359) int local359;
		@Pc(376) int local376;
		@Pc(384) int local384;
		@Pc(392) int local392;
		@Pc(400) int local400;
		@Pc(569) int local569;
		if (arg7 != 0) {
			@Pc(975) int local975;
			@Pc(983) int local983;
			@Pc(995) int local995;
			if (arg7 == 1) {
				if (arg5 == 1) {
					local262 = local9;
					for (local265 = -arg4; local265 < 0; local265++) {
						local273 = (local11 >> 16) * super.anInt9302;
						for (local276 = -arg3; local276 < 0; local276++) {
							if ((float) arg2 < local249[local55]) {
								local348 = this.anIntArray528[(local9 >> 16) + local273];
								local356 = local348 >>> 24;
								local359 = 256 - local356;
								local376 = local253[local55];
								local253[local55] = ((local348 & 0xFF00FF) * local356 + (local376 & 0xFF00FF) * local359 >> 8 & 0xFFFF00FF) + (((local348 & 0xFF00FF00) >>> 8) * local356 + ((local376 & 0xFF00FF00) >>> 8) * local359 & 0xFF00FF00);
								local249[local55] = (float) arg2;
							}
							local9 += local35;
							local55++;
						}
						local11 += local41;
						local9 = local262;
						local55 += local147;
					}
				} else if (arg5 == 0) {
					local262 = local9;
					if ((arg6 & 0xFFFFFF) == 16777215) {
						for (local265 = -arg4; local265 < 0; local265++) {
							local273 = (local11 >> 16) * super.anInt9302;
							for (local276 = -arg3; local276 < 0; local276++) {
								if ((float) arg2 < local249[local55]) {
									local348 = this.anIntArray528[(local9 >> 16) + local273];
									local356 = (local348 >>> 24) * (arg6 >>> 24) >> 8;
									local359 = 256 - local356;
									local376 = local253[local55];
									local253[local55] = ((local348 & 0xFF00FF) * local356 + (local376 & 0xFF00FF) * local359 & 0xFF00FF00) + ((local348 & 0xFF00) * local356 + (local376 & 0xFF00) * local359 & 0xFF0000) >> 8;
									local249[local55] = (float) arg2;
								}
								local9 += local35;
								local55++;
							}
							local11 += local41;
							local9 = local262;
							local55 += local147;
						}
					} else {
						local265 = arg6 >> 16 & 0xFF;
						local273 = arg6 >> 8 & 0xFF;
						local276 = arg6 & 0xFF;
						for (local348 = -arg4; local348 < 0; local348++) {
							local356 = (local11 >> 16) * super.anInt9302;
							for (local359 = -arg3; local359 < 0; local359++) {
								if ((float) arg2 < local249[local55]) {
									local376 = this.anIntArray528[(local9 >> 16) + local356];
									local384 = (local376 >>> 24) * (arg6 >>> 24) >> 8;
									local392 = 256 - local384;
									if (local384 == 255) {
										local400 = (local376 & 0xFF0000) * local265 & 0xFF000000;
										local975 = (local376 & 0xFF00) * local273 & 0xFF0000;
										local983 = (local376 & 0xFF) * local276 & 0xFF00;
										local253[local55] = (local400 | local975 | local983) >>> 8;
										local249[local55] = (float) arg2;
									} else {
										local400 = (local376 & 0xFF0000) * local265 & 0xFF000000;
										local975 = (local376 & 0xFF00) * local273 & 0xFF0000;
										local983 = (local376 & 0xFF) * local276 & 0xFF00;
										local376 = (local400 | local975 | local983) >>> 8;
										local995 = local253[local55];
										local253[local55] = ((local376 & 0xFF00FF) * local384 + (local995 & 0xFF00FF) * local392 & 0xFF00FF00) + ((local376 & 0xFF00) * local384 + (local995 & 0xFF00) * local392 & 0xFF0000) >> 8;
										local249[local55] = (float) arg2;
									}
								}
								local9 += local35;
								local55++;
							}
							local11 += local41;
							local9 = local262;
							local55 += local147;
						}
					}
				} else if (arg5 == 3) {
					local262 = local9;
					for (local265 = -arg4; local265 < 0; local265++) {
						local273 = (local11 >> 16) * super.anInt9302;
						for (local276 = -arg3; local276 < 0; local276++) {
							if ((float) arg2 < local249[local55]) {
								local348 = this.anIntArray528[(local9 >> 16) + local273];
								local356 = local348 + arg6;
								local359 = (local348 & 0xFF00FF) + (arg6 & 0xFF00FF);
								local376 = (local359 & 0x1000100) + (local356 - local359 & 0x10000);
								local376 = local356 - local376 | local376 - (local376 >>> 8);
								local384 = (local376 >>> 24) * (arg6 >>> 24) >> 8;
								local392 = 256 - local384;
								if (local384 != 255) {
									local348 = local376;
									local376 = local253[local55];
									local376 = ((local348 & 0xFF00FF) * local384 + (local376 & 0xFF00FF) * local392 & 0xFF00FF00) + ((local348 & 0xFF00) * local384 + (local376 & 0xFF00) * local392 & 0xFF0000) >> 8;
								}
								local253[local55] = local376;
								local249[local55] = (float) arg2;
							}
							local9 += local35;
							local55++;
						}
						local11 += local41;
						local9 = local262;
						local55 += local147;
					}
				} else if (arg5 == 2) {
					local262 = arg6 >>> 24;
					local265 = 256 - local262;
					local273 = (arg6 & 0xFF00FF) * local265 & 0xFF00FF00;
					local276 = (arg6 & 0xFF00) * local265 & 0xFF0000;
					local569 = (local273 | local276) >>> 8;
					local348 = local9;
					for (local356 = -arg4; local356 < 0; local356++) {
						local359 = (local11 >> 16) * super.anInt9302;
						for (local376 = -arg3; local376 < 0; local376++) {
							if ((float) arg2 < local249[local55]) {
								local384 = this.anIntArray528[(local9 >> 16) + local359];
								local392 = local384 >>> 24;
								local400 = 256 - local392;
								local273 = (local384 & 0xFF00FF) * local262 & 0xFF00FF00;
								local276 = (local384 & 0xFF00) * local262 & 0xFF0000;
								local384 = ((local273 | local276) >>> 8) + local569;
								local975 = local253[local55];
								local253[local55] = ((local384 & 0xFF00FF) * local392 + (local975 & 0xFF00FF) * local400 & 0xFF00FF00) + ((local384 & 0xFF00) * local392 + (local975 & 0xFF00) * local400 & 0xFF0000) >> 8;
								local249[local55] = (float) arg2;
							}
							local9 += local35;
							local55++;
						}
						local11 += local41;
						local9 = local348;
						local55 += local147;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg7 != 2) {
				throw new IllegalArgumentException();
			} else if (arg5 == 1) {
				local262 = local9;
				for (local265 = -arg4; local265 < 0; local265++) {
					local273 = (local11 >> 16) * super.anInt9302;
					for (local276 = -arg3; local276 < 0; local276++) {
						if ((float) arg2 < local249[local55]) {
							local348 = this.anIntArray528[(local9 >> 16) + local273];
							if (local348 != 0) {
								local356 = local253[local55];
								local359 = local348 + local356;
								local376 = (local348 & 0xFF00FF) + (local356 & 0xFF00FF);
								local356 = (local376 & 0x1000100) + (local359 - local376 & 0x10000);
								local253[local55] = local359 - local356 | local356 - (local356 >>> 8);
								local249[local55] = (float) arg2;
							}
						}
						local9 += local35;
						local55++;
					}
					local11 += local41;
					local9 = local262;
					local55 += local147;
				}
			} else if (arg5 == 0) {
				local262 = local9;
				local265 = arg6 >> 16 & 0xFF;
				local273 = arg6 >> 8 & 0xFF;
				local276 = arg6 & 0xFF;
				for (local348 = -arg4; local348 < 0; local348++) {
					local356 = (local11 >> 16) * super.anInt9302;
					for (local359 = -arg3; local359 < 0; local359++) {
						if ((float) arg2 < local249[local55]) {
							local376 = this.anIntArray528[(local9 >> 16) + local356];
							if (local376 != 0) {
								local384 = (local376 & 0xFF0000) * local265 & 0xFF000000;
								local392 = (local376 & 0xFF00) * local273 & 0xFF0000;
								local400 = (local376 & 0xFF) * local276 & 0xFF00;
								local376 = (local384 | local392 | local400) >>> 8;
								local975 = local253[local55];
								local983 = local376 + local975;
								local995 = (local376 & 0xFF00FF) + (local975 & 0xFF00FF);
								local975 = (local995 & 0x1000100) + (local983 - local995 & 0x10000);
								local253[local55] = local983 - local975 | local975 - (local975 >>> 8);
								local249[local55] = (float) arg2;
							}
						}
						local9 += local35;
						local55++;
					}
					local11 += local41;
					local9 = local262;
					local55 += local147;
				}
			} else if (arg5 == 3) {
				local262 = local9;
				for (local265 = -arg4; local265 < 0; local265++) {
					local273 = (local11 >> 16) * super.anInt9302;
					for (local276 = -arg3; local276 < 0; local276++) {
						if ((float) arg2 < local249[local55]) {
							local348 = this.anIntArray528[(local9 >> 16) + local273];
							local356 = local348 + arg6;
							local359 = (local348 & 0xFF00FF) + (arg6 & 0xFF00FF);
							local376 = (local359 & 0x1000100) + (local356 - local359 & 0x10000);
							local348 = local356 - local376 | local376 - (local376 >>> 8);
							local376 = local253[local55];
							local356 = local348 + local376;
							local359 = (local348 & 0xFF00FF) + (local376 & 0xFF00FF);
							local376 = (local359 & 0x1000100) + (local356 - local359 & 0x10000);
							local253[local55] = local356 - local376 | local376 - (local376 >>> 8);
							local249[local55] = (float) arg2;
						}
						local9 += local35;
						local55++;
					}
					local11 += local41;
					local9 = local262;
					local55 += local147;
				}
			} else if (arg5 == 2) {
				local262 = arg6 >>> 24;
				local265 = 256 - local262;
				local273 = (arg6 & 0xFF00FF) * local265 & 0xFF00FF00;
				local276 = (arg6 & 0xFF00) * local265 & 0xFF0000;
				local569 = (local273 | local276) >>> 8;
				local348 = local9;
				for (local356 = -arg4; local356 < 0; local356++) {
					local359 = (local11 >> 16) * super.anInt9302;
					for (local376 = -arg3; local376 < 0; local376++) {
						if ((float) arg2 < local249[local55]) {
							local384 = this.anIntArray528[(local9 >> 16) + local359];
							if (local384 != 0) {
								local273 = (local384 & 0xFF00FF) * local262 & 0xFF00FF00;
								local276 = (local384 & 0xFF00) * local262 & 0xFF0000;
								local384 = ((local273 | local276) >>> 8) + local569;
								local392 = local253[local55];
								local400 = local384 + local392;
								local975 = (local384 & 0xFF00FF) + (local392 & 0xFF00FF);
								@Pc(1926) int local1926 = (local975 & 0x1000100) + (local400 - local975 & 0x10000);
								local253[local55] = local400 - local1926 | local1926 - (local1926 >>> 8);
								local249[local55] = (float) arg2;
							}
						}
						local9 += local35;
						local55++;
					}
					local11 += local41;
					local9 = local348;
					local55 += local147;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg5 == 1) {
			local262 = local9;
			for (local265 = -arg4; local265 < 0; local265++) {
				local273 = (local11 >> 16) * super.anInt9302;
				for (local276 = -arg3; local276 < 0; local276++) {
					if ((float) arg2 < local249[local55]) {
						local253[local55] = this.anIntArray528[(local9 >> 16) + local273];
						local249[local55] = (float) arg2;
					}
					local9 += local35;
					local55++;
				}
				local11 += local41;
				local9 = local262;
				local55 += local147;
			}
		} else if (arg5 == 0) {
			local262 = arg6 >> 16 & 0xFF;
			local265 = arg6 >> 8 & 0xFF;
			local273 = arg6 & 0xFF;
			local276 = local9;
			for (local348 = -arg4; local348 < 0; local348++) {
				local356 = (local11 >> 16) * super.anInt9302;
				for (local359 = -arg3; local359 < 0; local359++) {
					if ((float) arg2 < local249[local55]) {
						local376 = this.anIntArray528[(local9 >> 16) + local356];
						local384 = (local376 & 0xFF0000) * local262 & 0xFF000000;
						local392 = (local376 & 0xFF00) * local265 & 0xFF0000;
						local400 = (local376 & 0xFF) * local273 & 0xFF00;
						local253[local55] = (local384 | local392 | local400) >>> 8;
						local249[local55] = (float) arg2;
					}
					local9 += local35;
					local55++;
				}
				local11 += local41;
				local9 = local276;
				local55 += local147;
			}
		} else if (arg5 == 3) {
			local262 = local9;
			for (local265 = -arg4; local265 < 0; local265++) {
				local273 = (local11 >> 16) * super.anInt9302;
				for (local276 = -arg3; local276 < 0; local276++) {
					if ((float) arg2 < local249[local55]) {
						local348 = this.anIntArray528[(local9 >> 16) + local273];
						local356 = local348 + arg6;
						local359 = (local348 & 0xFF00FF) + (arg6 & 0xFF00FF);
						local376 = (local359 & 0x1000100) + (local356 - local359 & 0x10000);
						local253[local55] = local356 - local376 | local376 - (local376 >>> 8);
						local249[local55] = (float) arg2;
					}
					local9 += local35;
					local55++;
				}
				local11 += local41;
				local9 = local262;
				local55 += local147;
			}
		} else if (arg5 == 2) {
			local262 = arg6 >>> 24;
			local265 = 256 - local262;
			local273 = (arg6 & 0xFF00FF) * local265 & 0xFF00FF00;
			local276 = (arg6 & 0xFF00) * local265 & 0xFF0000;
			local569 = (local273 | local276) >>> 8;
			local348 = local9;
			for (local356 = -arg4; local356 < 0; local356++) {
				local359 = (local11 >> 16) * super.anInt9302;
				for (local376 = -arg3; local376 < 0; local376++) {
					if ((float) arg2 < local249[local55]) {
						local384 = this.anIntArray528[(local9 >> 16) + local359];
						local273 = (local384 & 0xFF00FF) * local262 & 0xFF00FF00;
						local276 = (local384 & 0xFF00) * local262 & 0xFF0000;
						local253[local55] = ((local273 | local276) >>> 8) + local569;
						local249[local55] = (float) arg2;
					}
					local9 += local35;
					local55++;
				}
				local11 += local41;
				local9 = local348;
				local55 += local147;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
