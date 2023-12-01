import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IB)I")
	public static int method5855(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ur;ZLjava/lang/String;B)V")
	public static void method5857(@OriginalArg(0) BitmapFont arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		@Pc(20) int local20 = Static165.aClass239_3.getParagraphWidth(null, arg2, 250);
		@Pc(29) int local29 = Static165.aClass239_3.getParagraphLineCount(arg2, 250, null) * 13;
		Rasteriser.instance.method2901(6, 6, local20 + 8, local29 + 4 + 4, -16777216, 0);
		Rasteriser.instance.method2836(6, 6, local20 + 8, local29 + 4 - -4, -1, 0);
		arg0.method5893(0, 0, 10, 1, -1, null, 0, null, local29, arg2, 1, 10, null, -1, local20);
		Static369.method6221(local20 + 4 + 4, 6, local29 + 4 + 4, 6);
		if (arg1) {
			Rasteriser.instance.method2883();
		}
	}

}
