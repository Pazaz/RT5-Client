import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
	public static int anInt2111 = -1;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIILclient!mr;I)V")
	public static void method2160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) PathingEntity arg3) {
		@Pc(16) BasType local16 = arg3.getBasType();
		@Pc(26) int local26 = arg3.anInt4616 - arg3.aClass248_7.anInt7197 & 0x3FFF;
		if (arg2 == -1) {
			if (local26 != 0 || arg3.anInt4605 > 25) {
				arg3.aBoolean317 = false;
				if (arg0 < 0 && local16.anInt6286 != -1) {
					arg3.anInt4585 = local16.anInt6286;
				} else if (arg0 <= 0 || local16.anInt6273 == -1) {
					arg3.anInt4585 = local16.anInt6270;
				} else {
					arg3.anInt4585 = local16.anInt6273;
				}
			} else if (!arg3.aBoolean317 || !local16.method5692(arg3.anInt4585)) {
				arg3.anInt4585 = local16.method5696();
				arg3.aBoolean317 = arg3.anInt4585 != -1;
			}
		} else if (arg3.anInt4611 != -1 && (local26 >= 10240 || local26 <= 2048)) {
			@Pc(225) int local225 = Static369.anIntArray479[arg1] - arg3.aClass248_7.anInt7197 & 0x3FFF;
			if (arg2 == 2 && local16.anInt6263 != -1) {
				if (local225 > 2048 && local225 <= 6144 && local16.anInt6301 != -1) {
					arg3.anInt4585 = local16.anInt6301;
				} else if (local225 >= 10240 && local225 < 14336 && local16.anInt6271 != -1) {
					arg3.anInt4585 = local16.anInt6271;
				} else if (local225 <= 6144 || local225 >= 10240 || local16.anInt6292 == -1) {
					arg3.anInt4585 = local16.anInt6263;
				} else {
					arg3.anInt4585 = local16.anInt6292;
				}
			} else if (arg2 == 0 && local16.anInt6265 != -1) {
				if (local225 > 2048 && local225 <= 6144 && local16.anInt6267 != -1) {
					arg3.anInt4585 = local16.anInt6267;
				} else if (local225 >= 10240 && local225 < 14336 && local16.anInt6284 != -1) {
					arg3.anInt4585 = local16.anInt6284;
				} else if (local225 <= 6144 || local225 >= 10240 || local16.anInt6299 == -1) {
					arg3.anInt4585 = local16.anInt6265;
				} else {
					arg3.anInt4585 = local16.anInt6299;
				}
			} else if (local225 > 2048 && local225 <= 6144 && local16.anInt6296 != -1) {
				arg3.anInt4585 = local16.anInt6296;
			} else if (local225 >= 10240 && local225 < 14336 && local16.anInt6268 != -1) {
				arg3.anInt4585 = local16.anInt6268;
			} else if (local225 <= 6144 || local225 >= 10240 || local16.anInt6293 == -1) {
				arg3.anInt4585 = local16.anInt6270;
			} else {
				arg3.anInt4585 = local16.anInt6293;
			}
			arg3.aBoolean317 = false;
		} else if (local26 == 0 && arg3.anInt4605 <= 25) {
			if (arg2 == 2 && local16.anInt6263 != -1) {
				arg3.anInt4585 = local16.anInt6263;
			} else if (arg2 == 0 && local16.anInt6265 != -1) {
				arg3.anInt4585 = local16.anInt6265;
			} else {
				arg3.anInt4585 = local16.anInt6270;
			}
			arg3.aBoolean317 = false;
		} else {
			if (arg2 == 2 && local16.anInt6263 != -1) {
				if (arg0 < 0 && local16.anInt6264 != -1) {
					arg3.anInt4585 = local16.anInt6264;
				} else if (arg0 <= 0 || local16.anInt6275 == -1) {
					arg3.anInt4585 = local16.anInt6263;
				} else {
					arg3.anInt4585 = local16.anInt6275;
				}
			} else if (arg2 == 0 && local16.anInt6265 != -1) {
				if (arg0 < 0 && local16.anInt6297 != -1) {
					arg3.anInt4585 = local16.anInt6297;
				} else if (arg0 <= 0 || local16.anInt6295 == -1) {
					arg3.anInt4585 = local16.anInt6265;
				} else {
					arg3.anInt4585 = local16.anInt6295;
				}
			} else if (arg0 < 0 && local16.anInt6277 != -1) {
				arg3.anInt4585 = local16.anInt6277;
			} else if (arg0 <= 0 || local16.anInt6282 == -1) {
				arg3.anInt4585 = local16.anInt6270;
			} else {
				arg3.anInt4585 = local16.anInt6282;
			}
			arg3.aBoolean317 = false;
		}
	}

}
