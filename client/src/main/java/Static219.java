import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
	public static int anInt4983;

	@OriginalMember(owner = "client!ol", name = "Q", descriptor = "[Lclient!kj;")
	public static final Class1_Sub1_Sub14[] aClass1_Sub1_Sub14Array5 = new Class1_Sub1_Sub14[14];

	@OriginalMember(owner = "client!ol", name = "W", descriptor = "I")
	public static int anInt4987 = 104;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)Z")
	public static boolean method4281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(14) Class189 local14 = Static83.method1840(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local14.method5203(arg1);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!qj;ILclient!qj;)V")
	public static void method4282(@OriginalArg(0) Class162 arg0, @OriginalArg(2) Class162 arg1) {
		Static290.aClass162_212 = arg0;
		Static288.aClass162_211 = arg1;
		Static290.aClass162_212.method4640(34);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!qj;ILclient!qj;Lclient!fj;)V")
	public static void method4283(@OriginalArg(0) Class162 arg0, @OriginalArg(2) Class162 arg1, @OriginalArg(3) Interface3 arg2) {
		Static301.anInterface3_1 = arg2;
		Static67.aClass162_13 = arg1;
		Static308.aClass162_221 = arg0;
		if (Static67.aClass162_13 != null) {
			Static156.anInt3873 = Static67.aClass162_13.method4640(1);
		}
		if (Static308.aClass162_221 != null) {
			Static69.anInt1955 = Static308.aClass162_221.method4640(1);
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(BI)V")
	public static void method4285(@OriginalArg(1) int arg0) {
		if (Static199.method3942(arg0)) {
			Static221.method4305(-1, Class1_Sub2_Sub10.lb[arg0]);
		}
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
	public static void method4286() {
		Static268.anInt5668 = -1;
		Static286.anInt6044 = 0;
		Static47.anInt1523 = -1;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(II)V")
	public static void method4287(@OriginalArg(1) int arg0) {
		Static286.anInt6050 = arg0;
		Static297.anInt6237 = -1;
		Static233.anInt5206 = -1;
		Static122.method2622();
	}
}
