import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
	public static int anInt2095;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)Lclient!gq;")
	public static Class11_Sub1 method2143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static330.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_2;
	}

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "(I)V")
	public static void method2146() {
		Static65.aClass19_3.method2838(((float) client.preferences.anInt4879 * 0.1F + 0.7F) * 1.1523438F);
		Static65.aClass19_3.method2832(Static28.anInt686, 0.69921875F, 1.2F, -50.0F, (float) -60, -50.0F);
		Static65.aClass19_3.method2879(Static279.anInt5161, -1);
		Static65.aClass19_3.method2870(Static62.aClass42_5);
	}
}
