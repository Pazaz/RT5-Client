import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!fma", name = "a", descriptor = "(JZIIIILclient!sb;)V")
	public static void method2797(@OriginalArg(0) long arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class330 arg3) {
		Static349.method5119(arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!fma", name = "a", descriptor = "(IIII)Lclient!cg;")
	public static Class8_Sub2_Sub1_Sub2 method2798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class291 local13 = Static334.aClass291ArrayArrayArray1[arg2][arg0][arg1];
		if (local13 == null) {
			return null;
		}
		@Pc(20) Class8_Sub2_Sub1_Sub2 local20 = null;
		@Pc(22) int local22 = -1;
		for (@Pc(31) Class286 local31 = local13.aClass286_2; local31 != null; local31 = local31.aClass286_1) {
			@Pc(35) Class8_Sub2_Sub1 local35 = local31.aClass8_Sub2_Sub1_1;
			if (local35 instanceof Class8_Sub2_Sub1_Sub2) {
				@Pc(41) Class8_Sub2_Sub1_Sub2 local41 = (Class8_Sub2_Sub1_Sub2) local35;
				@Pc(51) int local51 = local41.method9302((byte) 76) * 256 + 252 - 256;
				@Pc(59) int local59 = local41.anInt10690 - local51 >> 9;
				@Pc(66) int local66 = local41.anInt10694 - local51 >> 9;
				@Pc(74) int local74 = local41.anInt10690 + local51 >> 9;
				@Pc(82) int local82 = local41.anInt10694 + local51 >> 9;
				if (local59 <= arg0 && arg1 >= local66 && arg0 <= local74 && arg1 <= local82) {
					@Pc(120) int local120 = (local74 + 1 - arg0) * (local82 + (1 - arg1));
					if (local120 > local22) {
						local20 = local41;
						local22 = local120;
					}
				}
			}
		}
		return local20;
	}
}
