import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.Socket;

public class AccountCreationManager {

	@OriginalMember(owner = "client!i", name = "W", descriptor = "I")
	public static int step = 0;
	@OriginalMember(owner = "client!dr", name = "V", descriptor = "I")
	public static int errors = 0;
	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	public static int reply = -2;
	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	public static int loops = 0;
	@OriginalMember(owner = "client!jj", name = "S", descriptor = "[Ljava/lang/String;")
	public static String[] suggestedNames;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void mainLogic() {
		if (step == 0) {
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
				if (client.alternatePort == client.port) {
					client.port = client.defaultPort;
				} else {
					client.port = client.alternatePort;
				}
				step = 1;
				errors++;
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
				if (reply != 21) {
					AccountCreationManager.reply = reply;
					step = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				step = 3;
			}
			if (step == 3) {
				if (Protocol.socket.available() < 1) {
					return;
				}
				suggestedNames = new String[Protocol.socket.read()];
				step = 4;
			}
			if (step == 4 && Protocol.socket.available() >= suggestedNames.length * 8) {
				Protocol.inboundBuffer.pos = 0;
				Protocol.socket.read(Protocol.inboundBuffer.data, suggestedNames.length * 8, 0);
				for (reply = 0; reply < suggestedNames.length; reply++) {
					suggestedNames[reply] = StringUtils.fromBase37(Protocol.inboundBuffer.g8());
				}
				step = 0;
				AccountCreationManager.reply = 21;
				Protocol.socket.close();
				Protocol.socket = null;
			}
		} catch (@Pc(219) IOException ex) {
			if (Protocol.socket != null) {
				Protocol.socket.close();
				Protocol.socket = null;
			}
			if (errors >= 1) {
				step = 0;
				reply = -4;
			} else {
				loops = 0;
				step = 1;
				errors++;
				if (client.alternatePort == client.port) {
					client.port = client.defaultPort;
				} else {
					client.port = client.alternatePort;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;IIIZJIIZZLjava/lang/String;)V")
	public static void createAccount(@OriginalArg(0) String password, @OriginalArg(2) int day, @OriginalArg(3) int country, @OriginalArg(4) boolean runeScapeNewsletters, @OriginalArg(5) long username, @OriginalArg(6) int year, @OriginalArg(7) int month, @OriginalArg(8) boolean shareDetailsWithBusinessPartners, @OriginalArg(9) boolean otherNewsletters, @OriginalArg(10) String email) {
		@Pc(8) int[] key = new int[4];
		for (@Pc(10) int i = 0; i < 3; i++) {
			key[i] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Buffer rsaBuffer = new Buffer(128);
		rsaBuffer.p1(10);
		rsaBuffer.p2((shareDetailsWithBusinessPartners ? 4 : 0) | (otherNewsletters ? 2 : 0) | (runeScapeNewsletters ? 1 : 0));
		rsaBuffer.p8(username);
		rsaBuffer.p4(key[0]);
		rsaBuffer.pjstr(password);
		rsaBuffer.p4(key[1]);
		rsaBuffer.p2(client.affiliate);
		rsaBuffer.p1(day);
		rsaBuffer.p1(month);
		rsaBuffer.p4(key[2]);
		rsaBuffer.p2(year);
		rsaBuffer.p2(country);
		rsaBuffer.p4(key[3]);
		rsaBuffer.rsaenc(Protocol.EXPONENT, Protocol.MODULUS);
		@Pc(118) Buffer xteaBuffer = new Buffer(350);
		xteaBuffer.pjstr(email);
		@Pc(131) int padding = 8 - Buffer.getStringLength(email) % 8;
		for (@Pc(133) int i = 0; i < padding; i++) {
			xteaBuffer.p1((int) (Math.random() * 255.0D));
		}
		xteaBuffer.tinyenc(key);
		Protocol.outboundBuffer.pos = 0;
		Protocol.outboundBuffer.p1(LoginProt.REGISTER_STEP2.opcode);
		Protocol.outboundBuffer.p2(rsaBuffer.pos + xteaBuffer.pos + 2);
		Protocol.outboundBuffer.p2(578);
		Protocol.outboundBuffer.pdata(rsaBuffer.data, rsaBuffer.pos);
		Protocol.outboundBuffer.pdata(xteaBuffer.data, xteaBuffer.pos);
		step = 1;
		errors = 0;
		reply = -3;
		loops = 0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
	public static void checkInfo(@OriginalArg(0) int country, @OriginalArg(1) int year, @OriginalArg(3) int day, @OriginalArg(4) int month) {
		Protocol.outboundBuffer.pos = 0;
		Protocol.outboundBuffer.p1(LoginProt.REGISTER_STEP1.opcode);
		Protocol.outboundBuffer.p1(day);
		Protocol.outboundBuffer.p1(month);
		Protocol.outboundBuffer.p2(year);
		Protocol.outboundBuffer.p2(country);
		loops = 0;
		errors = 0;
		reply = -3;
		step = 1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(JB)V")
	public static void checkName(@OriginalArg(0) long username) {
		Protocol.outboundBuffer.pos = 0;
		Protocol.outboundBuffer.p1(LoginProt.VALIDATE_USERNAME.opcode);
		Protocol.outboundBuffer.p8(username);
		step = 1;
		loops = 0;
		errors = 0;
		reply = -3;
	}

}
