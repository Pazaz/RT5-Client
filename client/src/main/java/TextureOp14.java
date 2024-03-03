import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class TextureOp14 extends TextureOp {

	@OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
	private int anInt5155 = 585;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public TextureOp14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(25) int local25 = Texture.heightFractions[arg0];
			for (@Pc(27) int local27 = 0; local27 < Texture.width; local27++) {
				@Pc(33) int local33 = Texture.widthFractions[local27];
				@Pc(73) int local73;
				if (local33 > this.anInt5155 && 4096 - this.anInt5155 > local33 && 2048 - this.anInt5155 < local25 && local25 < this.anInt5155 + 2048) {
					local73 = 2048 - local33;
					local73 = local73 >= 0 ? local73 : -local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt5155;
					local11[local27] = 4096 - local73;
				} else if (local33 > 2048 - this.anInt5155 && this.anInt5155 + 2048 > local33) {
					local73 = local25 - 2048;
					local73 = local73 < 0 ? -local73 : local73;
					local73 -= this.anInt5155;
					local73 <<= 0xC;
					local11[local27] = local73 / (2048 - this.anInt5155);
				} else if (this.anInt5155 > local25 || local25 > 4096 - this.anInt5155) {
					local73 = local33 - 2048;
					@Pc(181) int local181 = local73 >= 0 ? local73 : -local73;
					@Pc(186) int local186 = local181 - this.anInt5155;
					@Pc(190) int local190 = local186 << 12;
					local11[local27] = local190 / (2048 - this.anInt5155);
				} else if (this.anInt5155 <= local33 && 4096 - this.anInt5155 >= local33) {
					local11[local27] = 0;
				} else {
					local73 = 2048 - local25;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt5155;
					local11[local27] = 4096 - local73;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 == 0) {
			this.anInt5155 = arg1.g2();
		}
	}
}
