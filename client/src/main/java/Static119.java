import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17;

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	public static void method1987() {
		Static86.aClass215_37.method6060();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)I")
	public static int method1988(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!il;I)V")
	public static void method1989(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(11) int local11 = arg0.method5744();
		Static38.aClass95Array1 = new Class95[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			Static38.aClass95Array1[local16] = new Class95();
			Static38.aClass95Array1[local16].anInt3403 = arg0.method5744();
			Static38.aClass95Array1[local16].aString118 = arg0.method5727();
		}
		Static181.anInt4291 = arg0.method5744();
		Static340.anInt7186 = arg0.method5744();
		Static141.anInt3505 = arg0.method5744();
		Static302.aClass27_Sub1Array1 = new Class27_Sub1[Static340.anInt7186 + 1 - Static181.anInt4291];
		for (@Pc(64) int local64 = 0; local64 < Static141.anInt3505; local64++) {
			@Pc(72) int local72 = arg0.method5744();
			@Pc(80) Class27_Sub1 local80 = Static302.aClass27_Sub1Array1[local72] = new Class27_Sub1();
			local80.anInt931 = arg0.method5761();
			local80.anInt929 = arg0.method5730();
			local80.anInt936 = Static181.anInt4291 + local72;
			local80.aString43 = arg0.method5727();
			local80.aString42 = arg0.method5727();
		}
		Static148.anInt3661 = arg0.method5730();
		Static29.aBoolean461 = true;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZZIIB)V")
	public static void method1991(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static282.method5030(Static323.aClass27_Sub1Array2.length - 1, arg0, arg1, 0, arg3, arg2);
		Static290.aClass1_Sub32_1 = null;
		Static266.anInt5651 = 0;
	}
}
