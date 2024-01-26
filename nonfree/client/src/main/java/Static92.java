import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
	public static int anInt1874 = 0;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBI)V")
	public static void method1757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class367 local18 = Static665.aClass367ArrayArray1[arg0][arg1];
		if (local18 != null) {
			Static344.anInt5617 = local18.anInt9535;
			Static331.anInt5441 = local18.anInt9534;
			Static417.anInt6400 = local18.anInt9533;
		}
		Static588.method7713();
	}
}
