import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
	public static int anInt6329;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_164 = new Class225(135, 0);

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIII)V")
	public static void method5666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class291 local7 = Static334.aClass291ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(14) Class8_Sub2_Sub4 local14 = local7.aClass8_Sub2_Sub4_1;
		@Pc(17) Class8_Sub2_Sub4 local17 = local7.aClass8_Sub2_Sub4_2;
		if (local14 != null) {
			local14.aShort101 = (short) (local14.aShort101 * arg3 / (0x10 << Static52.anInt1066 - 7));
			local14.aShort102 = (short) (local14.aShort102 * arg3 / (0x10 << Static52.anInt1066 - 7));
		}
		if (local17 != null) {
			local17.aShort101 = (short) (local17.aShort101 * arg3 / (0x10 << Static52.anInt1066 - 7));
			local17.aShort102 = (short) (local17.aShort102 * arg3 / (0x10 << Static52.anInt1066 - 7));
		}
	}
}
