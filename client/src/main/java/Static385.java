import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "Lclient!ha;")
	public static Class2_Sub16 aClass2_Sub16_2;

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "[Lclient!nt;")
	public static final AnimFrameset[] aClass2_Sub2_Sub13Array4 = new AnimFrameset[14];

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)I")
	public static int method6429(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static295.anIntArray375[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLclient!oo;)V")
	public static void method6430(@OriginalArg(1) Class12_Sub6 arg0) {
		arg0.aClass11_Sub5_Sub2_1 = null;
		if (Static285.anInt5374 < 20) {
			Static352.aClass36_9.method1418(arg0);
			Static285.anInt5374++;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)V")
	public static void method6432(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = client.cycle - Static241.anInt4445;
		if (local8 >= 100) {
			Camera.anInt5911 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Camera.pitch;
		if (Static89.anInt1885 >> 8 > local19) {
			local19 = Static89.anInt1885 >> 8;
		}
		if (Static189.aBooleanArray33[4] && local19 < Static105.anIntArray134[4] + 128) {
			local19 = Static105.anIntArray134[4] + 128;
		}
		@Pc(53) int local53 = (int) Camera.yaw + Camera.anInt3966 & 0x3FFF;
		Static349.method5833((local19 >> 3) * 3 + 600, Static288.anInt5463, arg0, Static386.method6032(PlayerList.self.xFine, PlayerList.self.zFine, Static355.anInt6585) - 50, Static62.anInt2395, local53, local19);
		@Pc(96) float local96 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static211.anInt3777 = (int) (local96 * (float) (Static211.anInt3777 - Static196.anInt3318) + (float) Static196.anInt3318);
		Static136.anInt6778 = (int) ((float) Static106.anInt2218 + local96 * (float) (Static136.anInt6778 - Static106.anInt2218));
		Static102.anInt3592 = (int) (local96 * (float) (Static102.anInt3592 - Static5.anInt105) + (float) Static5.anInt105);
		Static265.anInt4857 = (int) ((float) Static231.anInt4071 + local96 * (float) (Static265.anInt4857 - Static231.anInt4071));
		@Pc(151) int local151 = Static4.anInt87 - Static272.anInt5023;
		if (local151 > 8192) {
			local151 -= 16384;
		} else if (local151 < -8192) {
			local151 += 16384;
		}
		Static4.anInt87 = (int) ((float) Static272.anInt5023 + (float) local151 * local96);
		Static4.anInt87 &= 0x3FFF;
	}
}
