import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
	private int anInt3572;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
	private int anInt3573;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_20;

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "Lclient!of;")
	private final Class2_Sub26 aClass2_Sub26_1;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Lclient!ah;")
	private final Class6_Sub1 aClass6_Sub1_2;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	private final int anInt3570;

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
	private final int anInt3574;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	private final int anInt3569;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
	private final int anInt3571;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!bt;")
	private Buffer aClass2_Sub4_5;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!ji;")
	private Class2_Sub4_Sub1 aClass2_Sub4_Sub1_1;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Lclient!ad;")
	private Class4 aClass4_78;

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "Lclient!fd;")
	private final Interface4 anInterface4_3;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Lclient!fg;")
	private final Interface5 anInterface5_4;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Lclient!kj;")
	private final Class126 aClass126_5;

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "Lclient!kj;")
	private final Class126 aClass126_6;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!bf;Lclient!ah;Lclient!of;[I)V")
	public Class2_Sub23(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class6_Sub1 arg1, @OriginalArg(2) Class2_Sub26 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass19_Sub1_20 = arg0;
		this.aClass2_Sub26_1 = arg2;
		this.aClass6_Sub1_2 = arg1;
		@Pc(20) int local20 = this.aClass2_Sub26_1.anInt4374 - (arg1.anInt182 >> 1);
		this.anInt3570 = this.aClass2_Sub26_1.anInt4370 - local20 >> arg1.anInt183;
		this.anInt3574 = local20 + this.aClass2_Sub26_1.anInt4370 >> arg1.anInt183;
		this.anInt3569 = this.aClass2_Sub26_1.anInt4371 - local20 >> arg1.anInt183;
		this.anInt3571 = local20 + this.aClass2_Sub26_1.anInt4371 >> arg1.anInt183;
		@Pc(71) int local71 = this.anInt3574 + 1 - this.anInt3570;
		@Pc(79) int local79 = this.anInt3571 + 1 - this.anInt3569;
		this.aFloatArrayArray4 = new float[local71 + 1][local79 + 1];
		this.aFloatArrayArray5 = new float[local71 + 1][local79 + 1];
		this.aFloatArrayArray6 = new float[local71 + 1][local79 + 1];
		@Pc(108) int local108;
		@Pc(116) int local116;
		@Pc(131) int local131;
		@Pc(144) int local144;
		@Pc(171) int local171;
		@Pc(185) int local185;
		for (local108 = 0; local108 <= local79; local108++) {
			local116 = local108 + this.anInt3569;
			if (local116 > 0 && this.aClass6_Sub1_2.anInt6319 - 1 > local116) {
				for (local131 = 0; local131 <= local71; local131++) {
					local144 = local131 + this.anInt3570;
					if (local144 > 0 && this.aClass6_Sub1_2.anInt6320 - 1 > local144) {
						local171 = arg1.method5719(local144 + 1, local116) - arg1.method5719(local144 - 1, local116);
						local185 = arg1.method5719(local144, local116 + 1) - arg1.method5719(local144, local116 - 1);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local185 * local185 + local171 * local171 + 65536)));
						this.aFloatArrayArray6[local131][local108] = local200 * (float) local171;
						this.aFloatArrayArray4[local131][local108] = -256.0F * local200;
						this.aFloatArrayArray5[local131][local108] = local200 * (float) local185;
					}
				}
			}
		}
		local108 = 0;
		local116 = 0;
		for (local131 = this.anInt3569; local131 <= this.anInt3571; local131++) {
			if (local131 >= 0 && local131 < arg1.anInt6319) {
				for (local144 = this.anInt3570; local144 <= this.anInt3574; local144++) {
					if (local144 >= 0 && local144 < arg1.anInt6320) {
						local171 = arg3[local116];
						@Pc(289) int[] local289 = arg1.anIntArrayArrayArray4[local144][local131];
						if (local289 != null && local171 != 0) {
							if (local171 == 1) {
								local108 += local289.length;
							} else {
								local108 += 3;
							}
						}
					}
					local116++;
				}
			} else {
				local116 += this.anInt3574 - this.anInt3570;
			}
		}
		if (local108 > 0) {
			this.aClass2_Sub4_5 = new Buffer(local108 * 2);
			this.aClass2_Sub4_Sub1_1 = new Class2_Sub4_Sub1(local108 * 16);
			this.aClass4_78 = new Class4(Static162.method2977(local108));
			local131 = 0;
			local116 = 0;
			for (local144 = this.anInt3569; local144 <= this.anInt3571; local144++) {
				if (local144 >= 0 && local144 < arg1.anInt6319) {
					local171 = 0;
					for (local185 = this.anInt3570; local185 <= this.anInt3574; local185++) {
						if (local185 >= 0 && local185 < arg1.anInt6320) {
							@Pc(404) int local404 = arg3[local116];
							@Pc(411) int[] local411 = arg1.anIntArrayArrayArray4[local185][local144];
							@Pc(418) int[] local418 = arg1.anIntArrayArrayArray3[local185][local144];
							if (local411 != null && local404 != 0) {
								if (local404 == 1) {
									for (@Pc(567) int local567 = 0; local567 < local411.length; local567++) {
										this.method3527(local411[local567], local171, local144, local131, local185, local418[local567]);
									}
								} else if (local404 == 3) {
									this.method3527(0, local171, local144, local131, local185, 0);
									this.method3527(arg1.anInt182, local171, local144, local131, local185, 0);
									this.method3527(0, local171, local144, local131, local185, arg1.anInt182);
								} else if (local404 == 2) {
									this.method3527(arg1.anInt182, local171, local144, local131, local185, 0);
									this.method3527(arg1.anInt182, local171, local144, local131, local185, arg1.anInt182);
									this.method3527(0, local171, local144, local131, local185, 0);
								} else if (local404 == 5) {
									this.method3527(arg1.anInt182, local171, local144, local131, local185, arg1.anInt182);
									this.method3527(0, local171, local144, local131, local185, arg1.anInt182);
									this.method3527(arg1.anInt182, local171, local144, local131, local185, 0);
								} else if (local404 == 4) {
									this.method3527(0, local171, local144, local131, local185, arg1.anInt182);
									this.method3527(0, local171, local144, local131, local185, 0);
									this.method3527(arg1.anInt182, local171, local144, local131, local185, arg1.anInt182);
								}
							}
						}
						local116++;
						local171++;
					}
				} else {
					local116 += this.anInt3574 - this.anInt3570;
				}
				local131++;
			}
			this.anInterface4_3 = this.aClass19_Sub1_20.method839(this.aClass2_Sub4_5.aByteArray73, this.aClass2_Sub4_5.position, false);
			this.anInterface5_4 = this.aClass19_Sub1_20.method816(16, this.aClass2_Sub4_Sub1_1.aByteArray73, this.aClass2_Sub4_Sub1_1.position, false);
			this.aClass126_5 = new Class126(this.aClass19_Sub1_20, this.anInterface5_4, 5126, 3, 0);
			this.aClass126_6 = new Class126(this.aClass19_Sub1_20, this.anInterface5_4, 5121, 4, 12);
		} else {
			this.aClass126_6 = null;
			this.anInterface5_4 = null;
			this.aClass126_5 = null;
			this.anInterface4_3 = null;
		}
		this.aFloatArrayArray6 = this.aFloatArrayArray4 = this.aFloatArrayArray5 = null;
		this.aClass2_Sub4_5 = null;
		this.aClass4_78 = null;
		this.aClass2_Sub4_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(SI)V")
	private void method3525(@OriginalArg(0) short arg0) {
		if (this.aClass19_Sub1_20.aBoolean53) {
			this.aClass2_Sub4_5.method4843(arg0);
		} else {
			this.aClass2_Sub4_5.method4845(arg0);
		}
		this.anInt3572++;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[[ZI)V")
	public void method3526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface4_3 == null || (arg0 + arg1 < this.anInt3570 || (this.anInt3574 < arg1 - arg0 || (arg3 + arg0 < this.anInt3569 || arg3 - arg0 > this.anInt3571)))) {
			return;
		}
		for (@Pc(47) int local47 = this.anInt3569; local47 <= this.anInt3571; local47++) {
			for (@Pc(54) int local54 = this.anInt3570; local54 <= this.anInt3574; local54++) {
				@Pc(63) int local63 = local54 - arg1;
				@Pc(68) int local68 = local47 - arg3;
				if (-arg0 < local63 && local63 < arg0 && -arg0 < local68 && arg0 > local68 && arg2[arg0 + local63][local68 + arg0]) {
					this.aClass19_Sub1_20.method780((int) (this.aClass2_Sub26_1.aFloat65 * 255.0F) << 24);
					this.aClass19_Sub1_20.method790(this.aClass126_5, null, this.aClass126_6, null);
					this.aClass19_Sub1_20.method811(this.anInterface4_3, 0, this.anInt3572);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)V")
	private void method3527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = (arg4 << this.aClass6_Sub1_2.anInt183) + arg0;
		@Pc(17) int local17 = arg5 + (arg2 << this.aClass6_Sub1_2.anInt183);
		@Pc(23) int local23 = this.aClass6_Sub1_2.method5728(local9, local17);
		if ((arg0 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local17 & 0xFFFFL) << 16 | (long) local9 & 0xFFFFL;
			@Pc(53) Class2 local53 = this.aClass4_78.method90(local1);
			if (local53 != null) {
				this.method3525(((Class2_Sub9) local53).aShort20);
				return;
			}
		}
		@Pc(73) short local73 = (short) this.anInt3573++;
		if (local1 != -1L) {
			this.aClass4_78.method87(new Class2_Sub9(local73), local1);
		}
		@Pc(140) float local140;
		@Pc(131) float local131;
		@Pc(122) float local122;
		@Pc(175) float local175;
		@Pc(183) float local183;
		@Pc(190) float local190;
		@Pc(197) float local197;
		@Pc(204) float local204;
		@Pc(213) float local213;
		@Pc(222) float local222;
		@Pc(313) float local313;
		if (arg0 == 0 && arg5 == 0) {
			local140 = this.aFloatArrayArray6[arg1][arg3];
			local131 = this.aFloatArrayArray4[arg1][arg3];
			local122 = this.aFloatArrayArray5[arg1][arg3];
		} else if (arg0 == this.aClass6_Sub1_2.anInt182 && arg5 == 0) {
			local122 = this.aFloatArrayArray5[arg1 + 1][arg3];
			local131 = this.aFloatArrayArray4[arg1 + 1][arg3];
			local140 = this.aFloatArrayArray6[arg1 + 1][arg3];
		} else if (arg0 == this.aClass6_Sub1_2.anInt182 && arg5 == this.aClass6_Sub1_2.anInt182) {
			local122 = this.aFloatArrayArray5[arg1 + 1][arg3 + 1];
			local140 = this.aFloatArrayArray6[arg1 + 1][arg3 + 1];
			local131 = this.aFloatArrayArray4[arg1 + 1][arg3 + 1];
		} else if (arg0 == 0 && this.aClass6_Sub1_2.anInt182 == arg5) {
			local140 = this.aFloatArrayArray6[arg1][arg3 + 1];
			local122 = this.aFloatArrayArray5[arg1][arg3 + 1];
			local131 = this.aFloatArrayArray4[arg1][arg3 + 1];
		} else {
			local175 = (float) arg0 / (float) this.aClass6_Sub1_2.anInt182;
			local183 = (float) arg5 / (float) this.aClass6_Sub1_2.anInt182;
			local190 = this.aFloatArrayArray6[arg1][arg3];
			local197 = this.aFloatArrayArray4[arg1][arg3];
			local204 = this.aFloatArrayArray5[arg1][arg3];
			local213 = this.aFloatArrayArray6[arg1 + 1][arg3];
			local222 = this.aFloatArrayArray4[arg1 + 1][arg3];
			@Pc(240) float local240 = local213 + (this.aFloatArrayArray6[arg1 + 1][arg3 + 1] - local213) * local175;
			@Pc(258) float local258 = local222 + local175 * (this.aFloatArrayArray4[arg1 + 1][arg3 + 1] - local222);
			@Pc(274) float local274 = local204 + (this.aFloatArrayArray5[arg1][arg3 + 1] - local204) * local175;
			@Pc(289) float local289 = local197 + (this.aFloatArrayArray4[arg1][arg3 + 1] - local197) * local175;
			@Pc(304) float local304 = local190 + (this.aFloatArrayArray6[arg1][arg3 + 1] - local190) * local175;
			local313 = this.aFloatArrayArray5[arg1 + 1][arg3];
			local140 = (local240 - local304) * local183 + local304;
			local131 = local289 + (local258 - local289) * local183;
			@Pc(348) float local348 = local313 + (this.aFloatArrayArray5[arg1 + 1][arg3 + 1] - local313) * local175;
			local122 = local274 + local183 * (local348 - local274);
		}
		local175 = this.aClass2_Sub26_1.anInt4370 - local9;
		local183 = this.aClass2_Sub26_1.anInt4368 - local23;
		local190 = this.aClass2_Sub26_1.anInt4371 - local17;
		local197 = (float) Math.sqrt((double) (local190 * local190 + local175 * local175 + local183 * local183));
		local204 = 1.0F / local197;
		local183 *= local204;
		local190 *= local204;
		local175 *= local204;
		local213 = local197 / (float) this.aClass2_Sub26_1.anInt4374;
		local222 = 1.0F - local213 * local213;
		if (local222 < 0.0F) {
			local222 = 0.0F;
		}
		local313 = local190 * local122 + local140 * local175 + local131 * local183;
		if (local313 < 0.0F) {
			local313 = 0.0F;
		}
		@Pc(544) float local544 = local313 * local222 * 2.0F;
		if (local544 > 1.0F) {
			local544 = 1.0F;
		}
		@Pc(555) int local555 = this.aClass2_Sub26_1.anInt4372;
		@Pc(565) int local565 = (int) (local544 * (float) (local555 >> 16 & 0xFF));
		if (local565 > 255) {
			local565 = 255;
		}
		@Pc(580) int local580 = (int) ((float) (local555 >> 8 & 0xFF) * local544);
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(596) int local596 = (int) (local544 * (float) (local555 & 0xFF));
		if (this.aClass19_Sub1_20.aBoolean53) {
			this.aClass2_Sub4_Sub1_1.method3059((float) local9);
			this.aClass2_Sub4_Sub1_1.method3059((float) local23);
			this.aClass2_Sub4_Sub1_1.method3059((float) local17);
		} else {
			this.aClass2_Sub4_Sub1_1.method3058((float) local9);
			this.aClass2_Sub4_Sub1_1.method3058((float) local23);
			this.aClass2_Sub4_Sub1_1.method3058((float) local17);
		}
		if (local596 > 255) {
			local596 = 255;
		}
		this.aClass2_Sub4_Sub1_1.p1(local565);
		this.aClass2_Sub4_Sub1_1.p1(local580);
		this.aClass2_Sub4_Sub1_1.p1(local596);
		this.aClass2_Sub4_Sub1_1.p1(255);
		this.method3525(local73);
	}
}
