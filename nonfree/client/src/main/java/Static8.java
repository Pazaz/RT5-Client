import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static8 {

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "Lclient!bd;")
	public static Class2_Sub6_Sub1 aClass2_Sub6_Sub1_1;

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_1 = new Class345(38, -1);

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)Lclient!pa;")
	public static Class283 method122(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static489.aClass283Array1[arg0] : null;
	}
}
