import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public class Buffer extends Class2 {

	@OriginalMember(owner = "client!bt", name = "kb", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!bt", name = "U", descriptor = "I")
	public int position;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
	public Buffer(@OriginalArg(0) int arg0) {
		this.aByteArray73 = Static48.method1465(arg0);
		this.position = 0;
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "([B)V")
	public Buffer(@OriginalArg(0) byte[] arg0) {
		this.position = 0;
		this.aByteArray73 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)J")
	public final long method4798() {
		@Pc(10) long local10 = (long) this.g4() & 0xFFFFFFFFL;
		@Pc(19) long local19 = (long) this.g4() & 0xFFFFFFFFL;
		return local19 + (local10 << 32);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIIZ)V")
	public final void method4799(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray73[this.position++];
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I")
	public final int method4800() {
		this.position += 2;
		@Pc(38) int local38 = (this.aByteArray73[this.position - 1] - 128 & 0xFF) + ((this.aByteArray73[this.position - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)B")
	public final byte method4801() {
		return (byte) -this.aByteArray73[this.position++];
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I")
	public final int method4802(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = Static80.method5981(this.position, arg0, this.aByteArray73);
		this.p4(local18);
		return local18;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Z)I")
	public final int method4803() {
		this.position += 2;
		return (this.aByteArray73[this.position - 2] & 0xFF) + ((this.aByteArray73[this.position - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)I")
	public final int method4804() {
		return -this.aByteArray73[this.position++] & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V")
	public final void method4805(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.position++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 24);
		this.aByteArray73[this.position++] = (byte) arg0;
		this.aByteArray73[this.position++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I")
	public final int method4806() {
		this.position += 2;
		return (this.aByteArray73[this.position - 1] - 128 & 0xFF) + ((this.aByteArray73[this.position - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIJ)V")
	public final void method4807(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(25) int local25 = local2 * 8; local25 >= 0; local25 -= 8) {
			this.aByteArray73[this.position++] = (byte) (arg1 >> local25);
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(Z)Z")
	public final boolean method4808() {
		this.position -= 4;
		@Pc(23) int local23 = Static80.method5981(this.position, 0, this.aByteArray73);
		@Pc(27) int local27 = this.g4();
		return local27 == local23;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String method4809() {
		@Pc(14) int local14 = this.position;
		while (this.aByteArray73[this.position++] != 0) {
		}
		@Pc(37) int local37 = this.position - local14 - 1;
		return local37 == 0 ? "" : Static47.method1462(local14, this.aByteArray73, local37);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)I")
	public final int method4811() {
		return 128 - this.aByteArray73[this.position++] & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(B)I")
	public final int method4812() {
		@Pc(21) byte local21 = this.aByteArray73[this.position++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray73[this.position++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)V")
	public final void p4(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.position++] = (byte) (arg0 >> 24);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.position++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(IB)V")
	public final void method4814(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.position++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(B)I")
	public final int g1() {
		return this.aByteArray73[this.position++] & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(B)I")
	public final int method4816() {
		this.position += 2;
		@Pc(33) int local33 = (this.aByteArray73[this.position - 2] - 128 & 0xFF) + ((this.aByteArray73[this.position - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(B)I")
	public final int gsmart() {
		@Pc(16) int local16 = this.aByteArray73[this.position] & 0xFF;
		return local16 >= 128 ? this.method4829() - 32768 : this.g1();
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(B)I")
	public final int method4818() {
		@Pc(19) int local19 = this.aByteArray73[this.position] & 0xFF;
		return local19 >= 128 ? this.method4829() - 49152 : this.g1() + -64;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)V")
	public final void method4819(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.position++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[II)V")
	public final void method4821(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(16) int local16 = this.position;
		this.position = 5;
		@Pc(25) int local25 = (arg1 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = this.g4();
			@Pc(37) int local37 = this.g4();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= arg0[local39 >>> 11 & 0x3] + local39 ^ (local33 >>> 5 ^ local33 << 4) + local33;
				local39 -= -1640531527;
				local33 -= (local37 >>> 5 ^ local37 << 4) + local37 ^ arg0[local39 & 0x3] + local39;
			}
			this.position -= 8;
			this.p4(local33);
			this.p4(local37);
		}
		this.position = local16;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method4822(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.position += Static350.method5839(arg0.length(), arg0, this.aByteArray73, this.position);
		this.aByteArray73[this.position++] = 0;
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(B)I")
	public final int method4823() {
		this.position += 2;
		@Pc(37) int local37 = ((this.aByteArray73[this.position - 2] & 0xFF) << 8) + (this.aByteArray73[this.position - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(BI)V")
	public final void method4824(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.p1(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4843(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)B")
	public final byte method4825() {
		return this.aByteArray73[this.position++];
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZI)V")
	public final void method4826(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.position - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray73[this.position - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray73[this.position - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray73[this.position - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(BI)V")
	public final void method4827(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.position++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(B)I")
	public final int method4829() {
		this.position += 2;
		return ((this.aByteArray73[this.position - 2] & 0xFF) << 8) + (this.aByteArray73[this.position - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(II)V")
	public final void method4830(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.position++] = (byte) arg0;
		this.aByteArray73[this.position++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI)V")
	public final void method4831(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(15) int local15 = arg1 - 1; local15 >= 0; local15--) {
			arg0[local15] = this.aByteArray73[this.position++];
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V")
	public final void method4832(@OriginalArg(1) long arg0) {
		this.aByteArray73[this.position++] = (byte) (arg0 >> 56);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 48);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 40);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 32);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 24);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.position++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)I")
	public final int method4833() {
		this.position += 3;
		return (this.aByteArray73[this.position - 1] & 0xFF) + (((this.aByteArray73[this.position - 3] & 0xFF) << 16) + ((this.aByteArray73[this.position - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method4834(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.position;
		this.position = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4799(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(36) BigInteger local36 = local23.modPow(arg1, arg0);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.position = 0;
		this.p1(local39.length);
		this.method4857(local39, local39.length);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(Z)I")
	public final int method4835() {
		this.position += 4;
		return ((this.aByteArray73[this.position - 4] & 0xFF) << 16) + (((this.aByteArray73[this.position - 3] & 0xFF) << 24) + ((this.aByteArray73[this.position - 1] & 0xFF) << 8) + (this.aByteArray73[this.position + -2] & 0xFF));
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(I)I")
	public final int g4() {
		this.position += 4;
		return ((this.aByteArray73[this.position - 3] & 0xFF) << 16) + ((this.aByteArray73[this.position - 4] & 0xFF) << 24) + ((this.aByteArray73[this.position + -2] & 0xFF) << 8) + (this.aByteArray73[this.position + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(BI)V")
	public final void method4837(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.position++] = (byte) arg0;
		this.aByteArray73[this.position++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(II)V")
	public final void method4838(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.position++] = (byte) (arg0 + 128);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "(B)I")
	public final int method4839() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.gsmart();
		while (local16 == 32767) {
			local16 = this.gsmart();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(BI)V")
	public final void method4840(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.position++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.position++] = (byte) arg0;
		this.aByteArray73[this.position++] = (byte) (arg0 >> 24);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(I)B")
	public final byte method4841() {
		return (byte) (128 - this.aByteArray73[this.position++]);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(II)V")
	public final void p1(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.position++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(II)V")
	public final void method4843(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.position++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.position++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(B)I")
	public final int method4844() {
		this.position += 4;
		return ((this.aByteArray73[this.position - 1] & 0xFF) << 24) + ((this.aByteArray73[this.position - 2] & 0xFF) << 16) + ((this.aByteArray73[this.position + -3] & 0xFF) << 8) + (this.aByteArray73[this.position + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(II)V")
	public final void method4845(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.position++] = (byte) arg0;
		this.aByteArray73[this.position++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(II)V")
	public final void method4846(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.position++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.position++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(BI)V")
	public final void method4848(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.position++] = (byte) arg0;
		this.aByteArray73[this.position++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.position++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(BI)V")
	public final void method4849(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.p1(arg0 >>> 28 | 0x80);
					}
					this.p1(arg0 >>> 21 | 0x80);
				}
				this.p1(arg0 >>> 14 | 0x80);
			}
			this.p1(arg0 >>> 7 | 0x80);
		}
		this.p1(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(B)I")
	public final int method4850() {
		this.position += 2;
		@Pc(31) int local31 = (this.aByteArray73[this.position - 2] & 0xFF) + ((this.aByteArray73[this.position - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(II)V")
	public final void method4851(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.position - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray73[this.position - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(I)I")
	public final int method4852() {
		this.position += 4;
		return ((this.aByteArray73[this.position - 2] & 0xFF) << 24) + (((this.aByteArray73[this.position - 1] & 0xFF) << 16) + (this.aByteArray73[this.position - 4] << 8 & 0xFF00)) + (this.aByteArray73[this.position + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "(B)I")
	public final int method4853() {
		this.position += 2;
		return ((this.aByteArray73[this.position - 1] & 0xFF) << 8) + (this.aByteArray73[this.position - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "(B)B")
	public final byte method4854() {
		return (byte) (this.aByteArray73[this.position++] - 128);
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(IB)V")
	public final void method4855(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.position++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.position++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String gjstr2() {
		@Pc(14) byte local14 = this.aByteArray73[this.position++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.position;
		while (this.aByteArray73[this.position++] != 0) {
		}
		@Pc(55) int local55 = this.position - local27 - 1;
		return local55 == 0 ? "" : Static47.method1462(local27, this.aByteArray73, local55);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI[BI)V")
	public final void method4857(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1; local8++) {
			this.aByteArray73[this.position++] = arg0[local8];
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIII)V")
	public final void method4858(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray73[this.position++] - 128);
		}
	}

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "(B)Ljava/lang/String;")
	public final String method4859() {
		if (this.aByteArray73[this.position] == 0) {
			this.position++;
			return null;
		} else {
			return this.method4809();
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(ZI)J")
	public final long method4860(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local2 * 8;
		@Pc(24) long local24 = 0L;
		while (local22 >= 0) {
			local24 |= ((long) this.aByteArray73[this.position++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local24;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(ZI)V")
	public final void method4861(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.position - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([II)V")
	public final void method4862(@OriginalArg(0) int[] arg0) {
		@Pc(17) int local17 = this.position / 8;
		this.position = 0;
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			@Pc(28) int local28 = this.g4();
			@Pc(32) int local32 = this.g4();
			@Pc(34) int local34 = 0;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local28 += local34 + arg0[local34 & 0x3] ^ local32 + (local32 >>> 5 ^ local32 << 4);
				local34 += -1640531527;
				local32 += local28 + (local28 >>> 5 ^ local28 << 4) ^ arg0[local34 >>> 11 & 0x3] + local34;
			}
			this.position -= 8;
			this.p4(local28);
			this.p4(local32);
		}
	}

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "(B)I")
	public final int method4863() {
		return this.aByteArray73[this.position++] - 128 & 0xFF;
	}
}
