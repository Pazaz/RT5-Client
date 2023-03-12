import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "Lclient!r;")
	public static Js5 aClass197_80;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "Lclient!hi;")
	public static final Class93 aClass93_1 = Static172.method3291();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZIIB)V")
	public static void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(21) int local21 = arg1 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(44) int local44 = local21 * (Static258.aShort78 - Static254.aShort73) / 100 + Static254.aShort73;
		if (Static78.aShort86 > local44) {
			local44 = Static78.aShort86;
		} else if (local44 > Static120.aShort35) {
			local44 = Static120.aShort35;
		}
		@Pc(70) int local70 = arg1 * 512 * local44 / (arg3 * 334);
		@Pc(111) int local111;
		@Pc(118) int local118;
		@Pc(86) short local86;
		if (Static353.aShort92 > local70) {
			local86 = Static353.aShort92;
			local44 = arg3 * 334 * local86 / (arg1 * 512);
			if (local44 > Static120.aShort35) {
				local44 = Static120.aShort35;
				local111 = arg1 * local44 * 512 / (local86 * 334);
				local118 = (arg3 - local111) / 2;
				if (arg2) {
					Static190.aClass19_8.method2898();
					Static190.aClass19_8.method2868(arg1, arg0, arg4, -16777216, local118);
					Static190.aClass19_8.method2868(arg1, arg0 + arg3 - local118, arg4, -16777216, local118);
				}
				arg3 -= local118 * 2;
				arg0 += local118;
			}
		} else if (local70 > Static68.aShort19) {
			local86 = Static68.aShort19;
			local44 = local86 * 334 * arg3 / (arg1 * 512);
			if (Static78.aShort86 > local44) {
				local44 = Static78.aShort86;
				local111 = arg3 * 334 * local86 / (local44 * 512);
				local118 = (arg1 - local111) / 2;
				if (arg2) {
					Static190.aClass19_8.method2898();
					Static190.aClass19_8.method2868(local118, arg0, arg4, -16777216, arg3);
					Static190.aClass19_8.method2868(local118, arg0, arg4 + arg1 - local118, -16777216, arg3);
				}
				arg1 -= local118 * 2;
				arg4 += local118;
			}
		}
		Static235.anInt3368 = arg0;
		Static375.anInt7051 = arg4;
		Static155.anInt2808 = (short) arg3;
		Static320.anInt6006 = local44 * arg1 / 334;
		Static180.anInt3408 = (short) arg1;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	public static void method5274() {
		for (@Pc(10) Class2_Sub37 local10 = (Class2_Sub37) Static207.aClass135_26.head(); local10 != null; local10 = (Class2_Sub37) Static207.aClass135_26.next()) {
			if (local10.anInt6485 > 0) {
				local10.anInt6485--;
			}
			if (local10.anInt6485 != 0) {
				if (local10.anInt6488 > 0) {
					local10.anInt6488--;
				}
				if (local10.anInt6488 == 0 && local10.anInt6484 >= 1 && local10.anInt6486 >= 1 && Static373.anInt7033 - 2 >= local10.anInt6484 && Static242.anInt4449 - 2 >= local10.anInt6486 && (local10.anInt6480 < 0 || Static287.method4931(local10.anInt6480, local10.anInt6479))) {
					Static79.method1871(local10.anInt6481, local10.anInt6484, local10.anInt6480, local10.anInt6494, local10.anInt6491, -1, local10.anInt6479, local10.anInt6486);
					local10.anInt6488 = -1;
					if (local10.anInt6480 == local10.anInt6492 && local10.anInt6492 == -1) {
						local10.unlink();
					} else if (local10.anInt6480 == local10.anInt6492 && local10.anInt6493 == local10.anInt6494 && local10.anInt6482 == local10.anInt6479) {
						local10.unlink();
					}
				}
			} else if (local10.anInt6492 < 0 || Static287.method4931(local10.anInt6492, local10.anInt6482)) {
				Static79.method1871(local10.anInt6481, local10.anInt6484, local10.anInt6492, local10.anInt6493, local10.anInt6491, -1, local10.anInt6482, local10.anInt6486);
				local10.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!bt;I)Ljava/lang/String;")
	public static String method5276(@OriginalArg(0) Buffer arg0) {
		return Static120.method2384(arg0);
	}
}
