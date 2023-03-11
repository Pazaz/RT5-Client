import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ms", name = "x", descriptor = "Ljava/awt/Frame;")
	public static Frame frame;
	@OriginalMember(owner = "client!tb", name = "W", descriptor = "Lclient!ml;")
	public static Signlink signlink;
	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	public static int canvasWidth;
	@OriginalMember(owner = "client!ju", name = "T", descriptor = "I")
	public static int canvasHeight;
	private static double canvasScale;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!un", name = "providesignlink", descriptor = "(Lclient!ml;)V")
	public static void providesignlink(@OriginalArg(0) Signlink arg0) {
		signlink = arg0;
		Static392.aClass152_6 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public final synchronized void method1379() {
		if (Static21.aCanvas1 != null) {
			Static21.aCanvas1.removeFocusListener(this);
			Static21.aCanvas1.getParent().remove(Static21.aCanvas1);
		}
		@Pc(18) Container local18;
		if (Static363.frame != null) {
			local18 = Static363.frame;
		} else if (frame == null) {
			local18 = signlink.applet;
		} else {
			local18 = frame;
		}
		local18.setLayout(null);
		Static21.aCanvas1 = new GameCanvas(this);
		local18.add(Static21.aCanvas1);
		Static21.aCanvas1.setSize(canvasWidth, canvasHeight);
		Static21.aCanvas1.setVisible(true);
		if (local18 == frame) {
			@Pc(54) Insets local54 = frame.getInsets();
			Static21.aCanvas1.setLocation(local54.left + Static84.anInt1842, local54.top + Static68.anInt1646);
		} else {
			Static21.aCanvas1.setLocation(Static84.anInt1842, Static68.anInt1646);
		}
		Static21.aCanvas1.addFocusListener(this);
		Static21.aCanvas1.requestFocus();
		Static371.aBoolean475 = true;
		Static242.aBoolean306 = true;
		Static328.aBoolean412 = true;
		Static122.aBoolean176 = false;
		Static48.aLong37 = MonotonicClock.currentTimeMillis();
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	public final void method1382() {
		if (this.aBoolean94) {
			return;
		}
		try {
			@Pc(21) PrivilegedRequest local21 = signlink.loadMiscNatives(Static253.anApplet_Sub1_1.getClass());
			while (local21.status == 0) {
				Static231.method4023(100L);
			}
			if (local21.result != null) {
				throw (Throwable) local21.result;
			}
			jagmisc.init();
			this.aBoolean94 = true;
			Static316.aClass5_1 = Static65.method1738();
		} catch (@Pc(46) Throwable local46) {
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIZIILjava/lang/String;II)V")
	protected final void startApplication(@OriginalArg(5) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static84.anInt1842 = 0;
			Static253.anApplet_Sub1_1 = this;
			Static277.anInt5115 = 578;
			canvasWidth = 1024;
			Static142.anInt2663 = 1024;
			canvasHeight = 768;
			Static178.anInt2319 = 768;
			Static68.anInt1646 = 0;
			frame = new Frame();
			frame.setTitle("Jagex");
			frame.setResizable(true);
			frame.addWindowListener(this);
			frame.setVisible(true);
			frame.toFront();
			@Pc(48) Insets local48 = frame.getInsets();
			frame.setSize(local48.right + local48.left + Static142.anInt2663, local48.bottom + local48.top + Static178.anInt2319);
			Static392.aClass152_6 = signlink = new Signlink(null, arg1, arg0, 29);
			@Pc(82) PrivilegedRequest local82 = signlink.startThread(1, this);
			while (local82.status == 0) {
				Static231.method4023(10L);
			}
		} catch (@Pc(95) Exception local95) {
			Static262.report(local95, null);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
	protected abstract void method1384();

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	protected abstract void mainLoop();

	@OriginalMember(owner = "client!un", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getCodeBase() : signlink.applet.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!un", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V")
	protected abstract void method1386();

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V")
	protected abstract void method1387();

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(I)Z")
	protected final boolean method1388() {
		return true;
	}

	@OriginalMember(owner = "client!un", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getParameter(arg0) : signlink.applet.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(B)V")
	protected abstract void method1389();

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V")
	private void method1390() {
		@Pc(11) long local11 = MonotonicClock.currentTimeMillis();
		@Pc(15) long local15 = Static292.aLongArray9[Static255.anInt4703];
		Static292.aLongArray9[Static255.anInt4703] = local11;
		@Pc(34) boolean local34;
		if (local15 == 0L || local15 >= local11) {
			local34 = false;
		} else {
			local34 = true;
		}
		Static255.anInt4703 = Static255.anInt4703 + 1 & 0x1F;
		synchronized (this) {
			Static242.aBoolean306 = Static371.aBoolean475;
		}
		this.method1384();
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V")
	private void method1391() {
		@Pc(6) long local6 = MonotonicClock.currentTimeMillis();
		@Pc(10) long local10 = Static357.aLongArray12[Static76.anInt1739];
		Static357.aLongArray12[Static76.anInt1739] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(29) int local29 = (int) (local6 - local10);
			Static3.anInt62 = ((local29 >> 1) + 32000) / local29;
		}
		Static76.anInt1739 = Static76.anInt1739 + 1 & 0x1F;
		if (Static210.anInt3761++ > 50) {
			Static328.aBoolean412 = true;
			Static210.anInt3761 -= 50;
			Static21.aCanvas1.setSize(canvasWidth, canvasHeight);
			Static21.aCanvas1.setVisible(true);
			if (frame != null && Static363.frame == null) {
				@Pc(76) Insets local76 = frame.getInsets();
				Static21.aCanvas1.setLocation(local76.left + Static84.anInt1842, Static68.anInt1646 + local76.top);
			} else {
				Static21.aCanvas1.setLocation(Static84.anInt1842, Static68.anInt1646);
			}
		}
		this.mainLoop();
	}

	@OriginalMember(owner = "client!un", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static253.anApplet_Sub1_1 == this && !Static111.aBoolean167) {
			Static393.aLong231 = MonotonicClock.currentTimeMillis();
			Static231.method4023(5000L);
			Static392.aClass152_6 = null;
			this.method1395(false);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1392(@OriginalArg(1) String arg0) {
		if (this.aBoolean95) {
			return;
		}
		this.aBoolean95 = true;
		System.out.println("error_game_" + arg0);
		try {
			BrowserControl.call(signlink.applet, "loggedout");
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!un", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!un", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getDocumentBase() : signlink.applet.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII)V")
	protected final void method1394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static253.anApplet_Sub1_1 == null) {
				canvasHeight = arg2;
				Static178.anInt2319 = arg2;
				Static277.anInt5115 = 578;
				Static84.anInt1842 = 0;
				Static253.anApplet_Sub1_1 = this;
				Static68.anInt1646 = 0;
				canvasWidth = arg0;
				Static142.anInt2663 = arg0;
				if (signlink == null) {
					Static392.aClass152_6 = signlink = new Signlink(this, arg1, null, 0);
				}
				@Pc(66) PrivilegedRequest local66 = signlink.startThread(1, this);
				while (local66.status == 0) {
					Static231.method4023(10L);
				}
			} else {
				Static373.anInt7032++;
				if (Static373.anInt7032 >= 3) {
					this.method1392("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(76) Exception local76) {
			Static262.report(local76, null);
			this.method1392("crash");
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BZ)V")
	private void method1395(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static111.aBoolean167) {
				return;
			}
			Static111.aBoolean167 = true;
		}
		if (signlink.applet != null) {
			signlink.applet.destroy();
		}
		try {
			this.method1386();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean94) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean94 = false;
		}
		@Pc(48) PrivilegedRequest local48 = signlink.unloadNatives(Static253.anApplet_Sub1_1.getClass());
		while (local48.status == 0) {
			Static231.method4023(100L);
		}
		if (Static21.aCanvas1 != null) {
			try {
				Static21.aCanvas1.removeFocusListener(this);
				Static21.aCanvas1.getParent().remove(Static21.aCanvas1);
			} catch (@Pc(67) Exception local67) {
			}
		}
		if (signlink != null) {
			try {
				signlink.stop();
			} catch (@Pc(75) Exception local75) {
			}
		}
		this.method1389();
		if (frame != null) {
			try {
				System.exit(0);
			} catch (@Pc(89) Throwable local89) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!un", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getAppletContext() : signlink.applet.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static371.aBoolean475 = false;
	}

	@OriginalMember(owner = "client!un", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Signlink.javaVendor != null) {
					@Pc(10) String local10 = Signlink.javaVendor.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Signlink.javaVersion;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method1392("wrongjava");
							break label113;
						}
					} else if (local10.indexOf("ibm") != -1 && (Signlink.javaVersion == null || Signlink.javaVersion.equals("1.4.2"))) {
						this.method1392("wrongjava");
						break label113;
					}
				}
				@Pc(70) int local70;
				if (Signlink.javaVersion != null && Signlink.javaVersion.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (local70 < Signlink.javaVersion.length()) {
						@Pc(78) char local78 = Signlink.javaVersion.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local72 = local78 + local72 * 10 - 48;
						local70++;
					}
					if (local72 >= 5) {
						Static370.aBoolean473 = true;
					}
				}
				if (signlink.applet != null) {
					@Pc(111) Method local111 = Signlink.setFocusCycleRoot;
					if (local111 != null) {
						try {
							local111.invoke(signlink.applet, Boolean.TRUE);
						} catch (@Pc(126) Throwable local126) {
						}
					}
				}
				Static57.method1620();
				Static60.method886();
				this.method1379();
				this.method1387();
				Static316.aClass5_1 = Static65.method1738();
				this.method1382();
				while (Static393.aLong231 == 0L || MonotonicClock.currentTimeMillis() < Static393.aLong231) {
					Static10.anInt247 = Static316.aClass5_1.method4409(Static44.anInt1106);
					for (local70 = 0; local70 < Static10.anInt247; local70++) {
						this.method1390();
					}
					this.method1391();
					Static283.method4876(signlink, Static21.aCanvas1);
				}
			}
		} catch (@Pc(179) Exception local179) {
			Static262.report(local179, null);
			this.method1392("crash");
		}
		this.method1395(true);
	}

	@OriginalMember(owner = "client!un", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static371.aBoolean475 = true;
		Static328.aBoolean412 = true;
	}

	@OriginalMember(owner = "client!un", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static253.anApplet_Sub1_1 == this && !Static111.aBoolean167) {
			Static393.aLong231 = 0L;
		}
	}

	@OriginalMember(owner = "client!un", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static253.anApplet_Sub1_1 != this || Static111.aBoolean167) {
			return;
		}
		Static328.aBoolean412 = true;
		if (Static370.aBoolean473 && MonotonicClock.currentTimeMillis() - Static48.aLong37 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static142.anInt2663 <= local26.width && Static178.anInt2319 <= local26.height) {
				Static122.aBoolean176 = true;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static253.anApplet_Sub1_1 == this && !Static111.aBoolean167) {
			Static393.aLong231 = MonotonicClock.currentTimeMillis() + 4000L;
		}
	}
}
