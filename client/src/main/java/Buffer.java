import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public class Buffer extends Node {

	@OriginalMember(owner = "client!qk", name = "gb", descriptor = "[[B")
	public static final byte[][] allocatedMin = new byte[1000][];
	@OriginalMember(owner = "client!mh", name = "b", descriptor = "[[B")
	public static final byte[][] allocatedMid = new byte[250][];
	@OriginalMember(owner = "client!od", name = "bb", descriptor = "[[B")
	public static final byte[][] allocatedMax = new byte[50][];
	@OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
	public static final int[] CRC32_TABLE = new int[256];
	@OriginalMember(owner = "client!ad", name = "t", descriptor = "[J")
	public static final long[] CRC64_TABLE = new long[256];
	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	public static int allocatedMinCount = 0;
	@OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
	public static int allocatedMidCount = 0;
	@OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
	public static int allocatedMaxCount = 0;
	@OriginalMember(owner = "client!bt", name = "kb", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!bt", name = "U", descriptor = "I")
	public int pos;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			CRC32_TABLE[local4] = local7;
		}

		for (@Pc(43) int local43 = 0; local43 < 256; local43++) {
			@Pc(47) long local47 = (long) local43;
			for (@Pc(49) int local49 = 0; local49 < 8; local49++) {
				if ((local47 & 0x1L) == 1L) {
					local47 = local47 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local47 >>>= 0x1;
				}
			}
			CRC64_TABLE[local43] = local47;
		}
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
	public Buffer(@OriginalArg(0) int size) {
		this.data = allocate(size);
		this.pos = 0;
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "([B)V")
	public Buffer(@OriginalArg(0) byte[] src) {
		this.pos = 0;
		this.data = src;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] allocate(@OriginalArg(0) int size) {
		@Pc(19) byte[] data;

		if (size == 100 && allocatedMinCount > 0) {
			data = allocatedMin[--allocatedMinCount];
			allocatedMin[allocatedMinCount] = null;
			return data;
		} else if (size == 5000 && allocatedMidCount > 0) {
			data = allocatedMid[--allocatedMidCount];
			allocatedMid[allocatedMidCount] = null;
			return data;
		} else if (size == 30000 && allocatedMaxCount > 0) {
			data = allocatedMax[--allocatedMaxCount];
			allocatedMax[allocatedMaxCount] = null;
			return data;
		}

		return new byte[size];
	}

	// generate checksum
	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[B)I")
	public static int crc32(@OriginalArg(0) int length, @OriginalArg(1) int offset, @OriginalArg(3) byte[] src) {
		@Pc(7) int crc = -1;

		for (@Pc(16) int i = offset; i < length; i++) {
			crc = CRC32_TABLE[(src[i] ^ crc) & 0xFF] ^ crc >>> 8;
		}

		return ~crc;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int getStringLength(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	// get, 8 bytes
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)J")
	public final long g8() {
		@Pc(10) long high = (long) this.g4() & 0xFFFFFFFFL;
		@Pc(19) long low = (long) this.g4() & 0xFFFFFFFFL;
		return low + (high << 32);
	}

	// get, data
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIIZ)V")
	public final void gdata(@OriginalArg(0) byte[] src, @OriginalArg(2) int length) {
		for (@Pc(11) int i = 0; i < length; i++) {
			src[i] = this.data[this.pos++];
		}
	}

	// get, 2 bytes, signed, subtract from
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I")
	public final int g2ssub() {
		this.pos += 2;
		@Pc(38) int value = ((this.data[this.pos - 2] & 0xFF) << 8) | (this.data[this.pos - 1] - 128 & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// get, 1 byte, negate
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)B")
	public final byte g1neg() {
		return (byte) -this.data[this.pos++];
	}

	// add checksum
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I")
	public final int addcrc(@OriginalArg(0) int off) {
		@Pc(18) int checksum = crc32(this.pos, off, this.data);
		this.p4(checksum);
		return checksum;
	}

	// inverse, get, 2 bytes
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Z)I")
	public final int ig2() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) | (this.data[this.pos - 2] & 0xFF);
	}

	// get, 1 byte, negate
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)I")
	public final int g1bneg() {
		return -this.data[this.pos++] & 0xFF;
	}

	// middle, put, 4 bytes
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V")
	public final void mp4(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
	}

	// get, 2 bytes, add to
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I")
	public final int g2add() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) | (this.data[this.pos - 1] - 128 & 0xFF);
	}

	// put, VarLong
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIJ)V")
	public final void pVarLong(@OriginalArg(1) int length, @OriginalArg(2) long value) {
		@Pc(2) int bytes = length - 1;
		if (bytes < 0 || bytes > 7) {
			throw new IllegalArgumentException();
		}

		for (@Pc(25) int shift = bytes * 8; shift >= 0; shift -= 8) {
			this.data[this.pos++] = (byte) (value >> shift);
		}
	}

	// compare checksums
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(Z)Z")
	public final boolean checkcrc() {
		this.pos -= 4;

		@Pc(23) int thisCrc = crc32(this.pos, 0, this.data);
		@Pc(27) int otherCrc = this.g4();
		return otherCrc == thisCrc;
	}

	// get, jstr
	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String gjstr() {
		@Pc(14) int start = this.pos;
		while (this.data[this.pos++] != 0) {}
		@Pc(37) int length = this.pos - start - 1;
		return length == 0 ? "" : Cp1252Charset.decodeString(start, this.data, length);
	}

	// get, 1 byte, subtract from
	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)I")
	public final int g1sub() {
		return 128 - this.data[this.pos++] & 0xFF;
	}

	// get, VarInt
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(B)I")
	public final int gVarInt() {
		@Pc(21) byte b = this.data[this.pos++];
		@Pc(23) int value = 0;

		while (b < 0) {
			value = (b & 0x7F | value) << 7;
			b = this.data[this.pos++];
		}

		return value | b;
	}

	// put, 4 bytes
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)V")
	public final void p4(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	// put, 1 byte, negate
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(IB)V")
	public final void p1neg(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) -value;
	}

	// get, 1 byte
	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(B)I")
	public final int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	// inverse, get, 2 bytes, signed, add to
	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(B)I")
	public final int ig2sadd() {
		this.pos += 2;
		@Pc(33) int value = ((this.data[this.pos - 1] & 0xFF) << 8) | (this.data[this.pos - 2] - 128 & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// get, smart
	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(B)I")
	public final int gsmart() {
		@Pc(16) int value = this.data[this.pos] & 0xFF;
		return value >= 128 ? this.g2() - 32768 : this.g1();
	}

	// get, smart, signed
	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(B)I")
	public final int gsmarts() {
		@Pc(19) int value = this.data[this.pos] & 0xFF;
		return value >= 128 ? this.g2() - 49152 : this.g1() - 64;
	}

	// put, 1 byte, subtract from
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)V")
	public final void p1sub(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (128 - value);
	}

	// (extended) tiny (encryption algorithm) (XTEA), decrypt
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[II)V")
	public final void tinydec(@OriginalArg(2) int[] key, @OriginalArg(3) int len) {
		@Pc(25) int blocks = (len - 5) / 8;
		@Pc(16) int start = this.pos;
		this.pos = 5;

		for (@Pc(27) int i = 0; i < blocks; i++) {
			@Pc(33) int v0 = this.g4();
			@Pc(37) int v1 = this.g4();
			@Pc(39) int sum = 0xC6EF3720;
			@Pc(43) int rounds = 32;

			while (rounds-- > 0) {
				v1 -= key[sum >>> 11 & 0x3] + sum ^ (v0 >>> 5 ^ v0 << 4) + v0;
				sum -= 0x9E3779B9;
				v0 -= (v1 >>> 5 ^ v1 << 4) + v1 ^ key[sum & 0x3] + sum;
			}

			this.pos -= 8;
			this.p4(v0);
			this.p4(v1);
		}

		this.pos = start;
	}

	// put, jstr
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void pjstr(@OriginalArg(0) String str) {
		@Pc(7) int firstNul = str.indexOf(0);
		if (firstNul >= 0) {
			throw new IllegalArgumentException("NUL character at " + firstNul + " - cannot pjstr");
		}

		this.pos += Cp1252Charset.encodeString(str.length(), str, this.data, this.pos);
		this.data[this.pos++] = 0;
	}

	// get, 2 bytes, signed
	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(B)I")
	public final int g2s() {
		this.pos += 2;
		@Pc(37) int value = ((this.data[this.pos - 2] & 0xFF) << 8) | (this.data[this.pos - 1] & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// put, smart, signed
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(BI)V")
	public final void psmarts(@OriginalArg(1) int value) {
		if (value >= 0 && value < 128) {
			this.p1(value);
		} else if (value >= 0 && value < 32768) {
			this.p2(value + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	// get, 1 byte, as byte
	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)B")
	public final byte g1b() {
		return this.data[this.pos++];
	}

	// put, size, 4 bytes
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZI)V")
	public final void psize4(@OriginalArg(1) int length) {
		this.data[this.pos - length - 4] = (byte) (length >> 24);
		this.data[this.pos - length - 3] = (byte) (length >> 16);
		this.data[this.pos - length - 2] = (byte) (length >> 8);
		this.data[this.pos - length - 1] = (byte) length;
	}

	// put, 1 byte, add to
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(BI)V")
	public final void p1add(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value + 128);
	}

	// get, 2 bytes
	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(B)I")
	public final int g2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) | (this.data[this.pos - 1] & 0xFF);
	}

	// inverse, put 2 bytes, duplicate (redundant - as ip2)
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(II)V")
	public final void ip2_dup(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
	}

	// inverse, get, data
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI)V")
	public final void igdata(@OriginalArg(2) byte[] src, @OriginalArg(3) int length) {
		for (@Pc(15) int i = length - 1; i >= 0; i--) {
			src[i] = this.data[this.pos++];
		}
	}

	// put, 8 bytes
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V")
	public final void p8(@OriginalArg(1) long value) {
		this.data[this.pos++] = (byte) (value >> 56);
		this.data[this.pos++] = (byte) (value >> 48);
		this.data[this.pos++] = (byte) (value >> 40);
		this.data[this.pos++] = (byte) (value >> 32);
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	// inverse, get, 3 bytes
	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)I")
	public final int ig3() {
		this.pos += 3;
		return ((this.data[this.pos - 3] & 0xFF) << 16) | ((this.data[this.pos - 2] & 0xFF) << 8) | (this.data[this.pos - 1] & 0xFF);
	}

	// rsa, encrypt
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void rsaenc(@OriginalArg(0) BigInteger modulus, @OriginalArg(2) BigInteger exponent) {
		@Pc(6) int len = this.pos;
		this.pos = 0;

		@Pc(12) byte[] plaintextBytes = new byte[len];
		this.gdata(plaintextBytes, len);

		@Pc(23) BigInteger plaintext = new BigInteger(plaintextBytes);
		@Pc(36) BigInteger ciphertext = plaintext.modPow(exponent, modulus);
		@Pc(39) byte[] ciphertextBytes = ciphertext.toByteArray();

		this.pos = 0;
		this.p1(ciphertextBytes.length);
		this.pdata(ciphertextBytes, ciphertextBytes.length);
	}

	// either called g4_alt1 or g4_alt3
	// middle, get, 4 bytes
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(Z)I")
	public final int mg4() {
		this.pos += 4;
		return (((this.data[this.pos - 3] & 0xFF) << 24) | ((this.data[this.pos - 4] & 0xFF) << 16) | ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF));
	}

	// get, 4 bytes
	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(I)I")
	public final int g4() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 24) | ((this.data[this.pos - 3] & 0xFF) << 16) | ((this.data[this.pos - 2] & 0xFF) << 8) | (this.data[this.pos - 1] & 0xFF);
	}

	// inverse, put, 4 bytes
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(BI)V")
	public final void ip4(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 24);
	}

	// inverse, put, 2 bytes, add to
	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(II)V")
	public final void ip2add(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value + 128);
		this.data[this.pos++] = (byte) (value >> 8);
	}

	// get, VarSmart
	@OriginalMember(owner = "client!bt", name = "k", descriptor = "(B)I")
	public final int gVarSmart() {
		@Pc(12) int value = 0;
		@Pc(16) int value2 = this.gsmart();
		while (value2 == 32767) {
			value2 = this.gsmart();
			value += 32767;
		}
		return value + value2;
	}

	// inverse, middle, put, 4 bytes
	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(BI)V")
	public final void imp4(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
	}

	// get, 1 byte, as byte, subtract from
	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(I)B")
	public final byte g1bsub() {
		return (byte) (128 - this.data[this.pos++]);
	}

	// put, 1 byte
	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(II)V")
	public final void p1(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) value;
	}

	// put, 2 bytes
	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(II)V")
	public final void p2(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	// inverse, get, 4 bytes
	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(B)I")
	public final int ig4() {
		this.pos += 4;
		return ((this.data[this.pos - 1] & 0xFF) << 24) | ((this.data[this.pos - 2] & 0xFF) << 16) | ((this.data[this.pos - 3] & 0xFF) << 8) | (this.data[this.pos - 4] & 0xFF);
	}

	// inverse, put, 2 bytes
	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(II)V")
	public final void ip2(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
	}

	// put, 3 bytes
	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(II)V")
	public final void p3(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	// inverse, put, 4 bytes, duplicate (redundant - as ip4)
	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(BI)V")
	public final void ip4_dup(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 24);
	}

	// put, VarInt
	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(BI)V")
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

	// inverse, get, 2 bytes, signed
	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(B)I")
	public final int ig2s() {
		this.pos += 2;
		@Pc(31) int value = ((this.data[this.pos - 1] & 0xFF) << 8) | (this.data[this.pos - 2] & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// put, size, 2 bytes
	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(II)V")
	public final void psize2(@OriginalArg(1) int length) {
		this.data[this.pos - length - 2] = (byte) (length >> 8);
		this.data[this.pos - length - 1] = (byte) length;
	}

	// either called g4_alt1 or g4_alt3
	// inverse, middle, get, 4 bytes
	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(I)I")
	public final int img4() {
		this.pos += 4;
		return ((this.data[this.pos - 2] & 0xFF) << 24) | (((this.data[this.pos - 1] & 0xFF) << 16) | (this.data[this.pos - 4] << 8 & 0xFF00)) | (this.data[this.pos - 3] & 0xFF);
	}

	// inverse, get, 2 bytes, add to
	@OriginalMember(owner = "client!bt", name = "n", descriptor = "(B)I")
	public final int ig2add() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) | (this.data[this.pos - 2] - 128 & 0xFF);
	}

	// get, 1 byte, add to
	@OriginalMember(owner = "client!bt", name = "o", descriptor = "(B)B")
	public final byte g1badd() {
		return (byte) (this.data[this.pos++] - 128);
	}

	// put, 2 bytes, add to
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(IB)V")
	public final void p2add(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value + 128);
	}

	// get, jstr (variant 2, versioned?)
	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String gjstr2() {
		@Pc(14) byte version = this.data[this.pos++];
		if (version != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}

		@Pc(27) int start = this.pos;
		while (this.data[this.pos++] != 0) {}
		@Pc(55) int length = this.pos - start - 1;
		return length == 0 ? "" : Cp1252Charset.decodeString(start, this.data, length);
	}

	// put, data
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI[BI)V")
	public final void pdata(@OriginalArg(2) byte[] src, @OriginalArg(3) int length) {
		for (@Pc(8) int i = 0; i < length; i++) {
			this.data[this.pos++] = src[i];
		}
	}

	// inverse, put, add to, data
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIII)V")
	public final void ipadata(@OriginalArg(0) byte[] src, @OriginalArg(2) int length) {
		for (@Pc(11) int i = length - 1; i >= 0; i--) {
			src[i] = (byte) (this.data[this.pos++] - 128);
		}
	}

	// (fast) get, str
	@OriginalMember(owner = "client!bt", name = "p", descriptor = "(B)Ljava/lang/String;")
	public final String fastgstr() {
		if (this.data[this.pos] == 0) {
			this.pos++;
			return null;
		} else {
			return this.gjstr();
		}
	}

	// get, VarLong
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(ZI)J")
	public final long gVarLong(@OriginalArg(1) int len) {
		@Pc(2) int bytes = len - 1;
		if (bytes < 0 || bytes > 7) {
			throw new IllegalArgumentException();
		}

		@Pc(24) long value = 0L;
		for (@Pc(22) int shift = bytes * 8; shift >= 0; shift -= 8) {
			value |= ((long) this.data[this.pos++] & 0xFFL) << shift;
		}
		return value;
	}

	// put, size, 1 byte
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(ZI)V")
	public final void psize1(@OriginalArg(1) int length) {
		this.data[this.pos - length - 1] = (byte) length;
	}

	// (extended) tiny (encryption algorithm) (XTEA), encrypt
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([II)V")
	public final void tinyenc(@OriginalArg(0) int[] key) {
		@Pc(17) int blocks = this.pos / 8;
		this.pos = 0;

		for (@Pc(22) int i = 0; i < blocks; i++) {
			@Pc(28) int v0 = this.g4();
			@Pc(32) int v1 = this.g4();
			@Pc(34) int sum = 0;
			@Pc(38) int rounds = 32;

			while (rounds-- > 0) {
				v0 += sum + key[sum & 0x3] ^ v1 + (v1 >>> 5 ^ v1 << 4);
				sum += 0x9E3779B9; // hello golden ratio
				v1 += v0 + (v0 >>> 5 ^ v0 << 4) ^ key[sum >>> 11 & 0x3] + sum;
			}

			this.pos -= 8;
			this.p4(v0);
			this.p4(v1);
		}
	}

	// get, 1 byte, add to
	@OriginalMember(owner = "client!bt", name = "q", descriptor = "(B)I")
	public final int g1add() {
		return this.data[this.pos++] - 128 & 0xFF;
	}
}
