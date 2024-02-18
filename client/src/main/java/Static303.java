import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!jka", name = "l", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_126 = new Class225(9, 10);

	@OriginalMember(owner = "client!jka", name = "r", descriptor = "I")
	public static int anInt4868 = 0;

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IB)V")
	public static void method4428(@OriginalArg(0) int arg0) {
		if (!Static470.method6387()) {
			return;
		}
		if (Static129.anInt2409 != arg0) {
			Static319.aString51 = "";
		}
		Static129.anInt2409 = arg0;
		Static405.aClass153_1.method3274();
		Static81.method1586(5);
	}

	@OriginalMember(owner = "client!jka", name = "g", descriptor = "(I)I")
	public static int method4429() {
		@Pc(13) Class82 local13 = Static580.aClass82_186;
		synchronized (Static580.aClass82_186) {
			return Static580.aClass82_186.method2148();
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lclient!ge;B)Lclient!gha;")
	public static Class138_Sub2 method4430(@OriginalArg(0) Packet arg0) {
		@Pc(15) Class138 local15 = Static632.method8359(arg0);
		@Pc(19) int local19 = arg0.g4();
		@Pc(23) int local23 = arg0.g4();
		@Pc(27) int local27 = arg0.g2();
		return new Class138_Sub2(local15.aClass403_10, local15.aClass103_10, local15.anInt4423, local15.anInt4412, local15.anInt4418, local15.anInt4413, local15.anInt4416, local15.anInt4415, local15.anInt4421, local19, local23, local27);
	}
}
