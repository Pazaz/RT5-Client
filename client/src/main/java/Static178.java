import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static178 {

	@OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
	public static int anInt2947;

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "Lclient!mla;")
	public static Class247 aClass247_1;

	@OriginalMember(owner = "client!fj", name = "C", descriptor = "Z")
	public static boolean aBoolean251 = false;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!hda;)V")
	public static void method2729(@OriginalArg(1) Class158 arg0) {
		if (arg0.anInt3813 == Static171.anInt2880) {
			Static364.aBooleanArray18[arg0.anInt3752] = true;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Z")
	public static boolean method2730(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
