import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "Lclient!qj;")
	public static Class162 aClass162_81;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
	public static int anInt2339;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
	public static int anInt2333 = 0;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
	public static int anInt2334 = 0;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
	public static int anInt2337 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!qj;Lclient!qj;Lclient!qj;Lclient!qj;B)V")
	public static void method1943(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(3) Class162 arg3) {
		Static176.aClass162_142 = arg3;
		Static240.aClass162_190 = arg1;
		Static127.aClass162_116 = arg2;
		Static176.aClass162_143 = arg0;
		Class1_Sub2_Sub10.lb = new Class177[Static240.aClass162_190.method4633()][];
		Static99.aBooleanArray8 = new boolean[Static240.aClass162_190.method4633()];
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZIII)I")
	public static int method1944(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg2) {
			return arg2;
		}
		@Pc(27) int local27 = 128 - arg1;
		@Pc(41) int local41 = arg1 * (arg0 & 0x7F) + local27 * (arg2 & 0x7F) >> 7;
		@Pc(55) int local55 = (arg0 & 0x380) * arg1 + local27 * (arg2 & 0x380) >> 7;
		@Pc(70) int local70 = (arg2 & 0xFC00) * local27 + (arg0 & 0xFC00) * arg1 >> 7;
		return local55 & 0x380 | local70 & 0xFC00 | local41 & 0x7F;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIII)I")
	public static int method1946(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(14) int local14 = local7 >= 8 ? arg1 : arg0;
		@Pc(31) int local31 = local7 < 4 ? arg1 : local7 == 12 || local7 == 14 ? arg0 : arg3;
		return ((local7 & 0x1) == 0 ? local14 : -local14) + ((local7 & 0x2) == 0 ? local31 : -local31);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)[B")
	public static byte[] method1947(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub9 local12 = (Class1_Sub1_Sub9) Static30.aClass143_8.method4323((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
				@Pc(44) int local44 = 255 - local38;
				@Pc(49) int local49 = Static228.method4354(local23, local44);
				@Pc(53) byte local53 = local17[local49];
				local17[local49] = local17[local44];
				local17[local44] = local17[511 - local38] = local53;
			}
			local12 = new Class1_Sub1_Sub9(local17);
			Static30.aClass143_8.method4322(local12, (long) arg0);
		}
		return local12.aByteArray16;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILjava/lang/String;II[BI)I")
	public static int method1949(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(17) int local17 = arg2;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(27) char local27 = arg1.charAt(local19);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				arg3[local19 + arg0] = (byte) local27;
			} else if (local27 == '€') {
				arg3[local19 + arg0] = -128;
			} else if (local27 == '‚') {
				arg3[arg0 + local19] = -126;
			} else if (local27 == 'ƒ') {
				arg3[arg0 + local19] = -125;
			} else if (local27 == '„') {
				arg3[arg0 + local19] = -124;
			} else if (local27 == '…') {
				arg3[arg0 + local19] = -123;
			} else if (local27 == '†') {
				arg3[arg0 + local19] = -122;
			} else if (local27 == '‡') {
				arg3[local19 + arg0] = -121;
			} else if (local27 == 'ˆ') {
				arg3[arg0 + local19] = -120;
			} else if (local27 == '‰') {
				arg3[arg0 + local19] = -119;
			} else if (local27 == 'Š') {
				arg3[local19 + arg0] = -118;
			} else if (local27 == '‹') {
				arg3[arg0 + local19] = -117;
			} else if (local27 == 'Œ') {
				arg3[arg0 + local19] = -116;
			} else if (local27 == 'Ž') {
				arg3[local19 + arg0] = -114;
			} else if (local27 == '‘') {
				arg3[local19 + arg0] = -111;
			} else if (local27 == '’') {
				arg3[arg0 + local19] = -110;
			} else if (local27 == '“') {
				arg3[local19 + arg0] = -109;
			} else if (local27 == '”') {
				arg3[arg0 + local19] = -108;
			} else if (local27 == '•') {
				arg3[local19 + arg0] = -107;
			} else if (local27 == '–') {
				arg3[arg0 + local19] = -106;
			} else if (local27 == '—') {
				arg3[local19 + arg0] = -105;
			} else if (local27 == '˜') {
				arg3[arg0 + local19] = -104;
			} else if (local27 == '™') {
				arg3[arg0 + local19] = -103;
			} else if (local27 == 'š') {
				arg3[local19 + arg0] = -102;
			} else if (local27 == '›') {
				arg3[local19 + arg0] = -101;
			} else if (local27 == 'œ') {
				arg3[local19 + arg0] = -100;
			} else if (local27 == 'ž') {
				arg3[arg0 + local19] = -98;
			} else if (local27 == 'Ÿ') {
				arg3[local19 + arg0] = -97;
			} else {
				arg3[local19 + arg0] = 63;
			}
		}
		return local17;
	}
}
