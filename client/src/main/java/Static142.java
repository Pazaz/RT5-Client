import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!r;")
	public static Class197 aClass197_37;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	public static int anInt2663;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_21 = new Class135();

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!h;")
	public static final Class89 aClass89_110 = new Class89(8, 2);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static359.aByteArrayArrayArray16[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static359.aByteArrayArrayArray16[arg2][arg3][arg0] & 0x10) == 0) {
			return Static280.method4767(arg0, arg3, arg2) == arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method2662() {
		Static316.aClass5_1.method4408();
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			Static357.aLongArray12[local12] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static292.aLongArray9[local24] = 0L;
		}
		Static10.anInt247 = 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method2663() {
		if (Static141.anInt2652 == 0) {
			return;
		}
		try {
			if (++Static327.anInt6109 > 2000) {
				if (Static335.aClass111_4 != null) {
					Static335.aClass111_4.method2799();
					Static335.aClass111_4 = null;
				}
				if (Static66.anInt1625 >= 1) {
					Static318.anInt5968 = -5;
					Static141.anInt2652 = 0;
					return;
				}
				Static327.anInt6109 = 0;
				if (Static16.anInt4758 == Static85.anInt1843) {
					Static85.anInt1843 = Static330.anInt6193;
				} else {
					Static85.anInt1843 = Static16.anInt4758;
				}
				Static141.anInt2652 = 1;
				Static66.anInt1625++;
			}
			if (Static141.anInt2652 == 1) {
				Static5.aClass32_1 = Static328.aClass152_5.openSocket(Static216.aString36, Static85.anInt1843);
				Static141.anInt2652 = 2;
			}
			@Pc(119) int local119;
			if (Static141.anInt2652 == 2) {
				if (Static5.aClass32_1.status == 2) {
					throw new IOException();
				}
				if (Static5.aClass32_1.status != 1) {
					return;
				}
				Static335.aClass111_4 = new Class111((Socket) Static5.aClass32_1.result, Static328.aClass152_5);
				Static5.aClass32_1 = null;
				Static335.aClass111_4.method2797(Static257.aClass2_Sub4_Sub2_4.anInt5300, Static257.aClass2_Sub4_Sub2_4.aByteArray73);
				if (Static303.aClass221_2 != null) {
					Static303.aClass221_2.method6325();
				}
				if (Static190.aClass221_1 != null) {
					Static190.aClass221_1.method6325();
				}
				local119 = Static335.aClass111_4.method2800();
				if (Static303.aClass221_2 != null) {
					Static303.aClass221_2.method6325();
				}
				if (Static190.aClass221_1 != null) {
					Static190.aClass221_1.method6325();
				}
				if (local119 != 21) {
					Static318.anInt5968 = local119;
					Static141.anInt2652 = 0;
					Static335.aClass111_4.method2799();
					Static335.aClass111_4 = null;
					return;
				}
				Static141.anInt2652 = 3;
			}
			if (Static141.anInt2652 == 3) {
				if (Static335.aClass111_4.method2795() < 1) {
					return;
				}
				Static163.aStringArray23 = new String[Static335.aClass111_4.method2800()];
				Static141.anInt2652 = 4;
			}
			if (Static141.anInt2652 == 4 && Static335.aClass111_4.method2795() >= Static163.aStringArray23.length * 8) {
				Static212.aClass2_Sub4_Sub2_3.anInt5300 = 0;
				Static335.aClass111_4.method2793(Static212.aClass2_Sub4_Sub2_3.aByteArray73, Static163.aStringArray23.length * 8, 0);
				for (local119 = 0; local119 < Static163.aStringArray23.length; local119++) {
					Static163.aStringArray23[local119] = Static202.method3676(Static212.aClass2_Sub4_Sub2_3.method4798());
				}
				Static141.anInt2652 = 0;
				Static318.anInt5968 = 21;
				Static335.aClass111_4.method2799();
				Static335.aClass111_4 = null;
			}
		} catch (@Pc(219) IOException local219) {
			if (Static335.aClass111_4 != null) {
				Static335.aClass111_4.method2799();
				Static335.aClass111_4 = null;
			}
			if (Static66.anInt1625 >= 1) {
				Static141.anInt2652 = 0;
				Static318.anInt5968 = -4;
			} else {
				Static327.anInt6109 = 0;
				Static141.anInt2652 = 1;
				Static66.anInt1625++;
				if (Static16.anInt4758 == Static85.anInt1843) {
					Static85.anInt1843 = Static330.anInt6193;
				} else {
					Static85.anInt1843 = Static16.anInt4758;
				}
			}
		}
	}
}
