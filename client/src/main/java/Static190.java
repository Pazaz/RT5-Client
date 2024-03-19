import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString191 = "Allocated memory";

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "Z")
	public static boolean aBoolean378 = true;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
	public static int anInt5412 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!w;Lclient!w;)V")
	public static void method4600(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg1.aClass1_Sub1_62 != null) {
			arg1.method6158();
		}
		arg1.aClass1_Sub1_61 = arg0.aClass1_Sub1_61;
		arg1.aClass1_Sub1_62 = arg0;
		arg1.aClass1_Sub1_62.aClass1_Sub1_61 = arg1;
		arg1.aClass1_Sub1_61.aClass1_Sub1_62 = arg1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!nr;Lclient!tc;)I")
	public static int method4601(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class191 arg1) {
		if (arg1.anInt6243 != -1) {
			return arg1.anInt6243;
		}
		if (arg1.anInt6233 != -1) {
			@Pc(28) Class50 local28 = Static65.anInterface4_2.method165(arg0.method2767() ? arg1.anInt6233 : arg1.anInt6234);
			if (!local28.aBoolean108) {
				return local28.aShort27;
			}
		}
		return arg1.anInt6235;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIZ)V")
	public static void method4602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static239.anInt5299 = 0;
		Static180.anInt4240 = 0;
		Static179.anInt4229 = arg0;
		Static197.anInt4520 = arg1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)V")
	public static void method4603(@OriginalArg(1) int arg0) {
		if (!Static199.method3942(arg0)) {
			return;
		}
		@Pc(18) Class177[] local18 = Class1_Sub2_Sub10.lb[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class177 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt5769 = 0;
				local26.anInt5846 = 0;
				local26.anInt5844 = 1;
			}
		}
	}
}
