import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class228 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "[I")
	private final int[] anIntArray451 = new int[2];

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "[I")
	public final int[] anIntArray452 = new int[2];

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray8 = new int[2][2][4];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIF)F")
	private float method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IF)I")
	public int method5256(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray451[0] + (float) (this.anIntArray451[1] - this.anIntArray451[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static365.aFloat112 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static365.anInt5849 = (int) (Static365.aFloat112 * 65536.0F);
		}
		if (this.anIntArray452[arg0] == 0) {
			return 0;
		}
		local20 = this.method5254(arg0, 0, arg1);
		Static365.aFloatArrayArray12[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5258(arg0, 0, arg1));
		Static365.aFloatArrayArray12[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray452[arg0]; local77++) {
			local20 = this.method5254(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5258(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static365.aFloatArrayArray12[arg0][local77 * 2 + 1] = Static365.aFloatArrayArray12[arg0][local77 * 2 - 1] * local101;
			Static365.aFloatArrayArray12[arg0][local77 * 2] = Static365.aFloatArrayArray12[arg0][local77 * 2 - 1] * local97 + Static365.aFloatArrayArray12[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static365.aFloatArrayArray12[arg0][local157] += Static365.aFloatArrayArray12[arg0][local157 - 1] * local97 + Static365.aFloatArrayArray12[arg0][local157 - 2] * local101;
			}
			Static365.aFloatArrayArray12[arg0][1] += Static365.aFloatArrayArray12[arg0][0] * local97 + local101;
			Static365.aFloatArrayArray12[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray452[0] * 2; local226++) {
				Static365.aFloatArrayArray12[0][local226] *= Static365.aFloat112;
			}
		}
		for (local226 = 0; local226 < this.anIntArray452[arg0] * 2; local226++) {
			Static365.anIntArrayArray144[arg0][local226] = (int) (Static365.aFloatArrayArray12[arg0][local226] * 65536.0F);
		}
		return this.anIntArray452[arg0] * 2;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ge;Lclient!kl;)V")
	public void method5257(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class211 arg1) {
		@Pc(3) int local3 = arg0.g1();
		this.anIntArray452[0] = local3 >> 4;
		this.anIntArray452[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray451[0] = this.anIntArray451[1] = 0;
			return;
		}
		this.anIntArray451[0] = arg0.g2();
		this.anIntArray451[1] = arg0.g2();
		@Pc(37) int local37 = arg0.g1();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray452[local39]; local42++) {
				this.anIntArrayArrayArray8[local39][0][local42] = arg0.g2();
				this.anIntArrayArrayArray7[local39][0][local42] = arg0.g2();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray452[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray8[local42][1][local81] = this.anIntArrayArrayArray8[local42][0][local81];
					this.anIntArrayArrayArray7[local42][1][local81] = this.anIntArrayArrayArray7[local42][0][local81];
				} else {
					this.anIntArrayArrayArray8[local42][1][local81] = arg0.g2();
					this.anIntArrayArrayArray7[local42][1][local81] = arg0.g2();
				}
			}
		}
		if (local37 != 0 || this.anIntArray451[1] != this.anIntArray451[0]) {
			arg1.method4949(arg0);
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(IIF)F")
	private float method5258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray8[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray8[arg0][1][arg1] - this.anIntArrayArrayArray8[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static365.method5259(local34);
	}
}
