import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static712 {

	@OriginalMember(owner = "client!wj", name = "Lc", descriptor = "Lclient!tt;")
	public static Class73 aClass73_11;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
	public static void method9323() {
		for (@Pc(1) int local1 = 0; local1 < Static125.anInt2352; local1++) {
			@Pc(6) Class8_Sub2_Sub1 local6 = Static679.aClass8_Sub2_Sub1Array1[local1];
			Static549.method8293(local6, true);
			Static679.aClass8_Sub2_Sub1Array1[local1] = null;
		}
		Static125.anInt2352 = 0;
	}

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "(B)V")
	public static void method9329(@OriginalArg(0) byte arg0) {
		@Pc(7) client local7 = Static295.aClient1;
		synchronized (Static295.aClient1) {
			if (Static316.aFrame8 != null) {
				return;
			}
			@Pc(22) Container local22;
			if (Static353.aFrame10 != null) {
				local22 = Static353.aFrame10;
			} else if (Static166.anApplet1 == null) {
				local22 = Static149.anApplet_Sub1_1;
			} else {
				local22 = Static166.anApplet1;
			}
			Static52.anInt1059 = local22.getSize().width;
			Static54.anInt1084 = local22.getSize().height;
			@Pc(44) Insets local44;
			if (local22 == Static353.aFrame10) {
				local44 = Static353.aFrame10.getInsets();
				Static54.anInt1084 -= local44.top + local44.bottom;
				Static52.anInt1059 -= local44.right + local44.left;
			}
			if (Static36.method978(arg0 - 8) == 1) {
				Static241.anInt3962 = 0;
				Static380.anInt5979 = Static479.anInt7201;
				Static134.anInt10329 = (Static52.anInt1059 - Static302.anInt4851) / 2;
				Static680.anInt10289 = Static302.anInt4851;
			} else {
				Static323.method4625();
			}
			if (Static2.aClass355_1 != Static446.aClass355_5) {
				@Pc(101) boolean local101;
				if (Static680.anInt10289 < 1024 && Static380.anInt5979 < 768) {
					local101 = true;
				} else {
					local101 = false;
				}
			}
			Static434.aCanvas7.setSize(Static680.anInt10289, Static380.anInt5979);
			if (Static163.aClass19_17 != null) {
				if (Static137.aBoolean210) {
					Static575.method7606(Static434.aCanvas7);
				} else {
					Static163.aClass19_17.method7935(Static434.aCanvas7, Static680.anInt10289, Static380.anInt5979);
				}
			}
			if (local22 == Static353.aFrame10) {
				local44 = Static353.aFrame10.getInsets();
				Static434.aCanvas7.setLocation(local44.left + Static134.anInt10329, local44.top + Static241.anInt3962);
			} else {
				Static434.aCanvas7.setLocation(Static134.anInt10329, Static241.anInt3962);
			}
			if (Static377.anInt5930 != -1) {
				Static640.method8435(true);
			}
			Static288.method4182();
		}
		if (arg0 != 11) {
			aClass73_11 = null;
		}
	}
}
