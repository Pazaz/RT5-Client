import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public abstract class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4234();

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)Z")
	public abstract boolean method4237();
}
