import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!bi;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
	public static int anInt5496 = 0;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
	public static int anInt5498 = -1;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "[Lclient!q;")
	public static final Class187[] aClass187Array1 = new Class187[6];

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString56 = null;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
	public static void method5023(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static316.method5413(2, arg0);
		local8.method2312();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public static void method5025() {
		Static212.anInt3785 = 0;
		@Pc(17) int local17 = (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6781 >> 7) + Static164.anInt3140;
		@Pc(24) int local24 = Static148.anInt2719 + (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6783 >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static212.anInt3785 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static212.anInt3785 = 1;
		}
		if (Static212.anInt3785 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static212.anInt3785 = 0;
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public static void method5026() {
		Static91.method1960(Static13.aClass145_18);
		Static257.aClass2_Sub4_Sub2_4.method4842(0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!bt;)Lclient!gr;")
	public static Class86 method5027(@OriginalArg(1) Class2_Sub4 arg0) {
		@Pc(15) Class86 local15 = new Class86();
		local15.anInt2377 = arg0.method4829();
		local15.aClass2_Sub2_Sub16_1 = Static146.method2699(local15.anInt2377);
		return local15;
	}
}
