import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class TextureOp26 extends TextureOp {

	@OriginalMember(owner = "client!fu", name = "O", descriptor = "I")
	private int anInt2214 = 0;

	@OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
	private int anInt2215 = 4096;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public TextureOp26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 == 0) {
			this.anInt2214 = arg1.g2();
		} else if (arg0 == 1) {
			this.anInt2215 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(27) int[] local27 = this.getChildMonochromeOutput(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Texture.width; local29++) {
				@Pc(35) int local35 = local27[local29];
				local11[local29] = local35 >= this.anInt2214 && local35 <= this.anInt2215 ? 4096 : 0;
			}
		}
		return local11;
	}
}
