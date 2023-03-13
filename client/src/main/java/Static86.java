import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
	public static int anInt1868;

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!eq", name = "D", descriptor = "[I")
	public static int[] anIntArray122 = new int[2];

	@OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
	public static int anInt1870 = 0;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(ZI)V")
	public static void method1934(@OriginalArg(1) int arg0) {
		@Pc(12) DelayedStateChange local12 = Static316.method5413(10, arg0);
		local12.method2312();
	}
}
