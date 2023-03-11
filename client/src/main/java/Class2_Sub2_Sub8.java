import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
	public int anInt2488 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!bt;I)V")
	public void method2501(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.g1();
			if (local10 == 0) {
				return;
			}
			this.method2502(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!bt;I)V")
	private void method2502(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt2488 = arg0.g2();
		}
	}
}
