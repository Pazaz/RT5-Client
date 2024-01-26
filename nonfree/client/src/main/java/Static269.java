import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "Lclient!sb;")
	public static Class330 aClass330_58;

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_111 = new Class225(6, -2);

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILjava/lang/String;IZ)I")
	public static int method3908(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + arg1);
		}
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = arg0.length();
		for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
			@Pc(49) char local49 = arg0.charAt(local44);
			if (local44 == 0) {
				if (local49 == '-') {
					local29 = true;
					continue;
				}
				if (local49 == '+' && true) {
					continue;
				}
			}
			@Pc(104) int local104;
			if (local49 >= '0' && local49 <= '9') {
				local104 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local104 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local104 = local49 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local104 >= arg1) {
				throw new NumberFormatException();
			}
			if (local29) {
				local104 = -local104;
			}
			@Pc(136) int local136 = local104 + arg1 * local39;
			if (local39 != local136 / arg1) {
				throw new NumberFormatException();
			}
			local31 = true;
			local39 = local136;
		}
		if (!local31) {
			throw new NumberFormatException();
		}
		return local39;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)V")
	public static void method3909() {
		Static480.aClass361_2.method8345();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method3911(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static384.aClass75Array2[Static317.anInt5046++] = new Class75(4, arg5, arg1, arg6, arg6, arg1, arg2, arg4, arg4, arg2, arg3, arg3, arg0, arg0);
	}
}
