import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static391 {

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
	public static int anInt6133;

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
	public static int anInt6134;

	@OriginalMember(owner = "client!mea", name = "l", descriptor = "Lclient!sia;")
	public static final Class339 aClass339_34 = new Class339();

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(II)I")
	public static int method5505(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
