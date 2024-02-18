import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class316 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "[[Lclient!up;")
	private final Class8_Sub4_Sub2[][] aClass8_Sub4_Sub2ArrayArray3 = new Class8_Sub4_Sub2[1600][64];

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "[I")
	private final int[] anIntArray634 = new int[64];

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "[[Lclient!up;")
	private final Class8_Sub4_Sub2[][] aClass8_Sub4_Sub2ArrayArray4 = new Class8_Sub4_Sub2[64][768];

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt8200 = 0;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
	private final int[] anIntArray635 = new int[1600];

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "[I")
	private final int[] anIntArray636 = new int[8191];

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!mk;")
	private final Class244 aClass244_16;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!mg;")
	private final Interface16 anInterface16_11;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "Lclient!mg;")
	private final Interface16 anInterface16_12;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Lclient!ri;")
	private final Interface20 anInterface20_5;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!am;)V")
	public Class316(@OriginalArg(0) Class19_Sub1 arg0) {
		this.aClass244_16 = arg0.method8148(new Class237[] { new Class237(new Class157[] { Static231.aClass157_1, Static231.aClass157_3, Static231.aClass157_5 }), new Class237(Static231.aClass157_2) });
		this.anInterface16_11 = arg0.method8156(true);
		this.anInterface16_12 = arg0.method8156(false);
		this.anInterface16_12.method3153(12, 393168);
		this.anInterface20_5 = arg0.method8122(false);
		this.anInterface20_5.method8543(49146);
		@Pc(96) Buffer local96 = this.anInterface20_5.method8547();
		@Pc(112) int local112;
		if (local96 != null) {
			@Pc(103) Stream local103 = arg0.method8100(local96);
			@Pc(107) int local107;
			if (Stream.b()) {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.b(local112);
					local103.b(local112 + 1);
					local103.b(local112 + 2);
					local103.b(local112 + 2);
					local103.b(local112 + 3);
					local103.b(local112);
				}
			} else {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.c(local112);
					local103.c(local112 + 1);
					local103.c(local112 + 2);
					local103.c(local112 + 2);
					local103.c(local112 + 3);
					local103.c(local112);
				}
			}
			local103.c();
			this.anInterface20_5.method8546();
		}
		@Pc(196) Buffer local196 = this.anInterface16_12.method3155();
		if (local196 != null) {
			@Pc(203) Stream local203 = arg0.method8100(local196);
			if (Stream.b()) {
				for (local112 = 0; local112 < 8191; local112++) {
					local203.a(0.0F);
					local203.a(-1.0F);
					local203.a(0.0F);
					local203.a(0.0F);
					local203.a(-1.0F);
					local203.a(0.0F);
					local203.a(0.0F);
					local203.a(-1.0F);
					local203.a(0.0F);
					local203.a(0.0F);
					local203.a(-1.0F);
					local203.a(0.0F);
				}
			} else {
				for (local112 = 0; local112 < 8191; local112++) {
					local203.b(0.0F);
					local203.b(-1.0F);
					local203.b(0.0F);
					local203.b(0.0F);
					local203.b(-1.0F);
					local203.b(0.0F);
					local203.b(0.0F);
					local203.b(-1.0F);
					local203.b(0.0F);
					local203.b(0.0F);
					local203.b(-1.0F);
					local203.b(0.0F);
				}
			}
			local203.c();
			this.anInterface16_12.method3154();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public void method7209() {
		this.anInterface16_11.method8538();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!lk;IILclient!am;)V")
	public void method7210(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19_Sub1 arg2) {
		if (arg2.aClass73_Sub1_16 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method7215(arg2);
		} else {
			this.method7213(arg1, arg2);
		}
		@Pc(25) float local25 = arg2.aClass73_Sub1_16.aFloat45;
		@Pc(29) float local29 = arg2.aClass73_Sub1_16.aFloat36;
		@Pc(33) float local33 = arg2.aClass73_Sub1_16.aFloat47;
		@Pc(37) float local37 = arg2.aClass73_Sub1_16.aFloat43;
		try {
			@Pc(39) int local39 = 0;
			@Pc(41) int local41 = Integer.MAX_VALUE;
			@Pc(43) int local43 = 0;
			@Pc(47) Class8_Sub4 local47 = arg0.aClass113_1.aClass8_Sub4_1;
			@Pc(50) Class8_Sub4 local50;
			@Pc(81) int local81;
			for (local50 = local47.aClass8_Sub4_10; local50 != local47; local50 = local50.aClass8_Sub4_10) {
				@Pc(54) Class8_Sub4_Sub2 local54 = (Class8_Sub4_Sub2) local50;
				local81 = (int) (local29 * (float) (local54.anInt7534 >> 12) + local25 * (float) (local54.anInt7537 >> 12) + local33 * (float) (local54.anInt7536 >> 12) + local37);
				if (local81 < local41) {
					local41 = local81;
				}
				if (local43 < local81) {
					local43 = local81;
				}
				this.anIntArray636[local39++] = local81;
			}
			@Pc(116) int local116 = local43 - local41;
			if (local116 + 2 > 1600) {
				local81 = Static434.method5853(local116) + 1 - Static328.anInt5425;
				local116 = (local116 >> local81) + 2;
			} else {
				local81 = 0;
				local116 += 2;
			}
			local39 = 0;
			local50 = local47.aClass8_Sub4_10;
			@Pc(147) int local147 = -2;
			@Pc(149) boolean local149 = true;
			@Pc(151) boolean local151 = true;
			while (local50 != local47) {
				this.anInt8200 = 0;
				for (@Pc(157) int local157 = 0; local157 < local116; local157++) {
					this.anIntArray635[local157] = 0;
				}
				for (@Pc(169) int local169 = 0; local169 < 64; local169++) {
					this.anIntArray634[local169] = 0;
				}
				while (local47 != local50) {
					@Pc(184) Class8_Sub4_Sub2 local184 = (Class8_Sub4_Sub2) local50;
					if (local151) {
						local149 = local184.aBoolean574;
						local151 = false;
						local147 = local184.anInt7540;
					}
					if (local39 > 0 && (local147 != local184.anInt7540 || local184.aBoolean574 != local149)) {
						local151 = true;
						break;
					}
					@Pc(227) int local227 = this.anIntArray636[local39++] - local41 >> local81;
					if (local227 < 1600) {
						if (this.anIntArray635[local227] >= 64) {
							label102: {
								if (this.anIntArray635[local227] == 64) {
									if (this.anInt8200 == 64) {
										break label102;
									}
									this.anIntArray635[local227] += this.anInt8200++ + 1;
								}
								this.aClass8_Sub4_Sub2ArrayArray4[this.anIntArray635[local227] - 1 - 64][this.anIntArray634[this.anIntArray635[local227] - 64 - 1]++] = local184;
							}
						} else {
							this.aClass8_Sub4_Sub2ArrayArray3[local227][this.anIntArray635[local227]++] = local184;
						}
					}
					local50 = local50.aClass8_Sub4_10;
				}
				arg2.method8108(false, local147 < 0 ? -1 : local147, false);
				if (local149 && Static260.aFloat75 != arg2.aFloat186) {
					arg2.xa(Static260.aFloat75);
				} else if (arg2.aFloat186 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method7216(local116, arg2);
			}
		} catch (@Pc(370) Exception local370) {
		}
		this.method7211(arg2);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!am;)V")
	private void method7211(@OriginalArg(1) Class19_Sub1 arg0) {
		arg0.method8083(true);
		arg0.method8117(true);
		if (Static260.aFloat75 != arg0.aFloat186) {
			arg0.xa(Static260.aFloat75);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!am;I)V")
	public void method7212(@OriginalArg(0) Class19_Sub1 arg0) {
		this.anInterface16_11.method3153(24, 786336);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBLclient!am;)V")
	private void method7213(@OriginalArg(0) int arg0, @OriginalArg(2) Class19_Sub1 arg1) {
		Static260.aFloat75 = arg1.aFloat186;
		arg1.method8046((float) arg0);
		arg1.method8111();
		arg1.method8117(false);
		arg1.method8083(false);
		arg1.method8096();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLclient!am;)V")
	private void method7215(@OriginalArg(1) Class19_Sub1 arg0) {
		Static260.aFloat75 = arg0.aFloat186;
		arg0.method8044();
		arg0.method8117(false);
		arg0.method8083(false);
		arg0.method8096();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZLclient!am;)V")
	private void method7216(@OriginalArg(0) int arg0, @OriginalArg(2) Class19_Sub1 arg1) {
		@Pc(5) int local5 = 0;
		@Pc(9) Class73_Sub1 local9 = arg1.method8154();
		@Pc(12) float local12 = local9.aFloat39;
		@Pc(15) float local15 = local9.aFloat40;
		@Pc(23) float local23 = local9.aFloat38;
		@Pc(26) float local26 = local9.aFloat44;
		@Pc(29) float local29 = local9.aFloat42;
		@Pc(32) float local32 = local9.aFloat41;
		@Pc(36) float local36 = local26 + local12;
		@Pc(40) float local40 = local29 + local15;
		@Pc(44) float local44 = local32 + local23;
		@Pc(49) float local49 = local12 - local26;
		@Pc(53) float local53 = local15 - local29;
		@Pc(57) float local57 = local23 - local32;
		@Pc(62) float local62 = local26 - local12;
		@Pc(67) float local67 = local29 - local15;
		@Pc(71) float local71 = local32 - local23;
		@Pc(77) Buffer local77 = this.anInterface16_11.method3155();
		if (local77 == null) {
			return;
		}
		@Pc(91) Stream local91 = arg1.method8100(local77);
		@Pc(97) int local97;
		@Pc(114) int local114;
		@Pc(123) int local123;
		@Pc(131) Class8_Sub4_Sub2 local131;
		@Pc(134) int local134;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(147) byte local147;
		@Pc(152) byte local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(170) float local170;
		@Pc(175) int local175;
		@Pc(449) float local449;
		@Pc(454) int local454;
		@Pc(395) int local395;
		@Pc(410) Class8_Sub4_Sub2 local410;
		@Pc(413) int local413;
		@Pc(426) byte local426;
		@Pc(431) byte local431;
		@Pc(443) float local443;
		if (Stream.b()) {
			for (local97 = arg0 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray635[local97] > 64 ? 64 : this.anIntArray635[local97];
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local131 = this.aClass8_Sub4_Sub2ArrayArray3[local97][local123];
						local134 = local131.anInt7539;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = (float) (local131.anInt7537 >> 12);
						local164 = (float) (local131.anInt7534 >> 12);
						local170 = (float) (local131.anInt7536 >> 12);
						local175 = local131.anInt7535 >> 12;
						local91.a((float) -local175 * local36 + local158);
						local91.a((float) -local175 * local40 + local164);
						local91.a(local170 + (float) -local175 * local44);
						if (arg1.anInt9178 == 0) {
							local91.a(local139, local144, local147, local152);
						} else {
							local91.b(local139, local144, local147, local152);
						}
						local91.a(0.0F);
						local91.a(0.0F);
						local91.a(local158 + local49 * (float) local175);
						local91.a(local164 + local53 * (float) local175);
						local91.a(local170 + local57 * (float) local175);
						if (arg1.anInt9178 == 0) {
							local91.a(local139, local144, local147, local152);
						} else {
							local91.b(local139, local144, local147, local152);
						}
						local91.a(1.0F);
						local91.a(0.0F);
						local91.a((float) local175 * local36 + local158);
						local91.a(local164 + (float) local175 * local40);
						local91.a(local170 + (float) local175 * local44);
						if (arg1.anInt9178 == 0) {
							local91.a(local139, local144, local147, local152);
						} else {
							local91.b(local139, local144, local147, local152);
						}
						local91.a(1.0F);
						local91.a(1.0F);
						local91.a((float) local175 * local62 + local158);
						local91.a(local67 * (float) local175 + local164);
						local91.a(local170 + local71 * (float) local175);
						if (arg1.anInt9178 == 0) {
							local91.a(local139, local144, local147, local152);
						} else {
							local91.b(local139, local144, local147, local152);
						}
						local91.a(0.0F);
						local91.a(1.0F);
						local5++;
					}
					if (this.anIntArray635[local97] > 64) {
						local395 = this.anIntArray635[local97] - 1 - 64;
						for (local134 = this.anIntArray634[local395] - 1; local134 >= 0; local134--) {
							local410 = this.aClass8_Sub4_Sub2ArrayArray4[local395][local134];
							local413 = local410.anInt7539;
							local147 = (byte) (local413 >> 16);
							local152 = (byte) (local413 >> 8);
							local426 = (byte) local413;
							local431 = (byte) (local413 >>> 24);
							local170 = (float) (local410.anInt7537 >> 12);
							local443 = (float) (local410.anInt7534 >> 12);
							local449 = (float) (local410.anInt7536 >> 12);
							local454 = local410.anInt7535 >> 12;
							local91.a(local36 * (float) -local454 + local170);
							local91.a(local443 + (float) -local454 * local40);
							local91.a((float) -local454 * local44 + local449);
							if (arg1.anInt9178 == 0) {
								local91.a(local147, local152, local426, local431);
							} else {
								local91.b(local147, local152, local426, local431);
							}
							local91.a(0.0F);
							local91.a(0.0F);
							local91.a((float) local454 * local49 + local170);
							local91.a(local53 * (float) local454 + local443);
							local91.a(local449 + (float) local454 * local57);
							if (arg1.anInt9178 == 0) {
								local91.a(local147, local152, local426, local431);
							} else {
								local91.b(local147, local152, local426, local431);
							}
							local91.a(1.0F);
							local91.a(0.0F);
							local91.a((float) local454 * local36 + local170);
							local91.a(local443 + local40 * (float) local454);
							local91.a(local44 * (float) local454 + local449);
							if (arg1.anInt9178 == 0) {
								local91.a(local147, local152, local426, local431);
							} else {
								local91.b(local147, local152, local426, local431);
							}
							local91.a(1.0F);
							local91.a(1.0F);
							local91.a(local62 * (float) local454 + local170);
							local91.a(local443 + local67 * (float) local454);
							local91.a((float) local454 * local71 + local449);
							if (arg1.anInt9178 == 0) {
								local91.a(local147, local152, local426, local431);
							} else {
								local91.b(local147, local152, local426, local431);
							}
							local91.a(0.0F);
							local5++;
							local91.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local97 = arg0 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray635[local97] > 64 ? 64 : this.anIntArray635[local97];
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local131 = this.aClass8_Sub4_Sub2ArrayArray3[local97][local123];
						local134 = local131.anInt7539;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = (float) (local131.anInt7537 >> 12);
						local164 = (float) (local131.anInt7534 >> 12);
						local170 = (float) (local131.anInt7536 >> 12);
						local175 = local131.anInt7535 >> 12;
						local91.b(local36 * (float) -local175 + local158);
						local91.b(local164 + (float) -local175 * local40);
						local91.b(local170 + local44 * (float) -local175);
						if (arg1.anInt9178 == 0) {
							local91.a(local139, local144, local147, local152);
						} else {
							local91.b(local139, local144, local147, local152);
						}
						local91.b(0.0F);
						local91.b(0.0F);
						local91.b(local158 + local49 * (float) local175);
						local91.b(local53 * (float) local175 + local164);
						local91.b(local57 * (float) local175 + local170);
						if (arg1.anInt9178 == 0) {
							local91.a(local139, local144, local147, local152);
						} else {
							local91.b(local139, local144, local147, local152);
						}
						local91.b(1.0F);
						local91.b(0.0F);
						local91.b(local158 + local36 * (float) local175);
						local91.b(local40 * (float) local175 + local164);
						local91.b(local170 + (float) local175 * local44);
						if (arg1.anInt9178 == 0) {
							local91.a(local139, local144, local147, local152);
						} else {
							local91.b(local139, local144, local147, local152);
						}
						local91.b(1.0F);
						local91.b(1.0F);
						local91.b(local158 + local62 * (float) local175);
						local91.b((float) local175 * local67 + local164);
						local91.b(local170 + local71 * (float) local175);
						if (arg1.anInt9178 == 0) {
							local91.a(local139, local144, local147, local152);
						} else {
							local91.b(local139, local144, local147, local152);
						}
						local91.b(0.0F);
						local91.b(1.0F);
						local5++;
					}
					if (this.anIntArray635[local97] > 64) {
						local395 = this.anIntArray635[local97] - 65;
						for (local134 = this.anIntArray634[local395] - 1; local134 >= 0; local134--) {
							local410 = this.aClass8_Sub4_Sub2ArrayArray4[local395][local134];
							local413 = local410.anInt7539;
							local147 = (byte) (local413 >> 16);
							local152 = (byte) (local413 >> 8);
							local426 = (byte) local413;
							local431 = (byte) (local413 >>> 24);
							local170 = (float) (local410.anInt7537 >> 12);
							local443 = (float) (local410.anInt7534 >> 12);
							local449 = (float) (local410.anInt7536 >> 12);
							local454 = local410.anInt7535 >> 12;
							local91.b(local36 * (float) -local454 + local170);
							local91.b(local443 + (float) -local454 * local40);
							local91.b(local44 * (float) -local454 + local449);
							if (arg1.anInt9178 == 0) {
								local91.a(local147, local152, local426, local431);
							} else {
								local91.b(local147, local152, local426, local431);
							}
							local91.b(0.0F);
							local91.b(0.0F);
							local91.b((float) local454 * local49 + local170);
							local91.b(local443 + local53 * (float) local454);
							local91.b(local449 + (float) local454 * local57);
							if (arg1.anInt9178 == 0) {
								local91.a(local147, local152, local426, local431);
							} else {
								local91.b(local147, local152, local426, local431);
							}
							local91.b(1.0F);
							local91.b(0.0F);
							local91.b(local170 + (float) local454 * local36);
							local91.b((float) local454 * local40 + local443);
							local91.b((float) local454 * local44 + local449);
							if (arg1.anInt9178 == 0) {
								local91.a(local147, local152, local426, local431);
							} else {
								local91.b(local147, local152, local426, local431);
							}
							local91.b(1.0F);
							local91.b(1.0F);
							local91.b(local62 * (float) local454 + local170);
							local91.b(local67 * (float) local454 + local443);
							local91.b((float) local454 * local71 + local449);
							if (arg1.anInt9178 == 0) {
								local91.a(local147, local152, local426, local431);
							} else {
								local91.b(local147, local152, local426, local431);
							}
							local91.b(0.0F);
							local91.b(1.0F);
							local5++;
						}
					}
				}
			}
		}
		local91.c();
		if (this.anInterface16_11.method3154()) {
			arg1.method8130(0, this.anInterface16_11);
			arg1.method8130(1, this.anInterface16_12);
			arg1.method8114(this.aClass244_16);
			arg1.method8052(0, 0, this.anInterface20_5, local5 * 4, Static104.aClass131_2, local5 * 2);
		}
	}
}
