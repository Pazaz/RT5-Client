import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
	public static int anInt3773;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	public static int anInt3761 = 500;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_31 = new Class98(8);

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "Lclient!h;")
	public static final Class89 aClass89_155 = new Class89(46, -1);

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "Lclient!h;")
	public static final Class89 aClass89_156 = new Class89(7, 2);

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
	public static int anInt3774 = 0;

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "[I")
	public static final int[] anIntArray229 = new int[4];

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIB)I")
	public static int method3719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static365.aClass6Array4 == null) {
			return 0;
		}
		if (arg1 < 3) {
			@Pc(21) int local21 = arg3 >> 7;
			@Pc(25) int local25 = arg4 >> 7;
			if (arg2 < 0 || arg0 < 0 || Static373.anInt7033 - 1 < arg2 || arg0 > Static242.anInt4449 - 1) {
				return 0;
			}
			if (local21 < 1 || local25 < 1 || Static373.anInt7033 - 1 < local21 || local25 > Static242.anInt4449 - 1) {
				return 0;
			}
			@Pc(91) boolean local91 = (Static359.aByteArrayArrayArray16[1][arg3 >> 7][arg4 >> 7] & 0x2) != 0;
			@Pc(116) boolean local116;
			@Pc(135) boolean local135;
			if ((arg3 & 0x7F) == 0) {
				local116 = (Static359.aByteArrayArrayArray16[1][local21 - 1][arg4 >> 7] & 0x2) != 0;
				local135 = (Static359.aByteArrayArrayArray16[1][local21][arg4 >> 7] & 0x2) != 0;
				if (local135 != local116) {
					local91 = (Static359.aByteArrayArrayArray16[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if ((arg4 & 0x7F) == 0) {
				local116 = (Static359.aByteArrayArrayArray16[1][arg3 >> 7][local25 - 1] & 0x2) != 0;
				local135 = (Static359.aByteArrayArrayArray16[1][arg3 >> 7][local25] & 0x2) != 0;
				if (local135 != local116) {
					local91 = (Static359.aByteArrayArrayArray16[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if (local91) {
				arg1++;
			}
		}
		return Static365.aClass6Array4[arg1].method5728(arg3, arg4);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public static void method3720() {
		Static26.aClass161ArrayArray1 = new Class161[Static283.aClass197_68.method5092()][];
		Static113.aClass161ArrayArray2 = new Class161[Static283.aClass197_68.method5092()][];
		Static128.aBooleanArray21 = new boolean[Static283.aClass197_68.method5092()];
	}
}
