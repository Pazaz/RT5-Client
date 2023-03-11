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
					Static82.anInt1836 = -2;
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
				if (step == 10) {
					if (Protocol.inboundBuffer.peek1isaac()) {
						if (Protocol.socket.available() < 1) {
							return;
						}
						Protocol.socket.read(Protocol.inboundBuffer.data, 1, Protocol.inboundBuffer.pos + 2);
					}
					Static231.aClass89_164 = Static166.method3188()[Protocol.inboundBuffer.method4864()];
					Static82.anInt1836 = Protocol.inboundBuffer.g2();
					step = 9;
				}
				if (step == 9) {
					if (Protocol.socket.available() >= Static82.anInt1836) {
						Protocol.socket.read(Protocol.inboundBuffer.data, Static82.anInt1836, 0);
						Protocol.inboundBuffer.pos = 0;
						LoginManager.reply = 2;
						reply = Static82.anInt1836;
						step = 0;
						Static390.method6449();
						Static366.method6120(Protocol.inboundBuffer);
						Static105.anInt2187 = -1;
						Static181.method3375(false);
						if (reply != Protocol.inboundBuffer.pos) {
							throw new RuntimeException("lswp pos:" + Protocol.inboundBuffer.pos + " psize:" + reply);
						}
						Static231.aClass89_164 = null;
					}
				} else if (step == 12) {
					if (Static82.anInt1836 == -2) {
						if (Protocol.socket.available() < 2) {
							return;
						}
						Protocol.socket.read(Protocol.inboundBuffer.data, 2, 0);
						Protocol.inboundBuffer.pos = 0;
						Static82.anInt1836 = Protocol.inboundBuffer.g2();
					}
					if (Protocol.socket.available() >= Static82.anInt1836) {
						Protocol.socket.read(Protocol.inboundBuffer.data, Static82.anInt1836, 0);
						Protocol.inboundBuffer.pos = 0;
						LoginManager.reply = 15;
						step = 0;
						reply = Static82.anInt1836;
						Static182.method3388();
						Static366.method6120(Protocol.inboundBuffer);
						if (Protocol.inboundBuffer.pos != reply) {
							throw new RuntimeException("lswpr pos:" + Protocol.inboundBuffer.pos + " psize:" + reply);
						}
						Static231.aClass89_164 = null;
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

}
