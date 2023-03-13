import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public abstract class ReferenceNodeFactory {

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!wj;")
	public static final ReferenceNodeFactory SOFT_REFERENCE_NODE_FACTORY = createSoftReferenceNodeFactory();

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(B)Lclient!wj;")
	public static ReferenceNodeFactory createSoftReferenceNodeFactory() {
		try {
			return (ReferenceNodeFactory) Class.forName("SoftReferenceNodeFactory").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!bq;)Lclient!bq;")
	public abstract ReferenceNodeWithInterface create(@OriginalArg(1) ReferenceNodeWithInterface arg0);
}
