import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IB)I")
	public static int method5855(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lclient!tr;")
	public static Class155 method5856(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class155_Sub2");
			@Pc(15) Class155 local15 = (Class155) local11.getDeclaredConstructor().newInstance();
			local15.method5150(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class155_Sub1 local26 = new Class155_Sub1();
			local26.method5150(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ur;ZLjava/lang/String;B)V")
	public static void method5857(@OriginalArg(0) Class130 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		@Pc(20) int local20 = Static165.aClass239_3.method6124(null, arg2, 250);
		@Pc(29) int local29 = Static165.aClass239_3.method6123(arg2, 250, null) * 13;
		Static190.aClass19_8.method2901(6, 6, local20 + 8, local29 + 4 + 4, -16777216, 0);
		Static190.aClass19_8.method2836(6, 6, local20 + 8, local29 + 4 - -4, -1, 0);
		arg0.method5893(0, 0, 10, 1, -1, null, 0, null, local29, arg2, 1, 10, null, -1, local20);
		Static369.method6221(local20 + 4 + 4, 6, local29 + 4 + 4, 6);
		if (arg1) {
			Static190.aClass19_8.method2883();
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	public static void method5859() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static189.aBooleanArray33[local7] = false;
		}
		Static241.anInt4445 = client.cycle;
		Static5.anInt105 = Static102.anInt3592;
		Static349.anInt6455 = -1;
		Static147.anInt2717 = -1;
		Static314.anInt5911 = 5;
		Static272.anInt5023 = Static4.anInt87;
		Static231.anInt4071 = Static265.anInt4857;
		Static196.anInt3318 = Static211.anInt3777;
		Static236.anInt4309 = 0;
		Static33.anInt4463 = 0;
		Static106.anInt2218 = Static136.anInt6778;
	}
}
