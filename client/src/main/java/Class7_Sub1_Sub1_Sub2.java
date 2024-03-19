import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class7_Sub1_Sub1_Sub2 extends Class7_Sub1_Sub1 {

	@OriginalMember(owner = "client!vp", name = "Oc", descriptor = "[I")
	public static final int[] anIntArray580 = new int[99];

	@OriginalMember(owner = "client!vp", name = "Ac", descriptor = "Ljava/lang/String;")
	public String aString266;

	@OriginalMember(owner = "client!vp", name = "Wc", descriptor = "Lclient!tb;")
	public Class190 aClass190_2;

	@OriginalMember(owner = "client!vp", name = "kd", descriptor = "I")
	private int anInt7144;

	@OriginalMember(owner = "client!vp", name = "od", descriptor = "Ljava/lang/String;")
	public String aString267;

	@OriginalMember(owner = "client!vp", name = "Bc", descriptor = "I")
	public int anInt7115 = -1;

	@OriginalMember(owner = "client!vp", name = "Rc", descriptor = "I")
	public int anInt7128 = -1;

	@OriginalMember(owner = "client!vp", name = "Sc", descriptor = "I")
	public int anInt7129 = -1;

	@OriginalMember(owner = "client!vp", name = "Gc", descriptor = "B")
	private byte aByte74 = 0;

	@OriginalMember(owner = "client!vp", name = "Kc", descriptor = "I")
	public int anInt7123 = -1;

	@OriginalMember(owner = "client!vp", name = "Ec", descriptor = "I")
	public int anInt7118 = 255;

	@OriginalMember(owner = "client!vp", name = "Tc", descriptor = "Z")
	public boolean aBoolean511 = false;

	@OriginalMember(owner = "client!vp", name = "Qc", descriptor = "B")
	private byte aByte75 = 0;

	@OriginalMember(owner = "client!vp", name = "ad", descriptor = "I")
	public int anInt7135 = 0;

	@OriginalMember(owner = "client!vp", name = "Hc", descriptor = "I")
	public int anInt7120 = 0;

	@OriginalMember(owner = "client!vp", name = "Yc", descriptor = "I")
	public int anInt7133 = 0;

	@OriginalMember(owner = "client!vp", name = "Zc", descriptor = "I")
	public int anInt7134 = -1;

	@OriginalMember(owner = "client!vp", name = "cd", descriptor = "I")
	public int anInt7137 = -1;

	@OriginalMember(owner = "client!vp", name = "md", descriptor = "I")
	public int anInt7146 = -1;

	@OriginalMember(owner = "client!vp", name = "fd", descriptor = "I")
	public int anInt7139 = 0;

	@OriginalMember(owner = "client!vp", name = "nd", descriptor = "I")
	public int anInt7147 = 0;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray580[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILclient!nr;)Z")
	private boolean method5986(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class83 local11 = this.method5982();
		@Pc(29) Class165 local29 = super.anInt7046 != -1 && super.anInt7055 == 0 ? Static231.method4385(super.anInt7046) : null;
		@Pc(48) Class165 local48 = super.anInt7053 == -1 || this.aBoolean511 || super.aBoolean506 && local29 != null ? null : Static231.method4385(super.anInt7053);
		@Pc(51) int local51 = local11.anInt2844;
		@Pc(54) int local54 = local11.anInt2846;
		if (local51 != 0 || local54 != 0 || local11.anInt2830 != 0 || local11.anInt2838 != 0) {
			arg0 |= 0x7;
		}
		super.aClass86Array3[0] = this.aClass190_2.method5232(super.anInt7097, super.anInt7047, super.anInt7096, super.anInt7057, arg1, local48, super.anInt7035, arg0, super.aClass147Array3, local29, super.anInt7037);
		@Pc(101) int local101 = Static212.method6168();
		if (Static207.anInt4798 < 96 && local101 > 50) {
			Static184.method5964();
		}
		@Pc(134) int local134;
		if (Static344.anInt7238 != 0 && local101 < 50) {
			local134 = 50 - local101;
			while (Static339.anInt7355 < local134) {
				Static346.aByteArrayArray58[Static339.anInt7355] = new byte[102400];
				Static339.anInt7355++;
			}
			while (Static339.anInt7355 > local134) {
				Static339.anInt7355--;
				Static346.aByteArrayArray58[Static339.anInt7355] = null;
			}
		} else if (Static344.anInt7238 != 0) {
			Static346.aByteArrayArray58 = new byte[50][];
			Static339.anInt7355 = 0;
		}
		if (super.aClass86Array3[0] == null) {
			return false;
		}
		super.anInt7062 = super.aClass86Array3[0].method5534();
		this.method5979(super.aClass86Array3[0]);
		local134 = super.aClass175_7.method4862();
		super.anInt7071 = 0;
		super.anInt7051 = 0;
		super.anInt7036 = 0;
		if (local51 == 0 && local54 == 0) {
			this.method5974(this.method5973() << 7, this.method5973() << 7, local134);
		} else {
			this.method5974(local54, local51, local134);
			if (super.anInt7051 != 0) {
				super.aClass86Array3[0].method5566(super.anInt7051);
			}
			if (super.anInt7071 != 0) {
				super.aClass86Array3[0].method5529(super.anInt7071);
			}
			if (super.anInt7036 != 0) {
				super.aClass86Array3[0].method5550(0, super.anInt7036, 0);
			}
		}
		super.aClass86Array3[1] = null;
		if (!this.aBoolean511 && super.anInt7052 != -1 && super.anInt7060 != -1) {
			@Pc(292) Class122 local292 = Static243.method4561(super.anInt7052);
			@Pc(311) Class86 local311 = local292.method3543(super.anInt7060, super.anInt7082, super.anInt7050, (local292.aBoolean293 ? 7 : 2) | local7, arg1);
			if (local311 != null) {
				local311.method5550(0, -super.anInt7080, 0);
				if (local292.aBoolean293 && (local51 != 0 || local54 != 0)) {
					if (super.anInt7051 != 0) {
						local311.method5566(super.anInt7051);
					}
					if (super.anInt7071 != 0) {
						local311.method5529(super.anInt7071);
					}
					if (super.anInt7036 != 0) {
						local311.method5550(0, super.anInt7036, 0);
					}
				}
				super.aClass86Array3[1] = local311;
			}
		}
		super.aClass86Array3[2] = null;
		if (!this.aBoolean511 && super.anInterface6_3 != null) {
			if (Static197.anInt4521 >= super.anInt7112) {
				super.anInterface6_3 = null;
			}
			if (Static197.anInt4521 >= super.anInt7108 && Static197.anInt4521 < super.anInt7112) {
				@Pc(407) Class86 local407 = super.anInterface6_3.method5681(local7 | 0x7, arg1);
				if (local407 != null) {
					local407.method5550(super.anInt7110 - super.anInt7027, super.anInt7109 - super.anInt7031, -super.anInt7032 + super.anInt7107);
					if (local134 != 0) {
						local407.method5542(-local134 & 0x3FFF);
					}
					super.aClass86Array3[2] = local407;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!il;I)V")
	public void method5987(@OriginalArg(0) Class1_Sub16 arg0) {
		arg0.anInt6813 = 0;
		@Pc(12) int local12 = arg0.method5761();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(27) boolean local27 = (local12 & 0x2) != 0;
		@Pc(35) boolean local35 = (local12 & 0x4) != 0;
		@Pc(39) int local39 = super.method5973();
		this.method5978((local12 >> 3 & 0x7) + 1);
		this.aByte75 = (byte) (local12 >> 6 & 0x3);
		super.anInt7027 += (this.method5973() - local39) * 64;
		super.anInt7032 += (this.method5973() - local39) * 64;
		this.aByte74 = arg0.method5772();
		this.anInt7146 = arg0.method5772();
		this.anInt7129 = arg0.method5772();
		this.anInt7147 = 0;
		@Pc(111) int local111 = -1;
		@Pc(114) int[] local114 = new int[12];
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(178) int local178;
		for (@Pc(116) int local116 = 0; local116 < 12; local116++) {
			@Pc(122) int local122 = arg0.method5761();
			if (local122 == 0) {
				local114[local116] = 0;
			} else {
				local134 = arg0.method5761();
				local140 = (local122 << 8) + local134;
				if (local116 == 0 && local140 == 65535) {
					local111 = arg0.method5749();
					this.anInt7147 = arg0.method5761();
					break;
				}
				if (local140 >= 32768) {
					local140 = Static218.anIntArray365[local140 - 32768];
					local114[local116] = local140 | 0x40000000;
					local178 = Static165.method3446(local140).anInt1210;
					if (local178 != 0) {
						this.anInt7147 = local178;
					}
				} else {
					local114[local116] = local140 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(200) int[] local200 = new int[5];
		for (local134 = 0; local134 < 5; local134++) {
			local140 = arg0.method5761();
			if (local140 < 0 || Static104.aShortArrayArray2[local134].length <= local140) {
				local140 = 0;
			}
			local200[local134] = local140;
		}
		this.anInt7144 = arg0.method5749();
		this.aString267 = arg0.method5776();
		if (local27) {
			this.aString266 = arg0.method5776();
		} else {
			this.aString266 = this.aString267;
		}
		this.anInt7133 = arg0.method5761();
		if (local35) {
			this.anInt7120 = arg0.method5749();
			this.anInt7139 = this.anInt7133;
			this.anInt7115 = -1;
		} else {
			this.anInt7120 = 0;
			this.anInt7139 = arg0.method5761();
			this.anInt7115 = arg0.method5761();
			if (this.anInt7115 == 255) {
				this.anInt7115 = -1;
			}
		}
		local140 = this.anInt7135;
		this.anInt7135 = arg0.method5761();
		@Pc(319) int local319;
		if (this.anInt7135 == 0) {
			Static94.method2021(this);
		} else {
			local178 = this.anInt7123;
			@Pc(316) int local316 = this.anInt7137;
			local319 = this.anInt7128;
			@Pc(322) int local322 = this.anInt7134;
			@Pc(325) int local325 = this.anInt7118;
			this.anInt7123 = arg0.method5749();
			this.anInt7137 = arg0.method5749();
			this.anInt7128 = arg0.method5749();
			this.anInt7134 = arg0.method5749();
			this.anInt7118 = arg0.method5761();
			if (this.anInt7135 != local140 || this.anInt7123 != local178 || this.anInt7137 != local316 || local319 != this.anInt7128 || this.anInt7134 != local322 || this.anInt7118 != local325) {
				Static243.method4560(this);
			}
		}
		if (this.aClass190_2 == null) {
			this.aClass190_2 = new Class190();
		}
		local178 = this.aClass190_2.anInt6223;
		@Pc(418) int[] local418 = this.aClass190_2.anIntArray478;
		this.aClass190_2.method5229(local111, local114, local16 == 1, this.method5970(), local200);
		if (local111 != local178) {
			super.anInt7027 = super.anIntArray578[0] * 128 + this.method5973() * 64;
			super.anInt7032 = super.anIntArray579[0] * 128 + this.method5973() * 64;
		}
		if (super.anInt7070 == 2047 && local418 != null) {
			for (local319 = 0; local319 < local200.length; local319++) {
				if (local418[local319] != local200[local319]) {
					Static145.method3187();
					break;
				}
			}
		}
		if (super.aClass2_Sub7_7 != null) {
			super.aClass2_Sub7_7.method4745();
		}
		if (super.anInt7053 == -1 || !super.aBoolean506) {
			return;
		}
		@Pc(514) Class83 local514 = this.method5982();
		if (!local514.method2373(super.anInt7053)) {
			super.anInt7053 = -1;
			super.aBoolean506 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5952() {
		return false;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(B)I")
	@Override
	public int method5973() {
		return this.aClass190_2 == null || this.aClass190_2.anInt6223 == -1 ? super.method5973() : Static123.method2640(this.aClass190_2.anInt6223).anInt2458;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZZIII)V")
	public void method5988(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		super.method5966(arg3, arg0, this.method5973(), arg2, arg1);
	}

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "(I)I")
	@Override
	public int method5961() {
		return super.anInt7062;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)Z")
	public boolean method5989() {
		return this.aClass190_2 != null;
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V")
	@Override
	public void method5958() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "(B)I")
	@Override
	public int method5984() {
		return -1;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(Lclient!nr;Z)Lclient!g;")
	@Override
	public Class2_Sub3 method5951(@OriginalArg(0) Class40 arg0) {
		if (this.aClass190_2 == null || !this.method5986(1024, arg0)) {
			return null;
		}
		@Pc(19) Class11 local19 = arg0.method2782();
		@Pc(24) int local24 = super.aClass175_7.method4862();
		local19.method5492(local24);
		local19.method5489(super.anInt7027, super.anInt7031, super.anInt7032);
		@Pc(38) float local38 = arg0.method2706();
		@Pc(41) float local41 = arg0.method2783();
		if (Static190.aBoolean378) {
			@Pc(47) Class83 local47 = this.method5982();
			if (local47.aBoolean189 && (this.aClass190_2.anInt6223 == -1 || Static123.method2640(this.aClass190_2.anInt6223).aBoolean168)) {
				@Pc(80) Class165 local80 = super.anInt7046 != -1 && super.anInt7055 == 0 ? Static231.method4385(super.anInt7046) : null;
				@Pc(100) Class165 local100 = super.anInt7053 == -1 || this.aBoolean511 || super.aBoolean506 && local80 != null ? null : Static231.method4385(super.anInt7053);
				@Pc(134) Class86 local134 = Static232.method4422(0, arg0, local100 == null ? local80 : local100, 240, super.anInt7036, local24, super.aBoolean508, local100 == null ? super.anInt7047 : super.anInt7035, super.aClass86Array3[0], super.anInt7051, super.anInt7071, 0, 1, 160);
				if (local134 != null) {
					arg0.method2796(local38, local41 - 128.0F);
					arg0.method2721(false);
					local134.method5539(local19, null, 0);
					arg0.method2721(true);
				}
			}
		}
		if (Static264.aClass7_Sub1_Sub1_Sub2_2 == this) {
			arg0.method2796(local38, local41 - 144.0F);
			local19.method5496(super.anInt7027, super.anInt7031, super.anInt7032);
			for (@Pc(175) int local175 = Static36.aClass98Array1.length - 1; local175 >= 0; local175--) {
				@Pc(181) Class98 local181 = Static36.aClass98Array1[local175];
				if (local181 != null && local181.anInt3428 != -1) {
					@Pc(235) int local235;
					@Pc(224) int local224;
					if (local181.anInt3425 == 1 && local181.anInt3417 >= 0 && local181.anInt3417 < Static84.aClass7_Sub1_Sub1_Sub1Array1.length) {
						@Pc(211) Class7_Sub1_Sub1_Sub1 local211 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local181.anInt3417];
						if (local211 != null) {
							local224 = local211.anInt7027 / 32 - Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 / 32;
							local235 = local211.anInt7032 / 32 - Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 / 32;
							this.method5992(super.aClass86Array3[0], arg0, local181.anInt3428, local224, local235, 360000, local19);
						}
					}
					if (local181.anInt3425 == 2) {
						@Pc(270) int local270 = (local181.anInt3418 - Static149.anInt3667) * 4 + 2 - Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 / 32;
						local224 = (local181.anInt3427 - Static96.anInt2446) * 4 + 2 - Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 / 32;
						local235 = local181.anInt3424 * 4;
						local235 *= local235;
						this.method5992(super.aClass86Array3[0], arg0, local181.anInt3428, local270, local224, local235, local19);
					}
					if (local181.anInt3425 == 10 && local181.anInt3417 >= 0 && Static168.aClass7_Sub1_Sub1_Sub2Array1.length > local181.anInt3417) {
						@Pc(332) Class7_Sub1_Sub1_Sub2 local332 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local181.anInt3417];
						if (local332 != null) {
							local224 = local332.anInt7027 / 32 - Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 / 32;
							local235 = local332.anInt7032 / 32 - Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 / 32;
							this.method5992(super.aClass86Array3[0], arg0, local181.anInt3428, local224, local235, 360000, local19);
						}
					}
				}
			}
			local19.method5492(local24);
			local19.method5489(super.anInt7027, super.anInt7031, super.anInt7032);
		}
		arg0.method2796(local38, local41);
		@Pc(394) Class2_Sub3 local394 = Static159.method3981(super.aClass86Array3.length);
		if (super.aClass2_Sub7_7 == null) {
			arg0.method2740(super.aClass86Array3, local19, local394.aClass2_Sub6Array1, Static264.aClass7_Sub1_Sub1_Sub2_2 == this ? 1 : 0);
		} else {
			@Pc(401) Class117 local401 = super.aClass2_Sub7_7.method4737();
			arg0.method2778(super.aClass86Array3, local401, local19, local394.aClass2_Sub6Array1, Static264.aClass7_Sub1_Sub1_Sub2_2 == this ? 1 : 0);
		}
		this.method5969(arg0, super.aClass86Array3, false);
		if (super.aClass86Array3[2] != null) {
			if (local24 != 0) {
				super.aClass86Array3[2].method5542(local24);
			}
			super.aClass86Array3[2].method5550(super.anInt7027 - super.anInt7110, -super.anInt7109 + super.anInt7031, super.anInt7032 - super.anInt7107);
		}
		return local394;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!nr;I)V")
	@Override
	public void method5957(@OriginalArg(0) Class40 arg0) {
		if (this.aClass190_2 != null && (super.aBoolean510 || this.method5986(0, arg0))) {
			this.method5969(arg0, super.aClass86Array3, super.aBoolean510);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!nr;IIZLclient!cb;I)V")
	@Override
	public void method5956(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method5991() {
		return this.aString266;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!qc;ILclient!nr;IIIILclient!ao;)V")
	private void method5992(@OriginalArg(0) Class86 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class11 arg6) {
		@Pc(11) int local11 = arg3 * arg3 + arg4 * arg4;
		if (local11 < 16 || arg5 < local11) {
			return;
		}
		@Pc(32) int local32 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class86 local51 = Static15.method445(local32, super.anInt7051, super.anInt7032, super.anInt7027, super.anInt7071, arg0, arg1, super.anInt7036, arg2, super.anInt7031);
		if (local51 != null) {
			arg1.method2721(false);
			local51.method5539(arg6, null, 0);
			arg1.method2721(true);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method5993() {
		@Pc(13) String local13 = "";
		if (Static248.aStringArray32 != null) {
			local13 = local13 + Static248.aStringArray32[this.aByte75];
		}
		if (Static167.anIntArray284 != null && Static167.anIntArray284[this.aByte75] != -1) {
			@Pc(42) Class1_Sub1_Sub16 local42 = Static260.method4759(Static167.anIntArray284[this.aByte75]);
			if (local42.aChar4 == 's') {
				local13 = local13 + local42.method4212(this.aByte74 & 0xFF);
			} else {
				Static58.method1402("gdn1", new Throwable());
				Static167.anIntArray284[this.aByte75] = -1;
			}
		}
		local13 = local13 + this.aString267;
		if (Static276.aStringArray39 != null) {
			local13 = local13 + Static276.aStringArray39[this.aByte75];
		}
		return local13;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)I")
	@Override
	protected int method5970() {
		return this.anInt7144;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!nr;II)Z")
	@Override
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass190_2 == null || !this.method5986(65536, arg1)) {
			return true;
		}
		@Pc(27) Class11 local27 = arg1.method2782();
		@Pc(32) int local32 = super.aClass175_7.method4862();
		local27.method5492(local32);
		local27.method5496(super.anInt7027, super.anInt7031, super.anInt7032);
		for (@Pc(45) int local45 = 0; local45 < super.aClass86Array3.length; local45++) {
			if (super.aClass86Array3[local45] != null) {
				return super.aClass86Array3[local45].method5556(arg2, arg0, local27, true);
			}
		}
		return false;
	}
}
