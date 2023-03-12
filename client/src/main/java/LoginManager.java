import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.Socket;
import java.net.URL;

public class LoginManager {

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "Lclient!vr;")
	public static final OutboundPacket LOGIN = new OutboundPacket(14, 1);
	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
	public static int step = 0;
	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	public static int loops = 0;
	@OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
	public static int errors = 0;
	@OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
	public static int reply = -2;
	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Ljava/lang/String;")
	public static String username = "";
	@OriginalMember(owner = "client!nq", name = "g", descriptor = "J")
	public static long encodedUsername;
	@OriginalMember(owner = "client!lp", name = "e", descriptor = "J")
	public static long serverKey = 0L;
	@OriginalMember(owner = "client!as", name = "f", descriptor = "Ljava/lang/String;")
	public static String password = "";
	@OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
	public static int reconnecting = 0;
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

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void loop() {
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
					reply = -5;
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
				Protocol.socket = new Class111((Socket) Protocol.socketRequest2.result, GameShell.signlink);
				Protocol.socketRequest2 = null;
				@Pc(105) long encodedUsername = LoginManager.encodedUsername = StringUtils.toBase37(username);
				int usernameHash = (int) (encodedUsername >> 16 & 0x1FL);
				Protocol.outboundBuffer.pos = 0;
				Protocol.outboundBuffer.p1(LOGIN.opcode);
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
					LoginManager.reply = reply;
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
				rsaBuffer.p8(StringUtils.toBase37(username));
				rsaBuffer.pjstr(password);
				rsaBuffer.rsaenc(Protocol.EXPONENT, Protocol.MODULUS);
				Protocol.outboundBuffer.pos = 0;
				if (reconnecting == 40) {
					Protocol.outboundBuffer.p1(Static43.WORLD_RECONNECT.opcode);
				} else {
					Protocol.outboundBuffer.p1(Static43.WORLD_CONNECT.opcode);
				}
				Protocol.outboundBuffer.p2(0);
				int start = Protocol.outboundBuffer.pos;
				Protocol.outboundBuffer.p4(578);
				Protocol.outboundBuffer.p1(Static202.anInt3714);
				Protocol.outboundBuffer.p1(Static144.getWindowMode());
				Protocol.outboundBuffer.p2(GameShell.canvasWidth);
				Protocol.outboundBuffer.p2(GameShell.canvasHeight);
				Protocol.outboundBuffer.p1(client.preferences.anInt4885);
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
					LoginManager.reply = reply;
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
					LoginManager.reply = reply;
					step = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
			}
			if (step == 6) {
				Protocol.outboundBuffer.pos = 0;
				Protocol.outboundBuffer.p1isaac(Static43.aClass242_4.opcode);
				Protocol.socket.write(Protocol.outboundBuffer.pos, Protocol.outboundBuffer.data);
				step = 4;
			} else if (step == 7) {
				if (Protocol.socket.available() >= 1) {
					hopTime = Protocol.socket.read() * 60 + 180;
					LoginManager.reply = 21;
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
					MouseRecorder.enabled = Protocol.inboundBuffer.g1() == 1;
					mapMembers = Protocol.inboundBuffer.g1() == 1;
					Static359.LocTypeList.setAllowMembers(mapMembers);
					Static313.ObjTypeList.setAllowMembers(mapMembers);
					Static6.NpcTypeList.setAllowMembers(mapMembers);
					if (playerUnderage && !parentalAdvertConsent || MouseRecorder.enabled) {
						try {
							BrowserControl.call(GameShell.signlink.applet, "zap");
						} catch (@Pc(896) Throwable ex) {
							if (Static132.aBoolean180) {
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
					if (client.MODE_WHERE_LIVE == client.modeWhere) {
						try {
							BrowserControl.call(GameShell.signlink.applet, "loggedin");
						} catch (@Pc(934) Throwable ignored) {
						}
					}
					step = 10;
				}
				if (step == 10) { // making sure nothing is out of order? read for opcode 98 perhaps?
					if (Protocol.inboundBuffer.peek1isaac()) {
						if (Protocol.socket.available() < 1) {
							return;
						}
						Protocol.socket.read(Protocol.inboundBuffer.data, 1, Protocol.inboundBuffer.pos + 2);
					}
					Protocol.packet = Protocol.INCOMING_WORLD()[Protocol.inboundBuffer.gsmart_isaac()];
					Protocol.packetSize = Protocol.inboundBuffer.g2();
					step = 9;
				}
				if (step == 9) { // connect
					if (Protocol.socket.available() >= Protocol.packetSize) {
						Protocol.socket.read(Protocol.inboundBuffer.data, Protocol.packetSize, 0);
						Protocol.inboundBuffer.pos = 0;
						LoginManager.reply = 2;
						reply = Protocol.packetSize;
						step = 0;
						client.reset();
						lswpRenderLoginDecoder(Protocol.inboundBuffer);
						Static105.anInt2187 = -1;
						Static181.mapLoadDecoder(false);
						if (reply != Protocol.inboundBuffer.pos) {
							throw new RuntimeException("lswp pos:" + Protocol.inboundBuffer.pos + " psize:" + reply);
						}
						Protocol.packet = null;
					}
				} else if (step == 12) { // reconnect
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
						LoginManager.reply = 15;
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
				LoginManager.reply = 29;
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
				reply = -4;
				step = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!qg;)V")
	public static void lswpRenderLoginDecoder(@OriginalArg(1) Packet buffer) {
		buffer.accessBits();
		@Pc(10) int local10 = PlayerList.selfId;
		@Pc(20) Player local20 = Static17.aClass11_Sub5_Sub2_Sub1_3 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local10] = new Player();
		local20.anInt4619 = local10;
		@Pc(28) int local28 = buffer.gBit(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.movementQueueX[0] = local39 - Static164.anInt3140;
		local20.xFine = (local20.movementQueueX[0] << 7) + (local20.getSize() << 6);
		local20.movementQueueZ[0] = local43 - Static148.anInt2719;
		local20.zFine = (local20.movementQueueZ[0] << 7) + (local20.getSize() << 6);
		Static355.anInt6585 = local20.aByte78 = local33;
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

}
