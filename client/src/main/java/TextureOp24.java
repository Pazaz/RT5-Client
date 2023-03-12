import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class TextureOp24 extends TextureOp {

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public TextureOp24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(27) int[][] local27 = this.getChildColorOutput(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			for (@Pc(41) int local41 = 0; local41 < Texture.width; local41++) {
				local11[local41] = (local39[local41] + local35[local41] + local31[local41]) / 3;
			}
		}
		return local11;
	}
}
