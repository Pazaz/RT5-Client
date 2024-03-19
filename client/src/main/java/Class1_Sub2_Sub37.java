import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class1_Sub2_Sub37 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
	private int anInt7014 = 0;

	@OriginalMember(owner = "client!vo", name = "Y", descriptor = "I")
	private int anInt7021 = 4096;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(26) int[] local26 = this.method6078(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static64.anInt1755; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = local34 >= this.anInt7014 && local34 <= this.anInt7021 ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt7014 = arg1.method5749();
		} else if (arg0 == 1) {
			this.anInt7021 = arg1.method5749();
		}
	}
}
