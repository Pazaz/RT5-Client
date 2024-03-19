import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "[Lclient!so;")
	public static Class186[] aClass186Array1;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "Z")
	public static boolean aBoolean232 = false;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)Z")
	public static boolean method2893(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static75.anInt2068; local1 < Static214.anInt4867; local1++) {
			@Pc(6) Class154[][] local6 = Static241.aClass154ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static292.anInt6117; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static328.anInt6714 + local9;
				@Pc(18) int local18 = Static328.anInt6714 - local9;
				if (local14 >= Static76.anInt2086 || local18 < Static53.anInt1599) {
					for (@Pc(27) int local27 = -Static292.anInt6117; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static61.anInt1677 + local27;
						@Pc(36) int local36 = Static61.anInt1677 - local27;
						@Pc(48) Class154 local48;
						if (local14 >= Static76.anInt2086) {
							if (local32 >= Static29.anInt6406) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean369) {
									Static141.aBoolean243 = arg0;
									Static110.aClass23_2.method1379(local48);
									Static110.aClass23_2.method1381();
								}
							}
							if (local36 < Static130.anInt6803) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean369) {
									Static141.aBoolean243 = arg0;
									Static110.aClass23_2.method1379(local48);
									Static110.aClass23_2.method1381();
								}
							}
						}
						if (local18 < Static53.anInt1599) {
							if (local32 >= Static29.anInt6406) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean369) {
									Static141.aBoolean243 = arg0;
									Static110.aClass23_2.method1379(local48);
									Static110.aClass23_2.method1381();
								}
							}
							if (local36 < Static130.anInt6803) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean369) {
									Static141.aBoolean243 = arg0;
									Static110.aClass23_2.method1379(local48);
									Static110.aClass23_2.method1381();
								}
							}
						}
						if (Static160.anInt7325 == 0) {
							if (Static46.aBoolean482) {
								Static110.aClass23_2.method1374(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public static void method2894() {
		Static159.aClass215_63.method6060();
	}
}
