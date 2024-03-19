import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
	public static int anInt2189;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
	public static final int anInt2193 = -14475237;

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "[Lclient!il;")
	public static final Class1_Sub16[] aClass1_Sub16Array1 = new Class1_Sub16[2048];

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[II)[I")
	public static int[] method1839(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(13) int[] local13 = new int[1152];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			for (@Pc(21) int local21 = 0; local21 < 36; local21++) {
				@Pc(27) int local27 = arg1[local15];
				if (local27 == 0) {
					if (local21 > 0 && arg1[local15 - 1] != 0) {
						local27 = arg0;
					} else if (local17 > 0 && arg1[local15 - 36] != 0) {
						local27 = arg0;
					} else if (local21 < 35 && arg1[local15 + 1] != 0) {
						local27 = arg0;
					} else if (local17 < 31 && arg1[local15 + 36] != 0) {
						local27 = arg0;
					}
				}
				local13[local15++] = local27;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)Lclient!ta;")
	public static Class189 method1840(@OriginalArg(0) int arg0) {
		@Pc(5) Class215 local5 = Static274.aClass215_83;
		@Pc(14) Class189 local14;
		synchronized (Static274.aClass215_83) {
			local14 = (Class189) Static274.aClass215_83.method6057((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static280.aClass162_206.method4636(Static255.method4695(arg0), Static73.method1724(arg0));
		local14 = new Class189();
		local14.anInt6205 = arg0;
		if (local34 != null) {
			local14.method5214(new Class1_Sub16(local34));
		}
		local14.method5205();
		if (!Static78.aBoolean142 && local14.aBoolean440) {
			local14.aStringArray41 = null;
			local14.anIntArray471 = null;
		}
		if (local14.aBoolean442) {
			local14.anInt6187 = 0;
			local14.aBoolean438 = false;
		}
		@Pc(75) Class215 local75 = Static274.aClass215_83;
		synchronized (Static274.aClass215_83) {
			Static274.aClass215_83.method6050(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)I")
	public static int method1843(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static260.anIntArray408[arg1 & 0x3] : Static319.anIntArray538[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	public static void method1847() {
		for (@Pc(6) Class1_Sub22 local6 = (Class1_Sub22) Static97.aClass130_9.method3749(); local6 != null; local6 = (Class1_Sub22) Static97.aClass130_9.method3756()) {
			if (Static337.method5995(local6.anInt4308)) {
				Static179.method3633(local6);
			}
		}
		if (Static237.anInt5285 == 1) {
			Static204.aBoolean329 = false;
			Static16.method455(Static234.anInt5225, Static259.anInt4930, Static52.anInt1577, Static140.anInt3473);
			return;
		}
		Static16.method455(Static234.anInt5225, Static259.anInt4930, Static52.anInt1577, Static140.anInt3473);
		@Pc(53) int local53 = Static140.aClass63_4.method1849(Static177.aString156);
		for (@Pc(58) Class1_Sub22 local58 = (Class1_Sub22) Static97.aClass130_9.method3749(); local58 != null; local58 = (Class1_Sub22) Static97.aClass130_9.method3756()) {
			@Pc(64) int local64 = Static227.method4344(local58);
			if (local53 < local64) {
				local53 = local64;
			}
		}
		Static259.anInt4930 = Static237.anInt5285 * 16 + (Static236.aBoolean367 ? 26 : 22);
		Static140.anInt3473 = local53 + 8;
	}
}
