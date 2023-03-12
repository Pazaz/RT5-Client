import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class236_Sub1 extends Class236 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!bq;)Lclient!bq;")
	@Override
	public ReferenceNode method6030(@OriginalArg(1) ReferenceNode arg0) {
		return new SoftReferenceNode(arg0.anInterface7_3, arg0.get(), arg0.anInt5040);
	}
}
