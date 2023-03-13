import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class SceneBuilder extends Class29 {

	@OriginalMember(owner = "client!bu", name = "M", descriptor = "I")
	public int anInt922 = 99;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIZ)V")
	public SceneBuilder(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, client.FloTypes, client.FluTypes);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "([IIILclient!wm;Lclient!bt;Z)V")
	public void method1100(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) Buffer arg4) {
		if (super.aBoolean73) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Environment local13 = null;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		while (true) {
			@Pc(24) int local24;
			@Pc(118) int local118;
			@Pc(136) int local136;
			@Pc(140) int local140;
			@Pc(496) int local496;
			while (arg4.pos < arg4.data.length) {
				local24 = arg4.g1();
				if (local24 == 0) {
					local13 = new Environment(arg4);
				} else {
					@Pc(142) int local142;
					if (local24 == 1) {
						local118 = arg4.g1();
						if (local118 > 0) {
							for (local496 = 0; local496 < local118; local496++) {
								@Pc(503) Class2_Sub26_Sub1 local503 = new Class2_Sub26_Sub1(arg4);
								if (local503.anInt4376 == 31) {
									@Pc(516) LightType local516 = client.LightTypes.method4878(arg4.g2());
									local503.method4154(local516.anInt1880, local516.anInt1879, local516.anInt1877, local516.anInt1883);
								}
								local503.anInt4370 += arg2 << 7;
								local503.anInt4371 += arg1 << 7;
								local140 = local503.anInt4370 >> 7;
								local142 = local503.anInt4371 >> 7;
								if (local140 >= 0 && local142 >= 0 && local140 < super.anInt900 && local142 < super.anInt911) {
									local503.anInt4368 = super.levelHeightmap[local503.anInt4380][local140][local142] - local503.anInt4368;
									if (arg3.method2886() > 0) {
										Static314.method5368(local503);
									}
								}
							}
						}
					} else if (local24 == 2) {
						if (local13 == null) {
							local13 = new Environment();
						}
						local13.method851(arg4);
					} else if (local24 != 128) {
						if (local24 != 129) {
							throw new IllegalStateException((String) null);
						}
						if (super.aByteArrayArrayArray11 == null) {
							super.aByteArrayArrayArray11 = new byte[4][][];
						}
						local11 = true;
						for (local118 = 0; local118 < 4; local118++) {
							@Pc(124) byte local124 = arg4.g1b();
							@Pc(175) int local175;
							if (local124 == 0 && super.aByteArrayArrayArray11[local118] != null) {
								local136 = arg2;
								local140 = arg2 + 64;
								local142 = arg1;
								if (arg1 < 0) {
									local142 = 0;
								} else if (arg1 >= super.anInt911) {
									local142 = super.anInt911;
								}
								if (arg2 < 0) {
									local136 = 0;
								} else if (arg2 >= super.anInt900) {
									local136 = super.anInt900;
								}
								local175 = arg1 + 64;
								if (local140 < 0) {
									local140 = 0;
								} else if (local140 >= super.anInt900) {
									local140 = super.anInt900;
								}
								if (local175 < 0) {
									local175 = 0;
								} else if (super.anInt911 <= local175) {
									local175 = super.anInt911;
								}
								while (local140 > local136) {
									while (local175 > local142) {
										super.aByteArrayArrayArray11[local118][local136][local142] = 0;
										local142++;
									}
									local136++;
								}
							} else if (local124 == 1) {
								if (super.aByteArrayArrayArray11[local118] == null) {
									super.aByteArrayArrayArray11[local118] = new byte[super.anInt900 + 1][super.anInt911 + 1];
								}
								for (local136 = 0; local136 < 64; local136 += 4) {
									for (local140 = 0; local140 < 64; local140 += 4) {
										@Pc(397) byte local397 = arg4.g1b();
										for (local175 = local136 + arg2; local175 < local136 + arg2 + 4; local175++) {
											for (@Pc(408) int local408 = arg1 + local140; local408 < local140 + arg1 + 4; local408++) {
												if (local175 >= 0 && super.anInt900 > local175 && local408 >= 0 && super.anInt911 > local408) {
													super.aByteArrayArrayArray11[local118][local175][local408] = local397;
												}
											}
										}
									}
								}
							} else if (local124 == 2) {
								if (super.aByteArrayArrayArray11[local118] == null) {
									super.aByteArrayArrayArray11[local118] = new byte[super.anInt900 + 1][super.anInt911 + 1];
								}
								if (local118 > 0) {
									local136 = arg2;
									local140 = arg2 + 64;
									local142 = arg1;
									if (local140 < 0) {
										local140 = 0;
									} else if (super.anInt900 <= local140) {
										local140 = super.anInt900;
									}
									if (arg2 < 0) {
										local136 = 0;
									} else if (super.anInt900 <= arg2) {
										local136 = super.anInt900;
									}
									if (arg1 < 0) {
										local142 = 0;
									} else if (super.anInt911 <= arg1) {
										local142 = super.anInt911;
									}
									local175 = arg1 + 64;
									if (local175 < 0) {
										local175 = 0;
									} else if (local175 >= super.anInt911) {
										local175 = super.anInt911;
									}
									while (local136 < local140) {
										while (local142 < local175) {
											super.aByteArrayArrayArray11[local118][local136][local142] = super.aByteArrayArrayArray11[local118 - 1][local136][local142];
											local142++;
										}
										local136++;
									}
								}
							}
						}
					} else if (arg0 == null) {
						arg4.pos += 10;
					} else {
						arg0[0] = arg4.g2();
						arg0[1] = arg4.g2b();
						arg0[2] = arg4.g2b();
						arg0[3] = arg4.g2b();
						arg0[4] = arg4.g2();
					}
				}
			}
			if (local13 != null) {
				for (local24 = 0; local24 < 8; local24++) {
					for (local118 = 0; local118 < 8; local118++) {
						local496 = (arg2 >> 3) + local24;
						local136 = (arg1 >> 3) + local118;
						if (local496 >= 0 && super.anInt900 >> 3 > local496 && local136 >= 0 && local136 < super.anInt911 >> 3) {
							Static289.method5021(local136, local13, local496);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray11 != null) {
				for (local24 = 0; local24 < 4; local24++) {
					if (super.aByteArrayArrayArray11[local24] != null) {
						for (local118 = 0; local118 < 16; local118++) {
							for (local496 = 0; local496 < 16; local496++) {
								local136 = (arg2 >> 2) + local118;
								local140 = local496 + (arg1 >> 2);
								if (local136 >= 0 && local136 < 26 && local140 >= 0 && local140 < 26) {
									super.aByteArrayArrayArray11[local24][local136][local140] = 0;
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

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!bt;IIIIILclient!wm;[IIII)V")
	public void method1101(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (super.aBoolean73) {
			return;
		}
		if (arg7 != null) {
			arg7[0] = -1;
		}
		@Pc(19) Environment local19 = null;
		@Pc(25) int local25 = (arg5 & 0x7) * 8;
		@Pc(31) int local31 = (arg4 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					@Pc(36) int local36;
					@Pc(117) int local117;
					@Pc(404) int local404;
					@Pc(153) int local153;
					while (arg0.data.length > arg0.pos) {
						local36 = arg0.g1();
						if (local36 == 0) {
							local19 = new Environment(arg0);
						} else {
							@Pc(289) int local289;
							@Pc(168) int local168;
							@Pc(172) int local172;
							@Pc(157) int local157;
							if (local36 == 1) {
								local117 = arg0.g1();
								if (local117 > 0) {
									for (local404 = 0; local404 < local117; local404++) {
										@Pc(411) Class2_Sub26_Sub1 local411 = new Class2_Sub26_Sub1(arg0);
										if (local411.anInt4376 == 31) {
											@Pc(422) LightType local422 = client.LightTypes.method4878(arg0.g2());
											local411.method4154(local422.anInt1880, local422.anInt1879, local422.anInt1877, local422.anInt1883);
										}
										local157 = local411.anInt4370 >> 7;
										local289 = local411.anInt4371 >> 7;
										if (arg3 == local411.anInt4380 && local25 <= local157 && local157 < local25 + 8 && local289 >= local31 && local289 < local31 + 8) {
											local168 = Static382.method6367(arg9, local411.anInt4370 & 0x3FF, local411.anInt4371 & 0x3FF) + (arg8 << 7);
											local172 = Static48.method1467(local411.anInt4371 & 0x3FF, local411.anInt4370 & 0x3FF, arg9) + (arg1 << 7);
											local411.anInt4371 = local172;
											local411.anInt4370 = local168;
											local289 = local411.anInt4371 >> 7;
											local157 = local411.anInt4370 >> 7;
											if (local157 >= 0 && local289 >= 0 && local157 < super.anInt900 && local289 < super.anInt911) {
												local411.anInt4368 = super.levelHeightmap[arg3][local157][local289] - local411.anInt4368;
												if (arg6.method2886() > 0) {
													Static314.method5368(local411);
												}
											}
										}
									}
								}
							} else if (local36 == 2) {
								if (local19 == null) {
									local19 = new Environment();
								}
								local19.method851(arg0);
							} else if (local36 != 128) {
								if (local36 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray11 == null) {
									super.aByteArrayArrayArray11 = new byte[4][][];
								}
								for (local117 = 0; local117 < 4; local117++) {
									@Pc(123) byte local123 = arg0.g1b();
									if (local123 == 0 && super.aByteArrayArrayArray11[arg2] != null) {
										if (local117 <= arg3) {
											local153 = arg8;
											local157 = arg8 + 7;
											local289 = arg1;
											local168 = arg1 + 7;
											if (arg1 < 0) {
												local289 = 0;
											} else if (arg1 >= super.anInt911) {
												local289 = super.anInt911;
											}
											if (arg8 < 0) {
												local153 = 0;
											} else if (super.anInt900 <= arg8) {
												local153 = super.anInt900;
											}
											if (local157 < 0) {
												local157 = 0;
											} else if (super.anInt900 <= local157) {
												local157 = super.anInt900;
											}
											if (local168 < 0) {
												local168 = 0;
											} else if (local168 >= super.anInt911) {
												local168 = super.anInt911;
											}
											while (local157 > local153) {
												while (local168 > local289) {
													super.aByteArrayArrayArray11[arg2][local153][local289] = 0;
													local289++;
												}
												local153++;
											}
										}
									} else if (local123 == 1) {
										if (super.aByteArrayArrayArray11[arg2] == null) {
											super.aByteArrayArrayArray11[arg2] = new byte[super.anInt900 + 1][super.anInt911 + 1];
										}
										for (local153 = 0; local153 < 64; local153 += 4) {
											for (local157 = 0; local157 < 64; local157 += 4) {
												@Pc(163) byte local163 = arg0.g1b();
												if (local117 <= arg3) {
													for (local168 = local153; local168 < local153 + 4; local168++) {
														for (local172 = local157; local172 < local157 + 4; local172++) {
															if (local25 <= local168 && local168 < local25 + 8 && local172 >= local31 && local31 + 8 > local31) {
																@Pc(207) int local207 = arg8 + Static148.method2711(local168 & 0x7, arg9, local172 & 0x7);
																@Pc(219) int local219 = arg1 + Static235.method3344(local168 & 0x7, arg9, local172 & 0x7);
																if (local207 >= 0 && super.anInt900 > local207 && local219 >= 0 && super.anInt911 > local219) {
																	super.aByteArrayArrayArray11[arg2][local207][local219] = local163;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg7 == null) {
								arg0.pos += 10;
							} else {
								arg7[0] = arg0.g2();
								arg7[1] = arg0.g2b();
								arg7[2] = arg0.g2b();
								arg7[3] = arg0.g2b();
								arg7[4] = arg0.g2();
							}
						}
					}
					if (local19 != null) {
						Static289.method5021(arg1 >> 3, local19, arg8 >> 3);
					}
					if (super.aByteArrayArrayArray11 != null && super.aByteArrayArrayArray11[arg2] != null) {
						local36 = arg8 + 7;
						local117 = arg1 + 7;
						for (local404 = arg8; local404 < local36; local404++) {
							for (local153 = arg1; local153 < local117; local153++) {
								super.aByteArrayArrayArray11[arg2][local404][local153] = 0;
							}
						}
					}
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!wm;)V")
	public void method1104(@OriginalArg(1) Class19 arg0) {
		Static169.method3212(arg0);
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (super.anInt912 > 1) {
			for (local21 = 0; local21 < super.anInt900; local21++) {
				for (local25 = 0; super.anInt911 > local25; local25++) {
					if ((Static359.aByteArrayArrayArray16[1][local21][local25] & 0x2) == 2) {
						Static158.method2943(local21, local25);
					}
				}
			}
		}
		for (local21 = 0; super.anInt912 > local21; local21++) {
			for (local25 = 0; super.anInt911 >= local25; local25++) {
				for (@Pc(61) int local61 = 0; super.anInt900 >= local61; local61++) {
					@Pc(79) int local79;
					@Pc(81) int local81;
					@Pc(83) int local83;
					@Pc(109) int local109;
					@Pc(140) int local140;
					@Pc(236) int local236;
					@Pc(245) int local245;
					@Pc(265) int local265;
					@Pc(269) int local269;
					if ((super.levelOccludemap[local21][local61][local25] & 0x1) != 0) {
						local79 = local25;
						local81 = local25;
						local83 = local21;
						while (local79 > 0 && (super.levelOccludemap[local21][local61][local79 - 1] & 0x1) != 0) {
							local79--;
						}
						local109 = local21;
						while (super.anInt911 > local81 && (super.levelOccludemap[local21][local61][local81 + 1] & 0x1) != 0) {
							local81++;
						}
						label164: while (local83 > 0) {
							for (local140 = local79; local140 <= local81; local140++) {
								if ((super.levelOccludemap[local83 - 1][local61][local140] & 0x1) == 0) {
									break label164;
								}
							}
							local83--;
						}
						label153: while (local109 < 3) {
							for (local140 = local79; local140 <= local81; local140++) {
								if ((super.levelOccludemap[local109 + 1][local61][local140] & 0x1) == 0) {
									break label153;
								}
							}
							local109++;
						}
						local140 = (local109 + 1 - local83) * (local81 + 1 - local79);
						if (local140 >= 2) {
							local236 = super.levelHeightmap[local109][local61][local79] - 240;
							local245 = super.levelHeightmap[local83][local61][local79];
							Scene.addOccluder(1, local61 * 128, local61 * 128, local79 * 128, local81 * 128 + 128, local236, local245);
							for (local265 = local83; local265 <= local109; local265++) {
								for (local269 = local79; local269 <= local81; local269++) {
									super.levelOccludemap[local265][local61][local269] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.levelOccludemap[local21][local61][local25] & 0x2) != 0) {
						local79 = local61;
						local81 = local61;
						local83 = local21;
						while (local79 > 0 && (super.levelOccludemap[local21][local79 - 1][local25] & 0x2) != 0) {
							local79--;
						}
						while (super.anInt900 > local81 && (super.levelOccludemap[local21][local81 + 1][local25] & 0x2) != 0) {
							local81++;
						}
						local109 = local21;
						label218: while (local83 > 0) {
							for (local140 = local79; local140 <= local81; local140++) {
								if ((super.levelOccludemap[local83 - 1][local140][local25] & 0x2) == 0) {
									break label218;
								}
							}
							local83--;
						}
						label207: while (local109 < 3) {
							for (local140 = local79; local140 <= local81; local140++) {
								if ((super.levelOccludemap[local109 + 1][local140][local25] & 0x2) == 0) {
									break label207;
								}
							}
							local109++;
						}
						local140 = (local109 + 1 - local83) * (local81 + 1 - local79);
						if (local140 >= 2) {
							local236 = super.levelHeightmap[local109][local79][local25] - 240;
							local245 = super.levelHeightmap[local83][local79][local25];
							Scene.addOccluder(2, local79 * 128, local81 * 128 + 128, local25 * 128, local25 * 128, local236, local245);
							for (local265 = local83; local265 <= local109; local265++) {
								for (local269 = local79; local269 <= local81; local269++) {
									super.levelOccludemap[local265][local269][local25] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.levelOccludemap[local21][local61][local25] & 0x4) != 0) {
						local79 = local61;
						local81 = local61;
						for (local83 = local25; local83 > 0 && (super.levelOccludemap[local21][local61][local83 - 1] & 0x4) != 0; local83--) {
						}
						for (local109 = local25; local109 < super.anInt911 && (super.levelOccludemap[local21][local61][local109 + 1] & 0x4) != 0; local109++) {
						}
						label272: while (local79 > 0) {
							for (local140 = local83; local140 <= local109; local140++) {
								if ((super.levelOccludemap[local21][local79 - 1][local140] & 0x4) == 0) {
									break label272;
								}
							}
							local79--;
						}
						label261: while (super.anInt900 > local81) {
							for (local140 = local83; local140 <= local109; local140++) {
								if ((super.levelOccludemap[local21][local81 + 1][local140] & 0x4) == 0) {
									break label261;
								}
							}
							local81++;
						}
						if ((local109 + 1 - local83) * (local81 - (local79 - 1)) >= 4) {
							local140 = super.levelHeightmap[local21][local79][local83];
							Scene.addOccluder(4, local79 * 128, local81 * 128 + 128, local83 * 128, local109 * 128 + 128, local140, local140);
							for (@Pc(706) int local706 = local79; local706 <= local81; local706++) {
								for (local236 = local83; local236 <= local109; local236++) {
									super.levelOccludemap[local21][local706][local236] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.levelOccludemap = null;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIIILclient!wm;Lclient!dg;II)V")
	public void method1105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class19 arg6, @OriginalArg(8) Class46 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!client.preferences.method4495(Static77.anInt1762) && !Static142.method2661(arg2, Static44.anInt1115, arg4, arg1)) {
			return;
		}
		if (arg5 < this.anInt922) {
			this.anInt922 = arg5;
		}
		@Pc(30) LocType local30 = client.LocTypes.method5163(arg3);
		if (Static77.anInt1762 == 1 && local30.aBoolean112) {
			return;
		}
		@Pc(48) int local48;
		@Pc(51) int local51;
		if (arg0 == 1 || arg0 == 3) {
			local51 = local30.anInt1356;
			local48 = local30.anInt1327;
		} else {
			local48 = local30.anInt1356;
			local51 = local30.anInt1327;
		}
		@Pc(93) int local93;
		@Pc(87) int local87;
		if (arg1 + local48 <= super.anInt900) {
			local87 = arg1 + (local48 + 1 >> 1);
			local93 = arg1 + (local48 >> 1);
		} else {
			local93 = arg1;
			local87 = arg1 + 1;
		}
		@Pc(114) int local114;
		@Pc(112) int local112;
		if (arg2 + local51 > super.anInt911) {
			local112 = arg2 + 1;
			local114 = arg2;
		} else {
			local114 = arg2 + (local51 >> 1);
			local112 = (local51 + 1 >> 1) + arg2;
		}
		@Pc(134) Class6 local134 = Scene.aClass6Array4[arg4];
		@Pc(158) int local158 = local134.method5719(local93, local114) + local134.method5719(local87, local114) + local134.method5719(local93, local112) + local134.method5719(local87, local112) >> 2;
		@Pc(166) int local166 = (local48 << 6) + (arg1 << 7);
		@Pc(174) int local174 = (local51 << 6) + (arg2 << 7);
		@Pc(186) boolean local186 = Static263.aBoolean330 && !super.aBoolean73 && local30.aBoolean116;
		if (local30.method1522()) {
			AreaSoundManager.add(local30, arg2, arg0, null, null, arg1, arg5);
		}
		@Pc(220) boolean local220 = arg9 == -1 && local30.anInt1326 == -1 && local30.anIntArray95 == null && local30.anIntArray94 == null && !local30.aBoolean107;
		if (Static160.showocc && local30.anInt1321 != 1) {
			return;
		}
		if (arg8 != 22) {
			@Pc(373) Entity local373;
			@Pc(334) Class11_Sub5_Sub1 local334;
			@Pc(369) int local369;
			if (arg8 == 10 || arg8 == 11) {
				local334 = null;
				if (local220) {
					@Pc(365) Class11_Sub5_Sub1 local365 = new Class11_Sub5_Sub1(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg1, arg1 + local48 - 1, arg2, local51 + arg2 - 1, arg8, arg0, local186);
					local369 = local365.method2148();
					local334 = local365;
					local373 = local365;
				} else {
					local373 = new Class11_Sub5_Sub5(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg1, arg1 + local48 - 1, arg2, arg2 + local51 - 1, arg8, arg0, arg9);
					local369 = 15;
				}
				@Pc(417) Entity local417 = Static105.method2207(arg5, arg1, arg2, Interface6.class);
				@Pc(419) boolean local419 = false;
				if (local417 instanceof Class11_Sub5_Sub6 && arg1 == local417.aShort103 && local417.aShort101 == arg2) {
					((Class11_Sub5_Sub6) local417).aClass11_Sub5_2 = local373;
					local419 = true;
				}
				if (local419 || Static329.method5630(local373, false)) {
					if (local334 != null && local334.method6086()) {
						local334.method6087(arg6);
					}
					if (local30.aBoolean106 && Static263.aBoolean330) {
						if (local369 > 30) {
							local369 = 30;
						}
						for (@Pc(468) int local468 = 0; local468 <= local48; local468++) {
							for (@Pc(472) int local472 = 0; local472 <= local51; local472++) {
								local134.method5723(local468 + arg1, local472 + arg2, local369);
							}
						}
					}
				}
				if (local30.anInt1324 != 0 && arg7 != null) {
					arg7.method1639(local30.aBoolean114, local51, arg1, !local30.aBoolean105, arg2, local48);
				}
			} else {
				@Pc(621) Entity local621;
				if (arg8 >= 12 && arg8 <= 17 || arg8 >= 18 && arg8 <= 21) {
					if (local220) {
						local334 = new Class11_Sub5_Sub1(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg1, arg1 + local48 - 1, arg2, local51 + arg2 - 1, arg8, arg0, local186);
						local373 = local334;
						if (local334.method6086()) {
							local334.method6087(arg6);
						}
					} else {
						local373 = new Class11_Sub5_Sub5(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg1, local48 + arg1 - 1, arg2, arg2 + local51 - 1, arg8, arg0, arg9);
					}
					local621 = Static105.method2207(arg5, arg1, arg2, Interface6.class);
					if (local621 instanceof Class11_Sub5_Sub6 && local621.aShort103 == arg1 && local621.aShort101 == arg2) {
						((Class11_Sub5_Sub6) local621).aClass11_Sub5_2 = local373;
					} else {
						Static329.method5630(local373, false);
					}
					if (Static263.aBoolean330 && !super.aBoolean73 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg5 > 0 && local30.anInt1321 != 0) {
						super.levelOccludemap[arg5][arg1][arg2] = (byte) (super.levelOccludemap[arg5][arg1][arg2] | 0x4);
					}
					if (local30.anInt1324 != 0 && arg7 != null) {
						arg7.method1639(local30.aBoolean114, local51, arg1, !local30.aBoolean105, arg2, local48);
					}
				} else {
					@Pc(742) Class11_Sub1 local742;
					if (arg8 == 0) {
						@Pc(714) int local714 = local30.anInt1321;
						if (Static263.wallocc && local30.anInt1321 == -1) {
							local714 = 1;
						}
						if (local220) {
							@Pc(740) Class11_Sub1_Sub3 local740 = new Class11_Sub1_Sub3(arg6, local30, arg4, local166, local158, local174, super.aBoolean73, arg8, arg0, local186);
							local742 = local740;
							if (local740.method6086()) {
								local740.method6087(arg6);
							}
						} else {
							local742 = new Class11_Sub1_Sub2(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg8, arg0, arg9);
						}
						@Pc(773) Class11_Sub1 local773 = Static12.method283(arg5, arg1, arg2);
						if (local773 instanceof Class11_Sub1_Sub1) {
							((Class11_Sub1_Sub1) local773).aClass11_Sub1_1 = local742;
						} else {
							Static4.method73(arg5, arg1, arg2, local742, null);
						}
						if (Static263.aBoolean330) {
							if (arg0 == 0) {
								if (local30.aBoolean106) {
									local134.method5723(arg1, arg2, 50);
									local134.method5723(arg1, arg2 + 1, 50);
								}
								if (local714 == 1 && !super.aBoolean73) {
									super.levelOccludemap[arg5][arg1][arg2] = (byte) (super.levelOccludemap[arg5][arg1][arg2] | 0x1);
								}
							} else if (arg0 == 1) {
								if (local30.aBoolean106) {
									local134.method5723(arg1, arg2 + 1, 50);
									local134.method5723(arg1 + 1, arg2 + 1, 50);
								}
								if (local714 == 1 && !super.aBoolean73) {
									super.levelOccludemap[arg5][arg1][arg2 + 1] = (byte) (super.levelOccludemap[arg5][arg1][arg2 + 1] | 0x2);
								}
							} else if (arg0 == 2) {
								if (local30.aBoolean106) {
									local134.method5723(arg1 + 1, arg2, 50);
									local134.method5723(arg1 + 1, arg2 + 1, 50);
								}
								if (local714 == 1 && !super.aBoolean73) {
									super.levelOccludemap[arg5][arg1 + 1][arg2] = (byte) (super.levelOccludemap[arg5][arg1 + 1][arg2] | 0x1);
								}
							} else if (arg0 == 3) {
								if (local30.aBoolean106) {
									local134.method5723(arg1, arg2, 50);
									local134.method5723(arg1 + 1, arg2, 50);
								}
								if (local714 == 1 && !super.aBoolean73) {
									super.levelOccludemap[arg5][arg1][arg2] = (byte) (super.levelOccludemap[arg5][arg1][arg2] | 0x2);
								}
							}
						}
						if (local30.anInt1324 != 0 && arg7 != null) {
							arg7.method1638(arg0, arg2, arg1, local30.aBoolean114, arg8, !local30.aBoolean105);
						}
						if (local30.anInt1340 != 16) {
							Static285.method4894(arg5, arg1, arg2, local30.anInt1340);
						}
					} else {
						@Pc(1050) Class11_Sub1_Sub3 local1050;
						@Pc(1052) Class11_Sub1 local1052;
						if (arg8 == 1) {
							if (local220) {
								local1050 = new Class11_Sub1_Sub3(arg6, local30, arg4, local166, local158, local174, super.aBoolean73, arg8, arg0, local186);
								local1052 = local1050;
								if (local1050.method6086()) {
									local1050.method6087(arg6);
								}
							} else {
								local1052 = new Class11_Sub1_Sub2(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg8, arg0, arg9);
							}
							local742 = Static12.method283(arg5, arg1, arg2);
							if (local742 instanceof Class11_Sub1_Sub1) {
								((Class11_Sub1_Sub1) local742).aClass11_Sub1_1 = local1052;
							} else {
								Static4.method73(arg5, arg1, arg2, local1052, null);
							}
							if (local30.aBoolean106 && Static263.aBoolean330) {
								if (arg0 == 0) {
									local134.method5723(arg1, arg2 + 1, 50);
								} else if (arg0 == 1) {
									local134.method5723(arg1 + 1, arg2 + 1, 50);
								} else if (arg0 == 2) {
									local134.method5723(arg1 + 1, arg2, 50);
								} else if (arg0 == 3) {
									local134.method5723(arg1, arg2, 50);
								}
							}
							if (local30.anInt1324 != 0 && arg7 != null) {
								arg7.method1638(arg0, arg2, arg1, local30.aBoolean114, arg8, !local30.aBoolean105);
							}
						} else if (arg8 == 2) {
							local369 = arg0 + 1 & 0x3;
							if (local220) {
								@Pc(1204) Class11_Sub1_Sub3 local1204 = new Class11_Sub1_Sub3(arg6, local30, arg4, local166, local158, local174, super.aBoolean73, arg8, arg0 + 4, local186);
								@Pc(1219) Class11_Sub1_Sub3 local1219 = new Class11_Sub1_Sub3(arg6, local30, arg4, local166, local158, local174, super.aBoolean73, arg8, local369, local186);
								if (local1204.method6086()) {
									local1204.method6087(arg6);
								}
								local1052 = local1204;
								local742 = local1219;
								if (local1219.method6086()) {
									local1219.method6087(arg6);
								}
							} else {
								local1052 = new Class11_Sub1_Sub2(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg8, arg0 + 4, arg9);
								local742 = new Class11_Sub1_Sub2(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg8, local369, arg9);
							}
							Static4.method73(arg5, arg1, arg2, local1052, local742);
							if (local30.anInt1321 == 1 && Static263.aBoolean330 && !super.aBoolean73) {
								if (arg0 == 0) {
									super.levelOccludemap[arg5][arg1][arg2] = (byte) (super.levelOccludemap[arg5][arg1][arg2] | 0x1);
									super.levelOccludemap[arg5][arg1][arg2 + 1] = (byte) (super.levelOccludemap[arg5][arg1][arg2 + 1] | 0x2);
								} else if (arg0 == 1) {
									super.levelOccludemap[arg5][arg1][arg2 + 1] = (byte) (super.levelOccludemap[arg5][arg1][arg2 + 1] | 0x2);
									super.levelOccludemap[arg5][arg1 + 1][arg2] = (byte) (super.levelOccludemap[arg5][arg1 + 1][arg2] | 0x1);
								} else if (arg0 == 2) {
									super.levelOccludemap[arg5][arg1 + 1][arg2] = (byte) (super.levelOccludemap[arg5][arg1 + 1][arg2] | 0x1);
									super.levelOccludemap[arg5][arg1][arg2] = (byte) (super.levelOccludemap[arg5][arg1][arg2] | 0x2);
								} else if (arg0 == 3) {
									super.levelOccludemap[arg5][arg1][arg2] = (byte) (super.levelOccludemap[arg5][arg1][arg2] | 0x2);
									super.levelOccludemap[arg5][arg1][arg2] = (byte) (super.levelOccludemap[arg5][arg1][arg2] | 0x1);
								}
							}
							if (local30.anInt1324 != 0 && arg7 != null) {
								arg7.method1638(arg0, arg2, arg1, local30.aBoolean114, arg8, !local30.aBoolean105);
							}
							if (local30.anInt1340 != 16) {
								Static285.method4894(arg5, arg1, arg2, local30.anInt1340);
							}
						} else if (arg8 == 3) {
							if (local220) {
								local1050 = new Class11_Sub1_Sub3(arg6, local30, arg4, local166, local158, local174, super.aBoolean73, arg8, arg0, local186);
								local1052 = local1050;
								if (local1050.method6086()) {
									local1050.method6087(arg6);
								}
							} else {
								local1052 = new Class11_Sub1_Sub2(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg8, arg0, arg9);
							}
							local742 = Static12.method283(arg5, arg1, arg2);
							if (local742 instanceof Class11_Sub1_Sub1) {
								((Class11_Sub1_Sub1) local742).aClass11_Sub1_1 = local1052;
							} else {
								Static4.method73(arg5, arg1, arg2, local1052, null);
							}
							if (local30.aBoolean106 && Static263.aBoolean330) {
								if (arg0 == 0) {
									local134.method5723(arg1, arg2 + 1, 50);
								} else if (arg0 == 1) {
									local134.method5723(arg1 + 1, arg2 - -1, 50);
								} else if (arg0 == 2) {
									local134.method5723(arg1 + 1, arg2, 50);
								} else if (arg0 == 3) {
									local134.method5723(arg1, arg2, 50);
								}
							}
							if (local30.anInt1324 != 0 && arg7 != null) {
								arg7.method1638(arg0, arg2, arg1, local30.aBoolean114, arg8, !local30.aBoolean105);
							}
						} else if (arg8 == 9) {
							if (local220) {
								local334 = new Class11_Sub5_Sub1(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg1, arg1, arg2, arg2, arg8, arg0, local186);
								local373 = local334;
								if (local334.method6086()) {
									local334.method6087(arg6);
								}
							} else {
								local373 = new Class11_Sub5_Sub5(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg1, arg1 + local48 - 1, arg2, arg2 + local51 - 1, arg8, arg0, arg9);
							}
							local621 = Static105.method2207(arg5, arg1, arg2, Interface6.class);
							if (local621 instanceof Class11_Sub5_Sub6 && arg1 == local621.aShort103 && local621.aShort101 == arg2) {
								((Class11_Sub5_Sub6) local621).aClass11_Sub5_2 = local373;
							} else {
								Static329.method5630(local373, false);
							}
							if (local30.anInt1324 != 0 && arg7 != null) {
								arg7.method1639(local30.aBoolean114, local51, arg1, !local30.aBoolean105, arg2, local48);
							}
							if (local30.anInt1340 != 16) {
								Static285.method4894(arg5, arg1, arg2, local30.anInt1340);
							}
						} else {
							@Pc(1837) Class11_Sub3 local1837;
							if (arg8 == 4) {
								if (local220) {
									@Pc(1856) Class11_Sub3_Sub2 local1856 = new Class11_Sub3_Sub2(arg6, local30, arg4, local166, local158, local174, super.aBoolean73, 0, 0, 0, arg8, arg0);
									if (local1856.method6086()) {
										local1856.method6087(arg6);
									}
									local1837 = local1856;
								} else {
									local1837 = new Class11_Sub3_Sub3(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, 0, 0, 0, arg8, arg0, arg9);
								}
								@Pc(1871) Class11_Sub3 local1871 = Static28.method893(arg5, arg1, arg2);
								if (local1871 instanceof Class11_Sub3_Sub1) {
									((Class11_Sub3_Sub1) local1871).aClass11_Sub3_1 = local1837;
								} else {
									Static94.method2044(arg5, arg1, arg2, local1837, null);
								}
							} else {
								@Pc(1893) int local1893;
								@Pc(1899) Interface6 local1899;
								@Pc(1965) Class11_Sub3_Sub2 local1965;
								@Pc(1980) Class11_Sub3 local1980;
								if (arg8 == 5) {
									local1893 = 16;
									local1899 = (Interface6) Static12.method283(arg5, arg1, arg2);
									if (local1899 != null) {
										local1893 = client.LocTypes.method5163(local1899.method6085()).anInt1340;
									}
									if (local220) {
										local1965 = new Class11_Sub3_Sub2(arg6, local30, arg4, local166, local158, local174, super.aBoolean73, 0, Static325.anIntArray413[arg0] * local1893, local1893 * Static148.anIntArray172[arg0], arg8, arg0);
										local1837 = local1965;
										if (local1965.method6086()) {
											local1965.method6087(arg6);
										}
									} else {
										local1837 = new Class11_Sub3_Sub3(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, 0, Static325.anIntArray413[arg0] * local1893, Static148.anIntArray172[arg0] * local1893, arg8, arg0, arg9);
									}
									local1980 = Static28.method893(arg5, arg1, arg2);
									if (local1980 instanceof Class11_Sub3_Sub1) {
										((Class11_Sub3_Sub1) local1980).aClass11_Sub3_1 = local1837;
									} else {
										Static94.method2044(arg5, arg1, arg2, local1837, null);
									}
								} else if (arg8 == 6) {
									local1893 = 8;
									local1899 = (Interface6) Static12.method283(arg5, arg1, arg2);
									if (local1899 != null) {
										local1893 = client.LocTypes.method5163(local1899.method6085()).anInt1340 / 2;
									}
									if (local220) {
										local1965 = new Class11_Sub3_Sub2(arg6, local30, arg4, local166, local158, local174, super.aBoolean73, arg0, Static325.anIntArray413[arg0] * local1893, local1893 * Static148.anIntArray172[arg0], arg8, arg0 + 4);
										local1837 = local1965;
										if (local1965.method6086()) {
											local1965.method6087(arg6);
										}
									} else {
										local1837 = new Class11_Sub3_Sub3(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg0, Static57.anIntArray104[arg0] * local1893, local1893 * Static134.anIntArray163[arg0], arg8, arg0 + 4, arg9);
									}
									local1980 = Static28.method893(arg5, arg1, arg2);
									if (local1980 instanceof Class11_Sub3_Sub1) {
										((Class11_Sub3_Sub1) local1980).aClass11_Sub3_1 = local1837;
									} else {
										Static94.method2044(arg5, arg1, arg2, local1837, null);
									}
								} else if (arg8 == 7) {
									local1893 = arg0 + 2 & 0x3;
									if (local220) {
										@Pc(2140) Class11_Sub3_Sub2 local2140 = new Class11_Sub3_Sub2(arg6, local30, arg4, local166, local158, local174, super.aBoolean73, local1893, 0, 0, arg8, local1893 + 4);
										if (local2140.method6086()) {
											local2140.method6087(arg6);
										}
										local1837 = local2140;
									} else {
										local1837 = new Class11_Sub3_Sub3(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, local1893, 0, 0, arg8, local1893 + 4, arg9);
									}
									@Pc(2178) Class11_Sub3 local2178 = Static28.method893(arg5, arg1, arg2);
									if (local2178 instanceof Class11_Sub3_Sub1) {
										((Class11_Sub3_Sub1) local2178).aClass11_Sub3_1 = local1837;
									} else {
										Static94.method2044(arg5, arg1, arg2, local1837, null);
									}
								} else if (arg8 == 8) {
									local369 = arg0 + 2 & 0x3;
									@Pc(2204) int local2204 = 8;
									@Pc(2210) Interface6 local2210 = (Interface6) Static12.method283(arg5, arg1, arg2);
									if (local2210 != null) {
										local2204 = client.LocTypes.method5163(local2210.method6085()).anInt1340 / 2;
									}
									@Pc(2251) Class11_Sub3 local2251;
									@Pc(2270) Class11_Sub3 local2270;
									if (local220) {
										local2251 = new Class11_Sub3_Sub2(arg6, local30, arg4, local166, local158, local174, super.aBoolean73, arg0, local2204 * Static57.anIntArray104[arg0], Static134.anIntArray163[arg0] * local2204, arg8, arg0 + 4);
										local2270 = new Class11_Sub3_Sub2(arg6, local30, arg4, local166, local158, local174, super.aBoolean73, arg0, 0, 0, arg8, local369 + 4);
										if (local2251.method6086()) {
											local2251.method6087(arg6);
										}
										if (local2270.method6086()) {
											local2270.method6087(arg6);
										}
									} else {
										local2251 = new Class11_Sub3_Sub3(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg0, local2204 * Static57.anIntArray104[arg0], local2204 * Static134.anIntArray163[arg0], arg8, arg0 + 4, arg9);
										local2270 = new Class11_Sub3_Sub3(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg0, 0, 0, arg8, local369 + 4, arg9);
									}
									Static94.method2044(arg5, arg1, arg2, local2251, local2270);
								}
							}
						}
					}
				}
			}
		} else if (client.preferences.aBoolean359 || local30.anInt1335 != 0 || local30.anInt1324 == 1 || local30.aBoolean117) {
			@Pc(266) Class11_Sub2 local266;
			if (local220) {
				@Pc(264) Class11_Sub2_Sub1 local264 = new Class11_Sub2_Sub1(arg6, local30, arg4, local166, local158, local174, super.aBoolean73, arg0, local186);
				local266 = local264;
				if (local264.method6086()) {
					local264.method6087(arg6);
				}
			} else {
				local266 = new Class11_Sub2_Sub3(arg6, local30, arg5, arg4, local166, local158, local174, super.aBoolean73, arg0, arg9);
			}
			@Pc(296) Class11_Sub2 local296 = Static26.method865(arg5, arg1, arg2);
			if (local296 instanceof Class11_Sub2_Sub2) {
				((Class11_Sub2_Sub2) local296).aClass11_Sub2_1 = local266;
			} else {
				Static29.method938(arg5, arg1, arg2, local266);
			}
			if (local30.anInt1324 == 1 && arg7 != null) {
				arg7.method1634(arg2, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIII[BBILclient!wm;[Lclient!dg;II)V")
	public void method1107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class19 arg6, @OriginalArg(8) Class46[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(14) Buffer local14 = new Buffer(arg4);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.gVarSmart();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.gsmart();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local28 & 0x3F;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 >> 12;
				@Pc(58) int local58 = local14.g1();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				if (arg1 == local54 && local50 >= arg3 && arg3 + 8 > local50 && arg9 <= local44 && arg9 + 8 > local44) {
					@Pc(98) LocType local98 = client.LocTypes.method5163(local16);
					@Pc(115) int local115 = arg5 + Static50.method1528(local50 & 0x7, arg0, local66, local98.anInt1356, local98.anInt1327, local44 & 0x7);
					@Pc(132) int local132 = arg8 + Static33.method4205(arg0, local66, local50 & 0x7, local98.anInt1356, local44 & 0x7, local98.anInt1327);
					if (local115 > 0 && local132 > 0 && super.anInt900 - 1 > local115 && local132 < super.anInt911 - 1) {
						@Pc(160) Class46 local160 = null;
						if (!super.aBoolean73) {
							@Pc(165) int local165 = arg2;
							if ((Static359.aByteArrayArrayArray16[1][local115][local132] & 0x2) == 2) {
								local165 = arg2 - 1;
							}
							if (local165 >= 0) {
								local160 = arg7[local165];
							}
						}
						this.method1105(local66 + arg0 & 0x3, local115, local132, local16, arg2, arg2, arg6, local160, local62, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IILclient!dg;IIILclient!wm;)V")
	public void method1108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class19 arg5) {
		@Pc(7) Interface6 local7 = null;
		if (arg3 == 0) {
			local7 = (Interface6) Static12.method283(arg0, arg1, arg4);
		}
		if (arg3 == 1) {
			local7 = (Interface6) Static28.method893(arg0, arg1, arg4);
		}
		if (arg3 == 2) {
			local7 = (Interface6) Static105.method2207(arg0, arg1, arg4, Interface6.class);
		}
		if (arg3 == 3) {
			local7 = (Interface6) Static26.method865(arg0, arg1, arg4);
		}
		if (local7 == null) {
			return;
		}
		@Pc(70) LocType local70 = client.LocTypes.method5163(local7.method6085());
		@Pc(74) int local74 = local7.method6081();
		@Pc(78) int local78 = local7.method6084();
		if (local70.method1522()) {
			Static109.method2264(arg0, arg1, arg4, local70);
		}
		if (local7.method6086()) {
			local7.method6083(arg5);
		}
		if (arg3 != 0) {
			if (arg3 == 1) {
				@Pc(108) Class11_Sub3 local108 = Static28.method893(arg0, arg1, arg4);
				if (local108 instanceof Class11_Sub3_Sub1) {
					((Class11_Sub3_Sub1) local108).aClass11_Sub3_1 = null;
					return;
				}
				Static201.method3654(arg0, arg1, arg4);
				return;
			}
			if (arg3 == 2) {
				@Pc(168) Entity local168 = Static105.method2207(arg0, arg1, arg4, Interface6.class);
				if (local168 instanceof Class11_Sub5_Sub6 && arg1 == local168.aShort103 && local168.aShort101 == arg4) {
					((Class11_Sub5_Sub6) local168).aClass11_Sub5_2 = null;
				} else {
					Static188.method3466(arg0, arg1, arg4, Interface6.class);
				}
				if (local70.anInt1324 == 0 || super.anInt900 <= arg1 + local70.anInt1356 || local70.anInt1356 + arg4 >= super.anInt911 || super.anInt900 <= arg1 + local70.anInt1327 || local70.anInt1327 + arg4 >= super.anInt911) {
					return;
				}
				arg2.method1641(local78, local70.anInt1356, !local70.aBoolean105, local70.aBoolean114, arg1, arg4, local70.anInt1327);
			} else if (arg3 == 3) {
				@Pc(132) Class11_Sub2 local132 = Static26.method865(arg0, arg1, arg4);
				if (local132 instanceof Class11_Sub2_Sub2) {
					((Class11_Sub2_Sub2) local132).aClass11_Sub2_1 = null;
				} else {
					Static370.method6246(arg0, arg1, arg4);
				}
				if (local70.anInt1324 == 1) {
					arg2.method1628(arg1, arg4);
					return;
				}
			}
			return;
		}
		@Pc(261) Class11_Sub1 local261 = Static12.method283(arg0, arg1, arg4);
		if (local261 instanceof Class11_Sub1_Sub1) {
			((Class11_Sub1_Sub1) local261).aClass11_Sub1_1 = null;
		} else {
			Static259.method4429(arg0, arg1, arg4);
		}
		if (local70.anInt1324 != 0) {
			arg2.method1625(local70.aBoolean114, !local70.aBoolean105, arg1, arg4, local78, local74);
			return;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "([Lclient!dg;II[BILclient!wm;)V")
	public void method1109(@OriginalArg(0) Class46[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class19 arg4) {
		@Pc(10) Buffer local10 = new Buffer(arg2);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.gVarSmart();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local10.gsmart();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(53) int local53 = local31 >> 6 & 0x3F;
				@Pc(57) int local57 = local31 >> 12;
				@Pc(61) int local61 = local10.g1();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = local53 + arg3;
				@Pc(78) int local78 = local47 + arg1;
				if (local73 > 0 && local78 > 0 && local73 < super.anInt900 - 1 && super.anInt911 - 1 > local78) {
					@Pc(102) Class46 local102 = null;
					if (!super.aBoolean73) {
						@Pc(107) int local107 = local57;
						if ((Static359.aByteArrayArrayArray16[1][local73][local78] & 0x2) == 2) {
							local107 = local57 - 1;
						}
						if (local107 >= 0) {
							local102 = arg0[local107];
						}
					}
					this.method1105(local69, local73, local78, local16, local57, local57, arg4, local102, local65, -1);
				}
			}
		}
	}
}
