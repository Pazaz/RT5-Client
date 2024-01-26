import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "Lclient!ka;")
	public static Class114 aClass114_6;

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "Lclient!st;")
	public static Class23 aClass23_23;

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "Lclient!st;")
	public static Class23 aClass23_25;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "[I")
	public static final int[] anIntArray418 = new int[4];

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "()V")
	public static void method5049() {
		aClass114_6 = null;
		aClass23_25 = null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!ha;)V")
	public static void method5051(@OriginalArg(0) Class19 arg0) {
		if (aClass114_6 != null) {
			return;
		}
		@Pc(8) Class88 local8 = new Class88(580, 1104, 1);
		local8.method2237();
		local8.method2230(0, 128, 0);
		local8.method2230(0, -128, 0);
		for (@Pc(37) int local37 = 0; local37 <= 24; local37++) {
			@Pc(44) int local44 = local37 * 8192 / 24;
			@Pc(48) int local48 = Class361.anIntArray741[local44];
			@Pc(52) int local52 = Class361.anIntArray740[local44];
			@Pc(61) int local61;
			@Pc(67) int local67;
			@Pc(75) int local75;
			@Pc(83) int local83;
			for (@Pc(54) int local54 = 1; local54 < 24; local54++) {
				local61 = local54 * 8192 / 24;
				local67 = Class361.anIntArray740[local61] >> 7;
				local75 = Class361.anIntArray741[local61] * local48 >> 21;
				local83 = Class361.anIntArray741[local61] * local52 >> 21;
				local8.method2230(-local75, local67, local83);
			}
			if (local37 > 0) {
				local61 = local37 * 23 + 2;
				local67 = local61 - 23;
				local8.method2231(0, local61, local67, (short) 127, (short) 0, (byte) 0, (byte) 0, (byte) 0);
				for (local75 = 1; local75 < 23; local75++) {
					local83 = local67 + 1;
					@Pc(130) int local130 = local61 + 1;
					local8.method2231(local67, local61, local83, (short) 127, (short) 0, (byte) 0, (byte) 0, (byte) 0);
					local8.method2231(local83, local61, local130, (short) 127, (short) 0, (byte) 0, (byte) 0, (byte) 0);
					local67 = local83;
					local61 = local130;
				}
				local8.method2231(local61, 1, local67, (short) 127, (short) 0, (byte) 0, (byte) 0, (byte) 0);
			}
		}
		local8.anInt2363 = local8.anInt2372;
		local8.anIntArray210 = null;
		local8.anIntArray209 = null;
		local8.aByteArray26 = null;
		aClass114_6 = arg0.method7952(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lclient!ha;)V")
	public static void method5058(@OriginalArg(0) Class19 arg0) {
		if (aClass23_25 != null) {
			return;
		}
		@Pc(4) int[] local4 = new int[16384];
		@Pc(7) int[] local7 = new int[16384];
		for (@Pc(9) int local9 = 0; local9 < 64; local9++) {
			@Pc(14) int local14 = 64 - local9;
			@Pc(18) int local18 = local14 * local14;
			@Pc(24) int local24 = 128 - local9 - 1;
			@Pc(28) int local28 = local9 * 128;
			@Pc(32) int local32 = local24 * 128;
			for (@Pc(34) int local34 = 0; local34 < 64; local34++) {
				@Pc(39) int local39 = 64 - local34;
				@Pc(43) int local43 = local39 * local39;
				@Pc(49) int local49 = 128 - local34 - 1;
				@Pc(59) int local59 = 256 - (local43 + local18 << 8) / 4096;
				local59 = local59 * 16 * 192 / 1536;
				if (local59 < 0) {
					local59 = 0;
				} else if (local59 > 255) {
					local59 = 255;
				}
				@Pc(81) int local81 = local59 / 2;
				local7[local28 + local34] = local7[local28 + local49] = local7[local32 + local34] = local7[local32 + local49] = (local59 | 0xFF00) << 16;
				local4[local28 + local34] = local4[local28 + local49] = local4[local32 + local34] = local4[local32 + local49] = 127 - local81 << 24 | 0xFFFFFF;
			}
		}
		aClass23_25 = arg0.method7946(128, 128, 128, local7);
		aClass23_23 = arg0.method7946(128, 128, 128, local4);
	}
}
