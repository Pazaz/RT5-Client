import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public abstract class Model {

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	protected Model() {
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIZ)Lclient!gn;")
	public abstract Model method3800(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "()Z")
	public abstract boolean method3801();

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "()I")
	public abstract int method3802();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!gn;IIIZ)V")
	public abstract void method3803(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "()Z")
	protected abstract boolean method3804();

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "()I")
	public abstract int method3805();

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "()I")
	public abstract int method3806();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public abstract void method3807(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "()[Lclient!jf;")
	public abstract Class114[] method3808();

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "()V")
	public abstract void method3810();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[ZIZIIILclient!nt;Lclient!nt;ILclient!nt;Lclient!nt;II)V")
	public final void method3811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) AnimFrameset arg8, @OriginalArg(9) AnimFrameset arg9, @OriginalArg(10) int arg10, @OriginalArg(11) AnimFrameset arg11, @OriginalArg(12) AnimFrameset arg12, @OriginalArg(14) int arg13) {
		if (arg13 == -1) {
			return;
		}
		if (arg2 == null || arg5 == -1) {
			this.method3828(arg0, arg9, arg7, arg4, arg1, arg13, arg12, 0);
		} else if (this.method3804()) {
			@Pc(33) AnimFrame local33 = arg12.frames[arg13];
			@Pc(36) AnimBase local36 = local33.base;
			@Pc(38) AnimFrame local38 = null;
			if (arg9 != null) {
				local38 = arg9.frames[arg7];
				if (local36 != local38.base) {
					local38 = null;
				}
			}
			@Pc(63) AnimFrame local63 = arg8.frames[arg5];
			@Pc(65) AnimFrame local65 = null;
			if (arg11 != null) {
				local65 = arg11.frames[arg6];
				if (local65.base != local36) {
					local65 = null;
				}
			}
			this.method3849(false, null, local36, arg2, local33, 65535, 0, arg1, arg4, local38, arg0);
			this.method3821(0, new int[0], 0, 0, 0, 0, arg4);
			this.method3849(true, null, local36, arg2, local63, 65535, 0, arg3, arg4, local65, arg10);
			this.method3836();
		}
	}

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "()I")
	public abstract int method3812();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V")
	public abstract void method3813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	public abstract void method3814(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	public abstract void method3815(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(SS)V")
	public abstract void method3816(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "()I")
	public abstract int method3817();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!nt;BI)V")
	public final void method3818(@OriginalArg(0) AnimFrameset arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.method3804()) {
			return;
		}
		@Pc(19) AnimFrame local19 = arg0.frames[arg1];
		@Pc(22) AnimBase local22 = local19.base;
		for (@Pc(28) int local28 = 0; local28 < local19.length; local28++) {
			@Pc(35) short local35 = local19.indices[local28];
			if (local22.shadow[local35]) {
				if (local19.prevOriginIndices[local28] != -1) {
					this.method3825(0, 0, 0, 0);
				}
				this.method3825(local22.types[local35], local19.x[local28], local19.y[local28], local19.z[local28]);
			}
		}
		this.method3836();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!tf;Lclient!tf;III)V")
	public abstract void method3819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) Class6 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!on;Z)Z")
	public abstract boolean method3820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method3821(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "()I")
	public abstract int method3822();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!nt;IIIILclient!nt;ZZ[I)V")
	public final void method3823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) AnimFrameset arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) AnimFrameset arg6, @OriginalArg(8) boolean arg7, @OriginalArg(10) int[] arg8) {
		if (arg4 == -1 || !this.method3804()) {
			return;
		}
		@Pc(16) AnimFrame local16 = arg6.frames[arg4];
		@Pc(19) AnimBase local19 = local16.base;
		@Pc(21) AnimFrame local21 = null;
		if (arg2 != null) {
			local21 = arg2.frames[arg5];
			if (local21.base != local19) {
				local21 = null;
			}
		}
		this.method3849(false, arg8, local19, null, local16, arg3, 0, arg1, arg7, local21, arg0);
		this.method3836();
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V")
	public abstract void method3824(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(IIII)V")
	protected abstract void method3825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "()I")
	public abstract int method3826();

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "()I")
	public abstract int method3827();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!nt;IBZIILclient!nt;I)V")
	public final void method3828(@OriginalArg(0) int arg0, @OriginalArg(1) AnimFrameset arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) AnimFrameset arg6, @OriginalArg(8) int arg7) {
		if (arg5 == -1 || !this.method3804()) {
			return;
		}
		@Pc(22) AnimFrame local22 = arg6.frames[arg5];
		@Pc(25) AnimBase local25 = local22.base;
		@Pc(27) AnimFrame local27 = null;
		if (arg1 != null) {
			local27 = arg1.frames[arg2];
			if (local25 != local27.base) {
				local27 = null;
			}
		}
		this.method3849(false, null, local25, null, local22, 65535, arg7, arg4, arg3, local27, arg0);
		this.method3836();
	}

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)V")
	public abstract void method3830(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "()I")
	public abstract int method3831();

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "()I")
	public abstract int method3832();

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)V")
	public abstract void method3833(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method3834(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!on;Lclient!au;I)V")
	public abstract void method3835(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "()V")
	protected abstract void method3836();

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "()V")
	public abstract void method3837();

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(SS)V")
	public abstract void method3838(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!kb;)Lclient!kb;")
	public abstract Class2_Sub2_Sub4 method3839(@OriginalArg(0) Class2_Sub2_Sub4 arg0);

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "()[Lclient!nm;")
	public abstract Class163[] method3840();

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(III)V")
	public abstract void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!on;Lclient!au;II)V")
	public abstract void method3844(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "(I)V")
	public abstract void method3845(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[III[IZIII)V")
	private void method3846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(36) int local36;
		if (arg7 == 1) {
			if (arg1 == 0 || arg1 == 1) {
				local36 = -arg8;
				arg8 = arg4;
				arg4 = local36;
			} else if (arg1 == 3) {
				local36 = arg8;
				arg8 = arg4;
				arg4 = local36;
			} else if (arg1 == 2) {
				local36 = arg8;
				arg8 = -arg4 & 0x3FFF;
				arg4 = local36 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg1 == 0 || arg1 == 1) {
				arg8 = -arg8;
				arg4 = -arg4;
			} else if (arg1 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg1 == 0 || arg1 == 1) {
				local36 = arg8;
				arg8 = -arg4;
				arg4 = local36;
			} else if (arg1 == 3) {
				local36 = arg8;
				arg8 = arg4;
				arg4 = local36;
			} else if (arg1 == 2) {
				local36 = arg8;
				arg8 = arg4 & 0x3FFF;
				arg4 = -local36 & 0x3FFF;
			}
		}
		if (arg3 == 65535) {
			this.method3821(arg1, arg5, arg8, arg0, arg4, arg7, arg6);
		} else {
			this.method3834(arg1, arg5, arg8, arg0, arg4, arg6, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBIIILclient!tf;I)V")
	protected final void method3848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6 arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = -arg0 / 2;
		@Pc(19) int local19 = -arg2 / 2;
		@Pc(29) int local29 = arg4.method5728(arg5 + local14, local19 + arg1);
		@Pc(33) int local33 = arg0 / 2;
		@Pc(38) int local38 = -arg2 / 2;
		@Pc(47) int local47 = arg4.method5728(local33 + arg5, local38 + arg1);
		@Pc(52) int local52 = -arg0 / 2;
		@Pc(56) int local56 = arg2 / 2;
		@Pc(65) int local65 = arg4.method5728(local52 + arg5, arg1 + local56);
		@Pc(69) int local69 = arg0 / 2;
		@Pc(73) int local73 = arg2 / 2;
		@Pc(82) int local82 = arg4.method5728(arg5 + local69, local73 + arg1);
		@Pc(89) int local89 = local29 < local47 ? local29 : local47;
		@Pc(100) int local100 = local82 > local65 ? local65 : local82;
		@Pc(107) int local107 = local47 >= local82 ? local82 : local47;
		if (arg2 != 0) {
			@Pc(122) int local122 = (int) (Math.atan2((double) (local89 - local100), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local122 != 0) {
				this.method3824(local122);
			}
		}
		@Pc(134) int local134 = local65 > local29 ? local29 : local65;
		@Pc(138) int local138 = local82 + local29;
		if (arg0 != 0) {
			@Pc(154) int local154 = (int) (Math.atan2((double) (local134 - local107), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local154 != 0) {
				this.method3815(local154);
			}
		}
		if (local138 > local65 + local47) {
			local138 = local47 + local65;
		}
		local138 = (local138 >> 1) - arg3;
		if (local138 != 0) {
			this.method3813(0, local138, 0);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z[ILclient!ib;[ZLclient!nd;IIIZBLclient!nd;I)V")
	private void method3849(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) AnimBase arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) AnimFrame arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) AnimFrame arg9, @OriginalArg(11) int arg10) {
		@Pc(18) int local18;
		if (arg9 == null || arg7 == 0) {
			for (local18 = 0; local18 < arg4.length; local18++) {
				@Pc(25) short local25 = arg4.indices[local18];
				if (arg3 == null || arg0 == arg3[local25] || arg2.types[local25] == 0) {
					@Pc(49) short local49 = arg4.prevOriginIndices[local18];
					if (local49 != -1) {
						this.method3846(0, 0, arg1, arg5 & arg2.parts[local49], 0, arg2.bones[local49], arg8, arg6, 0);
					}
					this.method3846(arg4.y[local18], arg2.types[local25], arg1, arg5 & arg2.parts[local25], arg4.z[local18], arg2.bones[local25], arg8, arg6, arg4.x[local18]);
				}
			}
			return;
		}
		local18 = 0;
		@Pc(119) int local119 = 0;
		for (@Pc(121) int local121 = 0; local121 < arg2.transforms; local121++) {
			@Pc(125) boolean local125 = false;
			if (local18 < arg4.length && arg4.indices[local18] == local121) {
				local125 = true;
			}
			@Pc(143) boolean local143 = false;
			if (arg9.length > local119 && local121 == arg9.indices[local119]) {
				local143 = true;
			}
			if (local125 || local143) {
				if (arg3 == null || arg0 == arg3[local121] || arg2.types[local121] == 0) {
					@Pc(193) short local193 = 0;
					@Pc(198) int local198 = arg2.types[local121];
					if (local198 == 3) {
						local193 = 128;
					}
					@Pc(207) short local207;
					@Pc(211) short local211;
					@Pc(215) short local215;
					@Pc(213) short local213;
					@Pc(209) byte local209;
					if (local125) {
						local215 = arg4.z[local18];
						local211 = arg4.y[local18];
						local207 = arg4.x[local18];
						local213 = arg4.prevOriginIndices[local18];
						local209 = arg4.flags[local18];
						local18++;
					} else {
						local207 = local193;
						local209 = 0;
						local211 = local193;
						local213 = -1;
						local215 = local193;
					}
					@Pc(270) short local270;
					@Pc(250) short local250;
					@Pc(265) short local265;
					@Pc(255) short local255;
					@Pc(260) byte local260;
					if (local143) {
						local250 = arg9.y[local119];
						local255 = arg9.prevOriginIndices[local119];
						local260 = arg9.flags[local119];
						local265 = arg9.z[local119];
						local270 = arg9.x[local119];
						local119++;
					} else {
						local270 = local193;
						local260 = 0;
						local265 = local193;
						local250 = local193;
						local255 = -1;
					}
					if (local213 != -1) {
						this.method3846(0, 0, arg1, arg2.parts[local213] & arg5, 0, arg2.bones[local213], arg8, arg6, 0);
					} else if (local255 != -1) {
						this.method3846(0, 0, arg1, arg5 & arg2.parts[local255], 0, arg2.bones[local255], arg8, arg6, 0);
					}
					@Pc(396) int local396;
					@Pc(406) int local406;
					@Pc(420) int local420;
					if ((local209 & 0x2) == 0 && (local260 & 0x1) == 0) {
						@Pc(362) int local362;
						if (local198 == 2) {
							local362 = local270 - local207 & 0x3FFF;
							@Pc(368) int local368 = local250 - local211 & 0x3FFF;
							if (local368 >= 8192) {
								local368 -= 16384;
							}
							@Pc(379) int local379 = local265 - local215 & 0x3FFF;
							if (local362 >= 8192) {
								local362 -= 16384;
							}
							local396 = local207 + local362 * arg7 / arg10 & 0x3FFF;
							local406 = local368 * arg7 / arg10 + local211 & 0x3FFF;
							if (local379 >= 8192) {
								local379 -= 16384;
							}
							local420 = arg7 * local379 / arg10 + local215 & 0x3FFF;
						} else if (local198 == 7) {
							local362 = local270 - local207 & 0x3F;
							if (local362 >= 32) {
								local362 -= 64;
							}
							local420 = local215 + (local265 - local215) * arg7 / arg10;
							local396 = arg7 * local362 / arg10 + local207 & 0x3F;
							local406 = local211 + arg7 * (local250 - local211) / arg10;
						} else {
							local406 = local211 + (local250 - local211) * arg7 / arg10;
							local420 = local215 + arg7 * (local265 - local215) / arg10;
							local396 = arg7 * (local270 - local207) / arg10 + local207;
						}
					} else {
						local396 = local207;
						local406 = local211;
						local420 = local215;
					}
					this.method3846(local406, local198, arg1, arg5 & arg2.parts[local121], local420, arg2.bones[local121], arg8, arg6, local396);
				} else {
					if (local143) {
						local119++;
					}
					if (local125) {
						local18++;
					}
				}
			}
		}
	}
}
