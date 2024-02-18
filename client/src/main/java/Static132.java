import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public static int anInt2451;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
	public static boolean aBoolean208 = false;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_54 = new Class225(91, -1);

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
	public static void method2312() {
		@Pc(16) byte[] local16;
		if (Static177.anObject6 == null) {
			@Pc(9) Class35_Sub2_Sub1 local9 = new Class35_Sub2_Sub1();
			local16 = local9.method4596();
			Static177.anObject6 = Static247.method3524(local16);
		}
		if (Static644.anObject18 == null) {
			@Pc(31) Class35_Sub1_Sub2 local31 = new Class35_Sub1_Sub2();
			local16 = local31.method5438();
			Static644.anObject18 = Static247.method3524(local16);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	public static void method2313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7;
		if (Static608.anInt9289 != arg1) {
			Static54.anIntArray92 = new int[arg1];
			for (local7 = 0; local7 < arg1; local7++) {
				Static54.anIntArray92[local7] = (local7 << 12) / arg1;
			}
			Static576.anInt8580 = arg1 - 1;
			Static608.anInt9289 = arg1;
			Static675.anInt10157 = arg1 * 32;
		}
		if (arg0 == Static2.anInt53) {
			return;
		}
		if (Static608.anInt9289 == arg0) {
			Static273.anIntArray341 = Static54.anIntArray92;
		} else {
			Static273.anIntArray341 = new int[arg0];
			for (local7 = 0; local7 < arg0; local7++) {
				Static273.anIntArray341[local7] = (local7 << 12) / arg0;
			}
		}
		Static489.anInt7343 = arg0 - 1;
		Static2.anInt53 = arg0;
	}
}
