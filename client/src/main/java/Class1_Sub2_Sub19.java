import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jh", name = "Y", descriptor = "Z")
	private boolean aBoolean244 = true;

	@OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
	private int anInt3510 = 4096;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(31) int[] local31 = this.method6078(0, Static128.anInt3242 & arg0 - 1);
			@Pc(37) int[] local37 = this.method6078(0, arg0);
			@Pc(47) int[] local47 = this.method6078(0, arg0 + 1 & Static128.anInt3242);
			@Pc(51) int[] local51 = local17[0];
			@Pc(55) int[] local55 = local17[1];
			@Pc(59) int[] local59 = local17[2];
			for (@Pc(61) int local61 = 0; local61 < Static64.anInt1755; local61++) {
				@Pc(75) int local75 = this.anInt3510 * (local47[local61] - local31[local61]);
				@Pc(95) int local95 = this.anInt3510 * (local37[Static145.anInt3608 & local61 + 1] - local37[local61 - 1 & Static145.anInt3608]);
				@Pc(99) int local99 = local95 >> 12;
				@Pc(103) int local103 = local75 >> 12;
				@Pc(109) int local109 = local99 * local99 >> 12;
				@Pc(115) int local115 = local103 * local103 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local109 + local115 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(143) int local143;
				@Pc(135) int local135;
				@Pc(139) int local139;
				if (local129 == 0) {
					local135 = 0;
					local143 = 0;
					local139 = 0;
				} else {
					local135 = local75 / local129;
					local139 = 16777216 / local129;
					local143 = local95 / local129;
				}
				if (this.aBoolean244) {
					local139 = (local139 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
				}
				local51[local61] = local143;
				local55[local61] = local135;
				local59[local61] = local139;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt3510 = arg1.method5749();
		} else if (arg0 == 1) {
			this.aBoolean244 = arg1.method5761() == 1;
		}
	}
}
