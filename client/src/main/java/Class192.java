import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class192 {

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!oc;")
	private Class1_Sub1_Sub6 aClass1_Sub1_Sub6_4;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!qc;")
	private Class86 aClass86_4;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "[Z")
	private boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!qr;")
	private Class165 aClass165_3;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	private int anInt6252;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	private int anInt6256;

	@OriginalMember(owner = "client!td", name = "C", descriptor = "I")
	private int anInt6265;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "I")
	private int anInt6268;

	@OriginalMember(owner = "client!td", name = "M", descriptor = "Lclient!qp;")
	public Class2_Sub7 aClass2_Sub7_6;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Z")
	private boolean aBoolean448 = false;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "Z")
	private boolean aBoolean449 = false;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	private int anInt6255 = -32768;

	@OriginalMember(owner = "client!td", name = "D", descriptor = "I")
	private int anInt6266 = -1;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "I")
	private int anInt6267 = -1;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	private int anInt6246;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "I")
	public final int anInt6264;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "I")
	private int anInt6258;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "I")
	public final int anInt6263;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "B")
	private final byte aByte61;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "B")
	private final byte aByte62;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "I")
	public final int anInt6262;

	@OriginalMember(owner = "client!td", name = "F", descriptor = "Z")
	private final boolean aBoolean450;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!nr;Lclient!ta;IIIIIIZI)V")
	public Class192(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt6246 = arg7;
		this.anInt6264 = arg3;
		this.aBoolean448 = arg8;
		this.anInt6258 = arg6;
		this.anInt6263 = arg2;
		this.aByte61 = (byte) arg5;
		this.aByte62 = (byte) arg4;
		this.anInt6262 = arg1.anInt6205;
		this.aBoolean450 = arg0.method2803() && arg1.aBoolean443 && !this.aBoolean448;
		if (arg9 != -1) {
			this.aBoolean449 = true;
		}
		this.method5251(arg9);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
	private void method5243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass165_3 == null) {
				if (this.aBoolean449) {
					return;
				}
				this.method5251(-1);
				if (this.aClass165_3 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static197.anInt4521 - this.anInt6268;
			if (local34 > 100 && this.aClass165_3.anInt5581 > 0) {
				@Pc(56) int local56 = this.aClass165_3.anIntArray407.length - this.aClass165_3.anInt5581;
				while (this.anInt6256 < local56 && this.aClass165_3.anIntArray410[this.anInt6256] < local34) {
					local34 -= this.aClass165_3.anIntArray410[this.anInt6256];
					this.anInt6256++;
				}
				if (this.anInt6256 >= local56) {
					@Pc(95) int local95 = 0;
					for (@Pc(97) int local97 = local56; local97 < this.aClass165_3.anIntArray407.length; local97++) {
						local95 += this.aClass165_3.anIntArray410[local97];
					}
					local34 %= local95;
				}
				this.anInt6265 = this.anInt6256 + 1;
				if (this.aClass165_3.anIntArray407.length <= this.anInt6265) {
					this.anInt6265 -= this.aClass165_3.anInt5581;
					if (this.anInt6265 < 0 || this.anInt6265 >= this.aClass165_3.anIntArray407.length) {
						this.anInt6265 = -1;
					}
				}
			}
			while (local34 > this.aClass165_3.anIntArray410[this.anInt6256]) {
				Static209.method4128(arg0, false, this.anInt6256, arg1, this.aClass165_3);
				local34 -= this.aClass165_3.anIntArray410[this.anInt6256];
				this.anInt6256++;
				if (this.anInt6256 >= this.aClass165_3.anIntArray407.length) {
					this.anInt6256 -= this.aClass165_3.anInt5581;
					if (this.anInt6256 < 0 || this.anInt6256 >= this.aClass165_3.anIntArray407.length) {
						this.aClass165_3 = null;
						continue label80;
					}
				}
				this.anInt6265 = this.anInt6256 + 1;
				if (this.anInt6265 >= this.aClass165_3.anIntArray407.length) {
					this.anInt6265 -= this.aClass165_3.anInt5581;
					if (this.anInt6265 < 0 || this.aClass165_3.anIntArray407.length <= this.anInt6265) {
						this.anInt6265 = -1;
					}
				}
			}
			this.anInt6252 = local34;
			this.anInt6268 = Static197.anInt4521 - local34;
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZILclient!qc;Lclient!nr;IZI)V")
	public void method5244(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) Class40 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class49[] local6 = arg3.method5532();
		@Pc(9) Class116[] local9 = arg3.method5544();
		if ((this.aClass2_Sub7_6 == null || this.aClass2_Sub7_6.aBoolean388) && (local6 != null || local9 != null)) {
			@Pc(25) Class189 local25 = Static83.method1840(this.anInt6262);
			if (local25.anIntArray470 != null) {
				local25 = local25.method5210();
			}
			if (local25 != null) {
				this.aClass2_Sub7_6 = new Class2_Sub7(Static197.anInt4521);
			}
		}
		if (this.aClass2_Sub7_6 == null) {
			return;
		}
		if (arg1) {
			this.aClass2_Sub7_6.method4744(arg4, (long) Static197.anInt4521, local6, local9);
		} else {
			this.aClass2_Sub7_6.method4739((long) Static197.anInt4521);
		}
		this.aClass2_Sub7_6.method4747(this.aByte62, arg0, arg6, arg5, arg2);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!nr;IIZZI)Lclient!qc;")
	public Class86 method5245(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		@Pc(18) Class189 local18 = Static83.method1840(this.anInt6262);
		if (local18.anIntArray470 != null) {
			local18 = local18.method5210();
		}
		if (local18 == null) {
			this.method5248(arg1);
			this.anInt6266 = -1;
			this.anInt6267 = this.anInt6256;
			return null;
		}
		if (!this.aBoolean449 && local18.anInt6205 != this.anInt6266) {
			this.aClass86_4 = null;
			this.method5251(-1);
		}
		this.method5243(arg2, arg3);
		@Pc(71) boolean local71 = arg4 & this.aBoolean450 & Static102.anInt2545 != 0;
		@Pc(114) boolean local114 = local71 & (local18.anInt6205 != this.anInt6266 || (this.anInt6256 != this.anInt6267 || this.aClass165_3 != null && (this.aClass165_3.aBoolean393 || Static187.aBoolean305) && this.anInt6265 != this.anInt6256) && Static102.anInt2545 >= 2);
		if (arg5 && !local114) {
			this.anInt6266 = local18.anInt6205;
			this.anInt6267 = this.anInt6256;
			return null;
		}
		if (local114) {
			Static104.method2157(this.aClass1_Sub1_Sub6_4, this.aByte61, this.anInt6258, this.anInt6246, this.aBooleanArray22);
		}
		@Pc(146) Class77 local146 = Static118.aClass77Array1[this.aByte61];
		@Pc(164) Class77 local164;
		if (this.aBoolean448) {
			local164 = Static336.aClass77Array3[0];
		} else {
			local164 = this.aByte61 < 3 ? Static118.aClass77Array1[this.aByte61 + 1] : null;
		}
		@Pc(172) Class86 local172 = null;
		if (this.aClass165_3 != null) {
			if (local114) {
				arg0 |= 0x20000;
			}
			local172 = local18.method5211(arg1, local146.method3994(this.anInt6258, this.anInt6246), this.anInt6246, this.anInt6263 == 11 ? this.anInt6264 + 4 : this.anInt6264, local146, this.anInt6252, this.anInt6258, arg0, this.anInt6265, this.aClass165_3, this.anInt6263 == 11 ? 10 : this.anInt6263, this.anInt6256, local164);
			if (local172 == null) {
				this.anInt6255 = 0;
				this.aBooleanArray22 = null;
				this.aClass1_Sub1_Sub6_4 = null;
			} else {
				if (local114) {
					if (this.aBooleanArray22 == null) {
						this.aBooleanArray22 = new boolean[4];
					}
					this.aClass1_Sub1_Sub6_4 = local172.method5561(this.aClass1_Sub1_Sub6_4);
					Static162.method3411(this.aClass1_Sub1_Sub6_4, this.aByte61, arg2, arg3, this.aBooleanArray22);
				}
				this.anInt6255 = local172.method5534();
			}
			this.aClass86_4 = null;
		} else if (this.aClass86_4 != null && (arg0 & this.aClass86_4.method5531()) == arg0 && this.anInt6266 == local18.anInt6205) {
			local172 = this.aClass86_4;
		} else {
			if (this.aClass86_4 != null) {
				arg0 |= this.aClass86_4.method5531();
			}
			@Pc(239) Class17 local239 = local18.method5206(this.anInt6263 == 11 ? 10 : this.anInt6263, arg1, local146, this.anInt6263 == 11 ? this.anInt6264 + 4 : this.anInt6264, this.anInt6246, this.anInt6258, local146.method3994(this.anInt6258, this.anInt6246), arg0, local164, local114);
			if (local239 == null) {
				this.aClass1_Sub1_Sub6_4 = null;
				this.aClass86_4 = null;
				this.aBooleanArray22 = null;
				this.anInt6255 = 0;
			} else {
				local172 = local239.aClass86_1;
				this.aClass86_4 = local239.aClass86_1;
				if (local114) {
					this.aClass1_Sub1_Sub6_4 = local239.aClass1_Sub1_Sub6_1;
					this.aBooleanArray22 = null;
					Static162.method3411(this.aClass1_Sub1_Sub6_4, this.aByte61, arg2, arg3, null);
				}
				this.anInt6255 = local172.method5534();
			}
		}
		this.anInt6266 = local18.anInt6205;
		this.anInt6246 = arg3;
		this.anInt6267 = this.anInt6256;
		this.anInt6258 = arg2;
		return local172;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!nr;I)V")
	public void method5248(@OriginalArg(0) Class40 arg0) {
		if (this.aClass1_Sub1_Sub6_4 != null) {
			Static104.method2157(this.aClass1_Sub1_Sub6_4, this.aByte61, this.anInt6258, this.anInt6246, this.aBooleanArray22);
			this.aBooleanArray22 = null;
			this.aClass1_Sub1_Sub6_4 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z")
	public boolean method5249() {
		return this.aBoolean450;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
	private void method5251(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class189 local18 = Static83.method1840(this.anInt6262);
			@Pc(20) Class189 local20 = local18;
			if (local18.anIntArray470 != null) {
				local18 = local18.method5210();
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray472 != null) {
				if (this.aClass165_3 != null && local18.method5218(this.aClass165_3.anInt5565)) {
					return;
				}
				local7 = local18.method5213();
				if (this.anInt6266 != local18.anInt6205) {
					local9 = local18.aBoolean434;
				}
			} else if (local18.anInt6208 == -1) {
				if (local20 != null && local20.anIntArray472 != null) {
					if (this.aClass165_3 != null && local20.method5218(this.aClass165_3.anInt5565)) {
						return;
					}
					local7 = local20.method5213();
					if (this.anInt6266 != local20.anInt6205) {
						local9 = local20.aBoolean434;
					}
				} else if (local20 != null && local20.anInt6208 != -1 && local20.anInt6205 != this.anInt6266) {
					local9 = local20.aBoolean434;
					local7 = local20.anInt6208;
				}
			} else if (local18.anInt6205 != this.anInt6266) {
				local9 = local18.aBoolean434;
				local7 = local18.anInt6208;
			}
		}
		if (local7 == -1) {
			this.aClass165_3 = null;
			return;
		}
		this.aClass86_4 = null;
		if (this.aClass165_3 == null || this.aClass165_3.anInt5565 != local7) {
			this.aClass165_3 = Static231.method4385(local7);
		} else if (this.aClass165_3.anInt5575 == 0) {
			return;
		}
		if (this.aClass165_3.anIntArray407 == null) {
			this.aClass165_3 = null;
			return;
		}
		if (local9) {
			this.anInt6256 = (int) ((double) this.aClass165_3.anIntArray407.length * Math.random());
			this.anInt6252 = (int) (Math.random() * (double) this.aClass165_3.anIntArray410[this.anInt6256]) + 1;
		} else {
			this.anInt6252 = 1;
			this.anInt6256 = 0;
		}
		this.anInt6265 = this.anInt6256 + 1;
		if (this.anInt6265 < 0 || this.aClass165_3.anIntArray407.length <= this.anInt6265) {
			this.anInt6265 = -1;
		}
		this.anInt6268 = Static197.anInt4521 - this.anInt6252;
	}

	@OriginalMember(owner = "client!td", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub7_6 != null) {
			this.aClass2_Sub7_6.method4743();
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)I")
	public int method5254() {
		return this.anInt6255;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!nr;B)V")
	public void method5255(@OriginalArg(0) Class40 arg0) {
		this.method5245(131072, arg0, this.anInt6258, this.anInt6246, true, true);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(II)V")
	public void method5256(@OriginalArg(0) int arg0) {
		this.aBoolean449 = true;
		this.method5251(arg0);
	}
}
