import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!lq", name = "X", descriptor = "I")
	public static int anInt4224;

	@OriginalMember(owner = "client!lq", name = "P", descriptor = "Lclient!mi;")
	public static final Class130 aClass130_26 = new Class130();

	@OriginalMember(owner = "client!lq", name = "U", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!lq", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString156 = "Choose Option";

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!qj;Lclient!qj;BZ)V")
	public static void method3609(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class162 arg1) {
		Static148.aClass162_127 = arg0;
		Static303.aBoolean456 = true;
		Static120.aClass162_104 = arg1;
		@Pc(23) int local23 = Static148.aClass162_127.method4633() - 1;
		Static124.anInt3120 = local23 * 256 + Static148.aClass162_127.method4640(local23);
		Static197.aStringArray28 = new String[] { null, null, Static43.aString52, null, null };
		Static344.aStringArray45 = new String[] { null, null, null, null, Static327.aString257 };
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(II)V")
	public static void method3610() {
		@Pc(9) Class215 local9 = Static268.aClass215_81;
		synchronized (Static268.aClass215_81) {
			Static268.aClass215_81.method6063(5);
		}
		local9 = Static104.aClass215_41;
		synchronized (Static104.aClass215_41) {
			Static104.aClass215_41.method6063(5);
		}
		@Pc(41) Class115 local41 = Static299.aClass115_1;
		synchronized (Static299.aClass115_1) {
			Static299.aClass115_1.method3463();
		}
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)I")
	public static int method3611() {
		return 2;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)I")
	public static int method3612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub14 local12 = (Class1_Sub14) Static143.aClass183_13.method5053((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 >= 0 && local12.anIntArray226.length > arg1) {
			return local12.anIntArray226[arg1];
		} else {
			return 0;
		}
	}
}
