import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class58_Sub2 extends Class58 {

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	private Class58_Sub2() {
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method6100(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method6096();
		}
		@Pc(11) SocketAddress local11 = arg0.address();
		if (!(local11 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(28) InetSocketAddress local28 = (InetSocketAddress) local11;
		if (arg0.type() == Type.HTTP) {
			@Pc(34) String local34 = null;
			try {
				@Pc(39) Class local39 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(65) Method local65 = local39.getDeclaredMethod("getProxyAuth", Static447.aClass17 == null ? (Static447.aClass17 = Class.forName("java.lang.String")) : Static447.aClass17, Integer.TYPE);
				local65.setAccessible(true);
				@Pc(87) Object local87 = local65.invoke((Object) null, local28.getHostName(), Integer.valueOf(local28.getPort()));
				if (local87 != null) {
					@Pc(98) Method local98 = local39.getDeclaredMethod("supportsPreemptiveAuthorization");
					local98.setAccessible(true);
					if ((Boolean) local98.invoke(local87)) {
						@Pc(119) Method local119 = local39.getDeclaredMethod("getHeaderName");
						local119.setAccessible(true);
						@Pc(158) Method local158 = local39.getDeclaredMethod("getHeaderValue", Static447.aClass18 == null ? (Static447.aClass18 = Class.forName("java.net.URL")) : Static447.aClass18, Static447.aClass17 == null ? (Static447.aClass17 = Class.forName("java.lang.String")) : Static447.aClass17);
						local158.setAccessible(true);
						@Pc(168) String local168 = (String) local119.invoke(local87);
						@Pc(200) String local200 = (String) local158.invoke(local87, new URL("https://" + this.aString74 + "/"), "https");
						local34 = local168 + ": " + local200;
					}
				}
			} catch (@Pc(215) Exception local215) {
			}
			return this.httpProxyConnect(local28.getHostName(), local28.getPort(), local34);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(232) Socket local232 = new Socket(arg0);
			local232.connect(new InetSocketAddress(this.aString74, this.anInt6783));
			return local232;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString74 + ":" + this.anInt6783 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString74 + ":" + this.anInt6783 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(86) BufferedReader local86 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(89) String local89 = local86.readLine();
		if (local89 != null) {
			if (local89.startsWith("HTTP/1.0 200") || local89.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local89.startsWith("HTTP/1.0 407") || local89.startsWith("HTTP/1.1 407")) {
				@Pc(129) int local129 = 0;
				@Pc(133) String local133 = "proxy-authenticate: ";
				for (local89 = local86.readLine(); local89 != null && local129 < 50; local89 = local86.readLine()) {
					if (local89.toLowerCase().startsWith(local133)) {
						local89 = local89.substring(local133.length()).trim();
						@Pc(164) int local164 = local89.indexOf(32);
						if (local164 != -1) {
							local89 = local89.substring(0, local164);
						}
						throw new IOException_Sub1(local89);
					}
					local129++;
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local86.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method6097() throws IOException {
		@Pc(5) boolean local5 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local5) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(26) boolean local26 = this.anInt6783 == 443;
		@Pc(55) List local55;
		@Pc(84) List local84;
		try {
			local55 = this.aProxySelector1.select(new URI((local26 ? "https" : "http") + "://" + this.aString74));
			local84 = this.aProxySelector1.select(new URI((local26 ? "http" : "https") + "://" + this.aString74));
		} catch (@Pc(95) URISyntaxException local95) {
			return this.method6096();
		}
		local55.addAll(local84);
		@Pc(106) Object[] local106 = local55.toArray();
		@Pc(108) IOException_Sub1 local108 = null;
		for (@Pc(112) int local112 = 0; local112 < local106.length; local112++) {
			@Pc(124) Object local124 = local106[local112];
			@Pc(127) Proxy local127 = (Proxy) local124;
			try {
				@Pc(132) Socket local132 = this.method6100(local127);
				if (local132 != null) {
					return local132;
				}
			} catch (@Pc(139) IOException_Sub1 local139) {
				local108 = local139;
			} catch (@Pc(143) IOException local143) {
			}
		}
		if (local108 != null) {
			throw local108;
		}
		return this.method6096();
	}
}
