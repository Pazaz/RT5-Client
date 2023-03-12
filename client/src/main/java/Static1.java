import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "d", descriptor = "J")
	public static long aLong1 = 0L;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method2() {
		@Pc(8) int local8 = Static210.aByteArrayArray7.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static210.aByteArrayArray7[local10] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static48.anInt1254; local25++) {
					if (Static266.anIntArray334[local25] == Static291.mapSquares[local10]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static266.anIntArray334[Static48.anInt1254] = Static291.mapSquares[local10];
					local23 = Static48.anInt1254++;
				}
				@Pc(65) Buffer local65 = new Buffer(Static210.aByteArrayArray7[local10]);
				@Pc(67) int local67 = 0;
				while (Static210.aByteArrayArray7[local10].length > local65.pos && local67 < 511 && NpcList.size < 1023) {
					@Pc(88) int local88 = local23 | local67++ << 6;
					@Pc(92) int local92 = local65.g2();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(119) int local119 = local102 + (Static291.mapSquares[local10] >> 8) * 64 - Static164.anInt3140;
					@Pc(132) int local132 = local106 + (Static291.mapSquares[local10] & 0xFF) * 64 - Static148.anInt2719;
					@Pc(139) NpcType local139 = client.NpcTypes.method5570(local65.g2());
					if (NpcList.npcs[local88] == null && (local139.aByte16 & 0x1) > 0 && Static44.anInt1115 == local96 && local119 >= 0 && local119 + local139.size < Static373.anInt7033 && local132 >= 0 && local132 + local139.size < Static242.anInt4449) {
						NpcList.npcs[local88] = new Npc();
						NpcList.npcs[local88].anInt4619 = local88;
						@Pc(187) Npc local187 = NpcList.npcs[local88];
						NpcList.ids[NpcList.size++] = local88;
						local187.lastCycle = client.cycle;
						local187.setType(local139);
						local187.setSize(local187.type.size);
						local187.anInt4604 = local187.type.anInt2044 << 3;
						if (local187.anInt4604 == 0) {
							local187.method4330(0);
						} else {
							local187.method4330(local187.type.aByte17 + 4 << 11 & 0x3863);
						}
						local187.teleport(local187.getSize(), local96, local119, true, local132);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZIZBLjava/lang/String;IILjava/lang/String;IJ)V")
	public static void method3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) long arg9) {
		if (!Static375.aBoolean477 && Static268.anInt4959 < 500) {
			@Pc(16) int local16 = arg8 == -1 ? Static107.anInt2219 : arg8;
			@Pc(30) Class2_Sub5 local30 = new Class2_Sub5(arg4, arg7, local16, arg6, arg0, arg9, arg5, arg2, arg1, arg3);
			Static129.aClass135_19.addTail(local30);
			Static268.anInt4959++;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!nb;ZIIIII)V")
	public static void method4(@OriginalArg(0) Class157 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static243.anInt4503 >= 50 || (arg0 == null || arg0.anIntArrayArray33 == null || arg0.anIntArrayArray33.length <= arg5 || arg0.anIntArrayArray33[arg5] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray33[arg5][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray33[arg5].length > 1) {
			local65 = (int) ((double) arg0.anIntArrayArray33[arg5].length * Math.random());
			if (local65 > 0) {
				local40 = arg0.anIntArrayArray33[arg5][local65];
			}
		}
		@Pc(78) int local78 = local36 & 0x1F;
		if (local78 == 0) {
			if (arg1) {
				Static29.method939(local46, 255, 0, local40);
			}
		} else if (client.preferences.anInt4882 != 0) {
			Static256.anIntArray321[Static243.anInt4503] = local40;
			Static329.anIntArray419[Static243.anInt4503] = local46;
			Static237.anIntArray283[Static243.anInt4503] = 0;
			Static196.aClass247Array2[Static243.anInt4503] = null;
			Static223.anIntArray256[Static243.anInt4503] = 255;
			local65 = (arg3 - 64) / 128;
			@Pc(136) int local136 = (arg4 - 64) / 128;
			Static162.anIntArray188[Static243.anInt4503] = local78 + (local136 << 8) + (arg2 << 24) + (local65 << 16);
			Static243.anInt4503++;
		}
	}

}
