import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

// legend:
// "p" prefix - put value
// "g" prefix - get value
// "i" prefix - inverse (little-endian) dealing with other libraries (i.e. audio or OpenGL)
// byte suffix - size/data type - b means "byte" (signed -128 to 127) and s means signed (for its data type)
// "alt" suffix - packet obfuscation type (alt read/write methods)

// alt methods can appear to be "missing" as the *original* obfuscator will remove unused methods
// alt1/2/3 are not randomly assigned names

// later on, gsmart/gsmarts is called gSmart1or2(s) (probably with the introduction of gSmart2or4)

@OriginalClass("client!bt")
public class Packet extends Node {

	@OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
	public static final int[] CRC32_TABLE = new int[256];

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "[J")
	public static final long[] CRC64_TABLE = new long[256];

	@OriginalMember(owner = "client!bt", name = "kb", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!bt", name = "U", descriptor = "I")
	public int pos;

	static {
		for (@Pc(4) int i = 0; i < 256; i++) {
			@Pc(7) int remainder = i;
			for (@Pc(9) int b = 0; b < 8; b++) {
				if ((remainder & 0x1) == 1) {
					remainder = remainder >>> 1 ^ 0xEDB88320;
				} else {
					remainder >>>= 0x1;
				}
			}
			CRC32_TABLE[i] = remainder;
		}

		for (@Pc(43) int i = 0; i < 256; i++) {
			@Pc(47) long remainder = i;
			for (@Pc(49) int b = 0; b < 8; b++) {
				if ((remainder & 0x1L) == 1L) {
					remainder = remainder >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					remainder >>>= 0x1;
				}
			}
			CRC64_TABLE[i] = remainder;
		}
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
	public Packet(@OriginalArg(0) int size) {
		this.data = ByteArrayPool.alloc(size);
		this.pos = 0;
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "([B)V")
	public Packet(@OriginalArg(0) byte[] src) {
		this.pos = 0;
		this.data = src;
	}

	// calculate size of pjstr output
	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int pjstrlen(@OriginalArg(1) String str) {
		return str.length() + 1;
	}

	// calculate checksum
	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[B)I")
	public static int getcrc(@OriginalArg(0) int length, @OriginalArg(1) int offset, @OriginalArg(3) byte[] src) {
		@Pc(7) int crc = -1;

		for (@Pc(16) int i = offset; i < length; i++) {
			crc = CRC32_TABLE[(src[i] ^ crc) & 0xFF] ^ crc >>> 8;
		}

		return ~crc;
	}

	// get, 8 bytes
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)J")
	public long g8() {
		@Pc(10) long high = (long) this.g4() & 0xFFFFFFFFL;
		@Pc(19) long low = (long) this.g4() & 0xFFFFFFFFL;
		return low + (high << 32);
	}

	// get, data
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIIZ)V")
	public void gdata(@OriginalArg(0) byte[] src, @OriginalArg(2) int length) {
		for (@Pc(11) int i = 0; i < length; i++) {
			src[i] = this.data[this.pos++];
		}
	}

	// get, 2 bytes signed, alt method 2
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I")
	public int g2s_alt2() {
		this.pos += 2;
		@Pc(38) int value = ((this.data[this.pos - 2] & 0xFF) << 8) | (this.data[this.pos - 1] - 128 & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// get, 1 byte, alt method 2
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)B")
	public byte g1b_alt2() {
		return (byte) -this.data[this.pos++];
	}

	// add checksum
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I")
	public int addcrc(@OriginalArg(0) int off) {
		@Pc(18) int checksum = getcrc(this.pos, off, this.data);
		this.p4(checksum);
		return checksum;
	}

	// get, 2 bytes, alt method 1
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Z)I")
	public int g2_alt1() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) |
				(this.data[this.pos - 2] & 0xFF);
	}

	// get, 1 byte, alt method 2
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)I")
	public int g1_alt2() {
		return -this.data[this.pos++] & 0xFF;
	}

	// put, 4 bytes, alt method 3
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V")
	public void p4_alt3(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
	}

	// get, 2 bytes, alt method 2
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I")
	public int g2_alt2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) | (this.data[this.pos - 1] - 128 & 0xFF);
	}

	// put, variable length long
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIJ)V")
	public void pVarLong(@OriginalArg(1) int length, @OriginalArg(2) long value) {
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
	public boolean checkcrc() {
		this.pos -= 4;

		@Pc(23) int thisCrc = getcrc(this.pos, 0, this.data);
		@Pc(27) int otherCrc = this.g4();
		return otherCrc == thisCrc;
	}

	// get, jag str
	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String gjstr() {
		@Pc(14) int start = this.pos;
		while (this.data[this.pos++] != 0) {}
		@Pc(37) int length = this.pos - start - 1;
		return length == 0 ? "" : Cp1252Charset.decodeString(start, this.data, length);
	}

	// get, 1 byte, alt method 3
	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)I")
	public int g1_alt3() {
		return 128 - this.data[this.pos++] & 0xFF;
	}

	// get, variable length int
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(B)I")
	public int gVarInt() {
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
	public void p4(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	// put, 1 byte, alt method 2
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(IB)V")
	public void p1_alt2(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) -value;
	}

	// get, 1 byte
	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(B)I")
	public int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	// get, 2 bytes signed, alt method 3
	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(B)I")
	public int g2s_alt3() {
		this.pos += 2;
		@Pc(33) int value = ((this.data[this.pos - 1] & 0xFF) << 8) | (this.data[this.pos - 2] - 128 & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// get, smart (range of 0 to 32767)
	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(B)I")
	public int gsmart() {
		@Pc(16) int value = this.data[this.pos] & 0xFF;
		return value >= 128 ? this.g2() - 32768 : this.g1();
	}

	// get, smart signed (range of -16384 to 16383)
	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(B)I")
	public int gsmarts() {
		@Pc(19) int value = this.data[this.pos] & 0xFF;
		return value >= 128 ? this.g2() - 49152 : this.g1() - 64;
	}

	// put, 1 byte, alt method 3
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)V")
	public void p1_alt3(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (128 - value);
	}

	// (extended) tiny (encryption algorithm) (XTEA), decrypt
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[II)V")
	public void tinydec(@OriginalArg(0) int off, @OriginalArg(2) int[] key, @OriginalArg(3) int len) {
		@Pc(25) int blocks = (len - off) / 8;
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

	// put, jag str
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void pjstr(@OriginalArg(0) String str) {
		@Pc(7) int firstNul = str.indexOf(0);
		if (firstNul >= 0) {
			throw new IllegalArgumentException("NUL character at " + firstNul + " - cannot pjstr");
		}

		this.pos += Cp1252Charset.encodeString(str.length(), str, this.data, this.pos);
		this.data[this.pos++] = 0;
	}

	// get, 2 bytes signed
	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(B)I")
	public int g2s() {
		this.pos += 2;
		@Pc(37) int value = ((this.data[this.pos - 2] & 0xFF) << 8) | (this.data[this.pos - 1] & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// put, smart
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(BI)V")
	public void psmart(@OriginalArg(1) int value) {
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
	public byte g1b() {
		return this.data[this.pos++];
	}

	// put, size, 4 bytes
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZI)V")
	public void psize4(@OriginalArg(1) int length) {
		this.data[this.pos - length - 4] = (byte) (length >> 24);
		this.data[this.pos - length - 3] = (byte) (length >> 16);
		this.data[this.pos - length - 2] = (byte) (length >> 8);
		this.data[this.pos - length - 1] = (byte) length;
	}

	// put, 1 byte, alt method 1
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(BI)V")
	public void p1_alt1(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value + 128);
	}

	// get, 2 bytes
	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(B)I")
	public int g2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) | (this.data[this.pos - 1] & 0xFF);
	}

	// put, 2 bytes, alt method 1
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(II)V")
	public void p2_alt1(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
	}

	// put, data, alt method 1
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI)V")
	public void pdata_alt1(@OriginalArg(2) byte[] src, @OriginalArg(3) int length) {
		for (@Pc(15) int i = length - 1; i >= 0; i--) {
			src[i] = this.data[this.pos++];
		}
	}

	// put, 8 bytes
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V")
	public void p8(@OriginalArg(1) long value) {
		this.data[this.pos++] = (byte) (value >> 56);
		this.data[this.pos++] = (byte) (value >> 48);
		this.data[this.pos++] = (byte) (value >> 40);
		this.data[this.pos++] = (byte) (value >> 32);
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	// get, 3 bytes
	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)I")
	public int g3() {
		this.pos += 3;
		return ((this.data[this.pos - 3] & 0xFF) << 16) |
				((this.data[this.pos - 2] & 0xFF) << 8) |
				(this.data[this.pos - 1] & 0xFF);
	}

	// rsa, encrypt
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void rsaenc(@OriginalArg(0) BigInteger modulus, @OriginalArg(2) BigInteger exponent) {
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

	// get, 4 bytes, alt method 3
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(Z)I")
	public int g4_alt3() {
		this.pos += 4;
		return (((this.data[this.pos - 3] & 0xFF) << 24) | ((this.data[this.pos - 4] & 0xFF) << 16) | ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF));
	}

	// get, 4 bytes
	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(I)I")
	public int g4() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 24) | ((this.data[this.pos - 3] & 0xFF) << 16) | ((this.data[this.pos - 2] & 0xFF) << 8) | (this.data[this.pos - 1] & 0xFF);
	}

	// inverse, put, 4 bytes
	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(BI)V")
	public void ip4(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 24);
	}

	// put, 2 bytes, alt method 3
	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(II)V")
	public void p2_alt3(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value + 128);
		this.data[this.pos++] = (byte) (value >> 8);
	}

	// get, extended range of smart values
	@OriginalMember(owner = "client!bt", name = "k", descriptor = "(B)I")
	public int gExtended1or2() {
		@Pc(12) int value = 0;
		@Pc(16) int next = this.gsmart();

		while (next == 32767) {
			next = this.gsmart();
			value += 32767;
		}

		return value + next;
	}

	// put, 4 bytes, alt method 2
	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(BI)V")
	public void p4_alt2(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
	}

	// get, 1 byte signed, alt method 3
	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(I)B")
	public byte g1b_alt3() {
		return (byte) (128 - this.data[this.pos++]);
	}

	// put, 1 byte
	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(II)V")
	public void p1(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) value;
	}

	// put, 2 bytes
	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(II)V")
	public void p2(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	// get, 4 bytes, alt method 1
	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(B)I")
	public int g4_alt1() {
		this.pos += 4;
		return ((this.data[this.pos - 1] & 0xFF) << 24) | ((this.data[this.pos - 2] & 0xFF) << 16) | ((this.data[this.pos - 3] & 0xFF) << 8) | (this.data[this.pos - 4] & 0xFF);
	}

	// inverse, put, 2 bytes
	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(II)V")
	public void ip2(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
	}

	// put, 3 bytes
	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(II)V")
	public void p3(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	// put, 4 bytes, alt method 1
	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(BI)V")
	public void p4_alt1(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 24);
	}

	// put, variable length int
	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(BI)V")
	public void pVarInt(@OriginalArg(1) int value) {
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

	// get, 2 bytes signed, alt method 1
	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(B)I")
	public int g2s_alt1() {
		this.pos += 2;
		@Pc(31) int value = ((this.data[this.pos - 1] & 0xFF) << 8) | (this.data[this.pos - 2] & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// put, size, 2 bytes
	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(II)V")
	public void psize2(@OriginalArg(1) int length) {
		this.data[this.pos - length - 2] = (byte) (length >> 8);
		this.data[this.pos - length - 1] = (byte) length;
	}

	// get, 4 bytes, alt method 2
	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(I)I")
	public int g4_alt2() {
		this.pos += 4;
		return ((this.data[this.pos - 2] & 0xFF) << 24) |
                ((this.data[this.pos - 1] & 0xFF) << 16) |
				((this.data[this.pos - 4] & 0xFF) << 8) |
				this.data[this.pos - 3] & 0xFF;
	}

	// get, 2 bytes, alt method 3
	@OriginalMember(owner = "client!bt", name = "n", descriptor = "(B)I")
	public int g2_alt3() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) |
				(this.data[this.pos - 2] - 128 & 0xFF);
	}

	// get, 1 byte signed, alt method 1
	@OriginalMember(owner = "client!bt", name = "o", descriptor = "(B)B")
	public byte g1b_alt1() {
		return (byte) (this.data[this.pos++] - 128);
	}

	// put, 2 bytes, alt method 2
	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(IB)V")
	public void p2_alt2(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value + 128);
	}

	// get, jag str (versioned)
	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(I)Ljava/lang/String;")
	public String gjstr2() {
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
	public void pdata(@OriginalArg(2) byte[] src, @OriginalArg(3) int length) {
		for (@Pc(8) int i = 0; i < length; i++) {
			this.data[this.pos++] = src[i];
		}
	}

	// get, data, alt method 3
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIII)V")
	public void gdata_alt3(@OriginalArg(0) byte[] src, @OriginalArg(2) int length) {
		for (@Pc(11) int i = length - 1; i >= 0; i--) {
			src[i] = (byte) (this.data[this.pos++] - 128);
		}
	}

	// (fast) get, jag str
	@OriginalMember(owner = "client!bt", name = "p", descriptor = "(B)Ljava/lang/String;")
	public String fastgjstr() {
		if (this.data[this.pos] == 0) {
			this.pos++;
			return null;
		} else {
			return this.gjstr();
		}
	}

	// get, variable length long
	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(ZI)J")
	public long gVarLong(@OriginalArg(1) int len) {
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
	public void psize1(@OriginalArg(1) int length) {
		this.data[this.pos - length - 1] = (byte) length;
	}

	// (eXtended) tiny (encryption algorithm) (XTEA), encrypt
	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([II)V")
	public void tinyenc(@OriginalArg(0) int[] key) {
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

	// get, 1 byte, alt method 1
	@OriginalMember(owner = "client!bt", name = "q", descriptor = "(B)I")
	public int g1_alt1() {
		return this.data[this.pos++] - 128 & 0xFF;
	}
}
