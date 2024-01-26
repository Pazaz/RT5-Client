import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "Lclient!og;")
	public final Interface18 anInterface18_2;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!am;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface18_2 = arg0.method8028(arg2, arg3, Static679.aClass92_15, arg1, false);
		this.anInterface18_2.method9052(false, false);
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!am;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface18_2 = arg0.method8034(false, arg2, arg1, arg3);
		this.anInterface18_2.method9052(false, false);
	}
}
