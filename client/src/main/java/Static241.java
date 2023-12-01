import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
	public static int anInt4445 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)Z")
	public static boolean method4190(@OriginalArg(1) int arg0) {
		if (arg0 == 50 || arg0 == 20 || arg0 == 12 || arg0 == 17 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!oe;ZZ)V")
	public static void method4191(@OriginalArg(0) Npc arg0, @OriginalArg(1) boolean arg1) {
		if (Static268.anInt4959 >= 400) {
			return;
		}
		@Pc(16) NpcType local16 = arg0.type;
		if (local16.multiNpcs != null) {
			local16 = local16.getMultiNpc(VarpDomain.instance);
			if (local16 == null) {
				return;
			}
		}
		if (!local16.aBoolean145) {
			return;
		}
		@Pc(34) String local34 = local16.aString19;
		if (local16.anInt2039 != 0) {
			@Pc(50) String local50 = client.game == client.GAME_SD ? Static367.aClass79_142.getLocalized(client.language) : Static33.aClass79_96.getLocalized(client.language);
			local34 = local34 + Static178.method2343(PlayerList.self.combatLevel, local16.anInt2039) + " (" + local50 + local16.anInt2039 + ")";
		}
		if (!Static330.aBoolean419) {
			if (!arg1) {
				@Pc(80) String[] local80 = local16.aStringArray14;
				if (Static338.aBoolean465) {
					local80 = Static97.method2095(local80);
				}
				@Pc(90) int local90;
				if (local80 != null) {
					for (local90 = 4; local90 >= 0; local90--) {
						if (local80[local90] != null && (client.GAME_RS != client.game || !local80[local90].equalsIgnoreCase(Static378.aClass79_146.getLocalized(client.language)))) {
							@Pc(110) byte local110 = 0;
							@Pc(112) int local112 = Minimap.anInt1910;
							if (local90 == 0) {
								local110 = 5;
							}
							if (local90 == 1) {
								local110 = 25;
							}
							if (local90 == 2) {
								local110 = 4;
							}
							if (local90 == 3) {
								local110 = 3;
							}
							if (local90 == 4) {
								local110 = 8;
							}
							if (local90 == local16.anInt2017) {
								local112 = local16.anInt2011;
							}
							if (local90 == local16.anInt2035) {
								local112 = local16.anInt2020;
							}
							Static1.method3(-1, true, 0, false, local80[local90], 0, local110, "<col=ffff00>" + local34, local112, (long) arg0.anInt4619);
						}
					}
				}
				if (client.game == client.GAME_RS && local80 != null) {
					for (local90 = 4; local90 >= 0; local90--) {
						if (local80[local90] != null && local80[local90].equalsIgnoreCase(Static378.aClass79_146.getLocalized(client.language))) {
							@Pc(211) short local211 = 0;
							if (PlayerList.self.combatLevel < local16.anInt2039) {
								local211 = 2000;
							}
							@Pc(224) short local224 = 0;
							if (local90 == 0) {
								local224 = 5;
							}
							if (local90 == 1) {
								local224 = 25;
							}
							if (local90 == 2) {
								local224 = 4;
							}
							if (local90 == 3) {
								local224 = 3;
							}
							if (local90 == 4) {
								local224 = 8;
							}
							if (local224 != 0) {
								local224 += local211;
							}
							Static1.method3(-1, true, 0, false, local80[local90], 0, local224, "<col=ffff00>" + local34, local16.anInt2023, (long) arg0.anInt4619);
						}
					}
				}
			}
			Static1.method3(-1, true, 0, arg1, Static368.aClass79_143.getLocalized(client.language), 0, 1006, "<col=ffff00>" + local34, Static135.anInt2523, (long) arg0.anInt4619);
		} else if (!arg1) {
			@Pc(335) ParamType local335 = Static172.anInt3298 == -1 ? null : client.ParamTypes.get(Static172.anInt3298);
			if ((Static115.anInt3837 & 0x2) != 0) {
				if (local335 == null || local16.getParam(local335.defaultInt, Static172.anInt3298) != local335.defaultInt) {
					Static1.method3(-1, true, 0, false, Static91.aString18, 0, 10, Static371.aString68 + " -> <col=ffff00>" + local34, Static41.anInt1044, (long) arg0.anInt4619);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)V")
	public static void method4192(@OriginalArg(0) boolean arg0) {
		if (arg0 && WorldMap.currentMap != null) {
			Static97.anInt2034 = WorldMap.currentMap.id;
		} else {
			Static97.anInt2034 = -1;
		}
		WorldMap.aClass161_11 = null;
		WorldMap.currentMap = null;
		WorldMap.loadPercentage = 0;
		Static197.aClass135_24 = null;
		MapList.method5513();
		MapList.aClass135_36.clear();
		Static27.aClass113_2 = null;
		Static249.aClass113_8 = null;
		Static30.aClass113_3 = null;
		Static77.anInt1763 = -1;
		Static74.aClass113_4 = null;
		MapList.aClass103_5 = null;
		Static2.aClass113_1 = null;
		Static238.anInt4328 = -1;
		Static369.aClass113_9 = null;
		Static175.aClass113_6 = null;
		Static107.aClass113_5 = null;
		Static371.aClass13_20 = null;
		MapList.aClass125_4.method3380();
		MapList.aClass104_4.method2702(64, 64);
		MapList.aClass125_4.method3377(64, 128);
		MapList.aClass202_3.method5161(64);
		client.VarbitTypes.method3392(64);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
	public static void method4194() {
		Static202.anIntArray220 = Static321.method5479(0.4F);
	}
}
