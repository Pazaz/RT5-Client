import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class2_Sub2_Sub6_Sub1 extends Class2_Sub2_Sub6 {

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub6_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5954() {
		return true;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5951() {
		return this.aSoftReference1.get();
	}
}
