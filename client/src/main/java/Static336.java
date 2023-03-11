import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "Lclient!r;")
	public static Class197 aClass197_90;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "Lclient!vq;")
	public static Class241 aClass241_5;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "Lclient!h;")
	public static final Class89 aClass89_225 = new Class89(45, 1);

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_130 = new Class79("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
	public static int anInt6313 = 0;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(IB)V")
	public static void method5705(@OriginalArg(0) int arg0) {
		if (Static347.anInt6442 == arg0) {
			return;
		}
		if (Static347.anInt6442 == 0) {
			Static103.method2177();
		}
		if (arg0 == 40) {
			Static230.method4014();
		}
		if (arg0 != 40 && Static246.aClass111_2 != null) {
			Static246.aClass111_2.close();
			Static246.aClass111_2 = null;
		}
		if (Static347.anInt6442 == 25 || Static347.anInt6442 == 28) {
			Static289.aClass197_71.anInt5558 = 2;
			Static226.aClass197_61.anInt5558 = 2;
			Static391.aClass197_96.anInt5558 = 2;
			Static216.aClass197_57.anInt5558 = 2;
			Static61.aClass197_12.anInt5558 = 2;
			Static139.aClass197_35.anInt5558 = 2;
			Static173.aClass197_45.anInt5558 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static305.anInt5742 = 0;
			Static144.anInt2694 = 0;
			Static65.anInt1588 = 1;
			Static246.anInt4505 = 0;
			Static190.anInt3541 = 1;
			Static241.method4192(true);
			Static289.aClass197_71.anInt5558 = 1;
			Static226.aClass197_61.anInt5558 = 1;
			Static391.aClass197_96.anInt5558 = 1;
			Static216.aClass197_57.anInt5558 = 1;
			Static61.aClass197_12.anInt5558 = 1;
			Static139.aClass197_35.anInt5558 = 1;
			Static173.aClass197_45.anInt5558 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static322.method5485();
		}
		if (arg0 == 5) {
			Static348.method5830(Static30.aClass197_5, Static190.aClass19_8);
		} else {
			Static67.method1772();
		}
		@Pc(146) boolean local146 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(165) boolean local165 = Static347.anInt6442 == 5 || Static347.anInt6442 == 10 || Static347.anInt6442 == 28;
		if (local146 != local165) {
			if (local146) {
				Static171.anInt3268 = Static97.anInt2049;
				if (Static218.aClass177_Sub1_2.anInt4889 == 0) {
					Static174.method1507();
				} else {
					Static249.method4150(Static218.aClass177_Sub1_2.anInt4889, Static101.aClass197_23, Static97.anInt2049);
				}
				Static287.js5NetQueue.method4647(false);
			} else {
				Static174.method1507();
				Static287.js5NetQueue.method4647(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static190.aClass19_8.method2804();
		}
		Static347.anInt6442 = arg0;
	}
}
