import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class101 {

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
	public int anInt2687 = 16777215;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!bt;II)V")
	private void method2689(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2690 = arg0.method4829();
		} else if (arg1 == 2) {
			this.aBoolean191 = true;
		} else if (arg1 == 3) {
			this.anInt2695 = arg0.method4823();
			this.anInt2698 = arg0.method4823();
			this.anInt2693 = arg0.method4823();
		} else if (arg1 == 4) {
			this.anInt2692 = arg0.method4815();
		} else if (arg1 == 5) {
			this.anInt2686 = arg0.method4829();
		} else if (arg1 == 6) {
			this.anInt2687 = arg0.method4833();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!bt;)V")
	public void method2694(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4815();
			if (local17 == 0) {
				return;
			}
			this.method2689(arg0, local17);
		}
	}
}
