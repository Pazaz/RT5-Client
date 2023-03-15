import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Chat {

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] names = new String[100];
	@OriginalMember(owner = "client!qq", name = "e", descriptor = "[I")
	public static final int[] types = new int[100];
	@OriginalMember(owner = "client!es", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] messages = new String[100];
	@OriginalMember(owner = "client!ho", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] clans = new String[100];
	@OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
	public static final int[] phraseIds = new int[100];
	@OriginalMember(owner = "client!is", name = "j", descriptor = "Lclient!oj;")
	public static FilterSetting privateFilter;
	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	public static int publicFilter = 0;
	@OriginalMember(owner = "client!te", name = "i", descriptor = "I")
	public static int tradeFilter = 0;
	@OriginalMember(owner = "client!na", name = "S", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void add(@OriginalArg(1) String arg0) {
		Static33.method4200("", 0, arg0, 0, "");
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/String;I)V")
	static void sendPublicMessage(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (LoginManager.staffModLevel == 0 && (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(ScriptRunner.CHATCOL_YELLOW.getLocalized(0))) {
			local13 = 0;
			arg0 = arg0.substring(ScriptRunner.CHATCOL_YELLOW.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.CHATCOL_RED.getLocalized(0))) {
			local13 = 1;
			arg0 = arg0.substring(ScriptRunner.CHATCOL_RED.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.CHATCOL_GREEN.getLocalized(0))) {
			local13 = 2;
			arg0 = arg0.substring(ScriptRunner.CHATCOL_GREEN.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.CHATCOL_CYAN.getLocalized(0))) {
			local13 = 3;
			arg0 = arg0.substring(ScriptRunner.CHATCOL_CYAN.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.CHATCOL_PURPLE.getLocalized(0))) {
			local13 = 4;
			arg0 = arg0.substring(ScriptRunner.CHATCOL_PURPLE.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.aClass79_17.getLocalized(0))) {
			local13 = 5;
			arg0 = arg0.substring(ScriptRunner.aClass79_17.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.aClass79_45.getLocalized(0))) {
			local13 = 6;
			arg0 = arg0.substring(ScriptRunner.aClass79_45.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.aClass79_57.getLocalized(0))) {
			local13 = 7;
			arg0 = arg0.substring(ScriptRunner.aClass79_57.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.aClass79_120.getLocalized(0))) {
			local13 = 8;
			arg0 = arg0.substring(ScriptRunner.aClass79_120.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.aClass79_24.getLocalized(0))) {
			local13 = 9;
			arg0 = arg0.substring(ScriptRunner.aClass79_24.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.aClass79_113.getLocalized(0))) {
			local13 = 10;
			arg0 = arg0.substring(ScriptRunner.aClass79_113.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.CHATCOL_GLOW3.getLocalized(0))) {
			local13 = 11;
			arg0 = arg0.substring(ScriptRunner.CHATCOL_GLOW3.getLocalized(0).length());
		} else if (client.language != 0) {
			if (local11.startsWith(ScriptRunner.CHATCOL_YELLOW.getLocalized(client.language))) {
				local13 = 0;
				arg0 = arg0.substring(ScriptRunner.CHATCOL_YELLOW.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.CHATCOL_RED.getLocalized(client.language))) {
				local13 = 1;
				arg0 = arg0.substring(ScriptRunner.CHATCOL_RED.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.CHATCOL_GREEN.getLocalized(client.language))) {
				local13 = 2;
				arg0 = arg0.substring(ScriptRunner.CHATCOL_GREEN.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.CHATCOL_CYAN.getLocalized(client.language))) {
				local13 = 3;
				arg0 = arg0.substring(ScriptRunner.CHATCOL_CYAN.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.CHATCOL_PURPLE.getLocalized(client.language))) {
				local13 = 4;
				arg0 = arg0.substring(ScriptRunner.CHATCOL_PURPLE.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.aClass79_17.getLocalized(client.language))) {
				local13 = 5;
				arg0 = arg0.substring(ScriptRunner.aClass79_17.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.aClass79_45.getLocalized(client.language))) {
				local13 = 6;
				arg0 = arg0.substring(ScriptRunner.aClass79_45.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.aClass79_57.getLocalized(client.language))) {
				local13 = 7;
				arg0 = arg0.substring(ScriptRunner.aClass79_57.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.aClass79_120.getLocalized(client.language))) {
				local13 = 8;
				arg0 = arg0.substring(ScriptRunner.aClass79_120.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.aClass79_24.getLocalized(client.language))) {
				local13 = 9;
				arg0 = arg0.substring(ScriptRunner.aClass79_24.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.aClass79_113.getLocalized(client.language))) {
				local13 = 10;
				arg0 = arg0.substring(ScriptRunner.aClass79_113.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.CHATCOL_GLOW3.getLocalized(client.language))) {
				local13 = 11;
				arg0 = arg0.substring(ScriptRunner.CHATCOL_GLOW3.getLocalized(client.language).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(ScriptRunner.CHATEFF_WAVE.getLocalized(0))) {
			local451 = 1;
			arg0 = arg0.substring(ScriptRunner.CHATEFF_WAVE.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.aClass79_114.getLocalized(0))) {
			local451 = 2;
			arg0 = arg0.substring(ScriptRunner.aClass79_114.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.aClass79_39.getLocalized(0))) {
			local451 = 3;
			arg0 = arg0.substring(ScriptRunner.aClass79_39.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.aClass79_70.getLocalized(0))) {
			local451 = 4;
			arg0 = arg0.substring(ScriptRunner.aClass79_70.getLocalized(0).length());
		} else if (local11.startsWith(ScriptRunner.CHATEFF_SLIDE.getLocalized(0))) {
			local451 = 5;
			arg0 = arg0.substring(ScriptRunner.CHATEFF_SLIDE.getLocalized(0).length());
		} else if (client.language != 0) {
			if (local11.startsWith(ScriptRunner.CHATEFF_WAVE.getLocalized(client.language))) {
				local451 = 1;
				arg0 = arg0.substring(ScriptRunner.CHATEFF_WAVE.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.aClass79_114.getLocalized(client.language))) {
				local451 = 2;
				arg0 = arg0.substring(ScriptRunner.aClass79_114.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.aClass79_39.getLocalized(client.language))) {
				local451 = 3;
				arg0 = arg0.substring(ScriptRunner.aClass79_39.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.aClass79_70.getLocalized(client.language))) {
				local451 = 4;
				arg0 = arg0.substring(ScriptRunner.aClass79_70.getLocalized(client.language).length());
			} else if (local11.startsWith(ScriptRunner.CHATEFF_SLIDE.getLocalized(client.language))) {
				local451 = 5;
				arg0 = arg0.substring(ScriptRunner.CHATEFF_SLIDE.getLocalized(client.language).length());
			}
		}
		Protocol.writeOpcode(ClientProt.MESSAGE_PUBLIC);
		Protocol.outboundBuffer.p1(0);
		@Pc(646) int local646 = Protocol.outboundBuffer.pos;
		if (arg1 == 5021) {
			Protocol.outboundBuffer.p1(1);
		} else {
			Protocol.outboundBuffer.p1(0);
		}
		Protocol.outboundBuffer.p1(local13);
		Protocol.outboundBuffer.p1(local451);
		WordPack.encode(arg0, Protocol.outboundBuffer);
		Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local646);
	}

}
