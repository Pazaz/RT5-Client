import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class2_Sub1_Sub19 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mt", name = "I", descriptor = "I")
	private int anInt6314 = 4096;

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "Z")
	private boolean aBoolean467 = true;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			return;
		}
		if (arg2 == 0) {
			this.anInt6314 = arg1.method7382();
		} else if (arg2 == 1) {
			this.aBoolean467 = arg1.method7396() == 1;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737) {
			@Pc(25) int[] local25 = this.method9422(arg0 - 1 & Static489.anInt7343, 0);
			@Pc(31) int[] local31 = this.method9422(arg0, 0);
			@Pc(41) int[] local41 = this.method9422(arg0 + 1 & Static489.anInt7343, 0);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static608.anInt9289; local55++) {
				@Pc(68) int local68 = (local41[local55] - local25[local55]) * this.anInt6314;
				@Pc(88) int local88 = this.anInt6314 * (local31[Static576.anInt8580 & local55 + 1] - local31[local55 - 1 & Static576.anInt8580]);
				@Pc(92) int local92 = local88 >> 12;
				@Pc(96) int local96 = local68 >> 12;
				@Pc(102) int local102 = local92 * local92 >> 12;
				@Pc(108) int local108 = local96 * local96 >> 12;
				@Pc(122) int local122 = (int) (Math.sqrt((double) ((float) (local108 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128;
				@Pc(126) int local126;
				@Pc(130) int local130;
				if (local122 == 0) {
					local126 = 0;
					local128 = 0;
					local130 = 0;
				} else {
					local130 = 16777216 / local122;
					local126 = local68 / local122;
					local128 = local88 / local122;
				}
				if (this.aBoolean467) {
					local128 = (local128 >> 1) + 2048;
					local130 = (local130 >> 1) + 2048;
					local126 = (local126 >> 1) + 2048;
				}
				local45[local55] = local128;
				local49[local55] = local126;
				local53[local55] = local130;
			}
		}
		return local11;
	}
}
