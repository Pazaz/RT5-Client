import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static68 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!gt;")
	public static Class151 aClass151_3;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Lclient!kr;")
	public static Class215 aClass215_3;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "[I")
	public static int[] anIntArray316;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	public static final int anInt4096 = 16777215;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(JZ)I")
	public static int method3585(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}
}
