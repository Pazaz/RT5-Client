import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class2_Sub1_Sub30 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
	private int anInt9793 = 4;

	@OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
	private int anInt9789 = 4;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737) {
			@Pc(28) int local28 = Static608.anInt9289 / this.anInt9793;
			@Pc(33) int local33 = Static2.anInt53 / this.anInt9789;
			@Pc(49) int[][] local49;
			if (local33 > 0) {
				@Pc(39) int local39 = arg0 % local33;
				local49 = this.method9413(0, local39 * Static2.anInt53 / local33);
			} else {
				local49 = this.method9413(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local19[0];
			@Pc(77) int[] local77 = local19[1];
			@Pc(81) int[] local81 = local19[2];
			for (@Pc(83) int local83 = 0; local83 < Static608.anInt9289; local83++) {
				@Pc(91) int local91;
				if (local28 <= 0) {
					local91 = 0;
				} else {
					@Pc(97) int local97 = local83 % local28;
					local91 = local97 * Static608.anInt9289 / local28;
				}
				local73[local83] = local61[local91];
				local77[local83] = local65[local91];
				local81[local83] = local69[local91];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt9793 = arg1.method7396();
		} else if (arg2 == 1) {
			this.anInt9789 = arg1.method7396();
		}
		if (arg0) {
			this.method9416(true, (Class2_Sub21) null, -94);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (arg0 < 107) {
			this.method9411(94, -126);
		}
		if (super.aClass180_41.aBoolean338) {
			@Pc(30) int local30 = Static608.anInt9289 / this.anInt9793;
			@Pc(35) int local35 = Static2.anInt53 / this.anInt9789;
			@Pc(51) int[] local51;
			@Pc(41) int local41;
			if (local35 > 0) {
				local41 = arg1 % local35;
				local51 = this.method9422(Static2.anInt53 * local41 / local35, 0);
			} else {
				local51 = this.method9422(0, 0);
			}
			for (local41 = 0; local41 < Static608.anInt9289; local41++) {
				if (local30 > 0) {
					@Pc(71) int local71 = local41 % local30;
					local11[local41] = local51[local71 * Static608.anInt9289 / local30];
				} else {
					local11[local41] = local51[0];
				}
			}
		}
		return local11;
	}
}
