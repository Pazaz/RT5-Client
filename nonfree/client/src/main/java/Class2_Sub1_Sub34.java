import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class2_Sub1_Sub34 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(III)I")
	private int method8786(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - ((local15 * 15731 * local15 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (arg0 <= 107) {
			Static673.method8787((Class390) null, false);
		}
		if (super.aClass180_41.aBoolean338) {
			@Pc(28) int local28 = Static273.anIntArray341[arg1];
			for (@Pc(30) int local30 = 0; local30 < Static608.anInt9289; local30++) {
				local11[local30] = this.method8786(local28, Static54.anIntArray92[local30]) % 4096;
			}
		}
		return local11;
	}
}
