import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!eo", name = "A", descriptor = "Lclient!jl;")
	public final Class7_Sub1_Sub4 aClass7_Sub1_Sub4_1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!jl;)V")
	public Class1_Sub1_Sub7(@OriginalArg(0) Class7_Sub1_Sub4 arg0) {
		this.aClass7_Sub1_Sub4_1 = arg0;
	}
}
