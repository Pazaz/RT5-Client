import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "[I")
	public static int[] anIntArray117;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "Lclient!jd;")
	public static Class13 aClass13_5;

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "Lclient!r;")
	public static Class197 aClass197_18;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public static int anInt1737;

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_38 = new Class79("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
	public static int anInt1736 = -1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public static void method1835(@OriginalArg(1) int arg0) {
		Static12.method282();
		@Pc(15) int local15 = Static56.aClass199_1.method5114(arg0).anInt4700;
		if (local15 == 0) {
			return;
		}
		@Pc(23) int local23 = Static214.aClass226_1.anIntArray430[arg0];
		if (local15 == 5) {
			Static232.anInt4087 = local23;
		}
		if (local15 == 6) {
			Static389.anInt4896 = local23;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I")
	public static int method1837(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
