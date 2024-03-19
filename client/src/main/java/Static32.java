import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	public static int anInt7023;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray56;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
	public static final int[] anIntArray572 = new int[5];

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray55 = new byte[50][];

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "[I")
	public static final int[] anIntArray573 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString264 = "yellow:";

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Z")
	public static boolean aBoolean504 = false;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!qj;)V")
	public static void method5953(@OriginalArg(1) Class162 arg0) {
		Static174.aClass162_140 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)I")
	public static int method5954() {
		return Static342.anInt7214;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	public static void method5955() {
		for (@Pc(3) int local3 = 0; local3 < Static318.anInt6552; local3++) {
			@Pc(9) int local9 = Static31.anIntArray61[local3];
			@Pc(13) Class7_Sub1_Sub1_Sub2 local13 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local9];
			@Pc(17) int local17 = Static299.aClass1_Sub16_Sub2_3.method5761();
			if ((local17 & 0x1) != 0) {
				local17 += Static299.aClass1_Sub16_Sub2_3.method5761() << 8;
			}
			Static55.method1390(local17, local13, local9);
		}
	}
}
