import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!om", name = "A", descriptor = "I")
	public static int anInt4716;

	@OriginalMember(owner = "client!om", name = "ob", descriptor = "I")
	public static int anInt4745;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "I")
	public static final int anInt4720 = anInt4716;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "[I")
	public static final int[] anIntArray321 = new int[50];

	@OriginalMember(owner = "client!om", name = "fb", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_102 = new Class79("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!om", name = "nb", descriptor = "I")
	public static final int anInt4744 = anInt4716 >> 2;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IJ)V")
	public static void method4395(@OriginalArg(1) long arg0) {
		@Pc(12) int local12 = Static394.anInt7264;
		@Pc(20) int local20;
		@Pc(28) int local28;
		if (local12 != Static288.anInt5463) {
			local20 = local12 - Static288.anInt5463;
			local28 = (int) (arg0 * (long) local20 / 320L);
			if (local20 > 0) {
				if (local28 == 0) {
					local28 = 1;
				} else if (local28 > local20) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = -1;
			} else if (local28 < local20) {
				local28 = local20;
			}
			Static288.anInt5463 += local28;
		}
		@Pc(66) int local66 = Static348.anInt6448;
		if (!Static218.aClass177_Sub1_2.aBoolean351) {
			Static277.aFloat67 += Static184.aFloat39 * (float) arg0 / 40.0F * 8.0F;
			Static31.aFloat28 += (float) arg0 * Static296.aFloat68 / 40.0F * 8.0F;
		}
		if (local66 != Static62.anInt2395) {
			local20 = local66 - Static62.anInt2395;
			local28 = (int) (arg0 * (long) local20 / 320L);
			if (local20 > 0) {
				if (local28 == 0) {
					local28 = 1;
				} else if (local20 < local28) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = -1;
			} else if (local20 > local28) {
				local28 = local20;
			}
			Static62.anInt2395 += local28;
		}
		Static338.method6141();
	}
}
