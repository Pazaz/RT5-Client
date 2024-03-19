import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
	public static int anInt3170 = 16777215;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "[I")
	public static final int[] anIntArray234 = new int[32];

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
	public static void method2688() {
		if (Static277.anInt5863 == 0) {
			return;
		}
		try {
			if (++Static45.anInt1471 > 2000) {
				if (Static31.aClass42_1 != null) {
					Static31.aClass42_1.method1271();
					Static31.aClass42_1 = null;
				}
				if (Static155.anInt3855 >= 1) {
					Static152.anInt3743 = -5;
					Static277.anInt5863 = 0;
					return;
				}
				Static277.anInt5863 = 1;
				Static155.anInt3855++;
				if (Static56.anInt1631 == Static272.anInt5743) {
					Static272.anInt5743 = Static124.anInt3119;
				} else {
					Static272.anInt5743 = Static56.anInt1631;
				}
				Static45.anInt1471 = 0;
			}
			if (Static277.anInt5863 == 1) {
				Static18.aClass145_1 = Static184.aClass199_12.method5471(Static300.aString235, Static272.anInt5743);
				Static277.anInt5863 = 2;
			}
			@Pc(121) int local121;
			if (Static277.anInt5863 == 2) {
				if (Static18.aClass145_1.anInt5065 == 2) {
					throw new IOException();
				}
				if (Static18.aClass145_1.anInt5065 != 1) {
					return;
				}
				Static31.aClass42_1 = new Class42((Socket) Static18.aClass145_1.anObject6, Static184.aClass199_12);
				Static18.aClass145_1 = null;
				Static31.aClass42_1.method1273(Static150.aClass1_Sub16_Sub2_2.anInt6813, Static150.aClass1_Sub16_Sub2_2.aByteArray86);
				if (Static305.aClass37_2 != null) {
					Static305.aClass37_2.method5865();
				}
				if (Static37.aClass37_1 != null) {
					Static37.aClass37_1.method5865();
				}
				local121 = Static31.aClass42_1.method1263();
				if (Static305.aClass37_2 != null) {
					Static305.aClass37_2.method5865();
				}
				if (Static37.aClass37_1 != null) {
					Static37.aClass37_1.method5865();
				}
				if (local121 != 21) {
					Static152.anInt3743 = local121;
					Static277.anInt5863 = 0;
					Static31.aClass42_1.method1271();
					Static31.aClass42_1 = null;
					return;
				}
				Static277.anInt5863 = 3;
			}
			if (Static277.anInt5863 == 3) {
				if (Static31.aClass42_1.method1269() < 1) {
					return;
				}
				Static41.aStringArray10 = new String[Static31.aClass42_1.method1263()];
				Static277.anInt5863 = 4;
			}
			if (Static277.anInt5863 == 4 && Static31.aClass42_1.method1269() >= Static41.aStringArray10.length * 8) {
				Static299.aClass1_Sub16_Sub2_3.anInt6813 = 0;
				Static31.aClass42_1.method1270(0, Static299.aClass1_Sub16_Sub2_3.aByteArray86, Static41.aStringArray10.length * 8);
				for (local121 = 0; local121 < Static41.aStringArray10.length; local121++) {
					Static41.aStringArray10[local121] = Static7.method227(Static299.aClass1_Sub16_Sub2_3.method5784());
				}
				Static277.anInt5863 = 0;
				Static152.anInt3743 = 21;
				Static31.aClass42_1.method1271();
				Static31.aClass42_1 = null;
			}
		} catch (@Pc(231) IOException local231) {
			if (Static31.aClass42_1 != null) {
				Static31.aClass42_1.method1271();
				Static31.aClass42_1 = null;
			}
			if (Static155.anInt3855 < 1) {
				Static277.anInt5863 = 1;
				Static45.anInt1471 = 0;
				Static155.anInt3855++;
				if (Static272.anInt5743 == Static56.anInt1631) {
					Static272.anInt5743 = Static124.anInt3119;
				} else {
					Static272.anInt5743 = Static56.anInt1631;
				}
			} else {
				Static152.anInt3743 = -4;
				Static277.anInt5863 = 0;
			}
		}
	}
}
