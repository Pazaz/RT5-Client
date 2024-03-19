import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class158 {

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
	public int anInt5365;

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
	public int anInt5367;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
	public int anInt5369;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLclient!il;)V")
	public void method4558(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5761();
			if (local15 == 0) {
				return;
			}
			this.method4563(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!il;II)V")
	private void method4563(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5365 = arg0.method5749();
			this.anInt5369 = arg0.method5761();
			this.anInt5367 = arg0.method5761();
		}
	}
}
