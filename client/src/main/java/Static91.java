import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!f", name = "x", descriptor = "Lclient!vj;")
	public static Class2_Sub2_Sub17 aClass2_Sub2_Sub17_1;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "Lclient!od;")
	public static Class2_Sub12_Sub3 aClass2_Sub12_Sub3_1;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_69 = new Class145(61, -1);

	@OriginalMember(owner = "client!f", name = "E", descriptor = "I")
	public static final int anInt1909 = 1400;

	@OriginalMember(owner = "client!f", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString18 = null;

	@OriginalMember(owner = "client!f", name = "H", descriptor = "I")
	public static int anInt1910 = -1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!mc;I)V")
	public static void method1960(@OriginalArg(0) Class145 arg0) {
		Protocol.outboundBuffer.p1isaac(arg0.method3702());
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void method1961() {
		if (Static347.anInt6441 == 0 || Static347.anInt6441 == 5) {
			return;
		}
		try {
			if (++Static182.anInt3420 > 2000) {
				if (Protocol.socket != null) {
					Protocol.socket.close();
					Protocol.socket = null;
				}
				if (Static216.anInt3800 >= 1) {
					Static41.anInt1046 = -5;
					Static347.anInt6441 = 0;
					return;
				}
				Static182.anInt3420 = 0;
				Static216.anInt3800++;
				Static347.anInt6441 = 1;
				if (client.alternatePort == client.port) {
					client.port = client.defaultPort;
				} else {
					client.port = client.alternatePort;
				}
			}
			if (Static347.anInt6441 == 1) {
				Static5.aClass32_1 = GameShell.signlink.openSocket(client.hostname, client.port);
				Static347.anInt6441 = 2;
			}
			@Pc(112) int local112;
			if (Static347.anInt6441 == 2) {
				if (Static5.aClass32_1.status == 2) {
					throw new IOException();
				}
				if (Static5.aClass32_1.status != 1) {
					return;
				}
				Protocol.socket = new Class111((Socket) Static5.aClass32_1.result, GameShell.signlink);
				Static5.aClass32_1 = null;
				@Pc(105) long local105 = Static241.aLong130 = Static80.method5985(Static374.aString70);
				local112 = (int) (local105 >> 16 & 0x1FL);
				Protocol.outboundBuffer.pos = 0;
				Protocol.outboundBuffer.p1(Static43.aClass242_1.anInt7038);
				Protocol.outboundBuffer.p1(local112);
				Protocol.socket.write(2, Protocol.outboundBuffer.data);
				if (client.musicChannel != null) {
					client.musicChannel.method6325();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method6325();
				}
				@Pc(145) int local145 = Protocol.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method6325();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method6325();
				}
				if (local145 != 0) {
					Static347.anInt6441 = 0;
					Static41.anInt1046 = local145;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				Static347.anInt6441 = 3;
			}
			if (Static347.anInt6441 == 3) {
				if (Protocol.socket.available() < 8) {
					return;
				}
				Protocol.socket.read(Static212.aClass2_Sub4_Sub2_3.data, 8, 0);
				Static212.aClass2_Sub4_Sub2_3.pos = 0;
				Static201.aLong119 = Static212.aClass2_Sub4_Sub2_3.g8();
				@Pc(208) Buffer local208 = new Buffer(70);
				@Pc(211) int[] local211 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static201.aLong119 >> 32), (int) Static201.aLong119 };
				local208.p1(10);
				local208.p4(local211[0]);
				local208.p4(local211[1]);
				local208.p4(local211[2]);
				local208.p4(local211[3]);
				local208.p8(Static80.method5985(Static374.aString70));
				local208.pjstr(Static16.aString51);
				local208.rsaenc(Static320.aBigInteger2, Static194.aBigInteger1);
				Protocol.outboundBuffer.pos = 0;
				if (Static347.anInt6442 == 40) {
					Protocol.outboundBuffer.p1(Static43.aClass242_5.anInt7038);
				} else {
					Protocol.outboundBuffer.p1(Static43.aClass242_3.anInt7038);
				}
				Protocol.outboundBuffer.p2(0);
				local112 = Protocol.outboundBuffer.pos;
				Protocol.outboundBuffer.p4(578);
				Protocol.outboundBuffer.p1(Static202.anInt3714);
				Protocol.outboundBuffer.p1(Static144.method2692());
				Protocol.outboundBuffer.p2(Static250.anInt4665);
				Protocol.outboundBuffer.p2(Static172.anInt3299);
				Protocol.outboundBuffer.p1(Static218.aClass177_Sub1_2.anInt4885);
				Static27.method875(Protocol.outboundBuffer);
				Protocol.outboundBuffer.pjstr(Static74.settings);
				Protocol.outboundBuffer.p4(client.affiliate);
				@Pc(354) Buffer local354 = Static218.aClass177_Sub1_2.method4494();
				Protocol.outboundBuffer.p1(local354.pos);
				Protocol.outboundBuffer.pdata(local354.data, local354.pos);
				Static236.aBoolean288 = true;
				Protocol.outboundBuffer.p2(Static292.anInt5510);
				Protocol.outboundBuffer.p4(Static342.aClass197_77.method5078());
				Protocol.outboundBuffer.p4(Static34.aClass197_67.method5078());
				Protocol.outboundBuffer.p4(Static289.aClass197_71.method5078());
				Protocol.outboundBuffer.p4(Static354.aClass197_9.method5078());
				Protocol.outboundBuffer.p4(Static85.aClass197_21.method5078());
				Protocol.outboundBuffer.p4(Static288.aClass197_70.method5078());
				Protocol.outboundBuffer.p4(Static101.aClass197_23.method5078());
				Protocol.outboundBuffer.p4(Static237.aClass197_63.method5078());
				Protocol.outboundBuffer.p4(Static30.aClass197_5.method5078());
				Protocol.outboundBuffer.p4(Static324.aClass197_86.method5078());
				Protocol.outboundBuffer.p4(Static75.aClass197_18.method5078());
				Protocol.outboundBuffer.p4(Static216.aClass197_58.method5078());
				Protocol.outboundBuffer.p4(Static195.aClass197_54.method5078());
				Protocol.outboundBuffer.p4(Static255.aClass197_64.method5078());
				Protocol.outboundBuffer.p4(Static133.aClass197_32.method5078());
				Protocol.outboundBuffer.p4(Static120.aClass197_28.method5078());
				Protocol.outboundBuffer.p4(Static391.aClass197_96.method5078());
				Protocol.outboundBuffer.p4(Static226.aClass197_61.method5078());
				Protocol.outboundBuffer.p4(Static216.aClass197_57.method5078());
				Protocol.outboundBuffer.p4(Static61.aClass197_12.method5078());
				Protocol.outboundBuffer.p4(Static139.aClass197_35.method5078());
				Protocol.outboundBuffer.p4(Static173.aClass197_45.method5078());
				Protocol.outboundBuffer.p4(Static294.aClass197_75.method5078());
				Protocol.outboundBuffer.p4(Static389.aClass197_66.method5078());
				Protocol.outboundBuffer.p4(Static385.aClass197_94.method5078());
				Protocol.outboundBuffer.p4(Static139.aClass197_34.method5078());
				Protocol.outboundBuffer.p4(Static235.aClass197_47.method5078());
				Protocol.outboundBuffer.p4(Static61.aClass197_11.method5078());
				Protocol.outboundBuffer.p4(Static85.aClass197_20.method5078());
				Protocol.outboundBuffer.pdata(local208.data, local208.pos);
				Protocol.outboundBuffer.psize2(Protocol.outboundBuffer.pos - local112);
				Protocol.socket.write(Protocol.outboundBuffer.pos, Protocol.outboundBuffer.data);
				Protocol.outboundBuffer.setKey(local211);
				for (@Pc(579) int local579 = 0; local579 < 4; local579++) {
					local211[local579] += 50;
				}
				Static212.aClass2_Sub4_Sub2_3.setKey(local211);
				Static347.anInt6441 = 4;
			}
			@Pc(619) int local619;
			if (Static347.anInt6441 == 4) {
				if (Protocol.socket.available() < 1) {
					return;
				}
				local619 = Protocol.socket.read();
				if (local619 == 21) {
					Static347.anInt6441 = 7;
				} else if (local619 == 29) {
					Static347.anInt6441 = 11;
				} else if (local619 == 1) {
					Static347.anInt6441 = 5;
					Static41.anInt1046 = local619;
					return;
				} else if (local619 == 2) {
					Static347.anInt6441 = 8;
				} else if (local619 == 15) {
					Static347.anInt6441 = 12;
					Static82.anInt1836 = -2;
				} else if (local619 == 23 && Static216.anInt3800 < 1) {
					Static182.anInt3420 = 0;
					Static216.anInt3800++;
					Static347.anInt6441 = 1;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				} else {
					Static41.anInt1046 = local619;
					Static347.anInt6441 = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
			}
			if (Static347.anInt6441 == 6) {
				Protocol.outboundBuffer.pos = 0;
				Protocol.outboundBuffer.p1isaac(Static43.aClass242_4.anInt7038);
				Protocol.socket.write(Protocol.outboundBuffer.pos, Protocol.outboundBuffer.data);
				Static347.anInt6441 = 4;
			} else if (Static347.anInt6441 == 7) {
				if (Protocol.socket.available() >= 1) {
					Static47.anInt1248 = Protocol.socket.read() * 60 + 180;
					Static41.anInt1046 = 21;
					Static347.anInt6441 = 0;
					Protocol.socket.close();
					Protocol.socket = null;
				}
			} else if (Static347.anInt6441 != 11) {
				if (Static347.anInt6441 == 8) {
					if (Protocol.socket.available() < 13) {
						return;
					}
					Protocol.socket.read(Static212.aClass2_Sub4_Sub2_3.data, 13, 0);
					Static212.aClass2_Sub4_Sub2_3.pos = 0;
					Static4.anInt90 = Static212.aClass2_Sub4_Sub2_3.g1();
					Static210.anInt3774 = Static212.aClass2_Sub4_Sub2_3.g1();
					Static56.aBoolean123 = Static212.aClass2_Sub4_Sub2_3.g1() == 1;
					Static101.aBoolean159 = Static212.aClass2_Sub4_Sub2_3.g1() == 1;
					Static347.aBoolean434 = Static212.aClass2_Sub4_Sub2_3.g1() == 1;
					Static109.aBoolean166 = Static212.aClass2_Sub4_Sub2_3.g1() == 1;
					Static234.anInt4226 = Static212.aClass2_Sub4_Sub2_3.g2();
					Static381.aBoolean482 = Static212.aClass2_Sub4_Sub2_3.g1() == 1;
					Static206.aBoolean241 = Static212.aClass2_Sub4_Sub2_3.g1() == 1;
					Static359.aClass202_4.method5157(Static206.aBoolean241);
					Static313.aClass107_2.method2762(Static206.aBoolean241);
					Static6.aClass219_1.method5573(Static206.aBoolean241);
					if (Static56.aBoolean123 && !Static347.aBoolean434 || Static381.aBoolean482) {
						try {
							Static405.method4628(GameShell.signlink.applet, "zap");
						} catch (@Pc(896) Throwable local896) {
							if (Static132.aBoolean180) {
								try {
									GameShell.signlink.applet.getAppletContext().showDocument(new URL(GameShell.signlink.applet.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(912) Exception local912) {
								}
							}
						}
					} else {
						try {
							Static405.method4628(GameShell.signlink.applet, "unzap");
						} catch (@Pc(922) Throwable local922) {
						}
					}
					if (client.MODE_WHERE_LIVE == client.modeWhere) {
						try {
							Static405.method4628(GameShell.signlink.applet, "loggedin");
						} catch (@Pc(934) Throwable local934) {
						}
					}
					Static347.anInt6441 = 10;
				}
				if (Static347.anInt6441 == 10) {
					if (Static212.aClass2_Sub4_Sub2_3.peek1isaac()) {
						if (Protocol.socket.available() < 1) {
							return;
						}
						Protocol.socket.read(Static212.aClass2_Sub4_Sub2_3.data, 1, Static212.aClass2_Sub4_Sub2_3.pos + 2);
					}
					Static231.aClass89_164 = Static166.method3188()[Static212.aClass2_Sub4_Sub2_3.method4864()];
					Static82.anInt1836 = Static212.aClass2_Sub4_Sub2_3.g2();
					Static347.anInt6441 = 9;
				}
				if (Static347.anInt6441 == 9) {
					if (Protocol.socket.available() >= Static82.anInt1836) {
						Protocol.socket.read(Static212.aClass2_Sub4_Sub2_3.data, Static82.anInt1836, 0);
						Static212.aClass2_Sub4_Sub2_3.pos = 0;
						Static41.anInt1046 = 2;
						local619 = Static82.anInt1836;
						Static347.anInt6441 = 0;
						Static390.method6449();
						Static366.method6120(Static212.aClass2_Sub4_Sub2_3);
						Static105.anInt2187 = -1;
						Static181.method3375(false);
						if (local619 != Static212.aClass2_Sub4_Sub2_3.pos) {
							throw new RuntimeException("lswp pos:" + Static212.aClass2_Sub4_Sub2_3.pos + " psize:" + local619);
						}
						Static231.aClass89_164 = null;
					}
				} else if (Static347.anInt6441 == 12) {
					if (Static82.anInt1836 == -2) {
						if (Protocol.socket.available() < 2) {
							return;
						}
						Protocol.socket.read(Static212.aClass2_Sub4_Sub2_3.data, 2, 0);
						Static212.aClass2_Sub4_Sub2_3.pos = 0;
						Static82.anInt1836 = Static212.aClass2_Sub4_Sub2_3.g2();
					}
					if (Protocol.socket.available() >= Static82.anInt1836) {
						Protocol.socket.read(Static212.aClass2_Sub4_Sub2_3.data, Static82.anInt1836, 0);
						Static212.aClass2_Sub4_Sub2_3.pos = 0;
						Static41.anInt1046 = 15;
						Static347.anInt6441 = 0;
						local619 = Static82.anInt1836;
						Static182.method3388();
						Static366.method6120(Static212.aClass2_Sub4_Sub2_3);
						if (Static212.aClass2_Sub4_Sub2_3.pos != local619) {
							throw new RuntimeException("lswpr pos:" + Static212.aClass2_Sub4_Sub2_3.pos + " psize:" + local619);
						}
						Static231.aClass89_164 = null;
					}
				}
			} else if (Protocol.socket.available() >= 1) {
				Static360.anInt6186 = Protocol.socket.read();
				Static347.anInt6441 = 0;
				Static41.anInt1046 = 29;
				Protocol.socket.close();
				Protocol.socket = null;
			}
		} catch (@Pc(1122) IOException local1122) {
			if (Protocol.socket != null) {
				Protocol.socket.close();
				Protocol.socket = null;
			}
			if (Static216.anInt3800 < 1) {
				Static182.anInt3420 = 0;
				Static216.anInt3800++;
				Static347.anInt6441 = 1;
				if (client.alternatePort == client.port) {
					client.port = client.defaultPort;
				} else {
					client.port = client.alternatePort;
				}
			} else {
				Static41.anInt1046 = -4;
				Static347.anInt6441 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method1962() {
		Static335.aClass98_57.method2614();
		Static124.aClass98_63.method2614();
		Static333.aClass98_65.method2614();
		Static297.aClass98_44.method2614();
		Static288.aClass98_42.method2614();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
	public static void method1963(@OriginalArg(0) int arg0) {
		Static323.anInt6062 = arg0;
		Static124.aClass98_63.method2614();
	}
}
