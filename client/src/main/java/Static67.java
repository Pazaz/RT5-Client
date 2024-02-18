import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "Lclient!hda;")
	public static Class158 aClass158_10;

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
	public static int anInt6784;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method6098(@OriginalArg(1) String arg0) {
		Static44.method1072(arg0, "", 0, "", "", 4);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIZB)I")
	public static int method6099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class2_Sub22 local8 = Static556.method7303(arg1, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(29) int local29 = 0; local29 < local8.anIntArray279.length; local29++) {
				if (arg0 == local8.anIntArray278[local29]) {
					local21 += local8.anIntArray279[local29];
				}
			}
			return local21;
		}
	}
}
