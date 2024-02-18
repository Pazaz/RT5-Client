import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wla")
public final class Class404 {

	@OriginalMember(owner = "client!wla", name = "o", descriptor = "[J")
	private final long[] aLongArray23 = new long[8];

	@OriginalMember(owner = "client!wla", name = "e", descriptor = "[J")
	private final long[] aLongArray24 = new long[8];

	@OriginalMember(owner = "client!wla", name = "g", descriptor = "[B")
	private final byte[] aByteArray112 = new byte[64];

	@OriginalMember(owner = "client!wla", name = "d", descriptor = "[J")
	private final long[] aLongArray22 = new long[8];

	@OriginalMember(owner = "client!wla", name = "n", descriptor = "I")
	private int anInt10807 = 0;

	@OriginalMember(owner = "client!wla", name = "b", descriptor = "[J")
	private final long[] aLongArray26 = new long[8];

	@OriginalMember(owner = "client!wla", name = "m", descriptor = "[B")
	private final byte[] aByteArray113 = new byte[32];

	@OriginalMember(owner = "client!wla", name = "q", descriptor = "I")
	private int anInt10812 = 0;

	@OriginalMember(owner = "client!wla", name = "i", descriptor = "[J")
	private final long[] aLongArray25 = new long[8];

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(I)V")
	public void method9342() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray113[local3] = 0;
		}
		this.anInt10812 = this.anInt10807 = 0;
		this.aByteArray112[0] = 0;
		if (60 < 29) {
			Static715.method9347((String) null, 79, (String) null, -124, false);
		}
		for (@Pc(48) int local48 = 0; local48 < 8; local48++) {
			this.aLongArray22[local48] = 0L;
		}
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(J[BI)V")
	public void method9343(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(24) int local24 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(29) int local29 = this.anInt10812 & 0x7;
		@Pc(31) long local31 = arg0;
		@Pc(33) int local33 = 31;
		@Pc(35) int local35 = 0;
		while (local33 >= 0) {
			local35 += (this.aByteArray113[local33] & 0xFF) + ((int) local31 & 0xFF);
			this.aByteArray113[local33] = (byte) local35;
			local31 >>>= 0x8;
			local35 >>>= 0x8;
			local33--;
		}
		@Pc(96) int local96;
		while (arg0 > 8L) {
			local96 = arg1[local7] << local24 & 0xFF | (arg1[local7 - -1] & 0xFF) >>> 8 - local24;
			if (local96 < 0 || local96 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray112[this.anInt10807] = (byte) (this.aByteArray112[this.anInt10807] | local96 >>> local29);
			this.anInt10812 += 8 - local29;
			this.anInt10807++;
			if (this.anInt10812 == 512) {
				this.method9345();
				this.anInt10812 = this.anInt10807 = 0;
			}
			this.aByteArray112[this.anInt10807] = (byte) (local96 << 8 - local29 & 0xFF);
			this.anInt10812 += local29;
			local7++;
			arg0 -= 8L;
		}
		if (arg0 <= 0L) {
			local96 = 0;
		} else {
			local96 = arg1[local7] << local24 & 0xFF;
			this.aByteArray112[this.anInt10807] = (byte) (this.aByteArray112[this.anInt10807] | local96 >>> local29);
		}
		if (arg0 + (long) local29 < 8L) {
			this.anInt10812 = (int) ((long) this.anInt10812 + arg0);
			return;
		}
		this.anInt10812 += 8 - local29;
		this.anInt10807++;
		arg0 -= (long) (8 - local29);
		if (this.anInt10812 == 512) {
			this.method9345();
			this.anInt10812 = this.anInt10807 = 0;
		}
		this.aByteArray112[this.anInt10807] = (byte) (local96 << 8 - local29 & 0xFF);
		this.anInt10812 += (int) arg0;
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "([BII)V")
	public void method9344(@OriginalArg(0) byte[] arg0) {
		this.aByteArray112[this.anInt10807] = (byte) (this.aByteArray112[this.anInt10807] | 0x80 >>> (this.anInt10812 & 0x7));
		this.anInt10807++;
		if (this.anInt10807 > 32) {
			while (true) {
				if (this.anInt10807 >= 64) {
					this.method9345();
					this.anInt10807 = 0;
					break;
				}
				this.aByteArray112[this.anInt10807++] = 0;
			}
		}
		while (this.anInt10807 < 32) {
			this.aByteArray112[this.anInt10807++] = 0;
		}
		Static734.method7694(this.aByteArray113, 0, this.aByteArray112, 32, 32);
		this.method9345();
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		while (local105 < 8) {
			@Pc(114) long local114 = this.aLongArray22[local105];
			arg0[local107] = (byte) (int) (local114 >>> 56);
			arg0[local107 + 1] = (byte) (int) (local114 >>> 48);
			arg0[local107 + 2] = (byte) (int) (local114 >>> 40);
			arg0[local107 + 3] = (byte) (int) (local114 >>> 32);
			arg0[local107 + 4] = (byte) (int) (local114 >>> 24);
			arg0[local107 + 5] = (byte) (int) (local114 >>> 16);
			arg0[local107 + 6] = (byte) (int) (local114 >>> 8);
			arg0[local107 + 7] = (byte) (int) local114;
			local107 += 8;
			local105++;
		}
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(B)V")
	private void method9345() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray25[local7] = Static315.method4576(Static570.method7548(255L, (long) this.aByteArray112[local9 + 7]), Static315.method4576(Static570.method7548(0xFFL << 8, (long) this.aByteArray112[local9 + 6] << 8), Static315.method4576(Static315.method4576(Static315.method4576(Static315.method4576(Static570.method7548(0xFFL << 40, (long) this.aByteArray112[local9 + 2] << 40), Static315.method4576(Static570.method7548(255L, (long) this.aByteArray112[local9 + 1]) << 48, (long) this.aByteArray112[local9] << 56)), Static570.method7548(0xFFL << 32, (long) this.aByteArray112[local9 + 3] << 32)), Static570.method7548(255L, (long) this.aByteArray112[local9 + 4]) << 24), Static570.method7548((long) this.aByteArray112[local9 + 5], 255L) << 16)));
			local9 += 8;
			local7++;
		}
		for (@Pc(121) int local121 = 0; local121 < 8; local121++) {
			this.aLongArray23[local121] = Static315.method4576(this.aLongArray25[local121], this.aLongArray24[local121] = this.aLongArray22[local121]);
		}
		@Pc(159) int local159;
		for (@Pc(153) int local153 = 1; local153 <= 10; local153++) {
			@Pc(168) int local168;
			@Pc(170) int local170;
			for (local159 = 0; local159 < 8; local159++) {
				this.aLongArray26[local159] = 0L;
				local168 = 0;
				local170 = 56;
				while (local168 < 8) {
					this.aLongArray26[local159] = Static315.method4576(this.aLongArray26[local159], Class90_Sub2_Sub1.aLongArrayArray1[local168][(int) (this.aLongArray24[local159 - local168 & 0x7] >>> local170) & 0xFF]);
					local170 -= 8;
					local168++;
				}
			}
			for (local168 = 0; local168 < 8; local168++) {
				this.aLongArray24[local168] = this.aLongArray26[local168];
			}
			this.aLongArray24[0] = Static315.method4576(this.aLongArray24[0], Class90_Sub2_Sub1.aLongArray19[local153]);
			@Pc(262) int local262;
			for (local170 = 0; local170 < 8; local170++) {
				this.aLongArray26[local170] = this.aLongArray24[local170];
				local262 = 0;
				@Pc(264) int local264 = 56;
				while (local262 < 8) {
					this.aLongArray26[local170] = Static315.method4576(this.aLongArray26[local170], Class90_Sub2_Sub1.aLongArrayArray1[local262][(int) (this.aLongArray23[local170 - local262 & 0x7] >>> local264) & 0xFF]);
					local262++;
					local264 -= 8;
				}
			}
			for (local262 = 0; local262 < 8; local262++) {
				this.aLongArray23[local262] = this.aLongArray26[local262];
			}
		}
		for (local159 = 0; local159 < 8; local159++) {
			this.aLongArray22[local159] = Static315.method4576(this.aLongArray22[local159], Static315.method4576(this.aLongArray23[local159], this.aLongArray25[local159]));
		}
	}
}
