import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub2() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737) {
			@Pc(27) int[] local27 = this.method9422(arg0, 2);
			@Pc(33) int[][] local33 = this.method9413(0, arg0);
			@Pc(39) int[][] local39 = this.method9413(1, arg0);
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			@Pc(55) int[] local55 = local33[0];
			@Pc(59) int[] local59 = local33[1];
			@Pc(63) int[] local63 = local33[2];
			@Pc(67) int[] local67 = local39[0];
			@Pc(71) int[] local71 = local39[1];
			@Pc(75) int[] local75 = local39[2];
			for (@Pc(77) int local77 = 0; local77 < Static608.anInt9289; local77++) {
				@Pc(83) int local83 = local27[local77];
				if (local83 == 4096) {
					local43[local77] = local55[local77];
					local47[local77] = local59[local77];
					local51[local77] = local63[local77];
				} else if (local83 == 0) {
					local43[local77] = local67[local77];
					local47[local77] = local71[local77];
					local51[local77] = local75[local77];
				} else {
					@Pc(97) int local97 = 4096 - local83;
					local43[local77] = local97 * local67[local77] + local55[local77] * local83 >> 12;
					local47[local77] = local71[local77] * local97 + local83 * local59[local77] >> 12;
					local51[local77] = local75[local77] * local97 + local83 * local63[local77] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(21) int[] local21 = this.method9422(arg1, 0);
			@Pc(27) int[] local27 = this.method9422(arg1, 1);
			@Pc(33) int[] local33 = this.method9422(arg1, 2);
			for (@Pc(35) int local35 = 0; local35 < Static608.anInt9289; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = local41 * local21[local35] + (4096 - local41) * local27[local35] >> 12;
				}
			}
		}
		if (arg0 <= 107) {
			Static14.anIntArray25 = null;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			super.aBoolean824 = arg1.g1() == 1;
		}
		if (arg0) {
			Static14.anIntArray25 = null;
		}
	}
}
