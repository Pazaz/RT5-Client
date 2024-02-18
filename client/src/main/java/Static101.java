import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dca", name = "w", descriptor = "I")
	public static int anInt2097;

	@OriginalMember(owner = "client!dca", name = "v", descriptor = "I")
	public static int anInt2098;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V")
	public static void method2000() {
		for (@Pc(8) Class2_Sub51 local8 = (Class2_Sub51) Static460.aClass339_40.method7699(65280); local8 != null; local8 = (Class2_Sub51) Static460.aClass339_40.method7706()) {
			if (local8.aBoolean713) {
				local8.method8236();
			}
		}
		for (@Pc(31) Class2_Sub51 local31 = (Class2_Sub51) Static717.aClass339_81.method7699(65280); local31 != null; local31 = (Class2_Sub51) Static717.aClass339_81.method7706()) {
			if (local31.aBoolean713) {
				local31.method8236();
			}
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "([[BBLclient!taa;)V")
	public static void method2001(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class306_Sub1 arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.anInt8913; local1++) {
			Static557.method7331();
			for (@Pc(6) int local6 = 0; local6 < Static720.anInt10859 >> 3; local6++) {
				for (@Pc(9) int local9 = 0; local9 < Static501.anInt7568 >> 3; local9++) {
					@Pc(18) int local18 = Static623.anIntArrayArrayArray19[local1][local6][local9];
					if (local18 != -1) {
						@Pc(27) int local27 = local18 >> 24 & 0x3;
						if (!arg1.aBoolean673 || local27 == 0) {
							@Pc(43) int local43 = local18 >> 1 & 0x3;
							@Pc(49) int local49 = local18 >> 14 & 0x3FF;
							@Pc(55) int local55 = local18 >> 3 & 0x7FF;
							@Pc(65) int local65 = local55 / 8 + (local49 / 8 << 8);
							for (@Pc(67) int local67 = 0; local67 < Static89.anIntArray169.length; local67++) {
								if (Static89.anIntArray169[local67] == local65 && arg0[local67] != null) {
									arg1.method7897((local49 & 0x7) * 8, Static577.aClass110Array1, local1, Static163.aClass19_17, local6 * 8, local9 * 8, arg0[local67], local43, local27, (local55 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
