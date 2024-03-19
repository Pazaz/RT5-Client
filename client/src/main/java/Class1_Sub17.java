import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
	public int anInt3457;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	private Class1_Sub17() {
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!lg;)I")
	public abstract int method3074(@OriginalArg(0) Class1_Sub3_Sub3 arg0);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
	public abstract void method3075();
}
