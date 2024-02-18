import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString34;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fn", name = "n", descriptor = "Ljava/lang/Class;")
	private static Class aClass8;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "Lclient!fba;")
	public static final Class121 aClass121_3 = new Class121();

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_35 = new Class345(0, 7);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ha;IIIIIIII)V")
	public static void method2814(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Interface25 local9 = (Interface25) Static302.method4414(arg6, arg2, arg3);
		@Pc(20) Class54 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(45) int local45;
		if (local9 != null) {
			local20 = Static354.aClass142_4.method3063(local9.method6859(-32136), 37);
			local26 = local9.method6855(23796) & 0x3;
			local30 = local9.method6858();
			if (local20.anInt1239 == -1) {
				local45 = arg1;
				if (local20.anInt1271 > 0) {
					local45 = arg7;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg0.method7998(4, arg5, local45, arg4);
					} else if (local26 == 1) {
						arg0.method7991(arg5, local45, arg4, 4);
					} else if (local26 == 2) {
						arg0.method7998(4, arg5, local45, arg4 + 3);
					} else if (local26 == 3) {
						arg0.method7991(arg5 + 3, local45, arg4, 4);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg0.method7971(1, 1, arg5, arg4, local45);
					} else if (local26 == 1) {
						arg0.method7971(1, 1, arg5, arg4 + 3, local45);
					} else if (local26 == 2) {
						arg0.method7971(1, 1, arg5 + 3, arg4 + 3, local45);
					} else if (local26 == 3) {
						arg0.method7971(1, 1, arg5 + 3, arg4, local45);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg0.method7991(arg5, local45, arg4, 4);
					} else if (local26 == 1) {
						arg0.method7998(4, arg5, local45, arg4 + 3);
					} else if (local26 == 2) {
						arg0.method7991(arg5 + 3, local45, arg4, 4);
					} else if (local26 == 3) {
						arg0.method7998(4, arg5, local45, arg4);
					}
				}
			} else {
				Static452.method6173(local20, local26, arg0, arg4, arg5);
			}
		}
		local9 = (Interface25) Static578.method7623(arg6, arg2, arg3, aClass8 == null ? (aClass8 = getClass("Interface25")) : aClass8);
		if (local9 != null) {
			local20 = Static354.aClass142_4.method3063(local9.method6859(-32136), 61);
			local26 = local9.method6855(23796) & 0x3;
			local30 = local9.method6858();
			if (local20.anInt1239 != -1) {
				Static452.method6173(local20, local26, arg0, arg4, arg5);
			} else if (local30 == 9) {
				local45 = -1118482;
				if (local20.anInt1271 > 0) {
					local45 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg0.method7954(arg5, arg5 + 3, arg4 + 3, local45, arg4);
				} else {
					arg0.method7954(arg5 + 3, arg5, arg4 + 3, local45, arg4);
				}
			}
		}
		local9 = (Interface25) Static687.method8959(arg6, arg2, arg3);
		if (local9 == null) {
			return;
		}
		local20 = Static354.aClass142_4.method3063(local9.method6859(-32136), 106);
		local26 = local9.method6855(23796) & 0x3;
		if (local20.anInt1239 != -1) {
			Static452.method6173(local20, local26, arg0, arg4, arg5);
			return;
		}
	}

	static Class getClass(String name) {
		Class instance;
		try {
			instance = Class.forName(name);
		} catch (ClassNotFoundException ex) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(ex);
		}
		return instance;
	}
}
