import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!rq", name = "z", descriptor = "I")
	public static int anInt2790 = 0;

	@OriginalMember(owner = "client!rq", name = "A", descriptor = "Z")
	public static boolean aBoolean186 = false;

	@OriginalMember(owner = "client!rq", name = "D", descriptor = "[S")
	public static short[] aShortArray38 = new short[256];

	@OriginalMember(owner = "client!rq", name = "L", descriptor = "[I")
	public static final int[] anIntArray200 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(B)V")
	public static void method2311() {
		@Pc(1) Class215 local1 = Static209.aClass215_67;
		synchronized (Static209.aClass215_67) {
			Static209.aClass215_67.method6060();
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2314(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static342.method6043(arg0, "%0a", "\n"));
	}
}
