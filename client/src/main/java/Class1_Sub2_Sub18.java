import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			super.aBoolean515 = arg1.method5761() == 1;
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(III)V")
	private void method3021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = Static207.anIntArray360[arg0];
		@Pc(21) int local21 = Static60.anIntArray455[arg1];
		@Pc(32) float local32 = (float) Math.atan2((double) (local17 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static25.anInt854 = arg0;
			Static17.anInt650 = arg1;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static17.anInt650 = arg0;
			Static25.anInt854 = arg1;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static17.anInt650 = arg0;
			Static25.anInt854 = Static64.anInt1755 - arg1;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static25.anInt854 = arg0;
			Static17.anInt650 = Static53.anInt1598 - arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static17.anInt650 = Static53.anInt1598 - arg1;
			Static25.anInt854 = Static64.anInt1755 - arg0;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static25.anInt854 = Static64.anInt1755 - arg1;
			Static17.anInt650 = Static53.anInt1598 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static25.anInt854 = arg1;
			Static17.anInt650 = Static53.anInt1598 - arg0;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static17.anInt650 = arg1;
			Static25.anInt854 = Static64.anInt1755 - arg0;
		}
		Static25.anInt854 &= Static145.anInt3608;
		Static17.anInt650 &= Static128.anInt3242;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			for (@Pc(33) int local33 = 0; local33 < Static64.anInt1755; local33++) {
				this.method3021(local33, arg0);
				@Pc(48) int[][] local48 = this.method6082(0, Static17.anInt650);
				local23[local33] = local48[0][Static25.anInt854];
				local27[local33] = local48[1][Static25.anInt854];
				local31[local33] = local48[2][Static25.anInt854];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			for (@Pc(22) int local22 = 0; local22 < Static64.anInt1755; local22++) {
				this.method3021(local22, arg0);
				@Pc(35) int[] local35 = this.method6078(0, Static17.anInt650);
				local16[local22] = local35[Static25.anInt854];
			}
		}
		return local16;
	}
}
