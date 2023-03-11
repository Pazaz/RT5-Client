import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!rb;")
	public static Class199 aClass199_1;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_13 = new Class135();

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString13 = "";

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	public static final int anInt1462 = 1401;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method1611() {
		if (LoginManager.reconnecting == 10 || LoginManager.reconnecting == 28) {
			Static387.method2835(5000, Static136.anInt6778 >> 10, Static211.anInt3777 >> 10);
		} else {
			@Pc(31) int local31 = Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray316[0] >> 3;
			@Pc(38) int local38 = Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray317[0] >> 3;
			if (local31 >= 0 && local31 < Static373.anInt7033 >> 3 && local38 >= 0 && Static242.anInt4449 >> 3 > local38) {
				Static387.method2835(5000, local31, local38);
			} else {
				Static387.method2835(0, Static373.anInt7033 >> 4, Static242.anInt4449 >> 4);
			}
		}
		Static140.method2623();
		Static291.method5029();
		Static248.method4341();
		Static50.method1530();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ll;)V")
	public static void method1613(@OriginalArg(1) Class2_Sub12 arg0) {
		arg0.aBoolean389 = false;
		if (arg0.aClass2_Sub21_5 != null) {
			arg0.aClass2_Sub21_5.anInt3175 = 0;
		}
		for (@Pc(23) Class2_Sub12 local23 = arg0.method4978(); local23 != null; local23 = arg0.method4972()) {
			method1613(local23);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method1614() {
		if (Static18.aClass32_2 == null) {
			return;
		}
		if (Static18.aClass32_2.status == 1) {
			Static18.aClass32_2 = null;
			return;
		}
		if (Static18.aClass32_2.status == 2) {
			Static234.method4095(Static17.aClass152_4, 2, Static257.aString39);
			Static18.aClass32_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
	public static void method1616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class2_Sub19 local10 = (Class2_Sub19) Static83.aClass135_14.method3551(); local10 != null; local10 = (Class2_Sub19) Static83.aClass135_14.method3552()) {
			Static337.method5706(arg2, arg3, local10, arg1, arg0);
		}
		for (@Pc(33) Class2_Sub19 local33 = (Class2_Sub19) Static363.aClass135_39.method3551(); local33 != null; local33 = (Class2_Sub19) Static363.aClass135_39.method3552()) {
			@Pc(37) byte local37 = 1;
			@Pc(42) Class222 local42 = local33.aClass11_Sub5_Sub2_Sub2_1.method4332();
			if (local33.aClass11_Sub5_Sub2_Sub2_1.aBoolean317) {
				local37 = 0;
			} else if (local42.anInt6263 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585 || local42.anInt6292 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585 || local42.anInt6301 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585 || local42.anInt6271 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585) {
				local37 = 2;
			} else if (local42.anInt6265 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585 || local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585 == local42.anInt6299 || local42.anInt6267 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585 || local42.anInt6284 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4585) {
				local37 = 3;
			}
			if (local37 != local33.anInt2900) {
				@Pc(133) int local133 = Static340.method5764(local33.aClass11_Sub5_Sub2_Sub2_1);
				if (local133 != local33.anInt2894) {
					if (local33.aClass2_Sub12_Sub4_3 != null) {
						Static227.aClass2_Sub12_Sub2_2.method2081(local33.aClass2_Sub12_Sub4_3);
						local33.aClass2_Sub12_Sub4_3 = null;
					}
					local33.anInt2894 = local133;
				}
				local33.anInt2900 = local37;
			}
			local33.anInt2899 = local33.aClass11_Sub5_Sub2_Sub2_1.anInt6781;
			local33.anInt2896 = local33.aClass11_Sub5_Sub2_Sub2_1.anInt6781 + local33.aClass11_Sub5_Sub2_Sub2_1.method4328() * 64;
			local33.anInt2910 = local33.aClass11_Sub5_Sub2_Sub2_1.anInt6783;
			local33.anInt2904 = local33.aClass11_Sub5_Sub2_Sub2_1.anInt6783 + local33.aClass11_Sub5_Sub2_Sub2_1.method4328() * 64;
			Static337.method5706(arg2, arg3, local33, arg1, arg0);
		}
		for (@Pc(208) Class2_Sub19 local208 = (Class2_Sub19) Static232.aClass4_86.method80(); local208 != null; local208 = (Class2_Sub19) Static232.aClass4_86.method79()) {
			@Pc(212) byte local212 = 1;
			@Pc(217) Class222 local217 = local208.aClass11_Sub5_Sub2_Sub1_2.method4332();
			if (local208.aClass11_Sub5_Sub2_Sub1_2.aBoolean317) {
				local212 = 0;
			} else if (local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585 == local217.anInt6263 || local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585 == local217.anInt6292 || local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585 == local217.anInt6301 || local217.anInt6271 == local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585) {
				local212 = 2;
			} else if (local217.anInt6265 == local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585 || local217.anInt6299 == local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585 || local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585 == local217.anInt6267 || local217.anInt6284 == local208.aClass11_Sub5_Sub2_Sub1_2.anInt4585) {
				local212 = 3;
			}
			if (local212 != local208.anInt2900) {
				@Pc(300) int local300 = Static384.method6415(local208.aClass11_Sub5_Sub2_Sub1_2);
				if (local300 != local208.anInt2894) {
					if (local208.aClass2_Sub12_Sub4_3 != null) {
						Static227.aClass2_Sub12_Sub2_2.method2081(local208.aClass2_Sub12_Sub4_3);
						local208.aClass2_Sub12_Sub4_3 = null;
					}
					local208.anInt2894 = local300;
				}
				local208.anInt2900 = local212;
			}
			local208.anInt2899 = local208.aClass11_Sub5_Sub2_Sub1_2.anInt6781;
			local208.anInt2896 = local208.aClass11_Sub5_Sub2_Sub1_2.anInt6781 + local208.aClass11_Sub5_Sub2_Sub1_2.method4328() * 64;
			local208.anInt2910 = local208.aClass11_Sub5_Sub2_Sub1_2.anInt6783;
			local208.anInt2904 = local208.aClass11_Sub5_Sub2_Sub1_2.anInt6783 + local208.aClass11_Sub5_Sub2_Sub1_2.method4328() * 64;
			Static337.method5706(arg2, arg3, local208, arg1, arg0);
		}
	}
}
