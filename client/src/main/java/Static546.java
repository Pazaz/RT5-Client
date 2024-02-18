import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
	public static int anInt8244;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_97 = new Class345(66, 3);

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_98 = new Class345(61, 8);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)[Lclient!it;")
	public static Class184[] method7249() {
		return new Class184[] { Static403.aClass184_12, Static560.aClass184_15, Static672.aClass184_18, Static240.aClass184_9, Static51.aClass184_1, Static642.aClass184_17, Static94.aClass184_5, Static363.aClass184_13, Static507.aClass184_14, Static208.aClass184_6, Static609.aClass184_16, Static87.aClass184_4, Static256.aClass184_10, Static705.aClass184_19 };
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BII)Z")
	public static boolean method7250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static348.method5113(arg0)) {
			return true;
		} else {
			return !Static348.method5113(arg1);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7251(@OriginalArg(0) Class19 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static137.aBoolean210) {
			local7 = Static130.method2283();
			local9 = Static422.method5771();
		}
		arg0.KA(local7, local9, Static680.anInt10289 + local7, local9 + 350);
		arg0.aa(local7, local9, Static680.anInt10289, 350, Static566.anInt8472 << 24 | 0x332277, 1);
		Static682.method8927(local9, local9 + 350, local7, Static680.anInt10289 + local7);
		@Pc(54) int local54 = 350 / Static161.anInt2797;
		@Pc(65) int local65;
		if (Static512.anInt7664 > 0) {
			local65 = 346 - Static161.anInt2797 - 4;
			@Pc(75) int local75 = local54 * local65 / (local54 + Static512.anInt7664 - 1);
			@Pc(77) int local77 = 4;
			if (Static512.anInt7664 > 1) {
				local77 = (Static512.anInt7664 - Static213.anInt3471 - 1) * (local65 + -local75) / (Static512.anInt7664 - 1) + 4;
			}
			arg0.aa(local7 + Static680.anInt10289 - 16, local9 + local77, 12, local75, Static566.anInt8472 << 24 | 0x332277, 2);
			for (@Pc(119) int local119 = Static213.anInt3471; Static213.anInt3471 + local54 > local119 && Static512.anInt7664 > local119; local119++) {
				@Pc(128) String[] local128 = Static189.method2861(Static393.aStringArray32[local119], '\b');
				@Pc(137) int local137 = (Static680.anInt10289 - 8 - 16) / local128.length;
				for (@Pc(139) int local139 = 0; local139 < local128.length; local139++) {
					@Pc(147) int local147 = local139 * local137 + 8;
					arg0.KA(local147 + local7, local9, local147 + local7 + local137 - 8, local9 + 350);
					Static437.aClass14_9.method8829(local7 + local147, -Static694.aClass381_13.anInt10036 + -2 + local9 + 350 + -Static644.anInt9608 + -((local119 + -Static213.anInt3471) * Static161.anInt2797), Static386.method5439(local128[local139]), -16777216, -1);
				}
			}
		}
		Static665.aClass14_12.method8834(Static680.anInt10289 + local7 - 25, "Build: 667", -1, -16777216, local9 + 350 - 20);
		arg0.KA(local7, local9, Static680.anInt10289 + local7, local9 + 350);
		arg0.method7991(local9 + 350 - Static644.anInt9608, -1, local7, Static680.anInt10289);
		Static180.aClass14_3.method8829(local7 + 10, local9 - (Static42.aClass381_4.anInt10036 + -350 + 1), "--> " + Static386.method5439(Static110.aString19), -16777216, -1);
		if (-29 <= -49) {
			anInt8244 = -2;
		}
		if (!Static91.aBoolean750) {
			return;
		}
		local65 = -1;
		if (Static333.anInt5455 % 30 > 15) {
			local65 = 16777215;
		}
		arg0.method7998(12, local9 + 350 - Static42.aClass381_4.anInt10036 - 11, local65, Static42.aClass381_4.method8744("--> " + Static386.method5439(Static110.aString19).substring(0, Static594.anInt8776)) + local7 + 10);
	}
}
