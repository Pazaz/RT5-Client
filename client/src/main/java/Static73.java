import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!er", name = "W", descriptor = "[I")
	public static int[] anIntArray129 = new int[2];

	@OriginalMember(owner = "client!er", name = "Y", descriptor = "I")
	public static int anInt2038 = 0;

	@OriginalMember(owner = "client!er", name = "bb", descriptor = "I")
	public static int anInt2040 = 0;

	@OriginalMember(owner = "client!er", name = "hb", descriptor = "Ljava/lang/String;")
	public static String aString75 = "Please remove ";

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(II)Lclient!ki;")
	public static Class111 method1720(@OriginalArg(0) int arg0) {
		@Pc(24) Class111 local24 = (Class111) Static234.aClass215_72.method6057((long) arg0);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static93.aClass162_84.method4636(arg0, 30);
		local24 = new Class111();
		if (local36 != null) {
			local24.method3339(arg0, new Class1_Sub16(local36));
		}
		Static234.aClass215_72.method6050(local24, (long) arg0);
		return local24;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(ILclient!qj;)V")
	public static void method1721(@OriginalArg(1) Class162 arg0) {
		Static314.anInt6502 = arg0.method4631("titlebg");
		Static14.anInt586 = arg0.method4631("logo");
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		Static19.method472(arg1, arg4, arg0, arg2, 0, arg3);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!il;I)Ljava/lang/String;")
	public static String method1723(@OriginalArg(1) Class1_Sub16 arg0) {
		try {
			@Pc(12) int local12 = arg0.method5744();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local12];
			arg0.anInt6813 += Static123.aClass87_1.method2583(local20, local12, arg0.aByteArray86, arg0.anInt6813, 0);
			return Static200.method3962(local12, 0, local20);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(II)I")
	public static int method1724(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BIZI)V")
	public static void method1726(@OriginalArg(2) boolean arg0) {
		Static80.anInt2184 = 22050;
		Static156.anInt3874 = 2;
		Class1_Sub2_Sub1_Sub1.lb = arg0;
	}
}
