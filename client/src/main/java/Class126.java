import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class126 {

	@OriginalMember(owner = "client!m", name = "c", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "[Lclient!la;")
	public Class116[] aClass116Array2;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "[I")
	public int[] anIntArray300;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "[I")
	public int[] anIntArray301;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!m", name = "A", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!m", name = "B", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!m", name = "F", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!m", name = "G", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!m", name = "H", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!m", name = "I", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!m", name = "J", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!m", name = "K", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!m", name = "O", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!m", name = "P", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!m", name = "R", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!m", name = "T", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!m", name = "U", descriptor = "[Lclient!dn;")
	public Class49[] aClass49Array2;

	@OriginalMember(owner = "client!m", name = "W", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!m", name = "Z", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	public int anInt4241 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	public int anInt4238 = 0;

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "B")
	public byte aByte40 = 0;

	@OriginalMember(owner = "client!m", name = "N", descriptor = "I")
	public int anInt4253 = 0;

	@OriginalMember(owner = "client!m", name = "V", descriptor = "I")
	public int anInt4254 = 0;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "([B)V")
	public Class126(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3646(arg0);
		} else {
			this.method3639(arg0);
		}
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(III)V")
	public Class126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray300 = new int[arg0];
		this.aShortArray81 = new short[arg1];
		if (arg2 > 0) {
			this.aByteArray48 = new byte[arg2];
			this.aByteArray50 = new byte[arg2];
			this.aShortArray73 = new short[arg2];
			this.aShortArray79 = new short[arg2];
			this.aByteArray46 = new byte[arg2];
			this.aShortArray72 = new short[arg2];
			this.aByteArray45 = new byte[arg2];
			this.aShortArray69 = new short[arg2];
			this.aByteArray49 = new byte[arg2];
			this.aShortArray70 = new short[arg2];
			this.aShortArray80 = new short[arg2];
			this.aByteArray42 = new byte[arg2];
		}
		this.aShortArray77 = new short[arg1];
		this.aByteArray44 = new byte[arg1];
		this.aByteArray51 = new byte[arg1];
		this.anIntArray303 = new int[arg1];
		this.anIntArray305 = new int[arg0];
		this.aByteArray43 = new byte[arg1];
		this.aShortArray74 = new short[arg1];
		this.aShortArray76 = new short[arg1];
		this.anIntArray304 = new int[arg0];
		this.anIntArray301 = new int[arg0];
		this.aByteArray47 = new byte[arg1];
		this.aShortArray75 = new short[arg1];
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "([Lclient!m;I)V")
	public Class126(@OriginalArg(0) Class126[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4241 = 0;
		this.anInt4254 = 0;
		this.anInt4253 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(43) boolean local43 = false;
		this.aByte40 = -1;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class126 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt4253 += local54.anInt4253;
				this.anInt4254 += local54.anInt4254;
				this.anInt4241 += local54.anInt4241;
				if (local54.aClass116Array2 != null) {
					local31 += local54.aClass116Array2.length;
				}
				local33 |= local54.aByteArray43 != null;
				if (local54.aClass49Array2 != null) {
					local29 += local54.aClass49Array2.length;
				}
				if (local54.aByteArray47 == null) {
					if (this.aByte40 == -1) {
						this.aByte40 = local54.aByte40;
					}
					if (this.aByte40 != local54.aByte40) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local41 |= local54.aShortArray77 != null;
				local37 |= local54.aByteArray44 != null;
				local43 |= local54.anIntArray303 != null;
				local39 |= local54.aByteArray51 != null;
			}
		}
		this.anIntArray300 = new int[this.anInt4253];
		this.aShortArray74 = new short[this.anInt4254];
		if (local37) {
			this.aByteArray44 = new byte[this.anInt4254];
		}
		if (local33) {
			this.aByteArray43 = new byte[this.anInt4254];
		}
		this.aShortArray75 = new short[this.anInt4254];
		this.aShortArray71 = new short[this.anInt4253];
		this.aShortArray76 = new short[this.anInt4254];
		if (local31 > 0) {
			this.aClass116Array2 = new Class116[local31];
		}
		this.anIntArray304 = new int[this.anInt4253];
		this.aShortArray78 = new short[this.anInt4254];
		this.anIntArray305 = new int[this.anInt4253];
		if (local41) {
			this.aShortArray77 = new short[this.anInt4254];
		}
		if (local29 > 0) {
			this.aClass49Array2 = new Class49[local29];
		}
		if (local43) {
			this.anIntArray303 = new int[this.anInt4254];
		}
		this.anIntArray301 = new int[this.anInt4253];
		this.aShortArray81 = new short[this.anInt4254];
		if (local39) {
			this.aByteArray51 = new byte[this.anInt4254];
		}
		if (local35) {
			this.aByteArray47 = new byte[this.anInt4254];
		}
		if (this.anInt4241 > 0) {
			this.aByteArray45 = new byte[this.anInt4241];
			this.aShortArray69 = new short[this.anInt4241];
			this.aShortArray73 = new short[this.anInt4241];
			this.aByteArray50 = new byte[this.anInt4241];
			this.aShortArray80 = new short[this.anInt4241];
			this.aShortArray72 = new short[this.anInt4241];
			this.aByteArray49 = new byte[this.anInt4241];
			this.aByteArray46 = new byte[this.anInt4241];
			this.aShortArray70 = new short[this.anInt4241];
			this.aByteArray42 = new byte[this.anInt4241];
			this.aShortArray79 = new short[this.anInt4241];
			this.aByteArray48 = new byte[this.anInt4241];
		}
		this.anInt4241 = 0;
		this.anInt4253 = 0;
		local31 = 0;
		local29 = 0;
		this.anInt4254 = 0;
		@Pc(560) int local560;
		@Pc(571) int local571;
		for (@Pc(359) int local359 = 0; local359 < arg1; local359++) {
			@Pc(366) short local366 = (short) (0x1 << local359);
			@Pc(370) Class126 local370 = arg0[local359];
			if (local370 != null) {
				for (@Pc(374) int local374 = 0; local374 < local370.anInt4254; local374++) {
					if (local33 && local370.aByteArray43 != null) {
						this.aByteArray43[this.anInt4254] = local370.aByteArray43[local374];
					}
					if (local35) {
						if (local370.aByteArray47 == null) {
							this.aByteArray47[this.anInt4254] = local370.aByte40;
						} else {
							this.aByteArray47[this.anInt4254] = local370.aByteArray47[local374];
						}
					}
					if (local37 && local370.aByteArray44 != null) {
						this.aByteArray44[this.anInt4254] = local370.aByteArray44[local374];
					}
					if (local41) {
						if (local370.aShortArray77 == null) {
							this.aShortArray77[this.anInt4254] = -1;
						} else {
							this.aShortArray77[this.anInt4254] = local370.aShortArray77[local374];
						}
					}
					if (local43) {
						if (local370.anIntArray303 == null) {
							this.anIntArray303[this.anInt4254] = -1;
						} else {
							this.anIntArray303[this.anInt4254] = local370.anIntArray303[local374];
						}
					}
					this.aShortArray75[this.anInt4254] = (short) this.method3638(local366, local370.aShortArray75[local374], local370);
					this.aShortArray74[this.anInt4254] = (short) this.method3638(local366, local370.aShortArray74[local374], local370);
					this.aShortArray81[this.anInt4254] = (short) this.method3638(local366, local370.aShortArray81[local374], local370);
					this.aShortArray78[this.anInt4254] = local366;
					this.aShortArray76[this.anInt4254] = local370.aShortArray76[local374];
					this.anInt4254++;
				}
				@Pc(547) int local547;
				if (local370.aClass49Array2 != null) {
					for (local547 = 0; local547 < local370.aClass49Array2.length; local547++) {
						local560 = this.method3638(local366, local370.aClass49Array2[local547].anInt1607, local370);
						local571 = this.method3638(local366, local370.aClass49Array2[local547].anInt1618, local370);
						@Pc(582) int local582 = this.method3638(local366, local370.aClass49Array2[local547].anInt1608, local370);
						this.aClass49Array2[local29] = new Class49(local370.aClass49Array2[local547].anInt1605, local560, local571, local582, local370.aClass49Array2[local547].aByte15);
						local29++;
					}
				}
				if (local370.aClass116Array2 != null) {
					for (local547 = 0; local547 < local370.aClass116Array2.length; local547++) {
						local560 = this.method3638(local366, local370.aClass116Array2[local547].anInt4039, local370);
						this.aClass116Array2[local31] = new Class116(local370.aClass116Array2[local547].anInt4036, local560);
						local31++;
					}
				}
			}
		}
		this.anInt4238 = this.anInt4253;
		@Pc(657) int local657 = 0;
		for (@Pc(659) int local659 = 0; local659 < arg1; local659++) {
			@Pc(666) short local666 = (short) (0x1 << local659);
			@Pc(670) Class126 local670 = arg0[local659];
			if (local670 != null) {
				for (local560 = 0; local560 < local670.anInt4254; local560++) {
					if (local39) {
						this.aByteArray51[local657++] = (byte) (local670.aByteArray51 == null || local670.aByteArray51[local560] == -1 ? -1 : local670.aByteArray51[local560] + this.anInt4241);
					}
				}
				for (local571 = 0; local571 < local670.anInt4241; local571++) {
					@Pc(723) byte local723 = this.aByteArray46[this.anInt4241] = local670.aByteArray46[local571];
					if (local723 == 0) {
						this.aShortArray70[this.anInt4241] = (short) this.method3638(local666, local670.aShortArray70[local571], local670);
						this.aShortArray80[this.anInt4241] = (short) this.method3638(local666, local670.aShortArray80[local571], local670);
						this.aShortArray73[this.anInt4241] = (short) this.method3638(local666, local670.aShortArray73[local571], local670);
					}
					if (local723 >= 1 && local723 <= 3) {
						this.aShortArray70[this.anInt4241] = local670.aShortArray70[local571];
						this.aShortArray80[this.anInt4241] = local670.aShortArray80[local571];
						this.aShortArray73[this.anInt4241] = local670.aShortArray73[local571];
						this.aShortArray69[this.anInt4241] = local670.aShortArray69[local571];
						this.aShortArray79[this.anInt4241] = local670.aShortArray79[local571];
						this.aShortArray72[this.anInt4241] = local670.aShortArray72[local571];
						this.aByteArray48[this.anInt4241] = local670.aByteArray48[local571];
						this.aByteArray49[this.anInt4241] = local670.aByteArray49[local571];
						this.aByteArray45[this.anInt4241] = local670.aByteArray45[local571];
					}
					if (local723 == 2) {
						this.aByteArray42[this.anInt4241] = local670.aByteArray42[local571];
						this.aByteArray50[this.anInt4241] = local670.aByteArray50[local571];
					}
					this.anInt4241++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)[[I")
	public int[][] method3636() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4238; local12++) {
			@Pc(19) int local19 = this.anIntArray300[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(75) int local75 = 0; local75 < this.anInt4238; local75++) {
			@Pc(82) int local82 = this.anIntArray300[local75];
			if (local82 >= 0) {
				local50[local82][local8[local82]++] = local75;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)[[I")
	public int[][] method3637() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt4254; local17++) {
			@Pc(24) int local24 = this.anIntArray303[local17];
			if (local24 >= 0) {
				@Pc(30) int local30 = local8[local24]++;
				if (local24 > local10) {
					local10 = local24;
				}
			}
		}
		@Pc(48) int[][] local48 = new int[local10 + 1][];
		for (@Pc(50) int local50 = 0; local50 <= local10; local50++) {
			local48[local50] = new int[local8[local50]];
			local8[local50] = 0;
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt4254; local69++) {
			@Pc(76) int local76 = this.anIntArray303[local69];
			if (local76 >= 0) {
				local48[local76][local8[local76]++] = local69;
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(SBILclient!m;)I")
	private int method3638(@OriginalArg(0) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class126 arg2) {
		@Pc(10) int local10 = arg2.anIntArray304[arg1];
		@Pc(15) int local15 = arg2.anIntArray301[arg1];
		@Pc(20) int local20 = arg2.anIntArray305[arg1];
		for (@Pc(22) int local22 = 0; local22 < this.anInt4253; local22++) {
			if (local10 == this.anIntArray304[local22] && this.anIntArray301[local22] == local15 && local20 == this.anIntArray305[local22]) {
				this.aShortArray71[local22] |= arg0;
				return local22;
			}
		}
		this.anIntArray304[this.anInt4253] = local10;
		this.anIntArray301[this.anInt4253] = local15;
		this.anIntArray305[this.anInt4253] = local20;
		this.aShortArray71[this.anInt4253] = arg0;
		this.anIntArray300[this.anInt4253] = arg2.anIntArray300 == null ? -1 : arg2.anIntArray300[arg1];
		return this.anInt4253++;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z[B)V")
	private void method3639(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub16 local14 = new Class1_Sub16(arg0);
		@Pc(19) Class1_Sub16 local19 = new Class1_Sub16(arg0);
		@Pc(24) Class1_Sub16 local24 = new Class1_Sub16(arg0);
		@Pc(29) Class1_Sub16 local29 = new Class1_Sub16(arg0);
		@Pc(34) Class1_Sub16 local34 = new Class1_Sub16(arg0);
		local14.anInt6813 = arg0.length - 18;
		this.anInt4253 = local14.method5749();
		this.anInt4254 = local14.method5749();
		this.anInt4241 = local14.method5761();
		@Pc(59) int local59 = local14.method5761();
		@Pc(63) int local63 = local14.method5761();
		@Pc(67) int local67 = local14.method5761();
		@Pc(71) int local71 = local14.method5761();
		@Pc(75) int local75 = local14.method5761();
		@Pc(79) int local79 = local14.method5749();
		@Pc(83) int local83 = local14.method5749();
		@Pc(87) int local87 = local14.method5749();
		@Pc(91) int local91 = local14.method5749();
		@Pc(100) int local100 = this.anInt4253;
		@Pc(102) int local102 = local100;
		local100 += this.anInt4254;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt4254;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt4254;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt4254;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt4253;
		}
		@Pc(155) int local155 = local100;
		if (local67 == 1) {
			local100 += this.anInt4254;
		}
		@Pc(167) int local167 = local100;
		local100 += local91;
		@Pc(173) int local173 = local100;
		local100 += this.anInt4254 * 2;
		@Pc(182) int local182 = local100;
		local100 += this.anInt4241 * 6;
		@Pc(191) int local191 = local100;
		local100 += local79;
		@Pc(197) int local197 = local100;
		local100 += local83;
		if (local67 == 1) {
			this.aByteArray44 = new byte[this.anInt4254];
		}
		this.aShortArray76 = new short[this.anInt4254];
		local14.anInt6813 = 0;
		if (local71 == 1) {
			this.anIntArray303 = new int[this.anInt4254];
		}
		this.anIntArray305 = new int[this.anInt4253];
		if (local63 == 255) {
			this.aByteArray47 = new byte[this.anInt4254];
		} else {
			this.aByte40 = (byte) local63;
		}
		this.anIntArray304 = new int[this.anInt4253];
		this.anIntArray301 = new int[this.anInt4253];
		this.aShortArray74 = new short[this.anInt4254];
		if (local59 == 1) {
			this.aByteArray43 = new byte[this.anInt4254];
			this.aShortArray77 = new short[this.anInt4254];
			this.aByteArray51 = new byte[this.anInt4254];
		}
		if (this.anInt4241 > 0) {
			this.aShortArray73 = new short[this.anInt4241];
			this.aShortArray80 = new short[this.anInt4241];
			this.aByteArray46 = new byte[this.anInt4241];
			this.aShortArray70 = new short[this.anInt4241];
		}
		this.aShortArray75 = new short[this.anInt4254];
		this.aShortArray81 = new short[this.anInt4254];
		if (local75 == 1) {
			this.anIntArray300 = new int[this.anInt4253];
		}
		local19.anInt6813 = local191;
		local24.anInt6813 = local197;
		local29.anInt6813 = local100;
		local34.anInt6813 = local143;
		@Pc(347) int local347 = 0;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(359) int local359;
		@Pc(361) int local361;
		for (@Pc(353) int local353 = 0; local353 < this.anInt4253; local353++) {
			local359 = local14.method5761();
			local361 = 0;
			if ((local359 & 0x1) != 0) {
				local361 = local19.method5781();
			}
			@Pc(374) int local374 = 0;
			if ((local359 & 0x2) != 0) {
				local374 = local24.method5781();
			}
			@Pc(384) int local384 = 0;
			if ((local359 & 0x4) != 0) {
				local384 = local29.method5781();
			}
			this.anIntArray304[local353] = local347 + local361;
			this.anIntArray301[local353] = local349 + local374;
			this.anIntArray305[local353] = local351 + local384;
			local349 = this.anIntArray301[local353];
			local347 = this.anIntArray304[local353];
			local351 = this.anIntArray305[local353];
			if (local75 == 1) {
				this.anIntArray300[local353] = local34.method5761();
			}
		}
		local14.anInt6813 = local173;
		local19.anInt6813 = local131;
		local24.anInt6813 = local109;
		local29.anInt6813 = local155;
		local34.anInt6813 = local121;
		for (local359 = 0; local359 < this.anInt4254; local359++) {
			this.aShortArray76[local359] = (short) local14.method5749();
			if (local59 == 1) {
				local361 = local19.method5761();
				if ((local361 & 0x1) == 1) {
					local7 = true;
					this.aByteArray43[local359] = 1;
				} else {
					this.aByteArray43[local359] = 0;
				}
				if ((local361 & 0x2) == 2) {
					this.aByteArray51[local359] = (byte) (local361 >> 2);
					this.aShortArray77[local359] = this.aShortArray76[local359];
					this.aShortArray76[local359] = 127;
					if (this.aShortArray77[local359] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray51[local359] = -1;
					this.aShortArray77[local359] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray47[local359] = local24.method5772();
			}
			if (local67 == 1) {
				this.aByteArray44[local359] = local29.method5772();
			}
			if (local71 == 1) {
				this.anIntArray303[local359] = local34.method5761();
			}
		}
		this.anInt4238 = -1;
		local14.anInt6813 = local167;
		local19.anInt6813 = local102;
		@Pc(606) short local606 = 0;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(612) short local612 = 0;
		@Pc(620) int local620;
		for (@Pc(614) int local614 = 0; local614 < this.anInt4254; local614++) {
			local620 = local19.method5761();
			if (local620 == 1) {
				local606 = (short) (local612 + local14.method5781());
				local608 = (short) (local14.method5781() + local606);
				local610 = (short) (local14.method5781() + local608);
				local612 = local610;
				this.aShortArray75[local614] = local606;
				this.aShortArray74[local614] = local608;
				this.aShortArray81[local614] = local610;
				if (this.anInt4238 < local606) {
					this.anInt4238 = local606;
				}
				if (local608 > this.anInt4238) {
					this.anInt4238 = local608;
				}
				if (this.anInt4238 < local610) {
					this.anInt4238 = local610;
				}
			}
			if (local620 == 2) {
				local608 = local610;
				local610 = (short) (local612 + local14.method5781());
				local612 = local610;
				this.aShortArray75[local614] = local606;
				this.aShortArray74[local614] = local608;
				this.aShortArray81[local614] = local610;
				if (this.anInt4238 < local610) {
					this.anInt4238 = local610;
				}
			}
			if (local620 == 3) {
				local606 = local610;
				local610 = (short) (local14.method5781() + local612);
				local612 = local610;
				this.aShortArray75[local614] = local606;
				this.aShortArray74[local614] = local608;
				this.aShortArray81[local614] = local610;
				if (local610 > this.anInt4238) {
					this.anInt4238 = local610;
				}
			}
			if (local620 == 4) {
				@Pc(771) short local771 = local606;
				local606 = local608;
				local610 = (short) (local14.method5781() + local612);
				local608 = local771;
				this.aShortArray75[local614] = local606;
				local612 = local610;
				this.aShortArray74[local614] = local771;
				this.aShortArray81[local614] = local610;
				if (this.anInt4238 < local610) {
					this.anInt4238 = local610;
				}
			}
		}
		local14.anInt6813 = local182;
		this.anInt4238++;
		for (local620 = 0; local620 < this.anInt4241; local620++) {
			this.aByteArray46[local620] = 0;
			this.aShortArray70[local620] = (short) local14.method5749();
			this.aShortArray80[local620] = (short) local14.method5749();
			this.aShortArray73[local620] = (short) local14.method5749();
		}
		if (this.aByteArray51 != null) {
			@Pc(871) boolean local871 = false;
			for (@Pc(873) int local873 = 0; local873 < this.anInt4254; local873++) {
				@Pc(882) int local882 = this.aByteArray51[local873] & 0xFF;
				if (local882 != 255) {
					if (this.aShortArray75[local873] == (this.aShortArray70[local882] & 0xFFFF) && this.aShortArray74[local873] == (this.aShortArray80[local882] & 0xFFFF) && this.aShortArray81[local873] == (this.aShortArray73[local882] & 0xFFFF)) {
						this.aByteArray51[local873] = -1;
					} else {
						local871 = true;
					}
				}
			}
			if (!local871) {
				this.aByteArray51 = null;
			}
		}
		if (!local9) {
			this.aShortArray77 = null;
		}
		if (!local7) {
			this.aByteArray43 = null;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ISS)V")
	public void method3640(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray77 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anInt4254; local16++) {
			if (this.aShortArray77[local16] == arg0) {
				this.aShortArray77[local16] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IISIBBSBB)I")
	public int method3641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) short arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray75[this.anInt4254] = (short) arg1;
		this.aShortArray74[this.anInt4254] = (short) arg3;
		this.aShortArray81[this.anInt4254] = (short) arg0;
		this.aByteArray43[this.anInt4254] = arg5;
		this.aByteArray51[this.anInt4254] = arg4;
		this.aShortArray76[this.anInt4254] = arg2;
		this.aByteArray44[this.anInt4254] = arg7;
		this.aShortArray77[this.anInt4254] = arg6;
		return this.anInt4254++;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)I")
	public int method3642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt4253; local13++) {
			if (arg1 == this.anIntArray304[local13] && this.anIntArray301[local13] == arg2 && this.anIntArray305[local13] == arg0) {
				return local13;
			}
		}
		this.anIntArray304[this.anInt4253] = arg1;
		this.anIntArray301[this.anInt4253] = arg2;
		this.anIntArray305[this.anInt4253] = arg0;
		this.anInt4238 = this.anInt4253 + 1;
		return this.anInt4253++;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(SSI)V")
	public void method3643(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4254; local7++) {
			if (arg1 == this.aShortArray76[local7]) {
				this.aShortArray76[local7] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IIII)V")
	public void method3644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4253; local3++) {
			this.anIntArray304[local3] += arg0;
			this.anIntArray301[local3] += arg2;
			this.anIntArray305[local3] += arg1;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZI)V")
	public void method3645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(27) int local27;
		@Pc(45) int local45;
		if (arg0 != 0) {
			local21 = Class39.anIntArray88[arg0];
			local25 = Class39.anIntArray87[arg0];
			for (local27 = 0; local27 < this.anInt4253; local27++) {
				local45 = this.anIntArray301[local27] * local21 + this.anIntArray304[local27] * local25 >> 15;
				this.anIntArray301[local27] = this.anIntArray301[local27] * local25 - local21 * this.anIntArray304[local27] >> 15;
				this.anIntArray304[local27] = local45;
			}
		}
		if (arg2 != 0) {
			local21 = Class39.anIntArray88[arg2];
			local25 = Class39.anIntArray87[arg2];
			for (local27 = 0; local27 < this.anInt4253; local27++) {
				local45 = local25 * this.anIntArray301[local27] - local21 * this.anIntArray305[local27] >> 15;
				this.anIntArray305[local27] = this.anIntArray305[local27] * local25 + local21 * this.anIntArray301[local27] >> 15;
				this.anIntArray301[local27] = local45;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local21 = Class39.anIntArray88[arg1];
		local25 = Class39.anIntArray87[arg1];
		for (local27 = 0; local27 < this.anInt4253; local27++) {
			local45 = local25 * this.anIntArray304[local27] + this.anIntArray305[local27] * local21 >> 15;
			this.anIntArray305[local27] = this.anIntArray305[local27] * local25 - this.anIntArray304[local27] * local21 >> 15;
			this.anIntArray304[local27] = local45;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([BI)V")
	private void method3646(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub16 local10 = new Class1_Sub16(arg0);
		@Pc(15) Class1_Sub16 local15 = new Class1_Sub16(arg0);
		@Pc(20) Class1_Sub16 local20 = new Class1_Sub16(arg0);
		@Pc(25) Class1_Sub16 local25 = new Class1_Sub16(arg0);
		@Pc(30) Class1_Sub16 local30 = new Class1_Sub16(arg0);
		@Pc(35) Class1_Sub16 local35 = new Class1_Sub16(arg0);
		@Pc(40) Class1_Sub16 local40 = new Class1_Sub16(arg0);
		local10.anInt6813 = arg0.length - 23;
		this.anInt4253 = local10.method5749();
		this.anInt4254 = local10.method5749();
		this.anInt4241 = local10.method5761();
		@Pc(67) int local67 = local10.method5761();
		@Pc(78) boolean local78 = (local67 & 0x1) == 1;
		@Pc(89) boolean local89 = (local67 & 0x2) == 2;
		@Pc(93) int local93 = local10.method5761();
		@Pc(97) int local97 = local10.method5761();
		@Pc(101) int local101 = local10.method5761();
		@Pc(105) int local105 = local10.method5761();
		@Pc(109) int local109 = local10.method5761();
		@Pc(115) int local115 = local10.method5749();
		@Pc(121) int local121 = local10.method5749();
		@Pc(127) int local127 = local10.method5749();
		@Pc(131) int local131 = local10.method5749();
		@Pc(137) int local137 = local10.method5749();
		@Pc(139) int local139 = 0;
		@Pc(141) int local141 = 0;
		@Pc(143) int local143 = 0;
		@Pc(159) int local159;
		if (this.anInt4241 > 0) {
			local10.anInt6813 = 0;
			this.aByteArray46 = new byte[this.anInt4241];
			for (local159 = 0; local159 < this.anInt4241; local159++) {
				@Pc(170) byte local170 = this.aByteArray46[local159] = local10.method5772();
				if (local170 == 2) {
					local143++;
				}
				if (local170 == 0) {
					local139++;
				}
				if (local170 >= 1 && local170 <= 3) {
					local141++;
				}
			}
		}
		local159 = this.anInt4241;
		@Pc(207) int local207 = local159;
		local159 += this.anInt4253;
		@Pc(214) int local214 = local159;
		if (local78) {
			local159 += this.anInt4254;
		}
		@Pc(223) int local223 = local159;
		local159 += this.anInt4254;
		@Pc(230) int local230 = local159;
		if (local93 == 255) {
			local159 += this.anInt4254;
		}
		@Pc(242) int local242 = local159;
		if (local101 == 1) {
			local159 += this.anInt4254;
		}
		@Pc(252) int local252 = local159;
		if (local109 == 1) {
			local159 += this.anInt4253;
		}
		@Pc(264) int local264 = local159;
		if (local97 == 1) {
			local159 += this.anInt4254;
		}
		@Pc(276) int local276 = local159;
		local159 += local131;
		@Pc(282) int local282 = local159;
		if (local105 == 1) {
			local159 += this.anInt4254 * 2;
		}
		@Pc(296) int local296 = local159;
		local159 += local137;
		@Pc(302) int local302 = local159;
		local159 += this.anInt4254 * 2;
		@Pc(311) int local311 = local159;
		local159 += local115;
		@Pc(317) int local317 = local159;
		local159 += local121;
		@Pc(323) int local323 = local159;
		local159 += local127;
		@Pc(329) int local329 = local159;
		local159 += local139 * 6;
		@Pc(337) int local337 = local159;
		local159 += local141 * 6;
		@Pc(345) int local345 = local159;
		local159 += local141 * 6;
		@Pc(353) int local353 = local159;
		local159 += local141;
		@Pc(359) int local359 = local159;
		local159 += local141;
		@Pc(365) int local365 = local159;
		local159 += local141 + local143 * 2;
		if (local97 == 1) {
			this.aByteArray44 = new byte[this.anInt4254];
		}
		if (local78) {
			this.aByteArray43 = new byte[this.anInt4254];
		}
		if (local93 == 255) {
			this.aByteArray47 = new byte[this.anInt4254];
		} else {
			this.aByte40 = (byte) local93;
		}
		if (local109 == 1) {
			this.anIntArray300 = new int[this.anInt4253];
		}
		this.anIntArray301 = new int[this.anInt4253];
		if (this.anInt4241 > 0) {
			if (local141 > 0) {
				this.aShortArray79 = new short[local141];
				this.aByteArray49 = new byte[local141];
				this.aShortArray69 = new short[local141];
				this.aShortArray72 = new short[local141];
				this.aByteArray45 = new byte[local141];
				this.aByteArray48 = new byte[local141];
			}
			if (local143 > 0) {
				this.aByteArray50 = new byte[local143];
				this.aByteArray42 = new byte[local143];
			}
			this.aShortArray73 = new short[this.anInt4241];
			this.aShortArray80 = new short[this.anInt4241];
			this.aShortArray70 = new short[this.anInt4241];
		}
		this.anIntArray304 = new int[this.anInt4253];
		if (local101 == 1) {
			this.anIntArray303 = new int[this.anInt4254];
		}
		local10.anInt6813 = local207;
		this.anIntArray305 = new int[this.anInt4253];
		this.aShortArray74 = new short[this.anInt4254];
		if (local105 == 1) {
			this.aShortArray77 = new short[this.anInt4254];
		}
		this.aShortArray75 = new short[this.anInt4254];
		if (local105 == 1 && this.anInt4241 > 0) {
			this.aByteArray51 = new byte[this.anInt4254];
		}
		this.aShortArray76 = new short[this.anInt4254];
		this.aShortArray81 = new short[this.anInt4254];
		local15.anInt6813 = local311;
		local20.anInt6813 = local317;
		local25.anInt6813 = local323;
		local30.anInt6813 = local252;
		@Pc(560) int local560 = 0;
		@Pc(562) int local562 = 0;
		@Pc(564) int local564 = 0;
		@Pc(572) int local572;
		for (@Pc(566) int local566 = 0; local566 < this.anInt4253; local566++) {
			local572 = local10.method5761();
			@Pc(574) int local574 = 0;
			if ((local572 & 0x1) != 0) {
				local574 = local15.method5781();
			}
			@Pc(587) int local587 = 0;
			if ((local572 & 0x2) != 0) {
				local587 = local20.method5781();
			}
			@Pc(597) int local597 = 0;
			if ((local572 & 0x4) != 0) {
				local597 = local25.method5781();
			}
			this.anIntArray304[local566] = local560 + local574;
			this.anIntArray301[local566] = local587 + local562;
			this.anIntArray305[local566] = local597 + local564;
			local562 = this.anIntArray301[local566];
			local560 = this.anIntArray304[local566];
			local564 = this.anIntArray305[local566];
			if (local109 == 1) {
				this.anIntArray300[local566] = local30.method5761();
			}
		}
		local10.anInt6813 = local302;
		local15.anInt6813 = local214;
		local20.anInt6813 = local230;
		local25.anInt6813 = local264;
		local30.anInt6813 = local242;
		local35.anInt6813 = local282;
		local40.anInt6813 = local296;
		for (local572 = 0; local572 < this.anInt4254; local572++) {
			this.aShortArray76[local572] = (short) local10.method5749();
			if (local78) {
				this.aByteArray43[local572] = local15.method5772();
			}
			if (local93 == 255) {
				this.aByteArray47[local572] = local20.method5772();
			}
			if (local97 == 1) {
				this.aByteArray44[local572] = local25.method5772();
			}
			if (local101 == 1) {
				this.anIntArray303[local572] = local30.method5761();
			}
			if (local105 == 1) {
				this.aShortArray77[local572] = (short) (local35.method5749() - 1);
			}
			if (this.aByteArray51 != null) {
				if (this.aShortArray77[local572] == -1) {
					this.aByteArray51[local572] = -1;
				} else {
					this.aByteArray51[local572] = (byte) (local40.method5761() - 1);
				}
			}
		}
		local10.anInt6813 = local276;
		this.anInt4238 = -1;
		local15.anInt6813 = local223;
		@Pc(799) short local799 = 0;
		@Pc(801) short local801 = 0;
		@Pc(803) short local803 = 0;
		@Pc(805) short local805 = 0;
		@Pc(813) int local813;
		for (@Pc(807) int local807 = 0; local807 < this.anInt4254; local807++) {
			local813 = local15.method5761();
			if (local813 == 1) {
				local799 = (short) (local10.method5781() + local805);
				local801 = (short) (local10.method5781() + local799);
				local803 = (short) (local801 + local10.method5781());
				local805 = local803;
				this.aShortArray75[local807] = local799;
				this.aShortArray74[local807] = local801;
				this.aShortArray81[local807] = local803;
				if (local799 > this.anInt4238) {
					this.anInt4238 = local799;
				}
				if (local801 > this.anInt4238) {
					this.anInt4238 = local801;
				}
				if (local803 > this.anInt4238) {
					this.anInt4238 = local803;
				}
			}
			if (local813 == 2) {
				local801 = local803;
				local803 = (short) (local10.method5781() + local805);
				local805 = local803;
				this.aShortArray75[local807] = local799;
				this.aShortArray74[local807] = local801;
				this.aShortArray81[local807] = local803;
				if (local803 > this.anInt4238) {
					this.anInt4238 = local803;
				}
			}
			if (local813 == 3) {
				local799 = local803;
				local803 = (short) (local805 + local10.method5781());
				local805 = local803;
				this.aShortArray75[local807] = local799;
				this.aShortArray74[local807] = local801;
				this.aShortArray81[local807] = local803;
				if (local803 > this.anInt4238) {
					this.anInt4238 = local803;
				}
			}
			if (local813 == 4) {
				@Pc(972) short local972 = local799;
				local799 = local801;
				local801 = local972;
				local803 = (short) (local10.method5781() + local805);
				local805 = local803;
				this.aShortArray75[local807] = local799;
				this.aShortArray74[local807] = local972;
				this.aShortArray81[local807] = local803;
				if (this.anInt4238 < local803) {
					this.anInt4238 = local803;
				}
			}
		}
		this.anInt4238++;
		local10.anInt6813 = local329;
		local15.anInt6813 = local337;
		local20.anInt6813 = local345;
		local25.anInt6813 = local353;
		local30.anInt6813 = local359;
		local35.anInt6813 = local365;
		@Pc(1047) int local1047;
		for (local813 = 0; local813 < this.anInt4241; local813++) {
			local1047 = this.aByteArray46[local813] & 0xFF;
			if (local1047 == 0) {
				this.aShortArray70[local813] = (short) local10.method5749();
				this.aShortArray80[local813] = (short) local10.method5749();
				this.aShortArray73[local813] = (short) local10.method5749();
			}
			if (local1047 == 1) {
				this.aShortArray70[local813] = (short) local15.method5749();
				this.aShortArray80[local813] = (short) local15.method5749();
				this.aShortArray73[local813] = (short) local15.method5749();
				this.aShortArray69[local813] = (short) local20.method5749();
				this.aShortArray79[local813] = (short) local20.method5749();
				this.aShortArray72[local813] = (short) local20.method5749();
				this.aByteArray48[local813] = local25.method5772();
				this.aByteArray49[local813] = local30.method5772();
				this.aByteArray45[local813] = local35.method5772();
			}
			if (local1047 == 2) {
				this.aShortArray70[local813] = (short) local15.method5749();
				this.aShortArray80[local813] = (short) local15.method5749();
				this.aShortArray73[local813] = (short) local15.method5749();
				this.aShortArray69[local813] = (short) local20.method5749();
				this.aShortArray79[local813] = (short) local20.method5749();
				this.aShortArray72[local813] = (short) local20.method5749();
				this.aByteArray48[local813] = local25.method5772();
				this.aByteArray49[local813] = local30.method5772();
				this.aByteArray45[local813] = local35.method5772();
				this.aByteArray42[local813] = local35.method5772();
				this.aByteArray50[local813] = local35.method5772();
			}
			if (local1047 == 3) {
				this.aShortArray70[local813] = (short) local15.method5749();
				this.aShortArray80[local813] = (short) local15.method5749();
				this.aShortArray73[local813] = (short) local15.method5749();
				this.aShortArray69[local813] = (short) local20.method5749();
				this.aShortArray79[local813] = (short) local20.method5749();
				this.aShortArray72[local813] = (short) local20.method5749();
				this.aByteArray48[local813] = local25.method5772();
				this.aByteArray49[local813] = local30.method5772();
				this.aByteArray45[local813] = local35.method5772();
			}
		}
		if (!local89) {
			return;
		}
		local10.anInt6813 = local159;
		local1047 = local10.method5761();
		@Pc(1350) int local1350;
		@Pc(1356) int local1356;
		if (local1047 > 0) {
			this.aClass49Array2 = new Class49[local1047];
			for (local1350 = 0; local1350 < local1047; local1350++) {
				local1356 = local10.method5749();
				@Pc(1360) int local1360 = local10.method5749();
				@Pc(1370) byte local1370;
				if (local93 == 255) {
					local1370 = this.aByteArray47[local1360];
				} else {
					local1370 = (byte) local93;
				}
				this.aClass49Array2[local1350] = new Class49(local1356, this.aShortArray75[local1360], this.aShortArray74[local1360], this.aShortArray81[local1360], local1370);
			}
		}
		local1350 = local10.method5761();
		if (local1350 <= 0) {
			return;
		}
		this.aClass116Array2 = new Class116[local1350];
		for (local1356 = 0; local1356 < local1350; local1356++) {
			this.aClass116Array2[local1356] = new Class116(local10.method5749(), local10.method5749());
		}
		return;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(SIBSBSSBSS)B")
	public byte method3647() {
		if (this.anInt4241 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray46[this.anInt4241] = 3;
		this.aShortArray70[this.anInt4241] = 0;
		this.aShortArray80[this.anInt4241] = 32767;
		this.aShortArray73[this.anInt4241] = 0;
		this.aShortArray69[this.anInt4241] = 1024;
		this.aShortArray79[this.anInt4241] = 1024;
		this.aShortArray72[this.anInt4241] = 1024;
		this.aByteArray48[this.anInt4241] = 0;
		this.aByteArray49[this.anInt4241] = 0;
		this.aByteArray45[this.anInt4241] = 0;
		return (byte) this.anInt4241++;
	}
}
