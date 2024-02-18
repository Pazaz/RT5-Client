import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sla")
public final class Class341 {

	@OriginalMember(owner = "client!sla", name = "h", descriptor = "I")
	public int anInt8742;

	@OriginalMember(owner = "client!sla", name = "g", descriptor = "I")
	public int anInt8745;

	@OriginalMember(owner = "client!sla", name = "a", descriptor = "C")
	public char aChar7;

	@OriginalMember(owner = "client!sla", name = "e", descriptor = "I")
	public int anInt8746;

	@OriginalMember(owner = "client!sla", name = "a", descriptor = "(ILclient!ge;Z)V")
	private void method7762(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		if (arg0 == 1) {
			this.aChar7 = Static346.method5084(arg1.method7377());
		} else if (arg0 == 2) {
			this.anInt8745 = arg1.method7382();
			this.anInt8742 = arg1.method7396();
			this.anInt8746 = arg1.method7396();
		}
	}

	@OriginalMember(owner = "client!sla", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method7763(@OriginalArg(0) Class2_Sub21 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method7396();
			if (local14 == 0) {
				return;
			}
			this.method7762(local14, arg0);
		}
	}
}
