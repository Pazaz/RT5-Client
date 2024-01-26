import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static705 {

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "Lclient!it;")
	public static final Class184 aClass184_19 = new Class184(15, 0, 1, 0);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
	public static int method9197(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)I")
	public static int method9198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static280.aByteArrayArrayArray3[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static280.aByteArrayArrayArray3[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
