import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 >= Static28.anInt675 && Static82.anInt1837 >= arg5 && Static365.anInt6832 <= arg2 && Static161.anInt2954 >= arg1) {
			Static34.method4820(arg1, arg4, arg0, arg5, arg6, arg2, arg3);
		} else {
			Static383.method6380(arg5, arg3, arg2, arg0, arg4, arg1, arg6);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V")
	public static void rebuildMap(@OriginalArg(0) boolean arg0) {
		Static220.aBoolean252 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(23) int local23;
		@Pc(36) boolean local36;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(59) int local59;
		if (!Static220.aBoolean252) {
			local13 = Protocol.inboundBuffer.ig2();
			local17 = Protocol.inboundBuffer.g2();
			local23 = Protocol.inboundBuffer.g1();
			local36 = Protocol.inboundBuffer.g1bneg() == 1;
			Static217.method3795(local23);
			local44 = (Protocol.packetSize - Protocol.inboundBuffer.pos) / 16;
			Static277.anIntArrayArray43 = new int[local44][4];
			for (local48 = 0; local48 < local44; local48++) {
				for (local52 = 0; local52 < 4; local52++) {
					Static277.anIntArrayArray43[local48][local52] = Protocol.inboundBuffer.g4();
				}
			}
			Static106.aByteArrayArray6 = new byte[local44][];
			Static51.underwaterMapGroupIds = new int[local44];
			Static82.aByteArrayArray5 = new byte[local44][];
			Static232.aByteArrayArray9 = new byte[local44][];
			Static374.locGroupIds = new int[local44];
			Static221.mapGroupIds = new int[local44];
			Static291.mapSquares = new int[local44];
			Static62.underwaterLocGroupIds = new int[local44];
			Static270.aByteArrayArray15 = new byte[local44][];
			Static210.aByteArrayArray7 = null;
			Static190.anIntArray208 = null;
			local44 = 0;
			for (local52 = (local13 - (Static373.anInt7033 >> 4)) / 8; local52 <= (local13 + (Static373.anInt7033 >> 4)) / 8; local52++) {
				for (local59 = (local17 - (Static242.anInt4449 >> 4)) / 8; local59 <= (local17 + (Static242.anInt4449 >> 4)) / 8; local59++) {
					Static291.mapSquares[local44] = (local52 << 8) + local59;
					Static221.mapGroupIds[local44] = client.jsArchive5.getGroupId("m" + local52 + "_" + local59);
					Static374.locGroupIds[local44] = client.jsArchive5.getGroupId("l" + local52 + "_" + local59);
					Static51.underwaterMapGroupIds[local44] = client.jsArchive5.getGroupId("um" + local52 + "_" + local59);
					Static62.underwaterLocGroupIds[local44] = client.jsArchive5.getGroupId("ul" + local52 + "_" + local59);
					local44++;
				}
			}
			Static373.method6267(false, local13, local36, local17);
			return;
		}
		local13 = Protocol.inboundBuffer.g2();
		local17 = Protocol.inboundBuffer.ig2();
		local23 = Protocol.inboundBuffer.g1bneg();
		local36 = Protocol.inboundBuffer.g1bneg() == 1;
		Static217.method3795(local23);
		Protocol.inboundBuffer.accessBits();
		for (local44 = 0; local44 < 4; local44++) {
			for (local48 = 0; local48 < Static373.anInt7033 >> 3; local48++) {
				for (local52 = 0; local52 < Static242.anInt4449 >> 3; local52++) {
					local59 = Protocol.inboundBuffer.gBit(1);
					if (local59 == 1) {
						Static310.anIntArrayArrayArray12[local44][local48][local52] = Protocol.inboundBuffer.gBit(26);
					} else {
						Static310.anIntArrayArrayArray12[local44][local48][local52] = -1;
					}
				}
			}
		}
		Protocol.inboundBuffer.accessBytes();
		local48 = (Protocol.packetSize - Protocol.inboundBuffer.pos) / 16;
		Static277.anIntArrayArray43 = new int[local48][4];
		for (local52 = 0; local52 < local48; local52++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static277.anIntArrayArray43[local52][local59] = Protocol.inboundBuffer.g4();
			}
		}
		Static374.locGroupIds = new int[local48];
		Static62.underwaterLocGroupIds = new int[local48];
		Static232.aByteArrayArray9 = new byte[local48][];
		Static270.aByteArrayArray15 = new byte[local48][];
		Static106.aByteArrayArray6 = new byte[local48][];
		Static190.anIntArray208 = null;
		Static221.mapGroupIds = new int[local48];
		Static210.aByteArrayArray7 = null;
		Static51.underwaterMapGroupIds = new int[local48];
		Static291.mapSquares = new int[local48];
		Static82.aByteArrayArray5 = new byte[local48][];
		local48 = 0;
		for (local59 = 0; local59 < 4; local59++) {
			for (@Pc(195) int local195 = 0; local195 < Static373.anInt7033 >> 3; local195++) {
				for (@Pc(199) int local199 = 0; local199 < Static242.anInt4449 >> 3; local199++) {
					@Pc(209) int local209 = Static310.anIntArrayArrayArray12[local59][local195][local199];
					if (local209 != -1) {
						@Pc(219) int local219 = local209 >> 14 & 0x3FF;
						@Pc(225) int local225 = local209 >> 3 & 0x7FF;
						@Pc(235) int local235 = local225 / 8 + (local219 / 8 << 8);
						for (@Pc(237) int local237 = 0; local237 < local48; local237++) {
							if (local235 == Static291.mapSquares[local237]) {
								local235 = -1;
								break;
							}
						}
						if (local235 != -1) {
							Static291.mapSquares[local48] = local235;
							@Pc(270) int local270 = local235 >> 8 & 0xFF;
							@Pc(274) int local274 = local235 & 0xFF;
							Static221.mapGroupIds[local48] = client.jsArchive5.getGroupId("m" + local270 + "_" + local274);
							Static374.locGroupIds[local48] = client.jsArchive5.getGroupId("l" + local270 + "_" + local274);
							Static51.underwaterMapGroupIds[local48] = client.jsArchive5.getGroupId("um" + local270 + "_" + local274);
							Static62.underwaterLocGroupIds[local48] = client.jsArchive5.getGroupId("ul" + local270 + "_" + local274);
							local48++;
						}
					}
				}
			}
		}
		Static373.method6267(false, local13, local36, local17);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([Lclient!nk;II)V")
	public static void method3378(@OriginalArg(0) Component[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Component local13 = arg0[local7];
			if (local13 != null && arg1 == local13.layer && !Static45.method1403(local13)) {
				if (local13.type == 0) {
					method3378(arg0, local13.id);
					if (local13.activeComponents != null) {
						method3378(local13.activeComponents, local13.id);
					}
					@Pc(51) SubInterface local51 = (SubInterface) InterfaceList.subInterfaces.get((long) local13.id);
					if (local51 != null) {
						Static232.method4028(local51.id);
					}
				}
				if (local13.type == 6 && local13.modelSeqId != -1) {
					@Pc(71) Class157 local71 = client.SeqTypes.method2371(local13.modelSeqId);
					if (local71 != null) {
						local13.anInt4283 += client.sceneDelta;
						while (local71.anIntArray261[local13.anInt4247] < local13.anInt4283) {
							local13.anInt4283 -= local71.anIntArray261[local13.anInt4247];
							local13.anInt4247++;
							if (local71.anIntArray262.length <= local13.anInt4247) {
								local13.anInt4247 -= local71.anInt4032;
								if (local13.anInt4247 < 0 || local13.anInt4247 >= local71.anIntArray262.length) {
									local13.anInt4247 = 0;
								}
							}
							local13.anInt4316 = local13.anInt4247 + 1;
							if (local71.anIntArray262.length <= local13.anInt4316) {
								local13.anInt4316 -= local71.anInt4032;
								if (local13.anInt4316 < 0 || local13.anInt4316 >= local71.anIntArray262.length) {
									local13.anInt4316 = -1;
								}
							}
							InterfaceList.redraw(local13);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)I")
	public static int method3381(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return ((arg0 >> 2 & 0x3F) << 10) + (arg2 >> 5 << 7) + (arg1 >> 1);
	}
}
