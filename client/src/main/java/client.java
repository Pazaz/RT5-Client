import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends GameShell {

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!rt;")
	public static final Class209 MODE_ENV_LIVE = new Class209("LIVE", 0);
	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!rt;")
	public static final Class209 MODE_ENV_RC = new Class209("RC", 1);
	@OriginalMember(owner = "client!us", name = "T", descriptor = "Lclient!rt;")
	public static final Class209 MODE_ENV_WIP = new Class209("WIP", 2);
	@OriginalMember(owner = "client!of", name = "u", descriptor = "Lclient!dn;")
	public static final Class50 GAME_RS = new Class50("runescape", 0);
	@OriginalMember(owner = "client!fu", name = "P", descriptor = "Lclient!dn;")
	public static final Class50 GAME_SD = new Class50("stellardawn", 1);
	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!kk;")
	public static final Class127 MODE_WHERE_LOCAL = new Class127("LOCAL", 4);
	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!kk;")
	public static final Class127 MODE_WHERE_LIVE = new Class127("LIVE", 0);
	@OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
	public static int worldListWorldId = 1;
	@OriginalMember(owner = "client!lq", name = "I", descriptor = "Lclient!rt;")
	public static Class209 modeWhat;
	@OriginalMember(owner = "client!r", name = "M", descriptor = "I")
	public static int language = 0;
	@OriginalMember(owner = "client!ts", name = "r", descriptor = "Lclient!dn;")
	public static Class50 game = null;
	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!client;")
	public static client instance;
	@OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
	public static int affiliate = 0;
	@OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
	public static int worldId = -1;
	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Ljava/lang/String;")
	public static String hostname;
	@OriginalMember(owner = "client!gu", name = "y", descriptor = "Lclient!kk;")
	public static Class127 modeWhere;
	@OriginalMember(owner = "client!as", name = "d", descriptor = "I")
	public static int alternatePort;
	@OriginalMember(owner = "client!td", name = "O", descriptor = "I")
	public static int defaultPort;
	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public static int port;
	@OriginalMember(owner = "client!dj", name = "cb", descriptor = "Ljava/lang/String;")
	public static String worldListHostname;
	@OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
	public static int worldListPort;
	@OriginalMember(owner = "client!rm", name = "n", descriptor = "Lclient!tg;")
	public static AudioChannel musicChannel;
	@OriginalMember(owner = "client!kt", name = "Z", descriptor = "Lclient!tg;")
	public static AudioChannel soundChannel;
	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	public static int worldListDefaultPort;
	@OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
	public static int worldListAlternatePort;
	@OriginalMember(owner = "client!tr", name = "h", descriptor = "Lclient!r;")
	public static Js5 jsArchive0;
	@OriginalMember(owner = "client!bt", name = "F", descriptor = "Lclient!r;")
	public static Js5 jsArchive1;
	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Lclient!r;")
	public static Js5 jsArchive2;
	@OriginalMember(owner = "client!un", name = "H", descriptor = "Lclient!r;")
	public static Js5 jsArchive3;
	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!r;")
	public static Js5 jsArchive4;
	@OriginalMember(owner = "client!qm", name = "Q", descriptor = "Lclient!r;")
	public static Js5 jsArchive5;
	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Lclient!r;")
	public static Js5 jsArchive6;
	@OriginalMember(owner = "client!nl", name = "i", descriptor = "Lclient!r;")
	public static Js5 jsArchive7;
	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Lclient!r;")
	public static Js5 jsArchive8;
	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Lclient!r;")
	public static Js5 jsArchive9;
	@OriginalMember(owner = "client!ef", name = "A", descriptor = "Lclient!r;")
	public static Js5 jsArchive10;
	@OriginalMember(owner = "client!mm", name = "j", descriptor = "Lclient!r;")
	public static Js5 jsArchive11;
	@OriginalMember(owner = "client!lg", name = "c", descriptor = "Lclient!r;")
	public static Js5 jsArchive12;
	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Lclient!r;")
	public static Js5 jsArchive13;
	@OriginalMember(owner = "client!hl", name = "D", descriptor = "Lclient!r;")
	public static Js5 jsArchive14;
	@OriginalMember(owner = "client!gs", name = "n", descriptor = "Lclient!r;")
	public static Js5 jsArchive15;
	@OriginalMember(owner = "client!wq", name = "m", descriptor = "Lclient!r;")
	public static Js5 jsArchive16;
	@OriginalMember(owner = "client!na", name = "U", descriptor = "Lclient!r;")
	public static Js5 jsArchive17;
	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!r;")
	public static Js5 jsArchive18;
	@OriginalMember(owner = "client!dj", name = "eb", descriptor = "Lclient!r;")
	public static Js5 jsArchive19;
	@OriginalMember(owner = "client!hs", name = "y", descriptor = "Lclient!r;")
	public static Js5 jsArchive20;
	@OriginalMember(owner = "client!k", name = "G", descriptor = "Lclient!r;")
	public static Js5 jsArchive21;
	@OriginalMember(owner = "client!qt", name = "v", descriptor = "Lclient!r;")
	public static Js5 jsArchive22;
	@OriginalMember(owner = "client!wo", name = "M", descriptor = "Lclient!r;")
	public static Js5 jsArchive23;
	@OriginalMember(owner = "client!wi", name = "z", descriptor = "Lclient!r;")
	public static Js5 jsArchive24;
	@OriginalMember(owner = "client!hs", name = "w", descriptor = "Lclient!r;")
	public static Js5 jsArchive25;
	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Lclient!r;")
	public static Js5 jsArchive26;
	@OriginalMember(owner = "client!dj", name = "db", descriptor = "Lclient!r;")
	public static Js5 jsArchive27;
	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!r;")
	public static Js5 jsArchive28;
	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/lang/String;")
	public static String settings = null;
	@OriginalMember(owner = "client!mo", name = "c", descriptor = "Lclient!pe;")
	public static Class177_Sub1 preferences;
	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	public static int cycle = 0;
	@OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
	public static int gameState = 0;
	@OriginalMember(owner = "client!db", name = "s", descriptor = "Lclient!mq;")
	public static Js5MasterIndex js5MasterIndex;
	@OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
	public static int mainLoadState = 0;
	@OriginalMember(owner = "client!i", name = "T", descriptor = "I")
	public static int mainLoadPercentage = 10;
	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!ro;")
	public static Js5CacheQueue js5CacheQueue;
	@OriginalMember(owner = "client!ql", name = "z", descriptor = "Lclient!pp;")
	public static Js5NetQueue js5NetQueue;
	@OriginalMember(owner = "client!rh", name = "r", descriptor = "Lclient!wp;")
	public static PcmResampler resampler;
	@OriginalMember(owner = "client!nb", name = "E", descriptor = "Lclient!fi;")
	public static MixerPcmStream soundStream;
	@OriginalMember(owner = "client!wi", name = "s", descriptor = "Lclient!od;")
	public static MidiPcmStream musicStream;
	@OriginalMember(owner = "client!dd", name = "t", descriptor = "Ljava/lang/String;")
	public static String mainLoadSecondaryText = "";
	@OriginalMember(owner = "client!hu", name = "t", descriptor = "Lclient!is;")
	public static EnumTypeList EnumTypes;
	@OriginalMember(owner = "client!vf", name = "M", descriptor = "Lclient!be;")
	public static ParamTypeList ParamTypes;
	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!ak;")
	public static BasTypeList BasTypes;
	@OriginalMember(owner = "client!mr", name = "fb", descriptor = "Lclient!mi;")
	public static CursorTypeList CursorTypes;
	@OriginalMember(owner = "client!cf", name = "F", descriptor = "Lclient!fl;")
	public static FloTypeList FloTypes;
	@OriginalMember(owner = "client!tj", name = "t", descriptor = "Lclient!vq;")
	public static FluTypeList FluTypes;
	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!e;")
	public static IdkTypeList IdkTypes;
	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!dp;")
	public static InvTypeList InvTypes;
	@OriginalMember(owner = "client!eu", name = "H", descriptor = "Lclient!qi;")
	public static LightTypeList LightTypes;
	@OriginalMember(owner = "client!us", name = "S", descriptor = "Lclient!rh;")
	public static LocTypeList LocTypes;
	@OriginalMember(owner = "client!nk", name = "H", descriptor = "Lclient!ki;")
	public static MelTypeList MelTypes;
	@OriginalMember(owner = "client!sm", name = "A", descriptor = "Lclient!ii;")
	public static MsiTypeList MsiType;
	@OriginalMember(owner = "client!ae", name = "T", descriptor = "Lclient!ta;")
	public static NpcTypeList NpcTypes;
	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "Lclient!io;")
	public static ObjTypeList ObjTypes;
	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!ui;")
	public static Class233 aClass233_1;
	@OriginalMember(owner = "client!cf", name = "B", descriptor = "Lclient!gp;")
	public static SeqTypeList SeqTypes;
	@OriginalMember(owner = "client!ai", name = "R", descriptor = "Lclient!sj;")
	public static SkyboxTypeList SkyboxTypes;
	@OriginalMember(owner = "client!qb", name = "W", descriptor = "Lclient!ng;")
	public static SkyboxSphereTypeList SkyboxSphereTypes;
	@OriginalMember(owner = "client!so", name = "l", descriptor = "Lclient!sg;")
	public static SpotAnimTypeList SpotAnimTypes;
	@OriginalMember(owner = "client!vj", name = "V", descriptor = "Lclient!ks;")
	public static StructTypeList StructTypes;
	@OriginalMember(owner = "client!kl", name = "m", descriptor = "Lclient!qo;")
	public static Class193 aClass193_2;
	@OriginalMember(owner = "client!jh", name = "l", descriptor = "Lclient!df;")
	public static Class45 aClass45_1;
	@OriginalMember(owner = "client!so", name = "c", descriptor = "Lclient!km;")
	public static VarbitTypeList VarbitTypes;
	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!rb;")
	public static VarpTypeList VarpTypes;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] args) {
		try {
			if (args.length == 4) {
				worldListWorldId = Integer.parseInt(args[0]);

				if (args[1].equals("live")) {
					modeWhat = MODE_ENV_LIVE;
				} else if (args[1].equals("rc")) {
					modeWhat = MODE_ENV_RC;
				} else if (args[1].equals("wip")) {
					modeWhat = MODE_ENV_WIP;
				} else {
					printUsage("modewhat");
				}

				language = Static25.method860(args[2]);
				if (language == -1) {
					if (args[2].equals("english")) {
						language = 0;
					} else if (args[2].equals("german")) {
						language = 1;
					} else {
						printUsage("language");
					}
				}

				if (args[3].equals("game0")) {
					game = GAME_RS;
				} else if (args[3].equals("game1")) {
					game = GAME_SD;
				} else {
					printUsage("game");
				}
			} else {
				// default arguments "1 live english game0"
				worldListWorldId = 1;
				modeWhat = MODE_ENV_LIVE;
				language = 0;
				game = GAME_RS;
			}

			modeWhere = MODE_WHERE_LOCAL;
			Static237.objectTag = false;
			Static276.javaScript = false;
			Static320.anInt6007 = 0;
			Static31.aBoolean68 = true;
			MouseRecorder.enabled = true;
			settings = "";
			affiliate = 0;
			Static64.anInt1555 = game.anInt1553;

			@Pc(131) client c = new client();
			instance = c;
			c.startApplication(game.aString15, modeWhat.method5282() + 32);
			GameShell.frame.setLocation(40, 40);
		} catch (@Pc(154) Exception ex) {
			Static262.report(ex, null);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void printUsage(@OriginalArg(0) String thing) {
		System.out.println("Bad " + thing + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!bt;B)V")
	public static void writeUid(@OriginalArg(0) Buffer arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static317.aClass205_6 != null) {
			@Pc(20) int local20;
			try {
				Static317.aClass205_6.method5214(0L);
				Static317.aClass205_6.method5220(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.pdata(local8, 24);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public static void reset() {
		jsArchive2.discardUnpacked = 1;
		instance.method1382();
		Static242.aBoolean306 = true;
		Static343.aBoolean431 = true;
		Static4.method77();
		Protocol.outboundBuffer.pos = 0;
		Static86.anInt1870 = 0;
		Protocol.packet = null;
		Protocol.packet1 = null;
		Protocol.packet3 = null;
		Protocol.anInt4955 = 0;
		Protocol.inboundBuffer.pos = 0;
		Static151.rebootTimer = 0;
		Protocol.packet2 = null;
		for (@Pc(4365) int local4365 = 0; local4365 < Static50.aClass84Array1.length; local4365++) {
			Static50.aClass84Array1[local4365] = null;
		}
		for (@Pc(4383) int local4383 = 0; local4383 < 100; local4383++) {
			Static88.aStringArray13[local4383] = null;
		}
		Static14.anInt327 = (int) (Math.random() * 110.0D) - 55;
		Static97.anInt2005 = (int) (Math.random() * 30.0D) - 20;
		Static243.anInt4503 = 0;
		Static330.aBoolean419 = false;
		Static277.aFloat67 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static24.anInt642 = (int) (Math.random() * 100.0D) - 50;
		Static226.anInt4016 = 0;
		Static6.anInt158 = (int) (Math.random() * 120.0D) - 60;
		Static53.anInt3966 = (int) (Math.random() * 80.0D) - 40;
		Static254.method4372();
		for (@Pc(4448) int local4448 = 0; local4448 < 2048; local4448++) {
			Static12.aClass11_Sub5_Sub2_Sub1Array1[local4448] = null;
		}
		NpcList.size = 0;
		for (@Pc(4464) int local4464 = 0; local4464 < 32768; local4464++) {
			NpcList.npcs[local4464] = null;
		}
		Static332.aClass135_38.clear();
		Static129.aClass135_20.clear();
		Static284.aClass36_7.method1416();
		Static120.aClass4_49.clear();
		Static207.aClass135_26 = new LinkedList();
		Static235.anInt3363 = 0;
		Static384.anInt7178 = 0;
		Static214.aClass226_1.method5781();
		Static252.method4363();
		Static236.anInt4309 = 0;
		Static254.anInt4698 = 0;
		Static123.anInt2420 = 0;
		Static359.anInt6702 = 0;
		Static348.anInt6446 = 0;
		Static311.anInt5810 = 0;
		Static57.anInt1464 = 0;
		Static19.anInt535 = 0;
		Static180.anInt3404 = 0;
		Static33.anInt4463 = 0;
		for (@Pc(4521) int local4521 = 0; local4521 < Static75.anIntArray117.length; local4521++) {
			if (!Static89.aBooleanArray18[local4521]) {
				Static75.anIntArray117[local4521] = -1;
			}
		}
		if (Static139.anInt2595 != -1) {
			Static162.method2979(Static139.anInt2595);
		}
		for (@Pc(4552) Class2_Sub7 local4552 = (Class2_Sub7) Static329.aClass4_130.head(); local4552 != null; local4552 = (Class2_Sub7) Static329.aClass4_130.next()) {
			if (!local4552.isLinked()) {
				local4552 = (Class2_Sub7) Static329.aClass4_130.head();
				if (local4552 == null) {
					break;
				}
			}
			Static276.method4655(false, local4552, true);
		}
		Static139.anInt2595 = -1;
		Static329.aClass4_130 = new HashTable(8);
		Static210.method3720();
		Static192.aClass161_8 = null;
		for (@Pc(4594) int local4594 = 0; local4594 < 8; local4594++) {
			Static243.aStringArray44[local4594] = null;
			Static44.aBooleanArray11[local4594] = false;
			Static207.anIntArray225[local4594] = -1;
		}
		Static302.method1458();
		Static17.aBoolean308 = true;
		for (@Pc(4618) int local4618 = 0; local4618 < 100; local4618++) {
			Static357.aBooleanArray59[local4618] = true;
		}
		Static186.anInt3730 = 0;
		Static389.aString53 = null;
		Static47.aClass214Array1 = null;
		for (@Pc(4636) int local4636 = 0; local4636 < 6; local4636++) {
			Static290.aClass187Array1[local4636] = new StockMarketOffer();
		}
		for (@Pc(4650) int local4650 = 0; local4650 < 25; local4650++) {
			Static268.anIntArray338[local4650] = 0;
			Static325.anIntArray414[local4650] = 0;
			Static80.anIntArray464[local4650] = 0;
		}
		Static348.method5828();
		Static257.aShortArray79 = Static223.aShortArray78 = Static258.aShortArray95 = Static147.aShortArray54 = new short[256];
		Static100.aBoolean156 = true;
		Static330.aString62 = Static66.aClass79_34.method2267(language);
		Protocol.verifyId = 0;
		preferences.aBoolean365 = false;
		preferences.aBoolean366 = false;
		Static160.method2956();
		Static93.method2002();
		Static375.aLong222 = 0L;
		Static385.aClass2_Sub16_2 = null;
		jsArchive2.discardUnpacked = 2;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	public static void method2549() {
		if (Static86.anInt1870 > 0) {
			Static86.anInt1870--;
		}
		if (Static151.rebootTimer > 1) {
			Static151.rebootTimer--;
			Static93.miscTransmitAt = Static88.transmitTimer;
		}
		if (Static101.aBoolean158) {
			Static101.aBoolean158 = false;
			Static211.method3725();
			return;
		}
		if (!Static375.aBoolean477) {
			Static147.method2703();
		}
		for (@Pc(36) int local36 = 0; local36 < 100 && Protocol.readPacket(); local36++) {
		}
		if (gameState != 30) {
			return;
		}
		Static5.method88(Protocol.outboundBuffer, Static163.aClass145_116.getOpcode());
		if (Static385.aClass2_Sub16_2 == null) {
			if (MonotonicClock.currentTimeMillis() >= Static375.aLong222) {
				Static385.aClass2_Sub16_2 = Static4.aClass162_1.method4114(hostname);
			}
		} else if (Static385.aClass2_Sub16_2.anInt2419 != -1) {
			Protocol.method1960(Static168.aClass145_268);
			Protocol.outboundBuffer.p2(Static385.aClass2_Sub16_2.anInt2419);
			Static385.aClass2_Sub16_2 = null;
			Static375.aLong222 = MonotonicClock.currentTimeMillis() + 30000L;
		}
		@Pc(112) int local112;
		@Pc(135) int local135;
		@Pc(153) int local153;
		@Pc(169) boolean local169;
		@Pc(219) int local219;
		@Pc(225) int local225;
		@Pc(236) int local236;
		if (Static370.aClass2_Sub24_1 != null || Static368.aLong217 < MonotonicClock.currentTimeMillis() - 2000L) {
			@Pc(109) boolean local109 = false;
			local112 = Protocol.outboundBuffer.pos;
			for (@Pc(117) Class2_Sub24 local117 = (Class2_Sub24) Static277.aClass135_31.head(); local117 != null && Protocol.outboundBuffer.pos - local112 < 240; local117 = (Class2_Sub24) Static277.aClass135_31.next()) {
				local117.unlink();
				local135 = local117.method5242();
				if (local135 < 0) {
					local135 = 0;
				} else if (local135 > 65534) {
					local135 = 65534;
				}
				local153 = local117.method5243();
				if (local153 < 0) {
					local153 = 0;
				} else if (local153 > 65534) {
					local153 = 65534;
				}
				local169 = false;
				if (local117.method5242() == -1 && local117.method5243() == -1) {
					local153 = -1;
					local169 = true;
					local135 = -1;
				}
				if (Static289.anInt5495 != local153 || local135 != Static117.anInt2376) {
					if (!local109) {
						Protocol.method1960(Static91.aClass145_69);
						Protocol.outboundBuffer.p1(0);
						local112 = Protocol.outboundBuffer.pos;
						local109 = true;
					}
					local219 = local153 - Static289.anInt5495;
					Static289.anInt5495 = local153;
					local225 = local135 - Static117.anInt2376;
					Static117.anInt2376 = local135;
					local236 = (int) ((local117.method5248() - Static368.aLong217) / 20L);
					if (local236 < 8 && local219 >= -32 && local219 <= 31 && local225 >= -32 && local225 <= 31) {
						local219 += 32;
						local225 += 32;
						Protocol.outboundBuffer.p2((local219 << 6) + (local236 << 12) + local225);
					} else if (local236 < 32 && local219 >= -128 && local219 <= 127 && local225 >= -128 && local225 <= 127) {
						local225 += 128;
						local219 += 128;
						Protocol.outboundBuffer.p1(local236 + 128);
						Protocol.outboundBuffer.p2((local219 << 8) + local225);
					} else if (local236 >= 32) {
						Protocol.outboundBuffer.p2(local236 + 57344);
						if (local169) {
							Protocol.outboundBuffer.p4(Integer.MIN_VALUE);
						} else {
							Protocol.outboundBuffer.p4(local153 | local135 << 16);
						}
					} else {
						Protocol.outboundBuffer.p1(local236 + 192);
						if (local169) {
							Protocol.outboundBuffer.p4(Integer.MIN_VALUE);
						} else {
							Protocol.outboundBuffer.p4(local135 << 16 | local153);
						}
					}
					Static368.aLong217 = local117.method5248();
				}
			}
			if (local109) {
				Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local112);
			}
		}
		@Pc(410) int local410;
		@Pc(463) int local463;
		if (Static370.aClass2_Sub24_1 != null) {
			@Pc(394) long local394 = (Static370.aClass2_Sub24_1.method5248() - Static271.aLong146) / 50L;
			if (local394 > 32767L) {
				local394 = 32767L;
			}
			Static271.aLong146 = Static370.aClass2_Sub24_1.method5248();
			local410 = Static370.aClass2_Sub24_1.method5242();
			if (local410 < 0) {
				local410 = 0;
			} else if (local410 > 65535) {
				local410 = 65535;
			}
			local135 = Static370.aClass2_Sub24_1.method5243();
			if (local135 < 0) {
				local135 = 0;
			} else if (local135 > 65535) {
				local135 = 65535;
			}
			@Pc(446) byte local446 = 0;
			if (Static370.aClass2_Sub24_1.method5247() == 2) {
				local446 = 1;
			}
			Protocol.method1960(Static363.aClass145_240);
			local463 = (int) local394;
			Protocol.outboundBuffer.p2(local446 << 15 | local463);
			Protocol.outboundBuffer.ip4_dup(local135 | local410 << 16);
		}
		@Pc(483) int local483;
		if (Static6.anInt159 > 0) {
			local483 = 0;
			for (local112 = 0; local112 < Static6.anInt159; local112++) {
				if (Static156.aClass37Array1[local112].method1459()) {
					local483++;
				}
			}
			if (local483 > 0) {
				Protocol.method1960(Static388.aClass145_266);
				if (local483 > 75) {
					local483 = 75;
				}
				Protocol.outboundBuffer.p1(local483 * 3);
				for (local410 = 0; local410 < Static6.anInt159; local410++) {
					@Pc(531) Class37 local531 = Static156.aClass37Array1[local410];
					if (local531.method1459()) {
						@Pc(544) long local544 = (local531.method1457() - Static352.aLong202) / 50L;
						Static352.aLong202 = local531.method1457();
						if (local544 > 65535L) {
							local544 = 65535L;
						}
						Protocol.outboundBuffer.p1(local531.method1461());
						Protocol.outboundBuffer.p2((int) local544);
					}
				}
			}
		}
		if (Static383.anInt7153 > 0) {
			Static383.anInt7153--;
		}
		if (Static100.aBoolean156 && Static383.anInt7153 <= 0) {
			Static100.aBoolean156 = false;
			Static383.anInt7153 = 20;
			Protocol.method1960(Static304.aClass145_200);
			Protocol.outboundBuffer.p2((int) Static277.aFloat67 >> 3);
			Protocol.outboundBuffer.ip2_dup((int) Static31.aFloat28 >> 3);
		}
		if (Static242.aBoolean306 && !Static343.aBoolean431) {
			Static343.aBoolean431 = true;
			Protocol.method1960(Static242.aClass145_159);
			Protocol.outboundBuffer.p1(1);
		}
		if (!Static242.aBoolean306 && Static343.aBoolean431) {
			Static343.aBoolean431 = false;
			Protocol.method1960(Static242.aClass145_159);
			Protocol.outboundBuffer.p1(0);
		}
		if (!Preferences.sentToServer) {
			Protocol.method1960(Static253.aClass145_166);
			Protocol.outboundBuffer.p1(0);
			local483 = Protocol.outboundBuffer.pos;
			@Pc(672) Buffer local672 = preferences.encode();
			Protocol.outboundBuffer.pdata(local672.data, local672.pos);
			Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local483);
			Preferences.sentToServer = true;
		}
		if (Scene.aClass67ArrayArrayArray3 != null) {
			if (Static314.anInt5911 == 2) {
				Static222.method3917();
			} else if (Static314.anInt5911 == 3) {
				Static199.method5249();
			}
		}
		if (Static140.aBoolean187) {
			Static140.aBoolean187 = false;
		} else {
			Static296.aFloat68 /= 2.0F;
		}
		if (Static369.aBoolean471) {
			Static369.aBoolean471 = false;
		} else {
			Static184.aFloat39 /= 2.0F;
		}
		Static183.method68();
		if (gameState != 30) {
			return;
		}
		Static56.method1611();
		Static308.method5274();
		Static111.method2274();
		Static216.method3777();
		Protocol.anInt4955++;
		if (Protocol.anInt4955 > 750) {
			Static211.method3725();
			return;
		}
		Static386.method6029();
		Static61.method1673();
		Static303.method5210();
		for (local483 = Static214.aClass226_1.method5783(true); local483 != -1; local483 = Static214.aClass226_1.method5783(false)) {
			Static75.method1835(local483);
			Static41.anIntArray85[Static12.anInt269++ & 0x1F] = local483;
		}
		@Pc(830) Class161 local830;
		for (@Pc(790) DelayedStateChange local790 = Static129.method2437(); local790 != null; local790 = Static129.method2437()) {
			local410 = local790.method2307();
			local135 = local790.method2309();
			if (local410 == 1) {
				Static75.anIntArray117[local135] = local790.anInt2289;
				Static273.aBoolean374 |= Static89.aBooleanArray18[local135];
				Static140.anIntArray167[Static217.anInt3818++ & 0x1F] = local135;
			} else if (local410 == 2) {
				Static75.aStringArray11[local135] = local790.aString21;
				Static349.anIntArray444[Static58.anInt1483++ & 0x1F] = local135;
			} else if (local410 == 3) {
				local830 = Static6.method140(local135);
				if (!local790.aString21.equals(local830.aString47)) {
					local830.aString47 = local790.aString21;
					Static200.method3645(local830);
				}
			} else if (local410 == 4) {
				local830 = Static6.method140(local135);
				local463 = local790.anInt2289;
				local219 = local790.anInt2290;
				local225 = local790.anInt2284;
				if (local830.anInt4288 != local463 || local219 != local830.anInt4313 || local830.anInt4236 != local225) {
					local830.anInt4313 = local219;
					local830.anInt4236 = local225;
					local830.anInt4288 = local463;
					Static200.method3645(local830);
				}
			} else if (local410 == 5) {
				local830 = Static6.method140(local135);
				if (local790.anInt2289 != local830.anInt4299 || local790.anInt2289 == -1) {
					local830.anInt4316 = 1;
					local830.anInt4247 = 0;
					local830.anInt4299 = local790.anInt2289;
					local830.anInt4283 = 0;
					Static200.method3645(local830);
				}
			} else if (local410 == 6) {
				local153 = local790.anInt2289;
				local463 = local153 >> 10 & 0x1F;
				local219 = local153 >> 5 & 0x1F;
				local225 = local153 & 0x1F;
				local236 = (local463 << 19) + ((local219 << 11) + (local225 << 3));
				@Pc(1214) Class161 local1214 = Static6.method140(local135);
				if (local1214.anInt4290 != local236) {
					local1214.anInt4290 = local236;
					Static200.method3645(local1214);
				}
			} else if (local410 == 7) {
				local830 = Static6.method140(local135);
				local169 = local790.anInt2289 == 1;
				if (local830.aBoolean284 != local169) {
					local830.aBoolean284 = local169;
					Static200.method3645(local830);
				}
			} else if (local410 == 8) {
				local830 = Static6.method140(local135);
				if (local790.anInt2289 != local830.anInt4320 || local830.anInt4274 != local790.anInt2290 || local790.anInt2284 != local830.anInt4255) {
					local830.anInt4255 = local790.anInt2284;
					local830.anInt4274 = local790.anInt2290;
					local830.anInt4320 = local790.anInt2289;
					if (local830.anInt4300 != -1) {
						if (local830.anInt4251 > 0) {
							local830.anInt4255 = local830.anInt4255 * 32 / local830.anInt4251;
						} else if (local830.anInt4294 > 0) {
							local830.anInt4255 = local830.anInt4255 * 32 / local830.anInt4294;
						}
					}
					Static200.method3645(local830);
				}
			} else if (local410 == 9) {
				local830 = Static6.method140(local135);
				if (local830.anInt4300 != local790.anInt2289 || local830.anInt4240 != local790.anInt2290) {
					local830.anInt4240 = local790.anInt2290;
					local830.anInt4300 = local790.anInt2289;
					Static200.method3645(local830);
				}
			} else if (local410 == 10) {
				local830 = Static6.method140(local135);
				if (local790.anInt2289 != local830.anInt4278 || local790.anInt2290 != local830.anInt4250 || local830.anInt4319 != local790.anInt2284) {
					local830.anInt4319 = local790.anInt2284;
					local830.anInt4278 = local790.anInt2289;
					local830.anInt4250 = local790.anInt2290;
					Static200.method3645(local830);
				}
			} else if (local410 == 11) {
				local830 = Static6.method140(local135);
				local830.aByte46 = 0;
				local830.aByte45 = 0;
				local830.anInt4254 = local830.anInt4249 = local790.anInt2290;
				local830.anInt4305 = local830.anInt4241 = local790.anInt2289;
				Static200.method3645(local830);
			} else if (local410 == 12) {
				local830 = Static6.method140(local135);
				local463 = local790.anInt2289;
				if (local830 != null && local830.anInt4272 == 0) {
					if (local463 > local830.anInt4266 - local830.anInt4261) {
						local463 = local830.anInt4266 - local830.anInt4261;
					}
					if (local463 < 0) {
						local463 = 0;
					}
					if (local463 != local830.anInt4259) {
						local830.anInt4259 = local463;
						Static200.method3645(local830);
					}
				}
			} else if (local410 == 14) {
				local830 = Static6.method140(local135);
				local830.anInt4295 = local790.anInt2289;
			} else if (local410 == 15) {
				Static312.anInt5844 = local790.anInt2290;
				Static370.aBoolean474 = true;
				Static358.anInt6550 = local790.anInt2289;
			} else if (local410 == 16) {
				local830 = Static6.method140(local135);
				local830.anInt4318 = local790.anInt2289;
			}
		}
		if (Static93.anInt1951 != 0) {
			Static313.anInt5878 += 20;
			if (Static313.anInt5878 >= 400) {
				Static93.anInt1951 = 0;
			}
		}
		Static165.anInt3148++;
		if (Static64.aClass161_2 != null) {
			Static112.anInt2293++;
			if (Static112.anInt2293 >= 15) {
				Static200.method3645(Static64.aClass161_2);
				Static64.aClass161_2 = null;
			}
		}
		Static227.aClass161_11 = null;
		Static182.aClass161_7 = null;
		Static278.aBoolean377 = false;
		Static301.aBoolean403 = false;
		Static374.method6274(-1, null, -1);
		Static65.method1735(-1, null, -1);
		Static309.method5278();
		Static88.transmitTimer++;
		if (Static332.aBoolean427) {
			Protocol.method1960(Static372.aClass145_252);
			Protocol.outboundBuffer.ip4_dup(Static283.anInt5351 << 28 | Static282.anInt5347 << 14 | Static4.anInt89);
			Static332.aBoolean427 = false;
		}
		while (true) {
			@Pc(1416) Class2_Sub13 local1416;
			@Pc(1421) Class161 local1421;
			do {
				local1416 = (Class2_Sub13) Static378.aClass135_43.method3549();
				if (local1416 == null) {
					while (true) {
						do {
							local1416 = (Class2_Sub13) Static207.aClass135_25.method3549();
							if (local1416 == null) {
								while (true) {
									do {
										local1416 = (Class2_Sub13) Static274.aClass135_30.method3549();
										if (local1416 == null) {
											if (Static227.aClass161_11 == null) {
												Static348.anInt6449 = 0;
											}
											if (Static375.aClass161_14 != null) {
												Static122.method2398();
											}
											if (LoginManager.staffModLevel > 0 && Static174.aClass123_2.method3343(82) && Static174.aClass123_2.method3343(81) && Static323.anInt6063 != 0) {
												local410 = Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 - Static323.anInt6063;
												if (local410 < 0) {
													local410 = 0;
												} else if (local410 > 3) {
													local410 = 3;
												}
												Static6.method141(local410, Static148.anInt2719 + Static17.aClass11_Sub5_Sub2_Sub1_3.movementQueueZ[0], Static17.aClass11_Sub5_Sub2_Sub1_3.movementQueueX[0] + Static164.anInt3140);
											}
											Static315.method5381();
											for (local410 = 0; local410 < 5; local410++) {
												@Pc(1612) int local1612 = Static116.anIntArray149[local410]++;
											}
											if (Static273.aBoolean374 && Static375.aLong221 < MonotonicClock.currentTimeMillis() - 60000L) {
												Static340.method5765();
											}
											Static2.anInt28++;
											if (Static2.anInt28 > 500) {
												Static2.anInt28 = 0;
												local135 = (int) (Math.random() * 8.0D);
												if ((local135 & 0x4) == 4) {
													Static53.anInt3966 += Static9.anInt213;
												}
												if ((local135 & 0x1) == 1) {
													Static24.anInt642 += Static146.anInt2705;
												}
												if ((local135 & 0x2) == 2) {
													Static14.anInt327 += Static389.anInt4897;
												}
											}
											if (Static24.anInt642 < -50) {
												Static146.anInt2705 = 2;
											}
											if (Static14.anInt327 < -55) {
												Static389.anInt4897 = 2;
											}
											if (Static24.anInt642 > 50) {
												Static146.anInt2705 = -2;
											}
											if (Static53.anInt3966 < -40) {
												Static9.anInt213 = 1;
											}
											if (Static14.anInt327 > 55) {
												Static389.anInt4897 = -2;
											}
											Static285.anInt5375++;
											if (Static53.anInt3966 > 40) {
												Static9.anInt213 = -1;
											}
											if (Static285.anInt5375 > 500) {
												Static285.anInt5375 = 0;
												local135 = (int) (Math.random() * 8.0D);
												if ((local135 & 0x1) == 1) {
													Static6.anInt158 += Static262.anInt6999;
												}
												if ((local135 & 0x2) == 2) {
													Static97.anInt2005 += Static37.anInt949;
												}
											}
											if (Static6.anInt158 < -60) {
												Static262.anInt6999 = 2;
											}
											if (Static6.anInt158 > 60) {
												Static262.anInt6999 = -2;
											}
											if (Static97.anInt2005 < -20) {
												Static37.anInt949 = 1;
											}
											Static367.anInt6876++;
											if (Static97.anInt2005 > 10) {
												Static37.anInt949 = -1;
											}
											if (Static367.anInt6876 > 50) {
												Protocol.method1960(Static326.aClass145_228);
											}
											if (Static1.aBoolean1) {
												Static128.method2432();
												Static1.aBoolean1 = false;
											}
											try {
												if (Protocol.socket != null && Protocol.outboundBuffer.pos > 0) {
													Static175.anInt3348 += Protocol.outboundBuffer.pos;
													Protocol.socket.write(Protocol.outboundBuffer.pos, Protocol.outboundBuffer.data);
													Static367.anInt6876 = 0;
													Protocol.outboundBuffer.pos = 0;
													return;
												}
												return;
											} catch (@Pc(1823) IOException local1823) {
												Static211.method3725();
												return;
											}
										}
										local1421 = local1416.aClass161_3;
										if (local1421.anInt4297 < 0) {
											break;
										}
										local830 = Static6.method140(local1421.anInt4275);
									} while (local830 == null || local830.aClass161Array2 == null || local830.aClass161Array2.length <= local1421.anInt4297 || local1421 != local830.aClass161Array2[local1421.anInt4297]);
									Static198.method3591(local1416);
								}
							}
							local1421 = local1416.aClass161_3;
							if (local1421.anInt4297 < 0) {
								break;
							}
							local830 = Static6.method140(local1421.anInt4275);
						} while (local830 == null || local830.aClass161Array2 == null || local830.aClass161Array2.length <= local1421.anInt4297 || local1421 != local830.aClass161Array2[local1421.anInt4297]);
						Static198.method3591(local1416);
					}
				}
				local1421 = local1416.aClass161_3;
				if (local1421.anInt4297 < 0) {
					break;
				}
				local830 = Static6.method140(local1421.anInt4275);
			} while (local830 == null || local830.aClass161Array2 == null || local830.aClass161Array2.length <= local1421.anInt4297 || local1421 != local830.aClass161Array2[local1421.anInt4297]);
			Static198.method3591(local1416);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZBIZ)Lclient!r;")
	public static Js5 createJs5(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(5) Cache local5 = null;
		if (Static110.aClass205_1 != null) {
			local5 = new Cache(arg1, Static110.aClass205_1, Static185.aClass205Array1[arg1], 1000000);
		}
		Static374.aClass25_Sub1Array2[arg1] = js5MasterIndex.getResourceProvider(arg1, Static18.aClass207_1, local5);
		if (arg0) {
			Static374.aClass25_Sub1Array2[arg1].method899();
		}
		return new Js5(Static374.aClass25_Sub1Array2[arg1], arg2, 1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void setJs5Response(@OriginalArg(0) int response) {
		js5NetQueue.response = response;
		Static211.js5SocketRequest = null;
		Static103.js5Socket = null;
		Static309.js5ConnectState = 0;
		js5NetQueue.errors++;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void mainLoop() {
		if (gameState == 1000) {
			return;
		}
		@Pc(18) long local18 = Static307.method5257() / 1000000L - Static154.aLong89;
		Static154.aLong89 = Static307.method5257() / 1000000L;
		@Pc(31) boolean local31 = Static196.method3310();
		if (local31 && Static393.aBoolean486 && musicChannel != null) {
			musicChannel.method6317();
		}
		if (gameState == 30 || gameState == 10) {
			if (Static338.aLong214 != 0L && Static338.aLong214 < MonotonicClock.currentTimeMillis()) {
				Static143.method2677(preferences.anInt4893, Static144.getWindowMode(), false, preferences.anInt4884);
			} else if (Static190.aClass19_8.method2859() && Static122.aBoolean176) {
				Static353.method5883();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static363.frame == null) {
			@Pc(84) Container local84;
			if (GameShell.frame == null) {
				local84 = GameShell.signlink.applet;
			} else {
				local84 = GameShell.frame;
			}
			local92 = local84.getSize().width;
			local96 = local84.getSize().height;
			if (local84 == GameShell.frame) {
				@Pc(102) Insets local102 = GameShell.frame.getInsets();
				local92 -= local102.right + local102.left;
				local96 -= local102.top + local102.bottom;
			}
			if (Static142.anInt2663 != local92 || local96 != Static178.anInt2319) {
				if (Static190.aClass19_8 == null || Static190.aClass19_8.method2840()) {
					Static352.method5877();
				} else {
					Static142.anInt2663 = local92;
					Static178.anInt2319 = local96;
				}
				Static338.aLong214 = MonotonicClock.currentTimeMillis() + 500L;
			}
		}
		if (Static363.frame != null && !Static242.aBoolean306 && (gameState == 30 || gameState == 10)) {
			Static143.method2677(-1, preferences.anInt4894, false, -1);
		}
		@Pc(169) boolean local169 = false;
		if (Static328.aBoolean412) {
			Static328.aBoolean412 = false;
			local169 = true;
		}
		if (local169) {
			Static372.method6260();
		}
		if (Static190.aClass19_8 != null && Static190.aClass19_8.method2812() || Static144.getWindowMode() != 1) {
			Static98.method2107();
		}
		if (gameState == 0) {
			Static172.method3290(Static291.aColorArray4[Static64.anInt1555], local169, mainLoadPercentage, mainLoadSecondaryText, Static286.aColorArray3[Static64.anInt1555], Static174.aColorArray2[Static64.anInt1555]);
		} else if (gameState == 5) {
			Static193.method3512(Static286.aColorArray3[Static64.anInt1555].getRGB(), Static190.aClass19_8, Static52.aClass130_1, Static190.aClass19_8.method2812() | local169, Static291.aColorArray4[Static64.anInt1555].getRGB(), Static174.aColorArray2[Static64.anInt1555].getRGB());
		} else if (gameState == 10) {
			Static337.method5709();
		} else if (gameState == 25 || gameState == 28) {
			if (Static246.anInt4505 == 1) {
				if (Static65.anInt1588 < Static144.anInt2694) {
					Static65.anInt1588 = Static144.anInt2694;
				}
				local92 = (Static65.anInt1588 - Static144.anInt2694) * 50 / Static65.anInt1588;
				Static351.method5857(Static276.aClass130_4, true, Static256.aClass79_102.method2267(language) + "<br>(" + local92 + "%)");
			} else if (Static246.anInt4505 == 2) {
				if (Static190.anInt3541 < Static305.anInt5742) {
					Static190.anInt3541 = Static305.anInt5742;
				}
				local92 = (Static190.anInt3541 - Static305.anInt5742) * 50 / Static190.anInt3541 + 50;
				Static351.method5857(Static276.aClass130_4, true, Static256.aClass79_102.method2267(language) + "<br>(" + local92 + "%)");
			} else {
				Static351.method5857(Static276.aClass130_4, true, Static256.aClass79_102.method2267(language));
			}
		} else if (gameState == 30) {
			Static133.method2503(local18);
		} else if (gameState == 40) {
			Static351.method5857(Static276.aClass130_4, true, Static357.aClass79_137.method2267(language) + "<br>" + Static84.aClass79_40.method2267(language));
		}
		if (Static154.rect_debug == 3) {
			for (local92 = 0; local92 < Static154.anInt2806; local92++) {
				@Pc(398) Rectangle local398 = IdkTypeList.aRectangleArray1[local92];
				if (Static20.aBooleanArray6[local92]) {
					Static190.aClass19_8.method2868(local398.height, local398.x, local398.y, -1996553985, local398.width);
				} else if (Static375.aBooleanArray64[local92]) {
					Static190.aClass19_8.method2868(local398.height, local398.x, local398.y, -1996554240, local398.width);
				}
			}
		}
		if (Static333.method6318()) {
			Static279.method4725(Static190.aClass19_8);
		}
		if ((gameState == 30 || gameState == 10) && Static154.rect_debug == 0 && Static144.getWindowMode() == 1 && !local169 && Signlink.javaVersion.equals("1.1")) {
			local92 = 0;
			for (local96 = 0; local96 < Static154.anInt2806; local96++) {
				if (Static375.aBooleanArray64[local96]) {
					Static375.aBooleanArray64[local96] = false;
					Static281.aRectangleArray2[local92++] = IdkTypeList.aRectangleArray1[local96];
				}
			}
			Static190.aClass19_8.method2842(Static281.aRectangleArray2, local92);
		} else if (gameState != 0) {
			Static190.aClass19_8.method2883();
			for (local92 = 0; local92 < Static154.anInt2806; local92++) {
				Static375.aBooleanArray64[local92] = false;
			}
		}
		if (preferences.anInt4881 == 0) {
			ThreadUtils.sleep(15L);
		} else if (preferences.anInt4881 == 1) {
			ThreadUtils.sleep(10L);
		} else if (preferences.anInt4881 == 2) {
			ThreadUtils.sleep(5L);
		} else if (preferences.anInt4881 == 3) {
			ThreadUtils.sleep(2L);
		}
		if (Static352.aBoolean446) {
			Static2.method29();
		}
		if (preferences.aBoolean362 && gameState == 10 && Static139.anInt2595 != -1) {
			preferences.aBoolean362 = false;
			preferences.method4497(GameShell.signlink);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1388()) {
			return;
		}
		worldListWorldId = Integer.parseInt(this.getParameter("worldid"));
		modeWhere = Static238.method4120(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static274.method4638(modeWhere) && MODE_WHERE_LIVE != modeWhere) {
			modeWhere = MODE_WHERE_LIVE;
		}
		modeWhat = Static132.method2484(Integer.parseInt(this.getParameter("modewhat")));
		if (MODE_ENV_WIP != modeWhat && MODE_ENV_RC != modeWhat && MODE_ENV_LIVE != modeWhat) {
			modeWhat = MODE_ENV_LIVE;
		}
		try {
			language = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			language = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static237.objectTag = true;
		} else {
			Static237.objectTag = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static276.javaScript = true;
		} else {
			Static276.javaScript = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static132.aBoolean180 = true;
		} else {
			Static132.aBoolean180 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			game = GAME_SD;
		} else {
			game = GAME_RS;
		}
		try {
			affiliate = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			affiliate = 0;
		}
		Static307.aString57 = this.getParameter("quiturl");
		settings = this.getParameter("settings");
		if (settings == null) {
			settings = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static320.anInt6007 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static320.anInt6007 = 0;
			}
		}
		Static64.anInt1555 = Integer.parseInt(this.getParameter("colourid"));
		if (Static64.anInt1555 < 0 || Static64.anInt1555 >= Static174.aColorArray2.length) {
			Static64.anInt1555 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static31.aBoolean68 = true;
			MouseRecorder.enabled = true;
		}
		instance = this;
		if (game == GAME_RS) {
			Static263.anInt4834 = 503;
			Static254.anInt4701 = 765;
		} else if (game == GAME_SD) {
			Static263.anInt4834 = 480;
			Static254.anInt4701 = 640;
		}
		this.method1394(Static254.anInt4701, modeWhat.method5282() + 32, Static263.anInt4834);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1384() {
		if (gameState == 1000) {
			return;
		}
		cycle++;
		if (cycle % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static283.gregorianDateSeed = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static61.aRandom1.setSeed((long) Static283.gregorianDateSeed);
		}
		if (cycle % 50 == 0) {
			Static207.anInt3746 = Static175.anInt3348;
			Static298.anInt2437 = Protocol.totalRead;
			Static175.anInt3348 = 0;
			Protocol.totalRead = 0;
		}
		this.js5NetworkLoop();
		if (js5MasterIndex != null) {
			js5MasterIndex.method3877();
		}
		Static388.method6438();
		Static37.method1135();
		Static174.aClass123_2.method3337();
		Static226.aClass119_1.method3307();
		if (Static337.aClass131_1 != null) {
			@Pc(81) int local81 = Static337.aClass131_1.getRotation();
			Static323.anInt6063 = local81;
		}
		if (Static190.aClass19_8 != null) {
			Static190.aClass19_8.method2848((int) MonotonicClock.currentTimeMillis());
		}
		Static56.method1614();
		Static6.anInt159 = 0;
		for (@Pc(103) Class37 local103 = Static174.aClass123_2.method3342(); local103 != null && Static6.anInt159 < 128; local103 = Static174.aClass123_2.method3342()) {
			if (local103.method1460() != 1) {
				@Pc(114) char local114 = local103.method1456();
				if (!Static355.method5934() || local114 != '`' && local114 != '??') {
					Static156.aClass37Array1[Static6.anInt159] = local103;
					Static6.anInt159++;
				} else if (Static333.method6318()) {
					Static321.method5478();
				} else {
					Static129.method2440();
				}
			}
		}
		Static370.aClass2_Sub24_1 = null;
		for (@Pc(163) Class2_Sub24 local163 = Static226.aClass119_1.method3308(); local163 != null; local163 = Static226.aClass119_1.method3308()) {
			@Pc(169) int local169 = local163.method5247();
			if (local169 == -1) {
				Static277.aClass135_31.addTail(local163);
			} else if (Static330.method5654(local169)) {
				Static370.aClass2_Sub24_1 = local163;
			}
		}
		if (Static333.method6318()) {
			Static105.method2209();
		}
		if (gameState == 0) {
			this.mainLoad();
			GameShell.resetTimer();
		} else if (gameState == 5) {
			this.mainLoad();
			GameShell.resetTimer();
		} else if (gameState == 25 || gameState == 28) {
			LoginManager.rebuildMap();
		}
		if (gameState == 10) {
			this.mainUpdate();
			CreateManager.loop();
			LoginManager.loopAuto();
			LoginManager.loop();
		} else if (gameState == 30) {
			method2549();
		} else if (gameState == 40) {
			LoginManager.loop();
			if (LoginManager.reply != -3 && LoginManager.reply != 2 && LoginManager.reply != 15) {
				LoginManager.logout();
			}
		}
		Static318.method5429(Static190.aClass19_8);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1389() {
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1402() {
		if (Static284.anInt5362 < js5NetQueue.errors) {
			Static311.anInt5811 = 5 * 50 * (js5NetQueue.errors - 1);
			if (port == alternatePort) {
				port = defaultPort;
			} else {
				port = alternatePort;
			}
			if (Static311.anInt5811 > 3000) {
				Static311.anInt5811 = 3000;
			}
			if (js5NetQueue.errors >= 2 && js5NetQueue.response == 6) {
				this.method1392("js5connect_outofdate");
				gameState = 1000;
				return;
			}
			if (js5NetQueue.errors >= 4 && js5NetQueue.response == -1) {
				this.method1392("js5crc");
				gameState = 1000;
				return;
			}
			if (js5NetQueue.errors >= 4 && (gameState == 0 || gameState == 5)) {
				if (js5NetQueue.response == 7 || js5NetQueue.response == 9) {
					this.method1392("js5connect_full");
				} else if (js5NetQueue.response > 0) {
					this.method1392("js5connect");
				} else {
					this.method1392("js5io");
				}
				gameState = 1000;
				return;
			}
		}
		Static284.anInt5362 = js5NetQueue.errors;
		if (Static311.anInt5811 > 0) {
			Static311.anInt5811--;
			return;
		}
		try {
			if (Static309.js5ConnectState == 0) {
				Static211.js5SocketRequest = GameShell.signlink.openSocket(hostname, port);
				Static309.js5ConnectState++;
			}
			if (Static309.js5ConnectState == 1) {
				if (Static211.js5SocketRequest.status == 2) {
					this.setJs5Response(1000);
					return;
				}
				if (Static211.js5SocketRequest.status == 1) {
					Static309.js5ConnectState++;
				}
			}
			if (Static309.js5ConnectState == 2) {
				Static103.js5Socket = new BufferedSocket((Socket) Static211.js5SocketRequest.result, GameShell.signlink);
				@Pc(186) Buffer local186 = new Buffer(5);
				local186.p1(Static43.JS5.opcode);
				local186.p4(578);
				Static103.js5Socket.write(5, local186.data);
				Static309.js5ConnectState++;
				Static371.aLong220 = MonotonicClock.currentTimeMillis();
			}
			if (Static309.js5ConnectState == 3) {
				if (gameState == 0 || gameState == 5 || Static103.js5Socket.available() > 0) {
					@Pc(245) int local245 = Static103.js5Socket.read();
					if (local245 != 0) {
						this.setJs5Response(local245);
						return;
					}
					Static309.js5ConnectState++;
				} else if (MonotonicClock.currentTimeMillis() - Static371.aLong220 > 30000L) {
					this.setJs5Response(1001);
					return;
				}
			}
			if (Static309.js5ConnectState == 4) {
				@Pc(278) boolean local278 = gameState == 5 || gameState == 10 || gameState == 28;
				js5NetQueue.method4639(Static103.js5Socket, !local278);
				Static211.js5SocketRequest = null;
				Static309.js5ConnectState = 0;
				Static103.js5Socket = null;
			}
		} catch (@Pc(295) IOException local295) {
			this.setJs5Response(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void mainUpdate() {
		Static165.anInt3148++;
		Static374.method6274(-1, null, -1);
		Static65.method1735(-1, null, -1);
		Static309.method5278();
		Static88.transmitTimer++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Npc local33 = NpcList.npcs[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.type.aByte16;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.getSize();
					@Pc(74) int local74;
					if ((local39 & 0x2) != 0 && local33.anInt4643 == 0 && Math.random() * 1000.0D < 10.0D) {
						local74 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(82) int local82 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local74 != 0 || local82 != 0) {
							@Pc(96) int local96 = local74 + local33.movementQueueX[0];
							if (local96 < 0) {
								local96 = 0;
							} else if (Static373.anInt7033 - local50 - 1 < local96) {
								local96 = Static373.anInt7033 - local50 - 1;
							}
							@Pc(128) int local128 = local33.movementQueueZ[0] + local82;
							if (local128 < 0) {
								local128 = 0;
							} else if (Static242.anInt4449 - local50 - 1 < local128) {
								local128 = Static242.anInt4449 - local50 - 1;
							}
							@Pc(179) int local179 = Static141.method2654(true, Static52.anIntArray99, local50, -1, 0, 0, Static171.aClass46Array1[local33.aByte78], local33.movementQueueX[0], local50, local96, Static59.anIntArray105, local50, local128, local33.movementQueueZ[0]);
							if (local179 > 0) {
								if (local179 > 9) {
									local179 = 9;
								}
								for (@Pc(190) int local190 = 0; local190 < local179; local190++) {
									local33.movementQueueX[local190] = Static52.anIntArray99[local179 - local190 - 1];
									local33.movementQueueZ[local190] = Static59.anIntArray105[local179 - local190 - 1];
									local33.aByteArray51[local190] = 1;
								}
								local33.anInt4643 = local179;
							}
						}
					}
					Static317.method5548(local33, true);
					local74 = Static71.method6019(local33);
					Static100.method2160(local74, Static16.anInt4756, Static170.anInt3229, local33);
					Static173.method3315(local33);
				}
			}
		}
		if (LoginManager.step == 0 && CreateManager.step == 0) {
			if (Static314.anInt5911 == 2) {
				Static222.method3917();
			} else {
				Static199.method5249();
			}
			if (Static136.anInt6778 >> 7 < 14 || Static136.anInt6778 >> 7 >= Static373.anInt7033 - 14 || Static211.anInt3777 >> 7 < 14 || Static211.anInt3777 >> 7 >= Static242.anInt4449 - 14) {
				Static262.method6254();
			}
		}
		while (true) {
			@Pc(298) Class2_Sub13 local298;
			@Pc(303) Class161 local303;
			@Pc(311) Class161 local311;
			do {
				local298 = (Class2_Sub13) Static378.aClass135_43.method3549();
				if (local298 == null) {
					while (true) {
						do {
							local298 = (Class2_Sub13) Static207.aClass135_25.method3549();
							if (local298 == null) {
								while (true) {
									do {
										local298 = (Class2_Sub13) Static274.aClass135_30.method3549();
										if (local298 == null) {
											if (Static375.aClass161_14 != null) {
												Static122.method2398();
											}
											if (cycle % 1500 == 0) {
												Static322.method5485();
											}
											WorldList.pingAll();
											if (Static273.aBoolean374 && Static375.aLong221 < MonotonicClock.currentTimeMillis() - 60000L) {
												Static340.method5765();
												return;
											}
											return;
										}
										local303 = local298.aClass161_3;
										if (local303.anInt4297 < 0) {
											break;
										}
										local311 = Static6.method140(local303.anInt4275);
									} while (local311 == null || local311.aClass161Array2 == null || local303.anInt4297 >= local311.aClass161Array2.length || local303 != local311.aClass161Array2[local303.anInt4297]);
									Static198.method3591(local298);
								}
							}
							local303 = local298.aClass161_3;
							if (local303.anInt4297 < 0) {
								break;
							}
							local311 = Static6.method140(local303.anInt4275);
						} while (local311 == null || local311.aClass161Array2 == null || local303.anInt4297 >= local311.aClass161Array2.length || local311.aClass161Array2[local303.anInt4297] != local303);
						Static198.method3591(local298);
					}
				}
				local303 = local298.aClass161_3;
				if (local303.anInt4297 < 0) {
					break;
				}
				local311 = Static6.method140(local303.anInt4275);
			} while (local311 == null || local311.aClass161Array2 == null || local303.anInt4297 >= local311.aClass161Array2.length || local311.aClass161Array2[local303.anInt4297] != local303);
			Static198.method3591(local298);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method1406(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Buffer local14 = new Buffer(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(18) int local18 = local14.g1();
					if (local18 == 0) {
						return;
					}
					if (local18 == 1) {
						@Pc(109) int[] local109 = Static209.anIntArray228 = new int[6];
						local109[0] = local14.g2();
						local109[1] = local14.g2();
						local109[2] = local14.g2();
						local109[3] = local14.g2();
						local109[4] = local14.g2();
						local109[5] = local14.g2();
					} else {
						@Pc(38) int local38;
						@Pc(33) int local33;
						if (local18 == 4) {
							local33 = local14.g1();
							Static117.anIntArray150 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static117.anIntArray150[local38] = local14.g2();
								if (Static117.anIntArray150[local38] == 65535) {
									Static117.anIntArray150[local38] = -1;
								}
							}
						} else if (local18 == 5) {
							local33 = local14.g1();
							Static324.anIntArray412 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static324.anIntArray412[local38] = local14.g2();
								if (Static324.anIntArray412[local38] == 65535) {
									Static324.anIntArray412[local38] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1387() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static352.method5877();
		js5CacheQueue = new Js5CacheQueue(GameShell.signlink);
		js5NetQueue = new Js5NetQueue();
		if (modeWhere != MODE_WHERE_LIVE) {
			Static26.aByteArrayArray3 = new byte[50][];
		}
		preferences = new Class177_Sub1(GameShell.signlink);
		if (modeWhere == MODE_WHERE_LIVE) {
			worldListHostname = this.getCodeBase().getHost();
			worldListDefaultPort = 43594;
			worldListAlternatePort = 443;
		} else if (Static274.method4638(modeWhere)) {
			worldListHostname = this.getCodeBase().getHost();
			worldListDefaultPort = worldListWorldId + 40000;
			worldListAlternatePort = worldListWorldId + 50000;
		} else if (MODE_WHERE_LOCAL == modeWhere) {
			worldListDefaultPort = worldListWorldId + 40000;
			worldListAlternatePort = worldListWorldId + 50000;
			worldListHostname = "127.0.0.1";
		}
		alternatePort = worldListDefaultPort;
		hostname = worldListHostname;
		worldListPort = worldListDefaultPort;
		defaultPort = worldListAlternatePort;
		Static257.aShortArray79 = Static223.aShortArray78 = Static258.aShortArray95 = Static147.aShortArray54 = new short[256];
		port = worldListPort;
		if (Static215.anInt3795 == 3) {
			worldId = worldListWorldId;
		}
		if (game == GAME_SD) {
			Static186.aShortArrayArray6 = Static30.aShortArrayArray3;
			Static28.anInt686 = 16777215;
			Static148.aBoolean192 = true;
			Static43.aShortArray20 = Static113.aShortArray46;
			Static279.anInt5161 = 0;
			Static10.aShortArray1 = Static25.aShortArray4;
			PlayerAppearance.destinationBodyColors = Static201.aShortArrayArray5;
		} else {
			Static43.aShortArray20 = Static131.aShortArray65;
			Static10.aShortArray1 = Static78.aShortArray123;
			PlayerAppearance.destinationBodyColors = Static25.aShortArrayArray2;
			Static186.aShortArrayArray6 = Static386.aShortArrayArray9;
		}
		Static174.aClass123_2 = Static18.method556(GameShell.canvas);
		Static226.aClass119_1 = Static31.method948(GameShell.canvas);
		Static337.aClass131_1 = Static63.method1702();
		if (Static337.aClass131_1 != null) {
			Static337.aClass131_1.start(GameShell.canvas);
		}
		Static367.anInt6878 = Static215.anInt3795;
		try {
			if (GameShell.signlink.cacheData != null) {
				Static110.aClass205_1 = new Class205(GameShell.signlink.cacheData, 5200, 0);
				for (@Pc(171) int local171 = 0; local171 < 29; local171++) {
					Static185.aClass205Array1[local171] = new Class205(GameShell.signlink.cacheIndexes[local171], 6000, 0);
				}
				Static150.aClass205_2 = new Class205(GameShell.signlink.cacheMasterIndex, 6000, 0);
				Static18.aClass207_1 = new Cache(255, Static110.aClass205_1, Static150.aClass205_2, 500000);
				Static317.aClass205_6 = new Class205(GameShell.signlink.uid, 24, 0);
				GameShell.signlink.uid = null;
				GameShell.signlink.cacheMasterIndex = null;
				GameShell.signlink.cacheIndexes = null;
				GameShell.signlink.cacheData = null;
			}
		} catch (@Pc(227) IOException local227) {
			Static150.aClass205_2 = null;
			Static110.aClass205_1 = null;
			Static317.aClass205_6 = null;
			Static18.aClass207_1 = null;
		}
		if (MODE_WHERE_LIVE != modeWhere) {
			Static356.displayfps = true;
		}
		Static290.aString56 = (GAME_RS == game ? Static221.aClass79_99 : Static221.aClass79_98).method2267(language);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void mainLoad() {
		@Pc(6) int local6;
		if (!preferences.aBoolean362) {
			for (local6 = 0; local6 < Static6.anInt159; local6++) {
				if (Static156.aClass37Array1[local6].method1456() == 's' || Static156.aClass37Array1[local6].method1456() == 'S') {
					preferences.aBoolean362 = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (mainLoadState == 0) {
			@Pc(45) Runtime local45 = Runtime.getRuntime();
			local55 = (int) ((local45.totalMemory() - local45.freeMemory()) / 1024L);
			@Pc(60) long local60 = MonotonicClock.currentTimeMillis();
			if (Static5.aLong11 == 0L) {
				Static5.aLong11 = local60;
			}
			if (local55 > 16384 && local60 - Static5.aLong11 < 5000L) {
				if (local60 - Static29.aLong22 > 1000L) {
					System.gc();
					Static29.aLong22 = local60;
				}
				mainLoadSecondaryText = Static311.aClass79_122.method2267(language);
				mainLoadPercentage = 5;
			} else {
				mainLoadSecondaryText = Static146.aClass79_63.method2267(language);
				mainLoadPercentage = 5;
				mainLoadState = 10;
			}
		} else if (mainLoadState == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static171.aClass46Array1[local6] = Static24.method853(Static242.anInt4449, Static373.anInt7033);
			}
			mainLoadSecondaryText = Static109.aClass79_46.method2267(language);
			mainLoadState = 20;
			mainLoadPercentage = 10;
		} else if (mainLoadState == 20) {
			if (js5MasterIndex == null) {
				js5MasterIndex = new Js5MasterIndex(js5NetQueue, js5CacheQueue);
			}
			if (js5MasterIndex.isReady()) {
				jsArchive0 = createJs5(true, 0, false);
				jsArchive1 = createJs5(true, 1, false);
				jsArchive2 = createJs5(true, 2, false);
				jsArchive3 = createJs5(true, 3, false);
				jsArchive4 = createJs5(true, 4, false);
				jsArchive5 = createJs5(true, 5, true);
				jsArchive6 = createJs5(false, 6, true);
				jsArchive7 = createJs5(true, 7, false);
				jsArchive8 = createJs5(true, 8, false);
				jsArchive9 = createJs5(true, 9, false);
				jsArchive10 = createJs5(true, 10, false);
				jsArchive11 = createJs5(true, 11, false);
				jsArchive12 = createJs5(true, 12, false);
				jsArchive13 = createJs5(true, 13, false);
				jsArchive14 = createJs5(false, 14, false);
				jsArchive15 = createJs5(true, 15, false);
				jsArchive16 = createJs5(true, 16, false);
				jsArchive17 = createJs5(true, 17, false);
				jsArchive18 = createJs5(true, 18, false);
				jsArchive19 = createJs5(true, 19, false);
				jsArchive20 = createJs5(true, 20, false);
				jsArchive21 = createJs5(true, 21, false);
				jsArchive22 = createJs5(true, 22, false);
				jsArchive23 = createJs5(true, 23, true);
				jsArchive24 = createJs5(true, 24, false);
				jsArchive25 = createJs5(true, 25, false);
				jsArchive26 = createJs5(true, 26, true);
				jsArchive27 = createJs5(true, 27, false);
				jsArchive28 = createJs5(true, 28, true);
				mainLoadSecondaryText = Static118.aClass79_76.method2267(language);
				mainLoadState = 30;
				mainLoadPercentage = 15;
			} else {
				mainLoadSecondaryText = Static193.aClass79_78.method2267(language);
				mainLoadPercentage = 12;
			}
		} else if (mainLoadState == 30) {
			local6 = 0;
			for (local55 = 0; local55 < 29; local55++) {
				local6 += Static374.aClass25_Sub1Array2[local55].method896() * Static278.anIntArray362[local55] / 100;
			}
			if (local6 == 100) {
				mainLoadSecondaryText = Static226.aClass79_89.method2267(language);
				mainLoadPercentage = 20;
				Sprites.init(jsArchive8);
				Static44.method1359(jsArchive8);
				mainLoadState = 40;
			} else {
				if (local6 != 0) {
					mainLoadSecondaryText = Static117.aClass79_47.method2267(language) + local6 + "%";
				}
				mainLoadPercentage = 20;
			}
		} else if (mainLoadState == 40) {
			if (jsArchive28.fetchAll()) {
				this.method1406(jsArchive28.method5082(1));
				mainLoadSecondaryText = Static117.aClass79_48.method2267(language);
				mainLoadPercentage = 25;
				mainLoadState = 50;
			} else {
				mainLoadSecondaryText = Static26.aClass79_18.method2267(language) + jsArchive28.getPercentageComplete() + "%";
				mainLoadPercentage = 25;
			}
		} else if (mainLoadState == 50) {
			AudioChannel.init(preferences.stereo);
			musicStream = new MidiPcmStream();
			musicStream.init();
			musicChannel = AudioChannel.create(0, GameShell.signlink, GameShell.canvas, 22050);
			musicChannel.setStream(musicStream);
			MidiPlayer.init(jsArchive14, jsArchive15, jsArchive4, musicStream);
			soundChannel = AudioChannel.create(1, GameShell.signlink, GameShell.canvas, 2048);
			soundStream = new MixerPcmStream();
			soundChannel.setStream(soundStream);
			resampler = new PcmResampler(22050, AudioChannel.sampleRate);
			MusicPlayer.titleSong = jsArchive6.getGroupId("scape main");
			mainLoadSecondaryText = Static369.aClass79_144.method2267(language);
			mainLoadPercentage = 30;
			mainLoadState = 60;
		} else if (mainLoadState == 60) {
			local6 = Static64.method1707(jsArchive13, jsArchive8);
			local55 = Static218.method1090();
			if (local55 > local6) {
				mainLoadSecondaryText = Static276.aClass79_109.method2267(language) + local6 * 100 / local55 + "%";
				mainLoadPercentage = 35;
			} else {
				mainLoadSecondaryText = Static121.aClass79_53.method2267(language);
				mainLoadState = 70;
				mainLoadPercentage = 35;
			}
		} else if (mainLoadState == 70) {
			local6 = Static333.method6333(jsArchive8);
			local55 = Static32.method991();
			if (local6 < local55) {
				mainLoadSecondaryText = Static279.aClass79_111.method2267(language) + local6 * 100 / local55 + "%";
				mainLoadPercentage = 40;
			} else {
				mainLoadSecondaryText = Static201.aClass79_80.method2267(language);
				mainLoadState = 80;
				mainLoadPercentage = 40;
			}
		} else if (mainLoadState == 80) {
			if (jsArchive26.fetchAll()) {
				Static128.anInterface2_4 = new Js5GlTextureProvider(jsArchive26, jsArchive9, jsArchive8);
				mainLoadSecondaryText = Static312.aClass79_123.method2267(language);
				mainLoadPercentage = 45;
				mainLoadState = 90;
			} else {
				mainLoadSecondaryText = Static118.aClass79_77.method2267(language) + jsArchive26.getPercentageComplete() + "%";
				mainLoadPercentage = 45;
			}
		} else if (mainLoadState == 90) {
			mainLoadSecondaryText = Static252.aClass79_100.method2267(language);
			mainLoadState = 95;
			mainLoadPercentage = 50;
		} else if (mainLoadState == 95) {
			if (preferences.aBoolean362) {
				preferences.anInt4894 = 1;
				preferences.anInt4878 = 0;
				preferences.anInt4885 = 0;
				preferences.anInt4883 = 0;
				preferences.anInt4891 = 0;
			}
			preferences.aBoolean362 = true;
			preferences.method4497(GameShell.signlink);
			Static252.method4365(false, preferences.anInt4878);
			mainLoadSecondaryText = Static357.aClass79_138.method2267(language);
			mainLoadPercentage = 55;
			mainLoadState = 100;
		} else if (mainLoadState == 100) {
			Static236.method4102(jsArchive8, jsArchive13, Static190.aClass19_8);
			mainLoadSecondaryText = Static179.aClass79_73.method2267(language);
			mainLoadPercentage = 60;
			Static336.method5705(5);
			mainLoadState = 110;
		} else if (mainLoadState == 110) {
			jsArchive2.fetchAll();
			local6 = jsArchive2.getPercentageComplete();
			jsArchive16.fetchAll();
			local6 += jsArchive16.getPercentageComplete();
			jsArchive17.fetchAll();
			local6 += jsArchive17.getPercentageComplete();
			jsArchive18.fetchAll();
			local6 += jsArchive18.getPercentageComplete();
			jsArchive19.fetchAll();
			local6 += jsArchive19.getPercentageComplete();
			jsArchive20.fetchAll();
			local6 += jsArchive20.getPercentageComplete();
			jsArchive21.fetchAll();
			local6 += jsArchive21.getPercentageComplete();
			jsArchive22.fetchAll();
			local6 += jsArchive22.getPercentageComplete();
			jsArchive24.fetchAll();
			local6 += jsArchive24.getPercentageComplete();
			jsArchive25.fetchAll();
			local6 += jsArchive25.getPercentageComplete();
			jsArchive27.fetchAll();
			local6 += jsArchive27.getPercentageComplete();
			if (local6 < 1100) {
				mainLoadSecondaryText = Static36.aClass79_22.method2267(language) + local6 / 11 + "%";
				mainLoadPercentage = 65;
			} else {
				ParamTypes = new ParamTypeList(game, language, jsArchive2);
				BasTypes = new BasTypeList(game, language, jsArchive2);
				CursorTypes = new CursorTypeList(game, language, jsArchive2, jsArchive8);
				EnumTypes = new EnumTypeList(game, language, jsArchive17);
				FloTypes = new FloTypeList(game, language, jsArchive2);
				FluTypes = new FluTypeList(game, language, jsArchive2);
				IdkTypes = new IdkTypeList(game, language, jsArchive2, jsArchive7);
				InvTypes = new InvTypeList(game, language, jsArchive2);
				LightTypes = new LightTypeList(game, language, jsArchive2);
				LocTypes = new LocTypeList(game, language, true, jsArchive16, jsArchive7);
				MelTypes = new MelTypeList(game, language, jsArchive2, jsArchive8);
				MsiType = new MsiTypeList(game, language, jsArchive2, jsArchive8);
				NpcTypes = new NpcTypeList(game, language, true, jsArchive18, jsArchive7);
				ObjTypes = new ObjTypeList(game, language, true, ParamTypes, jsArchive19, jsArchive7);
				aClass233_1 = new Class233(game, language, jsArchive2);
				SeqTypes = new SeqTypeList(game, language, jsArchive20, jsArchive0, jsArchive1);
				SkyboxTypes = new SkyboxTypeList(game, language, jsArchive2);
				SkyboxSphereTypes = new SkyboxSphereTypeList(game, language, jsArchive2);
				SpotAnimTypes = new SpotAnimTypeList(game, language, jsArchive21, jsArchive7);
				StructTypes = new StructTypeList(game, language, jsArchive2);
				aClass193_2 = new Class193(game, language, jsArchive2);
				aClass45_1 = new Class45(game, language, jsArchive2);
				VarbitTypes = new VarbitTypeList(game, language, jsArchive22);
				VarpTypes = new VarpTypeList(game, language, jsArchive2);
				InterfaceList.init(jsArchive13, jsArchive7, jsArchive3, jsArchive8);
				QuickChatPhraseTypeList.init(new Js5QuickChatCommandDecoder(), jsArchive24, jsArchive25);
				QuickChatCatTypeList.init(jsArchive24, jsArchive25);
				mainLoadSecondaryText = Static336.aClass79_130.method2267(language);
				mainLoadPercentage = 65;
				Equipment.init();
				LocTypes.method5160(!preferences.method4495(Static77.anInt1762));
				Static214.aClass226_1 = new Class226();
				Static174.method1506();
				Static382.method6362(jsArchive27);
				Static292.method5037(Static128.anInterface2_4, jsArchive7);
				mainLoadState = 120;
			}
		} else if (mainLoadState == 120) {
			local6 = Static134.method2509(jsArchive8);
			local55 = Static254.method4375();
			if (local55 > local6) {
				mainLoadSecondaryText = Static117.aClass79_49.method2267(language) + local6 * 100 / local55 + "%";
				mainLoadPercentage = 70;
			} else {
				Static44.method1358(Static190.aClass19_8, jsArchive8);
				Static144.method2691(Static124.aClass13Array27);
				mainLoadSecondaryText = Static235.aClass79_72.method2267(language);
				mainLoadState = 130;
				mainLoadPercentage = 70;
			}
		} else if (mainLoadState == 130) {
			if (jsArchive10.isFileReady("huffman", "")) {
				@Pc(1242) HuffmanCodec local1242 = new HuffmanCodec(jsArchive10.fetchFile("huffman", ""));
				WordPack.init(local1242);
				mainLoadSecondaryText = Static134.aClass79_59.method2267(language);
				mainLoadState = 140;
				mainLoadPercentage = 75;
			} else {
				mainLoadSecondaryText = Static307.aClass79_121.method2267(language) + "0%";
				mainLoadPercentage = 75;
			}
		} else if (mainLoadState == 140) {
			if (jsArchive3.fetchAll()) {
				mainLoadSecondaryText = Static78.aClass79_128.method2267(language);
				mainLoadState = 150;
				mainLoadPercentage = 80;
			} else {
				mainLoadSecondaryText = Static227.aClass79_90.method2267(language) + jsArchive3.getPercentageComplete() + "%";
				mainLoadPercentage = 80;
			}
		} else if (mainLoadState == 150) {
			if (jsArchive12.fetchAll()) {
				mainLoadSecondaryText = Static347.aClass79_134.method2267(language);
				mainLoadPercentage = 82;
				mainLoadState = 160;
			} else {
				mainLoadSecondaryText = Static67.aClass79_35.method2267(language) + jsArchive12.getPercentageComplete() + "%";
				mainLoadPercentage = 82;
			}
		} else if (mainLoadState == 160) {
			if (jsArchive13.fetchAll()) {
				mainLoadSecondaryText = Static325.aClass79_126.method2267(language);
				mainLoadPercentage = 85;
				mainLoadState = 170;
			} else {
				mainLoadSecondaryText = Static325.aClass79_126.method2267(language) + jsArchive13.getPercentageComplete() + "%";
				mainLoadPercentage = 85;
			}
		} else if (mainLoadState == 170) {
			if (jsArchive23.isGroupReady("details")) {
				Static344.method5512(jsArchive23, FloTypes, FluTypes, LocTypes, MelTypes, MsiType, Static214.aClass226_1);
				mainLoadSecondaryText = Static300.aClass79_118.method2267(language);
				mainLoadState = 180;
				mainLoadPercentage = 89;
			} else {
				mainLoadSecondaryText = Static163.aClass79_68.method2267(language) + jsArchive23.getPercentageComplete("details") + "%";
				mainLoadPercentage = 87;
			}
		} else if (mainLoadState == 180) {
			local6 = WorldList.fetch();
			if (local6 == -1) {
				mainLoadSecondaryText = Static294.aClass79_117.method2267(language);
				mainLoadPercentage = 90;
			} else if (local6 == 7 || local6 == 9) {
				this.method1392("worldlistfull");
				Static336.method5705(1000);
			} else if (WorldList.loaded) {
				mainLoadSecondaryText = Static340.aClass79_133.method2267(language);
				mainLoadPercentage = 90;
				mainLoadState = 190;
			} else {
				this.method1392("worldlistio_" + local6);
				Static336.method5705(1000);
			}
		} else if (mainLoadState == 190) {
			Static89.aBooleanArray18 = new boolean[aClass45_1.anInt1466];
			Static75.aStringArray11 = new String[aClass193_2.anInt5494];
			Static75.anIntArray117 = new int[aClass45_1.anInt1466];
			for (local6 = 0; local6 < aClass45_1.anInt1466; local6++) {
				if (aClass45_1.method1623(local6).anInt1258 == 0) {
					Static89.aBooleanArray18[local6] = true;
					Static112.anInt2294++;
				}
				Static75.anIntArray117[local6] = -1;
			}
			Static318.method5425();
			Static391.anInt7216 = jsArchive3.getGroupId("loginscreen");
			jsArchive5.discardNames(false);
			jsArchive6.discardNames(true);
			jsArchive8.discardNames(true);
			jsArchive13.discardNames(true);
			jsArchive10.discardNames(true);
			jsArchive3.discardNames(true);
			Static352.aBoolean446 = true;
			jsArchive2.discardUnpacked = 2;
			jsArchive17.discardUnpacked = 2;
			jsArchive16.discardUnpacked = 2;
			jsArchive18.discardUnpacked = 2;
			jsArchive19.discardUnpacked = 2;
			jsArchive20.discardUnpacked = 2;
			jsArchive21.discardUnpacked = 2;
			Static143.method2677(-1, preferences.anInt4894, false, -1);
			mainLoadSecondaryText = Static70.aClass79_36.method2267(language);
			mainLoadState = 200;
			mainLoadPercentage = 95;
		} else if (mainLoadState == 200) {
			Static50.method1525(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void js5NetworkLoop() {
		@Pc(21) boolean local21 = js5NetQueue.loop();
		if (!local21) {
			this.method1402();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1386() {
		if (Static273.aBoolean374) {
			Static340.method5765();
		}
		if (Static190.aClass19_8 != null) {
			Static190.aClass19_8.method2825();
		}
		if (Static363.frame != null) {
			Static17.method4215(Static363.frame, GameShell.signlink);
			Static363.frame = null;
		}
		if (Protocol.socket != null) {
			Protocol.socket.close();
			Protocol.socket = null;
		}
		if (Static337.aClass131_1 != null) {
			Static337.aClass131_1.stop(GameShell.canvas);
		}
		Static337.aClass131_1 = null;
		if (musicChannel != null) {
			musicChannel.method6326();
		}
		if (soundChannel != null) {
			soundChannel.method6326();
		}
		js5NetQueue.quit();
		js5CacheQueue.method5228();
		if (Static4.aClass162_1 != null) {
			Static4.aClass162_1.method4115();
			Static4.aClass162_1 = null;
		}
	}
}
