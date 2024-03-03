import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class InvType extends SecondaryNode {

	@OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
	public int size = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.g1();
			if (local10 == 0) {
				return;
			}
			this.decode(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!bt;I)V")
	private void decode(@OriginalArg(1) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.size = arg0.g2();
		}
	}
}
