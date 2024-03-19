import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dh", name = "L", descriptor = "Lclient!fk;")
	public final Class7_Sub1_Sub2 aClass7_Sub1_Sub2_1;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!fk;)V")
	public Class1_Sub1_Sub5(@OriginalArg(0) Class7_Sub1_Sub2 arg0) {
		this.aClass7_Sub1_Sub2_1 = arg0;
	}
}
