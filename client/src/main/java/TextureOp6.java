import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class TextureOp6 extends TextureOp {

	@OriginalMember(owner = "client!i", name = "O", descriptor = "I")
	private int anInt2646 = 4096;

	@OriginalMember(owner = "client!i", name = "S", descriptor = "I")
	private int anInt2649 = 0;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public TextureOp6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(29) int[][] local29 = this.getChildColorOutput(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Texture.width; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt2649) {
					local45[local55] = this.anInt2649;
				} else if (local61 <= this.anInt2646) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt2646;
				}
				if (this.anInt2649 > local65) {
					local49[local55] = this.anInt2649;
				} else if (this.anInt2646 < local65) {
					local49[local55] = this.anInt2646;
				} else {
					local49[local55] = local65;
				}
				if (this.anInt2649 > local69) {
					local53[local55] = this.anInt2649;
				} else if (this.anInt2646 < local69) {
					local53[local55] = this.anInt2646;
				} else {
					local53[local55] = local69;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(26) int[] local26 = this.getChildMonochromeOutput(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Texture.width; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt2649 > local34) {
					local16[local28] = this.anInt2649;
				} else if (local34 <= this.anInt2646) {
					local16[local28] = local34;
				} else {
					local16[local28] = this.anInt2646;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt2649 = arg1.g2();
		} else if (arg0 == 1) {
			this.anInt2646 = arg1.g2();
		} else if (arg0 == 2) {
			super.monochrome = arg1.g1() == 1;
		}
	}
}
