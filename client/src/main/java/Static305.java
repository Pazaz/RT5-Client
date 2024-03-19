import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "[I")
	public static int[] anIntArray488;

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "[Lclient!qa;")
	public static Class29[] aClass29Array14;

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
	public static int anInt6395;

	@OriginalMember(owner = "client!tm", name = "w", descriptor = "Lclient!wi;")
	public static Class37 aClass37_2;

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
	public static int anInt6393 = 0;

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
	public static int anInt6396 = 0;

	@OriginalMember(owner = "client!tm", name = "x", descriptor = "[I")
	public static final int[] anIntArray489 = new int[1000];

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)V")
	public static void method5377() {
		@Pc(5) Class215 local5 = Static218.aClass215_68;
		synchronized (Static218.aClass215_68) {
			Static218.aClass215_68.method6060();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLclient!ai;)V")
	public static void method5378(@OriginalArg(1) Class7_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(15) Class1_Sub20 local15 = (Class1_Sub20) Static24.aClass130_4.method3749(); local15 != null; local15 = (Class1_Sub20) Static24.aClass130_4.method3756()) {
			if (local15.aClass7_Sub1_Sub1_Sub1_1 == arg0) {
				if (local15.aClass1_Sub3_Sub2_3 != null) {
					Static127.aClass1_Sub3_Sub3_1.method3522(local15.aClass1_Sub3_Sub2_3);
					local15.aClass1_Sub3_Sub2_3 = null;
				}
				local15.method6172();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIILclient!de;Lclient!de;)V")
	public static void method5379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7_Sub3 arg3, @OriginalArg(4) Class7_Sub3 arg4) {
		if (Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static91.method1998(arg0, arg1, arg2);
		}
		Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2].aClass7_Sub3_2 = arg3;
		Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2].aClass7_Sub3_1 = arg4;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method5381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg5 && arg0 == arg2 && arg4 == arg8 && arg6 == arg3) {
			Static264.method4781(arg7, arg1, arg4, arg2, arg3);
			return;
		}
		@Pc(48) int local48 = arg1;
		@Pc(50) int local50 = arg2;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg2 * 3;
		@Pc(62) int local62 = arg5 * 3;
		@Pc(66) int local66 = arg0 * 3;
		@Pc(70) int local70 = arg8 * 3;
		@Pc(74) int local74 = arg6 * 3;
		@Pc(82) int local82 = arg4 + local62 - local70 - arg1;
		@Pc(93) int local93 = arg3 + local66 - arg2 - local74;
		@Pc(102) int local102 = local70 + local54 - local62 - local62;
		@Pc(112) int local112 = local74 + local58 - local66 - local66;
		@Pc(116) int local116 = local62 - local54;
		@Pc(121) int local121 = local66 - local58;
		for (@Pc(123) int local123 = 128; local123 <= 4096; local123 += 128) {
			@Pc(131) int local131 = local123 * local123 >> 12;
			@Pc(137) int local137 = local123 * local131 >> 12;
			@Pc(141) int local141 = local137 * local82;
			@Pc(145) int local145 = local137 * local93;
			@Pc(149) int local149 = local102 * local131;
			@Pc(153) int local153 = local131 * local112;
			@Pc(157) int local157 = local116 * local123;
			@Pc(161) int local161 = local121 * local123;
			@Pc(173) int local173 = arg1 + (local157 + local141 + local149 >> 12);
			@Pc(183) int local183 = arg2 + (local161 + local153 + local145 >> 12);
			Static264.method4781(arg7, local48, local173, local50, local183);
			local48 = local173;
			local50 = local183;
		}
	}
}
