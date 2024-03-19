import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
	public static int anInt7209;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!je;")
	public static Class99 aClass99_3;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
	public static volatile int anInt7214 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB[I[II)V")
	public static void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local20;
		@Pc(34) int local34 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local34;
		for (@Pc(46) int local46 = arg0; local46 < arg3; local46++) {
			if ((local46 & 0x1) + local20 > arg2[local46]) {
				@Pc(65) int local65 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local65;
				@Pc(79) int local79 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local79;
			}
		}
		arg2[arg3] = arg2[local16];
		arg2[local16] = local20;
		arg1[arg3] = arg1[local16];
		arg1[local16] = local34;
		method6039(arg0, arg1, arg2, local16 - 1);
		method6039(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(JB)V")
	public static void method6040(@OriginalArg(0) long arg0) {
		@Pc(12) int local12 = Static327.anInt6692;
		@Pc(14) int local14 = Static72.anInt1985;
		@Pc(22) int local22;
		@Pc(30) int local30;
		if (Static142.anInt3529 != local12) {
			local22 = local12 - Static142.anInt3529;
			local30 = (int) ((long) local22 * arg0 / 320L);
			if (local22 > 0) {
				if (local30 == 0) {
					local30 = 1;
				} else if (local30 > local22) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = -1;
			} else if (local30 < local22) {
				local30 = local22;
			}
			Static142.anInt3529 += local30;
		}
		if (!Static69.aBoolean133) {
			Static189.aFloat55 += (float) arg0 * Static220.aFloat63 / 40.0F * 8.0F;
			Static188.aFloat17 += Static164.aFloat50 * (float) arg0 / 40.0F * 8.0F;
		}
		if (local14 != Static12.anInt536) {
			local22 = local14 - Static12.anInt536;
			local30 = (int) (arg0 * (long) local22 / 320L);
			if (local22 <= 0) {
				if (local30 == 0) {
					local30 = -1;
				} else if (local22 > local30) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = 1;
			} else if (local30 > local22) {
				local30 = local22;
			}
			Static12.anInt536 += local30;
		}
		Static273.method4900();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([BB)[B")
	public static byte[] method6042(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static360.method2013(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6043(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(13) int local13 = arg0.indexOf(arg1); local13 != -1; local13 = arg0.indexOf(arg1, arg2.length() + local13)) {
			arg0 = arg0.substring(0, local13) + arg2 + arg0.substring(arg1.length() + local13);
		}
		return arg0;
	}
}
