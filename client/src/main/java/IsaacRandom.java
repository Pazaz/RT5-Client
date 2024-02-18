import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class IsaacRandom {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
	private int anInt4584;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
	private int anInt4585;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "[I")
	private int[] anIntArray357;

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
	private int anInt4588;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
	private int anInt4591;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V")
	private IsaacRandom() {
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "([I)V")
	public IsaacRandom(@OriginalArg(0) int[] arg0) {
		this.anIntArray356 = new int[256];
		this.anIntArray357 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray356[local13] = arg0[local13];
		}
		this.method4104();
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	private void method4104() {
		@Pc(6) int local6 = -1640531527;
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21;
		for (local21 = 0; local21 < 4; local21++) {
			local19 ^= local18 << 11;
			local18 += local16;
			local14 += local19;
			local18 ^= local16 >>> 2;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 << 8;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 << 10;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local19 += local10;
			local8 += local6;
			local8 ^= local6 << 8;
			local6 += local19;
			local18 += local8;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local19 += local18;
		}
		for (local21 = 0; local21 < 256; local21 += 8) {
			local8 += this.anIntArray356[local21 + 6];
			local10 += this.anIntArray356[local21 + 5];
			local19 += this.anIntArray356[local21];
			local14 += this.anIntArray356[local21 + 3];
			local12 += this.anIntArray356[local21 + 4];
			local6 += this.anIntArray356[local21 + 7];
			local18 += this.anIntArray356[local21 + 1];
			local16 += this.anIntArray356[local21 + 2];
			local19 ^= local18 << 11;
			local14 += local19;
			local18 += local16;
			local18 ^= local16 >>> 2;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 >>> 16;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 << 10;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local19 += local10;
			local8 += local6;
			local8 ^= local6 << 8;
			local18 += local8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local19 += local18;
			local16 += local6;
			this.anIntArray357[local21] = local19;
			this.anIntArray357[local21 + 1] = local18;
			this.anIntArray357[local21 + 2] = local16;
			this.anIntArray357[local21 + 3] = local14;
			this.anIntArray357[local21 + 4] = local12;
			this.anIntArray357[local21 + 5] = local10;
			this.anIntArray357[local21 + 6] = local8;
			this.anIntArray357[local21 + 7] = local6;
		}
		for (local21 = 0; local21 < 256; local21 += 8) {
			local6 += this.anIntArray357[local21 + 7];
			local18 += this.anIntArray357[local21 + 1];
			local12 += this.anIntArray357[local21 + 4];
			local14 += this.anIntArray357[local21 + 3];
			local16 += this.anIntArray357[local21 + 2];
			local8 += this.anIntArray357[local21 + 6];
			local10 += this.anIntArray357[local21 + 5];
			local19 += this.anIntArray357[local21];
			local19 ^= local18 << 11;
			local14 += local19;
			local18 += local16;
			local18 ^= local16 >>> 2;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 << 8;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 << 10;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local8 += local6;
			local19 += local10;
			local8 ^= local6 << 8;
			local6 += local19;
			local18 += local8;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local19 += local18;
			this.anIntArray357[local21] = local19;
			this.anIntArray357[local21 + 1] = local18;
			this.anIntArray357[local21 + 2] = local16;
			this.anIntArray357[local21 + 3] = local14;
			this.anIntArray357[local21 + 4] = local12;
			this.anIntArray357[local21 + 5] = local10;
			this.anIntArray357[local21 + 6] = local8;
			this.anIntArray357[local21 + 7] = local6;
		}
		this.method4106();
		this.anInt4585 = 256;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)I")
	public int nextInt() {
		if (this.anInt4585 == 0) {
			this.method4106();
			this.anInt4585 = 256;
		}
		return this.anIntArray356[--this.anInt4585];
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
	private void method4106() {
		this.anInt4584 += ++this.anInt4591;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(31) int local31 = this.anIntArray357[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt4588 ^= this.anInt4588 << 13;
				} else {
					this.anInt4588 ^= this.anInt4588 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt4588 ^= this.anInt4588 << 2;
			} else {
				this.anInt4588 ^= this.anInt4588 >>> 16;
			}
			this.anInt4588 += this.anIntArray357[local25 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray357[local25] = local122 = this.anInt4584 + this.anIntArray357[local31 >> 2 & 0xFF] + this.anInt4588;
			this.anIntArray356[local25] = this.anInt4584 = this.anIntArray357[local122 >> 8 >> 2 & 0xFF] + local31;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)I")
	public int peekNext() {
		if (this.anInt4585 == 0) {
			this.method4106();
			this.anInt4585 = 256;
		}
		return this.anIntArray356[this.anInt4585 - 1];
	}
}
