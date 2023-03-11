import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!da", name = "i", descriptor = "I")
	public static int anInt3966 = 0;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "I")
	public static int anInt3971 = 0;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	public static void method3952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub2_Sub7 local12 = Static316.method5413(5, arg1);
		local12.method2311();
		local12.anInt2289 = arg0;
	}
}
