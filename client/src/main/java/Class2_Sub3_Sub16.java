import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class2_Sub3_Sub16 extends Class2_Sub3 {

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub16() {
		super(3, false);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			super.aBoolean487 = arg1.method4815() == 1;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass158_41.method3996(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(28) int[] local28 = this.method6473(0, arg0);
			@Pc(34) int[] local34 = this.method6473(1, arg0);
			@Pc(40) int[] local40 = this.method6473(2, arg0);
			for (@Pc(42) int local42 = 0; local42 < Static227.anInt4036; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local18[local42] = local28[local42];
				} else if (local48 == 0) {
					local18[local42] = local34[local42];
				} else {
					local18[local42] = local48 * local28[local42] + (4096 - local48) * local34[local42] >> 12;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6479(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6277(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(26) int[] local26 = this.method6473(2, arg0);
			@Pc(32) int[][] local32 = this.method6483(0, arg0);
			@Pc(38) int[][] local38 = this.method6483(1, arg0);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static227.anInt4036; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local62[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local50[local76] = local74[local76];
				} else {
					@Pc(132) int local132 = 4096 - local82;
					local42[local76] = local132 * local66[local76] + local82 * local54[local76] >> 12;
					local46[local76] = local132 * local70[local76] + local58[local76] * local82 >> 12;
					local50[local76] = local82 * local62[local76] + local132 * local74[local76] >> 12;
				}
			}
		}
		return local11;
	}
}
