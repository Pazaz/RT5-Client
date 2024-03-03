import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class TextureOp33 extends TextureOp {

	@OriginalMember(owner = "client!br", name = "O", descriptor = "Z")
	private boolean aBoolean71 = true;

	@OriginalMember(owner = "client!br", name = "N", descriptor = "I")
	private int anInt796 = 4096;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public TextureOp33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 == 0) {
			this.anInt796 = arg1.g2();
		} else if (arg0 == 1) {
			this.aBoolean71 = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(30) int[] local30 = this.getChildMonochromeOutput(0, arg0 - 1 & Texture.heightMask);
			@Pc(36) int[] local36 = this.getChildMonochromeOutput(0, arg0);
			@Pc(46) int[] local46 = this.getChildMonochromeOutput(0, Texture.heightMask & arg0 + 1);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Texture.width; local60++) {
				@Pc(74) int local74 = this.anInt796 * (local46[local60] - local30[local60]);
				@Pc(94) int local94 = (local36[Texture.anInt1721 & local60 + 1] - local36[local60 - 1 & Texture.anInt1721]) * this.anInt796;
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local108 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(135) int local135;
				@Pc(143) int local143;
				@Pc(139) int local139;
				if (local129 == 0) {
					local143 = 0;
					local139 = 0;
					local135 = 0;
				} else {
					local135 = local94 / local129;
					local139 = 16777216 / local129;
					local143 = local74 / local129;
				}
				if (this.aBoolean71) {
					local143 = (local143 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
				}
				local50[local60] = local135;
				local54[local60] = local143;
				local58[local60] = local139;
			}
		}
		return local16;
	}
}
