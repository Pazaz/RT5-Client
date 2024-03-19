import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!er", name = "T", descriptor = "I")
	private int anInt2034;

	@OriginalMember(owner = "client!er", name = "V", descriptor = "I")
	private int anInt2036;

	@OriginalMember(owner = "client!er", name = "Z", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!er", name = "gb", descriptor = "I")
	private int anInt2045 = -1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt2045 = arg1.method5749();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V")
	@Override
	public void method6080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method6080(arg0, arg1);
		if (this.anInt2045 >= 0) {
			@Pc(30) int local30 = Static95.anInterface4_3.method165(this.anInt2045).aBoolean112 ? 64 : 128;
			this.anIntArray130 = Static95.anInterface4_3.method169(1.0F, local30, this.anInt2045, local30, false);
			this.anInt2034 = local30;
			this.anInt2036 = local30;
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)I")
	@Override
	public int method6073() {
		return this.anInt2045;
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
	@Override
	public void method6079() {
		super.method6079();
		this.anIntArray130 = null;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(42) int local42 = (this.anInt2034 == Static53.anInt1598 ? arg0 : this.anInt2034 * arg0 / Static53.anInt1598) * this.anInt2036;
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local11[2];
			@Pc(64) int local64;
			@Pc(72) int local72;
			if (this.anInt2036 == Static64.anInt1755) {
				for (local64 = 0; local64 < Static64.anInt1755; local64++) {
					local72 = this.anIntArray130[local42++];
					local54[local64] = (local72 & 0xFF) << 4;
					local50[local64] = local72 >> 4 & 0xFF0;
					local46[local64] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static64.anInt1755; local64++) {
					local72 = local64 * this.anInt2036 / Static64.anInt1755;
					@Pc(120) int local120 = this.anIntArray130[local72 + local42];
					local54[local64] = (local120 & 0xFF) << 4;
					local50[local64] = local120 >> 4 & 0xFF0;
					local46[local64] = local120 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
