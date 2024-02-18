import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString52;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	public static int anInt5440;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Lclient!sb;")
	public static Class330 aClass330_65;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_138 = new Class225(36, 4);

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
	public static int anInt5439 = -1;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_139 = new Class225(118, -2);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	public static int anInt5441 = -50;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "[I")
	public static final int[] anIntArray403 = new int[5];

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method4924(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static263.method3855(arg0, -1, -1, arg1);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B[Lclient!st;)V")
	public static void method4925(@OriginalArg(1) Class23[] arg0) {
		anInt5440 = arg0.length;
		Static186.aClass23Array5 = new Class23[anInt5440 + 10];
		Static460.anIntArray554 = new int[anInt5440 + 10];
		Static734.method7691(arg0, 0, Static186.aClass23Array5, 0, anInt5440);
		for (@Pc(32) int local32 = 0; local32 < anInt5440; local32++) {
			Static460.anIntArray554[local32] = Static186.aClass23Array5[local32].method8192();
		}
		for (@Pc(50) int local50 = anInt5440; local50 < Static186.aClass23Array5.length; local50++) {
			Static460.anIntArray554[local50] = 12;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;I[BZII)I")
	public static int method4926(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg1;
		for (@Pc(16) int local16 = 0; local16 < local8; local16++) {
			@Pc(23) char local23 = arg0.charAt(local16);
			if (local23 > '\u0000' && local23 < '\u0080' || !(local23 < ' ' || local23 > 'ÿ')) {
				arg2[arg3 + local16] = (byte) local23;
			} else if (local23 == '€') {
				arg2[local16 + arg3] = -128;
			} else if (local23 == '‚') {
				arg2[arg3 + local16] = -126;
			} else if (local23 == 'ƒ') {
				arg2[local16 + arg3] = -125;
			} else if (local23 == '„') {
				arg2[arg3 + local16] = -124;
			} else if (local23 == '…') {
				arg2[arg3 + local16] = -123;
			} else if (local23 == '†') {
				arg2[local16 + arg3] = -122;
			} else if (local23 == '‡') {
				arg2[local16 + arg3] = -121;
			} else if (local23 == 'ˆ') {
				arg2[arg3 + local16] = -120;
			} else if (local23 == '‰') {
				arg2[local16 + arg3] = -119;
			} else if (local23 == 'Š') {
				arg2[local16 + arg3] = -118;
			} else if (local23 == '‹') {
				arg2[arg3 + local16] = -117;
			} else if (local23 == 'Œ') {
				arg2[arg3 + local16] = -116;
			} else if (local23 == 'Ž') {
				arg2[arg3 + local16] = -114;
			} else if (local23 == '‘') {
				arg2[local16 + arg3] = -111;
			} else if (local23 == '’') {
				arg2[arg3 + local16] = -110;
			} else if (local23 == '“') {
				arg2[arg3 + local16] = -109;
			} else if (local23 == '”') {
				arg2[arg3 + local16] = -108;
			} else if (local23 == '•') {
				arg2[local16 + arg3] = -107;
			} else if (local23 == '–') {
				arg2[arg3 + local16] = -106;
			} else if (local23 == '—') {
				arg2[local16 + arg3] = -105;
			} else if (local23 == '˜') {
				arg2[arg3 + local16] = -104;
			} else if (local23 == '™') {
				arg2[local16 + arg3] = -103;
			} else if (local23 == 'š') {
				arg2[local16 + arg3] = -102;
			} else if (local23 == '›') {
				arg2[local16 + arg3] = -101;
			} else if (local23 == 'œ') {
				arg2[arg3 + local16] = -100;
			} else if (local23 == 'ž') {
				arg2[local16 + arg3] = -98;
			} else if (local23 == 'Ÿ') {
				arg2[local16 + arg3] = -97;
			} else {
				arg2[arg3 + local16] = 63;
			}
		}
		return local8;
	}
}
