import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!eh", name = "hb", descriptor = "I")
	public static int anInt1845;

	@OriginalMember(owner = "client!eh", name = "kb", descriptor = "Lclient!qj;")
	public static Class162 aClass162_63;

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "[I")
	public static final int[] anIntArray121 = new int[14];

	@OriginalMember(owner = "client!eh", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString65 = "Prepared sound engine";

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "Ljava/lang/String;")
	public static String aString66 = "Unable to find ";

	@OriginalMember(owner = "client!eh", name = "cb", descriptor = "[I")
	public static final int[] anIntArray122 = new int[14];

	@OriginalMember(owner = "client!eh", name = "db", descriptor = "Lclient!mi;")
	public static final Class130 aClass130_5 = new Class130();

	@OriginalMember(owner = "client!eh", name = "jb", descriptor = "[Lclient!bi;")
	public static final Class22[] aClass22Array1 = new Class22[4];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!me;II)Lclient!is;")
	public static Class93 method1563(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class93 local7;
		if (Static69.aClass93_1 == null) {
			local7 = new Class93();
		} else {
			local7 = Static69.aClass93_1;
			Static69.aClass93_1 = Static69.aClass93_1.aClass93_2;
			local7.aClass93_2 = null;
			Static76.anInt2080--;
		}
		local7.anInt3391 = arg1;
		local7.aClass7_Sub1_1 = arg0;
		return local7;
	}
}
