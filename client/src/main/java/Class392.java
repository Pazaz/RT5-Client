import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class392 {

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
	public int anInt10372 = 0;

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
	public int anInt10374 = 0;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
	public int anInt10373 = 2048;

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
	public int anInt10377 = 2048;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method9006(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.g1();
			if (local15 == 0) {
				return;
			}
			this.method9007(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!ge;B)V")
	private void method9007(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 == 1) {
			this.anInt10372 = arg1.g1();
		} else if (arg0 == 2) {
			this.anInt10377 = arg1.g2();
		} else if (arg0 == 3) {
			this.anInt10373 = arg1.g2();
		} else if (arg0 == 4) {
			this.anInt10374 = arg1.g2s();
		}
	}
}
