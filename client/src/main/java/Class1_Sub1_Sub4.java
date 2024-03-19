import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!km", name = "B", descriptor = "Lclient!bp;")
	public final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!bp;)V")
	protected Class1_Sub1_Sub4(@OriginalArg(0) Interface1 arg0) {
		this.anInterface1_3 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(I)Z")
	public abstract boolean method3978();

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method3979();
}
