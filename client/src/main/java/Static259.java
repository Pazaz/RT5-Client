import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_105 = new LocalizedString("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_106 = new LocalizedString("M", "M", "M", "M");

	@OriginalMember(owner = "client!oq", name = "x", descriptor = "[I")
	public static final int[] anIntArray323 = new int[13];

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(III)V")
	public static void method4429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Scene.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass11_Sub1_3 != null) {
			local7.aClass11_Sub1_3 = null;
		}
		if (local7.aClass11_Sub1_2 != null) {
			local7.aClass11_Sub1_2 = null;
		}
	}
}
