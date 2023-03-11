import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.Socket;
import java.net.URL;

public class WorldList {

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	public static boolean loaded = false;
	@OriginalMember(owner = "client!r", name = "Q", descriptor = "[Lclient!ac;")
	public static World[] worlds;
	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	public static int minId;
	@OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
	public static int maxId;
	@OriginalMember(owner = "client!vf", name = "Y", descriptor = "[Lclient!kh;")
	public static Country[] countries;
	@OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
	public static int size;
	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	public static int checksum;
	@OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
	public static int step = 0;
	@OriginalMember(owner = "client!ud", name = "b", descriptor = "J")
	public static long closeTime = 0L;
	@OriginalMember(owner = "client!qi", name = "e", descriptor = "J")
	public static long openTime = 0L;
	@OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
	public static int bufferLen = 0;
	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[B")
	public static byte[] buffer;
	@OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
	public static int bufferOff = 0;
	@OriginalMember(owner = "client!rh", name = "p", descriptor = "[Lclient!ac;")
	public static World[] sorted = new World[0];
	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public static int errors = 0;
	@OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
	public static int iterator = 999999;
	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public static int pingIterator = 0;
	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!ha;")
	public static Class2_Sub16 pinger = null;
	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean refreshing = false;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Lclient!ac;")
	public static World get(@OriginalArg(0) int id) {
		return loaded && id >= minId && maxId >= id ? worlds[id - minId] : null;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)Z")
	public static boolean switchWorld(@OriginalArg(0) int id) {
		@Pc(7) World world = get(id);
		if (world == null) {
			return false;
		}

		if (Static215.anInt3795 == 3) {
			@Pc(39) String port = "";
			if (client.modeWhere != client.MODE_WHERE_LIVE) {
				port = ":" + (world.id + 7000);
			}
			@Pc(55) String settings = "";
			if (Static74.settings != null) {
				settings = "/p=" + Static74.settings;
			}
			@Pc(109) String local109 = "http://" + world.hostname + port + "/l=" + client.language + "/a=" + client.affiliate + settings + "/j" + (Static276.javaScript ? "1" : "0") + ",o" + (Static237.objectTag ? "1" : "0") + ",a2";
			try {
				client.instance.getAppletContext().showDocument(new URL(local109), "_self");
				return true;
			} catch (@Pc(119) Exception local119) {
				return false;
			}
		}

		client.worldId = world.id;
		client.hostname = world.hostname;
		if (client.modeWhere != client.MODE_WHERE_LIVE) {
			client.alternatePort = client.worldId + 40000;
			client.defaultPort = client.worldId + 50000;
			client.port = client.alternatePort;
		}

		return true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[B)Z")
	public static boolean decode(@OriginalArg(1) byte[] src) {
		@Pc(8) Buffer buffer = new Buffer(src);
		@Pc(12) int version = buffer.g1();
		if (version != 1) {
			return false;
		}
		@Pc(34) boolean worldsUpdated = buffer.g1() == 1;
		if (worldsUpdated) {
			decodeWorlds(buffer);
		}
		decodePlayers(buffer);
		return true;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!bt;I)V")
	public static void decodeWorlds(@OriginalArg(0) Buffer buffer) {
		@Pc(9) int countryCount = buffer.gsmart();
		countries = new Country[countryCount];
		for (@Pc(22) int i = 0; i < countryCount; i++) {
			countries[i] = new Country();
			countries[i].flag = buffer.gsmart();
			countries[i].name = buffer.gjstr2();
		}
		minId = buffer.gsmart();
		maxId = buffer.gsmart();
		size = buffer.gsmart();
		worlds = new World[maxId + 1 - minId];
		for (@Pc(70) int i = 0; i < size; i++) {
			@Pc(76) int offset = buffer.gsmart();
			@Pc(84) World world = worlds[offset] = new World();
			world.country = buffer.g1();
			world.flags = buffer.g4();
			world.id = offset + minId;
			world.activity = buffer.gjstr2();
			world.hostname = buffer.gjstr2();
		}
		checksum = buffer.g4();
		loaded = true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!bt;)V")
	public static void decodePlayers(@OriginalArg(1) Buffer buffer) {
		for (@Pc(16) int i = 0; i < size; i++) {
			@Pc(22) int offset = buffer.gsmart();
			@Pc(26) int players = buffer.g2();
			if (players == 65535) {
				players = -1;
			}
			if (worlds[offset] != null) {
				worlds[offset].players = players;
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I")
	public static int fetch() {
		try {
			if (step == 0) {
				if (closeTime > MonotonicClock.currentTimeMillis() - 5000L) {
					return 0;
				}
				Protocol.socketRequest = GameShell.signlink.openSocket(client.worldListHostname, client.worldListPort);
				openTime = MonotonicClock.currentTimeMillis();
				step = 1;
			}
			if (MonotonicClock.currentTimeMillis() > openTime + 30000L) {
				return close(1000);
			}
			if (step == 1) {
				if (Protocol.socketRequest.status == 2) {
					return close(1001);
				}
				if (Protocol.socketRequest.status != 1) {
					return -1;
				}
				Protocol.socket = new Class111((Socket) Protocol.socketRequest.result, GameShell.signlink);
				Protocol.socketRequest = null;
				@Pc(76) int checksum = 0;
				if (loaded) {
					checksum = WorldList.checksum;
				}
				Protocol.outboundBuffer.pos = 0;
				Protocol.outboundBuffer.p1(Static43.aClass242_9.anInt7038);
				Protocol.outboundBuffer.p4(checksum);
				Protocol.socket.write(Protocol.outboundBuffer.pos, Protocol.outboundBuffer.data);
				if (client.musicChannel != null) {
					client.musicChannel.method6325();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method6325();
				}
				int reply = Protocol.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method6325();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method6325();
				}
				if (reply != 0) {
					return close(reply);
				}
				step = 2;
			}
			if (step == 2) {
				if (Protocol.socket.available() < 2) {
					return -1;
				}
				bufferLen = Protocol.socket.read();
				bufferLen <<= 0x8;
				bufferLen += Protocol.socket.read();
				buffer = new byte[bufferLen];
				bufferOff = 0;
				step = 3;
			}
			if (step != 3) {
				return -1;
			}
			int n = Protocol.socket.available();
			if (n < 1) {
				return -1;
			}
			if (n > bufferLen - bufferOff) {
				n = bufferLen - bufferOff;
			}
			Protocol.socket.read(buffer, n, bufferOff);
			bufferOff += n;
			if (bufferLen > bufferOff) {
				return -1;
			} else if (decode(buffer)) {
				sorted = new World[size];
				@Pc(234) int i = 0;
				for (@Pc(236) int id = minId; id <= maxId; id++) {
					@Pc(242) World world = get(id);
					if (world != null) {
						sorted[i++] = world;
					}
				}
				pinger = null;
				pingIterator = 0;
				Protocol.socket.close();
				step = 0;
				errors = 0;
				buffer = null;
				Protocol.socket = null;
				closeTime = MonotonicClock.currentTimeMillis();
				return 0;
			} else {
				return close(1002);
			}
		} catch (@Pc(274) IOException ignored) {
			return close(1003);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I")
	public static int close(@OriginalArg(1) int reply) {
		if (Protocol.socket != null) {
			Protocol.socket.close();
			Protocol.socket = null;
		}
		errors++;
		if (errors > 4) {
			errors = 0;
			step = 0;
			return reply;
		}
		step = 0;
		if (client.worldListPort == client.worldListDefaultPort) {
			client.worldListPort = client.worldListAlternatePort;
		} else {
			client.worldListPort = client.worldListDefaultPort;
		}
		return -1;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
	public static void pingAll() {
		if (!refreshing) {
			return;
		}
		while (true) {
			while (pingIterator < sorted.length) {
				@Pc(26) World world = sorted[pingIterator];
				if (world != null && world.ping == -1) {
					if (pinger == null) {
						pinger = Static4.aClass162_1.method4114(world.hostname);
					}
					@Pc(50) int local50 = pinger.anInt2419;
					if (local50 == -1) {
						return;
					}
					pinger = null;
					world.ping = local50;
					pingIterator++;
				} else {
					pingIterator++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZZBII)V")
	public static void sort(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		sort(arg1, arg2, 0, arg3, sorted.length - 1, arg0);
		pingIterator = 0;
		pinger = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZIIIIZ)V")
	public static void sort(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int lo, @OriginalArg(4) int arg3, @OriginalArg(5) int hi, @OriginalArg(6) boolean arg5) {
		if (lo >= hi) {
			return;
		}
		@Pc(22) int mid = (hi + lo) / 2;
		@Pc(24) int i = lo;
		@Pc(28) World pivot = sorted[mid];
		sorted[mid] = sorted[hi];
		sorted[hi] = pivot;
		for (@Pc(40) int j = lo; j < hi; j++) {
			if (compare(arg1, arg0, sorted[j], pivot, arg3, arg5) <= 0) {
				@Pc(57) World world = sorted[j];
				sorted[j] = sorted[i];
				sorted[i++] = world;
			}
		}
		sorted[hi] = sorted[i];
		sorted[i] = pivot;
		sort(arg0, arg1, lo, arg3, i - 1, arg5);
		sort(arg0, arg1, i + 1, arg3, hi, arg5);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZLclient!ac;Lclient!ac;IBZ)I")
	public static int compare(@OriginalArg(0) int secondaryField, @OriginalArg(1) boolean secondaryDesc, @OriginalArg(2) World arg2, @OriginalArg(3) World arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean primaryDesc) {
		@Pc(10) int primary = compare(primaryDesc, arg2, arg3, arg4);
		if (primary != 0) {
			return primaryDesc ? -primary : primary;
		} else if (secondaryField == -1) {
			return 0;
		} else {
			@Pc(32) int secondary = compare(secondaryDesc, arg2, arg3, secondaryField);
			return secondaryDesc ? -secondary : secondary;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLclient!ac;Lclient!ac;BI)I")
	public static int compare(@OriginalArg(0) boolean desc, @OriginalArg(1) World x, @OriginalArg(2) World y, @OriginalArg(4) int field) {
		@Pc(11) int yPlayers;
		@Pc(14) int xPlayers;
		if (field == 1) {
			yPlayers = x.players;
			xPlayers = y.players;
			if (!desc) {
				if (yPlayers == -1) {
					yPlayers = 2001;
				}
				if (xPlayers == -1) {
					xPlayers = 2001;
				}
			}
			return yPlayers - xPlayers;
		} else if (field == 2) {
			return StringUtils.compare(y.getCountry().name, x.getCountry().name, client.language);
		} else if (field == 3) {
			if (x.activity.equals("-")) {
				if (y.activity.equals("-")) {
					return 0;
				} else if (desc) {
					return -1;
				} else {
					return 1;
				}
			} else if (y.activity.equals("-")) {
				return desc ? 1 : -1;
			} else {
				return StringUtils.compare(y.activity, x.activity, client.language);
			}
		} else if (field == 4) {
			if (x.isLootShare()) {
				return y.isLootShare() ? 0 : 1;
			} else if (y.isLootShare()) {
				return -1;
			} else {
				return 0;
			}
		} else if (field == 5) {
			if (x.isQuickChat()) {
				return y.isQuickChat() ? 0 : 1;
			} else if (y.isQuickChat()) {
				return -1;
			} else {
				return 0;
			}
		} else if (field == 6) {
			if (x.isPvp()) {
				return y.isPvp() ? 0 : 1;
			} else if (y.isPvp()) {
				return -1;
			} else {
				return 0;
			}
		} else if (field == 7) {
			if (x.isMembers()) {
				return y.isMembers() ? 0 : 1;
			} else if (y.isMembers()) {
				return -1;
			} else {
				return 0;
			}
		} else if (field == 8) {
			yPlayers = x.ping;
			xPlayers = y.ping;
			if (desc) {
				if (xPlayers == 1000) {
					xPlayers = -1;
				}
				if (yPlayers == 1000) {
					yPlayers = -1;
				}
			} else {
				if (yPlayers == -1) {
					yPlayers = 1000;
				}
				if (xPlayers == -1) {
					xPlayers = 1000;
				}
			}
			return yPlayers - xPlayers;
		} else {
			return x.id - y.id;
		}
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)Lclient!ac;")
	public static World next() {
		return sorted.length > iterator ? sorted[iterator++] : null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Lclient!ac;")
	public static World head() {
		iterator = 0;
		return next();
	}

}
