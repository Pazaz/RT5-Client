import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class TextureOp36 extends TextureOp {

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt6433;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
	private int anInt6435;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	private int anInt6436 = -1;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public TextureOp36() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method6475(arg0, arg1);
		if (this.anInt6436 >= 0 && Texture.provider != null) {
			@Pc(28) int local28 = Texture.provider.method2658(this.anInt6436).aBoolean441 ? 64 : 128;
			this.anIntArray435 = Texture.provider.method2659(this.anInt6436, false, local28, 1.0F, local28);
			this.anInt6435 = local28;
			this.anInt6433 = local28;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)I")
	@Override
	public int method6482() {
		return this.anInt6436;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	@Override
	public void clearImageCache() {
		super.clearImageCache();
		this.anIntArray435 = null;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(35) int local35 = this.anInt6435 * (Texture.height == this.anInt6433 ? arg0 : arg0 * this.anInt6433 / Texture.height);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (this.anInt6435 == Texture.width) {
				for (local57 = 0; local57 < Texture.width; local57++) {
					local65 = this.anIntArray435[local35++];
					local47[local57] = (local65 & 0xFF) << 4;
					local43[local57] = local65 >> 4 & 0xFF0;
					local39[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Texture.width; local57++) {
					local65 = this.anInt6435 * local57 / Texture.width;
					@Pc(117) int local117 = this.anIntArray435[local35 + local65];
					local47[local57] = (local117 & 0xFF) << 4;
					local43[local57] = local117 >> 4 & 0xFF0;
					local39[local57] = local117 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 == 0) {
			this.anInt6436 = arg1.g2();
		}
	}
}
