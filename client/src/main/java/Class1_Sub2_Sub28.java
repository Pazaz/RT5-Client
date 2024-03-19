import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class1_Sub2_Sub28 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pl", name = "T", descriptor = "Z")
	private boolean aBoolean366 = true;

	@OriginalMember(owner = "client!pl", name = "X", descriptor = "Z")
	private boolean aBoolean368 = true;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(32) int[][] local32 = this.method6082(0, this.aBoolean368 ? Static128.anInt3242 - arg0 : arg0);
			@Pc(36) int[] local36 = local32[0];
			@Pc(40) int[] local40 = local32[1];
			@Pc(44) int[] local44 = local32[2];
			@Pc(48) int[] local48 = local15[0];
			@Pc(52) int[] local52 = local15[1];
			@Pc(56) int[] local56 = local15[2];
			@Pc(61) int local61;
			if (this.aBoolean366) {
				for (local61 = 0; local61 < Static64.anInt1755; local61++) {
					local48[local61] = local36[Static145.anInt3608 - local61];
					local52[local61] = local40[Static145.anInt3608 - local61];
					local56[local61] = local44[Static145.anInt3608 - local61];
				}
			} else {
				for (local61 = 0; local61 < Static64.anInt1755; local61++) {
					local48[local61] = local36[local61];
					local52[local61] = local40[local61];
					local56[local61] = local44[local61];
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.aBoolean366 = arg1.method5761() == 1;
		} else if (arg0 == 1) {
			this.aBoolean368 = arg1.method5761() == 1;
		} else if (arg0 == 2) {
			super.aBoolean515 = arg1.method5761() == 1;
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(37) int[] local37 = this.method6078(0, this.aBoolean368 ? Static128.anInt3242 - arg0 : arg0);
			if (this.aBoolean366) {
				for (@Pc(42) int local42 = 0; local42 < Static64.anInt1755; local42++) {
					local19[local42] = local37[Static145.anInt3608 - local42];
				}
			} else {
				Static360.method2018(local37, 0, local19, 0, Static64.anInt1755);
			}
		}
		return local19;
	}
}
