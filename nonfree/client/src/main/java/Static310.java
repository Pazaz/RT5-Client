import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!jr", name = "I", descriptor = "[I")
	public static final int[] anIntArray379 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "([II[I[ILclient!cg;)V")
	public static void method4505(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class8_Sub2_Sub1_Sub2 arg3) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			@Pc(20) int local20 = arg1[local14];
			@Pc(24) int local24 = arg0[local14];
			@Pc(28) int local28 = arg2[local14];
			@Pc(30) int local30 = 0;
			while (local24 != 0 && arg3.aClass152_Sub2_Sub1Array3.length > local30) {
				if ((local24 & 0x1) != 0) {
					if (local20 == -1) {
						arg3.aClass152_Sub2_Sub1Array3[local30] = null;
					} else {
						@Pc(60) Class69 local60 = Static25.aClass50_1.method1162(local20);
						@Pc(63) int local63 = local60.anInt1646;
						@Pc(68) Class152_Sub2_Sub1 local68 = arg3.aClass152_Sub2_Sub1Array3[local30];
						if (local68 != null && local68.method9109()) {
							if (local20 == local68.method9114()) {
								if (local63 == 0) {
									local68 = arg3.aClass152_Sub2_Sub1Array3[local30] = null;
								} else if (local63 == 1) {
									local68.method9099();
									local68.anInt10508 = local28;
								} else if (local63 == 2) {
									local68.method9115();
								}
							} else if (local60.anInt1649 >= local68.method9107().anInt1649) {
								local68 = arg3.aClass152_Sub2_Sub1Array3[local30] = null;
							}
						}
						if (local68 == null || !local68.method9109()) {
							local68 = arg3.aClass152_Sub2_Sub1Array3[local30] = new Class152_Sub2_Sub1(arg3);
							local68.method9113(true, local20);
							local68.anInt10508 = local28;
						}
					}
				}
				local30++;
				local24 >>>= 0x1;
			}
		}
	}
}
