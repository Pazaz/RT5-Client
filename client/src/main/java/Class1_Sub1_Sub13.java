import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ji", name = "K", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
	public int anInt3536 = 1;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILclient!il;)V")
	private void method3128(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static344.method6059(arg1.method5772());
		} else if (arg0 == 2) {
			this.anInt3536 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!il;I)V")
	public void method3131(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5761();
			if (local5 == 0) {
				return;
			}
			this.method3128(local5, arg0);
		}
	}
}
