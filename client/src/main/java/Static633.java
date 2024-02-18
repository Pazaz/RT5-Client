import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	public static int anInt10897 = -1;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
	public static void method9425(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub2_Sub2 local16 = Static440.method5963(6, (long) arg0);
		local16.method205();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)I")
	public static int method9430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}
}
