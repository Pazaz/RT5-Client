import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	public static int anInt5563;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "I")
	public static int anInt5562 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	public static int anInt5564 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[[BLclient!taa;)V")
	public static void method4994(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class306_Sub1 arg1) {
		@Pc(6) int local6 = Static319.aByteArrayArray16.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(13) byte[] local13 = arg0[local8];
			if (local13 != null) {
				@Pc(26) int local26 = (Static89.anIntArray169[local8] >> 8) * 64 - Static691.anInt10367;
				@Pc(36) int local36 = (Static89.anIntArray169[local8] & 0xFF) * 64 - Static116.anInt2270;
				Static557.method7331();
				arg1.method7892(local26, local36, Static577.aClass110Array1, Static163.aClass19_17, local13);
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
	public static int method4995() {
		if (Static400.aBoolean622) {
			return 6;
		} else if (Static470.aClass2_Sub2_Sub16_10 == null) {
			return 0;
		} else {
			@Pc(23) int local23 = Static470.aClass2_Sub2_Sub16_10.anInt7314;
			if (Static466.method6326(local23)) {
				return 1;
			} else if (Static245.method8635(local23)) {
				return 2;
			} else if (Static523.method3444(local23)) {
				return 3;
			} else if (Static598.method7825(local23)) {
				return 4;
			} else if (Static124.method2218(local23)) {
				return 7;
			} else if (local23 == 4) {
				return 8;
			} else {
				return 5;
			}
		}
	}
}
