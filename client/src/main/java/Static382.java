import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!m", name = "l", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "[I")
	public static final int[] anIntArray465 = new int[1000];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BII)V")
	public static void method5370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub2_Sub2 local14 = Static440.method5963(12, (long) arg1);
		local14.method202();
		local14.anInt197 = arg0;
	}
}
