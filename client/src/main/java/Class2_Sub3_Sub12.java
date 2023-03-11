import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class2_Sub3_Sub12 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fu", name = "O", descriptor = "I")
	private int anInt2214 = 0;

	@OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
	private int anInt2215 = 4096;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2214 = arg1.method4829();
		} else if (arg0 == 1) {
			this.anInt2215 = arg1.method4829();
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3996(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(27) int[] local27 = this.method6473(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static227.anInt4036; local29++) {
				@Pc(35) int local35 = local27[local29];
				local11[local29] = local35 >= this.anInt2214 && local35 <= this.anInt2215 ? 4096 : 0;
			}
		}
		return local11;
	}
}
