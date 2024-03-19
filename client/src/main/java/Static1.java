import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "M", descriptor = "Lclient!qj;")
	public static Class162 aClass162_8;

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
	public static int anInt82 = 0;

	@OriginalMember(owner = "client!a", name = "U", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!a", name = "X", descriptor = "I")
	public static int anInt86 = 0;

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
	public static int anInt87 = 0;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(I)I")
	public static int method54() {
		if (Static96.aBoolean159) {
			return 0;
		} else if (Static13.method5497()) {
			return Static146.aBoolean257 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(I)V")
	public static void method55() {
		if (Static336.anIntArray571 != null) {
			return;
		}
		Static336.anIntArray571 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(40) double local40 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(51) double local51 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(58) double local58 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(60) double local60 = local58;
			@Pc(62) double local62 = local58;
			@Pc(64) double local64 = local58;
			if (local51 != 0.0D) {
				@Pc(78) double local78;
				if (local58 < 0.5D) {
					local78 = (local51 + 1.0D) * local58;
				} else {
					local78 = local51 + local58 - local51 * local58;
				}
				@Pc(94) double local94 = local58 * 2.0D - local78;
				@Pc(98) double local98 = local40 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local40 - 0.3333333333333333D;
				if (local40 * 6.0D < 1.0D) {
					local62 = local94 + local40 * 6.0D * (local78 - local94);
				} else if (local40 * 2.0D < 1.0D) {
					local62 = local78;
				} else if (local40 * 3.0D < 2.0D) {
					local62 = (0.6666666666666666D - local40) * (-local94 + local78) * 6.0D + local94;
				} else {
					local62 = local94;
				}
				if (local98 * 6.0D < 1.0D) {
					local60 = (local78 - local94) * 6.0D * local98 + local94;
				} else if (local98 * 2.0D < 1.0D) {
					local60 = local78;
				} else if (local98 * 3.0D < 2.0D) {
					local60 = (local78 - local94) * (0.6666666666666666D - local98) * 6.0D + local94;
				} else {
					local60 = local94;
				}
				if (local112 < 0.0D) {
					local112++;
				}
				if (local112 * 6.0D < 1.0D) {
					local64 = (local78 - local94) * 6.0D * local112 + local94;
				} else if (local112 * 2.0D < 1.0D) {
					local64 = local78;
				} else if (local112 * 3.0D < 2.0D) {
					local64 = (0.6666666666666666D - local112) * (-local94 + local78) * 6.0D + local94;
				} else {
					local64 = local94;
				}
			}
			local60 = Math.pow(local60, local24);
			local62 = Math.pow(local62, local24);
			local64 = Math.pow(local64, local24);
			@Pc(292) int local292 = (int) (local60 * 256.0D);
			@Pc(297) int local297 = (int) (local62 * 256.0D);
			@Pc(302) int local302 = (int) (local64 * 256.0D);
			@Pc(313) int local313 = (local292 << 16) + (local297 << 8) + local302;
			Static336.anIntArray571[local26] = local313;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
	public static void method56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class1_Sub1_Sub10 local16 = Static122.method2624(10, arg3);
		local16.method2539();
		local16.anInt2960 = arg1;
		local16.anInt2952 = arg2;
		local16.anInt2954 = arg0;
	}
}
