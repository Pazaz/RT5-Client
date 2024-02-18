import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class360 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
	public final int anInt9477;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	public int anInt9478;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "[I")
	public final int[] anIntArray738;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "[I")
	public final int[] anIntArray739;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	public Class360() {
		Static650.method8500(16);
		this.anInt9477 = Static650.method8509() == 0 ? 1 : Static650.method8500(4) + 1;
		if (Static650.method8509() != 0) {
			Static650.method8500(8);
		}
		Static650.method8500(2);
		if (this.anInt9477 > 1) {
			this.anInt9478 = Static650.method8500(4);
		}
		this.anIntArray738 = new int[this.anInt9477];
		this.anIntArray739 = new int[this.anInt9477];
		for (@Pc(42) int local42 = 0; local42 < this.anInt9477; local42++) {
			Static650.method8500(8);
			this.anIntArray738[local42] = Static650.method8500(8);
			this.anIntArray739[local42] = Static650.method8500(8);
		}
	}
}
