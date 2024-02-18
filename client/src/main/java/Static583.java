import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method7659() {
		if (Static197.anInt3260 == -1 || Static374.anInt5907 == -1) {
			return;
		}
		@Pc(24) int local24 = Static71.anInt1581 + ((Static410.anInt6322 - Static71.anInt1581) * Static260.anInt4244 >> 16);
		Static260.anInt4244 += local24;
		if (Static260.anInt4244 < 65535) {
			Static426.aBoolean73 = false;
			Static272.aBoolean337 = false;
		} else {
			Static260.anInt4244 = 65535;
			if (Static426.aBoolean73) {
				Static272.aBoolean337 = false;
			} else {
				Static272.aBoolean337 = true;
			}
			Static426.aBoolean73 = true;
		}
		@Pc(54) float local54 = (float) Static260.anInt4244 / 65535.0F;
		@Pc(57) float[] local57 = new float[3];
		@Pc(61) int local61 = Static303.anInt4868 * 2;
		@Pc(94) int local94;
		@Pc(127) int local127;
		@Pc(135) int local135;
		@Pc(140) int local140;
		@Pc(149) int local149;
		@Pc(165) int local165;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			@Pc(82) int local82 = Static603.anIntArrayArrayArray18[Static197.anInt3260][local61][local63] * 3;
			local94 = Static603.anIntArrayArrayArray18[Static197.anInt3260][local61 + 1][local63] * 3;
			local127 = (Static603.anIntArrayArrayArray18[Static197.anInt3260][local61 + 2][local63] + Static603.anIntArrayArrayArray18[Static197.anInt3260][local61 + 2][local63] - Static603.anIntArrayArrayArray18[Static197.anInt3260][local61 + 3][local63]) * 3;
			local135 = Static603.anIntArrayArrayArray18[Static197.anInt3260][local61][local63];
			local140 = local94 - local82;
			local149 = local127 + local82 - local94 * 2;
			local165 = Static603.anIntArrayArrayArray18[Static197.anInt3260][local61 + 2][local63] + local94 - local135 - local127;
			local57[local63] = (float) local135 + ((float) local140 + (local54 * (float) local165 + (float) local149) * local54) * local54;
		}
		Static110.anInt2186 = (int) local57[2] - Static116.anInt2270 * 512;
		Static359.anInt5801 = (int) local57[1] * -1;
		Static170.anInt2864 = (int) local57[0] - Static691.anInt10367 * 512;
		@Pc(220) float[] local220 = new float[3];
		local94 = Static591.anInt8739 * 2;
		for (local127 = 0; local127 < 3; local127++) {
			local135 = Static603.anIntArrayArrayArray18[Static374.anInt5907][local94][local127] * 3;
			local140 = Static603.anIntArrayArrayArray18[Static374.anInt5907][local94 + 1][local127] * 3;
			local149 = (Static603.anIntArrayArrayArray18[Static374.anInt5907][local94 + 2][local127] + Static603.anIntArrayArrayArray18[Static374.anInt5907][local94 + 2][local127] - Static603.anIntArrayArrayArray18[Static374.anInt5907][local94 + 3][local127]) * 3;
			local165 = Static603.anIntArrayArrayArray18[Static374.anInt5907][local94][local127];
			@Pc(294) int local294 = local140 - local135;
			@Pc(304) int local304 = local135 + local149 - local140 * 2;
			@Pc(321) int local321 = Static603.anIntArrayArrayArray18[Static374.anInt5907][local94 + 2][local127] + local140 - local165 - local149;
			local220[local127] = (float) local165 + ((float) local294 + ((float) local304 + (float) local321 * local54) * local54) * local54;
		}
		@Pc(353) float local353 = local220[0] - local57[0];
		@Pc(363) float local363 = -1.0F * (local220[1] - local57[1]);
		@Pc(372) float local372 = local220[2] - local57[2];
		@Pc(382) double local382 = Math.sqrt((double) (local353 * local353 + local372 * local372));
		Static598.anInt8832 = (int) (Math.atan2((double) local363, local382) * 2607.5945876176133D) & 0x3FFF;
		Static323.anInt5119 = (int) (-Math.atan2((double) local353, (double) local372) * 2607.5945876176133D) & 0x3FFF;
		Static81.anInt1644 = ((Static603.anIntArrayArrayArray18[Static197.anInt3260][local61 + 2][3] - Static603.anIntArrayArrayArray18[Static197.anInt3260][local61][3]) * Static260.anInt4244 >> 16) + Static603.anIntArrayArrayArray18[Static197.anInt3260][local61][3];
	}
}
