import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
	private int anInt369 = 1;

	@OriginalMember(owner = "client!ar", name = "S", descriptor = "I")
	private int anInt371 = 1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3996(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(31) int local31 = this.anInt371 + this.anInt371 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(44) int local44 = this.anInt369 + this.anInt369 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][] local51 = new int[local31][];
			@Pc(72) int local72;
			for (@Pc(57) int local57 = arg0 - this.anInt371; local57 <= arg0 + this.anInt371; local57++) {
				@Pc(67) int[] local67 = this.method6473(0, Static148.anInt2718 & local57);
				@Pc(70) int[] local70 = new int[Static227.anInt4036];
				local72 = 0;
				for (@Pc(76) int local76 = -this.anInt369; local76 <= this.anInt369; local76++) {
					local72 += local67[Static73.anInt1721 & local76];
				}
				@Pc(93) int local93 = 0;
				while (local93 < Static227.anInt4036) {
					local70[local93] = local72 * local48 >> 16;
					local72 -= local67[local93 - this.anInt369 & Static73.anInt1721];
					local93++;
					local72 += local67[Static73.anInt1721 & local93 + this.anInt369];
				}
				local51[local57 + this.anInt371 - arg0] = local70;
			}
			for (@Pc(154) int local154 = 0; local154 < Static227.anInt4036; local154++) {
				@Pc(158) int local158 = 0;
				for (local72 = 0; local72 < local31; local72++) {
					local158 += local51[local72][local154];
				}
				local11[local154] = local158 * local35 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt369 = arg1.g1();
		} else if (arg0 == 1) {
			this.anInt371 = arg1.g1();
		} else if (arg0 == 2) {
			super.aBoolean487 = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6479(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass243_41.method6277(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(31) int local31 = this.anInt371 + this.anInt371 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt369 + this.anInt369 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(73) int local73;
			@Pc(75) int local75;
			for (@Pc(55) int local55 = arg0 - this.anInt371; local55 <= this.anInt371 + arg0; local55++) {
				@Pc(65) int[][] local65 = this.method6483(0, local55 & Static148.anInt2718);
				@Pc(69) int[][] local69 = new int[3][Static227.anInt4036];
				@Pc(71) int local71 = 0;
				local73 = 0;
				local75 = 0;
				@Pc(79) int[] local79 = local65[0];
				@Pc(83) int[] local83 = local65[1];
				@Pc(87) int[] local87 = local65[2];
				for (@Pc(91) int local91 = -this.anInt369; local91 <= this.anInt369; local91++) {
					@Pc(97) int local97 = local91 & Static73.anInt1721;
					local71 += local79[local97];
					local75 += local87[local97];
					local73 += local83[local97];
				}
				@Pc(124) int[] local124 = local69[0];
				@Pc(128) int[] local128 = local69[1];
				@Pc(132) int[] local132 = local69[2];
				@Pc(134) int local134 = 0;
				while (Static227.anInt4036 > local134) {
					local124[local134] = local71 * local47 >> 16;
					local128[local134] = local73 * local47 >> 16;
					local132[local134] = local75 * local47 >> 16;
					@Pc(167) int local167 = local134 - this.anInt369 & Static73.anInt1721;
					local75 -= local87[local167];
					local134++;
					local73 -= local83[local167];
					local71 -= local79[local167];
					@Pc(193) int local193 = Static73.anInt1721 & this.anInt369 + local134;
					local71 += local79[local193];
					local75 += local87[local193];
					local73 += local83[local193];
				}
				local50[this.anInt371 + local55 - arg0] = local69;
			}
			@Pc(239) int[] local239 = local19[0];
			@Pc(243) int[] local243 = local19[1];
			@Pc(247) int[] local247 = local19[2];
			for (local73 = 0; local73 < Static227.anInt4036; local73++) {
				local75 = 0;
				@Pc(255) int local255 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local31; local259++) {
					@Pc(265) int[][] local265 = local50[local259];
					local257 += local265[2][local73];
					local255 += local265[1][local73];
					local75 += local265[0][local73];
				}
				local239[local73] = local35 * local75 >> 16;
				local243[local73] = local35 * local255 >> 16;
				local247[local73] = local35 * local257 >> 16;
			}
		}
		return local19;
	}
}
