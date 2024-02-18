import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!eia", name = "A", descriptor = "I")
	public static int anInt4054;

	@OriginalMember(owner = "client!eia", name = "I", descriptor = "I")
	public static int anInt4056;

	@OriginalMember(owner = "client!eia", name = "B", descriptor = "Z")
	public static boolean aBoolean315;

	@OriginalMember(owner = "client!eia", name = "y", descriptor = "I")
	public static int anInt4059 = -1;

	@OriginalMember(owner = "client!eia", name = "f", descriptor = "(B)V")
	public static void method3571() {
		@Pc(20) Class2_Sub19 local20 = Static293.method4335(Static442.aClass345_83, Static405.aClass153_2.aClass186_1);
		local20.aClass2_Sub21_Sub2_1.method7342(Static334.anInt5456);
		Static405.aClass153_2.method3275(local20);
	}

	@OriginalMember(owner = "client!eia", name = "e", descriptor = "(B)V")
	public static void method3572() {
		if (Static234.anInterface22Array1 == null) {
			return;
		}
		@Pc(14) Interface22[] local14 = Static234.anInterface22Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(21) Interface22 local21 = local14[local16];
			local21.method8464();
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static418.method7860(arg4, arg3, arg0, arg1, 0);
	}
}
