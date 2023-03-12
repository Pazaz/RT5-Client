import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
	public static int anInt4689;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
	public static int anInt4693;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_166 = new ClientProt(42, -1);

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Lclient!un;")
	public static GameShell anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "()V")
	public static void method4366() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static390.aClass67ArrayArrayArray5 != null) {
			for (local3 = 0; local3 < Static390.aClass67ArrayArrayArray5.length; local3++) {
				for (local6 = 0; local6 < Static72.anInt1684; local6++) {
					for (local9 = 0; local9 < Static210.anInt3773; local9++) {
						if (Static390.aClass67ArrayArrayArray5[local3][local6][local9] != null) {
							Static390.aClass67ArrayArrayArray5[local3][local6][local9].method1964();
						}
						Static390.aClass67ArrayArrayArray5[local3][local6][local9] = null;
					}
				}
			}
		}
		Static390.aClass67ArrayArrayArray5 = null;
		Static330.aClass6Array3 = null;
		if (Static90.aClass67ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static90.aClass67ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static72.anInt1684; local6++) {
					for (local9 = 0; local9 < Static210.anInt3773; local9++) {
						if (Static90.aClass67ArrayArrayArray4[local3][local6][local9] != null) {
							Static90.aClass67ArrayArrayArray4[local3][local6][local9].method1964();
						}
						Static90.aClass67ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static90.aClass67ArrayArrayArray4 = null;
		Static186.aClass6Array2 = null;
		Static330.aClass67ArrayArrayArray3 = null;
		Static365.aClass6Array4 = null;
		Static266.anInt4901 = 0;
		if (Static246.aClass58Array3 != null) {
			for (local3 = 0; local3 < Static266.anInt4901; local3++) {
				Static246.aClass58Array3[local3] = null;
			}
		}
		if (Static98.aClass11_Sub5Array1 != null) {
			for (local3 = 0; local3 < Static378.anInt7077; local3++) {
				Static98.aClass11_Sub5Array1[local3] = null;
			}
			Static378.anInt7077 = 0;
		}
		if (Static306.aClass2_Sub26_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static164.anInt3139; local3++) {
				Static306.aClass2_Sub26_Sub1Array2[local3] = null;
			}
			for (local6 = 0; local6 < Static92.anInt1914; local6++) {
				for (local9 = 0; local9 < Static72.anInt1684; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static210.anInt3773; local160++) {
						Static51.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static164.anInt3139 = 0;
		}
		Static165.anIntArrayArrayArray9 = null;
		Static339.method5759();
		Static34.aClass36_6.method1416();
		Static314.aByteArrayArray17 = null;
		Static82.anIntArrayArray16 = null;
		Static32.aByteArrayArray4 = null;
		Static163.aClass15_1 = null;
		Static51.aClass14_2 = null;
		Static16.aClass19_10 = null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIB)I")
	public static int method4368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	public static void method4369() {
		if (Static97.anInt2034 != -1) {
			Static258.method4402(false, -1, Static97.anInt2034, -1);
			Static97.anInt2034 = -1;
		}
	}
}
