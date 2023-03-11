import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class2_Sub3_Sub31 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
	private int anInt5838 = 32768;

	static {
		new Class79(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub31() {
		super(3, false);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt5838 = arg1.method4829() << 4;
		} else if (arg0 == 1) {
			super.aBoolean487 = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6479(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass243_41.method6277(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(26) int[] local26 = this.method6473(1, arg0);
			@Pc(32) int[] local32 = this.method6473(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static227.anInt4036; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt5838 >> 12;
				@Pc(75) int local75 = local67 * Static181.anIntArray203[local58] >> 12;
				@Pc(83) int local83 = local67 * Static150.anIntArray173[local58] >> 12;
				@Pc(92) int local92 = Static73.anInt1721 & local46 + (local75 >> 12);
				@Pc(100) int local100 = Static148.anInt2718 & arg0 + (local83 >> 12);
				@Pc(106) int[][] local106 = this.method6483(0, local100);
				local36[local46] = local106[0][local92];
				local40[local46] = local106[1][local92];
				local44[local46] = local106[2][local92];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass158_41.method3996(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(26) int[] local26 = this.method6473(1, arg0);
			@Pc(32) int[] local32 = this.method6473(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static227.anInt4036; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt5838 >> 12;
				@Pc(61) int local61 = Static181.anIntArray203[local44] * local53 >> 12;
				@Pc(69) int local69 = local53 * Static150.anIntArray173[local44] >> 12;
				@Pc(77) int local77 = (local61 >> 12) + local34 & Static73.anInt1721;
				@Pc(86) int local86 = Static148.anInt2718 & arg0 + (local69 >> 12);
				@Pc(92) int[] local92 = this.method6473(0, local86);
				local16[local34] = local92[local77];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
	@Override
	public void method6480() {
		Static29.method937();
	}
}
