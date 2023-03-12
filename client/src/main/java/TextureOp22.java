import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class TextureOp22 extends TextureOp {

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	public TextureOp22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			super.monochrome = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(21) int[] local21 = this.getChildMonochromeOutput(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Texture.width; local23++) {
				local11[local23] = 4096 - local21[local23];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(26) int[][] local26 = this.getChildColorOutput(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Texture.width; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local16;
	}
}
