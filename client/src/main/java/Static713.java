import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static713 {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_125 = new Class345(25, 8);

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_231 = new Class82(64);

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "Lclient!tka;")
	public static final Class355 aClass355_8 = new Class355("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V")
	public static void method9331(@OriginalArg(1) boolean arg0) {
		Static712.aClass73_11.method7128(Static74.aClass19_4.method8017());
		@Pc(10) int[] local10 = Static74.aClass19_4.Y();
		Static338.anInt5563 = local10[0];
		Static637.anInt9536 = local10[1];
		Static172.anInt2888 = local10[2];
		Static630.anInt9494 = local10[3];
		if (arg0) {
			Static74.aClass19_4.DA(Static213.anInt3469, Static524.anInt8043, Static46.anInt1001, Static246.anInt3986);
			Static278.method4068(Static294.aDouble15);
		} else {
			Static74.aClass19_4.DA(Static354.anInt5759, Static391.anInt6134, Static434.anInt6565, Static646.anInt9621);
			Static278.method4068(Static246.aDouble13);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method9333(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(29) char local29 = arg0.charAt(local14);
			if (local29 == '%' && local12 > local14 + 2) {
				local29 = arg0.charAt(local14 + 1);
				@Pc(84) int local84;
				if (local29 >= '0' && local29 <= '9') {
					local84 = local29 - '0';
				} else if (local29 >= 'a' && local29 <= 'f') {
					local84 = local29 + 10 - 97;
				} else {
					if (local29 < 'A' || local29 > 'F') {
						local9.append('%');
						continue;
					}
					local84 = local29 + 10 - 'A';
				}
				local29 = arg0.charAt(local14 + 2);
				local84 *= 16;
				if (local29 >= '0' && local29 <= '9') {
					local84 += local29 - 48;
				} else if (local29 >= 'a' && local29 <= 'f') {
					local84 += local29 + 10 - 97;
				} else {
					if (local29 < 'A' || local29 > 'F') {
						local9.append('%');
						continue;
					}
					local84 += local29 + 10 - 65;
				}
				local14 += 2;
				if (local84 != 0 && Static529.method7094((byte) local84)) {
					local9.append(Static346.method5084((byte) local84));
				}
			} else if (local29 == '+') {
				local9.append(' ');
			} else {
				local9.append(local29);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(JJ)J")
	public static long method9334(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)I")
	public static int method9336(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
