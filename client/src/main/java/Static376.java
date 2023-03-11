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
	public static void method6284(@OriginalArg(0) Class11_Sub5_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray316[0];
		@Pc(15) int local15 = arg0.anIntArray317[0];
		if (local10 < 0 || Static373.anInt7033 <= local10 || local15 < 0 || Static242.anInt4449 <= local15 || (arg1 < 0 || Static373.anInt7033 <= arg1 || arg2 < 0 || Static242.anInt4449 <= arg2)) {
			return;
		}
		@Pc(85) int local85 = Static141.method2654(true, Static52.anIntArray99, 0, -4, 0, 0, Static171.aClass46Array1[arg0.aByte78], local10, 0, arg1, Static59.anIntArray105, arg0.method4328(), arg2, local15);
		if (local85 >= 1 && local85 <= 3) {
			for (@Pc(97) int local97 = 0; local97 < local85 - 1; local97++) {
				arg0.method4071(Static59.anIntArray105[local97], (byte) 2, Static52.anIntArray99[local97]);
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)I")
	public static int method6285(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		if (local14 > local23) {
			local40 = local23;
		}
		if (local40 > local30) {
			local40 = local30;
		}
		@Pc(54) double local54 = local14;
		if (local23 > local14) {
			local54 = local23;
		}
		if (local54 < local30) {
			local54 = local30;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local54 + local40) / 2.0D;
		if (local40 != local54) {
			if (local76 < 0.5D) {
				local70 = (local54 - local40) / (local54 + local40);
			}
			if (local76 >= 0.5D) {
				local70 = (local54 - local40) / (2.0D - local54 - local40);
			}
			if (local54 == local14) {
				local68 = (local23 - local30) / (local54 - local40);
			} else if (local54 == local23) {
				local68 = (local30 - local14) / (-local40 + local54) + 2.0D;
			} else if (local54 == local30) {
				local68 = (local14 - local23) / (local54 - local40) + 4.0D;
			}
		}
		local68 /= 6.0D;
		@Pc(163) int local163 = (int) (local68 * 256.0D);
		@Pc(168) int local168 = (int) (local70 * 256.0D);
		if (local168 < 0) {
			local168 = 0;
		} else if (local168 > 255) {
			local168 = 255;
		}
		@Pc(187) int local187 = (int) (local76 * 256.0D);
		if (local187 < 0) {
			local187 = 0;
		} else if (local187 > 255) {
			local187 = 255;
		}
		if (local187 > 243) {
			local168 >>= 0x4;
		} else if (local187 > 217) {
			local168 >>= 0x3;
		} else if (local187 > 192) {
			local168 >>= 0x2;
		} else if (local187 > 179) {
			local168 >>= 0x1;
		}
		return ((local163 >> 2 & 0x3F) << 10) + (local168 >> 5 << 7) + (local187 >> 1);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIII)V")
	public static void method6287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static316.method5413(10, arg0);
		local8.method2311();
		local8.anInt2290 = arg3;
		local8.anInt2284 = arg1;
		local8.anInt2289 = arg2;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!kf;IIILclient!jd;ILclient!nk;B)V")
	public static void method6288(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class13 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class161 arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static314.anInt5911 == 4) {
			local16 = (int) Static277.aFloat67 & 0x3FFF;
		} else {
			local16 = Static6.anInt158 + (int) Static277.aFloat67 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg6.anInt4248 / 2, arg6.anInt4261 / 2) + 10;
		@Pc(45) int local45 = arg3 * arg3 + arg1 * arg1;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(63) int local63 = Class19.anIntArray178[local16];
		@Pc(67) int local67 = Class19.anIntArray177[local16];
		if (Static314.anInt5911 != 4) {
			local67 = local67 * 256 / (Static97.anInt2005 + 256);
			local63 = local63 * 256 / (Static97.anInt2005 + 256);
		}
		@Pc(97) int local97 = local63 * arg3 + local67 * arg1 >> 15;
		@Pc(107) int local107 = local67 * arg3 - local63 * arg1 >> 15;
		arg4.method6383(local97 + arg2 + arg6.anInt4248 / 2 - arg4.method6399() / 2, -local107 + arg6.anInt4261 / 2 + arg5 + -(arg4.method6384() / 2), arg0, arg2, arg5);
	}
}
