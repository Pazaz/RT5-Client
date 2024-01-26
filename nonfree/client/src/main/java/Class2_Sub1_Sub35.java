import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class2_Sub1_Sub35 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
	private int anInt10233 = 0;

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
	private int anInt10231 = 4096;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(21) int[] local21 = this.method9422(arg1, 0);
			for (@Pc(23) int local23 = 0; local23 < Static608.anInt9289; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (local29 < this.anInt10233) {
					local11[local23] = this.anInt10233;
				} else if (this.anInt10231 < local29) {
					local11[local23] = this.anInt10231;
				} else {
					local11[local23] = local29;
				}
			}
		}
		if (arg0 < 107) {
			Static677.anInterface4_11 = null;
		}
		return local11;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt10233 = arg1.method7382();
		} else if (arg2 == 1) {
			this.anInt10231 = arg1.method7382();
		} else if (arg2 == 2) {
			super.aBoolean824 = arg1.method7396() == 1;
		}
		if (arg0) {
			this.method9414(0);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737) {
			@Pc(31) int[][] local31 = this.method9413(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			for (@Pc(57) int local57 = 0; local57 < Static608.anInt9289; local57++) {
				@Pc(63) int local63 = local35[local57];
				@Pc(67) int local67 = local39[local57];
				@Pc(71) int local71 = local43[local57];
				if (this.anInt10233 > local63) {
					local47[local57] = this.anInt10233;
				} else if (this.anInt10231 >= local63) {
					local47[local57] = local63;
				} else {
					local47[local57] = this.anInt10231;
				}
				if (this.anInt10233 > local67) {
					local51[local57] = this.anInt10233;
				} else if (local67 > this.anInt10231) {
					local51[local57] = this.anInt10231;
				} else {
					local51[local57] = local67;
				}
				if (this.anInt10233 > local71) {
					local55[local57] = this.anInt10233;
				} else if (this.anInt10231 >= local71) {
					local55[local57] = local71;
				} else {
					local55[local57] = this.anInt10231;
				}
			}
		}
		return local21;
	}
}
