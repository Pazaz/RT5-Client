import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
	public static int anInt7072 = 0;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method6358(@OriginalArg(1) Class19 arg0) {
		Static665.aClass14_12 = Static324.method4628(true, true, Static662.anInt9845, arg0);
		Static154.aClass381_6 = Static275.method3980(Static662.anInt9845, arg0);
		Static437.aClass14_9 = Static324.method4628(true, true, Static539.anInt8173, arg0);
		Static694.aClass381_13 = Static275.method3980(Static539.anInt8173, arg0);
		Static180.aClass14_3 = Static324.method4628(true, true, Static634.anInt9519, arg0);
		Static42.aClass381_4 = Static275.method3980(Static634.anInt9519, arg0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III[BILclient!qha;IZ)Lclient!gb;")
	public static Class93_Sub2_Sub1 method6359(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(5) Class19_Sub3 arg2, @OriginalArg(6) int arg3) {
		if (arg2.aBoolean597 || Static700.method9150(arg3) && Static700.method9150(arg0)) {
			return new Class93_Sub2_Sub1(arg2, 3553, 6406, arg3, arg0, false, arg1, 6406);
		} else if (arg2.aBoolean595) {
			return new Class93_Sub2_Sub1(arg2, 34037, 6406, arg3, arg0, false, arg1, 6406);
		} else {
			return new Class93_Sub2_Sub1(arg2, 6406, arg3, arg0, Static440.method5962(arg3), Static440.method5962(arg0), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method6361(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) byte[] local9 = new byte[local6];
		for (@Pc(19) int local19 = 0; local19 < local6; local19++) {
			@Pc(24) char local24 = arg0.charAt(local19);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local9[local19] = (byte) local24;
			} else if (local24 == '€') {
				local9[local19] = -128;
			} else if (local24 == '‚') {
				local9[local19] = -126;
			} else if (local24 == 'ƒ') {
				local9[local19] = -125;
			} else if (local24 == '„') {
				local9[local19] = -124;
			} else if (local24 == '…') {
				local9[local19] = -123;
			} else if (local24 == '†') {
				local9[local19] = -122;
			} else if (local24 == '‡') {
				local9[local19] = -121;
			} else if (local24 == 'ˆ') {
				local9[local19] = -120;
			} else if (local24 == '‰') {
				local9[local19] = -119;
			} else if (local24 == 'Š') {
				local9[local19] = -118;
			} else if (local24 == '‹') {
				local9[local19] = -117;
			} else if (local24 == 'Œ') {
				local9[local19] = -116;
			} else if (local24 == 'Ž') {
				local9[local19] = -114;
			} else if (local24 == '‘') {
				local9[local19] = -111;
			} else if (local24 == '’') {
				local9[local19] = -110;
			} else if (local24 == '“') {
				local9[local19] = -109;
			} else if (local24 == '”') {
				local9[local19] = -108;
			} else if (local24 == '•') {
				local9[local19] = -107;
			} else if (local24 == '–') {
				local9[local19] = -106;
			} else if (local24 == '—') {
				local9[local19] = -105;
			} else if (local24 == '˜') {
				local9[local19] = -104;
			} else if (local24 == '™') {
				local9[local19] = -103;
			} else if (local24 == 'š') {
				local9[local19] = -102;
			} else if (local24 == '›') {
				local9[local19] = -101;
			} else if (local24 == 'œ') {
				local9[local19] = -100;
			} else if (local24 == 'ž') {
				local9[local19] = -98;
			} else if (local24 == 'Ÿ') {
				local9[local19] = -97;
			} else {
				local9[local19] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
	public static void method6362() {
		for (@Pc(1) int local1 = 0; local1 < 100; local1++) {
			Static364.aBooleanArray18[local1] = true;
		}
	}
}
