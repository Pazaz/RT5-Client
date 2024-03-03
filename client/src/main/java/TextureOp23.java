import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class TextureOp23 extends TextureOp {

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	public TextureOp23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 == 0) {
			super.monochrome = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Texture.width; local34++) {
				this.method1764(local34, arg0);
				@Pc(47) int[][] local47 = this.getChildColorOutput(0, Static216.anInt3798);
				local24[local34] = local47[0][Static384.anInt7174];
				local28[local34] = local47[1][Static384.anInt7174];
				local32[local34] = local47[2][Static384.anInt7174];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(III)V")
	private void method1764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Texture.widthFractions[arg0];
		@Pc(13) int local13 = Texture.heightFractions[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static384.anInt7174 = arg0;
			Static216.anInt3798 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static384.anInt7174 = arg1;
			Static216.anInt3798 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static384.anInt7174 = Texture.width - arg1;
			Static216.anInt3798 = arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static384.anInt7174 = arg0;
			Static216.anInt3798 = Texture.height - arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static216.anInt3798 = Texture.height - arg1;
			Static384.anInt7174 = Texture.width - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static384.anInt7174 = Texture.width - arg1;
			Static216.anInt3798 = Texture.height - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static216.anInt3798 = Texture.height - arg0;
			Static384.anInt7174 = arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static216.anInt3798 = arg1;
			Static384.anInt7174 = Texture.width - arg0;
		}
		Static216.anInt3798 &= Texture.heightMask;
		Static384.anInt7174 &= Texture.anInt1721;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			for (@Pc(25) int local25 = 0; local25 < Texture.width; local25++) {
				this.method1764(local25, arg0);
				@Pc(38) int[] local38 = this.getChildMonochromeOutput(0, Static216.anInt3798);
				local11[local25] = local38[Static384.anInt7174];
			}
		}
		return local11;
	}
}
