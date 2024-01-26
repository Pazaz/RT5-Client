import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class na extends Class1 implements Interface5 {

	@OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;II[I[I)V")
	public na(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		this.ma(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static307.method4477(this);
		}
	}

	@OriginalMember(owner = "client!na", name = "ma", descriptor = "(Lclient!oa;Lclient!ya;II[I[I)V")
	private native void ma(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5);

	@OriginalMember(owner = "client!na", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);
}
