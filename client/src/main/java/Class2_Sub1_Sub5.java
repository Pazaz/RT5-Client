import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bw", name = "K", descriptor = "I")
	private int anInt1204 = 4096;

	@OriginalMember(owner = "client!bw", name = "L", descriptor = "I")
	private int anInt1207 = 4096;

	@OriginalMember(owner = "client!bw", name = "N", descriptor = "I")
	private int anInt1209 = 409;

	@OriginalMember(owner = "client!bw", name = "O", descriptor = "[I")
	private final int[] anIntArray110 = new int[3];

	@OriginalMember(owner = "client!bw", name = "R", descriptor = "I")
	private int anInt1205 = 4096;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737) {
			@Pc(27) int[][] local27 = this.method9413(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static608.anInt9289; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray110[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (local67 > this.anInt1209) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(103) int local103 = local35[local53];
					local67 = local103 - this.anIntArray110[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (local67 > this.anInt1209) {
						local43[local53] = local59;
						local47[local53] = local103;
						local51[local53] = local39[local53];
					} else {
						@Pc(149) int local149 = local39[local53];
						local67 = local149 - this.anIntArray110[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (this.anInt1209 < local67) {
							local43[local53] = local59;
							local47[local53] = local103;
							local51[local53] = local149;
						} else {
							local43[local53] = local59 * this.anInt1204 >> 12;
							local47[local53] = this.anInt1207 * local103 >> 12;
							local51[local53] = local149 * this.anInt1205 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt1209 = arg1.g2();
		} else if (arg2 == 1) {
			this.anInt1205 = arg1.g2();
		} else if (arg2 == 2) {
			this.anInt1207 = arg1.g2();
		} else if (arg2 == 3) {
			this.anInt1204 = arg1.g2();
		} else if (arg2 == 4) {
			@Pc(72) int local72 = arg1.g3();
			this.anIntArray110[1] = local72 >> 4 & 0xFF0;
			this.anIntArray110[2] = local72 >> 12 & 0x0;
			this.anIntArray110[0] = (local72 & 0xFF0000) << 4;
		}
		if (arg0) {
			Static60.method1293(-43, false, 13, 77, 8);
		}
	}
}
