import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class1_Sub2_Sub30 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qn", name = "Q", descriptor = "I")
	private int anInt5540 = 4096;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt5540 = arg1.method5749();
		}
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(33) int[] local33 = this.method6078(0, arg0 - 1 & Static128.anInt3242);
			@Pc(39) int[] local39 = this.method6078(0, arg0);
			@Pc(49) int[] local49 = this.method6078(0, Static128.anInt3242 & arg0 + 1);
			for (@Pc(51) int local51 = 0; local51 < Static64.anInt1755; local51++) {
				@Pc(65) int local65 = (local49[local51] - local33[local51]) * this.anInt5540;
				@Pc(85) int local85 = this.anInt5540 * (local39[Static145.anInt3608 & local51 + 1] - local39[Static145.anInt3608 & local51 - 1]);
				@Pc(89) int local89 = local85 >> 12;
				@Pc(93) int local93 = local65 >> 12;
				@Pc(99) int local99 = local89 * local89 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(119) int local119 = (int) (Math.sqrt((double) ((float) (local99 + local105 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(130) int local130 = local119 == 0 ? 0 : 16777216 / local119;
				local11[local51] = 4096 - local130;
			}
		}
		return local11;
	}
}
