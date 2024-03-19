import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!fn", name = "Z", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!fn", name = "hb", descriptor = "Lclient!os;")
	public static Class146 aClass146_3;

	@OriginalMember(owner = "client!fn", name = "eb", descriptor = "Ljava/lang/String;")
	public static String aString87 = " more options";

	@OriginalMember(owner = "client!fn", name = "gb", descriptor = "Lclient!we;")
	public static final Class215 aClass215_37 = new Class215(64);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1931(@OriginalArg(1) String arg0) {
		if (Static123.aStringArray19 == null) {
			Static85.method1904();
		}
		@Pc(14) String[] local14 = Static355.method3607(arg0, '\n');
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			for (@Pc(25) int local25 = Static172.anInt6632; local25 > 0; local25--) {
				Static123.aStringArray19[local25] = Static123.aStringArray19[local25 - 1];
			}
			Static123.aStringArray19[0] = local14[local21];
			if (Static172.anInt6632 < Static123.aStringArray19.length - 1) {
				if (Static251.anInt5422 > 0) {
					Static251.anInt5422++;
				}
				Static172.anInt6632++;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V")
	public static void method1932() {
		Static352.aClass215_102.method6052();
		Static11.aClass215_99.method6052();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!hb;Lclient!qj;Lclient!qj;Lclient!qj;I)Z")
	public static boolean method1934(@OriginalArg(0) Class1_Sub3_Sub1 arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(3) Class162 arg3) {
		Static200.aClass1_Sub3_Sub1_1 = arg0;
		Static105.aClass162_89 = arg3;
		Static10.aClass162_25 = arg2;
		Static203.aClass162_46 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(III)Lclient!br;")
	public static Class7_Sub2 method1936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class154 local7 = Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass7_Sub2_2;
	}
}
