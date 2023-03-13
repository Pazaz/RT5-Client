import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class SoftReferenceNodeFactory extends ReferenceNodeFactory {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!bq;)Lclient!bq;")
	@Override
	public ReferenceNodeWithInterface create(@OriginalArg(1) ReferenceNodeWithInterface arg0) {
		return new SoftReferenceNodeWithInterface(arg0.anInterface7_3, arg0.get(), arg0.anInt5040);
	}
}
