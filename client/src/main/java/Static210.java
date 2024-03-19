import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
	public static int anInt4839;

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "Lclient!os;")
	public static Class146 aClass146_9;

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[200];

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
	public static int anInt4841 = 13156520;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIB)V")
	public static void method4143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub1_Sub10 local13 = Static122.method2624(14, arg1);
		local13.method2539();
		local13.anInt2960 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B[Lclient!qa;)V")
	public static void method4144(@OriginalArg(1) Class29[] arg0) {
		Static353.anInt7365 = arg0.length;
		Static265.aClass29Array12 = new Class29[Static353.anInt7365 + 10];
		Static341.anIntArray582 = new int[Static353.anInt7365 + 10];
		Static360.method2015(arg0, 0, Static265.aClass29Array12, 0, Static353.anInt7365);
		for (@Pc(30) int local30 = 0; local30 < Static353.anInt7365; local30++) {
			Static341.anIntArray582[local30] = Static265.aClass29Array12[local30].method5832();
		}
		for (@Pc(49) int local49 = Static353.anInt7365; local49 < Static265.aClass29Array12.length; local49++) {
			Static341.anIntArray582[local49] = 12;
		}
	}
}
