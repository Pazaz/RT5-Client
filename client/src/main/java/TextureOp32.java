import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class TextureOp32 extends TextureOp {

	@OriginalMember(owner = "client!ju", name = "V", descriptor = "I")
	private int anInt3301 = 4096;

	@OriginalMember(owner = "client!ju", name = "fb", descriptor = "[I")
	private final int[] anIntArray201 = new int[3];

	@OriginalMember(owner = "client!ju", name = "cb", descriptor = "I")
	private int anInt3308 = 3216;

	@OriginalMember(owner = "client!ju", name = "eb", descriptor = "I")
	private int anInt3310 = 3216;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
	public TextureOp32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)V")
	private void method3286() {
		@Pc(19) double local19 = Math.cos((double) ((float) this.anInt3310 / 4096.0F));
		this.anIntArray201[0] = (int) (local19 * 4096.0D * Math.sin((double) ((float) this.anInt3308 / 4096.0F)));
		this.anIntArray201[1] = (int) (Math.cos((double) ((float) this.anInt3308 / 4096.0F)) * 4096.0D * local19);
		this.anIntArray201[2] = (int) (Math.sin((double) ((float) this.anInt3310 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray201[0] * this.anIntArray201[0] >> 12;
		@Pc(89) int local89 = this.anIntArray201[1] * this.anIntArray201[1] >> 12;
		@Pc(101) int local101 = this.anIntArray201[2] * this.anIntArray201[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local101 + local89 + local77 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray201[0] = (this.anIntArray201[0] << 12) / local114;
			this.anIntArray201[1] = (this.anIntArray201[1] << 12) / local114;
			this.anIntArray201[2] = (this.anIntArray201[2] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V")
	@Override
	public void postDecode() {
		this.method3286();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(22) int local22 = Texture.anInt5653 * this.anInt3301 >> 12;
			@Pc(32) int[] local32 = this.getChildMonochromeOutput(0, arg0 - 1 & Texture.heightMask);
			@Pc(38) int[] local38 = this.getChildMonochromeOutput(0, arg0);
			@Pc(48) int[] local48 = this.getChildMonochromeOutput(0, arg0 + 1 & Texture.heightMask);
			for (@Pc(50) int local50 = 0; local50 < Texture.width; local50++) {
				@Pc(65) int local65 = local22 * (local48[local50] - local32[local50]) >> 12;
				@Pc(86) int local86 = (local38[local50 - 1 & Texture.anInt1721] - local38[local50 + 1 & Texture.anInt1721]) * local22 >> 12;
				@Pc(90) int local90 = local86 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				@Pc(102) int local102 = local65 >> 4;
				if (local102 < 0) {
					local102 = -local102;
				}
				if (local90 > 255) {
					local90 = 255;
				}
				if (local102 > 255) {
					local102 = 255;
				}
				@Pc(135) int local135 = FloType.aByteArray39[((local102 + 1) * local102 >> 1) + local90] & 0xFF;
				@Pc(141) int local141 = local135 * local86 >> 8;
				@Pc(147) int local147 = local135 * 4096 >> 8;
				@Pc(153) int local153 = local65 * local135 >> 8;
				@Pc(162) int local162 = this.anIntArray201[2] * local147 >> 12;
				@Pc(171) int local171 = this.anIntArray201[1] * local153 >> 12;
				@Pc(180) int local180 = local141 * this.anIntArray201[0] >> 12;
				local11[local50] = local180 + local171 + local162;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt3301 = arg1.g2();
		} else if (arg0 == 1) {
			this.anInt3308 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt3310 = arg1.g2();
		}
	}
}
