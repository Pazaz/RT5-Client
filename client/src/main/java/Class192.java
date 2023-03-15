import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class192 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!gn;")
	private Model aClass31_7;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "[Z")
	private boolean[] aBooleanArray49;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "Lclient!nb;")
	private Class157 aClass157_2;

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
	private int anInt5423;

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
	private int anInt5426;

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
	private int anInt5431;

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
	private int anInt5441;

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "Lclient!oh;")
	public ParticleSystem aClass12_Sub5_5;

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "Lclient!kb;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_6;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
	private int anInt5428 = -1;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Z")
	private boolean aBoolean385 = false;

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "Z")
	private boolean aBoolean387 = false;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
	private int anInt5424 = -1;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
	private int anInt5421 = -32768;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
	public final int anInt5433;

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
	private int anInt5438;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "B")
	private final byte aByte58;

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
	public final int anInt5429;

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
	private int anInt5422;

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
	public final int anInt5432;

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "Z")
	private final boolean aBoolean386;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIIIZI)V")
	public Class192(@OriginalArg(0) RasteriserBase arg0, @OriginalArg(1) LocType arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt5433 = arg2;
		this.anInt5438 = arg7;
		this.aBoolean387 = arg8;
		this.aByte58 = (byte) arg5;
		this.aByte59 = (byte) arg4;
		this.anInt5429 = arg3;
		this.anInt5422 = arg6;
		this.anInt5432 = arg1.anInt1351;
		this.aBoolean386 = arg0.method2878() && arg1.aBoolean110 && !this.aBoolean387;
		if (arg9 != -1) {
			this.aBoolean385 = true;
		}
		this.method4932(arg9);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method4930(@OriginalArg(0) RasteriserBase arg0) {
		this.method4941(true, true, arg0, 131072, this.anInt5438, this.anInt5422);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)V")
	private void method4932(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = arg0;
		@Pc(13) boolean local13 = false;
		if (arg0 == -1) {
			@Pc(22) LocType local22 = client.LocTypes.get(this.anInt5432);
			@Pc(24) LocType local24 = local22;
			if (local22.anIntArray94 != null) {
				local22 = local22.method1533(VarpDomain.instance);
			}
			if (local22 == null) {
				return;
			}
			if (local24 == local22) {
				local24 = null;
			}
			if (local22.anIntArray95 != null) {
				if (this.aClass157_2 != null && local22.method1531(this.aClass157_2.anInt4028)) {
					return;
				}
				local11 = local22.method1527();
				if (local22.anInt1351 != this.anInt5428) {
					local13 = local22.aBoolean119;
				}
			} else if (local22.anInt1326 == -1) {
				if (local24 != null && local24.anIntArray95 != null) {
					if (this.aClass157_2 != null && local24.method1531(this.aClass157_2.anInt4028)) {
						return;
					}
					local11 = local24.method1527();
					if (local24.anInt1351 != this.anInt5428) {
						local13 = local24.aBoolean119;
					}
				} else if (local24 != null && local24.anInt1326 != -1 && local24.anInt1351 != this.anInt5428) {
					local13 = local24.aBoolean119;
					local11 = local24.anInt1326;
				}
			} else if (local22.anInt1351 != this.anInt5428) {
				local11 = local22.anInt1326;
				local13 = local22.aBoolean119;
			}
		}
		if (local11 == -1) {
			this.aClass157_2 = null;
			return;
		}
		this.aClass31_7 = null;
		if (this.aClass157_2 == null || local11 != this.aClass157_2.anInt4028) {
			this.aClass157_2 = client.SeqTypes.method2371(local11);
		} else if (this.aClass157_2.anInt4022 == 0) {
			return;
		}
		if (this.aClass157_2.anIntArray262 == null) {
			this.aClass157_2 = null;
			return;
		}
		if (local13) {
			this.anInt5426 = (int) ((double) this.aClass157_2.anIntArray262.length * Math.random());
			this.anInt5431 = (int) ((double) this.aClass157_2.anIntArray261[this.anInt5426] * Math.random()) + 1;
		} else {
			this.anInt5426 = 0;
			this.anInt5431 = 1;
		}
		this.anInt5423 = this.anInt5426 + 1;
		if (this.anInt5423 < 0 || this.anInt5423 >= this.aClass157_2.anIntArray262.length) {
			this.anInt5423 = -1;
		}
		this.anInt5441 = client.cycle - this.anInt5431;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIB)V")
	private void method4933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass157_2 == null) {
				if (this.aBoolean385) {
					return;
				}
				this.method4932(-1);
				if (this.aClass157_2 == null) {
					return;
				}
			}
			@Pc(31) int local31 = client.cycle - this.anInt5441;
			if (local31 > 100 && this.aClass157_2.anInt4032 > 0) {
				@Pc(53) int local53 = this.aClass157_2.anIntArray262.length - this.aClass157_2.anInt4032;
				while (this.anInt5426 < local53 && this.aClass157_2.anIntArray261[this.anInt5426] < local31) {
					local31 -= this.aClass157_2.anIntArray261[this.anInt5426];
					this.anInt5426++;
				}
				if (this.anInt5426 >= local53) {
					@Pc(92) int local92 = 0;
					for (@Pc(94) int local94 = local53; local94 < this.aClass157_2.anIntArray262.length; local94++) {
						local92 += this.aClass157_2.anIntArray261[local94];
					}
					local31 %= local92;
				}
				this.anInt5423 = this.anInt5426 + 1;
				if (this.anInt5423 >= this.aClass157_2.anIntArray262.length) {
					this.anInt5423 -= this.aClass157_2.anInt4032;
					if (this.anInt5423 < 0 || this.anInt5423 >= this.aClass157_2.anIntArray262.length) {
						this.anInt5423 = -1;
					}
				}
			}
			while (this.aClass157_2.anIntArray261[this.anInt5426] < local31) {
				Static1.method4(this.aClass157_2, false, this.aByte59, arg0, arg1, this.anInt5426);
				local31 -= this.aClass157_2.anIntArray261[this.anInt5426];
				this.anInt5426++;
				if (this.anInt5426 >= this.aClass157_2.anIntArray262.length) {
					this.anInt5426 -= this.aClass157_2.anInt4032;
					if (this.anInt5426 < 0 || this.anInt5426 >= this.aClass157_2.anIntArray262.length) {
						this.aClass157_2 = null;
						continue label80;
					}
				}
				this.anInt5423 = this.anInt5426 + 1;
				if (this.anInt5423 >= this.aClass157_2.anIntArray262.length) {
					this.anInt5423 -= this.aClass157_2.anInt4032;
					if (this.anInt5423 < 0 || this.aClass157_2.anIntArray262.length <= this.anInt5423) {
						this.anInt5423 = -1;
					}
				}
			}
			this.anInt5431 = local31;
			this.anInt5441 = client.cycle - local31;
			return;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	public void method4934(@OriginalArg(1) int arg0) {
		this.aBoolean385 = true;
		this.method4932(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!wm;ILclient!gn;IIZBI)V")
	public void method4935(@OriginalArg(0) RasteriserBase arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Model arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class114[] local6 = arg2.method3808();
		@Pc(9) Class163[] local9 = arg2.method3840();
		if ((this.aClass12_Sub5_5 == null || this.aClass12_Sub5_5.aBoolean322) && (local6 != null || local9 != null)) {
			@Pc(26) LocType local26 = client.LocTypes.get(this.anInt5432);
			if (local26.anIntArray94 != null) {
				local26 = local26.method1533(VarpDomain.instance);
			}
			if (local26 != null) {
				this.aClass12_Sub5_5 = new ParticleSystem(client.cycle);
			}
		}
		if (this.aClass12_Sub5_5 == null) {
			return;
		}
		if (arg5) {
			this.aClass12_Sub5_5.method4357(arg0, (long) client.cycle, local6, local9);
		} else {
			this.aClass12_Sub5_5.method4355((long) client.cycle);
		}
		this.aClass12_Sub5_5.method4361(this.aByte59, arg3, arg6, arg1, arg4);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)I")
	public int method4936() {
		return this.anInt5421;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)Z")
	public boolean method4938() {
		return this.aBoolean386;
	}

	@OriginalMember(owner = "client!ql", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub5_5 != null) {
			this.aClass12_Sub5_5.method4354();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!wm;)V")
	public void method4940(@OriginalArg(1) RasteriserBase arg0) {
		if (this.aClass2_Sub2_Sub4_6 != null) {
			Static154.method2780(this.aClass2_Sub2_Sub4_6, this.aByte58, this.anInt5422, this.anInt5438, this.aBooleanArray49);
			this.aClass2_Sub2_Sub4_6 = null;
			this.aBooleanArray49 = null;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZZLclient!wm;IIIB)Lclient!gn;")
	public Model method4941(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) RasteriserBase arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) LocType local11 = client.LocTypes.get(this.anInt5432);
		if (local11.anIntArray94 != null) {
			local11 = local11.method1533(VarpDomain.instance);
		}
		if (local11 == null) {
			this.method4940(arg2);
			this.anInt5428 = -1;
			this.anInt5424 = this.anInt5426;
			return null;
		}
		if (!this.aBoolean385 && this.anInt5428 != local11.anInt1351) {
			this.aClass31_7 = null;
			this.method4932(-1);
		}
		this.method4933(arg5, arg4);
		@Pc(79) boolean local79 = arg0 & this.aBoolean386 & client.preferences.sceneryShadowsType != 0;
		@Pc(117) boolean local117 = local79 & (local11.anInt1351 != this.anInt5428 || (this.anInt5424 != this.anInt5426 || this.aClass157_2 != null && (this.aClass157_2.aBoolean262 || Static318.aBoolean408) && this.anInt5423 != this.anInt5426) && client.preferences.sceneryShadowsType >= 2);
		if (arg1 && !local117) {
			this.anInt5428 = local11.anInt1351;
			this.anInt5424 = this.anInt5426;
			return null;
		}
		if (local117) {
			Static154.method2780(this.aClass2_Sub2_Sub4_6, this.aByte58, this.anInt5422, this.anInt5438, this.aBooleanArray49);
		}
		@Pc(149) Class6 local149 = Scene.aClass6Array4[this.aByte58];
		@Pc(167) Class6 local167;
		if (this.aBoolean387) {
			local167 = Scene.aClass6Array3[0];
		} else {
			local167 = this.aByte58 < 3 ? Scene.aClass6Array4[this.aByte58 + 1] : null;
		}
		@Pc(175) Model local175 = null;
		if (this.aClass157_2 != null) {
			if (local117) {
				arg3 |= 0x20000;
			}
			local175 = local11.method1518(this.anInt5423, this.anInt5431, local149, this.anInt5433 == 11 ? 10 : this.anInt5433, this.aClass157_2, this.anInt5433 == 11 ? this.anInt5429 + 4 : this.anInt5429, arg2, this.anInt5426, local167, local149.method5728(this.anInt5422, this.anInt5438), this.anInt5422, this.anInt5438, arg3);
			if (local175 == null) {
				this.anInt5421 = 0;
				this.aBooleanArray49 = null;
				this.aClass2_Sub2_Sub4_6 = null;
			} else {
				if (local117) {
					if (this.aBooleanArray49 == null) {
						this.aBooleanArray49 = new boolean[4];
					}
					this.aClass2_Sub2_Sub4_6 = local175.method3839(this.aClass2_Sub2_Sub4_6);
					Static57.method1619(this.aClass2_Sub2_Sub4_6, this.aByte58, arg5, arg4, this.aBooleanArray49);
				}
				this.anInt5421 = local175.method3802();
			}
			this.aClass31_7 = null;
		} else if (this.aClass31_7 != null && arg3 == (arg3 & this.aClass31_7.method3827()) && this.anInt5428 == local11.anInt1351) {
			local175 = this.aClass31_7;
		} else {
			if (this.aClass31_7 != null) {
				arg3 |= this.aClass31_7.method3827();
			}
			@Pc(247) Class105 local247 = local11.method1519(local149.method5728(this.anInt5422, this.anInt5438), local149, this.anInt5433 == 11 ? this.anInt5429 + 4 : this.anInt5429, this.anInt5438, this.anInt5422, arg3, local117, arg2, local167, this.anInt5433 == 11 ? 10 : this.anInt5433);
			if (local247 == null) {
				this.aClass2_Sub2_Sub4_6 = null;
				this.anInt5421 = 0;
				this.aBooleanArray49 = null;
				this.aClass31_7 = null;
			} else {
				local175 = local247.aClass31_3;
				this.aClass31_7 = local247.aClass31_3;
				if (local117) {
					this.aBooleanArray49 = null;
					this.aClass2_Sub2_Sub4_6 = local247.aClass2_Sub2_Sub4_3;
					Static57.method1619(this.aClass2_Sub2_Sub4_6, this.aByte58, arg5, arg4, null);
				}
				this.anInt5421 = local175.method3802();
			}
		}
		this.anInt5428 = local11.anInt1351;
		this.anInt5438 = arg4;
		this.anInt5424 = this.anInt5426;
		this.anInt5422 = arg5;
		return local175;
	}
}
