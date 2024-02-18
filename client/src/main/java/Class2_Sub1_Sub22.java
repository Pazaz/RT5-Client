import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ola")
public final class Class2_Sub1_Sub22 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ola", name = "G", descriptor = "I")
	private int anInt7034 = 4096;

	@OriginalMember(owner = "client!ola", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ola", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			this.method9416(true, (Class2_Sub21) null, 2);
		}
		if (arg2 == 0) {
			this.anInt7034 = arg1.method7382();
		}
	}

	@OriginalMember(owner = "client!ola", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int[] local18 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(32) int[] local32 = this.method9422(Static489.anInt7343 & arg1 - 1, 0);
			@Pc(38) int[] local38 = this.method9422(arg1, 0);
			@Pc(48) int[] local48 = this.method9422(arg1 + 1 & Static489.anInt7343, 0);
			for (@Pc(50) int local50 = 0; local50 < Static608.anInt9289; local50++) {
				@Pc(63) int local63 = (local48[local50] - local32[local50]) * this.anInt7034;
				@Pc(83) int local83 = (local38[local50 + 1 & Static576.anInt8580] - local38[Static576.anInt8580 & local50 - 1]) * this.anInt7034;
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local97 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(130) int local130 = local118 == 0 ? 0 : 16777216 / local118;
				local18[local50] = 4096 - local130;
			}
		}
		return local18;
	}
}
