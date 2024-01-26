import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
	public static int anInt2256 = -1;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBJLclient!aa;IIILclient!hda;)V")
	public static void method2132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) Class1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class158 arg7) {
		@Pc(16) int local16 = arg6 * arg6 + arg0 * arg0;
		if ((long) local16 > arg2) {
			return;
		}
		@Pc(37) int local37 = Math.min(arg7.anInt3802 / 2, arg7.anInt3746 / 2);
		if (local16 <= local37 * local37) {
			Static6.method107(arg5, arg3, Static174.aClass23Array4[arg4], arg6, arg0, arg7, arg1);
			return;
		}
		local37 -= 10;
		@Pc(64) int local64;
		if (Static511.anInt7645 == 4) {
			local64 = (int) Static171.aFloat64 & 0x3FFF;
		} else {
			local64 = Static29.anInt723 + (int) Static171.aFloat64 & 0x3FFF;
		}
		@Pc(77) int local77 = Class361.anIntArray741[local64];
		@Pc(81) int local81 = Class361.anIntArray740[local64];
		if (Static511.anInt7645 != 4) {
			local81 = local81 * 256 / (Static660.anInt9835 + 256);
			local77 = local77 * 256 / (Static660.anInt9835 + 256);
		}
		@Pc(112) int local112 = local81 * arg0 + local77 * arg6 >> 14;
		@Pc(123) int local123 = local81 * arg6 - arg0 * local77 >> 14;
		@Pc(129) double local129 = Math.atan2((double) local112, (double) local123);
		@Pc(136) int local136 = (int) ((double) local37 * Math.sin(local129));
		@Pc(143) int local143 = (int) ((double) local37 * Math.cos(local129));
		Static558.aClass23Array7[arg4].method8186((float) local136 + (float) arg7.anInt3802 / 2.0F + (float) arg1, (float) -local143 + (float) arg7.anInt3746 / 2.0F + (float) arg5, 4096, (int) (-local129 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Lclient!tla;")
	public static Class8_Sub2_Sub4 method2134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static334.aClass291ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub2_Sub4_1;
	}
}
