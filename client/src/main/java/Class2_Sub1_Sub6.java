import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cma")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!cma", name = "K", descriptor = "I")
	private int anInt1800 = 0;

	@OriginalMember(owner = "client!cma", name = "F", descriptor = "I")
	private int anInt1802 = 4096;

	@OriginalMember(owner = "client!cma", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cma", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(21) int[] local21 = this.method9422(arg1, 0);
			for (@Pc(23) int local23 = 0; local23 < Static608.anInt9289; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt1800 <= local29 && this.anInt1802 >= local29 ? 4096 : 0;
			}
		}
		return arg0 < 107 ? null : local11;
	}

	@OriginalMember(owner = "client!cma", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt1800 = arg1.method7382();
		} else if (arg2 == 1) {
			this.anInt1802 = arg1.method7382();
		}
		if (!arg0) {
			;
		}
	}
}
