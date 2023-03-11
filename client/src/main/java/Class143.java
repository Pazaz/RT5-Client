import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class143 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl2;

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "Lclient!fg;")
	private Interface5 anInterface5_5;

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "Lclient!kj;")
	private Class126 aClass126_7;

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "Lclient!kj;")
	private Class126 aClass126_8;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "Lclient!kj;")
	private Class126 aClass126_9;

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "[F")
	private final float[] aFloatArray17 = new float[16];

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "Lclient!ji;")
	private final Class2_Sub4_Sub1 aClass2_Sub4_Sub1_2 = new Class2_Sub4_Sub1(786336);

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "[[Lclient!at;")
	private final Class12_Sub1_Sub1[][] aClass12_Sub1_Sub1ArrayArray2 = new Class12_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "[I")
	private final int[] anIntArray222 = new int[64];

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "[[Lclient!at;")
	private final Class12_Sub1_Sub1[][] aClass12_Sub1_Sub1ArrayArray1 = new Class12_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
	private int anInt3729 = 0;

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "[I")
	private final int[] anIntArray221 = new int[8191];

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "[I")
	private final int[] anIntArray223 = new int[1600];

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!bf;)V")
	private void method3686(@OriginalArg(0) Class19_Sub1 arg0) {
		arg0.method817(true);
		if (arg0.aFloat3 != Static205.aFloat44) {
			arg0.method2838(Static205.aFloat44);
		}
		this.anOpengl2.glEnable(GL.GL_LIGHT0);
		this.anOpengl2.glEnable(GL.GL_LIGHT1);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!bf;I)V")
	private void method3687(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glGetFloatv(GL.GL_MODELVIEW_MATRIX, this.aFloatArray17, 0);
		@Pc(11) float local11 = this.aFloatArray17[0];
		@Pc(16) float local16 = this.aFloatArray17[4];
		@Pc(21) float local21 = this.aFloatArray17[8];
		@Pc(26) float local26 = this.aFloatArray17[1];
		@Pc(31) float local31 = this.aFloatArray17[5];
		@Pc(36) float local36 = this.aFloatArray17[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass2_Sub4_Sub1_2.pos = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class12_Sub1_Sub1 local113;
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
		@Pc(433) Class12_Sub1_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean53) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray223[local83] > 64 ? 64 : this.anIntArray223[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass12_Sub1_Sub1ArrayArray2[local83][local104];
						local116 = local113.anInt4469;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt4465 >> Static111.anInt2254;
						local146 = local113.anInt4470 >> Static111.anInt2254;
						local152 = local113.anInt4467 >> Static111.anInt2254;
						local157 = local113.anInt4472 >> Static111.anInt2254;
						this.aClass2_Sub4_Sub1_2.method3059(0.0F);
						this.aClass2_Sub4_Sub1_2.method3059(0.0F);
						this.aClass2_Sub4_Sub1_2.method3059(local140 + local40 * (float) -local157);
						this.aClass2_Sub4_Sub1_2.method3059(local146 + local44 * (float) -local157);
						this.aClass2_Sub4_Sub1_2.method3059(local152 + local48 * (float) -local157);
						this.aClass2_Sub4_Sub1_2.p1(local121);
						this.aClass2_Sub4_Sub1_2.p1(local126);
						this.aClass2_Sub4_Sub1_2.p1(local129);
						this.aClass2_Sub4_Sub1_2.p1(local134);
						this.aClass2_Sub4_Sub1_2.method3059(1.0F);
						this.aClass2_Sub4_Sub1_2.method3059(0.0F);
						this.aClass2_Sub4_Sub1_2.method3059(local140 + local52 * (float) local157);
						this.aClass2_Sub4_Sub1_2.method3059(local146 + local56 * (float) local157);
						this.aClass2_Sub4_Sub1_2.method3059(local152 + local60 * (float) local157);
						this.aClass2_Sub4_Sub1_2.p1(local121);
						this.aClass2_Sub4_Sub1_2.p1(local126);
						this.aClass2_Sub4_Sub1_2.p1(local129);
						this.aClass2_Sub4_Sub1_2.p1(local134);
						this.aClass2_Sub4_Sub1_2.method3059(1.0F);
						this.aClass2_Sub4_Sub1_2.method3059(1.0F);
						this.aClass2_Sub4_Sub1_2.method3059(local140 + local40 * (float) local157);
						this.aClass2_Sub4_Sub1_2.method3059(local146 + local44 * (float) local157);
						this.aClass2_Sub4_Sub1_2.method3059(local152 + local48 * (float) local157);
						this.aClass2_Sub4_Sub1_2.p1(local121);
						this.aClass2_Sub4_Sub1_2.p1(local126);
						this.aClass2_Sub4_Sub1_2.p1(local129);
						this.aClass2_Sub4_Sub1_2.p1(local134);
						this.aClass2_Sub4_Sub1_2.method3059(0.0F);
						this.aClass2_Sub4_Sub1_2.method3059(1.0F);
						this.aClass2_Sub4_Sub1_2.method3059(local140 + local64 * (float) local157);
						this.aClass2_Sub4_Sub1_2.method3059(local146 + local68 * (float) local157);
						this.aClass2_Sub4_Sub1_2.method3059(local152 + local72 * (float) local157);
						this.aClass2_Sub4_Sub1_2.p1(local121);
						this.aClass2_Sub4_Sub1_2.p1(local126);
						this.aClass2_Sub4_Sub1_2.p1(local129);
						this.aClass2_Sub4_Sub1_2.p1(local134);
					}
					if (this.anIntArray223[local83] > 64) {
						local104 = this.anIntArray223[local83] - 64 - 1;
						for (local424 = this.anIntArray222[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass12_Sub1_Sub1ArrayArray1[local104][local424];
							local436 = local433.anInt4469;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt4465 >> Static111.anInt2254;
							local152 = local433.anInt4470 >> Static111.anInt2254;
							local472 = local433.anInt4467 >> Static111.anInt2254;
							local477 = local433.anInt4472 >> Static111.anInt2254;
							this.aClass2_Sub4_Sub1_2.method3059(0.0F);
							this.aClass2_Sub4_Sub1_2.method3059(0.0F);
							this.aClass2_Sub4_Sub1_2.method3059(local146 + local40 * (float) -local477);
							this.aClass2_Sub4_Sub1_2.method3059(local152 + local44 * (float) -local477);
							this.aClass2_Sub4_Sub1_2.method3059(local472 + local48 * (float) -local477);
							this.aClass2_Sub4_Sub1_2.p1(local126);
							this.aClass2_Sub4_Sub1_2.p1(local129);
							this.aClass2_Sub4_Sub1_2.p1(local134);
							this.aClass2_Sub4_Sub1_2.p1(local454);
							this.aClass2_Sub4_Sub1_2.method3059(1.0F);
							this.aClass2_Sub4_Sub1_2.method3059(0.0F);
							this.aClass2_Sub4_Sub1_2.method3059(local146 + local52 * (float) local477);
							this.aClass2_Sub4_Sub1_2.method3059(local152 + local56 * (float) local477);
							this.aClass2_Sub4_Sub1_2.method3059(local472 + local60 * (float) local477);
							this.aClass2_Sub4_Sub1_2.p1(local126);
							this.aClass2_Sub4_Sub1_2.p1(local129);
							this.aClass2_Sub4_Sub1_2.p1(local134);
							this.aClass2_Sub4_Sub1_2.p1(local454);
							this.aClass2_Sub4_Sub1_2.method3059(1.0F);
							this.aClass2_Sub4_Sub1_2.method3059(1.0F);
							this.aClass2_Sub4_Sub1_2.method3059(local146 + local40 * (float) local477);
							this.aClass2_Sub4_Sub1_2.method3059(local152 + local44 * (float) local477);
							this.aClass2_Sub4_Sub1_2.method3059(local472 + local48 * (float) local477);
							this.aClass2_Sub4_Sub1_2.p1(local126);
							this.aClass2_Sub4_Sub1_2.p1(local129);
							this.aClass2_Sub4_Sub1_2.p1(local134);
							this.aClass2_Sub4_Sub1_2.p1(local454);
							this.aClass2_Sub4_Sub1_2.method3059(0.0F);
							this.aClass2_Sub4_Sub1_2.method3059(1.0F);
							this.aClass2_Sub4_Sub1_2.method3059(local146 + local64 * (float) local477);
							this.aClass2_Sub4_Sub1_2.method3059(local152 + local68 * (float) local477);
							this.aClass2_Sub4_Sub1_2.method3059(local472 + local72 * (float) local477);
							this.aClass2_Sub4_Sub1_2.p1(local126);
							this.aClass2_Sub4_Sub1_2.p1(local129);
							this.aClass2_Sub4_Sub1_2.p1(local134);
							this.aClass2_Sub4_Sub1_2.p1(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray223[local83] > 64 ? 64 : this.anIntArray223[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass12_Sub1_Sub1ArrayArray2[local83][local104];
						local116 = local113.anInt4469;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt4465 >> Static111.anInt2254;
						local146 = local113.anInt4470 >> Static111.anInt2254;
						local152 = local113.anInt4467 >> Static111.anInt2254;
						local157 = local113.anInt4472 >> Static111.anInt2254;
						this.aClass2_Sub4_Sub1_2.method3058(0.0F);
						this.aClass2_Sub4_Sub1_2.method3058(0.0F);
						this.aClass2_Sub4_Sub1_2.method3058(local140 + local40 * (float) -local157);
						this.aClass2_Sub4_Sub1_2.method3058(local146 + local44 * (float) -local157);
						this.aClass2_Sub4_Sub1_2.method3058(local152 + local48 * (float) -local157);
						this.aClass2_Sub4_Sub1_2.p1(local121);
						this.aClass2_Sub4_Sub1_2.p1(local126);
						this.aClass2_Sub4_Sub1_2.p1(local129);
						this.aClass2_Sub4_Sub1_2.p1(local134);
						this.aClass2_Sub4_Sub1_2.method3058(1.0F);
						this.aClass2_Sub4_Sub1_2.method3058(0.0F);
						this.aClass2_Sub4_Sub1_2.method3058(local140 + local52 * (float) local157);
						this.aClass2_Sub4_Sub1_2.method3058(local146 + local56 * (float) local157);
						this.aClass2_Sub4_Sub1_2.method3058(local152 + local60 * (float) local157);
						this.aClass2_Sub4_Sub1_2.p1(local121);
						this.aClass2_Sub4_Sub1_2.p1(local126);
						this.aClass2_Sub4_Sub1_2.p1(local129);
						this.aClass2_Sub4_Sub1_2.p1(local134);
						this.aClass2_Sub4_Sub1_2.method3058(1.0F);
						this.aClass2_Sub4_Sub1_2.method3058(1.0F);
						this.aClass2_Sub4_Sub1_2.method3058(local140 + local40 * (float) local157);
						this.aClass2_Sub4_Sub1_2.method3058(local146 + local44 * (float) local157);
						this.aClass2_Sub4_Sub1_2.method3058(local152 + local48 * (float) local157);
						this.aClass2_Sub4_Sub1_2.p1(local121);
						this.aClass2_Sub4_Sub1_2.p1(local126);
						this.aClass2_Sub4_Sub1_2.p1(local129);
						this.aClass2_Sub4_Sub1_2.p1(local134);
						this.aClass2_Sub4_Sub1_2.method3058(0.0F);
						this.aClass2_Sub4_Sub1_2.method3058(1.0F);
						this.aClass2_Sub4_Sub1_2.method3058(local140 + local64 * (float) local157);
						this.aClass2_Sub4_Sub1_2.method3058(local146 + local68 * (float) local157);
						this.aClass2_Sub4_Sub1_2.method3058(local152 + local72 * (float) local157);
						this.aClass2_Sub4_Sub1_2.p1(local121);
						this.aClass2_Sub4_Sub1_2.p1(local126);
						this.aClass2_Sub4_Sub1_2.p1(local129);
						this.aClass2_Sub4_Sub1_2.p1(local134);
					}
					if (this.anIntArray223[local83] > 64) {
						local104 = this.anIntArray223[local83] - 64 - 1;
						for (local424 = this.anIntArray222[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass12_Sub1_Sub1ArrayArray1[local104][local424];
							local436 = local433.anInt4469;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt4465 >> Static111.anInt2254;
							local152 = local433.anInt4470 >> Static111.anInt2254;
							local472 = local433.anInt4467 >> Static111.anInt2254;
							local477 = local433.anInt4472 >> Static111.anInt2254;
							this.aClass2_Sub4_Sub1_2.method3058(0.0F);
							this.aClass2_Sub4_Sub1_2.method3058(0.0F);
							this.aClass2_Sub4_Sub1_2.method3058(local146 + local40 * (float) -local477);
							this.aClass2_Sub4_Sub1_2.method3058(local152 + local44 * (float) -local477);
							this.aClass2_Sub4_Sub1_2.method3058(local472 + local48 * (float) -local477);
							this.aClass2_Sub4_Sub1_2.p1(local126);
							this.aClass2_Sub4_Sub1_2.p1(local129);
							this.aClass2_Sub4_Sub1_2.p1(local134);
							this.aClass2_Sub4_Sub1_2.p1(local454);
							this.aClass2_Sub4_Sub1_2.method3058(1.0F);
							this.aClass2_Sub4_Sub1_2.method3058(0.0F);
							this.aClass2_Sub4_Sub1_2.method3058(local146 + local52 * (float) local477);
							this.aClass2_Sub4_Sub1_2.method3058(local152 + local56 * (float) local477);
							this.aClass2_Sub4_Sub1_2.method3058(local472 + local60 * (float) local477);
							this.aClass2_Sub4_Sub1_2.p1(local126);
							this.aClass2_Sub4_Sub1_2.p1(local129);
							this.aClass2_Sub4_Sub1_2.p1(local134);
							this.aClass2_Sub4_Sub1_2.p1(local454);
							this.aClass2_Sub4_Sub1_2.method3058(1.0F);
							this.aClass2_Sub4_Sub1_2.method3058(1.0F);
							this.aClass2_Sub4_Sub1_2.method3058(local146 + local40 * (float) local477);
							this.aClass2_Sub4_Sub1_2.method3058(local152 + local44 * (float) local477);
							this.aClass2_Sub4_Sub1_2.method3058(local472 + local48 * (float) local477);
							this.aClass2_Sub4_Sub1_2.p1(local126);
							this.aClass2_Sub4_Sub1_2.p1(local129);
							this.aClass2_Sub4_Sub1_2.p1(local134);
							this.aClass2_Sub4_Sub1_2.p1(local454);
							this.aClass2_Sub4_Sub1_2.method3058(0.0F);
							this.aClass2_Sub4_Sub1_2.method3058(1.0F);
							this.aClass2_Sub4_Sub1_2.method3058(local146 + local64 * (float) local477);
							this.aClass2_Sub4_Sub1_2.method3058(local152 + local68 * (float) local477);
							this.aClass2_Sub4_Sub1_2.method3058(local472 + local72 * (float) local477);
							this.aClass2_Sub4_Sub1_2.p1(local126);
							this.aClass2_Sub4_Sub1_2.p1(local129);
							this.aClass2_Sub4_Sub1_2.p1(local134);
							this.aClass2_Sub4_Sub1_2.p1(local454);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub4_Sub1_2.pos != 0) {
			this.anInterface5_5.method4602(24, this.aClass2_Sub4_Sub1_2.data, this.aClass2_Sub4_Sub1_2.pos);
			arg0.method790(this.aClass126_9, null, this.aClass126_7, this.aClass126_8);
			arg0.method835(this.aClass2_Sub4_Sub1_2.pos / 24);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!bf;Lclient!tp;)V")
	public void method3688(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class224 arg1) {
		this.anOpengl2 = arg0.anOpengl1;
		if (arg0.aClass14_Sub2_2 == null) {
			return;
		}
		this.method3689(arg0);
		@Pc(14) float local14 = arg0.aClass14_Sub2_2.aFloat52;
		@Pc(18) float local18 = arg0.aClass14_Sub2_2.aFloat59;
		@Pc(22) float local22 = arg0.aClass14_Sub2_2.aFloat55;
		@Pc(26) float local26 = arg0.aClass14_Sub2_2.aFloat60;
		try {
			@Pc(31) int local31;
			@Pc(75) int local75;
			if (arg1.aBoolean429) {
				local31 = arg1.anInt6371 - arg1.anInt6369;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(320) Class12_Sub1 local320 = arg1.aClass191_1.aClass12_Sub1_7;
				@Pc(323) Class12_Sub1 local323 = local320.aClass12_Sub1_5;
				@Pc(325) int local325 = -2;
				@Pc(327) boolean local327 = true;
				@Pc(329) boolean local329 = true;
				while (local323 != local320) {
					this.anInt3729 = 0;
					for (local75 = 0; local75 < local31; local75++) {
						this.anIntArray223[local75] = 0;
					}
					for (local75 = 0; local75 < 64; local75++) {
						this.anIntArray222[local75] = 0;
					}
					while (local323 != local320) {
						@Pc(365) Class12_Sub1_Sub1 local365 = (Class12_Sub1_Sub1) local323;
						if (local329) {
							local325 = local365.anInt4474;
							local327 = local365.aBoolean307;
							local329 = false;
						} else if (local325 != local365.anInt4474 || local327 != local365.aBoolean307) {
							local329 = true;
							break;
						}
						@Pc(417) int local417 = (int) (local14 * (float) (local365.anInt4465 >> Static111.anInt2254) + local18 * (float) (local365.anInt4470 >> Static111.anInt2254) + local22 * (float) (local365.anInt4467 >> Static111.anInt2254) + local26) - arg1.anInt6369;
						if (local417 < 1600) {
							if (this.anIntArray223[local417] < 64) {
								this.aClass12_Sub1_Sub1ArrayArray2[local417][this.anIntArray223[local417]++] = local365;
							} else {
								label129: {
									if (this.anIntArray223[local417] == 64) {
										if (this.anInt3729 == 64) {
											break label129;
										}
										this.anIntArray223[local417] += this.anInt3729++ + 1;
									}
									this.aClass12_Sub1_Sub1ArrayArray1[this.anIntArray223[local417] - 64 - 1][this.anIntArray222[this.anIntArray223[local417] - 64 - 1]++] = local365;
								}
							}
						}
						local323 = local323.aClass12_Sub1_5;
					}
					if (local325 >= 0) {
						arg0.method848(arg0.aClass56_1.method1788(local325));
					} else {
						arg0.method848(null);
					}
					if (local327 && arg0.aFloat3 != Static205.aFloat44) {
						arg0.method2838(Static205.aFloat44);
					} else if (arg0.aFloat3 != 1.0F) {
						arg0.method2838(1.0F);
					}
					this.method3687(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class12_Sub1 local39 = arg1.aClass191_1.aClass12_Sub1_7;
				@Pc(42) Class12_Sub1 local42;
				for (local42 = local39.aClass12_Sub1_5; local42 != local39; local42 = local42.aClass12_Sub1_5) {
					@Pc(48) Class12_Sub1_Sub1 local48 = (Class12_Sub1_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt4465 >> Static111.anInt2254) + local18 * (float) (local48.anInt4470 >> Static111.anInt2254) + local22 * (float) (local48.anInt4467 >> Static111.anInt2254) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray221[local31++] = local75;
				}
				@Pc(99) int local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass12_Sub1_5;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				@Pc(115) boolean local115 = true;
				while (local42 != local39) {
					this.anInt3729 = 0;
					@Pc(123) int local123;
					for (local123 = 0; local123 < local99; local123++) {
						this.anIntArray223[local123] = 0;
					}
					for (local123 = 0; local123 < 64; local123++) {
						this.anIntArray222[local123] = 0;
					}
					while (local42 != local39) {
						@Pc(151) Class12_Sub1_Sub1 local151 = (Class12_Sub1_Sub1) local42;
						if (local115) {
							local75 = local151.anInt4474;
							local113 = local151.aBoolean307;
							local115 = false;
						}
						if (local31 > 0 && (local75 != local151.anInt4474 || local113 != local151.aBoolean307)) {
							local115 = true;
							break;
						}
						@Pc(182) int local182 = this.anIntArray221[local31++] - local33;
						if (local182 < 1600) {
							if (this.anIntArray223[local182] < 64) {
								this.aClass12_Sub1_Sub1ArrayArray2[local182][this.anIntArray223[local182]++] = local151;
							} else {
								label173: {
									if (this.anIntArray223[local182] == 64) {
										if (this.anInt3729 == 64) {
											break label173;
										}
										this.anIntArray223[local182] += this.anInt3729++ + 1;
									}
									this.aClass12_Sub1_Sub1ArrayArray1[this.anIntArray223[local182] - 64 - 1][this.anIntArray222[this.anIntArray223[local182] - 64 - 1]++] = local151;
								}
							}
						}
						local42 = local42.aClass12_Sub1_5;
					}
					if (local75 >= 0) {
						arg0.method848(arg0.aClass56_1.method1788(local75));
					} else {
						arg0.method848(null);
					}
					if (local113 && arg0.aFloat3 != Static205.aFloat44) {
						arg0.method2838(Static205.aFloat44);
					} else if (arg0.aFloat3 != 1.0F) {
						arg0.method2838(1.0F);
					}
					this.method3687(arg0, local99);
				}
			}
		} catch (@Pc(541) Exception local541) {
		}
		this.method3686(arg0);
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(Lclient!bf;)V")
	private void method3689(@OriginalArg(0) Class19_Sub1 arg0) {
		Static205.aFloat44 = arg0.aFloat3;
		arg0.method849();
		this.anOpengl2.glDisable(GL.GL_LIGHT0);
		this.anOpengl2.glDisable(GL.GL_LIGHT1);
		arg0.method817(false);
		arg0.method784();
		this.anOpengl2.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(Lclient!bf;)V")
	public void method3690(@OriginalArg(0) Class19_Sub1 arg0) {
		this.anInterface5_5 = arg0.method816(24, null, 196584, true);
		this.aClass126_8 = new Class126(arg0, this.anInterface5_5, 5126, 2, 0);
		this.aClass126_9 = new Class126(arg0, this.anInterface5_5, 5126, 3, 8);
		this.aClass126_7 = new Class126(arg0, this.anInterface5_5, 5121, 4, 20);
	}
}
