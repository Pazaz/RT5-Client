import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!of", name = "z", descriptor = "[[Lclient!hda;")
	public static Class158[][] aClass158ArrayArray2;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!eo;III)V")
	public static void method6209(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class291 local12;
		if (arg2 < Static619.anInt1566) {
			local12 = Static334.aClass291ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass8_Sub2_Sub2_1 != null && local12.aClass8_Sub2_Sub2_1.method9290(0)) {
				arg0.method9285(0, true, Static665.aClass19_15, 0, (byte) 108, Static340.anInt5586, local12.aClass8_Sub2_Sub2_1);
			}
		}
		if (arg3 < Static619.anInt1566) {
			local12 = Static334.aClass291ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass8_Sub2_Sub2_1 != null && local12.aClass8_Sub2_Sub2_1.method9290(0)) {
				arg0.method9285(0, true, Static665.aClass19_15, Static340.anInt5586, (byte) 118, 0, local12.aClass8_Sub2_Sub2_1);
			}
		}
		if (arg2 < Static619.anInt1566 && arg3 < Static662.anInt9843) {
			local12 = Static334.aClass291ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass8_Sub2_Sub2_1 != null && local12.aClass8_Sub2_Sub2_1.method9290(0)) {
				arg0.method9285(0, true, Static665.aClass19_15, Static340.anInt5586, (byte) 122, Static340.anInt5586, local12.aClass8_Sub2_Sub2_1);
			}
		}
		if (arg2 < Static619.anInt1566 && arg3 > 0) {
			local12 = Static334.aClass291ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass8_Sub2_Sub2_1 != null && local12.aClass8_Sub2_Sub2_1.method9290(0)) {
				arg0.method9285(0, true, Static665.aClass19_15, -Static340.anInt5586, (byte) 121, Static340.anInt5586, local12.aClass8_Sub2_Sub2_1);
			}
		}
	}
}
