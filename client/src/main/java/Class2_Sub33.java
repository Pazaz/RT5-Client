import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!kia", name = "n", descriptor = "I")
	private int anInt5452;

	@OriginalMember(owner = "client!kia", name = "F", descriptor = "Lclient!pn;")
	private final Class178_Sub2 aClass178_Sub2_2;

	@OriginalMember(owner = "client!kia", name = "o", descriptor = "Lclient!lca;")
	private final Class2_Sub7 aClass2_Sub7_2;

	@OriginalMember(owner = "client!kia", name = "D", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_23;

	@OriginalMember(owner = "client!kia", name = "s", descriptor = "I")
	private final int anInt5451;

	@OriginalMember(owner = "client!kia", name = "C", descriptor = "I")
	private final int anInt5446;

	@OriginalMember(owner = "client!kia", name = "q", descriptor = "I")
	private final int anInt5449;

	@OriginalMember(owner = "client!kia", name = "r", descriptor = "I")
	private final int anInt5454;

	@OriginalMember(owner = "client!kia", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!kia", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!kia", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!kia", name = "w", descriptor = "I")
	private int anInt5447;

	@OriginalMember(owner = "client!kia", name = "v", descriptor = "Lclient!jc;")
	private final Interface12 anInterface12_3;

	@OriginalMember(owner = "client!kia", name = "z", descriptor = "Lclient!ed;")
	private final Class94 aClass94_4;

	@OriginalMember(owner = "client!kia", name = "E", descriptor = "Lclient!ed;")
	private final Class94 aClass94_5;

	@OriginalMember(owner = "client!kia", name = "k", descriptor = "Lclient!ar;")
	private final Interface1 anInterface1_2;

	@OriginalMember(owner = "client!kia", name = "u", descriptor = "Lclient!ge;")
	private Packet aPacket_8;

	@OriginalMember(owner = "client!kia", name = "l", descriptor = "Lclient!jfa;")
	private PacketGl aClass2_Sub21_Sub1_2;

	@OriginalMember(owner = "client!kia", name = "B", descriptor = "Lclient!av;")
	private Class28 aClass28_26;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!qha;Lclient!pn;Lclient!lca;[I)V")
	public Class2_Sub33(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Class178_Sub2 arg1, @OriginalArg(2) Class2_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass178_Sub2_2 = arg1;
		this.aClass2_Sub7_2 = arg2;
		this.aClass19_Sub3_23 = arg0;
		@Pc(23) int local23 = this.aClass2_Sub7_2.method8432() - (arg1.anInt8888 >> 1);
		this.anInt5451 = this.aClass2_Sub7_2.method8426() - local23 >> arg1.anInt8895;
		this.anInt5446 = local23 + this.aClass2_Sub7_2.method8426() >> arg1.anInt8895;
		this.anInt5449 = this.aClass2_Sub7_2.method8429() - local23 >> arg1.anInt8895;
		this.anInt5454 = this.aClass2_Sub7_2.method8429() + local23 >> arg1.anInt8895;
		@Pc(76) int local76 = this.anInt5446 + 1 - this.anInt5451;
		@Pc(84) int local84 = this.anInt5454 + 1 - this.anInt5449;
		this.aFloatArrayArray10 = new float[local76 + 1][local84 + 1];
		this.aFloatArrayArray11 = new float[local76 + 1][local84 + 1];
		this.aFloatArrayArray9 = new float[local76 + 1][local84 + 1];
		@Pc(121) int local121;
		@Pc(141) int local141;
		@Pc(148) int local148;
		@Pc(178) int local178;
		@Pc(195) int local195;
		for (@Pc(113) int local113 = 0; local113 <= local84; local113++) {
			local121 = local113 + this.anInt5449;
			if (local121 > 0 && local121 < this.aClass178_Sub2_2.anInt8892 - 1) {
				for (local141 = 0; local141 <= local76; local141++) {
					local148 = this.anInt5451 + local141;
					if (local148 > 0 && this.aClass178_Sub2_2.anInt8894 - 1 > local148) {
						local178 = arg1.method7869(local121, local148 + 1) - arg1.method7869(local121, local148 - 1);
						local195 = arg1.method7869(local121 + 1, local148) - arg1.method7869(local121 - 1, local148);
						@Pc(211) float local211 = (float) (1.0D / Math.sqrt((double) (local178 * local178 + local195 * local195 + 65536)));
						this.aFloatArrayArray11[local141][local113] = (float) local178 * local211;
						this.aFloatArrayArray9[local141][local113] = local211 * -256.0F;
						this.aFloatArrayArray10[local141][local113] = local211 * (float) local195;
					}
				}
			}
		}
		local121 = 0;
		@Pc(345) int local345;
		for (local141 = this.anInt5449; local141 <= this.anInt5454; local141++) {
			if (local141 >= 0 && local141 < arg1.anInt8892) {
				for (local148 = this.anInt5451; local148 <= this.anInt5446; local148++) {
					if (local148 >= 0 && local148 < arg1.anInt8894) {
						local178 = arg3[local121];
						@Pc(320) int[] local320 = arg1.anIntArrayArrayArray15[local148][local141];
						if (local320 != null && local178 != 0) {
							if (local178 == 1) {
								local345 = 0;
								while (local345 < local320.length) {
									if (local320[local345++] != -1 && local320[local345++] != -1 && local320[local345++] != -1) {
										this.anInt5447 += 3;
									}
								}
							} else {
								this.anInt5447 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt5446 - this.anInt5451;
			}
		}
		if (this.anInt5447 <= 0) {
			this.anInterface12_3 = null;
			this.aClass94_4 = null;
			this.aClass94_5 = null;
			this.anInterface1_2 = null;
		} else {
			this.aPacket_8 = new Packet(this.anInt5447 * 2);
			this.aClass2_Sub21_Sub1_2 = new PacketGl(this.anInt5447 * 16);
			this.aClass28_26 = new Class28(Static440.method5962(this.anInt5447));
			local148 = 0;
			local121 = 0;
			for (local178 = this.anInt5449; local178 <= this.anInt5454; local178++) {
				if (local178 >= 0 && local178 < arg1.anInt8892) {
					local195 = 0;
					for (local345 = this.anInt5451; local345 <= this.anInt5446; local345++) {
						if (local345 >= 0 && arg1.anInt8894 > local345) {
							@Pc(515) int local515 = arg3[local121];
							@Pc(522) int[] local522 = arg1.anIntArrayArrayArray15[local345][local178];
							if (local522 != null && local515 != 0) {
								if (local515 == 1) {
									@Pc(707) int[] local707 = arg1.anIntArrayArrayArray14[local345][local178];
									@Pc(714) int[] local714 = arg1.anIntArrayArrayArray11[local345][local178];
									@Pc(716) int local716 = 0;
									label104: while (true) {
										while (true) {
											if (local716 >= local522.length) {
												break label104;
											}
											if (local522[local716] == -1 || local522[local716 + 1] == -1 || local522[local716 + 2] == -1) {
												local716 += 3;
											} else {
												this.method4932(local714[local716], local707[local716], local178, local148, local345, local195);
												local716++;
												this.method4932(local714[local716], local707[local716], local178, local148, local345, local195);
												local716++;
												this.method4932(local714[local716], local707[local716], local178, local148, local345, local195);
												local716++;
											}
										}
									}
								} else if (local515 == 3) {
									this.method4932(0, 0, local178, local148, local345, local195);
									this.method4932(0, arg1.anInt8888, local178, local148, local345, local195);
									this.method4932(arg1.anInt8888, 0, local178, local148, local345, local195);
								} else if (local515 == 2) {
									this.method4932(0, arg1.anInt8888, local178, local148, local345, local195);
									this.method4932(arg1.anInt8888, arg1.anInt8888, local178, local148, local345, local195);
									this.method4932(0, 0, local178, local148, local345, local195);
								} else if (local515 == 5) {
									this.method4932(arg1.anInt8888, arg1.anInt8888, local178, local148, local345, local195);
									this.method4932(arg1.anInt8888, 0, local178, local148, local345, local195);
									this.method4932(0, arg1.anInt8888, local178, local148, local345, local195);
								} else if (local515 == 4) {
									this.method4932(arg1.anInt8888, 0, local178, local148, local345, local195);
									this.method4932(0, 0, local178, local148, local345, local195);
									this.method4932(arg1.anInt8888, arg1.anInt8888, local178, local148, local345, local195);
								}
							}
						}
						local121++;
						local195++;
					}
				} else {
					local121 += this.anInt5446 - this.anInt5451;
				}
				local148++;
			}
			this.anInterface1_2 = this.aClass19_Sub3_23.method7010(false, this.aPacket_8.pos, this.aPacket_8.data);
			this.anInterface12_3 = this.aClass19_Sub3_23.method7024(false, this.aClass2_Sub21_Sub1_2.pos, this.aClass2_Sub21_Sub1_2.data, 16);
			this.aClass94_4 = new Class94(this.anInterface12_3, 5126, 3, 0);
			this.aClass94_5 = new Class94(this.anInterface12_3, 5121, 4, 12);
		}
		this.aClass28_26 = null;
		this.aClass2_Sub21_Sub1_2 = null;
		this.aPacket_8 = null;
		this.aFloatArrayArray11 = this.aFloatArrayArray9 = this.aFloatArrayArray10 = null;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIIIII)V")
	private void method4932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg4 << this.aClass178_Sub2_2.anInt8895) + arg1;
		@Pc(23) int local23 = arg0 + (arg2 << this.aClass178_Sub2_2.anInt8895);
		@Pc(30) int local30 = this.aClass178_Sub2_2.method7878(local23, local15);
		if ((arg1 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(64) Class2 local64 = this.aClass28_26.method738(local7);
			if (local64 != null) {
				this.method4934(((Class2_Sub50) local64).aShort119);
				return;
			}
		}
		@Pc(83) short local83 = (short) this.anInt5452++;
		if (local7 != -1L) {
			this.aClass28_26.method735(local7, new Class2_Sub50(local83));
		}
		@Pc(114) float local114;
		@Pc(121) float local121;
		@Pc(128) float local128;
		@Pc(275) float local275;
		@Pc(283) float local283;
		@Pc(290) float local290;
		@Pc(297) float local297;
		@Pc(304) float local304;
		@Pc(313) float local313;
		@Pc(322) float local322;
		@Pc(381) float local381;
		if (arg1 == 0 && arg0 == 0) {
			local114 = this.aFloatArrayArray11[arg5][arg3];
			local121 = this.aFloatArrayArray9[arg5][arg3];
			local128 = this.aFloatArrayArray10[arg5][arg3];
		} else if (this.aClass178_Sub2_2.anInt8888 == arg1 && arg0 == 0) {
			local128 = this.aFloatArrayArray10[arg5 + 1][arg3];
			local121 = this.aFloatArrayArray9[arg5 + 1][arg3];
			local114 = this.aFloatArrayArray11[arg5 + 1][arg3];
		} else if (this.aClass178_Sub2_2.anInt8888 == arg1 && arg0 == this.aClass178_Sub2_2.anInt8888) {
			local128 = this.aFloatArrayArray10[arg5 + 1][arg3 + 1];
			local114 = this.aFloatArrayArray11[arg5 + 1][arg3 + 1];
			local121 = this.aFloatArrayArray9[arg5 + 1][arg3 + 1];
		} else if (arg1 == 0 && arg0 == this.aClass178_Sub2_2.anInt8888) {
			local114 = this.aFloatArrayArray11[arg5][arg3 + 1];
			local121 = this.aFloatArrayArray9[arg5][arg3 + 1];
			local128 = this.aFloatArrayArray10[arg5][arg3 + 1];
		} else {
			local275 = (float) arg1 / (float) this.aClass178_Sub2_2.anInt8888;
			local283 = (float) arg0 / (float) this.aClass178_Sub2_2.anInt8888;
			local290 = this.aFloatArrayArray11[arg5][arg3];
			local297 = this.aFloatArrayArray9[arg5][arg3];
			local304 = this.aFloatArrayArray10[arg5][arg3];
			local313 = this.aFloatArrayArray11[arg5 + 1][arg3];
			local322 = this.aFloatArrayArray9[arg5 + 1][arg3];
			@Pc(339) float local339 = local322 + (this.aFloatArrayArray9[arg5 + 1][arg3 + 1] - local322) * local275;
			@Pc(356) float local356 = local313 + (this.aFloatArrayArray11[arg5 + 1][arg3 + 1] - local313) * local275;
			@Pc(372) float local372 = local304 + local275 * (this.aFloatArrayArray10[arg5][arg3 + 1] - local304);
			local381 = this.aFloatArrayArray10[arg5 + 1][arg3];
			@Pc(397) float local397 = local297 + local275 * (this.aFloatArrayArray9[arg5][arg3 + 1] - local297);
			@Pc(412) float local412 = local290 + (this.aFloatArrayArray11[arg5][arg3 + 1] - local290) * local275;
			local121 = local283 * (local339 - local397) + local397;
			@Pc(438) float local438 = local381 + (this.aFloatArrayArray10[arg5 + 1][arg3 + 1] - local381) * local275;
			local114 = local412 + local283 * (local356 - local412);
			local128 = local283 * (local438 - local372) + local372;
		}
		local275 = (float) (this.aClass2_Sub7_2.method8426() - local15);
		local283 = (float) (this.aClass2_Sub7_2.method8425() - local30);
		local290 = (float) (this.aClass2_Sub7_2.method8429() - local23);
		local297 = (float) Math.sqrt((double) (local290 * local290 + local275 * local275 + local283 * local283));
		local304 = 1.0F / local297;
		local283 *= local304;
		local290 *= local304;
		local275 *= local304;
		local313 = local297 / (float) this.aClass2_Sub7_2.method8432();
		local322 = 1.0F - local313 * local313;
		if (local322 < 0.0F) {
			local322 = 0.0F;
		}
		local381 = local128 * local290 + local114 * local275 + local121 * local283;
		if (local381 < 0.0F) {
			local381 = 0.0F;
		}
		@Pc(565) float local565 = local322 * local381 * 2.0F;
		if (local565 > 1.0F) {
			local565 = 1.0F;
		}
		@Pc(576) int local576 = this.aClass2_Sub7_2.method8431();
		@Pc(586) int local586 = (int) (local565 * (float) (local576 >> 16 & 0xFF));
		if (local586 > 255) {
			local586 = 255;
		}
		@Pc(601) int local601 = (int) ((float) (local576 >> 8 & 0xFF) * local565);
		if (local601 > 255) {
			local601 = 255;
		}
		@Pc(614) int local614 = (int) (local565 * (float) (local576 & 0xFF));
		if (this.aClass19_Sub3_23.aBoolean618) {
			this.aClass2_Sub21_Sub1_2.pFloat((float) local15);
			this.aClass2_Sub21_Sub1_2.pFloat((float) local30);
			this.aClass2_Sub21_Sub1_2.pFloat((float) local23);
		} else {
			this.aClass2_Sub21_Sub1_2.ipFloat((float) local15);
			this.aClass2_Sub21_Sub1_2.ipFloat((float) local30);
			this.aClass2_Sub21_Sub1_2.ipFloat((float) local23);
		}
		if (local614 > 255) {
			local614 = 255;
		}
		this.aClass2_Sub21_Sub1_2.p1(local586);
		this.aClass2_Sub21_Sub1_2.p1(local601);
		this.aClass2_Sub21_Sub1_2.p1(local614);
		this.aClass2_Sub21_Sub1_2.p1(255);
		this.method4934(local83);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(I[[ZBII)V")
	public void method4933(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface1_2 == null || (arg2 + arg0 < this.anInt5451 || (this.anInt5446 < arg0 - arg2 || (this.anInt5449 > arg2 + arg3 || arg3 - arg2 > this.anInt5454)))) {
			return;
		}
		for (@Pc(66) int local66 = this.anInt5449; local66 <= this.anInt5454; local66++) {
			for (@Pc(71) int local71 = this.anInt5451; local71 <= this.anInt5446; local71++) {
				@Pc(77) int local77 = local71 - arg0;
				@Pc(81) int local81 = local66 - arg3;
				if (local77 > -arg2 && arg2 > local77 && -arg2 < local81 && local81 < arg2 && arg1[local77 + arg2][local81 + arg2]) {
					this.aClass19_Sub3_23.method6985((int) (this.aClass2_Sub7_2.method8428() * 255.0F) << 24);
					this.aClass19_Sub3_23.method7039(this.aClass94_5, (Class94) null, this.aClass94_4, (Class94) null);
					this.aClass19_Sub3_23.method7034(0, this.anInterface1_2, this.anInt5447);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(BS)V")
	private void method4934(@OriginalArg(1) short arg0) {
		if (this.aClass19_Sub3_23.aBoolean618) {
			this.aPacket_8.p2(arg0);
		} else {
			this.aPacket_8.p2_alt1(arg0);
		}
	}
}
