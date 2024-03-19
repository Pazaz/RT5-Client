import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class105 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
	public int anInt3674 = 0;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
	public int anInt3677 = 0;

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
	public int anInt3683 = 2048;

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
	public int anInt3682 = 2048;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!il;I)V")
	private void method3230(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt3674 = arg1.method5761();
		} else if (arg0 == 2) {
			this.anInt3683 = arg1.method5749();
		} else if (arg0 == 3) {
			this.anInt3682 = arg1.method5749();
		} else if (arg0 == 4) {
			this.anInt3677 = arg1.method5762();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!il;)V")
	public void method3231(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		while (true) {
			@Pc(15) int local15 = arg1.method5761();
			if (local15 == 0) {
				return;
			}
			this.method3230(local15, arg1, arg0);
		}
	}
}
