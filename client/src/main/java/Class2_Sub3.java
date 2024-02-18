import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
	public int anInt101;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
	private Class2_Sub3() {
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "()V")
	public abstract void method113();

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lclient!nn;)I")
	public abstract int method114(@OriginalArg(0) Class2_Sub6_Sub3 arg0);
}
