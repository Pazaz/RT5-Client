import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class1_Sub2_Sub24 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nj", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!nj", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!nj", name = "cb", descriptor = "I")
	private int anInt4732;

	@OriginalMember(owner = "client!nj", name = "ib", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!nj", name = "kb", descriptor = "I")
	private int anInt4738;

	@OriginalMember(owner = "client!nj", name = "nb", descriptor = "I")
	private int anInt4740;

	@OriginalMember(owner = "client!nj", name = "V", descriptor = "I")
	private int anInt4727 = 8;

	@OriginalMember(owner = "client!nj", name = "ab", descriptor = "I")
	private int anInt4730 = 1024;

	@OriginalMember(owner = "client!nj", name = "gb", descriptor = "I")
	private int anInt4736 = 409;

	@OriginalMember(owner = "client!nj", name = "fb", descriptor = "I")
	private int anInt4735 = 204;

	@OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
	private int anInt4724 = 1024;

	@OriginalMember(owner = "client!nj", name = "mb", descriptor = "I")
	private int anInt4739 = 4;

	@OriginalMember(owner = "client!nj", name = "eb", descriptor = "I")
	private int anInt4734 = 0;

	@OriginalMember(owner = "client!nj", name = "db", descriptor = "I")
	private int anInt4733 = 81;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
	@Override
	public void method6090() {
		this.method4066();
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V")
	private void method4066() {
		@Pc(12) Random local12 = new Random((long) this.anInt4727);
		this.anInt4740 = 4096 / this.anInt4727;
		this.anInt4732 = this.anInt4733 / 2;
		this.anInt4738 = 4096 / this.anInt4739;
		@Pc(35) int local35 = this.anInt4738 / 2;
		this.anIntArrayArray32 = new int[this.anInt4727][this.anInt4739 + 1];
		this.anIntArray356 = new int[this.anInt4727 + 1];
		this.anIntArrayArray33 = new int[this.anInt4727][this.anInt4739];
		@Pc(63) int local63 = this.anInt4740 / 2;
		this.anIntArray356[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt4727; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt4740;
				local92 = (Static228.method4354(local12, 4096) - 2048) * this.anInt4735 >> 12;
				@Pc(100) int local100 = local80 + (local92 * local63 >> 12);
				this.anIntArray356[local70] = this.anIntArray356[local70 - 1] + local100;
			}
			this.anIntArrayArray32[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt4739; local80++) {
				if (local80 > 0) {
					local92 = this.anInt4738;
					@Pc(143) int local143 = (Static228.method4354(local12, 4096) - 2048) * this.anInt4736 >> 12;
					local92 += local143 * local35 >> 12;
					this.anIntArrayArray32[local70][local80] = local92 + this.anIntArrayArray32[local70][local80 - 1];
				}
				this.anIntArrayArray33[local70][local80] = this.anInt4724 <= 0 ? 4096 : 4096 - Static228.method4354(local12, this.anInt4724);
			}
			this.anIntArrayArray32[local70][this.anInt4739] = 4096;
		}
		this.anIntArray356[this.anInt4727] = 4096;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt4739 = arg1.method5761();
		} else if (arg0 == 1) {
			this.anInt4727 = arg1.method5761();
		} else if (arg0 == 2) {
			this.anInt4736 = arg1.method5749();
		} else if (arg0 == 3) {
			this.anInt4735 = arg1.method5749();
		} else if (arg0 == 4) {
			this.anInt4730 = arg1.method5749();
		} else if (arg0 == 5) {
			this.anInt4734 = arg1.method5749();
		} else if (arg0 == 6) {
			this.anInt4733 = arg1.method5749();
		} else if (arg0 == 7) {
			this.anInt4724 = arg1.method5749();
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(22) int local22 = 0;
			@Pc(30) int local30;
			for (local30 = Static60.anIntArray455[arg0] + this.anInt4734; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt4727 > local22 && this.anIntArray356[local22] <= local30) {
				local22++;
			}
			@Pc(65) int local65 = local22 - 1;
			@Pc(76) boolean local76 = (local22 & 0x1) == 0;
			@Pc(81) int local81 = this.anIntArray356[local22];
			@Pc(88) int local88 = this.anIntArray356[local22 - 1];
			if (local30 > local88 + this.anInt4732 && local81 - this.anInt4732 > local30) {
				for (@Pc(108) int local108 = 0; local108 < Static64.anInt1755; local108++) {
					@Pc(112) int local112 = 0;
					@Pc(121) int local121 = local76 ? this.anInt4730 : -this.anInt4730;
					@Pc(132) int local132;
					for (local132 = Static207.anIntArray360[local108] + (this.anInt4738 * local121 >> 12); local132 < 0; local132 += 4096) {
					}
					while (local132 > 4096) {
						local132 -= 4096;
					}
					while (local112 < this.anInt4739 && this.anIntArrayArray32[local65][local112] <= local132) {
						local112++;
					}
					@Pc(168) int local168 = local112 - 1;
					@Pc(175) int local175 = this.anIntArrayArray32[local65][local168];
					@Pc(182) int local182 = this.anIntArrayArray32[local65][local112];
					if (local132 > this.anInt4732 + local175 && local182 - this.anInt4732 > local132) {
						local11[local108] = this.anIntArrayArray33[local65][local168];
					} else {
						local11[local108] = 0;
					}
				}
			} else {
				Static360.method2012(local11, 0, Static64.anInt1755, 0);
			}
		}
		return local11;
	}
}
