import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!jl", name = "Z", descriptor = "I")
	public static int anInt3139;

	@OriginalMember(owner = "client!jl", name = "ab", descriptor = "I")
	public static int anInt3140;

	@OriginalMember(owner = "client!jl", name = "bb", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!jl", name = "eb", descriptor = "Lclient!bk;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!jl", name = "V", descriptor = "Lclient!h;")
	public static final InboundPacket aClass89_129 = new InboundPacket(79, 7);

	@OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
	public static final int anInt3138 = 0;

	@OriginalMember(owner = "client!jl", name = "X", descriptor = "Lclient!nk;")
	public static Class161 aClass161_5 = null;

	@OriginalMember(owner = "client!jl", name = "Y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!jl", name = "cb", descriptor = "Lclient!s;")
	public static final Class210 aClass210_8 = new Class210(8, 6);

	@OriginalMember(owner = "client!jl", name = "db", descriptor = "Lclient!h;")
	public static final InboundPacket aClass89_130 = new InboundPacket(86, 10);

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIILclient!ur;Lclient!vi;Lclient!kf;Ljava/lang/String;Lclient!nk;)V")
	public static void method3147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class130 arg6, @OriginalArg(8) Class239 arg7, @OriginalArg(9) Class78 arg8, @OriginalArg(10) String arg9, @OriginalArg(11) Class161 arg10) {
		@Pc(15) int local15;
		if (Static314.anInt5911 == 4) {
			local15 = (int) Static277.aFloat67 & 0x3FFF;
		} else {
			local15 = Static6.anInt158 + (int) Static277.aFloat67 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg10.anInt4248 / 2, arg10.anInt4261 / 2) + 10;
		@Pc(43) int local43 = arg4 * arg4 + arg1 * arg1;
		if (local43 > local34 * local34) {
			return;
		}
		@Pc(53) int local53 = Class19.anIntArray178[local15];
		@Pc(57) int local57 = Class19.anIntArray177[local15];
		if (Static314.anInt5911 != 4) {
			local57 = local57 * 256 / (Static97.anInt2005 + 256);
			local53 = local53 * 256 / (Static97.anInt2005 + 256);
		}
		@Pc(86) int local86 = local57 * arg4 + local53 * arg1 >> 15;
		@Pc(96) int local96 = arg1 * local57 - local53 * arg4 >> 15;
		@Pc(103) int local103 = arg7.method6124(null, arg9, 100);
		@Pc(109) int local109 = local86 - local103 / 2;
		@Pc(117) int local117 = arg7.method6121(arg9, null);
		if (-arg10.anInt4248 <= local109 && arg10.anInt4248 >= local109 && -arg10.anInt4261 <= local96 && local96 <= arg10.anInt4261) {
			arg6.method5893(arg0, 0, arg10.anInt4248 / 2 + local109 + arg0, 1, 0, null, arg2, arg8, 50, arg9, 0, arg10.anInt4261 / 2 + arg2 - local117 - local96 - arg5, null, arg3, local103);
		}
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
	public static void method3148() {
		if (Static154.anInt2803 == 0) {
			return;
		}
		try {
			if (++Static193.anInt3557 > 1500) {
				if (Protocol.socket != null) {
					Protocol.socket.close();
					Protocol.socket = null;
				}
				if (Static60.anInt666 >= 1) {
					Static154.anInt2803 = 0;
					LoginManager.reply = -5;
					return;
				}
				Static154.anInt2803 = 1;
				if (client.worldListDefaultPort == client.worldListPort) {
					client.worldListPort = client.worldListAlternatePort;
				} else {
					client.worldListPort = client.worldListDefaultPort;
				}
				Static60.anInt666++;
				Static193.anInt3557 = 0;
			}
			if (Static154.anInt2803 == 1) {
				Protocol.socketRequest2 = GameShell.signlink.openSocket(client.worldListHostname, client.worldListPort);
				Static154.anInt2803 = 2;
			}
			@Pc(125) int local125;
			if (Static154.anInt2803 == 2) {
				if (Protocol.socketRequest2.status == 2) {
					throw new IOException();
				}
				if (Protocol.socketRequest2.status != 1) {
					return;
				}
				Protocol.socket = new Class111((Socket) Protocol.socketRequest2.result, GameShell.signlink);
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
					LoginManager.reply = local125;
					Static154.anInt2803 = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				Static154.anInt2803 = 3;
			}
			if (Static154.anInt2803 == 3 && Protocol.socket.available() >= 2) {
				local125 = Protocol.socket.read() << 8 | Protocol.socket.read();
				WorldList.switchWorld(local125);
				if (client.worldId == -1) {
					Static154.anInt2803 = 0;
					LoginManager.reply = 6;
					Protocol.socket.close();
					Protocol.socket = null;
				} else {
					Static154.anInt2803 = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					Static230.method4014();
				}
			}
		} catch (@Pc(208) IOException local208) {
			if (Protocol.socket != null) {
				Protocol.socket.close();
				Protocol.socket = null;
			}
			if (Static60.anInt666 >= 1) {
				Static154.anInt2803 = 0;
				LoginManager.reply = -4;
			} else {
				Static154.anInt2803 = 1;
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
}
