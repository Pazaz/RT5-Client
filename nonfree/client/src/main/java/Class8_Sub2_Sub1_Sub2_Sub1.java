import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class8_Sub2_Sub1_Sub2_Sub1 extends Class8_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!ca", name = "Sc", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!ca", name = "Mc", descriptor = "Lclient!ju;")
	public Class201 aClass201_1;

	@OriginalMember(owner = "client!ca", name = "xd", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!ca", name = "bd", descriptor = "I")
	public int anInt1441;

	@OriginalMember(owner = "client!ca", name = "Ec", descriptor = "I")
	private int anInt1443;

	@OriginalMember(owner = "client!ca", name = "yd", descriptor = "I")
	public int anInt1448;

	@OriginalMember(owner = "client!ca", name = "qd", descriptor = "I")
	public int anInt1430 = -1;

	@OriginalMember(owner = "client!ca", name = "Dd", descriptor = "B")
	private byte aByte32 = 0;

	@OriginalMember(owner = "client!ca", name = "wd", descriptor = "Z")
	public boolean aBoolean124 = false;

	@OriginalMember(owner = "client!ca", name = "gd", descriptor = "B")
	private byte aByte33 = 0;

	@OriginalMember(owner = "client!ca", name = "rd", descriptor = "I")
	public int anInt1433 = 0;

	@OriginalMember(owner = "client!ca", name = "Dc", descriptor = "Z")
	public boolean aBoolean125 = false;

	@OriginalMember(owner = "client!ca", name = "Gc", descriptor = "I")
	public int anInt1431 = -1;

	@OriginalMember(owner = "client!ca", name = "Jc", descriptor = "Z")
	public boolean aBoolean126 = false;

	@OriginalMember(owner = "client!ca", name = "cd", descriptor = "I")
	public int anInt1437 = 0;

	@OriginalMember(owner = "client!ca", name = "Ad", descriptor = "I")
	public int anInt1436 = 0;

	@OriginalMember(owner = "client!ca", name = "Gd", descriptor = "I")
	public int anInt1452 = 0;

	@OriginalMember(owner = "client!ca", name = "Lc", descriptor = "Z")
	public boolean aBoolean127 = false;

	@OriginalMember(owner = "client!ca", name = "sd", descriptor = "I")
	public int anInt1455 = -1;

	@OriginalMember(owner = "client!ca", name = "id", descriptor = "Z")
	public boolean aBoolean129 = false;

	@OriginalMember(owner = "client!ca", name = "Fd", descriptor = "I")
	public int anInt1444 = 0;

	@OriginalMember(owner = "client!ca", name = "zd", descriptor = "Z")
	public boolean aBoolean128 = false;

	@OriginalMember(owner = "client!ca", name = "pd", descriptor = "B")
	private byte aByte31 = 0;

	@OriginalMember(owner = "client!ca", name = "Bd", descriptor = "I")
	public int anInt1459 = -1;

	@OriginalMember(owner = "client!ca", name = "Oc", descriptor = "I")
	public int anInt1460 = 255;

	@OriginalMember(owner = "client!ca", name = "hd", descriptor = "I")
	public int anInt1445 = -1;

	@OriginalMember(owner = "client!ca", name = "ld", descriptor = "I")
	public int anInt1469 = -1;

	@OriginalMember(owner = "client!ca", name = "Tc", descriptor = "I")
	public int anInt1467 = -1;

	@OriginalMember(owner = "client!ca", name = "ed", descriptor = "I")
	public int anInt1471 = -1;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I)V")
	public Class8_Sub2_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub1_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9289(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass201_1 == null || !super.aBoolean820 && !this.method1421(0, arg0)) {
			return;
		}
		@Pc(24) Class73 local24 = arg0.method7985();
		local24.method7131(super.aClass126_7.method2673(arg1 ^ 0xFFFFC004));
		local24.method7134(super.anInt10690, arg1 + super.anInt10691, super.anInt10694);
		this.method9319(arg0, super.aBoolean820, super.aClass114Array3, local24);
		for (@Pc(53) int local53 = 0; local53 < super.aClass114Array3.length; local53++) {
			super.aClass114Array3[local53] = null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILjava/lang/String;B)V")
	public void method1413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		this.method9313(Static504.method6733() * Static65.aClass3_1.anInt87, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BIIILclient!ka;Lclient!tt;Lclient!ha;I)V")
	private void method1414(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class114 arg4, @OriginalArg(5) Class73 arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) int arg7) {
		if (arg0 != -74) {
			this.method9289((Class19) null, 41);
		}
		@Pc(20) int local20 = arg7 * arg7 + arg1 * arg1;
		if (local20 < 262144 || local20 > arg2) {
			return;
		}
		@Pc(53) int local53 = (int) (Math.atan2((double) arg1, (double) arg7) * 2607.5945876176133D - (double) super.aClass126_7.method2673(16383)) & 0x3FFF;
		@Pc(65) Class114 local65 = Static691.method9004(super.anInt10746, super.anInt10742, arg3, super.anInt10716, local53, arg6);
		if (local65 != null) {
			arg6.C(false);
			local65.method7473(arg5, (Class8_Sub6) null, 0);
			arg6.C(true);
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class205 method9278(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > -93) {
			this.method1424(true);
		}
		return null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		if (this.aClass201_1 == null || !this.method1421(131072, arg3)) {
			return false;
		}
		@Pc(22) Class73 local22 = arg3.method7985();
		@Pc(27) int local27 = super.aClass126_7.method2673(16383);
		local22.method7131(local27);
		local22.method7134(super.anInt10690, super.anInt10691, super.anInt10694);
		@Pc(40) boolean local40 = arg2;
		for (@Pc(42) int local42 = 0; local42 < super.aClass114Array3.length; local42++) {
			if (super.aClass114Array3[local42] != null && (Static504.aBoolean579 ? super.aClass114Array3[local42].method7483(arg1, arg0, local22, true, 0, Static582.anInt8627) : super.aClass114Array3[local42].method7486(arg1, arg0, local22, true, 0))) {
				local40 = true;
				break;
			}
		}
		for (@Pc(95) int local95 = 0; local95 < super.aClass114Array3.length; local95++) {
			super.aClass114Array3[local95] = null;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method9290(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method1414((byte) 124, 20, -110, 30, (Class114) null, (Class73) null, (Class19) null, 15);
		}
		return false;
	}

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "(B)I")
	@Override
	public int method9304(@OriginalArg(0) byte arg0) {
		if (arg0 > -48) {
			this.method9318(-126);
		}
		return -1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public void method9285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		if (arg4 >= 101) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "(I)I")
	@Override
	protected int method9320(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.anInt1444 = -112;
		}
		return this.anInt1443;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ka;IBLclient!ha;IILclient!tt;II)V")
	private void method1416(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class73 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg4 * arg4 + arg7 * arg7;
		if (local12 < 262144 || local12 > arg1) {
			return;
		}
		@Pc(53) int local53 = (int) (Math.atan2((double) arg4, (double) arg7) * 2607.5945876176133D - (double) super.aClass126_7.method2673(16383)) & 0x3FFF;
		@Pc(65) Class114 local65 = Static691.method9004(super.anInt10746, super.anInt10742, arg3, super.anInt10716, local53, arg2);
		if (local65 != null) {
			arg2.C(false);
			local65.method7484(arg5, (Class8_Sub6) null, arg6, 0);
			arg2.C(true);
		}
	}

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "(B)Z")
	public boolean method1417() {
		return this.aClass201_1 != null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIB)V")
	public void method1418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt10764 < super.anIntArray879.length - 1) {
			super.anInt10764++;
		}
		for (@Pc(24) int local24 = super.anInt10764; local24 > 0; local24--) {
			super.anIntArray879[local24] = super.anIntArray879[local24 - 1];
			super.anIntArray878[local24] = super.anIntArray878[local24 - 1];
			super.aByteArray111[local24] = super.aByteArray111[local24 - 1];
		}
		super.anIntArray879[0] = arg1;
		super.aByteArray111[0] = arg2;
		if (-24527 != -24527) {
			this.method9304((byte) -13);
		}
		super.anIntArray878[0] = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "(B)I")
	@Override
	public int method9302(@OriginalArg(0) byte arg0) {
		if (this.aClass201_1 == null || this.aClass201_1.anInt5012 == -1) {
			if (arg0 < 43) {
				this.anInt1460 = 1;
			}
			return super.method9302((byte) 76);
		} else {
			return Static690.aClass308_2.method7092(this.aClass201_1.anInt5012).anInt6713;
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(III)V")
	public void method1419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt10764 = 0;
		super.anIntArray879[0] = arg0;
		super.anInt10763 = 0;
		super.anInt10762 = 0;
		super.anIntArray878[0] = arg1;
		@Pc(26) int local26 = this.method9302((byte) 84);
		super.anInt10690 = local26 * 256 + super.anIntArray879[0] * 512;
		super.anInt10694 = super.anIntArray878[0] * 512 + local26 * 256;
		if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 == this) {
			Static218.method3187();
		}
		if (super.aClass8_Sub5_8 != null) {
			super.aClass8_Sub5_8.method3656();
		}
	}

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "(I)V")
	@Override
	public void method9280(@OriginalArg(0) int arg0) {
		if (arg0 != 27811) {
			this.aBoolean127 = true;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9276(@OriginalArg(1) Class19 arg0) {
		if (this.aClass201_1 == null || !this.method1421(2048, arg0)) {
			return null;
		}
		@Pc(22) Class73 local22 = arg0.method7985();
		@Pc(27) int local27 = super.aClass126_7.method2673(16383);
		local22.method7131(local27);
		@Pc(53) Class291 local53 = Static334.aClass291ArrayArrayArray1[super.aByte144][super.anInt10690 >> Static52.anInt1066][super.anInt10694 >> Static52.anInt1066];
		if (local53 == null || local53.aClass8_Sub2_Sub2_1 == null) {
			super.anInt10732 = (int) ((float) super.anInt10732 - (float) super.anInt10732 / 10.0F);
		} else {
			@Pc(68) int local68 = super.anInt10732 - local53.aClass8_Sub2_Sub2_1.aShort46;
			super.anInt10732 = (int) ((float) super.anInt10732 - (float) local68 / 10.0F);
		}
		local22.method7134(super.anInt10690, -super.anInt10732 + super.anInt10691 - 20, super.anInt10694);
		super.aBoolean819 = false;
		@Pc(114) Class8_Sub7 local114 = null;
		if (Static400.aClass2_Sub34_28.aClass57_Sub7_1.method2905() == 1) {
			@Pc(126) Class289 local126 = this.method9317();
			if (local126.aBoolean545 && (this.aClass201_1.anInt5012 == -1 || Static690.aClass308_2.method7092(this.aClass201_1.anInt5012).aBoolean506)) {
				@Pc(166) Class152 local166 = super.aClass152_11.method9109() && super.aClass152_11.method9106() ? super.aClass152_11 : null;
				@Pc(186) Class152 local186 = super.aClass152_10.method9109() && (!super.aBoolean817 || local166 == null) ? super.aClass152_10 : null;
				@Pc(212) Class114 local212 = Static618.method8320(240, super.aClass114Array3[0], super.anInt10742, 0, super.anInt10716, 1, arg0, 160, local186 == null ? local166 : local186, super.anInt10746, local27, 0);
				if (local212 != null) {
					local114 = Static642.method8441(true, super.aClass114Array3.length + 1);
					super.aBoolean819 = true;
					arg0.C(false);
					if (Static504.aBoolean579) {
						local212.method7484(local22, local114.aClass8_Sub6Array1[super.aClass114Array3.length], Static582.anInt8627, 0);
					} else {
						local212.method7473(local22, local114.aClass8_Sub6Array1[super.aClass114Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(269) int local269;
		if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 == this) {
			for (local269 = Static527.aClass254Array1.length - 1; local269 >= 0; local269--) {
				@Pc(275) Class254 local275 = Static527.aClass254Array1[local269];
				if (local275 != null && local275.anInt6371 != -1) {
					@Pc(310) int local310;
					if (local275.anInt6363 == 1) {
						@Pc(298) Class2_Sub45 local298 = (Class2_Sub45) Static18.aClass28_2.method738((long) local275.anInt6366);
						if (local298 != null) {
							@Pc(303) Class8_Sub2_Sub1_Sub2_Sub2 local303 = local298.aClass8_Sub2_Sub1_Sub2_Sub2_2;
							local310 = local303.anInt10690 - Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690;
							@Pc(316) int local316 = local303.anInt10694 - Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694;
							if (Static504.aBoolean579) {
								this.method1416(super.aClass114Array3[0], 92160000, arg0, local275.anInt6371, local310, local22, Static582.anInt8627, local316);
							} else {
								this.method1414((byte) -74, local310, 92160000, local275.anInt6371, super.aClass114Array3[0], local22, arg0, local316);
							}
						}
					}
					@Pc(371) int local371;
					if (local275.anInt6363 == 2) {
						@Pc(364) int local364 = local275.anInt6369 - Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690;
						local371 = local275.anInt6362 - Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694;
						local310 = local275.anInt6364 << 9;
						local310 *= local310;
						if (Static504.aBoolean579) {
							this.method1416(super.aClass114Array3[0], local310, arg0, local275.anInt6371, local364, local22, Static582.anInt8627, local371);
						} else {
							this.method1414((byte) -74, local364, local310, local275.anInt6371, super.aClass114Array3[0], local22, arg0, local371);
						}
					}
					if (local275.anInt6363 == 10 && local275.anInt6366 >= 0 && local275.anInt6366 < Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3.length) {
						@Pc(438) Class8_Sub2_Sub1_Sub2_Sub1 local438 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local275.anInt6366];
						if (local438 != null) {
							local371 = local438.anInt10690 - Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690;
							local310 = local438.anInt10694 - Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694;
							if (Static504.aBoolean579) {
								this.method1416(super.aClass114Array3[0], 92160000, arg0, local275.anInt6371, local371, local22, Static582.anInt8627, local310);
							} else {
								this.method1414((byte) -74, local371, 92160000, local275.anInt6371, super.aClass114Array3[0], local22, arg0, local310);
							}
						}
					}
				}
			}
			local22.method7131(local27);
			local22.method7134(super.anInt10690, super.anInt10691, super.anInt10694);
		}
		local22.method7131(local27);
		local22.method7134(super.anInt10690, -super.anInt10732 + super.anInt10691 - 5, super.anInt10694);
		if (local114 == null) {
			local114 = Static642.method8441(true, super.aClass114Array3.length);
		}
		this.method9319(arg0, false, super.aClass114Array3, local22);
		if (Static504.aBoolean579) {
			for (local269 = 0; local269 < super.aClass114Array3.length; local269++) {
				if (super.aClass114Array3[local269] != null) {
					super.aClass114Array3[local269].method7484(local22, local114.aClass8_Sub6Array1[local269], Static582.anInt8627, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local269 = 0; local269 < super.aClass114Array3.length; local269++) {
				if (super.aClass114Array3[local269] != null) {
					super.aClass114Array3[local269].method7473(local22, local114.aClass8_Sub6Array1[local269], Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass8_Sub5_8 != null) {
			@Pc(635) Class230 local635 = super.aClass8_Sub5_8.method3645();
			if (Static504.aBoolean579) {
				arg0.method7967(local635, Static582.anInt8627);
			} else {
				arg0.method8021(local635);
			}
		}
		for (local269 = 0; local269 < super.aClass114Array3.length; local269++) {
			if (super.aClass114Array3[local269] != null) {
				super.aBoolean819 |= super.aClass114Array3[local269].F();
			}
			super.aClass114Array3[local269] = null;
		}
		super.anInt10704 = Static198.anInt3276;
		return local114;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method1420(@OriginalArg(0) Class2_Sub21 arg0) {
		arg0.anInt8388 = 0;
		@Pc(12) int local12 = arg0.method7396();
		this.aByte32 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean126;
		this.aBoolean126 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method9302((byte) 85);
		this.method9310((local12 >> 3 & 0x7) + 1);
		this.aByte31 = (byte) (local12 >> 6 & 0x3);
		super.anInt10690 += this.method9302((byte) 44) - local44 << 8;
		super.anInt10694 += this.method9302((byte) 111) - local44 << 8;
		this.aByte33 = arg0.method7377();
		this.anInt1430 = arg0.method7377();
		this.anInt1431 = arg0.method7377();
		this.aBoolean124 = arg0.method7377() == 1;
		if (Static446.aClass355_5 == Static2.aClass355_1 && Static608.anInt9290 >= 2) {
			this.aBoolean124 = false;
		}
		this.anInt1433 = 0;
		@Pc(134) int local134 = -1;
		@Pc(139) int[] local139 = new int[Static125.aClass388_1.anIntArray821.length];
		@Pc(144) Class52[] local144 = new Class52[Static125.aClass388_1.anIntArray821.length];
		@Pc(149) Class382[] local149 = new Class382[Static125.aClass388_1.anIntArray821.length];
		@Pc(165) int local165;
		@Pc(184) int local184;
		@Pc(191) int local191;
		@Pc(240) int local240;
		for (@Pc(151) int local151 = 0; local151 < Static125.aClass388_1.anIntArray821.length; local151++) {
			if (Static125.aClass388_1.anIntArray821[local151] != 1) {
				local165 = arg0.method7396();
				if (local165 == 0) {
					local139[local151] = 0;
				} else {
					local184 = arg0.method7396();
					local191 = (local165 << 8) + local184;
					if (local151 == 0 && local191 == 65535) {
						local134 = arg0.method7382();
						this.anInt1433 = arg0.method7396();
						break;
					}
					if (local191 >= 32768) {
						local191 = Static349.anIntArray426[local191 - 32768];
						local139[local151] = local191 | 0x40000000;
						local149[local151] = Static419.aClass112_1.method2486(local191);
						local240 = local149[local151].anInt10121;
						if (local240 != 0) {
							this.anInt1433 = local240;
						}
					} else {
						local139[local151] = local191 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local134 == -1) {
			local165 = arg0.method7382();
			local184 = 0;
			for (local191 = 0; local191 < Static125.aClass388_1.anIntArray821.length; local191++) {
				if (Static125.aClass388_1.anIntArray821[local191] == 0) {
					if ((local165 & 0x1 << local184) != 0) {
						local144[local191] = Static595.method7811(arg0, local149[local191]);
					}
					local184++;
				}
			}
		}
		@Pc(332) int[] local332 = new int[10];
		for (local184 = 0; local184 < 10; local184++) {
			local191 = arg0.method7396();
			if (local184 >= Static339.aShortArrayArrayArray2.length || local191 < 0 || Static339.aShortArrayArrayArray2[local184][0].length <= local191) {
				local191 = 0;
			}
			local332[local184] = local191;
		}
		this.anInt1443 = arg0.method7382();
		this.aString8 = arg0.method7358();
		if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 == this) {
			Static515.aString96 = this.aString8;
		}
		this.aString9 = this.aString8;
		this.anInt1444 = arg0.method7396();
		if (local40) {
			this.anInt1436 = arg0.method7382();
			this.anInt1437 = this.anInt1444;
			if (this.anInt1436 == 65535) {
				this.anInt1436 = -1;
			}
			this.anInt1471 = -1;
		} else {
			this.anInt1436 = 0;
			this.anInt1437 = arg0.method7396();
			this.anInt1471 = arg0.method7396();
			if (this.anInt1471 == 255) {
				this.anInt1471 = -1;
			}
		}
		local191 = this.anInt1452;
		this.anInt1452 = arg0.method7396();
		@Pc(490) int local490;
		if (this.anInt1452 == 0) {
			Static76.method1552(this);
		} else {
			local240 = this.anInt1455;
			@Pc(487) int local487 = this.anInt1459;
			local490 = this.anInt1445;
			@Pc(493) int local493 = this.anInt1469;
			@Pc(496) int local496 = this.anInt1460;
			this.anInt1455 = arg0.method7382();
			this.anInt1459 = arg0.method7382();
			this.anInt1445 = arg0.method7382();
			this.anInt1469 = arg0.method7382();
			this.anInt1460 = arg0.method7396();
			if (this.aBoolean126 != local21 || this.anInt1452 != local191 || local240 != this.anInt1455 || local487 != this.anInt1459 || this.anInt1445 != local490 || this.anInt1469 != local493 || local496 != this.anInt1460) {
				Static247.method3523(this);
			}
		}
		if (this.aClass201_1 == null) {
			this.aClass201_1 = new Class201();
		}
		local240 = this.aClass201_1.anInt5012;
		@Pc(603) int[] local603 = this.aClass201_1.anIntArray380;
		this.aClass201_1.method4545(local332, local139, local144, local134, this.method9320(0), this.aByte32 == 1);
		if (local134 != local240) {
			super.anInt10690 = (super.anIntArray879[0] << 9) + (this.method9302((byte) 83) << 8);
			super.anInt10694 = (super.anIntArray878[0] << 9) + (this.method9302((byte) 45) << 8);
		}
		if (Static312.anInt5000 == super.anInt10740 && local603 != null) {
			for (local490 = 0; local490 < local332.length; local490++) {
				if (local332[local490] != local603[local490]) {
					Static419.aClass112_1.method2484();
					break;
				}
			}
		}
		if (super.aClass8_Sub5_8 != null) {
			super.aClass8_Sub5_8.method3656();
		}
		if (!super.aClass152_10.method9109() || !super.aBoolean817) {
			return;
		}
		@Pc(717) Class289 local717 = this.method9317();
		if (!local717.method6479(super.aClass152_10.method9114())) {
			super.aClass152_10.method9113(true, -1);
			super.aBoolean817 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILclient!ha;)Z")
	private boolean method1421(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(15) Class289 local15 = this.method9317();
		@Pc(33) Class152 local33 = super.aClass152_11.method9109() && !super.aClass152_11.method9106() ? super.aClass152_11 : null;
		@Pc(58) Class152 local58 = !super.aClass152_10.method9109() || this.aBoolean129 || super.aBoolean817 && local33 != null ? null : super.aClass152_10;
		@Pc(61) int local61 = local15.anInt7234;
		@Pc(64) int local64 = local15.anInt7238;
		if (local61 != 0 || local64 != 0 || local15.anInt7224 != 0 || local15.anInt7252 != 0) {
			arg0 |= 0x7;
		}
		@Pc(95) int local95 = super.aClass126_7.method2673(16383);
		@Pc(119) boolean local119 = super.aByte149 != 0 && Static333.anInt5455 >= super.anInt10760 && Static333.anInt5455 < super.anInt10752;
		if (local119) {
			arg0 |= 0x80000;
		}
		@Pc(152) Class114 local152 = super.aClass114Array3[0] = this.aClass201_1.method4546(Static419.aClass112_1, local33, Static574.aClass310_2, Static25.aClass50_1, arg0, super.anIntArray877, Static125.aClass388_1, Static68.aClass215_3, arg1, Static690.aClass308_2, super.aClass152_Sub2_Sub1Array3, local95, local58, Static34.aClass304_1);
		@Pc(155) int local155 = Static303.method4429();
		if (Static369.anInt4265 < 96 && local155 > 50) {
			Static358.method9191();
		}
		if (Static446.aClass355_5 != Static2.aClass355_1 && local155 < 50) {
			@Pc(181) int local181 = 50 - local155;
			while (Static107.anInt2161 < local181) {
				Static163.aByteArrayArray36[Static107.anInt2161] = new byte[102400];
				Static107.anInt2161++;
			}
			while (local181 < Static107.anInt2161) {
				Static107.anInt2161--;
				Static163.aByteArrayArray36[Static107.anInt2161] = null;
			}
		} else if (Static446.aClass355_5 != Static2.aClass355_1) {
			Static107.anInt2161 = 0;
			Static163.aByteArrayArray36 = new byte[50][];
		}
		if (local152 == null) {
			return false;
		}
		super.anInt10748 = local152.fa();
		super.anInt10728 = local152.ma();
		this.method9306(local152);
		if (local61 == 0 && local64 == 0) {
			this.method9314(local95, 0, 0, this.method9302((byte) 59) << 9, this.method9302((byte) 126) << 9, -81);
		} else {
			this.method9314(local95, local15.anInt7236, local15.anInt7258, local61, local64, -104);
			if (super.anInt10746 != 0) {
				local152.FA(super.anInt10746);
			}
			if (super.anInt10742 != 0) {
				local152.VA(super.anInt10742);
			}
			if (super.anInt10716 != 0) {
				local152.H(0, super.anInt10716, 0);
			}
		}
		if (local119) {
			local152.method7488(super.aByte150, super.aByte147, super.aByte148, super.aByte149 & 0xFF);
		}
		if (!this.aBoolean129) {
			this.method9297(local5, local64, arg1, local15, local95, local61);
		}
		return true;
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9311() {
		return Static65.aClass3_1.aBoolean6;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method1422() {
		return this.aString9;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method1424(@OriginalArg(0) boolean arg0) {
		@Pc(5) String local5 = "";
		if (Static685.aStringArray47 != null) {
			local5 = local5 + Static685.aStringArray47[this.aByte31];
		}
		if (arg0) {
			this.method9290(106);
		}
		@Pc(40) int[] local40;
		if (this.aByte32 == 1 && Static150.anIntArray233 != null) {
			local40 = Static150.anIntArray233;
		} else {
			local40 = Static406.anIntArray484;
		}
		if (local40 != null && local40[this.aByte31] != -1) {
			@Pc(62) Class53 local62 = Static619.aClass387_2.method8925(local40[this.aByte31]);
			if (local62.aChar1 == 's') {
				local5 = local5 + local62.method1229(this.aByte33 & 0xFF);
			} else {
				Static240.method3496(new Throwable(), "gdn1");
				local40[this.aByte31] = -1;
			}
		}
		local5 = local5 + this.aString8;
		if (Static377.aStringArray30 != null) {
			local5 = local5 + Static377.aStringArray30[this.aByte31];
		}
		return local5;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)Lclient!dj;")
	@Override
	public Class80 method9318(@OriginalArg(0) int arg0) {
		if (arg0 != -3109) {
			this.aBoolean128 = false;
		}
		if (super.aClass80_3 != null) {
			if (super.aClass80_3.aString20 == null) {
				return null;
			}
			if (Static133.anInt2458 == 0 || Static133.anInt2458 == 3 || Static133.anInt2458 == 1 && Static362.method5241(arg0 + 3109, this.aString9)) {
				return super.aClass80_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIIB)V")
	public void method1425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.aClass152_11.method9109() && super.aClass152_11.method9107().anInt1654 == 1) {
			super.anIntArray869 = null;
			super.aClass152_11.method9113(true, -1);
		}
		for (@Pc(33) int local33 = 0; local33 < super.aClass199Array3.length; local33++) {
			if (super.aClass199Array3[local33].anInt4930 != -1) {
				@Pc(56) Class227 local56 = Static23.aClass128_1.method2694(super.aClass199Array3[local33].anInt4930);
				if (local56.aBoolean448 && local56.anInt5842 != -1 && Static25.aClass50_1.method1162(local56.anInt5842).anInt1654 == 1) {
					super.aClass199Array3[local33].aClass152_7.method9113(true, -1);
					super.aClass199Array3[local33].anInt4930 = -1;
				}
			}
		}
		if (-9380 != -9380) {
			this.method9302((byte) -74);
		}
		this.anInt1467 = -1;
		if (arg1 < 0 || Static720.anInt10859 <= arg1 || arg0 < 0 || Static501.anInt7568 <= arg0) {
			this.method1419(arg1, arg0);
		} else if (super.anIntArray879[0] >= 0 && super.anIntArray879[0] < Static720.anInt10859 && super.anIntArray878[0] >= 0 && Static501.anInt7568 > super.anIntArray878[0]) {
			if (arg2 == 2) {
				Static360.method5232(this, arg1, arg0);
			}
			this.method1418(arg0, arg1, arg2);
		} else {
			this.method1419(arg1, arg0);
		}
	}
}
