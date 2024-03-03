import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class TextureOp25 extends TextureOp {

	@OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
	private int anInt2570 = 4096;

	@OriginalMember(owner = "client!hr", name = "O", descriptor = "I")
	private int anInt2569 = 4096;

	@OriginalMember(owner = "client!hr", name = "T", descriptor = "[I")
	private final int[] anIntArray165 = new int[3];

	@OriginalMember(owner = "client!hr", name = "Z", descriptor = "I")
	private int anInt2577 = 4096;

	@OriginalMember(owner = "client!hr", name = "X", descriptor = "I")
	private int anInt2576 = 409;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	public TextureOp25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 == 0) {
			this.anInt2576 = arg1.g2();
		} else if (arg0 == 1) {
			this.anInt2570 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt2577 = arg1.g2();
		} else if (arg0 == 3) {
			this.anInt2569 = arg1.g2();
		} else if (arg0 == 4) {
			@Pc(62) int local62 = arg1.g3();
			this.anIntArray165[2] = local62 >> 12 & 0x0;
			this.anIntArray165[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray165[1] = local62 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(27) int[][] local27 = this.getChildColorOutput(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Texture.width; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(66) int local66 = local59 - this.anIntArray165[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt2576) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(104) int local104 = local35[local53];
					local66 = local104 - this.anIntArray165[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (this.anInt2576 < local66) {
						local43[local53] = local59;
						local47[local53] = local104;
						local51[local53] = local39[local53];
					} else {
						@Pc(140) int local140 = local39[local53];
						local66 = local140 - this.anIntArray165[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt2576) {
							local43[local53] = local59;
							local47[local53] = local104;
							local51[local53] = local140;
						} else {
							local43[local53] = this.anInt2569 * local59 >> 12;
							local47[local53] = this.anInt2577 * local104 >> 12;
							local51[local53] = local140 * this.anInt2570 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}
}
