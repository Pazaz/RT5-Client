import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "Z")
	public boolean aBoolean299;

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "Z")
	public boolean aBoolean301;

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "Z")
	public volatile boolean aBoolean300 = true;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)[B")
	public abstract byte[] method3603();

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)I")
	public abstract int method3605();
}
