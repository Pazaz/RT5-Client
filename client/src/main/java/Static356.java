import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public static int anInt5773;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_149 = new Class225(2, 6);

	@OriginalMember(owner = "client!le", name = "h", descriptor = "J")
	public static long aLong177 = 1L;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	public static int anInt5780 = -1;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_67 = new Class345(23, 1);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IJ)V")
	public static void method5196(@OriginalArg(1) long arg0) {
		Static260.aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I")
	public static int method5199(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static549.anInt9424 - 1; local3++) {
			if (arg0 < Static537.anIntArray633[local3] + Static621.anIntArray766[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static549.anInt9424 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Z")
	public static boolean method5202(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}
}
