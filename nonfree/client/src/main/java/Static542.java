import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!st;")
	public static Class23 aClass23_33;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_199 = new Class225(104, 8);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([Ljava/lang/Object;B[JII)V")
	public static void method7200(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(12) int local12 = (arg2 + arg3) / 2;
		@Pc(14) int local14 = arg2;
		@Pc(18) long local18 = arg1[local12];
		arg1[local12] = arg1[arg3];
		arg1[arg3] = local18;
		@Pc(32) Object local32 = arg0[local12];
		arg0[local12] = arg0[arg3];
		arg0[arg3] = local32;
		@Pc(51) int local51 = local18 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg2; local53 < arg3; local53++) {
			if (local18 + (long) (local53 & local51) > arg1[local53]) {
				@Pc(70) long local70 = arg1[local53];
				arg1[local53] = arg1[local14];
				arg1[local14] = local70;
				@Pc(84) Object local84 = arg0[local53];
				arg0[local53] = arg0[local14];
				arg0[local14++] = local84;
			}
		}
		arg1[arg3] = arg1[local14];
		arg1[local14] = local18;
		arg0[arg3] = arg0[local14];
		arg0[local14] = local32;
		method7200(arg0, arg1, arg2, local14 - 1);
		method7200(arg0, arg1, local14 + 1, arg3);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!hda;)V")
	public static void method7202(@OriginalArg(1) Class158 arg0) {
		if (arg0.anInt3820 == 5 && arg0.anInt3760 != -1) {
			Static485.method9415(arg0, Static163.aClass19_17);
		}
	}
}
