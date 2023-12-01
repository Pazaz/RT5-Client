import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class ProjAnimNode extends SecondaryNode {

	@OriginalMember(owner = "client!im", name = "F", descriptor = "Lclient!om;")
	public final ProjAnim aClass11_Sub5_Sub3_1;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!om;)V")
	public ProjAnimNode(@OriginalArg(0) ProjAnim arg0) {
		this.aClass11_Sub5_Sub3_1 = arg0;
	}
}
