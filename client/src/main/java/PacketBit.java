import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rka")
public final class PacketBit extends Packet {

	@OriginalMember(owner = "client!rka", name = "Sb", descriptor = "Lclient!iv;")
	private IsaacRandom random;

	@OriginalMember(owner = "client!rka", name = "Rb", descriptor = "I")
	private int bitPos;

	@OriginalMember(owner = "client!rka", name = "<init>", descriptor = "(I)V")
	public PacketBit(@OriginalArg(0) int capacity) {
		super(capacity);
	}

	@OriginalMember(owner = "client!rka", name = "y", descriptor = "(I)V")
	public void bytes() {
		super.pos = (this.bitPos + 7) / 8;
	}

	@OriginalMember(owner = "client!rka", name = "c", descriptor = "(BI)I")
	public int gBit(@OriginalArg(1) int n) {
		@Pc(10) int local10 = this.bitPos >> 3;
		@Pc(18) int local18 = 8 - (this.bitPos & 0x7);
		@Pc(20) int local20 = 0;
		this.bitPos += n;
		while (local18 < n) {
			local20 += (Static659.anIntArray769[local18] & super.data[local10++]) << n - local18;
			n -= local18;
			local18 = 8;
		}
		if (n == local18) {
			local20 += super.data[local10] & Static659.anIntArray769[local18];
		} else {
			local20 += super.data[local10] >> local18 - n & Static659.anIntArray769[n];
		}
		return local20;
	}

	@OriginalMember(owner = "client!rka", name = "j", descriptor = "(Z)Z")
	public boolean method7413() {
		@Pc(22) int local22 = super.data[super.pos] - this.random.peekNext() & 0xFF;
		return local22 >= 128;
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "([IB)V")
	public void seedRandom(@OriginalArg(0) int[] seed) {
		this.random = new IsaacRandom(seed);
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "([BIIZ)V")
	public void pdataisaac(@OriginalArg(0) byte[] dest, @OriginalArg(1) int length) {
		for (@Pc(7) int i = 0; i < length; i++) {
			dest[i] = (byte) (super.data[super.pos++] - this.random.nextInt());
		}
	}

	@OriginalMember(owner = "client!rka", name = "w", descriptor = "(I)V")
	public void bits() {
		this.bitPos = super.pos * 8;
	}

	@OriginalMember(owner = "client!rka", name = "n", descriptor = "(II)V")
	public void p1isaac(@OriginalArg(1) int opcode) {
		super.data[super.pos++] = (byte) (opcode + this.random.nextInt());
	}

	@OriginalMember(owner = "client!rka", name = "m", descriptor = "(II)I")
	public int availableBits(@OriginalArg(0) int bits) {
		return bits * 8 - this.bitPos;
	}

	// this is like some alt packet method...
	@OriginalMember(owner = "client!rka", name = "x", descriptor = "(I)I")
	public int method7421() {
		@Pc(30) int local30 = super.data[super.pos++] - this.random.nextInt() & 0xFF;
		return local30 < 128 ? local30 : (super.data[super.pos++] - this.random.nextInt() & 0xFF) + (local30 - 128 << 8);
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(Lclient!iv;I)V")
	public void setRandom(@OriginalArg(0) IsaacRandom random) {
		this.random = random;
	}
}
