import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Lclient!mi;")
	public static Class130 aClass130_7 = new Class130();

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString90 = "Loaded defaults";

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
	public static int anInt2419 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
	public static void method2003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static146.anInt3616 == 1) {
			Static39.aClass29Array3[Static145.anInt3605 / 100].method5845(Static53.anInt1589 - 8, Static259.anInt4929 + -8);
		}
		if (Static146.anInt3616 == 2) {
			Static39.aClass29Array3[Static145.anInt3605 / 100 + 4].method5845(Static53.anInt1589 - 8, Static259.anInt4929 + -8);
		}
		Static318.method5593();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZILjava/lang/String;I)Z")
	public static boolean method2004(@OriginalArg(2) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(71) int local71;
			if (local41 >= '0' && local41 <= '9') {
				local71 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local71 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local71 = local41 - 'W';
			} else {
				return false;
			}
			if (local71 >= 10) {
				return false;
			}
			if (local26) {
				local71 = -local71;
			}
			@Pc(115) int local115 = local71 + local30 * 10;
			if (local30 != local115 / 10) {
				return false;
			}
			local28 = true;
			local30 = local115;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
	public static void method2005() {
		Static9.aClass215_7.method6063(50);
		Static3.aClass215_1.method6063(50);
		Static74.aClass215_31.method6063(50);
		Static134.aClass215_52.method6063(50);
		Static326.aClass215_93.method6063(50);
	}
}
