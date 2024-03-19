import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
	public static int anInt1598;

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
	public static int anInt1599;

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
	public static int anInt1589 = 0;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)V")
	public static void method1383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static256.method4726(true, local35);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)V")
	public static void method1384(@OriginalArg(1) boolean arg0) {
		Static87.method1940(Static107.anInt2674, Static350.anInt7318, arg0, Static295.anInt6177);
	}
}
