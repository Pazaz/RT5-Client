import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public static int anInt2511;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
	public static int anInt2512;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "[I")
	public static final int[] anIntArray161 = new int[50];

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
	public static int anInt2513 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)I")
	public static int method2096(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static77.method1753(arg1 - 1, arg0 - 1) + Static77.method1753(arg1 - 1, arg0 + 1) + Static77.method1753(arg1 - -1, arg0 + -1) + Static77.method1753(arg1 + 1, arg0 - -1);
		@Pc(68) int local68 = Static77.method1753(arg1, arg0 - 1) + Static77.method1753(arg1, arg0 + 1) + Static77.method1753(arg1 - 1, arg0) + Static77.method1753(arg1 + 1, arg0);
		@Pc(73) int local73 = Static77.method1753(arg1, arg0);
		return local73 / 4 + local68 / 8 + local39 / 16;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
	public static void method2097() {
		if (Static94.anInt2428 == -1 || Static168.anInt4073 == -1) {
			return;
		}
		@Pc(25) int local25 = Static100.anInt4628 + (Static283.anInt5980 * (Static105.anInt2619 - Static100.anInt4628) >> 16);
		Static283.anInt5980 += local25;
		if (Static283.anInt5980 < 65535) {
			Static287.aBoolean422 = false;
			Static41.aBoolean87 = false;
		} else {
			if (Static41.aBoolean87) {
				Static287.aBoolean422 = false;
			} else {
				Static287.aBoolean422 = true;
			}
			Static283.anInt5980 = 65535;
			Static41.aBoolean87 = true;
		}
		@Pc(61) float local61 = (float) Static283.anInt5980 / 65535.0F;
		@Pc(64) float[] local64 = new float[3];
		@Pc(68) int local68 = Static159.anInt4621 * 2;
		@Pc(94) int local94;
		@Pc(127) int local127;
		@Pc(135) int local135;
		@Pc(139) int local139;
		@Pc(148) int local148;
		@Pc(166) int local166;
		for (@Pc(70) int local70 = 0; local70 < 3; local70++) {
			@Pc(82) int local82 = Static89.anIntArrayArrayArray1[Static94.anInt2428][local68][local70] * 3;
			local94 = Static89.anIntArrayArrayArray1[Static94.anInt2428][local68 + 1][local70] * 3;
			local127 = (Static89.anIntArrayArrayArray1[Static94.anInt2428][local68 + 2][local70] + Static89.anIntArrayArrayArray1[Static94.anInt2428][local68 + 2][local70] - Static89.anIntArrayArrayArray1[Static94.anInt2428][local68 + 3][local70]) * 3;
			local135 = Static89.anIntArrayArrayArray1[Static94.anInt2428][local68][local70];
			local139 = local94 - local82;
			local148 = local127 + local82 - local94 * 2;
			local166 = Static89.anIntArrayArrayArray1[Static94.anInt2428][local68 + 2][local70] + local94 - local135 - local127;
			local64[local70] = local61 * (local61 * (local61 * (float) local166 + (float) local148) + (float) local139) + (float) local135;
		}
		Static88.anInt2339 = (int) local64[2] - Static96.anInt2446 * 128;
		Static138.anInt3429 = (int) local64[1] * -1;
		Static3.anInt92 = (int) local64[0] - Static149.anInt3667 * 128;
		@Pc(222) float[] local222 = new float[3];
		local94 = Static189.anInt4387 * 2;
		for (local127 = 0; local127 < 3; local127++) {
			local135 = Static89.anIntArrayArrayArray1[Static168.anInt4073][local94][local127] * 3;
			local139 = Static89.anIntArrayArrayArray1[Static168.anInt4073][local94 + 1][local127] * 3;
			local148 = (Static89.anIntArrayArrayArray1[Static168.anInt4073][local94 + 2][local127] + Static89.anIntArrayArrayArray1[Static168.anInt4073][local94 + 2][local127] - Static89.anIntArrayArrayArray1[Static168.anInt4073][local94 + 3][local127]) * 3;
			local166 = Static89.anIntArrayArrayArray1[Static168.anInt4073][local94][local127];
			@Pc(298) int local298 = local139 - local135;
			@Pc(307) int local307 = local148 + local135 - local139 * 2;
			@Pc(325) int local325 = Static89.anIntArrayArrayArray1[Static168.anInt4073][local94 + 2][local127] + local139 - local166 - local148;
			local222[local127] = ((float) local298 + local61 * ((float) local325 * local61 + (float) local307)) * local61 + (float) local166;
		}
		@Pc(358) float local358 = local222[0] - local64[0];
		@Pc(368) float local368 = (local222[1] - local64[1]) * -1.0F;
		@Pc(377) float local377 = local222[2] - local64[2];
		@Pc(387) double local387 = Math.sqrt((double) (local377 * local377 + local358 * local358));
		Static130.anInt6778 = (int) (Math.atan2((double) local368, local387) * 2607.5945876176133D) & 0x3FFF;
		Static89.anInt2374 = (int) (-Math.atan2((double) local358, (double) local377) * 2607.5945876176133D) & 0x3FFF;
		Static209.anInt4822 = ((Static89.anIntArrayArrayArray1[Static94.anInt2428][local68 + 2][3] - Static89.anIntArrayArrayArray1[Static94.anInt2428][local68][3]) * Static283.anInt5980 >> 16) + Static89.anIntArrayArrayArray1[Static94.anInt2428][local68][3];
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	public static void method2099() {
		@Pc(5) Class215 local5 = Static268.aClass215_81;
		synchronized (Static268.aClass215_81) {
			Static268.aClass215_81.method6052();
		}
		local5 = Static104.aClass215_41;
		synchronized (Static104.aClass215_41) {
			Static104.aClass215_41.method6052();
		}
		@Pc(36) Class115 local36 = Static299.aClass115_1;
		synchronized (Static299.aClass115_1) {
			Static299.aClass115_1.method3453();
		}
	}
}
