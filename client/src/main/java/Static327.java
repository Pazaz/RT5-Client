import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!ad;")
	public static final Class4 aClass4_127 = new Class4(512);

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_222 = new ClientProt(77, -1);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!wm;III)V")
	public static void method5574(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static75.anInt1737 == 0 || Static153.anInt2792 == 0) {
			return;
		}
		arg0.method2821(Static315.anInt5930, Static15.anInt366, Static75.anInt1737, Static153.anInt2792);
		arg0.method2895(Static290.anInt5498, Static63.anInt1549, Static75.anInt1737, Static153.anInt2792);
		@Pc(39) Class14 local39 = arg0.method2897();
		local39.method3930(Static270.anInt4966, Static392.anInt7226, Static382.anInt7141, Static93.anInt1946, Static36.anInt925, Static97.anInt2052);
		arg0.method2896(local39);
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(88) int local88;
		@Pc(97) int local97;
		@Pc(112) int[] local112;
		@Pc(144) int local144;
		@Pc(152) int local152;
		if (Static330.aClass6Array3 != null) {
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			@Pc(59) int local59 = arg0.method2814();
			local67 = (arg2 - Static315.anInt5930) * local59 / Static75.anInt1737;
			local76 = local59 * (arg1 - Static15.anInt366) / Static153.anInt2792;
			local79 = arg0.method2875();
			local88 = local79 * (arg2 - Static315.anInt5930) / Static75.anInt1737;
			local97 = (arg1 - Static15.anInt366) * local79 / Static153.anInt2792;
			local112 = new int[] { local67, local76, local59 };
			local39.method3935(local112);
			@Pc(130) int[] local130 = new int[] { local88, local97, local79 };
			local39.method3935(local130);
			@Pc(135) float local135 = 0.0F;
			local144 = local130[0] - local112[0];
			local152 = local130[1] - local112[1];
			@Pc(161) int local161 = local130[2] - local112[2];
			while (local135 < 1.0F) {
				@Pc(174) int local174 = (int) ((float) local144 * local135 + (float) local112[0]);
				@Pc(178) int local178 = local174 >> 7;
				@Pc(189) int local189 = (int) ((float) local112[2] + (float) local161 * local135);
				@Pc(193) int local193 = local189 >> 7;
				if (local178 > 0 && local193 > 0 && Static373.anInt7033 > local178 && local193 < Static242.anInt4449) {
					@Pc(206) int local206 = Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78;
					if (local206 < 3 && (Static359.aByteArrayArrayArray16[1][local178][local193] & 0x2) != 0) {
						local206++;
					}
					if ((float) Static330.aClass6Array3[local206].method5728(local174, local189) < (float) local152 * local135 + (float) local112[1]) {
						local54 = local174 + (Static17.aClass11_Sub5_Sub2_Sub1_3.getSize() - 1) * 64 >> 7;
						local56 = local189 + (Static17.aClass11_Sub5_Sub2_Sub1_3.getSize() - 1) * 64 >> 7;
						break;
					}
				}
				local135 = (float) ((double) local135 + 0.01D);
			}
			if (local54 != -1 && local56 != -1) {
				if (Static330.aBoolean419 && (Static115.anInt3837 & 0x40) != 0) {
					@Pc(293) Class161 local293 = Static207.method3705(Static337.anInt6317, Static214.anInt3792);
					if (local293 == null) {
						Static207.method3699();
					} else {
						Static1.method3(-1, true, local56, false, Static91.aString18, local54, 51, " ->", Static41.anInt1044, 0L);
					}
				} else {
					if (client.GAME_SD == client.game) {
						Static1.method3(-1, true, local56, false, Static382.aClass79_147.method2267(client.language), local54, 59, "", -1, 0L);
					}
					Static1.method3(-1, true, local56, false, Static330.aString62, local54, 22, "", -1, 0L);
				}
			}
		}
		@Pc(349) Class36 local349 = Static34.aClass36_6;
		for (@Pc(354) Class12_Sub4 local354 = (Class12_Sub4) local349.method1415(); local354 != null; local354 = (Class12_Sub4) local349.method1420()) {
			if (Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 == local354.anInt4073 && local354.method4025(arg1, arg2, arg0)) {
				@Pc(473) int local473;
				if (local354.aClass11_1 instanceof Player) {
					@Pc(380) Player local380 = (Player) local354.aClass11_1;
					local67 = local380.getSize();
					if ((local67 & 0x1) == 0 && (local380.xFine & 0x7F) == 0 && (local380.zFine & 0x7F) == 0 || (local67 & 0x1) == 1 && (local380.xFine & 0x7F) == 64 && (local380.zFine & 0x7F) == 64) {
						local76 = local380.xFine + 64 - local380.getSize() * 64;
						local79 = local380.zFine + 64 - local380.getSize() * 64;
						@Pc(485) int local485;
						for (local88 = 0; local88 < NpcList.size; local88++) {
							@Pc(451) Npc local451 = NpcList.npcs[NpcList.ids[local88]];
							if (local451 != null && local451.anInt4632 != client.cycle && local451.aBoolean320) {
								local473 = local451.xFine - (local451.type.size - 1) * 64;
								local485 = local451.zFine - (local451.type.size - 1) * 64;
								if (local76 <= local473 && local451.type.size <= local380.getSize() - (local473 - local76 >> 7) && local485 >= local79 && local451.type.size <= local380.getSize() - (local485 - local79 >> 7)) {
									Static241.method4191(local451, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 != local354.anInt4073);
									local451.anInt4632 = client.cycle;
								}
							}
						}
						local97 = PlayerList.anInt751;
						local112 = PlayerList.anIntArray121;
						for (local485 = 0; local485 < local97; local485++) {
							@Pc(564) Player local564 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local112[local485]];
							if (local564 != null && client.cycle != local564.anInt4632 && local380 != local564 && local564.aBoolean320) {
								local144 = local564.xFine + 64 - local564.getSize() * 64;
								local152 = local564.zFine - (local564.getSize() - 1) * 64;
								if (local144 >= local76 && local564.getSize() <= local380.getSize() - (local144 - local76 >> 7) && local152 >= local79 && local564.getSize() <= local380.getSize() - (local152 - local79 >> 7)) {
									Static184.method3397(Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 != local354.anInt4073, local564);
									local564.anInt4632 = client.cycle;
								}
							}
						}
					}
					if (local380.anInt4632 == client.cycle) {
						continue;
					}
					Static184.method3397(local354.anInt4073 != Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78, local380);
					local380.anInt4632 = client.cycle;
				}
				if (local354.aClass11_1 instanceof Npc) {
					@Pc(692) Npc local692 = (Npc) local354.aClass11_1;
					if (local692.type != null) {
						if ((local692.type.size & 0x1) == 0 && (local692.xFine & 0x7F) == 0 && (local692.zFine & 0x7F) == 0 || (local692.type.size & 0x1) == 1 && (local692.xFine & 0x7F) == 64 && (local692.zFine & 0x7F) == 64) {
							local67 = local692.xFine - (local692.type.size - 1) * 64;
							local76 = local692.zFine - (local692.type.size - 1) * 64;
							for (local79 = 0; local79 < NpcList.size; local79++) {
								@Pc(768) Npc local768 = NpcList.npcs[NpcList.ids[local79]];
								if (local768 != null && local768.anInt4632 != client.cycle && local692 != local768 && local768.aBoolean320) {
									local97 = local768.xFine - (local768.type.size - 1) * 64;
									local473 = local768.zFine + 64 - local768.type.size * 64;
									if (local67 <= local97 && local692.type.size - (local97 - local67 >> 7) >= local768.type.size && local76 <= local473 && local768.type.size <= local692.type.size - (local473 - local76 >> 7)) {
										Static241.method4191(local768, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 != local354.anInt4073);
										local768.anInt4632 = client.cycle;
									}
								}
							}
							local88 = PlayerList.anInt751;
							@Pc(882) int[] local882 = PlayerList.anIntArray121;
							for (local473 = 0; local473 < local88; local473++) {
								@Pc(892) Player local892 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local882[local473]];
								if (local892 != null && local892.anInt4632 != client.cycle && local892.aBoolean320) {
									@Pc(919) int local919 = local892.xFine - (local892.getSize() - 1) * 64;
									local144 = local892.zFine - (local892.getSize() - 1) * 64;
									if (local919 >= local67 && local892.getSize() <= local692.type.size - (local919 - local67 >> 7) && local144 >= local76 && local892.getSize() <= local692.type.size - (local144 - local76 >> 7)) {
										Static184.method3397(Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 != local354.anInt4073, local892);
										local892.anInt4632 = client.cycle;
									}
								}
							}
						}
						if (local692.anInt4632 == client.cycle) {
							continue;
						}
						Static241.method4191(local692, local354.anInt4073 != Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78);
						local692.anInt4632 = client.cycle;
					}
				}
				if (local354.aClass11_1 instanceof Class11_Sub4_Sub1) {
					@Pc(1038) Class2_Sub32 local1038 = (Class2_Sub32) Static120.aClass4_49.method90((long) (local354.anInt4076 | local354.anInt4073 << 28 | local354.anInt4075 << 14));
					if (local1038 != null) {
						for (@Pc(1046) Class2_Sub8 local1046 = (Class2_Sub8) local1038.aClass135_34.method3548(); local1046 != null; local1046 = (Class2_Sub8) local1038.aClass135_34.method3547()) {
							@Pc(1054) Class188 local1054 = Static313.ObjTypeList.get(local1046.anInt1717);
							if (!Static330.aBoolean419) {
								if (local354.anInt4073 == Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) {
									@Pc(1134) String[] local1134 = local1054.aStringArray50;
									for (local88 = 4; local88 >= 0; local88--) {
										if (local1134 != null && local1134[local88] != null) {
											@Pc(1146) byte local1146 = 0;
											if (local88 == 0) {
												local1146 = 15;
											}
											local473 = Static91.anInt1910;
											if (local88 == 1) {
												local1146 = 46;
											}
											if (local88 == 2) {
												local1146 = 58;
											}
											if (local88 == 3) {
												local1146 = 6;
											}
											if (local88 == 4) {
												local1146 = 21;
											}
											if (local1054.anInt5216 == local88) {
												local473 = local1054.anInt5238;
											}
											if (local1054.anInt5218 == local88) {
												local473 = local1054.anInt5225;
											}
											Static1.method3(-1, true, local354.anInt4075, false, local1134[local88], local354.anInt4076, local1146, "<col=ff9040>" + local1054.aString55, local473, (long) local1046.anInt1717);
										}
									}
								}
								Static1.method3(-1, true, local354.anInt4075, local354.anInt4073 != Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78, Static368.aClass79_143.method2267(client.language), local354.anInt4076, 1009, "<col=ff9040>" + local1054.aString55, Static135.anInt2523, (long) local1046.anInt1717);
							} else if (Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 == local354.anInt4073) {
								@Pc(1071) Class240 local1071 = Static172.anInt3298 == -1 ? null : Static363.aClass18_2.method565(Static172.anInt3298);
								if ((Static115.anInt3837 & 0x1) != 0 && (local1071 == null || local1054.method4772(local1071.anInt7023, Static172.anInt3298) != local1071.anInt7023)) {
									Static1.method3(-1, true, local354.anInt4075, false, Static91.aString18, local354.anInt4076, 13, Static371.aString68 + " -> <col=ff9040>" + local1054.aString55, Static41.anInt1044, (long) local1046.anInt1717);
								}
							}
						}
					}
				}
				if (local354.aClass11_1 instanceof Interface6) {
					@Pc(1288) Interface6 local1288 = (Interface6) local354.aClass11_1;
					@Pc(1297) Class41 local1297 = Static359.LocTypeList.method5163(local1288.method6085());
					if (local1297.anIntArray94 != null) {
						local1297 = local1297.method1533(Static214.aClass226_1);
					}
					if (local1297 != null) {
						if (!Static330.aBoolean419) {
							if (Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 == local354.anInt4073) {
								@Pc(1393) String[] local1393 = local1297.aStringArray10;
								if (local1393 != null) {
									for (local79 = 4; local79 >= 0; local79--) {
										if (local1393[local79] != null) {
											@Pc(1405) short local1405 = 0;
											if (local79 == 0) {
												local1405 = 50;
											}
											local97 = Static91.anInt1910;
											if (local79 == 1) {
												local1405 = 20;
											}
											if (local79 == 2) {
												local1405 = 12;
											}
											if (local79 == 3) {
												local1405 = 17;
											}
											if (local79 == local1297.anInt1344) {
												local97 = local1297.anInt1312;
											}
											if (local79 == 4) {
												local1405 = 1004;
											}
											if (local79 == local1297.anInt1341) {
												local97 = local1297.anInt1313;
											}
											Static1.method3(-1, true, local354.anInt4075, false, local1393[local79], local354.anInt4076, local1405, "<col=00ffff>" + local1297.aString12, local97, Static310.method5284(local354.anInt4075, local354.anInt4076, local1288));
										}
									}
								}
							}
							Static1.method3(-1, true, local354.anInt4075, local354.anInt4073 != Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78, Static368.aClass79_143.method2267(client.language), local354.anInt4076, 1010, "<col=00ffff>" + local1297.aString12, Static135.anInt2523, (long) local1297.anInt1351);
						} else if (local354.anInt4073 == Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) {
							@Pc(1324) Class240 local1324 = Static172.anInt3298 == -1 ? null : Static363.aClass18_2.method565(Static172.anInt3298);
							if ((Static115.anInt3837 & 0x4) != 0 && (local1324 == null || local1297.method1532(local1324.anInt7023, Static172.anInt3298) != local1324.anInt7023)) {
								Static1.method3(-1, true, local354.anInt4075, false, Static91.aString18, local354.anInt4076, 57, Static371.aString68 + " -> <col=00ffff>" + local1297.aString12, Static41.anInt1044, Static310.method5284(local354.anInt4075, local354.anInt4076, local1288));
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIII)V")
	public static void method5576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg3;
		@Pc(14) int local14 = arg0 - arg1;
		if (local14 == 0) {
			if (local10 != 0) {
				Static363.method6090(arg2, arg3, arg4, arg1);
			}
		} else if (local10 == 0) {
			Static240.method4181(arg3, arg4, arg0, arg1);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(64) boolean local64 = local10 > local14;
			@Pc(68) int local68;
			@Pc(70) int local70;
			if (local64) {
				local68 = arg1;
				local70 = arg0;
				arg1 = arg3;
				arg3 = local68;
				arg0 = arg2;
				arg2 = local70;
			}
			if (arg1 > arg0) {
				local68 = arg1;
				arg1 = arg0;
				local70 = arg3;
				arg0 = local68;
				arg3 = arg2;
				arg2 = local70;
			}
			local68 = arg3;
			local70 = arg0 - arg1;
			@Pc(104) int local104 = arg2 - arg3;
			@Pc(109) int local109 = -(local70 >> 1);
			if (local104 < 0) {
				local104 = -local104;
			}
			@Pc(129) int local129 = arg2 <= arg3 ? -1 : 1;
			@Pc(133) int local133;
			if (local64) {
				for (local133 = arg1; local133 <= arg0; local133++) {
					local109 += local104;
					Static357.anIntArrayArray58[local133][local68] = arg4;
					if (local109 > 0) {
						local68 += local129;
						local109 -= local70;
					}
				}
			} else {
				for (local133 = arg1; local133 <= arg0; local133++) {
					local109 += local104;
					Static357.anIntArrayArray58[local68][local133] = arg4;
					if (local109 > 0) {
						local109 -= local70;
						local68 += local129;
					}
				}
			}
		}
	}
}
