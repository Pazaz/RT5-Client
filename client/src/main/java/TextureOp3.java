import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class TextureOp3 extends TextureOp {

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public TextureOp3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			Static404.method4610(local14, 0, Texture.width, Texture.heightFractions[arg0]);
		}
		return local14;
	}
}
