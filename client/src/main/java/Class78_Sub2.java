import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "Lclient!ln;")
	public final Class8_Sub1_Sub1 aClass8_Sub1_Sub1_2;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!bf;II[B)V")
	public Class78_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass8_Sub1_Sub1_2 = Static402.method3641(arg0, arg3, arg2, arg1);
		this.aClass8_Sub1_Sub1_2.method3638(false, false);
	}
}
