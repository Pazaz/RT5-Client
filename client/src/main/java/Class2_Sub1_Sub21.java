import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class2_Sub1_Sub21 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 107) {
			return null;
		}
		@Pc(17) int[] local17 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(27) int[][] local27 = this.method9413(0, arg1);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			for (@Pc(41) int local41 = 0; local41 < Static608.anInt9289; local41++) {
				local17[local41] = (local39[local41] + local31[local41] + local35[local41]) / 3;
			}
		}
		return local17;
	}
}
