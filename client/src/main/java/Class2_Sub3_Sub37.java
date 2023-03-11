import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class2_Sub3_Sub37 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vm", name = "X", descriptor = "[Lclient!pa;")
	private Class173[] aClass173Array1;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6479(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6277(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(22) int local22 = Static227.anInt4036;
			@Pc(24) int local24 = Static24.anInt638;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass243_41.method6280();
			this.method6218(local28);
			for (@Pc(39) int local39 = 0; local39 < Static24.anInt638; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static227.anInt4036; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.aClass173Array1 = new Class173[arg1.method4815()];
			for (@Pc(33) int local33 = 0; local33 < this.aClass173Array1.length; local33++) {
				@Pc(39) int local39 = arg1.method4815();
				if (local39 == 0) {
					this.aClass173Array1[local33] = Static354.method1393(arg1);
				} else if (local39 == 1) {
					this.aClass173Array1[local33] = Static174.method1508(arg1);
				} else if (local39 == 2) {
					this.aClass173Array1[local33] = Static372.method6266(arg1);
				} else if (local39 == 3) {
					this.aClass173Array1[local33] = Static217.method3799(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean487 = arg1.method4815() == 1;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([[II)V")
	private void method6218(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static227.anInt4036;
		@Pc(9) int local9 = Static24.anInt638;
		Static37.method1133(arg0);
		Static19.method557(Static148.anInt2718, Static73.anInt1721);
		if (this.aClass173Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass173Array1.length; local28++) {
			@Pc(35) Class173 local35 = this.aClass173Array1[local28];
			@Pc(38) int local38 = local35.anInt6997;
			@Pc(41) int local41 = local35.anInt6996;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method6250(local9, local7);
				}
			} else if (local41 >= 0) {
				local35.method6251(local7, local9);
			} else {
				local35.method6248(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass158_41.method3996(arg0);
		if (super.aClass158_41.aBoolean265) {
			this.method6218(super.aClass158_41.method3998());
		}
		return local9;
	}
}
