import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	public static int anInt3318;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "[Lclient!wk;")
	public static final SynthSound[] aClass247Array2 = new SynthSound[50];

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public static int anInt3317 = -1;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[100];

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)Z")
	public static boolean method3310() {
		try {
			if (Static235.anInt3365 == 2) {
				if (Static155.aClass2_Sub34_1 == null) {
					Static155.aClass2_Sub34_1 = Static407.method5448(Static116.aClass197_26, Static105.anInt2183, Static341.anInt6376);
					if (Static155.aClass2_Sub34_1 == null) {
						return false;
					}
				}
				if (Static164.aClass24_1 == null) {
					Static164.aClass24_1 = new SoundBank(Static123.aClass197_30, Static177.aClass197_48);
				}
				if (Static91.aClass2_Sub12_Sub3_1.method4281(Static164.aClass24_1, Static155.aClass2_Sub34_1, Static111.aClass197_25)) {
					Static91.aClass2_Sub12_Sub3_1.releaseInstruments();
					Static91.aClass2_Sub12_Sub3_1.method4278(Static356.anInt6641);
					Static91.aClass2_Sub12_Sub3_1.method4273(Static155.aClass2_Sub34_1, Static384.aBoolean485);
					Static155.aClass2_Sub34_1 = null;
					Static116.aClass197_26 = null;
					Static164.aClass24_1 = null;
					Static235.anInt3365 = 0;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static91.aClass2_Sub12_Sub3_1.method4274();
			Static235.anInt3365 = 0;
			Static164.aClass24_1 = null;
			Static116.aClass197_26 = null;
			Static155.aClass2_Sub34_1 = null;
		}
		return false;
	}
}
