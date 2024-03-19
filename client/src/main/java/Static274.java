import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!ro", name = "yb", descriptor = "I")
	public static int anInt5784;

	@OriginalMember(owner = "client!ro", name = "Cc", descriptor = "J")
	public static long aLong179;

	@OriginalMember(owner = "client!ro", name = "id", descriptor = "I")
	public static int anInt5833;

	@OriginalMember(owner = "client!ro", name = "Eb", descriptor = "I")
	public static int anInt5789 = 0;

	@OriginalMember(owner = "client!ro", name = "zc", descriptor = "Lclient!we;")
	public static Class215 aClass215_83 = new Class215(64);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method4904(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 + 1 - 'A';
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 + 1 - 97;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIZ)V")
	public static void method4911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(8, arg3);
		local8.method2539();
		local8.anInt2960 = arg2;
		local8.anInt2954 = arg1;
		local8.anInt2952 = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)V")
	public static void method4918(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub10 local12 = Static122.method2624(4, arg0);
		local12.method2536();
	}
}
