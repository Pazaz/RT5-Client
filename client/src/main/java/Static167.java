import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "[I")
	public static final int[] anIntArray248 = new int[4];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIII)V")
	public static void method2630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class2_Sub2_Sub2 local14 = Static440.method5963(19, (long) arg1 << 32 | (long) arg2);
		local14.method202();
		local14.anInt197 = arg0;
		local14.anInt195 = arg3;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)Lclient!ah;")
	public static Class13 method2632() {
		try {
			return (Class13) Class.forName("Class13_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class13_Sub1();
		}
	}
}
