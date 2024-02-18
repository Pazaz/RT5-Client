import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_63 = new Class225(41, 7);

	@OriginalMember(owner = "client!fca", name = "h", descriptor = "[I")
	public static final int[] anIntArray247 = new int[1];

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_59 = new Class82(10);

	@OriginalMember(owner = "client!fca", name = "n", descriptor = "Lclient!kda;")
	public static final Class204 aClass204_6 = new Class204(4, 1);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)I")
	public static int method2616(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local30 > local28) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local21 > local12) {
			local44 = local21;
		}
		if (local28 > local44) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local30 + local44) / 2.0D;
		if (local44 != local30) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local30 + local44);
			}
			if (local44 == local12) {
				local58 = (local21 - local28) / (-local30 + local44);
			} else if (local44 == local21) {
				local58 = (local28 - local12) / (local44 - local30) + 2.0D;
			} else if (local44 == local28) {
				local58 = (local12 - local21) / (local44 - local30) + 4.0D;
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / (2.0D - local44 - local30);
			}
		}
		local58 /= 6.0D;
		@Pc(156) int local156 = (int) (local58 * 256.0D);
		@Pc(168) int local168 = (int) (local60 * 256.0D);
		@Pc(173) int local173 = (int) (local66 * 256.0D);
		if (local168 < 0) {
			local168 = 0;
		} else if (local168 > 255) {
			local168 = 255;
		}
		if (local173 < 0) {
			local173 = 0;
		} else if (local173 > 255) {
			local173 = 255;
		}
		if (local173 > 243) {
			local168 >>= 0x4;
		} else if (local173 > 217) {
			local168 >>= 0x3;
		} else if (local173 > 192) {
			local168 >>= 0x2;
		} else if (local173 > 179) {
			local168 >>= 0x1;
		}
		return (local173 >> 1) + (local168 >> 5 << 7) + ((local156 >> 2 & 0x3F) << 10);
	}
}
