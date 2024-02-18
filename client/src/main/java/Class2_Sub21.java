import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
	public int anInt8388;

	@OriginalMember(owner = "client!ge", name = "ib", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Class2_Sub21(@OriginalArg(0) int arg0) {
		this.anInt8388 = 0;
		this.aByteArray93 = Static200.method2981(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([B)V")
	public Class2_Sub21(@OriginalArg(0) byte[] arg0) {
		this.aByteArray93 = arg0;
		this.anInt8388 = 0;
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(B)I")
	public final int method7339() {
		this.anInt8388 += 4;
		return (this.aByteArray93[this.anInt8388 - 4] & 0xFF) + ((this.aByteArray93[this.anInt8388 - 2] & 0xFF) << 16) + ((this.aByteArray93[this.anInt8388 + -1] & 0xFF) << 24) + ((this.aByteArray93[this.anInt8388 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "(I)I")
	public final int method7340() {
		this.anInt8388 += 4;
		return ((this.aByteArray93[this.anInt8388 - 1] & 0xFF) << 16) + (((this.aByteArray93[this.anInt8388 - 2] & 0xFF) << 24) - (-((this.aByteArray93[this.anInt8388 - 4] & 0xFF) << 8) - (this.aByteArray93[this.anInt8388 - 3] & 0xFF)));
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(IZ)V")
	public final void method7341(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(BI)V")
	public final void method7342(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt8388++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method7343() {
		@Pc(14) byte local14 = this.aByteArray93[this.anInt8388++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt8388;
		while (this.aByteArray93[this.anInt8388++] != 0) {
		}
		@Pc(55) int local55 = this.anInt8388 - local27 - 1;
		return local55 == 0 ? "" : Static350.method5126(local27, this.aByteArray93, local55);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[BI)V")
	public final void method7344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(1) int local1 = arg0; local1 < arg1 + arg0; local1++) {
			arg2[local1] = this.aByteArray93[this.anInt8388++];
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(Z)I")
	public final int method7345() {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9;
		for (local9 = this.method7390(); local9 == 32767; local9 = this.method7390()) {
			local5 += 32767;
		}
		return local5 + local9;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(Z)I")
	public final int method7346() {
		if (this.aByteArray93[this.anInt8388] < 0) {
			return this.method7349() & Integer.MAX_VALUE;
		} else {
			@Pc(26) int local26 = this.method7382();
			return local26 == 32767 ? -1 : local26;
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(IB)V")
	public final void method7347(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt8388++] = (byte) arg0;
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)B")
	public final byte method7348() {
		return (byte) (128 - this.aByteArray93[this.anInt8388++]);
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)I")
	public final int method7349() {
		this.anInt8388 += 4;
		return ((this.aByteArray93[this.anInt8388 - 4] & 0xFF) << 24) - (-((this.aByteArray93[this.anInt8388 - 3] & 0xFF) << 16) - ((this.aByteArray93[this.anInt8388 - 2] & 0xFF) << 8) - (this.aByteArray93[this.anInt8388 + -1] & 0xFF));
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)V")
	public final void method7350(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt8388++] = (byte) arg0;
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)I")
	public final int method7351() {
		this.anInt8388 += 4;
		return (this.aByteArray93[this.anInt8388 - 4] & 0xFF) + (((this.aByteArray93[this.anInt8388 - 1] & 0xFF) << 24) + ((this.aByteArray93[this.anInt8388 - 2] & 0xFF) << 16) + ((this.aByteArray93[this.anInt8388 + -3] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(II)V")
	public final void method7352(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method7389(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method7373(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IZ)I")
	public final int method7353(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = Static12.method5163(this.anInt8388, arg0, this.aByteArray93);
		this.method7342(local18);
		return local18;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)V")
	public final void method7354(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) arg0;
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([II)V")
	public final void method7355(@OriginalArg(0) int[] arg0) {
		@Pc(17) int local17 = this.anInt8388 / 8;
		this.anInt8388 = 0;
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			@Pc(28) int local28 = this.method7349();
			@Pc(32) int local32 = this.method7349();
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= (local28 >>> 5 ^ local28 << 4) + local28 ^ local34 - -arg0[local34 >>> 11 & 0x3];
				local34 -= -1640531527;
				local28 -= local34 + arg0[local34 & 0x3] ^ local32 + (local32 << 4 ^ local32 >>> 5);
			}
			this.anInt8388 -= 8;
			this.method7342(local28);
			this.method7342(local32);
		}
	}

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "(I)I")
	public final int method7356() {
		this.anInt8388 += 2;
		@Pc(42) int local42 = (this.aByteArray93[this.anInt8388 - 1] & 0xFF) + ((this.aByteArray93[this.anInt8388 - 2] & 0xFF) << 8);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public final void method7357(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt8388 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt8388 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method7358() {
		@Pc(6) int local6 = this.anInt8388;
		while (this.aByteArray93[this.anInt8388++] != 0) {
		}
		@Pc(29) int local29 = this.anInt8388 - local6 - 1;
		return local29 == 0 ? "" : Static350.method5126(local6, this.aByteArray93, local29);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)J")
	public final long method7359() {
		@Pc(16) long local16 = (long) this.method7351() & 0xFFFFFFFFL;
		@Pc(23) long local23 = (long) this.method7351() & 0xFFFFFFFFL;
		return local16 + (local23 << 32);
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "(I)I")
	public final int method7360() {
		@Pc(11) int local11 = this.aByteArray93[this.anInt8388] & 0xFF;
		return local11 < 128 ? this.method7396() - 64 : this.method7382() + -49152;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public final void method7361(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr2");
		}
		this.aByteArray93[this.anInt8388++] = 0;
		this.anInt8388 += Static331.method4926(arg0, arg0.length(), this.aByteArray93, this.anInt8388);
		this.aByteArray93[this.anInt8388++] = 0;
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(II)V")
	public final void method7362(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) arg0;
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JI)V")
	public final void method7363(@OriginalArg(0) long arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) (int) (arg0 >> 56);
		this.aByteArray93[this.anInt8388++] = (byte) (int) (arg0 >> 48);
		this.aByteArray93[this.anInt8388++] = (byte) (int) (arg0 >> 40);
		this.aByteArray93[this.anInt8388++] = (byte) (int) (arg0 >> 32);
		this.aByteArray93[this.anInt8388++] = (byte) (int) (arg0 >> 24);
		this.aByteArray93[this.anInt8388++] = (byte) (int) (arg0 >> 16);
		this.aByteArray93[this.anInt8388++] = (byte) (int) (arg0 >> 8);
		this.aByteArray93[this.anInt8388++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)I")
	public final int method7364() {
		return this.aByteArray93[this.anInt8388] >= 0 ? this.method7382() : this.method7349() & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "(I)V")
	public final void method7365() {
		if (this.aByteArray93 != null) {
			Static200.method2979(this.aByteArray93);
		}
		this.aByteArray93 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIZI)V")
	public final void method7366(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anInt8388;
		this.anInt8388 = arg1;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(22) int local22 = this.method7349();
			@Pc(26) int local26 = this.method7349();
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = 32;
			while (local32-- > 0) {
				local22 += local26 + (local26 << 4 ^ local26 >>> 5) ^ local28 + arg0[local28 & 0x3];
				local28 += -1640531527;
				local26 += (local22 >>> 5 ^ local22 << 4) + local22 ^ local28 + arg0[local28 >>> 11 & 0xE8C00003];
			}
			this.anInt8388 -= 8;
			this.method7342(local22);
			this.method7342(local26);
		}
		this.anInt8388 = local6;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(IB)V")
	public final void method7367(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt8388 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt8388 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt8388 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt8388 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIJ)V")
	public final void method7369(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(30) int local30 = local0 * 8; local30 >= 0; local30 -= 8) {
			this.aByteArray93[this.anInt8388++] = (byte) (int) (arg1 >> local30);
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)V")
	public final void method7370(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 + 128);
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)I")
	public final int method7371() {
		this.anInt8388 += 4;
		return ((this.aByteArray93[this.anInt8388 - 4] & 0xFF) << 16) + (((this.aByteArray93[this.anInt8388 - 3] & 0xFF) << 24) + ((this.aByteArray93[this.anInt8388 - 1] & 0xFF) << 8)) + (this.aByteArray93[this.anInt8388 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)I")
	public final int method7372() {
		this.anInt8388 += 2;
		return ((this.aByteArray93[this.anInt8388 - 1] & 0xFF) << 8) + (this.aByteArray93[this.anInt8388 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "(II)V")
	public final void method7373(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt8388++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "(I)I")
	public final int method7374() {
		return this.aByteArray93[this.anInt8388++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "(I)I")
	public final int method7375() {
		this.anInt8388 += 2;
		@Pc(33) int local33 = ((this.aByteArray93[this.anInt8388 - 1] & 0xFF) << 8) + (this.aByteArray93[this.anInt8388 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I")
	public final int method7376() {
		return 128 - this.aByteArray93[this.anInt8388++] & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(B)B")
	public final byte method7377() {
		return this.aByteArray93[this.anInt8388++];
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(II)V")
	public final void method7378(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) arg0;
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Z")
	public final boolean method7379() {
		this.anInt8388 -= 4;
		@Pc(17) int local17 = Static12.method5163(this.anInt8388, 0, this.aByteArray93);
		@Pc(21) int local21 = this.method7349();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IB)V")
	public final void method7380(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt8388 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)I")
	public final int method7381() {
		this.anInt8388 += 2;
		@Pc(39) int local39 = (this.aByteArray93[this.anInt8388 - 2] & 0xFF) + ((this.aByteArray93[this.anInt8388 - 1] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)I")
	public final int method7382() {
		this.anInt8388 += 2;
		return (this.aByteArray93[this.anInt8388 - 1] & 0xFF) + ((this.aByteArray93[this.anInt8388 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "(I)I")
	public final int method7383() {
		this.anInt8388 += 3;
		return ((this.aByteArray93[this.anInt8388 - 2] & 0xFF) << 8) + ((this.aByteArray93[this.anInt8388 - 3] & 0xFF) << 16) + (this.aByteArray93[this.anInt8388 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)V")
	public final void method7384(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method7385(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt8388;
		this.anInt8388 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method7344(0, local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt8388 = 0;
		this.method7373(local31.length);
		this.method7386(local31.length, local31, 0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB[BI)V")
	public final void method7386(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(6) int local6 = arg2; local6 < arg0 + arg2; local6++) {
			this.aByteArray93[this.anInt8388++] = arg1[local6];
		}
	}

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "(I)I")
	public final int method7387() {
		this.anInt8388 += 2;
		return ((this.aByteArray93[this.anInt8388 - 2] & 0xFF) << 8) + (this.aByteArray93[this.anInt8388 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
	public final void method7388(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt8388++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
	public final void method7389(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(Z)I")
	public final int method7390() {
		@Pc(20) int local20 = this.aByteArray93[this.anInt8388] & 0xFF;
		return local20 < 128 ? this.method7396() : this.method7382() - 32768;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method7391(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt8388 += Static331.method4926(arg0, arg0.length(), this.aByteArray93, this.anInt8388);
		this.aByteArray93[this.anInt8388++] = 0;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)I")
	public final int method7392() {
		this.anInt8388 += 3;
		@Pc(43) int local43 = (this.aByteArray93[this.anInt8388 - 1] & 0xFF) + ((this.aByteArray93[this.anInt8388 - 3] & 0xFF) << 16) + ((this.aByteArray93[this.anInt8388 + -2] & 0xFF) << 8);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)V")
	public final void method7393(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[III)V")
	public final void method7394(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt8388;
		this.anInt8388 = 5;
		@Pc(16) int local16 = (arg1 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local16; local27++) {
			@Pc(34) int local34 = this.method7349();
			@Pc(38) int local38 = this.method7349();
			@Pc(40) int local40 = -957401312;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local38 -= (local34 << 4 ^ local34 >>> 5) + local34 ^ arg0[local40 >>> 11 & 0x3] + local40;
				local40 -= -1640531527;
				local34 -= local38 + (local38 >>> 5 ^ local38 << 4) ^ local40 - -arg0[local40 & 0x3];
			}
			this.anInt8388 -= 8;
			this.method7342(local34);
			this.method7342(local38);
		}
		this.anInt8388 = local6;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(II)V")
	public final void method7395(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method7389(arg0 >>> 28 | 0x80);
					}
					this.method7389(arg0 >>> 21 | 0x80);
				}
				this.method7389(arg0 >>> 14 | 0x80);
			}
			this.method7389(arg0 >>> 7 | 0x80);
		}
		this.method7389(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "(I)I")
	public final int method7396() {
		return this.aByteArray93[this.anInt8388++] & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "(I)J")
	public final long method7398() {
		@Pc(10) long local10 = (long) this.method7349() & 0xFFFFFFFFL;
		@Pc(19) long local19 = (long) this.method7349() & 0xFFFFFFFFL;
		return local19 + (local10 << 32);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)B")
	public final byte method7399() {
		return (byte) -this.aByteArray93[this.anInt8388++];
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(II)V")
	public final void method7400(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) arg0;
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt8388++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(Z)I")
	public final int method7401() {
		return -this.aByteArray93[this.anInt8388++] & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)I")
	public final int method7402() {
		@Pc(14) byte local14 = this.aByteArray93[this.anInt8388++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray93[this.anInt8388++];
		}
		return local14 | local16;
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String method7403() {
		if (this.aByteArray93[this.anInt8388] == 0) {
			this.anInt8388++;
			return null;
		} else {
			return this.method7358();
		}
	}

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "(I)J")
	public final long method7404() {
		@Pc(16) long local16 = (long) this.method7396() & 0xFFFFFFFFL;
		@Pc(23) long local23 = (long) this.method7349() & 0xFFFFFFFFL;
		return local23 + (local16 << 32);
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)B")
	public final byte method7405() {
		return (byte) (this.aByteArray93[this.anInt8388++] - 128);
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(Z)I")
	public final int method7406() {
		this.anInt8388 += 2;
		return ((this.aByteArray93[this.anInt8388 - 1] & 0xFF) << 8) + (this.aByteArray93[this.anInt8388 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(II)J")
	public final long method7407(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(25) int local25 = local6 * 8;
		@Pc(27) long local27 = 0L;
		while (local25 >= 0) {
			local27 |= ((long) this.aByteArray93[this.anInt8388++] & 0xFFL) << local25;
			local25 -= 8;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "(II)V")
	public final void method7408(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt8388++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)I")
	public final int method7409() {
		this.anInt8388 += 3;
		return ((this.aByteArray93[this.anInt8388 - 3] & 0xFF) << 16) - (-((this.aByteArray93[this.anInt8388 - 1] & 0xFF) << 8) - (this.aByteArray93[this.anInt8388 - 2] & 0xFF));
	}
}
