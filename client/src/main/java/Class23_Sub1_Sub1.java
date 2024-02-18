import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class23_Sub1_Sub1 extends Class23_Sub1 {

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "[I")
	public final int[] anIntArray32;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!iaa;[III)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anIntArray32 = arg1;
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!iaa;II)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1, arg2);
		this.anIntArray32 = new int[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!iaa;[IIIIIZ)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg4, arg5);
		if (arg6) {
			this.anIntArray32 = new int[arg4 * arg5];
		} else {
			this.anIntArray32 = arg1;
		}
		@Pc(21) int local21 = arg3 - super.anInt9302;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg5; local25++) {
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(34) int local34 = arg1[arg2++];
				if (local34 >>> 24 == 255) {
					this.anIntArray32[local23++] = (local34 & 0xFFFFFF) == 0 ? -16777215 : local34;
				} else {
					this.anIntArray32[local23++] = 0;
				}
			}
			arg2 += local21;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int[] local3 = super.aClass19_Sub2_10.anIntArray319;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(15) int local15 = (arg1 + local5) * super.anInt9302 + arg0;
			@Pc(25) int local25 = (arg5 + local5) * super.aClass19_Sub2_10.anInt4207 + arg4;
			for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
				this.anIntArray32[local15 + local27] = local3[local25 + local27];
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(IIIIIIIII)V")
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
			@Pc(929) int local929;
			@Pc(937) int local937;
			@Pc(949) int local949;
			if (arg7 == 1) {
				if (arg5 == 1) {
					local262 = local9;
					for (local265 = -arg4; local265 < 0; local265++) {
						local273 = (local11 >> 16) * super.anInt9302;
						for (local276 = -arg3; local276 < 0; local276++) {
							if ((float) arg2 < local249[local55]) {
								local348 = this.anIntArray32[(local9 >> 16) + local273];
								if (local348 != 0) {
									local253[local55] = local348;
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
					if ((arg6 & 0xFFFFFF) == 16777215) {
						local265 = arg6 >>> 24;
						local273 = 256 - local265;
						for (local276 = -arg4; local276 < 0; local276++) {
							local348 = (local11 >> 16) * super.anInt9302;
							for (local356 = -arg3; local356 < 0; local356++) {
								if ((float) arg2 < local249[local55]) {
									local359 = this.anIntArray32[(local9 >> 16) + local348];
									if (local359 != 0) {
										local376 = local253[local55];
										local253[local55] = ((local359 & 0xFF00FF) * local265 + (local376 & 0xFF00FF) * local273 & 0xFF00FF00) + ((local359 & 0xFF00) * local265 + (local376 & 0xFF00) * local273 & 0xFF0000) >> 8;
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
					} else {
						local265 = arg6 >> 16 & 0xFF;
						local273 = arg6 >> 8 & 0xFF;
						local276 = arg6 & 0xFF;
						local348 = arg6 >>> 24;
						local356 = 256 - local348;
						for (local359 = -arg4; local359 < 0; local359++) {
							local376 = (local11 >> 16) * super.anInt9302;
							for (local384 = -arg3; local384 < 0; local384++) {
								if ((float) arg2 < local249[local55]) {
									local392 = this.anIntArray32[(local9 >> 16) + local376];
									if (local392 != 0) {
										if (local348 == 255) {
											local400 = (local392 & 0xFF0000) * local265 & 0xFF000000;
											local929 = (local392 & 0xFF00) * local273 & 0xFF0000;
											local937 = (local392 & 0xFF) * local276 & 0xFF00;
											local253[local55] = (local400 | local929 | local937) >>> 8;
											local249[local55] = (float) arg2;
										} else {
											local400 = (local392 & 0xFF0000) * local265 & 0xFF000000;
											local929 = (local392 & 0xFF00) * local273 & 0xFF0000;
											local937 = (local392 & 0xFF) * local276 & 0xFF00;
											local392 = (local400 | local929 | local937) >>> 8;
											local949 = local253[local55];
											local253[local55] = ((local392 & 0xFF00FF) * local348 + (local949 & 0xFF00FF) * local356 & 0xFF00FF00) + ((local392 & 0xFF00) * local348 + (local949 & 0xFF00) * local356 & 0xFF0000) >> 8;
											local249[local55] = (float) arg2;
										}
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
					local265 = arg6 >>> 24;
					local273 = 256 - local265;
					for (local276 = -arg4; local276 < 0; local276++) {
						local348 = (local11 >> 16) * super.anInt9302;
						for (local356 = -arg3; local356 < 0; local356++) {
							if ((float) arg2 < local249[local55]) {
								local359 = this.anIntArray32[(local9 >> 16) + local348];
								local376 = local359 + arg6;
								local384 = (local359 & 0xFF00FF) + (arg6 & 0xFF00FF);
								local392 = (local384 & 0x1000100) + (local376 - local384 & 0x10000);
								local392 = local376 - local392 | local392 - (local392 >>> 8);
								if (local359 == 0 && local265 != 255) {
									local359 = local392;
									local392 = local253[local55];
									local392 = ((local359 & 0xFF00FF) * local265 + (local392 & 0xFF00FF) * local273 & 0xFF00FF00) + ((local359 & 0xFF00) * local265 + (local392 & 0xFF00) * local273 & 0xFF0000) >> 8;
								}
								local253[local55] = local392;
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
								local384 = this.anIntArray32[(local9 >> 16) + local359];
								if (local384 != 0) {
									local273 = (local384 & 0xFF00FF) * local262 & 0xFF00FF00;
									local276 = (local384 & 0xFF00) * local262 & 0xFF0000;
									local253[local55] = ((local273 | local276) >>> 8) + local569;
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
			} else if (arg7 != 2) {
				throw new IllegalArgumentException();
			} else if (arg5 == 1) {
				local262 = local9;
				for (local265 = -arg4; local265 < 0; local265++) {
					local273 = (local11 >> 16) * super.anInt9302;
					for (local276 = -arg3; local276 < 0; local276++) {
						if ((float) arg2 < local249[local55]) {
							local348 = this.anIntArray32[(local9 >> 16) + local273];
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
							local376 = this.anIntArray32[(local9 >> 16) + local356];
							if (local376 != 0) {
								local384 = (local376 & 0xFF0000) * local265 & 0xFF000000;
								local392 = (local376 & 0xFF00) * local273 & 0xFF0000;
								local400 = (local376 & 0xFF) * local276 & 0xFF00;
								local376 = (local384 | local392 | local400) >>> 8;
								local929 = local253[local55];
								local937 = local376 + local929;
								local949 = (local376 & 0xFF00FF) + (local929 & 0xFF00FF);
								local929 = (local949 & 0x1000100) + (local937 - local949 & 0x10000);
								local253[local55] = local937 - local929 | local929 - (local929 >>> 8);
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
							local348 = this.anIntArray32[(local9 >> 16) + local273];
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
							local384 = this.anIntArray32[(local9 >> 16) + local359];
							if (local384 != 0) {
								local273 = (local384 & 0xFF00FF) * local262 & 0xFF00FF00;
								local276 = (local384 & 0xFF00) * local262 & 0xFF0000;
								local384 = ((local273 | local276) >>> 8) + local569;
								local392 = local253[local55];
								local400 = local384 + local392;
								local929 = (local384 & 0xFF00FF) + (local392 & 0xFF00FF);
								@Pc(1838) int local1838 = (local929 & 0x1000100) + (local400 - local929 & 0x10000);
								local253[local55] = local400 - local1838 | local1838 - (local1838 >>> 8);
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
						local253[local55] = this.anIntArray32[(local9 >> 16) + local273];
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
						local376 = this.anIntArray32[(local9 >> 16) + local356];
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
						local348 = this.anIntArray32[(local9 >> 16) + local273];
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
						local384 = this.anIntArray32[(local9 >> 16) + local359];
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

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)V")
	@Override
	public void method8196() {
		throw new IllegalStateException("Can't capture alpha into a java_sprite_24");
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIII)V")
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
			@Pc(929) int local929;
			@Pc(937) int local937;
			@Pc(949) int local949;
			if (arg7 == 1) {
				if (arg5 == 1) {
					local262 = local9;
					for (local265 = -arg4; local265 < 0; local265++) {
						local273 = (local11 >> 16) * super.anInt9302;
						for (local276 = -arg3; local276 < 0; local276++) {
							if ((float) arg2 < local249[local55]) {
								local348 = this.anIntArray32[(local9 >> 16) + local273];
								if (local348 != 0) {
									local253[local55] = local348;
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
					if ((arg6 & 0xFFFFFF) == 16777215) {
						local265 = arg6 >>> 24;
						local273 = 256 - local265;
						for (local276 = -arg4; local276 < 0; local276++) {
							local348 = (local11 >> 16) * super.anInt9302;
							for (local356 = -arg3; local356 < 0; local356++) {
								if ((float) arg2 < local249[local55]) {
									local359 = this.anIntArray32[(local9 >> 16) + local348];
									if (local359 != 0) {
										local376 = local253[local55];
										local253[local55] = ((local359 & 0xFF00FF) * local265 + (local376 & 0xFF00FF) * local273 & 0xFF00FF00) + ((local359 & 0xFF00) * local265 + (local376 & 0xFF00) * local273 & 0xFF0000) >> 8;
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
					} else {
						local265 = arg6 >> 16 & 0xFF;
						local273 = arg6 >> 8 & 0xFF;
						local276 = arg6 & 0xFF;
						local348 = arg6 >>> 24;
						local356 = 256 - local348;
						for (local359 = -arg4; local359 < 0; local359++) {
							local376 = (local11 >> 16) * super.anInt9302;
							for (local384 = -arg3; local384 < 0; local384++) {
								if ((float) arg2 < local249[local55]) {
									local392 = this.anIntArray32[(local9 >> 16) + local376];
									if (local392 != 0) {
										if (local348 == 255) {
											local400 = (local392 & 0xFF0000) * local265 & 0xFF000000;
											local929 = (local392 & 0xFF00) * local273 & 0xFF0000;
											local937 = (local392 & 0xFF) * local276 & 0xFF00;
											local253[local55] = (local400 | local929 | local937) >>> 8;
											local249[local55] = (float) arg2;
										} else {
											local400 = (local392 & 0xFF0000) * local265 & 0xFF000000;
											local929 = (local392 & 0xFF00) * local273 & 0xFF0000;
											local937 = (local392 & 0xFF) * local276 & 0xFF00;
											local392 = (local400 | local929 | local937) >>> 8;
											local949 = local253[local55];
											local253[local55] = ((local392 & 0xFF00FF) * local348 + (local949 & 0xFF00FF) * local356 & 0xFF00FF00) + ((local392 & 0xFF00) * local348 + (local949 & 0xFF00) * local356 & 0xFF0000) >> 8;
											local249[local55] = (float) arg2;
										}
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
					local265 = arg6 >>> 24;
					local273 = 256 - local265;
					for (local276 = -arg4; local276 < 0; local276++) {
						local348 = (local11 >> 16) * super.anInt9302;
						for (local356 = -arg3; local356 < 0; local356++) {
							if ((float) arg2 < local249[local55]) {
								local359 = this.anIntArray32[(local9 >> 16) + local348];
								local376 = local359 + arg6;
								local384 = (local359 & 0xFF00FF) + (arg6 & 0xFF00FF);
								local392 = (local384 & 0x1000100) + (local376 - local384 & 0x10000);
								local392 = local376 - local392 | local392 - (local392 >>> 8);
								if (local359 == 0 && local265 != 255) {
									local359 = local392;
									local392 = local253[local55];
									local392 = ((local359 & 0xFF00FF) * local265 + (local392 & 0xFF00FF) * local273 & 0xFF00FF00) + ((local359 & 0xFF00) * local265 + (local392 & 0xFF00) * local273 & 0xFF0000) >> 8;
								}
								local253[local55] = local392;
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
								local384 = this.anIntArray32[(local9 >> 16) + local359];
								if (local384 != 0) {
									local273 = (local384 & 0xFF00FF) * local262 & 0xFF00FF00;
									local276 = (local384 & 0xFF00) * local262 & 0xFF0000;
									local253[local55] = ((local273 | local276) >>> 8) + local569;
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
			} else if (arg7 != 2) {
				throw new IllegalArgumentException();
			} else if (arg5 == 1) {
				local262 = local9;
				for (local265 = -arg4; local265 < 0; local265++) {
					local273 = (local11 >> 16) * super.anInt9302;
					for (local276 = -arg3; local276 < 0; local276++) {
						if ((float) arg2 < local249[local55]) {
							local348 = this.anIntArray32[(local9 >> 16) + local273];
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
							local376 = this.anIntArray32[(local9 >> 16) + local356];
							if (local376 != 0) {
								local384 = (local376 & 0xFF0000) * local265 & 0xFF000000;
								local392 = (local376 & 0xFF00) * local273 & 0xFF0000;
								local400 = (local376 & 0xFF) * local276 & 0xFF00;
								local376 = (local384 | local392 | local400) >>> 8;
								local929 = local253[local55];
								local937 = local376 + local929;
								local949 = (local376 & 0xFF00FF) + (local929 & 0xFF00FF);
								local929 = (local949 & 0x1000100) + (local937 - local949 & 0x10000);
								local253[local55] = local937 - local929 | local929 - (local929 >>> 8);
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
							local348 = this.anIntArray32[(local9 >> 16) + local273];
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
							local384 = this.anIntArray32[(local9 >> 16) + local359];
							if (local384 != 0) {
								local273 = (local384 & 0xFF00FF) * local262 & 0xFF00FF00;
								local276 = (local384 & 0xFF00) * local262 & 0xFF0000;
								local384 = ((local273 | local276) >>> 8) + local569;
								local392 = local253[local55];
								local400 = local384 + local392;
								local929 = (local384 & 0xFF00FF) + (local392 & 0xFF00FF);
								@Pc(1838) int local1838 = (local929 & 0x1000100) + (local400 - local929 & 0x10000);
								local253[local55] = local400 - local1838 | local1838 - (local1838 >>> 8);
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
						local253[local55] = this.anIntArray32[(local9 >> 16) + local273];
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
						local376 = this.anIntArray32[(local9 >> 16) + local356];
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
						local348 = this.anIntArray32[(local9 >> 16) + local273];
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
						local384 = this.anIntArray32[(local9 >> 16) + local359];
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

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILclient!aa;II)V")
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
				@Pc(316) int local316 = this.anIntArray32[local20++];
				if (local316 == 0) {
					local42++;
				} else {
					local173[local42++] = local316;
				}
			}
			local20 += local241 + local36;
			local42 += local241 + local34;
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)V")
	@Override
	protected void method8209(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass19_Sub2_10.anIntArray319;
		@Pc(878) int local878;
		@Pc(11) int local11;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(223) int local223;
		@Pc(251) int local251;
		@Pc(255) int local255;
		@Pc(259) int local259;
		@Pc(331) int local331;
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
								local223 = this.anIntArray32[local57];
								if (local223 != 0) {
									local3[local60] = local223;
								}
							} else if (arg0 == 0) {
								local223 = this.anIntArray32[local57];
								if (local223 != 0) {
									if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
										local251 = Static513.anInt9313 >>> 24;
										local255 = 256 - local251;
										local259 = local3[local60];
										local3[local60] = ((local223 & 0xFF00FF) * local251 + (local259 & 0xFF00FF) * local255 & 0xFF00FF00) + ((local223 & 0xFF00) * local251 + (local259 & 0xFF00) * local255 & 0xFF0000) >> 8;
									} else if (Static513.anInt9304 == 255) {
										local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
										local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
										local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
										local3[local60] = (local251 | local255 | local259) >>> 8;
									} else {
										local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
										local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
										local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
										local223 = (local251 | local255 | local259) >>> 8;
										local331 = local3[local60];
										local3[local60] = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local223 = this.anIntArray32[local57];
								local251 = Static513.anInt9313;
								local255 = local223 + local251;
								local259 = (local223 & 0xFF00FF) + (local251 & 0xFF00FF);
								local331 = (local259 & 0x1000100) + (local255 - local259 & 0x10000);
								local331 = local255 - local331 | local331 - (local331 >>> 8);
								if (local223 == 0 && Static513.anInt9304 != 255) {
									local223 = local331;
									local331 = local3[local60];
									local331 = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
								}
								local3[local60] = local331;
							} else if (arg0 == 2) {
								local223 = this.anIntArray32[local57];
								if (local223 != 0) {
									local251 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
									local255 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
									local3[local60++] = ((local251 | local255) >>> 8) + Static513.anInt9305;
								}
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
						@Pc(871) int local871;
						if ((local871 = local18 - (super.anInt9306 << 12)) >= 0) {
							local878 = (Static513.anInt9309 - local871) / Static513.anInt9309;
							local20 += local878;
							local18 += Static513.anInt9309 * local878;
							local14 += local878;
						}
						@Pc(899) int local899;
						if ((local899 = (local18 - Static513.anInt9309) / Static513.anInt9309) > local20) {
							local20 = local899;
						}
						while (local20 < 0) {
							local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
							local60 = local14++;
							if (arg0 == 1) {
								local223 = this.anIntArray32[local57];
								if (local223 != 0) {
									local3[local60] = local223;
								}
							} else if (arg0 == 0) {
								local223 = this.anIntArray32[local57];
								if (local223 != 0) {
									if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
										local251 = Static513.anInt9313 >>> 24;
										local255 = 256 - local251;
										local259 = local3[local60];
										local3[local60] = ((local223 & 0xFF00FF) * local251 + (local259 & 0xFF00FF) * local255 & 0xFF00FF00) + ((local223 & 0xFF00) * local251 + (local259 & 0xFF00) * local255 & 0xFF0000) >> 8;
									} else if (Static513.anInt9304 == 255) {
										local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
										local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
										local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
										local3[local60] = (local251 | local255 | local259) >>> 8;
									} else {
										local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
										local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
										local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
										local223 = (local251 | local255 | local259) >>> 8;
										local331 = local3[local60];
										local3[local60] = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local223 = this.anIntArray32[local57];
								local251 = Static513.anInt9313;
								local255 = local223 + local251;
								local259 = (local223 & 0xFF00FF) + (local251 & 0xFF00FF);
								local331 = (local259 & 0x1000100) + (local255 - local259 & 0x10000);
								local331 = local255 - local331 | local331 - (local331 >>> 8);
								if (local223 == 0 && Static513.anInt9304 != 255) {
									local223 = local331;
									local331 = local3[local60];
									local331 = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
								}
								local3[local60] = local331;
							} else if (arg0 == 2) {
								local223 = this.anIntArray32[local57];
								if (local223 != 0) {
									local251 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
									local255 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
									local3[local60++] = ((local251 | local255) >>> 8) + Static513.anInt9305;
								}
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
							local878 = (Static513.anInt9309 - local18 - 1) / Static513.anInt9309;
							local20 += local878;
							local18 += Static513.anInt9309 * local878;
							local14 += local878;
						}
						@Pc(1767) int local1767;
						if ((local1767 = (local18 + 1 - (super.anInt9306 << 12) - Static513.anInt9309) / Static513.anInt9309) > local20) {
							local20 = local1767;
						}
						while (local20 < 0) {
							local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
							local60 = local14++;
							if (arg0 == 1) {
								local223 = this.anIntArray32[local57];
								if (local223 != 0) {
									local3[local60] = local223;
								}
							} else if (arg0 == 0) {
								local223 = this.anIntArray32[local57];
								if (local223 != 0) {
									if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
										local251 = Static513.anInt9313 >>> 24;
										local255 = 256 - local251;
										local259 = local3[local60];
										local3[local60] = ((local223 & 0xFF00FF) * local251 + (local259 & 0xFF00FF) * local255 & 0xFF00FF00) + ((local223 & 0xFF00) * local251 + (local259 & 0xFF00) * local255 & 0xFF0000) >> 8;
									} else if (Static513.anInt9304 == 255) {
										local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
										local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
										local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
										local3[local60] = (local251 | local255 | local259) >>> 8;
									} else {
										local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
										local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
										local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
										local223 = (local251 | local255 | local259) >>> 8;
										local331 = local3[local60];
										local3[local60] = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local223 = this.anIntArray32[local57];
								local251 = Static513.anInt9313;
								local255 = local223 + local251;
								local259 = (local223 & 0xFF00FF) + (local251 & 0xFF00FF);
								local331 = (local259 & 0x1000100) + (local255 - local259 & 0x10000);
								local331 = local255 - local331 | local331 - (local331 >>> 8);
								if (local223 == 0 && Static513.anInt9304 != 255) {
									local223 = local331;
									local331 = local3[local60];
									local331 = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
								}
								local3[local60] = local331;
							} else if (arg0 == 2) {
								local223 = this.anIntArray32[local57];
								if (local223 != 0) {
									local251 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
									local255 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
									local3[local60++] = ((local251 | local255) >>> 8) + Static513.anInt9305;
								}
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
						@Pc(2609) int local2609;
						if ((local2609 = local16 - (super.anInt9302 << 12)) >= 0) {
							local878 = (Static513.anInt9321 - local2609) / Static513.anInt9321;
							local20 += local878;
							local16 += Static513.anInt9321 * local878;
							local14 += local878;
						}
						@Pc(2637) int local2637;
						if ((local2637 = (local16 - Static513.anInt9321) / Static513.anInt9321) > local20) {
							local20 = local2637;
						}
						while (local20 < 0) {
							local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
							local60 = local14++;
							if (arg0 == 1) {
								local223 = this.anIntArray32[local57];
								if (local223 != 0) {
									local3[local60] = local223;
								}
							} else if (arg0 == 0) {
								local223 = this.anIntArray32[local57];
								if (local223 != 0) {
									if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
										local251 = Static513.anInt9313 >>> 24;
										local255 = 256 - local251;
										local259 = local3[local60];
										local3[local60] = ((local223 & 0xFF00FF) * local251 + (local259 & 0xFF00FF) * local255 & 0xFF00FF00) + ((local223 & 0xFF00) * local251 + (local259 & 0xFF00) * local255 & 0xFF0000) >> 8;
									} else if (Static513.anInt9304 == 255) {
										local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
										local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
										local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
										local3[local60] = (local251 | local255 | local259) >>> 8;
									} else {
										local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
										local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
										local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
										local223 = (local251 | local255 | local259) >>> 8;
										local331 = local3[local60];
										local3[local60] = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local223 = this.anIntArray32[local57];
								local251 = Static513.anInt9313;
								local255 = local223 + local251;
								local259 = (local223 & 0xFF00FF) + (local251 & 0xFF00FF);
								local331 = (local259 & 0x1000100) + (local255 - local259 & 0x10000);
								local331 = local255 - local331 | local331 - (local331 >>> 8);
								if (local223 == 0 && Static513.anInt9304 != 255) {
									local223 = local331;
									local331 = local3[local60];
									local331 = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
								}
								local3[local60] = local331;
							} else if (arg0 == 2) {
								local223 = this.anIntArray32[local57];
								if (local223 != 0) {
									local251 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
									local255 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
									local3[local60++] = ((local251 | local255) >>> 8) + Static513.anInt9305;
								}
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
					@Pc(3466) int local3466;
					if ((local3466 = local16 - (super.anInt9302 << 12)) >= 0) {
						local878 = (Static513.anInt9321 - local3466) / Static513.anInt9321;
						local20 += local878;
						local16 += Static513.anInt9321 * local878;
						local18 += Static513.anInt9309 * local878;
						local14 += local878;
					}
					@Pc(3500) int local3500;
					if ((local3500 = (local16 - Static513.anInt9321) / Static513.anInt9321) > local20) {
						local20 = local3500;
					}
					@Pc(3512) int local3512;
					if ((local3512 = local18 - (super.anInt9306 << 12)) >= 0) {
						local878 = (Static513.anInt9309 - local3512) / Static513.anInt9309;
						local20 += local878;
						local16 += Static513.anInt9321 * local878;
						local18 += Static513.anInt9309 * local878;
						local14 += local878;
					}
					@Pc(3546) int local3546;
					if ((local3546 = (local18 - Static513.anInt9309) / Static513.anInt9309) > local20) {
						local20 = local3546;
					}
					while (local20 < 0) {
						local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
						local60 = local14++;
						if (arg0 == 1) {
							local223 = this.anIntArray32[local57];
							if (local223 != 0) {
								local3[local60] = local223;
							}
						} else if (arg0 == 0) {
							local223 = this.anIntArray32[local57];
							if (local223 != 0) {
								if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
									local251 = Static513.anInt9313 >>> 24;
									local255 = 256 - local251;
									local259 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * local251 + (local259 & 0xFF00FF) * local255 & 0xFF00FF00) + ((local223 & 0xFF00) * local251 + (local259 & 0xFF00) * local255 & 0xFF0000) >> 8;
								} else if (Static513.anInt9304 == 255) {
									local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local3[local60] = (local251 | local255 | local259) >>> 8;
								} else {
									local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local223 = (local251 | local255 | local259) >>> 8;
									local331 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local223 = this.anIntArray32[local57];
							local251 = Static513.anInt9313;
							local255 = local223 + local251;
							local259 = (local223 & 0xFF00FF) + (local251 & 0xFF00FF);
							local331 = (local259 & 0x1000100) + (local255 - local259 & 0x10000);
							local331 = local255 - local331 | local331 - (local331 >>> 8);
							if (local223 == 0 && Static513.anInt9304 != 255) {
								local223 = local331;
								local331 = local3[local60];
								local331 = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
							}
							local3[local60] = local331;
						} else if (arg0 == 2) {
							local223 = this.anIntArray32[local57];
							if (local223 != 0) {
								local251 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
								local255 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
								local3[local60++] = ((local251 | local255) >>> 8) + Static513.anInt9305;
							}
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
					@Pc(4381) int local4381;
					if ((local4381 = local16 - (super.anInt9302 << 12)) >= 0) {
						local878 = (Static513.anInt9321 - local4381) / Static513.anInt9321;
						local20 += local878;
						local16 += Static513.anInt9321 * local878;
						local18 += Static513.anInt9309 * local878;
						local14 += local878;
					}
					@Pc(4415) int local4415;
					if ((local4415 = (local16 - Static513.anInt9321) / Static513.anInt9321) > local20) {
						local20 = local4415;
					}
					if (local18 < 0) {
						local878 = (Static513.anInt9309 - local18 - 1) / Static513.anInt9309;
						local20 += local878;
						local16 += Static513.anInt9321 * local878;
						local18 += Static513.anInt9309 * local878;
						local14 += local878;
					}
					@Pc(4463) int local4463;
					if ((local4463 = (local18 + 1 - (super.anInt9306 << 12) - Static513.anInt9309) / Static513.anInt9309) > local20) {
						local20 = local4463;
					}
					while (local20 < 0) {
						local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
						local60 = local14++;
						if (arg0 == 1) {
							local223 = this.anIntArray32[local57];
							if (local223 != 0) {
								local3[local60] = local223;
							}
						} else if (arg0 == 0) {
							local223 = this.anIntArray32[local57];
							if (local223 != 0) {
								if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
									local251 = Static513.anInt9313 >>> 24;
									local255 = 256 - local251;
									local259 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * local251 + (local259 & 0xFF00FF) * local255 & 0xFF00FF00) + ((local223 & 0xFF00) * local251 + (local259 & 0xFF00) * local255 & 0xFF0000) >> 8;
								} else if (Static513.anInt9304 == 255) {
									local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local3[local60] = (local251 | local255 | local259) >>> 8;
								} else {
									local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local223 = (local251 | local255 | local259) >>> 8;
									local331 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local223 = this.anIntArray32[local57];
							local251 = Static513.anInt9313;
							local255 = local223 + local251;
							local259 = (local223 & 0xFF00FF) + (local251 & 0xFF00FF);
							local331 = (local259 & 0x1000100) + (local255 - local259 & 0x10000);
							local331 = local255 - local331 | local331 - (local331 >>> 8);
							if (local223 == 0 && Static513.anInt9304 != 255) {
								local223 = local331;
								local331 = local3[local60];
								local331 = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
							}
							local3[local60] = local331;
						} else if (arg0 == 2) {
							local223 = this.anIntArray32[local57];
							if (local223 != 0) {
								local251 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
								local255 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
								local3[local60++] = ((local251 | local255) >>> 8) + Static513.anInt9305;
							}
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
						local878 = (Static513.anInt9321 - local16 - 1) / Static513.anInt9321;
						local20 += local878;
						local16 += Static513.anInt9321 * local878;
						local14 += local878;
					}
					@Pc(5341) int local5341;
					if ((local5341 = (local16 + 1 - (super.anInt9302 << 12) - Static513.anInt9321) / Static513.anInt9321) > local20) {
						local20 = local5341;
					}
					while (local20 < 0) {
						local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
						local60 = local14++;
						if (arg0 == 1) {
							local223 = this.anIntArray32[local57];
							if (local223 != 0) {
								local3[local60] = local223;
							}
						} else if (arg0 == 0) {
							local223 = this.anIntArray32[local57];
							if (local223 != 0) {
								if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
									local251 = Static513.anInt9313 >>> 24;
									local255 = 256 - local251;
									local259 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * local251 + (local259 & 0xFF00FF) * local255 & 0xFF00FF00) + ((local223 & 0xFF00) * local251 + (local259 & 0xFF00) * local255 & 0xFF0000) >> 8;
								} else if (Static513.anInt9304 == 255) {
									local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local3[local60] = (local251 | local255 | local259) >>> 8;
								} else {
									local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
									local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
									local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
									local223 = (local251 | local255 | local259) >>> 8;
									local331 = local3[local60];
									local3[local60] = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local223 = this.anIntArray32[local57];
							local251 = Static513.anInt9313;
							local255 = local223 + local251;
							local259 = (local223 & 0xFF00FF) + (local251 & 0xFF00FF);
							local331 = (local259 & 0x1000100) + (local255 - local259 & 0x10000);
							local331 = local255 - local331 | local331 - (local331 >>> 8);
							if (local223 == 0 && Static513.anInt9304 != 255) {
								local223 = local331;
								local331 = local3[local60];
								local331 = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
							}
							local3[local60] = local331;
						} else if (arg0 == 2) {
							local223 = this.anIntArray32[local57];
							if (local223 != 0) {
								local251 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
								local255 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
								local3[local60++] = ((local251 | local255) >>> 8) + Static513.anInt9305;
							}
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
					local878 = (Static513.anInt9321 - local16 - 1) / Static513.anInt9321;
					local20 += local878;
					local16 += Static513.anInt9321 * local878;
					local18 += Static513.anInt9309 * local878;
					local14 += local878;
				}
				@Pc(6210) int local6210;
				if ((local6210 = (local16 + 1 - (super.anInt9302 << 12) - Static513.anInt9321) / Static513.anInt9321) > local20) {
					local20 = local6210;
				}
				@Pc(6222) int local6222;
				if ((local6222 = local18 - (super.anInt9306 << 12)) >= 0) {
					local878 = (Static513.anInt9309 - local6222) / Static513.anInt9309;
					local20 += local878;
					local16 += Static513.anInt9321 * local878;
					local18 += Static513.anInt9309 * local878;
					local14 += local878;
				}
				@Pc(6256) int local6256;
				if ((local6256 = (local18 - Static513.anInt9309) / Static513.anInt9309) > local20) {
					local20 = local6256;
				}
				while (local20 < 0) {
					local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
					local60 = local14++;
					if (arg0 == 1) {
						local223 = this.anIntArray32[local57];
						if (local223 != 0) {
							local3[local60] = local223;
						}
					} else if (arg0 == 0) {
						local223 = this.anIntArray32[local57];
						if (local223 != 0) {
							if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
								local251 = Static513.anInt9313 >>> 24;
								local255 = 256 - local251;
								local259 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local251 + (local259 & 0xFF00FF) * local255 & 0xFF00FF00) + ((local223 & 0xFF00) * local251 + (local259 & 0xFF00) * local255 & 0xFF0000) >> 8;
							} else if (Static513.anInt9304 == 255) {
								local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
								local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
								local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
								local3[local60] = (local251 | local255 | local259) >>> 8;
							} else {
								local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
								local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
								local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
								local223 = (local251 | local255 | local259) >>> 8;
								local331 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local223 = this.anIntArray32[local57];
						local251 = Static513.anInt9313;
						local255 = local223 + local251;
						local259 = (local223 & 0xFF00FF) + (local251 & 0xFF00FF);
						local331 = (local259 & 0x1000100) + (local255 - local259 & 0x10000);
						local331 = local255 - local331 | local331 - (local331 >>> 8);
						if (local223 == 0 && Static513.anInt9304 != 255) {
							local223 = local331;
							local331 = local3[local60];
							local331 = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
						}
						local3[local60] = local331;
					} else if (arg0 == 2) {
						local223 = this.anIntArray32[local57];
						if (local223 != 0) {
							local251 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
							local255 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
							local3[local60++] = ((local251 | local255) >>> 8) + Static513.anInt9305;
						}
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
					local878 = (Static513.anInt9321 - local16 - 1) / Static513.anInt9321;
					local20 += local878;
					local16 += Static513.anInt9321 * local878;
					local18 += Static513.anInt9309 * local878;
					local14 += local878;
				}
				@Pc(7127) int local7127;
				if ((local7127 = (local16 + 1 - (super.anInt9302 << 12) - Static513.anInt9321) / Static513.anInt9321) > local20) {
					local20 = local7127;
				}
				if (local18 < 0) {
					local878 = (Static513.anInt9309 - local18 - 1) / Static513.anInt9309;
					local20 += local878;
					local16 += Static513.anInt9321 * local878;
					local18 += Static513.anInt9309 * local878;
					local14 += local878;
				}
				@Pc(7175) int local7175;
				if ((local7175 = (local18 + 1 - (super.anInt9306 << 12) - Static513.anInt9309) / Static513.anInt9309) > local20) {
					local20 = local7175;
				}
				while (local20 < 0) {
					local57 = (local18 >> 12) * super.anInt9302 + (local16 >> 12);
					local60 = local14++;
					if (arg0 == 1) {
						local223 = this.anIntArray32[local57];
						if (local223 != 0) {
							local3[local60] = local223;
						}
					} else if (arg0 == 0) {
						local223 = this.anIntArray32[local57];
						if (local223 != 0) {
							if ((Static513.anInt9313 & 0xFFFFFF) == 16777215) {
								local251 = Static513.anInt9313 >>> 24;
								local255 = 256 - local251;
								local259 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * local251 + (local259 & 0xFF00FF) * local255 & 0xFF00FF00) + ((local223 & 0xFF00) * local251 + (local259 & 0xFF00) * local255 & 0xFF0000) >> 8;
							} else if (Static513.anInt9304 == 255) {
								local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
								local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
								local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
								local3[local60] = (local251 | local255 | local259) >>> 8;
							} else {
								local251 = (local223 & 0xFF0000) * Static513.anInt9319 & 0xFF000000;
								local255 = (local223 & 0xFF00) * Static513.anInt9299 & 0xFF0000;
								local259 = (local223 & 0xFF) * Static513.anInt9315 & 0xFF00;
								local223 = (local251 | local255 | local259) >>> 8;
								local331 = local3[local60];
								local3[local60] = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local223 = this.anIntArray32[local57];
						local251 = Static513.anInt9313;
						local255 = local223 + local251;
						local259 = (local223 & 0xFF00FF) + (local251 & 0xFF00FF);
						local331 = (local259 & 0x1000100) + (local255 - local259 & 0x10000);
						local331 = local255 - local331 | local331 - (local331 >>> 8);
						if (local223 == 0 && Static513.anInt9304 != 255) {
							local223 = local331;
							local331 = local3[local60];
							local331 = ((local223 & 0xFF00FF) * Static513.anInt9304 + (local331 & 0xFF00FF) * Static513.anInt9312 & 0xFF00FF00) + ((local223 & 0xFF00) * Static513.anInt9304 + (local331 & 0xFF00) * Static513.anInt9312 & 0xFF0000) >> 8;
						}
						local3[local60] = local331;
					} else if (arg0 == 2) {
						local223 = this.anIntArray32[local57];
						if (local223 != 0) {
							local251 = (local223 & 0xFF00FF) * Static513.anInt9304 & 0xFF00FF00;
							local255 = (local223 & 0xFF00) * Static513.anInt9304 & 0xFF0000;
							local3[local60++] = ((local251 | local255) >>> 8) + Static513.anInt9305;
						}
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

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method8210(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass19_Sub2_10.anIntArray319;
		@Pc(201) int local201;
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
								local122 = this.anIntArray32[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
								if (local122 == 0) {
									local28++;
								} else {
									local3[local28++] = local122;
								}
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
							@Pc(194) int local194;
							if ((local194 = local32 - (super.anInt9306 << 12)) >= 0) {
								local201 = (Static513.anInt9309 - local194) / Static513.anInt9309;
								local34 += local201;
								local32 += Static513.anInt9309 * local201;
								local28 += local201;
							}
							@Pc(222) int local222;
							if ((local222 = (local32 - Static513.anInt9309) / Static513.anInt9309) > local34) {
								local34 = local222;
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
								local122 = this.anIntArray32[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
								if (local122 == 0) {
									local28++;
								} else {
									local3[local28++] = local122;
								}
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
								local201 = (Static513.anInt9309 - local32 - 1) / Static513.anInt9309;
								local34 += local201;
								local32 += Static513.anInt9309 * local201;
								local28 += local201;
							}
							@Pc(400) int local400;
							if ((local400 = (local32 + 1 - (super.anInt9306 << 12) - Static513.anInt9309) / Static513.anInt9309) > local34) {
								local34 = local400;
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
								local122 = this.anIntArray32[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
								if (local122 == 0) {
									local28++;
								} else {
									local3[local28++] = local122;
								}
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
							@Pc(552) int local552;
							if ((local552 = local30 - (super.anInt9302 << 12)) >= 0) {
								local201 = (Static513.anInt9321 - local552) / Static513.anInt9321;
								local34 += local201;
								local30 += Static513.anInt9321 * local201;
								local28 += local201;
							}
							@Pc(580) int local580;
							if ((local580 = (local30 - Static513.anInt9321) / Static513.anInt9321) > local34) {
								local34 = local580;
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
								local122 = this.anIntArray32[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
								if (local122 == 0) {
									local28++;
								} else {
									local3[local28++] = local122;
								}
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
						@Pc(719) int local719;
						if ((local719 = local30 - (super.anInt9302 << 12)) >= 0) {
							local201 = (Static513.anInt9321 - local719) / Static513.anInt9321;
							local34 += local201;
							local30 += Static513.anInt9321 * local201;
							local32 += Static513.anInt9309 * local201;
							local28 += local201;
						}
						@Pc(753) int local753;
						if ((local753 = (local30 - Static513.anInt9321) / Static513.anInt9321) > local34) {
							local34 = local753;
						}
						@Pc(765) int local765;
						if ((local765 = local32 - (super.anInt9306 << 12)) >= 0) {
							local201 = (Static513.anInt9309 - local765) / Static513.anInt9309;
							local34 += local201;
							local30 += Static513.anInt9321 * local201;
							local32 += Static513.anInt9309 * local201;
							local28 += local201;
						}
						@Pc(799) int local799;
						if ((local799 = (local32 - Static513.anInt9309) / Static513.anInt9309) > local34) {
							local34 = local799;
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
							local122 = this.anIntArray32[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
							if (local122 == 0) {
								local28++;
							} else {
								local3[local28++] = local122;
							}
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
						@Pc(944) int local944;
						if ((local944 = local30 - (super.anInt9302 << 12)) >= 0) {
							local201 = (Static513.anInt9321 - local944) / Static513.anInt9321;
							local34 += local201;
							local30 += Static513.anInt9321 * local201;
							local32 += Static513.anInt9309 * local201;
							local28 += local201;
						}
						@Pc(978) int local978;
						if ((local978 = (local30 - Static513.anInt9321) / Static513.anInt9321) > local34) {
							local34 = local978;
						}
						if (local32 < 0) {
							local201 = (Static513.anInt9309 - local32 - 1) / Static513.anInt9309;
							local34 += local201;
							local30 += Static513.anInt9321 * local201;
							local32 += Static513.anInt9309 * local201;
							local28 += local201;
						}
						@Pc(1026) int local1026;
						if ((local1026 = (local32 + 1 - (super.anInt9306 << 12) - Static513.anInt9309) / Static513.anInt9309) > local34) {
							local34 = local1026;
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
							local122 = this.anIntArray32[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
							if (local122 == 0) {
								local28++;
							} else {
								local3[local28++] = local122;
							}
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
							local201 = (Static513.anInt9321 - local30 - 1) / Static513.anInt9321;
							local34 += local201;
							local30 += Static513.anInt9321 * local201;
							local28 += local201;
						}
						@Pc(1214) int local1214;
						if ((local1214 = (local30 + 1 - (super.anInt9302 << 12) - Static513.anInt9321) / Static513.anInt9321) > local34) {
							local34 = local1214;
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
							local122 = this.anIntArray32[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
							if (local122 == 0) {
								local28++;
							} else {
								local3[local28++] = local122;
							}
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
						local201 = (Static513.anInt9321 - local30 - 1) / Static513.anInt9321;
						local34 += local201;
						local30 += Static513.anInt9321 * local201;
						local32 += Static513.anInt9309 * local201;
						local28 += local201;
					}
					@Pc(1393) int local1393;
					if ((local1393 = (local30 + 1 - (super.anInt9302 << 12) - Static513.anInt9321) / Static513.anInt9321) > local34) {
						local34 = local1393;
					}
					@Pc(1405) int local1405;
					if ((local1405 = local32 - (super.anInt9306 << 12)) >= 0) {
						local201 = (Static513.anInt9309 - local1405) / Static513.anInt9309;
						local34 += local201;
						local30 += Static513.anInt9321 * local201;
						local32 += Static513.anInt9309 * local201;
						local28 += local201;
					}
					@Pc(1439) int local1439;
					if ((local1439 = (local32 - Static513.anInt9309) / Static513.anInt9309) > local34) {
						local34 = local1439;
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
						local122 = this.anIntArray32[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
						if (local122 == 0) {
							local28++;
						} else {
							local3[local28++] = local122;
						}
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
						local201 = (Static513.anInt9321 - local30 - 1) / Static513.anInt9321;
						local34 += local201;
						local30 += Static513.anInt9321 * local201;
						local32 += Static513.anInt9309 * local201;
						local28 += local201;
					}
					@Pc(1620) int local1620;
					if ((local1620 = (local30 + 1 - (super.anInt9302 << 12) - Static513.anInt9321) / Static513.anInt9321) > local34) {
						local34 = local1620;
					}
					if (local32 < 0) {
						local201 = (Static513.anInt9309 - local32 - 1) / Static513.anInt9309;
						local34 += local201;
						local30 += Static513.anInt9321 * local201;
						local32 += Static513.anInt9309 * local201;
						local28 += local201;
					}
					@Pc(1668) int local1668;
					if ((local1668 = (local32 + 1 - (super.anInt9306 << 12) - Static513.anInt9309) / Static513.anInt9309) > local34) {
						local34 = local1668;
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
						local122 = this.anIntArray32[(local32 >> 12) * super.anInt9302 + (local30 >> 12)];
						if (local122 == 0) {
							local28++;
						} else {
							local3[local28++] = local122;
						}
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

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIII)V")
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
				@Pc(854) int local854;
				@Pc(862) int local862;
				@Pc(874) int local874;
				if (arg6 == 1) {
					if (arg4 == 1) {
						local265 = local18;
						for (local268 = -arg3; local268 < 0; local268++) {
							local276 = (local20 >> 16) * super.anInt9302;
							for (local279 = -arg2; local279 < 0; local279++) {
								local337 = this.anIntArray32[(local18 >> 16) + local276];
								if (local337 == 0) {
									local68++;
								} else {
									local256[local68++] = local337;
								}
								local18 += local48;
							}
							local20 += local54;
							local18 = local265;
							local68 += local156;
						}
					} else if (arg4 == 0) {
						local265 = local18;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							local268 = arg5 >>> 24;
							local276 = 256 - local268;
							for (local279 = -arg3; local279 < 0; local279++) {
								local337 = (local20 >> 16) * super.anInt9302;
								for (local345 = -arg2; local345 < 0; local345++) {
									local348 = this.anIntArray32[(local18 >> 16) + local337];
									if (local348 == 0) {
										local68++;
									} else {
										local358 = local256[local68];
										local256[local68++] = ((local348 & 0xFF00FF) * local268 + (local358 & 0xFF00FF) * local276 & 0xFF00FF00) + ((local348 & 0xFF00) * local268 + (local358 & 0xFF00) * local276 & 0xFF0000) >> 8;
									}
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
							local337 = arg5 >>> 24;
							local345 = 256 - local337;
							for (local348 = -arg3; local348 < 0; local348++) {
								local358 = (local20 >> 16) * super.anInt9302;
								for (local366 = -arg2; local366 < 0; local366++) {
									local374 = this.anIntArray32[(local18 >> 16) + local358];
									if (local374 == 0) {
										local68++;
									} else if (local337 == 255) {
										local382 = (local374 & 0xFF0000) * local268 & 0xFF000000;
										local854 = (local374 & 0xFF00) * local276 & 0xFF0000;
										local862 = (local374 & 0xFF) * local279 & 0xFF00;
										local256[local68++] = (local382 | local854 | local862) >>> 8;
									} else {
										local382 = (local374 & 0xFF0000) * local268 & 0xFF000000;
										local854 = (local374 & 0xFF00) * local276 & 0xFF0000;
										local862 = (local374 & 0xFF) * local279 & 0xFF00;
										local374 = (local382 | local854 | local862) >>> 8;
										local874 = local256[local68];
										local256[local68++] = ((local374 & 0xFF00FF) * local337 + (local874 & 0xFF00FF) * local345 & 0xFF00FF00) + ((local374 & 0xFF00) * local337 + (local874 & 0xFF00) * local345 & 0xFF0000) >> 8;
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
						local268 = arg5 >>> 24;
						local276 = 256 - local268;
						for (local279 = -arg3; local279 < 0; local279++) {
							local337 = (local20 >> 16) * super.anInt9302;
							for (local345 = -arg2; local345 < 0; local345++) {
								local348 = this.anIntArray32[(local18 >> 16) + local337];
								local358 = local348 + arg5;
								local366 = (local348 & 0xFF00FF) + (arg5 & 0xFF00FF);
								local374 = (local366 & 0x1000100) + (local358 - local366 & 0x10000);
								local374 = local358 - local374 | local374 - (local374 >>> 8);
								if (local348 == 0 && local268 != 255) {
									local348 = local374;
									local374 = local256[local68];
									local374 = ((local348 & 0xFF00FF) * local268 + (local374 & 0xFF00FF) * local276 & 0xFF00FF00) + ((local348 & 0xFF00) * local268 + (local374 & 0xFF00) * local276 & 0xFF0000) >> 8;
								}
								local256[local68++] = local374;
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
								local366 = this.anIntArray32[(local18 >> 16) + local348];
								if (local366 == 0) {
									local68++;
								} else {
									local276 = (local366 & 0xFF00FF) * local265 & 0xFF00FF00;
									local279 = (local366 & 0xFF00) * local265 & 0xFF0000;
									local256[local68++] = ((local276 | local279) >>> 8) + local534;
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
				} else if (arg6 != 2) {
					throw new IllegalArgumentException();
				} else if (arg4 == 1) {
					local265 = local18;
					for (local268 = -arg3; local268 < 0; local268++) {
						local276 = (local20 >> 16) * super.anInt9302;
						for (local279 = -arg2; local279 < 0; local279++) {
							local337 = this.anIntArray32[(local18 >> 16) + local276];
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
							local358 = this.anIntArray32[(local18 >> 16) + local345];
							if (local358 == 0) {
								local68++;
							} else {
								local366 = (local358 & 0xFF0000) * local268 & 0xFF000000;
								local374 = (local358 & 0xFF00) * local276 & 0xFF0000;
								local382 = (local358 & 0xFF) * local279 & 0xFF00;
								local358 = (local366 | local374 | local382) >>> 8;
								local854 = local256[local68];
								local862 = local358 + local854;
								local874 = (local358 & 0xFF00FF) + (local854 & 0xFF00FF);
								local854 = (local874 & 0x1000100) + (local862 - local874 & 0x10000);
								local256[local68++] = local862 - local854 | local854 - (local854 >>> 8);
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
							local337 = this.anIntArray32[(local18 >> 16) + local276];
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
							local366 = this.anIntArray32[(local18 >> 16) + local348];
							if (local366 == 0) {
								local68++;
							} else {
								local276 = (local366 & 0xFF00FF) * local265 & 0xFF00FF00;
								local279 = (local366 & 0xFF00) * local265 & 0xFF0000;
								local366 = ((local276 | local279) >>> 8) + local534;
								local374 = local256[local68];
								local382 = local366 + local374;
								local854 = (local366 & 0xFF00FF) + (local374 & 0xFF00FF);
								@Pc(1695) int local1695 = (local854 & 0x1000100) + (local382 - local854 & 0x10000);
								local256[local68++] = local382 - local1695 | local1695 - (local1695 >>> 8);
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
						local256[local68++] = this.anIntArray32[(local18 >> 16) + local276];
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
						local358 = this.anIntArray32[(local18 >> 16) + local345];
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
						local337 = this.anIntArray32[(local18 >> 16) + local276];
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
						local366 = this.anIntArray32[(local18 >> 16) + local348];
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

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIII)V")
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
			@Pc(764) int local764;
			@Pc(772) int local772;
			@Pc(784) int local784;
			if (arg4 == 1) {
				if (arg2 == 1) {
					for (local174 = -local33; local174 < 0; local174++) {
						local181 = local28 + local36 - 3;
						while (local28 < local181) {
							local267 = this.anIntArray32[local30++];
							if (local267 == 0) {
								local28++;
							} else {
								local164[local28++] = local267;
							}
							local267 = this.anIntArray32[local30++];
							if (local267 == 0) {
								local28++;
							} else {
								local164[local28++] = local267;
							}
							local267 = this.anIntArray32[local30++];
							if (local267 == 0) {
								local28++;
							} else {
								local164[local28++] = local267;
							}
							local267 = this.anIntArray32[local30++];
							if (local267 == 0) {
								local28++;
							} else {
								local164[local28++] = local267;
							}
						}
						local181 += 3;
						while (local28 < local181) {
							local267 = this.anIntArray32[local30++];
							if (local267 == 0) {
								local28++;
							} else {
								local164[local28++] = local267;
							}
						}
						local28 += local40;
						local30 += local42;
					}
				} else if (arg2 == 0) {
					if ((arg3 & 0xFFFFFF) == 16777215) {
						local174 = arg3 >>> 24;
						local181 = 256 - local174;
						for (local267 = -local33; local267 < 0; local267++) {
							for (local270 = -local36; local270 < 0; local270++) {
								local274 = this.anIntArray32[local30++];
								if (local274 == 0) {
									local28++;
								} else {
									local281 = local164[local28];
									local164[local28++] = ((local274 & 0xFF00FF) * local174 + (local281 & 0xFF00FF) * local181 & 0xFF00FF00) + ((local274 & 0xFF00) * local174 + (local281 & 0xFF00) * local181 & 0xFF0000) >> 8;
								}
							}
							local28 += local40;
							local30 += local42;
						}
					} else {
						local174 = arg3 >> 16 & 0xFF;
						local181 = arg3 >> 8 & 0xFF;
						local267 = arg3 & 0xFF;
						local270 = arg3 >>> 24;
						local274 = 256 - local270;
						for (local281 = -local33; local281 < 0; local281++) {
							for (local289 = -local36; local289 < 0; local289++) {
								local297 = this.anIntArray32[local30++];
								if (local297 == 0) {
									local28++;
								} else if (local270 == 255) {
									local305 = (local297 & 0xFF0000) * local174 & 0xFF000000;
									local764 = (local297 & 0xFF00) * local181 & 0xFF0000;
									local772 = (local297 & 0xFF) * local267 & 0xFF00;
									local164[local28++] = (local305 | local764 | local772) >>> 8;
								} else {
									local305 = (local297 & 0xFF0000) * local174 & 0xFF000000;
									local764 = (local297 & 0xFF00) * local181 & 0xFF0000;
									local772 = (local297 & 0xFF) * local267 & 0xFF00;
									local297 = (local305 | local764 | local772) >>> 8;
									local784 = local164[local28];
									local164[local28++] = ((local297 & 0xFF00FF) * local270 + (local784 & 0xFF00FF) * local274 & 0xFF00FF00) + ((local297 & 0xFF00) * local270 + (local784 & 0xFF00) * local274 & 0xFF0000) >> 8;
								}
							}
							local28 += local40;
							local30 += local42;
						}
					}
				} else if (arg2 == 3) {
					local174 = arg3 >>> 24;
					local181 = 256 - local174;
					for (local267 = -local33; local267 < 0; local267++) {
						for (local270 = -local36; local270 < 0; local270++) {
							local274 = this.anIntArray32[local30++];
							local281 = local274 + arg3;
							local289 = (local274 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local297 = (local289 & 0x1000100) + (local281 - local289 & 0x10000);
							local297 = local281 - local297 | local297 - (local297 >>> 8);
							if (local274 == 0 && local174 != 255) {
								local274 = local297;
								local297 = local164[local28];
								local297 = ((local274 & 0xFF00FF) * local174 + (local297 & 0xFF00FF) * local181 & 0xFF00FF00) + ((local274 & 0xFF00) * local174 + (local297 & 0xFF00) * local181 & 0xFF0000) >> 8;
							}
							local164[local28++] = local297;
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
							local289 = this.anIntArray32[local30++];
							if (local289 == 0) {
								local28++;
							} else {
								local267 = (local289 & 0xFF00FF) * local174 & 0xFF00FF00;
								local270 = (local289 & 0xFF00) * local174 & 0xFF0000;
								local164[local28++] = ((local267 | local270) >>> 8) + local433;
							}
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
						local267 = this.anIntArray32[local30++];
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
						local281 = this.anIntArray32[local30++];
						if (local281 == 0) {
							local28++;
						} else {
							local289 = (local281 & 0xFF0000) * local174 & 0xFF000000;
							local297 = (local281 & 0xFF00) * local181 & 0xFF0000;
							local305 = (local281 & 0xFF) * local267 & 0xFF00;
							local281 = (local289 | local297 | local305) >>> 8;
							local764 = local164[local28];
							local772 = local281 + local764;
							local784 = (local281 & 0xFF00FF) + (local764 & 0xFF00FF);
							local764 = (local784 & 0x1000100) + (local772 - local784 & 0x10000);
							local164[local28++] = local772 - local764 | local764 - (local764 >>> 8);
						}
					}
					local28 += local40;
					local30 += local42;
				}
			} else if (arg2 == 3) {
				for (local174 = -local33; local174 < 0; local174++) {
					for (local181 = -local36; local181 < 0; local181++) {
						local267 = this.anIntArray32[local30++];
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
						local289 = this.anIntArray32[local30++];
						if (local289 == 0) {
							local28++;
						} else {
							local267 = (local289 & 0xFF00FF) * local174 & 0xFF00FF00;
							local270 = (local289 & 0xFF00) * local174 & 0xFF0000;
							local289 = ((local267 | local270) >>> 8) + local433;
							local297 = local164[local28];
							local305 = local289 + local297;
							local764 = (local289 & 0xFF00FF) + (local297 & 0xFF00FF);
							@Pc(1497) int local1497 = (local764 & 0x1000100) + (local305 - local764 & 0x10000);
							local164[local28++] = local305 - local1497 | local1497 - (local1497 >>> 8);
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
					local164[local28++] = this.anIntArray32[local30++];
					local164[local28++] = this.anIntArray32[local30++];
					local164[local28++] = this.anIntArray32[local30++];
					local164[local28++] = this.anIntArray32[local30++];
				}
				local181 += 3;
				while (local28 < local181) {
					local164[local28++] = this.anIntArray32[local30++];
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
					local281 = this.anIntArray32[local30++];
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
					local267 = this.anIntArray32[local30++];
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
					local289 = this.anIntArray32[local30++];
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
}
