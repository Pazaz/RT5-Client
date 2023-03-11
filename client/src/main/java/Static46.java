import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	public static void method1421() {
		Static57.aClass161Array1 = null;
		Static199.method5246(0, Static172.anInt3299, Static250.anInt4665, Static139.anInt2595, -1, 0, 0, 0);
		if (Static57.aClass161Array1 != null) {
			Static201.method3653(Static172.anInt3299, -1412584499, Static57.aClass161Array1, 0, Static253.anInt4689, 0, Static250.anInt4665, Static301.aClass161_13.anInt4257, Static48.anInt1256);
			Static57.aClass161Array1 = null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!wm;Lclient!nk;)V")
	public static void method1422(@OriginalArg(1) Class19 arg0, @OriginalArg(2) Class161 arg1) {
		@Pc(31) boolean local31 = Static313.aClass107_2.method2758(arg1.anInt4306, arg1.anInt4300, arg1.aBoolean280 ? Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1 : null, arg0, arg1.anInt4252 | 0xFF000000, arg1.anInt4279, arg1.anInt4240) == null;
		if (local31) {
			Static142.aClass135_21.method3540(new Class2_Sub17(arg1.anInt4300, arg1.anInt4240, arg1.anInt4279, arg1.anInt4252 | 0xFF000000, arg1.anInt4306, arg1.aBoolean280));
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Z")
	public static boolean method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static66.anInt1622; local1++) {
			@Pc(6) Class58 local6 = Static183.aClass58Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1690 == 1) {
				local15 = local6.anInt1699 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1686 + (local6.anInt1701 * local15 >> 8);
					local37 = local6.anInt1692 + (local6.anInt1685 * local15 >> 8);
					local47 = local6.anInt1697 + (local6.anInt1698 * local15 >> 8);
					local57 = local6.anInt1703 + (local6.anInt1702 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1690 == 2) {
				local15 = arg0 - local6.anInt1699;
				if (local15 > 0) {
					local27 = local6.anInt1686 + (local6.anInt1701 * local15 >> 8);
					local37 = local6.anInt1692 + (local6.anInt1685 * local15 >> 8);
					local47 = local6.anInt1697 + (local6.anInt1698 * local15 >> 8);
					local57 = local6.anInt1703 + (local6.anInt1702 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1690 == 3) {
				local15 = local6.anInt1686 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1699 + (local6.anInt1693 * local15 >> 8);
					local37 = local6.anInt1695 + (local6.anInt1704 * local15 >> 8);
					local47 = local6.anInt1697 + (local6.anInt1698 * local15 >> 8);
					local57 = local6.anInt1703 + (local6.anInt1702 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1690 == 4) {
				local15 = arg2 - local6.anInt1686;
				if (local15 > 0) {
					local27 = local6.anInt1699 + (local6.anInt1693 * local15 >> 8);
					local37 = local6.anInt1695 + (local6.anInt1704 * local15 >> 8);
					local47 = local6.anInt1697 + (local6.anInt1698 * local15 >> 8);
					local57 = local6.anInt1703 + (local6.anInt1702 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1690 == 5) {
				local15 = arg1 - local6.anInt1697;
				if (local15 > 0) {
					local27 = local6.anInt1699 + (local6.anInt1693 * local15 >> 8);
					local37 = local6.anInt1695 + (local6.anInt1704 * local15 >> 8);
					local47 = local6.anInt1686 + (local6.anInt1701 * local15 >> 8);
					local57 = local6.anInt1692 + (local6.anInt1685 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
