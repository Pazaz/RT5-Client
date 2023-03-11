import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class2_Sub2_Sub2_Sub1 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!jk", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!iq;Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub2_Sub1(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4625() {
		return true;
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4626() {
		return this.aSoftReference2.get();
	}
}
