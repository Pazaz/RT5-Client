import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class142_Sub2 extends Class142 {

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Lclient!ns;")
	public final Class44_Sub1_Sub1 aClass44_Sub1_Sub1_3;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!ih;II[B)V")
	public Class142_Sub2(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass44_Sub1_Sub1_3 = Static365.method4164(arg0, arg1, arg3, arg2);
		this.aClass44_Sub1_Sub1_3.method4162(false, false);
	}
}
