import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.DataInputStream;
import java.net.URL;

public class TracingException {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void report(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static174.method1509(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static342.method5153(local7);
			local7 = Static200.method3647(local7, "%3a", ":");
			local7 = Static200.method3647(local7, "%40", "@");
			local7 = Static200.method3647(local7, "%26", "&");
			local7 = Static200.method3647(local7, "%23", "#");
			if (GameShell.signlink2.applet != null) {
				@Pc(103) PrivilegedRequest local103 = GameShell.signlink2.openUrlStream(new URL(GameShell.signlink2.applet.getCodeBase(), "clienterror.ws?c=" + GameShell.clientRevision + "&u=" + LoginManager.encodedUsername + "&v1=" + Signlink.javaVendor + "&v2=" + Signlink.javaVersion + "&e=" + local7));
				while (local103.status == 0) {
					ThreadUtils.sleep(1L);
				}
				if (local103.status == 1) {
					@Pc(121) DataInputStream local121 = (DataInputStream) local103.result;
					local121.read();
					local121.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}

}
