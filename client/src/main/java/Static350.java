import org.openrs2.deob.annotation.OriginalMember;

public final class Static350 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_135 = new LocalizedString("K", "T", "K", "K");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method5837() {
		if (Static140.aBoolean187) {
			return;
		}
		Static140.aBoolean187 = true;
		Static100.aBoolean156 = true;
		if (client.preferences.aBoolean351) {
			Camera.pitchTarget = (int) Camera.pitchTarget + 47 & 0xFFFFFFF0;
		} else {
			Static296.aFloat68 += (12.0F - Static296.aFloat68) / 2.0F;
		}
	}

}
