import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!bl", name = "A", descriptor = "Lclient!ra;")
	private Class198 aClass198_1;

	@OriginalMember(owner = "client!bl", name = "L", descriptor = "Z")
	private boolean aBoolean56;

	@OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
	private int anInt685 = 0;

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "Lclient!ad;")
	private final Class4 aClass4_13 = new Class4(16);

	@OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
	private int anInt688 = 0;

	@OriginalMember(owner = "client!bl", name = "K", descriptor = "Lclient!ld;")
	private final Class135 aClass135_12 = new Class135();

	@OriginalMember(owner = "client!bl", name = "P", descriptor = "J")
	private long aLong21 = 0L;

	@OriginalMember(owner = "client!bl", name = "G", descriptor = "Lclient!rq;")
	private final Class207 aClass207_3;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
	private final int anInt668;

	@OriginalMember(owner = "client!bl", name = "M", descriptor = "Z")
	private boolean aBoolean57;

	@OriginalMember(owner = "client!bl", name = "J", descriptor = "Lclient!ld;")
	private Class135 aClass135_11;

	@OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
	private final int anInt683;

	@OriginalMember(owner = "client!bl", name = "N", descriptor = "Z")
	private final boolean aBoolean58;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "Lclient!rq;")
	private final Class207 aClass207_2;

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "Lclient!pp;")
	private final Class183 aClass183_1;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "Lclient!ro;")
	private final Class206 aClass206_2;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
	private final int anInt670;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "Lclient!ut;")
	private Class2_Sub2_Sub10 aClass2_Sub2_Sub10_1;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILclient!rq;Lclient!rq;Lclient!pp;Lclient!ro;IIZ)V")
	public Class25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) Class183 arg3, @OriginalArg(4) Class206 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass207_3 = arg1;
		this.anInt668 = arg0;
		if (this.aClass207_3 == null) {
			this.aBoolean57 = false;
		} else {
			this.aBoolean57 = true;
			this.aClass135_11 = new Class135();
		}
		this.anInt683 = arg6;
		this.aBoolean58 = arg7;
		this.aClass207_2 = arg2;
		this.aClass183_1 = arg3;
		this.aClass206_2 = arg4;
		this.anInt670 = arg5;
		if (this.aClass207_2 != null) {
			this.aClass2_Sub2_Sub10_1 = this.aClass206_2.method5226(this.anInt668, this.aClass207_2);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	public void method892() {
		if (this.aClass135_11 == null || this.method884() == null) {
			return;
		}
		for (@Pc(24) Class2 local24 = this.aClass135_12.method3551(); local24 != null; local24 = this.aClass135_12.method3552()) {
			@Pc(30) int local30 = (int) local24.aLong232;
			if (local30 < 0 || local30 >= this.aClass198_1.anInt5592 || this.aClass198_1.anIntArray376[local30] == 0) {
				local24.method6468();
			} else {
				if (this.aByteArray5[local30] == 0) {
					this.method901(local30, 1);
				}
				if (this.aByteArray5[local30] == -1) {
					this.method901(local30, 2);
				}
				if (this.aByteArray5[local30] == 1) {
					local24.method6468();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
	public void method894() {
		if (this.aClass135_11 != null) {
			if (this.method884() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Class2 local30;
			@Pc(36) int local36;
			@Pc(129) Class2 local129;
			if (this.aBoolean57) {
				local25 = true;
				for (local30 = this.aClass135_11.method3551(); local30 != null; local30 = this.aClass135_11.method3552()) {
					local36 = (int) local30.aLong232;
					if (this.aByteArray5[local36] == 0) {
						this.method901(local36, 1);
					}
					if (this.aByteArray5[local36] == 0) {
						local25 = false;
					} else {
						local30.method6468();
					}
				}
				while (this.anInt688 < this.aClass198_1.anIntArray376.length) {
					if (this.aClass198_1.anIntArray376[this.anInt688] == 0) {
						this.anInt688++;
					} else {
						if (this.aClass206_2.anInt5741 >= 250) {
							local25 = false;
							break;
						}
						if (this.aByteArray5[this.anInt688] == 0) {
							this.method901(this.anInt688, 1);
						}
						if (this.aByteArray5[this.anInt688] == 0) {
							local129 = new Class2();
							local129.aLong232 = this.anInt688;
							this.aClass135_11.method3540(local129);
							local25 = false;
						}
						this.anInt688++;
					}
				}
				if (local25) {
					this.anInt688 = 0;
					this.aBoolean57 = false;
				}
			} else if (this.aBoolean56) {
				local25 = true;
				for (local30 = this.aClass135_11.method3551(); local30 != null; local30 = this.aClass135_11.method3552()) {
					local36 = (int) local30.aLong232;
					if (this.aByteArray5[local36] != 1) {
						this.method901(local36, 2);
					}
					if (this.aByteArray5[local36] == 1) {
						local30.method6468();
					} else {
						local25 = false;
					}
				}
				while (this.anInt688 < this.aClass198_1.anIntArray376.length) {
					if (this.aClass198_1.anIntArray376[this.anInt688] == 0) {
						this.anInt688++;
					} else {
						if (this.aClass183_1.method4636()) {
							local25 = false;
							break;
						}
						if (this.aByteArray5[this.anInt688] != 1) {
							this.method901(this.anInt688, 2);
						}
						if (this.aByteArray5[this.anInt688] != 1) {
							local129 = new Class2();
							local129.aLong232 = this.anInt688;
							this.aClass135_11.method3540(local129);
							local25 = false;
						}
						this.anInt688++;
					}
				}
				if (local25) {
					this.anInt688 = 0;
					this.aBoolean56 = false;
				}
			} else {
				this.aClass135_11 = null;
			}
		}
		if (!this.aBoolean58 || Static204.method3685() < this.aLong21) {
			return;
		}
		for (@Pc(329) Class2_Sub2_Sub10 local329 = (Class2_Sub2_Sub10) this.aClass4_13.method80(); local329 != null; local329 = (Class2_Sub2_Sub10) this.aClass4_13.method79()) {
			if (!local329.aBoolean416) {
				if (local329.aBoolean417) {
					if (!local329.aBoolean418) {
						throw new RuntimeException();
					}
					local329.method6468();
				} else {
					local329.aBoolean417 = true;
				}
			}
		}
		this.aLong21 = Static204.method3685() + 1000L;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)I")
	public int method895() {
		return this.aClass198_1 == null ? 0 : this.aClass198_1.anInt5591;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)I")
	public int method896() {
		if (this.method884() == null) {
			return this.aClass2_Sub2_Sub10_1 == null ? 0 : this.aClass2_Sub2_Sub10_1.method5651();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method889(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub2_Sub10 local9 = this.method901(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method5648();
			local9.method6468();
			return local17;
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(Z)I")
	public int method897() {
		if (this.aClass198_1 == null) {
			return 0;
		} else if (this.aBoolean57) {
			@Pc(20) Class2 local20 = this.aClass135_11.method3551();
			return local20 == null ? 0 : (int) local20.aLong232;
		} else {
			return this.aClass198_1.anInt5591;
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I")
	public int method898() {
		return this.anInt685;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
	public void method899() {
		if (this.aClass207_3 != null) {
			this.aBoolean56 = true;
			if (this.aClass135_11 == null) {
				this.aClass135_11 = new Class135();
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)Lclient!ut;")
	private Class2_Sub2_Sub10 method901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub2_Sub10 local13 = (Class2_Sub2_Sub10) this.aClass4_13.method90((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean418 && local13.aBoolean416) {
			local13.method6468();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass207_3 == null || this.aByteArray5[arg0] == -1) {
					if (this.aClass183_1.method4644()) {
						return null;
					}
					local13 = this.aClass183_1.method4642(true, this.anInt668, (byte) 2, arg0);
				} else {
					local13 = this.aClass206_2.method5226(arg0, this.aClass207_3);
				}
			} else if (arg1 == 1) {
				if (this.aClass207_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass206_2.method5227(arg0, this.aClass207_3);
			} else if (arg1 == 2) {
				if (this.aClass207_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray5[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass183_1.method4636()) {
					return null;
				}
				local13 = this.aClass183_1.method4642(false, this.anInt668, (byte) 2, arg0);
			} else {
				throw new RuntimeException();
			}
			this.aClass4_13.method87(local13, (long) arg0);
		}
		if (local13.aBoolean416) {
			return null;
		}
		@Pc(162) byte[] local162 = local13.method5648();
		@Pc(189) int local189;
		@Pc(292) Class2_Sub2_Sub10_Sub1 local292;
		if (!(local13 instanceof Class2_Sub2_Sub10_Sub2)) {
			try {
				if (local162 == null || local162.length <= 2) {
					throw new RuntimeException();
				}
				Static143.aCRC32_1.reset();
				Static143.aCRC32_1.update(local162, 0, local162.length - 2);
				local189 = (int) Static143.aCRC32_1.getValue();
				if (this.aClass198_1.anIntArray382[arg0] != local189) {
					throw new RuntimeException();
				}
				this.aClass183_1.anInt5063 = 0;
				this.aClass183_1.anInt5062 = 0;
			} catch (@Pc(350) RuntimeException local350) {
				this.aClass183_1.method4643();
				local13.method6468();
				if (local13.aBoolean418 && !this.aClass183_1.method4644()) {
					local292 = this.aClass183_1.method4642(true, this.anInt668, (byte) 2, arg0);
					this.aClass4_13.method87(local292, (long) arg0);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.aClass198_1.anIntArray378[arg0] >>> 8);
			local162[local162.length - 1] = (byte) this.aClass198_1.anIntArray378[arg0];
			if (this.aClass207_3 != null) {
				this.aClass206_2.method5229(local162, arg0, this.aClass207_3);
				if (this.aByteArray5[arg0] != 1) {
					this.anInt685++;
					this.aByteArray5[arg0] = 1;
				}
			}
			if (!local13.aBoolean418) {
				local13.method6468();
			}
			return local13;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			Static143.aCRC32_1.reset();
			Static143.aCRC32_1.update(local162, 0, local162.length - 2);
			local189 = (int) Static143.aCRC32_1.getValue();
			if (local189 != this.aClass198_1.anIntArray382[arg0]) {
				throw new RuntimeException();
			}
			@Pc(225) int local225 = ((local162[local162.length - 2] & 0xFF) << 8) + (local162[local162.length - 1] & 0xFF);
			if ((this.aClass198_1.anIntArray378[arg0] & 0xFFFF) != local225) {
				throw new RuntimeException();
			}
			if (this.aByteArray5[arg0] != 1) {
				this.anInt685++;
				this.aByteArray5[arg0] = 1;
			}
			if (!local13.aBoolean418) {
				local13.method6468();
			}
			return local13;
		} catch (@Pc(266) Exception local266) {
			this.aByteArray5[arg0] = -1;
			local13.method6468();
			if (local13.aBoolean418 && !this.aClass183_1.method4644()) {
				local292 = this.aClass183_1.method4642(true, this.anInt668, (byte) 2, arg0);
				this.aClass4_13.method87(local292, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
	@Override
	public void method885(@OriginalArg(0) int arg0) {
		if (this.aClass207_3 == null) {
			return;
		}
		for (@Pc(20) Class2 local20 = this.aClass135_12.method3551(); local20 != null; local20 = this.aClass135_12.method3552()) {
			if ((long) arg0 == local20.aLong232) {
				return;
			}
		}
		@Pc(46) Class2 local46 = new Class2();
		local46.aLong232 = arg0;
		this.aClass135_12.method3540(local46);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)I")
	@Override
	public int method887(@OriginalArg(0) int arg0) {
		@Pc(19) Class2_Sub2_Sub10 local19 = (Class2_Sub2_Sub10) this.aClass4_13.method90((long) arg0);
		return local19 == null ? 0 : local19.method5651();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Lclient!ra;")
	@Override
	public Class198 method884() {
		if (this.aClass198_1 != null) {
			return this.aClass198_1;
		}
		if (this.aClass2_Sub2_Sub10_1 == null) {
			if (this.aClass183_1.method4644()) {
				return null;
			}
			this.aClass2_Sub2_Sub10_1 = this.aClass183_1.method4642(true, 255, (byte) 0, this.anInt668);
		}
		if (this.aClass2_Sub2_Sub10_1.aBoolean416) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass2_Sub2_Sub10_1.method5648();
		if (this.aClass2_Sub2_Sub10_1 instanceof Class2_Sub2_Sub10_Sub2) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass198_1 = new Class198(local48, this.anInt670);
				if (this.anInt683 != this.aClass198_1.anInt5587) {
					throw new RuntimeException();
				}
			} catch (@Pc(138) RuntimeException local138) {
				this.aClass198_1 = null;
				if (this.aClass183_1.method4644()) {
					this.aClass2_Sub2_Sub10_1 = null;
				} else {
					this.aClass2_Sub2_Sub10_1 = this.aClass183_1.method4642(true, 255, (byte) 0, this.anInt668);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass198_1 = new Class198(local48, this.anInt670);
			} catch (@Pc(68) RuntimeException local68) {
				this.aClass183_1.method4643();
				this.aClass198_1 = null;
				if (this.aClass183_1.method4644()) {
					this.aClass2_Sub2_Sub10_1 = null;
				} else {
					this.aClass2_Sub2_Sub10_1 = this.aClass183_1.method4642(true, 255, (byte) 0, this.anInt668);
				}
				return null;
			}
			if (this.aClass207_2 != null) {
				this.aClass206_2.method5229(local48, this.anInt668, this.aClass207_2);
			}
		}
		this.aClass2_Sub2_Sub10_1 = null;
		if (this.aClass207_3 != null) {
			this.anInt685 = 0;
			this.aByteArray5 = new byte[this.aClass198_1.anInt5592];
		}
		return this.aClass198_1;
	}
}
