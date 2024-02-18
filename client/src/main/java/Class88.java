import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class88 {

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "[I")
	public int[] anIntArray204;

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!dv", name = "S", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!dv", name = "R", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!dv", name = "Y", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!dv", name = "O", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!dv", name = "t", descriptor = "[I")
	public int[] anIntArray206;

	@OriginalMember(owner = "client!dv", name = "N", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!dv", name = "I", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!dv", name = "Q", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "[Lclient!rv;")
	public Class328[] aClass328Array1;

	@OriginalMember(owner = "client!dv", name = "M", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!dv", name = "W", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!dv", name = "Z", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "[I")
	public int[] anIntArray211;

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!dv", name = "E", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!dv", name = "X", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!dv", name = "J", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "[I")
	public int[] anIntArray214;

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "[Lclient!mn;")
	public Class249[] aClass249Array1;

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "[Lclient!aq;")
	public Class24[] aClass24Array1;

	@OriginalMember(owner = "client!dv", name = "B", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
	public int anInt2362 = 0;

	@OriginalMember(owner = "client!dv", name = "z", descriptor = "I")
	public int anInt2372 = 0;

	@OriginalMember(owner = "client!dv", name = "D", descriptor = "I")
	public int anInt2363 = 0;

	@OriginalMember(owner = "client!dv", name = "L", descriptor = "I")
	public int anInt2377 = 0;

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "B")
	public byte aByte45 = 0;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
	public int anInt2379 = 12;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
	private Class88() {
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "([B)V")
	public Class88(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2235(arg0);
		} else {
			this.method2242(arg0);
		}
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(III)V")
	public Class88(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray210 = new int[arg1];
		this.aShortArray25 = new short[arg1];
		this.aShortArray22 = new short[arg1];
		this.aShortArray24 = new short[arg1];
		this.aByteArray26 = new byte[arg1];
		this.aByteArray25 = new byte[arg1];
		this.anIntArray205 = new int[arg0];
		this.aShortArray27 = new short[arg1];
		if (arg2 > 0) {
			this.aShortArray21 = new short[arg2];
			this.anIntArray211 = new int[arg2];
			this.aByteArray23 = new byte[arg2];
			this.anIntArray214 = new int[arg2];
			this.aShortArray29 = new short[arg2];
			this.aShortArray28 = new short[arg2];
			this.aByteArray24 = new byte[arg2];
			this.anIntArray208 = new int[arg2];
			this.aByteArray27 = new byte[arg2];
			this.anIntArray212 = new int[arg2];
			this.anIntArray206 = new int[arg2];
			this.anIntArray207 = new int[arg2];
		}
		this.anIntArray213 = new int[arg0];
		this.anIntArray209 = new int[arg0];
		this.anIntArray204 = new int[arg0];
		this.aByteArray28 = new byte[arg1];
		this.aByteArray29 = new byte[arg1];
		this.aShortArray26 = new short[arg1];
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "([Lclient!dv;I)V")
	public Class88(@OriginalArg(0) Class88[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2377 = 0;
		this.anInt2372 = 0;
		this.anInt2362 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte45 = -1;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class88 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt2362 += local56.anInt2362;
				this.anInt2377 += local56.anInt2377;
				this.anInt2372 += local56.anInt2372;
				if (local56.aClass249Array1 != null) {
					local32 += local56.aClass249Array1.length;
				}
				if (local56.aClass24Array1 != null) {
					local34 += local56.aClass24Array1.length;
				}
				if (local56.aClass328Array1 != null) {
					local30 += local56.aClass328Array1.length;
				}
				local36 |= local56.aByteArray25 != null;
				local40 |= local56.aByteArray29 != null;
				if (local56.aByteArray26 == null) {
					if (this.aByte45 == -1) {
						this.aByte45 = local56.aByte45;
					}
					if (local56.aByte45 != this.aByte45) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
				local42 |= local56.aByteArray28 != null;
				local46 |= local56.anIntArray210 != null;
				local44 |= local56.aShortArray25 != null;
			}
		}
		this.anIntArray213 = new int[this.anInt2372];
		this.aShortArray27 = new short[this.anInt2362];
		if (local36) {
			this.aByteArray25 = new byte[this.anInt2362];
		}
		if (local32 > 0) {
			this.aClass249Array1 = new Class249[local32];
		}
		this.aShortArray23 = new short[this.anInt2372];
		this.anIntArray205 = new int[this.anInt2372];
		this.aShortArray20 = new short[this.anInt2362];
		if (local46) {
			this.anIntArray210 = new int[this.anInt2362];
		}
		this.aShortArray22 = new short[this.anInt2362];
		this.aShortArray24 = new short[this.anInt2362];
		this.aShortArray26 = new short[this.anInt2362];
		if (this.anInt2377 > 0) {
			this.anIntArray211 = new int[this.anInt2377];
			this.aByteArray27 = new byte[this.anInt2377];
			this.aByteArray23 = new byte[this.anInt2377];
			this.aShortArray28 = new short[this.anInt2377];
			this.aShortArray29 = new short[this.anInt2377];
			this.anIntArray208 = new int[this.anInt2377];
			this.aShortArray21 = new short[this.anInt2377];
			this.anIntArray212 = new int[this.anInt2377];
			this.aByteArray24 = new byte[this.anInt2377];
			this.anIntArray214 = new int[this.anInt2377];
			this.anIntArray207 = new int[this.anInt2377];
			this.anIntArray206 = new int[this.anInt2377];
		}
		if (local34 > 0) {
			this.aClass24Array1 = new Class24[local34];
		}
		if (local42) {
			this.aByteArray28 = new byte[this.anInt2362];
		}
		this.anIntArray209 = new int[this.anInt2372];
		this.anIntArray204 = new int[this.anInt2372];
		if (local44) {
			this.aShortArray25 = new short[this.anInt2362];
		}
		if (local40) {
			this.aByteArray29 = new byte[this.anInt2362];
		}
		if (local30 > 0) {
			this.aClass328Array1 = new Class328[local30];
		}
		if (local38) {
			this.aByteArray26 = new byte[this.anInt2362];
		}
		local32 = 0;
		this.anInt2377 = 0;
		local30 = 0;
		local34 = 0;
		this.anInt2362 = 0;
		this.anInt2372 = 0;
		@Pc(648) int local648;
		@Pc(659) int local659;
		for (@Pc(401) int local401 = 0; local401 < arg1; local401++) {
			@Pc(407) short local407 = (short) (0x1 << local401);
			@Pc(411) Class88 local411 = arg0[local401];
			if (local411 != null) {
				@Pc(420) int local420;
				if (local411.aClass24Array1 != null) {
					for (local420 = 0; local420 < local411.aClass24Array1.length; local420++) {
						@Pc(426) Class24 local426 = local411.aClass24Array1[local420];
						this.aClass24Array1[local34++] = local426.method682(local426.anInt588 + this.anInt2362);
					}
				}
				for (local420 = 0; local420 < local411.anInt2362; local420++) {
					if (local36 && local411.aByteArray25 != null) {
						this.aByteArray25[this.anInt2362] = local411.aByteArray25[local420];
					}
					if (local38) {
						if (local411.aByteArray26 == null) {
							this.aByteArray26[this.anInt2362] = local411.aByte45;
						} else {
							this.aByteArray26[this.anInt2362] = local411.aByteArray26[local420];
						}
					}
					if (local40 && local411.aByteArray29 != null) {
						this.aByteArray29[this.anInt2362] = local411.aByteArray29[local420];
					}
					if (local44) {
						if (local411.aShortArray25 == null) {
							this.aShortArray25[this.anInt2362] = -1;
						} else {
							this.aShortArray25[this.anInt2362] = local411.aShortArray25[local420];
						}
					}
					if (local46) {
						if (local411.anIntArray210 == null) {
							this.anIntArray210[this.anInt2362] = -1;
						} else {
							this.anIntArray210[this.anInt2362] = local411.anIntArray210[local420];
						}
					}
					this.aShortArray27[this.anInt2362] = (short) this.method2244(local411, local411.aShortArray27[local420], local407);
					this.aShortArray24[this.anInt2362] = (short) this.method2244(local411, local411.aShortArray24[local420], local407);
					this.aShortArray26[this.anInt2362] = (short) this.method2244(local411, local411.aShortArray26[local420], local407);
					this.aShortArray20[this.anInt2362] = local407;
					this.aShortArray22[this.anInt2362] = local411.aShortArray22[local420];
					this.anInt2362++;
				}
				@Pc(636) int local636;
				if (local411.aClass328Array1 != null) {
					for (local636 = 0; local636 < local411.aClass328Array1.length; local636++) {
						local648 = this.method2244(local411, local411.aClass328Array1[local636].anInt8514, local407);
						local659 = this.method2244(local411, local411.aClass328Array1[local636].anInt8508, local407);
						@Pc(670) int local670 = this.method2244(local411, local411.aClass328Array1[local636].anInt8505, local407);
						this.aClass328Array1[local30] = local411.aClass328Array1[local636].method7554(local648, local659, local670);
						local30++;
					}
				}
				if (local411.aClass249Array1 != null) {
					for (local636 = 0; local636 < local411.aClass249Array1.length; local636++) {
						local648 = this.method2244(local411, local411.aClass249Array1[local636].anInt6247, local407);
						this.aClass249Array1[local32] = local411.aClass249Array1[local636].method5593(local648);
						local32++;
					}
				}
			}
		}
		this.anInt2363 = this.anInt2372;
		@Pc(747) int local747 = 0;
		for (@Pc(749) int local749 = 0; local749 < arg1; local749++) {
			@Pc(755) short local755 = (short) (0x1 << local749);
			@Pc(759) Class88 local759 = arg0[local749];
			if (local759 != null) {
				for (local648 = 0; local648 < local759.anInt2362; local648++) {
					if (local42) {
						this.aByteArray28[local747++] = (byte) (local759.aByteArray28 == null || local759.aByteArray28[local648] == -1 ? -1 : local759.aByteArray28[local648] + this.anInt2377);
					}
				}
				for (local659 = 0; local659 < local759.anInt2377; local659++) {
					@Pc(815) byte local815 = this.aByteArray24[this.anInt2377] = local759.aByteArray24[local659];
					if (local815 == 0) {
						this.aShortArray29[this.anInt2377] = (short) this.method2244(local759, local759.aShortArray29[local659], local755);
						this.aShortArray21[this.anInt2377] = (short) this.method2244(local759, local759.aShortArray21[local659], local755);
						this.aShortArray28[this.anInt2377] = (short) this.method2244(local759, local759.aShortArray28[local659], local755);
					}
					if (local815 >= 1 && local815 <= 3) {
						this.aShortArray29[this.anInt2377] = local759.aShortArray29[local659];
						this.aShortArray21[this.anInt2377] = local759.aShortArray21[local659];
						this.aShortArray28[this.anInt2377] = local759.aShortArray28[local659];
						this.anIntArray211[this.anInt2377] = local759.anIntArray211[local659];
						this.anIntArray207[this.anInt2377] = local759.anIntArray207[local659];
						this.anIntArray208[this.anInt2377] = local759.anIntArray208[local659];
						this.aByteArray27[this.anInt2377] = local759.aByteArray27[local659];
						this.aByteArray23[this.anInt2377] = local759.aByteArray23[local659];
						this.anIntArray214[this.anInt2377] = local759.anIntArray214[local659];
					}
					if (local815 == 2) {
						this.anIntArray212[this.anInt2377] = local759.anIntArray212[local659];
						this.anIntArray206[this.anInt2377] = local759.anIntArray206[local659];
					}
					this.anInt2377++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIII)I")
	public int method2230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt2372; local15++) {
			if (arg2 == this.anIntArray213[local15] && arg1 == this.anIntArray205[local15] && arg0 == this.anIntArray204[local15]) {
				return local15;
			}
		}
		this.anIntArray213[this.anInt2372] = arg2;
		this.anIntArray205[this.anInt2372] = arg1;
		this.anIntArray204[this.anInt2372] = arg0;
		this.anInt2363 = this.anInt2372 + 1;
		return this.anInt2372++;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZIIISSBBB)I")
	public int method2231(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) short arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray27[this.anInt2362] = (short) arg0;
		this.aShortArray24[this.anInt2362] = (short) arg2;
		this.aShortArray26[this.anInt2362] = (short) arg1;
		this.aByteArray25[this.anInt2362] = arg6;
		this.aByteArray28[this.anInt2362] = arg7;
		this.aShortArray22[this.anInt2362] = arg3;
		this.aByteArray29[this.anInt2362] = arg5;
		this.aShortArray25[this.anInt2362] = arg4;
		return this.anInt2362++;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)V")
	public void method2232() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2372; local1++) {
			this.anIntArray213[local1] <<= 0x2;
			this.anIntArray205[local1] <<= 0x2;
			this.anIntArray204[local1] <<= 0x2;
		}
		if (this.anInt2377 <= 0 || this.anIntArray211 == null) {
			return;
		}
		for (@Pc(51) int local51 = 0; local51 < this.anIntArray211.length; local51++) {
			this.anIntArray211[local51] <<= 0x2;
			this.anIntArray207[local51] <<= 0x2;
			if (this.aByteArray24[local51] != 1) {
				this.anIntArray208[local51] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(IIII)V")
	public void method2233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2372; local13++) {
			this.anIntArray213[local13] += arg0;
			this.anIntArray205[local13] += arg1;
			this.anIntArray204[local13] += arg2;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZ)[[I")
	public int[][] method2234(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(19) int local19 = arg0 ? this.anInt2372 : this.anInt2363;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(30) int local30 = this.anIntArray209[local21];
			if (local30 >= 0) {
				if (local10 < local30) {
					local10 = local30;
				}
				@Pc(50) int local50 = local8[local30]++;
			}
		}
		@Pc(66) int[][] local66 = new int[local10 + 1][];
		for (@Pc(70) int local70 = 0; local70 <= local10; local70++) {
			local66[local70] = new int[local8[local70]];
			local8[local70] = 0;
		}
		for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
			@Pc(104) int local104 = this.anIntArray209[local95];
			if (local104 >= 0) {
				local66[local104][local8[local104]++] = local95;
			}
		}
		return local66;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "([BZ)V")
	private void method2235(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Packet local8 = new Packet(arg0);
		@Pc(13) Packet local13 = new Packet(arg0);
		@Pc(18) Packet local18 = new Packet(arg0);
		@Pc(23) Packet local23 = new Packet(arg0);
		@Pc(28) Packet local28 = new Packet(arg0);
		@Pc(33) Packet local33 = new Packet(arg0);
		@Pc(38) Packet local38 = new Packet(arg0);
		local8.pos = arg0.length - 23;
		this.anInt2372 = local8.g2();
		this.anInt2362 = local8.g2();
		this.anInt2377 = local8.g1();
		@Pc(63) int local63 = local8.g1();
		@Pc(75) boolean local75 = (local63 & 0x1) == 1;
		@Pc(85) boolean local85 = (local63 & 0x2) == 2;
		@Pc(97) boolean local97 = (local63 & 0x4) == 4;
		@Pc(109) boolean local109 = (local63 & 0x8) == 8;
		if (local109) {
			local8.pos -= 7;
			this.anInt2379 = local8.g1();
			local8.pos += 6;
		}
		@Pc(134) int local134 = local8.g1();
		@Pc(138) int local138 = local8.g1();
		@Pc(142) int local142 = local8.g1();
		@Pc(146) int local146 = local8.g1();
		@Pc(150) int local150 = local8.g1();
		@Pc(154) int local154 = local8.g2();
		@Pc(158) int local158 = local8.g2();
		@Pc(162) int local162 = local8.g2();
		@Pc(166) int local166 = local8.g2();
		@Pc(170) int local170 = local8.g2();
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(192) int local192;
		if (this.anInt2377 > 0) {
			this.aByteArray24 = new byte[this.anInt2377];
			local8.pos = 0;
			for (local192 = 0; local192 < this.anInt2377; local192++) {
				@Pc(202) byte local202 = this.aByteArray24[local192] = local8.g1b();
				if (local202 == 0) {
					local172++;
				}
				if (local202 == 2) {
					local176++;
				}
				if (local202 >= 1 && local202 <= 3) {
					local174++;
				}
			}
		}
		local192 = this.anInt2377;
		@Pc(242) int local242 = local192;
		local192 += this.anInt2372;
		@Pc(249) int local249 = local192;
		if (local75) {
			local192 += this.anInt2362;
		}
		@Pc(258) int local258 = local192;
		local192 += this.anInt2362;
		@Pc(265) int local265 = local192;
		if (local134 == 255) {
			local192 += this.anInt2362;
		}
		@Pc(277) int local277 = local192;
		if (local142 == 1) {
			local192 += this.anInt2362;
		}
		@Pc(287) int local287 = local192;
		if (local150 == 1) {
			local192 += this.anInt2372;
		}
		@Pc(299) int local299 = local192;
		if (local138 == 1) {
			local192 += this.anInt2362;
		}
		@Pc(309) int local309 = local192;
		local192 += local166;
		@Pc(315) int local315 = local192;
		if (local146 == 1) {
			local192 += this.anInt2362 * 2;
		}
		@Pc(329) int local329 = local192;
		local192 += local170;
		@Pc(335) int local335 = local192;
		local192 += this.anInt2362 * 2;
		@Pc(344) int local344 = local192;
		local192 += local154;
		@Pc(350) int local350 = local192;
		local192 += local158;
		@Pc(356) int local356 = local192;
		local192 += local162;
		@Pc(362) int local362 = local192;
		local192 += local172 * 6;
		@Pc(370) int local370 = local192;
		local192 += local174 * 6;
		@Pc(378) byte local378 = 6;
		if (this.anInt2379 == 14) {
			local378 = 7;
		} else if (this.anInt2379 >= 15) {
			local378 = 9;
		}
		@Pc(395) int local395 = local192;
		local192 += local174 * local378;
		@Pc(403) int local403 = local192;
		local192 += local174;
		@Pc(409) int local409 = local192;
		local192 += local174;
		@Pc(415) int local415 = local192;
		local192 += local174 + local176 * 2;
		this.aShortArray22 = new short[this.anInt2362];
		local8.pos = local242;
		if (local75) {
			this.aByteArray25 = new byte[this.anInt2362];
		}
		if (this.anInt2377 > 0) {
			this.aShortArray29 = new short[this.anInt2377];
			if (local174 > 0) {
				this.anIntArray208 = new int[local174];
				this.aByteArray23 = new byte[local174];
				this.anIntArray211 = new int[local174];
				this.aByteArray27 = new byte[local174];
				this.anIntArray214 = new int[local174];
				this.anIntArray207 = new int[local174];
			}
			if (local176 > 0) {
				this.anIntArray212 = new int[local176];
				this.anIntArray206 = new int[local176];
			}
			this.aShortArray21 = new short[this.anInt2377];
			this.aShortArray28 = new short[this.anInt2377];
		}
		this.anIntArray204 = new int[this.anInt2372];
		this.aShortArray26 = new short[this.anInt2362];
		this.anIntArray205 = new int[this.anInt2372];
		this.aShortArray27 = new short[this.anInt2362];
		if (local146 == 1) {
			this.aShortArray25 = new short[this.anInt2362];
		}
		if (local134 == 255) {
			this.aByteArray26 = new byte[this.anInt2362];
		} else {
			this.aByte45 = (byte) local134;
		}
		if (local138 == 1) {
			this.aByteArray29 = new byte[this.anInt2362];
		}
		if (local150 == 1) {
			this.anIntArray209 = new int[this.anInt2372];
		}
		this.anIntArray213 = new int[this.anInt2372];
		if (local146 == 1 && this.anInt2377 > 0) {
			this.aByteArray28 = new byte[this.anInt2362];
		}
		if (local142 == 1) {
			this.anIntArray210 = new int[this.anInt2362];
		}
		this.aShortArray24 = new short[this.anInt2362];
		local13.pos = local344;
		local18.pos = local350;
		local23.pos = local356;
		local28.pos = local287;
		@Pc(627) int local627 = 0;
		@Pc(629) int local629 = 0;
		@Pc(631) int local631 = 0;
		@Pc(638) int local638;
		for (@Pc(633) int local633 = 0; local633 < this.anInt2372; local633++) {
			local638 = local8.g1();
			@Pc(640) int local640 = 0;
			if ((local638 & 0x1) != 0) {
				local640 = local13.gSmart1or2s();
			}
			@Pc(653) int local653 = 0;
			if ((local638 & 0x2) != 0) {
				local653 = local18.gSmart1or2s();
			}
			@Pc(666) int local666 = 0;
			if ((local638 & 0x4) != 0) {
				local666 = local23.gSmart1or2s();
			}
			this.anIntArray213[local633] = local640 + local627;
			this.anIntArray205[local633] = local629 + local653;
			this.anIntArray204[local633] = local666 + local631;
			local629 = this.anIntArray205[local633];
			local631 = this.anIntArray204[local633];
			local627 = this.anIntArray213[local633];
			if (local150 == 1) {
				this.anIntArray209[local633] = local28.g1();
			}
		}
		local8.pos = local335;
		local13.pos = local249;
		local18.pos = local265;
		local23.pos = local299;
		local28.pos = local277;
		local33.pos = local315;
		local38.pos = local329;
		for (local638 = 0; local638 < this.anInt2362; local638++) {
			this.aShortArray22[local638] = (short) local8.g2();
			if (local75) {
				this.aByteArray25[local638] = local13.g1b();
			}
			if (local134 == 255) {
				this.aByteArray26[local638] = local18.g1b();
			}
			if (local138 == 1) {
				this.aByteArray29[local638] = local23.g1b();
			}
			if (local142 == 1) {
				this.anIntArray210[local638] = local28.g1();
			}
			if (local146 == 1) {
				this.aShortArray25[local638] = (short) (local33.g2() - 1);
			}
			if (this.aByteArray28 != null) {
				if (this.aShortArray25[local638] == -1) {
					this.aByteArray28[local638] = -1;
				} else {
					this.aByteArray28[local638] = (byte) (local38.g1() - 1);
				}
			}
		}
		this.anInt2363 = -1;
		local8.pos = local309;
		local13.pos = local258;
		@Pc(869) short local869 = 0;
		@Pc(871) short local871 = 0;
		@Pc(873) short local873 = 0;
		@Pc(875) short local875 = 0;
		@Pc(882) int local882;
		for (@Pc(877) int local877 = 0; local877 < this.anInt2362; local877++) {
			local882 = local13.g1();
			if (local882 == 1) {
				local869 = (short) (local8.gSmart1or2s() + local875);
				local871 = (short) (local8.gSmart1or2s() + local869);
				local873 = (short) (local871 + local8.gSmart1or2s());
				local875 = local873;
				this.aShortArray27[local877] = local869;
				this.aShortArray24[local877] = local871;
				this.aShortArray26[local877] = local873;
				if (this.anInt2363 < local869) {
					this.anInt2363 = local869;
				}
				if (this.anInt2363 < local871) {
					this.anInt2363 = local871;
				}
				if (local873 > this.anInt2363) {
					this.anInt2363 = local873;
				}
			}
			if (local882 == 2) {
				local871 = local873;
				local873 = (short) (local8.gSmart1or2s() + local875);
				this.aShortArray27[local877] = local869;
				local875 = local873;
				this.aShortArray24[local877] = local871;
				this.aShortArray26[local877] = local873;
				if (this.anInt2363 < local873) {
					this.anInt2363 = local873;
				}
			}
			if (local882 == 3) {
				local869 = local873;
				local873 = (short) (local8.gSmart1or2s() + local875);
				this.aShortArray27[local877] = local869;
				local875 = local873;
				this.aShortArray24[local877] = local871;
				this.aShortArray26[local877] = local873;
				if (this.anInt2363 < local873) {
					this.anInt2363 = local873;
				}
			}
			if (local882 == 4) {
				@Pc(1055) short local1055 = local869;
				local869 = local871;
				local873 = (short) (local875 + local8.gSmart1or2s());
				local871 = local1055;
				this.aShortArray27[local877] = local869;
				local875 = local873;
				this.aShortArray24[local877] = local1055;
				this.aShortArray26[local877] = local873;
				if (local873 > this.anInt2363) {
					this.anInt2363 = local873;
				}
			}
		}
		local8.pos = local362;
		this.anInt2363++;
		local13.pos = local370;
		local18.pos = local395;
		local23.pos = local403;
		local28.pos = local409;
		local33.pos = local415;
		@Pc(1142) int local1142;
		for (local882 = 0; local882 < this.anInt2377; local882++) {
			local1142 = this.aByteArray24[local882] & 0xFF;
			if (local1142 == 0) {
				this.aShortArray29[local882] = (short) local8.g2();
				this.aShortArray21[local882] = (short) local8.g2();
				this.aShortArray28[local882] = (short) local8.g2();
			}
			if (local1142 == 1) {
				this.aShortArray29[local882] = (short) local13.g2();
				this.aShortArray21[local882] = (short) local13.g2();
				this.aShortArray28[local882] = (short) local13.g2();
				if (this.anInt2379 < 15) {
					this.anIntArray211[local882] = local18.g2();
					if (this.anInt2379 < 14) {
						this.anIntArray207[local882] = local18.g2();
					} else {
						this.anIntArray207[local882] = local18.g3();
					}
					this.anIntArray208[local882] = local18.g2();
				} else {
					this.anIntArray211[local882] = local18.g3();
					this.anIntArray207[local882] = local18.g3();
					this.anIntArray208[local882] = local18.g3();
				}
				this.aByteArray27[local882] = local23.g1b();
				this.aByteArray23[local882] = local28.g1b();
				this.anIntArray214[local882] = local33.g1b();
			}
			if (local1142 == 2) {
				this.aShortArray29[local882] = (short) local13.g2();
				this.aShortArray21[local882] = (short) local13.g2();
				this.aShortArray28[local882] = (short) local13.g2();
				if (this.anInt2379 < 15) {
					this.anIntArray211[local882] = local18.g2();
					if (this.anInt2379 >= 14) {
						this.anIntArray207[local882] = local18.g3();
					} else {
						this.anIntArray207[local882] = local18.g2();
					}
					this.anIntArray208[local882] = local18.g2();
				} else {
					this.anIntArray211[local882] = local18.g3();
					this.anIntArray207[local882] = local18.g3();
					this.anIntArray208[local882] = local18.g3();
				}
				this.aByteArray27[local882] = local23.g1b();
				this.aByteArray23[local882] = local28.g1b();
				this.anIntArray214[local882] = local33.g1b();
				this.anIntArray212[local882] = local33.g1b();
				this.anIntArray206[local882] = local33.g1b();
			}
			if (local1142 == 3) {
				this.aShortArray29[local882] = (short) local13.g2();
				this.aShortArray21[local882] = (short) local13.g2();
				this.aShortArray28[local882] = (short) local13.g2();
				if (this.anInt2379 < 15) {
					this.anIntArray211[local882] = local18.g2();
					if (this.anInt2379 < 14) {
						this.anIntArray207[local882] = local18.g2();
					} else {
						this.anIntArray207[local882] = local18.g3();
					}
					this.anIntArray208[local882] = local18.g2();
				} else {
					this.anIntArray211[local882] = local18.g3();
					this.anIntArray207[local882] = local18.g3();
					this.anIntArray208[local882] = local18.g3();
				}
				this.aByteArray27[local882] = local23.g1b();
				this.aByteArray23[local882] = local28.g1b();
				this.anIntArray214[local882] = local33.g1b();
			}
		}
		local8.pos = local192;
		@Pc(1556) int local1556;
		@Pc(1561) int local1561;
		@Pc(1565) int local1565;
		@Pc(1627) int local1627;
		if (local85) {
			local1142 = local8.g1();
			if (local1142 > 0) {
				this.aClass328Array1 = new Class328[local1142];
				for (local1556 = 0; local1556 < local1142; local1556++) {
					local1561 = local8.g2();
					local1565 = local8.g2();
					@Pc(1573) byte local1573;
					if (local134 == 255) {
						local1573 = this.aByteArray26[local1565];
					} else {
						local1573 = (byte) local134;
					}
					this.aClass328Array1[local1556] = new Class328(local1561, this.aShortArray27[local1565], this.aShortArray24[local1565], this.aShortArray26[local1565], local1573);
				}
			}
			local1556 = local8.g1();
			if (local1556 > 0) {
				this.aClass249Array1 = new Class249[local1556];
				for (local1561 = 0; local1561 < local1556; local1561++) {
					local1565 = local8.g2();
					local1627 = local8.g2();
					this.aClass249Array1[local1561] = new Class249(local1565, local1627);
				}
			}
		}
		if (!local97) {
			return;
		}
		local1142 = local8.g1();
		if (local1142 <= 0) {
			return;
		}
		this.aClass24Array1 = new Class24[local1142];
		for (local1556 = 0; local1556 < local1142; local1556++) {
			local1561 = local8.g2();
			local1565 = local8.g2();
			local1627 = local8.g1();
			@Pc(1676) byte local1676 = local8.g1b();
			this.aClass24Array1[local1556] = new Class24(local1561, local1565, local1627, local1676);
		}
		return;
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(IIII)V")
	public void method2236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(28) int local28;
		if (arg0 != 0) {
			local5 = Class361.anIntArray741[arg0];
			local9 = Class361.anIntArray740[arg0];
			for (local11 = 0; local11 < this.anInt2372; local11++) {
				local28 = local9 * this.anIntArray213[local11] + local5 * this.anIntArray205[local11] >> 14;
				this.anIntArray205[local11] = local9 * this.anIntArray205[local11] - this.anIntArray213[local11] * local5 >> 14;
				this.anIntArray213[local11] = local28;
			}
		}
		if (arg1 != 0) {
			local5 = Class361.anIntArray741[arg1];
			local9 = Class361.anIntArray740[arg1];
			for (local11 = 0; local11 < this.anInt2372; local11++) {
				local28 = local9 * this.anIntArray205[local11] - local5 * this.anIntArray204[local11] >> 14;
				this.anIntArray204[local11] = local5 * this.anIntArray205[local11] + this.anIntArray204[local11] * local9 >> 14;
				this.anIntArray205[local11] = local28;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local5 = Class361.anIntArray741[arg2];
		local9 = Class361.anIntArray740[arg2];
		for (local11 = 0; local11 < this.anInt2372; local11++) {
			local28 = local5 * this.anIntArray204[local11] + local9 * this.anIntArray213[local11] >> 14;
			this.anIntArray204[local11] = this.anIntArray204[local11] * local9 - local5 * this.anIntArray213[local11] >> 14;
			this.anIntArray213[local11] = local28;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BBBSSSSSSB)B")
	public byte method2237() {
		if (this.anInt2377 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray24[this.anInt2377] = 3;
		this.aShortArray29[this.anInt2377] = 0;
		this.aShortArray21[this.anInt2377] = 32767;
		this.aShortArray28[this.anInt2377] = 0;
		this.anIntArray211[this.anInt2377] = 1024;
		this.anIntArray207[this.anInt2377] = 1024;
		this.anIntArray208[this.anInt2377] = 1024;
		this.aByteArray27[this.anInt2377] = 0;
		this.aByteArray23[this.anInt2377] = 0;
		this.anIntArray214[this.anInt2377] = 0;
		return (byte) this.anInt2377++;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(SSI)V")
	public void method2238(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray25 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anInt2362; local10++) {
			if (this.aShortArray25[local10] == arg0) {
				this.aShortArray25[local10] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)[[I")
	public int[][] method2239() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass24Array1.length; local12++) {
			@Pc(22) int local22 = this.aClass24Array1[local12].anInt589;
			if (local22 >= 0) {
				if (local22 > local10) {
					local10 = local22;
				}
				@Pc(39) int local39 = local8[local22]++;
			}
		}
		if (-80 != -80) {
			this.anIntArray210 = null;
		}
		@Pc(69) int[][] local69 = new int[local10 + 1][];
		for (@Pc(71) int local71 = 0; local71 <= local10; local71++) {
			local69[local71] = new int[local8[local71]];
			local8[local71] = 0;
		}
		for (@Pc(96) int local96 = 0; local96 < this.aClass24Array1.length; local96++) {
			@Pc(106) int local106 = this.aClass24Array1[local96].anInt589;
			if (local106 >= 0) {
				local69[local106][local8[local106]++] = local96;
			}
		}
		return local69;
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(SSI)V")
	public void method2240(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt2362; local5++) {
			if (arg0 == this.aShortArray22[local5]) {
				this.aShortArray22[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(B)[[I")
	public int[][] method2241() {
		@Pc(16) int[] local16 = new int[256];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2362; local20++) {
			@Pc(29) int local29 = this.anIntArray210[local20];
			if (local29 >= 0) {
				@Pc(38) int local38 = local16[local29]++;
				if (local29 > local18) {
					local18 = local29;
				}
			}
		}
		@Pc(62) int[][] local62 = new int[local18 + 1][];
		for (@Pc(66) int local66 = 0; local66 <= local18; local66++) {
			local62[local66] = new int[local16[local66]];
			local16[local66] = 0;
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt2362; local87++) {
			@Pc(96) int local96 = this.anIntArray210[local87];
			if (local96 >= 0) {
				local62[local96][local16[local96]++] = local87;
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I[B)V")
	private void method2242(@OriginalArg(1) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Packet local12 = new Packet(arg0);
		@Pc(17) Packet local17 = new Packet(arg0);
		@Pc(22) Packet local22 = new Packet(arg0);
		@Pc(27) Packet local27 = new Packet(arg0);
		@Pc(32) Packet local32 = new Packet(arg0);
		local12.pos = arg0.length - 18;
		this.anInt2372 = local12.g2();
		this.anInt2362 = local12.g2();
		this.anInt2377 = local12.g1();
		@Pc(57) int local57 = local12.g1();
		@Pc(61) int local61 = local12.g1();
		@Pc(65) int local65 = local12.g1();
		@Pc(69) int local69 = local12.g1();
		@Pc(73) int local73 = local12.g1();
		@Pc(77) int local77 = local12.g2();
		@Pc(81) int local81 = local12.g2();
		@Pc(85) int local85 = local12.g2();
		@Pc(89) int local89 = local12.g2();
		@Pc(98) int local98 = this.anInt2372;
		@Pc(100) int local100 = local98;
		local98 += this.anInt2362;
		@Pc(107) int local107 = local98;
		if (local61 == 255) {
			local98 += this.anInt2362;
		}
		@Pc(117) int local117 = local98;
		if (local69 == 1) {
			local98 += this.anInt2362;
		}
		@Pc(129) int local129 = local98;
		if (local57 == 1) {
			local98 += this.anInt2362;
		}
		@Pc(139) int local139 = local98;
		if (local73 == 1) {
			local98 += this.anInt2372;
		}
		@Pc(151) int local151 = local98;
		if (local65 == 1) {
			local98 += this.anInt2362;
		}
		@Pc(163) int local163 = local98;
		local98 += local89;
		@Pc(169) int local169 = local98;
		local98 += this.anInt2362 * 2;
		@Pc(178) int local178 = local98;
		local98 += this.anInt2377 * 6;
		@Pc(187) int local187 = local98;
		local98 += local77;
		@Pc(198) int local198 = local98;
		local98 += local81;
		if (local61 == 255) {
			this.aByteArray26 = new byte[this.anInt2362];
		} else {
			this.aByte45 = (byte) local61;
		}
		if (local69 == 1) {
			this.anIntArray210 = new int[this.anInt2362];
		}
		this.aShortArray22 = new short[this.anInt2362];
		this.anIntArray204 = new int[this.anInt2372];
		if (local73 == 1) {
			this.anIntArray209 = new int[this.anInt2372];
		}
		this.aShortArray24 = new short[this.anInt2362];
		this.anIntArray205 = new int[this.anInt2372];
		this.anIntArray213 = new int[this.anInt2372];
		local12.pos = 0;
		if (this.anInt2377 > 0) {
			this.aShortArray21 = new short[this.anInt2377];
			this.aShortArray28 = new short[this.anInt2377];
			this.aByteArray24 = new byte[this.anInt2377];
			this.aShortArray29 = new short[this.anInt2377];
		}
		if (local57 == 1) {
			this.aByteArray25 = new byte[this.anInt2362];
			this.aShortArray25 = new short[this.anInt2362];
			this.aByteArray28 = new byte[this.anInt2362];
		}
		if (local65 == 1) {
			this.aByteArray29 = new byte[this.anInt2362];
		}
		this.aShortArray27 = new short[this.anInt2362];
		this.aShortArray26 = new short[this.anInt2362];
		local17.pos = local187;
		local22.pos = local198;
		local27.pos = local98;
		local32.pos = local139;
		@Pc(354) int local354 = 0;
		@Pc(356) int local356 = 0;
		@Pc(358) int local358 = 0;
		@Pc(365) int local365;
		@Pc(367) int local367;
		for (@Pc(360) int local360 = 0; local360 < this.anInt2372; local360++) {
			local365 = local12.g1();
			local367 = 0;
			if ((local365 & 0x1) != 0) {
				local367 = local17.gSmart1or2s();
			}
			@Pc(377) int local377 = 0;
			if ((local365 & 0x2) != 0) {
				local377 = local22.gSmart1or2s();
			}
			@Pc(390) int local390 = 0;
			if ((local365 & 0x4) != 0) {
				local390 = local27.gSmart1or2s();
			}
			this.anIntArray213[local360] = local367 + local354;
			this.anIntArray205[local360] = local356 + local377;
			this.anIntArray204[local360] = local358 + local390;
			local354 = this.anIntArray213[local360];
			local356 = this.anIntArray205[local360];
			local358 = this.anIntArray204[local360];
			if (local73 == 1) {
				this.anIntArray209[local360] = local32.g1();
			}
		}
		local12.pos = local169;
		local17.pos = local129;
		local22.pos = local107;
		local27.pos = local151;
		local32.pos = local117;
		for (local365 = 0; local365 < this.anInt2362; local365++) {
			this.aShortArray22[local365] = (short) local12.g2();
			if (local57 == 1) {
				local367 = local17.g1();
				if ((local367 & 0x1) == 1) {
					this.aByteArray25[local365] = 1;
					local5 = true;
				} else {
					this.aByteArray25[local365] = 0;
				}
				if ((local367 & 0x2) == 2) {
					this.aByteArray28[local365] = (byte) (local367 >> 2);
					this.aShortArray25[local365] = this.aShortArray22[local365];
					this.aShortArray22[local365] = 127;
					if (this.aShortArray25[local365] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray28[local365] = -1;
					this.aShortArray25[local365] = -1;
				}
			}
			if (local61 == 255) {
				this.aByteArray26[local365] = local22.g1b();
			}
			if (local65 == 1) {
				this.aByteArray29[local365] = local27.g1b();
			}
			if (local69 == 1) {
				this.anIntArray210[local365] = local32.g1();
			}
		}
		this.anInt2363 = -1;
		local12.pos = local163;
		local17.pos = local100;
		@Pc(609) short local609 = 0;
		@Pc(611) short local611 = 0;
		@Pc(613) short local613 = 0;
		@Pc(615) short local615 = 0;
		@Pc(622) int local622;
		for (@Pc(617) int local617 = 0; local617 < this.anInt2362; local617++) {
			local622 = local17.g1();
			if (local622 == 1) {
				local609 = (short) (local615 + local12.gSmart1or2s());
				local611 = (short) (local12.gSmart1or2s() + local609);
				local613 = (short) (local12.gSmart1or2s() + local611);
				local615 = local613;
				this.aShortArray27[local617] = local609;
				this.aShortArray24[local617] = local611;
				this.aShortArray26[local617] = local613;
				if (this.anInt2363 < local609) {
					this.anInt2363 = local609;
				}
				if (this.anInt2363 < local611) {
					this.anInt2363 = local611;
				}
				if (local613 > this.anInt2363) {
					this.anInt2363 = local613;
				}
			}
			if (local622 == 2) {
				local611 = local613;
				local613 = (short) (local12.gSmart1or2s() + local615);
				local615 = local613;
				this.aShortArray27[local617] = local609;
				this.aShortArray24[local617] = local611;
				this.aShortArray26[local617] = local613;
				if (this.anInt2363 < local613) {
					this.anInt2363 = local613;
				}
			}
			if (local622 == 3) {
				local609 = local613;
				local613 = (short) (local615 + local12.gSmart1or2s());
				this.aShortArray27[local617] = local609;
				local615 = local613;
				this.aShortArray24[local617] = local611;
				this.aShortArray26[local617] = local613;
				if (this.anInt2363 < local613) {
					this.anInt2363 = local613;
				}
			}
			if (local622 == 4) {
				@Pc(785) short local785 = local609;
				local609 = local611;
				local613 = (short) (local12.gSmart1or2s() + local615);
				local611 = local785;
				this.aShortArray27[local617] = local609;
				local615 = local613;
				this.aShortArray24[local617] = local785;
				this.aShortArray26[local617] = local613;
				if (this.anInt2363 < local613) {
					this.anInt2363 = local613;
				}
			}
		}
		local12.pos = local178;
		this.anInt2363++;
		for (local622 = 0; local622 < this.anInt2377; local622++) {
			this.aByteArray24[local622] = 0;
			this.aShortArray29[local622] = (short) local12.g2();
			this.aShortArray21[local622] = (short) local12.g2();
			this.aShortArray28[local622] = (short) local12.g2();
		}
		if (this.aByteArray28 != null) {
			@Pc(884) boolean local884 = false;
			for (@Pc(886) int local886 = 0; local886 < this.anInt2362; local886++) {
				@Pc(894) int local894 = this.aByteArray28[local886] & 0xFF;
				if (local894 != 255) {
					if ((this.aShortArray29[local894] & 0xFFFF) == this.aShortArray27[local886] && this.aShortArray24[local886] == (this.aShortArray21[local894] & 0xFFFF) && this.aShortArray26[local886] == (this.aShortArray28[local894] & 0xFFFF)) {
						this.aByteArray28[local886] = -1;
					} else {
						local884 = true;
					}
				}
			}
			if (!local884) {
				this.aByteArray28 = null;
			}
		}
		if (!local5) {
			this.aByteArray25 = null;
		}
		if (!local7) {
			this.aShortArray25 = null;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!dv;IIS)I")
	private int method2244(@OriginalArg(0) Class88 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2) {
		@Pc(8) int local8 = arg0.anIntArray213[arg1];
		@Pc(13) int local13 = arg0.anIntArray205[arg1];
		@Pc(18) int local18 = arg0.anIntArray204[arg1];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2372; local20++) {
			if (this.anIntArray213[local20] == local8 && this.anIntArray205[local20] == local13 && local18 == this.anIntArray204[local20]) {
				this.aShortArray23[local20] |= arg2;
				return local20;
			}
		}
		this.anIntArray213[this.anInt2372] = local8;
		this.anIntArray205[this.anInt2372] = local13;
		this.anIntArray204[this.anInt2372] = local18;
		this.aShortArray23[this.anInt2372] = arg2;
		this.anIntArray209[this.anInt2372] = arg0.anIntArray209 == null ? -1 : arg0.anIntArray209[arg1];
		return this.anInt2372++;
	}
}
