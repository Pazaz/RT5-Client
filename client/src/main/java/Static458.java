import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_31 = new Class155(20);

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "Lclient!mia;")
	public static final Class242 aClass242_11 = new Class242("", 18);

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "[I")
	public static final int[] anIntArray553 = new int[250];

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z[[[Lclient!pha;)V")
	public static void method6243(@OriginalArg(1) Class291[][][] arg0) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(17) Class291[][] local17 = arg0[local12];
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				for (@Pc(22) int local22 = 0; local22 < local17[local19].length; local22++) {
					@Pc(29) Class291 local29 = local17[local19][local22];
					if (local29 != null) {
						if (local29.aClass8_Sub2_Sub2_1 instanceof Interface25) {
							((Interface25) local29.aClass8_Sub2_Sub2_1).method6856();
						}
						if (local29.aClass8_Sub2_Sub4_1 instanceof Interface25) {
							((Interface25) local29.aClass8_Sub2_Sub4_1).method6856();
						}
						if (local29.aClass8_Sub2_Sub4_2 instanceof Interface25) {
							((Interface25) local29.aClass8_Sub2_Sub4_2).method6856();
						}
						if (local29.aClass8_Sub2_Sub3_2 instanceof Interface25) {
							((Interface25) local29.aClass8_Sub2_Sub3_2).method6856();
						}
						if (local29.aClass8_Sub2_Sub3_1 instanceof Interface25) {
							((Interface25) local29.aClass8_Sub2_Sub3_1).method6856();
						}
						for (@Pc(91) Class286 local91 = local29.aClass286_2; local91 != null; local91 = local91.aClass286_1) {
							@Pc(95) Class8_Sub2_Sub1 local95 = local91.aClass8_Sub2_Sub1_1;
							if (local95 instanceof Interface25) {
								((Interface25) local95).method6856();
							}
						}
					}
				}
			}
		}
	}
}
