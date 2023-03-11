import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!e")
public final class Buffer extends Node {

	@OriginalMember(owner = "unpackclass!e", name = "f", descriptor = "[I")
	private static final int[] anIntArray536 = new int[256];

	@OriginalMember(owner = "unpackclass!e", name = "g", descriptor = "[J")
	private static final long[] aLongArray13;

	@OriginalMember(owner = "unpackclass!e", name = "d", descriptor = "[B")
	public byte[] aByteArray100;

	@OriginalMember(owner = "unpackclass!e", name = "e", descriptor = "I")
	public int anInt7287;

	static {
		@Pc(9) int local9;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray536[local4] = local7;
		}
		aLongArray13 = new long[256];
		for (local9 = 0; local9 < 256; local9++) {
			@Pc(47) long local47 = (long) local9;
			for (@Pc(49) int local49 = 0; local49 < 8; local49++) {
				if ((local47 & 0x1L) == 1L) {
					local47 = local47 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local47 >>>= 0x1;
				}
			}
			aLongArray13[local9] = local47;
		}
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "([BII)I")
	private static int method6578(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			local3 = local3 >>> 8 ^ anIntArray536[(local3 ^ arg0[local5]) & 0xFF];
		}
		return ~local3;
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "([BI)I")
	public static int method6579(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return method6578(arg0, arg1);
	}

	@OriginalMember(owner = "unpackclass!e", name = "<init>", descriptor = "(I)V")
	public Buffer(@OriginalArg(0) int arg0) {
		this.aByteArray100 = BufferPool.method6573(arg0);
		this.anInt7287 = 0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "<init>", descriptor = "([B)V")
	public Buffer(@OriginalArg(0) byte[] arg0) {
		this.aByteArray100 = arg0;
		this.anInt7287 = 0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "(I)V")
	public void method6580(@OriginalArg(0) int arg0) {
		this.aByteArray100[this.anInt7287++] = (byte) arg0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "b", descriptor = "(I)V")
	public void method6581(@OriginalArg(0) int arg0) {
		this.aByteArray100[this.anInt7287++] = (byte) (arg0 >> 8);
		this.aByteArray100[this.anInt7287++] = (byte) arg0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "c", descriptor = "(I)V")
	public void method6582(@OriginalArg(0) int arg0) {
		this.aByteArray100[this.anInt7287++] = (byte) (arg0 >> 24);
		this.aByteArray100[this.anInt7287++] = (byte) (arg0 >> 16);
		this.aByteArray100[this.anInt7287++] = (byte) (arg0 >> 8);
		this.aByteArray100[this.anInt7287++] = (byte) arg0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "(J)V")
	public void method6583(@OriginalArg(0) long arg0) {
		this.aByteArray100[this.anInt7287++] = (byte) (arg0 >> 56);
		this.aByteArray100[this.anInt7287++] = (byte) (arg0 >> 48);
		this.aByteArray100[this.anInt7287++] = (byte) (arg0 >> 40);
		this.aByteArray100[this.anInt7287++] = (byte) (arg0 >> 32);
		this.aByteArray100[this.anInt7287++] = (byte) (arg0 >> 24);
		this.aByteArray100[this.anInt7287++] = (byte) (arg0 >> 16);
		this.aByteArray100[this.anInt7287++] = (byte) (arg0 >> 8);
		this.aByteArray100[this.anInt7287++] = (byte) arg0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "b", descriptor = "([BII)V")
	public void method6584(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray100[this.anInt7287++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "unpackclass!e", name = "c", descriptor = "()I")
	public int method6585() {
		return this.aByteArray100[this.anInt7287++] & 0xFF;
	}

	@OriginalMember(owner = "unpackclass!e", name = "d", descriptor = "()I")
	public int method6586() {
		this.anInt7287 += 2;
		return ((this.aByteArray100[this.anInt7287 - 2] & 0xFF) << 8) + (this.aByteArray100[this.anInt7287 - 1] & 0xFF);
	}

	@OriginalMember(owner = "unpackclass!e", name = "e", descriptor = "()I")
	public int method6587() {
		this.anInt7287 += 2;
		@Pc(27) int local27 = ((this.aByteArray100[this.anInt7287 - 2] & 0xFF) << 8) + (this.aByteArray100[this.anInt7287 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "unpackclass!e", name = "f", descriptor = "()I")
	public int method6588() {
		this.anInt7287 += 4;
		return ((this.aByteArray100[this.anInt7287 - 4] & 0xFF) << 24) + ((this.aByteArray100[this.anInt7287 - 3] & 0xFF) << 16) + ((this.aByteArray100[this.anInt7287 - 2] & 0xFF) << 8) + (this.aByteArray100[this.anInt7287 - 1] & 0xFF);
	}

	@OriginalMember(owner = "unpackclass!e", name = "c", descriptor = "([BII)V")
	public void method6589(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray100[this.anInt7287++];
		}
	}

	@OriginalMember(owner = "unpackclass!e", name = "g", descriptor = "()I")
	public int method6590() {
		@Pc(7) int local7 = this.aByteArray100[this.anInt7287] & 0xFF;
		return local7 < 128 ? this.method6585() : this.method6586() - 32768;
	}

	@OriginalMember(owner = "unpackclass!e", name = "h", descriptor = "()I")
	public int method6591() {
		@Pc(12) byte local12 = this.aByteArray100[this.anInt7287++];
		@Pc(14) int local14 = 0;
		while (local12 < 0) {
			local14 = (local14 | local12 & 0x7F) << 7;
			local12 = this.aByteArray100[this.anInt7287++];
		}
		return local14 | local12;
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "([III)V")
	public void method6592(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt7287;
		this.anInt7287 = 5;
		@Pc(13) int local13 = (arg1 - 5) / 8;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(20) int local20 = this.method6588();
			@Pc(23) int local23 = this.method6588();
			@Pc(25) int local25 = -957401312;
			@Pc(29) int local29 = 32;
			while (local29-- > 0) {
				local23 -= (local20 << 4 ^ local20 >>> 5) + local20 ^ local25 + arg0[local25 >>> 11 & 0x3];
				local25 -= -1640531527;
				local20 -= (local23 << 4 ^ local23 >>> 5) + local23 ^ local25 + arg0[local25 & 0x3];
			}
			this.anInt7287 -= 8;
			this.method6582(local20);
			this.method6582(local23);
		}
		this.anInt7287 = local4;
	}
}
