import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "Lclient!ro;")
	public static Class177 aClass177_1;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!ep;")
	public static final Class58 aClass58_1 = new Class58();

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
	public static int anInt667 = 0;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method472(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 < 128 || arg1 < 128 || arg2 > Static25.anInt850 * 128 - 256 || arg1 > (Static219.anInt4987 - 2) * 128) {
			Static47.anIntArray96[0] = Static47.anIntArray96[1] = -1;
			return;
		}
		@Pc(57) int local57 = Static309.method5429(arg1, arg2, Static39.anInt1215) - arg5;
		Static202.aClass11_10.method5489(arg4, 0, 0);
		Static221.aClass40_6.method2804(Static202.aClass11_10);
		Static221.aClass40_6.method2784(arg2, local57, arg1, Static47.anIntArray96);
		Static202.aClass11_10.method5489(-arg4, 0, 0);
		Static221.aClass40_6.method2804(Static202.aClass11_10);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([BI)Lclient!oo;")
	public static Class1_Sub1_Sub17 method473(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class1_Sub1_Sub17 local9 = new Class1_Sub1_Sub17();
		@Pc(14) Class1_Sub16 local14 = new Class1_Sub16(arg0);
		local14.anInt6813 = local14.aByteArray86.length - 2;
		@Pc(25) int local25 = local14.method5749();
		@Pc(36) int local36 = local14.aByteArray86.length - local25 - 12 - 2;
		local14.anInt6813 = local36;
		@Pc(43) int local43 = local14.method5730();
		local9.anInt5041 = local14.method5749();
		local9.anInt5042 = local14.method5749();
		local9.anInt5045 = local14.method5749();
		local9.anInt5040 = local14.method5749();
		@Pc(69) int local69 = local14.method5761();
		@Pc(77) int local77;
		@Pc(83) int local83;
		if (local69 > 0) {
			local9.aClass183Array1 = new Class183[local69];
			for (local77 = 0; local77 < local69; local77++) {
				local83 = local14.method5749();
				@Pc(90) Class183 local90 = new Class183(Static162.method3414(local83));
				local9.aClass183Array1[local77] = local90;
				while (local83-- > 0) {
					@Pc(101) int local101 = local14.method5730();
					@Pc(105) int local105 = local14.method5730();
					local90.method5055((long) local101, new Class1_Sub26(local105));
				}
			}
		}
		local14.anInt6813 = 0;
		local9.aString177 = local14.method5785();
		local9.anIntArray373 = new int[local43];
		local9.anIntArray374 = new int[local43];
		local9.aStringArray30 = new String[local43];
		local77 = 0;
		while (local14.anInt6813 < local36) {
			local83 = local14.method5749();
			if (local83 == 3) {
				local9.aStringArray30[local77] = local14.method5776().intern();
			} else if (local83 >= 100 || local83 == 21 || local83 == 38 || local83 == 39) {
				local9.anIntArray373[local77] = local14.method5761();
			} else {
				local9.anIntArray373[local77] = local14.method5730();
			}
			local9.anIntArray374[local77++] = local83;
		}
		return local9;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZIII)V")
	public static void method474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 - arg1 >= Static239.anInt5299 && Static179.anInt4229 >= arg0 + arg1 && arg2 - arg1 >= Static180.anInt4240 && arg1 + arg2 <= Static197.anInt4520) {
			Static158.method3381(arg0, arg2, arg3, arg1);
		} else {
			Static206.method4106(arg1, arg3, arg0, arg2);
		}
	}
}
