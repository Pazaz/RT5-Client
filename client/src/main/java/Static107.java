import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!je;")
	public static Class113 aClass113_5;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public static int anInt2220;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	public static int anInt2219 = -1;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "[I")
	public static int[] anIntArray136 = new int[2];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!wm;IIIIIIILclient!gn;IZ)Lclient!gn;")
	public static Model method2237(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Model arg8, @OriginalArg(9) int arg9) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(12) Model local12 = (Model) Static133.aClass98_17.get(local6);
		if (local12 == null) {
			@Pc(22) Class185 local22 = Static298.method2426(client.jsArchive7, arg4);
			if (local22 == null) {
				return null;
			}
			local12 = arg0.method2864(local22, 1031, Static238.anInt4338, 64, 768);
			Static133.aClass98_17.put(local6, local12);
		}
		local12 = local12.method3800((byte) 2, 1031, true);
		if (arg5 != 0) {
			local12.method3833(arg5);
		}
		if (arg6 != 0) {
			local12.method3824(arg6);
		}
		if (arg3 != 0) {
			local12.method3815(arg3);
		}
		if (arg7 != 0) {
			local12.method3813(0, arg7, 0);
		}
		return local12;
	}
}
