import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class DevConsole {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void log(@OriginalArg(0) String arg0) {
		if (Static124.aStringArray65 == null) {
			Static148.method2709();
		}
		@Pc(22) String[] local22 = Static200.method3643('\n', arg0);
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			for (@Pc(28) int local28 = Static368.anInt6917; local28 > 0; local28--) {
				Static124.aStringArray65[local28] = Static124.aStringArray65[local28 - 1];
			}
			Static124.aStringArray65[0] = local22[local24];
			if (Static124.aStringArray65.length - 1 > Static368.anInt6917) {
				if (Static177.anInt3385 > 0) {
					Static177.anInt3385++;
				}
				Static368.anInt6917++;
			}
		}
	}

}
