import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bn", name = "U", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub5(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt890 = 4096;
		this.anInt890 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub5() {
		this(4096);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt890 = (arg1.method5761() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			Static360.method2012(local9, 0, Static64.anInt1755, this.anInt890);
		}
		return local9;
	}
}
