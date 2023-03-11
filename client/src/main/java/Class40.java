import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class40 {

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	public int anInt1258 = 1;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!bt;I)V")
	public void method1468(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4815();
			if (local17 == 0) {
				return;
			}
			this.method1470(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!bt;II)V")
	private void method1470(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static78.method5698(arg0.method4825());
		} else if (arg1 == 2) {
			this.anInt1258 = 0;
		}
	}
}
