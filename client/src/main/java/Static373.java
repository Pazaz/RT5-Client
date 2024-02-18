import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
	public static int anInt5903;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
	public static int anInt5905;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[[F[[S)[[S")
	public static short[][] method5300(@OriginalArg(1) float[][] arg0, @OriginalArg(2) short[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			for (@Pc(9) int local9 = 0; local9 < arg1[local3].length; local9++) {
				arg1[local3][local9] = (short) (int) (arg0[local3][local9] * 16383.0F);
			}
		}
		anInt5903++;
		return arg1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIII)Lclient!pu;")
	public static Class67 method5301(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg5 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg0 * 32147369L ^ (long) arg4 * 76724863L;
		@Pc(39) Class67 local39 = (Class67) Static264.aClass82_235.method2156(local33);
		if (local39 == null) {
			local39 = Static425.aClass19_13.method8008(arg5, arg1, arg2, arg3, arg0, arg4);
			Static264.aClass82_235.method2150(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}
}
