import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "Lclient!s;")
	public static final Class210 aClass210_6 = new Class210(13, 7);

	@OriginalMember(owner = "client!hu", name = "v", descriptor = "Z")
	public static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "[I")
	public static final int[] anIntArray167 = new int[32];

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "(I)V")
	public static void method2622() {
		if (Static181.anIntArray204 != null) {
			return;
		}
		Static181.anIntArray204 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		int var2 = 0;
		for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
			@Pc(38) float local38 = ((float) (local24 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(47) float local47 = (float) (local24 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(49) int local49 = 0; local49 < 128; local49++) {
				@Pc(56) float local56 = (float) local49 / 128.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(66) float local66 = local38 / 60.0F;
				@Pc(69) int local69 = (int) local66;
				@Pc(73) int local73 = local69 % 6;
				@Pc(78) float local78 = local66 - (float) local69;
				@Pc(84) float local84 = local56 * (1.0F - local47);
				@Pc(93) float local93 = local56 * (1.0F - local78 * local47);
				@Pc(105) float local105 = local56 * (1.0F - local47 * (1.0F - local78));
				if (local73 == 0) {
					local60 = local105;
					local62 = local84;
					local58 = local56;
				} else if (local73 == 1) {
					local62 = local84;
					local60 = local56;
					local58 = local93;
				} else if (local73 == 2) {
					local62 = local105;
					local60 = local56;
					local58 = local84;
				} else if (local73 == 3) {
					local60 = local93;
					local58 = local84;
					local62 = local56;
				} else if (local73 == 4) {
					local60 = local84;
					local58 = local105;
					local62 = local56;
				} else if (local73 == 5) {
					local58 = local56;
					local60 = local84;
					local62 = local93;
				}
				local58 = (float) Math.pow((double) local58, local20);
				local60 = (float) Math.pow((double) local60, local20);
				local62 = (float) Math.pow((double) local62, local20);
				@Pc(199) int local199 = (int) (local58 * 256.0F);
				@Pc(204) int local204 = (int) (local60 * 256.0F);
				@Pc(209) int local209 = (int) (local62 * 256.0F);
				@Pc(222) int local222 = local209 + (local204 << 8) + (local199 << 16) - 16777216;
				Static181.anIntArray204[var2++] = local222;
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "(I)V")
	public static void method2623() {
		if (Static52.anInt1394 < 0) {
			return;
		}
		@Pc(11) long local11 = MonotonicClock.currentTimeMillis();
		Static52.anInt1394 = (int) ((long) Static52.anInt1394 + Static1.aLong1 - local11);
		if (Static52.anInt1394 > 0) {
			@Pc(31) int local31 = (Static52.anInt1394 << 8) / Static261.anInt4803;
			@Pc(36) int local36 = 255 - local31;
			@Pc(41) float local41 = (float) local31 / 255.0F;
			Static113.anInt2337 = (local31 * (Static355.anInt6565 & 0xFF00) + local36 * (Static311.aClass21_2.anInt637 & 0xFF00) & 0xFF0000) + (local36 * (Static311.aClass21_2.anInt637 & 0xFF00FF) + (Static355.anInt6565 & 0xFF00FF) * local31 & 0xFF00FF00) >>> 8;
			@Pc(77) float local77 = 1.0F - local41;
			Static134.aFloat33 = Static192.aFloat40 + local77 * (Static311.aClass21_2.aFloat25 - Static192.aFloat40);
			Static364.anInt6817 = local36 * Static311.aClass21_2.anInt634 + Static175.anInt3351 * local31 >> 8;
			Static99.anInt2095 = ((Static311.aClass21_2.anInt641 & 0xFF00FF) * local36 + local31 * (Static228.anInt4046 & 0xFF00FF) & 0xFF00FF00) + (local36 * (Static311.aClass21_2.anInt641 & 0xFF00) + (Static228.anInt4046 & 0xFF00) * local31 & 0xFF0000) >>> 8;
			Static317.aFloat74 = (Static311.aClass21_2.aFloat23 - Static233.aFloat63) * local77 + Static233.aFloat63;
			Static347.aFloat77 = (Static311.aClass21_2.aFloat24 - Static218.aFloat30) * local77 + Static218.aFloat30;
			Static164.aFloat38 = Static339.aFloat76 + (Static311.aClass21_2.aFloat26 - Static339.aFloat76) * local77;
			Static156.aFloat35 = Static67.aFloat31 + local77 * (Static311.aClass21_2.aFloat27 - Static67.aFloat31);
			Static141.aFloat34 = Static102.aFloat41 + (Static311.aClass21_2.aFloat22 - Static102.aFloat41) * local77;
			if (Static311.aClass21_2.aClass42_1 != Static79.aClass42_4) {
				Static24.aClass42_2 = Static65.aClass19_3.method2827(Static79.aClass42_4, Static311.aClass21_2.aClass42_1, local77, Static24.aClass42_2);
			}
		} else {
			Static24.aClass42_2 = Static311.aClass21_2.aClass42_1;
			Static364.anInt6817 = Static311.aClass21_2.anInt634;
			Static99.anInt2095 = Static311.aClass21_2.anInt641;
			Static52.anInt1394 = -1;
			Static317.aFloat74 = Static311.aClass21_2.aFloat23;
			Static156.aFloat35 = Static311.aClass21_2.aFloat27;
			Static164.aFloat38 = Static311.aClass21_2.aFloat26;
			Static113.anInt2337 = Static311.aClass21_2.anInt637;
			Static347.aFloat77 = Static311.aClass21_2.aFloat24;
			Static134.aFloat33 = Static311.aClass21_2.aFloat25;
			Static141.aFloat34 = Static311.aClass21_2.aFloat22;
		}
		Static1.aLong1 = local11;
	}

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "(I)V")
	public static void method2627() {
		@Pc(1) LruHashTable local1 = Static92.aClass98_9;
		synchronized (Static92.aClass98_9) {
			Static92.aClass98_9.method2614();
		}
		local1 = Static349.aClass98_58;
		synchronized (Static349.aClass98_58) {
			Static349.aClass98_58.method2614();
		}
	}
}
