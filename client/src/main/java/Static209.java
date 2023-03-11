import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[200];

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Lclient!jg;")
	public static Class2_Sub20 method3713() {
		if (Static344.aClass135_36 == null || Static116.aClass75_1 == null) {
			return null;
		}
		Static116.aClass75_1.method2180(Static344.aClass135_36);
		@Pc(18) Class2_Sub20 local18 = (Class2_Sub20) Static116.aClass75_1.method2181();
		if (local18 == null) {
			return null;
		} else {
			@Pc(33) Class164 local33 = Static344.aClass125_4.method3379(local18.anInt2947);
			return local33 != null && local33.aBoolean302 && local33.method4180(Static344.anInterface11_2) ? local18 : Static115.method3829();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!wm;Lclient!ci;)V")
	public static void method3714(@OriginalArg(1) Class19 arg0, @OriginalArg(2) Interface2 arg1) {
		if (Static344.aClass2_Sub2_Sub17_3 == null) {
			return;
		}
		if (Static355.anInt6581 < 10) {
			if (!Static344.aClass197_85.method5072(Static344.aClass2_Sub2_Sub17_3.aString67)) {
				Static355.anInt6581 = client.jsArchive23.method5085(Static344.aClass2_Sub2_Sub17_3.aString67) / 10;
				return;
			}
			Static386.method6031();
			Static355.anInt6581 = 10;
		}
		if (Static355.anInt6581 == 10) {
			Static344.anInt6057 = Static344.aClass2_Sub2_Sub17_3.anInt6870 >> 6 << 6;
			Static344.anInt6055 = Static344.aClass2_Sub2_Sub17_3.anInt6863 >> 6 << 6;
			Static344.anInt6056 = (Static344.aClass2_Sub2_Sub17_3.anInt6868 >> 6 << 6) + 64 - Static344.anInt6057;
			Static344.anInt6052 = (Static344.aClass2_Sub2_Sub17_3.anInt6874 >> 6 << 6) + 64 - Static344.anInt6055;
			@Pc(80) int[] local80 = new int[3];
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = -1;
			if (Static344.aClass2_Sub2_Sub17_3.method6145(Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78, local80, Static164.anInt3140 + (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6781 >> 7), Static148.anInt2719 + (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6783 >> 7))) {
				local82 = local80[1] - Static344.anInt6057;
				local84 = local80[2] - Static344.anInt6055;
			}
			if (!Static299.aBoolean399 && local82 >= 0 && Static344.anInt6056 > local82 && local84 >= 0 && Static344.anInt6052 > local84) {
				local84 += (int) (Math.random() * 10.0D) - 5;
				local82 += (int) (Math.random() * 10.0D) - 5;
				Static96.anInt2003 = local84;
				Static151.anInt2772 = local82;
			} else if (Static184.anInt3436 == -1 || Static18.anInt519 == -1) {
				Static344.aClass2_Sub2_Sub17_3.method6151(Static344.aClass2_Sub2_Sub17_3.anInt6872 >> 14 & 0x3FFF, Static344.aClass2_Sub2_Sub17_3.anInt6872 & 0x3FFF, local80);
				Static96.anInt2003 = local80[2] - Static344.anInt6055;
				Static151.anInt2772 = local80[1] - Static344.anInt6057;
			} else {
				Static344.aClass2_Sub2_Sub17_3.method6151(Static184.anInt3436, Static18.anInt519, local80);
				Static18.anInt519 = -1;
				Static184.anInt3436 = -1;
				Static299.aBoolean399 = false;
				if (local80 != null) {
					Static96.anInt2003 = local80[2] - Static344.anInt6055;
					Static151.anInt2772 = local80[1] - Static344.anInt6057;
				}
			}
			if (Static344.aClass2_Sub2_Sub17_3.anInt6875 == 37) {
				Static344.aFloat72 = 3.0F;
				Static344.aFloat73 = 3.0F;
			} else if (Static344.aClass2_Sub2_Sub17_3.anInt6875 == 50) {
				Static344.aFloat72 = 4.0F;
				Static344.aFloat73 = 4.0F;
			} else if (Static344.aClass2_Sub2_Sub17_3.anInt6875 == 75) {
				Static344.aFloat72 = 6.0F;
				Static344.aFloat73 = 6.0F;
			} else if (Static344.aClass2_Sub2_Sub17_3.anInt6875 == 100) {
				Static344.aFloat72 = 8.0F;
				Static344.aFloat73 = 8.0F;
			} else if (Static344.aClass2_Sub2_Sub17_3.anInt6875 == 200) {
				Static344.aFloat72 = 16.0F;
				Static344.aFloat73 = 16.0F;
			} else {
				Static344.aFloat72 = 8.0F;
				Static344.aFloat73 = 8.0F;
			}
			Static344.anInt6047 = (int) Static344.aFloat72 >> 1;
			Static344.aByteArrayArrayArray15 = Static260.method6018(Static344.anInt6047);
			Static298.method2422();
			Static344.method5519();
			Static197.aClass135_24 = new Class135();
			Static344.anInt6048 += (int) (Math.random() * 5.0D) - 2;
			if (Static344.anInt6048 < -8) {
				Static344.anInt6048 = -8;
			}
			Static344.anInt6049 += (int) (Math.random() * 5.0D) - 2;
			if (Static344.anInt6048 > 8) {
				Static344.anInt6048 = 8;
			}
			if (Static344.anInt6049 < -16) {
				Static344.anInt6049 = -16;
			}
			if (Static344.anInt6049 > 16) {
				Static344.anInt6049 = 16;
			}
			Static344.method5528(arg1, Static344.anInt6048 >> 2 << 10, Static344.anInt6049 >> 1);
			Static344.aClass125_4.method3377(256, 1024);
			Static344.aClass104_4.method2702(256, 256);
			Static344.aClass202_3.method5161(4096);
			Static322.aClass128_1.method3392(256);
			Static355.anInt6581 = 20;
		} else if (Static355.anInt6581 == 20) {
			Static161.method2973(true);
			Static344.method5521(arg0, Static344.anInt6048, Static344.anInt6049);
			Static355.anInt6581 = 60;
			Static161.method2973(true);
			Static142.method2662();
		} else if (Static355.anInt6581 == 60) {
			if (Static344.aClass197_85.method5101(Static344.aClass2_Sub2_Sub17_3.aString67 + "_staticelements")) {
				if (!Static344.aClass197_85.method5072(Static344.aClass2_Sub2_Sub17_3.aString67 + "_staticelements")) {
					return;
				}
				Static344.aClass103_5 = Static317.method5552(Static344.aClass197_85, Static344.aClass2_Sub2_Sub17_3.aString67 + "_staticelements", LoginManager.mapMembers);
			} else {
				Static344.aClass103_5 = new Class103(0);
			}
			Static344.method5511();
			Static355.anInt6581 = 70;
			Static161.method2973(true);
			Static142.method2662();
		} else if (Static355.anInt6581 == 70) {
			Static74.aClass113_4 = new Class113(arg0, 11, true, Static21.aCanvas1);
			Static355.anInt6581 = 73;
			Static161.method2973(true);
			Static142.method2662();
		} else if (Static355.anInt6581 == 73) {
			Static107.aClass113_5 = new Class113(arg0, 12, true, Static21.aCanvas1);
			Static355.anInt6581 = 76;
			Static161.method2973(true);
			Static142.method2662();
		} else if (Static355.anInt6581 == 76) {
			Static2.aClass113_1 = new Class113(arg0, 14, true, Static21.aCanvas1);
			Static355.anInt6581 = 79;
			Static161.method2973(true);
			Static142.method2662();
		} else if (Static355.anInt6581 == 79) {
			Static175.aClass113_6 = new Class113(arg0, 17, true, Static21.aCanvas1);
			Static355.anInt6581 = 82;
			Static161.method2973(true);
			Static142.method2662();
		} else if (Static355.anInt6581 == 82) {
			Static249.aClass113_8 = new Class113(arg0, 19, true, Static21.aCanvas1);
			Static355.anInt6581 = 85;
			Static161.method2973(true);
			Static142.method2662();
		} else if (Static355.anInt6581 == 85) {
			Static30.aClass113_3 = new Class113(arg0, 22, true, Static21.aCanvas1);
			Static355.anInt6581 = 88;
			Static161.method2973(true);
			Static142.method2662();
		} else if (Static355.anInt6581 == 88) {
			Static27.aClass113_2 = new Class113(arg0, 26, true, Static21.aCanvas1);
			Static355.anInt6581 = 91;
			Static161.method2973(true);
			Static142.method2662();
		} else {
			Static369.aClass113_9 = new Class113(arg0, 30, true, Static21.aCanvas1);
			Static355.anInt6581 = 100;
			Static161.method2973(true);
			Static142.method2662();
			System.gc();
		}
	}
}
