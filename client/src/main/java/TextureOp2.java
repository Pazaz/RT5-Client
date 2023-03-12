import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class TextureOp2 extends TextureOp {

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public TextureOp2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		return Texture.widthFractions;
	}
}
