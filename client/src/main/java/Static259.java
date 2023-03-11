import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!oq", name = "w", descriptor = "Lclient!ci;")
	public static Interface2 anInterface2_6;

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_105 = new Class79("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_106 = new Class79("M", "M", "M", "M");

	@OriginalMember(owner = "client!oq", name = "x", descriptor = "[I")
	public static final int[] anIntArray323 = new int[13];

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!cf;IZI)V")
	public static void method4427(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || Static129.aClass135_19.aClass2_130 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt1006;
		@Pc(18) int local18 = arg0.anInt1009;
		@Pc(21) int local21 = arg0.anInt1005;
		@Pc(25) int local25 = (int) arg0.aLong30;
		@Pc(28) long local28 = arg0.aLong30;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		if (local21 == 21) {
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			Static93.anInt1951 = 2;
			Static313.anInt5878 = 0;
			Static91.method1960(Static109.aClass145_83);
			Protocol.outboundBuffer.ip2add(Static148.anInt2719 + local18);
			Protocol.outboundBuffer.p2(local15 + Static164.anInt3140);
			Protocol.outboundBuffer.p1sub(Static174.aClass123_2.method3343(82) ? 1 : 0);
			Protocol.outboundBuffer.ip2_dup(local25);
			Static151.method2756(local18, local15);
		}
		if (local21 == 45 || local21 == 1011) {
			Static277.method4681(local18, local25, arg0.aString11, local15);
		}
		if (local21 == 51) {
			Static93.anInt1951 = 1;
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			Static313.anInt5878 = 0;
			Static91.method1960(Static196.aClass145_131);
			Protocol.outboundBuffer.ip2_dup(Static196.anInt3317);
			Protocol.outboundBuffer.p4(Static337.anInt6317);
			Protocol.outboundBuffer.ip2add(local18 + Static148.anInt2719);
			Protocol.outboundBuffer.ip2_dup(Static214.anInt3792);
			Protocol.outboundBuffer.ip2add(Static164.anInt3140 + local15);
			Static322.method5482(true, -4, local18, 0, 1, local15, 1, 0);
		}
		if (local21 == 12) {
			Static93.anInt1951 = 2;
			Static313.anInt5878 = 0;
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			Static91.method1960(Static166.aClass145_122);
			Protocol.outboundBuffer.ip2add((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.ip2add(Static148.anInt2719 + local18);
			Protocol.outboundBuffer.p2(local15 + Static164.anInt3140);
			Protocol.outboundBuffer.p1(Static174.aClass123_2.method3343(82) ? 1 : 0);
			Static172.method3285(local18, local28, local15);
		}
		if (local21 == 1004) {
			Static313.anInt5878 = 0;
			Static291.anInt5504 = arg2;
			Static93.anInt1951 = 2;
			Static320.anInt6005 = arg1;
			Static91.method1960(Static382.aClass145_260);
			Protocol.outboundBuffer.p2add(local18 + Static148.anInt2719);
			Protocol.outboundBuffer.ip2_dup((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.p2add(Static164.anInt3140 + local15);
			Protocol.outboundBuffer.p1neg(Static174.aClass123_2.method3343(82) ? 1 : 0);
			Static172.method3285(local18, local28, local15);
		}
		@Pc(275) Class11_Sub5_Sub2_Sub1 local275;
		if (local21 == 2) {
			local275 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local275 != null) {
				Static291.anInt5504 = arg2;
				Static313.anInt5878 = 0;
				Static93.anInt1951 = 2;
				Static320.anInt6005 = arg1;
				Static91.method1960(Static21.aClass145_25);
				Protocol.outboundBuffer.p1sub(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Protocol.outboundBuffer.ip2add(local25);
				Static322.method5482(true, -2, local275.anIntArray317[0], 0, local275.method4328(), local275.anIntArray316[0], local275.method4328(), 0);
			}
		}
		if (local21 == 1009) {
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			Static313.anInt5878 = 0;
			Static93.anInt1951 = 2;
			Static91.method1960(Static272.aClass145_180);
			Protocol.outboundBuffer.p2(local25);
		}
		if (local21 == 46) {
			Static313.anInt5878 = 0;
			Static93.anInt1951 = 2;
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			Static91.method1960(Static313.aClass145_209);
			Protocol.outboundBuffer.ip2_dup(Static148.anInt2719 + local18);
			Protocol.outboundBuffer.p2(local25);
			Protocol.outboundBuffer.p1sub(Static174.aClass123_2.method3343(82) ? 1 : 0);
			Protocol.outboundBuffer.p2add(Static164.anInt3140 + local15);
			Static151.method2756(local18, local15);
		}
		if (local21 == 59) {
			if (Static4.anInt90 > 0 && Static174.aClass123_2.method3343(82) && Static174.aClass123_2.method3343(81)) {
				Static6.method141(Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78, local18 + Static148.anInt2719, local15 + Static164.anInt3140);
			} else {
				Static291.anInt5504 = arg2;
				Static313.anInt5878 = 0;
				Static320.anInt6005 = arg1;
				Static93.anInt1951 = 1;
				Static91.method1960(Static171.aClass145_127);
				Protocol.outboundBuffer.p2(local15 + Static164.anInt3140);
				Protocol.outboundBuffer.p2add(local18 + Static148.anInt2719);
			}
		}
		@Pc(485) Class11_Sub5_Sub2_Sub2 local485;
		if (local21 == 1006) {
			Static313.anInt5878 = 0;
			Static93.anInt1951 = 2;
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			local485 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local25];
			if (local485 != null) {
				@Pc(490) Class71 local490 = local485.aClass71_1;
				if (local490.anIntArray129 != null) {
					local490 = local490.method2093(Static214.aClass226_1);
				}
				if (local490 != null) {
					Static91.method1960(Static98.aClass145_73);
					Protocol.outboundBuffer.p2(local490.anInt2048);
				}
			}
		}
		if (local21 == 4) {
			local485 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local25];
			if (local485 != null) {
				Static320.anInt6005 = arg1;
				Static291.anInt5504 = arg2;
				Static313.anInt5878 = 0;
				Static93.anInt1951 = 2;
				Static91.method1960(Static4.aClass145_8);
				Protocol.outboundBuffer.ip2add(local25);
				Protocol.outboundBuffer.p1(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Static322.method5482(true, -2, local485.anIntArray317[0], 0, local485.method4328(), local485.anIntArray316[0], local485.method4328(), 0);
			}
		}
		if (local21 == 15) {
			Static313.anInt5878 = 0;
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			Static93.anInt1951 = 2;
			Static91.method1960(Static311.aClass145_204);
			Protocol.outboundBuffer.ip2add(local25);
			Protocol.outboundBuffer.p2add(Static148.anInt2719 + local18);
			Protocol.outboundBuffer.ip2add(Static164.anInt3140 + local15);
			Protocol.outboundBuffer.p1sub(Static174.aClass123_2.method3343(82) ? 1 : 0);
			Static151.method2756(local18, local15);
		}
		if (local21 == 10) {
			local485 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local25];
			if (local485 != null) {
				Static291.anInt5504 = arg2;
				Static320.anInt6005 = arg1;
				Static313.anInt5878 = 0;
				Static93.anInt1951 = 2;
				Static91.method1960(Static47.aClass145_43);
				Protocol.outboundBuffer.p4(Static337.anInt6317);
				Protocol.outboundBuffer.p1sub(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Protocol.outboundBuffer.ip2add(Static196.anInt3317);
				Protocol.outboundBuffer.ip2_dup(Static214.anInt3792);
				Protocol.outboundBuffer.p2(local25);
				Static322.method5482(true, -2, local485.anIntArray317[0], 0, local485.method4328(), local485.anIntArray316[0], local485.method4328(), 0);
			}
		}
		if (local21 == 17) {
			Static291.anInt5504 = arg2;
			Static320.anInt6005 = arg1;
			Static313.anInt5878 = 0;
			Static93.anInt1951 = 2;
			Static91.method1960(Static262.aClass145_251);
			Protocol.outboundBuffer.ip2add(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Protocol.outboundBuffer.p1(Static174.aClass123_2.method3343(82) ? 1 : 0);
			Protocol.outboundBuffer.p2(local15 + Static164.anInt3140);
			Protocol.outboundBuffer.ip2_dup(Static148.anInt2719 + local18);
			Static172.method3285(local18, local28, local15);
		}
		if (local21 == 60) {
			local275 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local275 != null) {
				Static93.anInt1951 = 2;
				Static291.anInt5504 = arg2;
				Static313.anInt5878 = 0;
				Static320.anInt6005 = arg1;
				Static91.method1960(Static299.aClass145_196);
				Protocol.outboundBuffer.ip4_dup(Static337.anInt6317);
				Protocol.outboundBuffer.p1sub(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Protocol.outboundBuffer.ip2_dup(Static214.anInt3792);
				Protocol.outboundBuffer.ip2add(Static196.anInt3317);
				Protocol.outboundBuffer.ip2_dup(local25);
				Static322.method5482(true, -2, local275.anIntArray317[0], 0, local275.method4328(), local275.anIntArray316[0], local275.method4328(), 0);
			}
		}
		if (local21 == 20) {
			Static320.anInt6005 = arg1;
			Static313.anInt5878 = 0;
			Static93.anInt1951 = 2;
			Static291.anInt5504 = arg2;
			Static91.method1960(Static110.aClass145_84);
			Protocol.outboundBuffer.ip2add(Static148.anInt2719 + local18);
			Protocol.outboundBuffer.p2add(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Protocol.outboundBuffer.p2(Static164.anInt3140 + local15);
			Protocol.outboundBuffer.p1neg(Static174.aClass123_2.method3343(82) ? 1 : 0);
			Static172.method3285(local18, local28, local15);
		}
		if (local21 == 58) {
			Static93.anInt1951 = 2;
			Static291.anInt5504 = arg2;
			Static320.anInt6005 = arg1;
			Static313.anInt5878 = 0;
			Static91.method1960(Static89.aClass145_67);
			Protocol.outboundBuffer.ip2add(local25);
			Protocol.outboundBuffer.p1add(Static174.aClass123_2.method3343(82) ? 1 : 0);
			Protocol.outboundBuffer.p2(Static148.anInt2719 + local18);
			Protocol.outboundBuffer.ip2_dup(Static164.anInt3140 + local15);
			Static151.method2756(local18, local15);
		}
		if (local21 == 13) {
			Static313.anInt5878 = 0;
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			Static93.anInt1951 = 2;
			Static91.method1960(Static372.aClass145_253);
			Protocol.outboundBuffer.p2(Static196.anInt3317);
			Protocol.outboundBuffer.ip2add(local25);
			Protocol.outboundBuffer.ip2_dup(Static164.anInt3140 + local15);
			Protocol.outboundBuffer.p1neg(Static174.aClass123_2.method3343(82) ? 1 : 0);
			Protocol.outboundBuffer.ip2add(Static214.anInt3792);
			Protocol.outboundBuffer.mp4(Static337.anInt6317);
			Protocol.outboundBuffer.ip2add(Static148.anInt2719 + local18);
			Static151.method2756(local18, local15);
		}
		if (local21 == 23) {
			local275 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local275 != null) {
				Static93.anInt1951 = 2;
				Static320.anInt6005 = arg1;
				Static313.anInt5878 = 0;
				Static291.anInt5504 = arg2;
				Static91.method1960(Static143.aClass145_102);
				Protocol.outboundBuffer.ip2_dup(local25);
				Protocol.outboundBuffer.p1add(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Static322.method5482(true, -2, local275.anIntArray317[0], 0, local275.method4328(), local275.anIntArray316[0], local275.method4328(), 0);
			}
		}
		if (local21 == 6) {
			Static291.anInt5504 = arg2;
			Static320.anInt6005 = arg1;
			Static313.anInt5878 = 0;
			Static93.anInt1951 = 2;
			Static91.method1960(Static382.aClass145_262);
			Protocol.outboundBuffer.p2(local25);
			Protocol.outboundBuffer.p1add(Static174.aClass123_2.method3343(82) ? 1 : 0);
			Protocol.outboundBuffer.p2add(local15 + Static164.anInt3140);
			Protocol.outboundBuffer.p2(Static148.anInt2719 + local18);
			Static151.method2756(local18, local15);
		}
		if (local21 == 22) {
			if (Static4.anInt90 > 0 && Static174.aClass123_2.method3343(82) && Static174.aClass123_2.method3343(81)) {
				Static6.method141(Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78, Static148.anInt2719 + local18, local15 + Static164.anInt3140);
			} else {
				Static65.method1736(local15, local18, local25);
				if (local25 == 1) {
					Protocol.outboundBuffer.p1(-1);
					Protocol.outboundBuffer.p1(-1);
					Protocol.outboundBuffer.p2((int) Static277.aFloat67);
					Protocol.outboundBuffer.p1(57);
					Protocol.outboundBuffer.p1(Static6.anInt158);
					Protocol.outboundBuffer.p1(Static97.anInt2005);
					Protocol.outboundBuffer.p1(89);
					Protocol.outboundBuffer.p2(Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6781);
					Protocol.outboundBuffer.p2(Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6783);
					Protocol.outboundBuffer.p1(63);
				} else {
					Static320.anInt6005 = arg1;
					Static313.anInt5878 = 0;
					Static93.anInt1951 = 1;
					Static291.anInt5504 = arg2;
				}
				Static322.method5482(true, -4, local18, 0, 1, local15, 1, 0);
			}
		}
		if (local21 == 50) {
			Static291.anInt5504 = arg2;
			Static313.anInt5878 = 0;
			Static93.anInt1951 = 2;
			Static320.anInt6005 = arg1;
			Static91.method1960(Static147.aClass145_103);
			Protocol.outboundBuffer.ip2_dup((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.ip2_dup(local15 + Static164.anInt3140);
			Protocol.outboundBuffer.ip2_dup(Static148.anInt2719 + local18);
			Protocol.outboundBuffer.p1(Static174.aClass123_2.method3343(82) ? 1 : 0);
			Static172.method3285(local18, local28, local15);
		}
		if (local21 == 8) {
			local485 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local25];
			if (local485 != null) {
				Static291.anInt5504 = arg2;
				Static93.anInt1951 = 2;
				Static313.anInt5878 = 0;
				Static320.anInt6005 = arg1;
				Static91.method1960(Static227.aClass145_151);
				Protocol.outboundBuffer.p2(local25);
				Protocol.outboundBuffer.p1add(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Static322.method5482(true, -2, local485.anIntArray317[0], 0, local485.method4328(), local485.anIntArray316[0], local485.method4328(), 0);
			}
		}
		if (local21 == 48) {
			local275 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local275 != null) {
				Static320.anInt6005 = arg1;
				Static93.anInt1951 = 2;
				Static291.anInt5504 = arg2;
				Static313.anInt5878 = 0;
				Static91.method1960(Static5.aClass145_9);
				Protocol.outboundBuffer.p1(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Protocol.outboundBuffer.ip2_dup(local25);
				Static322.method5482(true, -2, local275.anIntArray317[0], 0, local275.method4328(), local275.anIntArray316[0], local275.method4328(), 0);
			}
		}
		if (local21 == 25) {
			local485 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local25];
			if (local485 != null) {
				Static93.anInt1951 = 2;
				Static313.anInt5878 = 0;
				Static320.anInt6005 = arg1;
				Static291.anInt5504 = arg2;
				Static91.method1960(Static382.aClass145_259);
				Protocol.outboundBuffer.ip2add(local25);
				Protocol.outboundBuffer.p1sub(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Static322.method5482(true, -2, local485.anIntArray317[0], 0, local485.method4328(), local485.anIntArray316[0], local485.method4328(), 0);
			}
		}
		if (local21 == 57) {
			Static320.anInt6005 = arg1;
			Static313.anInt5878 = 0;
			Static93.anInt1951 = 2;
			Static291.anInt5504 = arg2;
			Static91.method1960(Static175.aClass145_132);
			Protocol.outboundBuffer.ip2_dup(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Protocol.outboundBuffer.imp4(Static337.anInt6317);
			Protocol.outboundBuffer.p2(Static196.anInt3317);
			Protocol.outboundBuffer.p1(Static174.aClass123_2.method3343(82) ? 1 : 0);
			Protocol.outboundBuffer.ip2add(Static214.anInt3792);
			Protocol.outboundBuffer.p2(Static164.anInt3140 + local15);
			Protocol.outboundBuffer.p2(Static148.anInt2719 + local18);
			Static172.method3285(local18, local28, local15);
		}
		if (local21 == 5) {
			local485 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local25];
			if (local485 != null) {
				Static313.anInt5878 = 0;
				Static93.anInt1951 = 2;
				Static291.anInt5504 = arg2;
				Static320.anInt6005 = arg1;
				Static91.method1960(Static331.aClass145_227);
				Protocol.outboundBuffer.p1neg(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Protocol.outboundBuffer.ip2_dup(local25);
				Static322.method5482(true, -2, local485.anIntArray317[0], 0, local485.method4328(), local485.anIntArray316[0], local485.method4328(), 0);
			}
		}
		if (local21 == 18) {
			local275 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local275 != null) {
				Static93.anInt1951 = 2;
				Static291.anInt5504 = arg2;
				Static313.anInt5878 = 0;
				Static320.anInt6005 = arg1;
				Static91.method1960(Static49.aClass145_45);
				Protocol.outboundBuffer.ip2add(local25);
				Protocol.outboundBuffer.p1add(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Static322.method5482(true, -2, local275.anIntArray317[0], 0, local275.method4328(), local275.anIntArray316[0], local275.method4328(), 0);
			}
		}
		if (local21 == 9) {
			local275 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local275 != null) {
				Static313.anInt5878 = 0;
				Static320.anInt6005 = arg1;
				Static291.anInt5504 = arg2;
				Static93.anInt1951 = 2;
				Static91.method1960(Static132.aClass145_92);
				Protocol.outboundBuffer.ip2_dup(local25);
				Protocol.outboundBuffer.p1sub(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Static322.method5482(true, -2, local275.anIntArray317[0], 0, local275.method4328(), local275.anIntArray316[0], local275.method4328(), 0);
			}
		}
		@Pc(1723) Class161 local1723;
		if (local21 == 49) {
			local1723 = Static207.method3705(local18, local15);
			if (local1723 != null) {
				Static207.method3699();
				@Pc(1730) Class2_Sub10 local1730 = Static45.method1404(local1723);
				Static185.method3400(local1723.anInt4238, local1730.method1852(), local18, local15, local1723.anInt4286, local1730.anInt1759);
				Static91.aString18 = Static163.method3104(local1723);
				if (Static91.aString18 == null) {
					Static91.aString18 = "Null";
				}
				Static371.aString68 = local1723.aString45 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 1010) {
			Static320.anInt6005 = arg1;
			Static93.anInt1951 = 2;
			Static291.anInt5504 = arg2;
			Static313.anInt5878 = 0;
			Static91.method1960(Static374.aClass145_255);
			Protocol.outboundBuffer.p2(local25);
		}
		if (local21 == 19) {
			local275 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local275 != null) {
				Static320.anInt6005 = arg1;
				Static291.anInt5504 = arg2;
				Static93.anInt1951 = 2;
				Static313.anInt5878 = 0;
				Static91.method1960(Static265.aClass145_173);
				Protocol.outboundBuffer.ip2add(local25);
				Protocol.outboundBuffer.p1neg(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Static322.method5482(true, -2, local275.anIntArray317[0], 0, local275.method4328(), local275.anIntArray316[0], local275.method4328(), 0);
			}
		}
		if (local21 == 1008 || local21 == 1002 || local21 == 1012 || local21 == 1003 || local21 == 1007) {
			Static115.method3809(local25, local21, local15);
		}
		if (local21 == 11) {
			local1723 = Static207.method3705(local18, local15);
			if (local1723 != null) {
				Static366.method6129(local1723);
			}
		}
		if (local21 == 47) {
			local275 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local275 != null) {
				Static320.anInt6005 = arg1;
				Static291.anInt5504 = arg2;
				Static313.anInt5878 = 0;
				Static93.anInt1951 = 2;
				Static91.method1960(Static183.aClass145_7);
				Protocol.outboundBuffer.p1neg(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Protocol.outboundBuffer.ip2_dup(local25);
				Static322.method5482(true, -2, local275.anIntArray317[0], 0, local275.method4328(), local275.anIntArray316[0], local275.method4328(), 0);
			}
		}
		if (local21 == 30 && Static192.aClass161_8 == null) {
			Static94.method2045(local18, local15);
			Static192.aClass161_8 = Static207.method3705(local18, local15);
			Static200.method3645(Static192.aClass161_8);
		}
		if (local21 == 44) {
			local275 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local275 != null) {
				Static313.anInt5878 = 0;
				Static291.anInt5504 = arg2;
				Static93.anInt1951 = 2;
				Static320.anInt6005 = arg1;
				Static91.method1960(Static7.aClass145_267);
				Protocol.outboundBuffer.p1(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Protocol.outboundBuffer.ip2add(local25);
				Static322.method5482(true, -2, local275.anIntArray317[0], 0, local275.method4328(), local275.anIntArray316[0], local275.method4328(), 0);
			}
		}
		if (local21 == 3) {
			local485 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local25];
			if (local485 != null) {
				Static320.anInt6005 = arg1;
				Static291.anInt5504 = arg2;
				Static313.anInt5878 = 0;
				Static93.anInt1951 = 2;
				Static91.method1960(Static316.aClass145_214);
				Protocol.outboundBuffer.p2(local25);
				Protocol.outboundBuffer.p1neg(Static174.aClass123_2.method3343(82) ? 1 : 0);
				Static322.method5482(true, -2, local485.anIntArray317[0], 0, local485.method4328(), local485.anIntArray316[0], local485.method4328(), 0);
			}
		}
		if (Static330.aBoolean419) {
			Static207.method3699();
		}
		if (Static64.aClass161_2 != null && Static112.anInt2293 == 0) {
			Static200.method3645(Static64.aClass161_2);
		}
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(III)V")
	public static void method4429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static330.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass11_Sub1_3 != null) {
			local7.aClass11_Sub1_3 = null;
		}
		if (local7.aClass11_Sub1_2 != null) {
			local7.aClass11_Sub1_2 = null;
		}
	}
}
