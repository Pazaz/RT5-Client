import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fm", name = "K", descriptor = "Lclient!qj;")
	public static Class162 aClass162_79;

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
	public static int anInt2268 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;I)V")
	public static void method1902(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static122.anIntArray225[local7] = Static122.anIntArray225[local7 - 1];
			Static173.anIntArray288[local7] = Static173.anIntArray288[local7 - 1];
			Static89.aStringArray15[local7] = Static89.aStringArray15[local7 - 1];
			Static255.aStringArray33[local7] = Static255.aStringArray33[local7 - 1];
			Static236.aStringArray31[local7] = Static236.aStringArray31[local7 - 1];
			Static174.aStringArray26[local7] = Static174.aStringArray26[local7 - 1];
			Static104.anIntArray168[local7] = Static104.anIntArray168[local7 - 1];
		}
		Static122.anIntArray225[0] = arg2;
		Static173.anIntArray288[0] = arg4;
		Static89.aStringArray15[0] = arg0;
		Static255.aStringArray33[0] = arg1;
		Static236.aStringArray31[0] = arg3;
		Static174.aStringArray26[0] = arg5;
		Static148.anInt3660 = Class7_Sub5.anInt3948;
		Static104.anIntArray168[0] = arg6;
		Static92.anInt2419++;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([BB)[B")
	public static byte[] method1903(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub16 local8 = new Class1_Sub16(arg0);
		@Pc(12) int local12 = local8.method5761();
		@Pc(16) int local16 = local8.method5730();
		if (local16 < 0 || Static245.anInt3135 != 0 && Static245.anInt3135 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(98) byte[] local98 = new byte[local16];
			local8.method5774(local16, local98);
			return local98;
		} else {
			@Pc(58) int local58 = local8.method5730();
			if (local58 < 0 || Static245.anInt3135 != 0 && local58 > Static245.anInt3135) {
				throw new RuntimeException();
			}
			@Pc(76) byte[] local76 = new byte[local58];
			if (local12 == 1) {
				Static5.method152(local76, local58, arg0, local16);
			} else {
				Static185.aClass151_1.method4386(local8, local76);
			}
			return local76;
		}
	}

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "(I)V")
	public static void method1904() {
		Static123.aStringArray19 = new String[500];
		Static183.anInt4321 = Static208.aClass63_6.anInt2192 + Static208.aClass63_6.anInt2197 + 2;
		Static208.anInt4814 = Static140.aClass63_4.anInt2192 + Static140.aClass63_4.anInt2197 + 2;
		for (@Pc(26) int local26 = 0; local26 < Static123.aStringArray19.length; local26++) {
			Static123.aStringArray19[local26] = "";
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([[II)V")
	public static void method1905(@OriginalArg(0) int[][] arg0) {
		Static87.anIntArrayArray9 = arg0;
	}
}
