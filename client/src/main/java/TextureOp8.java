import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class TextureOp8 extends TextureOp {

	@OriginalMember(owner = "client!wt", name = "S", descriptor = "[I")
	private int[] anIntArray525;

	@OriginalMember(owner = "client!wt", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!wt", name = "Z", descriptor = "[I")
	private int[] anIntArray526;

	@OriginalMember(owner = "client!wt", name = "R", descriptor = "I")
	private int anInt7259 = 0;

	@OriginalMember(owner = "client!wt", name = "V", descriptor = "[S")
	private final short[] aShortArray129 = new short[257];

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
	public TextureOp8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(26) int[] local26 = this.getChildMonochromeOutput(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Texture.width; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local16[local28] = this.aShortArray129[local36];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V")
	private void method6486() {
		@Pc(8) int[] local8 = this.anIntArrayArray65[0];
		@Pc(21) int[] local21 = this.anIntArrayArray65[1];
		@Pc(30) int[] local30 = this.anIntArrayArray65[this.anIntArrayArray65.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray65[this.anIntArrayArray65.length - 1];
		this.anIntArray526 = new int[] { local30[0] + local30[0] - local39[0], local30[1] + -local39[1] + local30[1] };
		this.anIntArray525 = new int[] { local8[0] + local8[0] - local21[0], local8[1] + -local21[1] + local8[1] };
	}

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)V")
	private void method6488() {
		@Pc(4) int local4 = this.anInt7259;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(55) int[] local55;
		@Pc(60) int[] local60;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(86) int local86;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray65.length - 1 && this.anIntArrayArray65[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray65[local24 - 1];
				local60 = this.anIntArrayArray65[local24];
				local69 = this.method6489(local24 - 2)[1];
				local73 = local55[1];
				local77 = local60[1];
				local86 = this.method6489(local24 + 1)[1];
				@Pc(103) int local103 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(109) int local109 = local103 * local103 >> 12;
				@Pc(119) int local119 = local73 + local86 - local69 - local77;
				@Pc(127) int local127 = local69 - local119 - local73;
				@Pc(132) int local132 = local77 - local69;
				@Pc(144) int local144 = local109 * (local119 * local103 >> 12) >> 12;
				@Pc(150) int local150 = local127 * local109 >> 12;
				@Pc(156) int local156 = local103 * local132 >> 12;
				@Pc(165) int local165 = local150 + local144 + local156 + local73;
				if (local165 <= -32768) {
					local165 = -32767;
				}
				if (local165 >= 32768) {
					local165 = 32767;
				}
				this.aShortArray129[local4] = (short) local165;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray65.length - 1 > local24 && local22 >= this.anIntArrayArray65[local24][0]; local24++) {
				}
				local55 = this.anIntArrayArray65[local24 - 1];
				local60 = this.anIntArrayArray65[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - Static181.anIntArray203[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local73 * local60[1] + local77 * local55[1] >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray129[local4] = (short) local86;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray65.length - 1 > local24 && this.anIntArrayArray65[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray65[local24 - 1];
				local60 = this.anIntArrayArray65[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - local69;
				local77 = local69 * local60[1] + local55[1] * local73 >> 12;
				if (local77 <= -32768) {
					local77 = -32767;
				}
				if (local77 >= 32768) {
					local77 = 32767;
				}
				this.aShortArray129[local4] = (short) local77;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V")
	@Override
	public void postDecode() {
		if (this.anIntArrayArray65 == null) {
			this.anIntArrayArray65 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray65.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt7259 == 2) {
			this.method6486();
		}
		Static29.method937();
		this.method6488();
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)[I")
	private int[] method6489(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray525;
		} else if (this.anIntArrayArray65.length <= arg0) {
			return this.anIntArray526;
		} else {
			return this.anIntArrayArray65[arg0];
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt7259 = arg1.g1();
		this.anIntArrayArray65 = new int[arg1.g1()][2];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArrayArray65.length; local22++) {
			this.anIntArrayArray65[local22][0] = arg1.g2();
			this.anIntArrayArray65[local22][1] = arg1.g2();
		}
	}
}
