import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!k", name = "j", descriptor = "Lclient!qaa;")
	public static final Class300 aClass300_1 = new Class300();

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
	public static void method4574(@OriginalArg(0) int arg0) {
		if (Static430.anIntArray519 == null || Static430.anIntArray519.length < arg0) {
			Static430.anIntArray519 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
	public static void method4575() {
		if (Static323.anIntArray389 != null) {
			return;
		}
		Static323.anIntArray389 = new int[65536];
		@Pc(18) double local18 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < 512; local22++) {
			@Pc(40) float local40 = ((float) (local22 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(49) float local49 = (float) (local22 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(51) int local51 = 0; local51 < 128; local51++) {
				@Pc(57) float local57 = (float) local51 / 128.0F;
				@Pc(59) float local59 = 0.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(67) float local67 = local40 / 60.0F;
				@Pc(70) int local70 = (int) local67;
				@Pc(74) int local74 = local70 % 6;
				@Pc(79) float local79 = local67 - (float) local70;
				@Pc(86) float local86 = local57 * (1.0F - local49);
				@Pc(95) float local95 = local57 * (1.0F - local79 * local49);
				@Pc(106) float local106 = (1.0F - local49 * (1.0F - local79)) * local57;
				if (local74 == 0) {
					local59 = local57;
					local63 = local86;
					local61 = local106;
				} else if (local74 == 1) {
					local63 = local86;
					local59 = local95;
					local61 = local57;
				} else if (local74 == 2) {
					local59 = local86;
					local61 = local57;
					local63 = local106;
				} else if (local74 == 3) {
					local61 = local95;
					local59 = local86;
					local63 = local57;
				} else if (local74 == 4) {
					local63 = local57;
					local59 = local106;
					local61 = local86;
				} else if (local74 == 5) {
					local61 = local86;
					local63 = local95;
					local59 = local57;
				}
				local59 = (float) Math.pow((double) local59, local18);
				local61 = (float) Math.pow((double) local61, local18);
				local63 = (float) Math.pow((double) local63, local18);
				@Pc(201) int local201 = (int) (local59 * 256.0F);
				@Pc(206) int local206 = (int) (local61 * 256.0F);
				@Pc(211) int local211 = (int) (local63 * 256.0F);
				@Pc(224) int local224 = (local206 << 8) + (local201 << 16) + local211 - 16777216;
				Static323.anIntArray389[local20++] = local224;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(JJ)J")
	public static long method4576(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!cka;)V")
	public static void method4577(@OriginalArg(0) int arg0, @OriginalArg(2) Class69 arg1) {
		if (Static33.anInt779 >= 50 || (arg1 == null || arg1.anIntArrayArray38 == null || arg1.anIntArrayArray38.length <= arg0 || arg1.anIntArrayArray38[arg0] == null)) {
			return;
		}
		@Pc(42) int local42 = arg1.anIntArrayArray38[arg0][0];
		@Pc(46) int local46 = local42 >> 8;
		@Pc(63) int local63;
		if (arg1.anIntArrayArray38[arg0].length > 1) {
			local63 = (int) (Math.random() * (double) arg1.anIntArrayArray38[arg0].length);
			if (local63 > 0) {
				local46 = arg1.anIntArrayArray38[arg0][local63];
			}
		}
		@Pc(81) int local81 = local42 >> 5 & 0x7;
		local63 = 256;
		if (arg1.anIntArray154 != null && arg1.anIntArray155 != null) {
			local63 = Static159.method2572(arg1.anIntArray154[arg0], arg1.anIntArray155[arg0]);
		}
		if (arg1.aBoolean141) {
			Static186.method2818(local46, local81, local63, 0, 255, false);
		} else {
			Static161.method2586(local63, 0, local46, local81, 255);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(JB)V")
	public static void method4578(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}
}
