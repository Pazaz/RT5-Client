import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.Socket;
import java.net.URL;

public class LoginManager {

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
	public static int step = 0;
	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	public static int loops = 0;
	@OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
	public static int errors = 0;
	@OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
	public static int loginResult = -2;
	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Ljava/lang/String;")
	public static String usernameInput = "";
	@OriginalMember(owner = "client!nq", name = "g", descriptor = "J")
	public static long encodedUsername;
	@OriginalMember(owner = "client!lp", name = "e", descriptor = "J")
	public static long serverKey = 0L;
	@OriginalMember(owner = "client!as", name = "f", descriptor = "Ljava/lang/String;")
	public static String password = "";
	@OriginalMember(owner = "client!co", name = "l", descriptor = "I")
	public static int hopTime = 0;
	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Z")
	public static boolean mapMembers = false;
	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
	public static boolean mapQuickChat = false;
	@OriginalMember(owner = "client!ub", name = "X", descriptor = "Z")
	public static boolean parentalAdvertConsent = false;
	@OriginalMember(owner = "client!fo", name = "i", descriptor = "Z")
	public static boolean parentalChatConsent = false;
	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Z")
	public static boolean playerUnderage = false;
	@OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
	public static int playerModLevel = 0;
	@OriginalMember(owner = "client!ut", name = "B", descriptor = "I")
	public static int disallowResult = -1;
	@OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
	public static int staffModLevel = 0;
	@OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
	public static int anInt3714 = -1;
	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Z")
	public static boolean playerMember = false;
	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	public static int anInt4446;
	@OriginalMember(owner = "client!os", name = "f", descriptor = "I")
	public static int anInt6717;
	@OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
	public static int anInt3697;
	@OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
	public static int anInt1868;
	@OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
	public static int anInt3731;
	@OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
	public static int anInt1636;
	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	public static int anInt1722;
	@OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
	public static int anInt6804;
	@OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
	public static int anInt7211;
	@OriginalMember(owner = "client!so", name = "i", descriptor = "I")
	public static int anInt6030;
	@OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
	public static int anInt7118;
	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public static int autoStep = 0;
	@OriginalMember(owner = "client!fo", name = "g", descriptor = "Z")
	public static boolean aBoolean158 = false;
	@OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
	public static int anInt4955 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void mainLogic() {
		if (step == 0 || step == 5) {
			return;
		}
		try {
			if (++loops > 2000) {
				if (Protocol.socket != null) {
					Protocol.socket.close();
					Protocol.socket = null;
				}
				if (errors >= 1) {
					loginResult = -5;
					step = 0;
					return;
				}
				loops = 0;
				errors++;
				step = 1;
				if (client.alternatePort == client.port) {
					client.port = client.defaultPort;
				} else {
					client.port = client.alternatePort;
				}
			}
			if (step == 1) {
				Protocol.socketRequest2 = GameShell.signlink.openSocket(client.hostname, client.port);
				step = 2;
			}
			if (step == 2) {
				if (Protocol.socketRequest2.status == 2) {
					throw new IOException();
				}
				if (Protocol.socketRequest2.status != 1) {
					return;
				}
				Protocol.socket = new BufferedSocket((Socket) Protocol.socketRequest2.result, GameShell.signlink);
				Protocol.socketRequest2 = null;
				@Pc(105) long encodedUsername = LoginManager.encodedUsername = StringUtils.toBase37(usernameInput);
				int usernameHash = (int) (encodedUsername >> 16 & 0x1FL);
				Protocol.outboundBuffer.pos = 0;
				Protocol.outboundBuffer.p1(LoginProt.LOGIN.opcode);
				Protocol.outboundBuffer.p1(usernameHash);
				Protocol.socket.write(2, Protocol.outboundBuffer.data);
				if (client.musicChannel != null) {
					client.musicChannel.method6325();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method6325();
				}
				@Pc(145) int reply = Protocol.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method6325();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method6325();
				}
				if (reply != 0) {
					step = 0;
					loginResult = reply;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				step = 3;
			}
			if (step == 3) {
				if (Protocol.socket.available() < 8) {
					return;
				}
				Protocol.socket.read(Protocol.inboundBuffer.data, 8, 0);
				Protocol.inboundBuffer.pos = 0;
				serverKey = Protocol.inboundBuffer.g8();
				@Pc(208) Buffer rsaBuffer = new Buffer(70);
				@Pc(211) int[] key = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (serverKey >> 32), (int) serverKey };
				rsaBuffer.p1(10);
				rsaBuffer.p4(key[0]);
				rsaBuffer.p4(key[1]);
				rsaBuffer.p4(key[2]);
				rsaBuffer.p4(key[3]);
				rsaBuffer.p8(StringUtils.toBase37(usernameInput));
				rsaBuffer.pjstr(password);
				rsaBuffer.rsaenc(Protocol.EXPONENT, Protocol.MODULUS);
				Protocol.outboundBuffer.pos = 0;
				if (client.gameState == 40) {
					Protocol.outboundBuffer.p1(LoginProt.WORLD_RECONNECT.opcode);
				} else {
					Protocol.outboundBuffer.p1(LoginProt.WORLD_CONNECT.opcode);
				}
				Protocol.outboundBuffer.p2(0);
				int start = Protocol.outboundBuffer.pos;
				Protocol.outboundBuffer.p4(578);
				Protocol.outboundBuffer.p1(anInt3714);
				Protocol.outboundBuffer.p1(DisplayMode.getWindowMode());
				Protocol.outboundBuffer.p2(GameShell.canvasWidth);
				Protocol.outboundBuffer.p2(GameShell.canvasHeight);
				Protocol.outboundBuffer.p1(client.preferences.antiAliasingMode);
				client.writeUid(Protocol.outboundBuffer);
				Protocol.outboundBuffer.pjstr(client.settings);
				Protocol.outboundBuffer.p4(client.affiliate);
				@Pc(354) Buffer preferences = client.preferences.encode();
				Protocol.outboundBuffer.p1(preferences.pos);
				Protocol.outboundBuffer.pdata(preferences.data, preferences.pos);
				Preferences.sentToServer = true;
				Protocol.outboundBuffer.p2(Protocol.verifyId);
				Protocol.outboundBuffer.p4(client.jsArchive0.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive1.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive2.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive3.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive4.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive5.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive6.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive7.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive8.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive9.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive10.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive11.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive12.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive13.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive14.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive15.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive16.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive17.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive18.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive19.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive20.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive21.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive22.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive23.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive24.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive25.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive26.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive27.getChecksum());
				Protocol.outboundBuffer.p4(client.jsArchive28.getChecksum());
				Protocol.outboundBuffer.pdata(rsaBuffer.data, rsaBuffer.pos);
				Protocol.outboundBuffer.psize2(Protocol.outboundBuffer.pos - start);
				Protocol.socket.write(Protocol.outboundBuffer.pos, Protocol.outboundBuffer.data);
				Protocol.outboundBuffer.setKey(key);
				for (@Pc(579) int i = 0; i < 4; i++) {
					key[i] += 50;
				}
				Protocol.inboundBuffer.setKey(key);
				step = 4;
			}
			@Pc(619) int reply;
			if (step == 4) {
				if (Protocol.socket.available() < 1) {
					return;
				}
				reply = Protocol.socket.read();
				if (reply == 21) {
					step = 7;
				} else if (reply == 29) {
					step = 11;
				} else if (reply == 1) {
					step = 5;
					loginResult = reply;
					return;
				} else if (reply == 2) {
					step = 8;
				} else if (reply == 15) {
					step = 12;
					Protocol.packetSize = -2;
				} else if (reply == 23 && errors < 1) {
					loops = 0;
					errors++;
					step = 1;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				} else {
					loginResult = reply;
					step = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
			}
			if (step == 6) {
				Protocol.outboundBuffer.pos = 0;
				Protocol.outboundBuffer.p1isaac(LoginProt.aClass242_4.opcode);
				Protocol.socket.write(Protocol.outboundBuffer.pos, Protocol.outboundBuffer.data);
				step = 4;
			} else if (step == 7) {
				if (Protocol.socket.available() >= 1) {
					hopTime = Protocol.socket.read() * 60 + 180;
					loginResult = 21;
					step = 0;
					Protocol.socket.close();
					Protocol.socket = null;
				}
			} else if (step != 11) {
				if (step == 8) {
					if (Protocol.socket.available() < 13) {
						return;
					}
					Protocol.socket.read(Protocol.inboundBuffer.data, 13, 0);
					Protocol.inboundBuffer.pos = 0;
					staffModLevel = Protocol.inboundBuffer.g1();
					playerModLevel = Protocol.inboundBuffer.g1();
					playerUnderage = Protocol.inboundBuffer.g1() == 1;
					parentalChatConsent = Protocol.inboundBuffer.g1() == 1;
					parentalAdvertConsent = Protocol.inboundBuffer.g1() == 1;
					mapQuickChat = Protocol.inboundBuffer.g1() == 1;
					PlayerList.selfId = Protocol.inboundBuffer.g2();
					playerMember = Protocol.inboundBuffer.g1() == 1;
					mapMembers = Protocol.inboundBuffer.g1() == 1;
					client.LocTypes.setAllowMembers(mapMembers);
					client.ObjTypes.setAllowMembers(mapMembers);
					client.NpcTypes.setAllowMembers(mapMembers);
					if (playerUnderage && !parentalAdvertConsent || playerMember) {
						try {
							BrowserControl.call(GameShell.signlink.applet, "zap");
						} catch (@Pc(896) Throwable ex) {
							if (client.showAdvert) {
								try {
									GameShell.signlink.applet.getAppletContext().showDocument(new URL(GameShell.signlink.applet.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(912) Exception ignored) {
								}
							}
						}
					} else {
						try {
							BrowserControl.call(GameShell.signlink.applet, "unzap");
						} catch (@Pc(922) Throwable ignored) {
						}
					}
					if (ModeWhere.MODE_WHERE_LIVE == client.modeWhere) {
						try {
							BrowserControl.call(GameShell.signlink.applet, "loggedin");
						} catch (@Pc(934) Throwable ignored) {
						}
					}
					step = 10;
				}
				if (step == 10) {
					if (Protocol.inboundBuffer.peek1isaac()) {
						if (Protocol.socket.available() < 1) {
							return;
						}
						Protocol.socket.read(Protocol.inboundBuffer.data, 1, Protocol.inboundBuffer.pos + 2);
					}
					Protocol.packet = ServerProt.getAll()[Protocol.inboundBuffer.g1isaac()];
					Protocol.packetSize = Protocol.inboundBuffer.g2();
					step = 9;
				}
				if (step == 9) {
					// Login Step Waiting Players (lswp)
					if (Protocol.socket.available() >= Protocol.packetSize) {
						Protocol.socket.read(Protocol.inboundBuffer.data, Protocol.packetSize, 0);
						Protocol.inboundBuffer.pos = 0;
						loginResult = 2;
						reply = Protocol.packetSize;
						step = 0;
						client.reset();
						lswpRenderLoginDecoder(Protocol.inboundBuffer);
						Static105.anInt2187 = -1;
						Static181.rebuildMap(false);
						if (reply != Protocol.inboundBuffer.pos) {
							throw new RuntimeException("lswp pos:" + Protocol.inboundBuffer.pos + " psize:" + reply);
						}
						Protocol.packet = null;
					}
				} else if (step == 12) {
					// Login Step Waiting Players Reconnect (lswpr)
					if (Protocol.packetSize == -2) {
						if (Protocol.socket.available() < 2) {
							return;
						}
						Protocol.socket.read(Protocol.inboundBuffer.data, 2, 0);
						Protocol.inboundBuffer.pos = 0;
						Protocol.packetSize = Protocol.inboundBuffer.g2();
					}
					if (Protocol.socket.available() >= Protocol.packetSize) {
						Protocol.socket.read(Protocol.inboundBuffer.data, Protocol.packetSize, 0);
						Protocol.inboundBuffer.pos = 0;
						loginResult = 15;
						step = 0;
						reply = Protocol.packetSize;
						Static182.method3388();
						lswpRenderLoginDecoder(Protocol.inboundBuffer);
						if (Protocol.inboundBuffer.pos != reply) {
							throw new RuntimeException("lswpr pos:" + Protocol.inboundBuffer.pos + " psize:" + reply);
						}
						Protocol.packet = null;
					}
				}
			} else if (Protocol.socket.available() >= 1) {
				disallowResult = Protocol.socket.read();
				step = 0;
				loginResult = 29;
				Protocol.socket.close();
				Protocol.socket = null;
			}
		} catch (@Pc(1122) IOException ex) {
			if (Protocol.socket != null) {
				Protocol.socket.close();
				Protocol.socket = null;
			}
			if (errors < 1) {
				loops = 0;
				errors++;
				step = 1;
				if (client.alternatePort == client.port) {
					client.port = client.defaultPort;
				} else {
					client.port = client.alternatePort;
				}
			} else {
				loginResult = -4;
				step = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!qg;)V")
	public static void lswpRenderLoginDecoder(@OriginalArg(1) Packet buffer) {
		buffer.accessBits();
		@Pc(10) int local10 = PlayerList.selfId;
		@Pc(20) Player local20 = PlayerList.self = PlayerList.players[local10] = new Player();
		local20.anInt4619 = local10;
		@Pc(28) int local28 = buffer.gBit(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.movementQueueX[0] = local39 - Camera.originX;
		local20.xFine = (local20.movementQueueX[0] << 7) + (local20.getSize() << 6);
		local20.movementQueueZ[0] = local43 - Camera.originZ;
		local20.zFine = (local20.movementQueueZ[0] << 7) + (local20.getSize() << 6);
		Static355.anInt6585 = local20.plane = local33;
		if (Static231.aClass2_Sub4Array1[local10] != null) {
			local20.decodeAppearance(Static231.aClass2_Sub4Array1[local10]);
		}
		PlayerList.anInt751 = 0;
		PlayerList.anIntArray121[PlayerList.anInt751++] = local10;
		PlayerList.aByteArray7[local10] = 0;
		PlayerList.anInt3547 = 0;
		for (@Pc(124) int local124 = 1; local124 < 2048; local124++) {
			if (local124 != local10) {
				@Pc(138) int local138 = buffer.gBit(18);
				@Pc(142) int local142 = local138 >> 16;
				@Pc(148) int local148 = local138 >> 8 & 0xFF;
				@Pc(152) int local152 = local138 & 0xFF;
				Static360.anIntArray422[local124] = (local142 << 28) - (-(local148 << 14) - local152);
				Static324.anIntArray410[local124] = 0;
				Static225.anIntArray260[local124] = -1;
				PlayerList.anIntArray284[PlayerList.anInt3547++] = local124;
				PlayerList.aByteArray7[local124] = 0;
			}
		}
		buffer.accessBytes();
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
	public static void loopAuto() {
		if (autoStep == 0) {
			return;
		}
		try {
			if (++Static193.anInt3557 > 1500) {
				if (Protocol.socket != null) {
					Protocol.socket.close();
					Protocol.socket = null;
				}
				if (Static60.anInt666 >= 1) {
					autoStep = 0;
					loginResult = -5;
					return;
				}
				autoStep = 1;
				if (client.worldListDefaultPort == client.worldListPort) {
					client.worldListPort = client.worldListAlternatePort;
				} else {
					client.worldListPort = client.worldListDefaultPort;
				}
				Static60.anInt666++;
				Static193.anInt3557 = 0;
			}
			if (autoStep == 1) {
				Protocol.socketRequest2 = GameShell.signlink.openSocket(client.worldListHostname, client.worldListPort);
				autoStep = 2;
			}
			@Pc(125) int local125;
			if (autoStep == 2) {
				if (Protocol.socketRequest2.status == 2) {
					throw new IOException();
				}
				if (Protocol.socketRequest2.status != 1) {
					return;
				}
				Protocol.socket = new BufferedSocket((Socket) Protocol.socketRequest2.result, GameShell.signlink);
				Protocol.socketRequest2 = null;
				Protocol.socket.write(Protocol.outboundBuffer.pos, Protocol.outboundBuffer.data);
				if (client.musicChannel != null) {
					client.musicChannel.method6325();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method6325();
				}
				local125 = Protocol.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method6325();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method6325();
				}
				if (local125 != 101) {
					loginResult = local125;
					autoStep = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				autoStep = 3;
			}
			if (autoStep == 3 && Protocol.socket.available() >= 2) {
				local125 = Protocol.socket.read() << 8 | Protocol.socket.read();
				WorldList.switchWorld(local125);
				if (Player.worldId == -1) {
					autoStep = 0;
					loginResult = 6;
					Protocol.socket.close();
					Protocol.socket = null;
				} else {
					autoStep = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					clear();
				}
			}
		} catch (@Pc(208) IOException local208) {
			if (Protocol.socket != null) {
				Protocol.socket.close();
				Protocol.socket = null;
			}
			if (Static60.anInt666 >= 1) {
				autoStep = 0;
				loginResult = -4;
			} else {
				autoStep = 1;
				Static193.anInt3557 = 0;
				if (client.worldListPort == client.worldListDefaultPort) {
					client.worldListPort = client.worldListAlternatePort;
				} else {
					client.worldListPort = client.worldListDefaultPort;
				}
				Static60.anInt666++;
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "(I)V")
	public static void logout() {
		if (Protocol.socket != null) {
			Protocol.socket.close();
			Protocol.socket = null;
		}
		Static211.method3721();
		Static253.method4366();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static171.aClass46Array1[local17].method1626();
		}
		Static241.method4192(false);
		System.gc();
		MidiPlayer.playFadeOut();
		MidiPlayer.jingle = false;
		MusicPlayer.groupId = -1;
		AreaSoundManager.clear(true);
		Camera.originX = 0;
		Static9.anInt212 = 0;
		Static220.aBoolean252 = false;
		Static105.anInt2187 = 0;
		Camera.originZ = 0;
		for (@Pc(56) int local56 = 0; local56 < Static50.aClass84Array1.length; local56++) {
			Static50.aClass84Array1[local56] = null;
		}
		Static358.method5888();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			PlayerList.players[local75] = null;
		}
		NpcList.size = 0;
		for (@Pc(91) int local91 = 0; local91 < 32768; local91++) {
			NpcList.npcs[local91] = null;
		}
		Static120.objStacks.clear();
		Camera.reset();
		Protocol.verifyId = 0;
		VarpDomain.instance.method5781();
		Static114.method2362();
		Static360.method5646();
		Static50.method1525(true);
		try {
			BrowserControl.call(GameShell.signlink.applet, "loggedout");
		} catch (@Pc(128) Throwable local128) {
		}
		Static375.aLong222 = 0L;
		Static385.aClass2_Sub16_2 = null;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	public static void rebuildMap() {
		Protocol.method2973(false);
		Static144.anInt2694 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static106.aByteArrayArray6.length; local14++) {
			if (Static221.mapGroupIds[local14] != -1 && Static106.aByteArrayArray6[local14] == null) {
				Static106.aByteArrayArray6[local14] = client.jsArchive5.fetchFile(0, Static221.mapGroupIds[local14]);
				if (Static106.aByteArrayArray6[local14] == null) {
					local12 = false;
					Static144.anInt2694++;
				}
			}
			if (Static374.locGroupIds[local14] != -1 && Static82.aByteArrayArray5[local14] == null) {
				Static82.aByteArrayArray5[local14] = client.jsArchive5.fetchFile(Static277.anIntArrayArray43[local14], 0, Static374.locGroupIds[local14]);
				if (Static82.aByteArrayArray5[local14] == null) {
					local12 = false;
					Static144.anInt2694++;
				}
			}
			if (Static51.underwaterMapGroupIds[local14] != -1 && Static232.aByteArrayArray9[local14] == null) {
				Static232.aByteArrayArray9[local14] = client.jsArchive5.fetchFile(0, Static51.underwaterMapGroupIds[local14]);
				if (Static232.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static144.anInt2694++;
				}
			}
			if (Static62.underwaterLocGroupIds[local14] != -1 && Static270.aByteArrayArray15[local14] == null) {
				Static270.aByteArrayArray15[local14] = client.jsArchive5.fetchFile(0, Static62.underwaterLocGroupIds[local14]);
				if (Static270.aByteArrayArray15[local14] == null) {
					Static144.anInt2694++;
					local12 = false;
				}
			}
			if (Static190.anIntArray208 != null && Static210.aByteArrayArray7[local14] == null && Static190.anIntArray208[local14] != -1) {
				Static210.aByteArrayArray7[local14] = client.jsArchive5.fetchFile(Static277.anIntArrayArray43[local14], 0, Static190.anIntArray208[local14]);
				if (Static210.aByteArrayArray7[local14] == null) {
					Static144.anInt2694++;
					local12 = false;
				}
			}
		}
		if (Static34.aClass103_3 == null) {
			if (Static91.aClass2_Sub2_Sub17_1 == null || !client.jsArchive23.isGroupNameValid(Static91.aClass2_Sub2_Sub17_1.aString67 + "_staticelements")) {
				Static34.aClass103_3 = new Class103(0);
			} else if (client.jsArchive23.isGroupReady(Static91.aClass2_Sub2_Sub17_1.aString67 + "_staticelements")) {
				Static34.aClass103_3 = Static317.method5552(client.jsArchive23, Static91.aClass2_Sub2_Sub17_1.aString67 + "_staticelements", mapMembers);
			} else {
				Static144.anInt2694++;
				local12 = false;
			}
		}
		if (!local12) {
			Static246.anInt4505 = 1;
			return;
		}
		local12 = true;
		Static305.anInt5742 = 0;
		@Pc(268) int local268;
		@Pc(279) int local279;
		for (@Pc(249) int local249 = 0; local249 < Static106.aByteArrayArray6.length; local249++) {
			@Pc(255) byte[] local255 = Static82.aByteArrayArray5[local249];
			if (local255 != null) {
				local268 = (Static291.mapSquares[local249] >> 8) * 64 - Camera.originX;
				local279 = (Static291.mapSquares[local249] & 0xFF) * 64 - Camera.originZ;
				if (Static220.aBoolean252) {
					local268 = 10;
					local279 = 10;
				}
				local12 &= Static193.method3511(local279, local268, local255, Static242.buildAreaLimitZ, Static373.buildAreaLimitX);
			}
			local255 = Static270.aByteArrayArray15[local249];
			if (local255 != null) {
				local268 = (Static291.mapSquares[local249] >> 8) * 64 - Camera.originX;
				local279 = (Static291.mapSquares[local249] & 0xFF) * 64 - Camera.originZ;
				if (Static220.aBoolean252) {
					local279 = 10;
					local268 = 10;
				}
				local12 &= Static193.method3511(local279, local268, local255, Static242.buildAreaLimitZ, Static373.buildAreaLimitX);
			}
		}
		if (!local12) {
			Static246.anInt4505 = 2;
			return;
		}
		if (Static246.anInt4505 != 0) {
			Static351.method5857(Static276.aClass130_4, true, Static256.aClass79_102.getLocalized(client.language) + "<br>(100%)");
		}
		client.audioLogic();
		Static211.method3721();
		@Pc(375) boolean local375 = false;
		if (Rasteriser.instance.method2805() && client.preferences.highDetailWater) {
			for (local268 = 0; local268 < Static106.aByteArrayArray6.length; local268++) {
				if (Static270.aByteArrayArray15[local268] != null || Static232.aByteArrayArray9[local268] != null) {
					local375 = true;
					break;
				}
			}
		}
		if (client.preferences.fogEnabled) {
			local268 = Static272.anIntArray351[Static31.anInt752];
		} else {
			local268 = Static59.anIntArray106[Static31.anInt752];
		}
		if (Rasteriser.instance.method2888()) {
			local268++;
		}
		Scene.method1381(Static373.buildAreaLimitX, Static242.buildAreaLimitZ, local268, local375, Rasteriser.instance.method2886() > 0);
		for (local279 = 0; local279 < 4; local279++) {
			Static171.aClass46Array1[local279].method1626();
		}
		Static285.method4887();
		AreaSoundManager.clear(false);
		Static20.method560();
		client.audioLogic();
		System.gc();
		Protocol.method2973(true);
		Static375.method6281();
		Static246.aBoolean312 = client.preferences.highDetailLighting;
		Static105.aBoolean162 = client.preferences.highDetailWater;
		Static183.aBoolean8 = GameShell.maxMemory >= 96;
		Static174.anInt1300 = client.preferences.shadows;
		Static141.aBoolean190 = !client.preferences.groundTextures;
		Static158.anInt2911 = client.preferences.method4495(Static77.anInt1762) ? -1 : Static44.anInt1115;
		Static132.aBoolean179 = Static77.anInt1762 == 1 || client.preferences.groundBlending;
		Static190.aClass29_Sub1_63 = new SceneBuilder(4, Static373.buildAreaLimitX, Static242.buildAreaLimitZ, false);
		if (!Static220.aBoolean252) {
			Static177.method3346(Static190.aClass29_Sub1_63, Static106.aByteArrayArray6);
		}
		if (Static220.aBoolean252) {
			Static120.method2381(Static106.aByteArrayArray6, Static190.aClass29_Sub1_63);
		}
		Static195.method3559(Static373.buildAreaLimitX >> 4, Static242.buildAreaLimitZ >> 4);
		Static56.method1611();
		if (local375) {
			Scene.method5767(true);
			Static7.aClass29_Sub1_120 = new SceneBuilder(1, Static373.buildAreaLimitX, Static242.buildAreaLimitZ, true);
			if (!Static220.aBoolean252) {
				Static177.method3346(Static7.aClass29_Sub1_120, Static232.aByteArrayArray9);
				Protocol.method2973(true);
			}
			if (Static220.aBoolean252) {
				Static120.method2381(Static232.aByteArrayArray9, Static7.aClass29_Sub1_120);
				Protocol.method2973(true);
			}
			Static7.aClass29_Sub1_120.method1097(Static190.aClass29_Sub1_63.levelHeightmap[0]);
			Static7.aClass29_Sub1_120.method1085(null, null, Rasteriser.instance);
			Scene.method5767(false);
		}
		Static190.aClass29_Sub1_63.method1085(local375 ? Static7.aClass29_Sub1_120.levelHeightmap : null, Static171.aClass46Array1, Rasteriser.instance);
		if (!Static220.aBoolean252) {
			Protocol.method2973(true);
			Static170.method3231(Static190.aClass29_Sub1_63, Static82.aByteArrayArray5);
			if (Static210.aByteArrayArray7 != null) {
				Static1.method2();
			}
		}
		if (Static220.aBoolean252) {
			Protocol.method2973(true);
			Static65.method1737(Static190.aClass29_Sub1_63, Static82.aByteArrayArray5);
		}
		Static211.method3721();
		Protocol.method2973(true);
		Static190.aClass29_Sub1_63.method1093(local375 ? Scene.aClass6Array2[0] : null, Rasteriser.instance, null);
		Static190.aClass29_Sub1_63.method1104(Rasteriser.instance);
		Protocol.method2973(true);
		if (local375) {
			Scene.method5767(true);
			Protocol.method2973(true);
			if (!Static220.aBoolean252) {
				Static170.method3231(Static7.aClass29_Sub1_120, Static270.aByteArrayArray15);
			}
			if (Static220.aBoolean252) {
				Static65.method1737(Static7.aClass29_Sub1_120, Static270.aByteArrayArray15);
			}
			Static211.method3721();
			Protocol.method2973(true);
			Static7.aClass29_Sub1_120.method1093(null, Rasteriser.instance, Scene.aClass6Array3[0]);
			Static7.aClass29_Sub1_120.method1104(Rasteriser.instance);
			Protocol.method2973(true);
			Scene.method5767(false);
		}
		Static295.method5094();
		@Pc(692) int local692 = Static190.aClass29_Sub1_63.anInt922;
		if (Static355.anInt6585 < local692) {
			local692 = Static355.anInt6585;
		}
		if (Static355.anInt6585 - 1 > local692) {
			local692 = Static355.anInt6585 - 1;
		}
		if (client.preferences.method4495(Static77.anInt1762)) {
			Static77.method1856(0);
		} else {
			Static77.method1856(local692);
		}
		@Pc(731) int local731;
		@Pc(735) int local735;
		for (@Pc(727) int local727 = 0; local727 < 4; local727++) {
			for (local731 = 0; local731 < Static373.buildAreaLimitX; local731++) {
				for (local735 = 0; local735 < Static242.buildAreaLimitZ; local735++) {
					Static165.sortObjStack(local731, local727, local735);
				}
			}
		}
		Static226.method3982();
		client.audioLogic();
		Static144.method2690();
		Static211.method3721();
		Static3.aBoolean5 = false;
		Static50.method1530();
		if (GameShell.frame != null && Protocol.socket != null && client.gameState == 25) {
			Protocol.writeOpcode(ClientProt.EVENT_FRAME_MAP_LOADED);
			Protocol.outboundBuffer.p4(1057001181);
		}
		if (!Static220.aBoolean252) {
			local731 = (Static105.anInt2187 - (Static373.buildAreaLimitX >> 4)) / 8;
			local735 = ((Static373.buildAreaLimitX >> 4) + Static105.anInt2187) / 8;
			@Pc(811) int local811 = (Static9.anInt212 - (Static242.buildAreaLimitZ >> 4)) / 8;
			@Pc(819) int local819 = ((Static242.buildAreaLimitZ >> 4) + Static9.anInt212) / 8;
			for (@Pc(823) int local823 = local731 - 1; local823 <= local735 + 1; local823++) {
				for (@Pc(829) int local829 = local811 - 1; local829 <= local819 + 1; local829++) {
					if (local823 < local731 || local823 > local735 || local829 < local811 || local819 < local829) {
						client.jsArchive5.prefetchGroup("m" + local823 + "_" + local829);
						client.jsArchive5.prefetchGroup("l" + local823 + "_" + local829);
					}
				}
			}
		}
		if (client.gameState == 28) {
			client.setGameState(10);
		} else {
			client.setGameState(30);
			if (Protocol.socket != null) {
				Protocol.writeOpcode(ClientProt.MAP_BUILD_COMPLETE);
			}
		}
		Static253.method4369();
		client.audioLogic();
		GameShell.resetTimer();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V")
	public static void login(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		usernameInput = arg1;
		anInt3714 = arg2;
		password = arg0;
		if (usernameInput.equals("") || password.equals("")) {
			loginResult = 3;
		} else if (Player.worldId == -1) {
			Static60.anInt666 = 0;
			autoStep = 1;
			loginResult = -3;
			Static193.anInt3557 = 0;
			@Pc(40) Buffer encrypted = new Buffer(128);
			encrypted.p1(10);
			encrypted.p4((int) (Math.random() * 9.9999999E7D));
			encrypted.p8(StringUtils.toBase37(usernameInput));
			encrypted.p4((int) (Math.random() * 9.9999999E7D));
			encrypted.pjstr(password);
			encrypted.p4((int) (Math.random() * 9.9999999E7D));
			encrypted.rsaenc(Protocol.EXPONENT, Protocol.MODULUS);
			Protocol.outboundBuffer.pos = 0;
			Protocol.outboundBuffer.p1(LoginProt.aClass242_10.opcode);
			Protocol.outboundBuffer.p1(encrypted.pos + 2);
			Protocol.outboundBuffer.p2(578);
			Protocol.outboundBuffer.pdata(encrypted.data, encrypted.pos);
		} else {
			clear();
		}
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)V")
	public static void method3502() {
		Static211.aClass13_13 = null;
		Static339.aClass13_18 = null;
		Static75.aClass13_5 = null;
		Static337.aClass13_17 = null;
		Static35.aClass13_3 = null;
		Static197.aClass13_12 = null;
		Static110.aClass13_6 = null;
		Static138.aClass13_8 = null;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
	public static void method5435() {
		if (step == 5) {
			step = 6;
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	public static void clear() {
		loops = 0;
		aBoolean158 = false;
		disallowResult = -1;
		errors = 0;
		step = 1;
		hopTime = 0;
		loginResult = -3;
	}

}
