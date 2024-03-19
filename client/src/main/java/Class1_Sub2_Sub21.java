import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
	private int anInt3849 = 3072;

	@OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
	private int anInt3848 = 2048;

	@OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
	private int anInt3857 = 1024;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt3857 = arg1.method5749();
		} else if (arg0 == 1) {
			this.anInt3849 = arg1.method5749();
		} else if (arg0 == 2) {
			super.aBoolean515 = arg1.method5761() == 1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
	@Override
	public void method6090() {
		this.anInt3848 = this.anInt3849 - this.anInt3857;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(28) int[][] local28 = this.method6082(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static64.anInt1755; local54++) {
				local44[local54] = (this.anInt3848 * local32[local54] >> 12) + this.anInt3857;
				local48[local54] = this.anInt3857 + (local36[local54] * this.anInt3848 >> 12);
				local52[local54] = this.anInt3857 + (this.anInt3848 * local40[local54] >> 12);
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(26) int[] local26 = this.method6078(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static64.anInt1755; local28++) {
				local11[local28] = this.anInt3857 + (this.anInt3848 * local26[local28] >> 12);
			}
		}
		return local11;
	}
}
