import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static700 {

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_123 = new Class345(10, 8);

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
	public static void method9148(@OriginalArg(1) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static448.anInt6796 == 1) {
			Static74.aClass19_4.method8011(arg1, arg0, Static2.anInt45, Static312.anInt5001);
		} else {
			Static74.aClass19_4.method8011(arg1, arg0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IZ)Z")
	public static boolean method9150(@OriginalArg(0) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
	public static void method9152() {
		Static563.method7461();
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static577.aClass110Array1[local16].method2467();
		}
		Static244.method3512();
		Static352.method5180();
		Static46.method1084();
		System.gc();
		Static163.aClass19_17.ya();
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)V")
	public static void method9153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub2_Sub2 local9 = Static440.method5963(17, (long) arg1);
		local9.method202();
		local9.anInt197 = arg0;
	}
}
