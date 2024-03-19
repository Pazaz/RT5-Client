import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!gs", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!gs", name = "y", descriptor = "Lclient!qj;")
	public static Class162 aClass162_89;

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "[I")
	public static final int[] anIntArray169 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
	public static int anInt2618 = 1;

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString99 = "K";

	@OriginalMember(owner = "client!gs", name = "v", descriptor = "I")
	public static int anInt2619 = 0;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	public static void method2185(@OriginalArg(0) int arg0) {
		Static75.anInt2068 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static328.anInt6717; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static200.anInt4590; local6++) {
				if (Static241.aClass154ArrayArrayArray2[arg0][local3][local6] == null) {
					Static241.aClass154ArrayArrayArray2[arg0][local3][local6] = new Class154(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(BI)V")
	public static void method2186(@OriginalArg(1) int arg0) {
		Static233.anInt5206 = -1;
		Static311.anInt5198 = arg0;
		Static233.anInt5206 = -1;
		Static122.method2622();
	}
}
