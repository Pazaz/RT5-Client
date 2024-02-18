import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!gha", name = "u", descriptor = "Lclient!it;")
	public static final Class184 aClass184_6 = new Class184(11, 0, 1, 2);

	@OriginalMember(owner = "client!gha", name = "w", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_83 = new Class225(113, 3);

	@OriginalMember(owner = "client!gha", name = "t", descriptor = "[Lclient!mj;")
	public static final Class243[] aClass243Array1 = new Class243[37];

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(IIIII)V")
	public static void method3105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static676.anInt10206;
		@Pc(7) int local7 = Static305.anInt4882;
		if (Static137.aBoolean210) {
			local5 += Static130.method2283();
			local7 += Static422.method5771();
		}
		@Pc(30) Class23 local30;
		if (Static616.anInt9417 == 1) {
			local30 = Static355.aClass23Array9[Static481.anInt7215 / 100];
			local30.method8202(local5 - 8, local7 + -8);
			Static682.method8927(local7 - 8, local7 - 8 - -local30.method8192(), local5 - 8, local30.method8203() + -8 + local5);
		}
		if (Static616.anInt9417 == 2) {
			local30 = Static355.aClass23Array9[Static481.anInt7215 / 100 + 4];
			local30.method8202(local5 - 8, local7 + -8);
			Static682.method8927(local7 - 8, local30.method8192() + -8 + local7, local5 - 8, local30.method8203() + local5 + -8);
		}
		Static494.method6597();
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Z)V")
	public static void method3106() {
		Static334.aClass319_1.method8482();
		Static189.aClass120_1.method8848();
		Static295.aClient1.method1641();
		Static434.aCanvas7.setBackground(Color.black);
		Static470.anInt7112 = -1;
		Static334.aClass319_1 = Static681.method8921(Static434.aCanvas7);
		Static189.aClass120_1 = Static70.method1513(Static434.aCanvas7);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!eo;Z[[[BIB)Z")
	public static boolean method3107(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static581.aBoolean657) {
			return false;
		}
		@Pc(9) int local9 = arg0.anInt10690 >> Static52.anInt1066;
		@Pc(11) int local11 = local9;
		@Pc(16) int local16 = arg0.anInt10694 >> Static52.anInt1066;
		@Pc(18) int local18 = local16;
		if (arg0 instanceof Class8_Sub2_Sub1) {
			local11 = ((Class8_Sub2_Sub1) arg0).aShort134;
			local18 = ((Class8_Sub2_Sub1) arg0).aShort133;
			local9 = ((Class8_Sub2_Sub1) arg0).aShort131;
			local16 = ((Class8_Sub2_Sub1) arg0).aShort132;
		}
		for (@Pc(39) int local39 = local9; local39 <= local11; local39++) {
			for (@Pc(42) int local42 = local16; local42 <= local18; local42++) {
				if (arg0.aByte143 < Static299.anInt4824 && local39 >= Static441.anInt6691 && local39 < Static77.anInt1613 && local42 >= Static220.anInt3562 && local42 < Static692.anInt10370) {
					if ((arg2 == null || arg0.aByte144 < arg3 || arg2[arg0.aByte144][local39][local42] != arg4) && arg0.method9275() && !arg0.method9284((byte) 59, Static665.aClass19_15)) {
						return false;
					}
					if (!arg1 && local39 >= Static403.anInt6246 - 16 && local39 <= Static403.anInt6246 + 16 && local42 >= Static550.anInt8271 - 16 && local42 <= Static550.anInt8271 + 16) {
						if (Static661.aBoolean457) {
							Static684.aClass302Array1[Static29.anInt702++].method6809(arg0);
							Static29.anInt702 %= Static549.anInt9424;
						} else {
							arg0.method9289(Static665.aClass19_15, -5);
						}
					}
				}
			}
		}
		return true;
	}
}
