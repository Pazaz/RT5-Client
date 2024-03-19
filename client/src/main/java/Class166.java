import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class166 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
	public final int anInt5582;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
	public int anInt5583;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "[I")
	public final int[] anIntArray412;

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "[I")
	public final int[] anIntArray411;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
	public Class166() {
		Static333.method5883(16);
		this.anInt5582 = Static333.method5889() == 0 ? 1 : Static333.method5883(4) + 1;
		if (Static333.method5889() != 0) {
			Static333.method5883(8);
		}
		Static333.method5883(2);
		if (this.anInt5582 > 1) {
			this.anInt5583 = Static333.method5883(4);
		}
		this.anIntArray412 = new int[this.anInt5582];
		this.anIntArray411 = new int[this.anInt5582];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5582; local42++) {
			Static333.method5883(8);
			this.anIntArray412[local42] = Static333.method5883(8);
			this.anIntArray411[local42] = Static333.method5883(8);
		}
	}
}
