import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	public static int anInt92;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!we;")
	public static final Class215 aClass215_1 = new Class215(50);

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
	public static final int[] anIntArray1 = new int[25];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V")
	public static void method60(@OriginalArg(1) int arg0) {
		Static177.anInt4224 = arg0;
		@Pc(7) Class215 local7 = Static245.aClass215_50;
		synchronized (Static245.aClass215_50) {
			Static245.aClass215_50.method6060();
		}
		local7 = Static256.aClass215_78;
		synchronized (Static256.aClass215_78) {
			Static256.aClass215_78.method6060();
		}
		local7 = Static301.aClass215_89;
		synchronized (Static301.aClass215_89) {
			Static301.aClass215_89.method6060();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZLclient!nr;Lclient!ta;I)V")
	public static void method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class40 arg2, @OriginalArg(4) Class189 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class59 local8 = Static155.method3333(arg3.anInt6201);
		if (local8.anInt2063 == -1) {
			return;
		}
		if (arg3.aBoolean439) {
			@Pc(25) int local25 = arg4 + arg3.anInt6189;
			arg4 = local25 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(37) Class29 local37 = local8.method1744(arg3.aBoolean441, arg4, arg2);
		if (local37 == null) {
			return;
		}
		@Pc(43) int local43 = arg3.anInt6195;
		@Pc(46) int local46 = arg3.anInt6173;
		if ((arg4 & 0x1) == 1) {
			local46 = arg3.anInt6195;
			local43 = arg3.anInt6173;
		}
		@Pc(60) int local60 = local37.method5850();
		@Pc(69) int local69 = local37.method5832();
		if (local8.aBoolean139) {
			local69 = local46 * 4;
			local60 = local43 * 4;
		}
		if (local8.anInt2067 == 0) {
			local37.method5834(arg1, arg0 + 4 - local46 * 4, local60, local69);
		} else {
			local37.method5835(arg1, arg0 + 4 - local46 * 4, local60, local69, 1, local8.anInt2067 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!mb;I)V")
	public static void method62(@OriginalArg(0) Class1_Sub22 arg0) {
		if (arg0 == null || arg0 == Static97.aClass130_9.aClass1_138) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt4310;
		@Pc(18) int local18 = arg0.anInt4307;
		@Pc(21) int local21 = arg0.anInt4308;
		@Pc(25) int local25 = (int) arg0.aLong126;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg0.aLong126;
		@Pc(41) Class7_Sub1_Sub1_Sub2 local41;
		if (local21 == 59) {
			local41 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static146.anInt3616 = 2;
				Static259.anInt4929 = Static121.anInt3045;
				Static53.anInt1589 = Static324.anInt6648;
				Static145.anInt3605 = 0;
				Static150.aClass1_Sub16_Sub2_2.method5793(94);
				Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
				Static150.aClass1_Sub16_Sub2_2.method5734(local25);
				Static328.method5704(-2, local41.anIntArray578[0], 0, local41.anIntArray579[0], local41.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local41.method5973(), true);
			}
		}
		if (local21 == 2) {
			Static150.aClass1_Sub16_Sub2_2.method5793(248);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			Static150.aClass1_Sub16_Sub2_2.method5782(local15);
			Static150.aClass1_Sub16_Sub2_2.method5734(local25);
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		@Pc(141) Class177 local141;
		if (local21 == 4) {
			local141 = Static183.method3720(local15, local18);
			if (local141 != null) {
				Static95.method2033();
				@Pc(148) Class1_Sub39 local148 = Static37.method930(local141);
				Static307.method5404(local148.anInt6605, local141.anInt5785, local15, local141.anInt5752, local148.method5626(), local18);
				Static234.anInt5231 = 0;
				Static49.aString57 = Static117.method2573(local141);
				if (Static49.aString57 == null) {
					Static49.aString57 = "Null";
				}
				if (local141.aBoolean404) {
					Static174.aString153 = local141.aString216 + "<col=ffffff>";
					return;
				}
				Static174.aString153 = "<col=00ff00>" + local141.aString215 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 1007 || local21 == 1002 || local21 == 1010 || local21 == 1003 || local21 == 1004) {
			Static336.method5947(local15, local21, local25);
		}
		if (local21 == 1009) {
			Static146.anInt3616 = 2;
			Static53.anInt1589 = Static324.anInt6648;
			Static145.anInt3605 = 0;
			Static259.anInt4929 = Static121.anInt3045;
			Static150.aClass1_Sub16_Sub2_2.method5793(142);
			Static150.aClass1_Sub16_Sub2_2.method5782(local25);
		}
		if (local21 == 18) {
			Static150.aClass1_Sub16_Sub2_2.method5793(78);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			Static150.aClass1_Sub16_Sub2_2.method5782(local25);
			Static150.aClass1_Sub16_Sub2_2.method5757(Static156.anInt3876);
			Static150.aClass1_Sub16_Sub2_2.method5734(local15);
			Static150.aClass1_Sub16_Sub2_2.method5780(Static139.anInt3442);
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		if (local21 == 1005) {
			Static259.anInt4929 = Static121.anInt3045;
			Static53.anInt1589 = Static324.anInt6648;
			Static146.anInt3616 = 2;
			Static145.anInt3605 = 0;
			Static150.aClass1_Sub16_Sub2_2.method5793(124);
			Static150.aClass1_Sub16_Sub2_2.method5770(local25);
		}
		if (local21 == 49) {
			local41 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static146.anInt3616 = 2;
				Static145.anInt3605 = 0;
				Static53.anInt1589 = Static324.anInt6648;
				Static259.anInt4929 = Static121.anInt3045;
				Static150.aClass1_Sub16_Sub2_2.method5793(152);
				Static150.aClass1_Sub16_Sub2_2.method5783(Static345.aBooleanArray30[82] ? 1 : 0);
				Static150.aClass1_Sub16_Sub2_2.method5757(local25);
				Static328.method5704(-2, local41.anIntArray578[0], 0, local41.anIntArray579[0], local41.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local41.method5973(), true);
			}
		}
		@Pc(379) Class7_Sub1_Sub1_Sub1 local379;
		if (local21 == 23) {
			local379 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local25];
			if (local379 != null) {
				Static145.anInt3605 = 0;
				Static259.anInt4929 = Static121.anInt3045;
				Static146.anInt3616 = 2;
				Static53.anInt1589 = Static324.anInt6648;
				Static150.aClass1_Sub16_Sub2_2.method5793(136);
				Static150.aClass1_Sub16_Sub2_2.method5757(Static326.anInt6657);
				Static150.aClass1_Sub16_Sub2_2.method5780(Static285.anInt6031);
				Static150.aClass1_Sub16_Sub2_2.method5760(Static345.aBooleanArray30[82] ? 1 : 0);
				Static150.aClass1_Sub16_Sub2_2.method5770(Static18.anInt664);
				Static150.aClass1_Sub16_Sub2_2.method5734(local25);
				Static328.method5704(-2, local379.anIntArray578[0], 0, local379.anIntArray579[0], local379.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local379.method5973(), true);
			}
		}
		if (local21 == 16) {
			local41 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static259.anInt4929 = Static121.anInt3045;
				Static145.anInt3605 = 0;
				Static53.anInt1589 = Static324.anInt6648;
				Static146.anInt3616 = 2;
				Static150.aClass1_Sub16_Sub2_2.method5793(185);
				Static150.aClass1_Sub16_Sub2_2.method5760(Static345.aBooleanArray30[82] ? 1 : 0);
				Static150.aClass1_Sub16_Sub2_2.method5757(local25);
				Static328.method5704(-2, local41.anIntArray578[0], 0, local41.anIntArray579[0], local41.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local41.method5973(), true);
			}
		}
		if (local21 == 42) {
			Static150.aClass1_Sub16_Sub2_2.method5793(69);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			Static150.aClass1_Sub16_Sub2_2.method5782(local15);
			Static150.aClass1_Sub16_Sub2_2.method5770(local25);
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		if (local21 == 1011) {
			Static259.anInt4929 = Static121.anInt3045;
			Static53.anInt1589 = Static324.anInt6648;
			Static146.anInt3616 = 2;
			Static145.anInt3605 = 0;
			Static150.aClass1_Sub16_Sub2_2.method5793(143);
			Static150.aClass1_Sub16_Sub2_2.method5770((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static150.aClass1_Sub16_Sub2_2.method5760(Static345.aBooleanArray30[82] ? 1 : 0);
			Static150.aClass1_Sub16_Sub2_2.method5770(local15 + Static149.anInt3667);
			Static150.aClass1_Sub16_Sub2_2.method5770(local18 + Static96.anInt2446);
			Static81.method5971(local15, local18, local34);
		}
		if (local21 == 11) {
			Static95.method2033();
			local141 = Static298.method5252(local18);
			Static326.anInt6657 = local15;
			Static234.anInt5231 = 1;
			Static18.anInt664 = local25;
			Static285.anInt6031 = local18;
			Static145.method3188(local141);
			Static238.aString187 = "<col=ff9040>" + Static165.method3446(local25).aString51 + "<col=ffffff>";
			if (Static238.aString187 == null) {
				Static238.aString187 = "null";
			}
			return;
		}
		if (local21 == 44) {
			Static145.anInt3605 = 0;
			Static146.anInt3616 = 2;
			Static53.anInt1589 = Static324.anInt6648;
			Static259.anInt4929 = Static121.anInt3045;
			Static150.aClass1_Sub16_Sub2_2.method5793(159);
			Static150.aClass1_Sub16_Sub2_2.method5757(Static156.anInt3876);
			Static150.aClass1_Sub16_Sub2_2.method5757(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static150.aClass1_Sub16_Sub2_2.method5780(Static139.anInt3442);
			Static150.aClass1_Sub16_Sub2_2.method5782(local15 + Static149.anInt3667);
			Static150.aClass1_Sub16_Sub2_2.method5783(Static345.aBooleanArray30[82] ? 1 : 0);
			Static150.aClass1_Sub16_Sub2_2.method5770(local18 + Static96.anInt2446);
			Static81.method5971(local15, local18, local34);
		}
		if (local21 == 8) {
			local379 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local25];
			if (local379 != null) {
				Static53.anInt1589 = Static324.anInt6648;
				Static259.anInt4929 = Static121.anInt3045;
				Static145.anInt3605 = 0;
				Static146.anInt3616 = 2;
				Static150.aClass1_Sub16_Sub2_2.method5793(207);
				Static150.aClass1_Sub16_Sub2_2.method5734(local25);
				Static150.aClass1_Sub16_Sub2_2.method5783(Static345.aBooleanArray30[82] ? 1 : 0);
				Static328.method5704(-2, local379.anIntArray578[0], 0, local379.anIntArray579[0], local379.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local379.method5973(), true);
			}
		}
		if (local21 == 10) {
			local41 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static145.anInt3605 = 0;
				Static53.anInt1589 = Static324.anInt6648;
				Static146.anInt3616 = 2;
				Static259.anInt4929 = Static121.anInt3045;
				Static150.aClass1_Sub16_Sub2_2.method5793(141);
				Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
				Static150.aClass1_Sub16_Sub2_2.method5757(local25);
				Static328.method5704(-2, local41.anIntArray578[0], 0, local41.anIntArray579[0], local41.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local41.method5973(), true);
			}
		}
		@Pc(886) int local886;
		if (local21 == 38) {
			Static150.aClass1_Sub16_Sub2_2.method5793(205);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			local141 = Static298.method5252(local18);
			if (local141.anIntArrayArray39 != null && local141.anIntArrayArray39[0][0] == 5) {
				local886 = local141.anIntArrayArray39[0][1];
				if (Static78.anIntArray137[local886] != local141.anIntArray440[0]) {
					Static78.anIntArray137[local886] = local141.anIntArray440[0];
					Static200.method3963(local886);
				}
			}
		}
		if (local21 == 25) {
			local41 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static259.anInt4929 = Static121.anInt3045;
				Static146.anInt3616 = 2;
				Static145.anInt3605 = 0;
				Static53.anInt1589 = Static324.anInt6648;
				Static150.aClass1_Sub16_Sub2_2.method5793(79);
				Static150.aClass1_Sub16_Sub2_2.method5751(Static345.aBooleanArray30[82] ? 1 : 0);
				Static150.aClass1_Sub16_Sub2_2.method5734(Static156.anInt3876);
				Static150.aClass1_Sub16_Sub2_2.method5756(Static139.anInt3442);
				Static150.aClass1_Sub16_Sub2_2.method5782(local25);
				Static328.method5704(-2, local41.anIntArray578[0], 0, local41.anIntArray579[0], local41.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local41.method5973(), true);
			}
		}
		if (local21 == 47) {
			Static259.anInt4929 = Static121.anInt3045;
			Static146.anInt3616 = 2;
			Static53.anInt1589 = Static324.anInt6648;
			Static145.anInt3605 = 0;
			Static150.aClass1_Sub16_Sub2_2.method5793(26);
			Static150.aClass1_Sub16_Sub2_2.method5757(local15 + Static149.anInt3667);
			Static150.aClass1_Sub16_Sub2_2.method5770((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static150.aClass1_Sub16_Sub2_2.method5770(local18 + Static96.anInt2446);
			Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
			Static81.method5971(local15, local18, local34);
		}
		if (local21 == 40) {
			Static11.method6077(false);
		}
		if (local21 == 20) {
			local41 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static53.anInt1589 = Static324.anInt6648;
				Static145.anInt3605 = 0;
				Static146.anInt3616 = 2;
				Static259.anInt4929 = Static121.anInt3045;
				Static150.aClass1_Sub16_Sub2_2.method5793(128);
				Static150.aClass1_Sub16_Sub2_2.method5782(local25);
				Static150.aClass1_Sub16_Sub2_2.method5760(Static345.aBooleanArray30[82] ? 1 : 0);
				Static328.method5704(-2, local41.anIntArray578[0], 0, local41.anIntArray579[0], local41.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local41.method5973(), true);
			}
		}
		if (local21 == 45) {
			Static53.anInt1589 = Static324.anInt6648;
			Static146.anInt3616 = 2;
			Static259.anInt4929 = Static121.anInt3045;
			Static145.anInt3605 = 0;
			Static150.aClass1_Sub16_Sub2_2.method5793(190);
			Static150.aClass1_Sub16_Sub2_2.method5783(Static345.aBooleanArray30[82] ? 1 : 0);
			Static150.aClass1_Sub16_Sub2_2.method5782(local18 + Static96.anInt2446);
			Static150.aClass1_Sub16_Sub2_2.method5757(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static150.aClass1_Sub16_Sub2_2.method5757(Static149.anInt3667 + local15);
			Static81.method5971(local15, local18, local34);
		}
		if (local21 == 14) {
			local379 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local25];
			if (local379 != null) {
				Static259.anInt4929 = Static121.anInt3045;
				Static145.anInt3605 = 0;
				Static146.anInt3616 = 2;
				Static53.anInt1589 = Static324.anInt6648;
				Static150.aClass1_Sub16_Sub2_2.method5793(38);
				Static150.aClass1_Sub16_Sub2_2.method5734(local25);
				Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
				Static328.method5704(-2, local379.anIntArray578[0], 0, local379.anIntArray579[0], local379.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local379.method5973(), true);
			}
		}
		if (local21 == 46) {
			Static53.anInt1589 = Static324.anInt6648;
			Static146.anInt3616 = 2;
			Static259.anInt4929 = Static121.anInt3045;
			Static145.anInt3605 = 0;
			Static150.aClass1_Sub16_Sub2_2.method5793(194);
			Static150.aClass1_Sub16_Sub2_2.method5770(Static96.anInt2446 + local18);
			Static150.aClass1_Sub16_Sub2_2.method5782(local25);
			Static150.aClass1_Sub16_Sub2_2.method5770(local15 + Static149.anInt3667);
			Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
			Static213.method1621(local18, local15);
		}
		if (local21 == 32) {
			Static145.anInt3605 = 0;
			Static259.anInt4929 = Static121.anInt3045;
			Static146.anInt3616 = 2;
			Static53.anInt1589 = Static324.anInt6648;
			Static150.aClass1_Sub16_Sub2_2.method5793(40);
			Static150.aClass1_Sub16_Sub2_2.method5757(Static96.anInt2446 + local18);
			Static150.aClass1_Sub16_Sub2_2.method5770(Static18.anInt664);
			Static150.aClass1_Sub16_Sub2_2.method5768(Static285.anInt6031);
			Static150.aClass1_Sub16_Sub2_2.method5770(local25);
			Static150.aClass1_Sub16_Sub2_2.method5757(Static326.anInt6657);
			Static150.aClass1_Sub16_Sub2_2.method5770(local15 + Static149.anInt3667);
			Static150.aClass1_Sub16_Sub2_2.method5760(Static345.aBooleanArray30[82] ? 1 : 0);
			Static213.method1621(local18, local15);
		}
		if (local21 == 57) {
			if (Static87.anInt2332 > 0 && Static345.aBooleanArray30[82] && Static345.aBooleanArray30[81]) {
				Static53.method1383(Static39.anInt1215, local18 + Static96.anInt2446, local15 + Static149.anInt3667);
			} else {
				Static9.method336(local18, local25, local15);
				if (local25 == 1) {
					Static150.aClass1_Sub16_Sub2_2.method5771(-1);
					Static150.aClass1_Sub16_Sub2_2.method5771(-1);
					Static150.aClass1_Sub16_Sub2_2.method5757((int) Static188.aFloat17);
					Static150.aClass1_Sub16_Sub2_2.method5771(57);
					Static150.aClass1_Sub16_Sub2_2.method5771(Static238.anInt5295);
					Static150.aClass1_Sub16_Sub2_2.method5771(Static312.anInt6009);
					Static150.aClass1_Sub16_Sub2_2.method5771(89);
					Static150.aClass1_Sub16_Sub2_2.method5757(Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027);
					Static150.aClass1_Sub16_Sub2_2.method5757(Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032);
					Static150.aClass1_Sub16_Sub2_2.method5771(63);
				} else {
					Static145.anInt3605 = 0;
					Static53.anInt1589 = Static324.anInt6648;
					Static146.anInt3616 = 1;
					Static259.anInt4929 = Static121.anInt3045;
				}
				Static328.method5704(-4, local15, 0, local18, 1, Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, 1, true);
			}
		}
		if (local21 == 60) {
			Static53.anInt1589 = Static324.anInt6648;
			Static259.anInt4929 = Static121.anInt3045;
			Static146.anInt3616 = 2;
			Static145.anInt3605 = 0;
			Static150.aClass1_Sub16_Sub2_2.method5793(174);
			Static150.aClass1_Sub16_Sub2_2.method5757(local15 + Static149.anInt3667);
			Static150.aClass1_Sub16_Sub2_2.method5782(local25);
			Static150.aClass1_Sub16_Sub2_2.method5770(Static96.anInt2446 + local18);
			Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
			Static213.method1621(local18, local15);
		}
		if (local21 == 22) {
			Static234.method4460(local18, local15);
		}
		if (local21 == 1008) {
			Static146.anInt3616 = 2;
			Static259.anInt4929 = Static121.anInt3045;
			Static53.anInt1589 = Static324.anInt6648;
			Static145.anInt3605 = 0;
			local379 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local25];
			if (local379 != null) {
				@Pc(1547) Class75 local1547 = local379.aClass75_1;
				if (local1547.anIntArray155 != null) {
					local1547 = local1547.method2064();
				}
				if (local1547 != null) {
					Static150.aClass1_Sub16_Sub2_2.method5793(49);
					Static150.aClass1_Sub16_Sub2_2.method5734(local1547.anInt2491);
				}
			}
		}
		if (local21 == 5) {
			Static145.anInt3605 = 0;
			Static53.anInt1589 = Static324.anInt6648;
			Static146.anInt3616 = 2;
			Static259.anInt4929 = Static121.anInt3045;
			Static150.aClass1_Sub16_Sub2_2.method5793(6);
			Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
			Static150.aClass1_Sub16_Sub2_2.method5734(local25);
			Static150.aClass1_Sub16_Sub2_2.method5782(Static96.anInt2446 + local18);
			Static150.aClass1_Sub16_Sub2_2.method5734(local15 + Static149.anInt3667);
			Static213.method1621(local18, local15);
		}
		if (local21 == 29) {
			local141 = Static298.method5252(local18);
			@Pc(1628) boolean local1628 = true;
			if (local141.anInt5819 > 0) {
				local1628 = Static344.method6049(local141);
			}
			if (local1628) {
				Static150.aClass1_Sub16_Sub2_2.method5793(205);
				Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			}
		}
		if (local21 == 15) {
			Static150.aClass1_Sub16_Sub2_2.method5793(168);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			Static150.aClass1_Sub16_Sub2_2.method5734(local15);
			Static150.aClass1_Sub16_Sub2_2.method5770(local25);
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		if (local21 == 41) {
			local379 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local25];
			if (local379 != null) {
				Static259.anInt4929 = Static121.anInt3045;
				Static146.anInt3616 = 2;
				Static145.anInt3605 = 0;
				Static53.anInt1589 = Static324.anInt6648;
				Static150.aClass1_Sub16_Sub2_2.method5793(254);
				Static150.aClass1_Sub16_Sub2_2.method5782(local25);
				Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
				Static328.method5704(-2, local379.anIntArray578[0], 0, local379.anIntArray579[0], local379.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local379.method5973(), true);
			}
		}
		if (local21 == 36 || local21 == 1006) {
			Static8.method230(arg0.aString159, local18, local25, local15);
		}
		if (local21 == 34) {
			Static150.aClass1_Sub16_Sub2_2.method5793(205);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			local141 = Static298.method5252(local18);
			if (local141.anIntArrayArray39 != null && local141.anIntArrayArray39[0][0] == 5) {
				local886 = local141.anIntArrayArray39[0][1];
				Static78.anIntArray137[local886] = 1 - Static78.anIntArray137[local886];
				Static200.method3963(local886);
			}
		}
		if (local21 == 39) {
			Static145.anInt3605 = 0;
			Static146.anInt3616 = 2;
			Static259.anInt4929 = Static121.anInt3045;
			Static53.anInt1589 = Static324.anInt6648;
			Static150.aClass1_Sub16_Sub2_2.method5793(12);
			Static150.aClass1_Sub16_Sub2_2.method5782(local18 + Static96.anInt2446);
			Static150.aClass1_Sub16_Sub2_2.method5770(Static149.anInt3667 + local15);
			Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
			Static150.aClass1_Sub16_Sub2_2.method5734(local25);
			Static213.method1621(local18, local15);
		}
		if (local21 == 24 && Static262.aClass177_15 == null) {
			Static257.method4731(local18, local15);
			Static262.aClass177_15 = Static183.method3720(local15, local18);
			Static145.method3188(Static262.aClass177_15);
		}
		if (local21 == 48) {
			Static150.aClass1_Sub16_Sub2_2.method5793(111);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			Static150.aClass1_Sub16_Sub2_2.method5757(local15);
			Static150.aClass1_Sub16_Sub2_2.method5770(local25);
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		if (local21 == 50) {
			Static53.anInt1589 = Static324.anInt6648;
			Static145.anInt3605 = 0;
			Static259.anInt4929 = Static121.anInt3045;
			Static146.anInt3616 = 1;
			Static150.aClass1_Sub16_Sub2_2.method5793(241);
			Static150.aClass1_Sub16_Sub2_2.method5782(local18 + Static96.anInt2446);
			Static150.aClass1_Sub16_Sub2_2.method5770(local15 + Static149.anInt3667);
			Static150.aClass1_Sub16_Sub2_2.method5775(Static139.anInt3442);
			Static150.aClass1_Sub16_Sub2_2.method5734(Static156.anInt3876);
			Static328.method5704(-4, local15, 0, local18, 1, Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, 1, true);
		}
		if (local21 == 12) {
			Static53.anInt1589 = Static324.anInt6648;
			Static259.anInt4929 = Static121.anInt3045;
			Static146.anInt3616 = 2;
			Static145.anInt3605 = 0;
			Static150.aClass1_Sub16_Sub2_2.method5793(202);
			Static150.aClass1_Sub16_Sub2_2.method5734(local18 + Static96.anInt2446);
			Static150.aClass1_Sub16_Sub2_2.method5734(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static150.aClass1_Sub16_Sub2_2.method5780(Static285.anInt6031);
			Static150.aClass1_Sub16_Sub2_2.method5782(Static18.anInt664);
			Static150.aClass1_Sub16_Sub2_2.method5782(Static326.anInt6657);
			Static150.aClass1_Sub16_Sub2_2.method5734(local15 + Static149.anInt3667);
			Static150.aClass1_Sub16_Sub2_2.method5760(Static345.aBooleanArray30[82] ? 1 : 0);
			Static81.method5971(local15, local18, local34);
		}
		if (local21 == 26) {
			Static150.aClass1_Sub16_Sub2_2.method5793(229);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			Static150.aClass1_Sub16_Sub2_2.method5770(local25);
			Static150.aClass1_Sub16_Sub2_2.method5770(local15);
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		if (local21 == 58) {
			Static145.anInt3605 = 0;
			Static146.anInt3616 = 2;
			Static259.anInt4929 = Static121.anInt3045;
			Static53.anInt1589 = Static324.anInt6648;
			Static150.aClass1_Sub16_Sub2_2.method5793(151);
			Static150.aClass1_Sub16_Sub2_2.method5770(Static149.anInt3667 + local15);
			Static150.aClass1_Sub16_Sub2_2.method5757(local18 + Static96.anInt2446);
			Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
			Static150.aClass1_Sub16_Sub2_2.method5734(local25);
			Static213.method1621(local18, local15);
		}
		if (local21 == 21) {
			local41 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static145.anInt3605 = 0;
				Static53.anInt1589 = Static324.anInt6648;
				Static259.anInt4929 = Static121.anInt3045;
				Static146.anInt3616 = 2;
				Static150.aClass1_Sub16_Sub2_2.method5793(35);
				Static150.aClass1_Sub16_Sub2_2.method5757(local25);
				Static150.aClass1_Sub16_Sub2_2.method5751(Static345.aBooleanArray30[82] ? 1 : 0);
				Static328.method5704(-2, local41.anIntArray578[0], 0, local41.anIntArray579[0], local41.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local41.method5973(), true);
			}
		}
		if (local21 == 17) {
			if (Static87.anInt2332 > 0 && Static345.aBooleanArray30[82] && Static345.aBooleanArray30[81]) {
				Static53.method1383(Static39.anInt1215, Static96.anInt2446 + local18, Static149.anInt3667 - -local15);
			} else {
				Static259.anInt4929 = Static121.anInt3045;
				Static145.anInt3605 = 0;
				Static53.anInt1589 = Static324.anInt6648;
				Static146.anInt3616 = 1;
				Static150.aClass1_Sub16_Sub2_2.method5793(160);
				Static150.aClass1_Sub16_Sub2_2.method5782(local15 + Static149.anInt3667);
				Static150.aClass1_Sub16_Sub2_2.method5734(local18 + Static96.anInt2446);
			}
		}
		if (local21 == 28) {
			local41 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static146.anInt3616 = 2;
				Static53.anInt1589 = Static324.anInt6648;
				Static259.anInt4929 = Static121.anInt3045;
				Static145.anInt3605 = 0;
				Static150.aClass1_Sub16_Sub2_2.method5793(114);
				Static150.aClass1_Sub16_Sub2_2.method5757(local25);
				Static150.aClass1_Sub16_Sub2_2.method5751(Static345.aBooleanArray30[82] ? 1 : 0);
				Static328.method5704(-2, local41.anIntArray578[0], 0, local41.anIntArray579[0], local41.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local41.method5973(), true);
			}
		}
		if (local21 == 1) {
			local379 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local25];
			if (local379 != null) {
				Static53.anInt1589 = Static324.anInt6648;
				Static146.anInt3616 = 2;
				Static259.anInt4929 = Static121.anInt3045;
				Static145.anInt3605 = 0;
				Static150.aClass1_Sub16_Sub2_2.method5793(95);
				Static150.aClass1_Sub16_Sub2_2.method5734(local25);
				Static150.aClass1_Sub16_Sub2_2.method5751(Static345.aBooleanArray30[82] ? 1 : 0);
				Static328.method5704(-2, local379.anIntArray578[0], 0, local379.anIntArray579[0], local379.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local379.method5973(), true);
			}
		}
		if (local21 == 7) {
			Static53.anInt1589 = Static324.anInt6648;
			Static145.anInt3605 = 0;
			Static259.anInt4929 = Static121.anInt3045;
			Static146.anInt3616 = 2;
			Static150.aClass1_Sub16_Sub2_2.method5793(54);
			Static150.aClass1_Sub16_Sub2_2.method5757(Static156.anInt3876);
			Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
			Static150.aClass1_Sub16_Sub2_2.method5770(local25);
			Static150.aClass1_Sub16_Sub2_2.method5770(local15 + Static149.anInt3667);
			Static150.aClass1_Sub16_Sub2_2.method5780(Static139.anInt3442);
			Static150.aClass1_Sub16_Sub2_2.method5757(local18 + Static96.anInt2446);
			Static213.method1621(local18, local15);
		}
		if (local21 == 13) {
			local379 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local25];
			if (local379 != null) {
				Static259.anInt4929 = Static121.anInt3045;
				Static53.anInt1589 = Static324.anInt6648;
				Static146.anInt3616 = 2;
				Static145.anInt3605 = 0;
				Static150.aClass1_Sub16_Sub2_2.method5793(84);
				Static150.aClass1_Sub16_Sub2_2.method5734(Static156.anInt3876);
				Static150.aClass1_Sub16_Sub2_2.method5757(local25);
				Static150.aClass1_Sub16_Sub2_2.method5760(Static345.aBooleanArray30[82] ? 1 : 0);
				Static150.aClass1_Sub16_Sub2_2.method5756(Static139.anInt3442);
				Static328.method5704(-2, local379.anIntArray578[0], 0, local379.anIntArray579[0], local379.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local379.method5973(), true);
			}
		}
		if (local21 == 51) {
			local41 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static146.anInt3616 = 2;
				Static53.anInt1589 = Static324.anInt6648;
				Static145.anInt3605 = 0;
				Static259.anInt4929 = Static121.anInt3045;
				Static150.aClass1_Sub16_Sub2_2.method5793(140);
				Static150.aClass1_Sub16_Sub2_2.method5734(local25);
				Static150.aClass1_Sub16_Sub2_2.method5751(Static345.aBooleanArray30[82] ? 1 : 0);
				Static328.method5704(-2, local41.anIntArray578[0], 0, local41.anIntArray579[0], local41.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local41.method5973(), true);
			}
		}
		if (local21 == 33) {
			Static53.anInt1589 = Static324.anInt6648;
			Static146.anInt3616 = 2;
			Static145.anInt3605 = 0;
			Static259.anInt4929 = Static121.anInt3045;
			Static150.aClass1_Sub16_Sub2_2.method5793(181);
			Static150.aClass1_Sub16_Sub2_2.method5782(Static149.anInt3667 + local15);
			Static150.aClass1_Sub16_Sub2_2.method5770(local18 + Static96.anInt2446);
			Static150.aClass1_Sub16_Sub2_2.method5757(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
			Static81.method5971(local15, local18, local34);
		}
		if (local21 == 37) {
			Static146.anInt3616 = 2;
			Static53.anInt1589 = Static324.anInt6648;
			Static259.anInt4929 = Static121.anInt3045;
			Static145.anInt3605 = 0;
			Static150.aClass1_Sub16_Sub2_2.method5793(45);
			Static150.aClass1_Sub16_Sub2_2.method5757(local15 + Static149.anInt3667);
			Static150.aClass1_Sub16_Sub2_2.method5760(Static345.aBooleanArray30[82] ? 1 : 0);
			Static150.aClass1_Sub16_Sub2_2.method5734(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static150.aClass1_Sub16_Sub2_2.method5734(local18 + Static96.anInt2446);
			Static81.method5971(local15, local18, local34);
		}
		if (local21 == 31) {
			Static150.aClass1_Sub16_Sub2_2.method5793(29);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			Static150.aClass1_Sub16_Sub2_2.method5757(local25);
			Static150.aClass1_Sub16_Sub2_2.method5734(local15);
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		if (local21 == 19) {
			Static150.aClass1_Sub16_Sub2_2.method5793(53);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			Static150.aClass1_Sub16_Sub2_2.method5782(local25);
			Static150.aClass1_Sub16_Sub2_2.method5782(local15);
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		if (local21 == 6) {
			Static150.aClass1_Sub16_Sub2_2.method5793(234);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			Static150.aClass1_Sub16_Sub2_2.method5782(local25);
			Static150.aClass1_Sub16_Sub2_2.method5734(local15);
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		if (local21 == 35) {
			Static150.aClass1_Sub16_Sub2_2.method5793(117);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			Static150.aClass1_Sub16_Sub2_2.method5757(Static326.anInt6657);
			Static150.aClass1_Sub16_Sub2_2.method5757(local15);
			Static150.aClass1_Sub16_Sub2_2.method5770(Static18.anInt664);
			Static150.aClass1_Sub16_Sub2_2.method5775(Static285.anInt6031);
			Static150.aClass1_Sub16_Sub2_2.method5734(local25);
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		if (local21 == 3) {
			Static150.aClass1_Sub16_Sub2_2.method5793(189);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			Static150.aClass1_Sub16_Sub2_2.method5757(local15);
			Static150.aClass1_Sub16_Sub2_2.method5770(local25);
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		if (local21 == 1012) {
			local141 = Static298.method5252(local18);
			if (local141 == null || local141.anIntArray441[local15] < 100000) {
				Static150.aClass1_Sub16_Sub2_2.method5793(124);
				Static150.aClass1_Sub16_Sub2_2.method5770(local25);
			} else {
				Static293.method5172(local141.anIntArray441[local15] + " x " + Static165.method3446(local25).aString51);
			}
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		if (local21 == 9) {
			local41 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static145.anInt3605 = 0;
				Static53.anInt1589 = Static324.anInt6648;
				Static146.anInt3616 = 2;
				Static259.anInt4929 = Static121.anInt3045;
				Static150.aClass1_Sub16_Sub2_2.method5793(138);
				Static150.aClass1_Sub16_Sub2_2.method5734(local25);
				Static150.aClass1_Sub16_Sub2_2.method5771(Static345.aBooleanArray30[82] ? 1 : 0);
				Static150.aClass1_Sub16_Sub2_2.method5734(Static326.anInt6657);
				Static150.aClass1_Sub16_Sub2_2.method5770(Static18.anInt664);
				Static150.aClass1_Sub16_Sub2_2.method5768(Static285.anInt6031);
				Static328.method5704(-2, local41.anIntArray578[0], 0, local41.anIntArray579[0], local41.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local41.method5973(), true);
			}
		}
		if (local21 == 30) {
			Static150.aClass1_Sub16_Sub2_2.method5793(66);
			Static150.aClass1_Sub16_Sub2_2.method5768(local18);
			Static150.aClass1_Sub16_Sub2_2.method5757(local25);
			Static150.aClass1_Sub16_Sub2_2.method5782(local15);
			Static15.anInt632 = 0;
			Static185.aClass177_12 = Static298.method5252(local18);
			Static108.anInt2687 = local15;
		}
		if (local21 == 43) {
			local379 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local25];
			if (local379 != null) {
				Static145.anInt3605 = 0;
				Static53.anInt1589 = Static324.anInt6648;
				Static146.anInt3616 = 2;
				Static259.anInt4929 = Static121.anInt3045;
				Static150.aClass1_Sub16_Sub2_2.method5793(217);
				Static150.aClass1_Sub16_Sub2_2.method5783(Static345.aBooleanArray30[82] ? 1 : 0);
				Static150.aClass1_Sub16_Sub2_2.method5782(local25);
				Static328.method5704(-2, local379.anIntArray578[0], 0, local379.anIntArray579[0], local379.method5973(), Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local379.method5973(), true);
			}
		}
		if (Static234.anInt5231 != 0) {
			Static234.anInt5231 = 0;
			Static145.method3188(Static298.method5252(Static285.anInt6031));
		}
		if (Static246.aBoolean472) {
			Static95.method2033();
		}
		if (Static185.aClass177_12 != null && Static15.anInt632 == 0) {
			Static145.method3188(Static185.aClass177_12);
		}
	}
}
