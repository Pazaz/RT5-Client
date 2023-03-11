import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class Class212 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)[B")
	public abstract byte[] method5546();

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([BZ)V")
	public abstract void method5547(@OriginalArg(0) byte[] arg0);
}
