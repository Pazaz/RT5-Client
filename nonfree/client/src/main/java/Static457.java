import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!oha", name = "f", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_86 = new Class345(60, -1);

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "[I")
	public static int[] anIntArray552 = new int[2];

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "I")
	public static int anInt6933 = 1;

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
	public static void method6230() {
		Static658.aClass28_43.method737();
		Static59.aClass192_9.method4351();
		Static138.aClass192_6.method4351();
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(B)V")
	public static void method6231() {
		Static322.aShort135 = Static306.aShort59;
		Static470.aShort82 = Static552.aShort123;
		Static267.aShort47 = Static25.aShort1;
		Static465.aShort81 = Static598.aShort120;
		Static354.aBoolean439 = true;
		if (Static134.anInt10330 != 0 && Static482.anInt7228 != 0) {
			Static25.aShort1 = 334;
			Static598.aShort120 = 334;
			Static306.aShort59 = Static552.aShort123 = (short) (Static134.anInt10330 * 512 / Static482.anInt7228);
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	public static void method6232() {
		if (Static154.anIntArray237 != null) {
			return;
		}
		Static154.anIntArray237 = new int[65536];
		@Pc(18) double local18 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(27) int local27 = 0; local27 < 65536; local27++) {
			@Pc(40) double local40 = (double) (local27 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(51) double local51 = (double) (local27 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(58) double local58 = (double) (local27 & 0x7F) / 128.0D;
			@Pc(60) double local60 = local58;
			@Pc(62) double local62 = local58;
			@Pc(64) double local64 = local58;
			if (local51 != 0.0D) {
				@Pc(82) double local82;
				if (local58 < 0.5D) {
					local82 = (local51 + 1.0D) * local58;
				} else {
					local82 = local58 + local51 - local51 * local58;
				}
				@Pc(95) double local95 = local58 * 2.0D - local82;
				@Pc(99) double local99 = local40 + 0.3333333333333333D;
				if (local99 > 1.0D) {
					local99--;
				}
				@Pc(113) double local113 = local40 - 0.3333333333333333D;
				if (local113 < 0.0D) {
					local113++;
				}
				if (local40 * 6.0D < 1.0D) {
					local62 = local95 + local40 * 6.0D * (local82 - local95);
				} else if (local40 * 2.0D < 1.0D) {
					local62 = local82;
				} else if (local40 * 3.0D < 2.0D) {
					local62 = (local82 - local95) * (-local40 + 0.6666666666666666D) * 6.0D + local95;
				} else {
					local62 = local95;
				}
				if (local99 * 6.0D < 1.0D) {
					local60 = local99 * 6.0D * (local82 - local95) + local95;
				} else if (local99 * 2.0D < 1.0D) {
					local60 = local82;
				} else if (local99 * 3.0D < 2.0D) {
					local60 = local95 + (local82 - local95) * 6.0D * (0.6666666666666666D - local99);
				} else {
					local60 = local95;
				}
				if (local113 * 6.0D < 1.0D) {
					local64 = local95 + (local82 - local95) * 6.0D * local113;
				} else if (local113 * 2.0D < 1.0D) {
					local64 = local82;
				} else if (local113 * 3.0D < 2.0D) {
					local64 = (0.6666666666666666D - local113) * (-local95 + local82) * 6.0D + local95;
				} else {
					local64 = local95;
				}
			}
			local60 = Math.pow(local60, local18);
			local62 = Math.pow(local62, local18);
			local64 = Math.pow(local64, local18);
			@Pc(290) int local290 = (int) (local60 * 256.0D);
			@Pc(295) int local295 = (int) (local62 * 256.0D);
			@Pc(300) int local300 = (int) (local64 * 256.0D);
			@Pc(311) int local311 = local300 + (local290 << 16) + (local295 << 8);
			Static154.anIntArray237[local27] = local311;
		}
	}
}
