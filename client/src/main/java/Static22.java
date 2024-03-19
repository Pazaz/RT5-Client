import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bj", name = "R", descriptor = "Lclient!qj;")
	public static Class162 aClass162_34;

	@OriginalMember(owner = "client!bj", name = "T", descriptor = "Lclient!qa;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!bj", name = "P", descriptor = "[S")
	public static final short[] aShortArray8 = new short[] { 49, 51, 10, 28, 59, 21, 20, 16 };

	@OriginalMember(owner = "client!bj", name = "U", descriptor = "[S")
	public static final short[] aShortArray9 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!bj", name = "W", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZLclient!qj;)Lclient!hd;")
	public static Class1_Sub10 method552(@OriginalArg(0) int arg0, @OriginalArg(2) Class162 arg1) {
		@Pc(8) byte[] local8 = arg1.method4630(arg0);
		return local8 == null ? null : new Class1_Sub10(local8);
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V")
	public static void method553() {
		for (@Pc(7) int local7 = 0; local7 < Static88.anInt2333; local7++) {
			@Pc(13) int local13 = Static187.anIntArray311[local7]--;
			if (Static187.anIntArray311[local7] >= -10) {
				@Pc(94) Class19 local94 = Static114.aClass19Array2[local7];
				if (local94 == null) {
					local94 = Static356.method468(Static218.aClass162_175, Static246.anIntArray499[local7], 0);
					if (local94 == null) {
						continue;
					}
					Static187.anIntArray311[local7] += local94.method466();
					Static114.aClass19Array2[local7] = local94;
				}
				if (Static187.anIntArray311[local7] < 0) {
					@Pc(219) int local219;
					if (Static183.anIntArray308[local7] == 0) {
						local219 = Static308.anIntArray494[local7] * Static84.anInt2246 >> 8;
					} else {
						@Pc(137) int local137 = (Static183.anIntArray308[local7] & 0xFF) * 128;
						@Pc(145) int local145 = Static183.anIntArray308[local7] >> 16 & 0xFF;
						@Pc(154) int local154 = local145 * 128 + 64 - Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027;
						if (local154 < 0) {
							local154 = -local154;
						}
						@Pc(167) int local167 = Static183.anIntArray308[local7] >> 8 & 0xFF;
						@Pc(177) int local177 = local167 * 128 + 64 - Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032;
						if (local177 < 0) {
							local177 = -local177;
						}
						@Pc(188) int local188 = local177 + local154 - 128;
						if (local188 > local137) {
							Static187.anIntArray311[local7] = -100;
							continue;
						}
						if (local188 < 0) {
							local188 = 0;
						}
						local219 = Static308.anIntArray494[local7] * Static183.anInt4317 * (local137 - local188) / local137 >> 8;
					}
					if (local219 > 0) {
						@Pc(236) Class1_Sub13_Sub1 local236 = local94.method467().method4255(Static70.aClass81_1);
						@Pc(241) Class1_Sub3_Sub2 local241 = Static362.method2330(local236, local219);
						local241.method2364(Static101.anIntArray161[local7] - 1);
						Static127.aClass1_Sub3_Sub3_1.method3527(local241);
					}
					Static187.anIntArray311[local7] = -100;
				}
			} else {
				Static88.anInt2333--;
				for (@Pc(29) int local29 = local7; local29 < Static88.anInt2333; local29++) {
					Static246.anIntArray499[local29] = Static246.anIntArray499[local29 + 1];
					Static114.aClass19Array2[local29] = Static114.aClass19Array2[local29 + 1];
					Static101.anIntArray161[local29] = Static101.anIntArray161[local29 + 1];
					Static187.anIntArray311[local29] = Static187.anIntArray311[local29 + 1];
					Static183.anIntArray308[local29] = Static183.anIntArray308[local29 + 1];
					Static308.anIntArray494[local29] = Static308.anIntArray494[local29 + 1];
				}
				local7--;
			}
		}
		if (Static46.aBoolean484 && !Static235.method4606()) {
			if (Static340.anInt7187 != 0 && Static67.anInt204 != -1) {
				Static179.method3629(Static67.anInt204, Static340.anInt7187, Static250.aClass162_193);
			}
			Static46.aBoolean484 = false;
		} else if (Static340.anInt7187 != 0 && Static67.anInt204 != -1 && !Static235.method4606()) {
			Static150.aClass1_Sub16_Sub2_2.method5793(176);
			Static150.aClass1_Sub16_Sub2_2.method5768(Static67.anInt204);
			Static67.anInt204 = -1;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILclient!sn;ILclient!qa;ILclient!ro;I)V")
	public static void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class142 arg2, @OriginalArg(4) Class29 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class177 arg5, @OriginalArg(7) int arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static303.anInt6342 == 4) {
			local16 = (int) Static188.aFloat17 & 0x3FFF;
		} else {
			local16 = (int) Static188.aFloat17 + Static238.anInt5295 & 0x3FFF;
		}
		@Pc(38) int local38 = Math.max(arg5.anInt5803 / 2, arg5.anInt5816 / 2) + 10;
		@Pc(46) int local46 = arg1 * arg1 + arg6 * arg6;
		if (local38 * local38 < local46) {
			return;
		}
		@Pc(60) int local60 = Class39.anIntArray88[local16];
		@Pc(64) int local64 = Class39.anIntArray87[local16];
		if (Static303.anInt6342 != 4) {
			local60 = local60 * 256 / (Static312.anInt6009 + 256);
			local64 = local64 * 256 / (Static312.anInt6009 + 256);
		}
		@Pc(95) int local95 = local64 * arg6 + local60 * arg1 >> 15;
		@Pc(106) int local106 = local64 * arg1 - arg6 * local60 >> 15;
		arg3.method5848(arg5.anInt5803 / 2 + arg0 + local95 - arg3.method5850() / 2, -local106 + (arg4 - (-(arg5.anInt5816 / 2) + arg3.method5832() / 2)), arg2, arg0, arg4);
	}
}
