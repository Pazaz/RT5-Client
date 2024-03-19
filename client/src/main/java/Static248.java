import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!j;")
	public static Class94 aClass94_3;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	public static int anInt5405 = 0;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString190 = "slide:";

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V")
	public static void method4596() {
		Static108.aClass215_42.method6063(5);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	public static void method4597() {
		for (@Pc(6) Class2_Sub7 local6 = (Class2_Sub7) Static55.aClass58_4.method1672(); local6 != null; local6 = (Class2_Sub7) Static55.aClass58_4.method1675()) {
			local6.method4746();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qj;ILclient!qj;)V")
	public static void method4598(@OriginalArg(0) Class162 arg0, @OriginalArg(2) Class162 arg1) {
		Static38.aClass162_52 = arg0;
		Static140.aClass162_122 = arg1;
		Static188.anInt1586 = Static38.aClass162_52.method4640(3);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILclient!s;)V")
	public static void method4599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7_Sub5 arg3) {
		if (Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static91.method1998(arg0, arg1, arg2);
		}
		Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2].aClass7_Sub5_1 = arg3;
	}
}
