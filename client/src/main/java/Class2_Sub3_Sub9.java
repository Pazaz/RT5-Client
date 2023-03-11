import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class2_Sub3_Sub9 extends Class2_Sub3 {

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			super.aBoolean487 = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6479(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6277(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static227.anInt4036; local34++) {
				this.method1764(local34, arg0);
				@Pc(47) int[][] local47 = this.method6483(0, Static216.anInt3798);
				local24[local34] = local47[0][Static384.anInt7174];
				local28[local34] = local47[1][Static384.anInt7174];
				local32[local34] = local47[2][Static384.anInt7174];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(III)V")
	private void method1764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static334.anIntArray424[arg0];
		@Pc(13) int local13 = Static16.anIntArray322[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static384.anInt7174 = arg0;
			Static216.anInt3798 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static384.anInt7174 = arg1;
			Static216.anInt3798 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static384.anInt7174 = Static227.anInt4036 - arg1;
			Static216.anInt3798 = arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static384.anInt7174 = arg0;
			Static216.anInt3798 = Static24.anInt638 - arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static216.anInt3798 = Static24.anInt638 - arg1;
			Static384.anInt7174 = Static227.anInt4036 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static384.anInt7174 = Static227.anInt4036 - arg1;
			Static216.anInt3798 = Static24.anInt638 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static216.anInt3798 = Static24.anInt638 - arg0;
			Static384.anInt7174 = arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static216.anInt3798 = arg1;
			Static384.anInt7174 = Static227.anInt4036 - arg0;
		}
		Static216.anInt3798 &= Static148.anInt2718;
		Static384.anInt7174 &= Static73.anInt1721;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3996(arg0);
		if (super.aClass158_41.aBoolean265) {
			for (@Pc(25) int local25 = 0; local25 < Static227.anInt4036; local25++) {
				this.method1764(local25, arg0);
				@Pc(38) int[] local38 = this.method6473(0, Static216.anInt3798);
				local11[local25] = local38[Static384.anInt7174];
			}
		}
		return local11;
	}
}
