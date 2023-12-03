import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
	public static int anInt7029 = -1;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
	public static int anInt7032 = 0;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
	public static int buildAreaLimitX = 104;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZIZIZ)V")
	public static void method6267(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (!arg2 && Static105.anInt2187 == arg1 && Static9.anInt212 == arg3 && (Static355.anInt6585 == Static44.anInt1115 || client.preferences.method4495(Static77.anInt1762))) {
			return;
		}
		Static44.anInt1115 = Static355.anInt6585;
		Static105.anInt2187 = arg1;
		Static9.anInt212 = arg3;
		if (client.preferences.method4495(Static77.anInt1762)) {
			Static44.anInt1115 = 0;
		}
		if (arg0) {
			client.setGameState(28);
		} else {
			client.setGameState(25);
		}
		Static351.method5857(Static276.aClass130_4, true, Static256.aClass79_102.getLocalized(client.language));
		@Pc(59) int local59 = Camera.originX;
		Camera.originX = (Static105.anInt2187 - (buildAreaLimitX >> 4)) * 8;
		@Pc(70) int local70 = Camera.originZ;
		Camera.originZ = (Static9.anInt212 - (Static242.buildAreaLimitZ >> 4)) * 8;
		Static91.aClass2_Sub2_Sub17_1 = MapList.getContainingSource(Static105.anInt2187 * 8, Static9.anInt212 * 8);
		Static34.aClass103_3 = null;
		@Pc(94) int local94 = Camera.originX - local59;
		@Pc(99) int local99 = Camera.originZ - local70;
		@Pc(103) int local103;
		@Pc(113) int local113;
		if (arg0) {
			NpcList.size = 0;
			local103 = (buildAreaLimitX - 1) * 128;
			@Pc(175) int local175 = (Static242.buildAreaLimitZ - 1) * 128;
			for (local113 = 0; local113 < 32768; local113++) {
				@Pc(183) Npc local183 = NpcList.npcs[local113];
				if (local183 != null) {
					local183.xFine -= local94 * 128;
					local183.zFine -= local99 * 128;
					if (local183.xFine >= 0 && local183.xFine <= local103 && local183.zFine >= 0 && local183.zFine <= local175) {
						@Pc(232) boolean local232 = true;
						for (@Pc(234) int local234 = 0; local234 < 10; local234++) {
							local183.movementQueueX[local234] -= local94;
							local183.movementQueueZ[local234] -= local99;
							if (local183.movementQueueX[local234] < 0 || buildAreaLimitX <= local183.movementQueueX[local234] || local183.movementQueueZ[local234] < 0 || local183.movementQueueZ[local234] >= Static242.buildAreaLimitZ) {
								local232 = false;
							}
						}
						if (local232) {
							NpcList.ids[NpcList.size++] = local113;
						} else {
							NpcList.npcs[local113].setType(null);
							NpcList.npcs[local113] = null;
						}
					} else {
						NpcList.npcs[local113].setType(null);
						NpcList.npcs[local113] = null;
					}
				}
			}
		} else {
			for (local103 = 0; local103 < 32768; local103++) {
				@Pc(109) Npc local109 = NpcList.npcs[local103];
				if (local109 != null) {
					for (local113 = 0; local113 < 10; local113++) {
						local109.movementQueueX[local113] -= local94;
						local109.movementQueueZ[local113] -= local99;
					}
					local109.zFine -= local99 * 128;
					local109.xFine -= local94 * 128;
				}
			}
		}
		for (local103 = 0; local103 < 2048; local103++) {
			@Pc(314) Player local314 = PlayerList.players[local103];
			if (local314 != null) {
				for (local113 = 0; local113 < 10; local113++) {
					local314.movementQueueX[local113] -= local94;
					local314.movementQueueZ[local113] -= local99;
				}
				local314.zFine -= local99 * 128;
				local314.xFine -= local94 * 128;
			}
		}
		Static372.method6262(local99, local94);
		for (@Pc(371) ChangeLocRequest local371 = (ChangeLocRequest) Static207.aClass135_26.head(); local371 != null; local371 = (ChangeLocRequest) Static207.aClass135_26.next()) {
			local371.anInt6484 -= local94;
			local371.anInt6486 -= local99;
			if (local371.anInt6484 < 0 || local371.anInt6486 < 0 || local371.anInt6484 >= buildAreaLimitX || local371.anInt6486 >= Static242.buildAreaLimitZ) {
				local371.unlink();
			}
		}
		SoundPlayer.size = 0;
		if (Static358.anInt6550 != 0) {
			Static358.anInt6550 -= local94;
			Static312.anInt5844 -= local99;
		}
		if (arg0) {
			Static311.anInt5810 -= local94;
			Static136.anInt6778 -= local94 * 128;
			Static123.anInt2420 -= local99;
			Static211.anInt3777 -= local99 * 128;
			Static19.anInt535 -= local99;
			Static254.anInt4698 -= local94;
			if (Math.abs(local94) > buildAreaLimitX || Math.abs(local99) > Static242.buildAreaLimitZ) {
				Static348.method5828();
			}
		} else if (Camera.cameraType == 4) {
			Static288.anInt5463 -= local94 * 128;
			Static348.anInt6448 -= local99 * 128;
			Static394.anInt7264 -= local94 * 128;
			Static62.anInt2395 -= local99 * 128;
		} else {
			Camera.cameraType = 1;
		}
		Static160.method2956();
		Static247.method4299();
		Static129.spotAnims.clear();
		Static332.projAnims.clear();
		Static284.aClass36_7.method1416();
		Static120.method2380();
	}
}
