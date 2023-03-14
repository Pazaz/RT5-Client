import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class LightType {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "I")
	public int anInt1877 = 0;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "I")
	public int anInt1879 = 2048;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "I")
	public int anInt1880 = 0;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "I")
	public int anInt1883 = 2048;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.g1();
			if (local9 == 0) {
				return;
			}
			this.decode(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!bt;IZ)V")
	private void decode(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1877 = arg0.g1();
		} else if (arg1 == 2) {
			this.anInt1883 = arg0.g2();
		} else if (arg1 == 3) {
			this.anInt1879 = arg0.g2();
		} else if (arg1 == 4) {
			this.anInt1880 = arg0.g2s();
		}
	}
}
