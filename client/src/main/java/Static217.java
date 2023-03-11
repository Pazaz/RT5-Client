import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
	public static int anInt3818 = 0;

	@OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
	public static int anInt3821 = 0;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
	public static void method3795(@OriginalArg(1) int arg0) {
		if (arg0 == Static31.anInt752) {
			return;
		}
		Static373.anInt7033 = Static242.anInt4449 = Static353.anIntArray449[arg0];
		Static190.aClass19_8.method2872(50, (int) ((double) Static373.anInt7033 * 34.46D));
		Static301.anIntArrayArray50 = new int[Static373.anInt7033][Static242.anInt4449];
		Static319.anIntArrayArray51 = new int[Static373.anInt7033][Static242.anInt4449];
		Static310.anIntArrayArrayArray12 = new int[4][Static373.anInt7033 >> 3][Static242.anInt4449 >> 3];
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			Static171.aClass46Array1[local42] = Static24.method853(Static242.anInt4449, Static373.anInt7033);
		}
		Static230.aByteArrayArrayArray13 = new byte[4][Static373.anInt7033][Static242.anInt4449];
		Static236.method4104(Static373.anInt7033, Static242.anInt4449);
		Static190.method3500(Static242.anInt4449 >> 3, Static373.anInt7033 >> 3, Static190.aClass19_8);
		Static31.anInt752 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(Lclient!bt;B)Lclient!pd;")
	public static Class173_Sub2 method3799(@OriginalArg(0) Buffer arg0) {
		return new Class173_Sub2(arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.ig3(), arg0.ig3(), arg0.g1());
	}
}
