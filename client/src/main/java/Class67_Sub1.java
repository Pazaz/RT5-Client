import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!km;B)Lclient!km;")
	@Override
	public Class1_Sub1_Sub4 method1990(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		return new Class1_Sub1_Sub4_Sub2(arg0.anInterface1_3, arg0.method3979());
	}
}
