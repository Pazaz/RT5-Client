import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public abstract class ReferenceNode extends SecondaryNode {

	@OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
	public final int anInt6636;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(I)V")
	protected ReferenceNode(@OriginalArg(0) int arg0) {
		this.anInt6636 = arg0;
	}

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5951();

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "(B)Z")
	public abstract boolean method5954();
}
