import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!a", name = "T", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject1 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4234() {
		return this.anObject1;
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method4237() {
		return false;
	}
}
