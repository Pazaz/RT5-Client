import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static116 {

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
	public static int anInt2268;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
	public static int anInt2270;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Z")
	public static boolean method2142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
