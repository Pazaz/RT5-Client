import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Lclient!qj;")
	public static Class162 aClass162_157;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!os;")
	public static Class146 aClass146_8;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "[Lclient!qa;")
	public static Class29[] aClass29Array7;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public static int anInt4520 = 100;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "I")
	public static int anInt4521 = 0;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28 = null;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
	public static void method3894() {
		@Pc(11) Class215 local11 = Static124.aClass215_49;
		synchronized (Static124.aClass215_49) {
			Static124.aClass215_49.method6063(5);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Lclient!ld;")
	public static Class57 method3895() {
		try {
			return (Class57) Class.forName("Class57_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg2; local12 <= arg0; local12++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg4; local16++) {
				if (Static346.anIntArrayArray56[local12][local16] == arg1 && Static243.anIntArrayArray35[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Lclient!lo;")
	public static Class1_Sub21 method3897() {
		if (Static201.aClass130_28 == null || Static56.aClass195_1 == null) {
			return null;
		}
		for (@Pc(16) Class1_Sub21 local16 = (Class1_Sub21) Static56.aClass195_1.method5279(); local16 != null; local16 = (Class1_Sub21) Static56.aClass195_1.method5279()) {
			@Pc(28) Class107 local28 = Static292.method5169(local16.anInt4155);
			if (local28 != null && local28.aBoolean265 && local28.method3291()) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)V")
	public static void method3898(@OriginalArg(1) int arg0) {
		Static14.anInt591 = arg0;
		Static309.aClass215_92.method6060();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIB)V")
	public static void method3899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static283.method5049(anInt4520, Static180.anInt4240, arg4);
		@Pc(24) int local24 = Static283.method5049(anInt4520, Static180.anInt4240, arg3);
		@Pc(30) int local30 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg0);
		@Pc(36) int local36 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg2);
		for (@Pc(38) int local38 = local11; local38 <= local24; local38++) {
			Static12.method349(local36, Static87.anIntArrayArray9[local38], arg1, local30);
		}
	}
}
