import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_44 = new LruHashTable(8);

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "[I")
	public static final int[] anIntArray383 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIII)Lclient!rc;")
	public static Class42 method5107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 97549L ^ (long) arg4 * 67481L ^ (long) arg0 * 475427L ^ (long) arg5 * 986053L ^ (long) arg1 * 32147369L ^ (long) arg2 * 76724863L;
		@Pc(44) Class42 local44 = (Class42) Static254.aClass98_39.get(local33);
		if (local44 == null) {
			local44 = Static65.aClass19_3.method2877(arg4, arg3, arg0, arg5, arg1, arg2);
			Static254.aClass98_39.put(local33, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Z")
	public static boolean method5111(@OriginalArg(0) int arg0) {
		if (arg0 == 5 || arg0 == 25 || arg0 == 4 || arg0 == 3 || arg0 == 8) {
			return true;
		} else {
			return arg0 == 10 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLclient!mr;)V")
	public static void method5113(@OriginalArg(1) PathingEntity arg0) {
		@Pc(16) int local16 = arg0.anInt4622 - client.cycle;
		@Pc(27) int local27 = arg0.anInt4615 * 128 + arg0.getSize() * 64;
		@Pc(39) int local39 = arg0.anInt4588 * 128 + arg0.getSize() * 64;
		arg0.xFine += (local27 - arg0.xFine) / local16;
		arg0.zFine += (local39 - arg0.zFine) / local16;
		arg0.anInt4641 = 0;
		if (arg0.anInt4614 == 0) {
			arg0.method4325(8192);
		}
		if (arg0.anInt4614 == 1) {
			arg0.method4325(12288);
		}
		if (arg0.anInt4614 == 2) {
			arg0.method4325(0);
		}
		if (arg0.anInt4614 == 3) {
			arg0.method4325(4096);
		}
	}
}
