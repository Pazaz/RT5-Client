import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	public static int anInt5198;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	public static int anInt5202;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
	public static final int[] anIntArray385 = new int[4096];

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public static final int anInt5201 = 50;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	public static int method4432() {
		try {
			if (Static97.anInt2479 == 0) {
				if (Static143.aLong104 > Static325.method5658() - 5000L) {
					return 0;
				}
				Static169.aClass145_6 = Static184.aClass199_12.method5471(Static64.aString62, Static237.anInt5290);
				Static273.aLong178 = Static325.method5658();
				Static97.anInt2479 = 1;
			}
			if (Static273.aLong178 + 30000L < Static325.method5658()) {
				return Static158.method3383(1000);
			}
			@Pc(81) int local81;
			@Pc(118) int local118;
			if (Static97.anInt2479 == 1) {
				if (Static169.aClass145_6.anInt5065 == 2) {
					return Static158.method3383(1001);
				}
				if (Static169.aClass145_6.anInt5065 != 1) {
					return -1;
				}
				Static31.aClass42_1 = new Class42((Socket) Static169.aClass145_6.anObject6, Static184.aClass199_12);
				Static169.aClass145_6 = null;
				local81 = 0;
				if (Static29.aBoolean461) {
					local81 = Static148.anInt3661;
				}
				Static150.aClass1_Sub16_Sub2_2.anInt6813 = 0;
				Static150.aClass1_Sub16_Sub2_2.method5771(23);
				Static150.aClass1_Sub16_Sub2_2.method5768(local81);
				Static31.aClass42_1.method1273(Static150.aClass1_Sub16_Sub2_2.anInt6813, Static150.aClass1_Sub16_Sub2_2.aByteArray86);
				if (Static305.aClass37_2 != null) {
					Static305.aClass37_2.method5865();
				}
				if (Static37.aClass37_1 != null) {
					Static37.aClass37_1.method5865();
				}
				local118 = Static31.aClass42_1.method1263();
				if (Static305.aClass37_2 != null) {
					Static305.aClass37_2.method5865();
				}
				if (Static37.aClass37_1 != null) {
					Static37.aClass37_1.method5865();
				}
				if (local118 != 0) {
					return Static158.method3383(local118);
				}
				Static97.anInt2479 = 2;
			}
			if (Static97.anInt2479 == 2) {
				if (Static31.aClass42_1.method1269() < 2) {
					return -1;
				}
				Static264.anInt5614 = Static31.aClass42_1.method1263();
				Static264.anInt5614 <<= 0x8;
				Static264.anInt5614 += Static31.aClass42_1.method1263();
				Static97.anInt2479 = 3;
				Static69.aByteArray11 = new byte[Static264.anInt5614];
				Static212.anInt7376 = 0;
			}
			if (Static97.anInt2479 != 3) {
				return -1;
			}
			local81 = Static31.aClass42_1.method1269();
			if (local81 < 1) {
				return -1;
			}
			if (Static264.anInt5614 - Static212.anInt7376 < local81) {
				local81 = Static264.anInt5614 - Static212.anInt7376;
			}
			Static31.aClass42_1.method1270(Static212.anInt7376, Static69.aByteArray11, local81);
			Static212.anInt7376 += local81;
			if (Static212.anInt7376 < Static264.anInt5614) {
				return -1;
			} else if (Static153.method3287(Static69.aByteArray11)) {
				Static323.aClass27_Sub1Array2 = new Class27_Sub1[Static141.anInt3505];
				local118 = 0;
				for (@Pc(230) int local230 = Static181.anInt4291; local230 <= Static340.anInt7186; local230++) {
					@Pc(236) Class27_Sub1 local236 = Static94.method2020(local230);
					if (local236 != null) {
						Static323.aClass27_Sub1Array2[local118++] = local236;
					}
				}
				Static290.aClass1_Sub32_1 = null;
				Static266.anInt5651 = 0;
				Static31.aClass42_1.method1271();
				Static221.anInt5015 = 0;
				Static31.aClass42_1 = null;
				Static97.anInt2479 = 0;
				Static69.aByteArray11 = null;
				Static143.aLong104 = Static325.method5658();
				return 0;
			} else {
				return Static158.method3383(1002);
			}
		} catch (@Pc(268) IOException local268) {
			return Static158.method3383(1003);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public static void method4435() {
		if (Static222.anInt5043 == 0) {
			return;
		}
		try {
			if (++Static266.anInt5647 > 1500) {
				if (Static31.aClass42_1 != null) {
					Static31.aClass42_1.method1271();
					Static31.aClass42_1 = null;
				}
				if (Static250.anInt5421 >= 1) {
					Static222.anInt5043 = 0;
					Static6.anInt211 = -5;
					return;
				}
				Static250.anInt5421++;
				if (Static353.anInt7369 == Static237.anInt5290) {
					Static237.anInt5290 = Static146.anInt3618;
				} else {
					Static237.anInt5290 = Static353.anInt7369;
				}
				Static266.anInt5647 = 0;
				Static222.anInt5043 = 1;
			}
			if (Static222.anInt5043 == 1) {
				Static18.aClass145_1 = Static184.aClass199_12.method5471(Static64.aString62, Static237.anInt5290);
				Static222.anInt5043 = 2;
			}
			@Pc(119) int local119;
			if (Static222.anInt5043 == 2) {
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
				local119 = Static31.aClass42_1.method1263();
				if (Static305.aClass37_2 != null) {
					Static305.aClass37_2.method5865();
				}
				if (Static37.aClass37_1 != null) {
					Static37.aClass37_1.method5865();
				}
				if (local119 != 101) {
					Static6.anInt211 = local119;
					Static222.anInt5043 = 0;
					Static31.aClass42_1.method1271();
					Static31.aClass42_1 = null;
					return;
				}
				Static222.anInt5043 = 3;
			}
			if (Static222.anInt5043 == 3 && Static31.aClass42_1.method1269() >= 2) {
				local119 = Static31.aClass42_1.method1263() << 8 | Static31.aClass42_1.method1263();
				Static282.method5037(local119);
				if (Static154.anInt3814 == -1) {
					Static6.anInt211 = 6;
					Static222.anInt5043 = 0;
					Static31.aClass42_1.method1271();
					Static31.aClass42_1 = null;
				} else {
					Static222.anInt5043 = 0;
					Static31.aClass42_1.method1271();
					Static31.aClass42_1 = null;
					Static245.method2661();
				}
			}
		} catch (@Pc(201) IOException local201) {
			if (Static31.aClass42_1 != null) {
				Static31.aClass42_1.method1271();
				Static31.aClass42_1 = null;
			}
			if (Static250.anInt5421 >= 1) {
				Static222.anInt5043 = 0;
				Static6.anInt211 = -4;
			} else {
				Static266.anInt5647 = 0;
				if (Static237.anInt5290 == Static353.anInt7369) {
					Static237.anInt5290 = Static146.anInt3618;
				} else {
					Static237.anInt5290 = Static353.anInt7369;
				}
				Static222.anInt5043 = 1;
				Static250.anInt5421++;
			}
		}
	}
}
