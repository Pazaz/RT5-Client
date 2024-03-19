import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Lclient!wo;")
	private Class220 aClass220_1;

	@OriginalMember(owner = "client!kk", name = "A", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!kk", name = "Q", descriptor = "Z")
	private boolean aBoolean273;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
	private int anInt3909 = 0;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "Lclient!sf;")
	private final Class183 aClass183_16 = new Class183(16);

	@OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
	private int anInt3932 = 0;

	@OriginalMember(owner = "client!kk", name = "P", descriptor = "Lclient!mi;")
	private final Class130 aClass130_22 = new Class130();

	@OriginalMember(owner = "client!kk", name = "V", descriptor = "J")
	private long aLong116 = 0L;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "Lclient!jb;")
	private final Class96 aClass96_2;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
	private final int anInt3912;

	@OriginalMember(owner = "client!kk", name = "T", descriptor = "Z")
	private boolean aBoolean274;

	@OriginalMember(owner = "client!kk", name = "N", descriptor = "Lclient!mi;")
	private Class130 aClass130_21;

	@OriginalMember(owner = "client!kk", name = "U", descriptor = "Z")
	private final boolean aBoolean275;

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "Lclient!jb;")
	private final Class96 aClass96_3;

	@OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
	private final int anInt3923;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
	private final int anInt3917;

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "Lclient!je;")
	private final Class99 aClass99_1;

	@OriginalMember(owner = "client!kk", name = "J", descriptor = "Lclient!se;")
	private final Class182 aClass182_2;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "Lclient!wr;")
	private Class1_Sub1_Sub2 aClass1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(ILclient!jb;Lclient!jb;Lclient!se;Lclient!je;IIZ)V")
	public Class26_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) Class182 arg3, @OriginalArg(4) Class99 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass96_2 = arg1;
		this.anInt3912 = arg0;
		if (this.aClass96_2 == null) {
			this.aBoolean274 = false;
		} else {
			this.aBoolean274 = true;
			this.aClass130_21 = new Class130();
		}
		this.aBoolean275 = arg7;
		this.aClass96_3 = arg2;
		this.anInt3923 = arg5;
		this.anInt3917 = arg6;
		this.aClass99_1 = arg4;
		this.aClass182_2 = arg3;
		if (this.aClass96_3 != null) {
			this.aClass1_Sub1_Sub2_1 = this.aClass99_1.method3064(this.anInt3912, this.aClass96_3);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
	public void method3367() {
		if (this.aClass130_21 != null) {
			if (this.method3361() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class1 local23;
			@Pc(29) int local29;
			@Pc(116) Class1 local116;
			if (this.aBoolean274) {
				local18 = true;
				for (local23 = this.aClass130_21.method3749(); local23 != null; local23 = this.aClass130_21.method3756()) {
					local29 = (int) local23.aLong235;
					if (this.aByteArray35[local29] == 0) {
						this.method3377(local29, 1);
					}
					if (this.aByteArray35[local29] == 0) {
						local18 = false;
					} else {
						local23.method6172();
					}
				}
				while (this.aClass220_1.anIntArray601.length > this.anInt3932) {
					if (this.aClass220_1.anIntArray601[this.anInt3932] == 0) {
						this.anInt3932++;
					} else {
						if (this.aClass99_1.anInt3446 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray35[this.anInt3932] == 0) {
							this.method3377(this.anInt3932, 1);
						}
						if (this.aByteArray35[this.anInt3932] == 0) {
							local116 = new Class1();
							local116.aLong235 = this.anInt3932;
							this.aClass130_21.method3760(local116);
							local18 = false;
						}
						this.anInt3932++;
					}
				}
				if (local18) {
					this.aBoolean274 = false;
					this.anInt3932 = 0;
				}
			} else if (this.aBoolean273) {
				local18 = true;
				for (local23 = this.aClass130_21.method3749(); local23 != null; local23 = this.aClass130_21.method3756()) {
					local29 = (int) local23.aLong235;
					if (this.aByteArray35[local29] != 1) {
						this.method3377(local29, 2);
					}
					if (this.aByteArray35[local29] == 1) {
						local23.method6172();
					} else {
						local18 = false;
					}
				}
				while (this.aClass220_1.anIntArray601.length > this.anInt3932) {
					if (this.aClass220_1.anIntArray601[this.anInt3932] == 0) {
						this.anInt3932++;
					} else {
						if (this.aClass182_2.method5042()) {
							local18 = false;
							break;
						}
						if (this.aByteArray35[this.anInt3932] != 1) {
							this.method3377(this.anInt3932, 2);
						}
						if (this.aByteArray35[this.anInt3932] != 1) {
							local116 = new Class1();
							local116.aLong235 = this.anInt3932;
							this.aClass130_21.method3760(local116);
							local18 = false;
						}
						this.anInt3932++;
					}
				}
				if (local18) {
					this.anInt3932 = 0;
					this.aBoolean273 = false;
				}
			} else {
				this.aClass130_21 = null;
			}
		}
		if (!this.aBoolean275 || this.aLong116 > Static325.method5658()) {
			return;
		}
		for (@Pc(316) Class1_Sub1_Sub2 local316 = (Class1_Sub1_Sub2) this.aClass183_16.method5052(); local316 != null; local316 = (Class1_Sub1_Sub2) this.aClass183_16.method5050()) {
			if (!local316.aBoolean300) {
				if (local316.aBoolean301) {
					if (!local316.aBoolean299) {
						throw new RuntimeException();
					}
					local316.method6172();
				} else {
					local316.aBoolean301 = true;
				}
			}
		}
		this.aLong116 = Static325.method5658() + 1000L;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)I")
	public int method3368() {
		if (this.method3361() == null) {
			return this.aClass1_Sub1_Sub2_1 == null ? 0 : this.aClass1_Sub1_Sub2_1.method3605();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)I")
	public int method3371() {
		return this.anInt3909;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method3363(@OriginalArg(1) int arg0) {
		@Pc(9) Class1_Sub1_Sub2 local9 = this.method3377(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method3603();
			local9.method6172();
			return local17;
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
	public void method3374() {
		if (this.aClass96_2 != null) {
			this.aBoolean273 = true;
			if (this.aClass130_21 == null) {
				this.aClass130_21 = new Class130();
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(B)V")
	public void method3375() {
		if (this.aClass130_21 == null || this.method3361() == null) {
			return;
		}
		for (@Pc(19) Class1 local19 = this.aClass130_22.method3749(); local19 != null; local19 = this.aClass130_22.method3756()) {
			@Pc(25) int local25 = (int) local19.aLong235;
			if (local25 < 0 || this.aClass220_1.anInt7330 <= local25 || this.aClass220_1.anIntArray601[local25] == 0) {
				local19.method6172();
			} else {
				if (this.aByteArray35[local25] == 0) {
					this.method3377(local25, 1);
				}
				if (this.aByteArray35[local25] == -1) {
					this.method3377(local25, 2);
				}
				if (this.aByteArray35[local25] == 1) {
					local19.method6172();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Lclient!wr;")
	private Class1_Sub1_Sub2 method3377(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub1_Sub2 local13 = (Class1_Sub1_Sub2) this.aClass183_16.method5053((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean299 && local13.aBoolean300) {
			local13.method6172();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass96_2 == null || this.aByteArray35[arg0] == -1) {
					if (this.aClass182_2.method5040()) {
						return null;
					}
					local13 = this.aClass182_2.method5039(arg0, true, (byte) 2, this.anInt3912);
				} else {
					local13 = this.aClass99_1.method3064(arg0, this.aClass96_2);
				}
			} else if (arg1 == 1) {
				if (this.aClass96_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass99_1.method3066(arg0, this.aClass96_2);
			} else if (arg1 == 2) {
				if (this.aClass96_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray35[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass182_2.method5042()) {
					return null;
				}
				local13 = this.aClass182_2.method5039(arg0, false, (byte) 2, this.anInt3912);
			} else {
				throw new RuntimeException();
			}
			this.aClass183_16.method5055((long) arg0, local13);
		}
		if (local13.aBoolean300) {
			return null;
		}
		@Pc(158) byte[] local158 = local13.method3603();
		@Pc(185) int local185;
		@Pc(285) Class1_Sub1_Sub2_Sub1 local285;
		if (!(local13 instanceof Class1_Sub1_Sub2_Sub2)) {
			try {
				if (local158 == null || local158.length <= 2) {
					throw new RuntimeException();
				}
				Static7.aCRC32_1.reset();
				Static7.aCRC32_1.update(local158, 0, local158.length - 2);
				local185 = (int) Static7.aCRC32_1.getValue();
				if (local185 != this.aClass220_1.anIntArray603[arg0]) {
					throw new RuntimeException();
				}
				this.aClass182_2.anInt5977 = 0;
				this.aClass182_2.anInt5978 = 0;
			} catch (@Pc(339) RuntimeException local339) {
				this.aClass182_2.method5035();
				local13.method6172();
				if (local13.aBoolean299 && !this.aClass182_2.method5040()) {
					local285 = this.aClass182_2.method5039(arg0, true, (byte) 2, this.anInt3912);
					this.aClass183_16.method5055((long) arg0, local285);
				}
				return null;
			}
			local158[local158.length - 2] = (byte) (this.aClass220_1.anIntArray602[arg0] >>> 8);
			local158[local158.length - 1] = (byte) this.aClass220_1.anIntArray602[arg0];
			if (this.aClass96_2 != null) {
				this.aClass99_1.method3062(arg0, this.aClass96_2, local158);
				if (this.aByteArray35[arg0] != 1) {
					this.anInt3909++;
					this.aByteArray35[arg0] = 1;
				}
			}
			if (!local13.aBoolean299) {
				local13.method6172();
			}
			return local13;
		}
		try {
			if (local158 == null || local158.length <= 2) {
				throw new RuntimeException();
			}
			Static7.aCRC32_1.reset();
			Static7.aCRC32_1.update(local158, 0, local158.length - 2);
			local185 = (int) Static7.aCRC32_1.getValue();
			if (this.aClass220_1.anIntArray603[arg0] != local185) {
				throw new RuntimeException();
			}
			@Pc(216) int local216 = ((local158[local158.length - 2] & 0xFF) << 8) + (local158[local158.length - 1] & 0xFF);
			if ((this.aClass220_1.anIntArray602[arg0] & 0xFFFF) != local216) {
				throw new RuntimeException();
			}
			if (this.aByteArray35[arg0] != 1) {
				this.anInt3909++;
				this.aByteArray35[arg0] = 1;
			}
			if (!local13.aBoolean299) {
				local13.method6172();
			}
			return local13;
		} catch (@Pc(259) Exception local259) {
			this.aByteArray35[arg0] = -1;
			local13.method6172();
			if (local13.aBoolean299 && !this.aClass182_2.method5040()) {
				local285 = this.aClass182_2.method5039(arg0, true, (byte) 2, this.anInt3912);
				this.aClass183_16.method5055((long) arg0, local285);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(BI)I")
	@Override
	public int method3364(@OriginalArg(1) int arg0) {
		@Pc(17) Class1_Sub1_Sub2 local17 = (Class1_Sub1_Sub2) this.aClass183_16.method5053((long) arg0);
		return local17 == null ? 0 : local17.method3605();
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)I")
	public int method3380() {
		return this.aClass220_1 == null ? 0 : this.aClass220_1.anInt7336;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V")
	@Override
	public void method3362(@OriginalArg(1) int arg0) {
		if (this.aClass96_2 == null) {
			return;
		}
		for (@Pc(18) Class1 local18 = this.aClass130_22.method3749(); local18 != null; local18 = this.aClass130_22.method3756()) {
			if ((long) arg0 == local18.aLong235) {
				return;
			}
		}
		@Pc(42) Class1 local42 = new Class1();
		local42.aLong235 = arg0;
		this.aClass130_22.method3760(local42);
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)I")
	public int method3382() {
		if (this.aClass220_1 == null) {
			return 0;
		} else if (this.aBoolean274) {
			@Pc(26) Class1 local26 = this.aClass130_21.method3749();
			return local26 == null ? 0 : (int) local26.aLong235;
		} else {
			return this.aClass220_1.anInt7336;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lclient!wo;")
	@Override
	public Class220 method3361() {
		if (this.aClass220_1 != null) {
			return this.aClass220_1;
		}
		if (this.aClass1_Sub1_Sub2_1 == null) {
			if (this.aClass182_2.method5040()) {
				return null;
			}
			this.aClass1_Sub1_Sub2_1 = this.aClass182_2.method5039(this.anInt3912, true, (byte) 0, 255);
		}
		if (this.aClass1_Sub1_Sub2_1.aBoolean300) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass1_Sub1_Sub2_1.method3603();
		if (this.aClass1_Sub1_Sub2_1 instanceof Class1_Sub1_Sub2_Sub2) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass220_1 = new Class220(local50, this.anInt3923);
				if (this.anInt3917 != this.aClass220_1.anInt7333) {
					throw new RuntimeException();
				}
			} catch (@Pc(146) RuntimeException local146) {
				this.aClass220_1 = null;
				if (this.aClass182_2.method5040()) {
					this.aClass1_Sub1_Sub2_1 = null;
				} else {
					this.aClass1_Sub1_Sub2_1 = this.aClass182_2.method5039(this.anInt3912, true, (byte) 0, 255);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass220_1 = new Class220(local50, this.anInt3923);
			} catch (@Pc(70) RuntimeException local70) {
				this.aClass182_2.method5035();
				this.aClass220_1 = null;
				if (this.aClass182_2.method5040()) {
					this.aClass1_Sub1_Sub2_1 = null;
				} else {
					this.aClass1_Sub1_Sub2_1 = this.aClass182_2.method5039(this.anInt3912, true, (byte) 0, 255);
				}
				return null;
			}
			if (this.aClass96_3 != null) {
				this.aClass99_1.method3062(this.anInt3912, this.aClass96_3, local50);
			}
		}
		if (this.aClass96_2 != null) {
			this.aByteArray35 = new byte[this.aClass220_1.anInt7330];
			this.anInt3909 = 0;
		}
		this.aClass1_Sub1_Sub2_1 = null;
		return this.aClass220_1;
	}
}
