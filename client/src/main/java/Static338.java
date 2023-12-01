import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "J")
	public static long aLong214 = 0L;

	@OriginalMember(owner = "client!tl", name = "A", descriptor = "Z")
	public static final boolean aBoolean465 = false;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
	public static void method6141() {
		if (Camera.pitch < 1024.0F) {
			Camera.pitch = 1024.0F;
		}
		while (Camera.yaw >= 16384.0F) {
			Camera.yaw -= 16384.0F;
		}
		if (Camera.pitch > 3072.0F) {
			Camera.pitch = 3072.0F;
		}
		while (Camera.yaw < 0.0F) {
			Camera.yaw += 16384.0F;
		}
		@Pc(46) int local46 = Static288.anInt5463 >> 7;
		@Pc(50) int local50 = Static62.anInt2395 >> 7;
		@Pc(56) int local56 = Static386.method6032(Static288.anInt5463, Static62.anInt2395, Static355.anInt6585);
		@Pc(58) int local58 = 0;
		@Pc(76) int local76;
		if (local46 > 3 && local50 > 3 && local46 < 100 && local50 < 100) {
			for (local76 = local46 - 4; local76 <= local46 + 4; local76++) {
				for (@Pc(82) int local82 = local50 - 4; local82 <= local50 + 4; local82++) {
					@Pc(86) int local86 = Static355.anInt6585;
					if (local86 < 3 && Static325.method5545(local82, local76)) {
						local86++;
					}
					@Pc(99) int local99 = 0;
					if (Static190.aClass29_Sub1_63.aByteArrayArrayArray11 != null && Static190.aClass29_Sub1_63.aByteArrayArrayArray11[local86] != null) {
						local99 = (Static190.aClass29_Sub1_63.aByteArrayArrayArray11[local86][local76][local82] & 0xFF) * 8;
					}
					@Pc(132) int local132 = local99 + local56 - Scene.aClass6Array4[local86].method5719(local76, local82);
					if (local132 > local58) {
						local58 = local132;
					}
				}
			}
		}
		local76 = local58 * 1536;
		if (local76 > 786432) {
			local76 = 786432;
		}
		if (local76 < 262144) {
			local76 = 262144;
		}
		if (Static89.anInt1885 < local76) {
			Static89.anInt1885 += (local76 - Static89.anInt1885) / 24;
		} else if (Static89.anInt1885 > local76) {
			Static89.anInt1885 += (local76 - Static89.anInt1885) / 80;
			return;
		}
	}
}
