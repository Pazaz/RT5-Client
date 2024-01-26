import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lla")
public abstract class Class175 {

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(BII)[B")
	public abstract byte[] method3848(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "([BI)V")
	public abstract void method3849(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(B)[B")
	public abstract byte[] method3850();
}
