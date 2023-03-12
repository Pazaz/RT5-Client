import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class245 {

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "[I")
	public int[] anIntArray484;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
	public int anInt7072 = -1;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
	public int anInt7078 = -1;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!bt;II)V")
	private void decode(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt7072 = arg0.g2();
		} else if (arg1 == 2) {
			this.anIntArray484 = new int[arg0.g1()];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray484.length; local19++) {
				this.anIntArray484[local19] = arg0.g2();
			}
		} else if (arg1 == 3) {
			this.anInt7078 = arg0.g1();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!bt;B)V")
	public void decode(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.decode(arg0, local5);
		}
	}
}
