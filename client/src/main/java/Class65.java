import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class65 {

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
	public int anInt2335 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!il;IZ)V")
	private void method1945(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt2335 = arg0.method5749();
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLclient!il;)V")
	public void method1948(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5761();
			if (local13 == 0) {
				return;
			}
			this.method1945(arg0, local13);
		}
	}
}
