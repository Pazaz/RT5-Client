import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class122 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public int anInt2812;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt2816;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	public int anInt2817;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ge;B)V")
	private void method2609(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static346.method5084(arg1.g1b());
		} else if (arg0 == 3) {
			this.anInt2816 = arg1.g2();
			this.anInt2812 = arg1.g1();
			this.anInt2817 = arg1.g1();
			return;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!ge;)V")
	public void method2610(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method2609(local3, arg0);
		}
	}
}
