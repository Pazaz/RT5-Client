import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
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

@OriginalClass("client!gk")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	private void method898() {
		@Pc(6) long local6 = Static325.method5658();
		@Pc(10) long local10 = Static264.aLongArray7[Static51.anInt1571];
		Static264.aLongArray7[Static51.anInt1571] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(28) int local28 = (int) (local6 - local10);
			Static354.anInt7382 = ((local28 >> 1) + 32000) / local28;
		}
		Static51.anInt1571 = Static51.anInt1571 + 1 & 0x1F;
		if (Static238.anInt5296++ > 50) {
			Static243.aBoolean376 = true;
			Static238.anInt5296 -= 50;
			Static86.aCanvas2.setSize(Static107.anInt2674, Static350.anInt7318);
			Static86.aCanvas2.setVisible(true);
			if (Static252.aFrame2 != null && Static112.aFrame1 == null) {
				@Pc(71) Insets local71 = Static252.aFrame2.getInsets();
				Static86.aCanvas2.setLocation(local71.left + Static108.anInt2685, Static88.anInt2337 + local71.top);
			} else {
				Static86.aCanvas2.setLocation(Static108.anInt2685, Static88.anInt2337);
			}
		}
		this.method912();
	}

	@OriginalMember(owner = "client!gk", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static13.anApplet_Sub1_3 == this && !Static100.aBoolean324) {
			Static351.aLong232 = Static325.method5658() + 4000L;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBIII)V")
	protected final void method899(@OriginalArg(2) int arg0) {
		try {
			if (Static13.anApplet_Sub1_3 == null) {
				Static108.anInt2685 = 0;
				Static107.anInt2674 = 765;
				Static264.anInt5603 = 765;
				Static88.anInt2337 = 0;
				Static13.anApplet_Sub1_3 = this;
				Static350.anInt7318 = 503;
				Static222.anInt5038 = 503;
				Static200.anInt4584 = 562;
				if (Static184.aClass199_12 == null) {
					Static122.aClass199_7 = Static184.aClass199_12 = new Class199(this, arg0, null, 0);
				}
				@Pc(68) Class145 local68 = Static184.aClass199_12.method5482(this, 1);
				while (local68.anInt5065 == 0) {
					Static295.method5212(10L);
				}
			} else {
				Static101.anInt2513++;
				if (Static101.anInt2513 >= 3) {
					this.method910("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(78) Exception local78) {
			Static58.method1402(null, local78);
			this.method910("crash");
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public final void method901() {
		if (this.aBoolean68) {
			return;
		}
		try {
			@Pc(14) Class145 local14 = Static184.aClass199_12.method5484(Static13.anApplet_Sub1_3.getClass());
			while (local14.anInt5065 == 0) {
				Static295.method5212(100L);
			}
			if (local14.anObject6 != null) {
				throw (Throwable) local14.anObject6;
			}
			jagmisc.init();
			this.aBoolean68 = true;
			Static150.aClass106_1 = Static25.method627();
		} catch (@Pc(42) Throwable local42) {
		}
	}

	@OriginalMember(owner = "client!gk", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BIIIIZILjava/lang/String;)V")
	protected final void method903(@OriginalArg(3) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static107.anInt2674 = 1024;
			Static264.anInt5603 = 1024;
			Static108.anInt2685 = 0;
			Static200.anInt4584 = 562;
			Static350.anInt7318 = 768;
			Static222.anInt5038 = 768;
			Static88.anInt2337 = 0;
			Static13.anApplet_Sub1_3 = this;
			Static252.aFrame2 = new Frame();
			Static252.aFrame2.setTitle("Jagex");
			Static252.aFrame2.setResizable(true);
			Static252.aFrame2.addWindowListener(this);
			Static252.aFrame2.setVisible(true);
			Static252.aFrame2.toFront();
			@Pc(38) Insets local38 = Static252.aFrame2.getInsets();
			Static252.aFrame2.setSize(local38.right + Static264.anInt5603 + local38.left, Static222.anInt5038 - -local38.top - -local38.bottom);
			Static122.aClass199_7 = Static184.aClass199_12 = new Class199(null, arg0, arg1, 29);
			@Pc(73) Class145 local73 = Static184.aClass199_12.method5482(this, 1);
			while (local73.anInt5065 == 0) {
				Static295.method5212(10L);
			}
		} catch (@Pc(88) Exception local88) {
			Static58.method1402(null, local88);
		}
	}

	@OriginalMember(owner = "client!gk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static192.aBoolean315 = true;
		Static243.aBoolean376 = true;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V")
	private void method904() {
		@Pc(6) long local6 = Static325.method5658();
		@Pc(10) long local10 = Static229.aLongArray6[Static145.anInt3595];
		Static229.aLongArray6[Static145.anInt3595] = local6;
		@Pc(29) boolean local29;
		if (local10 == 0L || local10 >= local6) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static145.anInt3595 = Static145.anInt3595 + 1 & 0x1F;
		synchronized (this) {
			Static120.aBoolean201 = Static192.aBoolean315;
		}
		this.method906();
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
	public final synchronized void method905() {
		if (Static86.aCanvas2 != null) {
			Static86.aCanvas2.removeFocusListener(this);
			Static86.aCanvas2.getParent().remove(Static86.aCanvas2);
		}
		@Pc(18) Container local18;
		if (Static112.aFrame1 != null) {
			local18 = Static112.aFrame1;
		} else if (Static252.aFrame2 == null) {
			local18 = Static184.aClass199_12.anApplet1;
		} else {
			local18 = Static252.aFrame2;
		}
		local18.setLayout(null);
		Static86.aCanvas2 = new Canvas_Sub1(this);
		local18.add(Static86.aCanvas2);
		Static86.aCanvas2.setSize(Static107.anInt2674, Static350.anInt7318);
		Static86.aCanvas2.setVisible(true);
		if (local18 == Static252.aFrame2) {
			@Pc(66) Insets local66 = Static252.aFrame2.getInsets();
			Static86.aCanvas2.setLocation(local66.left + Static108.anInt2685, local66.top + Static88.anInt2337);
		} else {
			Static86.aCanvas2.setLocation(Static108.anInt2685, Static88.anInt2337);
		}
		Static86.aCanvas2.addFocusListener(this);
		Static86.aCanvas2.requestFocus();
		Static192.aBoolean315 = true;
		Static120.aBoolean201 = true;
		Static243.aBoolean376 = true;
		Static11.aBoolean516 = false;
		Static309.aLong202 = Static325.method5658();
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)V")
	protected abstract void method906();

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
	protected abstract void method907();

	@OriginalMember(owner = "client!gk", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static252.aFrame2 == null) {
			return Static184.aClass199_12 == null || Static184.aClass199_12.anApplet1 == this ? super.getCodeBase() : Static184.aClass199_12.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gk", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!gk", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static13.anApplet_Sub1_3 == this && !Static100.aBoolean324) {
			Static351.aLong232 = Static325.method5658();
			Static295.method5212(5000L);
			Static122.aClass199_7 = null;
			this.method908(false);
		}
	}

	@OriginalMember(owner = "client!gk", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static252.aFrame2 == null) {
			return Static184.aClass199_12 == null || Static184.aClass199_12.anApplet1 == this ? super.getAppletContext() : Static184.aClass199_12.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZB)V")
	private void method908(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static100.aBoolean324) {
				return;
			}
			Static100.aBoolean324 = true;
		}
		if (Static184.aClass199_12.anApplet1 != null) {
			Static184.aClass199_12.anApplet1.destroy();
		}
		try {
			this.method907();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean68) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean68 = false;
		}
		@Pc(52) Class145 local52 = Static184.aClass199_12.method5478(Static13.anApplet_Sub1_3.getClass());
		while (local52.anInt5065 == 0) {
			Static295.method5212(100L);
		}
		if (Static86.aCanvas2 != null) {
			try {
				Static86.aCanvas2.removeFocusListener(this);
				Static86.aCanvas2.getParent().remove(Static86.aCanvas2);
			} catch (@Pc(71) Exception local71) {
			}
		}
		if (Static184.aClass199_12 != null) {
			try {
				Static184.aClass199_12.method5487();
			} catch (@Pc(79) Exception local79) {
			}
		}
		this.method911();
		if (Static252.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(89) Throwable local89) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method910(@OriginalArg(1) String arg0) {
		if (this.aBoolean67) {
			return;
		}
		this.aBoolean67 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static358.method1001(Static184.aClass199_12.anApplet1, "loggedout");
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V")
	protected abstract void method911();

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(B)V")
	protected abstract void method912();

	@OriginalMember(owner = "client!gk", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!gk", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static252.aFrame2 == null) {
			return Static184.aClass199_12 == null || Static184.aClass199_12.anApplet1 == this ? super.getParameter(arg0) : Static184.aClass199_12.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gk", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static13.anApplet_Sub1_3 == this && !Static100.aBoolean324) {
			Static351.aLong232 = 0L;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	protected abstract void method914();

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(B)Z")
	protected final boolean method915() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.equals("jagex.com") || local8.endsWith(".jagex.com")) {
			return true;
		} else if (local8.equals("runescape.com") || local8.endsWith(".runescape.com")) {
			return true;
		} else if (local8.equals("stellardawn.com") || local8.endsWith(".stellardawn.com")) {
			return true;
		} else if (local8.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local8.length() > 0 && local8.charAt(local8.length() - 1) >= '0' && local8.charAt(local8.length() - 1) <= '9') {
				local8 = local8.substring(0, local8.length() - 1);
			}
			if (local8.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method910("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static192.aBoolean315 = false;
	}

	@OriginalMember(owner = "client!gk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static13.anApplet_Sub1_3 != this || Static100.aBoolean324) {
			return;
		}
		Static243.aBoolean376 = true;
		if (Static353.aBoolean519 && Static325.method5658() - Static309.aLong202 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static264.anInt5603 <= local26.width && Static222.anInt5038 <= local26.height) {
				Static11.aBoolean516 = true;
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static252.aFrame2 == null) {
			return Static184.aClass199_12 == null || Static184.aClass199_12.anApplet1 == this ? super.getDocumentBase() : Static184.aClass199_12.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gk", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label116: {
				if (Static313.aString243 != null) {
					@Pc(6) String local6 = Static313.aString243.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(18) String local18 = Static313.aString249;
						if (local18.equals("1.1") || local18.startsWith("1.1.") || local18.equals("1.2") || local18.startsWith("1.2.")) {
							this.method910("wrongjava");
							break label116;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static313.aString249 == null || Static313.aString249.equals("1.4.2"))) {
						this.method910("wrongjava");
						break label116;
					}
				}
				@Pc(65) int local65;
				if (Static313.aString249 != null && Static313.aString249.startsWith("1.")) {
					local65 = 2;
					@Pc(67) int local67 = 0;
					while (local65 < Static313.aString249.length()) {
						@Pc(73) char local73 = Static313.aString249.charAt(local65);
						if (local73 < '0' || local73 > '9') {
							break;
						}
						local65++;
						local67 = local67 * 10 + local73 - '0';
					}
					if (local67 >= 5) {
						Static353.aBoolean519 = true;
					}
				}
				if (Static184.aClass199_12.anApplet1 != null) {
					@Pc(111) Method local111 = Static313.aMethod2;
					if (local111 != null) {
						try {
							local111.invoke(Static184.aClass199_12.anApplet1, Boolean.TRUE);
						} catch (@Pc(126) Throwable local126) {
						}
					}
				}
				Static139.method3058();
				Static229.method4361();
				this.method905();
				this.method914();
				Static150.aClass106_1 = Static25.method627();
				this.method901();
				while (Static351.aLong232 == 0L || Static351.aLong232 > Static325.method5658()) {
					Static234.anInt5229 = Static150.aClass106_1.method6131(Static332.anInt6876);
					for (local65 = 0; local65 < Static234.anInt5229; local65++) {
						this.method904();
					}
					this.method898();
					if (Static200.anInt4599 == 1) {
						Static295.method5212(5L);
					}
					Static37.method932(Static86.aCanvas2, Static184.aClass199_12);
				}
			}
		} catch (@Pc(185) Exception local185) {
			Static58.method1402(null, local185);
			this.method910("crash");
		}
		this.method908(true);
	}

	@OriginalMember(owner = "client!gk", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
