import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	public static int anInt3242;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!mi;")
	public static final Class130 aClass130_19 = new Class130();

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "[I")
	public static final int[] anIntArray239 = new int[2500];

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BILclient!nr;Lclient!ro;I)V")
	public static void method2889(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class177 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class142 local10 = arg2.method4905(arg1);
		if (local10 == null) {
			return;
		}
		arg1.method2732(arg0, arg3, arg0 + arg2.anInt5803, arg3 - -arg2.anInt5816);
		if (Static286.anInt6044 == 2 || Static286.anInt6044 == 5 || Static176.aClass29_14 == null) {
			arg1.method2736(local10, arg0, arg3);
			return;
		}
		@Pc(50) int local50;
		@Pc(48) int local48;
		@Pc(58) int local58;
		@Pc(52) int local52;
		if (Static303.anInt6342 == 4) {
			local48 = Static72.anInt1985;
			local50 = Static327.anInt6692;
			local52 = 4096;
			local58 = (int) -Static188.aFloat17 & 0x3FFF;
		} else {
			local52 = 4096 - Static312.anInt6009 * 16;
			local50 = Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027;
			local58 = Static238.anInt5295 + (int) -Static188.aFloat17 & 0x3FFF;
			local48 = Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032;
		}
		@Pc(94) int local94 = local50 / 32 + 48 + 208 - Static25.anInt850 * 2;
		@Pc(111) int local111 = Static219.anInt4987 * 4 + 208 + 48 - local48 / 32 - Static219.anInt4987 * 2;
		Static176.aClass29_14.method5847((float) arg0 + (float) arg2.anInt5803 / 2.0F, (float) arg3 + (float) arg2.anInt5816 / 2.0F, (float) local94, (float) local111, local52, local58 << 2, local10, arg0, arg3);
		@Pc(161) int local161;
		@Pc(171) int local171;
		@Pc(182) int local182;
		@Pc(193) int local193;
		for (@Pc(145) Class1_Sub26 local145 = (Class1_Sub26) aClass130_19.method3749(); local145 != null; local145 = (Class1_Sub26) aClass130_19.method3756()) {
			@Pc(150) int local150 = local145.anInt4811;
			local161 = (Static79.aClass181_4.anIntArray451[local150] >> 14 & 0x3FFF) - Static149.anInt3667;
			local171 = (Static79.aClass181_4.anIntArray451[local150] & 0x3FFF) - Static96.anInt2446;
			local182 = local161 * 4 + 2 - local50 / 32;
			local193 = local171 * 4 + 2 - local48 / 32;
			Static211.method2802(arg3, local182, Static79.aClass181_4.anIntArray452[local150], arg1, local10, local193, arg0, arg2);
		}
		for (local161 = 0; local161 < Static245.anInt3133; local161++) {
			local171 = Static58.anIntArray104[local161] * 4 + 2 - local50 / 32;
			local182 = Static204.anIntArray355[local161] * 4 + 2 - local48 / 32;
			@Pc(248) Class189 local248 = Static83.method1840(Static52.anIntArray101[local161]);
			if (local248.anIntArray470 != null) {
				local248 = local248.method5210();
				if (local248 == null || local248.anInt6184 == -1) {
					continue;
				}
			}
			Static211.method2802(arg3, local171, local248.anInt6184, arg1, local10, local182, arg0, arg2);
		}
		for (@Pc(287) Class1_Sub11 local287 = (Class1_Sub11) Static208.aClass183_24.method5052(); local287 != null; local287 = (Class1_Sub11) Static208.aClass183_24.method5050()) {
			local182 = (int) (local287.aLong235 >> 28 & 0x3L);
			if (Static30.anInt3905 == local182) {
				local193 = (int) (local287.aLong235 & 0x3FFFL) * 4 + 2 - local50 / 32;
				@Pc(332) int local332 = (int) (local287.aLong235 >> 14 & 0x3FFFL) * 4 + 2 - local48 / 32;
				Static22.method554(arg0, local332, local10, Static250.aClass29Array10[0], arg3, arg2, local193);
			}
		}
		@Pc(396) int local396;
		@Pc(406) int local406;
		for (local182 = 0; local182 < Static49.anInt1559; local182++) {
			@Pc(360) Class7_Sub1_Sub1_Sub1 local360 = Static84.aClass7_Sub1_Sub1_Sub1Array1[Static185.anIntArray309[local182]];
			if (local360 != null && local360.method331()) {
				@Pc(369) Class75 local369 = local360.aClass75_1;
				if (local369 != null && local369.anIntArray155 != null) {
					local369 = local369.method2064();
				}
				if (local369 != null && local369.aBoolean170 && local369.aBoolean164) {
					local396 = local360.anInt7027 / 32 - local50 / 32;
					local406 = local360.anInt7032 / 32 - local48 / 32;
					if (local369.anInt2471 == -1) {
						Static22.method554(arg0, local406, local10, Static250.aClass29Array10[1], arg3, arg2, local396);
					} else {
						Static211.method2802(arg3, local396, local369.anInt2471, arg1, local10, local406, arg0, arg2);
					}
				}
			}
		}
		@Pc(476) int local476;
		for (local193 = 0; local193 < Static329.anInt6733; local193++) {
			@Pc(448) Class7_Sub1_Sub1_Sub2 local448 = Static168.aClass7_Sub1_Sub1_Sub2Array1[Static238.anIntArray389[local193]];
			if (local448 != null && local448.method5989()) {
				local396 = local448.anInt7027 / 32 - local50 / 32;
				local406 = local448.anInt7032 / 32 - local48 / 32;
				@Pc(474) boolean local474 = false;
				for (local476 = 0; local476 < Static43.anInt1459; local476++) {
					if (local448.aString266.equals(Static46.aStringArray42[local476]) && Static228.anIntArray381[local476] != 0) {
						local474 = true;
						break;
					}
				}
				@Pc(506) boolean local506 = false;
				for (@Pc(508) int local508 = 0; local508 < Static112.anInt2867; local508++) {
					if (local448.aString266.equals(Static129.aClass186Array1[local508].aString225)) {
						local506 = true;
						break;
					}
				}
				@Pc(532) boolean local532 = false;
				if (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7147 != 0 && local448.anInt7147 != 0 && Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7147 == local448.anInt7147) {
					local532 = true;
				}
				if (local474) {
					Static22.method554(arg0, local406, local10, Static250.aClass29Array10[3], arg3, arg2, local396);
				} else if (local506) {
					Static22.method554(arg0, local406, local10, Static250.aClass29Array10[5], arg3, arg2, local396);
				} else if (local532) {
					Static22.method554(arg0, local406, local10, Static250.aClass29Array10[4], arg3, arg2, local396);
				} else {
					Static22.method554(arg0, local406, local10, Static250.aClass29Array10[2], arg3, arg2, local396);
				}
			}
		}
		@Pc(607) Class98[] local607 = Static36.aClass98Array1;
		@Pc(701) int local701;
		for (local396 = 0; local396 < local607.length; local396++) {
			@Pc(615) Class98 local615 = local607[local396];
			if (local615 != null && local615.anInt3425 != 0 && Static197.anInt4521 % 20 < 10) {
				@Pc(671) int local671;
				if (local615.anInt3425 == 1 && local615.anInt3417 >= 0 && Static84.aClass7_Sub1_Sub1_Sub1Array1.length > local615.anInt3417) {
					@Pc(650) Class7_Sub1_Sub1_Sub1 local650 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local615.anInt3417];
					if (local650 != null) {
						local476 = local650.anInt7027 / 32 - local50 / 32;
						local671 = local650.anInt7032 / 32 - local48 / 32;
						Static20.method501(local615.anInt3430, local10, arg0, 360000, arg3, arg2, local476, local671);
					}
				}
				if (local615.anInt3425 == 2) {
					local701 = (local615.anInt3418 - Static149.anInt3667) * 4 + 2 - local50 / 32;
					local476 = (local615.anInt3427 - Static96.anInt2446) * 4 + 2 - local48 / 32;
					local671 = local615.anInt3424 * 4;
					local671 *= local671;
					Static20.method501(local615.anInt3430, local10, arg0, local671, arg3, arg2, local701, local476);
				}
				if (local615.anInt3425 == 10 && local615.anInt3417 >= 0 && Static168.aClass7_Sub1_Sub1_Sub2Array1.length > local615.anInt3417) {
					@Pc(757) Class7_Sub1_Sub1_Sub2 local757 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local615.anInt3417];
					if (local757 != null) {
						local476 = local757.anInt7027 / 32 - local50 / 32;
						local671 = local757.anInt7032 / 32 - local48 / 32;
						Static20.method501(local615.anInt3430, local10, arg0, 360000, arg3, arg2, local476, local671);
					}
				}
			}
		}
		if (Static303.anInt6342 == 4) {
			return;
		}
		if (Static47.anInt1523 != 0) {
			local406 = Static47.anInt1523 * 4 + (Static264.aClass7_Sub1_Sub1_Sub2_2.method5973() - 1) * 2 + 2 - local50 / 32;
			local701 = Static268.anInt5668 * 4 + (Static264.aClass7_Sub1_Sub1_Sub2_2.method5973() + -1) * 2 + 2 - local48 / 32;
			Static22.method554(arg0, local701, local10, Static294.aClass29Array13[Static127.aBoolean231 ? 1 : 0], arg3, arg2, local406);
		}
		arg1.method2745(3, 3, arg0 + arg2.anInt5803 / 2 - 1, arg3 + -1 + arg2.anInt5816 / 2, -1);
		return;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BZ)V")
	public static void method2891(@OriginalArg(1) boolean arg0) {
		Static56.method1395();
		if (Static214.anInt4865 != 30 && Static214.anInt4865 != 25) {
			return;
		}
		Static303.anInt6340++;
		if (Static303.anInt6340 < 50 && !arg0) {
			return;
		}
		Static303.anInt6340 = 0;
		if (!Static228.aBoolean354 && Static31.aClass42_1 != null) {
			Static150.aClass1_Sub16_Sub2_2.method5793(255);
			try {
				Static31.aClass42_1.method1273(Static150.aClass1_Sub16_Sub2_2.anInt6813, Static150.aClass1_Sub16_Sub2_2.aByteArray86);
				Static150.aClass1_Sub16_Sub2_2.anInt6813 = 0;
			} catch (@Pc(51) IOException local51) {
				Static228.aBoolean354 = true;
			}
		}
		Static56.method1395();
	}
}
