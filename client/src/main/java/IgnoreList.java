import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class IgnoreList {

	@OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void remove(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static135.method2537(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < size; local25++) {
			@Pc(31) String local31 = Static226.aStringArray35[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static135.method2537(local31);
			if (local31 != null && local31.equals(local20)) {
				size--;
				for (@Pc(55) int local55 = local25; local55 < size; local55++) {
					Static226.aStringArray35[local55] = Static226.aStringArray35[local55 + 1];
					Static234.aStringArray39[local55] = Static234.aStringArray39[local55 + 1];
					Static371.aStringArray66[local55] = Static371.aStringArray66[local55 + 1];
					Static190.aStringArray28[local55] = Static190.aStringArray28[local55 + 1];
					Static196.aBooleanArray31[local55] = Static196.aBooleanArray31[local55 + 1];
				}
				Static53.anInt3971 = InterfaceList.transmitTimer;
				Protocol.writeOpcode(ClientProt.PACKET_24);
				Protocol.outboundBuffer.p1(Buffer.getStringLength(arg0));
				Protocol.outboundBuffer.pjstr(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void add(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (size >= 100) {
			Chat.add(Static322.aClass79_125.getLocalized(client.language));
			return;
		}
		@Pc(22) String local22 = Static135.method2537(arg0);
		if (local22 == null) {
			return;
		}
		@Pc(65) String local65;
		for (@Pc(27) int local27 = 0; local27 < size; local27++) {
			@Pc(35) String local35 = Static135.method2537(Static226.aStringArray35[local27]);
			if (local35 != null && local35.equals(local22)) {
				Chat.add(arg0 + Static44.aClass79_26.getLocalized(client.language));
				return;
			}
			if (Static371.aStringArray66[local27] != null) {
				local65 = Static135.method2537(Static371.aStringArray66[local27]);
				if (local65 != null && local65.equals(local22)) {
					Chat.add(arg0 + Static44.aClass79_26.getLocalized(client.language));
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < FriendsList.size; local95++) {
			local65 = Static135.method2537(FriendsList.usernames[local95]);
			if (local65 != null && local65.equals(local22)) {
				Chat.add(Static261.aClass79_107.getLocalized(client.language) + arg0 + Static120.aClass79_50.getLocalized(client.language));
				return;
			}
			if (Static319.aStringArray54[local95] != null) {
				@Pc(138) String local138 = Static135.method2537(Static319.aStringArray54[local95]);
				if (local138 != null && local138.equals(local22)) {
					Chat.add(Static261.aClass79_107.getLocalized(client.language) + arg0 + Static120.aClass79_50.getLocalized(client.language));
					return;
				}
			}
		}
		if (Static135.method2537(PlayerList.self.username).equals(local22)) {
			Chat.add(Static47.aClass79_27.getLocalized(client.language));
		} else {
			Protocol.writeOpcode(ClientProt.PACKET_16);
			Protocol.outboundBuffer.p1(Buffer.getStringLength(arg0) + 1);
			Protocol.outboundBuffer.pjstr(arg0);
			Protocol.outboundBuffer.p1(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean contains(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < size; local11++) {
			if (arg0.equalsIgnoreCase(Static234.aStringArray39[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static190.aStringArray28[local11])) {
				return true;
			}
		}
		return false;
	}

}
