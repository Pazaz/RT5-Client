import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.security.MessageDigest;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!loader")
public final class loader extends Applet implements Runnable {

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString279;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString280;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private static int anInt7390 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt7388;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt7391;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt7389 = 0;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean523 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean521 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean522 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean524 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method6199(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg0);
			local9.write(arg1, 0, arg1.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method6200("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method6200(@OriginalArg(0) String arg0) {
		if (this.aBoolean522) {
			return;
		}
		this.aBoolean522 = true;
		try {
			if (aString279 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString279 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method6201(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(22) byte[] local22 = new byte[local8];
			local19.readFully(local22, 0, local8);
			local19.close();
			return local22;
		} catch (@Pc(32) IOException local32) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!a;B)[B")
	private byte[] method6202(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class221 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(17) FontMetrics local17 = this.getFontMetrics(local8);
		@Pc(24) Color local24 = new Color(Class225.anIntArray607[anInt7390]);
		@Pc(31) Color local31 = new Color(Class225.anIntArray608[anInt7390]);
		@Pc(35) byte[] local35 = new byte[arg1.anInt7384];
		try {
			@Pc(77) InputStream local77;
			if (arg0) {
				@Pc(40) URL local40 = this.getCodeBase();
				@Pc(48) Socket local48 = new Socket(InetAddress.getByName(local40.getHost()), 443);
				local48.setSoTimeout(10000);
				@Pc(54) OutputStream local54 = local48.getOutputStream();
				local54.write(17);
				local54.write(("JAGGRAB " + local40.getFile() + arg1.aString277 + "\n\n").getBytes());
				local77 = local48.getInputStream();
			} else {
				local77 = (new URL(this.getCodeBase(), arg1.aString277)).openStream();
			}
			@Pc(90) int local90 = -1;
			@Pc(92) int local92 = 0;
			while (local35.length > local92) {
				@Pc(106) int local106 = local35.length - local92;
				if (local106 > 1000) {
					local106 = 1000;
				}
				@Pc(120) int local120 = local77.read(local35, local92, local106);
				if (local120 < 0) {
					throw new EOFException();
				}
				local92 += local120;
				@Pc(140) int local140 = local92 * 100 / local35.length;
				if (local140 != local90) {
					try {
						@Pc(151) Graphics local151 = this.getGraphics();
						if (local151 == null) {
							this.repaint();
						} else {
							local151.setColor(Color.black);
							local151.fillRect(0, 0, this.anInt7388, this.anInt7391);
							local151.setColor(local24);
							local151.drawRect(this.anInt7388 / 2 - 152, this.anInt7391 / 2 + -18, 303, 33);
							@Pc(200) String local200 = arg1.aStringArray46[this.anInt7389] + " - " + local140 + "%";
							local151.setFont(local8);
							local151.setColor(local31);
							local90 = local140;
							local151.drawString(local200, (this.anInt7388 - local17.stringWidth(local200)) / 2, this.anInt7391 / 2 + 4);
						}
					} catch (@Pc(231) Exception local231) {
					}
				}
			}
			local77.close();
			if (arg1.anInt7385 != arg1.anInt7384) {
				@Pc(244) byte[] local244 = new byte[arg1.anInt7385];
				@Pc(249) Inflater local249 = new Inflater(true);
				local249.setInput(local35);
				local249.inflate(local244);
				local35 = local244;
			}
		} catch (@Pc(260) Exception local260) {
			return null;
		}
		return this.method6204(local35, arg1, false) ? local35 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean521 = false;
		this.aBoolean523 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString280 = this.getParameter("unsignedurl");
			if (aString280 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean522 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString280), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString279 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class225.aStringArray47.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(63) String local63 = this.getParameter("colourid");
			if (local63 != null) {
				anInt7390 = Integer.parseInt(local63);
				if (anInt7390 < 0 || anInt7390 >= Class225.anIntArray607.length) {
					anInt7390 = 0;
				}
			}
			this.anInt7388 = this.getSize().width;
			this.anInt7391 = this.getSize().height;
			@Pc(92) int local92 = 32;
			try {
				@Pc(97) int local97 = Integer.parseInt(this.getParameter("modewhat"));
				local92 += local97;
			} catch (@Pc(103) Exception local103) {
			}
			try {
				@Pc(107) String local107 = this.getParameter("lang");
				if (local107 != null) {
					this.anInt7389 = Integer.parseInt(local107);
				}
			} catch (@Pc(117) Exception local117) {
			}
			@Pc(127) Class227 local127;
			try {
				local127 = new Class227(this, local92, Class225.aStringArray47[local38], 29);
			} catch (@Pc(129) Exception local129) {
				this.method6200("nocache");
				return;
			}
			@Pc(136) unpack local136 = null;
			@Pc(146) byte[] local146;
			try {
				Class.forName("java.util.jar.Pack200");
				local146 = this.method6203(Class225.aClass221_2, false, local127);
				if (local146 == null) {
					return;
				}
				local136 = new unpack_Sub1(local146);
			} catch (@Pc(157) Throwable local157) {
			}
			if (local136 == null) {
				local146 = this.method6203(Class225.aClass221_1, false, local127);
				if (local146 == null) {
					return;
				}
				@Pc(176) unpack local176 = new unpack(local146);
				@Pc(181) ClassLoader_Sub1 local181 = new ClassLoader_Sub1(local176);
				@Pc(184) Class local184 = Class.forName("unpack");
				local181.method6191(local184, local184.getName());
				@Pc(194) Class local194 = local181.loadClass("unpackclass");
				@Pc(201) byte[] local201 = this.method6203(Class225.aClass221_3, false, local127);
				if (local201 == null) {
					return;
				}
				local136 = (unpack) local194.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local201, Boolean.TRUE);
			}
			@Pc(235) ClassLoader_Sub1 local235 = new ClassLoader_Sub1(local136);
			@Pc(237) byte local237 = -1;
			@Pc(241) String local241 = System.getProperty("os.name").toLowerCase();
			@Pc(245) String local245 = System.getProperty("os.arch").toLowerCase();
			if (local241.startsWith("win")) {
				if (local245.startsWith("amd64") || local245.startsWith("x86_64")) {
					local237 = 4;
				} else {
					local237 = 0;
				}
			} else if (local241.startsWith("linux")) {
				local237 = 1;
			} else if (local241.startsWith("mac")) {
				if (local245.startsWith("ppc")) {
					local237 = 2;
				} else {
					local237 = 3;
				}
			}
			if (local237 != -1) {
				for (@Pc(295) int local295 = 0; local295 < Class225.aClass221ArrayArray1[local237].length; local295++) {
					this.method6203(Class225.aClass221ArrayArray1[local237][local295], this.getParameter("suppress_sha") != null, local127);
				}
			}
			if (Class225.aClass221Array1 != null) {
				local237 = -1;
				local241 = System.getProperty("os.name").toLowerCase();
				local245 = System.getProperty("os.arch").toLowerCase();
				if (local241.startsWith("win")) {
					if (local245.startsWith("amd64") || local245.startsWith("x86_64")) {
						local237 = 2;
					} else {
						local237 = 0;
					}
				}
				if (local237 != -1) {
					this.method6203(Class225.aClass221Array1[local237], this.getParameter("suppress_sha") != null, local127);
				}
			}
			@Pc(380) Class local380 = Class.forName("Class222");
			local235.method6191(local380, local380.getName());
			@Pc(389) Class local389 = Class.forName("Class227");
			local235.method6191(local389, local389.getName());
			@Pc(398) Class local398 = Class.forName("Class226");
			local235.method6191(local398, local398.getName());
			@Pc(407) Class local407 = Class.forName("Class228");
			local235.method6191(local407, local407.getName());
			@Pc(416) Class local416 = Class.forName("Interface11");
			local235.method6191(local416, local416.getName());
			@Pc(426) Class local426 = local235.loadClass("client");
			synchronized (this) {
				if (this.aBoolean524) {
					return;
				}
				this.anApplet2 = (Applet) local426.getDeclaredConstructor().newInstance();
				local426.getMethod("providesignlink", local389).invoke(null, local127);
				this.anApplet2.init();
				if (this.aBoolean523) {
					this.anApplet2.start();
				}
				if (this.aBoolean521) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(486) Exception local486) {
			RuntimeException_Sub2.anInt7386 = -417396003;
			if (local486 instanceof InvocationTargetException) {
				@Pc(502) Throwable local502 = ((InvocationTargetException) local486).getTargetException();
				if (local502 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6188(local502, this, local486.toString());
			} else {
				RuntimeException_Sub2.method6188(local486, this, null);
			}
			this.method6200("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!a;ZZLloader!ud;)[B")
	private byte[] method6203(@OriginalArg(0) Class221 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class227 arg2) {
		@Pc(12) File local12;
		try {
			local12 = arg2.method6227(arg0.aString276);
		} catch (@Pc(14) Exception local14) {
			this.method6200("nocache");
			return null;
		}
		@Pc(25) byte[] local25 = this.method6201(local12);
		if (!this.method6204(local25, arg0, arg1)) {
			local25 = this.method6202(false, arg0);
			if (local25 == null) {
				local25 = this.method6202(true, arg0);
			}
			if (local25 == null) {
				this.method6200("download");
				return null;
			}
			if (!this.method6199(local12, local25)) {
				return null;
			}
			local25 = this.method6201(local12);
			if (!this.method6204(local25, arg0, false)) {
				this.method6200("mismatch");
				return null;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean521 = true;
		this.aBoolean523 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean524 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!a;ZI)Z")
	private boolean method6204(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(16) byte[] local16 = local8.digest();
			for (@Pc(23) int local23 = 0; local23 < 20; local23++) {
				if (arg1.anIntArray606[local23] != local16[local23]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method6200("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean523 = this.aBoolean521 = false;
		this.aBoolean524 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}
}
