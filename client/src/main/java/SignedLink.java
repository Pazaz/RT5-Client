import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class SignedLink implements Runnable {

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Ljava/lang/String;")
	public static String javaVersion;
	@OriginalMember(owner = "client!ml", name = "i", descriptor = "Ljava/lang/String;")
	public static String javaVendor;
	@OriginalMember(owner = "client!ml", name = "q", descriptor = "Ljava/lang/String;")
	public static String osNameRaw;
	@OriginalMember(owner = "client!ml", name = "d", descriptor = "Ljava/lang/String;")
	public static String osName;
	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Ljava/lang/String;")
	public static String osArch;
	@OriginalMember(owner = "client!ml", name = "h", descriptor = "Ljava/lang/String;")
	public static String osVersion;
	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Ljava/lang/String;")
	public static String homeDir;
	@OriginalMember(owner = "client!ml", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	public static Method setFocusTraversalKeysEnabled;
	@OriginalMember(owner = "client!ml", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	public static Method setFocusCycleRoot;
	@OriginalMember(owner = "client!ml", name = "v", descriptor = "J")
	public static volatile long breakConnectionsUntil = 0L;
	@OriginalMember(owner = "client!ml", name = "p", descriptor = "[Lclient!rl;")
	public FileOnDisk[] cacheIndexes;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "Lclient!fc;")
	private AudioSource audioSource;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet applet = null;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "Lclient!rl;")
	public FileOnDisk cacheData = null;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!cc;")
	private PrivilegedRequest requestQueueHead = null;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Lclient!rl;")
	public FileOnDisk uid = null;

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "Lclient!rl;")
	public FileOnDisk cacheMasterIndex = null;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Z")
	private boolean stop = false;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "Lclient!cc;")
	private PrivilegedRequest requestQueueTail = null;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue eventQueue;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread thread;

	static {
		new Hashtable(16);
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public SignedLink(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		javaVersion = "1.1";
		this.applet = arg0;
		javaVendor = "Unknown";
		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (@Pc(37) Exception local37) {
		}
		try {
			osNameRaw = System.getProperty("os.name");
		} catch (@Pc(42) Exception local42) {
			osNameRaw = "Unknown";
		}
		osName = osNameRaw.toLowerCase();
		try {
			osArch = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
			osArch = "";
		}
		try {
			osVersion = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
			osVersion = "";
		}
		try {
			homeDir = System.getProperty("user.home");
			if (homeDir != null) {
				homeDir = homeDir + "/";
			}
		} catch (@Pc(79) Exception local79) {
		}
		if (homeDir == null) {
			homeDir = "~/";
		}
		try {
			this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(89) Throwable local89) {
		}
		try {
			if (arg0 == null) {
				setFocusTraversalKeysEnabled = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				setFocusTraversalKeysEnabled = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(116) Exception local116) {
		}
		try {
			if (arg0 == null) {
				setFocusCycleRoot = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				setFocusCycleRoot = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(143) Exception local143) {
		}
		this.stop = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lclient!cc;")
	public PrivilegedRequest getDeclaredMethod(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class[] arg2) {
		return this.enqueue(new Object[] { arg0, arg1, arg2 }, 0, 8, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIZI)Lclient!cc;")
	public PrivilegedRequest enterFullScreen(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.enqueue(null, (arg0 << 16) + arg1, 6, arg2 << 16);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Lclient!cc;")
	public PrivilegedRequest openPreferences() {
		return this.enqueue(null, 0, 12, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!cc;")
	public PrivilegedRequest openSocket(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.enqueue(arg0, arg1, 1, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/Class;)Lclient!cc;")
	public PrivilegedRequest loadMiscNatives(@OriginalArg(1) Class arg0) {
		return this.enqueue(arg0, 0, 20, 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(ILjava/lang/Class;)Lclient!cc;")
	public PrivilegedRequest loadGlNatives(@OriginalArg(1) Class arg0) {
		return this.enqueue(arg0, 0, 10, 0);
	}

	@OriginalMember(owner = "client!ml", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) PrivilegedRequest local15;
			synchronized (this) {
				while (true) {
					if (this.stop) {
						return;
					}
					if (this.requestQueueHead != null) {
						local15 = this.requestQueueHead;
						this.requestQueueHead = this.requestQueueHead.next;
						if (this.requestQueueHead == null) {
							this.requestQueueTail = null;
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
				@Pc(41) int local41 = local15.type;
				if (local41 == 1) {
					if (MonotonicClock.currentTimeMillis() < breakConnectionsUntil) {
						throw new IOException();
					}
					local15.result = new Socket(InetAddress.getByName((String) local15.objectArg), local15.intArg1);
				} else if (local41 == 2) {
					@Pc(81) Thread local81 = new Thread((Runnable) local15.objectArg);
					local81.setDaemon(true);
					local81.start();
					local81.setPriority(local15.intArg1);
					local15.result = local81;
				} else if (local41 == 4) {
					if (MonotonicClock.currentTimeMillis() < breakConnectionsUntil) {
						throw new IOException();
					}
					local15.result = new DataInputStream(((URL) local15.objectArg).openStream());
				} else {
					@Pc(166) Object[] local166;
					if (local41 == 8) {
						local166 = (Object[]) local15.objectArg;
						local15.result = ((Class) local166[0]).getDeclaredMethod((String) local166[1], (Class[]) local166[2]);
					} else if (local41 == 9) {
						local166 = (Object[]) local15.objectArg;
						local15.result = ((Class) local166[0]).getDeclaredField((String) local166[1]);
					} else if (local41 == 18) {
						@Pc(134) Clipboard local134 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.result = local134.getContents(null);
					} else if (local41 == 19) {
						@Pc(149) Transferable local149 = (Transferable) local15.objectArg;
						@Pc(152) Clipboard local152 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local152.setContents(local149, null);
					} else {
						throw new Exception("");
					}
				}
				local15.status = 1;
			} catch (@Pc(202) ThreadDeath local202) {
				throw local202;
			} catch (@Pc(205) Throwable local205) {
				local15.status = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Lclient!cc;")
	public PrivilegedRequest openPreferences2() {
		return this.enqueue(null, 0, 13, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)Lclient!cc;")
	public PrivilegedRequest getReverseDns(@OriginalArg(1) int arg0) {
		return this.enqueue(null, arg0, 3, 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	public void breakConnection() {
		breakConnectionsUntil = MonotonicClock.currentTimeMillis() + 5000L;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!cc;")
	public PrivilegedRequest openUrl(@OriginalArg(0) String arg0) {
		return this.enqueue(arg0, 0, 16, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lclient!cc;")
	public PrivilegedRequest getDeclaredField(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.enqueue(new Object[] { arg0, arg1 }, 0, 9, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!cc;")
	public PrivilegedRequest exitFullScreen(@OriginalArg(0) Frame arg0) {
		return this.enqueue(arg0, 0, 7, 0);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lclient!fc;")
	public AudioSource getAudioSource() {
		return this.audioSource;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Z")
	public boolean method3765() {
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/net/URL;)Lclient!cc;")
	public PrivilegedRequest openUrlStream(@OriginalArg(1) URL arg0) {
		return this.enqueue(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lclient!cc;")
	private PrivilegedRequest enqueue(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) PrivilegedRequest local3 = new PrivilegedRequest();
		local3.objectArg = arg0;
		local3.type = arg2;
		local3.intArg1 = arg1;
		synchronized (this) {
			if (this.requestQueueTail == null) {
				this.requestQueueTail = this.requestQueueHead = local3;
			} else {
				this.requestQueueTail.next = local3;
				this.requestQueueTail = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	public void stop() {
		synchronized (this) {
			this.stop = true;
			this.notifyAll();
		}
		try {
			this.thread.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.cacheData != null) {
			try {
				this.cacheData.close();
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.cacheMasterIndex != null) {
			try {
				this.cacheMasterIndex.close();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.cacheIndexes != null) {
			for (@Pc(49) int local49 = 0; local49 < this.cacheIndexes.length; local49++) {
				if (this.cacheIndexes[local49] != null) {
					try {
						this.cacheIndexes[local49].close();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (this.uid != null) {
			try {
				this.uid.close();
			} catch (@Pc(79) IOException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/lang/Runnable;)Lclient!cc;")
	public PrivilegedRequest startThread(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.enqueue(arg1, arg0, 2, 0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/awt/Point;I[ILjava/awt/Component;I)Lclient!cc;")
	public PrivilegedRequest setCursor(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int arg4) {
		return this.enqueue(new Object[] { arg3, arg2, arg1 }, arg0, 17, arg4);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(ILjava/lang/Class;)Lclient!cc;")
	public PrivilegedRequest unloadNatives(@OriginalArg(1) Class arg0) {
		return this.enqueue(arg0, 0, 11, 0);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)Lclient!cc;")
	public PrivilegedRequest getDisplayModes() {
		return this.enqueue(null, 0, 5, 0);
	}
}
