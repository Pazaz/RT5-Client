import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!qj;")
	public static Class162 aClass162_85;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!we;")
	public static final Class215 aClass215_39 = new Class215(260);

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
	public static int anInt2428 = -1;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method2019(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(19) byte[] local19 = new byte[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local19[local21] = (byte) local27;
			} else if (local27 == '€') {
				local19[local21] = -128;
			} else if (local27 == '‚') {
				local19[local21] = -126;
			} else if (local27 == 'ƒ') {
				local19[local21] = -125;
			} else if (local27 == '„') {
				local19[local21] = -124;
			} else if (local27 == '…') {
				local19[local21] = -123;
			} else if (local27 == '†') {
				local19[local21] = -122;
			} else if (local27 == '‡') {
				local19[local21] = -121;
			} else if (local27 == 'ˆ') {
				local19[local21] = -120;
			} else if (local27 == '‰') {
				local19[local21] = -119;
			} else if (local27 == 'Š') {
				local19[local21] = -118;
			} else if (local27 == '‹') {
				local19[local21] = -117;
			} else if (local27 == 'Œ') {
				local19[local21] = -116;
			} else if (local27 == 'Ž') {
				local19[local21] = -114;
			} else if (local27 == '‘') {
				local19[local21] = -111;
			} else if (local27 == '’') {
				local19[local21] = -110;
			} else if (local27 == '“') {
				local19[local21] = -109;
			} else if (local27 == '”') {
				local19[local21] = -108;
			} else if (local27 == '•') {
				local19[local21] = -107;
			} else if (local27 == '–') {
				local19[local21] = -106;
			} else if (local27 == '—') {
				local19[local21] = -105;
			} else if (local27 == '˜') {
				local19[local21] = -104;
			} else if (local27 == '™') {
				local19[local21] = -103;
			} else if (local27 == 'š') {
				local19[local21] = -102;
			} else if (local27 == '›') {
				local19[local21] = -101;
			} else if (local27 == 'œ') {
				local19[local21] = -100;
			} else if (local27 == 'ž') {
				local19[local21] = -98;
			} else if (local27 == 'Ÿ') {
				local19[local21] = -97;
			} else {
				local19[local21] = 63;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)Lclient!c;")
	public static Class27_Sub1 method2020(@OriginalArg(0) int arg0) {
		return Static29.aBoolean461 && arg0 >= Static181.anInt4291 && arg0 <= Static340.anInt7186 ? Static302.aClass27_Sub1Array1[arg0 - Static181.anInt4291] : null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!vp;I)V")
	public static void method2021(@OriginalArg(0) Class7_Sub1_Sub1_Sub2 arg0) {
		@Pc(11) Class1_Sub20 local11 = (Class1_Sub20) Static195.aClass183_22.method5053((long) arg0.anInt7070);
		if (local11 == null) {
			return;
		}
		if (local11.aClass1_Sub3_Sub2_3 != null) {
			Static127.aClass1_Sub3_Sub3_1.method3522(local11.aClass1_Sub3_Sub2_3);
			local11.aClass1_Sub3_Sub2_3 = null;
		}
		local11.method6172();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2023(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg3 < 0 || arg6 >= Static25.anInt850 - 1 || Static219.anInt4987 - 1 <= arg3) {
			return;
		}
		if (Static241.aClass154ArrayArrayArray2 == null) {
			return;
		}
		@Pc(47) Interface6 local47;
		if (arg5 == 0) {
			local47 = (Interface6) Static56.method1394(arg2, arg6, arg3);
			@Pc(262) Interface6 local262 = (Interface6) Static86.method1936(arg2, arg6, arg3);
			if (local47 != null && arg1 != 2) {
				if (local47 instanceof Class7_Sub2_Sub1) {
					((Class7_Sub2_Sub1) local47).aClass192_4.method5256(arg0);
				} else {
					Static265.method4788(arg2, arg5, arg3, arg0, arg4, arg6, local47.method5686(), arg1);
				}
			}
			if (local262 != null) {
				if (local262 instanceof Class7_Sub2_Sub1) {
					((Class7_Sub2_Sub1) local262).aClass192_4.method5256(arg0);
				} else {
					Static265.method4788(arg2, arg5, arg3, arg0, arg4, arg6, local262.method5686(), arg1);
				}
			}
		} else if (arg5 == 1) {
			local47 = (Interface6) Static169.method1651(arg2, arg6, arg3);
			if (local47 != null) {
				if (local47 instanceof Class7_Sub3_Sub1) {
					((Class7_Sub3_Sub1) local47).aClass192_1.method5256(arg0);
				} else {
					@Pc(149) int local149 = local47.method5686();
					if (arg1 == 4 || arg1 == 5) {
						Static265.method4788(arg2, arg5, arg3, arg0, arg4, arg6, local149, 4);
					} else if (arg1 == 6) {
						Static265.method4788(arg2, arg5, arg3, arg0, arg4 + 4, arg6, local149, 4);
					} else if (arg1 == 7) {
						Static265.method4788(arg2, arg5, arg3, arg0, (arg4 + 2 & 0x3) + 4, arg6, local149, 4);
					} else if (arg1 == 8) {
						Static265.method4788(arg2, arg5, arg3, arg0, arg4 + 4, arg6, local149, 4);
						Static265.method4788(arg2, arg5, arg3, arg0, (arg4 + 2 & 0x3) + 4, arg6, local149, 4);
					}
				}
			}
		} else if (arg5 == 2) {
			local47 = (Interface6) Static95.method2029(arg2, arg6, arg3, Interface6.class);
			if (local47 != null) {
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (local47 instanceof Class7_Sub1_Sub3) {
					((Class7_Sub1_Sub3) local47).aClass192_2.method5256(arg0);
				} else {
					Static265.method4788(arg2, arg5, arg3, arg0, arg4, arg6, local47.method5686(), arg1);
				}
			}
		} else if (arg5 == 3) {
			local47 = (Interface6) Static293.method5174(arg2, arg6, arg3);
			if (local47 != null) {
				if (local47 instanceof Class7_Sub5_Sub1) {
					((Class7_Sub5_Sub1) local47).aClass192_3.method5256(arg0);
				} else {
					Static265.method4788(arg2, arg5, arg3, arg0, arg4, arg6, local47.method5686(), arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
	public static void method2024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class158 local15 = Static318.method5594(arg0);
		@Pc(18) int local18 = local15.anInt5365;
		@Pc(21) int local21 = local15.anInt5369;
		@Pc(24) int local24 = local15.anInt5367;
		@Pc(30) int local30 = Class1_Sub40.anIntArray554[local24 - local21];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local21;
		Static302.method5276(local18, Static128.anIntArray239[local18] & ~local30 | arg1 << local21 & local30);
	}
}
