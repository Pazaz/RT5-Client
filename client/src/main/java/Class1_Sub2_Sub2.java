import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
	private int anInt635 = 4;

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
	private int anInt625 = 4;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(28) int local28 = Static64.anInt1755 / this.anInt625;
			@Pc(33) int local33 = Static53.anInt1598 / this.anInt635;
			@Pc(44) int[] local44;
			@Pc(50) int local50;
			if (local33 <= 0) {
				local44 = this.method6078(0, 0);
			} else {
				local50 = arg0 % local33;
				local44 = this.method6078(0, local50 * Static53.anInt1598 / local33);
			}
			for (local50 = 0; local50 < Static64.anInt1755; local50++) {
				if (local28 > 0) {
					@Pc(73) int local73 = local50 % local28;
					local19[local50] = local44[local73 * Static64.anInt1755 / local28];
				} else {
					local19[local50] = local44[0];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(20) int local20 = Static64.anInt1755 / this.anInt625;
			@Pc(25) int local25 = Static53.anInt1598 / this.anInt635;
			@Pc(36) int[][] local36;
			if (local25 <= 0) {
				local36 = this.method6082(0, 0);
			} else {
				@Pc(42) int local42 = arg0 % local25;
				local36 = this.method6082(0, Static53.anInt1598 * local42 / local25);
			}
			@Pc(56) int[] local56 = local36[0];
			@Pc(60) int[] local60 = local36[1];
			@Pc(64) int[] local64 = local36[2];
			@Pc(68) int[] local68 = local11[0];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static64.anInt1755; local78++) {
				@Pc(92) int local92;
				if (local20 > 0) {
					@Pc(86) int local86 = local78 % local20;
					local92 = local86 * Static64.anInt1755 / local20;
				} else {
					local92 = 0;
				}
				local68[local78] = local56[local92];
				local72[local78] = local60[local92];
				local76[local78] = local64[local92];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt625 = arg1.method5761();
		} else if (arg0 == 1) {
			this.anInt635 = arg1.method5761();
		}
	}
}
