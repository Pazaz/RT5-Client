import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!jt", name = "V", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_127 = new ClientProt(38, 4);

	@OriginalMember(owner = "client!jt", name = "X", descriptor = "[Lclient!dg;")
	public static final Class46[] aClass46Array1 = new Class46[4];

	@OriginalMember(owner = "client!jt", name = "db", descriptor = "I")
	public static int anInt3268 = -1;

	@OriginalMember(owner = "client!jt", name = "eb", descriptor = "Lclient!oj;")
	public static final Class170 aClass170_3 = new Class170(0);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3256(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Protocol.method1960(Static382.aClass145_258);
		Protocol.outboundBuffer.p1(Buffer.getStringLength(arg1) + 1);
		Protocol.outboundBuffer.p1add(arg0);
		Protocol.outboundBuffer.pjstr(arg1);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BIIZII)V")
	public static void method3258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static330.aClass67ArrayArrayArray3 == null) {
			Static190.aClass19_8.method2868(arg4, arg1, arg0, -16777216, arg3);
		} else if (Static17.aClass11_Sub5_Sub2_Sub1_3.xFine >= 0 && Static17.aClass11_Sub5_Sub2_Sub1_3.xFine < Static373.anInt7033 * 128 && Static17.aClass11_Sub5_Sub2_Sub1_3.zFine >= 0 && Static17.aClass11_Sub5_Sub2_Sub1_3.zFine < Static242.anInt4449 * 128) {
			Static163.anInt3086++;
			if (Static17.aClass11_Sub5_Sub2_Sub1_3 != null && Static17.aClass11_Sub5_Sub2_Sub1_3.xFine + 64 - Static17.aClass11_Sub5_Sub2_Sub1_3.getSize() * 64 >> 7 == Static358.anInt6550 && Static17.aClass11_Sub5_Sub2_Sub1_3.zFine + 64 - Static17.aClass11_Sub5_Sub2_Sub1_3.getSize() * 64 >> 7 == Static312.anInt5844) {
				Static358.anInt6550 = -1;
				Static312.anInt5844 = -1;
				Static359.method6009();
			}
			Static257.method3937();
			if (!arg2) {
				Static301.method5188();
			}
			Static182.method3387();
			Static308.method5273(arg1, arg4, true, arg3, arg0);
			@Pc(104) int local104 = Static235.anInt3368;
			@Pc(106) int local106 = Static155.anInt2808;
			@Pc(108) int local108 = Static180.anInt3408;
			@Pc(110) int local110 = Static375.anInt7051;
			@Pc(118) int local118;
			@Pc(151) int local151;
			if (Static314.anInt5911 == 1) {
				local118 = (int) Static31.aFloat28;
				if (local118 < Static89.anInt1885 >> 8) {
					local118 = Static89.anInt1885 >> 8;
				}
				if (Static189.aBooleanArray33[4] && local118 < Static105.anIntArray134[4] + 128) {
					local118 = Static105.anIntArray134[4] + 128;
				}
				local151 = Static53.anInt3966 + (int) Static277.aFloat67 & 0x3FFF;
				Static349.method5833((local118 >> 3) * 3 + 600, Static288.anInt5463, local108, Static386.method6032(Static17.aClass11_Sub5_Sub2_Sub1_3.xFine, Static17.aClass11_Sub5_Sub2_Sub1_3.zFine, Static355.anInt6585) - 50, Static62.anInt2395, local151, local118);
			} else if (Static314.anInt5911 == 4) {
				local118 = (int) Static31.aFloat28;
				if (local118 < Static89.anInt1885 >> 8) {
					local118 = Static89.anInt1885 >> 8;
				}
				if (Static189.aBooleanArray33[4] && Static105.anIntArray134[4] + 128 > local118) {
					local118 = Static105.anIntArray134[4] + 128;
				}
				local151 = (int) Static277.aFloat67 & 0x3FFF;
				Static349.method5833((local118 >> 3) * 3 + 600, Static288.anInt5463, local108, Static386.method6032(Static394.anInt7264, Static348.anInt6448, Static355.anInt6585) - 50, Static62.anInt2395, local151, local118);
			} else if (Static314.anInt5911 == 5) {
				Static385.method6432(local108);
			}
			local118 = Static136.anInt6778;
			local151 = Static102.anInt3592;
			@Pc(254) int local254 = Static211.anInt3777;
			@Pc(256) int local256 = Static265.anInt4857;
			@Pc(258) int local258 = Static4.anInt87;
			@Pc(301) int local301;
			for (@Pc(260) int local260 = 0; local260 < 5; local260++) {
				if (Static189.aBooleanArray33[local260]) {
					local301 = (int) ((double) (Static134.anIntArray164[local260] * 2 + 1) * Math.random() - (double) Static134.anIntArray164[local260] + Math.sin((double) Static116.anIntArray149[local260] * ((double) Static43.anIntArray87[local260] / 100.0D)) * (double) Static105.anIntArray134[local260]);
					if (local260 == 4) {
						Static265.anInt4857 += local301;
						if (Static265.anInt4857 < 1024) {
							Static265.anInt4857 = 1024;
						} else if (Static265.anInt4857 > 3072) {
							Static265.anInt4857 = 3072;
						}
					}
					if (local260 == 1) {
						Static102.anInt3592 += local301;
					}
					if (local260 == 3) {
						Static4.anInt87 = local301 + Static4.anInt87 & 0x3FFF;
					}
					if (local260 == 2) {
						Static211.anInt3777 += local301;
					}
					if (local260 == 0) {
						Static136.anInt6778 += local301;
					}
				}
			}
			if (Static136.anInt6778 < 0) {
				Static136.anInt6778 = 0;
			}
			if (Static211.anInt3777 < 0) {
				Static211.anInt3777 = 0;
			}
			if ((Static72.anInt1684 << 7) - 1 < Static136.anInt6778) {
				Static136.anInt6778 = (Static72.anInt1684 << 7) - 1;
			}
			if (Static211.anInt3777 > (Static210.anInt3773 << 7) - 1) {
				Static211.anInt3777 = (Static210.anInt3773 << 7) - 1;
			}
			Static363.method6091();
			Static56.method1611();
			Static190.aClass19_8.method2895(local104, local110, local106 + local104, local110 + local108);
			Static190.aClass19_8.method2819();
			local301 = Static99.anInt2095;
			if (Static368.aClass43_1 == null) {
				Static190.aClass19_8.method2867(local301);
			} else {
				Static368.aClass43_1.method1612(Static4.anInt87, Static72.anInt1683 << 3, Static190.aClass19_8, local108, Static265.anInt4857, local301, local104, local106, local110);
			}
			Static37.method1135();
			Static76.aClass14_3.method3930(Static136.anInt6778, Static102.anInt3592, Static211.anInt3777, -Static265.anInt4857 & 0x3FFF, -Static4.anInt87 & 0x3FFF, -Static342.anInt5657 & 0x3FFF);
			Static190.aClass19_8.method2896(Static76.aClass14_3);
			Static190.aClass19_8.method2821(local104 + local106 / 2, local110 + local108 / 2, Static320.anInt6006 << 1, Static320.anInt6006 << 1);
			Static306.method5254(Static320.anInt6006 << 1, local106 / 2 + local104, Static320.anInt6006 << 1, local110 + local108 / 2);
			Static96.method2085(Static211.anInt3777, Static102.anInt3592, -Static342.anInt5657 & 0x3FFF, -Static4.anInt87 & 0x3FFF, -Static265.anInt4857 & 0x3FFF, Static136.anInt6778);
			@Pc(541) byte local541 = client.preferences.method4492(Static77.anInt1762) == 2 ? (byte) Static163.anInt3086 : 1;
			Static225.method3954(Static190.aClass19_8, client.cycle, Static102.anInt3591, Static76.aClass14_3, Static136.anInt6778, Static102.anInt3592, Static211.anInt3777, Static230.aByteArrayArrayArray13, Static353.anIntArray448, Static107.anIntArray136, Static248.anIntArray318, Static324.anIntArray409, Static86.anIntArray122, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 + 1, local541, Static17.aClass11_Sub5_Sub2_Sub1_3.xFine >> 7, Static17.aClass11_Sub5_Sub2_Sub1_3.zFine >> 7, !client.preferences.aBoolean353);
			Static37.method1135();
			if (client.gameState == 30) {
				Static306.method5253(local110, local108, local106, local104);
				Static228.method3995(local104, local106, local108, local110);
				Static169.method3213(local108, local104, local106, local110);
				Static230.method4016(local110, local108, local104, local106);
			}
			Static60.method890();
			Static102.anInt3592 = local151;
			Static211.anInt3777 = local254;
			Static136.anInt6778 = local118;
			Static265.anInt4857 = local256;
			Static4.anInt87 = local258;
			if (Static17.aBoolean308 && client.js5NetQueue.getUrgentRequestCount() == 0) {
				Static17.aBoolean308 = false;
			}
			if (Static17.aBoolean308) {
				Static190.aClass19_8.method2868(local108, local104, local110, -16777216, local106);
				Static351.method5857(Static276.aClass130_4, false, Static256.aClass79_102.method2267(client.language));
			}
		} else {
			Static190.aClass19_8.method2868(arg4, arg1, arg0, -16777216, arg3);
		}
	}
}
