import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Packet extends Buffer {

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "[I")
	public static final int[] BITMASK = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!qg", name = "Mb", descriptor = "I")
	private int bitOffset;

	@OriginalMember(owner = "client!qg", name = "Qb", descriptor = "Lclient!sq;")
	private IsaacRandom random;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V")
	public Packet(@OriginalArg(0) int size) {
		super(size);
	}

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "(I)I")
	public int method4864() {
		@Pc(22) int value = super.data[super.pos++] - this.random.getNext() & 0xFF;
		return value < 128 ? value : (super.data[super.pos++] - this.random.getNext() & 0xFF) + (value - 128 << 8);
	}

	// change stream position for byte access
	@OriginalMember(owner = "client!qg", name = "r", descriptor = "(B)V")
	public void accessBytes() {
		super.pos = (this.bitOffset + 7) / 8;
	}

	// get, data, encrypted with isaac
	@OriginalMember(owner = "client!qg", name = "b", descriptor = "([BIII)V")
	public void gisaac(@OriginalArg(0) byte[] dst, @OriginalArg(1) int len) {
		for (@Pc(12) int i = 0; i < len; i++) {
			dst[i] = (byte) (super.data[super.pos++] - this.random.getNext());
		}
	}

	// put, 1 byte, encrypted with isaac
	@OriginalMember(owner = "client!qg", name = "k", descriptor = "(II)V")
	public void p1isaac(@OriginalArg(0) int op) {
		super.data[super.pos++] = (byte) (this.random.getNext() + op);
	}

	// get, n bits
	@OriginalMember(owner = "client!qg", name = "h", descriptor = "(BI)I")
	public int gBit(@OriginalArg(1) int n) {
		@Pc(10) int bitPos = this.bitOffset >> 3;
		@Pc(17) int bytePos = 8 - (this.bitOffset & 0x7);
		this.bitOffset += n;
		@Pc(32) int value = 0;
		while (bytePos < n) {
			value += (super.data[bitPos++] & BITMASK[bytePos]) << n - bytePos;
			n -= bytePos;
			bytePos = 8;
		}
		if (n == bytePos) {
			value += BITMASK[bytePos] & super.data[bitPos];
		} else {
			value += super.data[bitPos] >> bytePos - n & BITMASK[n];
		}
		return value;
	}

	// change stream position for bit access
	@OriginalMember(owner = "client!qg", name = "o", descriptor = "(I)V")
	public void accessBits() {
		this.bitOffset = super.pos * 8;
	}

	// peek (do not advance), 1 byte, encrypted with isaac
	@OriginalMember(owner = "client!qg", name = "s", descriptor = "(B)Z")
	public boolean peek1isaac() {
		@Pc(17) int value = super.data[super.pos] - this.random.peekNext() & 0xFF;
		return value >= 128;
	}

	// initialize isaac
	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([IB)V")
	public void setKey(@OriginalArg(0) int[] key) {
		this.random = new IsaacRandom(key);
	}

	// get remaining bits at a position
	@OriginalMember(owner = "client!qg", name = "i", descriptor = "(BI)I")
	public int availableBits(@OriginalArg(1) int pos) {
		return pos * 8 - this.bitOffset;
	}
}
