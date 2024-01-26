import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static690 {

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "Lclient!ql;")
	public static Class308 aClass308_2;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "J")
	public static long aLong318;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "Lclient!mj;")
	public static Class243 aClass243_5;

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "Lclient!dfa;")
	public static final Class77 aClass77_7 = new Class77();

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V")
	public static void method8996(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static507.anInt7618 = arg0;
		Static81.aClass8_Sub5Array1 = new Class8_Sub5[Static190.anIntArray265[Static507.anInt7618] + 1];
		Static295.anInt4781 = 0;
		Static349.anInt5693 = 0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method8998() {
		return Static400.aBoolean622 || Static470.aClass2_Sub2_Sub16_10 == null ? "" : Static470.aClass2_Sub2_Sub16_10.aString87;
	}
}
