import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public static int anInt4046;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII)V")
	public static void method3995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = PlayerList.anInt751;
		Static45.anInt1196 = 0;
		@Pc(11) int[] local11 = PlayerList.anIntArray121;
		@Pc(194) int local194;
		@Pc(217) int local217;
		@Pc(261) int local261;
		@Pc(435) int local435;
		@Pc(546) int local546;
		@Pc(663) int local663;
		@Pc(322) int local322;
		for (@Pc(13) int local13 = 0; local13 < NpcList.size + local7; local13++) {
			@Pc(17) NpcType local17 = null;
			@Pc(33) PathingEntity local33;
			if (local7 <= local13) {
				local33 = NpcList.npcs[NpcList.ids[local13 - local7]];
				local17 = ((Npc) local33).type;
				if (local17.multiNpcs != null) {
					local17 = local17.getMultiNpc(Static214.aClass226_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local33 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local11[local13]];
			}
			if (local33.anInt4638 >= 0 && (Static163.anInt3086 == local33.anInt4603 || PlayerList.self.plane == local33.plane)) {
				Static250.method4344(local33.method4323(), local33, arg1 >> 1, arg2 >> 1);
				if (Static216.anIntArray231[0] >= 0) {
					if (local33.aString50 != null && (local13 >= local7 || Static20.anInt545 == 0 || Static20.anInt545 == 3 || Static20.anInt545 == 1 && FriendsList.contains(((Player) local33).username)) && Static319.anInt5977 > Static45.anInt1196) {
						Static319.anIntArray398[Static45.anInt1196] = Static113.aClass239_2.method6126(local33.aString50) / 2;
						Static319.anIntArray397[Static45.anInt1196] = Static216.anIntArray231[0];
						Static319.anIntArray402[Static45.anInt1196] = Static216.anIntArray231[1];
						Static319.anIntArray399[Static45.anInt1196] = local33.anInt4618;
						Static319.anIntArray400[Static45.anInt1196] = local33.anInt4600;
						Static319.anIntArray401[Static45.anInt1196] = local33.anInt4636;
						Static319.aStringArray55[Static45.anInt1196] = local33.aString50;
						Static45.anInt1196++;
					}
					@Pc(180) Sprite local180 = Static62.aClass13Array9[0];
					local194 = arg3 + Static216.anIntArray231[1] - Math.max(Static113.aClass239_2.anInt6836, local180.method6382());
					@Pc(209) Sprite local209;
					@Pc(310) int local310;
					if (!local33.aBoolean320 && client.cycle < local33.anInt4606) {
						local209 = Static62.aClass13Array9[1];
						if (local33 instanceof Npc) {
							local217 = local17.anInt2028;
							if (local217 == -1) {
								local217 = local33.method4332().anInt6304;
							}
						} else {
							local217 = local33.method4332().anInt6304;
						}
						if (local217 != -1) {
							@Pc(246) Sprite[] local246 = (Sprite[]) Static306.aClass98_49.get((long) local217);
							if (local246 == null) {
								@Pc(253) Class48[] local253 = Static396.method1688(client.jsArchive8, local217);
								if (local253 != null) {
									local246 = new Sprite[local253.length];
									for (local261 = 0; local261 < local253.length; local261++) {
										local246[local261] = Static190.aClass19_8.method2891(local253[local261]);
									}
									Static306.aClass98_49.put((long) local217, local246);
								}
							}
							if (local246 != null && local246.length == 2) {
								local180 = local246[0];
								local209 = local246[1];
							}
						}
						local310 = arg0 + Static216.anIntArray231[0] - (local180.method6389() >> 1);
						local180.method6385(local310, local194);
						local322 = local180.method6389() * local33.anInt4631 / 255;
						if (local33.anInt4631 > 0 && local322 < 2) {
							local322 = 2;
						}
						Static190.aClass19_8.method2817(local310, local194, local322 + local310, local194 + local180.method6382());
						local209.method6385(local310, local194);
						Static190.aClass19_8.method2895(arg0, arg3, arg0 + arg1, arg3 - -arg2);
					}
					local194 -= 2;
					if (!local33.aBoolean320) {
						if (client.cycle < local33.anInt4621) {
							local209 = Static332.aClass13Array23[local33.aBoolean319 ? 2 : 0];
							@Pc(386) Sprite local386 = Static332.aClass13Array23[local33.aBoolean319 ? 3 : 1];
							if (local33 instanceof Npc) {
								local310 = local17.anInt2042;
								if (local310 == -1) {
									local310 = local33.method4332().anInt6288;
								}
							} else {
								local310 = local33.method4332().anInt6288;
							}
							if (local310 != -1) {
								@Pc(420) Sprite[] local420 = (Sprite[]) Static139.aClass98_18.get((long) local310);
								if (local420 == null) {
									@Pc(427) Class48[] local427 = Static396.method1688(client.jsArchive8, local310);
									if (local427 != null) {
										local420 = new Sprite[local427.length];
										for (local435 = 0; local435 < local427.length; local435++) {
											local420[local435] = Static190.aClass19_8.method2891(local427[local435]);
										}
										Static139.aClass98_18.put((long) local310, local420);
									}
								}
								if (local420 != null && local420.length == 4) {
									local386 = local420[local33.aBoolean319 ? 3 : 1];
									local209 = local420[local33.aBoolean319 ? 2 : 0];
								}
							}
							local322 = local33.anInt4621 - client.cycle;
							if (local322 > local33.anInt4578) {
								local322 -= local33.anInt4578;
								local435 = local33.anInt4591 == 0 ? 0 : (local33.anInt4623 - local322) / local33.anInt4591 * local33.anInt4591;
								local261 = local209.method6389() * local435 / local33.anInt4623;
							} else {
								local261 = local209.method6389();
							}
							local435 = local209.method6382();
							local194 -= local435;
							local546 = Static216.anIntArray231[0] + arg0 - (local209.method6389() >> 1);
							local209.method6385(local546, local194);
							Static190.aClass19_8.method2817(local546, local194, local261 + local546, local194 - -local435);
							local386.method6385(local546, local194);
							local194 -= 2;
							Static190.aClass19_8.method2895(arg0, arg3, arg1 + arg0, arg3 - -arg2);
						}
						if (local13 < local7) {
							@Pc(587) Player local587 = (Player) local33;
							if (local587.pkIcon != -1) {
								local194 -= 25;
								Static232.aClass13Array17[local587.pkIcon].method6385(Static216.anIntArray231[0] + arg0 - 12, local194);
								local194 -= 2;
							}
							if (local587.prayerIcon != -1) {
								local194 -= 25;
								Static137.aClass13Array13[local587.prayerIcon].method6385(arg0 + Static216.anIntArray231[0] - 12, local194);
								local194 -= 2;
							}
						} else if (local17.anInt2050 >= 0 && local17.anInt2050 < Static137.aClass13Array13.length) {
							local209 = Static137.aClass13Array13[local17.anInt2050];
							local194 -= 25;
							local209.method6385(arg0 + Static216.anIntArray231[0] - (local209.method6389() >> 1), local194);
							local194 -= 2;
						}
					}
					@Pc(665) Class84[] local665;
					@Pc(673) Class84 local673;
					@Pc(695) Sprite local695;
					if (!(local33 instanceof Player)) {
						local663 = 0;
						local665 = Static50.aClass84Array1;
						for (local310 = 0; local310 < local665.length; local310++) {
							local673 = local665[local310];
							if (local673 != null && local673.anInt2355 == 1 && NpcList.ids[local13 - local7] == local673.anInt2354) {
								local695 = Static230.aClass13Array16[local673.anInt2363];
								if (local695.method6382() > local663) {
									local663 = local695.method6382();
								}
								if (client.cycle % 20 < 10) {
									local695.method6385(Static216.anIntArray231[0] + arg0 - 12, local194 - local695.method6382());
								}
							}
						}
						if (local663 > 0) {
						}
					} else if (local13 >= 0) {
						local663 = 0;
						local665 = Static50.aClass84Array1;
						for (local310 = 0; local310 < local665.length; local310++) {
							local673 = local665[local310];
							if (local673 != null && local673.anInt2355 == 10 && local11[local13] == local673.anInt2354) {
								local695 = Static230.aClass13Array16[local673.anInt2363];
								if (local663 < local695.method6382()) {
									local663 = local695.method6382();
								}
								local695.method6385(Static216.anIntArray231[0] + arg0 - 12, -local695.method6382() + local194);
							}
						}
						if (local663 > 0) {
						}
					}
					for (local663 = 0; local663 < 4; local663++) {
						if (local33.anIntArray315[local663] > client.cycle) {
							local217 = local33.method4323() / 2;
							Static250.method4344(local217, local33, arg1 >> 1, arg2 >> 1);
							if (Static216.anIntArray231[0] > -1) {
								if (local663 == 1) {
									Static216.anIntArray231[1] -= 20;
								}
								if (local663 == 2) {
									Static216.anIntArray231[1] -= 10;
									Static216.anIntArray231[0] -= 15;
								}
								if (local663 == 3) {
									Static216.anIntArray231[0] += 15;
									Static216.anIntArray231[1] -= 10;
								}
								Static15.aClass13Array3[local33.anIntArray312[local663]].method6385(Static216.anIntArray231[0] + arg0 - 12, arg3 - -Static216.anIntArray231[1] + -12);
								Static200.aClass130_3.method5900(Integer.toString(local33.anIntArray313[local663]), 0, arg3 + Static216.anIntArray231[1] + 3, -1, arg0 - -Static216.anIntArray231[0] + -1);
							}
						}
					}
				}
			}
		}
		@Pc(965) int local965;
		for (@Pc(959) int local959 = 0; local959 < Static51.anInt1369; local959++) {
			local965 = Static150.anIntArray175[local959];
			@Pc(974) PathingEntity local974;
			if (local965 >= 2048) {
				local974 = NpcList.npcs[local965 - 2048];
			} else {
				local974 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local965];
			}
			local194 = Static160.anIntArray186[local959];
			@Pc(991) PathingEntity local991;
			if (local194 < 2048) {
				local991 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local194];
			} else {
				local991 = NpcList.npcs[local194 - 2048];
			}
			Static242.method4195(local991, arg3, arg0, local974, arg1, arg2, --local974.anInt4625);
		}
		local965 = Static113.aClass239_2.anInt6846 + Static113.aClass239_2.anInt6836 + 2;
		for (@Pc(1030) int local1030 = 0; local1030 < Static45.anInt1196; local1030++) {
			local194 = Static319.anIntArray397[local1030];
			local663 = Static319.anIntArray402[local1030];
			local217 = Static319.anIntArray398[local1030];
			@Pc(1046) boolean local1046 = true;
			while (local1046) {
				local1046 = false;
				for (local322 = 0; local322 < local1030; local322++) {
					if (local663 + 2 > -local965 + Static319.anIntArray402[local322] && local663 - local965 < Static319.anIntArray402[local322] + 2 && Static319.anIntArray397[local322] + Static319.anIntArray398[local322] > -local217 + local194 && local194 + local217 > -Static319.anIntArray398[local322] + Static319.anIntArray397[local322] && Static319.anIntArray402[local322] - local965 < local663) {
						local663 = Static319.anIntArray402[local322] - local965;
						local1046 = true;
					}
				}
			}
			Static319.anIntArray402[local1030] = local663;
			@Pc(1134) String local1134 = Static319.aStringArray55[local1030];
			if (Static389.anInt4896 == 0) {
				local261 = 16776960;
				if (Static319.anIntArray399[local1030] < 6) {
					local261 = Static124.anIntArray476[Static319.anIntArray399[local1030]];
				}
				if (Static319.anIntArray399[local1030] == 6) {
					local261 = Static163.anInt3086 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static319.anIntArray399[local1030] == 7) {
					local261 = Static163.anInt3086 % 20 >= 10 ? 65535 : 255;
				}
				if (Static319.anIntArray399[local1030] == 8) {
					local261 = Static163.anInt3086 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static319.anIntArray399[local1030] == 9) {
					local435 = 150 - Static319.anIntArray401[local1030];
					if (local435 < 50) {
						local261 = local435 * 1280 + 16711680;
					} else if (local435 < 100) {
						local261 = 16776960 - (local435 - 50) * 327680;
					} else if (local435 < 150) {
						local261 = (local435 - 100) * 5 + 65280;
					}
				}
				if (Static319.anIntArray399[local1030] == 10) {
					local435 = 150 - Static319.anIntArray401[local1030];
					if (local435 < 50) {
						local261 = local435 * 5 + 16711680;
					} else if (local435 < 100) {
						local261 = 33095935 - local435 * 327680;
					} else if (local435 < 150) {
						local261 = local435 * 327680 + 255 - (local435 + -100) * 5 - 32768000;
					}
				}
				if (Static319.anIntArray399[local1030] == 11) {
					local435 = 150 - Static319.anIntArray401[local1030];
					if (local435 < 50) {
						local261 = 16777215 - local435 * 327685;
					} else if (local435 < 100) {
						local261 = local435 * 327685 + 65280 - 16384250;
					} else if (local435 < 150) {
						local261 = 32768000 + 16777215 - local435 * 327680;
					}
				}
				local435 = local261 | 0xFF000000;
				if (Static319.anIntArray400[local1030] == 0) {
					Static52.aClass130_1.method5900(local1134, -16777216, local663 + arg3, local435, arg0 + local194);
				}
				if (Static319.anIntArray400[local1030] == 1) {
					Static52.aClass130_1.method5905(local435, Static163.anInt3086, local1134, arg3 + local663, arg0 + local194);
				}
				if (Static319.anIntArray400[local1030] == 2) {
					Static52.aClass130_1.method5889(local435, local1134, local663 + arg3, local194 + arg0, Static163.anInt3086);
				}
				if (Static319.anIntArray400[local1030] == 3) {
					Static52.aClass130_1.method5895(Static163.anInt3086, local194 + arg0, -Static319.anIntArray401[local1030] + 150, local1134, local435, local663 + arg3);
				}
				if (Static319.anIntArray400[local1030] == 4) {
					local546 = (150 - Static319.anIntArray401[local1030]) * (Static113.aClass239_2.method6126(local1134) + 100) / 150;
					Static190.aClass19_8.method2817(local194 + arg0 - 50, arg3, arg0 + local194 + 50, arg3 - -arg2);
					Static52.aClass130_1.method5897(local194 + arg0 + 50 - local546, -16777216, local663 + arg3, local435, local1134);
					Static190.aClass19_8.method2895(arg0, arg3, arg1 + arg0, arg3 - -arg2);
				}
				if (Static319.anIntArray400[local1030] == 5) {
					local546 = 150 - Static319.anIntArray401[local1030];
					@Pc(1549) int local1549 = 0;
					if (local546 < 25) {
						local1549 = local546 - 25;
					} else if (local546 > 125) {
						local1549 = local546 - 125;
					}
					@Pc(1571) int local1571 = Static113.aClass239_2.anInt6846 + Static113.aClass239_2.anInt6836;
					Static190.aClass19_8.method2817(arg0, arg3 + local663 - local1571 - 1, arg0 - -arg1, arg3 + local663 + 5);
					Static52.aClass130_1.method5900(local1134, -16777216, local1549 + arg3 + local663, local435, local194 + arg0);
					Static190.aClass19_8.method2895(arg0, arg3, arg0 + arg1, arg3 + arg2);
				}
			} else {
				Static52.aClass130_1.method5900(local1134, -16777216, arg3 + local663, -256, local194 + arg0);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)Lclient!mr;")
	public static PathingEntity method3997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class67 local16 = Scene.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local16 == null) {
			return null;
		}
		@Pc(22) PathingEntity local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class22 local27 = local16.aClass22_2; local27 != null; local27 = local27.aClass22_1) {
			@Pc(31) Entity local31 = local27.aClass11_Sub5_1;
			if (local31 instanceof PathingEntity) {
				@Pc(37) PathingEntity local37 = (PathingEntity) local31;
				@Pc(47) int local47 = (local37.getSize() - 1) * 64 + 60;
				@Pc(55) int local55 = local37.xFine - local47 >> 7;
				@Pc(63) int local63 = local37.zFine - local47 >> 7;
				@Pc(70) int local70 = local47 + local37.xFine >> 7;
				@Pc(77) int local77 = local37.zFine + local47 >> 7;
				if (arg1 >= local55 && local63 <= arg2 && arg1 <= local70 && local77 >= arg2) {
					@Pc(106) int local106 = (local70 + 1 - arg1) * (local77 + 1 + -arg2);
					if (local24 < local106) {
						local22 = local37;
						local24 = local106;
					}
				}
			}
		}
		return local22;
	}
}
