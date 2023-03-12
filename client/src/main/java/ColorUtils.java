import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ColorUtils {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)I")
	public static int rgbToHsl(@OriginalArg(1) int arg0) {
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

}
