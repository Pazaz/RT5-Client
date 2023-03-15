import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "[Lclient!pr;")
	public static final Class185[] aClass185Array1 = new Class185[4];

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	public static void method5283() {
		Static23.aClass2_Sub5_1 = new Class2_Sub5(Static259.aClass79_105.getLocalized(client.language), "", Static107.anInt2219, 1001, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILclient!id;)J")
	public static long method5284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface6 arg2) {
		@Pc(13) long local13 = 4194304L;
		@Pc(15) long local15 = 2147483648L;
		@Pc(17) long local17 = Long.MIN_VALUE;
		@Pc(24) LocType local24 = client.LocTypes.get(arg2.method6085());
		@Pc(45) long local45 = (long) ((arg2.method6081() | 0x10000) << 14 | arg1 | arg0 << 7 | arg2.method6084() << 20);
		if (local24.anInt1335 == 0) {
			local45 |= local17;
		}
		if (local24.anInt1354 == 1) {
			local45 |= local13;
		}
		if (local24.aBoolean108) {
			local45 |= local15;
		}
		return local45 | (long) arg2.method6085() << 32;
	}
}
