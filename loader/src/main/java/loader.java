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
	private static String aString74;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private static int anInt7274 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt7275;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt7276;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean489 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt7273 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean490 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean491 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean492 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method6514(@OriginalArg(1) String arg0) {
		if (this.aBoolean490) {
			return;
		}
		this.aBoolean490 = true;
		try {
			if (aString74 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString74 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZBLloader!ml;Lloader!f;)[B")
	private byte[] method6515(@OriginalArg(0) boolean arg0, @OriginalArg(2) Signlink arg1, @OriginalArg(3) Resource arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg1.getFile(arg2.aString73);
		} catch (@Pc(7) Exception local7) {
			this.method6514("nocache");
			return null;
		}
		@Pc(22) byte[] local22 = this.method6516(local5);
		if (!this.method6519(local22, arg0, arg2)) {
			local22 = this.method6518(arg2, false);
			if (local22 == null) {
				local22 = this.method6518(arg2, true);
			}
			if (local22 == null) {
				this.method6514("download");
				return null;
			}
			if (!this.method6517(local5, local22)) {
				return null;
			}
			local22 = this.method6516(local5);
			if (!this.method6519(local22, false, arg2)) {
				this.method6514("mismatch");
				return null;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method6516(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(16) int local16 = (int) arg0.length();
			@Pc(27) DataInputStream local27 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(30) byte[] local30 = new byte[local16];
			local27.readFully(local30, 0, local16);
			local27.close();
			return local30;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean489 = this.aBoolean491 = false;
		this.aBoolean492 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString75 = this.getParameter("unsignedurl");
			if (aString75 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean490 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString75), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString74 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || Resources.aStringArray68.length <= local39) {
					local39 = 0;
				}
			}
			@Pc(69) String local69 = this.getParameter("colourid");
			if (local69 != null) {
				anInt7274 = Integer.parseInt(local69);
				if (anInt7274 < 0 || Resources.anIntArray528.length <= anInt7274) {
					anInt7274 = 0;
				}
			}
			this.anInt7276 = this.getSize().width;
			this.anInt7275 = this.getSize().height;
			@Pc(102) int local102 = 32;
			try {
				@Pc(107) int local107 = Integer.parseInt(this.getParameter("modewhat"));
				local102 += local107;
			} catch (@Pc(113) Exception local113) {
			}
			try {
				@Pc(117) String local117 = this.getParameter("lang");
				if (local117 != null) {
					this.anInt7273 = Integer.parseInt(local117);
				}
			} catch (@Pc(126) Exception local126) {
			}
			@Pc(136) Signlink local136;
			try {
				local136 = new Signlink(this, local102, Resources.aStringArray68[local39], 29);
			} catch (@Pc(138) Exception local138) {
				this.method6514("nocache");
				return;
			}
			@Pc(145) unpack local145 = null;
			@Pc(155) byte[] local155;
			try {
				Class.forName("java.util.jar.Pack200");
				local155 = this.method6515(false, local136, Resources.aClass257_2);
				if (local155 == null) {
					return;
				}
				local145 = new Pack200Unpacker(local155);
			} catch (@Pc(166) Throwable local166) {
			}
			if (local145 == null) {
				local155 = this.method6515(false, local136, Resources.aClass257_1);
				if (local155 == null) {
					return;
				}
				@Pc(185) unpack local185 = new unpack(local155);
				@Pc(190) UnpackerClassLoader local190 = new UnpackerClassLoader(local185);
				@Pc(193) Class local193 = Class.forName("unpack");
				local190.method6513(local193.getName(), local193);
				@Pc(203) Class local203 = local190.loadClass("unpackclass");
				@Pc(210) byte[] local210 = this.method6515(false, local136, Resources.aClass257_3);
				if (local210 == null) {
					return;
				}
				local145 = (unpack) local203.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local210, Boolean.TRUE);
			}
			@Pc(244) UnpackerClassLoader local244 = new UnpackerClassLoader(local145);
			@Pc(246) byte local246 = -1;
			@Pc(250) String local250 = System.getProperty("os.name").toLowerCase();
			@Pc(254) String local254 = System.getProperty("os.arch").toLowerCase();
			if (local250.startsWith("win")) {
				if (local254.startsWith("amd64") || local254.startsWith("x86_64")) {
					local246 = 4;
				} else {
					local246 = 0;
				}
			} else if (local250.startsWith("linux")) {
				local246 = 1;
			} else if (local250.startsWith("mac")) {
				if (local254.startsWith("ppc")) {
					local246 = 2;
				} else if (local254.startsWith("x86_64")) {
					local246 = 5;
				} else {
					local246 = 3;
				}
			}
			if (local246 != -1) {
				for (@Pc(312) int local312 = 0; local312 < Resources.aClass257ArrayArray1[local246].length; local312++) {
					this.method6515(this.getParameter("suppress_sha") != null, local136, Resources.aClass257ArrayArray1[local246][local312]);
				}
			}
			if (Resources.aClass257Array1 != null) {
				local246 = -1;
				local250 = System.getProperty("os.name").toLowerCase();
				local254 = System.getProperty("os.arch").toLowerCase();
				if (local250.startsWith("win")) {
					if (local254.startsWith("amd64") || local254.startsWith("x86_64")) {
						local246 = 2;
					} else {
						local246 = 0;
					}
				}
				if (local246 != -1) {
					this.method6515(this.getParameter("suppress_sha") != null, local136, Resources.aClass257Array1[local246]);
				}
			}
			@Pc(398) Class local398 = Class.forName("FileOnDisk");
			local244.method6513(local398.getName(), local398);
			@Pc(407) Class local407 = Class.forName("Signlink");
			local244.method6513(local407.getName(), local407);
			@Pc(416) Class local416 = Class.forName("PrivilegedRequest");
			local244.method6513(local416.getName(), local416);
			@Pc(425) Class local425 = Class.forName("MonotonicClock");
			local244.method6513(local425.getName(), local425);
			@Pc(434) Class local434 = Class.forName("AudioSource");
			local244.method6513(local434.getName(), local434);
			@Pc(444) Class local444 = local244.loadClass("client");
			synchronized (this) {
				if (this.aBoolean492) {
					return;
				}
				this.anApplet2 = (Applet) local444.getDeclaredConstructor().newInstance();
				local444.getMethod("providesignlink", local407).invoke(null, local136);
				this.anApplet2.init();
				if (this.aBoolean489) {
					this.anApplet2.start();
				}
				if (this.aBoolean491) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(504) Exception local504) {
			TracingException.anInt7269 = -240750314;
			if (local504 instanceof InvocationTargetException) {
				@Pc(520) Throwable local520 = ((InvocationTargetException) local504).getTargetException();
				if (local520 instanceof ThreadDeath) {
					return;
				}
				TracingException.method6501(this, local504.toString(), local520);
			} else {
				TracingException.method6501(this, null, local504);
			}
			this.method6514("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;[B)Z")
	private boolean method6517(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(27) IOException local27) {
			this.method6514("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean492 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean489 = false;
		this.aBoolean491 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;ZZ)[B")
	private byte[] method6518(@OriginalArg(0) Resource arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Resources.anIntArray528[anInt7274]);
		@Pc(26) Color local26 = new Color(Resources.anIntArray527[anInt7274]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt7271];
		try {
			@Pc(41) InputStream local41;
			if (arg1) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg0.aString72 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg0.aString72)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local87 < local30.length) {
				@Pc(97) int local97 = local30.length - local87;
				if (local97 > 1000) {
					local97 = 1000;
				}
				@Pc(109) int local109 = local41.read(local30, local87, local97);
				if (local109 < 0) {
					throw new EOFException();
				}
				local87 += local109;
				@Pc(130) int local130 = local87 * 100 / local30.length;
				if (local130 != local85) {
					try {
						@Pc(137) Graphics local137 = this.getGraphics();
						if (local137 == null) {
							this.repaint();
						} else {
							local137.setColor(Color.black);
							local137.fillRect(0, 0, this.anInt7276, this.anInt7275);
							local137.setColor(local19);
							local137.drawRect(this.anInt7276 / 2 - 152, this.anInt7275 / 2 + -18, 303, 33);
							@Pc(190) String local190 = arg0.aStringArray69[this.anInt7273] + " - " + local130 + "%";
							local137.setFont(local8);
							local137.setColor(local26);
							local85 = local130;
							local137.drawString(local190, (this.anInt7276 - local12.stringWidth(local190)) / 2, this.anInt7275 / 2 + 4);
						}
					} catch (@Pc(217) Exception local217) {
					}
				}
			}
			local41.close();
			if (arg0.anInt7272 != arg0.anInt7271) {
				@Pc(234) byte[] local234 = new byte[arg0.anInt7272];
				@Pc(239) Inflater local239 = new Inflater(true);
				local239.setInput(local30);
				local239.inflate(local234);
				local30 = local234;
			}
		} catch (@Pc(250) Exception local250) {
			return null;
		}
		return this.method6519(local30, false, arg0) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BZLloader!f;)Z")
	private boolean method6519(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Resource arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(18) MessageDigest local18 = MessageDigest.getInstance("SHA");
			local18.reset();
			local18.update(arg0);
			@Pc(26) byte[] local26 = local18.digest();
			for (@Pc(28) int local28 = 0; local28 < 20; local28++) {
				if (local26[local28] != arg2.anIntArray529[local28]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(49) Exception local49) {
			this.method6514("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean491 = false;
		this.aBoolean489 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}
}
