import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public static int anInt4302;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIILclient!hl;)V")
	public static void method3706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7_Sub4 arg4) {
		arg4.anInt6283 = (arg1 << 7) + 64;
		arg4.anInt6282 = arg3;
		arg4.anInt6284 = (arg2 << 7) + 64;
		@Pc(24) Class154 local24 = Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class93 local31 = local24.aClass93_3; local31 != null; local31 = local31.aClass93_2) {
				if (local31.aClass7_Sub1_1.aBoolean505) {
					@Pc(41) int local41 = local31.aClass7_Sub1_1.method5961();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt6282 += local28;
				arg4.aBoolean453 = true;
			}
		}
		if (Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static91.method1998(arg0, arg1, arg2);
		}
		Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2].aClass7_Sub4_1 = arg4;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3707(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			local10 = (local10 << 5) + arg0.charAt(local20) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
	public static void method3708() {
		Static341.method6031();
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			Static66.aClass22Array1[local15].method526();
		}
		Static15.method447();
		Static4.method147();
		System.gc();
	}
}
