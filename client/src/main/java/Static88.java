import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static88 {

	@OriginalMember(owner = "client!co", name = "t", descriptor = "Lclient!sb;")
	public static Class330 aClass330_14;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)Z")
	public static boolean method1705(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static139.method2358(arg1, arg0) || Static293.method4333(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static198.method2957(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!qha;IIZI[III)Lclient!gb;")
	public static Class93_Sub2_Sub1 method1706(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0.aBoolean597 || Static700.method9150(arg1) && Static700.method9150(arg4)) {
			return new Class93_Sub2_Sub1(arg0, 3553, arg1, arg4, false, arg3, arg2, 0);
		} else if (arg0.aBoolean595) {
			return new Class93_Sub2_Sub1(arg0, 34037, arg1, arg4, false, arg3, arg2, 0);
		} else {
			return new Class93_Sub2_Sub1(arg0, arg1, arg4, Static440.method5962(arg1), Static440.method5962(arg4), arg3);
		}
	}
}
