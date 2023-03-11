import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!du", name = "b", descriptor = "Z")
	public static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZ)V")
	public static void method1780(@OriginalArg(1) boolean arg0) {
		Static242.anInt4450 = 0;
		Static343.anInt6390 = 0;
		Static315.method5382();
		Static17.method4210(arg0);
		Static236.method4112();
		@Pc(24) int local24;
		for (@Pc(18) int local18 = 0; local18 < Static242.anInt4450; local18++) {
			local24 = Static17.anIntArray291[local18];
			if (Static114.anInt2348 != Static365.aClass11_Sub5_Sub2_Sub2Array1[local24].anInt4610) {
				if (Static365.aClass11_Sub5_Sub2_Sub2Array1[local24].aClass71_1.method2099()) {
					Static154.method2781(Static365.aClass11_Sub5_Sub2_Sub2Array1[local24]);
				}
				Static365.aClass11_Sub5_Sub2_Sub2Array1[local24].method4342(null);
				Static365.aClass11_Sub5_Sub2_Sub2Array1[local24] = null;
			}
		}
		if (Static212.aClass2_Sub4_Sub2_3.pos != Static82.anInt1836) {
			throw new RuntimeException("gnp1 pos:" + Static212.aClass2_Sub4_Sub2_3.pos + " psize:" + Static82.anInt1836);
		}
		for (local24 = 0; local24 < Static166.anInt3187; local24++) {
			if (Static365.aClass11_Sub5_Sub2_Sub2Array1[Static211.anIntArray230[local24]] == null) {
				throw new RuntimeException("gnp2 pos:" + local24 + " size:" + Static166.anInt3187);
			}
		}
	}
}
