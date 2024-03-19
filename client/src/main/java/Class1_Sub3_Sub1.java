import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hb", name = "Gb", descriptor = "I")
	private int anInt2676;

	@OriginalMember(owner = "client!hb", name = "Hb", descriptor = "J")
	private long aLong81;

	@OriginalMember(owner = "client!hb", name = "Ib", descriptor = "I")
	private int anInt2677;

	@OriginalMember(owner = "client!hb", name = "Jb", descriptor = "J")
	private long aLong82;

	@OriginalMember(owner = "client!hb", name = "Lb", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "client!hb", name = "Mb", descriptor = "Z")
	private boolean aBoolean181;

	@OriginalMember(owner = "client!hb", name = "Nb", descriptor = "Lclient!oe;")
	private Class1_Sub28 aClass1_Sub28_1;

	@OriginalMember(owner = "client!hb", name = "Ob", descriptor = "I")
	private int anInt2678;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	private int anInt2632 = 256;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
	private final int anInt2640 = 1000000;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "[I")
	public final int[] anIntArray171 = new int[16];

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "[I")
	private final int[] anIntArray173 = new int[16];

	@OriginalMember(owner = "client!hb", name = "eb", descriptor = "[I")
	private final int[] anIntArray177 = new int[16];

	@OriginalMember(owner = "client!hb", name = "ab", descriptor = "[I")
	private final int[] anIntArray176 = new int[16];

	@OriginalMember(owner = "client!hb", name = "nb", descriptor = "[I")
	private final int[] anIntArray179 = new int[16];

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "[I")
	public final int[] anIntArray175 = new int[16];

	@OriginalMember(owner = "client!hb", name = "gb", descriptor = "[[Lclient!hs;")
	private final Class1_Sub12[][] aClass1_Sub12ArrayArray1 = new Class1_Sub12[16][128];

	@OriginalMember(owner = "client!hb", name = "sb", descriptor = "[I")
	private final int[] anIntArray181 = new int[16];

	@OriginalMember(owner = "client!hb", name = "mb", descriptor = "[I")
	private final int[] anIntArray178 = new int[16];

	@OriginalMember(owner = "client!hb", name = "rb", descriptor = "[I")
	private final int[] anIntArray180 = new int[16];

	@OriginalMember(owner = "client!hb", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!hb", name = "vb", descriptor = "[I")
	public final int[] anIntArray182 = new int[16];

	@OriginalMember(owner = "client!hb", name = "xb", descriptor = "[[Lclient!hs;")
	private final Class1_Sub12[][] aClass1_Sub12ArrayArray2 = new Class1_Sub12[16][128];

	@OriginalMember(owner = "client!hb", name = "Eb", descriptor = "[I")
	private final int[] anIntArray186 = new int[16];

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "[I")
	private final int[] anIntArray172 = new int[16];

	@OriginalMember(owner = "client!hb", name = "Cb", descriptor = "[I")
	private final int[] anIntArray184 = new int[16];

	@OriginalMember(owner = "client!hb", name = "Db", descriptor = "[I")
	private final int[] anIntArray185 = new int[16];

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
	private final int[] anIntArray174 = new int[16];

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "Lclient!lr;")
	private final Class124 aClass124_1 = new Class124();

	@OriginalMember(owner = "client!hb", name = "Kb", descriptor = "Lclient!pj;")
	private final Class1_Sub3_Sub4 aClass1_Sub3_Sub4_1 = new Class1_Sub3_Sub4(this);

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Lclient!sf;")
	private final Class183 aClass183_8 = new Class183(128);

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub1() {
		this.method2245();
		this.method2210(true);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	private void method2209(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZB)V")
	private void method2210(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method2244(-1);
		} else {
			this.method2225(-1);
		}
		this.method2241(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray185[local29] = this.lb[local29];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray176[local47] = this.lb[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!hs;)I")
	private int method2211(@OriginalArg(1) Class1_Sub12 arg0) {
		@Pc(15) int local15 = this.anIntArray173[arg0.anInt3043];
		return local15 < 8192 ? arg0.anInt3033 * local15 + 32 >> 6 : 16384 - ((128 - arg0.anInt3033) * (-local15 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!hs;II[IB)Z")
	public boolean method2212(@OriginalArg(0) Class1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg0.anInt3052 = Static80.anInt2184 / 100;
		if (arg0.anInt3032 >= 0 && (arg0.aClass1_Sub3_Sub2_1 == null || arg0.aClass1_Sub3_Sub2_1.method2345())) {
			arg0.method2601();
			arg0.method6172();
			if (arg0.anInt3049 > 0 && this.aClass1_Sub12ArrayArray2[arg0.anInt3043][arg0.anInt3049] == arg0) {
				this.aClass1_Sub12ArrayArray2[arg0.anInt3043][arg0.anInt3049] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg0.anInt3038;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray184[arg0.anInt3043] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg0.anInt3038 = local56;
		}
		arg0.aClass1_Sub3_Sub2_1.method2348(this.method2236(arg0));
		@Pc(93) Class208 local93 = arg0.aClass208_1;
		arg0.anInt3040 += local93.anInt6655;
		arg0.anInt3051++;
		@Pc(108) boolean local108 = false;
		@Pc(126) double local126 = (double) ((arg0.anInt3038 * arg0.anInt3037 >> 12) + (arg0.anInt3039 - 60 << 8)) * 5.086263020833333E-6D;
		if (local93.anInt6649 > 0) {
			if (local93.anInt6651 <= 0) {
				arg0.anInt3036 += 128;
			} else {
				arg0.anInt3036 += (int) (Math.pow(2.0D, (double) local93.anInt6651 * local126) * 128.0D + 0.5D);
			}
			if (arg0.anInt3036 * local93.anInt6649 >= 819200) {
				local108 = true;
			}
		}
		if (local93.aByteArray85 != null) {
			if (local93.anInt6646 > 0) {
				arg0.anInt3041 += (int) (Math.pow(2.0D, (double) local93.anInt6646 * local126) * 128.0D + 0.5D);
			} else {
				arg0.anInt3041 += 128;
			}
			while (local93.aByteArray85.length - 2 > arg0.anInt3050 && (local93.aByteArray85[arg0.anInt3050 + 2] & 0xFF) << 8 < arg0.anInt3041) {
				arg0.anInt3050 += 2;
			}
			if (arg0.anInt3050 == local93.aByteArray85.length - 2 && local93.aByteArray85[arg0.anInt3050 + 1] == 0) {
				local108 = true;
			}
		}
		if (arg0.anInt3032 >= 0 && local93.aByteArray84 != null && (this.anIntArray171[arg0.anInt3043] & 0x1) == 0 && (arg0.anInt3049 < 0 || this.aClass1_Sub12ArrayArray2[arg0.anInt3043][arg0.anInt3049] != arg0)) {
			if (local93.anInt6653 <= 0) {
				arg0.anInt3032 += 128;
			} else {
				arg0.anInt3032 += (int) (Math.pow(2.0D, local126 * (double) local93.anInt6653) * 128.0D + 0.5D);
			}
			while (local93.aByteArray84.length - 2 > arg0.anInt3031 && (local93.aByteArray84[arg0.anInt3031 + 2] & 0xFF) << 8 < arg0.anInt3032) {
				arg0.anInt3031 += 2;
			}
			if (arg0.anInt3031 == local93.aByteArray84.length - 2) {
				local108 = true;
			}
		}
		if (!local108) {
			arg0.aClass1_Sub3_Sub2_1.method2355(arg0.anInt3052, this.method2240(arg0), this.method2211(arg0));
			return false;
		}
		arg0.aClass1_Sub3_Sub2_1.method2361(arg0.anInt3052);
		if (arg3 == null) {
			arg0.aClass1_Sub3_Sub2_1.method4454(arg2);
		} else {
			arg0.aClass1_Sub3_Sub2_1.method4457(arg3, arg1, arg2);
		}
		if (arg0.aClass1_Sub3_Sub2_1.method2333()) {
			this.aClass1_Sub3_Sub4_1.aClass1_Sub3_Sub3_2.method3527(arg0.aClass1_Sub3_Sub2_1);
		}
		arg0.method2601();
		if (arg0.anInt3032 >= 0) {
			arg0.method6172();
			if (arg0.anInt3049 > 0 && this.aClass1_Sub12ArrayArray2[arg0.anInt3043][arg0.anInt3049] == arg0) {
				this.aClass1_Sub12ArrayArray2[arg0.anInt3043][arg0.anInt3049] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
	public synchronized void method2213() {
		this.method2226(true);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
	private void method2214(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method2234(local18, local30, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method2223(local24, local30, local18);
			} else {
				this.method2234(local18, 64, local24);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method2232(local30, local18, local24);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray176[local18] = (this.anIntArray176[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray176[local18] = (this.anIntArray176[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray174[local18] = (this.anIntArray174[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray174[local18] = (this.anIntArray174[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray184[local18] = (local30 << 7) + (this.anIntArray184[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray184[local18] = local30 + (this.anIntArray184[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray181[local18] = (local30 << 7) + (this.anIntArray181[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray181[local18] = local30 + (this.anIntArray181[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray173[local18] = (local30 << 7) + (this.anIntArray173[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray173[local18] = local30 + (this.anIntArray173[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray172[local18] = (local30 << 7) + (this.anIntArray172[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray172[local18] = (this.anIntArray172[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray171[local18] |= 0x1;
				} else {
					this.anIntArray171[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray171[local18] |= 0x2;
				} else {
					this.method2231(local18);
					this.anIntArray171[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray178[local18] = (local30 << 7) + (this.anIntArray178[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray178[local18] = local30 + (this.anIntArray178[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray178[local18] = (this.anIntArray178[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray178[local18] = (this.anIntArray178[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method2244(local18);
			}
			if (local24 == 121) {
				this.method2241(local18);
			}
			if (local24 == 123) {
				this.method2225(local18);
			}
			@Pc(493) int local493;
			if (local24 == 6) {
				local493 = this.anIntArray178[local18];
				if (local493 == 16384) {
					this.anIntArray179[local18] = (local30 << 7) + (this.anIntArray179[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local493 = this.anIntArray178[local18];
				if (local493 == 16384) {
					this.anIntArray179[local18] = local30 + (this.anIntArray179[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray175[local18] = (local30 << 7) + (this.anIntArray175[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray175[local18] = (this.anIntArray175[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray171[local18] |= 0x4;
				} else {
					this.method2243(local18);
					this.anIntArray171[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method2216(local18, (this.anIntArray177[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method2216(local18, (this.anIntArray177[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method2239(local18, this.anIntArray176[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method2209(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F46) >> 8);
			this.method2217(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2210(true);
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)V")
	private void method2216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray177[arg0] = arg1;
		this.anIntArray182[arg0] = (int) ((double) 2097152 * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZ)V")
	private void method2217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray180[arg0] = arg1;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)I")
	public int method2218() {
		return this.anInt2632;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
	public synchronized void method2219() {
		for (@Pc(13) Class1_Sub10 local13 = (Class1_Sub10) this.aClass183_8.method5052(); local13 != null; local13 = (Class1_Sub10) this.aClass183_8.method5050()) {
			local13.method6172();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!hj;Lclient!qj;BLclient!oe;I)Z")
	public synchronized boolean method2220(@OriginalArg(0) Class85 arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(3) Class1_Sub28 arg2) {
		arg2.method4191();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(35) Class1_Sub23 local35 = (Class1_Sub23) arg2.aClass183_25.method5052(); local35 != null; local35 = (Class1_Sub23) arg2.aClass183_25.method5050()) {
			@Pc(41) int local41 = (int) local35.aLong235;
			@Pc(49) Class1_Sub10 local49 = (Class1_Sub10) this.aClass183_8.method5053((long) local41);
			if (local49 == null) {
				local49 = Static22.method552(local41, arg1);
				if (local49 == null) {
					local9 = false;
					continue;
				}
				this.aClass183_8.method5055((long) local41, local49);
			}
			if (!local49.method2266(local23, arg0, local35.aByteArray64)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method4192();
		}
		return local9;
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)Z")
	public synchronized boolean method2221() {
		return this.aClass124_1.method3620();
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)V")
	public synchronized void method2222(@OriginalArg(1) int arg0) {
		this.anInt2632 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIII)V")
	private void method2223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2234(arg2, 64, arg0);
		if ((this.anIntArray171[arg2] & 0x2) != 0) {
			for (@Pc(26) Class1_Sub12 local26 = (Class1_Sub12) this.aClass1_Sub3_Sub4_1.aClass130_32.method3759(); local26 != null; local26 = (Class1_Sub12) this.aClass1_Sub3_Sub4_1.aClass130_32.method3748()) {
				if (arg2 == local26.anInt3043 && local26.anInt3032 < 0) {
					this.aClass1_Sub12ArrayArray1[arg2][local26.anInt3039] = null;
					this.aClass1_Sub12ArrayArray1[arg2][arg0] = local26;
					@Pc(65) int local65 = (local26.anInt3038 * local26.anInt3037 >> 12) + local26.anInt3048;
					local26.anInt3048 += arg0 - local26.anInt3039 << 8;
					local26.anInt3038 = 4096;
					local26.anInt3039 = arg0;
					local26.anInt3037 = local65 - local26.anInt3048;
					return;
				}
			}
		}
		@Pc(110) Class1_Sub10 local110 = (Class1_Sub10) this.aClass183_8.method5053((long) this.anIntArray185[arg2]);
		if (local110 == null) {
			return;
		}
		@Pc(118) Class1_Sub13_Sub1 local118 = local110.aClass1_Sub13_Sub1Array1[arg0];
		if (local118 == null) {
			return;
		}
		@Pc(125) Class1_Sub12 local125 = new Class1_Sub12();
		local125.anInt3043 = arg2;
		local125.aClass1_Sub10_1 = local110;
		local125.aClass1_Sub13_Sub1_1 = local118;
		local125.aClass208_1 = local110.aClass208Array1[arg0];
		local125.anInt3049 = local110.aByteArray18[arg0];
		local125.anInt3039 = arg0;
		local125.anInt3044 = local110.anInt2696 * arg1 * arg1 * local110.aByteArray19[arg0] + 1024 >> 11;
		local125.anInt3033 = local110.aByteArray17[arg0] & 0xFF;
		local125.anInt3048 = (arg0 << 8) - (local110.aShortArray28[arg0] & 0x7FFF);
		local125.anInt3050 = 0;
		local125.anInt3036 = 0;
		local125.anInt3041 = 0;
		local125.anInt3032 = -1;
		local125.anInt3031 = 0;
		if (this.anIntArray175[arg2] == 0) {
			local125.aClass1_Sub3_Sub2_1 = Static362.method2352(local118, this.method2236(local125), this.method2240(local125), this.method2211(local125));
		} else {
			local125.aClass1_Sub3_Sub2_1 = Static362.method2352(local118, this.method2236(local125), 0, this.method2211(local125));
			this.method2233(local125, local110.aShortArray28[arg0] < 0);
		}
		if (local110.aShortArray28[arg0] < 0) {
			local125.aClass1_Sub3_Sub2_1.method2364(-1);
		}
		if (local125.anInt3049 >= 0) {
			@Pc(273) Class1_Sub12 local273 = this.aClass1_Sub12ArrayArray2[arg2][local125.anInt3049];
			if (local273 != null && local273.anInt3032 < 0) {
				this.aClass1_Sub12ArrayArray1[arg2][local273.anInt3039] = null;
				local273.anInt3032 = 0;
			}
			this.aClass1_Sub12ArrayArray2[arg2][local125.anInt3049] = local125;
		}
		this.aClass1_Sub3_Sub4_1.aClass130_32.method3760(local125);
		this.aClass1_Sub12ArrayArray1[arg2][arg0] = local125;
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
	private void method2224() {
		@Pc(8) int local8 = this.anInt2676;
		@Pc(17) int local17 = this.anInt2677;
		@Pc(20) long local20 = this.aLong82;
		if (this.aClass1_Sub28_1 != null && this.anInt2678 == local17) {
			this.method2235(this.aBoolean181, this.aClass1_Sub28_1, this.aBoolean180);
			this.method2224();
			return;
		}
		while (local17 == this.anInt2677) {
			while (local17 == this.aClass124_1.anIntArray296[local8]) {
				this.aClass124_1.method3627(local8);
				@Pc(53) int local53 = this.aClass124_1.method3621(local8);
				if (local53 == 1) {
					this.aClass124_1.method3618();
					this.aClass124_1.method3623(local8);
					if (this.aClass124_1.method3617()) {
						if (this.aClass1_Sub28_1 != null) {
							this.method2229(this.aBoolean180, this.aClass1_Sub28_1);
							this.method2224();
							return;
						}
						if (!this.aBoolean180 || local17 == 0) {
							this.method2210(true);
							this.aClass124_1.method3614();
							return;
						}
						this.aClass124_1.method3628(local20);
					}
					break;
				}
				if ((local53 & 0x80) != 0) {
					this.method2214(local53);
				}
				this.aClass124_1.method3622(local8);
				this.aClass124_1.method3623(local8);
			}
			local8 = this.aClass124_1.method3626();
			local17 = this.aClass124_1.anIntArray296[local8];
			local20 = this.aClass124_1.method3619(local17);
		}
		this.anInt2677 = local17;
		this.anInt2676 = local8;
		this.aLong82 = local20;
		if (this.aClass1_Sub28_1 != null && local17 > this.anInt2678) {
			this.anInt2676 = -1;
			this.anInt2677 = this.anInt2678;
			this.aLong82 = this.aClass124_1.method3619(this.anInt2677);
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(II)V")
	private void method2225(@OriginalArg(1) int arg0) {
		for (@Pc(21) Class1_Sub12 local21 = (Class1_Sub12) this.aClass1_Sub3_Sub4_1.aClass130_32.method3749(); local21 != null; local21 = (Class1_Sub12) this.aClass1_Sub3_Sub4_1.aClass130_32.method3756()) {
			if ((arg0 < 0 || local21.anInt3043 == arg0) && local21.anInt3032 < 0) {
				this.aClass1_Sub12ArrayArray1[local21.anInt3043][local21.anInt3039] = null;
				local21.anInt3032 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
	private synchronized void method2226(@OriginalArg(1) boolean arg0) {
		this.aClass124_1.method3614();
		this.aClass1_Sub28_1 = null;
		this.method2210(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V")
	public synchronized void method2227() {
		for (@Pc(9) Class1_Sub10 local9 = (Class1_Sub10) this.aClass183_8.method5052(); local9 != null; local9 = (Class1_Sub10) this.aClass183_8.method5050()) {
			local9.method2263();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBI)V")
	public synchronized void method2228() {
		this.method2242();
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4457(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass124_1.method3620()) {
			@Pc(14) int local14 = this.anInt2640 * this.aClass124_1.anInt4226 / Static80.anInt2184;
			do {
				@Pc(23) long local23 = this.aLong81 + (long) arg2 * (long) local14;
				if (this.aLong82 - local23 >= 0L) {
					this.aLong81 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong82 + (long) local14 - this.aLong81 - 1L) / (long) local14);
				this.aLong81 += (long) local14 * (long) local52;
				this.aClass1_Sub3_Sub4_1.method4457(arg0, arg1, local52);
				arg2 -= local52;
				arg1 += local52;
				this.method2224();
			} while (this.aClass124_1.method3620());
		}
		this.aClass1_Sub3_Sub4_1.method4457(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZILclient!oe;)V")
	public synchronized void method2229(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub28 arg1) {
		this.method2235(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!hs;B)Z")
	public boolean method2230(@OriginalArg(0) Class1_Sub12 arg0) {
		if (arg0.aClass1_Sub3_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt3032 >= 0) {
			arg0.method6172();
			if (arg0.anInt3049 > 0 && this.aClass1_Sub12ArrayArray2[arg0.anInt3043][arg0.anInt3049] == arg0) {
				this.aClass1_Sub12ArrayArray2[arg0.anInt3043][arg0.anInt3049] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(II)V")
	private void method2231(@OriginalArg(1) int arg0) {
		if ((this.anIntArray171[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class1_Sub12 local15 = (Class1_Sub12) this.aClass1_Sub3_Sub4_1.aClass130_32.method3749(); local15 != null; local15 = (Class1_Sub12) this.aClass1_Sub3_Sub4_1.aClass130_32.method3756()) {
			if (local15.anInt3043 == arg0 && this.aClass1_Sub12ArrayArray1[arg0][local15.anInt3039] == null && local15.anInt3032 < 0) {
				local15.anInt3032 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "()Lclient!af;")
	@Override
	public synchronized Class1_Sub3 method4453() {
		return this.aClass1_Sub3_Sub4_1;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "()I")
	@Override
	public synchronized int method4456() {
		return 0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZ)V")
	private void method2232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!hs;Z)V")
	public void method2233(@OriginalArg(1) Class1_Sub12 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass1_Sub13_Sub1_1.aByteArray68.length;
		@Pc(27) int local27;
		if (arg1 && arg0.aClass1_Sub13_Sub1_1.aBoolean343) {
			@Pc(39) int local39 = local8 + local8 - arg0.aClass1_Sub13_Sub1_1.anInt4951;
			local27 = (int) ((long) this.anIntArray175[arg0.anInt3043] * (long) local39 >> 6);
			local8 <<= 0x8;
			if (local8 <= local27) {
				arg0.aClass1_Sub3_Sub2_1.method2337();
				local27 = local8 + local8 - local27 - 1;
			}
		} else {
			local27 = (int) ((long) this.anIntArray175[arg0.anInt3043] * (long) local8 >> 6);
		}
		arg0.aClass1_Sub3_Sub2_1.method2353(local27);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(IIII)V")
	private void method2234(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class1_Sub12 local18 = this.aClass1_Sub12ArrayArray1[arg0][arg2];
		if (local18 == null) {
			return;
		}
		this.aClass1_Sub12ArrayArray1[arg0][arg2] = null;
		if ((this.anIntArray171[arg0] & 0x2) == 0) {
			local18.anInt3032 = 0;
			return;
		}
		for (@Pc(49) Class1_Sub12 local49 = (Class1_Sub12) this.aClass1_Sub3_Sub4_1.aClass130_32.method3749(); local49 != null; local49 = (Class1_Sub12) this.aClass1_Sub3_Sub4_1.aClass130_32.method3756()) {
			if (local49.anInt3043 == local18.anInt3043 && local49.anInt3032 < 0 && local49 != local18) {
				local18.anInt3032 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZZLclient!oe;Z)V")
	private synchronized void method2235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub28 arg1, @OriginalArg(3) boolean arg2) {
		this.method2226(arg0);
		this.aClass124_1.method3613(arg1.aByteArray67);
		this.aLong81 = 0L;
		this.aBoolean180 = arg2;
		@Pc(28) int local28 = this.aClass124_1.method3624();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			this.aClass124_1.method3627(local30);
			this.aClass124_1.method3622(local30);
			this.aClass124_1.method3623(local30);
		}
		this.anInt2676 = this.aClass124_1.method3626();
		this.anInt2677 = this.aClass124_1.anIntArray296[this.anInt2676];
		this.aLong82 = this.aClass124_1.method3619(this.anInt2677);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!hs;)I")
	private int method2236(@OriginalArg(1) Class1_Sub12 arg0) {
		@Pc(15) int local15 = arg0.anInt3048 + (arg0.anInt3037 * arg0.anInt3038 >> 12);
		local15 += this.anIntArray179[arg0.anInt3043] * (this.anIntArray180[arg0.anInt3043] - 8192) >> 12;
		@Pc(36) Class208 local36 = arg0.aClass208_1;
		@Pc(59) int local59;
		if (local36.anInt6655 > 0 && (local36.anInt6647 > 0 || this.anIntArray174[arg0.anInt3043] > 0)) {
			local59 = local36.anInt6647 << 2;
			@Pc(64) int local64 = local36.anInt6654 << 1;
			if (arg0.anInt3051 < local64) {
				local59 = arg0.anInt3051 * local59 / local64;
			}
			local59 += this.anIntArray174[arg0.anInt3043] >> 7;
			@Pc(98) double local98 = Math.sin((double) (arg0.anInt3040 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local98 * (double) local59);
		}
		local59 = (int) ((double) (arg0.aClass1_Sub13_Sub1_1.anInt4950 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static80.anInt2184 + 0.5D);
		return local59 >= 1 ? local59 : 1;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4454(@OriginalArg(0) int arg0) {
		if (this.aClass124_1.method3620()) {
			@Pc(18) int local18 = this.aClass124_1.anInt4226 * this.anInt2640 / Static80.anInt2184;
			do {
				@Pc(27) long local27 = this.aLong81 + (long) local18 * (long) arg0;
				if (this.aLong82 - local27 >= 0L) {
					this.aLong81 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong82 - this.aLong81 - 1L) / (long) local18);
				this.aLong81 += (long) local18 * (long) local56;
				arg0 -= local56;
				this.aClass1_Sub3_Sub4_1.method4454(local56);
				this.method2224();
			} while (this.aClass124_1.method3620());
		}
		this.aClass1_Sub3_Sub4_1.method4454(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()Lclient!af;")
	@Override
	public synchronized Class1_Sub3 method4451() {
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(III)V")
	private void method2239(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray185[arg0] != arg1) {
			this.anIntArray185[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass1_Sub12ArrayArray2[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!hs;)I")
	private int method2240(@OriginalArg(1) Class1_Sub12 arg0) {
		if (this.anIntArray186[arg0.anInt3043] == 0) {
			return 0;
		}
		@Pc(17) Class208 local17 = arg0.aClass208_1;
		@Pc(33) int local33 = this.anIntArray172[arg0.anInt3043] * this.anIntArray181[arg0.anInt3043] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = arg0.anInt3044 * local41 + 16384 >> 15;
		@Pc(59) int local59 = local50 * this.anInt2632 + 128 >> 8;
		local33 = this.anIntArray186[arg0.anInt3043] * local59 + 128 >> 8;
		if (local17.anInt6649 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) arg0.anInt3036 * 1.953125E-5D * (double) local17.anInt6649) * (double) local33 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(136) int local136;
		@Pc(148) int local148;
		if (local17.aByteArray85 != null) {
			local106 = arg0.anInt3041;
			local114 = local17.aByteArray85[arg0.anInt3050 + 1];
			if (arg0.anInt3050 < local17.aByteArray85.length - 2) {
				local136 = (local17.aByteArray85[arg0.anInt3050] & 0xFF) << 8;
				local148 = (local17.aByteArray85[arg0.anInt3050 + 2] & 0xFF) << 8;
				local114 += (local106 - local136) * (-local114 + local17.aByteArray85[arg0.anInt3050 - -3]) / (local148 - local136);
			}
			local33 = local114 * local33 + 32 >> 6;
		}
		if (arg0.anInt3032 > 0 && local17.aByteArray84 != null) {
			local106 = arg0.anInt3032;
			local114 = local17.aByteArray84[arg0.anInt3031 + 1];
			if (local17.aByteArray84.length - 2 > arg0.anInt3031) {
				local136 = (local17.aByteArray84[arg0.anInt3031] & 0xFF) << 8;
				local148 = (local17.aByteArray84[arg0.anInt3031 + 2] & 0xFF) << 8;
				local114 += (local106 - local136) * (-local114 + local17.aByteArray84[arg0.anInt3031 + 3]) / (local148 - local136);
			}
			local33 = local33 * local114 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
	private void method2241(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method2241(local9);
			}
			return;
		}
		this.anIntArray181[arg0] = 12800;
		this.anIntArray173[arg0] = 8192;
		this.anIntArray172[arg0] = 16383;
		this.anIntArray180[arg0] = 8192;
		this.anIntArray174[arg0] = 0;
		this.anIntArray184[arg0] = 8192;
		this.method2231(arg0);
		this.method2243(arg0);
		this.anIntArray171[arg0] = 0;
		this.anIntArray178[arg0] = 32767;
		this.anIntArray179[arg0] = 256;
		this.anIntArray175[arg0] = 0;
		this.method2216(arg0, 8192);
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(III)V")
	private void method2242() {
		this.lb[9] = 128;
		this.anIntArray176[9] = 128;
		this.method2239(9, 128);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)V")
	private void method2243(@OriginalArg(1) int arg0) {
		if ((this.anIntArray171[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class1_Sub12 local15 = (Class1_Sub12) this.aClass1_Sub3_Sub4_1.aClass130_32.method3749(); local15 != null; local15 = (Class1_Sub12) this.aClass1_Sub3_Sub4_1.aClass130_32.method3756()) {
			if (local15.anInt3043 == arg0) {
				local15.anInt3035 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IZ)V")
	private void method2244(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class1_Sub12 local8 = (Class1_Sub12) this.aClass1_Sub3_Sub4_1.aClass130_32.method3749(); local8 != null; local8 = (Class1_Sub12) this.aClass1_Sub3_Sub4_1.aClass130_32.method3756()) {
			if (arg0 < 0 || local8.anInt3043 == arg0) {
				if (local8.aClass1_Sub3_Sub2_1 != null) {
					local8.aClass1_Sub3_Sub2_1.method2361(Static80.anInt2184 / 100);
					if (local8.aClass1_Sub3_Sub2_1.method2333()) {
						this.aClass1_Sub3_Sub4_1.aClass1_Sub3_Sub3_2.method3527(local8.aClass1_Sub3_Sub2_1);
					}
					local8.method2601();
				}
				if (local8.anInt3032 < 0) {
					this.aClass1_Sub12ArrayArray1[local8.anInt3043][local8.anInt3039] = null;
				}
				local8.method6172();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(III)V")
	private synchronized void method2245() {
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray186[local15] = 256;
		}
	}
}
