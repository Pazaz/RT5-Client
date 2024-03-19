import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class1_Sub36 extends Class1 {

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
	private int anInt6354;

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
	private int anInt6356;

	@OriginalMember(owner = "client!tj", name = "w", descriptor = "Lclient!fe;")
	private final Class1_Sub9 aClass1_Sub9_1;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "Lclient!ms;")
	private final Class77_Sub1 aClass77_Sub1_2;

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_36;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
	private final int anInt6353;

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
	private final int anInt6357;

	@OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
	private final int anInt6358;

	@OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
	private final int anInt6355;

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "Lclient!il;")
	private Class1_Sub16 aClass1_Sub16_8;

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "Lclient!sb;")
	private Class1_Sub16_Sub1 aClass1_Sub16_Sub1_3;

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "Lclient!sf;")
	private Class183 aClass183_32;

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "Lclient!ir;")
	private final Interface7 anInterface7_6;

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "Lclient!cj;")
	private final Interface2 anInterface2_6;

	@OriginalMember(owner = "client!tj", name = "x", descriptor = "Lclient!am;")
	private final Class9 aClass9_13;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "Lclient!am;")
	private final Class9 aClass9_14;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!ih;Lclient!ms;Lclient!fe;[I)V")
	public Class1_Sub36(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) Class77_Sub1 arg1, @OriginalArg(2) Class1_Sub9 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass1_Sub9_1 = arg2;
		this.aClass77_Sub1_2 = arg1;
		this.aClass40_Sub2_36 = arg0;
		@Pc(20) int local20 = this.aClass1_Sub9_1.anInt4577 - (arg1.anInt4510 >> 1);
		this.anInt6353 = this.aClass1_Sub9_1.anInt4580 - local20 >> arg1.anInt4506;
		this.anInt6357 = this.aClass1_Sub9_1.anInt4580 + local20 >> arg1.anInt4506;
		this.anInt6358 = this.aClass1_Sub9_1.anInt4576 - local20 >> arg1.anInt4506;
		this.anInt6355 = local20 + this.aClass1_Sub9_1.anInt4576 >> arg1.anInt4506;
		@Pc(71) int local71 = this.anInt6357 + 1 - this.anInt6353;
		@Pc(79) int local79 = this.anInt6355 + 1 - this.anInt6358;
		this.aFloatArrayArray8 = new float[local71 + 1][local79 + 1];
		this.aFloatArrayArray7 = new float[local71 + 1][local79 + 1];
		this.aFloatArrayArray6 = new float[local71 + 1][local79 + 1];
		@Pc(108) int local108;
		@Pc(120) int local120;
		@Pc(132) int local132;
		@Pc(141) int local141;
		@Pc(166) int local166;
		@Pc(181) int local181;
		for (local108 = 0; local108 <= local79; local108++) {
			local120 = this.anInt6358 + local108;
			if (local120 > 0 && local120 < this.aClass77_Sub1_2.anInt4625 - 1) {
				for (local132 = 0; local132 <= local71; local132++) {
					local141 = local132 + this.anInt6353;
					if (local141 > 0 && this.aClass77_Sub1_2.anInt4630 - 1 > local141) {
						local166 = arg1.method3986(local141 + 1, local120) - arg1.method3986(local141 - 1, local120);
						local181 = arg1.method3986(local141, local120 + 1) - arg1.method3986(local141, local120 - 1);
						@Pc(196) float local196 = (float) (1.0D / Math.sqrt((double) (local181 * local181 + local166 * local166 + 65536)));
						this.aFloatArrayArray8[local132][local108] = (float) local166 * local196;
						this.aFloatArrayArray7[local132][local108] = local196 * -256.0F;
						this.aFloatArrayArray6[local132][local108] = (float) local181 * local196;
					}
				}
			}
		}
		local108 = 0;
		local120 = 0;
		for (local132 = this.anInt6358; local132 <= this.anInt6355; local132++) {
			if (local132 >= 0 && local132 < arg1.anInt4625) {
				for (local141 = this.anInt6353; local141 <= this.anInt6357; local141++) {
					if (local141 >= 0 && local141 < arg1.anInt4630) {
						local166 = arg3[local120];
						@Pc(282) int[] local282 = arg1.anIntArrayArrayArray8[local141][local132];
						if (local282 != null && local166 != 0) {
							if (local166 == 1) {
								local108 += local282.length;
							} else {
								local108 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt6357 - this.anInt6353;
			}
		}
		if (local108 > 0) {
			this.aClass1_Sub16_8 = new Class1_Sub16(local108 * 2);
			this.aClass1_Sub16_Sub1_3 = new Class1_Sub16_Sub1(local108 * 16);
			this.aClass183_32 = new Class183(Static162.method3414(local108));
			local132 = 0;
			local120 = 0;
			for (local141 = this.anInt6358; local141 <= this.anInt6355; local141++) {
				if (local141 >= 0 && local141 < arg1.anInt4625) {
					local166 = 0;
					for (local181 = this.anInt6353; local181 <= this.anInt6357; local181++) {
						if (local181 >= 0 && local181 < arg1.anInt4630) {
							@Pc(392) int local392 = arg3[local120];
							@Pc(399) int[] local399 = arg1.anIntArrayArrayArray8[local181][local141];
							@Pc(406) int[] local406 = arg1.anIntArrayArrayArray5[local181][local141];
							if (local399 != null && local392 != 0) {
								if (local392 == 1) {
									for (@Pc(562) int local562 = 0; local562 < local399.length; local562++) {
										this.method5320(local181, local406[local562], local141, local166, local399[local562], local132);
									}
								} else if (local392 == 3) {
									this.method5320(local181, 0, local141, local166, 0, local132);
									this.method5320(local181, 0, local141, local166, arg1.anInt4510, local132);
									this.method5320(local181, arg1.anInt4510, local141, local166, 0, local132);
								} else if (local392 == 2) {
									this.method5320(local181, 0, local141, local166, arg1.anInt4510, local132);
									this.method5320(local181, arg1.anInt4510, local141, local166, arg1.anInt4510, local132);
									this.method5320(local181, 0, local141, local166, 0, local132);
								} else if (local392 == 5) {
									this.method5320(local181, arg1.anInt4510, local141, local166, arg1.anInt4510, local132);
									this.method5320(local181, arg1.anInt4510, local141, local166, 0, local132);
									this.method5320(local181, 0, local141, local166, arg1.anInt4510, local132);
								} else if (local392 == 4) {
									this.method5320(local181, arg1.anInt4510, local141, local166, 0, local132);
									this.method5320(local181, 0, local141, local166, 0, local132);
									this.method5320(local181, arg1.anInt4510, local141, local166, arg1.anInt4510, local132);
								}
							}
						}
						local166++;
						local120++;
					}
				} else {
					local120 += this.anInt6357 - this.anInt6353;
				}
				local132++;
			}
			this.anInterface7_6 = this.aClass40_Sub2_36.method2822(this.aClass1_Sub16_8.aByteArray86, this.aClass1_Sub16_8.anInt6813, false);
			this.anInterface2_6 = this.aClass40_Sub2_36.method2836(16, this.aClass1_Sub16_Sub1_3.aByteArray86, this.aClass1_Sub16_Sub1_3.anInt6813, false);
			this.aClass9_13 = new Class9(this.aClass40_Sub2_36, this.anInterface2_6, 5126, 3, 0);
			this.aClass9_14 = new Class9(this.aClass40_Sub2_36, this.anInterface2_6, 5121, 4, 12);
		} else {
			this.aClass9_13 = null;
			this.aClass9_14 = null;
			this.anInterface2_6 = null;
			this.anInterface7_6 = null;
		}
		this.aClass1_Sub16_Sub1_3 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray7 = this.aFloatArrayArray6 = null;
		this.aClass183_32 = null;
		this.aClass1_Sub16_8 = null;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IS)V")
	private void method5319(@OriginalArg(1) short arg0) {
		if (this.aClass40_Sub2_36.aBoolean216) {
			this.aClass1_Sub16_8.method5757(arg0);
		} else {
			this.aClass1_Sub16_8.method5779(arg0);
		}
		this.anInt6356++;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIBI)V")
	private void method5320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = (arg0 << this.aClass77_Sub1_2.anInt4506) + arg4;
		@Pc(17) int local17 = arg1 + (arg2 << this.aClass77_Sub1_2.anInt4506);
		@Pc(23) int local23 = this.aClass77_Sub1_2.method3994(local9, local17);
		if ((arg4 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local1 = ((long) local17 & 0xFFFFL) << 16 | (long) local9 & 0xFFFFL;
			@Pc(51) Class1 local51 = this.aClass183_32.method5053(local1);
			if (local51 != null) {
				this.method5319(((Class1_Sub27) local51).aShort61);
				return;
			}
		}
		@Pc(70) short local70 = (short) this.anInt6354++;
		if (local1 != -1L) {
			this.aClass183_32.method5055(local1, new Class1_Sub27(local70));
		}
		@Pc(140) float local140;
		@Pc(151) float local151;
		@Pc(129) float local129;
		@Pc(174) float local174;
		@Pc(182) float local182;
		@Pc(189) float local189;
		@Pc(196) float local196;
		@Pc(203) float local203;
		@Pc(212) float local212;
		@Pc(221) float local221;
		@Pc(296) float local296;
		if (arg4 == 0 && arg1 == 0) {
			local140 = this.aFloatArrayArray8[arg3][arg5];
			local151 = this.aFloatArrayArray7[arg3][arg5];
			local129 = this.aFloatArrayArray6[arg3][arg5];
		} else if (this.aClass77_Sub1_2.anInt4510 == arg4 && arg1 == 0) {
			local140 = this.aFloatArrayArray8[arg3 + 1][arg5];
			local129 = this.aFloatArrayArray6[arg3 + 1][arg5];
			local151 = this.aFloatArrayArray7[arg3 + 1][arg5];
		} else if (arg4 == this.aClass77_Sub1_2.anInt4510 && arg1 == this.aClass77_Sub1_2.anInt4510) {
			local129 = this.aFloatArrayArray6[arg3 + 1][arg5 + 1];
			local140 = this.aFloatArrayArray8[arg3 + 1][arg5 + 1];
			local151 = this.aFloatArrayArray7[arg3 + 1][arg5 + 1];
		} else if (arg4 == 0 && arg1 == this.aClass77_Sub1_2.anInt4510) {
			local151 = this.aFloatArrayArray7[arg3][arg5 + 1];
			local140 = this.aFloatArrayArray8[arg3][arg5 + 1];
			local129 = this.aFloatArrayArray6[arg3][arg5 + 1];
		} else {
			local174 = (float) arg4 / (float) this.aClass77_Sub1_2.anInt4510;
			local182 = (float) arg1 / (float) this.aClass77_Sub1_2.anInt4510;
			local189 = this.aFloatArrayArray8[arg3][arg5];
			local196 = this.aFloatArrayArray7[arg3][arg5];
			local203 = this.aFloatArrayArray6[arg3][arg5];
			local212 = this.aFloatArrayArray8[arg3 + 1][arg5];
			local221 = this.aFloatArrayArray7[arg3 + 1][arg5];
			@Pc(239) float local239 = local212 + local174 * (this.aFloatArrayArray8[arg3 + 1][arg5 + 1] - local212);
			@Pc(254) float local254 = local189 + (this.aFloatArrayArray8[arg3][arg5 + 1] - local189) * local174;
			@Pc(272) float local272 = local221 + (this.aFloatArrayArray7[arg3 + 1][arg5 + 1] - local221) * local174;
			@Pc(287) float local287 = local203 + (this.aFloatArrayArray6[arg3][arg5 + 1] - local203) * local174;
			local296 = this.aFloatArrayArray6[arg3 + 1][arg5];
			@Pc(311) float local311 = local196 + (this.aFloatArrayArray7[arg3][arg5 + 1] - local196) * local174;
			@Pc(328) float local328 = local296 + local174 * (this.aFloatArrayArray6[arg3 + 1][arg5 + 1] - local296);
			local140 = local254 + (local239 - local254) * local182;
			local151 = local311 + (local272 - local311) * local182;
			local129 = local182 * (local328 - local287) + local287;
		}
		local174 = this.aClass1_Sub9_1.anInt4580 - local9;
		local182 = this.aClass1_Sub9_1.anInt4572 - local23;
		local189 = this.aClass1_Sub9_1.anInt4576 - local17;
		local196 = (float) Math.sqrt((double) (local182 * local182 + local174 * local174 + local189 * local189));
		local203 = 1.0F / local196;
		local189 *= local203;
		local174 *= local203;
		local182 *= local203;
		local212 = local196 / (float) this.aClass1_Sub9_1.anInt4577;
		local221 = 1.0F - local212 * local212;
		if (local221 < 0.0F) {
			local221 = 0.0F;
		}
		local296 = local151 * local182 + local140 * local174 + local189 * local129;
		if (local296 < 0.0F) {
			local296 = 0.0F;
		}
		@Pc(529) float local529 = local296 * local221 * 2.0F;
		if (local529 > 1.0F) {
			local529 = 1.0F;
		}
		@Pc(539) int local539 = this.aClass1_Sub9_1.anInt4574;
		@Pc(549) int local549 = (int) (local529 * (float) (local539 >> 16 & 0xFF));
		if (local549 > 255) {
			local549 = 255;
		}
		@Pc(564) int local564 = (int) (local529 * (float) (local539 >> 8 & 0xFF));
		if (local564 > 255) {
			local564 = 255;
		}
		@Pc(579) int local579 = (int) (local529 * (float) (local539 & 0xFF));
		if (this.aClass40_Sub2_36.aBoolean216) {
			this.aClass1_Sub16_Sub1_3.method5027((float) local9);
			this.aClass1_Sub16_Sub1_3.method5027((float) local23);
			this.aClass1_Sub16_Sub1_3.method5027((float) local17);
		} else {
			this.aClass1_Sub16_Sub1_3.method5026((float) local9);
			this.aClass1_Sub16_Sub1_3.method5026((float) local23);
			this.aClass1_Sub16_Sub1_3.method5026((float) local17);
		}
		if (local579 > 255) {
			local579 = 255;
		}
		this.aClass1_Sub16_Sub1_3.method5771(local549);
		this.aClass1_Sub16_Sub1_3.method5771(local564);
		this.aClass1_Sub16_Sub1_3.method5771(local579);
		this.aClass1_Sub16_Sub1_3.method5771(255);
		this.method5319(local70);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II[[ZBI)V")
	public void method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface7_6 == null || (this.anInt6353 > arg1 + arg0 || (this.anInt6357 < arg0 - arg1 || (arg1 + arg3 < this.anInt6358 || this.anInt6355 < arg3 - arg1)))) {
			return;
		}
		for (@Pc(47) int local47 = this.anInt6358; local47 <= this.anInt6355; local47++) {
			for (@Pc(58) int local58 = this.anInt6353; local58 <= this.anInt6357; local58++) {
				@Pc(70) int local70 = local58 - arg0;
				@Pc(74) int local74 = local47 - arg3;
				if (-arg1 < local70 && local70 < arg1 && -arg1 < local74 && arg1 > local74 && arg2[arg1 + local70][local74 + arg1]) {
					this.aClass40_Sub2_36.method2851((int) (this.aClass1_Sub9_1.aFloat59 * 255.0F) << 24);
					this.aClass40_Sub2_36.method2840(this.aClass9_13, null, this.aClass9_14, null);
					this.aClass40_Sub2_36.method2847(this.anInterface7_6, 0, this.anInt6356);
					return;
				}
			}
		}
	}
}
