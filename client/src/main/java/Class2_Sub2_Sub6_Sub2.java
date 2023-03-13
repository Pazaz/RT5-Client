import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class2_Sub2_Sub6_Sub2 extends ReferenceNode {

	@OriginalMember(owner = "client!up", name = "N", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub6_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject6 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5951() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!up", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5954() {
		return false;
	}
}
