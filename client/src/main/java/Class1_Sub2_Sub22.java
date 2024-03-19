import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			super.aBoolean515 = arg1.method5761() == 1;
		}
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(26) int[] local26 = this.method6078(0, arg0);
			@Pc(32) int[] local32 = this.method6078(1, arg0);
			@Pc(38) int[] local38 = this.method6078(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static64.anInt1755; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local11[local40] = local26[local40];
				} else if (local46 == 0) {
					local11[local40] = local32[local40];
				} else {
					local11[local40] = local26[local40] * local46 + (4096 - local46) * local32[local40] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(25) int[] local25 = this.method6078(2, arg0);
			@Pc(31) int[][] local31 = this.method6082(0, arg0);
			@Pc(37) int[][] local37 = this.method6082(1, arg0);
			@Pc(41) int[] local41 = local15[0];
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			@Pc(53) int[] local53 = local31[0];
			@Pc(57) int[] local57 = local31[1];
			@Pc(61) int[] local61 = local31[2];
			@Pc(65) int[] local65 = local37[0];
			@Pc(69) int[] local69 = local37[1];
			@Pc(73) int[] local73 = local37[2];
			for (@Pc(75) int local75 = 0; local75 < Static64.anInt1755; local75++) {
				@Pc(81) int local81 = local25[local75];
				if (local81 == 4096) {
					local41[local75] = local53[local75];
					local45[local75] = local57[local75];
					local49[local75] = local61[local75];
				} else if (local81 == 0) {
					local41[local75] = local65[local75];
					local45[local75] = local69[local75];
					local49[local75] = local73[local75];
				} else {
					@Pc(114) int local114 = 4096 - local81;
					local41[local75] = local114 * local65[local75] + local53[local75] * local81 >> 12;
					local45[local75] = local69[local75] * local114 + local57[local75] * local81 >> 12;
					local49[local75] = local61[local75] * local81 + local114 * local73[local75] >> 12;
				}
			}
		}
		return local15;
	}
}
