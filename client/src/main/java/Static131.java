import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Lclient!cm;")
	public static Class36 aClass36_4;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_82 = new LocalizedString("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "[S")
	public static final short[] aShortArray65 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method3697(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		client.jsArchive19.discardUnpacked = 1;
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(21) short[] local21 = new short[16];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < client.ObjTypes.anInt2779; local25++) {
			@Pc(34) ObjType local34 = client.ObjTypes.get(local25);
			if ((!arg1 || local34.aBoolean381) && local34.anInt5258 == -1 && local34.anInt5235 == -1 && local34.anInt5214 == 0 && local34.aString55.toLowerCase().indexOf(local18) != -1) {
				if (local23 >= 250) {
					Static328.anInt6127 = -1;
					Static177.aShortArray56 = null;
					return;
				}
				if (local21.length <= local23) {
					@Pc(84) short[] local84 = new short[local21.length * 2];
					for (@Pc(86) int local86 = 0; local86 < local23; local86++) {
						local84[local86] = local21[local86];
					}
					local21 = local84;
				}
				local21[local23++] = (short) local25;
			}
		}
		Static12.anInt266 = 0;
		Static177.aShortArray56 = local21;
		Static328.anInt6127 = local23;
		@Pc(128) String[] local128 = new String[Static328.anInt6127];
		for (@Pc(130) int local130 = 0; local130 < Static328.anInt6127; local130++) {
			local128[local130] = client.ObjTypes.get(local21[local130]).aString55;
		}
		Static135.method2534(local128, Static177.aShortArray56);
		client.jsArchive19.discardUnpacked();
		client.jsArchive19.discardUnpacked = 2;
	}
}
