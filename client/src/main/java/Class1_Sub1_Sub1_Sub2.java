import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!oh", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method4237() {
		return true;
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4234() {
		return this.aSoftReference2.get();
	}
}
