import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Lclient!as;")
	public static Timer aClass5_1;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "[I")
	public static final int[] anIntArray396 = new int[14];

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Lclient!gg;")
	public static DelayedStateChange method5413(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) DelayedStateChange local15 = (DelayedStateChange) Static296.aClass4_109.get((long) arg1 | (long) arg0 << 32);
		if (local15 == null) {
			local15 = new DelayedStateChange(arg0, arg1);
			Static296.aClass4_109.put(local15, local15.key);
		}
		return local15;
	}
}
