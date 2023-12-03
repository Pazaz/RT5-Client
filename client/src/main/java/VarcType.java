import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class VarcType {

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	public int anInt1258 = 1;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.g1();
			if (local17 == 0) {
				return;
			}
			this.decode(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!bt;II)V")
	private void decode(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static78.forCharKey(arg0.g1b());
		} else if (arg1 == 2) {
			this.anInt1258 = 0;
		}
	}
}
