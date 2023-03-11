import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	public static int anInt3837;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_147 = new Class145(54, 8);

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "[I")
	public static final int[] anIntArray234 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)V")
	public static void method3809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1008) {
			Static198.method3596(Static138.aClass16_3, arg0, arg2);
		} else if (arg1 == 1002) {
			Static198.method3596(Static192.aClass16_5, arg0, arg2);
		} else if (arg1 == 1012) {
			Static198.method3596(Static250.aClass16_6, arg0, arg2);
		} else if (arg1 == 1003) {
			Static198.method3596(Static320.aClass16_8, arg0, arg2);
		} else if (arg1 == 1007) {
			Static198.method3596(Static135.aClass16_2, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)Lclient!jg;")
	public static Class2_Sub20 method3829() {
		if (Static344.aClass135_36 == null || Static116.aClass75_1 == null) {
			return null;
		}
		for (@Pc(16) Class2_Sub20 local16 = (Class2_Sub20) Static116.aClass75_1.method2178(); local16 != null; local16 = (Class2_Sub20) Static116.aClass75_1.method2178()) {
			@Pc(24) Class164 local24 = Static344.aClass125_4.method3379(local16.anInt2947);
			if (local24 != null && local24.aBoolean302 && local24.method4180(Static344.anInterface11_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3841(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static91.method1960(Static13.aClass145_18);
			Protocol.outboundBuffer.p1(Static27.method872(arg0));
			Protocol.outboundBuffer.method4822(arg0);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[Lclient!nk;I)V")
	public static void method3847(@OriginalArg(0) int arg0, @OriginalArg(1) Class161[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class161 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.anInt4272 == 0) {
					if (local9.aClass161Array2 != null) {
						method3847(arg0, local9.aClass161Array2);
					}
					@Pc(30) Class2_Sub7 local30 = (Class2_Sub7) Static329.aClass4_130.method90((long) local9.anInt4317);
					if (local30 != null) {
						Static392.method6460(local30.anInt1370, arg0);
					}
				}
				@Pc(49) Class2_Sub13 local49;
				if (arg0 == 0 && local9.anObjectArray34 != null) {
					local49 = new Class2_Sub13();
					local49.aClass161_3 = local9;
					local49.anObjectArray4 = local9.anObjectArray34;
					Static198.method3591(local49);
				}
				if (arg0 == 1 && local9.anObjectArray11 != null) {
					if (local9.anInt4297 >= 0) {
						@Pc(75) Class161 local75 = Static6.method140(local9.anInt4317);
						if (local75 == null || local75.aClass161Array2 == null || local75.aClass161Array2.length <= local9.anInt4297 || local75.aClass161Array2[local9.anInt4297] != local9) {
							continue;
						}
					}
					local49 = new Class2_Sub13();
					local49.anObjectArray4 = local9.anObjectArray11;
					local49.aClass161_3 = local9;
					Static198.method3591(local49);
				}
			}
		}
	}
}
