import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!qj;")
	public static Class162 aClass162_120;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	public static int anInt3442;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "Lclient!j;")
	public static Class94 aClass94_1;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "[I")
	public static int[] anIntArray247;

	@OriginalMember(owner = "client!je", name = "A", descriptor = "I")
	public static int anInt3448;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!op;")
	public static final Class143 aClass143_5 = new Class143(64);

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString120 = "K";

	@OriginalMember(owner = "client!je", name = "r", descriptor = "I")
	public static int anInt3443 = 0;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "I")
	public static int anInt3444 = 2;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "I")
	public static int anInt3447 = -1;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)V")
	public static void method3056(@OriginalArg(0) int arg0) {
		Static70.anInt1961 = arg0;
		@Pc(11) Class215 local11 = Static256.aClass215_79;
		synchronized (Static256.aClass215_79) {
			Static256.aClass215_79.method6060();
		}
		local11 = Static94.aClass215_39;
		synchronized (Static94.aClass215_39) {
			Static94.aClass215_39.method6060();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method3057() {
		for (@Pc(10) Class1_Sub4 local10 = (Class1_Sub4) Static12.aClass130_1.method3749(); local10 != null; local10 = (Class1_Sub4) Static12.aClass130_1.method3756()) {
			if (local10.anInt523 > 0) {
				local10.anInt523--;
			}
			if (local10.anInt523 != 0) {
				if (local10.anInt530 > 0) {
					local10.anInt530--;
				}
				if (local10.anInt530 == 0 && local10.anInt526 >= 1 && local10.anInt519 >= 1 && Static25.anInt850 - 2 >= local10.anInt526 && Static219.anInt4987 - 2 >= local10.anInt519 && (local10.anInt528 < 0 || Static219.method4281(local10.anInt528, local10.anInt521))) {
					Static265.method4788(local10.anInt534, local10.anInt532, local10.anInt519, -1, local10.anInt533, local10.anInt526, local10.anInt528, local10.anInt521);
					local10.anInt530 = -1;
					if (local10.anInt528 == local10.anInt522 && local10.anInt522 == -1) {
						local10.method6172();
					} else if (local10.anInt522 == local10.anInt528 && local10.anInt533 == local10.anInt520 && local10.anInt525 == local10.anInt521) {
						local10.method6172();
					}
				}
			} else if (local10.anInt522 < 0 || Static219.method4281(local10.anInt522, local10.anInt525)) {
				Static265.method4788(local10.anInt534, local10.anInt532, local10.anInt519, -1, local10.anInt520, local10.anInt526, local10.anInt522, local10.anInt525);
				local10.method6172();
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	public static void method3058() {
		if (Static313.anInt6481 == 2) {
			Static207.anInt4798 = 96;
			return;
		}
		try {
			@Pc(15) Method local15 = Runtime.class.getMethod("maxMemory");
			if (local15 != null) {
				try {
					@Pc(19) Runtime local19 = Runtime.getRuntime();
					@Pc(25) Long local25 = (Long) local15.invoke(local19, (Object[]) null);
					Static207.anInt4798 = (int) (local25 / 1048576L) + 1;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)I")
	public static int method3059() {
		return Static301.anInt6298;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	public static void method3060() {
		if (Static214.anInt4865 == 10) {
			Static276.method4934(28);
		}
		if (Static214.anInt4865 == 30) {
			Static276.method4934(25);
		}
	}
}
