import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class Class348 {

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	protected Class348() {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public abstract void method7926();

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public abstract void method7927();

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B[BII)I")
	public abstract int method7929(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([BIBI)V")
	public abstract void method7931(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Z")
	public abstract boolean method7932(@OriginalArg(0) int arg0) throws IOException;
}
