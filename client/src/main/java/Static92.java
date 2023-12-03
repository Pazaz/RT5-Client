import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_9 = new LruHashTable(260);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([I[ILclient!oe;I[I)V")
	public static void method1966(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Npc arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) int local9 = arg0[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg3[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg2.aClass20Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass20Array3[local19] = null;
					} else {
						@Pc(41) Class157 local41 = client.SeqTypes.method2371(local9);
						@Pc(44) int local44 = local41.anInt4022;
						@Pc(49) Class20 local49 = arg2.aClass20Array3[local19];
						if (local49 != null) {
							if (local9 == local49.anInt624) {
								if (local44 == 0) {
									local49 = arg2.aClass20Array3[local19] = null;
								} else if (local44 == 1) {
									local49.anInt626 = 0;
									local49.anInt625 = 0;
									local49.anInt629 = local17;
									local49.anInt628 = 0;
									local49.anInt627 = 1;
									Static1.method4(local41, false, arg2.plane, arg2.xFine, arg2.zFine, 0);
								} else if (local44 == 2) {
									local49.anInt626 = 0;
								}
							} else if (local41.anInt4023 >= client.SeqTypes.method2371(local49.anInt624).anInt4023) {
								local49 = arg2.aClass20Array3[local19] = null;
							}
						}
						if (local49 == null) {
							local49 = arg2.aClass20Array3[local19] = new Class20();
							local49.anInt625 = 0;
							local49.anInt627 = 1;
							local49.anInt628 = 0;
							local49.anInt624 = local9;
							local49.anInt626 = 0;
							local49.anInt629 = local17;
							Static1.method4(local41, false, arg2.plane, arg2.xFine, arg2.zFine, 0);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!nk;Lclient!wm;IIB)V")
	public static void method1967(@OriginalArg(0) Component arg0, @OriginalArg(1) RasteriserBase arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class78 local14 = arg0.method4109(arg1);
		if (local14 == null) {
			return;
		}
		arg1.method2895(arg3, arg2, arg3 + arg0.width, arg0.height + arg2);
		if (Static146.anInt2703 == 2 || Static146.anInt2703 == 5 || Static292.aClass13_15 == null) {
			arg1.method2811(local14, arg3, arg2);
			return;
		}
		@Pc(61) int local61;
		@Pc(58) int local58;
		@Pc(69) int local69;
		@Pc(55) int local55;
		if (Camera.cameraType == 4) {
			local58 = Static348.anInt6448;
			local55 = 4096;
			local69 = (int) -Camera.yaw & 0x3FFF;
			local61 = Static394.anInt7264;
		} else {
			local55 = 4096 - Static97.anInt2005 * 16;
			local58 = PlayerList.self.zFine;
			local61 = PlayerList.self.xFine;
			local69 = Static6.anInt158 + (int) -Camera.yaw & 0x3FFF;
		}
		@Pc(96) int local96 = local61 / 32 + 48 - (Static373.buildAreaLimitX + -104) * 2;
		@Pc(115) int local115 = Static242.buildAreaLimitZ * 4 + 48 - (Static242.buildAreaLimitZ - 104) * 2 - local58 / 32;
		Static292.aClass13_15.method6396((float) arg0.width / 2.0F + (float) arg3, (float) arg0.height / 2.0F + (float) arg2, (float) local96, (float) local115, local55, local69 << 2, local14, arg3, arg2);
		@Pc(165) int local165;
		@Pc(174) int local174;
		@Pc(185) int local185;
		@Pc(196) int local196;
		for (@Pc(149) Class2_Sub39 local149 = (Class2_Sub39) Static56.aClass135_13.head(); local149 != null; local149 = (Class2_Sub39) Static56.aClass135_13.next()) {
			@Pc(154) int local154 = local149.anInt6818;
			local165 = (Static34.aClass103_3.anIntArray170[local154] >> 14 & 0x3FFF) - Camera.originX;
			local174 = (Static34.aClass103_3.anIntArray170[local154] & 0x3FFF) - Camera.originZ;
			local185 = local165 * 4 + 2 - local61 / 32;
			local196 = local174 * 4 + 2 - local58 / 32;
			Static216.method3776(arg3, arg0, Static34.aClass103_3.anIntArray171[local154], arg1, local196, local14, local185, arg2);
		}
		for (local165 = 0; local165 < Static387.anInt2831; local165++) {
			local174 = Static388.anIntArray494[local165] * 4 + 2 - local61 / 32;
			local185 = Static183.anIntArray2[local165] * 4 + 2 - local58 / 32;
			@Pc(253) LocType local253 = client.LocTypes.get(Static231.anIntArray265[local165]);
			if (local253.anIntArray94 != null) {
				local253 = local253.method1533(VarpDomain.instance);
				if (local253 == null || local253.anInt1306 == -1) {
					continue;
				}
			}
			Static216.method3776(arg3, arg0, local253.anInt1306, arg1, local185, local14, local174, arg2);
		}
		for (@Pc(293) Class2_Sub32 local293 = (Class2_Sub32) Static120.objStacks.head(); local293 != null; local293 = (Class2_Sub32) Static120.objStacks.next()) {
			local185 = (int) (local293.key >> 28 & 0x3L);
			if (local185 == Static343.anInt6389) {
				local196 = (int) (local293.key & 0x3FFFL) * 4 + 2 - local61 / 32;
				@Pc(337) int local337 = (int) (local293.key >> 14 & 0x3FFFL) * 4 + 2 - local58 / 32;
				Static376.method6288(local14, local196, arg3, local337, Static76.aClass13Array5[0], arg2, arg0);
			}
		}
		@Pc(410) int local410;
		for (local185 = 0; local185 < NpcList.size; local185++) {
			@Pc(365) Npc local365 = NpcList.npcs[NpcList.ids[local185]];
			if (local365 != null && local365.method4336() && local365.plane == PlayerList.self.plane) {
				@Pc(383) NpcType local383 = local365.type;
				if (local383 != null && local383.multiNpcs != null) {
					local383 = local383.getMultiNpc(VarpDomain.instance);
				}
				if (local383 != null && local383.aBoolean147 && local383.aBoolean145) {
					local410 = local365.xFine / 32 - local61 / 32;
					@Pc(419) int local419 = local365.zFine / 32 - local58 / 32;
					if (local383.anInt2037 == -1) {
						Static376.method6288(local14, local410, arg3, local419, Static76.aClass13Array5[1], arg2, arg0);
					} else {
						Static216.method3776(arg3, arg0, local383.anInt2037, arg1, local419, local14, local410, arg2);
					}
				}
			}
		}
		local196 = PlayerList.anInt751;
		@Pc(455) int[] local455 = PlayerList.anIntArray121;
		@Pc(489) int local489;
		@Pc(498) int local498;
		@Pc(502) int local502;
		for (local410 = 0; local410 < local196; local410++) {
			@Pc(465) Player local465 = PlayerList.players[local455[local410]];
			if (local465 != null && local465.method4065() && PlayerList.self != local465 && local465.plane == PlayerList.self.plane) {
				local489 = local465.xFine / 32 - local61 / 32;
				local498 = local465.zFine / 32 - local58 / 32;
				@Pc(500) boolean local500 = false;
				for (local502 = 0; local502 < FriendsList.size; local502++) {
					if (local465.username.equals(FriendsList.usernames[local502]) && FriendsList.worlds[local502] != 0) {
						local500 = true;
						break;
					}
				}
				@Pc(528) boolean local528 = false;
				for (@Pc(530) int local530 = 0; local530 < ClanChat.size; local530++) {
					if (local465.username.equals(ClanChat.members[local530].username)) {
						local528 = true;
						break;
					}
				}
				@Pc(550) boolean local550 = false;
				if (PlayerList.self.team != 0 && local465.team != 0 && local465.team == PlayerList.self.team) {
					local550 = true;
				}
				if (local500) {
					Static376.method6288(local14, local489, arg3, local498, Static76.aClass13Array5[3], arg2, arg0);
				} else if (local528) {
					Static376.method6288(local14, local489, arg3, local498, Static76.aClass13Array5[5], arg2, arg0);
				} else if (local550) {
					Static376.method6288(local14, local489, arg3, local498, Static76.aClass13Array5[4], arg2, arg0);
				} else {
					Static376.method6288(local14, local489, arg3, local498, Static76.aClass13Array5[2], arg2, arg0);
				}
			}
		}
		@Pc(636) Class84[] local636 = Static50.aClass84Array1;
		@Pc(728) int local728;
		for (local489 = 0; local489 < local636.length; local489++) {
			@Pc(644) Class84 local644 = local636[local489];
			if (local644 != null && local644.anInt2355 != 0 && client.cycle % 20 < 10) {
				@Pc(699) int local699;
				if (local644.anInt2355 == 1 && local644.anInt2354 >= 0 && local644.anInt2354 < NpcList.npcs.length) {
					@Pc(677) Npc local677 = NpcList.npcs[local644.anInt2354];
					if (local677 != null) {
						local502 = local677.xFine / 32 - local61 / 32;
						local699 = local677.zFine / 32 - local58 / 32;
						Static262.method6249(local644.anInt2363, 360000, local502, local699, arg2, arg0, local14, arg3);
					}
				}
				if (local644.anInt2355 == 2) {
					local728 = (local644.anInt2352 - Camera.originX) * 4 + 2 - local61 / 32;
					local502 = (local644.anInt2364 - Camera.originZ) * 4 + 2 - local58 / 32;
					local699 = local644.anInt2349 * 4;
					local699 *= local699;
					Static262.method6249(local644.anInt2363, local699, local728, local502, arg2, arg0, local14, arg3);
				}
				if (local644.anInt2355 == 10 && local644.anInt2354 >= 0 && PlayerList.players.length > local644.anInt2354) {
					@Pc(786) Player local786 = PlayerList.players[local644.anInt2354];
					if (local786 != null) {
						local502 = local786.xFine / 32 - local61 / 32;
						local699 = local786.zFine / 32 - local58 / 32;
						Static262.method6249(local644.anInt2363, 360000, local502, local699, arg2, arg0, local14, arg3);
					}
				}
			}
		}
		if (Camera.cameraType == 4) {
			return;
		}
		if (Static358.anInt6550 != 0) {
			local498 = Static358.anInt6550 * 4 + PlayerList.self.getSize() * 2 + 2 - local61 / 32 - 2;
			local728 = Static312.anInt5844 * 4 + PlayerList.self.getSize() * 2 + 2 - local58 / 32 - 2;
			Static376.method6288(local14, local498, arg3, local728, Static352.aClass13Array25[Static370.aBoolean474 ? 1 : 0], arg2, arg0);
		}
		arg1.method2868(3, arg3 + arg0.width / 2 - 1, arg2 + arg0.height / 2 - 1, -1, 3);
	}
}
