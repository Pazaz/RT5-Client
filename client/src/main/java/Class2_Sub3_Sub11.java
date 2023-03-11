import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class2_Sub3_Sub11 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ft", name = "P", descriptor = "I")
	private int anInt2179 = 20;

	@OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
	private int anInt2178 = 1365;

	@OriginalMember(owner = "client!ft", name = "W", descriptor = "I")
	private int anInt2184 = 0;

	@OriginalMember(owner = "client!ft", name = "T", descriptor = "I")
	private int anInt2182 = 0;

	static {
		new Class79("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass158_41.method3996(arg0);
		if (super.aClass158_41.aBoolean265) {
			for (@Pc(22) int local22 = 0; local22 < Static227.anInt4036; local22++) {
				@Pc(36) int local36 = this.anInt2184 + (Static334.anIntArray424[local22] << 12) / this.anInt2178;
				@Pc(48) int local48 = (Static16.anIntArray322[arg0] << 12) / this.anInt2178 + this.anInt2182;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local68 + local62 < 16384 && this.anInt2179 > local70) {
					local56 = local48 + (local56 * local54 >> 12) * 2;
					local54 = local62 + local36 - local68;
					local68 = local56 * local56 >> 12;
					local70++;
					local62 = local54 * local54 >> 12;
				}
				local16[local22] = local70 < this.anInt2179 - 1 ? (local70 << 12) / this.anInt2179 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt2178 = arg1.method4829();
		} else if (arg0 == 1) {
			this.anInt2179 = arg1.method4829();
		} else if (arg0 == 2) {
			this.anInt2184 = arg1.method4829();
		} else if (arg0 == 3) {
			this.anInt2182 = arg1.method4829();
		}
	}
}
