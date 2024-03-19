import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!il", name = "zb", descriptor = "I")
	public int anInt6813;

	@OriginalMember(owner = "client!il", name = "P", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V")
	public Class1_Sub16(@OriginalArg(0) int arg0) {
		this.anInt6813 = 0;
		this.aByteArray86 = Static133.method3027(arg0);
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "([B)V")
	public Class1_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray86 = arg0;
		this.anInt6813 = 0;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(II)J")
	public final long method5723(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = local6 * 8;
		@Pc(22) long local22 = 0L;
		while (local20 >= 0) {
			local22 |= ((long) this.aByteArray86[this.anInt6813++] & 0xFFL) << local20;
			local20 -= 8;
		}
		return local22;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(B)I")
	public final int method5725() {
		this.anInt6813 += 2;
		@Pc(38) int local38 = ((this.aByteArray86[this.anInt6813 - 2] & 0xFF) << 8) + (this.aByteArray86[this.anInt6813 - 1] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method5726(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt6813 += Static88.method1949(this.anInt6813, arg0, arg0.length(), this.aByteArray86);
		this.aByteArray86[this.anInt6813++] = 0;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)Ljava/lang/String;")
	public final String method5727() {
		@Pc(14) byte local14 = this.aByteArray86[this.anInt6813++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt6813;
		while (this.aByteArray86[this.anInt6813++] != 0) {
		}
		@Pc(47) int local47 = this.anInt6813 - local27 - 1;
		return local47 == 0 ? "" : Static200.method3962(local47, local27, this.aByteArray86);
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)I")
	public final int method5728() {
		this.anInt6813 += 2;
		@Pc(39) int local39 = ((this.aByteArray86[this.anInt6813 - 1] & 0xFF) << 8) + (this.aByteArray86[this.anInt6813 - 2] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)I")
	public final int method5729() {
		return 128 - this.aByteArray86[this.anInt6813++] & 0xFF;
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(I)I")
	public final int method5730() {
		this.anInt6813 += 4;
		return (this.aByteArray86[this.anInt6813 - 1] & 0xFF) + ((this.aByteArray86[this.anInt6813 - 4] & 0xFF) << 24) + ((this.aByteArray86[this.anInt6813 - 3] & 0xFF) << 16) + ((this.aByteArray86[this.anInt6813 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(JII)V")
	public final void method5731(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(21) int local21 = local2 * 8; local21 >= 0; local21 -= 8) {
			this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> local21);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)V")
	public final void method5732(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6813++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)V")
	public final void method5733(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6813 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(IB)V")
	public final void method5734(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) arg0;
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(I)I")
	public final int method5735() {
		this.anInt6813 += 4;
		return (this.aByteArray86[this.anInt6813 - 4] & 0xFF) + ((this.aByteArray86[this.anInt6813 - 3] & 0xFF) << 8) + ((this.aByteArray86[this.anInt6813 + -2] & 0xFF) << 16) + ((this.aByteArray86[-1 + this.anInt6813] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(B)B")
	public final byte method5736() {
		return (byte) -this.aByteArray86[this.anInt6813++];
	}

	@OriginalMember(owner = "client!il", name = "g", descriptor = "(I)B")
	public final byte method5737() {
		return (byte) (this.aByteArray86[this.anInt6813++] - 128);
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(B)I")
	public final int method5738() {
		return this.aByteArray86[this.anInt6813++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!il", name = "h", descriptor = "(I)B")
	public final byte method5739() {
		return (byte) (128 - this.aByteArray86[this.anInt6813++]);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II[BI)V")
	public final void method5740(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray86[this.anInt6813++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(II)I")
	public final int method5741(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = Static96.method2039(this.anInt6813, this.aByteArray86, arg0);
		this.method5768(local17);
		return local17;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([BIIB)V")
	public final void method5743(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray86[this.anInt6813++] - 128);
		}
	}

	@OriginalMember(owner = "client!il", name = "i", descriptor = "(I)I")
	public final int method5744() {
		@Pc(16) int local16 = this.aByteArray86[this.anInt6813] & 0xFF;
		return local16 >= 128 ? this.method5749() - 32768 : this.method5761();
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)I")
	public final int method5745() {
		@Pc(23) byte local23 = this.aByteArray86[this.anInt6813++];
		@Pc(25) int local25 = 0;
		while (local23 < 0) {
			local25 = (local23 & 0x7F | local25) << 7;
			local23 = this.aByteArray86[this.anInt6813++];
		}
		return local23 | local25;
	}

	@OriginalMember(owner = "client!il", name = "j", descriptor = "(I)I")
	public final int method5746() {
		this.anInt6813 += 4;
		return (this.aByteArray86[this.anInt6813 - 3] & 0xFF) + ((this.aByteArray86[this.anInt6813 - 2] & 0xFF) << 24) + ((this.aByteArray86[this.anInt6813 - 1] & 0xFF) << 16) + ((this.aByteArray86[this.anInt6813 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!il", name = "k", descriptor = "(I)I")
	public final int method5747() {
		this.anInt6813 += 2;
		@Pc(38) int local38 = (this.aByteArray86[this.anInt6813 - 2] - 128 & 0xFF) + ((this.aByteArray86[this.anInt6813 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(B)I")
	public final int method5748() {
		this.anInt6813 += 2;
		return (this.aByteArray86[this.anInt6813 - 2] & 0xFF) + ((this.aByteArray86[this.anInt6813 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!il", name = "l", descriptor = "(I)I")
	public final int method5749() {
		this.anInt6813 += 2;
		return ((this.aByteArray86[this.anInt6813 - 2] & 0xFF) << 8) + (this.aByteArray86[this.anInt6813 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(II)V")
	public final void method5750(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6813 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt6813 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6813 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6813 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(II)V")
	public final void method5751(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)V")
	public final void method5752(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) arg0;
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BJ)V")
	public final void method5753(@OriginalArg(1) long arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 56);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 48);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 40);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 32);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6813++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I[I)V")
	public final void method5754(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt6813 / 8;
		this.anInt6813 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(23) int local23 = this.method5730();
			@Pc(27) int local27 = this.method5730();
			@Pc(29) int local29 = 0;
			@Pc(33) int local33 = 32;
			while (local33-- > 0) {
				local23 += local29 + arg0[local29 & 0x3] ^ (local27 >>> 5 ^ local27 << 4) - -local27;
				local29 += -1640531527;
				local27 += (local23 >>> 5 ^ local23 << 4) + local23 ^ local29 - -arg0[local29 >>> 11 & 0x3F200003];
			}
			this.anInt6813 -= 8;
			this.method5768(local23);
			this.method5768(local27);
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(Z)I")
	public final int method5755() {
		this.anInt6813 += 3;
		return ((this.aByteArray86[this.anInt6813 - 3] & 0xFF) << 16) + (this.aByteArray86[this.anInt6813 - 2] << 8 & 0xFF00) + (this.aByteArray86[this.anInt6813 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(II)V")
	public final void method5756(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt6813++] = (byte) arg0;
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(IB)V")
	public final void method5757(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6813++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!il", name = "m", descriptor = "(I)I")
	public final int method5758() {
		this.anInt6813 += 2;
		return ((this.aByteArray86[this.anInt6813 - 1] & 0xFF) << 8) + (this.aByteArray86[this.anInt6813 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(ZI)V")
	public final void method5760(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!il", name = "n", descriptor = "(I)I")
	public final int method5761() {
		return this.aByteArray86[this.anInt6813++] & 0xFF;
	}

	@OriginalMember(owner = "client!il", name = "o", descriptor = "(I)I")
	public final int method5762() {
		this.anInt6813 += 2;
		@Pc(37) int local37 = ((this.aByteArray86[this.anInt6813 - 2] & 0xFF) << 8) + (this.aByteArray86[this.anInt6813 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BII[I)V")
	public final void method5763(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(15) int local15 = this.anInt6813;
		this.anInt6813 = 5;
		@Pc(25) int local25 = (arg0 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = this.method5730();
			@Pc(37) int local37 = this.method5730();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= (local33 >>> 5 ^ local33 << 4) + local33 ^ arg1[local39 >>> 11 & 0x37E00003] + local39;
				local39 -= -1640531527;
				local33 -= local37 + (local37 >>> 5 ^ local37 << 4) ^ arg1[local39 & 0x3] + local39;
			}
			this.anInt6813 -= 8;
			this.method5768(local33);
			this.method5768(local37);
		}
		this.anInt6813 = local15;
	}

	@OriginalMember(owner = "client!il", name = "p", descriptor = "(I)I")
	public final int method5764() {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = this.method5744();
		while (local13 == 32767) {
			local13 = this.method5744();
			local7 += 32767;
		}
		return local7 + local13;
	}

	@OriginalMember(owner = "client!il", name = "g", descriptor = "(B)I")
	public final int method5765() {
		this.anInt6813 += 3;
		return ((this.aByteArray86[this.anInt6813 - 3] & 0xFF) << 8) + (this.aByteArray86[this.anInt6813 - 2] << 16 & 0xFF0000) + (this.aByteArray86[this.anInt6813 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!il", name = "q", descriptor = "(I)I")
	public final int method5766() {
		return -this.aByteArray86[this.anInt6813++] & 0xFF;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method5767(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(10) int local10 = this.anInt6813;
		this.anInt6813 = 0;
		@Pc(16) byte[] local16 = new byte[local10];
		this.method5774(local10, local16);
		@Pc(27) BigInteger local27 = new BigInteger(local16);
		@Pc(32) BigInteger local32 = local27.modPow(arg1, arg0);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt6813 = 0;
		this.method5771(local35.length);
		this.method5740(local35, local35.length);
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(IB)V")
	public final void method5768(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6813++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(Z)I")
	public final int method5769() {
		this.anInt6813 += 2;
		return (this.aByteArray86[this.anInt6813 - 1] - 128 & 0xFF) + ((this.aByteArray86[this.anInt6813 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!il", name = "g", descriptor = "(II)V")
	public final void method5770(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 + 128);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!il", name = "h", descriptor = "(II)V")
	public final void method5771(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!il", name = "h", descriptor = "(B)B")
	public final byte method5772() {
		return this.aByteArray86[this.anInt6813++];
	}

	@OriginalMember(owner = "client!il", name = "r", descriptor = "(I)I")
	public final int method5773() {
		this.anInt6813 += 4;
		return ((this.aByteArray86[this.anInt6813 - 1] & 0xFF) << 8) + ((this.aByteArray86[this.anInt6813 - 3] & 0xFF) << 24) + ((this.aByteArray86[this.anInt6813 + -4] & 0xFF) << 16) + (this.aByteArray86[this.anInt6813 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIB[B)V")
	public final void method5774(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = this.aByteArray86[this.anInt6813++];
		}
	}

	@OriginalMember(owner = "client!il", name = "i", descriptor = "(II)V")
	public final void method5775(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) arg0;
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(Z)Ljava/lang/String;")
	public final String method5776() {
		@Pc(6) int local6 = this.anInt6813;
		while (this.aByteArray86[this.anInt6813++] != 0) {
		}
		@Pc(26) int local26 = this.anInt6813 - local6 - 1;
		return local26 == 0 ? "" : Static200.method3962(local26, local6, this.aByteArray86);
	}

	@OriginalMember(owner = "client!il", name = "j", descriptor = "(II)V")
	public final void method5777(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5771(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5757(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!il", name = "k", descriptor = "(II)V")
	public final void method5779(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) arg0;
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(BI)V")
	public final void method5780(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6813++] = (byte) arg0;
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!il", name = "i", descriptor = "(B)I")
	public final int method5781() {
		@Pc(16) int local16 = this.aByteArray86[this.anInt6813] & 0xFF;
		return local16 >= 128 ? this.method5749() - 49152 : this.method5761() + -64;
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(IB)V")
	public final void method5782(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6813++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!il", name = "l", descriptor = "(II)V")
	public final void method5783(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6813++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!il", name = "s", descriptor = "(I)J")
	public final long method5784() {
		@Pc(18) long local18 = (long) this.method5730() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method5730() & 0xFFFFFFFFL;
		return (local18 << 32) + local25;
	}

	@OriginalMember(owner = "client!il", name = "t", descriptor = "(I)Ljava/lang/String;")
	public final String method5785() {
		if (this.aByteArray86[this.anInt6813] == 0) {
			this.anInt6813++;
			return null;
		} else {
			return this.method5776();
		}
	}

	@OriginalMember(owner = "client!il", name = "u", descriptor = "(I)Z")
	public final boolean method5786() {
		this.anInt6813 -= 4;
		@Pc(17) int local17 = Static96.method2039(this.anInt6813, this.aByteArray86, 0);
		@Pc(21) int local21 = this.method5730();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(BI)V")
	public final void method5787(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5771(arg0 >>> 28 | 0x80);
					}
					this.method5771(arg0 >>> 21 | 0x80);
				}
				this.method5771(arg0 >>> 14 | 0x80);
			}
			this.method5771(arg0 >>> 7 | 0x80);
		}
		this.method5771(arg0 & 0x7F);
	}
}
