import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Lclient!gb;")
	public final Class93_Sub2_Sub1 aClass93_Sub2_Sub1_5;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!qha;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass93_Sub2_Sub1_5 = Static469.method6359(arg2, arg3, arg0, arg1);
		this.aClass93_Sub2_Sub1_5.method2946(false, false);
	}
}
