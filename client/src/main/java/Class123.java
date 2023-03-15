import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class Class123 {

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	protected Class123() {
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public abstract void method3337();

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public abstract void method3338();

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)Lclient!rk;")
	public abstract Class37 method3342();

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)Z")
	public abstract boolean method3343(@OriginalArg(1) int arg0);
}
