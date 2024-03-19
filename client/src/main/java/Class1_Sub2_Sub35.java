import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class1_Sub2_Sub35 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			Static360.method2012(local9, 0, Static64.anInt1755, Static60.anIntArray455[arg0]);
		}
		return local9;
	}
}
