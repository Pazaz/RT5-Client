import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!mo", name = "P", descriptor = "Lclient!ao;")
	public static Class11 aClass11_9;

	@OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
	public static int anInt4458 = -1;

	@OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
	public static int anInt4459 = 0;

	@OriginalMember(owner = "client!mo", name = "V", descriptor = "Z")
	public static volatile boolean aBoolean315 = true;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(BI)S")
	public static short method3828(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(27) int local27 = arg0 & 0x7F;
		@Pc(45) int local45 = local27 > 64 ? local15 * (127 - local27) >> 7 : local27 * local15 >> 7;
		@Pc(49) int local49 = local27 + local45;
		@Pc(58) int local58;
		if (local49 == 0) {
			local58 = local45 << 1;
		} else {
			local58 = (local45 << 8) / local49;
		}
		return (short) (local49 | local9 << 10 | local58 >> 4 << 7);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(III)V")
	public static void method3829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(1, arg1);
		local8.method2539();
		local8.anInt2960 = arg0;
	}
}
