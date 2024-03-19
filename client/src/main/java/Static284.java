import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static284 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZILclient!ro;)V")
	public static void method5097(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class177 arg2) {
		if (arg2.aByte56 == 0) {
			arg2.anInt5820 = arg2.anInt5823;
		} else if (arg2.aByte56 == 1) {
			arg2.anInt5820 = arg2.anInt5823 + (arg0 - arg2.anInt5803) / 2;
		} else if (arg2.aByte56 == 2) {
			arg2.anInt5820 = arg0 - arg2.anInt5803 - arg2.anInt5823;
		} else if (arg2.aByte56 == 3) {
			arg2.anInt5820 = arg0 * arg2.anInt5823 >> 14;
		} else if (arg2.aByte56 == 4) {
			arg2.anInt5820 = (arg0 * arg2.anInt5823 >> 14) + (arg0 - arg2.anInt5803) / 2;
		} else {
			arg2.anInt5820 = arg0 - (arg0 * arg2.anInt5823 >> 14) - arg2.anInt5803;
		}
		if (arg2.aByte53 == 0) {
			arg2.anInt5772 = arg2.anInt5813;
		} else if (arg2.aByte53 == 1) {
			arg2.anInt5772 = arg2.anInt5813 + (arg1 - arg2.anInt5816) / 2;
		} else if (arg2.aByte53 == 2) {
			arg2.anInt5772 = arg1 - arg2.anInt5816 - arg2.anInt5813;
		} else if (arg2.aByte53 == 3) {
			arg2.anInt5772 = arg2.anInt5813 * arg1 >> 14;
		} else if (arg2.aByte53 == 4) {
			arg2.anInt5772 = (arg1 * arg2.anInt5813 >> 14) + (arg1 - arg2.anInt5816) / 2;
		} else {
			arg2.anInt5772 = arg1 - (arg1 * arg2.anInt5813 >> 14) - arg2.anInt5816;
		}
		if (!Static278.aBoolean279 || Static37.method930(arg2).anInt6604 == 0 && arg2.anInt5838 != 0) {
			return;
		}
		if (arg2.anInt5820 < 0) {
			arg2.anInt5820 = 0;
		} else if (arg2.anInt5803 + arg2.anInt5820 > arg0) {
			arg2.anInt5820 = arg0 - arg2.anInt5803;
		}
		if (arg2.anInt5772 < 0) {
			arg2.anInt5772 = 0;
		} else if (arg1 < arg2.anInt5816 + arg2.anInt5772) {
			arg2.anInt5772 = arg1 - arg2.anInt5816;
			return;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Lclient!c;")
	public static Class27_Sub1 method5098() {
		Static64.anInt1754 = 0;
		return Static318.method5598();
	}
}
