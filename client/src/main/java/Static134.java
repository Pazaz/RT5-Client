import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!is", name = "i", descriptor = "Lclient!qa;")
	public static Class29 aClass29_12;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "Lclient!qj;")
	public static Class162 aClass162_119;

	@OriginalMember(owner = "client!is", name = "m", descriptor = "[[[Lclient!pm;")
	public static Class154[][][] aClass154ArrayArrayArray1;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public static int anInt3395 = 2;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "Lclient!we;")
	public static final Class215 aClass215_52 = new Class215(8);

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!vp;[IZ[I[I)V")
	public static void method3032(@OriginalArg(0) Class7_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) int local14 = arg1[local8];
			@Pc(18) int local18 = arg2[local8];
			@Pc(22) int local22 = arg3[local8];
			@Pc(24) int local24 = 0;
			while (local18 != 0 && arg0.aClass147Array3.length > local24) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg0.aClass147Array3[local24] = null;
					} else {
						@Pc(47) Class165 local47 = Static231.method4385(local14);
						@Pc(50) int local50 = local47.anInt5575;
						@Pc(55) Class147 local55 = arg0.aClass147Array3[local24];
						if (local55 != null) {
							if (local55.anInt5076 == local14) {
								if (local50 == 0) {
									local55 = arg0.aClass147Array3[local24] = null;
								} else if (local50 == 1) {
									local55.anInt5075 = local22;
									local55.anInt5078 = 0;
									local55.anInt5072 = 0;
									local55.anInt5073 = 1;
									local55.anInt5074 = 0;
									Static209.method4128(arg0.anInt7027, arg0 == Static264.aClass7_Sub1_Sub1_Sub2_2, 0, arg0.anInt7032, local47);
								} else if (local50 == 2) {
									local55.anInt5072 = 0;
								}
							} else if (local47.anInt5568 >= Static231.method4385(local55.anInt5076).anInt5568) {
								local55 = arg0.aClass147Array3[local24] = null;
							}
						}
						if (local55 == null) {
							local55 = arg0.aClass147Array3[local24] = new Class147();
							local55.anInt5075 = local22;
							local55.anInt5078 = 0;
							local55.anInt5074 = 0;
							local55.anInt5076 = local14;
							local55.anInt5073 = 1;
							local55.anInt5072 = 0;
							Static209.method4128(arg0.anInt7027, arg0 == Static264.aClass7_Sub1_Sub1_Sub2_2, 0, arg0.anInt7032, local47);
						}
					}
				}
				local24++;
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!qj;BLclient!qj;)I")
	public static int method3033(@OriginalArg(0) Class162 arg0, @OriginalArg(2) Class162 arg1) {
		@Pc(10) int local10 = 0;
		if (arg1.method4615(Static292.anInt6119)) {
			local10++;
		}
		if (arg1.method4615(Static203.anInt926)) {
			local10++;
		}
		if (arg1.method4615(Static202.anInt4679)) {
			local10++;
		}
		if (arg0.method4615(Static292.anInt6119)) {
			local10++;
		}
		if (arg0.method4615(Static203.anInt926)) {
			local10++;
		}
		if (arg0.method4615(Static202.anInt4679)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIII)V")
	public static void method3034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 >= Static239.anInt5299 && Static179.anInt4229 >= arg3 && arg1 >= Static180.anInt4240 && arg4 <= Static197.anInt4520) {
			Static13.method5506(arg4, arg0, arg3, arg2, arg1);
		} else {
			Static197.method3899(arg0, arg2, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
	public static int method3035(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}
}
