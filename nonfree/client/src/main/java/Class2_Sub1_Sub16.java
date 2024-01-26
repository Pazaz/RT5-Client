import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(21) int[] local21 = this.method9422(arg1, 0);
			for (@Pc(23) int local23 = 0; local23 < Static608.anInt9289; local23++) {
				local11[local23] = 4096 - local21[local23];
			}
		}
		return arg0 <= 107 ? null : local11;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737) {
			@Pc(28) int[][] local28 = this.method9413(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static608.anInt9289; local54++) {
				local44[local54] = 4096 - local32[local54];
				local48[local54] = 4096 - local36[local54];
				local52[local54] = 4096 - local40[local54];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			Static341.method5033(111);
		}
		if (arg2 == 0) {
			super.aBoolean824 = arg1.method7396() == 1;
		}
	}
}
