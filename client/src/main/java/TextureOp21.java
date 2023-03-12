import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class TextureOp21 extends TextureOp {

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	public TextureOp21() {
		super(3, false);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			super.monochrome = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(28) int[] local28 = this.getChildMonochromeOutput(0, arg0);
			@Pc(34) int[] local34 = this.getChildMonochromeOutput(1, arg0);
			@Pc(40) int[] local40 = this.getChildMonochromeOutput(2, arg0);
			for (@Pc(42) int local42 = 0; local42 < Texture.width; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local18[local42] = local28[local42];
				} else if (local48 == 0) {
					local18[local42] = local34[local42];
				} else {
					local18[local42] = local48 * local28[local42] + (4096 - local48) * local34[local42] >> 12;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(26) int[] local26 = this.getChildMonochromeOutput(2, arg0);
			@Pc(32) int[][] local32 = this.getChildColorOutput(0, arg0);
			@Pc(38) int[][] local38 = this.getChildColorOutput(1, arg0);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Texture.width; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local62[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local50[local76] = local74[local76];
				} else {
					@Pc(132) int local132 = 4096 - local82;
					local42[local76] = local132 * local66[local76] + local82 * local54[local76] >> 12;
					local46[local76] = local132 * local70[local76] + local58[local76] * local82 >> 12;
					local50[local76] = local82 * local62[local76] + local132 * local74[local76] >> 12;
				}
			}
		}
		return local11;
	}
}
