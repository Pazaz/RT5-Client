import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	public static int anInt3409;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "[Lclient!gm;")
	public static Class77[] aClass77Array2;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "B")
	public static byte aByte34;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Z")
	public static boolean aBoolean238 = true;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
	public static int anInt3414 = -50;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)Z")
	public static boolean method3041(@OriginalArg(1) int arg0) {
		if (arg0 == 5 || arg0 == 39 || arg0 == 46 || arg0 == 58 || arg0 == 60) {
			return true;
		} else if (arg0 == 32 || arg0 == 7 || arg0 == 1005) {
			return true;
		} else if (arg0 == 30 || arg0 == 26 || arg0 == 42 || arg0 == 31 || arg0 == 2) {
			return true;
		} else {
			return arg0 == 35 || arg0 == 18 || arg0 == 1012 || arg0 == 11;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IJ)V")
	public static void method3043(@OriginalArg(1) long arg0) {
		Static150.aClass1_Sub16_Sub2_2.anInt6813 = 0;
		Static150.aClass1_Sub16_Sub2_2.method5771(21);
		Static150.aClass1_Sub16_Sub2_2.method5753(arg0);
		Static155.anInt3855 = 0;
		Static277.anInt5863 = 1;
		Static152.anInt3743 = -3;
		Static45.anInt1471 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method3046() {
		if (Static112.aFrame1 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static252.aFrame2 == null) {
			local12 = Static184.aClass199_12.anApplet1;
		} else {
			local12 = Static252.aFrame2;
		}
		Static264.anInt5603 = local12.getSize().width;
		Static222.anInt5038 = local12.getSize().height;
		@Pc(31) Insets local31;
		if (local12 == Static252.aFrame2) {
			local31 = Static252.aFrame2.getInsets();
			Static264.anInt5603 -= local31.left + local31.right;
			Static222.anInt5038 -= local31.top + local31.bottom;
		}
		if (Static164.method3437() == 1) {
			Static88.anInt2337 = 0;
			Static107.anInt2674 = 765;
			Static350.anInt7318 = 503;
			Static108.anInt2685 = (Static264.anInt5603 - 765) / 2;
		} else if (Static207.anInt4798 < 96 && Static130.anInt6754 == 0) {
			@Pc(75) int local75 = Static264.anInt5603 <= 1024 ? Static264.anInt5603 : 1024;
			Static107.anInt2674 = local75;
			@Pc(86) int local86 = Static222.anInt5038 <= 768 ? Static222.anInt5038 : 768;
			Static108.anInt2685 = (Static264.anInt5603 - local75) / 2;
			Static350.anInt7318 = local86;
			Static88.anInt2337 = 0;
		} else {
			Static107.anInt2674 = Static264.anInt5603;
			Static108.anInt2685 = 0;
			Static88.anInt2337 = 0;
			Static350.anInt7318 = Static222.anInt5038;
		}
		if (Static312.anInt6002 != 0) {
			@Pc(125) boolean local125;
			if (Static107.anInt2674 < 1024 && Static350.anInt7318 < 768) {
				local125 = true;
			} else {
				local125 = false;
			}
		}
		Static86.aCanvas2.setSize(Static107.anInt2674, Static350.anInt7318);
		if (Static221.aClass40_6 != null) {
			Static221.aClass40_6.method2765();
		}
		if (local12 == Static252.aFrame2) {
			local31 = Static252.aFrame2.getInsets();
			Static86.aCanvas2.setLocation(local31.left + Static108.anInt2685, Static88.anInt2337 + local31.top);
		} else {
			Static86.aCanvas2.setLocation(Static108.anInt2685, Static88.anInt2337);
		}
		if (Static295.anInt6177 != -1) {
			Static53.method1384(true);
		}
		Static11.method6076();
	}
}
