import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
	private int anInt2179 = 0;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
	private int anInt2183 = 4096;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[[I")
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
				@Pc(61) int local61 = local33[local51];
				@Pc(65) int local65 = local37[local51];
				if (this.anInt2179 > local57) {
					local41[local51] = this.anInt2179;
				} else if (this.anInt2183 < local57) {
					local41[local51] = this.anInt2183;
				} else {
					local41[local51] = local57;
				}
				if (local61 < this.anInt2179) {
					local45[local51] = this.anInt2179;
				} else if (this.anInt2183 < local61) {
					local45[local51] = this.anInt2183;
				} else {
					local45[local51] = local61;
				}
				if (this.anInt2179 > local65) {
					local49[local51] = this.anInt2179;
				} else if (local65 > this.anInt2183) {
					local49[local51] = this.anInt2183;
				} else {
					local49[local51] = local65;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(26) int[] local26 = this.method6078(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static64.anInt1755; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt2179) {
					local16[local28] = this.anInt2179;
				} else if (this.anInt2183 < local34) {
					local16[local28] = this.anInt2183;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt2179 = arg1.method5749();
		} else if (arg0 == 1) {
			this.anInt2183 = arg1.method5749();
		} else if (arg0 == 2) {
			super.aBoolean515 = arg1.method5761() == 1;
		}
	}
}
