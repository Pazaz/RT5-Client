import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!iba", name = "p", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!iba", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray96 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!iba", name = "o", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!iba", name = "h", descriptor = "I")
	public static int anInt4244 = 0;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!ge;Z)Lclient!an;")
	public static Class21 method3828(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(14) Class21 local14 = new Class21();
		local14.anInt521 = arg0.method7382();
		local14.aClass2_Sub2_Sub12_1 = Static288.aClass139_2.method2950(local14.anInt521);
		return local14;
	}
}
