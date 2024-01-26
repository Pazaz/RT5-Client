import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class148 {

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "Z")
	private boolean aBoolean272;

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
	private int anInt3501;

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
	private int anInt3503;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
	private int anInt3506;

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "Lclient!st;")
	private Class23 aClass23_10;

	@OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
	private int anInt3508;

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
	private int anInt3511;

	@OriginalMember(owner = "client!gm", name = "D", descriptor = "Lclient!gm;")
	private Class148 aClass148_2;

	@OriginalMember(owner = "client!gm", name = "C", descriptor = "Lclient!ka;")
	private Class114 aClass114_2;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
	private int anInt3517;

	@OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
	private int anInt3518;

	@OriginalMember(owner = "client!gm", name = "y", descriptor = "Z")
	private boolean aBoolean273 = true;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
	private int anInt3510 = -1;

	@OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
	private final int anInt3509;

	@OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
	private final int anInt3515;

	@OriginalMember(owner = "client!gm", name = "F", descriptor = "[Lclient!ks;")
	private final Class216[] aClass216Array1;

	@OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
	private final int anInt3505;

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
	private final int anInt3523;

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
	private final int anInt3507;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "[Lclient!ks;")
	private final Class216[] aClass216Array2;

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "Lclient!ks;")
	private final Class216 aClass216_1;

	@OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
	private final int anInt3514;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I[Lclient!ks;IIIIII)V")
	public Class148(@OriginalArg(0) int arg0, @OriginalArg(1) Class216[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3509 = arg4;
		this.anInt3515 = arg6;
		this.aClass216Array1 = arg1;
		this.anInt3505 = arg5;
		this.anInt3523 = arg3;
		this.anInt3507 = arg0;
		if (arg1 == null) {
			this.aClass216Array2 = null;
			this.aClass216_1 = null;
		} else {
			this.aClass216Array2 = new Class216[arg1.length];
			this.aClass216_1 = arg2 < 0 ? null : arg1[arg2];
		}
		this.anInt3514 = arg7;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZILclient!ha;IIIIIIIIZB)V")
	public void method3159(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = 0;
		if (this.aBoolean272) {
			local5 = this.anInt3517;
		}
		if (this.aClass148_2 == null) {
			this.method3161(arg5, arg8, arg6, arg1, true, arg4, arg3, arg7, arg2, local5, arg9, arg0);
			return;
		}
		@Pc(16) Class148 local16 = this;
		@Pc(19) Class148 local19 = this.aClass148_2;
		if (this.hashCode() > local19.hashCode()) {
			local5 = 255 - local5;
			local19 = this;
			local16 = this.aClass148_2;
		}
		local16.method3161(arg5, arg8, arg6, arg1, true, arg4, arg3, arg7, arg2, local5, arg9, arg0);
		local19.method3161(arg5, arg8, arg6, arg1, false, arg4, arg3, arg7, arg2, 255 - local5, arg9, arg0);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIB)V")
	public void method3160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3517 = this.anInt3506 + (arg0 - this.anInt3506) * arg1 / 255;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIILclient!ha;ZZIIIIIIII)V")
	private void method3161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11) {
		@Pc(10) int local10 = 255 - arg9;
		if (this.aClass114_2 == null) {
			arg8 = arg8 + arg1 & 0x3FFF;
			arg3.ya();
			if (this.anInt3507 == -1 || this.anInt3518 == 0) {
				arg3.aa(arg7, arg11, arg6, arg2, local10 << 24 | arg5, 1);
			} else {
				@Pc(74) Class118 local74 = Static708.anInterface4_12.method6817(this.anInt3507);
				if (this.aClass23_10 == null && Static708.anInterface4_12.method6814(this.anInt3507)) {
					@Pc(120) int[] local120 = local74.anInt2796 == 2 ? Static708.anInterface4_12.method6815(0.7F, this.anInt3507, this.anInt3518, this.anInt3518) : Static708.anInterface4_12.method6818(this.anInt3518, false, this.anInt3518, this.anInt3507, 0.7F);
					this.anInt3501 = local120[0];
					this.anInt3511 = local120[local120.length - 1];
					this.aClass23_10 = arg3.method7946(this.anInt3518, this.anInt3518, this.anInt3518, local120);
				}
				@Pc(161) int local161 = local10 == 255 ? (local74.anInt2796 == 2 ? 1 : 0) : 1;
				if (local161 == 1 && arg4) {
					arg3.aa(arg7, arg11, arg6, arg2, arg5, 0);
				}
				if (this.aClass23_10 != null) {
					@Pc(187) int local187 = arg2 * arg10 / -4096;
					@Pc(199) int local199;
					for (local199 = arg8 * arg2 / 4096 + (arg6 - arg2) / 2; local199 > arg2; local199 -= arg2) {
					}
					while (local199 < 0) {
						local199 += arg2;
					}
					@Pc(233) int local233;
					if (this.anInt3515 == 1) {
						for (local233 = local199 - arg2; local233 < arg6; local233 += arg2) {
							this.aClass23_10.method8205(arg7 + local233, local187 + arg11, arg2, arg2, 0, local10 << 24 | 0xFFFFFF, local161);
						}
						if ((this.anInt3501 & 0xFF000000) != 0) {
							arg3.method7971(arg6, local187 + arg11 + 1, 0, 0, this.anInt3501);
						}
						if ((this.anInt3511 & 0xFF000000) != 0) {
							arg3.method7971(arg6, arg2 - arg2 - local187 - arg11, arg2 + arg11 + local187, 0, this.anInt3511);
						}
					} else {
						while (arg2 < local187) {
							local187 -= arg2;
						}
						while (local187 < 0) {
							local187 += arg2;
						}
						for (local233 = local199 - arg2; local233 < arg6; local233 += arg2) {
							for (@Pc(360) int local360 = local187 - arg2; local360 < arg2; local360 += arg2) {
								this.aClass23_10.method8205(arg7 + local233, local360 - -arg11, arg2, arg2, 0, local10 << 24 | 0xFFFFFF, local161);
							}
						}
					}
				}
			}
		} else {
			if (arg4) {
				arg3.GA(arg5);
				arg3.ya();
			}
			this.method3164(arg8, arg9, arg10, arg0, arg3);
		}
		for (@Pc(417) int local417 = this.anInt3508 - 1; local417 >= 0; local417--) {
			this.aClass216Array2[local417].method5055(arg3, arg7, arg11, arg6, arg2, arg10, arg8, this.anInt3523, this.anInt3509, this.anInt3505, local10);
		}
		arg3.ya();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILclient!ha;IIIIIIII)V")
	public void method3162(@OriginalArg(2) Class19 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6) {
		this.method3159(arg1, arg0, arg5, arg3, 0, 0, arg6, arg2, 0, arg4);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLclient!gm;)V")
	public void method3163(@OriginalArg(1) Class148 arg0) {
		if (this.aBoolean272) {
			this.anInt3506 = this.anInt3517;
		} else if (arg0 != null && arg0.aBoolean272) {
			this.anInt3506 = 255 - arg0.anInt3517;
		} else {
			this.anInt3506 = 0;
		}
		this.anInt3517 = 0;
		this.aBoolean272 = true;
		this.aClass148_2 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIILclient!ha;)V")
	private void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19 arg4) {
		@Pc(7) Class73 local7 = arg4.method8017().method7129();
		@Pc(10) Class73 local10 = arg4.method7953();
		local10.method7125(0, 0, 0);
		local10.method7127(arg0 & 0x3FFF);
		local10.method7130(arg2 & 0x3FFF);
		local10.method7139(arg3 & 0x3FFF);
		arg4.method8000(local10);
		@Pc(36) Class73 local36 = arg4.method7953();
		local36.method7133();
		if (this.anInt3503 != arg1) {
			this.aClass114_2.method7498((byte) arg1, this.aByteArray35);
			this.anInt3503 = arg1;
		}
		this.aClass114_2.method7473(local36, (Class8_Sub6) null, 0);
		arg4.method8000(local7);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)Z")
	public boolean method3165() {
		return this.aBoolean272;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!ha;)V")
	private void method3166(@OriginalArg(1) Class19 arg0) {
		try {
			@Pc(9) Class330 local9 = Static386.aClass330_80;
			@Pc(17) boolean local17 = local9.method7607(this.anInt3514);
			if (local17) {
				arg0.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(36) Class88 local36 = Static121.method2201(this.anInt3514, Static386.aClass330_80);
				this.aClass114_2 = arg0.method7952(local36, 1099776, 0, 255, 1);
				@Pc(49) byte[] local49 = this.aClass114_2.method7489();
				if (local49 == null) {
					this.aByteArray35 = null;
				} else {
					this.aByteArray35 = new byte[local49.length];
					Static734.method7694(local49, 0, this.aByteArray35, 0, local49.length);
				}
			}
		} catch (@Pc(73) Exception local73) {
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)Lclient!gm;")
	public Class148 method3167() {
		return this.aClass148_2;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIILclient!ha;)Z")
	public boolean method3168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2) {
		if (this.anInt3510 != arg1) {
			this.anInt3510 = arg1;
			@Pc(16) int local16 = Static402.method5587(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (local16 != this.anInt3518) {
				this.anInt3518 = local16;
				this.aClass23_10 = null;
			}
			if (this.aClass216Array1 != null) {
				this.anInt3508 = 0;
				@Pc(57) int[] local57 = new int[this.aClass216Array1.length];
				for (@Pc(59) int local59 = 0; local59 < this.aClass216Array1.length; local59++) {
					@Pc(68) Class216 local68 = this.aClass216Array1[local59];
					if (local68.method5056(this.anInt3523, this.anInt3509, this.anInt3505, this.anInt3510)) {
						local57[this.anInt3508] = local68.anInt5631;
						this.aClass216Array2[this.anInt3508++] = local68;
					}
				}
				Static441.method5966(this.anInt3508 - 1, 0, local57, this.aClass216Array2);
			}
			this.aBoolean273 = true;
		}
		@Pc(131) boolean local131 = false;
		if (this.aBoolean273) {
			this.aBoolean273 = false;
			for (@Pc(142) int local142 = this.anInt3508 - 1; local142 >= 0; local142--) {
				@Pc(155) boolean local155 = this.aClass216Array2[local142].method5050(arg2, this.aClass216_1);
				this.aBoolean273 |= !local155;
				local131 |= local155;
			}
		}
		if (arg0 == 0 || !arg2.method7992()) {
			this.aClass114_2 = null;
		} else if (this.aClass114_2 == null && this.anInt3514 >= 0) {
			this.method3166(arg2);
		}
		if (this.aClass148_2 != null && this.aClass148_2 != this) {
			this.aClass148_2.method3169();
			local131 |= this.aClass148_2.method3168(arg0, arg1, arg2);
		}
		return local131;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public void method3169() {
		this.aBoolean272 = false;
		this.anInt3517 = 0;
		this.aClass148_2 = null;
	}
}
