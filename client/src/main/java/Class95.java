import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class95 {

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
	public int anInt2497;

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
	public int anInt2499;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
	public int anInt2501;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!ge;)V")
	public void method2346(@OriginalArg(1) Class2_Sub21 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7396();
			if (local11 == 0) {
				return;
			}
			this.method2348(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method2348(@OriginalArg(1) Class2_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2501 = arg0.method7382();
			this.anInt2497 = arg0.method7396();
			this.anInt2499 = arg0.method7396();
		}
	}
}
