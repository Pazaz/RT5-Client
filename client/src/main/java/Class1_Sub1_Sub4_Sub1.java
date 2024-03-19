import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class1_Sub1_Sub4_Sub1 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!bm", name = "O", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!bp;Ljava/lang/Object;)V")
	public Class1_Sub1_Sub4_Sub1(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject3 = arg1;
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3979() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3978() {
		return false;
	}
}
