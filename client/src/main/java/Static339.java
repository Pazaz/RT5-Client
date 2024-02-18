import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static339 {

	@OriginalMember(owner = "client!kma", name = "n", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray2;

	@OriginalMember(owner = "client!kma", name = "m", descriptor = "Lclient!ge;")
	public static Packet aPacket_9;

	@OriginalMember(owner = "client!kma", name = "a", descriptor = "(II)I")
	public static int method5005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static421.aByteArrayArray20 == null ? 0 : Static421.aByteArrayArray20[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!kma", name = "a", descriptor = "(I[[[BIIIILclient!ha;IIBIII)V")
	public static void method5007(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg11 == 0 || arg4 == 0) {
			return;
		}
		if (arg11 == 9) {
			arg8 = arg8 + 1 & 0x3;
			arg11 = 1;
		}
		if (arg11 == 10) {
			arg11 = 1;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg11 == 11) {
			arg8 = arg8 + 3 & 0x3;
			arg11 = 8;
		}
		arg6.Q(arg5, arg9, arg3, arg0, arg10, arg2, arg1[arg11 - 1][arg8], arg4, arg7);
	}
}
