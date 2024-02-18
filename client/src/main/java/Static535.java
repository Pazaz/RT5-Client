import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "Lclient!wp;")
	public static Class407 aClass407_3;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "Lclient!kda;")
	public static final Class204 aClass204_11 = new Class204(3, 2);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!eo;IIIII)V")
	public static void method7148(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static299.anInt4824) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static619.anInt1566) {
						for (@Pc(35) int local35 = local11; local35 <= local15; local35++) {
							if (local35 >= 0 && local35 < Static662.anInt9843 && (!local1 || local23 >= local7 || local35 >= local15 || local35 < arg3 && local23 != arg2)) {
								@Pc(77) Class291 local77 = Static334.aClass291ArrayArrayArray1[local17][local23][local35];
								if (local77 != null) {
									@Pc(163) int local163 = (Static246.aClass178Array1[local17].method7869(local35, local23) + Static246.aClass178Array1[local17].method7869(local35, local23 + 1) + Static246.aClass178Array1[local17].method7869(local35 + 1, local23) + Static246.aClass178Array1[local17].method7869(local35 + 1, local23 + 1)) / 4 - (Static246.aClass178Array1[arg1].method7869(arg3, arg2) + Static246.aClass178Array1[arg1].method7869(arg3, arg2 + 1) + Static246.aClass178Array1[arg1].method7869(arg3 + 1, arg2) + Static246.aClass178Array1[arg1].method7869(arg3 + 1, arg2 + 1)) / 4;
									@Pc(166) Class8_Sub2_Sub3 local166 = local77.aClass8_Sub2_Sub3_2;
									@Pc(169) Class8_Sub2_Sub3 local169 = local77.aClass8_Sub2_Sub3_1;
									if (local166 != null && local166.method9290(0)) {
										arg0.method9285(local163, local1, Static665.aClass19_15, (local35 - arg3) * Static340.anInt5586 + (1 - arg5) * Static247.anInt3993, (byte) 110, (local23 - arg2) * Static340.anInt5586 + (1 - arg4) * Static247.anInt3993, local166);
									}
									if (local169 != null && local169.method9290(0)) {
										arg0.method9285(local163, local1, Static665.aClass19_15, (local35 - arg3) * Static340.anInt5586 + (1 - arg5) * Static247.anInt3993, (byte) 115, (local23 - arg2) * Static340.anInt5586 + (1 - arg4) * Static247.anInt3993, local169);
									}
									for (@Pc(250) Class286 local250 = local77.aClass286_2; local250 != null; local250 = local250.aClass286_1) {
										@Pc(254) Class8_Sub2_Sub1 local254 = local250.aClass8_Sub2_Sub1_1;
										if (local254 != null && local254.method9290(0) && (local23 == local254.aShort131 || local23 == local3) && (local35 == local254.aShort132 || local35 == local11)) {
											@Pc(294) int local294 = local254.aShort134 + 1 - local254.aShort131;
											@Pc(302) int local302 = local254.aShort133 + 1 - local254.aShort132;
											arg0.method9285(local163, local1, Static665.aClass19_15, (local254.aShort132 - arg3) * Static340.anInt5586 + (local302 - arg5) * Static247.anInt3993, (byte) 114, (local254.aShort131 - arg2) * Static340.anInt5586 + (local294 - arg4) * Static247.anInt3993, local254);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
