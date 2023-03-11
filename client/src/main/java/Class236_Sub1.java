import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class236_Sub1 extends Class236 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!bq;)Lclient!bq;")
	@Override
	public Class2_Sub2_Sub2 method6030(@OriginalArg(1) Class2_Sub2_Sub2 arg0) {
		return new Class2_Sub2_Sub2_Sub1(arg0.anInterface7_3, arg0.method4626(), arg0.anInt5040);
	}
}
