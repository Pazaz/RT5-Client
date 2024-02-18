import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public class Packet extends Class2 {

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "[I")
	public static final int[] crctable = new int[256];

	static {
		for (@Pc(43) int b = 0; b < 256; b++) {
			@Pc(46) int remainder = b;

			for (@Pc(48) int bit = 0; bit < 8; bit++) {
				if ((remainder & 0x1) == 1) {
					remainder = remainder >>> 1 ^ 0xEDB88320;
				} else {
					remainder >>>= 0x1;
				}
			}

			crctable[b] = remainder;
		}
	}

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
	public int pos;

	@OriginalMember(owner = "client!ge", name = "ib", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Packet(@OriginalArg(0) int capacity) {
		this.pos = 0;
		this.data = Static200.method2981(capacity);
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([B)V")
	public Packet(@OriginalArg(0) byte[] src) {
		this.data = src;
		this.pos = 0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BII[B)I")
	public static int getcrc(@OriginalArg(3) byte[] src, @OriginalArg(2) int offset, @OriginalArg(1) int length) {
		@Pc(11) int local11 = -1;
		for (@Pc(13) int local13 = offset; local13 < length; local13++) {
			local11 = local11 >>> 8 ^ crctable[(local11 ^ src[local13]) & 0xFF];
		}
		return ~local11;
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(B)I")
	public final int g4_alt1() {
		this.pos += 4;
		return (this.data[this.pos - 4] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos + -1] & 0xFF) << 24) + ((this.data[this.pos + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "(I)I")
	public final int g4_alt2() {
		this.pos += 4;
		return ((this.data[this.pos - 1] & 0xFF) << 16) + (((this.data[this.pos - 2] & 0xFF) << 24) - (-((this.data[this.pos - 4] & 0xFF) << 8) - (this.data[this.pos - 3] & 0xFF)));
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(IZ)V")
	public final void p1_alt2(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) -value;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(BI)V")
	public final void p4(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String gjstr2() {
		@Pc(14) byte version = this.data[this.pos++];
		if (version != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int start = this.pos;
		while (this.data[this.pos++] != 0) {
		}
		@Pc(55) int length = this.pos - start - 1;
		return length == 0 ? "" : Static350.method5126(start, this.data, length);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[BI)V")
	public final void gdata(@OriginalArg(2) byte[] src, @OriginalArg(0) int offset, @OriginalArg(1) int length) {
		for (@Pc(1) int i = offset; i < length + offset; i++) {
			src[i] = this.data[this.pos++];
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(Z)I")
	public final int gExtended1or2() {
		@Pc(5) int acc = 0;
		@Pc(9) int remainder;
		for (remainder = this.gSamrt1or2(); remainder == 32767; remainder = this.gSamrt1or2()) {
			acc += 32767;
		}
		return acc + remainder;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(Z)I")
	public final int gSmart2or4null() {
		if (this.data[this.pos] < 0) {
			return this.g4() & Integer.MAX_VALUE;
		} else {
			@Pc(26) int value = this.g2();
			return value == 32767 ? -1 : value;
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(IB)V")
	public final void p4_alt3(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)B")
	public final byte g1b_alt3() {
		return (byte) (128 - this.data[this.pos++]);
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)I")
	public final int g4() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 24) - (-((this.data[this.pos - 3] & 0xFF) << 16) - ((this.data[this.pos - 2] & 0xFF) << 8) - (this.data[this.pos + -1] & 0xFF));
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)V")
	public final void p4_alt2(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)I")
	public final int ig4() {
		this.pos += 4;
		return (this.data[this.pos - 4] & 0xFF) + (((this.data[this.pos - 1] & 0xFF) << 24) + ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos + -3] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(II)V")
	public final void pSmart1or2(@OriginalArg(0) int value) {
		if (value >= 0 && value < 128) {
			this.p1(value);
		} else if (value >= 0 && value < 32768) {
			this.p2(value + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IZ)I")
	public final int addcrc(@OriginalArg(0) int value) {
		@Pc(18) int crc = getcrc(this.data, value, this.pos);
		this.p4(crc);
		return crc;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)V")
	public final void p2_alt1(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([II)V")
	public final void tinydec(@OriginalArg(0) int[] key) {
		@Pc(17) int blocks = this.pos / 8;
		this.pos = 0;
		for (@Pc(22) int i = 0; i < blocks; i++) {
			@Pc(28) int v0 = this.g4();
			@Pc(32) int v1 = this.g4();
			@Pc(34) int sum = 0xc6ef3720;
			@Pc(38) int numRounds = 32;
			while (numRounds-- > 0) {
				v1 -= (v0 >>> 5 ^ v0 << 4) + v0 ^ sum + key[sum >>> 11 & 0x3];
				sum -= 0x9e3779b9;
				v0 -= sum + key[sum & 0x3] ^ v1 + (v1 << 4 ^ v1 >>> 5);
			}
			this.pos -= 8;
			this.p4(v0);
			this.p4(v1);
		}
	}

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "(I)I")
	public final int g2s() {
		this.pos += 2;
		@Pc(42) int value = (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public final void psize2(@OriginalArg(0) int size) {
		this.data[this.pos - size - 2] = (byte) (size >> 8);
		this.data[this.pos - size - 1] = (byte) size;
	}

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String gjstr() {
		@Pc(6) int start = this.pos;
		while (this.data[this.pos++] != 0) {
		}
		@Pc(29) int length = this.pos - start - 1;
		return length == 0 ? "" : Static350.method5126(start, this.data, length);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)J")
	public final long ig8() {
		@Pc(16) long low = (long) this.ig4() & 0xFFFFFFFFL;
		@Pc(23) long high = (long) this.ig4() & 0xFFFFFFFFL;
		return low + (high << 32);
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "(I)I")
	public final int gSmart1or2s() {
		@Pc(11) int value = this.data[this.pos] & 0xFF;
		return value < 128 ? this.g1() - 64 : this.g2() + -49152;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public final void pjstr2(@OriginalArg(0) String str) {
		@Pc(15) int nulIndex = str.indexOf(0);
		if (nulIndex >= 0) {
			throw new IllegalArgumentException("NUL character at " + nulIndex + " - cannot pjstr2");
		}
		this.data[this.pos++] = 0;
		this.pos += Static331.method4926(str, str.length(), this.data, this.pos);
		this.data[this.pos++] = 0;
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(II)V")
	public final void ip2(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JI)V")
	public final void p8(@OriginalArg(0) long value) {
		this.data[this.pos++] = (byte) (int) (value >> 56);
		this.data[this.pos++] = (byte) (int) (value >> 48);
		this.data[this.pos++] = (byte) (int) (value >> 40);
		this.data[this.pos++] = (byte) (int) (value >> 32);
		this.data[this.pos++] = (byte) (int) (value >> 24);
		this.data[this.pos++] = (byte) (int) (value >> 16);
		this.data[this.pos++] = (byte) (int) (value >> 8);
		this.data[this.pos++] = (byte) (int) value;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)I")
	public final int gSmart2or4() {
		return this.data[this.pos] >= 0 ? this.g2() : this.g4() & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "(I)V")
	public final void release() {
		if (this.data != null) {
			Static200.method2979(this.data);
		}
		this.data = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIZI)V")
	public final void tinyenc(@OriginalArg(0) int[] key, @OriginalArg(1) int offset, @OriginalArg(3) int length) {
		@Pc(6) int start = this.pos;
		this.pos = offset;
		@Pc(15) int blocks = (length - offset) / 8;
		for (@Pc(17) int i = 0; i < blocks; i++) {
			@Pc(22) int v0 = this.g4();
			@Pc(26) int v1 = this.g4();
			@Pc(28) int sum = 0;
			@Pc(32) int numRounds = 32;
			while (numRounds-- > 0) {
				v0 += v1 + (v1 << 4 ^ v1 >>> 5) ^ sum + key[sum & 0x3];
				sum += 0x9e3779b9;
				v1 += (v0 >>> 5 ^ v0 << 4) + v0 ^ sum + key[sum >>> 11 & 0xE8C00003];
			}
			this.pos -= 8;
			this.p4(v0);
			this.p4(v1);
		}
		this.pos = start;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(IB)V")
	public final void psize4(@OriginalArg(0) int value) {
		this.data[this.pos - value - 4] = (byte) (value >> 24);
		this.data[this.pos - value - 3] = (byte) (value >> 16);
		this.data[this.pos - value - 2] = (byte) (value >> 8);
		this.data[this.pos - value - 1] = (byte) value;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIJ)V")
	public final void pVarLong(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(30) int local30 = local0 * 8; local30 >= 0; local30 -= 8) {
			this.data[this.pos++] = (byte) (int) (arg1 >> local30);
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)V")
	public final void p2_alt3(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value + 128);
		this.data[this.pos++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)I")
	public final int g4_alt3() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 16) + (((this.data[this.pos - 3] & 0xFF) << 24) + ((this.data[this.pos - 1] & 0xFF) << 8)) + (this.data[this.pos - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)I")
	public final int ig2() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "(II)V")
	public final void p2(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "(I)I")
	public final int g1_alt1() {
		return this.data[this.pos++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "(I)I")
	public final int g2s_alt3() {
		this.pos += 2;
		@Pc(33) int value = ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I")
	public final int g1_alt3() {
		return 128 - this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(B)B")
	public final byte g1b() {
		return this.data[this.pos++];
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(II)V")
	public final void p4_alt1(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 24);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Z")
	public final boolean checkcrc() {
		this.pos -= 4;
		@Pc(17) int crc = getcrc(this.data, 0, this.pos);
		@Pc(21) int expected = this.g4();
		return crc == expected;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IB)V")
	public final void psize1(@OriginalArg(0) int arg0) {
		this.data[this.pos - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)I")
	public final int ig2s() {
		this.pos += 2;
		@Pc(39) int value = (this.data[this.pos - 2] & 0xFF) + ((this.data[this.pos - 1] & 0xFF) << 8);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)I")
	public final int g2() {
		this.pos += 2;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "(I)I")
	public final int g3() {
		this.pos += 3;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + ((this.data[this.pos - 3] & 0xFF) << 16) + (this.data[this.pos + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)V")
	public final void p1_alt1(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value + 128);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void rsaenc(@OriginalArg(1) BigInteger modulus, @OriginalArg(2) BigInteger exponent) {
		@Pc(6) int length = this.pos;
		this.pos = 0;
		@Pc(12) byte[] temp = new byte[length];
		this.gdata(temp, 0, length);
		@Pc(23) BigInteger bigRaw = new BigInteger(temp);
		@Pc(28) BigInteger bigEnc = bigRaw.modPow(exponent, modulus);
		@Pc(31) byte[] rawEnc = bigEnc.toByteArray();
		this.pos = 0;
		this.p2(rawEnc.length);
		this.pdata(rawEnc, 0, rawEnc.length);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB[BI)V")
	public final void pdata(@OriginalArg(2) byte[] src, @OriginalArg(3) int offset, @OriginalArg(0) int length) {
		for (@Pc(6) int i = offset; i < length + offset; i++) {
			this.data[this.pos++] = src[i];
		}
	}

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "(I)I")
	public final int g2_alt2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
	public final void p3(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
	public final void p1(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(Z)I")
	public final int gSamrt1or2() {
		@Pc(20) int value = this.data[this.pos] & 0xFF;
		return value < 128 ? this.g1() : this.g2() - 32768;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void pjstr(@OriginalArg(0) String str) {
		@Pc(7) int nulIndex = str.indexOf(0);
		if (nulIndex >= 0) {
			throw new IllegalArgumentException("NUL character at " + nulIndex + " - cannot pjstr");
		}
		this.pos += Static331.method4926(str, str.length(), this.data, this.pos);
		this.data[this.pos++] = 0;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)I")
	public final int g3s() {
		this.pos += 3;
		@Pc(43) int value = (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos + -2] & 0xFF) << 8);
		if (value > 8388607) {
			value -= 16777216;
		}
		return value;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)V")
	public final void p2_alt2(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value + 128);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[III)V")
	public final void tinydec(@OriginalArg(1) int[] key, @OriginalArg(2) int length) {
		@Pc(6) int start = this.pos;
		this.pos = 5;
		@Pc(16) int blocks = (length - 5) / 8;
		for (@Pc(27) int i = 0; i < blocks; i++) {
			@Pc(34) int v0 = this.g4();
			@Pc(38) int v1 = this.g4();
			@Pc(40) int sum = 0xc6ef3720;
			@Pc(44) int numRounds = 32;
			while (numRounds-- > 0) {
				v1 -= (v0 << 4 ^ v0 >>> 5) + v0 ^ key[sum >>> 11 & 0x3] + sum;
				sum -= 0x9e3779b9;
				v0 -= v1 + (v1 >>> 5 ^ v1 << 4) ^ sum + key[sum & 0x3];
			}
			this.pos -= 8;
			this.p4(v0);
			this.p4(v1);
		}
		this.pos = start;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(II)V")
	public final void pVarInt(@OriginalArg(1) int value) {
		if ((value & 0xFFFFFF80) != 0) {
			if ((value & 0xFFFFC000) != 0) {
				if ((value & 0xFFE00000) != 0) {
					if ((value & 0xF0000000) != 0) {
						this.p1(value >>> 28 | 0x80);
					}
					this.p1(value >>> 21 | 0x80);
				}
				this.p1(value >>> 14 | 0x80);
			}
			this.p1(value >>> 7 | 0x80);
		}
		this.p1(value & 0x7F);
	}

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "(I)I")
	public final int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "(I)J")
	public final long g8() {
		@Pc(10) long high = (long) this.g4() & 0xFFFFFFFFL;
		@Pc(19) long low = (long) this.g4() & 0xFFFFFFFFL;
		return low + (high << 32);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)B")
	public final byte g1b_alt2() {
		return (byte) -this.data[this.pos++];
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(II)V")
	public final void ip4(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 24);
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(Z)I")
	public final int g1_alt2() {
		return -this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)I")
	public final int gVarInt() {
		@Pc(14) byte value = this.data[this.pos++];
		@Pc(16) int acc = 0;
		while (value < 0) {
			acc = (acc | value & 0x7F) << 7;
			value = this.data[this.pos++];
		}
		return value | acc;
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String fastgjstr() {
		if (this.data[this.pos] == 0) {
			this.pos++;
			return null;
		} else {
			return this.gjstr();
		}
	}

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "(I)J")
	public final long g5() {
		@Pc(16) long high = (long) this.g1() & 0xFFFFFFFFL;
		@Pc(23) long low = (long) this.g4() & 0xFFFFFFFFL;
		return low + (high << 32);
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)B")
	public final byte g1b_alt1() {
		return (byte) (this.data[this.pos++] - 128);
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(Z)I")
	public final int g2_alt3() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(II)J")
	public final long gVarLong(@OriginalArg(0) int bytes) {
		@Pc(6) int read = bytes - 1;
		if (read < 0 || read > 7) {
			throw new IllegalArgumentException();
		}

		@Pc(25) int bits = read * 8;
		@Pc(27) long acc = 0L;
		while (bits >= 0) {
			acc |= ((long) this.data[this.pos++] & 0xFFL) << bits;
			bits -= 8;
		}

		return acc;
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "(II)V")
	public final void p1_alt3(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (128 - value);
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)I")
	public final int g3_alt1() {
		this.pos += 3;
		return ((this.data[this.pos - 3] & 0xFF) << 16) - (-((this.data[this.pos - 1] & 0xFF) << 8) - (this.data[this.pos - 2] & 0xFF));
	}
}
