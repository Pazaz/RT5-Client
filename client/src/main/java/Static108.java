import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Lclient!we;")
	public static final Class215 aClass215_42 = new Class215(4);

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public static int anInt2685 = 0;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public static int anInt2686 = 0;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	public static int anInt2687 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg2 + arg5;
		@Pc(15) int local15 = arg6 - arg5;
		for (@Pc(17) int local17 = arg2; local17 < local10; local17++) {
			Static12.method349(arg3, Static87.anIntArrayArray9[local17], arg0, arg4);
		}
		@Pc(39) int local39 = arg5 + arg4;
		for (@Pc(41) int local41 = arg6; local41 > local15; local41--) {
			Static12.method349(arg3, Static87.anIntArrayArray9[local41], arg0, arg4);
		}
		@Pc(64) int local64 = arg3 - arg5;
		for (@Pc(66) int local66 = local10; local66 <= local15; local66++) {
			@Pc(80) int[] local80 = Static87.anIntArrayArray9[local66];
			Static12.method349(local39, local80, arg0, arg4);
			Static12.method349(local64, local80, arg1, local39);
			Static12.method349(arg3, local80, arg0, local64);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
	public static void method2250() {
		Static355.anInt4216 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static62.anInt1710; local3++) {
			@Pc(8) Class204 local8 = Static341.aClass204Array2[local3];
			@Pc(12) int local12;
			if (Static99.anIntArray159 != null) {
				for (local12 = 0; local12 < Static99.anIntArray159.length; local12++) {
					if (Static99.anIntArray159[local12] != -1000000 && (local8.anInt6587 <= Static99.anIntArray159[local12] || local8.anInt6567 <= Static99.anIntArray159[local12]) && (local8.anInt6568 <= Static305.anIntArray488[local12] || local8.anInt6566 <= Static305.anIntArray488[local12]) && (local8.anInt6568 >= Static61.anIntArray109[local12] || local8.anInt6566 >= Static61.anIntArray109[local12]) && (local8.anInt6575 <= Static347.anIntArray557[local12] || local8.anInt6586 <= Static347.anIntArray557[local12]) && (local8.anInt6575 >= Static180.anIntArray302[local12] || local8.anInt6586 >= Static180.anIntArray302[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt6584 == 1) {
				local12 = local8.anInt6573 + Static292.anInt6117 - Static328.anInt6714;
				if (local12 >= 0 && local12 <= Static292.anInt6117 + Static292.anInt6117) {
					local110 = local8.anInt6572 + Static292.anInt6117 - Static61.anInt1677;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt6571 + Static292.anInt6117 - Static61.anInt1677;
					if (local121 > Static292.anInt6117 + Static292.anInt6117) {
						local121 = Static292.anInt6117 + Static292.anInt6117;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static100.aBooleanArrayArray7[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static72.anInt1993 - local8.anInt6568;
						if (local153 > 32) {
							local8.anInt6583 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt6583 = 2;
							local153 = -local153;
						}
						local8.anInt6581 = (local8.anInt6575 - Static277.anInt5859 << 8) / local153;
						local8.anInt6577 = (local8.anInt6586 - Static277.anInt5859 << 8) / local153;
						local8.anInt6582 = (local8.anInt6587 - Static167.anInt4035 << 8) / local153;
						local8.anInt6585 = (local8.anInt6567 - Static167.anInt4035 << 8) / local153;
						Static304.aClass204Array1[Static355.anInt4216++] = local8;
					}
				}
			} else if (local8.anInt6584 == 2) {
				local12 = local8.anInt6572 + Static292.anInt6117 - Static61.anInt1677;
				if (local12 >= 0 && local12 <= Static292.anInt6117 + Static292.anInt6117) {
					local110 = local8.anInt6573 + Static292.anInt6117 - Static328.anInt6714;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt6578 + Static292.anInt6117 - Static328.anInt6714;
					if (local121 > Static292.anInt6117 + Static292.anInt6117) {
						local121 = Static292.anInt6117 + Static292.anInt6117;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static100.aBooleanArrayArray7[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static277.anInt5859 - local8.anInt6575;
						if (local153 > 32) {
							local8.anInt6583 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt6583 = 4;
							local153 = -local153;
						}
						local8.anInt6569 = (local8.anInt6568 - Static72.anInt1993 << 8) / local153;
						local8.anInt6574 = (local8.anInt6566 - Static72.anInt1993 << 8) / local153;
						local8.anInt6582 = (local8.anInt6587 - Static167.anInt4035 << 8) / local153;
						local8.anInt6585 = (local8.anInt6567 - Static167.anInt4035 << 8) / local153;
						Static304.aClass204Array1[Static355.anInt4216++] = local8;
					}
				}
			} else if (local8.anInt6584 == 4) {
				local12 = local8.anInt6587 - Static167.anInt4035;
				if (local12 > 128) {
					local110 = local8.anInt6572 + Static292.anInt6117 - Static61.anInt1677;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt6571 + Static292.anInt6117 - Static61.anInt1677;
					if (local121 > Static292.anInt6117 + Static292.anInt6117) {
						local121 = Static292.anInt6117 + Static292.anInt6117;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt6573 + Static292.anInt6117 - Static328.anInt6714;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt6578 + Static292.anInt6117 - Static328.anInt6714;
						if (local153 > Static292.anInt6117 + Static292.anInt6117) {
							local153 = Static292.anInt6117 + Static292.anInt6117;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static100.aBooleanArrayArray7[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt6583 = 5;
							local8.anInt6569 = (local8.anInt6568 - Static72.anInt1993 << 8) / local12;
							local8.anInt6574 = (local8.anInt6566 - Static72.anInt1993 << 8) / local12;
							local8.anInt6581 = (local8.anInt6575 - Static277.anInt5859 << 8) / local12;
							local8.anInt6577 = (local8.anInt6586 - Static277.anInt5859 << 8) / local12;
							Static304.aClass204Array1[Static355.anInt4216++] = local8;
						}
					}
				}
			}
		}
	}
}
