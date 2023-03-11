import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static402 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZILclient!bf;[III)Lclient!ln;")
	public static Class8_Sub1_Sub1 method3640(@OriginalArg(2) Class19_Sub1 arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0.aBoolean45 || Static246.method4251(arg2) && Static246.method4251(arg3)) {
			return new Class8_Sub1_Sub1(arg0, 3553, arg2, arg3, false, arg1);
		} else if (arg0.aBoolean41) {
			return new Class8_Sub1_Sub1(arg0, 34037, arg2, arg3, false, arg1);
		} else {
			return new Class8_Sub1_Sub1(arg0, arg2, arg3, Static162.method2977(arg2), Static162.method2977(arg3), arg1);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZILclient!bf;[BIIII)Lclient!ln;")
	public static Class8_Sub1_Sub1 method3641(@OriginalArg(2) Class19_Sub1 arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(7) int arg3) {
		if (arg0.aBoolean45 || Static246.method4251(arg3) && Static246.method4251(arg2)) {
			return new Class8_Sub1_Sub1(arg0, 3553, 6406, arg3, arg2, false, arg1, 6406);
		} else if (arg0.aBoolean41) {
			return new Class8_Sub1_Sub1(arg0, 34037, 6406, arg3, arg2, false, arg1, 6406);
		} else {
			return new Class8_Sub1_Sub1(arg0, 6406, arg3, arg2, Static162.method2977(arg3), Static162.method2977(arg2), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIBLclient!bf;)Lclient!ln;")
	public static Class8_Sub1_Sub1 method3642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4) {
		if (arg4.aBoolean45 || Static246.method4251(arg2) && Static246.method4251(arg3)) {
			return new Class8_Sub1_Sub1(arg4, 3553, arg0, arg1, arg2, arg3, true);
		} else if (arg4.aBoolean41) {
			return new Class8_Sub1_Sub1(arg4, 34037, arg0, arg1, arg2, arg3, true);
		} else {
			return new Class8_Sub1_Sub1(arg4, arg0, arg1, arg2, arg3, Static162.method2977(arg2), Static162.method2977(arg3), true);
		}
	}
}
