import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "[I")
	public static final int[] anIntArray161 = new int[14];

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "Z")
	public static boolean aBoolean180 = false;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
	public static final int[] anIntArray162 = new int[100];

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	public static int anInt2468 = -2;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lclient!rt;")
	public static ModeEnvironment method2484(@OriginalArg(0) int arg0) {
		@Pc(8) ModeEnvironment[] local8 = ModeEnvironment.getMoveEnvironments();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) ModeEnvironment local21 = local8[local15];
			if (local21.anInt5803 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method2485(@OriginalArg(1) String arg0) {
		return Static340.method5766(arg0);
	}
}
