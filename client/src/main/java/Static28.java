import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "Lclient!qj;")
	public static Class162 aClass162_43;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "Lclient!we;")
	public static final Class215 aClass215_16 = new Class215(32);

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString39 = "Loading world list data";

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!nr;Lclient!cb;IIIII)V")
	public static void method663(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static214.anInt4867) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static328.anInt6717) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static200.anInt4590 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class154 local62 = Static241.aClass154ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static118.aClass77Array1[local17].method3986(local23, local32) + Static118.aClass77Array1[local17].method3986(local23 + 1, local32) + Static118.aClass77Array1[local17].method3986(local23, local32 + 1) + Static118.aClass77Array1[local17].method3986(local23 + 1, local32 + 1)) / 4 - (Static118.aClass77Array1[arg2].method3986(arg3, arg4) + Static118.aClass77Array1[arg2].method3986(arg3 + 1, arg4) + Static118.aClass77Array1[arg2].method3986(arg3, arg4 + 1) + Static118.aClass77Array1[arg2].method3986(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class7_Sub2 local143 = local62.aClass7_Sub2_1;
									@Pc(146) Class7_Sub2 local146 = local62.aClass7_Sub2_2;
									if (local143 != null && local143.method5952()) {
										arg1.method5956(arg0, (local32 - arg4) * 128 + (1 - arg6) * 64, (local23 - arg3) * 128 + (1 - arg5) * 64, local1, local143, local140);
									}
									if (local146 != null && local146.method5952()) {
										arg1.method5956(arg0, (local32 - arg4) * 128 + (1 - arg6) * 64, (local23 - arg3) * 128 + (1 - arg5) * 64, local1, local146, local140);
									}
									for (@Pc(219) Class93 local219 = local62.aClass93_3; local219 != null; local219 = local219.aClass93_2) {
										@Pc(223) Class7_Sub1 local223 = local219.aClass7_Sub1_1;
										if (local223 != null && local223.method5952() && (local23 == local223.aShort93 || local23 == local3) && (local32 == local223.aShort91 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort92 + 1 - local223.aShort93;
											@Pc(260) int local260 = local223.aShort90 + 1 - local223.aShort91;
											arg1.method5956(arg0, (local223.aShort91 - arg4) * 128 + (local260 - arg6) * 64, (local223.aShort93 - arg3) * 128 + (local252 - arg5) * 64, local1, local223, local140);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
