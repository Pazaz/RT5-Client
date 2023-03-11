import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static151 {

	@OriginalMember(owner = "client!im", name = "D", descriptor = "I")
	public static int anInt2772;

	@OriginalMember(owner = "client!im", name = "E", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_65 = new Class79(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!im", name = "G", descriptor = "I")
	public static int anInt2773 = 0;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(III)V")
	public static void method2756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static343.aClass50_4 == Static106.aClass50_1) {
			if (Static322.method5482(false, -2, arg0, 0, 1, arg1, 1, 0)) {
				return;
			}
			Static322.method5482(false, -3, arg0, 0, 1, arg1, 1, 0);
		} else if (Static322.method5482(false, -3, arg0, 0, 1, arg1, 1, 0)) {
			return;
		} else {
			Static322.method5482(false, -2, arg0, 0, 1, arg1, 1, 0);
		}
	}
}
