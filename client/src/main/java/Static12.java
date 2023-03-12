import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public static int anInt266;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!jd;")
	public static Sprite aClass13_2;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "[Lclient!nh;")
	public static final Player[] aClass11_Sub5_Sub2_Sub1Array1 = new Player[2048];

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lclient!oj;")
	public static final Class170 aClass170_1 = new Class170(2);

	@OriginalMember(owner = "client!am", name = "g", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!am", name = "h", descriptor = "I")
	public static int anInt269 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BII)V")
	public static void method280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static344.aFloat72 < Static344.aFloat73) {
			Static344.aFloat72 = (float) ((double) Static344.aFloat72 + (double) Static344.aFloat72 / 30.0D);
			if (Static344.aFloat72 > Static344.aFloat73) {
				Static344.aFloat72 = Static344.aFloat73;
			}
			Static298.method2422();
			Static344.anInt6047 = (int) Static344.aFloat72 >> 1;
			Static344.aByteArrayArrayArray15 = Static260.method6018(Static344.anInt6047);
		} else if (Static344.aFloat73 < Static344.aFloat72) {
			Static344.aFloat72 = (float) ((double) Static344.aFloat72 - (double) Static344.aFloat72 / 30.0D);
			if (Static344.aFloat73 > Static344.aFloat72) {
				Static344.aFloat72 = Static344.aFloat73;
			}
			Static298.method2422();
			Static344.anInt6047 = (int) Static344.aFloat72 >> 1;
			Static344.aByteArrayArrayArray15 = Static260.method6018(Static344.anInt6047);
		}
		if (Static238.anInt4328 != -1 && Static77.anInt1763 != -1) {
			@Pc(86) int local86 = Static238.anInt4328 - Static151.anInt2772;
			if (local86 < 2 || local86 > 2) {
				local86 /= 8;
			}
			@Pc(103) int local103 = Static77.anInt1763 - Static96.anInt2003;
			Static151.anInt2772 += local86;
			if (local103 < 2 || local103 > 2) {
				local103 /= 8;
			}
			Static96.anInt2003 += local103;
			if (local86 == 0 && local103 == 0) {
				Static238.anInt4328 = -1;
				Static77.anInt1763 = -1;
			}
			Static298.method2422();
		}
		if (Static243.anInt4495 <= 0) {
			Static225.anInt3979 = -1;
			Static236.anInt4301 = -1;
		} else {
			Static90.anInt6637--;
			if (Static90.anInt6637 == 0) {
				Static90.anInt6637 = 100;
				Static243.anInt4495--;
			}
		}
		if (!Static206.aBoolean242 || Static197.aClass135_24 == null) {
			return;
		}
		for (@Pc(170) Class2_Sub15 local170 = (Class2_Sub15) Static197.aClass135_24.head(); local170 != null; local170 = (Class2_Sub15) Static197.aClass135_24.next()) {
			@Pc(179) Class164 local179 = Static344.aClass125_4.method3379(local170.aClass2_Sub20_1.anInt2947);
			if (local170.method2357(arg0, arg1)) {
				if (local179.aStringArray41 != null) {
					if (local179.aStringArray41[4] != null) {
						Static1.method3(-1, true, 0, false, local179.aStringArray41[4], local179.anInt4424, 1007, local179.aString49, -1, (long) local170.aClass2_Sub20_1.anInt2947);
					}
					if (local179.aStringArray41[3] != null) {
						Static1.method3(-1, true, 0, false, local179.aStringArray41[3], local179.anInt4424, 1003, local179.aString49, -1, (long) local170.aClass2_Sub20_1.anInt2947);
					}
					if (local179.aStringArray41[2] != null) {
						Static1.method3(-1, true, 0, false, local179.aStringArray41[2], local179.anInt4424, 1012, local179.aString49, -1, (long) local170.aClass2_Sub20_1.anInt2947);
					}
					if (local179.aStringArray41[1] != null) {
						Static1.method3(-1, true, 0, false, local179.aStringArray41[1], local179.anInt4424, 1002, local179.aString49, -1, (long) local170.aClass2_Sub20_1.anInt2947);
					}
					if (local179.aStringArray41[0] != null) {
						Static1.method3(-1, true, 0, false, local179.aStringArray41[0], local179.anInt4424, 1008, local179.aString49, -1, (long) local170.aClass2_Sub20_1.anInt2947);
					}
				}
				if (!local170.aClass2_Sub20_1.aBoolean207) {
					local170.aClass2_Sub20_1.aBoolean207 = true;
					Static198.method3596(Static383.aClass16_9, local170.aClass2_Sub20_1.anInt2947, local179.anInt4424);
				}
				if (local170.aClass2_Sub20_1.aBoolean207) {
					Static198.method3596(Static309.aClass16_7, local170.aClass2_Sub20_1.anInt2947, local179.anInt4424);
				}
			} else if (local170.aClass2_Sub20_1.aBoolean207) {
				local170.aClass2_Sub20_1.aBoolean207 = false;
				Static198.method3596(Static3.aClass16_1, local170.aClass2_Sub20_1.anInt2947, local179.anInt4424);
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public static void method282() {
		for (@Pc(10) Class2_Sub19 local10 = (Class2_Sub19) Static83.aClass135_14.head(); local10 != null; local10 = (Class2_Sub19) Static83.aClass135_14.next()) {
			if (local10.aBoolean204) {
				local10.method2941();
			}
		}
		for (@Pc(30) Class2_Sub19 local30 = (Class2_Sub19) Static363.aClass135_39.head(); local30 != null; local30 = (Class2_Sub19) Static363.aClass135_39.next()) {
			if (local30.aBoolean204) {
				local30.method2941();
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Lclient!gq;")
	public static Class11_Sub1 method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static330.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_3;
	}
}
