import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class n extends Class14 implements Interface5 {

	@OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!ve;[Lclient!wp;[Lclient!st;)V")
	public n(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class381 arg2, @OriginalArg(3) Class407[] arg3, @OriginalArg(4) Class23[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray114;
			local11[local25] = arg3[local25].anInt10847;
			local15[local25] = arg3[local25].anInt10850;
			local19[local25] = arg3[local25].anInt10852;
			local23[local25] = arg3[local25].anInt10848;
		}
		this.S(arg0, arg1, local7, arg3[0].anIntArray882, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!n", name = "fa", descriptor = "(CIIIZ)V")
	protected native void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!n", name = "PA", descriptor = "(CIIIZLclient!aa;II)V")
	private native void PA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!n", name = "S", descriptor = "(Lclient!oa;Lclient!ya;[[B[I[I[I[I[I)V")
	private native void S(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!n", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8817(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.PA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static307.method4477(this);
		}
	}
}
