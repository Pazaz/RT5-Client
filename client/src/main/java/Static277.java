import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!q", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "I")
	public static int anInt5115;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!ld;")
	public static final LinkedList aClass135_31 = new LinkedList();

	@OriginalMember(owner = "client!q", name = "q", descriptor = "F")
	public static float aFloat67 = 0.0F;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIB)V")
	public static void method4680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) DelayedStateChange local12 = Static316.method5413(8, arg2);
		local12.method2311();
		local12.anInt2289 = arg1;
		local12.anInt2284 = arg3;
		local12.anInt2290 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!mr;B)V")
	public static void method4682(@OriginalArg(0) PathingEntity arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt4584 == client.cycle || arg0.anInt4597 == -1 || arg0.anInt4590 != 0) {
			local5 = true;
		} else {
			@Pc(25) Class157 local25 = client.SeqTypes.method2371(arg0.anInt4597);
			if (local25.aBoolean264 || arg0.anInt4624 + 1 > local25.anIntArray261[arg0.anInt4607]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt4584 - arg0.anInt4622;
			@Pc(63) int local63 = client.cycle - arg0.anInt4622;
			@Pc(75) int local75 = arg0.anInt4615 * 128 + arg0.getSize() * 64;
			@Pc(86) int local86 = arg0.anInt4588 * 128 + arg0.getSize() * 64;
			@Pc(97) int local97 = arg0.anInt4577 * 128 + arg0.getSize() * 64;
			@Pc(109) int local109 = arg0.anInt4599 * 128 + arg0.getSize() * 64;
			arg0.xFine = ((local57 - local63) * local75 + local63 * local97) / local57;
			arg0.zFine = ((local57 - local63) * local86 + local63 * local109) / local57;
		}
		arg0.anInt4641 = 0;
		if (arg0.anInt4614 == 0) {
			arg0.method4330(8192);
		}
		if (arg0.anInt4614 == 1) {
			arg0.method4330(12288);
		}
		if (arg0.anInt4614 == 2) {
			arg0.method4330(0);
		}
		if (arg0.anInt4614 == 3) {
			arg0.method4330(4096);
		}
	}
}
