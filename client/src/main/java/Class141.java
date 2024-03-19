import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class141 {

	@OriginalMember(owner = "client!om", name = "c", descriptor = "I")
	private int anInt4993;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "I")
	private int anInt4996;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "[I")
	private int[] anIntArray367;

	@OriginalMember(owner = "client!om", name = "l", descriptor = "[I")
	private int[] anIntArray368;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "I")
	private int anInt4998;

	@OriginalMember(owner = "client!om", name = "o", descriptor = "I")
	private int anInt4999;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	private Class141() {
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "([I)V")
	public Class141(@OriginalArg(0) int[] arg0) {
		this.anIntArray367 = new int[256];
		this.anIntArray368 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray367[local13] = arg0[local13];
		}
		this.method4290();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	private void method4290() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23;
		for (local23 = 0; local23 < 4; local23++) {
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray367[local23 + 3];
			local10 += this.anIntArray367[local23 + 6];
			local14 += this.anIntArray367[local23 + 4];
			local12 += this.anIntArray367[local23 + 5];
			local8 += this.anIntArray367[local23 + 7];
			local18 += this.anIntArray367[local23 + 2];
			local21 += this.anIntArray367[local23];
			local20 += this.anIntArray367[local23 + 1];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray368[local23] = local21;
			this.anIntArray368[local23 + 1] = local20;
			this.anIntArray368[local23 + 2] = local18;
			this.anIntArray368[local23 + 3] = local16;
			this.anIntArray368[local23 + 4] = local14;
			this.anIntArray368[local23 + 5] = local12;
			this.anIntArray368[local23 + 6] = local10;
			this.anIntArray368[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray368[local23 + 1];
			local10 += this.anIntArray368[local23 + 6];
			local8 += this.anIntArray368[local23 + 7];
			local21 += this.anIntArray368[local23];
			local16 += this.anIntArray368[local23 + 3];
			local14 += this.anIntArray368[local23 + 4];
			local18 += this.anIntArray368[local23 + 2];
			local12 += this.anIntArray368[local23 + 5];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray368[local23] = local21;
			this.anIntArray368[local23 + 1] = local20;
			this.anIntArray368[local23 + 2] = local18;
			this.anIntArray368[local23 + 3] = local16;
			this.anIntArray368[local23 + 4] = local14;
			this.anIntArray368[local23 + 5] = local12;
			this.anIntArray368[local23 + 6] = local10;
			this.anIntArray368[local23 + 7] = local8;
		}
		this.method4293();
		this.anInt4998 = 256;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)I")
	public int method4291() {
		if (this.anInt4998-- == 0) {
			this.method4293();
			this.anInt4998 = 255;
		}
		return this.anIntArray367[this.anInt4998];
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	private void method4293() {
		this.anInt4993 += ++this.anInt4996;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(28) int local28 = this.anIntArray368[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt4999 ^= this.anInt4999 << 13;
				} else {
					this.anInt4999 ^= this.anInt4999 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt4999 ^= this.anInt4999 << 2;
			} else {
				this.anInt4999 ^= this.anInt4999 >>> 16;
			}
			this.anInt4999 += this.anIntArray368[local19 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray368[local19] = local123 = this.anIntArray368[local28 >> 2 & 0xFF] + this.anInt4999 + this.anInt4993;
			this.anIntArray367[local19] = this.anInt4993 = local28 + this.anIntArray368[local123 >> 8 >> 2 & 0xFF];
		}
	}
}
