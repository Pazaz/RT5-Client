import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class ObjStack extends Node {

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
	public int count;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
	public final int type;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V")
	public ObjStack(@OriginalArg(0) int type, @OriginalArg(1) int count) {
		this.count = count;
		this.type = type;
	}
}
