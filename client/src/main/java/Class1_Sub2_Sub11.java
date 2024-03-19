import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(19) int local19 = Static60.anIntArray455[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static64.anInt1755; local21++) {
				local11[local21] = this.method1592(local19, Static207.anIntArray360[local21]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(III)I")
	private int method1592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local9 ^ local9 << 1;
		return 4096 - (Integer.MAX_VALUE & local20 * (local20 * local20 * 15731 + 789221) + 1376312589) / 262144;
	}
}
