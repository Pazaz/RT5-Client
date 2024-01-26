import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!gfa", name = "l", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_14 = new Class155(22);

	@OriginalMember(owner = "client!gfa", name = "u", descriptor = "Lclient!sia;")
	public static final Class339 aClass339_16 = new Class339();

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lclient!sb;I)V")
	public static void method3079(@OriginalArg(0) Class330 arg0) {
		Static159.anInt2787 = arg0.method7590("hitbar_default");
		Static434.anInt6579 = arg0.method7590("timerbar_default");
		Static67.anInt6784 = arg0.method7590("headicons_pk");
		Static304.anInt4876 = arg0.method7590("headicons_prayer");
		Static644.anInt9607 = arg0.method7590("hint_headicons");
		Static699.anInt10540 = arg0.method7590("hint_mapmarkers");
		Static132.anInt2451 = arg0.method7590("mapflag");
		Static270.anInt4355 = arg0.method7590("cross");
		Static598.anInt8828 = arg0.method7590("mapdots");
		Static305.anInt4883 = arg0.method7590("scrollbar");
		Static548.anInt8259 = arg0.method7590("name_icons");
		Static113.anInt2238 = arg0.method7590("floorshadows");
		Static670.anInt10024 = arg0.method7590("compass");
		Static286.anInt4592 = arg0.method7590("otherlevel");
		Static665.anInt9943 = arg0.method7590("hint_mapedge");
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BC)I")
	public static int method3081(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class370.anIntArray752.length > arg0 ? Class370.anIntArray752[arg0] : -1;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIIIIIIZILclient!eq;)Z")
	public static boolean method3083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class110 arg9) {
		@Pc(5) int local5 = arg1;
		@Pc(7) int local7 = arg8;
		@Pc(16) int local16 = arg1 - 64;
		@Pc(21) int local21 = arg8 - 64;
		Static352.anIntArrayArray141[64][64] = 99;
		Static668.anIntArrayArray244[64][64] = 0;
		@Pc(35) byte local35 = 0;
		Static507.anIntArray610[0] = arg1;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52 = local35 + 1;
		Static428.anIntArray517[0] = arg8;
		@Pc(57) int[][] local57 = arg9.anIntArrayArray65;
		while (local52 != local41) {
			local7 = Static428.anIntArray517[local41];
			local5 = Static507.anIntArray610[local41];
			@Pc(70) int local70 = local7 - local21;
			@Pc(75) int local75 = local5 - local16;
			local41 = local41 + 1 & 0xFFF;
			@Pc(87) int local87 = local5 - arg9.anInt2647;
			@Pc(93) int local93 = local7 - arg9.anInt2645;
			if (arg5 == -4) {
				if (arg3 == local5 && local7 == arg7) {
					Static594.anInt8775 = local5;
					Static407.anInt6285 = local7;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static275.method3979(arg3, 2, local5, arg6, arg2, local7, arg7, 2)) {
					Static407.anInt6285 = local7;
					Static594.anInt8775 = local5;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg9.method2460(2, arg7, 2, local5, arg3, arg0, arg2, local7, arg6)) {
					Static407.anInt6285 = local7;
					Static594.anInt8775 = local5;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg9.method2464(arg7, arg0, arg3, local5, 2, arg2, arg6, local7)) {
					Static407.anInt6285 = local7;
					Static594.anInt8775 = local5;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg9.method2465(2, arg5, arg7, local7, local5, arg3, arg4)) {
					Static594.anInt8775 = local5;
					Static407.anInt6285 = local7;
					return true;
				}
			} else if (arg9.method2458(local5, arg5, arg3, arg7, arg4, local7, 2)) {
				Static407.anInt6285 = local7;
				Static594.anInt8775 = local5;
				return true;
			}
			@Pc(270) int local270 = Static668.anIntArrayArray244[local75][local70] + 1;
			if (local75 > 0 && Static352.anIntArrayArray141[local75 - 1][local70] == 0 && (local57[local87 - 1][local93] & 0x43A40000) == 0 && (local57[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static507.anIntArray610[local52] = local5 - 1;
				Static428.anIntArray517[local52] = local7;
				local52 = local52 + 1 & 0xFFF;
				Static352.anIntArrayArray141[local75 - 1][local70] = 2;
				Static668.anIntArrayArray244[local75 - 1][local70] = local270;
			}
			if (local75 < 126 && Static352.anIntArrayArray141[local75 + 1][local70] == 0 && (local57[local87 + 2][local93] & 0x60E40000) == 0 && (local57[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static507.anIntArray610[local52] = local5 + 1;
				Static428.anIntArray517[local52] = local7;
				Static352.anIntArrayArray141[local75 + 1][local70] = 8;
				local52 = local52 + 1 & 0xFFF;
				Static668.anIntArrayArray244[local75 + 1][local70] = local270;
			}
			if (local70 > 0 && Static352.anIntArrayArray141[local75][local70 - 1] == 0 && (local57[local87][local93 - 1] & 0x43A40000) == 0 && (local57[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static507.anIntArray610[local52] = local5;
				Static428.anIntArray517[local52] = local7 - 1;
				Static352.anIntArrayArray141[local75][local70 - 1] = 1;
				local52 = local52 + 1 & 0xFFF;
				Static668.anIntArrayArray244[local75][local70 - 1] = local270;
			}
			if (local70 < 126 && Static352.anIntArrayArray141[local75][local70 + 1] == 0 && (local57[local87][local93 + 2] & 0x4E240000) == 0 && (local57[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static507.anIntArray610[local52] = local5;
				Static428.anIntArray517[local52] = local7 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static352.anIntArrayArray141[local75][local70 + 1] = 4;
				Static668.anIntArrayArray244[local75][local70 + 1] = local270;
			}
			if (local75 > 0 && local70 > 0 && Static352.anIntArrayArray141[local75 - 1][local70 - 1] == 0 && (local57[local87 - 1][local93] & 0x4FA40000) == 0 && (local57[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local57[local87][local93 - 1] & 0x63E40000) == 0) {
				Static507.anIntArray610[local52] = local5 - 1;
				Static428.anIntArray517[local52] = local7 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static352.anIntArrayArray141[local75 - 1][local70 - 1] = 3;
				Static668.anIntArrayArray244[local75 - 1][local70 - 1] = local270;
			}
			if (local75 < 126 && local70 > 0 && Static352.anIntArrayArray141[local75 + 1][local70 - 1] == 0 && (local57[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local57[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local57[local87 + 2][local93] & 0x78E40000) == 0) {
				Static507.anIntArray610[local52] = local5 + 1;
				Static428.anIntArray517[local52] = local7 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static352.anIntArrayArray141[local75 + 1][local70 - 1] = 9;
				Static668.anIntArrayArray244[local75 + 1][local70 - 1] = local270;
			}
			if (local75 > 0 && local70 < 126 && Static352.anIntArrayArray141[local75 - 1][local70 + 1] == 0 && (local57[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local57[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local57[local87][local93 + 2] & 0x7E240000) == 0) {
				Static507.anIntArray610[local52] = local5 - 1;
				Static428.anIntArray517[local52] = local7 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static352.anIntArrayArray141[local75 - 1][local70 + 1] = 6;
				Static668.anIntArrayArray244[local75 - 1][local70 + 1] = local270;
			}
			if (local75 < 126 && local70 < 126 && Static352.anIntArrayArray141[local75 + 1][local70 + 1] == 0 && (local57[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local57[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local57[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static507.anIntArray610[local52] = local5 + 1;
				Static428.anIntArray517[local52] = local7 + 1;
				Static352.anIntArrayArray141[local75 + 1][local70 + 1] = 12;
				local52 = local52 + 1 & 0xFFF;
				Static668.anIntArrayArray244[local75 + 1][local70 + 1] = local270;
			}
		}
		Static407.anInt6285 = local7;
		Static594.anInt8775 = local5;
		return false;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z)Z")
	public static boolean method3084() {
		if (Static96.aClass2_Sub2_Sub16_13 == null) {
			return false;
		} else {
			if (Static96.aClass2_Sub2_Sub16_13.anInt7314 >= 2000) {
				Static96.aClass2_Sub2_Sub16_13.anInt7314 -= 2000;
			}
			return Static96.aClass2_Sub2_Sub16_13.anInt7314 == 1002;
		}
	}
}
