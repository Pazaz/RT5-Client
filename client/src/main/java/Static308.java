import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "Lclient!r;")
	public static Js5 aClass197_80;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "Lclient!hi;")
	public static final Class93 aClass93_1 = Static172.method3291();

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	public static void method5274() {
		for (@Pc(10) Class2_Sub37 local10 = (Class2_Sub37) Static207.aClass135_26.head(); local10 != null; local10 = (Class2_Sub37) Static207.aClass135_26.next()) {
			if (local10.anInt6485 > 0) {
				local10.anInt6485--;
			}
			if (local10.anInt6485 != 0) {
				if (local10.anInt6488 > 0) {
					local10.anInt6488--;
				}
				if (local10.anInt6488 == 0 && local10.anInt6484 >= 1 && local10.anInt6486 >= 1 && Static373.anInt7033 - 2 >= local10.anInt6484 && Static242.anInt4449 - 2 >= local10.anInt6486 && (local10.anInt6480 < 0 || Static287.method4931(local10.anInt6480, local10.anInt6479))) {
					Static79.method1871(local10.anInt6481, local10.anInt6484, local10.anInt6480, local10.anInt6494, local10.anInt6491, -1, local10.anInt6479, local10.anInt6486);
					local10.anInt6488 = -1;
					if (local10.anInt6480 == local10.anInt6492 && local10.anInt6492 == -1) {
						local10.unlink();
					} else if (local10.anInt6480 == local10.anInt6492 && local10.anInt6493 == local10.anInt6494 && local10.anInt6482 == local10.anInt6479) {
						local10.unlink();
					}
				}
			} else if (local10.anInt6492 < 0 || Static287.method4931(local10.anInt6492, local10.anInt6482)) {
				Static79.method1871(local10.anInt6481, local10.anInt6484, local10.anInt6492, local10.anInt6493, local10.anInt6491, -1, local10.anInt6482, local10.anInt6486);
				local10.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!bt;I)Ljava/lang/String;")
	public static String method5276(@OriginalArg(0) Buffer arg0) {
		return Static120.method2384(arg0);
	}
}
