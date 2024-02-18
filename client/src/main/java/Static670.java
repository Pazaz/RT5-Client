import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static670 {

	@OriginalMember(owner = "client!vda", name = "O", descriptor = "I")
	public static int anInt10024;

	@OriginalMember(owner = "client!vda", name = "Q", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_245 = new Class225(29, 6);

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(IIII)I")
	public static int method8732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= arg0) {
			return arg1 < arg2 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "(I)V")
	public static void method8735() {
		if (Static265.aByteArray44 != null) {
			Static619.method1512(Static470.anInt7113);
		} else if (Static129.anInt2409 == -1) {
			Static192.method2877(Static59.aString63, Static470.anInt7113, Static449.aString75);
		} else {
			Static113.method2119(Static470.anInt7113);
		}
	}
}
