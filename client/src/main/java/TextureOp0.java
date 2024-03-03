import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class TextureOp0 extends TextureOp {

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public TextureOp0() {
		this(4096);
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
	private TextureOp0(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt164 = 4096;
		this.anInt164 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 == 0) {
			this.anInt164 = (arg1.g1() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			Static404.method4610(local14, 0, Texture.width, this.anInt164);
		}
		return local14;
	}
}
