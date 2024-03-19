import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class199 implements Runnable {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!mf;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "[Lclient!an;")
	public Class10[] aClass10Array1;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!an;")
	public Class10 aClass10_2 = null;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Lclient!an;")
	public Class10 aClass10_4 = null;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Z")
	private boolean aBoolean470 = false;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!or;")
	private Class145 aClass145_9 = null;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet1 = null;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!an;")
	public Class10 aClass10_3 = null;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "Lclient!or;")
	private Class145 aClass145_10 = null;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class199(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet1 = arg0;
		Static313.aString243 = "Unknown";
		Static313.aString249 = "1.1";
		try {
			Static313.aString243 = System.getProperty("java.vendor");
			Static313.aString249 = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			Static313.aString246 = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			Static313.aString246 = "Unknown";
		}
		Static313.aString244 = Static313.aString246.toLowerCase();
		try {
			Static313.aString245 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			Static313.aString245 = "";
		}
		try {
			Static313.aString247 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			Static313.aString247 = "";
		}
		try {
			Static313.aString248 = System.getProperty("user.home");
			if (Static313.aString248 != null) {
				Static313.aString248 = Static313.aString248 + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (Static313.aString248 == null) {
			Static313.aString248 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				Static313.aMethod1 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Static313.aMethod1 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				Static313.aMethod2 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Static313.aMethod2 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.aBoolean470 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Lclient!or;")
	public Class145 method5461() {
		return this.method5465(1774773648, 0, null, 13, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/Class;I)Lclient!or;")
	public Class145 method5462(@OriginalArg(0) Class arg0) {
		return this.method5465(1774773648, 0, arg0, 10, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lclient!or;")
	public Class145 method5463(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method5465(1774773648, 0, new Object[] { arg1, arg0 }, 9, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([IILjava/awt/Point;ILjava/awt/Component;I)Lclient!or;")
	public Class145 method5464(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Component arg4) {
		return this.method5465(1774773648, arg1, new Object[] { arg4, arg0, arg2 }, 17, arg3);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!or;")
	private Class145 method5465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class145 local3 = new Class145();
		local3.anInt5066 = arg1;
		local3.anInt5067 = arg3;
		local3.anObject7 = arg2;
		synchronized (this) {
			if (this.aClass145_10 == null) {
				this.aClass145_10 = this.aClass145_9 = local3;
			} else {
				this.aClass145_10.aClass145_8 = local3;
				this.aClass145_10 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/net/URL;)Lclient!or;")
	public Class145 method5466(@OriginalArg(1) URL arg0) {
		return this.method5465(1774773648, 0, arg0, 4, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lclient!or;")
	private Class145 method5467(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 > -94) {
			this.aClass145_9 = null;
		}
		return this.method5465(1774773648, 0, arg1, 19, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/lang/Object;III)Lclient!or;")
	private Class145 method5468(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class145 local3 = new Class145();
		synchronized (local3) {
			local3.anInt5067 = arg3;
			local3.anInt5066 = arg0;
			local3.anObject7 = arg1;
			synchronized (this) {
				if (this.aClass145_10 == null) {
					this.aClass145_10 = this.aClass145_9 = local3;
				} else {
					this.aClass145_10.aClass145_8 = local3;
					this.aClass145_10 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(49) InterruptedException local49) {
			}
		}
		return arg2 == 0 ? local3 : null;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Lclient!mf;")
	public Interface8 method5469() {
		return this.anInterface8_2;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lclient!or;")
	public Class145 method5470(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method5465(1774773648, 0, new Object[] { arg2, arg0, arg1 }, 8, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;BI)Lclient!or;")
	public Class145 method5471(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		return this.method5465(1774773648, arg1, arg0, 1, 0);
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Z")
	public boolean method5472() {
		return false;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!or;")
	public Class145 method5473(@OriginalArg(0) Frame arg0) {
		return this.method5465(1774773648, 0, arg0, 7, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!or;")
	public Class145 method5474(@OriginalArg(0) String arg0) {
		return this.method5465(1774773648, 0, arg0, 16, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)Lclient!or;")
	public Class145 method5475(@OriginalArg(1) int arg0) {
		return this.method5465(1774773648, arg0, null, 3, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/lang/String;)Lclient!or;")
	private Class145 method5476(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		if (arg0 <= 59) {
			this.method5473(null);
		}
		return this.method5465(1774773648, 0, arg1, 21, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method5477(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) Class145 local7 = this.method5468(0, arg0, 0, 21);
		if (arg1) {
			this.anApplet1 = null;
		}
		return (byte[]) local7.anObject6;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(Ljava/lang/Class;I)Lclient!or;")
	public Class145 method5478(@OriginalArg(0) Class arg0) {
		return this.method5465(1774773648, 0, arg0, 11, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBII)Lclient!or;")
	public Class145 method5479(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return this.method5465(1774773648, arg2 + (arg0 << 16), null, 6, arg1 << 16);
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Lclient!or;")
	private Class145 method5480(@OriginalArg(0) int arg0) {
		if (arg0 != 5929) {
			Static313.aMethod2 = null;
		}
		return this.method5465(arg0 + 1774767719, 0, null, 18, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLjava/awt/Component;I)Lclient!or;")
	private Class145 method5481(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			this.method5468(-65, null, 124, -56);
		}
		return this.method5465(arg2 ^ 0x69C8E590, arg0 ? 1 : 0, arg1, 15, 0);
	}

	@OriginalMember(owner = "client!ud", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class145 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean470) {
						return;
					}
					if (this.aClass145_9 != null) {
						local15 = this.aClass145_9;
						this.aClass145_9 = this.aClass145_9.aClass145_8;
						if (this.aClass145_9 == null) {
							this.aClass145_10 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(31) InterruptedException local31) {
					}
				}
			}
			try {
				@Pc(41) int local41 = local15.anInt5067;
				if (local41 == 1) {
					if (Static325.method5658() < Static313.aLong203) {
						throw new IOException();
					}
					local15.anObject6 = new Socket(InetAddress.getByName((String) local15.anObject7), local15.anInt5066);
				} else if (local41 == 2) {
					@Pc(75) Thread local75 = new Thread((Runnable) local15.anObject7);
					local75.setDaemon(true);
					local75.start();
					local75.setPriority(local15.anInt5066);
					local15.anObject6 = local75;
				} else if (local41 == 4) {
					if (Static325.method5658() < Static313.aLong203) {
						throw new IOException();
					}
					local15.anObject6 = new DataInputStream(((URL) local15.anObject7).openStream());
				} else {
					@Pc(117) Object[] local117;
					if (local41 == 8) {
						local117 = (Object[]) local15.anObject7;
						local15.anObject6 = ((Class) local117[0]).getDeclaredMethod((String) local117[1], (Class[]) local117[2]);
					} else if (local41 == 9) {
						local117 = (Object[]) local15.anObject7;
						local15.anObject6 = ((Class) local117[0]).getDeclaredField((String) local117[1]);
					} else if (local41 == 18) {
						@Pc(162) Clipboard local162 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject6 = local162.getContents(null);
					} else if (local41 == 19) {
						@Pc(175) Transferable local175 = (Transferable) local15.anObject7;
						@Pc(178) Clipboard local178 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local178.setContents(local175, null);
					} else {
						throw new Exception("");
					}
				}
				local15.anInt5065 = 1;
			} catch (@Pc(193) ThreadDeath local193) {
				throw local193;
			} catch (@Pc(196) Throwable local196) {
				local15.anInt5065 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lclient!or;")
	public Class145 method5482(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method5465(1774773648, arg1, arg0, 2, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!or;")
	private Class145 method5483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg0 == 14) {
			@Pc(7) Point local7 = arg3.getLocationOnScreen();
			return this.method5465(1774773648, local7.x + arg2, null, 14, local7.y + arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!or;")
	public Class145 method5484(@OriginalArg(1) Class arg0) {
		return this.method5465(1774773648, 0, arg0, 20, 0);
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)Lclient!or;")
	public Class145 method5485() {
		return this.method5465(1774773648, 0, null, 12, 0);
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
	public void method5486() {
		Static313.aLong203 = Static325.method5658() + 5000L;
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
	public void method5487() {
		synchronized (this) {
			this.aBoolean470 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		if (this.aClass10_4 != null) {
			try {
				this.aClass10_4.method356();
			} catch (@Pc(28) IOException local28) {
			}
		}
		if (this.aClass10_2 != null) {
			try {
				this.aClass10_2.method356();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass10Array1 != null) {
			for (@Pc(47) int local47 = 0; local47 < this.aClass10Array1.length; local47++) {
				if (this.aClass10Array1[local47] != null) {
					try {
						this.aClass10Array1[local47].method356();
					} catch (@Pc(61) IOException local61) {
					}
				}
			}
		}
		if (this.aClass10_3 != null) {
			try {
				this.aClass10_3.method356();
			} catch (@Pc(81) IOException local81) {
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)Lclient!or;")
	public Class145 method5488() {
		return this.method5465(1774773648, 0, null, 5, 0);
	}
}
