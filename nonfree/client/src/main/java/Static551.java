import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static551 {

	@OriginalMember(owner = "client!rfa", name = "y", descriptor = "Lclient!sia;")
	public static Class339 aClass339_54;

	@OriginalMember(owner = "client!rfa", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray204 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!rfa", name = "u", descriptor = "I")
	public static int anInt8289 = 0;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IJ)V")
	public static void method7276(@OriginalArg(1) long arg0) {
		Static260.aCalendar2.setTime(new Date(arg0));
	}
}
