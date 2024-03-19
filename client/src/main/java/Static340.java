import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
	public static int anInt7186;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "[Lclient!qa;")
	public static Class29[] aClass29Array16;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray57;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
	public static int anInt7187 = 255;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
	public static int anInt7188 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIB)I")
	public static int method6026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 24;
		@Pc(16) int local16 = 255 - local12;
		@Pc(34) int local34 = ((arg1 & 0xFF00) * local12 & 0xFF0000 | (arg1 & 0xFF00FF) * local12 & 0xFF00FF00) >>> 8;
		return ((local16 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local16 & 0xFF00FF00) >>> 8) + local34;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
	public static void method6028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(5, arg0);
		local8.method2539();
		local8.anInt2960 = arg1;
	}
}
