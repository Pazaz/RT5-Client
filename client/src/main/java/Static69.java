import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!el", name = "n", descriptor = "Z")
	public static boolean aBoolean133;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "[B")
	public static byte[] aByteArray11;

	@OriginalMember(owner = "client!el", name = "E", descriptor = "Lclient!is;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!el", name = "A", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!el", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString73 = "Loaded world list data";

	@OriginalMember(owner = "client!el", name = "F", descriptor = "I")
	public static int anInt1955 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	public static void method1638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(13, arg1);
		local8.method2539();
		local8.anInt2960 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V")
	public static void method1644() {
		@Pc(1) Class215 local1 = Static159.aClass215_63;
		synchronized (Static159.aClass215_63) {
			Static159.aClass215_63.method6063(5);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!qj;)V")
	public static void method1645(@OriginalArg(1) Class162 arg0) {
		Static15.aClass162_30 = arg0;
	}
}
