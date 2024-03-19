import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!as", name = "U", descriptor = "I")
	public static int anInt591;

	@OriginalMember(owner = "client!as", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString18 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!as", name = "N", descriptor = "I")
	public static int anInt586 = -1;

	@OriginalMember(owner = "client!as", name = "S", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V")
	public static void method410() {
		Static92.aClass130_7 = new Class130();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ro;B)Lclient!ro;")
	public static Class177 method411(@OriginalArg(0) Class177 arg0) {
		if (arg0.anInt5829 != -1) {
			return Static298.method5252(arg0.anInt5829);
		}
		@Pc(19) int local19 = arg0.anInt5828 >>> 16;
		@Pc(32) Class24 local32 = new Class24(Static135.aClass183_33);
		for (@Pc(37) Class1_Sub35 local37 = (Class1_Sub35) local32.method660(); local37 != null; local37 = (Class1_Sub35) local32.method659()) {
			if (local19 == local37.anInt6079) {
				return Static298.method5252((int) local37.aLong235);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
	public static void method413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub1_Sub10 local12 = Static122.method2624(7, arg1);
		local12.method2539();
		local12.anInt2960 = arg0;
	}
}
