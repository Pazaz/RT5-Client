import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public final class Class2_Sub2_Sub11_Sub2 extends Class2_Sub2_Sub11 {

	@OriginalMember(owner = "client!tja", name = "y", descriptor = "Ljava/lang/Object;")
	private final Object anObject17;

	@OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(Lclient!uq;Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub11_Sub2(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject17 = arg1;
	}

	@OriginalMember(owner = "client!tja", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8314() {
		return false;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method8311() {
		return this.anObject17;
	}
}
