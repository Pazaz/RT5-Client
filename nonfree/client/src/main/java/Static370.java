import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_152 = new Class225(4, 0);

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	public static int anInt5876 = 0;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "Lclient!pc;")
	public static final Class287 aClass287_11 = new Class287(9, -1);

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
	public static int anInt5881 = 0;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V")
	public static void method5279() {
		if (Static620.method8321(Static283.anInt4574)) {
			Static233.method3409(false);
		} else {
			Static467.aClass348_2 = Static405.aClass153_2.aClass348_1;
			Static405.aClass153_2.aClass348_1 = null;
			Static81.method1586(14);
		}
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
	public static void method5280() {
		@Pc(12) int local12;
		if (Static384.aClass75Array2 != null) {
			for (local12 = 0; local12 < Static317.anInt5046; local12++) {
				Static384.aClass75Array2[local12] = null;
			}
			Static384.aClass75Array2 = null;
		}
		if (Static607.aClass75Array4 != null) {
			for (local12 = 0; local12 < Static444.anInt6751; local12++) {
				Static607.aClass75Array4[local12] = null;
			}
			Static607.aClass75Array4 = null;
		}
		if (Static285.aClass75Array1 != null) {
			for (local12 = 0; local12 < Static150.anInt2634; local12++) {
				Static285.aClass75Array1[local12] = null;
			}
			Static285.aClass75Array1 = null;
		}
		Static560.aClass75Array3 = null;
		Static446.anIntArrayArrayArray9 = null;
		Static485.anIntArray886 = null;
		Static624.anInt9461 = -1;
		Static228.anInt3709 = -1;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)[Lclient!kda;")
	public static Class204[] method5281() {
		return new Class204[] { Static515.aClass204_10, Static77.aClass204_1, Static565.aClass204_9, Static535.aClass204_11, Static166.aClass204_6, Static541.aClass204_12, Static647.aClass204_13, Static189.aClass204_7, Static667.aClass204_15, Static505.aClass204_16 };
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLclient!ep;Lclient!ep;)V")
	public static void method5282(@OriginalArg(1) Class8 arg0, @OriginalArg(2) Class8 arg1) {
		if (arg0.aClass8_67 != null) {
			arg0.method9274();
		}
		arg0.aClass8_68 = arg1;
		arg0.aClass8_67 = arg1.aClass8_67;
		arg0.aClass8_67.aClass8_68 = arg0;
		arg0.aClass8_68.aClass8_67 = arg0;
	}
}
