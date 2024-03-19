import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class190 {

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "J")
	private long aLong194;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Z")
	public boolean aBoolean444;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "[I")
	private int[] anIntArray477;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
	private int anInt6226;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "J")
	private long aLong195;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "[I")
	public int[] anIntArray478;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
	public int anInt6223 = -1;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
	public void method5223(@OriginalArg(1) boolean arg0) {
		this.aBoolean444 = arg0;
		this.method5235();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
	public void method5225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static304.anIntArray486[arg0];
		if (this.anIntArray477[local15] != 0 && Static215.method4215(arg1) != null) {
			this.anIntArray477[local15] = arg1 | Integer.MIN_VALUE;
			this.method5235();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V")
	public void method5226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray478[arg1] = arg0;
		this.method5235();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[IBZI[I)V")
	public void method5229(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (this.anInt6226 != arg3) {
			this.anInt6226 = arg3;
			this.anIntArrayArray43 = null;
		}
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static188.anInt1586; local26++) {
					@Pc(32) Class48 local32 = Static215.method4215(local26);
					if (local32 != null && !local32.aBoolean105 && local32.anInt1578 == (arg2 ? Static275.anIntArray200[local22] : Static354.anIntArray604[local22])) {
						arg1[Static304.anIntArray486[local22]] = Integer.MIN_VALUE | local26;
						break;
					}
				}
			}
		}
		this.aBoolean444 = arg2;
		this.anIntArray478 = arg4;
		this.anInt6223 = arg0;
		this.anIntArray477 = arg1;
		this.method5235();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!nr;IILclient!qr;IIB)Lclient!qc;")
	public Class86 method5230(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class165 arg3, @OriginalArg(5) int arg4) {
		if (this.anInt6223 != -1) {
			return Static123.method2640(this.anInt6223).method2062(arg1, arg2, arg3, arg4, arg0);
		}
		@Pc(26) int local26 = 1024;
		@Pc(34) boolean local34;
		@Pc(51) int local51;
		@Pc(106) int local106;
		@Pc(55) int local55;
		@Pc(110) int local110;
		if (arg3 != null) {
			@Pc(30) boolean local30 = false;
			@Pc(32) boolean local32 = false;
			local34 = false;
			local26 = 1056;
			local51 = arg3.anIntArray407[arg2];
			local55 = local51 >>> 16;
			@Pc(59) Class1_Sub1_Sub14 local59 = Static44.method715(local55);
			@Pc(63) int local63 = local51 & 0xFFFF;
			if (local59 != null) {
				local32 = local59.method3354(local63) | false;
				local30 = local59.method3357(local63) | false;
				local34 = arg3.aBoolean391 | false;
			}
			if ((arg3.aBoolean394 || Static187.aBoolean305) && arg4 != -1 && arg3.anIntArray407.length > arg4) {
				local106 = arg3.anIntArray407[arg4];
				local110 = local106 >>> 16;
				@Pc(114) int local114 = local106 & 0xFFFF;
				@Pc(123) Class1_Sub1_Sub14 local123 = local110 == local55 ? local59 : Static44.method715(local110);
				if (local123 != null) {
					local32 |= local123.method3354(local114);
					local30 |= local123.method3357(local114);
				}
			}
			if (local32) {
				local26 = 1184;
			}
			if (local30) {
				local26 |= 0x100;
			}
			if (local34) {
				local26 |= 0x200;
			}
		}
		@Pc(165) Class215 local165 = Static256.aClass215_79;
		@Pc(174) Class86 local174;
		synchronized (Static256.aClass215_79) {
			local174 = (Class86) Static256.aClass215_79.method6057(this.aLong195);
		}
		if (local174 == null || arg0.method2752(local174.method5531(), local26) != 0) {
			if (local174 != null) {
				local26 = arg0.method2747(local26, local174.method5531());
			}
			local34 = false;
			for (local51 = 0; local51 < 12; local51++) {
				local106 = this.anIntArray477[local51];
				if ((local106 & 0x40000000) == 0) {
					if ((local106 & Integer.MIN_VALUE) != 0 && !Static215.method4215(local106 & 0x3FFFFFFF).method1368()) {
						local34 = true;
					}
				} else if (!Static165.method3446(local106 & 0x3FFFFFFF).method960(this.aBoolean444)) {
					local34 = true;
				}
			}
			if (local34) {
				return null;
			}
			@Pc(252) Class126[] local252 = new Class126[12];
			@Pc(254) int local254 = 0;
			for (@Pc(256) int local256 = 0; local256 < 12; local256++) {
				local55 = this.anIntArray477[local256];
				@Pc(280) Class126 local280;
				if ((local55 & 0x40000000) != 0) {
					local280 = Static165.method3446(local55 & 0x3FFFFFFF).method951(this.aBoolean444);
					if (local280 != null) {
						local252[local254++] = local280;
					}
				} else if ((local55 & Integer.MIN_VALUE) != 0) {
					local280 = Static215.method4215(local55 & 0x3FFFFFFF).method1367();
					if (local280 != null) {
						local252[local254++] = local280;
					}
				}
			}
			@Pc(321) Class126 local321 = new Class126(local252, local254);
			@Pc(325) int local325 = local26 | 0x2000;
			local174 = arg0.method2762(local321, local325, Static70.anInt1961, 64, 768);
			for (local110 = 0; local110 < 5; local110++) {
				if (Static104.aShortArrayArray2[local110].length > this.anIntArray478[local110]) {
					local174.method5538(Static8.aShortArray1[local110], Static104.aShortArrayArray2[local110][this.anIntArray478[local110]]);
				}
				if (Static95.aShortArrayArray1[local110].length > this.anIntArray478[local110]) {
					local174.method5538(Static229.aShortArray90[local110], Static95.aShortArrayArray1[local110][this.anIntArray478[local110]]);
				}
			}
			local174.method5526(local26);
			@Pc(396) Class215 local396 = Static256.aClass215_79;
			synchronized (Static256.aClass215_79) {
				Static256.aClass215_79.method6050(local174, this.aLong195);
			}
		}
		if (arg3 == null) {
			return local174;
		} else {
			local174.method5565((byte) 1, local26, true);
			return arg3.method4751(arg4, arg1, 1024, local174, arg2);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qr;IBIIIIILclient!nr;I)Lclient!qc;")
	public Class86 method5231(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class40 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) int local7 = 1024;
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg0 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local26 = arg0.anIntArray407[arg7];
			local7 = 1056;
			local36 = local26 >>> 16;
			@Pc(40) int local40 = local26 & 0xFFFF;
			@Pc(44) Class1_Sub1_Sub14 local44 = Static44.method715(local36);
			if (local44 != null) {
				local13 = local44.method3354(local40) | false;
				local11 = local44.method3357(local40) | false;
				local15 = arg0.aBoolean391 | false;
			}
			if ((arg0.aBoolean394 || Static187.aBoolean305) && arg1 != -1 && arg1 < arg0.anIntArray407.length) {
				@Pc(88) int local88 = arg0.anIntArray407[arg1];
				@Pc(92) int local92 = local88 >>> 16;
				@Pc(96) int local96 = local88 & 0xFFFF;
				@Pc(105) Class1_Sub1_Sub14 local105;
				if (local36 == local92) {
					local105 = local44;
				} else {
					local105 = Static44.method715(local96 >>> 16);
				}
				if (local105 != null) {
					local13 |= local105.method3354(local96);
					local11 |= local105.method3357(local96);
				}
			}
			if (local13) {
				local7 = 1184;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
		}
		@Pc(155) long local155 = (long) (arg5 << 16) | (long) arg2 << 32 | (long) arg3;
		@Pc(157) Class215 local157 = Static256.aClass215_79;
		@Pc(167) Class86 local167;
		synchronized (Static256.aClass215_79) {
			local167 = (Class86) Static256.aClass215_79.method6057(local155);
		}
		if (local167 == null || arg6.method2752(local167.method5531(), local7) != 0) {
			if (local167 != null) {
				local7 = arg6.method2747(local7, local167.method5531());
			}
			@Pc(194) Class126[] local194 = new Class126[3];
			@Pc(196) int local196 = 0;
			if (!Static215.method4215(arg3).method1368() || !Static215.method4215(arg5).method1368() || !Static215.method4215(arg2).method1368()) {
				return null;
			}
			@Pc(222) Class126 local222 = Static215.method4215(arg3).method1367();
			if (local222 != null) {
				local196++;
				local194[0] = local222;
			}
			local222 = Static215.method4215(arg5).method1367();
			if (local222 != null) {
				local194[local196++] = local222;
			}
			local222 = Static215.method4215(arg2).method1367();
			if (local222 != null) {
				local194[local196++] = local222;
			}
			local26 = local7 | 0x2000;
			local222 = new Class126(local194, local196);
			local167 = arg6.method2762(local222, local26, Static70.anInt1961, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (this.anIntArray478[local36] < Static104.aShortArrayArray2[local36].length) {
					local167.method5538(Static8.aShortArray1[local36], Static104.aShortArrayArray2[local36][this.anIntArray478[local36]]);
				}
				if (Static95.aShortArrayArray1[local36].length > this.anIntArray478[local36]) {
					local167.method5538(Static229.aShortArray90[local36], Static95.aShortArrayArray1[local36][this.anIntArray478[local36]]);
				}
			}
			local167.method5526(local7);
			@Pc(336) Class215 local336 = Static256.aClass215_79;
			synchronized (Static256.aClass215_79) {
				Static256.aClass215_79.method6050(local167, local155);
			}
		}
		if (arg0 == null) {
			return local167;
		} else {
			local167 = local167.method5565((byte) 1, local7, true);
			return arg0.method4751(arg1, arg4, 1024, local167, arg7);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIILclient!nr;Lclient!qr;IBI[Lclient!p;Lclient!qr;IZ)Lclient!qc;")
	public Class86 method5232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class40 arg4, @OriginalArg(5) Class165 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class147[] arg8, @OriginalArg(10) Class165 arg9, @OriginalArg(11) int arg10) {
		if (this.anInt6223 != -1) {
			return Static123.method2640(this.anInt6223).method2063(arg2, arg10, arg8, arg9, arg5, arg6, arg4, arg1, arg0, arg7, arg3);
		}
		@Pc(31) int local31 = arg7;
		@Pc(34) long local34 = this.aLong195;
		@Pc(37) int[] local37 = this.anIntArray477;
		if (arg9 != null && (arg9.anInt5570 >= 0 || arg9.anInt5569 >= 0)) {
			local37 = new int[12];
			for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
				local37[local56] = this.anIntArray477[local56];
			}
			if (arg9.anInt5570 >= 0) {
				if (arg9.anInt5570 == 65535) {
					local37[5] = 0;
					local34 ^= 0xFFFFFFFF00000000L;
				} else {
					local37[5] = arg9.anInt5570 | 0x40000000;
					local34 ^= (long) local37[5] << 32;
				}
			}
			if (arg9.anInt5569 >= 0) {
				if (arg9.anInt5569 == 65535) {
					local37[3] = 0;
					local34 ^= 0xFFFFFFFFL;
				} else {
					local37[3] = arg9.anInt5569 | 0x40000000;
					local34 ^= local37[3];
				}
			}
		}
		@Pc(138) boolean local138 = false;
		@Pc(140) boolean local140 = false;
		@Pc(148) boolean local148 = arg9 != null || arg5 != null;
		@Pc(155) int local155 = arg8 == null ? 0 : arg8.length;
		@Pc(188) int local188;
		@Pc(193) int local193;
		for (@Pc(157) int local157 = 0; local157 < local155; local157++) {
			Static173.aClass1_Sub1_Sub14Array4[local157] = null;
			if (arg8[local157] != null) {
				@Pc(174) Class165 local174 = Static231.method4385(arg8[local157].anInt5076);
				if (local174.anIntArray407 != null) {
					Static175.aClass165Array2[local157] = local174;
					local148 = true;
					local188 = arg8[local157].anInt5074;
					local193 = arg8[local157].anInt5073;
					@Pc(198) int local198 = local174.anIntArray407[local188];
					Static173.aClass1_Sub1_Sub14Array4[local157] = Static44.method715(local198 >>> 16);
					@Pc(210) int local210 = local198 & 0xFFFF;
					Static66.anIntArray121[local157] = local210;
					if (Static173.aClass1_Sub1_Sub14Array4[local157] != null) {
						local140 |= Static173.aClass1_Sub1_Sub14Array4[local157].method3354(local210);
						local138 |= Static173.aClass1_Sub1_Sub14Array4[local157].method3357(local210);
					}
					if ((local174.aBoolean394 || Static187.aBoolean305) && local193 != -1 && local193 < local174.anIntArray407.length) {
						Static31.anIntArray60[local157] = local174.anIntArray410[local188];
						Static127.anIntArray238[local157] = arg8[local157].anInt5078;
						@Pc(290) int local290 = local174.anIntArray407[local193];
						Static110.aClass1_Sub1_Sub14Array3[local157] = Static44.method715(local290 >>> 16);
						@Pc(302) int local302 = local290 & 0xFFFF;
						Static66.anIntArray122[local157] = local302;
						if (Static110.aClass1_Sub1_Sub14Array3[local157] != null) {
							local140 |= Static110.aClass1_Sub1_Sub14Array3[local157].method3354(local302);
							local138 |= Static110.aClass1_Sub1_Sub14Array3[local157].method3357(local302);
						}
					} else {
						Static31.anIntArray60[local157] = 0;
						Static127.anIntArray238[local157] = 0;
						Static110.aClass1_Sub1_Sub14Array3[local157] = null;
						Static66.anIntArray122[local157] = -1;
					}
				}
			}
		}
		@Pc(334) int local334 = -1;
		local188 = -1;
		local193 = 0;
		@Pc(340) Class1_Sub1_Sub14 local340 = null;
		@Pc(348) Class1_Sub1_Sub14 local348 = null;
		@Pc(350) int local350 = -1;
		@Pc(352) int local352 = -1;
		@Pc(354) int local354 = 0;
		@Pc(356) Class1_Sub1_Sub14 local356 = null;
		@Pc(358) Class1_Sub1_Sub14 local358 = null;
		if (local148) {
			@Pc(371) int local371;
			@Pc(428) int local428;
			if (arg9 != null) {
				local334 = arg9.anIntArray407[arg1];
				local371 = local334 >>> 16;
				local340 = Static44.method715(local371);
				local334 &= 0xFFFF;
				if (local340 != null) {
					local140 |= local340.method3354(local334);
					local138 |= local340.method3357(local334);
				}
				if ((arg9.aBoolean394 || Static187.aBoolean305) && arg3 != -1 && arg9.anIntArray407.length > arg3) {
					local188 = arg9.anIntArray407[arg3];
					local193 = arg9.anIntArray410[arg1];
					local428 = local188 >>> 16;
					local188 &= 0xFFFF;
					local348 = local371 == local428 ? local340 : Static44.method715(local428);
					if (local348 != null) {
						local140 |= local348.method3354(local188);
						local138 |= local348.method3357(local188);
					}
				}
			}
			local31 = arg7 | 0x20;
			if (arg5 != null) {
				local350 = arg5.anIntArray407[arg6];
				local371 = local350 >>> 16;
				local356 = Static44.method715(local371);
				local350 &= 0xFFFF;
				if (local356 != null) {
					local140 |= local356.method3354(local350);
					local138 |= local356.method3357(local350);
				}
				if ((arg5.aBoolean394 || Static187.aBoolean305) && arg2 != -1 && arg2 < arg5.anIntArray407.length) {
					local354 = arg5.anIntArray410[arg6];
					local352 = arg5.anIntArray407[arg2];
					local428 = local352 >>> 16;
					local358 = local371 == local428 ? local356 : Static44.method715(local428);
					local352 &= 0xFFFF;
					if (local358 != null) {
						local140 |= local358.method3354(local352);
						local138 |= local358.method3357(local352);
					}
				}
			}
			if (local140) {
				local31 |= 0x80;
			}
			if (local138) {
				local31 |= 0x100;
			}
		}
		@Pc(570) Class215 local570 = Static94.aClass215_39;
		@Pc(580) Class86 local580;
		synchronized (Static94.aClass215_39) {
			local580 = (Class86) Static94.aClass215_39.method6057(local34);
		}
		@Pc(588) Class83 local588 = null;
		if (this.anInt6226 != -1) {
			local588 = Static104.method2159(this.anInt6226);
		}
		@Pc(630) int local630;
		@Pc(636) int local636;
		if (local580 == null || arg4.method2752(local580.method5531(), local31) != 0 || local588 != null && local588.anIntArrayArray14 != null && this.anIntArrayArray43 == null) {
			if (local580 != null) {
				local31 = arg4.method2747(local31, local580.method5531());
			}
			@Pc(628) boolean local628 = false;
			local630 = 0;
			while (true) {
				if (local630 >= 12) {
					if (local628) {
						if (this.aLong194 != -1L) {
							@Pc(1263) Class215 local1263 = Static94.aClass215_39;
							synchronized (Static94.aClass215_39) {
								local580 = (Class86) Static94.aClass215_39.method6057(this.aLong194);
							}
						}
						if (local580 == null || arg4.method2752(local580.method5531(), local31) != 0 || local588 != null && local588.anIntArrayArray14 != null && this.anIntArrayArray43 == null) {
							return null;
						}
					} else {
						@Pc(685) Class126[] local685 = new Class126[12];
						@Pc(693) int local693;
						for (@Pc(687) int local687 = 0; local687 < 12; local687++) {
							local693 = local37[local687];
							@Pc(712) Class126 local712;
							if ((local693 & 0x40000000) != 0) {
								local712 = Static165.method3446(local693 & 0x3FFFFFFF).method947(this.aBoolean444);
								if (local712 != null) {
									local685[local687] = local712;
								}
							} else if ((Integer.MIN_VALUE & local693) != 0) {
								local712 = Static215.method4215(local693 & 0x3FFFFFFF).method1369();
								if (local712 != null) {
									local685[local687] = local712;
								}
							}
						}
						@Pc(769) int local769;
						if (local588 != null && local588.anIntArrayArray14 != null) {
							for (local693 = 0; local693 < local588.anIntArrayArray14.length; local693++) {
								if (local588.anIntArrayArray14[local693] != null && local685[local693] != null) {
									local769 = local588.anIntArrayArray14[local693][0];
									@Pc(776) int local776 = local588.anIntArrayArray14[local693][1];
									@Pc(783) int local783 = local588.anIntArrayArray14[local693][2];
									@Pc(792) int local792 = local588.anIntArrayArray14[local693][3] << 3;
									@Pc(801) int local801 = local588.anIntArrayArray14[local693][4] << 3;
									@Pc(810) int local810 = local588.anIntArrayArray14[local693][5] << 3;
									if (this.anIntArrayArray43 == null) {
										this.anIntArrayArray43 = new int[local588.anIntArrayArray14.length][];
									}
									if (this.anIntArrayArray43[local693] == null) {
										@Pc(832) int[] local832 = this.anIntArrayArray43[local693] = new int[15];
										if (local792 == 0 && local801 == 0 && local810 == 0) {
											local832[14] = -local783;
											local832[0] = local832[4] = local832[8] = 32768;
											local832[13] = -local776;
											local832[12] = -local769;
										} else {
											@Pc(845) int local845 = Class39.anIntArray87[local792];
											@Pc(849) int local849 = Class39.anIntArray88[local792];
											@Pc(853) int local853 = Class39.anIntArray87[local801];
											@Pc(857) int local857 = Class39.anIntArray88[local801];
											@Pc(861) int local861 = Class39.anIntArray87[local810];
											@Pc(865) int local865 = Class39.anIntArray88[local810];
											@Pc(873) int local873 = local861 * local849 + 16384 >> 15;
											@Pc(881) int local881 = local865 * local849 + 16384 >> 15;
											local832[8] = local853 * local845 + 16384 >> 15;
											local832[0] = local861 * local853 + local881 * local857 + 16384 >> 15;
											local832[1] = -local865 * local853 + local857 * local873 + 16384 >> 15;
											local832[7] = -local857 * -local865 + local853 * local873 + 16384 >> 15;
											local832[6] = -local857 * local861 + local881 * local853 + 16384 >> 15;
											local832[5] = -local849;
											local832[4] = local861 * local845 + 16384 >> 15;
											local832[3] = local865 * local845 + 16384 >> 15;
											local832[2] = local845 * local857 + 16384 >> 15;
											local832[12] = -local783 * local832[6] + -local776 * local832[3] + local832[0] * -local769 + 16384 >> 15;
											local832[13] = local832[7] * -local783 + -local769 * local832[1] + local832[4] * -local776 + 16384 >> 15;
											local832[14] = local832[8] * -local783 + -local769 * local832[2] + -local776 * local832[5] + 16384 >> 15;
										}
										local832[11] = local783;
										local832[10] = local776;
										local832[9] = local769;
									}
									if (local792 != 0 || local801 != 0 || local810 != 0) {
										local685[local693].method3645(local810, local801, local792);
									}
									if (local769 != 0 || local776 != 0 || local783 != 0) {
										local685[local693].method3644(local769, local783, local776);
									}
								}
							}
						}
						@Pc(1156) int local1156 = local31 | 0x2000;
						@Pc(1163) Class126 local1163 = new Class126(local685, local685.length);
						local580 = arg4.method2762(local1163, local1156, Static70.anInt1961, 64, 850);
						for (local769 = 0; local769 < 5; local769++) {
							if (Static104.aShortArrayArray2[local769].length > this.anIntArray478[local769]) {
								local580.method5538(Static8.aShortArray1[local769], Static104.aShortArrayArray2[local769][this.anIntArray478[local769]]);
							}
							if (Static95.aShortArrayArray1[local769].length > this.anIntArray478[local769]) {
								local580.method5538(Static229.aShortArray90[local769], Static95.aShortArrayArray1[local769][this.anIntArray478[local769]]);
							}
						}
						local580.method5526(local31);
						@Pc(1236) Class215 local1236 = Static94.aClass215_39;
						synchronized (Static94.aClass215_39) {
							Static94.aClass215_39.method6050(local580, local34);
						}
						this.aLong194 = local34;
					}
					break;
				}
				local636 = local37[local630];
				if ((local636 & 0x40000000) == 0) {
					if ((local636 & Integer.MIN_VALUE) != 0 && !Static215.method4215(local636 & 0x3FFFFFFF).method1366()) {
						local628 = true;
					}
				} else if (!Static165.method3446(local636 & 0x3FFFFFFF).method945(this.aBoolean444)) {
					local628 = true;
				}
				local630++;
			}
		}
		@Pc(1305) Class86 local1305 = local580.method5565((byte) 1, local31, true);
		if (!local148) {
			return local1305;
		}
		@Pc(1311) int local1311 = 0;
		local630 = 1;
		while (local1311 < local155) {
			if (Static173.aClass1_Sub1_Sub14Array4[local1311] != null) {
				local1305.method5528(Static66.anIntArray122[local1311], Static127.anIntArray238[local1311] - 1, Static66.anIntArray121[local1311], local630, this.anIntArrayArray43 == null ? null : this.anIntArrayArray43[local1311], Static31.anIntArray60[local1311], Static173.aClass1_Sub1_Sub14Array4[local1311], Static110.aClass1_Sub1_Sub14Array3[local1311], false);
			}
			local630 <<= 0x1;
			local1311++;
		}
		if (local340 != null && local356 != null) {
			local1305.method5546(local340, local352, local348, arg0 - 1, local334, local358, local350, local354, local193, arg10 - 1, local356, arg9.aBooleanArray21, false, local188);
		} else if (local340 != null) {
			local1305.method5548(local188, 0, local193, arg10 - 1, local348, false, local340, local334);
		} else if (local356 != null) {
			local1305.method5548(local352, 0, local354, arg0 - 1, local358, false, local356, local350);
		}
		for (local636 = 0; local636 < local155; local636++) {
			Static173.aClass1_Sub1_Sub14Array4[local636] = null;
			Static110.aClass1_Sub1_Sub14Array3[local636] = null;
			Static175.aClass165Array2[local636] = null;
		}
		return local1305;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
	private void method5235() {
		@Pc(7) long[] local7 = Class7_Sub5.aLongArray5;
		this.aLong195 = -1L;
		this.aLong195 = local7[(int) (((long) (this.anInt6226 >> 8) ^ this.aLong195) & 0xFFL)] ^ this.aLong195 >>> 8;
		this.aLong195 = this.aLong195 >>> 8 ^ local7[(int) ((this.aLong195 ^ (long) this.anInt6226) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong195 = local7[(int) ((this.aLong195 ^ (long) (this.anIntArray477[local50] >> 24)) & 0xFFL)] ^ this.aLong195 >>> 8;
			this.aLong195 = this.aLong195 >>> 8 ^ local7[(int) (((long) (this.anIntArray477[local50] >> 16) ^ this.aLong195) & 0xFFL)];
			this.aLong195 = local7[(int) ((this.aLong195 ^ (long) (this.anIntArray477[local50] >> 8)) & 0xFFL)] ^ this.aLong195 >>> 8;
			this.aLong195 = this.aLong195 >>> 8 ^ local7[(int) ((this.aLong195 ^ (long) this.anIntArray477[local50]) & 0xFFL)];
		}
		for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
			this.aLong195 = this.aLong195 >>> 8 ^ local7[(int) ((this.aLong195 ^ (long) this.anIntArray478[local152]) & 0xFFL)];
		}
		this.aLong195 = this.aLong195 >>> 8 ^ local7[(int) (((long) (this.aBoolean444 ? 1 : 0) ^ this.aLong195) & 0xFFL)];
	}
}
