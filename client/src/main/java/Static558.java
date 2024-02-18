import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static558 {

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "[Lclient!st;")
	public static Class23[] aClass23Array7;

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
	public static int anInt3181 = -1;

	@OriginalMember(owner = "client!rk", name = "A", descriptor = "[[F")
	public static final float[][] aFloatArrayArray2 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
	public static int anInt3187 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)Z")
	public static boolean method2895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
