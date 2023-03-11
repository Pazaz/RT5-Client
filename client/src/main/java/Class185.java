import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class185 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "[I")
	public int[] anIntArray354;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "[I")
	public int[] anIntArray355;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "[I")
	public int[] anIntArray356;

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!pr", name = "x", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!pr", name = "y", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!pr", name = "z", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!pr", name = "C", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!pr", name = "F", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!pr", name = "I", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!pr", name = "K", descriptor = "[Lclient!nm;")
	public Class163[] aClass163Array3;

	@OriginalMember(owner = "client!pr", name = "M", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!pr", name = "O", descriptor = "[Lclient!jf;")
	public Class114[] aClass114Array3;

	@OriginalMember(owner = "client!pr", name = "Q", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!pr", name = "R", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!pr", name = "S", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!pr", name = "T", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!pr", name = "U", descriptor = "[I")
	public int[] anIntArray357;

	@OriginalMember(owner = "client!pr", name = "V", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!pr", name = "Y", descriptor = "[I")
	public int[] anIntArray358;

	@OriginalMember(owner = "client!pr", name = "Z", descriptor = "[S")
	public short[] aShortArray108;

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
	public int anInt5072 = 0;

	@OriginalMember(owner = "client!pr", name = "D", descriptor = "B")
	public byte aByte56 = 0;

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
	public int anInt5075 = 0;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
	public int anInt5071 = 0;

	@OriginalMember(owner = "client!pr", name = "X", descriptor = "I")
	public int anInt5087 = 0;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "([B)V")
	public Class185(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4652(arg0);
		} else {
			this.method4654(arg0);
		}
	}

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(III)V")
	public Class185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray61 = new byte[arg1];
		if (arg2 > 0) {
			this.aShortArray96 = new short[arg2];
			this.aShortArray103 = new short[arg2];
			this.aByteArray69 = new byte[arg2];
			this.aByteArray68 = new byte[arg2];
			this.aByteArray66 = new byte[arg2];
			this.aShortArray99 = new short[arg2];
			this.aShortArray101 = new short[arg2];
			this.aShortArray104 = new short[arg2];
			this.aShortArray106 = new short[arg2];
			this.aByteArray65 = new byte[arg2];
			this.aByteArray67 = new byte[arg2];
			this.aByteArray62 = new byte[arg2];
		}
		this.anIntArray354 = new int[arg0];
		this.anIntArray357 = new int[arg1];
		this.aShortArray102 = new short[arg1];
		this.aByteArray70 = new byte[arg1];
		this.anIntArray355 = new int[arg0];
		this.anIntArray358 = new int[arg0];
		this.aShortArray105 = new short[arg1];
		this.aByteArray63 = new byte[arg1];
		this.aByteArray64 = new byte[arg1];
		this.aShortArray98 = new short[arg1];
		this.aShortArray97 = new short[arg1];
		this.aShortArray108 = new short[arg1];
		this.anIntArray356 = new int[arg0];
	}

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "([Lclient!pr;I)V")
	public Class185(@OriginalArg(0) Class185[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5072 = 0;
		this.anInt5075 = 0;
		this.anInt5071 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(43) boolean local43 = false;
		this.aByte56 = -1;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class185 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt5075 += local54.anInt5075;
				this.anInt5072 += local54.anInt5072;
				this.anInt5071 += local54.anInt5071;
				if (local54.aClass114Array3 != null) {
					local29 += local54.aClass114Array3.length;
				}
				if (local54.aClass163Array3 != null) {
					local31 += local54.aClass163Array3.length;
				}
				local33 |= local54.aByteArray64 != null;
				local41 |= local54.aShortArray98 != null;
				local39 |= local54.aByteArray70 != null;
				local43 |= local54.anIntArray357 != null;
				local37 |= local54.aByteArray63 != null;
				if (local54.aByteArray61 == null) {
					if (this.aByte56 == -1) {
						this.aByte56 = local54.aByte56;
					}
					if (local54.aByte56 != this.aByte56) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
			}
		}
		this.anIntArray358 = new int[this.anInt5075];
		if (this.anInt5072 > 0) {
			this.aByteArray66 = new byte[this.anInt5072];
			this.aShortArray104 = new short[this.anInt5072];
			this.aByteArray67 = new byte[this.anInt5072];
			this.aShortArray103 = new short[this.anInt5072];
			this.aByteArray65 = new byte[this.anInt5072];
			this.aByteArray69 = new byte[this.anInt5072];
			this.aShortArray99 = new short[this.anInt5072];
			this.aByteArray62 = new byte[this.anInt5072];
			this.aByteArray68 = new byte[this.anInt5072];
			this.aShortArray101 = new short[this.anInt5072];
			this.aShortArray96 = new short[this.anInt5072];
			this.aShortArray106 = new short[this.anInt5072];
		}
		this.aShortArray105 = new short[this.anInt5071];
		if (local29 > 0) {
			this.aClass114Array3 = new Class114[local29];
		}
		this.anIntArray354 = new int[this.anInt5075];
		this.aShortArray97 = new short[this.anInt5071];
		if (local33) {
			this.aByteArray64 = new byte[this.anInt5071];
		}
		if (local41) {
			this.aShortArray98 = new short[this.anInt5071];
		}
		this.anIntArray356 = new int[this.anInt5075];
		if (local39) {
			this.aByteArray70 = new byte[this.anInt5071];
		}
		this.aShortArray100 = new short[this.anInt5071];
		if (local35) {
			this.aByteArray61 = new byte[this.anInt5071];
		}
		this.aShortArray102 = new short[this.anInt5071];
		this.aShortArray107 = new short[this.anInt5075];
		if (local31 > 0) {
			this.aClass163Array3 = new Class163[local31];
		}
		if (local43) {
			this.anIntArray357 = new int[this.anInt5071];
		}
		if (local37) {
			this.aByteArray63 = new byte[this.anInt5071];
		}
		this.anIntArray355 = new int[this.anInt5075];
		this.aShortArray108 = new short[this.anInt5071];
		this.anInt5075 = 0;
		local31 = 0;
		this.anInt5072 = 0;
		this.anInt5071 = 0;
		local29 = 0;
		@Pc(555) int local555;
		@Pc(566) int local566;
		for (@Pc(354) int local354 = 0; local354 < arg1; local354++) {
			@Pc(361) short local361 = (short) (0x1 << local354);
			@Pc(365) Class185 local365 = arg0[local354];
			if (local365 != null) {
				for (@Pc(369) int local369 = 0; local369 < local365.anInt5071; local369++) {
					if (local33 && local365.aByteArray64 != null) {
						this.aByteArray64[this.anInt5071] = local365.aByteArray64[local369];
					}
					if (local35) {
						if (local365.aByteArray61 == null) {
							this.aByteArray61[this.anInt5071] = local365.aByte56;
						} else {
							this.aByteArray61[this.anInt5071] = local365.aByteArray61[local369];
						}
					}
					if (local37 && local365.aByteArray63 != null) {
						this.aByteArray63[this.anInt5071] = local365.aByteArray63[local369];
					}
					if (local41) {
						if (local365.aShortArray98 == null) {
							this.aShortArray98[this.anInt5071] = -1;
						} else {
							this.aShortArray98[this.anInt5071] = local365.aShortArray98[local369];
						}
					}
					if (local43) {
						if (local365.anIntArray357 == null) {
							this.anIntArray357[this.anInt5071] = -1;
						} else {
							this.anIntArray357[this.anInt5071] = local365.anIntArray357[local369];
						}
					}
					this.aShortArray97[this.anInt5071] = (short) this.method4657(local361, local365.aShortArray97[local369], local365);
					this.aShortArray105[this.anInt5071] = (short) this.method4657(local361, local365.aShortArray105[local369], local365);
					this.aShortArray102[this.anInt5071] = (short) this.method4657(local361, local365.aShortArray102[local369], local365);
					this.aShortArray100[this.anInt5071] = local361;
					this.aShortArray108[this.anInt5071] = local365.aShortArray108[local369];
					this.anInt5071++;
				}
				@Pc(542) int local542;
				if (local365.aClass114Array3 != null) {
					for (local542 = 0; local542 < local365.aClass114Array3.length; local542++) {
						local555 = this.method4657(local361, local365.aClass114Array3[local542].anInt2918, local365);
						local566 = this.method4657(local361, local365.aClass114Array3[local542].anInt2926, local365);
						@Pc(577) int local577 = this.method4657(local361, local365.aClass114Array3[local542].anInt2920, local365);
						this.aClass114Array3[local29] = new Class114(local365.aClass114Array3[local542].anInt2930, local555, local566, local577, local365.aClass114Array3[local542].aByte26);
						local29++;
					}
				}
				if (local365.aClass163Array3 != null) {
					for (local542 = 0; local542 < local365.aClass163Array3.length; local542++) {
						local555 = this.method4657(local361, local365.aClass163Array3[local542].anInt4333, local365);
						this.aClass163Array3[local31] = new Class163(local365.aClass163Array3[local542].anInt4330, local555);
						local31++;
					}
				}
			}
		}
		@Pc(652) int local652 = 0;
		this.anInt5087 = this.anInt5075;
		for (@Pc(658) int local658 = 0; local658 < arg1; local658++) {
			@Pc(665) short local665 = (short) (0x1 << local658);
			@Pc(669) Class185 local669 = arg0[local658];
			if (local669 != null) {
				for (local555 = 0; local555 < local669.anInt5071; local555++) {
					if (local39) {
						this.aByteArray70[local652++] = (byte) (local669.aByteArray70 == null || local669.aByteArray70[local555] == -1 ? -1 : this.anInt5072 + local669.aByteArray70[local555]);
					}
				}
				for (local566 = 0; local566 < local669.anInt5072; local566++) {
					@Pc(721) byte local721 = this.aByteArray67[this.anInt5072] = local669.aByteArray67[local566];
					if (local721 == 0) {
						this.aShortArray104[this.anInt5072] = (short) this.method4657(local665, local669.aShortArray104[local566], local669);
						this.aShortArray106[this.anInt5072] = (short) this.method4657(local665, local669.aShortArray106[local566], local669);
						this.aShortArray101[this.anInt5072] = (short) this.method4657(local665, local669.aShortArray101[local566], local669);
					}
					if (local721 >= 1 && local721 <= 3) {
						this.aShortArray104[this.anInt5072] = local669.aShortArray104[local566];
						this.aShortArray106[this.anInt5072] = local669.aShortArray106[local566];
						this.aShortArray101[this.anInt5072] = local669.aShortArray101[local566];
						this.aShortArray96[this.anInt5072] = local669.aShortArray96[local566];
						this.aShortArray99[this.anInt5072] = local669.aShortArray99[local566];
						this.aShortArray103[this.anInt5072] = local669.aShortArray103[local566];
						this.aByteArray68[this.anInt5072] = local669.aByteArray68[local566];
						this.aByteArray66[this.anInt5072] = local669.aByteArray66[local566];
						this.aByteArray65[this.anInt5072] = local669.aByteArray65[local566];
					}
					if (local721 == 2) {
						this.aByteArray69[this.anInt5072] = local669.aByteArray69[local566];
						this.aByteArray62[this.anInt5072] = local669.aByteArray62[local566];
					}
					this.anInt5072++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B[B)V")
	private void method4652(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub4 local10 = new Class2_Sub4(arg0);
		@Pc(15) Class2_Sub4 local15 = new Class2_Sub4(arg0);
		@Pc(20) Class2_Sub4 local20 = new Class2_Sub4(arg0);
		@Pc(25) Class2_Sub4 local25 = new Class2_Sub4(arg0);
		@Pc(30) Class2_Sub4 local30 = new Class2_Sub4(arg0);
		@Pc(35) Class2_Sub4 local35 = new Class2_Sub4(arg0);
		@Pc(48) Class2_Sub4 local48 = new Class2_Sub4(arg0);
		local10.anInt5300 = arg0.length - 23;
		this.anInt5075 = local10.method4829();
		this.anInt5071 = local10.method4829();
		this.anInt5072 = local10.method4815();
		@Pc(73) int local73 = local10.method4815();
		@Pc(82) boolean local82 = (local73 & 0x1) == 1;
		@Pc(93) boolean local93 = (local73 & 0x2) == 2;
		@Pc(97) int local97 = local10.method4815();
		@Pc(101) int local101 = local10.method4815();
		@Pc(105) int local105 = local10.method4815();
		@Pc(109) int local109 = local10.method4815();
		@Pc(113) int local113 = local10.method4815();
		@Pc(117) int local117 = local10.method4829();
		@Pc(121) int local121 = local10.method4829();
		@Pc(125) int local125 = local10.method4829();
		@Pc(129) int local129 = local10.method4829();
		@Pc(133) int local133 = local10.method4829();
		@Pc(135) int local135 = 0;
		@Pc(137) int local137 = 0;
		@Pc(139) int local139 = 0;
		@Pc(155) int local155;
		if (this.anInt5072 > 0) {
			this.aByteArray67 = new byte[this.anInt5072];
			local10.anInt5300 = 0;
			for (local155 = 0; local155 < this.anInt5072; local155++) {
				@Pc(166) byte local166 = this.aByteArray67[local155] = local10.method4825();
				if (local166 == 0) {
					local135++;
				}
				if (local166 == 2) {
					local139++;
				}
				if (local166 >= 1 && local166 <= 3) {
					local137++;
				}
			}
		}
		local155 = this.anInt5072;
		@Pc(197) int local197 = local155;
		local155 += this.anInt5075;
		@Pc(204) int local204 = local155;
		if (local82) {
			local155 += this.anInt5071;
		}
		@Pc(213) int local213 = local155;
		local155 += this.anInt5071;
		@Pc(220) int local220 = local155;
		if (local97 == 255) {
			local155 += this.anInt5071;
		}
		@Pc(230) int local230 = local155;
		if (local105 == 1) {
			local155 += this.anInt5071;
		}
		@Pc(242) int local242 = local155;
		if (local113 == 1) {
			local155 += this.anInt5075;
		}
		@Pc(252) int local252 = local155;
		if (local101 == 1) {
			local155 += this.anInt5071;
		}
		@Pc(262) int local262 = local155;
		local155 += local129;
		@Pc(268) int local268 = local155;
		if (local109 == 1) {
			local155 += this.anInt5071 * 2;
		}
		@Pc(280) int local280 = local155;
		local155 += local133;
		@Pc(286) int local286 = local155;
		local155 += this.anInt5071 * 2;
		@Pc(295) int local295 = local155;
		local155 += local117;
		@Pc(301) int local301 = local155;
		local155 += local121;
		@Pc(307) int local307 = local155;
		local155 += local125;
		@Pc(313) int local313 = local155;
		local155 += local135 * 6;
		@Pc(321) int local321 = local155;
		local155 += local137 * 6;
		@Pc(329) int local329 = local155;
		local155 += local137 * 6;
		@Pc(337) int local337 = local155;
		local155 += local137;
		@Pc(343) int local343 = local155;
		local155 += local137;
		@Pc(349) int local349 = local155;
		local155 += local137 + local139 * 2;
		if (local82) {
			this.aByteArray64 = new byte[this.anInt5071];
		}
		this.anIntArray356 = new int[this.anInt5075];
		this.aShortArray105 = new short[this.anInt5071];
		this.aShortArray97 = new short[this.anInt5071];
		if (local109 == 1) {
			this.aShortArray98 = new short[this.anInt5071];
		}
		if (local109 == 1 && this.anInt5072 > 0) {
			this.aByteArray70 = new byte[this.anInt5071];
		}
		local10.anInt5300 = local197;
		if (this.anInt5072 > 0) {
			this.aShortArray101 = new short[this.anInt5072];
			this.aShortArray106 = new short[this.anInt5072];
			if (local139 > 0) {
				this.aByteArray62 = new byte[local139];
				this.aByteArray69 = new byte[local139];
			}
			if (local137 > 0) {
				this.aByteArray66 = new byte[local137];
				this.aShortArray99 = new short[local137];
				this.aByteArray68 = new byte[local137];
				this.aShortArray103 = new short[local137];
				this.aShortArray96 = new short[local137];
				this.aByteArray65 = new byte[local137];
			}
			this.aShortArray104 = new short[this.anInt5072];
		}
		if (local105 == 1) {
			this.anIntArray357 = new int[this.anInt5071];
		}
		if (local113 == 1) {
			this.anIntArray358 = new int[this.anInt5075];
		}
		this.anIntArray355 = new int[this.anInt5075];
		if (local101 == 1) {
			this.aByteArray63 = new byte[this.anInt5071];
		}
		this.aShortArray108 = new short[this.anInt5071];
		this.aShortArray102 = new short[this.anInt5071];
		this.anIntArray354 = new int[this.anInt5075];
		if (local97 == 255) {
			this.aByteArray61 = new byte[this.anInt5071];
		} else {
			this.aByte56 = (byte) local97;
		}
		local15.anInt5300 = local295;
		local20.anInt5300 = local301;
		local25.anInt5300 = local307;
		local30.anInt5300 = local242;
		@Pc(539) int local539 = 0;
		@Pc(541) int local541 = 0;
		@Pc(543) int local543 = 0;
		@Pc(551) int local551;
		for (@Pc(545) int local545 = 0; local545 < this.anInt5075; local545++) {
			local551 = local10.method4815();
			@Pc(553) int local553 = 0;
			if ((local551 & 0x1) != 0) {
				local553 = local15.method4818();
			}
			@Pc(563) int local563 = 0;
			if ((local551 & 0x2) != 0) {
				local563 = local20.method4818();
			}
			@Pc(573) int local573 = 0;
			if ((local551 & 0x4) != 0) {
				local573 = local25.method4818();
			}
			this.anIntArray354[local545] = local539 + local553;
			this.anIntArray355[local545] = local563 + local541;
			this.anIntArray356[local545] = local543 + local573;
			local541 = this.anIntArray355[local545];
			local539 = this.anIntArray354[local545];
			local543 = this.anIntArray356[local545];
			if (local113 == 1) {
				this.anIntArray358[local545] = local30.method4815();
			}
		}
		local10.anInt5300 = local286;
		local15.anInt5300 = local204;
		local20.anInt5300 = local220;
		local25.anInt5300 = local252;
		local30.anInt5300 = local230;
		local35.anInt5300 = local268;
		local48.anInt5300 = local280;
		for (local551 = 0; local551 < this.anInt5071; local551++) {
			this.aShortArray108[local551] = (short) local10.method4829();
			if (local82) {
				this.aByteArray64[local551] = local15.method4825();
			}
			if (local97 == 255) {
				this.aByteArray61[local551] = local20.method4825();
			}
			if (local101 == 1) {
				this.aByteArray63[local551] = local25.method4825();
			}
			if (local105 == 1) {
				this.anIntArray357[local551] = local30.method4815();
			}
			if (local109 == 1) {
				this.aShortArray98[local551] = (short) (local35.method4829() - 1);
			}
			if (this.aByteArray70 != null) {
				if (this.aShortArray98[local551] == -1) {
					this.aByteArray70[local551] = -1;
				} else {
					this.aByteArray70[local551] = (byte) (local48.method4815() - 1);
				}
			}
		}
		local10.anInt5300 = local262;
		this.anInt5087 = -1;
		local15.anInt5300 = local213;
		@Pc(770) short local770 = 0;
		@Pc(772) short local772 = 0;
		@Pc(774) short local774 = 0;
		@Pc(776) short local776 = 0;
		@Pc(784) int local784;
		for (@Pc(778) int local778 = 0; local778 < this.anInt5071; local778++) {
			local784 = local15.method4815();
			if (local784 == 1) {
				local770 = (short) (local776 + local10.method4818());
				local772 = (short) (local10.method4818() + local770);
				local774 = (short) (local10.method4818() + local772);
				local776 = local774;
				this.aShortArray97[local778] = local770;
				this.aShortArray105[local778] = local772;
				this.aShortArray102[local778] = local774;
				if (this.anInt5087 < local770) {
					this.anInt5087 = local770;
				}
				if (this.anInt5087 < local772) {
					this.anInt5087 = local772;
				}
				if (this.anInt5087 < local774) {
					this.anInt5087 = local774;
				}
			}
			if (local784 == 2) {
				local772 = local774;
				local774 = (short) (local10.method4818() + local776);
				local776 = local774;
				this.aShortArray97[local778] = local770;
				this.aShortArray105[local778] = local772;
				this.aShortArray102[local778] = local774;
				if (this.anInt5087 < local774) {
					this.anInt5087 = local774;
				}
			}
			if (local784 == 3) {
				local770 = local774;
				local774 = (short) (local10.method4818() + local776);
				this.aShortArray97[local778] = local770;
				local776 = local774;
				this.aShortArray105[local778] = local772;
				this.aShortArray102[local778] = local774;
				if (this.anInt5087 < local774) {
					this.anInt5087 = local774;
				}
			}
			if (local784 == 4) {
				@Pc(935) short local935 = local770;
				local770 = local772;
				local772 = local935;
				local774 = (short) (local10.method4818() + local776);
				local776 = local774;
				this.aShortArray97[local778] = local770;
				this.aShortArray105[local778] = local935;
				this.aShortArray102[local778] = local774;
				if (local774 > this.anInt5087) {
					this.anInt5087 = local774;
				}
			}
		}
		this.anInt5087++;
		local10.anInt5300 = local313;
		local15.anInt5300 = local321;
		local20.anInt5300 = local329;
		local25.anInt5300 = local337;
		local30.anInt5300 = local343;
		local35.anInt5300 = local349;
		@Pc(1014) int local1014;
		for (local784 = 0; local784 < this.anInt5072; local784++) {
			local1014 = this.aByteArray67[local784] & 0xFF;
			if (local1014 == 0) {
				this.aShortArray104[local784] = (short) local10.method4829();
				this.aShortArray106[local784] = (short) local10.method4829();
				this.aShortArray101[local784] = (short) local10.method4829();
			}
			if (local1014 == 1) {
				this.aShortArray104[local784] = (short) local15.method4829();
				this.aShortArray106[local784] = (short) local15.method4829();
				this.aShortArray101[local784] = (short) local15.method4829();
				this.aShortArray96[local784] = (short) local20.method4829();
				this.aShortArray99[local784] = (short) local20.method4829();
				this.aShortArray103[local784] = (short) local20.method4829();
				this.aByteArray68[local784] = local25.method4825();
				this.aByteArray66[local784] = local30.method4825();
				this.aByteArray65[local784] = local35.method4825();
			}
			if (local1014 == 2) {
				this.aShortArray104[local784] = (short) local15.method4829();
				this.aShortArray106[local784] = (short) local15.method4829();
				this.aShortArray101[local784] = (short) local15.method4829();
				this.aShortArray96[local784] = (short) local20.method4829();
				this.aShortArray99[local784] = (short) local20.method4829();
				this.aShortArray103[local784] = (short) local20.method4829();
				this.aByteArray68[local784] = local25.method4825();
				this.aByteArray66[local784] = local30.method4825();
				this.aByteArray65[local784] = local35.method4825();
				this.aByteArray69[local784] = local35.method4825();
				this.aByteArray62[local784] = local35.method4825();
			}
			if (local1014 == 3) {
				this.aShortArray104[local784] = (short) local15.method4829();
				this.aShortArray106[local784] = (short) local15.method4829();
				this.aShortArray101[local784] = (short) local15.method4829();
				this.aShortArray96[local784] = (short) local20.method4829();
				this.aShortArray99[local784] = (short) local20.method4829();
				this.aShortArray103[local784] = (short) local20.method4829();
				this.aByteArray68[local784] = local25.method4825();
				this.aByteArray66[local784] = local30.method4825();
				this.aByteArray65[local784] = local35.method4825();
			}
		}
		if (!local93) {
			return;
		}
		local10.anInt5300 = local155;
		local1014 = local10.method4815();
		@Pc(1304) int local1304;
		@Pc(1310) int local1310;
		if (local1014 > 0) {
			this.aClass114Array3 = new Class114[local1014];
			for (local1304 = 0; local1304 < local1014; local1304++) {
				local1310 = local10.method4829();
				@Pc(1314) int local1314 = local10.method4829();
				@Pc(1320) byte local1320;
				if (local97 == 255) {
					local1320 = this.aByteArray61[local1314];
				} else {
					local1320 = (byte) local97;
				}
				this.aClass114Array3[local1304] = new Class114(local1310, this.aShortArray97[local1314], this.aShortArray105[local1314], this.aShortArray102[local1314], local1320);
			}
		}
		local1304 = local10.method4815();
		if (local1304 <= 0) {
			return;
		}
		this.aClass163Array3 = new Class163[local1304];
		for (local1310 = 0; local1310 < local1304; local1310++) {
			this.aClass163Array3[local1310] = new Class163(local10.method4829(), local10.method4829());
		}
		return;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)[[I")
	public int[][] method4653() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.anInt5071; local19++) {
			@Pc(26) int local26 = this.anIntArray357[local19];
			if (local26 >= 0) {
				if (local26 > local17) {
					local17 = local26;
				}
				@Pc(40) int local40 = local8[local26]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local17 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local17; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.anInt5071; local82++) {
			@Pc(89) int local89 = this.anIntArray357[local82];
			if (local89 >= 0) {
				local57[local89][local8[local89]++] = local82;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z[B)V")
	private void method4654(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub4 local14 = new Class2_Sub4(arg0);
		@Pc(19) Class2_Sub4 local19 = new Class2_Sub4(arg0);
		@Pc(24) Class2_Sub4 local24 = new Class2_Sub4(arg0);
		@Pc(29) Class2_Sub4 local29 = new Class2_Sub4(arg0);
		@Pc(34) Class2_Sub4 local34 = new Class2_Sub4(arg0);
		local14.anInt5300 = arg0.length - 18;
		this.anInt5075 = local14.method4829();
		this.anInt5071 = local14.method4829();
		this.anInt5072 = local14.method4815();
		@Pc(59) int local59 = local14.method4815();
		@Pc(63) int local63 = local14.method4815();
		@Pc(67) int local67 = local14.method4815();
		@Pc(71) int local71 = local14.method4815();
		@Pc(75) int local75 = local14.method4815();
		@Pc(79) int local79 = local14.method4829();
		@Pc(83) int local83 = local14.method4829();
		@Pc(87) int local87 = local14.method4829();
		@Pc(91) int local91 = local14.method4829();
		@Pc(100) int local100 = this.anInt5075;
		@Pc(102) int local102 = local100;
		local100 += this.anInt5071;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt5071;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt5071;
		}
		@Pc(129) int local129 = local100;
		if (local59 == 1) {
			local100 += this.anInt5071;
		}
		@Pc(141) int local141 = local100;
		if (local75 == 1) {
			local100 += this.anInt5075;
		}
		@Pc(151) int local151 = local100;
		if (local67 == 1) {
			local100 += this.anInt5071;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt5071 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt5072 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		this.aShortArray108 = new short[this.anInt5071];
		if (local71 == 1) {
			this.anIntArray357 = new int[this.anInt5071];
		}
		this.anIntArray355 = new int[this.anInt5075];
		if (local75 == 1) {
			this.anIntArray358 = new int[this.anInt5075];
		}
		if (this.anInt5072 > 0) {
			this.aShortArray101 = new short[this.anInt5072];
			this.aShortArray106 = new short[this.anInt5072];
			this.aShortArray104 = new short[this.anInt5072];
			this.aByteArray67 = new byte[this.anInt5072];
		}
		if (local59 == 1) {
			this.aByteArray64 = new byte[this.anInt5071];
			this.aShortArray98 = new short[this.anInt5071];
			this.aByteArray70 = new byte[this.anInt5071];
		}
		local14.anInt5300 = 0;
		if (local67 == 1) {
			this.aByteArray63 = new byte[this.anInt5071];
		}
		if (local63 == 255) {
			this.aByteArray61 = new byte[this.anInt5071];
		} else {
			this.aByte56 = (byte) local63;
		}
		this.anIntArray356 = new int[this.anInt5075];
		this.aShortArray105 = new short[this.anInt5071];
		this.anIntArray354 = new int[this.anInt5075];
		this.aShortArray97 = new short[this.anInt5071];
		this.aShortArray102 = new short[this.anInt5071];
		local19.anInt5300 = local187;
		local24.anInt5300 = local193;
		local29.anInt5300 = local100;
		local34.anInt5300 = local141;
		@Pc(338) int local338 = 0;
		@Pc(340) int local340 = 0;
		@Pc(342) int local342 = 0;
		@Pc(350) int local350;
		@Pc(352) int local352;
		for (@Pc(344) int local344 = 0; local344 < this.anInt5075; local344++) {
			local350 = local14.method4815();
			local352 = 0;
			if ((local350 & 0x1) != 0) {
				local352 = local19.method4818();
			}
			@Pc(365) int local365 = 0;
			if ((local350 & 0x2) != 0) {
				local365 = local24.method4818();
			}
			@Pc(378) int local378 = 0;
			if ((local350 & 0x4) != 0) {
				local378 = local29.method4818();
			}
			this.anIntArray354[local344] = local338 + local352;
			this.anIntArray355[local344] = local340 + local365;
			this.anIntArray356[local344] = local378 + local342;
			local338 = this.anIntArray354[local344];
			local340 = this.anIntArray355[local344];
			local342 = this.anIntArray356[local344];
			if (local75 == 1) {
				this.anIntArray358[local344] = local34.method4815();
			}
		}
		local14.anInt5300 = local169;
		local19.anInt5300 = local129;
		local24.anInt5300 = local109;
		local29.anInt5300 = local151;
		local34.anInt5300 = local119;
		for (local350 = 0; local350 < this.anInt5071; local350++) {
			this.aShortArray108[local350] = (short) local14.method4829();
			if (local59 == 1) {
				local352 = local19.method4815();
				if ((local352 & 0x1) == 1) {
					this.aByteArray64[local350] = 1;
					local7 = true;
				} else {
					this.aByteArray64[local350] = 0;
				}
				if ((local352 & 0x2) == 2) {
					this.aByteArray70[local350] = (byte) (local352 >> 2);
					this.aShortArray98[local350] = this.aShortArray108[local350];
					this.aShortArray108[local350] = 127;
					if (this.aShortArray98[local350] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray70[local350] = -1;
					this.aShortArray98[local350] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray61[local350] = local24.method4825();
			}
			if (local67 == 1) {
				this.aByteArray63[local350] = local29.method4825();
			}
			if (local71 == 1) {
				this.anIntArray357[local350] = local34.method4815();
			}
		}
		this.anInt5087 = -1;
		local14.anInt5300 = local163;
		local19.anInt5300 = local102;
		@Pc(594) short local594 = 0;
		@Pc(596) short local596 = 0;
		@Pc(598) short local598 = 0;
		@Pc(600) short local600 = 0;
		@Pc(608) int local608;
		for (@Pc(602) int local602 = 0; local602 < this.anInt5071; local602++) {
			local608 = local19.method4815();
			if (local608 == 1) {
				local594 = (short) (local600 + local14.method4818());
				local596 = (short) (local14.method4818() + local594);
				local598 = (short) (local596 + local14.method4818());
				local600 = local598;
				this.aShortArray97[local602] = local594;
				this.aShortArray105[local602] = local596;
				this.aShortArray102[local602] = local598;
				if (local594 > this.anInt5087) {
					this.anInt5087 = local594;
				}
				if (local596 > this.anInt5087) {
					this.anInt5087 = local596;
				}
				if (local598 > this.anInt5087) {
					this.anInt5087 = local598;
				}
			}
			if (local608 == 2) {
				local596 = local598;
				local598 = (short) (local14.method4818() + local600);
				local600 = local598;
				this.aShortArray97[local602] = local594;
				this.aShortArray105[local602] = local596;
				this.aShortArray102[local602] = local598;
				if (this.anInt5087 < local598) {
					this.anInt5087 = local598;
				}
			}
			if (local608 == 3) {
				local594 = local598;
				local598 = (short) (local600 + local14.method4818());
				local600 = local598;
				this.aShortArray97[local602] = local594;
				this.aShortArray105[local602] = local596;
				this.aShortArray102[local602] = local598;
				if (this.anInt5087 < local598) {
					this.anInt5087 = local598;
				}
			}
			if (local608 == 4) {
				@Pc(761) short local761 = local594;
				local594 = local596;
				local596 = local761;
				local598 = (short) (local14.method4818() + local600);
				local600 = local598;
				this.aShortArray97[local602] = local594;
				this.aShortArray105[local602] = local761;
				this.aShortArray102[local602] = local598;
				if (this.anInt5087 < local598) {
					this.anInt5087 = local598;
				}
			}
		}
		local14.anInt5300 = local178;
		this.anInt5087++;
		for (local608 = 0; local608 < this.anInt5072; local608++) {
			this.aByteArray67[local608] = 0;
			this.aShortArray104[local608] = (short) local14.method4829();
			this.aShortArray106[local608] = (short) local14.method4829();
			this.aShortArray101[local608] = (short) local14.method4829();
		}
		if (this.aByteArray70 != null) {
			@Pc(853) boolean local853 = false;
			for (@Pc(855) int local855 = 0; local855 < this.anInt5071; local855++) {
				@Pc(864) int local864 = this.aByteArray70[local855] & 0xFF;
				if (local864 != 255) {
					if ((this.aShortArray104[local864] & 0xFFFF) == this.aShortArray97[local855] && (this.aShortArray106[local864] & 0xFFFF) == this.aShortArray105[local855] && this.aShortArray102[local855] == (this.aShortArray101[local864] & 0xFFFF)) {
						this.aByteArray70[local855] = -1;
					} else {
						local853 = true;
					}
				}
			}
			if (!local853) {
				this.aByteArray70 = null;
			}
		}
		if (!local9) {
			this.aShortArray98 = null;
		}
		if (!local7) {
			this.aByteArray64 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIII)V")
	public void method4656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5075; local7++) {
			this.anIntArray354[local7] += arg0;
			this.anIntArray355[local7] += arg2;
			this.anIntArray356[local7] += arg1;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(SILclient!pr;Z)I")
	private int method4657(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		@Pc(15) int local15 = arg2.anIntArray354[arg1];
		@Pc(20) int local20 = arg2.anIntArray355[arg1];
		@Pc(25) int local25 = arg2.anIntArray356[arg1];
		for (@Pc(27) int local27 = 0; local27 < this.anInt5075; local27++) {
			if (this.anIntArray354[local27] == local15 && this.anIntArray355[local27] == local20 && local25 == this.anIntArray356[local27]) {
				this.aShortArray107[local27] |= arg0;
				return local27;
			}
		}
		this.anIntArray354[this.anInt5075] = local15;
		this.anIntArray355[this.anInt5075] = local20;
		this.anIntArray356[this.anInt5075] = local25;
		this.aShortArray107[this.anInt5075] = arg0;
		this.anIntArray358[this.anInt5075] = arg2.anIntArray358 == null ? -1 : arg2.anIntArray358[arg1];
		return this.anInt5075++;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZSS)V")
	public void method4658(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray98 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt5071; local17++) {
			if (arg1 == this.aShortArray98[local17]) {
				this.aShortArray98[local17] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(SIBIIBISB)I")
	public int method4659(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) short arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray97[this.anInt5071] = (short) arg1;
		this.aShortArray105[this.anInt5071] = (short) arg3;
		this.aShortArray102[this.anInt5071] = (short) arg5;
		this.aByteArray64[this.anInt5071] = arg4;
		this.aByteArray70[this.anInt5071] = arg7;
		this.aShortArray108[this.anInt5071] = arg0;
		this.aByteArray63[this.anInt5071] = arg2;
		this.aShortArray98[this.anInt5071] = arg6;
		return this.anInt5071++;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)[[I")
	public int[][] method4661() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5087; local12++) {
			@Pc(19) int local19 = this.anIntArray358[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local10; local60++) {
			local50[local60] = new int[local8[local60]];
			local8[local60] = 0;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt5087; local83++) {
			@Pc(90) int local90 = this.anIntArray358[local83];
			if (local90 >= 0) {
				local50[local90][local8[local90]++] = local83;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBSBBSSSSS)B")
	public byte method4662() {
		if (this.anInt5072 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray67[this.anInt5072] = 3;
		this.aShortArray104[this.anInt5072] = 0;
		this.aShortArray106[this.anInt5072] = 32767;
		this.aShortArray101[this.anInt5072] = 0;
		this.aShortArray96[this.anInt5072] = 1024;
		this.aShortArray99[this.anInt5072] = 1024;
		this.aShortArray103[this.anInt5072] = 1024;
		this.aByteArray68[this.anInt5072] = 0;
		this.aByteArray66[this.anInt5072] = 0;
		this.aByteArray65[this.anInt5072] = 0;
		return (byte) this.anInt5072++;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(SSZ)V")
	public void method4663(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5071; local3++) {
			if (this.aShortArray108[local3] == arg0) {
				this.aShortArray108[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(IIII)V")
	public void method4664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(32) int local32;
		if (arg1 != 0) {
			local7 = Class19.anIntArray178[arg1];
			local11 = Class19.anIntArray177[arg1];
			for (local13 = 0; local13 < this.anInt5075; local13++) {
				local32 = local7 * this.anIntArray355[local13] + this.anIntArray354[local13] * local11 >> 15;
				this.anIntArray355[local13] = local11 * this.anIntArray355[local13] - local7 * this.anIntArray354[local13] >> 15;
				this.anIntArray354[local13] = local32;
			}
		}
		if (arg2 != 0) {
			local7 = Class19.anIntArray178[arg2];
			local11 = Class19.anIntArray177[arg2];
			for (local13 = 0; local13 < this.anInt5075; local13++) {
				local32 = local11 * this.anIntArray355[local13] - this.anIntArray356[local13] * local7 >> 15;
				this.anIntArray356[local13] = this.anIntArray355[local13] * local7 + local11 * this.anIntArray356[local13] >> 15;
				this.anIntArray355[local13] = local32;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local7 = Class19.anIntArray178[arg0];
		local11 = Class19.anIntArray177[arg0];
		for (local13 = 0; local13 < this.anInt5075; local13++) {
			local32 = local7 * this.anIntArray356[local13] + this.anIntArray354[local13] * local11 >> 15;
			this.anIntArray356[local13] = this.anIntArray356[local13] * local11 - local7 * this.anIntArray354[local13] >> 15;
			this.anIntArray354[local13] = local32;
		}
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(IIII)I")
	public int method4665(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5075; local7++) {
			if (this.anIntArray354[local7] == arg1 && arg0 == this.anIntArray355[local7] && this.anIntArray356[local7] == arg2) {
				return local7;
			}
		}
		this.anIntArray354[this.anInt5075] = arg1;
		this.anIntArray355[this.anInt5075] = arg0;
		this.anIntArray356[this.anInt5075] = arg2;
		this.anInt5087 = this.anInt5075 + 1;
		return this.anInt5075++;
	}
}
