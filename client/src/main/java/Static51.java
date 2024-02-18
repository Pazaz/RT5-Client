import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "Lclient!it;")
	public static final Class184 aClass184_1 = new Class184(6, 0, 4, 2);

	@OriginalMember(owner = "client!bma", name = "e", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_30 = new Class225(54, -1);

	@OriginalMember(owner = "client!bma", name = "c", descriptor = "I")
	public static int anInt1052 = 0;

	@OriginalMember(owner = "client!bma", name = "b", descriptor = "I")
	public static int anInt1053 = 0;

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(IIIIIII)V")
	public static void method1146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static315.method4574(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg4;
		@Pc(27) int local27 = -arg4;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(59) int local59;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(86) int local86;
		if (arg5 >= Static724.anInt10930 && Static273.anInt4395 >= arg5) {
			@Pc(50) int[] local50 = Static723.anIntArrayArray266[arg5];
			local59 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 - arg4);
			local69 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg4 + arg3);
			local78 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 - local15);
			local86 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 + local15);
			Static696.method9037(local78, arg2, local59, local50);
			Static696.method9037(local86, arg1, local78, local50);
			Static696.method9037(local69, arg2, local86, local50);
		}
		@Pc(112) int local112 = -1;
		while (local24 > local10) {
			local34 += 2;
			local112 += 2;
			local32 += local112;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				Static430.anIntArray519[local29] = local10;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(213) int local213;
			@Pc(222) int local222;
			@Pc(233) int[] local233;
			@Pc(161) int local161;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local161 = arg5 - local24;
				local59 = local24 + arg5;
				if (Static724.anInt10930 <= local59 && Static273.anInt4395 >= local161) {
					if (local15 > local24) {
						local69 = Static430.anIntArray519[local24];
						local78 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 + local10);
						local86 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 - local10);
						local213 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 + local69);
						local222 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 - local69);
						if (local59 <= Static273.anInt4395) {
							local233 = Static723.anIntArrayArray266[local59];
							Static696.method9037(local222, arg2, local86, local233);
							Static696.method9037(local213, arg1, local222, local233);
							Static696.method9037(local78, arg2, local213, local233);
						}
						if (local161 >= Static724.anInt10930) {
							local233 = Static723.anIntArrayArray266[local161];
							Static696.method9037(local222, arg2, local86, local233);
							Static696.method9037(local213, arg1, local222, local233);
							Static696.method9037(local78, arg2, local213, local233);
						}
					} else {
						local69 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 + local10);
						local78 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 - local10);
						if (local59 <= Static273.anInt4395) {
							Static696.method9037(local69, arg2, local78, Static723.anIntArrayArray266[local59]);
						}
						if (local161 >= Static724.anInt10930) {
							Static696.method9037(local69, arg2, local78, Static723.anIntArrayArray266[local161]);
						}
					}
				}
			}
			local161 = arg5 - local10;
			local59 = local10 + arg5;
			if (local59 >= Static724.anInt10930 && local161 <= Static273.anInt4395) {
				local69 = arg3 + local24;
				local78 = arg3 - local24;
				if (Static180.anInt2995 <= local69 && Static111.anInt2219 >= local78) {
					local69 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, local69);
					local78 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, local78);
					if (local15 <= local10) {
						if (Static273.anInt4395 >= local59) {
							Static696.method9037(local69, arg2, local78, Static723.anIntArrayArray266[local59]);
						}
						if (local161 >= Static724.anInt10930) {
							Static696.method9037(local69, arg2, local78, Static723.anIntArrayArray266[local161]);
						}
					} else {
						local86 = local10 <= local29 ? local29 : Static430.anIntArray519[local10];
						local213 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, local86 + arg3);
						local222 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 - local86);
						if (Static273.anInt4395 >= local59) {
							local233 = Static723.anIntArrayArray266[local59];
							Static696.method9037(local222, arg2, local78, local233);
							Static696.method9037(local213, arg1, local222, local233);
							Static696.method9037(local69, arg2, local213, local233);
						}
						if (local161 >= Static724.anInt10930) {
							local233 = Static723.anIntArrayArray266[local161];
							Static696.method9037(local222, arg2, local78, local233);
							Static696.method9037(local213, arg1, local222, local233);
							Static696.method9037(local69, arg2, local213, local233);
						}
					}
				}
			}
		}
	}
}
