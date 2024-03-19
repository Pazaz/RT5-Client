import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
	public int anInt5129;

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "Ljava/lang/String;")
	public String aString180;

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)Z")
	public boolean method4378() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!il;Z)V")
	private void method4380(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static344.method6059(arg1.method5772());
		} else if (arg0 == 2) {
			this.anInt5129 = arg1.method5730();
		} else if (arg0 == 5) {
			this.aString180 = arg1.method5776();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!il;B)V")
	public void method4381(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5761();
			if (local5 == 0) {
				return;
			}
			this.method4380(local5, arg0);
		}
	}
}
