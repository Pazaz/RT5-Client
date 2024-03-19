import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class1_Sub2_Sub39 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
	private int anInt7276 = 4096;

	@OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
	private int anInt7278 = 4096;

	@OriginalMember(owner = "client!wf", name = "Z", descriptor = "I")
	private int anInt7280 = 4096;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(25) int[][] local25 = this.method6082(0, arg0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local15[0];
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			for (@Pc(51) int local51 = 0; local51 < Static64.anInt1755; local51++) {
				@Pc(57) int local57 = local29[local51];
				@Pc(61) int local61 = local37[local51];
				@Pc(65) int local65 = local33[local51];
				if (local61 == local57 && local61 == local65) {
					local41[local51] = this.anInt7276 * local57 >> 12;
					local45[local51] = local61 * this.anInt7280 >> 12;
					local49[local51] = local65 * this.anInt7278 >> 12;
				} else {
					local41[local51] = this.anInt7276;
					local45[local51] = this.anInt7280;
					local49[local51] = this.anInt7278;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt7276 = arg1.method5749();
		} else if (arg0 == 1) {
			this.anInt7280 = arg1.method5749();
		} else if (arg0 == 2) {
			this.anInt7278 = arg1.method5749();
		}
	}
}
