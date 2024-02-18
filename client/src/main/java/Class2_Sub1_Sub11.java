import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!in", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray109;

	@OriginalMember(owner = "client!in", name = "L", descriptor = "I")
	private int anInt4529;

	@OriginalMember(owner = "client!in", name = "S", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!in", name = "ab", descriptor = "I")
	private int anInt4533;

	@OriginalMember(owner = "client!in", name = "Z", descriptor = "I")
	private int anInt4538;

	@OriginalMember(owner = "client!in", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray110;

	@OriginalMember(owner = "client!in", name = "F", descriptor = "I")
	private int anInt4525 = 204;

	@OriginalMember(owner = "client!in", name = "V", descriptor = "I")
	private int anInt4535 = 1024;

	@OriginalMember(owner = "client!in", name = "db", descriptor = "I")
	private int anInt4528 = 81;

	@OriginalMember(owner = "client!in", name = "G", descriptor = "I")
	private int anInt4532 = 1024;

	@OriginalMember(owner = "client!in", name = "P", descriptor = "I")
	private int anInt4531 = 0;

	@OriginalMember(owner = "client!in", name = "X", descriptor = "I")
	private int anInt4527 = 8;

	@OriginalMember(owner = "client!in", name = "bb", descriptor = "I")
	private int anInt4539 = 409;

	@OriginalMember(owner = "client!in", name = "H", descriptor = "I")
	private int anInt4540 = 4;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!in", name = "g", descriptor = "(I)V")
	private void method4069(@OriginalArg(0) int arg0) {
		@Pc(12) Random local12 = new Random((long) this.anInt4527);
		this.anInt4529 = 4096 / this.anInt4540;
		this.anInt4538 = 4096 / this.anInt4527;
		this.anInt4533 = this.anInt4528 / 2;
		@Pc(35) int local35 = this.anInt4529 / 2;
		this.anIntArrayArray109 = new int[this.anInt4527][this.anInt4540 + 1];
		if (arg0 != 25428) {
			Static278.anIntArray351 = null;
		}
		this.anIntArray349 = new int[this.anInt4527 + 1];
		@Pc(63) int local63 = this.anInt4538 / 2;
		this.anIntArrayArray110 = new int[this.anInt4527][this.anInt4540];
		this.anIntArray349[0] = 0;
		for (@Pc(77) int local77 = 0; local77 < this.anInt4527; local77++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local77 > 0) {
				local86 = this.anInt4538;
				local98 = (Static623.method8326(-5208, 4096, local12) - 2048) * this.anInt4525 >> 12;
				@Pc(106) int local106 = local86 + (local98 * local63 >> 12);
				this.anIntArray349[local77] = this.anIntArray349[local77 - 1] + local106;
			}
			this.anIntArrayArray109[local77][0] = 0;
			for (local86 = 0; local86 < this.anInt4540; local86++) {
				if (local86 > 0) {
					local98 = this.anInt4529;
					@Pc(152) int local152 = (Static623.method8326(-5208, 4096, local12) - 2048) * this.anInt4539 >> 12;
					local98 += local35 * local152 >> 12;
					this.anIntArrayArray109[local77][local86] = local98 + this.anIntArrayArray109[local77][local86 - 1];
				}
				this.anIntArrayArray110[local77][local86] = this.anInt4532 > 0 ? 4096 - Static623.method8326(arg0 ^ 0xFFFF88FC, this.anInt4532, local12) : 4096;
			}
			this.anIntArrayArray109[local77][this.anInt4540] = 4096;
		}
		this.anIntArray349[this.anInt4527] = 4096;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt4540 = arg1.g1();
		} else if (arg2 == 1) {
			this.anInt4527 = arg1.g1();
		} else if (arg2 == 2) {
			this.anInt4539 = arg1.g2();
		} else if (arg2 == 3) {
			this.anInt4525 = arg1.g2();
		} else if (arg2 == 4) {
			this.anInt4535 = arg1.g2();
		} else if (arg2 == 5) {
			this.anInt4531 = arg1.g2();
		} else if (arg2 == 6) {
			this.anInt4528 = arg1.g2();
		} else if (arg2 == 7) {
			this.anInt4532 = arg1.g2();
		}
		if (arg0) {
			Static278.aClass345_57 = null;
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
	@Override
	public void method9421(@OriginalArg(0) int arg0) {
		if (arg0 != 7) {
			this.method9416(true, (Packet) null, 83);
		}
		this.method4069(arg0 + 25421);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 107) {
			Static278.anIntArray350 = null;
		}
		@Pc(18) int[] local18 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(24) int local24 = 0;
			@Pc(31) int local31;
			for (local31 = this.anInt4531 + Static273.anIntArray341[arg1]; local31 < 0; local31 += 4096) {
			}
			while (local31 > 4096) {
				local31 -= 4096;
			}
			while (local24 < this.anInt4527 && this.anIntArray349[local24] <= local31) {
				local24++;
			}
			@Pc(79) int local79 = local24 - 1;
			@Pc(90) boolean local90 = (local24 & 0x1) == 0;
			@Pc(95) int local95 = this.anIntArray349[local24];
			@Pc(102) int local102 = this.anIntArray349[local24 - 1];
			if (this.anInt4533 + local102 < local31 && local31 < local95 - this.anInt4533) {
				for (@Pc(123) int local123 = 0; local123 < Static608.anInt9289; local123++) {
					@Pc(127) int local127 = 0;
					@Pc(137) int local137 = local90 ? this.anInt4535 : -this.anInt4535;
					@Pc(148) int local148;
					for (local148 = Static54.anIntArray92[local123] + (local137 * this.anInt4529 >> 12); local148 < 0; local148 += 4096) {
					}
					while (local148 > 4096) {
						local148 -= 4096;
					}
					while (local127 < this.anInt4540 && this.anIntArrayArray109[local79][local127] <= local148) {
						local127++;
					}
					@Pc(199) int local199 = local127 - 1;
					@Pc(206) int local206 = this.anIntArrayArray109[local79][local127];
					@Pc(213) int local213 = this.anIntArrayArray109[local79][local199];
					if (local148 > this.anInt4533 + local213 && local148 < local206 - this.anInt4533) {
						local18[local123] = this.anIntArrayArray110[local79][local199];
					} else {
						local18[local123] = 0;
					}
				}
			} else {
				Static734.method7690(local18, 0, Static608.anInt9289, 0);
			}
		}
		return local18;
	}
}
