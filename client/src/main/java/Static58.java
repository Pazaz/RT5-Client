import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static58 {

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
	public static int anInt1483 = 0;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)I")
	public static int method1632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static284.anIntArray367[arg0 & 0x3] : 256;
	}
}
