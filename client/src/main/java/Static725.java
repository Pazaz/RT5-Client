import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static725 {

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "Lclient!fba;")
	public static final Class121 aClass121_6 = new Class121();

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
	public static int anInt10936 = -1;

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "[I")
	public static int[] anIntArray890 = new int[13];

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!ha;IB)V")
	public static void method9454(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (!Static18.aBoolean20 || !Static29.aBoolean60) {
			Static469.anInt7072 = 0;
			return;
		}
		if (Static703.aBoolean798) {
			Static415.aLong205 = Static272.aClass13_1.method5161();
		}
		Static298.anInt4811 = 0;
		Static356.anInt5773 = 0;
		Static679.anInt10278 = 0;
		@Pc(32) int[] local32 = arg0.Y();
		Static1.anInt10797 = (int) ((float) local32[2] / 3.0F);
		Static412.anInt6357 = (int) ((float) local32[3] / 3.0F);
		arg0.method7944(Static118.anIntArray198);
		if (Static228.anInt3709 != (int) ((float) Static118.anIntArray198[0] / 3.0F) || (int) ((float) Static118.anIntArray198[1] / 3.0F) != Static624.anInt9461) {
			Static228.anInt3709 = (int) ((float) Static118.anIntArray198[0] / 3.0F);
			Static624.anInt9461 = (int) ((float) Static118.anIntArray198[1] / 3.0F);
			Static407.anInt6286 = Static624.anInt9461 >> 1;
			Static460.anInt6970 = Static228.anInt3709 >> 1;
			Static485.anIntArray886 = new int[Static228.anInt3709 * Static624.anInt9461];
		}
		Static107.aClass73_3 = arg0.method8017();
		Static469.anInt7072 = 0;
		for (@Pc(117) int local117 = 0; local117 < Static317.anInt5046; local117++) {
			Static494.method6601(arg1, Static384.aClass75Array2[local117], arg0);
		}
		if (-20 != -20) {
			anIntArray890 = null;
		}
		for (@Pc(149) int local149 = 0; local149 < Static444.anInt6751; local149++) {
			Static494.method6601(arg1, Static607.aClass75Array4[local149], arg0);
		}
		for (@Pc(170) int local170 = 0; local170 < Static150.anInt2634; local170++) {
			Static494.method6601(arg1, Static285.aClass75Array1[local170], arg0);
		}
		Static432.anInt525 = 0;
		if (Static469.anInt7072 > 0) {
			@Pc(205) int local205 = Static485.anIntArray886.length;
			@Pc(212) int local212 = local205 - local205 & 0x7;
			@Pc(214) int local214 = 0;
			while (local214 < local212) {
				Static485.anIntArray886[local214++] = Integer.MAX_VALUE;
				Static485.anIntArray886[local214++] = Integer.MAX_VALUE;
				Static485.anIntArray886[local214++] = Integer.MAX_VALUE;
				Static485.anIntArray886[local214++] = Integer.MAX_VALUE;
				Static485.anIntArray886[local214++] = Integer.MAX_VALUE;
				Static485.anIntArray886[local214++] = Integer.MAX_VALUE;
				Static485.anIntArray886[local214++] = Integer.MAX_VALUE;
				Static485.anIntArray886[local214++] = Integer.MAX_VALUE;
			}
			while (local214 < local205) {
				Static485.anIntArray886[local214++] = Integer.MAX_VALUE;
			}
			Static254.anInt4115 = 1;
			for (@Pc(289) int local289 = 0; local289 < Static469.anInt7072; local289++) {
				@Pc(295) Class75 local295 = Static560.aClass75Array3[local289];
				Static264.method9460(local295.aShortArray17[0], local295.aShortArray18[0], local295.aShortArray19[3], local295.aShortArray19[1], local295.aShortArray18[3], local295.aShortArray17[3], local295.aShortArray18[1], local295.aShortArray19[0], local295.aShortArray17[1]);
				Static264.method9460(local295.aShortArray17[1], local295.aShortArray18[1], local295.aShortArray19[3], local295.aShortArray19[2], local295.aShortArray18[3], local295.aShortArray17[3], local295.aShortArray18[2], local295.aShortArray19[1], local295.aShortArray17[2]);
			}
			Static254.anInt4115 = 2;
		}
		if (Static703.aBoolean798) {
			Static666.aLong301 = Static272.aClass13_1.method5161() - Static415.aLong205;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZD)V")
	public static void method9455(@OriginalArg(1) double arg0) {
		if (Static385.aDouble18 == arg0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(32) int local32 = (int) (Math.pow((double) local18 / 255.0D, arg0) * 255.0D);
			Static609.anIntArray716[local18] = local32 > 255 ? 255 : local32;
		}
		Static385.aDouble18 = arg0;
	}
}
