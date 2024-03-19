import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!km", name = "F", descriptor = "[I")
	public static int[] anIntArray351;

	@OriginalMember(owner = "client!km", name = "D", descriptor = "Lclient!we;")
	public static final Class215 aClass215_63 = new Class215(256);

	@OriginalMember(owner = "client!km", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString169 = "Created gameworld";

	@OriginalMember(owner = "client!km", name = "H", descriptor = "J")
	public static long aLong137 = 0L;

	@OriginalMember(owner = "client!km", name = "I", descriptor = "I")
	public static int anInt4621 = 0;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
	public static void method3980() {
		Static250.aClass215_76.method6060();
		Static160.aClass215_100.method6060();
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)Lclient!g;")
	public static Class2_Sub3 method3981(@OriginalArg(0) int arg0) {
		@Pc(7) Class58[] local7 = Class211.aClass58Array1;
		synchronized (Class211.aClass58Array1) {
			@Pc(28) Class2_Sub3 local28;
			if (arg0 >= Class211.aClass58Array1.length || Class211.aClass58Array1[arg0].method1669()) {
				local28 = new Class2_Sub3();
				local28.aClass2_Sub6Array1 = new Class2_Sub6[arg0];
				for (@Pc(50) int local50 = 0; local50 < arg0; local50++) {
					local28.aClass2_Sub6Array1[local50] = new Class2_Sub6();
				}
			} else {
				local28 = (Class2_Sub3) Class211.aClass58Array1[arg0].method1668();
				local28.method5802();
				@Pc(35) int local35 = Static235.anIntArray398[arg0]--;
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(II)I")
	public static int method3982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static350.anIntArrayArray58 == null ? 0 : Static350.anIntArrayArray58[arg0][arg1] & 0xFFFFFF;
	}
}
