import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "Z")
	private boolean aBoolean16 = true;

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "Z")
	private boolean aBoolean15 = true;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass158_41.method3996(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(33) int[] local33 = this.method6473(0, this.aBoolean16 ? Static148.anInt2718 - arg0 : arg0);
			if (this.aBoolean15) {
				for (@Pc(46) int local46 = 0; local46 < Static227.anInt4036; local46++) {
					local16[local46] = local33[Static73.anInt1721 - local46];
				}
			} else {
				Static404.method4605(local33, 0, local16, 0, Static227.anInt4036);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.aBoolean15 = arg1.g1() == 1;
		} else if (arg0 == 1) {
			this.aBoolean16 = arg1.g1() == 1;
		} else if (arg0 == 2) {
			super.aBoolean487 = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6479(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6277(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(34) int[][] local34 = this.method6483(0, this.aBoolean16 ? Static148.anInt2718 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			@Pc(63) int local63;
			if (this.aBoolean15) {
				for (local63 = 0; local63 < Static227.anInt4036; local63++) {
					local50[local63] = local38[Static73.anInt1721 - local63];
					local54[local63] = local42[Static73.anInt1721 - local63];
					local58[local63] = local46[Static73.anInt1721 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static227.anInt4036; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local11;
	}
}
