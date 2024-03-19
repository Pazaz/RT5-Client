import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "Lclient!qj;")
	public static Class162 aClass162_132;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!qj;")
	public static Class162 aClass162_133;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
	public static int anInt3874;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "Lclient!vb;")
	public static Class210 aClass210_1;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
	public static int anInt3873 = 0;

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public static int anInt3875 = 0;

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
	public static int anInt3876 = -1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z")
	public static boolean method3334() {
		return Static237.anInt5285 > 0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method3337(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local8[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local8[local18] = local8[local18] + arg0[local18];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	public static void method3338() {
		Static62.aClass215_22.method6060();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!nr;IIII)V")
	public static void method3340(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.method2732(arg4, arg1, arg2 + arg4, arg1 - -arg3);
		arg0.method2745(arg2, arg3, arg4, arg1, -16777216);
		if (Static335.anInt6981 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static201.anInt4284 / (float) Static201.anInt4275;
		@Pc(36) int local36 = arg2;
		@Pc(38) int local38 = arg3;
		if (local34 < 1.0F) {
			local38 = (int) (local34 * (float) arg2);
		} else {
			local36 = (int) ((float) arg3 / local34);
		}
		@Pc(65) int local65 = arg4 + (arg2 - local36) / 2;
		@Pc(73) int local73 = arg1 + (arg3 - local38) / 2;
		if (Static183.aClass29_15 == null || arg2 != Static183.aClass29_15.method5840() || Static183.aClass29_15.method5838() != arg3) {
			Static201.method3685(Static201.anInt4281, Static201.anInt4284 + Static201.anInt4283, Static201.anInt4281 - -Static201.anInt4275, Static201.anInt4283, local65, local73, local36 + local65, local38 + local73);
			Static201.method3680(arg0);
			Static183.aClass29_15 = arg0.method2807(local65, local73, local36, local38, false);
		}
		Static183.aClass29_15.method5845(local65, local73);
		@Pc(125) int local125 = local36 * Static298.anInt6269 / Static201.anInt4275;
		@Pc(139) int local139 = local38 * Static16.anInt641 / Static201.anInt4284;
		@Pc(147) int local147 = Static339.anInt7356 * local36 / Static201.anInt4275 + local65;
		@Pc(160) int local160 = local38 + local73 - local38 * Static37.anInt1188 / Static201.anInt4284 - local139;
		@Pc(162) int local162 = -1996554240;
		if (Static199.anInt4559 == 1) {
			local162 = -1996488705;
		}
		arg0.method2717(local147, local160, local125, local139, local162, 1);
		arg0.method2712(local147, local160, local125, local139, local162, 0);
		if (Static74.anInt2057 <= 0) {
			return;
		}
		@Pc(195) int local195;
		if (Static243.anInt5366 <= 50) {
			local195 = Static243.anInt5366 * 5;
		} else {
			local195 = (100 - Static243.anInt5366) * 5;
		}
		for (@Pc(208) Class1_Sub21 local208 = (Class1_Sub21) Static201.aClass130_28.method3749(); local208 != null; local208 = (Class1_Sub21) Static201.aClass130_28.method3756()) {
			@Pc(215) Class107 local215 = Static292.method5169(local208.anInt4155);
			if (Static352.method6140(local215)) {
				@Pc(236) int local236;
				@Pc(249) int local249;
				if (local208.anInt4155 == Static263.anInt5600) {
					local236 = local208.anInt4150 * local36 / Static201.anInt4275 + local65;
					local249 = local73 + local38 * (Static201.anInt4284 - local208.anInt4154) / Static201.anInt4284;
					arg0.method2745(4, 4, local236 - 2, local249 + -2, local195 << 24 | 0xFFFF00);
				} else if (Static259.anInt4933 != -1 && local215.anInt3789 == Static259.anInt4933) {
					local236 = local208.anInt4150 * local36 / Static201.anInt4275 + local65;
					local249 = local73 + (Static201.anInt4284 - local208.anInt4154) * local38 / Static201.anInt4284;
					arg0.method2745(4, 4, local236 - 2, local249 - 2, local195 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!il;Ljava/lang/String;I)I")
	public static int method3341(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.anInt6813;
		@Pc(10) byte[] local10 = Static94.method2019(arg1);
		arg0.method5777(local10.length);
		arg0.anInt6813 += Static123.aClass87_1.method2585(arg0.anInt6813, local10.length, arg0.aByteArray86, 0, local10);
		return arg0.anInt6813 - local6;
	}
}
