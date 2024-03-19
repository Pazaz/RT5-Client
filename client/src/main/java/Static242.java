import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)Z")
	public static boolean method4553() {
		@Pc(5) Class35 local5 = Static332.aClass35_1;
		synchronized (Static332.aClass35_1) {
			if (Static321.anInt6613 == Static17.anInt646) {
				return false;
			} else {
				Static15.anInt634 = Static26.anIntArray55[Static321.anInt6613];
				Static143.aChar2 = Static238.aCharArray16[Static321.anInt6613];
				Static321.anInt6613 = Static321.anInt6613 + 1 & 0x7F;
				return true;
			}
		}
	}
}
