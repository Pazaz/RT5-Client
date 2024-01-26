import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_69 = new Class345(20, 8);

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "[Lclient!fk;")
	public static final Class2_Sub19[] aClass2_Sub19Array1 = new Class2_Sub19[300];

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)I")
	public static int method5290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static60.anIntArray111[arg0 & 0x3] : Static353.anIntArray748[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZZ)I")
	public static int method5291(@OriginalArg(0) boolean arg0) {
		if (Static552.anIntArray753 == null) {
			return 0;
		} else if (arg0 || Static378.aClass70Array1 == null) {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < Static552.anIntArray753.length; local31++) {
				@Pc(36) int local36 = Static552.anIntArray753[local31];
				if (Static555.aClass330_106.method7581(local36)) {
					local29++;
				}
				if (Static237.aClass330_87.method7581(local36)) {
					local29++;
				}
			}
			return local29;
		} else {
			return Static552.anIntArray753.length * 2;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!hda;I)I")
	public static int method5292(@OriginalArg(0) int arg0, @OriginalArg(1) Class158 arg1) {
		if (!Static84.method1661(arg1).method6221(arg0) && arg1.anObjectArray15 == null) {
			return -1;
		} else if (arg1.anIntArray301 == null || arg0 >= arg1.anIntArray301.length) {
			return -1;
		} else {
			return arg1.anIntArray301[arg0];
		}
	}
}
