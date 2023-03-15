import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class FriendsList {

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] worldNames = new String[200];
	@OriginalMember(owner = "client!at", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] usernames = new String[200];
	@OriginalMember(owner = "client!gm", name = "b", descriptor = "[I")
	public static final int[] ranks = new int[200];
	@OriginalMember(owner = "client!pd", name = "o", descriptor = "[I")
	public static final int[] worlds = new int[200];
	@OriginalMember(owner = "client!rk", name = "b", descriptor = "[Z")
	public static final boolean[] sameGame = new boolean[200];
	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	public static int status = 0;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean contains(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < size; local11++) {
			if (arg0.equalsIgnoreCase(usernames[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(PlayerList.self.username);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void remove(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(26) String local26 = Static135.method2537(arg0);
		if (local26 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < size; local31++) {
			@Pc(37) String local37 = usernames[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static135.method2537(local37);
			if (local37 != null && local37.equals(local26)) {
				size--;
				for (@Pc(61) int local61 = local31; local61 < size; local61++) {
					usernames[local61] = usernames[local61 + 1];
					Static319.aStringArray54[local61] = Static319.aStringArray54[local61 + 1];
					worlds[local61] = worlds[local61 + 1];
					worldNames[local61] = worldNames[local61 + 1];
					ranks[local61] = ranks[local61 + 1];
					sameGame[local61] = sameGame[local61 + 1];
				}
				Static53.anInt3971 = Static88.transmitTimer;
				Protocol.writeOpcode(ClientProt.PACKET_53);
				Protocol.outboundBuffer.p1(Buffer.getStringLength(arg0));
				Protocol.outboundBuffer.pjstr(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void add(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (size >= 100 && !LoginManager.playerMember || size >= 200) {
			Chat.add(Static78.aClass79_129.getLocalized(client.language));
			return;
		}
		@Pc(33) String local33 = Static135.method2537(arg0);
		if (local33 == null) {
			return;
		}
		@Pc(78) String local78;
		for (@Pc(38) int local38 = 0; local38 < size; local38++) {
			@Pc(46) String local46 = Static135.method2537(usernames[local38]);
			if (local46 != null && local46.equals(local33)) {
				Chat.add(arg0 + Static332.aClass79_131.getLocalized(client.language));
				return;
			}
			if (Static319.aStringArray54[local38] != null) {
				local78 = Static135.method2537(Static319.aStringArray54[local38]);
				if (local78 != null && local78.equals(local33)) {
					Chat.add(arg0 + Static332.aClass79_131.getLocalized(client.language));
					return;
				}
			}
		}
		for (@Pc(108) int local108 = 0; local108 < IgnoreList.size; local108++) {
			local78 = Static135.method2537(Static226.aStringArray35[local108]);
			if (local78 != null && local78.equals(local33)) {
				Chat.add(Static150.aClass79_64.getLocalized(client.language) + arg0 + Static151.aClass79_65.getLocalized(client.language));
				return;
			}
			if (Static371.aStringArray66[local108] != null) {
				@Pc(151) String local151 = Static135.method2537(Static371.aStringArray66[local108]);
				if (local151 != null && local151.equals(local33)) {
					Chat.add(Static150.aClass79_64.getLocalized(client.language) + arg0 + Static151.aClass79_65.getLocalized(client.language));
					return;
				}
			}
		}
		if (Static135.method2537(PlayerList.self.username).equals(local33)) {
			Chat.add(Static122.aClass79_54.getLocalized(client.language));
		} else {
			Protocol.writeOpcode(ClientProt.PACKET_18);
			Protocol.outboundBuffer.p1(Buffer.getStringLength(arg0));
			Protocol.outboundBuffer.pjstr(arg0);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void setRank(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Protocol.writeOpcode(ClientProt.PACKET_49);
		Protocol.outboundBuffer.p1(Buffer.getStringLength(arg1) + 1);
		Protocol.outboundBuffer.p1add(arg0);
		Protocol.outboundBuffer.pjstr(arg1);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int indexOf(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < size; local19++) {
			if (arg0.equalsIgnoreCase(usernames[local19])) {
				return local19;
			}
		}
		return -1;
	}

}
