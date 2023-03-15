import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	public static int anInt3368 = 0;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_72 = new LocalizedString("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)Z")
	public static boolean method3340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface6 local9 = (Interface6) Static12.method283(arg1, arg0, arg2);
		@Pc(19) boolean local19 = true;
		if (local9 != null) {
			local19 = Static306.method5252(local9) & true;
		}
		local9 = (Interface6) Static105.method2207(arg1, arg0, arg2, Interface6.class);
		if (local9 != null) {
			local19 &= Static306.method5252(local9);
		}
		local9 = (Interface6) Static26.method865(arg1, arg0, arg2);
		if (local9 != null) {
			local19 &= Static306.method5252(local9);
		}
		return local19;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIII)I")
	public static int method3344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}
}
