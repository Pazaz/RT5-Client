import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!sla", name = "b", descriptor = "[Lclient!qfa;")
	public static final Class2_Sub45[] aClass2_Sub45Array1 = new Class2_Sub45[1024];

	@OriginalMember(owner = "client!sla", name = "a", descriptor = "(I)V")
	public static void method7761() {
		@Pc(9) int local9 = Static121.anInt2333 * 512 + 256;
		@Pc(15) int local15 = Static709.anInt10667 * 512 + 256;
		@Pc(24) int local24 = Static102.method2025(Static394.anInt6176, -29754, local15, local9) - Static363.anInt6934;
		if (Static674.anInt10088 >= 100) {
			Static170.anInt2864 = Static121.anInt2333 * 512 + 256;
			Static110.anInt2186 = Static709.anInt10667 * 512 + 256;
			Static359.anInt5801 = Static102.method2025(Static394.anInt6176, -29754, Static110.anInt2186, Static170.anInt2864) - Static363.anInt6934;
		} else {
			if (Static170.anInt2864 < local9) {
				Static170.anInt2864 += Static694.anInt10411 + (local9 - Static170.anInt2864) * Static674.anInt10088 / 1000;
				if (local9 < Static170.anInt2864) {
					Static170.anInt2864 = local9;
				}
			}
			if (local24 > Static359.anInt5801) {
				Static359.anInt5801 += Static694.anInt10411 + Static674.anInt10088 * (local24 - Static359.anInt5801) / 1000;
				if (local24 < Static359.anInt5801) {
					Static359.anInt5801 = local24;
				}
			}
			if (local9 < Static170.anInt2864) {
				Static170.anInt2864 -= Static694.anInt10411 + (Static170.anInt2864 - local9) * Static674.anInt10088 / 1000;
				if (local9 > Static170.anInt2864) {
					Static170.anInt2864 = local9;
				}
			}
			if (Static359.anInt5801 > local24) {
				Static359.anInt5801 -= Static694.anInt10411 + (Static359.anInt5801 - local24) * Static674.anInt10088 / 1000;
				if (local24 > Static359.anInt5801) {
					Static359.anInt5801 = local24;
				}
			}
			if (Static110.anInt2186 < local15) {
				Static110.anInt2186 += Static694.anInt10411 + (local15 - Static110.anInt2186) * Static674.anInt10088 / 1000;
				if (local15 < Static110.anInt2186) {
					Static110.anInt2186 = local15;
				}
			}
			if (Static110.anInt2186 > local15) {
				Static110.anInt2186 -= Static674.anInt10088 * (Static110.anInt2186 - local15) / 1000 + Static694.anInt10411;
				if (local15 > Static110.anInt2186) {
					Static110.anInt2186 = local15;
				}
			}
		}
		local15 = Static12.anInt5741 * 512 + 256;
		local9 = Static441.anInt6689 * 512 + 256;
		local24 = Static102.method2025(Static394.anInt6176, -29754, local15, local9) - Static55.anInt1125;
		@Pc(259) int local259 = local9 - Static170.anInt2864;
		@Pc(264) int local264 = local24 - Static359.anInt5801;
		@Pc(269) int local269 = local15 - Static110.anInt2186;
		@Pc(280) int local280 = (int) Math.sqrt((double) (local269 * local269 + local259 * local259));
		@Pc(291) int local291 = (int) (Math.atan2((double) local264, (double) local280) * 2607.5945876176133D) & 0x3FFF;
		@Pc(302) int local302 = (int) (-2607.5945876176133D * Math.atan2((double) local259, (double) local269)) & 0x3FFF;
		if (local291 < 1024) {
			local291 = 1024;
		}
		if (local291 > 3072) {
			local291 = 3072;
		}
		if (Static598.anInt8832 < local291) {
			Static598.anInt8832 += (local291 - Static598.anInt8832 >> 3) * Static179.anInt2991 / 1000 + Static314.anInt5035 << 3;
			if (local291 < Static598.anInt8832) {
				Static598.anInt8832 = local291;
			}
		}
		if (Static598.anInt8832 > local291) {
			Static598.anInt8832 -= Static314.anInt5035 + Static179.anInt2991 * (Static598.anInt8832 - local291 >> 3) / 1000 << 3;
			if (Static598.anInt8832 < local291) {
				Static598.anInt8832 = local291;
			}
		}
		@Pc(388) int local388 = local302 - Static323.anInt5119;
		if (local388 > 8192) {
			local388 -= 16384;
		}
		if (local388 < -8192) {
			local388 += 16384;
		}
		local388 >>= 0x3;
		if (local388 > 0) {
			Static323.anInt5119 += Static314.anInt5035 + Static179.anInt2991 * local388 / 1000 << 3;
			Static323.anInt5119 &= 0x3FFF;
		}
		if (local388 < 0) {
			Static323.anInt5119 -= Static179.anInt2991 * -local388 / 1000 + Static314.anInt5035 << 3;
			Static323.anInt5119 &= 0x3FFF;
		}
		@Pc(456) int local456 = local302 - Static323.anInt5119;
		if (local456 > 8192) {
			local456 -= 16384;
		}
		if (local456 < -8192) {
			local456 += 16384;
		}
		Static81.anInt1644 = 0;
		if (local456 < 0 && local388 > 0 || local456 > 0 && local388 < 0) {
			Static323.anInt5119 = local302;
		}
	}
}
