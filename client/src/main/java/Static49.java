import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dh", name = "E", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
	public static int anInt1560;

	@OriginalMember(owner = "client!dh", name = "C", descriptor = "J")
	public static long aLong47 = -1L;

	@OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
	public static int anInt1556 = -1;

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
	public static int anInt1559 = 0;

	@OriginalMember(owner = "client!dh", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString56 = "Connected to update server";

	@OriginalMember(owner = "client!dh", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString57 = null;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)V")
	public static void method1351() {
		for (@Pc(3) int local3 = 0; local3 < Static253.anInt5456; local3++) {
			@Pc(9) Class65 local9 = Static38.method942(local3);
			if (local9 != null && local9.anInt2335 == 0) {
				Static128.anIntArray239[local3] = 0;
				Static78.anIntArray137[local3] = 0;
			}
		}
		Static72.aClass183_6 = new Class183(128);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIZ)V")
	public static void method1352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		if (arg0 >= arg2) {
			for (local16 = arg2; local16 < arg0; local16++) {
				Static87.anIntArrayArray9[local16][arg1] = arg3;
			}
		} else {
			for (local16 = arg0; local16 < arg2; local16++) {
				Static87.anIntArrayArray9[local16][arg1] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)Lclient!ia;")
	public static Class1_Sub14 method1354(@OriginalArg(0) int arg0) {
		return (Class1_Sub14) Static143.aClass183_13.method5053((long) arg0);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V")
	public static void method1355() {
		@Pc(5) Class215 local5 = Static94.aClass215_39;
		synchronized (Static94.aClass215_39) {
			Static94.aClass215_39.method6063(5);
		}
		local5 = Static256.aClass215_79;
		synchronized (Static256.aClass215_79) {
			Static256.aClass215_79.method6063(5);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method1356(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
