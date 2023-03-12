import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class2_Sub2_Sub1 extends SecondaryNode {

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "Lclient!uh;")
	public final Class11_Sub5_Sub4 aClass11_Sub5_Sub4_1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!uh;)V")
	public Class2_Sub2_Sub1(@OriginalArg(0) Class11_Sub5_Sub4 arg0) {
		this.aClass11_Sub5_Sub4_1 = arg0;
	}
}
