import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Lclient!sb;")
	public static Class330 aClass330_96;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
	public static final int anInt7634 = 4;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)V")
	public static void method6759(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static30.aFloat106 > Static30.aFloat105) {
			Static30.aFloat105 = (float) ((double) Static30.aFloat105 + (double) Static30.aFloat105 / 30.0D);
			if (Static30.aFloat106 < Static30.aFloat105) {
				Static30.aFloat105 = Static30.aFloat106;
			}
			Static387.method5440();
			Static30.anInt5643 = (int) Static30.aFloat105 >> 1;
			Static30.aByteArrayArrayArray5 = Static640.method8437(Static30.anInt5643);
		} else if (Static30.aFloat105 > Static30.aFloat106) {
			Static30.aFloat105 = (float) ((double) Static30.aFloat105 - (double) Static30.aFloat105 / 30.0D);
			if (Static30.aFloat106 > Static30.aFloat105) {
				Static30.aFloat105 = Static30.aFloat106;
			}
			Static387.method5440();
			Static30.anInt5643 = (int) Static30.aFloat105 >> 1;
			Static30.aByteArrayArrayArray5 = Static640.method8437(Static30.anInt5643);
		}
		if (Static180.anInt3001 != -1 && Static558.anInt3181 != -1) {
			@Pc(101) int local101 = Static180.anInt3001 - Static164.anInt2809;
			if (local101 < 2 || local101 > 2) {
				local101 /= 8;
			}
			@Pc(120) int local120 = Static558.anInt3181 - Static615.anInt9389;
			Static164.anInt2809 += local101;
			if (local120 < 2 || local120 > 2) {
				local120 /= 8;
			}
			if (local101 == 0 && local120 == 0) {
				Static558.anInt3181 = -1;
				Static180.anInt3001 = -1;
			}
			Static615.anInt9389 -= -local120;
			Static387.method5440();
		}
		if (Static320.anInt5084 > 0) {
			Static212.anInt3467--;
			if (Static212.anInt3467 == 0) {
				Static320.anInt5084--;
				Static212.anInt3467 = 100;
			}
		} else {
			Static475.anInt7168 = -1;
			Static409.anInt6318 = -1;
		}
		if (!Static95.aBoolean184 || Static551.aClass339_54 == null) {
			return;
		}
		for (@Pc(197) Class2_Sub37 local197 = (Class2_Sub37) Static551.aClass339_54.method7699(65280); local197 != null; local197 = (Class2_Sub37) Static551.aClass339_54.method7706()) {
			@Pc(206) Class105 local206 = Static30.aClass246_3.method5584(local197.aClass2_Sub20_1.anInt3131);
			if (local197.method5553(arg0, arg1)) {
				if (local206.aStringArray9 != null) {
					if (local206.aStringArray9[4] != null) {
						Static416.method5707(false, -1, (long) local197.aClass2_Sub20_1.anInt3131, local206.anInt2597, 0, local206.aStringArray9[4], 1004, true, -1, local206.aString24, (long) local197.aClass2_Sub20_1.anInt3131, false);
					}
					if (local206.aStringArray9[3] != null) {
						Static416.method5707(false, -1, (long) local197.aClass2_Sub20_1.anInt3131, local206.anInt2597, 0, local206.aStringArray9[3], 1009, true, -1, local206.aString24, (long) local197.aClass2_Sub20_1.anInt3131, false);
					}
					if (local206.aStringArray9[2] != null) {
						Static416.method5707(false, -1, (long) local197.aClass2_Sub20_1.anInt3131, local206.anInt2597, 0, local206.aStringArray9[2], 1006, true, -1, local206.aString24, (long) local197.aClass2_Sub20_1.anInt3131, false);
					}
					if (local206.aStringArray9[1] != null) {
						Static416.method5707(false, -1, (long) local197.aClass2_Sub20_1.anInt3131, local206.anInt2597, 0, local206.aStringArray9[1], 1001, true, -1, local206.aString24, (long) local197.aClass2_Sub20_1.anInt3131, false);
					}
					if (local206.aStringArray9[0] != null) {
						Static416.method5707(false, -1, (long) local197.aClass2_Sub20_1.anInt3131, local206.anInt2597, 0, local206.aStringArray9[0], 1003, true, -1, local206.aString24, (long) local197.aClass2_Sub20_1.anInt3131, false);
					}
				}
				if (!local197.aClass2_Sub20_1.aBoolean256) {
					local197.aClass2_Sub20_1.aBoolean256 = true;
					Static472.method6429(Static5.aClass242_1, local197.aClass2_Sub20_1.anInt3131, local206.anInt2597);
				}
				if (local197.aClass2_Sub20_1.aBoolean256) {
					Static472.method6429(Static639.aClass242_13, local197.aClass2_Sub20_1.anInt3131, local206.anInt2597);
				}
			} else if (local197.aClass2_Sub20_1.aBoolean256) {
				local197.aClass2_Sub20_1.aBoolean256 = false;
				Static472.method6429(Static280.aClass242_7, local197.aClass2_Sub20_1.anInt3131, local206.anInt2597);
			}
		}
	}
}
