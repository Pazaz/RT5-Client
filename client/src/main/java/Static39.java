import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!co", name = "k", descriptor = "I")
	public static int anInt1215;

	@OriginalMember(owner = "client!co", name = "O", descriptor = "[Lclient!qa;")
	public static Class29[] aClass29Array3;

	@OriginalMember(owner = "client!co", name = "ub", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	public static void method949() {
		if (Static139.anIntArray247 != null) {
			return;
		}
		Static139.anIntArray247 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(42) float local42 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(51) float local51 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(53) int local53 = 0; local53 < 128; local53++) {
				@Pc(60) float local60 = (float) local53 / 128.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(70) float local70 = local42 / 60.0F;
				@Pc(73) int local73 = (int) local70;
				@Pc(77) int local77 = local73 % 6;
				@Pc(82) float local82 = local70 - (float) local73;
				@Pc(89) float local89 = local60 * (1.0F - local51);
				@Pc(97) float local97 = local60 * (1.0F - local51 * local82);
				@Pc(107) float local107 = local60 * (1.0F - local51 * (1.0F - local82));
				if (local77 == 0) {
					local62 = local60;
					local66 = local89;
					local64 = local107;
				} else if (local77 == 1) {
					local62 = local97;
					local66 = local89;
					local64 = local60;
				} else if (local77 == 2) {
					local66 = local107;
					local64 = local60;
					local62 = local89;
				} else if (local77 == 3) {
					local64 = local97;
					local62 = local89;
					local66 = local60;
				} else if (local77 == 4) {
					local64 = local89;
					local62 = local107;
					local66 = local60;
				} else if (local77 == 5) {
					local62 = local60;
					local66 = local97;
					local64 = local89;
				}
				local62 = (float) Math.pow((double) local62, local20);
				local64 = (float) Math.pow((double) local64, local20);
				local66 = (float) Math.pow((double) local66, local20);
				@Pc(200) int local200 = (int) (local62 * 256.0F);
				@Pc(205) int local205 = (int) (local64 * 256.0F);
				@Pc(210) int local210 = (int) (local66 * 256.0F);
				@Pc(223) int local223 = local210 + (local205 << 8) + (local200 << 16) - 16777216;
				Static139.anIntArray247[local22++] = local223;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!nm;I)V")
	public static void method955(@OriginalArg(0) Class2_Sub5 arg0) {
		arg0.aClass7_Sub1_Sub1_1 = null;
		if (Static275.anInt2790 < 20) {
			Static160.aClass58_11.method1670(arg0);
			Static275.anInt2790++;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
	public static void method961() {
		@Pc(9) Class215 local9 = Static124.aClass215_49;
		synchronized (Static124.aClass215_49) {
			Static124.aClass215_49.method6052();
		}
	}
}
