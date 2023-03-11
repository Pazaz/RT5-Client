import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ml")
public final class Signlink implements Runnable {

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Ljava/lang/String;")
	public static String javaVersion;

	@OriginalMember(owner = "loader!ml", name = "i", descriptor = "Ljava/lang/String;")
	public static String javaVendor;

	@OriginalMember(owner = "loader!ml", name = "q", descriptor = "Ljava/lang/String;")
	private static String osNameRaw;

	@OriginalMember(owner = "loader!ml", name = "c", descriptor = "Ljava/lang/String;")
	public static String homeDir;

	@OriginalMember(owner = "loader!ml", name = "d", descriptor = "Ljava/lang/String;")
	public static String osName;

	@OriginalMember(owner = "loader!ml", name = "f", descriptor = "Ljava/lang/String;")
	public static String osArch;

	@OriginalMember(owner = "loader!ml", name = "h", descriptor = "Ljava/lang/String;")
	public static String osVersion;

	@OriginalMember(owner = "loader!ml", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	public static Method setFocusTraversalKeysEnabled;

	@OriginalMember(owner = "loader!ml", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	public static Method setFocusCycleRoot;

	@OriginalMember(owner = "loader!ml", name = "g", descriptor = "I")
	private static final int anInt7277 = 1;

	@OriginalMember(owner = "loader!ml", name = "r", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable fileCache = new Hashtable(16);

	@OriginalMember(owner = "loader!ml", name = "v", descriptor = "J")
	public static long breakConnectionsUntil = 0L;

	@OriginalMember(owner = "loader!ml", name = "o", descriptor = "Lloader!fc;")
	private AudioSource audioSource;

	@OriginalMember(owner = "loader!ml", name = "s", descriptor = "Lloader!cc;")
	public PrivilegedRequest requestQueueHead = null;

	@OriginalMember(owner = "loader!ml", name = "e", descriptor = "Ljava/applet/Applet;")
	public Applet applet = null;

	@OriginalMember(owner = "loader!ml", name = "m", descriptor = "Lloader!rl;")
	public FileOnDisk cacheMasterIndex = null;

	@OriginalMember(owner = "loader!ml", name = "b", descriptor = "Lloader!rl;")
	public FileOnDisk uid = null;

	@OriginalMember(owner = "loader!ml", name = "n", descriptor = "Z")
	public boolean stop = false;

	@OriginalMember(owner = "loader!ml", name = "j", descriptor = "Lloader!rl;")
	public FileOnDisk cacheData = null;

	@OriginalMember(owner = "loader!ml", name = "A", descriptor = "Lloader!cc;")
	public PrivilegedRequest requestQueueTail = null;

	@OriginalMember(owner = "loader!ml", name = "w", descriptor = "Ljava/lang/String;")
	public final String cacheSubDir;

	@OriginalMember(owner = "loader!ml", name = "x", descriptor = "I")
	public final int cacheId;

	@OriginalMember(owner = "loader!ml", name = "k", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue eventQueue;

	@OriginalMember(owner = "loader!ml", name = "p", descriptor = "[Lloader!rl;")
	public FileOnDisk[] cacheIndexes;

	@OriginalMember(owner = "loader!ml", name = "z", descriptor = "Lloader!c;")
	public FullScreenManager fullScreenManager;

	@OriginalMember(owner = "loader!ml", name = "y", descriptor = "Lloader!b;")
	public CursorManager cursorManager;

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "Ljava/lang/Thread;")
	public final Thread thread;

	@OriginalMember(owner = "loader!ml", name = "b", descriptor = "(Ljava/lang/String;II)Lloader!rl;")
	private static FileOnDisk openPreferencesInternal(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(16) String local16;
		if (arg1 == 33) {
			local16 = "jagex_" + arg0 + "_preferences_rc.dat";
		} else if (arg1 == 34) {
			local16 = "jagex_" + arg0 + "_preferences_wip.dat";
		} else {
			local16 = "jagex_" + arg0 + "_preferences.dat";
		}
		@Pc(75) String[] local75 = new String[] { "c:/rscache/", "/rscache/", homeDir, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(83) int local83 = 0; local83 < local75.length; local83++) {
			@Pc(91) String local91 = local75[local83];
			if (local91.length() <= 0 || (new File(local91)).exists()) {
				try {
					return new FileOnDisk(new File(local91, local16), "rw", 10000L);
				} catch (@Pc(115) Exception local115) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File getFile(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(4) File local4 = (File) fileCache.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", homeDir, "/tmp/", "" };
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(81) int local81 = 0; local81 < local68.length; local81++) {
				for (@Pc(87) int local87 = 0; local87 < local43.length; local87++) {
					@Pc(125) String local125 = local43[local87] + local68[local81] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(127) RandomAccessFile local127 = null;
					try {
						@Pc(132) File local132 = new File(local125);
						if (local76 != 0 || local132.exists()) {
							@Pc(146) String local146 = local43[local87];
							if (local76 != 1 || local146.length() <= 0 || (new File(local146)).exists()) {
								(new File(local43[local87] + local68[local81])).mkdir();
								if (arg0 != null) {
									(new File(local43[local87] + local68[local81] + "/" + arg0)).mkdir();
								}
								local127 = new RandomAccessFile(local132, "rw");
								@Pc(215) int local215 = local127.read();
								local127.seek(0L);
								local127.write(local215);
								local127.seek(0L);
								local127.close();
								fileCache.put(arg2, local132);
								return local132;
							}
						}
					} catch (@Pc(234) Exception local234) {
						try {
							if (local127 != null) {
								local127.close();
							}
						} catch (@Pc(243) Exception local243) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(IILjava/lang/String;)Lloader!rl;")
	private static FileOnDisk openPreferencesInternal2(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) String local13;
		if (arg0 == 33) {
			local13 = "jagex_" + arg1 + "_preferences2_rc.dat";
		} else if (arg0 == 34) {
			local13 = "jagex_" + arg1 + "_preferences2_wip.dat";
		} else {
			local13 = "jagex_" + arg1 + "_preferences2.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", homeDir, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(88) int local88 = 0; local88 < local77.length; local88++) {
			@Pc(100) String local100 = local77[local88];
			if (local100.length() <= 0 || (new File(local100)).exists()) {
				try {
					return new FileOnDisk(new File(local100, local13), "rw", 10000L);
				} catch (@Pc(127) Exception local127) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ml", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Signlink(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.cacheSubDir = arg2;
		javaVersion = "1.1";
		this.cacheId = arg1;
		javaVendor = "Unknown";
		this.applet = arg0;
		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			osNameRaw = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			osNameRaw = "Unknown";
		}
		osName = osNameRaw.toLowerCase();
		try {
			osArch = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			osArch = "";
		}
		try {
			osVersion = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			osVersion = "";
		}
		try {
			homeDir = System.getProperty("user.home");
			if (homeDir != null) {
				homeDir = homeDir + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (homeDir == null) {
			homeDir = "~/";
		}
		try {
			this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
		}
		try {
			if (arg0 == null) {
				setFocusTraversalKeysEnabled = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				setFocusTraversalKeysEnabled = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				setFocusCycleRoot = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				setFocusCycleRoot = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.uid = new FileOnDisk(getFile(null, this.cacheId, "random.dat"), "rw", 25L);
		this.cacheData = new FileOnDisk(this.getFile("main_file_cache.dat2"), "rw", 209715200L);
		this.cacheMasterIndex = new FileOnDisk(this.getFile("main_file_cache.idx255"), "rw", 1048576L);
		this.cacheIndexes = new FileOnDisk[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.cacheIndexes[local192] = new FileOnDisk(this.getFile("main_file_cache.idx" + local192), "rw", 1048576L);
		}
		try {
			this.fullScreenManager = new FullScreenManager();
		} catch (@Pc(224) Throwable local224) {
		}
		try {
			this.cursorManager = new CursorManager();
		} catch (@Pc(231) Throwable local231) {
		}
		@Pc(234) ThreadGroup local234 = Thread.currentThread().getThreadGroup();
		for (@Pc(237) ThreadGroup local237 = local234.getParent(); local237 != null; local237 = local237.getParent()) {
			local234 = local237;
		}
		@Pc(249) Thread[] local249 = new Thread[1000];
		local234.enumerate(local249);
		for (@Pc(255) int local255 = 0; local255 < local249.length; local255++) {
			if (local249[local255] != null && local249[local255].getName().startsWith("AWT")) {
				local249[local255].setPriority(1);
			}
		}
		this.stop = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File getFile(@OriginalArg(0) String arg0) {
		return getFile(this.cacheSubDir, this.cacheId, arg0);
	}

	@OriginalMember(owner = "loader!ml", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) PrivilegedRequest local16;
			synchronized (this) {
				while (true) {
					if (this.stop) {
						return;
					}
					if (this.requestQueueHead != null) {
						local16 = this.requestQueueHead;
						this.requestQueueHead = this.requestQueueHead.next;
						if (this.requestQueueHead == null) {
							this.requestQueueTail = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.type;
				if (local45 == 1) {
					if (MonotonicClock.currentTimeMillis() < breakConnectionsUntil) {
						throw new IOException();
					}
					local16.result = new Socket(InetAddress.getByName((String) local16.objectArg), local16.intArg1);
				} else if (local45 == 2) {
					@Pc(853) Thread local853 = new Thread((Runnable) local16.objectArg);
					local853.setDaemon(true);
					local853.start();
					local853.setPriority(local16.intArg1);
					local16.result = local853;
				} else if (local45 == 4) {
					if (MonotonicClock.currentTimeMillis() < breakConnectionsUntil) {
						throw new IOException();
					}
					local16.result = new DataInputStream(((URL) local16.objectArg).openStream());
				} else {
					@Pc(73) Object[] local73;
					if (local45 == 8) {
						local73 = (Object[]) local16.objectArg;
						if (((Class) local73[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.result = ((Class) local73[0]).getDeclaredMethod((String) local73[1], (Class[]) local73[2]);
					} else if (local45 == 9) {
						local73 = (Object[]) local16.objectArg;
						if (((Class) local73[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.result = ((Class) local73[0]).getDeclaredField((String) local73[1]);
					} else if (local45 == 18) {
						@Pc(788) Clipboard local788 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.result = local788.getContents(null);
					} else if (local45 == 19) {
						@Pc(108) Transferable local108 = (Transferable) local16.objectArg;
						@Pc(111) Clipboard local111 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local111.setContents(local108, null);
					} else {
						@Pc(211) String local211;
						if (local45 == 3) {
							if (MonotonicClock.currentTimeMillis() < breakConnectionsUntil) {
								throw new IOException();
							}
							local211 = (local16.intArg1 >> 24 & 0xFF) + "." + (local16.intArg1 >> 16 & 0xFF) + "." + (local16.intArg1 >> 8 & 0xFF) + "." + (local16.intArg1 & 0xFF);
							local16.result = InetAddress.getByName(local211).getHostName();
						} else if (local45 == 21) {
							if (breakConnectionsUntil > MonotonicClock.currentTimeMillis()) {
								throw new IOException();
							}
							local16.result = InetAddress.getByName((String) local16.objectArg).getAddress();
						} else if (local45 == 5) {
							local16.result = this.fullScreenManager.method6496();
						} else if (local45 == 6) {
							@Pc(676) Frame local676 = new Frame("Jagex Full Screen");
							local16.result = local676;
							local676.setResizable(false);
							this.fullScreenManager.enter(local676, local16.intArg1 & 0xFFFF, local16.intArg2 >> 16, local16.intArg1 >>> 16, local16.intArg2 & 0xFFFF);
						} else if (local45 == 7) {
							this.fullScreenManager.exit();
						} else {
							@Pc(289) Class[] local289;
							@Pc(291) Runtime local291;
							@Pc(297) Method local297;
							if (local45 == 10) {
								local289 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local291 = Runtime.getRuntime();
								if (!osName.startsWith("mac")) {
									local297 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local289);
									local297.setAccessible(true);
									local297.invoke(local291, local16.objectArg, "jawt");
									local297.setAccessible(false);
								}
								local297 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local289);
								local297.setAccessible(true);
								if (osName.startsWith("linux")) {
									local297.invoke(local291, local16.objectArg, this.getFile("libjaggl_dri.so").toString());
									@Pc(575) Class local575 = ((Class) local16.objectArg).getClassLoader().loadClass("jaggl.X11.dri");
									local575.getMethod("bind").invoke(null);
									local297.invoke(local291, local16.objectArg, this.getFile("libjaggl.so").toString());
									local575.getMethod("close").invoke(null);
								} else if (osName.startsWith("mac")) {
									local297.invoke(local291, local16.objectArg, this.getFile("libjaggl.dylib").toString());
								} else if (osName.startsWith("win")) {
									local297.invoke(local291, local16.objectArg, this.getFile("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local297.setAccessible(false);
							} else {
								@Pc(227) int local227;
								if (local45 == 11) {
									@Pc(421) Field local421 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local421.setAccessible(true);
									@Pc(432) Vector local432 = (Vector) local421.get(((Class) local16.objectArg).getClassLoader());
									for (local227 = 0; local227 < local432.size(); local227++) {
										@Pc(442) Object local442 = local432.elementAt(local227);
										@Pc(449) Method local449 = local442.getClass().getDeclaredMethod("finalize");
										local449.setAccessible(true);
										local449.invoke(local442);
										local449.setAccessible(false);
										@Pc(466) Field local466 = local442.getClass().getDeclaredField("handle");
										local466.setAccessible(true);
										local466.set(local442, Integer.valueOf(0));
										local466.setAccessible(false);
									}
									local421.setAccessible(false);
								} else {
									@Pc(156) FileOnDisk local156;
									if (local45 == 12) {
										local156 = openPreferencesInternal(this.cacheSubDir, this.cacheId);
										local16.result = local156;
									} else if (local45 == 13) {
										local156 = openPreferencesInternal2(this.cacheId, this.cacheSubDir);
										local16.result = local156;
									} else if (local45 == 14) {
										@Pc(395) int local395 = local16.intArg1;
										@Pc(398) int local398 = local16.intArg2;
										this.cursorManager.setPosition(local395, local398);
									} else if (local45 == 15) {
										@Pc(179) boolean local179 = local16.intArg1 != 0;
										@Pc(183) Component local183 = (Component) local16.objectArg;
										this.cursorManager.setComponent(local179, local183);
									} else if (local45 == 17) {
										local73 = (Object[]) local16.objectArg;
										this.cursorManager.setCursor((int[]) local73[1], local16.intArg1, local16.intArg2, (Point) local73[2], (Component) local73[0]);
									} else if (local45 == 16) {
										try {
											if (!osName.startsWith("win")) {
												throw new Exception();
											}
											local211 = (String) local16.objectArg;
											if (!local211.startsWith("http://") && !local211.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(225) String local225 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local227 = 0; local211.length() > local227; local227++) {
												if (local225.indexOf(local211.charAt(local227)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local211 + "\"");
											local16.result = null;
										} catch (@Pc(266) Exception local266) {
											local16.result = local266;
											throw local266;
										}
									} else if (local45 == 20) {
										try {
											local289 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local291 = Runtime.getRuntime();
											local297 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local289);
											local297.setAccessible(true);
											if (osName.startsWith("win")) {
												if (osArch.startsWith("amd64") || osArch.startsWith("x86_64")) {
													local297.invoke(local291, local16.objectArg, this.getFile("jagmisc64.dll").toString());
												} else {
													local297.invoke(local291, local16.objectArg, this.getFile("jagmisc.dll").toString());
												}
											}
											local297.setAccessible(false);
										} catch (@Pc(356) Throwable local356) {
											local16.result = local356;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local16.status = 1;
			} catch (@Pc(896) ThreadDeath local896) {
				throw local896;
			} catch (@Pc(899) Throwable local899) {
				local16.status = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
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
