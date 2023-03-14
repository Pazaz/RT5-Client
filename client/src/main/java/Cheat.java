import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Cheat {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void execute(@OriginalArg(0) String cmd, @OriginalArg(1) boolean arg1) {
		if (client.MODE_WHERE_LIVE == client.modeWhere && LoginManager.staffModLevel < 2) {
			return;
		}
		if (cmd.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (cmd.equalsIgnoreCase("fpson")) {
				Static356.displayfps = true;
				DevConsole.log("fps debug enabled");
				return;
			}
			if (cmd.equalsIgnoreCase("fpsoff")) {
				Static356.displayfps = false;
				DevConsole.log("fps debug disabled");
				return;
			}
			if (cmd.equalsIgnoreCase("cls")) {
				Static177.anInt3385 = 0;
				Static368.anInt6917 = 0;
				return;
			}
			if (cmd.equalsIgnoreCase("cleartext")) {
				Static284.aClass36_7.method1416();
				DevConsole.log("Text coords cleared");
				return;
			}
			@Pc(76) int local76;
			@Pc(96) int local96;
			@Pc(87) Runtime local87;
			if (cmd.equalsIgnoreCase("gc")) {
				Static59.method1643();
				for (local76 = 0; local76 < 10; local76++) {
					System.gc();
				}
				local87 = Runtime.getRuntime();
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				DevConsole.log("mem=" + local96 + "k");
				return;
			}
			if (cmd.equalsIgnoreCase("compact")) {
				Static59.method1643();
				for (local76 = 0; local76 < 10; local76++) {
					System.gc();
				}
				local87 = Runtime.getRuntime();
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				DevConsole.log("Memory before cleanup=" + local96 + "k");
				Static163.method3105();
				Static59.method1643();
				for (@Pc(153) int local153 = 0; local153 < 10; local153++) {
					System.gc();
				}
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				DevConsole.log("Memory after cleanup=" + local96 + "k");
				return;
			}
			if (cmd.equalsIgnoreCase("pcachesize")) {
				DevConsole.log("Number of player models in cache:" + Static365.method6117());
				return;
			}
			if (cmd.equalsIgnoreCase("clientdrop")) {
				DevConsole.log("Dropped client connection");
				if (client.gameState == 30) {
					Static211.method3725();
					return;
				}
				if (client.gameState == 25) {
					Static101.aBoolean158 = true;
				}
				return;
			}
			if (cmd.equalsIgnoreCase("clientjs5drop")) {
				client.js5NetQueue.quit();
				DevConsole.log("Dropped client js5 net queue");
				return;
			}
			if (cmd.equalsIgnoreCase("serverjs5drop")) {
				client.js5NetQueue.writeTerminate();
				DevConsole.log("Dropped server js5 net queue");
				return;
			}
			if (cmd.equalsIgnoreCase("breakcon")) {
				GameShell.signlink.breakConnection();
				Protocol.socket.breakConnection();
				client.js5NetQueue.breakConnection();
				DevConsole.log("Breaking new connections for 5 seconds");
				return;
			}
			if (cmd.equalsIgnoreCase("rebuild")) {
				Static347.method5827();
				Static247.method4299();
				DevConsole.log("Rebuilding map");
				return;
			}
			if (cmd.equalsIgnoreCase("wm1")) {
				Static143.method2677(-1, 1, false, -1);
				if (Static144.getWindowMode() == 1) {
					DevConsole.log("wm1 succeeded");
					return;
				}
				DevConsole.log("wm1 failed");
				return;
			}
			if (cmd.equalsIgnoreCase("wm2")) {
				Static143.method2677(-1, 2, false, -1);
				if (Static144.getWindowMode() == 2) {
					DevConsole.log("wm2 succeeded");
					return;
				}
				DevConsole.log("wm2 failed");
				return;
			}
			if (cmd.equalsIgnoreCase("wm3")) {
				Static143.method2677(768, 3, false, 1024);
				if (Static144.getWindowMode() == 3) {
					DevConsole.log("wm3 succeeded");
					return;
				}
				DevConsole.log("wm3 failed");
				return;
			}
			if (cmd.equalsIgnoreCase("tk0")) {
				Static78.method5701(0);
				if (Static77.anInt1762 == 0) {
					DevConsole.log("Entered tk0");
					client.preferences.anInt4878 = 0;
					client.preferences.method4497(GameShell.signlink);
					Preferences.sentToServer = false;
					return;
				}
				DevConsole.log("Failed to enter tk0");
				return;
			}
			if (cmd.equalsIgnoreCase("tk1")) {
				Static78.method5701(1);
				if (Static77.anInt1762 != 1) {
					DevConsole.log("Failed to enter tk1");
					return;
				}
				DevConsole.log("Entered tk1");
				client.preferences.anInt4878 = 1;
				client.preferences.method4497(GameShell.signlink);
				Preferences.sentToServer = false;
				return;
			}
			if (cmd.equalsIgnoreCase("tk2")) {
				Static78.method5701(2);
				if (Static77.anInt1762 != 2) {
					DevConsole.log("Failed to enter tk2");
					return;
				}
				DevConsole.log("Entered tk2");
				client.preferences.anInt4878 = 2;
				client.preferences.method4497(GameShell.signlink);
				Preferences.sentToServer = false;
				return;
			}
			if (cmd.equalsIgnoreCase("tk3")) {
				Static78.method5701(3);
				if (Static77.anInt1762 == 3) {
					DevConsole.log("Entered tk3");
					return;
				}
				DevConsole.log("Failed to enter tk3");
				return;
			}
			if (cmd.equalsIgnoreCase("ot")) {
				client.preferences.ot = !client.preferences.ot;
				client.preferences.method4497(GameShell.signlink);
				Preferences.sentToServer = false;
				Static347.method5827();
				DevConsole.log("ot=" + client.preferences.ot);
				return;
			}
			if (cmd.equalsIgnoreCase("gb")) {
				client.preferences.gb = !client.preferences.gb;
				client.preferences.method4497(GameShell.signlink);
				Preferences.sentToServer = false;
				Static347.method5827();
				DevConsole.log("gb=" + client.preferences.gb);
				return;
			}
			if (cmd.startsWith("shadows")) {
				if (cmd.length() < 8) {
					DevConsole.log("Invalid shadows value");
					return;
				}
				@Pc(521) String local521 = cmd.substring(8);
				@Pc(531) int local531 = Static132.method2485(local521) ? Static146.method2698(local521) : -1;
				if (local531 >= 0 && local531 <= 2) {
					client.preferences.anInt4886 = local531;
					client.preferences.method4497(GameShell.signlink);
					Preferences.sentToServer = false;
					Static347.method5827();
					DevConsole.log("shadows=" + local531);
					return;
				}
				DevConsole.log("Invalid shadows value");
				return;
			}
			if (cmd.startsWith("setba")) {
				if (cmd.length() < 6) {
					DevConsole.log("Invalid buildarea value");
					return;
				}
				local76 = Static146.method2698(cmd.substring(6));
				if (local76 >= 0 && local76 <= Static289.method5019(Static309.anInt5802)) {
					client.preferences.anInt4883 = local76;
					client.preferences.method4497(GameShell.signlink);
					Preferences.sentToServer = false;
					DevConsole.log("maxbuildarea=" + client.preferences.anInt4883);
					return;
				}
				DevConsole.log("Invalid buildarea value");
				return;
			}
			if (cmd.startsWith("setparticles")) {
				if (cmd.length() < 13) {
					DevConsole.log("Invalid particles value");
					return;
				}
				Static26.method864(Static146.method2698(cmd.substring(13)));
				client.preferences.method4497(GameShell.signlink);
				Preferences.sentToServer = false;
				DevConsole.log("particles=" + Static184.method3391());
				return;
			}
			if (cmd.startsWith("rect_debug")) {
				if (cmd.length() < 10) {
					DevConsole.log("Invalid rect_debug value");
					return;
				}
				Static154.rect_debug = Static146.method2698(cmd.substring(10).trim());
				DevConsole.log("rect_debug=" + Static154.rect_debug);
				return;
			}
			if (cmd.equalsIgnoreCase("qa_op_test")) {
				Static18.qa_op_test = true;
				DevConsole.log("qa_op_test=" + Static18.qa_op_test);
				return;
			}
			if (cmd.equalsIgnoreCase("clipcomponents")) {
				Static88.clipcomponents = !Static88.clipcomponents;
				DevConsole.log("clipcomponents=" + Static88.clipcomponents);
				return;
			}
			if (cmd.startsWith("bloom")) {
				@Pc(736) boolean local736 = Static190.aClass19_8.method2892();
				if (Static284.method4882(!local736)) {
					if (!local736) {
						DevConsole.log("Bloom enabled");
						return;
					}
					DevConsole.log("Bloom disabled");
					return;
				}
				DevConsole.log("Failed to enable bloom");
				return;
			}
			if (cmd.equalsIgnoreCase("tween")) {
				if (!Static318.aBoolean408) {
					Static318.aBoolean408 = true;
					DevConsole.log("Forced tweening ENABLED!");
					return;
				}
				Static318.aBoolean408 = false;
				DevConsole.log("Forced tweening disabled.");
				return;
			}
			if (cmd.equalsIgnoreCase("shiftclick")) {
				if (Static148.aBoolean192) {
					DevConsole.log("Shift-click disabled.");
					Static148.aBoolean192 = false;
					return;
				}
				DevConsole.log("Shift-click ENABLED!");
				Static148.aBoolean192 = true;
				return;
			}
			if (cmd.equalsIgnoreCase("getcgcoord")) {
				DevConsole.log("x:" + (Static17.aClass11_Sub5_Sub2_Sub1_3.xFine >> 7) + " z:" + (Static17.aClass11_Sub5_Sub2_Sub1_3.zFine >> 7));
				return;
			}
			if (cmd.equalsIgnoreCase("getheight")) {
				DevConsole.log("Height: " + Scene.aClass6Array4[Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78].method5719(Static17.aClass11_Sub5_Sub2_Sub1_3.xFine >> 7, Static17.aClass11_Sub5_Sub2_Sub1_3.zFine >> 7));
				return;
			}
			if (cmd.equalsIgnoreCase("resetminimap")) {
				client.jsArchive8.discardPacked();
				client.jsArchive8.discardUnpacked();
				client.MsiType.method2707();
				client.MelTypes.method3380();
				Static247.method4299();
				DevConsole.log("Minimap reset");
				return;
			}
			if (cmd.startsWith("mc")) {
				if (Static190.aClass19_8.method2869()) {
					local76 = Integer.parseInt(cmd.substring(3));
					if (local76 < 1) {
						local76 = 1;
					} else if (local76 > 4) {
						local76 = 4;
					}
					Static102.anInt3591 = local76;
					Static190.aClass19_8.method2854(Static102.anInt3591);
					Static190.aClass19_8.method2893(0);
					DevConsole.log("Render cores now: " + Static102.anInt3591);
					return;
				}
				DevConsole.log("Current toolkit doesn't support multiple cores");
				return;
			}
			if (cmd.startsWith("cachespace")) {
				DevConsole.log("I(s): " + Static335.aClass98_57.method2616() + "/" + Static335.aClass98_57.method2620());
				DevConsole.log("I(m): " + Static124.aClass98_63.method2616() + "/" + Static124.aClass98_63.method2620());
				DevConsole.log("O(s): " + client.ObjTypes.aClass97_1.method2587() + "/" + client.ObjTypes.aClass97_1.method2592());
				return;
			}
			if (cmd.equalsIgnoreCase("getcamerapos")) {
				DevConsole.log("Pos: " + Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 + "," + (Static164.anInt3140 + (Static136.anInt6778 >> 7) >> 6) + "," + ((Static211.anInt3777 >> 7) + Static148.anInt2719 >> 6) + "," + (Static164.anInt3140 + (Static136.anInt6778 >> 7) & 0x3F) + "," + (Static148.anInt2719 + (Static211.anInt3777 >> 7) & 0x3F) + " Height: " + (Static386.method6032(Static136.anInt6778, Static211.anInt3777, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) - Static102.anInt3592));
				DevConsole.log("Look: " + Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 + "," + (Static164.anInt3140 + Static254.anInt4698 >> 6) + "," + (Static123.anInt2420 + Static148.anInt2719 >> 6) + "," + (Static254.anInt4698 + Static164.anInt3140 & 0x3F) + "," + (Static148.anInt2719 + Static123.anInt2420 & 0x3F) + " Height: " + (Static386.method6032(Static254.anInt4698, Static123.anInt2420, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) - Static57.anInt1464));
				return;
			}
			if (cmd.equals("showocc")) {
				Static160.showocc = !Static160.showocc;
				Static347.method5827();
				DevConsole.log("showocc=" + Static160.showocc);
				return;
			}
			if (cmd.equals("wallocc")) {
				Static263.wallocc = !Static263.wallocc;
				Static347.method5827();
				DevConsole.log("forcewallocc=" + Static263.wallocc);
				return;
			}
			if (cmd.equals("renderprofile") || cmd.equals("rp")) {
				Static294.renderprofile = !Static294.renderprofile;
				Static190.aClass19_8.method2855(Static294.renderprofile);
				Static49.method1471();
				DevConsole.log("showprofiling=" + Static294.renderprofile);
				return;
			}
			if (cmd.equals("nonpcs")) {
				Static47.nonpcs = !Static47.nonpcs;
				DevConsole.log("nonpcs=" + Static47.nonpcs);
				return;
			}
			if (cmd.equals("autoworld")) {
				Static200.method3644();
				DevConsole.log("auto world selected");
				return;
			}
			if (cmd.equals("heap")) {
				DevConsole.log("Heap: " + Static309.anInt5802 + "MB");
				return;
			}
			if (cmd.equals("savevarcs")) {
				Static340.method5765();
				DevConsole.log("perm varcs saved");
				return;
			}
			if (cmd.equals("scramblevarcs")) {
				for (local76 = 0; local76 < Static75.anIntArray117.length; local76++) {
					if (Static89.aBooleanArray18[local76]) {
						Static75.anIntArray117[local76] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static75.anIntArray117[local76] *= -1;
						}
					}
				}
				Static340.method5765();
				DevConsole.log("perm varcs scrambled");
				return;
			}
			if (cmd.equals("showcolmap")) {
				Static46.aBoolean100 = true;
				Static247.method4299();
				DevConsole.log("colmap is shown");
				return;
			}
			if (cmd.equals("hidecolmap")) {
				Static46.aBoolean100 = false;
				Static247.method4299();
				DevConsole.log("colmap is hidden");
				return;
			}
			if (cmd.equals("resetcache")) {
				Static211.method3721();
				DevConsole.log("Caches reset");
				return;
			}
			if (cmd.equals("profilecpu")) {
				DevConsole.log(Static374.method6273() + "ms");
				return;
			}
			if (cmd.startsWith("cpuusage")) {
				local76 = Integer.parseInt(cmd.substring(9));
				if (local76 >= 0 && local76 <= 4) {
					client.preferences.anInt4881 = local76;
				}
				DevConsole.log("cpuusage=" + client.preferences.anInt4881);
				return;
			}
			if (cmd.startsWith("getclientvarpbit")) {
				local76 = Integer.parseInt(cmd.substring(17));
				DevConsole.log("varpbit=" + Static214.aClass226_1.method5778(local76));
				return;
			}
			if (cmd.startsWith("getclientvarp")) {
				local76 = Integer.parseInt(cmd.substring(14));
				DevConsole.log("varp=" + Static214.aClass226_1.method5777(local76));
				return;
			}
			if (client.gameState == 30) {
				Protocol.writeOpcode(ClientProt.aClass145_162);
				Protocol.outboundBuffer.p1(cmd.length() + 2);
				Protocol.outboundBuffer.p1(arg1 ? 1 : 0);
				Protocol.outboundBuffer.pjstr(cmd);
			}
			if (cmd.startsWith("fps ") && client.MODE_WHERE_LIVE != client.modeWhere) {
				Static250.method4346(Static146.method2698(cmd.substring(4)));
				return;
			}
			if (client.gameState != 30) {
				DevConsole.log("Unrecogonised commmand when not logged in: " + cmd);
			}
		} catch (@Pc(1450) Exception local1450) {
			DevConsole.log("Whoops, something went wrong.");
		}
	}

}
