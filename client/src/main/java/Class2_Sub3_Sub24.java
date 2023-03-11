import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class2_Sub3_Sub24 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3996(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(27) int[][] local27 = this.method6483(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			for (@Pc(41) int local41 = 0; local41 < Static227.anInt4036; local41++) {
				local11[local41] = (local39[local41] + local35[local41] + local31[local41]) / 3;
			}
		}
		return local11;
	}
}
