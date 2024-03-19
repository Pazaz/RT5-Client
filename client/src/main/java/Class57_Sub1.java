import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!qq;I)Lclient!qq;")
	@Override
	public Class1_Sub1_Sub1 method1652(@OriginalArg(0) Class1_Sub1_Sub1 arg0) {
		return new Class1_Sub1_Sub1_Sub2(arg0.method4234());
	}
}
