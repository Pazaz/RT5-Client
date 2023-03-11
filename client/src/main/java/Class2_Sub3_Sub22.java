import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class2_Sub3_Sub22 extends Class2_Sub3 {

	@OriginalMember(owner = "client!na", name = "P", descriptor = "I")
	private int anInt4013 = 4096;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "I")
	private int anInt4011 = 4096;

	@OriginalMember(owner = "client!na", name = "W", descriptor = "I")
	private int anInt4019 = 4096;

	static {
		new Class79("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt4019 = arg1.method4829();
		} else if (arg0 == 1) {
			this.anInt4011 = arg1.method4829();
		} else if (arg0 == 2) {
			this.anInt4013 = arg1.method4829();
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6479(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass243_41.method6277(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(27) int[][] local27 = this.method6483(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static227.anInt4036; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local63 == local59 && local67 == local63) {
					local43[local53] = local59 * this.anInt4019 >> 12;
					local47[local53] = this.anInt4011 * local63 >> 12;
					local51[local53] = this.anInt4013 * local67 >> 12;
				} else {
					local43[local53] = this.anInt4019;
					local47[local53] = this.anInt4011;
					local51[local53] = this.anInt4013;
				}
			}
		}
		return local17;
	}
}
