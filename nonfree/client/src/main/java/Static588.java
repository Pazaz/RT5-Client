import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	public static int anInt8690;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
	public static int anInt8692 = -1;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZZ)Z")
	public static boolean method7712(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public static void method7713() {
		Static425.aClass19_13.xa(((float) Static400.aClass2_Sub34_28.aClass57_Sub22_1.method6769() * 0.1F + 0.7F) * Static318.aFloat210);
		Static425.aClass19_13.ZA(Static448.anInt6801, Static688.aFloat216, Static683.aFloat215, (float) (Static344.anInt5617 << 2), (float) (Static417.anInt6400 << 2), (float) (Static331.anInt5441 << 2));
		Static425.aClass19_13.method7973(Static425.aClass67_6);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZIII)Z")
	public static boolean method7714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static18.aBoolean20 || !Static29.aBoolean60) {
			return false;
		} else if (Static432.anInt525 < 100) {
			return false;
		} else {
			@Pc(37) int local37 = Static446.anIntArrayArrayArray9[arg1][arg2][arg0];
			if (-Static675.anInt10155 == local37) {
				return false;
			} else if (Static675.anInt10155 == local37) {
				return true;
			} else if (Static693.aClass178Array2 == Static246.aClass178Array1) {
				return false;
			} else {
				@Pc(64) int local64 = arg2 << Static52.anInt1066;
				@Pc(68) int local68 = arg0 << Static52.anInt1066;
				if (Static172.method2674(local64 + Static340.anInt5586 - 1, local68 + 1, Static246.aClass178Array1[arg1].method7869(arg0 + 1, arg2 + 1), Static246.aClass178Array1[arg1].method7869(arg0 + 1, arg2), Static246.aClass178Array1[arg1].method7869(arg0, arg2), local68 + Static340.anInt5586 - 1, Static340.anInt5586 + local68 + -1, local64 + 1, local64 + 1) && Static172.method2674(Static340.anInt5586 + local64 - 1, local68 + 1, Static246.aClass178Array1[arg1].method7869(arg0, arg2 + 1), Static246.aClass178Array1[arg1].method7869(arg0 + 1, arg2 + 1), Static246.aClass178Array1[arg1].method7869(arg0, arg2), local68 + 1, Static340.anInt5586 + local68 + -1, local64 + 1, Static340.anInt5586 + -1 + local64)) {
					Static298.anInt4811++;
					Static446.anIntArrayArrayArray9[arg1][arg2][arg0] = Static675.anInt10155;
					return true;
				} else {
					Static446.anIntArrayArrayArray9[arg1][arg2][arg0] = -Static675.anInt10155;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)J")
	public static synchronized long method7715() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static278.aLong144 > local5) {
			Static672.aLong305 += Static278.aLong144 - local5;
		}
		Static278.aLong144 = local5;
		return local5 + Static672.aLong305;
	}
}
