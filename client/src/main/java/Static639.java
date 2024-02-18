import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
	public static int anInt9571;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "Lclient!mia;")
	public static final Class242 aClass242_13 = new Class242("", 17);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!pq;IIZILclient!pq;Z)I")
	public static int method8418(@OriginalArg(0) Class297_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class297_Sub1 arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 < 14) {
			method8418((Class297_Sub1) null, -49, -123, false, -125, (Class297_Sub1) null, true);
		}
		@Pc(24) int local24 = Static669.method8712(arg0, arg6, arg5, arg1);
		if (local24 != 0) {
			return arg6 ? -local24 : local24;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(52) int local52 = Static669.method8712(arg0, arg3, arg5, arg2);
			return arg3 ? -local52 : local52;
		}
	}
}
