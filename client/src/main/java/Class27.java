import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public abstract class Class27 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BJ)I")
	protected abstract int method5596(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	public abstract void method5597();

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(JI)I")
	public final int method5598(@OriginalArg(0) long arg0) {
		@Pc(13) long local13 = this.method5599();
		if (local13 > 0L) {
			Static638.method8395(local13);
		}
		return this.method5596(arg0);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)J")
	protected abstract long method5599();

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)J")
	public abstract long method5602();
}
