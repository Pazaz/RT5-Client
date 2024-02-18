import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!jga", name = "k", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!jga", name = "l", descriptor = "I")
	public static int anInt4781 = 0;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(III)V")
	public static void method4347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub2_Sub2 local14 = Static440.method5963(13, (long) arg0);
		local14.method202();
		local14.anInt197 = arg1;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIBILclient!qha;)Lclient!gb;")
	public static Class93_Sub2_Sub1 method4353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class19_Sub3 arg4) {
		if (arg4.aBoolean597 || Static700.method9150(arg2) && Static700.method9150(arg1)) {
			return new Class93_Sub2_Sub1(arg4, 3553, arg0, arg3, arg2, arg1, true);
		} else if (arg4.aBoolean595) {
			return new Class93_Sub2_Sub1(arg4, 34037, arg0, arg3, arg2, arg1, true);
		} else {
			return new Class93_Sub2_Sub1(arg4, arg0, arg3, arg2, arg1, Static440.method5962(arg2), Static440.method5962(arg1), true);
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIII)V")
	public static void method4354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static62.anIntArrayArray33 != null) {
			Static62.anIntArrayArray33[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static272.aShortArrayArray5 != null) {
			Static272.aShortArrayArray5[arg0][arg1] = (short) arg3;
		}
		if (Static421.aByteArrayArray20 != null) {
			Static421.aByteArrayArray20[arg0][arg1] = (byte) arg4;
		}
	}
}
