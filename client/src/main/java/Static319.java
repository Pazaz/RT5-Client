import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
	public static int anInt6576;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "[I")
	public static final int[] anIntArray538 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString252 = " ";

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
	public static int anInt6579 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLclient!nr;)V")
	public static void method5607(@OriginalArg(1) Class40 arg0) {
		@Pc(7) int local7 = Static234.anInt5225;
		@Pc(9) int local9 = Static52.anInt1577;
		@Pc(11) int local11 = Static140.anInt3473;
		@Pc(15) int local15 = Static259.anInt4930 - 3;
		if (Static344.aClass29_24 == null || Static124.aClass29_10 == null) {
			if (Static203.aClass162_47.method4615(Static315.anInt6515) && Static203.aClass162_47.method4615(Static335.anInt6984)) {
				Static344.aClass29_24 = arg0.method2722(Static363.method3886(Static203.aClass162_47, Static315.anInt6515, 0));
				@Pc(44) Class133 local44 = Static363.method3886(Static203.aClass162_47, Static335.anInt6984, 0);
				Static124.aClass29_10 = arg0.method2722(local44);
				local44.method3891();
				Static57.aClass29_17 = arg0.method2722(local44);
			} else {
				arg0.method2717(local7, local9, local11, 20, Static342.anInt7209 | 255 - Static259.anInt4931 << 24, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static344.aClass29_24 != null && Static124.aClass29_10 != null) {
			local88 = (local11 - Static124.aClass29_10.method5840() * 2) / Static344.aClass29_24.method5840();
			for (local90 = 0; local90 < local88; local90++) {
				Static344.aClass29_24.method5845(local7 + Static124.aClass29_10.method5840() + Static344.aClass29_24.method5840() * local90, local9);
			}
			Static124.aClass29_10.method5845(local7, local9);
			Static57.aClass29_17.method5845(local11 + local7 - Static57.aClass29_17.method5840(), local9);
		}
		Static150.aClass30_2.method4832(Static177.aString156, Static290.anInt6083 | 0xFF000000, local9 + 14, local7 - -3, -1);
		arg0.method2717(local7, local9 + 20, local11, local15 - 20, -Static259.anInt4931 + 255 << 24 | Static342.anInt7209, 1);
		local88 = Static229.anInt5102;
		local90 = Static85.anInt2268;
		@Pc(180) int local180;
		for (@Pc(163) int local163 = 0; local163 < Static237.anInt5285; local163++) {
			local180 = (Static237.anInt5285 - local163 - 1) * 16 + local9 + 20 + 13;
			if (local88 > local7 && local7 + local11 > local88 && local90 > local180 - 13 && local180 + 3 > local90) {
				arg0.method2717(local7, local180 - 12, local11, 16, 255 - Static75.anInt2064 << 24 | Static230.anInt5133, 1);
			}
		}
		if ((Static23.aClass29_4 == null || Static188.aClass29_7 == null || Static56.aClass29_8 == null) && Static203.aClass162_47.method4615(Static210.anInt4839) && Static203.aClass162_47.method4615(Static264.anInt5617) && Static203.aClass162_47.method4615(Static36.anInt1094)) {
			@Pc(250) Class133 local250 = Static363.method3886(Static203.aClass162_47, Static264.anInt5617, 0);
			Static188.aClass29_7 = arg0.method2722(local250);
			local250.method3891();
			Static321.aClass29_22 = arg0.method2722(local250);
			Static23.aClass29_4 = arg0.method2722(Static363.method3886(Static203.aClass162_47, Static210.anInt4839, 0));
			@Pc(275) Class133 local275 = Static363.method3886(Static203.aClass162_47, Static36.anInt1094, 0);
			Static56.aClass29_8 = arg0.method2722(local275);
			local275.method3891();
			Static90.aClass29_9 = arg0.method2722(local275);
		}
		@Pc(343) int local343;
		@Pc(345) int local345;
		if (Static23.aClass29_4 != null && Static188.aClass29_7 != null && Static56.aClass29_8 != null) {
			local180 = (local11 - Static56.aClass29_8.method5840() * 2) / Static23.aClass29_4.method5840();
			for (@Pc(305) int local305 = 0; local305 < local180; local305++) {
				Static23.aClass29_4.method5845(local7 + Static56.aClass29_8.method5840() + Static23.aClass29_4.method5840() * local305, -Static23.aClass29_4.method5838() + local9 - -local15);
			}
			local343 = (local15 - Static56.aClass29_8.method5838() - 20) / Static188.aClass29_7.method5838();
			for (local345 = 0; local345 < local343; local345++) {
				Static188.aClass29_7.method5845(local7, Static188.aClass29_7.method5838() * local345 + local9 + 20);
				Static321.aClass29_22.method5845(local7 + local11 - Static321.aClass29_22.method5840(), local345 * Static188.aClass29_7.method5838() + local9 - -20);
			}
			Static56.aClass29_8.method5845(local7, local9 + local15 - Static56.aClass29_8.method5838());
			Static90.aClass29_9.method5845(local7 + local11 - Static56.aClass29_8.method5840(), local15 + (local9 - Static56.aClass29_8.method5838()));
		}
		local180 = 0;
		for (@Pc(418) Class1_Sub22 local418 = (Class1_Sub22) Static97.aClass130_9.method3749(); local418 != null; local418 = (Class1_Sub22) Static97.aClass130_9.method3756()) {
			local343 = local9 + (-1 + (Static237.anInt5285 - local180)) * 16 + 20 + 13;
			local345 = Static290.anInt6083 | 0xFF000000;
			if (local7 < local88 && local7 + local11 > local88 && local90 > local343 - 13 && local90 < local343 + 3) {
				local345 = Static26.anInt889 | 0xFF000000;
			}
			@Pc(472) int[] local472 = null;
			if (Static137.method3041(local418.anInt4308)) {
				local472 = Static165.method3446((int) local418.aLong126).anIntArray78;
			} else if (Static114.method5269(local418.anInt4308)) {
				@Pc(519) Class7_Sub1_Sub1_Sub1 local519 = Static84.aClass7_Sub1_Sub1_Sub1Array1[(int) local418.aLong126];
				if (local519 != null) {
					local472 = local519.aClass75_1.anIntArray157;
				}
			} else if (Static91.method1996(local418.anInt4308)) {
				if (local418.anInt4308 == 1009) {
					local472 = Static83.method1840((int) local418.aLong126).anIntArray471;
				} else {
					local472 = Static83.method1840((int) (local418.aLong126 >>> 32 & 0x7FFFFFFFL)).anIntArray471;
				}
			}
			@Pc(537) String local537 = Static37.method928(local418);
			if (local472 != null) {
				local537 = local537 + Static118.method2581(local472);
			}
			Static150.aClass30_2.method4850(local345, local537, Static265.aClass29Array12, Static341.anIntArray582, local7 + 3, 0, local343);
			local180++;
		}
		Static302.method5277(Static52.anInt1577, Static140.anInt3473, Static259.anInt4930, Static234.anInt5225);
	}
}
