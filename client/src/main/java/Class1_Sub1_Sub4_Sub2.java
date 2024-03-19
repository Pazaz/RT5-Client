import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class1_Sub1_Sub4_Sub2 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!bp;Ljava/lang/Object;)V")
	public Class1_Sub1_Sub4_Sub2(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3978() {
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3979() {
		return this.aSoftReference1.get();
	}
}
