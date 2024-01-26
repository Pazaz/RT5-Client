import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public static int anInt2178;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_45 = new Class225(33, -2);

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!hda;")
	public static Class158 aClass158_3 = null;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!eo;)V")
	public static void method2068(@OriginalArg(0) Class8_Sub2 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
			@Pc(8) Class8_Sub2 local8 = null;
			for (@Pc(12) Class8_Sub2 local12 = Static576.aClass8_Sub2Array9[local5]; local12 != null; local12 = local12.aClass8_Sub2_25) {
				if (local12 == arg0) {
					if (local8 == null) {
						Static576.aClass8_Sub2Array9[local5] = local12.aClass8_Sub2_25;
					} else {
						local8.aClass8_Sub2_25 = local12.aClass8_Sub2_25;
					}
					Static75.aBoolean521 = true;
					return;
				}
				local8 = local12;
			}
			local8 = null;
			for (@Pc(47) Class8_Sub2 local47 = Static398.aClass8_Sub2Array7[local5]; local47 != null; local47 = local47.aClass8_Sub2_25) {
				if (local47 == arg0) {
					if (local8 == null) {
						Static398.aClass8_Sub2Array7[local5] = local47.aClass8_Sub2_25;
					} else {
						local8.aClass8_Sub2_25 = local47.aClass8_Sub2_25;
					}
					Static75.aBoolean521 = true;
					return;
				}
				local8 = local47;
			}
			local8 = null;
			for (@Pc(82) Class8_Sub2 local82 = Static468.aClass8_Sub2Array10[local5]; local82 != null; local82 = local82.aClass8_Sub2_25) {
				if (local82 == arg0) {
					if (local8 == null) {
						Static468.aClass8_Sub2Array10[local5] = local82.aClass8_Sub2_25;
					} else {
						local8.aClass8_Sub2_25 = local82.aClass8_Sub2_25;
					}
					Static75.aBoolean521 = true;
					return;
				}
				local8 = local82;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZIII)Lclient!sb;")
	public static Class330 method2069(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class9 local5 = null;
		if (Static172.aClass243_4 != null) {
			local5 = new Class9(arg1, Static172.aClass243_4, Static208.aClass243Array1[arg1], 1000000);
		}
		Static226.aClass47_Sub1Array8[arg1] = Static228.aClass262_1.method5801(local5, arg1, Static276.aClass9_1);
		Static226.aClass47_Sub1Array8[arg1].method6654();
		return new Class330(Static226.aClass47_Sub1Array8[arg1], arg0, arg2);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)Z")
	public static boolean method2070(@OriginalArg(0) int arg0) {
		return arg0 == 11 || arg0 == 12 || arg0 == 13;
	}
}
