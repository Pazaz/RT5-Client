import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class2_Sub2_Sub2_Sub2 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	static {
		new Class79("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!iq;Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub2_Sub2(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject5 = arg1;
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4626() {
		return this.anObject5;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4625() {
		return false;
	}
}
