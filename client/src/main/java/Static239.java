import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!nn", name = "U", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_95 = new LocalizedString("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)V")
	public static void method4152(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) Class2_Sub19 local12 = (Class2_Sub19) Static83.aClass135_14.head(); local12 != null; local12 = (Class2_Sub19) Static83.aClass135_14.next()) {
			if (local12.aClass2_Sub12_Sub4_3 != null) {
				client.soundStream.method2081(local12.aClass2_Sub12_Sub4_3);
				local12.aClass2_Sub12_Sub4_3 = null;
			}
			if (local12.aClass2_Sub12_Sub4_2 != null) {
				client.soundStream.method2081(local12.aClass2_Sub12_Sub4_2);
				local12.aClass2_Sub12_Sub4_2 = null;
			}
			local12.unlink();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(55) Class2_Sub19 local55 = (Class2_Sub19) Static363.aClass135_39.head(); local55 != null; local55 = (Class2_Sub19) Static363.aClass135_39.next()) {
			if (local55.aClass2_Sub12_Sub4_3 != null) {
				client.soundStream.method2081(local55.aClass2_Sub12_Sub4_3);
				local55.aClass2_Sub12_Sub4_3 = null;
			}
			local55.unlink();
		}
		for (@Pc(82) Class2_Sub19 local82 = (Class2_Sub19) Static232.aClass4_86.head(); local82 != null; local82 = (Class2_Sub19) Static232.aClass4_86.next()) {
			if (local82.aClass2_Sub12_Sub4_3 != null) {
				client.soundStream.method2081(local82.aClass2_Sub12_Sub4_3);
				local82.aClass2_Sub12_Sub4_3 = null;
			}
			local82.unlink();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!wm;B)V")
	public static void method4156(@OriginalArg(0) RasteriserBase arg0) {
		if (PlayerList.self.plane != Static343.anInt6389 && (Scene.aClass67ArrayArrayArray3 != null && Static49.method1472(arg0, PlayerList.self.plane))) {
			Static343.anInt6389 = PlayerList.self.plane;
		}
	}
}
