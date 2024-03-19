import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static346 {

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "[[I")
	public static int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString270;

	@OriginalMember(owner = "client!wh", name = "I", descriptor = "[[B")
	public static byte[][] aByteArrayArray58;

	@OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
	public static int anInt7306;

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "Z")
	public static final boolean aBoolean517 = false;

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
	public static int anInt7304 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ro;ZII)V")
	public static void method6109(@OriginalArg(0) Class177 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static166.anInt4022 = arg2;
		Static127.anInt3239 = arg1;
		Static302.aClass177_20 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)V")
	public static void method6111(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static134.anInt3395 = arg0;
	}
}
