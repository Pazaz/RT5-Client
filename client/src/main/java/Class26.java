import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class Class26 {

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	protected Class26() {
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Lclient!wo;")
	public abstract Class220 method3361();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)V")
	public abstract void method3362(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method3363(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(BI)I")
	public abstract int method3364(@OriginalArg(1) int arg0);
}
