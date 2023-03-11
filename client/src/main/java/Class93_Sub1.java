import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!eu;)Lclient!eu;")
	@Override
	public Class2_Sub2_Sub6 method3695(@OriginalArg(1) Class2_Sub2_Sub6 arg0) {
		return new Class2_Sub2_Sub6_Sub1(arg0.method5951(), arg0.anInt6636);
	}
}
