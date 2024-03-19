import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
	private int anInt1093 = 0;

	@OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
	private int anInt1098 = 20;

	@OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
	private int anInt1095 = 1365;

	@OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
	private int anInt1096 = 0;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt1095 = arg1.method5749();
		} else if (arg0 == 1) {
			this.anInt1098 = arg1.method5749();
		} else if (arg0 == 2) {
			this.anInt1093 = arg1.method5749();
		} else if (arg0 == 3) {
			this.anInt1096 = arg1.method5749();
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			for (@Pc(22) int local22 = 0; local22 < Static64.anInt1755; local22++) {
				@Pc(36) int local36 = (Static207.anIntArray360[local22] << 12) / this.anInt1095 + this.anInt1093;
				@Pc(48) int local48 = this.anInt1096 + (Static60.anIntArray455[arg0] << 12) / this.anInt1095;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70;
				for (local70 = 0; local68 + local62 < 16384 && local70 < this.anInt1098; local70++) {
					local56 = (local56 * local54 >> 12) * 2 + local48;
					local54 = local62 + local36 - local68;
					local68 = local56 * local56 >> 12;
					local62 = local54 * local54 >> 12;
				}
				local11[local22] = local70 < this.anInt1098 - 1 ? (local70 << 12) / this.anInt1098 : 0;
			}
		}
		return local11;
	}
}
