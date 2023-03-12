import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "Z")
	public static boolean aBoolean208;

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_67 = new LocalizedString(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
	public static int anInt2954 = 100;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "[I")
	public static final int[] anIntArray187 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	public static void method2969() {
		Static119.aClass98_16.method2614();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method2972(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (client.MODE_WHERE_LIVE == client.modeWhere && LoginManager.staffModLevel < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static356.aBoolean456 = true;
				Static158.method2940("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static356.aBoolean456 = false;
				Static158.method2940("fps debug disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static177.anInt3385 = 0;
				Static368.anInt6917 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static284.aClass36_7.method1416();
				Static158.method2940("Text coords cleared");
				return;
			}
			@Pc(76) int local76;
			@Pc(96) int local96;
			@Pc(87) Runtime local87;
			if (arg0.equalsIgnoreCase("gc")) {
				Static59.method1643();
				for (local76 = 0; local76 < 10; local76++) {
					System.gc();
				}
				local87 = Runtime.getRuntime();
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static158.method2940("mem=" + local96 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static59.method1643();
				for (local76 = 0; local76 < 10; local76++) {
					System.gc();
				}
				local87 = Runtime.getRuntime();
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static158.method2940("Memory before cleanup=" + local96 + "k");
				Static163.method3105();
				Static59.method1643();
				for (@Pc(153) int local153 = 0; local153 < 10; local153++) {
					System.gc();
				}
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static158.method2940("Memory after cleanup=" + local96 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static158.method2940("Number of player models in cache:" + Static365.method6117());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static158.method2940("Dropped client connection");
				if (client.gameState == 30) {
					Static211.method3725();
					return;
				}
				if (client.gameState == 25) {
					Static101.aBoolean158 = true;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				client.js5NetQueue.quit();
				Static158.method2940("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				client.js5NetQueue.writeTerminate();
				Static158.method2940("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				GameShell.signlink.breakConnection();
				Protocol.socket.breakConnection();
				client.js5NetQueue.breakConnection();
				Static158.method2940("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static347.method5827();
				Static247.method4299();
				Static158.method2940("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static143.method2677(-1, 1, false, -1);
				if (Static144.getWindowMode() == 1) {
					Static158.method2940("wm1 succeeded");
					return;
				}
				Static158.method2940("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static143.method2677(-1, 2, false, -1);
				if (Static144.getWindowMode() == 2) {
					Static158.method2940("wm2 succeeded");
					return;
				}
				Static158.method2940("wm2 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static143.method2677(768, 3, false, 1024);
				if (Static144.getWindowMode() == 3) {
					Static158.method2940("wm3 succeeded");
					return;
				}
				Static158.method2940("wm3 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static78.method5701(0);
				if (Static77.anInt1762 == 0) {
					Static158.method2940("Entered tk0");
					client.preferences.anInt4878 = 0;
					client.preferences.method4497(GameShell.signlink);
					Preferences.sentToServer = false;
					return;
				}
				Static158.method2940("Failed to enter tk0");
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static78.method5701(1);
				if (Static77.anInt1762 != 1) {
					Static158.method2940("Failed to enter tk1");
					return;
				}
				Static158.method2940("Entered tk1");
				client.preferences.anInt4878 = 1;
				client.preferences.method4497(GameShell.signlink);
				Preferences.sentToServer = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static78.method5701(2);
				if (Static77.anInt1762 != 2) {
					Static158.method2940("Failed to enter tk2");
					return;
				}
				Static158.method2940("Entered tk2");
				client.preferences.anInt4878 = 2;
				client.preferences.method4497(GameShell.signlink);
				Preferences.sentToServer = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static78.method5701(3);
				if (Static77.anInt1762 == 3) {
					Static158.method2940("Entered tk3");
					return;
				}
				Static158.method2940("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				client.preferences.aBoolean355 = !client.preferences.aBoolean355;
				client.preferences.method4497(GameShell.signlink);
				Preferences.sentToServer = false;
				Static347.method5827();
				Static158.method2940("ot=" + client.preferences.aBoolean355);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				client.preferences.aBoolean357 = !client.preferences.aBoolean357;
				client.preferences.method4497(GameShell.signlink);
				Preferences.sentToServer = false;
				Static347.method5827();
				Static158.method2940("gb=" + client.preferences.aBoolean357);
				return;
			}
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static158.method2940("Invalid shadows value");
					return;
				}
				@Pc(521) String local521 = arg0.substring(8);
				@Pc(531) int local531 = Static132.method2485(local521) ? Static146.method2698(local521) : -1;
				if (local531 >= 0 && local531 <= 2) {
					client.preferences.anInt4886 = local531;
					client.preferences.method4497(GameShell.signlink);
					Preferences.sentToServer = false;
					Static347.method5827();
					Static158.method2940("shadows=" + local531);
					return;
				}
				Static158.method2940("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static158.method2940("Invalid buildarea value");
					return;
				}
				local76 = Static146.method2698(arg0.substring(6));
				if (local76 >= 0 && local76 <= Static289.method5019(Static309.anInt5802)) {
					client.preferences.anInt4883 = local76;
					client.preferences.method4497(GameShell.signlink);
					Preferences.sentToServer = false;
					Static158.method2940("maxbuildarea=" + client.preferences.anInt4883);
					return;
				}
				Static158.method2940("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static158.method2940("Invalid particles value");
					return;
				}
				Static26.method864(Static146.method2698(arg0.substring(13)));
				client.preferences.method4497(GameShell.signlink);
				Preferences.sentToServer = false;
				Static158.method2940("particles=" + Static184.method3391());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static158.method2940("Invalid rect_debug value");
					return;
				}
				Static154.anInt2807 = Static146.method2698(arg0.substring(10).trim());
				Static158.method2940("rect_debug=" + Static154.anInt2807);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static18.aBoolean30 = true;
				Static158.method2940("qa_op_test=" + Static18.aBoolean30);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static88.aBoolean134 = !Static88.aBoolean134;
				Static158.method2940("clipcomponents=" + Static88.aBoolean134);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(736) boolean local736 = Static190.aClass19_8.method2892();
				if (Static284.method4882(!local736)) {
					if (!local736) {
						Static158.method2940("Bloom enabled");
						return;
					}
					Static158.method2940("Bloom disabled");
					return;
				}
				Static158.method2940("Failed to enable bloom");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static318.aBoolean408) {
					Static318.aBoolean408 = true;
					Static158.method2940("Forced tweening ENABLED!");
					return;
				}
				Static318.aBoolean408 = false;
				Static158.method2940("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static148.aBoolean192) {
					Static158.method2940("Shift-click disabled.");
					Static148.aBoolean192 = false;
					return;
				}
				Static158.method2940("Shift-click ENABLED!");
				Static148.aBoolean192 = true;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static158.method2940("x:" + (Static17.aClass11_Sub5_Sub2_Sub1_3.xFine >> 7) + " z:" + (Static17.aClass11_Sub5_Sub2_Sub1_3.zFine >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static158.method2940("Height: " + Static365.aClass6Array4[Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78].method5719(Static17.aClass11_Sub5_Sub2_Sub1_3.xFine >> 7, Static17.aClass11_Sub5_Sub2_Sub1_3.zFine >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				client.jsArchive8.discardPacked();
				client.jsArchive8.discardUnpacked();
				client.MsiType.method2707();
				client.MelTypes.method3380();
				Static247.method4299();
				Static158.method2940("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (Static190.aClass19_8.method2869()) {
					local76 = Integer.parseInt(arg0.substring(3));
					if (local76 < 1) {
						local76 = 1;
					} else if (local76 > 4) {
						local76 = 4;
					}
					Static102.anInt3591 = local76;
					Static190.aClass19_8.method2854(Static102.anInt3591);
					Static190.aClass19_8.method2893(0);
					Static158.method2940("Render cores now: " + Static102.anInt3591);
					return;
				}
				Static158.method2940("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static158.method2940("I(s): " + Static335.aClass98_57.method2616() + "/" + Static335.aClass98_57.method2620());
				Static158.method2940("I(m): " + Static124.aClass98_63.method2616() + "/" + Static124.aClass98_63.method2620());
				Static158.method2940("O(s): " + client.ObjTypes.aClass97_1.method2587() + "/" + client.ObjTypes.aClass97_1.method2592());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static158.method2940("Pos: " + Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 + "," + (Static164.anInt3140 + (Static136.anInt6778 >> 7) >> 6) + "," + ((Static211.anInt3777 >> 7) + Static148.anInt2719 >> 6) + "," + (Static164.anInt3140 + (Static136.anInt6778 >> 7) & 0x3F) + "," + (Static148.anInt2719 + (Static211.anInt3777 >> 7) & 0x3F) + " Height: " + (Static386.method6032(Static136.anInt6778, Static211.anInt3777, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) - Static102.anInt3592));
				Static158.method2940("Look: " + Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 + "," + (Static164.anInt3140 + Static254.anInt4698 >> 6) + "," + (Static123.anInt2420 + Static148.anInt2719 >> 6) + "," + (Static254.anInt4698 + Static164.anInt3140 & 0x3F) + "," + (Static148.anInt2719 + Static123.anInt2420 & 0x3F) + " Height: " + (Static386.method6032(Static254.anInt4698, Static123.anInt2420, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) - Static57.anInt1464));
				return;
			}
			if (arg0.equals("showocc")) {
				Static160.aBoolean206 = !Static160.aBoolean206;
				Static347.method5827();
				Static158.method2940("showocc=" + Static160.aBoolean206);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static263.aBoolean329 = !Static263.aBoolean329;
				Static347.method5827();
				Static158.method2940("forcewallocc=" + Static263.aBoolean329);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static294.aBoolean392 = !Static294.aBoolean392;
				Static190.aClass19_8.method2855(Static294.aBoolean392);
				Static49.method1471();
				Static158.method2940("showprofiling=" + Static294.aBoolean392);
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static47.aBoolean102 = !Static47.aBoolean102;
				Static158.method2940("nonpcs=" + Static47.aBoolean102);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static200.method3644();
				Static158.method2940("auto world selected");
				return;
			}
			if (arg0.equals("heap")) {
				Static158.method2940("Heap: " + Static309.anInt5802 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static340.method5765();
				Static158.method2940("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local76 = 0; local76 < Static75.anIntArray117.length; local76++) {
					if (Static89.aBooleanArray18[local76]) {
						Static75.anIntArray117[local76] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static75.anIntArray117[local76] *= -1;
						}
					}
				}
				Static340.method5765();
				Static158.method2940("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static46.aBoolean100 = true;
				Static247.method4299();
				Static158.method2940("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static46.aBoolean100 = false;
				Static247.method4299();
				Static158.method2940("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static211.method3721();
				Static158.method2940("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static158.method2940(Static374.method6273() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local76 = Integer.parseInt(arg0.substring(9));
				if (local76 >= 0 && local76 <= 4) {
					client.preferences.anInt4881 = local76;
				}
				Static158.method2940("cpuusage=" + client.preferences.anInt4881);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local76 = Integer.parseInt(arg0.substring(17));
				Static158.method2940("varpbit=" + Static214.aClass226_1.method5778(local76));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local76 = Integer.parseInt(arg0.substring(14));
				Static158.method2940("varp=" + Static214.aClass226_1.method5777(local76));
				return;
			}
			if (client.gameState == 30) {
				Protocol.method1960(Static243.aClass145_162);
				Protocol.outboundBuffer.p1(arg0.length() + 2);
				Protocol.outboundBuffer.p1(arg1 ? 1 : 0);
				Protocol.outboundBuffer.pjstr(arg0);
			}
			if (arg0.startsWith("fps ") && client.MODE_WHERE_LIVE != client.modeWhere) {
				Static250.method4346(Static146.method2698(arg0.substring(4)));
				return;
			}
			if (client.gameState != 30) {
				Static158.method2940("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(1450) Exception local1450) {
			Static158.method2940("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BZ)V")
	public static void method2973(@OriginalArg(1) boolean arg0) {
		Static37.method1135();
		if (client.gameState != 30 && client.gameState != 25) {
			return;
		}
		Static367.anInt6876++;
		if (Static367.anInt6876 < 50 && !arg0) {
			return;
		}
		Static367.anInt6876 = 0;
		if (!Static101.aBoolean158 && Protocol.socket != null) {
			Protocol.method1960(Static326.aClass145_228);
			try {
				Protocol.socket.write(Protocol.outboundBuffer.pos, Protocol.outboundBuffer.data);
				Protocol.outboundBuffer.pos = 0;
			} catch (@Pc(57) IOException local57) {
				Static101.aBoolean158 = true;
			}
		}
		Static37.method1135();
	}
}
