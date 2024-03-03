import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class VarbitType {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public int anInt3548;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public int anInt3549;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "I")
	public int anInt3554;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.g1();
			if (local16 == 0) {
				return;
			}
			this.method3510(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!bt;)V")
	private void method3510(@OriginalArg(1) int arg0, @OriginalArg(2) Packet arg1) {
		if (arg0 == 1) {
			this.anInt3554 = arg1.g2();
			this.anInt3548 = arg1.g1();
			this.anInt3549 = arg1.g1();
		}
	}
}
