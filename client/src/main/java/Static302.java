import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!th", name = "j", descriptor = "[Lclient!c;")
	public static Class27_Sub1[] aClass27_Sub1Array1;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	public static int anInt6305;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	public static int anInt6307;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Lclient!hh;")
	public static final Class83 aClass83_1 = new Class83();

	@OriginalMember(owner = "client!th", name = "e", descriptor = "I")
	public static int anInt6301 = 99;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "Lclient!ro;")
	public static Class177 aClass177_20 = null;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "I")
	public static int anInt6306 = 0;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString237 = null;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	public static void method5276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static128.anIntArray239[arg0] = arg1;
		@Pc(14) Class1_Sub34 local14 = (Class1_Sub34) Static72.aClass183_6.method5053((long) arg0);
		if (local14 == null) {
			local14 = new Class1_Sub34(4611686018427387905L);
			Static72.aClass183_6.method5055((long) arg0, local14);
		} else if (local14.aLong190 != 4611686018427387905L) {
			local14.aLong190 = Static325.method5658() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIBI)V")
	public static void method5277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static266.anInt5654; local3++) {
			@Pc(9) Rectangle local9 = Class111.aRectangleArray2[local3];
			if (arg3 < local9.x + local9.width && arg3 + arg1 > local9.x && local9.height + local9.y > arg0 && local9.y < arg2 + arg0) {
				Static31.aBooleanArray2[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIII)V")
	public static void method5281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class204 local3 = new Class204();
		local3.anInt6573 = arg1 >> 7;
		local3.anInt6578 = arg2 >> 7;
		local3.anInt6572 = arg3 >> 7;
		local3.anInt6571 = arg4 >> 7;
		local3.anInt6584 = arg0;
		local3.anInt6568 = arg1;
		local3.anInt6566 = arg2;
		local3.anInt6575 = arg3;
		local3.anInt6586 = arg4;
		local3.anInt6587 = arg5;
		local3.anInt6567 = arg6;
		Static341.aClass204Array2[Static62.anInt1710++] = local3;
	}
}
