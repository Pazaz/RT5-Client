import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class321 {

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "I")
	public int anInt8301 = 0;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(BLclient!ge;I)V")
	private void method7293(@OriginalArg(1) Class2_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt8301 = arg0.method7382();
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method7294(@OriginalArg(0) Class2_Sub21 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7396();
			if (local7 == 0) {
				return;
			}
			this.method7293(arg0, local7);
		}
	}
}
