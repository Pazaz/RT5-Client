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

@OriginalClass("loader!ud")
public final class Class227 implements Runnable {

	@OriginalMember(owner = "loader!ud", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString281;

	@OriginalMember(owner = "loader!ud", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString282;

	@OriginalMember(owner = "loader!ud", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString283;

	@OriginalMember(owner = "loader!ud", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString285;

	@OriginalMember(owner = "loader!ud", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString286;

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString287;

	@OriginalMember(owner = "loader!ud", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString288;

	@OriginalMember(owner = "loader!ud", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ud", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ud", name = "j", descriptor = "I")
	private static final int anInt7397 = 1;

	@OriginalMember(owner = "loader!ud", name = "d", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!ud", name = "t", descriptor = "J")
	private static volatile long aLong238 = 0L;

	@OriginalMember(owner = "loader!ud", name = "y", descriptor = "Lloader!mf;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!ud", name = "n", descriptor = "Lloader!an;")
	private Class222 aClass222_1 = null;

	@OriginalMember(owner = "loader!ud", name = "q", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!ud", name = "o", descriptor = "Lloader!an;")
	private Class222 aClass222_3 = null;

	@OriginalMember(owner = "loader!ud", name = "x", descriptor = "Lloader!or;")
	private Class226 aClass226_3 = null;

	@OriginalMember(owner = "loader!ud", name = "f", descriptor = "Lloader!an;")
	private Class222 aClass222_2 = null;

	@OriginalMember(owner = "loader!ud", name = "l", descriptor = "Z")
	private boolean aBoolean525 = false;

	@OriginalMember(owner = "loader!ud", name = "w", descriptor = "Lloader!or;")
	private Class226 aClass226_2 = null;

	@OriginalMember(owner = "loader!ud", name = "p", descriptor = "Ljava/lang/String;")
	private String aString284;

	@OriginalMember(owner = "loader!ud", name = "b", descriptor = "I")
	private final int anInt7396;

	@OriginalMember(owner = "loader!ud", name = "s", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ud", name = "m", descriptor = "[Lloader!an;")
	private Class222[] aClass222Array1;

	@OriginalMember(owner = "loader!ud", name = "c", descriptor = "Lloader!f;")
	private Class224 aClass224_1;

	@OriginalMember(owner = "loader!ud", name = "A", descriptor = "Lloader!b;")
	private Class223 aClass223_1;

	@OriginalMember(owner = "loader!ud", name = "z", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method6217(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(10) File local10 = (File) aHashtable2.get(arg2);
		if (local10 != null) {
			return local10;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString282, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(84) int local84 = 0; local84 < local75.length; local84++) {
				for (@Pc(94) int local94 = 0; local94 < local50.length; local94++) {
					@Pc(129) String local129 = local50[local94] + local75[local84] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(131) RandomAccessFile local131 = null;
					try {
						@Pc(136) File local136 = new File(local129);
						if (local77 != 0 || local136.exists()) {
							@Pc(147) String local147 = local50[local94];
							if (local77 != 1 || local147.length() <= 0 || (new File(local147)).exists()) {
								(new File(local50[local94] + local75[local84])).mkdir();
								if (arg1 != null) {
									(new File(local50[local94] + local75[local84] + "/" + arg1)).mkdir();
								}
								local131 = new RandomAccessFile(local136, "rw");
								@Pc(213) int local213 = local131.read();
								local131.seek(0L);
								local131.write(local213);
								local131.seek(0L);
								local131.close();
								aHashtable2.put(arg2, local136);
								return local136;
							}
						}
					} catch (@Pc(232) Exception local232) {
						try {
							if (local131 != null) {
								local131.close();
							}
						} catch (@Pc(240) Exception local240) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!an;")
	private static Class222 method6220(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(21) String local21;
		if (arg1 == 33) {
			local21 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local21 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local21 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(83) String[] local83 = new String[] { "c:/rscache/", "/rscache/", aString282, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(85) int local85 = 0; local85 < local83.length; local85++) {
			@Pc(93) String local93 = local83[local85];
			if (local93.length() <= 0 || (new File(local93)).exists()) {
				try {
					return new Class222(new File(local93, local21), "rw", 10000L);
				} catch (@Pc(117) Exception local117) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(IILjava/lang/String;)Lloader!an;")
	private static Class222 method6232(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(15) String local15;
		if (arg0 == 33) {
			local15 = "jagex_" + arg1 + "_preferences_rc.dat";
		} else if (arg0 == 34) {
			local15 = "jagex_" + arg1 + "_preferences_wip.dat";
		} else {
			local15 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(79) String[] local79 = new String[] { "c:/rscache/", "/rscache/", aString282, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(81) int local81 = 0; local81 < local79.length; local81++) {
			@Pc(99) String local99 = local79[local81];
			if (local99.length() <= 0 || (new File(local99)).exists()) {
				try {
					return new Class222(new File(local99, local15), "rw", 10000L);
				} catch (@Pc(125) Exception local125) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ud", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class227(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString284 = arg2;
		aString283 = "1.1";
		this.anInt7396 = arg1;
		this.anApplet3 = arg0;
		aString287 = "Unknown";
		try {
			aString287 = System.getProperty("java.vendor");
			aString283 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString281 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString281 = "Unknown";
		}
		aString286 = aString281.toLowerCase();
		try {
			aString288 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString288 = "";
		}
		try {
			aString285 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString285 = "";
		}
		try {
			aString282 = System.getProperty("user.home");
			if (aString282 != null) {
				aString282 = aString282 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString282 == null) {
			aString282 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(150) Exception local150) {
		}
		this.aClass222_1 = new Class222(method6217(this.anInt7396, null, "random.dat"), "rw", 25L);
		this.aClass222_3 = new Class222(this.method6227("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass222_2 = new Class222(this.method6227("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass222Array1 = new Class222[arg3];
		for (@Pc(191) int local191 = 0; local191 < arg3; local191++) {
			this.aClass222Array1[local191] = new Class222(this.method6227("main_file_cache.idx" + local191), "rw", 1048576L);
		}
		try {
			this.aClass224_1 = new Class224();
		} catch (@Pc(223) Throwable local223) {
		}
		try {
			this.aClass223_1 = new Class223();
		} catch (@Pc(230) Throwable local230) {
		}
		@Pc(233) ThreadGroup local233 = Thread.currentThread().getThreadGroup();
		for (@Pc(236) ThreadGroup local236 = local233.getParent(); local236 != null; local236 = local236.getParent()) {
			local233 = local236;
		}
		@Pc(248) Thread[] local248 = new Thread[1000];
		local233.enumerate(local248);
		for (@Pc(254) int local254 = 0; local254 < local248.length; local254++) {
			if (local248[local254] != null && local248[local254].getName().startsWith("AWT")) {
				local248[local254].setPriority(1);
			}
		}
		this.aBoolean525 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!or;")
	private Class226 method6211(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 109) {
			this.anInterface11_1 = null;
		}
		return this.method6238(7, 0, arg0, 0, true);
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(IILjava/lang/Object;II)Lloader!or;")
	private Class226 method6212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class226 local3 = new Class226();
		synchronized (local3) {
			local3.anInt7392 = arg3;
			local3.anObject9 = arg2;
			local3.anInt7395 = arg4;
			local3.anInt7393 = arg1;
			synchronized (this) {
				if (this.aClass226_2 == null) {
					this.aClass226_2 = this.aClass226_3 = local3;
				} else {
					this.aClass226_2.aClass226_1 = local3;
					this.aClass226_2 = local3;
				}
				this.notify();
				if (arg0 >= -109) {
					this.method6238(127, -26, null, 10, false);
				}
			}
			try {
				local3.wait();
			} catch (@Pc(66) InterruptedException local66) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ud", name = "e", descriptor = "(I)Lloader!or;")
	private Class226 method6213(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? this.method6238(12, 0, null, 0, true) : (Class226) null;
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(BLjava/lang/String;)Lloader!or;")
	private Class226 method6214(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		if (arg0 <= 59) {
			this.anApplet3 = null;
		}
		return this.method6238(21, 0, arg1, 0, true);
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!or;")
	private Class226 method6215(@OriginalArg(1) Class arg0) {
		return this.method6238(20, 0, arg0, 0, true);
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(I)Lloader!or;")
	private Class226 method6216(@OriginalArg(0) int arg0) {
		if (arg0 != 16389) {
			this.aBoolean525 = false;
		}
		return this.method6238(13, 0, null, 0, true);
	}

	@OriginalMember(owner = "loader!ud", name = "b", descriptor = "(I)Lloader!mf;")
	private Interface11 method6218(@OriginalArg(0) int arg0) {
		if (arg0 != -2) {
			this.method6239(-51);
		}
		return this.anInterface11_1;
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(IIBII)Lloader!or;")
	private Class226 method6219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != -37) {
			this.method6240((byte) 96, null, null);
		}
		return this.method6238(6, (arg3 << 16) + arg1, null, arg4 + (arg0 << 16), true);
	}

	@OriginalMember(owner = "loader!ud", name = "d", descriptor = "(I)Lloader!or;")
	private Class226 method6221(@OriginalArg(0) int arg0) {
		if (arg0 != 5929) {
			this.method6231(null, -66, null, 11, null, 64);
		}
		return this.method6238(18, 0, null, 0, true);
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lloader!or;")
	private Class226 method6222(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		if (arg2 > -19) {
			this.method6219(43, 64, (byte) -80, 89, -8);
		}
		return this.method6238(8, 0, new Object[] { arg3, arg0, arg1 }, 0, true);
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(BLjava/net/URL;)Lloader!or;")
	private Class226 method6223(@OriginalArg(0) byte arg0, @OriginalArg(1) URL arg1) {
		return arg0 == 91 ? this.method6238(4, 0, arg1, 0, true) : (Class226) null;
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lloader!or;")
	private Class226 method6224(@OriginalArg(0) byte arg0, @OriginalArg(1) Runnable arg1, @OriginalArg(2) int arg2) {
		if (arg0 != 107) {
			this.aString284 = null;
		}
		return this.method6238(2, 0, arg1, arg2, true);
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!or;")
	private Class226 method6225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg0 != 14) {
			this.anApplet3 = null;
		}
		@Pc(9) Point local9 = arg3.getLocationOnScreen();
		return this.method6238(14, arg1 + local9.y, null, local9.x + arg2, true);
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!or;")
	private Class226 method6226(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 10) {
			this.aClass222_2 = null;
		}
		return this.method6238(10, 0, arg0, 0, true);
	}

	@OriginalMember(owner = "loader!ud", name = "b", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method6227(@OriginalArg(1) String arg0) {
		return method6217(this.anInt7396, this.aString284, arg0);
	}

	@OriginalMember(owner = "loader!ud", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class226 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean525) {
						return;
					}
					if (this.aClass226_3 != null) {
						local15 = this.aClass226_3;
						this.aClass226_3 = this.aClass226_3.aClass226_1;
						if (this.aClass226_3 == null) {
							this.aClass226_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(44) int local44 = local15.anInt7393;
				if (local44 == 1) {
					if (Class228.method6243() < aLong238) {
						throw new IOException();
					}
					local15.anObject10 = new Socket(InetAddress.getByName((String) local15.anObject9), local15.anInt7392);
				} else if (local44 == 2) {
					@Pc(872) Thread local872 = new Thread((Runnable) local15.anObject9);
					local872.setDaemon(true);
					local872.start();
					local872.setPriority(local15.anInt7392);
					local15.anObject10 = local872;
				} else if (local44 == 4) {
					if (aLong238 > Class228.method6243()) {
						throw new IOException();
					}
					local15.anObject10 = new DataInputStream(((URL) local15.anObject9).openStream());
				} else {
					@Pc(65) Object[] local65;
					if (local44 == 8) {
						local65 = (Object[]) local15.anObject9;
						if (((Class) local65[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject10 = ((Class) local65[0]).getDeclaredMethod((String) local65[1], (Class[]) local65[2]);
					} else if (local44 == 9) {
						local65 = (Object[]) local15.anObject9;
						if (((Class) local65[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject10 = ((Class) local65[0]).getDeclaredField((String) local65[1]);
					} else if (local44 == 18) {
						@Pc(132) Clipboard local132 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject10 = local132.getContents(null);
					} else if (local44 == 19) {
						@Pc(147) Transferable local147 = (Transferable) local15.anObject9;
						@Pc(150) Clipboard local150 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local150.setContents(local147, null);
					} else {
						@Pc(211) String local211;
						if (local44 == 3) {
							if (aLong238 > Class228.method6243()) {
								throw new IOException();
							}
							local211 = (local15.anInt7392 >> 24 & 0xFF) + "." + (local15.anInt7392 >> 16 & 0xFF) + "." + (local15.anInt7392 >> 8 & 0xFF) + "." + (local15.anInt7392 & 0xFF);
							local15.anObject10 = InetAddress.getByName(local211).getHostName();
						} else if (local44 == 21) {
							if (aLong238 > Class228.method6243()) {
								throw new IOException();
							}
							local15.anObject10 = InetAddress.getByName((String) local15.anObject9).getAddress();
						} else if (local44 == 5) {
							local15.anObject10 = this.aClass224_1.method6197();
						} else if (local44 == 6) {
							@Pc(237) Frame local237 = new Frame("Jagex Full Screen");
							local15.anObject10 = local237;
							local237.setResizable(false);
							this.aClass224_1.method6198(local15.anInt7395 & 0xFFFF, local15.anInt7392 & 0xFFFF, local237, local15.anInt7392 >>> 16, local15.anInt7395 >> 16);
						} else if (local44 == 7) {
							this.aClass224_1.method6195();
						} else {
							@Pc(407) Class[] local407;
							@Pc(409) Runtime local409;
							@Pc(415) Method local415;
							if (local44 == 10) {
								local407 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local409 = Runtime.getRuntime();
								if (!aString286.startsWith("mac")) {
									local415 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local407);
									local415.setAccessible(true);
									local415.invoke(local409, local15.anObject9, "jawt");
									local415.setAccessible(false);
								}
								local415 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local407);
								local415.setAccessible(true);
								if (aString286.startsWith("linux") || aString286.startsWith("sunos")) {
									local415.invoke(local409, local15.anObject9, this.method6227("libjaggl_dri.so").toString());
									@Pc(770) Class local770 = ((Class) local15.anObject9).getClassLoader().loadClass("jaggl.X11.dri");
									local770.getMethod("bind").invoke(null);
									local415.invoke(local409, local15.anObject9, this.method6227("libjaggl.so").toString());
									local770.getMethod("close").invoke(null);
								} else if (aString286.startsWith("mac")) {
									local415.invoke(local409, local15.anObject9, this.method6227("libjaggl.jnilib").toString());
								} else if (aString286.startsWith("win")) {
									local415.invoke(local409, local15.anObject9, this.method6227("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local415.setAccessible(false);
							} else {
								@Pc(348) int local348;
								if (local44 == 11) {
									@Pc(560) Field local560 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local560.setAccessible(true);
									@Pc(571) Vector local571 = (Vector) local560.get(((Class) local15.anObject9).getClassLoader());
									for (local348 = 0; local571.size() > local348; local348++) {
										@Pc(585) Object local585 = local571.elementAt(local348);
										@Pc(592) Method local592 = local585.getClass().getDeclaredMethod("finalize");
										local592.setAccessible(true);
										local592.invoke(local585);
										local592.setAccessible(false);
										@Pc(609) Field local609 = local585.getClass().getDeclaredField("handle");
										local609.setAccessible(true);
										local609.set(local585, Integer.valueOf(0));
										local609.setAccessible(false);
									}
									local560.setAccessible(false);
								} else {
									@Pc(295) Class222 local295;
									if (local44 == 12) {
										local295 = method6232(this.anInt7396, this.aString284);
										local15.anObject10 = local295;
									} else if (local44 == 13) {
										local295 = method6220(this.aString284, this.anInt7396);
										local15.anObject10 = local295;
									} else if (local44 == 14) {
										@Pc(534) int local534 = local15.anInt7392;
										@Pc(537) int local537 = local15.anInt7395;
										this.aClass223_1.method6183(local534, local537);
									} else if (local44 == 15) {
										@Pc(520) boolean local520 = local15.anInt7392 != 0;
										@Pc(524) Component local524 = (Component) local15.anObject9;
										this.aClass223_1.method6182(local520, local524);
									} else if (local44 == 17) {
										local65 = (Object[]) local15.anObject9;
										this.aClass223_1.method6184((Point) local65[2], (int[]) local65[1], local15.anInt7392, (Component) local65[0], local15.anInt7395);
									} else if (local44 == 16) {
										try {
											if (!aString286.startsWith("win")) {
												throw new Exception();
											}
											local211 = (String) local15.anObject9;
											if (!local211.startsWith("http://") && !local211.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(346) String local346 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local348 = 0; local348 < local211.length(); local348++) {
												if (local346.indexOf(local211.charAt(local348)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local211 + "\"");
											local15.anObject10 = null;
										} catch (@Pc(385) Exception local385) {
											local15.anObject10 = local385;
										}
									} else if (local44 == 20) {
										try {
											local407 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local409 = Runtime.getRuntime();
											local415 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local407);
											local415.setAccessible(true);
											if (aString286.startsWith("win")) {
												if (aString288.startsWith("amd64") || aString288.startsWith("x86_64")) {
													local415.invoke(local409, local15.anObject9, this.method6227("jagmisc64.dll").toString());
												} else {
													local415.invoke(local409, local15.anObject9, this.method6227("jagmisc.dll").toString());
												}
											}
											local415.setAccessible(false);
										} catch (@Pc(474) Throwable local474) {
											local15.anObject10 = local474;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local15.anInt7394 = 1;
			} catch (@Pc(914) ThreadDeath local914) {
				throw local914;
			} catch (@Pc(917) Throwable local917) {
				local15.anInt7394 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(BI)Lloader!or;")
	private Class226 method6228(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		if (arg0 != -26) {
			this.aClass222Array1 = null;
		}
		return this.method6238(3, 0, null, arg1, true);
	}

	@OriginalMember(owner = "loader!ud", name = "f", descriptor = "(I)V")
	private void method6229(@OriginalArg(0) int arg0) {
		if (arg0 != 10) {
			method6220(null, -55);
		}
		aLong238 = Class228.method6243() + 5000L;
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lloader!or;")
	private Class226 method6230(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 > -94) {
			this.method6229(-33);
		}
		return this.method6238(19, 0, arg1, 0, true);
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "([IILjava/awt/Point;ILjava/awt/Component;I)Lloader!or;")
	private Class226 method6231(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Component arg4, @OriginalArg(5) int arg5) {
		if (arg5 > -121) {
			aString287 = null;
		}
		return this.method6238(17, arg3, new Object[] { arg4, arg0, arg2 }, arg1, true);
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(ZLjava/awt/Component;I)Lloader!or;")
	private Class226 method6233(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			this.method6214((byte) 47, null);
		}
		return this.method6238(15, 0, arg1, arg0 ? 1 : 0, true);
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method6234(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) Class226 local7 = this.method6212(-121, 21, arg0, 0, 0);
		return arg1 ? (byte[]) null : (byte[]) local7.anObject10;
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(Ljava/lang/String;BI)Lloader!or;")
	private Class226 method6235(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		return arg1 <= 113 ? (Class226) null : this.method6238(1, 0, arg0, arg2, true);
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!or;")
	private Class226 method6236(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 80) {
			aString282 = null;
		}
		return this.method6238(16, 0, arg0, 0, true);
	}

	@OriginalMember(owner = "loader!ud", name = "b", descriptor = "(Ljava/lang/Class;I)Lloader!or;")
	private Class226 method6237(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 56) {
			aHashtable2 = null;
		}
		return this.method6238(11, 0, arg0, 0, true);
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(IILjava/lang/Object;IZ)Lloader!or;")
	private Class226 method6238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class226 local3 = new Class226();
		local3.anInt7393 = arg0;
		local3.anInt7395 = arg1;
		local3.anObject9 = arg2;
		local3.anInt7392 = arg3;
		synchronized (this) {
			if (this.aClass226_2 == null) {
				this.aClass226_2 = this.aClass226_3 = local3;
			} else {
				this.aClass226_2.aClass226_1 = local3;
				this.aClass226_2 = local3;
			}
			if (!arg4) {
				this.aClass222_1 = null;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ud", name = "h", descriptor = "(I)Lloader!or;")
	private Class226 method6239(@OriginalArg(0) int arg0) {
		return arg0 == 14 ? this.method6238(5, 0, null, 0, true) : (Class226) null;
	}

	@OriginalMember(owner = "loader!ud", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lloader!or;")
	private Class226 method6240(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return arg0 <= 70 ? (Class226) null : this.method6238(9, 0, new Object[] { arg2, arg1 }, 0, true);
	}

	@OriginalMember(owner = "loader!ud", name = "c", descriptor = "(I)Z")
	private boolean method6241(@OriginalArg(0) int arg0) {
		if (arg0 != 1774773648) {
			this.method6224((byte) 70, null, -54);
		}
		return this.aClass224_1 != null;
	}

	@OriginalMember(owner = "loader!ud", name = "g", descriptor = "(I)V")
	private void method6242(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean525 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass222_3 != null) {
			try {
				this.aClass222_3.method6178(arg0 + 1);
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass222_2 != null) {
			try {
				this.aClass222_2.method6178(1);
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (arg0 != 0) {
			return;
		}
		if (this.aClass222Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass222Array1.length; local53++) {
				if (this.aClass222Array1[local53] != null) {
					try {
						this.aClass222Array1[local53].method6178(1);
					} catch (@Pc(72) IOException local72) {
					}
				}
			}
		}
		if (this.aClass222_1 != null) {
			try {
				this.aClass222_1.method6178(1);
			} catch (@Pc(83) IOException local83) {
			}
		}
	}
}
