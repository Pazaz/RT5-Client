import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class2_Sub2_Sub9 extends SecondaryNode {

	@OriginalMember(owner = "client!im", name = "F", descriptor = "Lclient!om;")
	public final Class11_Sub5_Sub3 aClass11_Sub5_Sub3_1;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!om;)V")
	public Class2_Sub2_Sub9(@OriginalArg(0) Class11_Sub5_Sub3 arg0) {
		this.aClass11_Sub5_Sub3_1 = arg0;
	}
}
