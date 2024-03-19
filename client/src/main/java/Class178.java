import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class178 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl2;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "Lclient!am;")
	private Class9 aClass9_10;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "Lclient!cj;")
	private Interface2 anInterface2_5;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "Lclient!am;")
	private Class9 aClass9_11;

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "Lclient!am;")
	private Class9 aClass9_12;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "[F")
	private final float[] aFloatArray21 = new float[16];

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "Lclient!sb;")
	private final Class1_Sub16_Sub1 aClass1_Sub16_Sub1_2 = new Class1_Sub16_Sub1(786336);

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "[I")
	private final int[] anIntArray447 = new int[64];

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "[[Lclient!ea;")
	private final Class2_Sub2_Sub1[][] aClass2_Sub2_Sub1ArrayArray2 = new Class2_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "[[Lclient!ea;")
	private final Class2_Sub2_Sub1[][] aClass2_Sub2_Sub1ArrayArray1 = new Class2_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
	private int anInt5847 = 0;

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "[I")
	private final int[] anIntArray448 = new int[1600];

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "[I")
	private final int[] anIntArray449 = new int[8191];

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!ih;)V")
	public void method4920(@OriginalArg(0) Class40_Sub2 arg0) {
		this.anInterface2_5 = arg0.method2836(24, null, 196584, true);
		this.aClass9_11 = new Class9(arg0, this.anInterface2_5, 5126, 2, 0);
		this.aClass9_12 = new Class9(arg0, this.anInterface2_5, 5126, 3, 8);
		this.aClass9_10 = new Class9(arg0, this.anInterface2_5, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(Lclient!ih;)V")
	private void method4921(@OriginalArg(0) Class40_Sub2 arg0) {
		arg0.method2880(true);
		this.anOpengl2.glEnable(16384);
		this.anOpengl2.glEnable(16385);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!ih;Lclient!lc;)V")
	public void method4922(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) Class117 arg1) {
		this.anOpengl2 = arg0.anOpengl1;
		if (arg0.aClass11_Sub1_2 == null) {
			return;
		}
		this.method4923(arg0);
		@Pc(14) float local14 = arg0.aClass11_Sub1_2.aFloat11;
		@Pc(18) float local18 = arg0.aClass11_Sub1_2.aFloat14;
		@Pc(22) float local22 = arg0.aClass11_Sub1_2.aFloat9;
		@Pc(26) float local26 = arg0.aClass11_Sub1_2.aFloat15;
		try {
			@Pc(31) int local31;
			@Pc(48) Class2_Sub2_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean288) {
				local31 = arg1.anInt4076 - arg1.anInt4075;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class2_Sub2 local290 = arg1.aClass148_1.aClass2_Sub2_5;
				@Pc(293) Class2_Sub2 local293 = local290.aClass2_Sub2_7;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt5847 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray448[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray447[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class2_Sub2_Sub1) local293;
						if (local297) {
							local295 = local48.anInt6010;
							local297 = false;
						} else if (local295 != local48.anInt6010) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt6017 >> Static318.anInt6558) + local18 * (float) (local48.anInt6020 >> Static318.anInt6558) + local22 * (float) (local48.anInt6014 >> Static318.anInt6558) + local26) - arg1.anInt4075;
						if (local75 <= 1600) {
							if (this.anIntArray448[local75] < 64) {
								this.aClass2_Sub2_Sub1ArrayArray1[local75][this.anIntArray448[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray448[local75] == 64) {
										if (this.anInt5847 == 64) {
											break label188;
										}
										this.anIntArray448[local75] += this.anInt5847++ + 1;
									}
									this.aClass2_Sub2_Sub1ArrayArray2[this.anIntArray448[local75] - 64 - 1][this.anIntArray447[this.anIntArray448[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass2_Sub2_7;
					}
					arg0.method2882(local295 >= 0 ? arg0.aClass128_1.method3709(local295) : null);
					this.method4924(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class2_Sub2 local39 = arg1.aClass148_1.aClass2_Sub2_5;
				@Pc(42) Class2_Sub2 local42;
				for (local42 = local39.aClass2_Sub2_7; local42 != local39; local42 = local42.aClass2_Sub2_7) {
					local48 = (Class2_Sub2_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt6017 >> Static318.anInt6558) + local18 * (float) (local48.anInt6020 >> Static318.anInt6558) + local22 * (float) (local48.anInt6014 >> Static318.anInt6558) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray449[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass2_Sub2_7;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt5847 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray448[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray447[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class2_Sub2_Sub1 local149 = (Class2_Sub2_Sub1) local42;
						if (local113) {
							local75 = local149.anInt6010;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt6010) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray449[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray448[local173] < 64) {
								this.aClass2_Sub2_Sub1ArrayArray1[local173][this.anIntArray448[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray448[local173] == 64) {
										if (this.anInt5847 == 64) {
											break label186;
										}
										this.anIntArray448[local173] += this.anInt5847++ + 1;
									}
									this.aClass2_Sub2_Sub1ArrayArray2[this.anIntArray448[local173] - 64 - 1][this.anIntArray447[this.anIntArray448[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass2_Sub2_7;
					}
					arg0.method2882(local75 >= 0 ? arg0.aClass128_1.method3709(local75) : null);
					this.method4924(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method4921(arg0);
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(Lclient!ih;)V")
	private void method4923(@OriginalArg(0) Class40_Sub2 arg0) {
		arg0.method2864();
		this.anOpengl2.glDisable(16384);
		this.anOpengl2.glDisable(16385);
		arg0.method2880(false);
		arg0.method2857();
		this.anOpengl2.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!ih;I)V")
	private void method4924(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glGetFloatv(2982, this.aFloatArray21, 0);
		@Pc(11) float local11 = this.aFloatArray21[0];
		@Pc(16) float local16 = this.aFloatArray21[4];
		@Pc(21) float local21 = this.aFloatArray21[8];
		@Pc(26) float local26 = this.aFloatArray21[1];
		@Pc(31) float local31 = this.aFloatArray21[5];
		@Pc(36) float local36 = this.aFloatArray21[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass1_Sub16_Sub1_2.anInt6813 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class2_Sub2_Sub1 local113;
		@Pc(116) int local116;
		@Pc(121) byte local121;
		@Pc(126) byte local126;
		@Pc(129) byte local129;
		@Pc(134) byte local134;
		@Pc(140) float local140;
		@Pc(146) float local146;
		@Pc(152) float local152;
		@Pc(157) int local157;
		@Pc(477) int local477;
		@Pc(424) int local424;
		@Pc(433) Class2_Sub2_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean216) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray448[local83] > 64 ? 64 : this.anIntArray448[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass2_Sub2_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt6016;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt6017 >> Static318.anInt6558;
						local146 = local113.anInt6020 >> Static318.anInt6558;
						local152 = local113.anInt6014 >> Static318.anInt6558;
						local157 = local113.anInt6013 >> Static318.anInt6558;
						this.aClass1_Sub16_Sub1_2.method5027(0.0F);
						this.aClass1_Sub16_Sub1_2.method5027(0.0F);
						this.aClass1_Sub16_Sub1_2.method5027(local140 + local40 * (float) -local157);
						this.aClass1_Sub16_Sub1_2.method5027(local146 + local44 * (float) -local157);
						this.aClass1_Sub16_Sub1_2.method5027(local152 + local48 * (float) -local157);
						this.aClass1_Sub16_Sub1_2.method5771(local121);
						this.aClass1_Sub16_Sub1_2.method5771(local126);
						this.aClass1_Sub16_Sub1_2.method5771(local129);
						this.aClass1_Sub16_Sub1_2.method5771(local134);
						this.aClass1_Sub16_Sub1_2.method5027(1.0F);
						this.aClass1_Sub16_Sub1_2.method5027(0.0F);
						this.aClass1_Sub16_Sub1_2.method5027(local140 + local52 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5027(local146 + local56 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5027(local152 + local60 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5771(local121);
						this.aClass1_Sub16_Sub1_2.method5771(local126);
						this.aClass1_Sub16_Sub1_2.method5771(local129);
						this.aClass1_Sub16_Sub1_2.method5771(local134);
						this.aClass1_Sub16_Sub1_2.method5027(1.0F);
						this.aClass1_Sub16_Sub1_2.method5027(1.0F);
						this.aClass1_Sub16_Sub1_2.method5027(local140 + local40 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5027(local146 + local44 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5027(local152 + local48 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5771(local121);
						this.aClass1_Sub16_Sub1_2.method5771(local126);
						this.aClass1_Sub16_Sub1_2.method5771(local129);
						this.aClass1_Sub16_Sub1_2.method5771(local134);
						this.aClass1_Sub16_Sub1_2.method5027(0.0F);
						this.aClass1_Sub16_Sub1_2.method5027(1.0F);
						this.aClass1_Sub16_Sub1_2.method5027(local140 + local64 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5027(local146 + local68 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5027(local152 + local72 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5771(local121);
						this.aClass1_Sub16_Sub1_2.method5771(local126);
						this.aClass1_Sub16_Sub1_2.method5771(local129);
						this.aClass1_Sub16_Sub1_2.method5771(local134);
					}
					if (this.anIntArray448[local83] > 64) {
						local104 = this.anIntArray448[local83] - 64 - 1;
						for (local424 = this.anIntArray447[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass2_Sub2_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt6016;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt6017 >> Static318.anInt6558;
							local152 = local433.anInt6020 >> Static318.anInt6558;
							local472 = local433.anInt6014 >> Static318.anInt6558;
							local477 = local433.anInt6013 >> Static318.anInt6558;
							this.aClass1_Sub16_Sub1_2.method5027(0.0F);
							this.aClass1_Sub16_Sub1_2.method5027(0.0F);
							this.aClass1_Sub16_Sub1_2.method5027(local146 + local40 * (float) -local477);
							this.aClass1_Sub16_Sub1_2.method5027(local152 + local44 * (float) -local477);
							this.aClass1_Sub16_Sub1_2.method5027(local472 + local48 * (float) -local477);
							this.aClass1_Sub16_Sub1_2.method5771(local126);
							this.aClass1_Sub16_Sub1_2.method5771(local129);
							this.aClass1_Sub16_Sub1_2.method5771(local134);
							this.aClass1_Sub16_Sub1_2.method5771(local454);
							this.aClass1_Sub16_Sub1_2.method5027(1.0F);
							this.aClass1_Sub16_Sub1_2.method5027(0.0F);
							this.aClass1_Sub16_Sub1_2.method5027(local146 + local52 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5027(local152 + local56 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5027(local472 + local60 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5771(local126);
							this.aClass1_Sub16_Sub1_2.method5771(local129);
							this.aClass1_Sub16_Sub1_2.method5771(local134);
							this.aClass1_Sub16_Sub1_2.method5771(local454);
							this.aClass1_Sub16_Sub1_2.method5027(1.0F);
							this.aClass1_Sub16_Sub1_2.method5027(1.0F);
							this.aClass1_Sub16_Sub1_2.method5027(local146 + local40 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5027(local152 + local44 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5027(local472 + local48 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5771(local126);
							this.aClass1_Sub16_Sub1_2.method5771(local129);
							this.aClass1_Sub16_Sub1_2.method5771(local134);
							this.aClass1_Sub16_Sub1_2.method5771(local454);
							this.aClass1_Sub16_Sub1_2.method5027(0.0F);
							this.aClass1_Sub16_Sub1_2.method5027(1.0F);
							this.aClass1_Sub16_Sub1_2.method5027(local146 + local64 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5027(local152 + local68 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5027(local472 + local72 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5771(local126);
							this.aClass1_Sub16_Sub1_2.method5771(local129);
							this.aClass1_Sub16_Sub1_2.method5771(local134);
							this.aClass1_Sub16_Sub1_2.method5771(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray448[local83] > 64 ? 64 : this.anIntArray448[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass2_Sub2_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt6016;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt6017 >> Static318.anInt6558;
						local146 = local113.anInt6020 >> Static318.anInt6558;
						local152 = local113.anInt6014 >> Static318.anInt6558;
						local157 = local113.anInt6013 >> Static318.anInt6558;
						this.aClass1_Sub16_Sub1_2.method5026(0.0F);
						this.aClass1_Sub16_Sub1_2.method5026(0.0F);
						this.aClass1_Sub16_Sub1_2.method5026(local140 + local40 * (float) -local157);
						this.aClass1_Sub16_Sub1_2.method5026(local146 + local44 * (float) -local157);
						this.aClass1_Sub16_Sub1_2.method5026(local152 + local48 * (float) -local157);
						this.aClass1_Sub16_Sub1_2.method5771(local121);
						this.aClass1_Sub16_Sub1_2.method5771(local126);
						this.aClass1_Sub16_Sub1_2.method5771(local129);
						this.aClass1_Sub16_Sub1_2.method5771(local134);
						this.aClass1_Sub16_Sub1_2.method5026(1.0F);
						this.aClass1_Sub16_Sub1_2.method5026(0.0F);
						this.aClass1_Sub16_Sub1_2.method5026(local140 + local52 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5026(local146 + local56 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5026(local152 + local60 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5771(local121);
						this.aClass1_Sub16_Sub1_2.method5771(local126);
						this.aClass1_Sub16_Sub1_2.method5771(local129);
						this.aClass1_Sub16_Sub1_2.method5771(local134);
						this.aClass1_Sub16_Sub1_2.method5026(1.0F);
						this.aClass1_Sub16_Sub1_2.method5026(1.0F);
						this.aClass1_Sub16_Sub1_2.method5026(local140 + local40 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5026(local146 + local44 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5026(local152 + local48 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5771(local121);
						this.aClass1_Sub16_Sub1_2.method5771(local126);
						this.aClass1_Sub16_Sub1_2.method5771(local129);
						this.aClass1_Sub16_Sub1_2.method5771(local134);
						this.aClass1_Sub16_Sub1_2.method5026(0.0F);
						this.aClass1_Sub16_Sub1_2.method5026(1.0F);
						this.aClass1_Sub16_Sub1_2.method5026(local140 + local64 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5026(local146 + local68 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5026(local152 + local72 * (float) local157);
						this.aClass1_Sub16_Sub1_2.method5771(local121);
						this.aClass1_Sub16_Sub1_2.method5771(local126);
						this.aClass1_Sub16_Sub1_2.method5771(local129);
						this.aClass1_Sub16_Sub1_2.method5771(local134);
					}
					if (this.anIntArray448[local83] > 64) {
						local104 = this.anIntArray448[local83] - 64 - 1;
						for (local424 = this.anIntArray447[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass2_Sub2_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt6016;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt6017 >> Static318.anInt6558;
							local152 = local433.anInt6020 >> Static318.anInt6558;
							local472 = local433.anInt6014 >> Static318.anInt6558;
							local477 = local433.anInt6013 >> Static318.anInt6558;
							this.aClass1_Sub16_Sub1_2.method5026(0.0F);
							this.aClass1_Sub16_Sub1_2.method5026(0.0F);
							this.aClass1_Sub16_Sub1_2.method5026(local146 + local40 * (float) -local477);
							this.aClass1_Sub16_Sub1_2.method5026(local152 + local44 * (float) -local477);
							this.aClass1_Sub16_Sub1_2.method5026(local472 + local48 * (float) -local477);
							this.aClass1_Sub16_Sub1_2.method5771(local126);
							this.aClass1_Sub16_Sub1_2.method5771(local129);
							this.aClass1_Sub16_Sub1_2.method5771(local134);
							this.aClass1_Sub16_Sub1_2.method5771(local454);
							this.aClass1_Sub16_Sub1_2.method5026(1.0F);
							this.aClass1_Sub16_Sub1_2.method5026(0.0F);
							this.aClass1_Sub16_Sub1_2.method5026(local146 + local52 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5026(local152 + local56 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5026(local472 + local60 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5771(local126);
							this.aClass1_Sub16_Sub1_2.method5771(local129);
							this.aClass1_Sub16_Sub1_2.method5771(local134);
							this.aClass1_Sub16_Sub1_2.method5771(local454);
							this.aClass1_Sub16_Sub1_2.method5026(1.0F);
							this.aClass1_Sub16_Sub1_2.method5026(1.0F);
							this.aClass1_Sub16_Sub1_2.method5026(local146 + local40 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5026(local152 + local44 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5026(local472 + local48 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5771(local126);
							this.aClass1_Sub16_Sub1_2.method5771(local129);
							this.aClass1_Sub16_Sub1_2.method5771(local134);
							this.aClass1_Sub16_Sub1_2.method5771(local454);
							this.aClass1_Sub16_Sub1_2.method5026(0.0F);
							this.aClass1_Sub16_Sub1_2.method5026(1.0F);
							this.aClass1_Sub16_Sub1_2.method5026(local146 + local64 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5026(local152 + local68 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5026(local472 + local72 * (float) local477);
							this.aClass1_Sub16_Sub1_2.method5771(local126);
							this.aClass1_Sub16_Sub1_2.method5771(local129);
							this.aClass1_Sub16_Sub1_2.method5771(local134);
							this.aClass1_Sub16_Sub1_2.method5771(local454);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub16_Sub1_2.anInt6813 != 0) {
			this.anInterface2_5.method3537(24, this.aClass1_Sub16_Sub1_2.aByteArray86, this.aClass1_Sub16_Sub1_2.anInt6813);
			arg0.method2840(this.aClass9_12, null, this.aClass9_10, this.aClass9_11);
			arg0.method2838(this.aClass1_Sub16_Sub1_2.anInt6813 / 24);
		}
	}
}
