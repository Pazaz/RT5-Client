import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!es", name = "u", descriptor = "I")
	public static int anInt2057;

	@OriginalMember(owner = "client!es", name = "m", descriptor = "I")
	public static int anInt2054 = 0;

	@OriginalMember(owner = "client!es", name = "p", descriptor = "Ljava/lang/String;")
	public static final String aString76 = "green:";

	@OriginalMember(owner = "client!es", name = "B", descriptor = "Lclient!we;")
	public static final Class215 aClass215_31 = new Class215(20);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III)V")
	public static void method1735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static352.aClass215_102 = new Class215(arg0);
		Static11.aClass215_99 = new Class215(arg1);
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
	public static void method1736() {
		if (Static41.aClass145_2 == null) {
			return;
		}
		if (Static41.aClass145_2.anInt5065 == 1) {
			Static41.aClass145_2 = null;
			return;
		}
		if (Static41.aClass145_2.anInt5065 == 2) {
			Static20.method503(Static346.aString270, Static146.aClass199_9, 2);
			Static41.aClass145_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(II)V")
	public static void method1737() {
		Static250.aClass215_76.method6063(5);
		Static160.aClass215_100.method6063(5);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZZI)Lclient!sm;")
	public static Class1_Sub35 method1738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub35 local7 = new Class1_Sub35();
		local7.anInt6078 = arg1;
		local7.anInt6079 = arg0;
		Static135.aClass183_33.method5055((long) arg3, local7);
		Static190.method4603(arg0);
		@Pc(26) Class177 local26 = Static298.method5252(arg3);
		if (local26 != null) {
			Static145.method3188(local26);
		}
		if (Static262.aClass177_15 != null) {
			Static145.method3188(Static262.aClass177_15);
			Static262.aClass177_15 = null;
		}
		Static83.method1847();
		if (local26 != null) {
			Static140.method3081(local26, !arg2);
		}
		if (!arg2) {
			Static267.method4821(arg0);
		}
		if (!arg2 && Static295.anInt6177 != -1) {
			Static13.method5500(Static295.anInt6177, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!hp;Z)V")
	public static void method1739(@OriginalArg(0) Class87 arg0) {
		Static123.aClass87_1 = arg0;
	}
}
