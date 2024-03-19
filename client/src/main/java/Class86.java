import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public abstract class Class86 {

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	protected Class86() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method5521(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!tn;IZ[ZIILclient!tn;[IZILclient!jp;)V")
	private void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class197 arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class1_Sub18 arg10) {
		@Pc(19) int local19;
		if (arg1 == null || arg9 == 0) {
			for (local19 = 0; local19 < arg6.anInt6397; local19++) {
				@Pc(26) short local26 = arg6.aShortArray100[local19];
				if (arg4 == null || arg4[local26] == arg8 || arg10.anIntArray259[local26] == 0) {
					@Pc(51) short local51 = arg6.aShortArray105[local19];
					if (local51 != -1) {
						this.method5563(0, arg0 & arg10.anIntArray258[local51], arg3, arg10.anIntArrayArray19[local51], 0, 0, arg5, 0, arg7);
					}
					this.method5563(arg6.aShortArray103[local19], arg0 & arg10.anIntArray258[local26], arg3, arg10.anIntArrayArray19[local26], arg6.aShortArray99[local19], arg6.aShortArray104[local19], arg5, arg10.anIntArray259[local26], arg7);
				}
			}
			return;
		}
		local19 = 0;
		@Pc(117) int local117 = 0;
		for (@Pc(119) int local119 = 0; local119 < arg10.anInt3659; local119++) {
			@Pc(123) boolean local123 = false;
			if (local19 < arg6.anInt6397 && local119 == arg6.aShortArray100[local19]) {
				local123 = true;
			}
			@Pc(145) boolean local145 = false;
			if (arg1.anInt6397 > local117 && local119 == arg1.aShortArray100[local117]) {
				local145 = true;
			}
			if (local123 || local145) {
				if (arg4 == null || arg8 == arg4[local119] || arg10.anIntArray259[local119] == 0) {
					@Pc(195) short local195 = 0;
					@Pc(200) int local200 = arg10.anIntArray259[local119];
					if (local200 == 3) {
						local195 = 128;
					}
					@Pc(219) short local219;
					@Pc(215) short local215;
					@Pc(217) short local217;
					@Pc(213) short local213;
					@Pc(211) byte local211;
					if (local123) {
						local211 = arg6.aByteArray77[local19];
						local215 = arg6.aShortArray99[local19];
						local213 = arg6.aShortArray105[local19];
						local217 = arg6.aShortArray103[local19];
						local219 = arg6.aShortArray104[local19];
						local19++;
					} else {
						local211 = 0;
						local213 = -1;
						local215 = local195;
						local217 = local195;
						local219 = local195;
					}
					@Pc(274) short local274;
					@Pc(259) short local259;
					@Pc(264) short local264;
					@Pc(269) short local269;
					@Pc(254) byte local254;
					if (local145) {
						local254 = arg1.aByteArray77[local117];
						local259 = arg1.aShortArray99[local117];
						local264 = arg1.aShortArray103[local117];
						local269 = arg1.aShortArray105[local117];
						local274 = arg1.aShortArray104[local117];
						local117++;
					} else {
						local269 = -1;
						local264 = local195;
						local274 = local195;
						local254 = 0;
						local259 = local195;
					}
					@Pc(300) int local300;
					@Pc(302) int local302;
					@Pc(304) int local304;
					if ((local211 & 0x2) == 0 && (local254 & 0x1) == 0) {
						@Pc(318) int local318;
						if (local200 == 2) {
							local318 = local274 - local219 & 0x3FFF;
							@Pc(325) int local325 = local259 - local215 & 0x3FFF;
							if (local318 >= 8192) {
								local318 -= 16384;
							}
							if (local325 >= 8192) {
								local325 -= 16384;
							}
							@Pc(343) int local343 = local264 - local217 & 0x3FFF;
							local300 = local219 + local318 * arg9 / arg2 & 0x3FFF;
							if (local343 >= 8192) {
								local343 -= 16384;
							}
							local302 = arg9 * local325 / arg2 + local215 & 0x3FFF;
							local304 = arg9 * local343 / arg2 + local217 & 0x3FFF;
						} else if (local200 == 7) {
							local318 = local274 - local219 & 0x3F;
							if (local318 >= 32) {
								local318 -= 64;
							}
							local300 = local318 * arg9 / arg2 + local219 & 0x3F;
							local302 = (local259 - local215) * arg9 / arg2 + local215;
							local304 = local217 + (local264 - local217) * arg9 / arg2;
						} else {
							local300 = arg9 * (local274 - local219) / arg2 + local219;
							local304 = arg9 * (local264 - local217) / arg2 + local217;
							local302 = local215 + (local259 - local215) * arg9 / arg2;
						}
					} else {
						local300 = local219;
						local302 = local215;
						local304 = local217;
					}
					if (local213 != -1) {
						this.method5563(0, arg10.anIntArray258[local213] & arg0, arg3, arg10.anIntArrayArray19[local213], 0, 0, arg5, 0, arg7);
					} else if (local269 != -1) {
						this.method5563(0, arg0 & arg10.anIntArray258[local269], arg3, arg10.anIntArrayArray19[local269], 0, 0, arg5, 0, arg7);
					}
					this.method5563(local304, arg10.anIntArray258[local119] & arg0, arg3, arg10.anIntArrayArray19[local119], local302, local300, arg5, local200, arg7);
				} else {
					if (local123) {
						local19++;
					}
					if (local145) {
						local117++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ao;Lclient!np;II)V")
	public abstract void method5523(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class2_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
	public abstract void method5524();

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()Z")
	protected abstract boolean method5525();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public abstract void method5526(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "()I")
	public abstract int method5527();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII[IIILclient!kj;Lclient!kj;ZI)V")
	public final void method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class1_Sub1_Sub14 arg6, @OriginalArg(8) Class1_Sub1_Sub14 arg7, @OriginalArg(9) boolean arg8) {
		if (arg2 == -1 || !this.method5525()) {
			return;
		}
		@Pc(17) Class197 local17 = arg6.aClass197Array1[arg2];
		@Pc(20) Class1_Sub18 local20 = local17.aClass1_Sub18_1;
		@Pc(22) Class197 local22 = null;
		if (arg7 != null) {
			local22 = arg7.aClass197Array1[arg0];
			if (local20 != local22.aClass1_Sub18_1) {
				local22 = null;
			}
		}
		this.method5522(arg3, local22, arg5, arg8, null, 0, local17, arg4, false, arg1, local20);
		this.method5557();
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public abstract void method5529(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()I")
	public abstract int method5530();

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "()I")
	public abstract int method5531();

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "()[Lclient!dn;")
	public abstract Class49[] method5532();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILclient!gm;III)V")
	protected final void method5533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class77 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = -arg3 / 2;
		@Pc(19) int local19 = -arg5 / 2;
		@Pc(29) int local29 = arg2.method3994(arg0 + local14, local19 + arg4);
		@Pc(33) int local33 = arg3 / 2;
		@Pc(38) int local38 = -arg5 / 2;
		@Pc(48) int local48 = arg2.method3994(arg0 + local33, local38 + arg4);
		@Pc(53) int local53 = -arg3 / 2;
		@Pc(57) int local57 = arg5 / 2;
		@Pc(66) int local66 = arg2.method3994(local53 + arg0, arg4 + local57);
		@Pc(70) int local70 = arg3 / 2;
		@Pc(74) int local74 = arg5 / 2;
		@Pc(85) int local85 = arg2.method3994(arg0 + local70, arg4 - -local74);
		@Pc(96) int local96 = local48 > local29 ? local29 : local48;
		@Pc(107) int local107 = local85 > local66 ? local66 : local85;
		@Pc(114) int local114 = local85 <= local48 ? local85 : local48;
		if (arg5 != 0) {
			@Pc(133) int local133 = (int) (Math.atan2((double) (local96 - local107), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local133 != 0) {
				this.method5566(local133);
			}
		}
		@Pc(148) int local148 = local66 > local29 ? local29 : local66;
		@Pc(153) int local153 = local29 + local85;
		if (arg3 != 0) {
			@Pc(168) int local168 = (int) (Math.atan2((double) (local148 - local114), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local168 != 0) {
				this.method5529(local168);
			}
		}
		if (local153 > local66 + local48) {
			local153 = local66 + local48;
		}
		local153 = (local153 >> 1) - arg1;
		if (local153 != 0) {
			this.method5550(0, local153, 0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "()I")
	public abstract int method5534();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
	protected abstract void method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "()I")
	public abstract int method5536();

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "()I")
	public abstract int method5537();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(SS)V")
	public abstract void method5538(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ao;Lclient!np;I)V")
	public abstract void method5539(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class2_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
	public abstract void method5540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "()I")
	public abstract int method5541();

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
	public abstract void method5542(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "()I")
	public abstract int method5543();

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "()[Lclient!la;")
	public abstract Class116[] method5544();

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "()I")
	public abstract int method5545();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!kj;ILclient!kj;IILclient!kj;IIIILclient!kj;[ZZIB)V")
	public final void method5546(@OriginalArg(0) Class1_Sub1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub14 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class1_Sub1_Sub14 arg10, @OriginalArg(11) boolean[] arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int arg13) {
		if (arg4 == -1) {
			return;
		}
		if (arg11 == null || arg6 == -1) {
			this.method5548(arg13, 0, arg8, arg9, arg2, arg12, arg0, arg4);
		} else if (this.method5525()) {
			@Pc(37) Class197 local37 = arg0.aClass197Array1[arg4];
			@Pc(40) Class1_Sub18 local40 = local37.aClass1_Sub18_1;
			@Pc(42) Class197 local42 = null;
			if (arg2 != null) {
				local42 = arg2.aClass197Array1[arg13];
				if (local42.aClass1_Sub18_1 != local40) {
					local42 = null;
				}
			}
			@Pc(66) Class197 local66 = arg10.aClass197Array1[arg6];
			@Pc(68) Class197 local68 = null;
			if (arg5 != null) {
				local68 = arg5.aClass197Array1[arg1];
				if (local40 != local68.aClass1_Sub18_1) {
					local68 = null;
				}
			}
			this.method5522(65535, local42, arg8, arg12, arg11, 0, local37, null, false, arg9, local40);
			this.method5521(0, new int[0], 0, 0, 0, 0, arg12);
			this.method5522(65535, local68, arg7, arg12, arg11, 0, local66, null, true, arg3, local40);
			this.method5557();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!gm;Lclient!gm;III)V")
	public abstract void method5547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) Class77 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIILclient!kj;ZLclient!kj;I)V")
	public final void method5548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub1_Sub14 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class1_Sub1_Sub14 arg6, @OriginalArg(8) int arg7) {
		if (arg7 == -1 || !this.method5525()) {
			return;
		}
		@Pc(16) Class197 local16 = arg6.aClass197Array1[arg7];
		@Pc(19) Class1_Sub18 local19 = local16.aClass1_Sub18_1;
		@Pc(21) Class197 local21 = null;
		if (arg4 != null) {
			local21 = arg4.aClass197Array1[arg0];
			if (local21.aClass1_Sub18_1 != local19) {
				local21 = null;
			}
		}
		this.method5522(65535, local21, arg2, arg5, null, arg1, local16, null, false, arg3, local19);
		this.method5557();
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
	public abstract void method5550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
	public abstract void method5551(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!kj;)V")
	public final void method5552(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub14 arg1) {
		if (arg0 == -1 || !this.method5525()) {
			return;
		}
		@Pc(19) Class197 local19 = arg1.aClass197Array1[arg0];
		@Pc(29) Class1_Sub18 local29 = local19.aClass1_Sub18_1;
		for (@Pc(31) int local31 = 0; local31 < local19.anInt6397; local31++) {
			@Pc(38) short local38 = local19.aShortArray100[local31];
			if (local29.aBooleanArray9[local38]) {
				if (local19.aShortArray105[local31] != -1) {
					this.method5535(0, 0, 0, 0);
				}
				this.method5535(local29.anIntArray259[local38], local19.aShortArray104[local31], local19.aShortArray99[local31], local19.aShortArray103[local31]);
			}
		}
		this.method5557();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!qc;IIIZ)V")
	public abstract void method5553(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "()I")
	public abstract int method5555();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!ao;Z)Z")
	public abstract boolean method5556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "()V")
	protected abstract void method5557();

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "()V")
	public abstract void method5558();

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(SS)V")
	public abstract void method5559(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method5560(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!oc;)Lclient!oc;")
	public abstract Class1_Sub1_Sub6 method5561(@OriginalArg(0) Class1_Sub1_Sub6 arg0);

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
	public abstract void method5562(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZ[IIIIII[I)V")
	private void method5563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		@Pc(52) int local52;
		if (arg6 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local52 = -arg5;
				arg5 = arg0;
				arg0 = local52;
			} else if (arg7 == 3) {
				local52 = arg5;
				arg5 = arg0;
				arg0 = local52;
			} else if (arg7 == 2) {
				local52 = arg5;
				arg5 = -arg0 & 0x3FFF;
				arg0 = local52 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg5 = -arg5;
				arg0 = -arg0;
			} else if (arg7 == 2) {
				arg5 = -arg5 & 0x3FFF;
				arg0 = -arg0 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local52 = arg5;
				arg5 = -arg0;
				arg0 = local52;
			} else if (arg7 == 3) {
				local52 = arg5;
				arg5 = arg0;
				arg0 = local52;
			} else if (arg7 == 2) {
				local52 = arg5;
				arg5 = arg0 & 0x3FFF;
				arg0 = -local52 & 0x3FFF;
			}
		}
		if (arg1 == 65535) {
			this.method5521(arg7, arg3, arg5, arg4, arg0, arg6, arg2);
		} else {
			this.method5560(arg7, arg3, arg5, arg4, arg0, arg2, arg1, arg8);
		}
	}

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "()Z")
	public abstract boolean method5564();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BIZ)Lclient!qc;")
	public abstract Class86 method5565(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)V")
	public abstract void method5566(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)V")
	public abstract void method5567(@OriginalArg(0) int arg0);
}
