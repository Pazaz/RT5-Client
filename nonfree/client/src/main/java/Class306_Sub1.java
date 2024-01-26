import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class306_Sub1 extends Class306 {

	@OriginalMember(owner = "client!taa", name = "K", descriptor = "I")
	public int anInt8919 = 99;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(IIIZ)V")
	public Class306_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static467.aClass96_3, Static540.aClass79_6);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(III[Lclient!eq;Lclient!ha;[B)V")
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class110[] arg2, @OriginalArg(4) Class19 arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(8) Class2_Sub21 local8 = new Class2_Sub21(arg4);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local8.method7345();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(34) int local34 = local8.method7390();
				if (local34 == 0) {
					break;
				}
				local30 += local34 - 1;
				@Pc(46) int local46 = local30 & 0x3F;
				@Pc(52) int local52 = local30 >> 6 & 0x3F;
				@Pc(56) int local56 = local30 >> 12;
				@Pc(60) int local60 = local8.method7396();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				@Pc(73) int local73 = local52 + arg0;
				@Pc(77) int local77 = arg1 + local46;
				if (local73 > 0 && local77 > 0 && local73 < super.anInt8906 - 1 && local77 < super.anInt8904 - 1) {
					@Pc(102) Class110 local102 = null;
					if (!super.aBoolean673) {
						@Pc(107) int local107 = local56;
						if ((Static280.aByteArrayArrayArray3[1][local73][local77] & 0x2) == 2) {
							local107 = local56 - 1;
						}
						if (local107 >= 0) {
							local102 = arg2[local107];
						}
					}
					this.method7894(local64, local18, local102, local77, arg3, local73, local68, local56, local56, -1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILclient!ge;ILclient!ha;I)V")
	public void method7893(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3) {
		if (super.aBoolean673) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) Class367 local12 = null;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(28) int local28;
						@Pc(86) int local86;
						@Pc(504) int local504;
						@Pc(143) int local143;
						@Pc(147) int local147;
						while (arg1.aByteArray93.length > arg1.anInt8388) {
							local28 = arg1.method7396();
							if (local28 != 0) {
								@Pc(149) int local149;
								@Pc(153) int local153;
								@Pc(290) int local290;
								if (local28 == 1) {
									local86 = arg1.method7396();
									if (local86 > 0) {
										for (local504 = 0; local504 < local86; local504++) {
											@Pc(512) Class353 local512 = new Class353(arg3, arg1, 2);
											if (local512.anInt9380 == 31) {
												@Pc(523) Class392 local523 = Static48.aClass384_1.method8814(arg1.method7382());
												local512.method8244(local523.anInt10374, local523.anInt10372, local523.anInt10373, local523.anInt10377);
											}
											if (arg3.method7955() > 0) {
												@Pc(543) Class2_Sub7 local543 = local512.aClass2_Sub7_3;
												local149 = (arg2 << 9) + local543.method8426();
												local153 = (arg0 << 9) + local543.method8429();
												local290 = local149 >> 9;
												@Pc(567) int local567 = local153 >> 9;
												if (local290 >= 0 && local567 >= 0 && super.anInt8906 > local290 && super.anInt8904 > local567) {
													local543.method8427(local149, local153, super.anIntArrayArrayArray17[local512.anInt9369][local290][local567] - local543.method8425());
													Static698.method9122(local512);
												}
											}
										}
									}
								} else if (local28 == 2) {
									if (local12 == null) {
										local12 = new Class367();
									}
									local12.method8385(arg1);
								} else if (local28 == 128) {
									if (local12 == null) {
										local12 = new Class367();
									}
									local12.method8384(arg1);
								} else if (local28 == 129) {
									if (super.aByteArrayArrayArray12 == null) {
										super.aByteArrayArrayArray12 = new byte[4][][];
									}
									local10 = true;
									for (local86 = 0; local86 < 4; local86++) {
										@Pc(91) byte local91 = arg1.method7377();
										if (local91 == 0 && super.aByteArrayArrayArray12[local86] != null) {
											local143 = arg2;
											local147 = arg2 + 64;
											local149 = arg0;
											local153 = arg0 + 64;
											if (arg2 < 0) {
												local143 = 0;
											} else if (arg2 >= super.anInt8906) {
												local143 = super.anInt8906;
											}
											if (arg0 < 0) {
												local149 = 0;
											} else if (arg0 >= super.anInt8904) {
												local149 = super.anInt8904;
											}
											if (local147 < 0) {
												local147 = 0;
											} else if (super.anInt8906 <= local147) {
												local147 = super.anInt8906;
											}
											if (local153 < 0) {
												local153 = 0;
											} else if (local153 >= super.anInt8904) {
												local153 = super.anInt8904;
											}
											while (local147 > local143) {
												while (local149 < local153) {
													super.aByteArrayArrayArray12[local86][local143][local149] = 0;
													local149++;
												}
												local143++;
											}
										} else if (local91 == 1) {
											if (super.aByteArrayArrayArray12[local86] == null) {
												super.aByteArrayArrayArray12[local86] = new byte[super.anInt8906 + 1][super.anInt8904 + 1];
											}
											for (local143 = 0; local143 < 64; local143 += 4) {
												for (local147 = 0; local147 < 64; local147 += 4) {
													@Pc(280) byte local280 = arg1.method7377();
													for (local153 = local143 + arg2; local153 < local143 + arg2 + 4; local153++) {
														for (local290 = arg0 + local147; local290 < arg0 + local147 + 4; local290++) {
															if (local153 >= 0 && super.anInt8906 > local153 && local290 >= 0 && super.anInt8904 > local290) {
																super.aByteArrayArrayArray12[local86][local153][local290] = local280;
															}
														}
													}
												}
											}
										} else if (local91 == 2) {
											if (super.aByteArrayArrayArray12[local86] == null) {
												super.aByteArrayArrayArray12[local86] = new byte[super.anInt8906 + 1][super.anInt8904 + 1];
											}
											if (local86 > 0) {
												local143 = arg2;
												local147 = arg2 + 64;
												local149 = arg0;
												local153 = arg0 + 64;
												if (local147 < 0) {
													local147 = 0;
												} else if (super.anInt8906 <= local147) {
													local147 = super.anInt8906;
												}
												if (arg2 < 0) {
													local143 = 0;
												} else if (arg2 >= super.anInt8906) {
													local143 = super.anInt8906;
												}
												if (arg0 < 0) {
													local149 = 0;
												} else if (arg0 >= super.anInt8904) {
													local149 = super.anInt8904;
												}
												if (local153 < 0) {
													local153 = 0;
												} else if (local153 >= super.anInt8904) {
													local153 = super.anInt8904;
												}
												while (local143 < local147) {
													while (local153 > local149) {
														super.aByteArrayArrayArray12[local86][local143][local149] = super.aByteArrayArrayArray12[local86 - 1][local143][local149];
														local149++;
													}
													local143++;
												}
											}
										}
									}
								} else {
									throw new IllegalStateException("");
								}
							} else if (local12 == null) {
								local12 = new Class367(arg1);
							} else {
								local12.method8386(arg1);
							}
						}
						if (local12 != null) {
							for (local28 = 0; local28 < 8; local28++) {
								for (local86 = 0; local86 < 8; local86++) {
									local504 = local28 + (arg2 >> 3);
									local143 = local86 + (arg0 >> 3);
									if (local504 >= 0 && super.anInt8906 >> 3 > local504 && local143 >= 0 && super.anInt8904 >> 3 > local143) {
										Static108.method2064(local143, local504, local12);
									}
								}
							}
						}
						if (!local10 && super.aByteArrayArrayArray12 != null) {
							for (local28 = 0; local28 < 4; local28++) {
								if (super.aByteArrayArrayArray12[local28] != null) {
									for (local86 = 0; local86 < 16; local86++) {
										for (local504 = 0; local504 < 16; local504++) {
											local143 = (arg2 >> 2) + local86;
											local147 = (arg0 >> 2) + local504;
											if (local143 >= 0 && local143 < 26 && local147 >= 0 && local147 < 26) {
												super.aByteArrayArrayArray12[local28][local143][local147] = 0;
											}
										}
									}
								}
							}
							return;
						}
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IILclient!eq;ILclient!ha;IIIIII)V")
	public void method7894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class110 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (Static400.aClass2_Sub34_28.aClass57_Sub19_2.method5960() == 0 && !Static696.method9036(arg3, Static164.anInt2808, arg5, arg7)) {
			return;
		}
		if (arg8 < this.anInt8919) {
			this.anInt8919 = arg8;
		}
		@Pc(40) Class54 local40 = Static354.aClass142_4.method3063(arg1, 82);
		if (Static400.aClass2_Sub34_28.aClass57_Sub30_1.method8356() == 0 && local40.aBoolean90) {
			return;
		}
		@Pc(65) int local65;
		@Pc(68) int local68;
		if (arg6 == 1 || arg6 == 3) {
			local68 = local40.anInt1270;
			local65 = local40.anInt1229;
		} else {
			local65 = local40.anInt1270;
			local68 = local40.anInt1229;
		}
		@Pc(100) int local100;
		@Pc(94) int local94;
		if (arg5 + local65 <= super.anInt8906) {
			local94 = (local65 + 1 >> 1) + arg5;
			local100 = (local65 >> 1) + arg5;
		} else {
			local94 = arg5 + 1;
			local100 = arg5;
		}
		@Pc(123) int local123;
		@Pc(121) int local121;
		if (super.anInt8904 < local68 + arg3) {
			local121 = arg3 + 1;
			local123 = arg3;
		} else {
			local123 = arg3 + (local68 >> 1);
			local121 = arg3 + (local68 + 1 >> 1);
		}
		@Pc(143) Class178 local143 = Static246.aClass178Array1[arg7];
		@Pc(170) int local170 = local143.method7869(local123, local100) + local143.method7869(local123, local94) + local143.method7869(local121, local100) + local143.method7869(local121, local94) >> 2;
		@Pc(179) int local179 = (arg5 << 9) + (local65 << 8);
		@Pc(187) int local187 = (local68 << 8) + (arg3 << 9);
		@Pc(204) boolean local204 = Static404.aBoolean465 && !super.aBoolean673 && local40.aBoolean102;
		if (local40.method1303()) {
			Static89.method1714(arg8, (Class8_Sub2_Sub1_Sub2_Sub1) null, arg5, arg3, (Class8_Sub2_Sub1_Sub2_Sub2) null, local40, arg6);
		}
		@Pc(248) boolean local248 = arg9 == -1 && !local40.method1300() && local40.anIntArray113 == null && !local40.aBoolean93 && !local40.aBoolean91;
		if (Static614.aBoolean718 && (Static540.method6540(arg0) && local40.anInt1223 != 1 || !(!Static389.method5474(arg0) || local40.anInt1223 != 0))) {
			return;
		}
		if (arg0 != 22) {
			@Pc(420) Class8_Sub2_Sub1 local420;
			@Pc(384) Class8_Sub2_Sub1_Sub3 local384;
			@Pc(424) int local424;
			@Pc(495) int local495;
			@Pc(492) int local492;
			if (arg0 == 10 || arg0 == 11) {
				local384 = null;
				if (local248) {
					@Pc(416) Class8_Sub2_Sub1_Sub3 local416 = new Class8_Sub2_Sub1_Sub3(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg5, arg5 + local65 - 1, arg3, arg3 + local68 - 1, arg0, arg6, local204);
					local384 = local416;
					local420 = local416;
					local424 = local416.method4222();
				} else {
					local424 = 15;
					local420 = new Class8_Sub2_Sub1_Sub4(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg5, arg5 + local65 - 1, arg3, arg3 + local68 - 1, arg0, arg6, arg9);
				}
				if (Static102.method2026(local420, false)) {
					if (local384 != null && local384.method6860(-19717)) {
						local384.method6861(arg4);
					}
					if (local40.aBoolean98 && Static404.aBoolean465) {
						if (local424 > 30) {
							local424 = 30;
						}
						for (local492 = 0; local492 <= local65; local492++) {
							for (local495 = 0; local495 <= local68; local495++) {
								local143.ka(local492 + arg5, local495 + arg3, local424);
							}
						}
					}
				}
				if (local40.anInt1242 != 0 && arg2 != null) {
					arg2.method2472(arg5, local68, arg3, !local40.aBoolean97, local65, local40.aBoolean99);
				}
			} else if (arg0 >= 12 && arg0 <= 17 || arg0 >= 18 && arg0 <= 21) {
				if (local248) {
					local384 = new Class8_Sub2_Sub1_Sub3(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg5, arg5 + local65 - 1, arg3, arg3 + local68 - 1, arg0, arg6, local204);
					if (local384.method6860(-19717)) {
						local384.method6861(arg4);
					}
					local420 = local384;
				} else {
					local420 = new Class8_Sub2_Sub1_Sub4(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg5, local65 + arg5 - 1, arg3, arg3 + local68 - 1, arg0, arg6, arg9);
				}
				Static102.method2026(local420, false);
				if (Static404.aBoolean465 && !super.aBoolean673 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg8 > 0 && local40.anInt1223 != 0) {
					super.aByteArrayArrayArray14[arg8][arg5][arg3] = (byte) (super.aByteArrayArrayArray14[arg8][arg5][arg3] | 0x4);
				}
				if (local40.anInt1242 != 0 && arg2 != null) {
					arg2.method2472(arg5, local68, arg3, !local40.aBoolean97, local65, local40.aBoolean99);
				}
			} else {
				@Pc(774) Class8_Sub2_Sub3 local774;
				if (arg0 == 0) {
					@Pc(744) int local744 = local40.anInt1223;
					if (Static648.aBoolean742 && local40.anInt1223 == -1) {
						local744 = 1;
					}
					if (local248) {
						@Pc(772) Class8_Sub2_Sub3_Sub2 local772 = new Class8_Sub2_Sub3_Sub2(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg0, arg6, local204);
						local774 = local772;
						if (local772.method6860(-19717)) {
							local772.method6861(arg4);
						}
					} else {
						local774 = new Class8_Sub2_Sub3_Sub1(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg0, arg6, arg9);
					}
					Static584.method7665(arg8, arg5, arg3, local774, (Class8_Sub2_Sub3) null);
					if (arg6 == 0) {
						if (Static404.aBoolean465 && local40.aBoolean98) {
							local143.ka(arg5, arg3, 50);
							local143.ka(arg5, arg3 + 1, 50);
						}
						if (local744 == 1 && !super.aBoolean673) {
							Static177.method2716(1, local40.anInt1212, arg3, arg5, arg8, local40.anInt1257);
						}
					} else if (arg6 == 1) {
						if (Static404.aBoolean465 && local40.aBoolean98) {
							local143.ka(arg5, arg3 + 1, 50);
							local143.ka(arg5 + 1, arg3 - -1, 50);
						}
						if (local744 == 1 && !super.aBoolean673) {
							Static177.method2716(2, -local40.anInt1212, arg3 + 1, arg5, arg8, local40.anInt1257);
						}
					} else if (arg6 == 2) {
						if (Static404.aBoolean465 && local40.aBoolean98) {
							local143.ka(arg5 + 1, arg3, 50);
							local143.ka(arg5 + 1, arg3 + 1, 50);
						}
						if (local744 == 1 && !super.aBoolean673) {
							Static177.method2716(1, -local40.anInt1212, arg3, arg5 + 1, arg8, local40.anInt1257);
						}
					} else if (arg6 == 3) {
						if (Static404.aBoolean465 && local40.aBoolean98) {
							local143.ka(arg5, arg3, 50);
							local143.ka(arg5 + 1, arg3, 50);
						}
						if (local744 == 1 && !super.aBoolean673) {
							Static177.method2716(2, local40.anInt1212, arg3, arg5, arg8, local40.anInt1257);
						}
					}
					if (local40.anInt1242 != 0 && arg2 != null) {
						arg2.method2462(local40.aBoolean99, !local40.aBoolean97, arg3, arg6, arg0, arg5);
					}
					if (local40.anInt1243 != 64) {
						Static411.method5666(arg8, arg5, arg3, local40.anInt1243);
					}
				} else {
					@Pc(1079) Class8_Sub2_Sub3 local1079;
					@Pc(1096) Class8_Sub2_Sub3_Sub2 local1096;
					if (arg0 == 1) {
						if (local248) {
							local1096 = new Class8_Sub2_Sub3_Sub2(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg0, arg6, local204);
							local1079 = local1096;
							if (local1096.method6860(-19717)) {
								local1096.method6861(arg4);
							}
						} else {
							local1079 = new Class8_Sub2_Sub3_Sub1(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg0, arg6, arg9);
						}
						Static584.method7665(arg8, arg5, arg3, local1079, (Class8_Sub2_Sub3) null);
						if (local40.aBoolean98 && Static404.aBoolean465) {
							if (arg6 == 0) {
								local143.ka(arg5, arg3 + 1, 50);
							} else if (arg6 == 1) {
								local143.ka(arg5 + 1, arg3 - -1, 50);
							} else if (arg6 == 2) {
								local143.ka(arg5 + 1, arg3, 50);
							} else if (arg6 == 3) {
								local143.ka(arg5, arg3, 50);
							}
						}
						if (local40.anInt1242 != 0 && arg2 != null) {
							arg2.method2462(local40.aBoolean99, !local40.aBoolean97, arg3, arg6, arg0, arg5);
						}
					} else if (arg0 == 2) {
						local424 = arg6 + 1 & 0x3;
						if (local248) {
							@Pc(1267) Class8_Sub2_Sub3_Sub2 local1267 = new Class8_Sub2_Sub3_Sub2(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg0, arg6 + 4, local204);
							@Pc(1283) Class8_Sub2_Sub3_Sub2 local1283 = new Class8_Sub2_Sub3_Sub2(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg0, local424, local204);
							if (local1267.method6860(-19717)) {
								local1267.method6861(arg4);
							}
							local774 = local1283;
							if (local1283.method6860(-19717)) {
								local1283.method6861(arg4);
							}
							local1079 = local1267;
						} else {
							local1079 = new Class8_Sub2_Sub3_Sub1(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg0, arg6 + 4, arg9);
							local774 = new Class8_Sub2_Sub3_Sub1(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg0, local424, arg9);
						}
						Static584.method7665(arg8, arg5, arg3, local1079, local774);
						if ((local40.anInt1223 == 1 || Static648.aBoolean742 && local40.anInt1223 == -1) && !super.aBoolean673) {
							if (arg6 == 0) {
								Static177.method2716(1, local40.anInt1212, arg3, arg5, arg8, local40.anInt1257);
								Static177.method2716(2, local40.anInt1212, arg3 + 1, arg5, arg8, local40.anInt1257);
							} else if (arg6 == 1) {
								Static177.method2716(1, local40.anInt1212, arg3, arg5 + 1, arg8, local40.anInt1257);
								Static177.method2716(2, local40.anInt1212, arg3 + 1, arg5, arg8, local40.anInt1257);
							} else if (arg6 == 2) {
								Static177.method2716(1, local40.anInt1212, arg3, arg5 + 1, arg8, local40.anInt1257);
								Static177.method2716(2, local40.anInt1212, arg3, arg5, arg8, local40.anInt1257);
							} else if (arg6 == 3) {
								Static177.method2716(1, local40.anInt1212, arg3, arg5, arg8, local40.anInt1257);
								Static177.method2716(2, local40.anInt1212, arg3, arg5, arg8, local40.anInt1257);
							}
						}
						if (local40.anInt1242 != 0 && arg2 != null) {
							arg2.method2462(local40.aBoolean99, !local40.aBoolean97, arg3, arg6, arg0, arg5);
						}
						if (local40.anInt1243 != 64) {
							Static411.method5666(arg8, arg5, arg3, local40.anInt1243);
						}
					} else if (arg0 == 3) {
						if (local248) {
							local1096 = new Class8_Sub2_Sub3_Sub2(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg0, arg6, local204);
							if (local1096.method6860(-19717)) {
								local1096.method6861(arg4);
							}
							local1079 = local1096;
						} else {
							local1079 = new Class8_Sub2_Sub3_Sub1(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg0, arg6, arg9);
						}
						Static584.method7665(arg8, arg5, arg3, local1079, (Class8_Sub2_Sub3) null);
						if (local40.aBoolean98 && Static404.aBoolean465) {
							if (arg6 == 0) {
								local143.ka(arg5, arg3 + 1, 50);
							} else if (arg6 == 1) {
								local143.ka(arg5 + 1, arg3 - -1, 50);
							} else if (arg6 == 2) {
								local143.ka(arg5 + 1, arg3, 50);
							} else if (arg6 == 3) {
								local143.ka(arg5, arg3, 50);
							}
						}
						if (local40.anInt1242 != 0 && arg2 != null) {
							arg2.method2462(local40.aBoolean99, !local40.aBoolean97, arg3, arg6, arg0, arg5);
						}
					} else if (arg0 == 9) {
						if (local248) {
							local384 = new Class8_Sub2_Sub1_Sub3(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg5, arg5, arg3, arg3, arg0, arg6, local204);
							if (local384.method6860(-19717)) {
								local384.method6861(arg4);
							}
							local420 = local384;
						} else {
							local420 = new Class8_Sub2_Sub1_Sub4(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg5, local65 + arg5 - 1, arg3, local68 + arg3 - 1, arg0, arg6, arg9);
						}
						Static102.method2026(local420, false);
						if (local40.anInt1223 == 1 && !super.aBoolean673) {
							@Pc(1723) byte local1723;
							if ((arg6 & 0x1) == 0) {
								local1723 = 8;
							} else {
								local1723 = 16;
							}
							Static177.method2716(local1723, 0, arg3, arg5, arg8, local40.anInt1257);
						}
						if (local40.anInt1242 != 0 && arg2 != null) {
							arg2.method2472(arg5, local68, arg3, !local40.aBoolean97, local65, local40.aBoolean99);
						}
						if (local40.anInt1243 != 64) {
							Static411.method5666(arg8, arg5, arg3, local40.anInt1243);
						}
					} else {
						@Pc(1813) Class8_Sub2_Sub4 local1813;
						if (arg0 == 4) {
							if (local248) {
								@Pc(1801) Class8_Sub2_Sub4_Sub1 local1801 = new Class8_Sub2_Sub4_Sub1(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, 0, 0, arg0, arg6);
								if (local1801.method6860(-19717)) {
									local1801.method6861(arg4);
								}
								local1813 = local1801;
							} else {
								local1813 = new Class8_Sub2_Sub4_Sub2(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, 0, 0, arg0, arg6, arg9);
							}
							Static177.method2718(arg8, arg5, arg3, local1813, (Class8_Sub2_Sub4) null);
						} else {
							@Pc(1844) int local1844;
							@Pc(1850) Interface25 local1850;
							@Pc(1916) Class8_Sub2_Sub4_Sub1 local1916;
							if (arg0 == 5) {
								local1844 = 65;
								local1850 = (Interface25) Static302.method4414(arg8, arg5, arg3);
								if (local1850 != null) {
									local1844 = Static354.aClass142_4.method3063(local1850.method6859(-32136), 32).anInt1243 + 1;
								}
								if (local248) {
									local1916 = new Class8_Sub2_Sub4_Sub1(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, Static485.anIntArray887[arg6] * local1844, Static609.anIntArray715[arg6] * local1844, arg0, arg6);
									if (local1916.method6860(-19717)) {
										local1916.method6861(arg4);
									}
									local1813 = local1916;
								} else {
									local1813 = new Class8_Sub2_Sub4_Sub2(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, Static485.anIntArray887[arg6] * local1844, local1844 * Static609.anIntArray715[arg6], arg0, arg6, arg9);
								}
								Static177.method2718(arg8, arg5, arg3, local1813, (Class8_Sub2_Sub4) null);
							} else if (arg0 == 6) {
								local1844 = 33;
								local1850 = (Interface25) Static302.method4414(arg8, arg5, arg3);
								if (local1850 != null) {
									local1844 = Static354.aClass142_4.method3063(local1850.method6859(-32136), 115).anInt1243 / 2 + 1;
								}
								if (local248) {
									local1916 = new Class8_Sub2_Sub4_Sub1(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, Static485.anIntArray887[arg6] * local1844, local1844 * Static609.anIntArray715[arg6], arg0, arg6 + 4);
									local1813 = local1916;
									if (local1916.method6860(-19717)) {
										local1916.method6861(arg4);
									}
								} else {
									local1813 = new Class8_Sub2_Sub4_Sub2(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, Static407.anIntArray489[arg6] * local1844, Static636.anIntArray742[arg6] * local1844, arg0, arg6 + 4, arg9);
								}
								Static177.method2718(arg8, arg5, arg3, local1813, (Class8_Sub2_Sub4) null);
							} else if (arg0 == 7) {
								local1844 = arg6 + 2 & 0x3;
								if (local248) {
									@Pc(2068) Class8_Sub2_Sub4_Sub1 local2068 = new Class8_Sub2_Sub4_Sub1(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, 0, 0, arg0, local1844 + 4);
									local1813 = local2068;
									if (local2068.method6860(-19717)) {
										local2068.method6861(arg4);
									}
								} else {
									local1813 = new Class8_Sub2_Sub4_Sub2(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, 0, 0, arg0, local1844 + 4, arg9);
								}
								Static177.method2718(arg8, arg5, arg3, local1813, (Class8_Sub2_Sub4) null);
							} else if (arg0 == 8) {
								local492 = arg6 + 2 & 0x3;
								local495 = 33;
								@Pc(2134) Interface25 local2134 = (Interface25) Static302.method4414(arg8, arg5, arg3);
								if (local2134 != null) {
									local495 = Static354.aClass142_4.method3063(local2134.method6859(-32136), 92).anInt1243 / 2 + 1;
								}
								@Pc(2178) Class8_Sub2_Sub4 local2178;
								@Pc(2200) Class8_Sub2_Sub4 local2200;
								if (local248) {
									local2178 = new Class8_Sub2_Sub4_Sub1(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, Static407.anIntArray489[arg6] * local495, Static636.anIntArray742[arg6] * local495, arg0, arg6 + 4);
									local2200 = new Class8_Sub2_Sub4_Sub1(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, 0, 0, arg0, local492 + 4);
									if (local2178.method6860(-19717)) {
										local2178.method6861(arg4);
									}
									if (local2200.method6860(-19717)) {
										local2200.method6861(arg4);
									}
								} else {
									local2178 = new Class8_Sub2_Sub4_Sub2(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, Static407.anIntArray489[arg6] * local495, Static636.anIntArray742[arg6] * local495, arg0, arg6 + 4, arg9);
									local2200 = new Class8_Sub2_Sub4_Sub2(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, 0, 0, arg0, local492 + 4, arg9);
								}
								Static177.method2718(arg8, arg5, arg3, local2178, local2200);
							}
						}
					}
				}
			}
		} else if (Static400.aClass2_Sub34_28.aClass57_Sub6_1.method2714() != 0 || local40.anInt1271 != 0 || local40.anInt1242 == 1 || local40.aBoolean101) {
			@Pc(325) Class8_Sub2_Sub2 local325;
			if (local248) {
				@Pc(341) Class8_Sub2_Sub2_Sub1 local341 = new Class8_Sub2_Sub2_Sub1(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg6, local204);
				local325 = local341;
				if (local341.method6860(-19717)) {
					local341.method6861(arg4);
				}
			} else {
				local325 = new Class8_Sub2_Sub2_Sub2(arg4, local40, arg8, arg7, local179, local170, local187, super.aBoolean673, arg6, arg9);
			}
			Static61.method1299(arg8, arg5, arg3, local325);
			if (local40.anInt1242 == 1 && arg2 != null) {
				arg2.method2470(arg3, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IILclient!ha;ILclient!ge;IIIII)V")
	public void method7895(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub21 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (super.aBoolean673) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) Class367 local12 = null;
		@Pc(18) int local18 = (arg5 & 0x7) * 8;
		@Pc(24) int local24 = (arg2 & 0x7) * 8;
		while (true) {
			@Pc(35) int local35;
			@Pc(63) int local63;
			@Pc(327) int local327;
			@Pc(70) int local70;
			while (arg3.anInt8388 < arg3.aByteArray93.length) {
				local35 = arg3.method7396();
				if (local35 != 0) {
					@Pc(122) int local122;
					@Pc(176) int local176;
					@Pc(200) int local200;
					@Pc(116) int local116;
					if (local35 == 1) {
						local63 = arg3.method7396();
						if (local63 > 0) {
							for (local70 = 0; local70 < local63; local70++) {
								@Pc(78) Class353 local78 = new Class353(arg1, arg3, 2);
								if (local78.anInt9380 == 31) {
									@Pc(91) Class392 local91 = Static48.aClass384_1.method8814(arg3.method7382());
									local78.method8244(local91.anInt10374, local91.anInt10372, local91.anInt10373, local91.anInt10377);
								}
								if (arg1.method7955() > 0) {
									@Pc(108) Class2_Sub7 local108 = local78.aClass2_Sub7_3;
									local116 = local108.method8426() >> 9;
									local122 = local108.method8429() >> 9;
									if (arg7 == local78.anInt9369 && local116 >= local18 && local116 < local18 + 8 && local122 >= local24 && local24 + 8 > local122) {
										local176 = Static24.method681(local108.method8426() & 0xFFF, local108.method8429() & 0xFFF, arg6) + (arg0 << 9);
										local116 = local176 >> 9;
										local200 = (arg8 << 9) + Static485.method9417(local108.method8429() & 0xFFF, arg6, local108.method8426() & 0xFFF);
										local122 = local200 >> 9;
										if (local116 >= 0 && local122 >= 0 && local116 < super.anInt8906 && super.anInt8904 > local122) {
											local108.method8427(local176, local200, super.anIntArrayArrayArray17[arg7][local116][local122] - local108.method8425());
											Static698.method9122(local78);
										}
									}
								}
							}
						}
					} else if (local35 == 2) {
						if (local12 == null) {
							local12 = new Class367();
						}
						local12.method8385(arg3);
					} else if (local35 == 128) {
						if (local12 == null) {
							local12 = new Class367();
						}
						local12.method8384(arg3);
					} else if (local35 == 129) {
						if (super.aByteArrayArrayArray12 == null) {
							super.aByteArrayArrayArray12 = new byte[4][][];
						}
						for (local63 = 0; local63 < 4; local63++) {
							@Pc(311) byte local311 = arg3.method7377();
							@Pc(331) int local331;
							if (local311 == 0 && super.aByteArrayArrayArray12[arg4] != null) {
								if (arg7 >= local63) {
									local327 = arg0;
									local331 = arg0 + 7;
									local116 = arg8;
									if (arg0 < 0) {
										local327 = 0;
									} else if (arg0 >= super.anInt8906) {
										local327 = super.anInt8906;
									}
									if (local331 < 0) {
										local331 = 0;
									} else if (local331 >= super.anInt8906) {
										local331 = super.anInt8906;
									}
									local122 = arg8 + 7;
									if (arg8 < 0) {
										local116 = 0;
									} else if (arg8 >= super.anInt8904) {
										local116 = super.anInt8904;
									}
									if (local122 < 0) {
										local122 = 0;
									} else if (super.anInt8904 <= local122) {
										local122 = super.anInt8904;
									}
									while (local331 > local327) {
										while (local122 > local116) {
											super.aByteArrayArrayArray12[arg4][local327][local116] = 0;
											local116++;
										}
										local327++;
									}
								}
							} else if (local311 == 1) {
								if (super.aByteArrayArrayArray12[arg4] == null) {
									super.aByteArrayArrayArray12[arg4] = new byte[super.anInt8906 + 1][super.anInt8904 + 1];
								}
								for (local327 = 0; local327 < 64; local327 += 4) {
									for (local331 = 0; local331 < 64; local331 += 4) {
										@Pc(466) byte local466 = arg3.method7377();
										if (arg7 >= local63) {
											for (local122 = local327; local122 < local327 + 4; local122++) {
												for (local176 = local331; local176 < local331 + 4; local176++) {
													if (local122 >= local18 && local18 + 8 > local122 && local176 >= local24 && local24 + 8 > local176) {
														local200 = arg0 + Static633.method9430(local122 & 0x7, local176 & 0x7, arg6);
														@Pc(534) int local534 = arg8 + Static530.method7097(local176 & 0x7, local122 & 0x7, arg6);
														if (local200 >= 0 && local200 < super.anInt8906 && local534 >= 0 && local534 < super.anInt8904) {
															super.aByteArrayArrayArray12[arg4][local200][local534] = local466;
															local10 = true;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else {
						throw new IllegalStateException("");
					}
				} else if (local12 == null) {
					local12 = new Class367(arg3);
				} else {
					local12.method8386(arg3);
				}
			}
			if (local12 != null) {
				Static108.method2064(arg8 >> 3, arg0 >> 3, local12);
			}
			if (!local10 && super.aByteArrayArrayArray12 != null && super.aByteArrayArrayArray12[arg4] != null) {
				local35 = arg0 + 7;
				local63 = arg8 + 7;
				for (local70 = arg0; local70 < local35; local70++) {
					for (local327 = arg8; local327 < local63; local327++) {
						super.aByteArrayArrayArray12[arg4][local70][local327] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(IIIII)Lclient!uv;")
	public Interface25 method7896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Interface25 local5 = null;
		if (arg3 == 0) {
			local5 = (Interface25) Static302.method4414(arg2, arg0, arg1);
		}
		if (arg3 == 1) {
			local5 = (Interface25) Static114.method2134(arg2, arg0, arg1);
		}
		if (arg3 == 2) {
			local5 = (Interface25) Static578.method7623(arg2, arg0, arg1, Static603.aClass22 == null ? (Static603.aClass22 = a("uv")) : Static603.aClass22);
		}
		if (arg3 == 3) {
			local5 = (Interface25) Static687.method8959(arg2, arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I[Lclient!eq;ILclient!ha;BII[BIII)V")
	public void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) Class110[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(26) Class2_Sub21 local26 = new Class2_Sub21(arg6);
		@Pc(28) int local28 = -1;
		while (true) {
			@Pc(32) int local32 = local26.method7345();
			if (local32 == 0) {
				return;
			}
			local28 += local32;
			@Pc(40) int local40 = 0;
			while (true) {
				@Pc(44) int local44 = local26.method7390();
				if (local44 == 0) {
					break;
				}
				local40 += local44 - 1;
				@Pc(59) int local59 = local40 & 0x3F;
				@Pc(65) int local65 = local40 >> 6 & 0x3F;
				@Pc(69) int local69 = local40 >> 12;
				@Pc(73) int local73 = local26.method7396();
				@Pc(77) int local77 = local73 >> 2;
				@Pc(81) int local81 = local73 & 0x3;
				if (arg8 == local69 && arg0 <= local65 && local65 < arg0 + 8 && arg9 <= local59 && local59 < arg9 + 8) {
					@Pc(113) Class54 local113 = Static354.aClass142_4.method3063(local28, 89);
					@Pc(130) int local130 = Static48.method1095(local113.anInt1270, local59 & 0x7, local113.anInt1229, local81, local65 & 0x7, arg7) + arg4;
					@Pc(147) int local147 = Static521.method6874(arg7, local59 & 0x7, local113.anInt1229, local81, local113.anInt1270, local65 & 0x7) + arg5;
					if (local130 > 0 && local147 > 0 && local130 < super.anInt8906 - 1 && local147 < super.anInt8904 - 1) {
						@Pc(173) Class110 local173 = null;
						if (!super.aBoolean673) {
							@Pc(178) int local178 = arg2;
							if ((Static280.aByteArrayArrayArray3[1][local130][local147] & 0x2) == 2) {
								local178 = arg2 - 1;
							}
							if (local178 >= 0) {
								local173 = arg1[local178];
							}
						}
						this.method7894(local77, local28, local173, local147, arg3, local130, arg7 + local81 & 0x3, arg2, arg2, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZLclient!ha;B)V")
	public void method7898(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class19 arg1) {
		Static323.method4624();
		if (!arg0) {
			@Pc(23) int local23;
			@Pc(26) int local26;
			if (super.anInt8913 > 1) {
				for (local23 = 0; local23 < super.anInt8906; local23++) {
					for (local26 = 0; super.anInt8904 > local26; local26++) {
						if ((Static280.aByteArrayArrayArray3[1][local23][local26] & 0x2) == 2) {
							Static646.method8453(local23, local26);
						}
					}
				}
			}
			for (local23 = 0; super.anInt8913 > local23; local23++) {
				for (local26 = 0; super.anInt8904 >= local26; local26++) {
					for (@Pc(71) int local71 = 0; local71 <= super.anInt8906; local71++) {
						if ((super.aByteArrayArrayArray14[local23][local71][local26] & 0x4) != 0) {
							@Pc(88) int local88 = local71;
							@Pc(90) int local90 = local71;
							@Pc(92) int local92 = local26;
							@Pc(94) int local94 = local26;
							while (local92 > 0 && (super.aByteArrayArrayArray14[local23][local71][local92 - 1] & 0x4) != 0 && local26 - local92 < 10) {
								local92--;
							}
							while (local94 < super.anInt8904 && (super.aByteArrayArrayArray14[local23][local71][local94 + 1] & 0x4) != 0 && local94 - local92 < 10) {
								local94++;
							}
							@Pc(163) int local163;
							label111: while (local88 > 0 && local71 - local88 < 10) {
								for (local163 = local92; local163 <= local94; local163++) {
									if ((super.aByteArrayArrayArray14[local23][local88 - 1][local163] & 0x4) == 0) {
										break label111;
									}
								}
								local88--;
							}
							label98: while (super.anInt8906 > local90 && local90 - local88 < 10) {
								for (local163 = local92; local163 <= local94; local163++) {
									if ((super.aByteArrayArrayArray14[local23][local90 + 1][local163] & 0x4) == 0) {
										break label98;
									}
								}
								local90++;
							}
							if ((local90 + 1 - local88) * (local94 + 1 - local92) >= 4) {
								local163 = super.anIntArrayArrayArray17[local23][local88][local92];
								Static269.method3911((local94 << 9) + 512, local88 << 9, local163, local92 << 9, local163, local23, (local90 << 9) + 512);
								for (@Pc(297) int local297 = local88; local297 <= local90; local297++) {
									for (@Pc(300) int local300 = local92; local300 <= local94; local300++) {
										super.aByteArrayArrayArray14[local23][local297][local300] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static348.method5107();
		}
		super.aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IBILclient!eq;IILclient!ha;)V")
	public void method7901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class110 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class19 arg5) {
		@Pc(13) Interface25 local13 = this.method7896(arg4, arg1, arg3, arg0);
		if (local13 == null) {
			return;
		}
		@Pc(22) Class54 local22 = Static354.aClass142_4.method3063(local13.method6859(-32136), 98);
		@Pc(26) int local26 = local13.method6858();
		@Pc(30) int local30 = local13.method6855(23796);
		if (local22.method1303()) {
			Static506.method8312(arg4, arg1, arg3, local22);
		}
		if (local13.method6860(-19717)) {
			local13.method6857(arg5, -88);
		}
		if (arg0 == 0) {
			Static26.method717(arg3, arg4, arg1);
			if (local22.anInt1242 != 0) {
				arg2.method2463(arg1, local30, local26, !local22.aBoolean97, arg4, local22.aBoolean99);
			}
			if (local22.anInt1223 == 1) {
				if (local30 == 0) {
					Static687.method8958(arg4, arg3, 1, arg1);
				} else if (local30 == 1) {
					Static687.method8958(arg4, arg3, 2, arg1 + 1);
				} else if (local30 == 2) {
					Static687.method8958(arg4 + 1, arg3, 1, arg1);
				} else if (local30 == 3) {
					Static687.method8958(arg4, arg3, 2, arg1);
				}
			}
		} else if (arg0 == 1) {
			Static173.method2692(arg3, arg4, arg1);
		} else if (arg0 == 2) {
			Static10.method130(arg3, arg4, arg1, Static603.aClass22 == null ? (Static603.aClass22 = a("uv")) : Static603.aClass22);
			if (local22.anInt1242 != 0 && super.anInt8906 > local22.anInt1270 + arg4 && super.anInt8904 > local22.anInt1270 + arg1 && arg4 + local22.anInt1229 < super.anInt8906 && local22.anInt1229 + arg1 < super.anInt8904) {
				arg2.method2468(local22.aBoolean99, !local22.aBoolean97, arg4, local22.anInt1270, local22.anInt1229, local30, arg1);
			}
			if (local26 == 9) {
				if ((local30 & 0x1) == 0) {
					Static687.method8958(arg4, arg3, 8, arg1);
				} else {
					Static687.method8958(arg4, arg3, 16, arg1);
				}
			}
		} else if (arg0 == 3) {
			Static609.method8212(arg3, arg4, arg1);
			if (local22.anInt1242 == 1) {
				arg2.method2473(arg1, arg4);
			}
		}
	}
}
