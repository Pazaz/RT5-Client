import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
	public static int anInt7054 = 0;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!nh;IIIB)V")
	public static void method6284(@OriginalArg(0) Player arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.movementQueueX[0];
		@Pc(15) int local15 = arg0.movementQueueZ[0];
		if (local10 < 0 || Static373.anInt7033 <= local10 || local15 < 0 || Static242.anInt4449 <= local15 || (arg1 < 0 || Static373.anInt7033 <= arg1 || arg2 < 0 || Static242.anInt4449 <= arg2)) {
			return;
		}
		@Pc(85) int local85 = Static141.method2654(true, Static52.anIntArray99, 0, -4, 0, 0, Static171.aClass46Array1[arg0.plane], local10, 0, arg1, Static59.anIntArray105, arg0.getSize(), arg2, local15);
		if (local85 >= 1 && local85 <= 3) {
			for (@Pc(97) int local97 = 0; local97 < local85 - 1; local97++) {
				arg0.method4071(Static59.anIntArray105[local97], (byte) 2, Static52.anIntArray99[local97]);
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIII)V")
	public static void method6287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) DelayedStateChange local8 = Static316.method5413(10, arg0);
		local8.method2311();
		local8.intArg3 = arg3;
		local8.intArg2 = arg1;
		local8.intArg1 = arg2;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!kf;IIILclient!jd;ILclient!nk;B)V")
	public static void method6288(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Sprite arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Component arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Camera.anInt5911 == 4) {
			local16 = (int) Camera.yawTarget & 0x3FFF;
		} else {
			local16 = Static6.anInt158 + (int) Camera.yawTarget & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg6.width / 2, arg6.height / 2) + 10;
		@Pc(45) int local45 = arg3 * arg3 + arg1 * arg1;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(63) int local63 = RasteriserBase.anIntArray178[local16];
		@Pc(67) int local67 = RasteriserBase.anIntArray177[local16];
		if (Camera.anInt5911 != 4) {
			local67 = local67 * 256 / (Static97.anInt2005 + 256);
			local63 = local63 * 256 / (Static97.anInt2005 + 256);
		}
		@Pc(97) int local97 = local63 * arg3 + local67 * arg1 >> 15;
		@Pc(107) int local107 = local67 * arg3 - local63 * arg1 >> 15;
		arg4.method6383(local97 + arg2 + arg6.width / 2 - arg4.method6399() / 2, -local107 + arg6.height / 2 + arg5 + -(arg4.method6384() / 2), arg0, arg2, arg5);
	}
}
