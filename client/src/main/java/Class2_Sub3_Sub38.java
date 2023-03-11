import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class2_Sub3_Sub38 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vn", name = "S", descriptor = "I")
	private int anInt6990 = 4;

	@OriginalMember(owner = "client!vn", name = "T", descriptor = "I")
	private int anInt6991 = 4;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6479(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6277(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(25) int local25 = Static227.anInt4036 / this.anInt6991;
			@Pc(30) int local30 = Static24.anInt638 / this.anInt6990;
			@Pc(49) int[][] local49;
			if (local30 > 0) {
				@Pc(39) int local39 = arg0 % local30;
				local49 = this.method6483(0, Static24.anInt638 * local39 / local30);
			} else {
				local49 = this.method6483(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static227.anInt4036; local83++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local25;
					local89 = Static227.anInt4036 * local95 / local25;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3996(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(28) int local28 = Static227.anInt4036 / this.anInt6991;
			@Pc(33) int local33 = Static24.anInt638 / this.anInt6990;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local33 > 0) {
				local39 = arg0 % local33;
				local49 = this.method6473(0, local39 * Static24.anInt638 / local33);
			} else {
				local49 = this.method6473(0, 0);
			}
			for (local39 = 0; local39 < Static227.anInt4036; local39++) {
				if (local28 > 0) {
					@Pc(67) int local67 = local39 % local28;
					local11[local39] = local49[local67 * Static227.anInt4036 / local28];
				} else {
					local11[local39] = local49[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt6991 = arg1.method4815();
		} else if (arg0 == 1) {
			this.anInt6990 = arg1.method4815();
		}
	}
}
