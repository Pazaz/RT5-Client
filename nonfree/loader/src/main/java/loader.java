import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
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

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString143;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString144;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private static int anInt10948 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean830;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt10949;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt10950;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet5;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!h;")
	private Class412 lb;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt10947 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean832 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean831 = false;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean833 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean834 = false;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean833 = false;
		this.setBackground(Color.black);
		@Pc(20) Thread local20 = new Thread(this);
		local20.start();
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString143 = this.getParameter("unsignedurl");
			if (aString143 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean832 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString143), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString144 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || local38 >= Class411.aStringArray50.length) {
					local38 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt10948 = Integer.parseInt(local62);
				if (anInt10948 < 0 || anInt10948 >= Class411.anIntArray894.length) {
					anInt10948 = 0;
				}
			}
			this.lb = Class411.aClass412Array1[anInt10948];
			this.anInt10950 = this.getSize().width;
			this.anInt10949 = this.getSize().height;
			@Pc(99) int local99 = 32;
			try {
				@Pc(104) int local104 = Integer.parseInt(this.getParameter("modewhat"));
				local99 += local104;
			} catch (@Pc(110) Exception local110) {
			}
			try {
				@Pc(114) String local114 = this.getParameter("lang");
				if (local114 != null) {
					this.anInt10947 = Integer.parseInt(local114);
				}
			} catch (@Pc(123) Exception local123) {
			}
			Class413.method9489(local99, Class411.aStringArray50[local38]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString137, 0, this.lb.anInt10945);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10946);
					this.bar = this.method9474(this.lb.aString139);
					this.background = this.method9474(this.lb.aString133);
					this.left = this.method9474(this.lb.aString135);
					this.right = this.method9474(this.lb.aString134);
					this.top = this.method9474(this.lb.aString142);
					this.bottom = this.method9474(this.lb.aString141);
					this.bodyLeft = this.method9474(this.lb.aString136);
					this.bodyRight = this.method9474(this.lb.aString138);
					this.bodyFill = this.method9474(this.lb.aString140);
					@Pc(278) Image[] local278 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(283) MediaTracker local283 = new MediaTracker(this);
					for (@Pc(285) int local285 = 0; local285 < local278.length; local285++) {
						local283.addImage(local278[local285], local285);
					}
					while (true) {
						try {
							local283.waitForAll();
							break;
						} catch (@Pc(302) InterruptedException local302) {
						}
					}
				} catch (@Pc(306) Throwable local306) {
					this.method9483();
				}
			}
			@Pc(311) unpack local311 = null;
			@Pc(319) byte[] local319;
			try {
				Class.forName("java.util.jar.Pack200");
				local319 = this.method9482(Class411.aClass410_2);
				if (local319 == null) {
					return;
				}
				local311 = new unpack_Sub1(local319);
			} catch (@Pc(330) Throwable local330) {
			}
			if (local311 == null) {
				local319 = this.method9482(Class411.aClass410_1);
				if (local319 == null) {
					return;
				}
				@Pc(347) unpack local347 = new unpack(local319);
				@Pc(352) ClassLoader_Sub1 local352 = new ClassLoader_Sub1(local347);
				@Pc(355) Class local355 = Class.forName("unpack");
				local352.method9465(local355.getName(), local355);
				@Pc(365) Class local365 = local352.loadClass("unpackclass");
				@Pc(370) byte[] local370 = this.method9482(Class411.aClass410_3);
				if (local370 == null) {
					return;
				}
				local311 = (unpack) local365.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local370, Boolean.TRUE);
			}
			@Pc(406) ClassLoader_Sub1 local406 = new ClassLoader_Sub1(local311);
			@Pc(409) Class local409 = Class.forName("Class413");
			local406.method9465(local409.getName(), local409);
			@Pc(419) Class local419 = local406.loadClass("client");
			synchronized (this) {
				if (this.aBoolean833) {
					return;
				}
				this.anApplet5 = (Applet) local419.getDeclaredConstructor().newInstance();
				local419.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet5.init();
				if (this.aBoolean834) {
					this.anApplet5.start();
				}
				if (this.aBoolean831) {
					this.anApplet5.stop();
				}
			}
			this.method9475();
		} catch (@Pc(488) Exception local488) {
			RuntimeException_Sub2.anInt10944 = 352513979;
			if (local488 instanceof InvocationTargetException) {
				@Pc(504) Throwable local504 = ((InvocationTargetException) local488).getTargetException();
				if (local504 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9473(local488.toString(), this, local504);
			} else {
				RuntimeException_Sub2.method9473((String) null, this, local488);
			}
			this.method9484("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method9474(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(21) int local21 = 0;
			@Pc(25) int local25;
			while ((local25 = local6.read()) != -1) {
				local9[local21++] = (byte) local25;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(43) Exception local43) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9475() {
		this.anImage14 = null;
		this.aColor2 = null;
		this.aColor3 = null;
		this.barBuf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIILjava/lang/String;)Z")
	private boolean method9476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		return Class411.aClass412Array1[anInt10948] == null || this.aBoolean830 ? this.method9479(arg0, arg2) : this.method9485(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean834 = this.aBoolean831 = false;
		this.aBoolean833 = true;
		if (this.anApplet5 != null) {
			this.anApplet5.destroy();
		}
		this.anApplet5 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean834 = false;
		this.aBoolean831 = true;
		if (this.anApplet5 != null) {
			this.anApplet5.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!c;BZ)[B")
	private byte[] method9477(@OriginalArg(0) Class410 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10943];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(32) InputStream local32;
			if (arg1) {
				@Pc(37) URL local37 = this.getCodeBase();
				@Pc(45) Socket local45 = new Socket(InetAddress.getByName(local37.getHost()), 443);
				local45.setSoTimeout(10000);
				@Pc(51) OutputStream local51 = local45.getOutputStream();
				local51.write(17);
				local51.write(("JAGGRAB " + local37.getFile() + arg0.aString130 + "\n\n").getBytes());
				local32 = local45.getInputStream();
			} else {
				local32 = (new URL(this.getCodeBase(), arg0.aString130)).openStream();
			}
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = 0;
			@Pc(80) int local80 = 0;
			while (true) {
				if (local5.length <= local78) {
					local32.close();
					if (arg0.anInt10942 != arg0.anInt10943) {
						@Pc(190) byte[] local190 = new byte[arg0.anInt10942];
						@Pc(195) Inflater local195 = new Inflater(true);
						local195.setInput(local5);
						local195.inflate(local190);
						local5 = local190;
					}
					break;
				}
				@Pc(94) int local94 = local5.length - local78;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(107) int local107 = local32.read(local5, local78, local94);
				if (local107 < 0) {
					throw new EOFException();
				}
				local78 += local107;
				@Pc(125) int local125 = local78 * 100 / local5.length;
				@Pc(127) int local127 = 0;
				if (this.lb != null && this.bar != null) {
					local127 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
				}
				if (local76 != local125 || local127 != local80) {
					try {
						if (this.method9476(local125, local127, arg0.aStringArray49[this.anInt10947])) {
							local76 = local125;
							local80 = local127;
						}
					} catch (@Pc(176) Exception local176) {
					}
				}
			}
		} catch (@Pc(206) Exception local206) {
			return null;
		}
		return this.method9481(local5, arg0) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method9478(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(26) DataInputStream local26 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(29) byte[] local29 = new byte[local9];
			local26.readFully(local29, 0, local9);
			local26.close();
			return local29;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet5 != null) {
			this.anApplet5.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean834 = true;
		this.aBoolean831 = false;
		if (this.anApplet5 != null) {
			this.anApplet5.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;)Z")
	private boolean method9479(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class411.anIntArray894[anInt10948]);
			this.aColor3 = new Color(Class411.anIntArray895[anInt10948]);
			this.colourtext = new Color(Class411.anIntArray893[anInt10948]);
		}
		@Pc(44) Graphics local44 = this.getGraphics();
		if (local44 == null) {
			this.repaint();
			return false;
		}
		@Pc(88) int local88;
		@Pc(95) int local95;
		@Pc(163) String local163;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10950, this.anInt10949);
			}
			@Pc(66) Graphics local66 = this.anImage14.getGraphics();
			local66.setColor(Color.black);
			local66.fillRect(0, 0, this.anInt10950, this.anInt10949);
			local66.setColor(this.aColor2);
			local88 = this.anInt10950 / 2 - 152;
			local95 = this.anInt10949 / 2 - 18;
			local66.drawRect(local88, local95, 303, 33);
			local66.setColor(this.aColor3);
			local66.fillRect(local88 + 2, local95 + 2, arg0 * 3, 30);
			local66.setColor(Color.black);
			local66.drawRect(local88 + 1, local95 - -1, 301, 31);
			local66.fillRect(local88 + arg0 * 3 + 2, local95 + 2, 300 - arg0 * 3, 30);
			local163 = arg1 + " - " + arg0 + "%";
			local66.setFont(this.bf);
			local66.setColor(this.colourtext);
			local66.drawString(local163, (this.anInt10950 - this.bfm.stringWidth(local163)) / 2, this.anInt10949 / 2 + 4);
			local44.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(200) Exception local200) {
			local44.setColor(Color.black);
			local44.fillRect(0, 0, this.anInt10950, this.anInt10949);
			local44.setColor(this.aColor2);
			local88 = this.anInt10950 / 2 - 152;
			local95 = this.anInt10949 / 2 - 18;
			local44.drawRect(local88, local95, 303, 33);
			local44.setColor(this.aColor3);
			local44.fillRect(local88 + 2, local95 + 2, arg0 * 3, 30);
			local44.setColor(Color.black);
			local44.drawRect(local88 + 1, local95 - -1, 301, 31);
			local44.fillRect(local88 + arg0 * 3 + 2, local95 + 2, 300 - arg0 * 3, 30);
			local163 = arg1 + " - " + arg0 + "%";
			local44.setFont(this.bf);
			local44.setColor(this.colourtext);
			local44.drawString(local163, (this.anInt10950 - this.bfm.stringWidth(local163)) / 2, this.anInt10949 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method9480(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method9484("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet5 != null) {
			this.anApplet5.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!c;B)Z")
	private boolean method9481(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class410 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(23) byte[] local23 = local10.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (arg1.anIntArray892[local25] != local23[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method9484("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!c;B)[B")
	private byte[] method9482(@OriginalArg(0) Class410 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class413.method9488(arg0.aString131);
		} catch (@Pc(6) Exception local6) {
			this.method9484("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method9478(local4);
		if (!this.method9481(local24, arg0)) {
			local24 = this.method9477(arg0, false);
			if (local24 == null) {
				local24 = this.method9477(arg0, true);
			}
			if (local24 == null) {
				this.method9484("download");
				return null;
			}
			if (!this.method9480(local24, local4)) {
				return null;
			}
			local24 = this.method9478(local4);
			if (!this.method9481(local24, arg0)) {
				this.method9484("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method9483() {
		this.aBoolean830 = true;
		this.bfm = null;
		this.bf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method9484(@OriginalArg(1) String arg0) {
		if (this.aBoolean832) {
			return;
		}
		this.aBoolean832 = true;
		try {
			if (aString144 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString144 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
	private boolean method9485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10950, this.anInt10949);
			this.canvas.setVisible(true);
		}
		@Pc(33) Graphics local33 = this.canvas.getGraphics();
		if (local33 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10950, this.anInt10949);
			}
			@Pc(55) Graphics local55 = this.anImage14.getGraphics();
			@Pc(60) int local60 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(65) int local65 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(70) int local70 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(75) int local75 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(80) int local80 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(85) int local85 = this.bodyFill.getHeight((ImageObserver) null);
			local55.drawImage(this.bodyLeft, this.method9487(local60) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9486(local75) - -this.lb.boxYOffset, (ImageObserver) null);
			@Pc(128) int local128 = this.lb.boxXOffset + local60 - this.lb.boxWidth / 2;
			@Pc(138) int local138 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(140) int local140;
			for (local140 = local128; local140 <= local138; local140 += local70) {
				local55.drawImage(this.bodyFill, local140 + this.method9487(local60) + this.lb.boxXOffset, this.method9486(local85) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local55.drawImage(this.bodyRight, this.method9487(local65) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9486(local80) - -this.lb.boxYOffset, (ImageObserver) null);
			local140 = this.left.getWidth((ImageObserver) null);
			@Pc(218) int local218 = this.left.getHeight((ImageObserver) null);
			@Pc(223) int local223 = this.right.getWidth((ImageObserver) null);
			@Pc(228) int local228 = this.right.getHeight((ImageObserver) null);
			@Pc(233) int local233 = this.bottom.getHeight((ImageObserver) null);
			@Pc(238) int local238 = this.top.getWidth((ImageObserver) null);
			@Pc(243) int local243 = this.top.getHeight((ImageObserver) null);
			@Pc(248) int local248 = this.bottom.getWidth((ImageObserver) null);
			@Pc(253) int local253 = this.bar.getWidth((ImageObserver) null);
			@Pc(258) int local258 = this.background.getWidth((ImageObserver) null);
			@Pc(269) int local269 = this.method9487(this.lb.width) + this.lb.xOffset;
			@Pc(281) int local281 = this.method9486(this.lb.height) + this.lb.yOffset;
			local55.drawImage(this.left, local269, local281 + (this.lb.height - local218) / 2, (ImageObserver) null);
			local55.drawImage(this.right, local269 + this.lb.width - local223, local281 - -((this.lb.height - local228) / 2), (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local223 - local140, this.lb.height);
			}
			@Pc(348) Graphics local348 = this.barBuf.getGraphics();
			@Pc(350) int local350;
			for (local350 = 0; local350 < this.lb.width - local223 - local140; local350 += local238) {
				local348.drawImage(this.top, local350, 0, (ImageObserver) null);
			}
			for (local350 = 0; local350 < this.lb.width - local140 - local223; local350 += local248) {
				local348.drawImage(this.bottom, local350, this.lb.height - local233, (ImageObserver) null);
			}
			local350 = (this.lb.width - local140 - local223) * arg0 / 100;
			if (local350 > 0) {
				@Pc(433) Image local433 = this.createImage(local350, this.lb.height - local243 - local233);
				@Pc(437) int local437 = local433.getWidth((ImageObserver) null);
				@Pc(440) Graphics local440 = local433.getGraphics();
				for (@Pc(445) int local445 = arg1 - local253; local445 < local437; local445 += local253) {
					local440.drawImage(this.bar, local445, 0, (ImageObserver) null);
				}
				local348.drawImage(local433, 0, local243, (ImageObserver) null);
			}
			@Pc(471) int local471 = local350;
			local350 = this.lb.width - local140 - local223 - local350;
			if (local350 > 0) {
				@Pc(501) Image local501 = this.createImage(local350, this.lb.height - local243 - local233);
				@Pc(505) int local505 = local501.getWidth((ImageObserver) null);
				@Pc(508) Graphics local508 = local501.getGraphics();
				for (@Pc(510) int local510 = 0; local510 < local505; local510 += local258) {
					local508.drawImage(this.background, local510, 0, (ImageObserver) null);
				}
				local348.drawImage(local501, local471, local243, (ImageObserver) null);
			}
			local55.drawImage(this.barBuf, local140 + local269, local281, (ImageObserver) null);
			local55.setFont(this.bf);
			local55.setColor(this.colourtext);
			@Pc(565) String local565 = arg2 + " - " + arg0 + "%";
			local55.drawString(local565, local269 + (this.lb.width - this.bfm.stringWidth(local565)) / 2, this.lb.height / 2 + 4 + local281 + this.lb.textYOffset);
			local33.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(605) Exception local605) {
			this.method9483();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9486(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10949 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method9487(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt10950 - arg0) / 2 : 0;
	}
}
