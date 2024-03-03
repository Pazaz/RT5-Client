import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class SkyboxSphereType {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public int anInt2686;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	public int anInt2692;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	public int anInt2693;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	public int anInt2695;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Z")
	public boolean aBoolean191;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	public int anInt2698;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public int anInt2690 = 8;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public int anInt2687 = 0xffffff;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!bt;II)V")
	private void decode(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2690 = arg0.g2();
		} else if (arg1 == 2) {
			this.aBoolean191 = true;
		} else if (arg1 == 3) {
			this.anInt2695 = arg0.g2s();
			this.anInt2698 = arg0.g2s();
			this.anInt2693 = arg0.g2s();
		} else if (arg1 == 4) {
			this.anInt2692 = arg0.g1();
		} else if (arg1 == 5) {
			this.anInt2686 = arg0.g2();
		} else if (arg1 == 6) {
			this.anInt2687 = arg0.g3();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!bt;)V")
	public void decode(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.g1();
			if (local17 == 0) {
				return;
			}
			this.decode(arg0, local17);
		}
	}
}
