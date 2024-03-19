import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!ro;")
	public static Class177 aClass177_19;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Lclient!qj;")
	public static Class162 aClass162_207;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "J")
	public static long aLong186 = 0L;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	public static int anInt6002 = 0;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
	public static int anInt6004 = -1;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
	public static int anInt6009 = 0;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public static void method5079() {
		@Pc(5) Class215 local5 = Static28.aClass215_16;
		synchronized (Static28.aClass215_16) {
			Static28.aClass215_16.method6052();
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	public static void method5080() {
		Static60.method5087();
		Static158.method3384();
		Static184.method5965();
		Static215.method4211();
		Static104.method2155();
		Static177.method3610();
		Static141.method3110();
		Static27.method654();
		Static97.method2067();
		Static51.method1364();
		Static197.method3894();
		Static74.method1737();
		Static59.method5601();
		Static266.method4817();
		Static161.method3407();
		Static135.method6047();
		Static211.method2742();
		Static278.method3395();
		Static69.method1644();
		Static49.method1355();
		Static92.method2005();
		Static248.method4596();
		Static282.method5044();
		Static286.aClass215_85.method6063(5);
		Static43.aClass215_20.method6063(5);
		Static70.aClass215_29.method6063(5);
		Static213.aClass215_28.method6063(5);
		Static267.aClass215_80.method6063(5);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I")
	public static int method5081(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(19) Class1_Sub14 local19 = (Class1_Sub14) Static143.aClass183_13.method5053((long) arg0);
		if (local19 == null) {
			return Static166.method3462(arg0).anInt3098;
		}
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local19.anIntArray224.length; local30++) {
			if (local19.anIntArray224[local30] == -1) {
				local28++;
			}
		}
		return local28 + Static166.method3462(arg0).anInt3098 - local19.anIntArray224.length;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!il;)Lclient!jo;")
	public static Class103_Sub1 method5083(@OriginalArg(1) Class1_Sub16 arg0) {
		return new Class103_Sub1(arg0.method5762(), arg0.method5762(), arg0.method5762(), arg0.method5762(), arg0.method5755(), arg0.method5755(), arg0.method5761());
	}
}
