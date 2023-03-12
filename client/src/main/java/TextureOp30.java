import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class TextureOp30 extends TextureOp {

	@OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
	private int anInt6163 = 3072;

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
	private int anInt6165 = 1024;

	@OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
	private int anInt6166 = 2048;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public TextureOp30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(21) int[][] local21 = this.getChildColorOutput(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Texture.width; local47++) {
				local37[local47] = this.anInt6165 + (this.anInt6166 * local25[local47] >> 12);
				local41[local47] = (local29[local47] * this.anInt6166 >> 12) + this.anInt6165;
				local45[local47] = this.anInt6165 + (this.anInt6166 * local33[local47] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt6165 = arg1.g2();
		} else if (arg0 == 1) {
			this.anInt6163 = arg1.g2();
		} else if (arg0 == 2) {
			super.monochrome = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
	@Override
	public void postDecode() {
		this.anInt6166 = this.anInt6163 - this.anInt6165;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(21) int[] local21 = this.getChildMonochromeOutput(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Texture.width; local23++) {
				local11[local23] = (this.anInt6166 * local21[local23] >> 12) + this.anInt6165;
			}
		}
		return local11;
	}
}
