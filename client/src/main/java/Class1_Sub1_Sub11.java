import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	public int anInt3098 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!il;)V")
	private void method2641(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 2) {
			this.anInt3098 = arg1.method5749();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!il;I)V")
	public void method2643(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5761();
			if (local11 == 0) {
				return;
			}
			this.method2641(local11, arg0);
		}
	}
}
