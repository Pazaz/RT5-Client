import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!qka", name = "f", descriptor = "Lclient!lja;")
	public static Class229 aClass229_3;

	@OriginalMember(owner = "client!qka", name = "i", descriptor = "[Lclient!nba;")
	public static final Class254[] aClass254Array1 = new Class254[8];

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(IBIII)V")
	public static void method7081(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static232.anInt3829 = arg1;
		Static240.anInt3955 = arg2;
		Static275.anInt4424 = arg0;
		Static168.anInt2842 = arg3;
	}

	@OriginalMember(owner = "client!qka", name = "c", descriptor = "(I)V")
	public static void method7083() {
		for (@Pc(15) Class2_Sub2_Sub15 local15 = (Class2_Sub2_Sub15) Static505.aClass339_77.method7699(65280); local15 != null; local15 = (Class2_Sub2_Sub15) Static505.aClass339_77.method7706()) {
			@Pc(20) Class8_Sub2_Sub1_Sub1 local20 = local15.aClass8_Sub2_Sub1_Sub1_1;
			if (Static333.anInt5455 > local20.anInt697) {
				local15.method9457();
				local20.method815();
			} else if (Static333.anInt5455 >= local20.anInt722) {
				local20.method816();
				if (local20.anInt711 > 0) {
					if (Static1.anInt10798 == 3) {
						@Pc(61) Class8_Sub2_Sub1_Sub2 local61 = Static219.aClass236Array1[local20.anInt711 - 1].method5363();
						if (local61 != null && local61.anInt10690 >= 0 && local61.anInt10690 < Static720.anInt10859 * 512 && local61.anInt10694 >= 0 && local61.anInt10694 < Static501.anInt7568 * 512) {
							local20.method813(Static102.method2025(local20.aByte144, -29754, local61.anInt10694, local61.anInt10690) - local20.lb, Static333.anInt5455, local61.anInt10694, local61.anInt10690);
						}
					} else {
						@Pc(130) Class2_Sub45 local130 = (Class2_Sub45) Static18.aClass28_2.method738((long) (local20.anInt711 - 1));
						if (local130 != null) {
							@Pc(135) Class8_Sub2_Sub1_Sub2_Sub2 local135 = local130.aClass8_Sub2_Sub1_Sub2_Sub2_2;
							if (local135.anInt10690 >= 0 && local135.anInt10690 < Static720.anInt10859 * 512 && local135.anInt10694 >= 0 && local135.anInt10694 < Static501.anInt7568 * 512) {
								local20.method813(Static102.method2025(local20.aByte144, -29754, local135.anInt10694, local135.anInt10690) - local20.lb, Static333.anInt5455, local135.anInt10694, local135.anInt10690);
							}
						}
					}
				}
				if (local20.anInt711 < 0) {
					@Pc(193) int local193 = -local20.anInt711 - 1;
					@Pc(198) Class8_Sub2_Sub1_Sub2_Sub1 local198;
					if (local193 == Static312.anInt5000) {
						local198 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2;
					} else {
						local198 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local193];
					}
					if (local198 != null && local198.anInt10690 >= 0 && Static720.anInt10859 * 512 > local198.anInt10690 && local198.anInt10694 >= 0 && Static501.anInt7568 * 512 > local198.anInt10694) {
						local20.method813(Static102.method2025(local20.aByte144, -29754, local198.anInt10694, local198.anInt10690) - local20.lb, Static333.anInt5455, local198.anInt10694, local198.anInt10690);
					}
				}
				local20.method819(Static35.anInt800);
				Static102.method2026(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(III)V")
	public static void method7084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) boolean local23 = Static334.aClass291ArrayArrayArray1[0][arg1][arg2] != null && Static334.aClass291ArrayArrayArray1[0][arg1][arg2].aClass291_1 != null;
		for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
			if (Static334.aClass291ArrayArrayArray1[local25][arg1][arg2] == null) {
				@Pc(47) Class291 local47 = Static334.aClass291ArrayArrayArray1[local25][arg1][arg2] = new Class291(local25);
				if (local23) {
					local47.aByte116++;
				}
			}
		}
	}
}
