import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class IsaacRandom {

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "[I")
	private final int[] mem = new int[256];

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	private int a;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
	private int b;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "[I")
	private final int[] rsl = new int[256];

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
	private int c;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
	private int count;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "([I)V")
	public IsaacRandom(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.rsl[local13] = arg0[local13];
		}
		this.method5537();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I")
	public int peekNext() {
		if (this.count == 0) {
			this.isaac();
			this.count = 256;
		}
		return this.rsl[this.count - 1];
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)I")
	public int getNext() {
		if (this.count == 0) {
			this.isaac();
			this.count = 256;
		}
//		this.count--;
		return this.rsl[--this.count];
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
	private void method5537() {
		@Pc(15) int local15 = -1640531527;
		@Pc(17) int local17 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(27) int local27 = -1640531527;
		@Pc(28) int local28 = -1640531527;
		@Pc(30) int local30;
		for (local30 = 0; local30 < 4; local30++) {
			local28 ^= local27 << 11;
			local27 += local25;
			local23 += local28;
			local27 ^= local25 >>> 2;
			local25 += local23;
			local21 += local27;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local15 += local28;
			local27 += local17;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local17 += this.rsl[local30 + 6];
			local21 += this.rsl[local30 + 4];
			local15 += this.rsl[local30 + 7];
			local19 += this.rsl[local30 + 5];
			local23 += this.rsl[local30 + 3];
			local27 += this.rsl[local30 + 1];
			local25 += this.rsl[local30 + 2];
			local28 += this.rsl[local30];
			local28 ^= local27 << 11;
			local23 += local28;
			local27 += local25;
			local27 ^= local25 >>> 2;
			local25 += local23;
			local21 += local27;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local17 += local15;
			local28 += local19;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
			this.mem[local30] = local28;
			this.mem[local30 + 1] = local27;
			this.mem[local30 + 2] = local25;
			this.mem[local30 + 3] = local23;
			this.mem[local30 + 4] = local21;
			this.mem[local30 + 5] = local19;
			this.mem[local30 + 6] = local17;
			this.mem[local30 + 7] = local15;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local15 += this.mem[local30 + 7];
			local28 += this.mem[local30];
			local19 += this.mem[local30 + 5];
			local21 += this.mem[local30 + 4];
			local27 += this.mem[local30 + 1];
			local17 += this.mem[local30 + 6];
			local23 += this.mem[local30 + 3];
			local25 += this.mem[local30 + 2];
			local28 ^= local27 << 11;
			local27 += local25;
			local23 += local28;
			local27 ^= local25 >>> 2;
			local25 += local23;
			local21 += local27;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local28 += local27;
			local25 += local15;
			this.mem[local30] = local28;
			this.mem[local30 + 1] = local27;
			this.mem[local30 + 2] = local25;
			this.mem[local30 + 3] = local23;
			this.mem[local30 + 4] = local21;
			this.mem[local30 + 5] = local19;
			this.mem[local30 + 6] = local17;
			this.mem[local30 + 7] = local15;
		}
		this.isaac();
		this.count = 256;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
	private void isaac() {
		this.b += ++this.c;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(29) int local29 = this.mem[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.a ^= this.a << 13;
				} else {
					this.a ^= this.a >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.a ^= this.a << 2;
			} else {
				this.a ^= this.a >>> 16;
			}
			this.a += this.mem[local23 + 128 & 0xFF];
			@Pc(116) int local116;
			this.mem[local23] = local116 = this.b + this.mem[local29 >> 2 & 0xFF] + this.a;
			this.rsl[local23] = this.b = this.mem[local116 >> 8 >> 2 & 0xFF] + local29;
		}
	}
}
