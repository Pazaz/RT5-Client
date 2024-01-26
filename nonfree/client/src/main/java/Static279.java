import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!io", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "[Ljava/lang/Object;")
	public static Object[] anObjectArray35;

	@OriginalMember(owner = "client!io", name = "e", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public static void method4072() {
		Static161.anInt2797 = Static694.aClass381_13.anInt10030 + Static694.aClass381_13.anInt10036 + 2;
		Static393.aStringArray32 = new String[500];
		Static644.anInt9608 = Static42.aClass381_4.anInt10036 + Static42.aClass381_4.anInt10030 + 2;
		for (@Pc(35) int local35 = 0; local35 < Static393.aStringArray32.length; local35++) {
			Static393.aStringArray32[local35] = "";
		}
		Static79.method1579(Static32.aClass32_1.method877(Static51.anInt1052));
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Z")
	public static boolean method4074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
