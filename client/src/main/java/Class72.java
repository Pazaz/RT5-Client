import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class72 {

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
	public int anInt2430 = -1;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
	public int anInt2429 = -1;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!il;I)V")
	public void method2027(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method5761();
			if (local17 == 0) {
				return;
			}
			this.method2030(local17, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!il;II)V")
	private void method2030(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt2429 = arg1.method5749();
		} else if (arg0 == 2) {
			this.anIntArray152 = new int[arg1.method5761()];
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray152.length; local24++) {
				this.anIntArray152[local24] = arg1.method5749();
			}
		} else if (arg0 == 3) {
			this.anInt2430 = arg1.method5761();
		}
	}
}
