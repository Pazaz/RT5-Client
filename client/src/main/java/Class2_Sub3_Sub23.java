import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class2_Sub3_Sub23 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
	private int anInt4831;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
	private int anInt4832;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
	private int anInt4835;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
	private Class2_Sub3_Sub23(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4466(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub23() {
		this(0);
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(IB)V")
	private void method4466(@OriginalArg(0) int arg0) {
		this.anInt4835 = (arg0 & 0xFF) << 4;
		this.anInt4831 = arg0 >> 4 & 0xFF0;
		this.anInt4832 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6479(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6277(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static227.anInt4036; local37++) {
				local27[local37] = this.anInt4832;
				local31[local37] = this.anInt4831;
				local35[local37] = this.anInt4835;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.method4466(arg1.ig3());
		}
	}
}
