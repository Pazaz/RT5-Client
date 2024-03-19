import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static365 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ih;I[BIZIII)Lclient!ns;")
	public static Class44_Sub1_Sub1 method4164(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(6) int arg3) {
		if (arg0.aBoolean228 || Static272.method4899(arg1) && Static272.method4899(arg3)) {
			return new Class44_Sub1_Sub1(arg0, 3553, 6406, arg1, arg3, false, arg2, 6406);
		} else if (arg0.aBoolean215) {
			return new Class44_Sub1_Sub1(arg0, 34037, 6406, arg1, arg3, false, arg2, 6406);
		} else {
			return new Class44_Sub1_Sub1(arg0, 6406, arg1, arg3, Static162.method3414(arg1), Static162.method3414(arg3), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!ih;II[IZ)Lclient!ns;")
	public static Class44_Sub1_Sub1 method4165(@OriginalArg(0) int arg0, @OriginalArg(1) Class40_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1.aBoolean228 || Static272.method4899(arg2) && Static272.method4899(arg0)) {
			return new Class44_Sub1_Sub1(arg1, 3553, arg2, arg0, false, arg3);
		} else if (arg1.aBoolean215) {
			return new Class44_Sub1_Sub1(arg1, 34037, arg2, arg0, false, arg3);
		} else {
			return new Class44_Sub1_Sub1(arg1, arg2, arg0, Static162.method3414(arg2), Static162.method3414(arg0), arg3);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!ih;IIIB)Lclient!ns;")
	public static Class44_Sub1_Sub1 method4166(@OriginalArg(0) int arg0, @OriginalArg(1) Class40_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1.aBoolean228 || Static272.method4899(arg3) && Static272.method4899(arg0)) {
			return new Class44_Sub1_Sub1(arg1, 3553, arg4, arg2, arg3, arg0, true);
		} else if (arg1.aBoolean215) {
			return new Class44_Sub1_Sub1(arg1, 34037, arg4, arg2, arg3, arg0, true);
		} else {
			return new Class44_Sub1_Sub1(arg1, arg4, arg2, arg3, arg0, Static162.method3414(arg3), Static162.method3414(arg0), true);
		}
	}
}
