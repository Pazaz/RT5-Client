import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class8_Sub2_Sub1_Sub2_Sub2 extends Class8_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!wj", name = "Qc", descriptor = "Ljava/lang/String;")
	public String aString128;

	@OriginalMember(owner = "client!wj", name = "Gc", descriptor = "Lclient!vk;")
	public Class386 aClass386_1;

	@OriginalMember(owner = "client!wj", name = "Yc", descriptor = "Lclient!o;")
	public Class268 aClass268_1;

	@OriginalMember(owner = "client!wj", name = "Sc", descriptor = "I")
	public int anInt10791;

	@OriginalMember(owner = "client!wj", name = "ad", descriptor = "I")
	public int anInt10774 = -1;

	@OriginalMember(owner = "client!wj", name = "fd", descriptor = "I")
	public int anInt10767 = -1;

	@OriginalMember(owner = "client!wj", name = "Jc", descriptor = "I")
	public int anInt10788 = 1;

	@OriginalMember(owner = "client!wj", name = "Dc", descriptor = "I")
	public int anInt10790 = 1;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub1_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(I)V")
	public Class8_Sub2_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "(I)V")
	@Override
	public void method9280(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "(B)Z")
	public boolean method9322() {
		return this.aClass268_1 != null;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public void method9285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		if (arg4 <= 101) {
			Static712.method9329((byte) 99);
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		if (this.aClass268_1 == null || !this.method9324(131072, arg3)) {
			return false;
		}
		@Pc(20) Class73 local20 = arg3.method7985();
		@Pc(25) int local25 = super.aClass126_7.method2673(16383);
		local20.method7131(local25);
		local20.method7134(super.anInt10690, super.anInt10691, super.anInt10694);
		@Pc(38) boolean local38 = arg2;
		for (@Pc(40) int local40 = 0; local40 < super.aClass114Array3.length; local40++) {
			if (super.aClass114Array3[local40] != null) {
				@Pc(71) boolean var10000;
				label50: {
					if (this.aClass268_1.anInt6723 <= 0) {
						label48: {
							if (this.aClass268_1.anInt6706 == -1) {
								if (this.aClass268_1.anInt6713 == 1) {
									break label48;
								}
								var10000 = false;
							} else {
								if (this.aClass268_1.anInt6706 == 1) {
									break label48;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label50;
							}
						}
					}
					var10000 = true;
				}
				@Pc(89) boolean local89 = var10000;
				@Pc(105) boolean local105;
				if (Static504.aBoolean579) {
					local105 = super.aClass114Array3[local40].method7483(arg1, arg0, local20, local89, this.aClass268_1.anInt6723, Static582.anInt8627);
				} else {
					local105 = super.aClass114Array3[local40].method7486(arg1, arg0, local20, local89, this.aClass268_1.anInt6723);
				}
				if (local105) {
					local38 = true;
					break;
				}
			}
		}
		for (@Pc(136) int local136 = 0; local136 < super.aClass114Array3.length; local136++) {
			super.aClass114Array3[local136] = null;
		}
		return local38;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9276(@OriginalArg(1) Class19 arg0) {
		if (this.aClass268_1 == null || !this.method9324(2048, arg0)) {
			return null;
		}
		@Pc(22) Class73 local22 = arg0.method7985();
		@Pc(27) int local27 = super.aClass126_7.method2673(16383);
		local22.method7131(local27);
		@Pc(45) Class291 local45 = Static334.aClass291ArrayArrayArray1[super.aByte144][super.anInt10690 >> Static52.anInt1066][super.anInt10694 >> Static52.anInt1066];
		if (local45 == null || local45.aClass8_Sub2_Sub2_1 == null) {
			super.anInt10732 = (int) ((float) super.anInt10732 - (float) super.anInt10732 / 10.0F);
		} else {
			@Pc(75) int local75 = super.anInt10732 - local45.aClass8_Sub2_Sub2_1.aShort46;
			super.anInt10732 = (int) ((float) super.anInt10732 - (float) local75 / 10.0F);
		}
		local22.method7134(super.anInt10690, -super.anInt10732 + super.anInt10691 - 20, super.anInt10694);
		@Pc(104) Class289 local104 = this.method9317();
		@Pc(118) Class268 local118 = this.aClass268_1.anIntArray532 == null ? this.aClass268_1 : this.aClass268_1.method5985(65535, Static34.aClass304_1);
		super.aBoolean819 = false;
		@Pc(123) Class8_Sub7 local123 = null;
		if (Static400.aClass2_Sub34_28.aClass57_Sub7_1.method2905() == 1 && local118.aBoolean506 && local104.aBoolean545) {
			@Pc(159) Class152 local159 = super.aClass152_11.method9109() && super.aClass152_11.method9106() ? super.aClass152_11 : null;
			@Pc(179) Class152 local179 = super.aClass152_10.method9109() && (!super.aBoolean817 || local159 == null) ? super.aClass152_10 : null;
			@Pc(223) Class114 local223 = Static618.method8320(this.aClass268_1.aByte109 & 0xFF, super.aClass114Array3[0], super.anInt10742, this.aClass268_1.aShort76 & 0xFFFF, super.anInt10716, this.aClass268_1.anInt6713, arg0, this.aClass268_1.aByte111 & 0xFF, local179 == null ? local159 : local179, super.anInt10746, local27, this.aClass268_1.aShort75 & 0xFFFF);
			if (local223 != null) {
				local123 = Static642.method8441(this.method9330(), super.aClass114Array3.length + 1);
				super.aBoolean819 = true;
				arg0.C(false);
				if (Static504.aBoolean579) {
					local223.method7484(local22, local123.aClass8_Sub6Array1[super.aClass114Array3.length], Static582.anInt8627, 0);
				} else {
					local223.method7473(local22, local123.aClass8_Sub6Array1[super.aClass114Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local22.method7131(local27);
		local22.method7134(super.anInt10690, -super.anInt10732 + super.anInt10691 - 5, super.anInt10694);
		if (local123 == null) {
			local123 = Static642.method8441(this.method9330(), super.aClass114Array3.length);
		}
		this.method9319(arg0, false, super.aClass114Array3, local22);
		@Pc(314) int local314;
		if (Static504.aBoolean579) {
			for (local314 = 0; local314 < super.aClass114Array3.length; local314++) {
				if (super.aClass114Array3[local314] != null) {
					super.aClass114Array3[local314].method7484(local22, local123.aClass8_Sub6Array1[local314], Static582.anInt8627, 0);
				}
			}
		} else {
			for (local314 = 0; local314 < super.aClass114Array3.length; local314++) {
				if (super.aClass114Array3[local314] != null) {
					super.aClass114Array3[local314].method7473(local22, local123.aClass8_Sub6Array1[local314], 0);
				}
			}
		}
		if (super.aClass8_Sub5_8 != null) {
			@Pc(394) Class230 local394 = super.aClass8_Sub5_8.method3645();
			if (Static504.aBoolean579) {
				arg0.method7967(local394, Static582.anInt8627);
			} else {
				arg0.method8021(local394);
			}
		}
		for (@Pc(419) int local419 = 0; local419 < super.aClass114Array3.length; local419++) {
			if (super.aClass114Array3[local419] != null) {
				super.aBoolean819 |= super.aClass114Array3[local419].F();
			}
			super.aClass114Array3[local419] = null;
		}
		super.anInt10704 = Static198.anInt3276;
		return local123;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZLclient!ha;)Z")
	private boolean method9324(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class289 local9 = this.method9317();
		@Pc(27) Class152 local27 = super.aClass152_11.method9109() && !super.aClass152_11.method9106() ? super.aClass152_11 : null;
		@Pc(47) Class152 local47 = super.aClass152_10.method9109() && (!super.aBoolean817 || local27 == null) ? super.aClass152_10 : null;
		@Pc(50) int local50 = local9.anInt7234;
		@Pc(53) int local53 = local9.anInt7238;
		if (local50 != 0 || local53 != 0 || local9.anInt7224 != 0 || local9.anInt7252 != 0) {
			arg0 |= 0x7;
		}
		@Pc(100) boolean local100 = super.aByte149 != 0 && super.anInt10760 <= Static333.anInt5455 && Static333.anInt5455 < super.anInt10752;
		if (local100) {
			arg0 |= 0x80000;
		}
		@Pc(111) int local111 = super.aClass126_7.method2673(16383);
		@Pc(134) Class114 local134 = super.aClass114Array3[0] = this.aClass268_1.method5993(Static34.aClass304_1, arg1, Static574.aClass310_2, local27, local111, super.anIntArray877, this.aClass386_1, local47, arg0, super.aClass152_Sub2_Sub1Array3);
		if (local134 == null) {
			return false;
		}
		super.anInt10748 = local134.fa();
		super.anInt10728 = local134.ma();
		this.method9306(local134);
		if (local50 == 0 && local53 == 0) {
			this.method9314(local111, 0, 0, this.method9302((byte) 116) << 9, this.method9302((byte) 79) << 9, -86);
		} else {
			this.method9314(local111, local9.anInt7236, local9.anInt7258, local50, local53, -119);
			if (super.anInt10746 != 0) {
				super.aClass114Array3[0].FA(super.anInt10746);
			}
			if (super.anInt10742 != 0) {
				super.aClass114Array3[0].VA(super.anInt10742);
			}
			if (super.anInt10716 != 0) {
				super.aClass114Array3[0].H(0, super.anInt10716, 0);
			}
		}
		if (local100) {
			local134.method7488(super.aByte150, super.aByte147, super.aByte148, super.aByte149 & 0xFF);
		}
		this.method9297(local5, local53, arg1, local9, local111, local50);
		return true;
	}

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)I")
	@Override
	public int method9299() {
		if (this.aClass268_1.anIntArray532 != null) {
			@Pc(19) Class268 local19 = this.aClass268_1.method5985(65535, Static34.aClass304_1);
			if (local19 != null && local19.anInt6707 != -1) {
				return local19.anInt6707;
			}
		}
		return this.aClass268_1.anInt6707 == -1 ? super.method9299() : this.aClass268_1.anInt6707;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class205 method9278(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -93) {
			this.method9320(98);
		}
		return null;
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)Lclient!dj;")
	@Override
	public Class80 method9318(@OriginalArg(0) int arg0) {
		if (arg0 == -3109) {
			return super.aClass80_3 != null && super.aClass80_3.aString20 == null ? null : super.aClass80_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9311() {
		return Static65.aClass3_1.aBoolean5;
	}

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "(B)I")
	@Override
	public int method9304(@OriginalArg(0) byte arg0) {
		if (arg0 >= -48) {
			this.method9290(117);
		}
		if (this.aClass268_1.anIntArray532 != null) {
			@Pc(22) Class268 local22 = this.aClass268_1.method5985(65535, Static34.aClass304_1);
			if (local22 != null && local22.anInt6715 != -1) {
				return local22.anInt6715;
			}
		}
		return this.aClass268_1.anInt6715;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V")
	public void method9325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray879[0];
		@Pc(20) int local20 = super.anIntArray878[0];
		if (arg1 == 0) {
			local20++;
		}
		if (arg1 == 1) {
			local20++;
			local10++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local20--;
			local10++;
		}
		if (arg1 == 4) {
			local20--;
		}
		if (arg1 == 5) {
			local20--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local10--;
			local20++;
		}
		if (super.aClass152_11.method9109() && super.aClass152_11.method9107().anInt1654 == 1) {
			super.anIntArray869 = null;
			super.aClass152_11.method9113(true, -1);
		}
		for (@Pc(110) int local110 = 0; local110 < super.aClass199Array3.length; local110++) {
			if (super.aClass199Array3[local110].anInt4930 != -1) {
				@Pc(131) Class227 local131 = Static23.aClass128_1.method2694(super.aClass199Array3[local110].anInt4930);
				if (local131.aBoolean448 && local131.anInt5842 != -1 && Static25.aClass50_1.method1162(local131.anInt5842).anInt1654 == 1) {
					super.aClass199Array3[local110].aClass152_7.method9113(true, -1);
					super.aClass199Array3[local110].anInt4930 = -1;
				}
			}
		}
		if (super.anInt10764 < super.anIntArray879.length - 1) {
			super.anInt10764++;
		}
		for (@Pc(201) int local201 = super.anInt10764; local201 > 0; local201--) {
			super.anIntArray879[local201] = super.anIntArray879[local201 - 1];
			super.anIntArray878[local201] = super.anIntArray878[local201 - 1];
			super.aByteArray111[local201] = super.aByteArray111[local201 - 1];
		}
		super.anIntArray879[0] = local10;
		super.anIntArray878[0] = local20;
		super.aByteArray111[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZIIII)V")
	public void method9326(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte144 = super.aByte143 = (byte) arg3;
		if (Static441.method5968(arg1, arg2)) {
			super.aByte143++;
		}
		if (super.aClass152_11.method9109() && super.aClass152_11.method9107().anInt1654 == 1) {
			super.anIntArray869 = null;
			super.aClass152_11.method9113(true, -1);
		}
		for (@Pc(61) int local61 = 0; local61 < super.aClass199Array3.length; local61++) {
			if (super.aClass199Array3[local61].anInt4930 != -1) {
				@Pc(81) Class227 local81 = Static23.aClass128_1.method2694(super.aClass199Array3[local61].anInt4930);
				if (local81.aBoolean448 && local81.anInt5842 != -1 && Static25.aClass50_1.method1162(local81.anInt5842).anInt1654 == 1) {
					super.aClass199Array3[local61].aClass152_7.method9113(true, -1);
					super.aClass199Array3[local61].anInt4930 = -1;
				}
			}
		}
		if (!arg0) {
			@Pc(134) int local134 = arg2 - super.anIntArray879[0];
			@Pc(142) int local142 = arg1 - super.anIntArray878[0];
			if (local134 >= -8 && local134 <= 8 && local142 >= -8 && local142 <= 8) {
				if (super.anIntArray879.length - 1 > super.anInt10764) {
					super.anInt10764++;
				}
				for (@Pc(183) int local183 = super.anInt10764; local183 > 0; local183--) {
					super.anIntArray879[local183] = super.anIntArray879[local183 - 1];
					super.anIntArray878[local183] = super.anIntArray878[local183 - 1];
					super.aByteArray111[local183] = super.aByteArray111[local183 - 1];
				}
				super.anIntArray879[0] = arg2;
				super.aByteArray111[0] = 1;
				super.anIntArray878[0] = arg1;
				return;
			}
		}
		super.anInt10764 = 0;
		super.anInt10763 = 0;
		super.anIntArray879[0] = arg2;
		super.anInt10762 = 0;
		super.anIntArray878[0] = arg1;
		super.anInt10690 = (arg4 << 8) + (super.anIntArray879[0] << 9);
		super.anInt10694 = (super.anIntArray878[0] << 9) + (arg4 << 8);
		if (super.aClass8_Sub5_8 != null) {
			super.aClass8_Sub5_8.method3656();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILjava/lang/String;B)V")
	public void method9327(@OriginalArg(2) String arg0) {
		@Pc(17) int local17 = Static504.method6733() * Static65.aClass3_1.anInt85;
		this.method9313(local17, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9289(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass268_1 == null || !super.aBoolean820 && !this.method9324(0, arg0)) {
			return;
		}
		@Pc(26) Class73 local26 = arg0.method7985();
		local26.method7131(super.aClass126_7.method2673(16383));
		local26.method7134(super.anInt10690, super.anInt10691 - 20, super.anInt10694);
		this.method9319(arg0, super.aBoolean820, super.aClass114Array3, local26);
		for (@Pc(53) int local53 = 0; local53 < super.aClass114Array3.length; local53++) {
			super.aClass114Array3[local53] = null;
		}
		if (arg1 != -5) {
			this.method9278((Class19) null, -21);
		}
	}

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method9290(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method9322();
		}
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!o;Z)V")
	public void method9328(@OriginalArg(0) Class268 arg0) {
		if (arg0 != this.aClass268_1 && Static400.aBoolean622 && Static321.method4622(super.anInt10740)) {
			Static488.method6522();
		}
		this.aClass268_1 = arg0;
		if (this.aClass268_1 != null) {
			this.aString128 = this.aClass268_1.aString73;
			this.anInt10791 = this.aClass268_1.anInt6727;
		}
		if (super.aClass8_Sub5_8 != null) {
			super.aClass8_Sub5_8.method3656();
		}
	}

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "(I)I")
	@Override
	protected int method9320(@OriginalArg(0) int arg0) {
		if (this.aClass268_1.anIntArray532 != null) {
			@Pc(15) Class268 local15 = this.aClass268_1.method5985(arg0 + 65535, Static34.aClass304_1);
			if (local15 != null && local15.anInt6726 != -1) {
				return local15.anInt6726;
			}
		}
		if (arg0 != 0) {
			this.anInt10774 = -66;
		}
		return this.aClass268_1.anInt6726;
	}

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "(I)Z")
	private boolean method9330() {
		return this.aClass268_1.aBoolean505;
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)I")
	@Override
	public int method9287() {
		return this.aClass268_1 == null ? 0 : this.aClass268_1.anInt6723;
	}
}
