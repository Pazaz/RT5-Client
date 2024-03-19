import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Lclient!we;")
	public static final Class215 aClass215_38 = new Class215(64);

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	public static int anInt2328 = 0;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
	public static int anInt2330 = 0;

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
	public static int anInt2332 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
	public static void method1937() {
		if (Static13.method5497() || Static39.anInt1215 == Static331.anInt6843) {
			Static208.method4123(Static221.aClass40_6);
			if (Static39.anInt1215 != Static189.anInt4391) {
				Static316.method5517();
			}
		} else {
			Static191.method3801(false, Static274.anInt5784, false, Static213.anInt1925, Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], Static39.anInt1215, Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0]);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBI)I")
	public static int method1938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;Lclient!qj;BZ)Lclient!sc;")
	public static Class181 method1939(@OriginalArg(0) String arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method4631(arg0);
		if (local10 == -1) {
			return new Class181(0);
		}
		@Pc(23) int[] local23 = arg1.method4621(local10);
		@Pc(37) Class181 local37 = new Class181(local23.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local39 < local37.anInt5956) {
				@Pc(55) Class1_Sub16 local55 = new Class1_Sub16(arg1.method4636(local23[local41++], local10));
				@Pc(59) int local59 = local55.method5730();
				@Pc(63) int local63 = local55.method5749();
				@Pc(67) int local67 = local55.method5761();
				if (!arg2 && local67 == 1) {
					local37.anInt5956--;
				} else {
					local37.anIntArray451[local39] = local59;
					local37.anIntArray452[local39] = local63;
					local39++;
				}
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIZIB)V")
	public static void method1940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (Static199.method3942(arg3)) {
			Static271.method4864(arg2, Class1_Sub2_Sub10.lb[arg3], arg0, arg1, -1);
		}
	}
}
