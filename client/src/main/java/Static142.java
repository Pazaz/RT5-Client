import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
	public static int anInt3529;

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "S")
	public static short aShort50 = 256;

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
	public static final int anInt3531 = -13423323;

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "[I")
	public static final int[] anIntArray249 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
	public static void method3126(@OriginalArg(1) int arg0) {
		Static257.anInt5552 = arg0;
		Static108.aClass215_42.method6060();
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)I")
	public static int method3127(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(BI)V")
	public static void method3130(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static197.anInt4521 - Static334.anInt6936;
		if (local16 >= 100) {
			Static303.anInt6342 = 1;
			return;
		}
		@Pc(27) int local27 = (int) Static189.aFloat55;
		if (local27 < Static96.anInt2440 >> 8) {
			local27 = Static96.anInt2440 >> 8;
		}
		if (Static187.aBooleanArray12[4] && Static243.anIntArray395[4] + 128 > local27) {
			local27 = Static243.anIntArray395[4] + 128;
		}
		@Pc(64) int local64 = (int) Static188.aFloat17 + Static61.anInt1679 & 0x3FFF;
		Static140.method3078(Static309.method5429(Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032, Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027, Static39.anInt1215) - 50, (local27 >> 3) * 3 + 600, local27, local64, arg0, Static12.anInt536, anInt3529);
		@Pc(107) float local107 = 1.0F - (float) ((100 - local16) * (-local16 + 100) * (100 - local16)) / 1000000.0F;
		Static3.anInt92 = (int) ((float) (Static3.anInt92 - Static302.anInt6305) * local107 + (float) Static302.anInt6305);
		Static138.anInt3429 = (int) ((float) (Static138.anInt3429 - Static329.anInt6727) * local107 + (float) Static329.anInt6727);
		Static130.anInt6778 = (int) ((float) Static330.anInt6823 + local107 * (float) (Static130.anInt6778 - Static330.anInt6823));
		Static88.anInt2339 = (int) ((float) Static222.anInt5046 + (float) (Static88.anInt2339 - Static222.anInt5046) * local107);
		@Pc(160) int local160 = Static89.anInt2374 - Static186.anInt4353;
		if (local160 > 8192) {
			local160 -= 16384;
		} else if (local160 < -8192) {
			local160 += 16384;
		}
		Static89.anInt2374 = (int) ((float) local160 * local107 + (float) Static186.anInt4353);
		Static89.anInt2374 &= 0x3FFF;
	}
}
