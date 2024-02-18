import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public final class xa implements Interface26, Interface5 {

	@OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V")
	public xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.r(arg0, arg1);
	}

	@OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static307.method4477(this);
		}
	}

	@OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
	private native void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
	private native void va(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V")
	@Override
	public void w(@OriginalArg(0) boolean arg0) {
		this.va(this.nativeid, arg0);
	}
}
