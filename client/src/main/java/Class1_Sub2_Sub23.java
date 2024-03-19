import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class1_Sub2_Sub23 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
	private int anInt4677 = 12288;

	@OriginalMember(owner = "client!nh", name = "ab", descriptor = "I")
	private int anInt4685 = 2048;

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
	private int anInt4681 = 0;

	@OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
	private int anInt4682 = 0;

	@OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
	private int anInt4688 = 8192;

	@OriginalMember(owner = "client!nh", name = "ib", descriptor = "I")
	private int anInt4693 = 4096;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
	private int anInt4676 = 2048;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)Z")
	private boolean method4035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg0 - arg1) * this.anInt4677 >> 12;
		@Pc(22) int local22 = Static110.anIntArray232[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt4677;
		@Pc(36) int local36 = (local29 << 12) / this.anInt4688;
		@Pc(48) int local48 = local36 * this.anInt4693 >> 12;
		return arg1 + arg0 < local48 && -local48 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(21) int local21 = Static60.anIntArray455[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static64.anInt1755; local23++) {
				@Pc(31) int local31 = Static207.anIntArray360[local23] - 2048;
				@Pc(36) int local36 = this.anInt4676 + local31;
				@Pc(47) int local47 = local36 >= -2048 ? local36 : local36 + 4096;
				@Pc(56) int local56 = local47 > 2048 ? local47 - 4096 : local47;
				@Pc(62) int local62 = local21 + this.anInt4682;
				@Pc(73) int local73 = local62 < -2048 ? local62 + 4096 : local62;
				@Pc(84) int local84 = local73 <= 2048 ? local73 : local73 - 4096;
				@Pc(90) int local90 = local31 + this.anInt4681;
				@Pc(101) int local101 = local90 < -2048 ? local90 + 4096 : local90;
				@Pc(112) int local112 = local101 <= 2048 ? local101 : local101 - 4096;
				@Pc(117) int local117 = local21 + this.anInt4685;
				@Pc(126) int local126 = local117 < -2048 ? local117 + 4096 : local117;
				@Pc(137) int local137 = local126 > 2048 ? local126 - 4096 : local126;
				local11[local23] = this.method4035(local84, local56) || this.method4036(local112, local137) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)Z")
	private boolean method4036(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg0 + arg1) * this.anInt4677 >> 12;
		@Pc(22) int local22 = Static110.anIntArray232[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt4677;
		@Pc(36) int local36 = (local29 << 12) / this.anInt4688;
		@Pc(51) int local51 = this.anInt4693 * local36 >> 12;
		return arg1 - arg0 < local51 && arg1 - arg0 > -local51;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
	@Override
	public void method6090() {
		Static166.method3459();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt4676 = arg1.method5749();
		} else if (arg0 == 1) {
			this.anInt4682 = arg1.method5749();
		} else if (arg0 == 2) {
			this.anInt4681 = arg1.method5749();
		} else if (arg0 == 3) {
			this.anInt4685 = arg1.method5749();
		} else if (arg0 == 4) {
			this.anInt4677 = arg1.method5749();
		} else if (arg0 == 5) {
			this.anInt4693 = arg1.method5749();
		} else if (arg0 == 6) {
			this.anInt4688 = arg1.method5749();
		}
	}
}
