import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!q", name = "q", descriptor = "Lclient!ro;")
	public static Class177 aClass177_6;

	@OriginalMember(owner = "client!q", name = "r", descriptor = "I")
	public static int anInt2617;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "I")
	public static int anInt2611 = 0;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "I")
	public static int anInt2616 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[BII)Z")
	public static boolean method2180(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(14) boolean local14 = true;
		@Pc(19) Class1_Sub16 local19 = new Class1_Sub16(arg1);
		@Pc(21) int local21 = -1;
		label56: while (true) {
			@Pc(25) int local25 = local19.method5764();
			if (local25 == 0) {
				return local14;
			}
			local21 += local25;
			@Pc(36) int local36 = 0;
			@Pc(38) boolean local38 = false;
			while (true) {
				@Pc(46) int local46;
				while (!local38) {
					local46 = local19.method5744();
					if (local46 == 0) {
						continue label56;
					}
					local36 += local46 - 1;
					@Pc(75) int local75 = local36 & 0x3F;
					@Pc(81) int local81 = local36 >> 6 & 0x3F;
					@Pc(87) int local87 = local19.method5761() >> 2;
					@Pc(91) int local91 = arg0 + local81;
					@Pc(95) int local95 = arg2 + local75;
					if (local91 > 0 && local95 > 0 && local91 < Static25.anInt850 - 1 && local95 < Static219.anInt4987 - 1) {
						@Pc(123) Class189 local123 = Static83.method1840(local21);
						if (local87 != 22 || Static218.aBoolean342 || local123.anInt6170 != 0 || local123.anInt6187 == 1 || local123.aBoolean429) {
							if (!local123.method5202()) {
								Static1.anInt87++;
								local14 = false;
							}
							local38 = true;
						}
					}
				}
				local46 = local19.method5744();
				if (local46 == 0) {
					break;
				}
				local19.method5761();
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[BB)I")
	public static int method2181(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static96.method2039(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
	public static void method2182(@OriginalArg(1) int arg0) {
		Static233.anInt5206 = -1;
		if (arg0 == 37) {
			Static201.aFloat53 = 3.0F;
		} else if (arg0 == 50) {
			Static201.aFloat53 = 4.0F;
		} else if (arg0 == 75) {
			Static201.aFloat53 = 6.0F;
		} else if (arg0 == 100) {
			Static201.aFloat53 = 8.0F;
		} else if (arg0 == 200) {
			Static201.aFloat53 = 16.0F;
		}
		Static233.anInt5206 = -1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public static void method2183() {
		Static108.aClass215_42.method6060();
	}
}
