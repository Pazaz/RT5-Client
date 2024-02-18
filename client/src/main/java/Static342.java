import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "Lclient!fla;")
	public static Class130 aClass130_7;

	@OriginalMember(owner = "client!kp", name = "A", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_61 = new Class345(47, 7);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!jm;)V")
	public static void method4462(@OriginalArg(1) Class197 arg0) {
		Static636.aClass197_1 = arg0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ke;B)Z")
	public static boolean method4463(@OriginalArg(0) Class205 arg0) {
		return arg0 == null ? false : Static318.method8557(arg0.anInt5126 - arg0.anInt5123, -arg0.anInt5133 + arg0.anInt5134, arg0.anInt5123, arg0.anInt5131, arg0.anInt5133, arg0.anInt5125 - arg0.anInt5131);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZ)V")
	public static void method4464(@OriginalArg(0) int arg0) {
		if (Static299.anInt4825 == 1) {
			Static284.anInt4583 = arg0;
		} else if (Static299.anInt4825 == 2) {
			Static169.anInt2855 = arg0;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)V")
	public static void method4465(@OriginalArg(1) int arg0) {
		if (arg0 == Static537.anInt8170) {
			return;
		}
		Static720.anInt10859 = Static501.anInt7568 = Static238.anIntArray306[arg0];
		Static209.method3110();
		Static623.anIntArrayArrayArray19 = new int[4][Static720.anInt10859 >> 3][Static501.anInt7568 >> 3];
		Static148.anIntArrayArray64 = new int[Static720.anInt10859][Static501.anInt7568];
		Static341.anIntArrayArray133 = new int[Static720.anInt10859][Static501.anInt7568];
		for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
			Static577.aClass110Array1[local35] = Static125.method2219(Static720.anInt10859, Static501.anInt7568);
		}
		Static328.aByteArrayArrayArray4 = new byte[4][Static720.anInt10859][Static501.anInt7568];
		Static708.method9231(Static720.anInt10859, Static501.anInt7568);
		Static613.method8239(Static163.aClass19_17, Static501.anInt7568 >> 3, Static720.anInt10859 >> 3);
		Static537.anInt8170 = arg0;
	}
}
