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
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class390 implements Runnable {

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "Lclient!dm;")
	public Class83 aClass83_2 = null;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "Lclient!oba;")
	private Class270 aClass270_8 = null;

	@OriginalMember(owner = "client!vq", name = "F", descriptor = "Z")
	private boolean aBoolean780 = false;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!oba;")
	private Class270 aClass270_9 = null;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "Lclient!dm;")
	public Class83 aClass83_4 = null;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "Lclient!dm;")
	public Class83 aClass83_3 = null;

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "Z")
	public boolean aBoolean779 = false;

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "Z")
	public boolean aBoolean781 = false;

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "[Lclient!dm;")
	public Class83[] aClass83Array1;

	@OriginalMember(owner = "client!vq", name = "G", descriptor = "Ljava/lang/Object;")
	private Object anObject21;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "Lclient!ak;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "Ljava/lang/Object;")
	private Object anObject19;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "Lclient!ow;")
	private Callback_Sub1 aCallback_Sub1_1;

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
	public Class390(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws Exception {
		Static689.aString122 = arg1;
		Static689.aString124 = "1.1";
		Static689.aString123 = "Unknown";
		this.aBoolean781 = arg3;
		Static689.anInt10357 = arg0;
		try {
			Static689.aString123 = System.getProperty("java.vendor");
			Static689.aString124 = System.getProperty("java.version");
		} catch (@Pc(52) Exception local52) {
		}
		if (Static689.aString123.toLowerCase().indexOf("microsoft") != -1) {
			this.aBoolean779 = true;
		}
		try {
			Static689.aString126 = System.getProperty("os.name");
		} catch (@Pc(72) Exception local72) {
			Static689.aString126 = "Unknown";
		}
		Static689.aString119 = Static689.aString126.toLowerCase();
		try {
			Static689.aString121 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(87) Exception local87) {
			Static689.aString121 = "";
		}
		try {
			Static689.aString120 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(97) Exception local97) {
			Static689.aString120 = "";
		}
		try {
			Static689.aString125 = System.getProperty("user.home");
			if (Static689.aString125 != null) {
				Static689.aString125 = Static689.aString125 + "/";
			}
		} catch (@Pc(117) Exception local117) {
		}
		if (Static689.aString125 == null) {
			Static689.aString125 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(131) Throwable local131) {
		}
		if (!this.aBoolean779) {
			try {
				Static689.aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} catch (@Pc(151) Exception local151) {
			}
			try {
				Static689.aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} catch (@Pc(168) Exception local168) {
			}
		}
		Static649.method8492(Static689.anInt10357, Static689.aString122);
		if (this.aBoolean781) {
			this.aClass83_4 = new Class83(Static649.method8491((String) null, Static689.anInt10357, "random.dat"), "rw", 25L);
			this.aClass83_2 = new Class83(Static649.method8490("main_file_cache.dat2"), "rw", 314572800L);
			this.aClass83_3 = new Class83(Static649.method8490("main_file_cache.idx255"), "rw", 1048576L);
			this.aClass83Array1 = new Class83[arg2];
			for (@Pc(226) int local226 = 0; local226 < arg2; local226++) {
				this.aClass83Array1[local226] = new Class83(Static649.method8490("main_file_cache.idx" + local226), "rw", 1048576L);
			}
			if (this.aBoolean779) {
				try {
					this.anObject21 = Class.forName("Class183").getDeclaredConstructor().newInstance();
				} catch (@Pc(267) Throwable local267) {
				}
			}
			try {
				if (this.aBoolean779) {
					this.aClass15_1 = new Class15();
				} else {
					this.anObject19 = Class.forName("Class66").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(287) Throwable local287) {
			}
			try {
				if (this.aBoolean779) {
					this.aCallback_Sub1_1 = new Callback_Sub1();
				} else {
					this.anObject20 = Class.forName("Class238").getDeclaredConstructor().newInstance();
				}
			} catch (@Pc(306) Throwable local306) {
			}
		}
		if (this.aBoolean781 && !this.aBoolean779) {
			@Pc(318) ThreadGroup local318 = Thread.currentThread().getThreadGroup();
			for (@Pc(321) ThreadGroup local321 = local318.getParent(); local321 != null; local321 = local321.getParent()) {
				local318 = local321;
			}
			@Pc(332) Thread[] local332 = new Thread[1000];
			local318.enumerate(local332);
			for (@Pc(338) int local338 = 0; local338 < local332.length; local338++) {
				if (local332[local338] != null && local332[local338].getName().startsWith("AWT")) {
					local332[local338].setPriority(1);
				}
			}
		}
		this.aBoolean780 = false;
		this.aThread7 = new Thread(this);
		this.aThread7.setPriority(10);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method8976() {
		return this.anObject21;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIII)Lclient!oba;")
	public Class270 method8977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method8993(arg0 << 16, 6, (Object) null, (arg2 << 16) + arg1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lclient!oba;")
	public Class270 method8978(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method8993(0, 9, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/String;ZZI)Lclient!oba;")
	public Class270 method8979(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return this.method8993(0, arg1 ? 22 : 1, arg0, arg2);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLjava/lang/String;B)Lclient!oba;")
	public Class270 method8981(@OriginalArg(1) String arg0) {
		return this.method8993(0, 12, arg0, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)Lclient!oba;")
	public Class270 method8982(@OriginalArg(1) int arg0) {
		return this.method8993(0, 3, (Object) null, arg0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)Lclient!oba;")
	public Class270 method8984() {
		return this.method8993(0, 5, (Object) null, 0);
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public void method8985() {
		synchronized (this) {
			this.aBoolean780 = true;
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass83_2 != null) {
			try {
				this.aClass83_2.method2158();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass83_3 != null) {
			try {
				this.aClass83_3.method2158();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass83Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass83Array1.length; local52++) {
				if (this.aClass83Array1[local52] != null) {
					try {
						this.aClass83Array1[local52].method2158();
					} catch (@Pc(67) IOException local67) {
					}
				}
			}
		}
		if (this.aClass83_4 != null) {
			try {
				this.aClass83_4.method2158();
			} catch (@Pc(90) IOException local90) {
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!oba;")
	public Class270 method8986(@OriginalArg(0) String arg0) {
		return this.method8993(0, 16, arg0, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	public boolean method8987(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;Z)Lclient!oba;")
	public Class270 method8988(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2) {
		return this.method8993(0, 8, new Object[] { arg0, arg2, arg1 }, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/awt/Frame;I)Lclient!oba;")
	public Class270 method8989(@OriginalArg(0) Frame arg0) {
		return this.method8993(0, 7, arg0, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)Z")
	public boolean method8990() {
		if (!this.aBoolean781) {
			return false;
		} else if (this.aBoolean779) {
			return this.aClass15_1 != null;
		} else {
			return this.anObject19 != null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lclient!oba;")
	public Class270 method8991(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method8993(0, 2, arg0, arg1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLjava/net/URL;)Lclient!oba;")
	public Class270 method8992(@OriginalArg(1) URL arg0) {
		return this.method8993(0, 4, arg0, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILjava/lang/Object;II)Lclient!oba;")
	private Class270 method8993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class270 local3 = new Class270();
		local3.anObject12 = arg2;
		local3.anInt6788 = arg3;
		local3.anInt6790 = arg1;
		local3.anInt6787 = arg0;
		synchronized (this) {
			if (this.aClass270_9 == null) {
				this.aClass270_9 = this.aClass270_8 = local3;
			} else {
				this.aClass270_9.aClass270_5 = local3;
				this.aClass270_9 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
	public void method8994() {
		Static689.aLong317 = Static588.method7715() + 5000L;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB[ILjava/awt/Component;Ljava/awt/Point;I)Lclient!oba;")
	public Class270 method8995(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int arg4) {
		return this.method8993(arg0, 17, new Object[] { arg2, arg1, arg3 }, arg4);
	}

	@OriginalMember(owner = "client!vq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class270 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean780) {
						return;
					}
					if (this.aClass270_8 != null) {
						local15 = this.aClass270_8;
						this.aClass270_8 = this.aClass270_8.aClass270_5;
						if (this.aClass270_8 == null) {
							this.aClass270_9 = null;
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
				@Pc(42) int local42 = local15.anInt6790;
				if (local42 == 1) {
					if (Static588.method7715() < Static689.aLong317) {
						throw new IOException();
					}
					local15.anObject13 = new Socket(InetAddress.getByName((String) local15.anObject12), local15.anInt6788);
				} else if (local42 == 22) {
					if (Static689.aLong317 > Static588.method7715()) {
						throw new IOException();
					}
					try {
						local15.anObject13 = Static327.method4894((String) local15.anObject12, local15.anInt6788).method6097();
					} catch (@Pc(947) IOException_Sub1 local947) {
						local15.anObject13 = local947.getMessage();
						throw local947;
					}
				} else if (local42 == 2) {
					@Pc(911) Thread local911 = new Thread((Runnable) local15.anObject12);
					local911.setDaemon(true);
					local911.start();
					local911.setPriority(local15.anInt6788);
					local15.anObject13 = local911;
				} else if (local42 == 4) {
					if (Static588.method7715() < Static689.aLong317) {
						throw new IOException();
					}
					local15.anObject13 = new DataInputStream(((URL) local15.anObject12).openStream());
				} else {
					@Pc(102) Object[] local102;
					if (local42 == 8) {
						local102 = (Object[]) local15.anObject12;
						if (this.aBoolean781 && ((Class) local102[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject13 = ((Class) local102[0]).getDeclaredMethod((String) local102[1], (Class[]) local102[2]);
					} else if (local42 == 9) {
						local102 = (Object[]) local15.anObject12;
						if (this.aBoolean781 && ((Class) local102[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject13 = ((Class) local102[0]).getDeclaredField((String) local102[1]);
					} else if (local42 == 18) {
						@Pc(136) Clipboard local136 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject13 = local136.getContents((Object) null);
					} else if (local42 == 19) {
						@Pc(149) Transferable local149 = (Transferable) local15.anObject12;
						@Pc(152) Clipboard local152 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local152.setContents(local149, (ClipboardOwner) null);
					} else if (this.aBoolean781) {
						@Pc(220) String local220;
						if (local42 == 3) {
							if (Static588.method7715() < Static689.aLong317) {
								throw new IOException();
							}
							local220 = (local15.anInt6788 >> 24 & 0xFF) + "." + (local15.anInt6788 >> 16 & 0xFF) + "." + (local15.anInt6788 >> 8 & 0xFF) + "." + (local15.anInt6788 & 0xFF);
							local15.anObject13 = InetAddress.getByName(local220).getHostName();
						} else if (local42 == 21) {
							if (Static588.method7715() < Static689.aLong317) {
								throw new IOException();
							}
							local15.anObject13 = InetAddress.getByName((String) local15.anObject12).getAddress();
						} else if (local42 == 5) {
							if (this.aBoolean779) {
								local15.anObject13 = this.aClass15_1.method250();
							} else {
								local15.anObject13 = Class.forName("Class66").getMethod("listmodes").invoke(this.anObject19);
							}
						} else if (local42 == 6) {
							@Pc(268) Frame local268 = new Frame("Jagex Full Screen");
							local15.anObject13 = local268;
							local268.setResizable(false);
							if (this.aBoolean779) {
								this.aClass15_1.method248(local268, local15.anInt6787 >> 16, local15.anInt6787 & 0xFFFF, local15.anInt6788 & 0xFFFF, local15.anInt6788 >>> 16);
							} else {
								Class.forName("Class66").getMethod("enter", Static689.aClass24 == null ? (Static689.aClass24 = Class.forName("java.awt.Frame")) : Static689.aClass24, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.anObject19, local268, Integer.valueOf(local15.anInt6788 >>> 16), new Integer(local15.anInt6788 & 0xFFFF), Integer.valueOf(local15.anInt6787 >> 16), new Integer(local15.anInt6787 & 0xFFFF));
							}
						} else if (local42 != 7) {
							@Pc(438) Class83 local438;
							if (local42 == 12) {
								local438 = Static689.method8980(Static689.aString122, Static689.anInt10357, (String) local15.anObject12);
								local15.anObject13 = local438;
							} else if (local42 == 13) {
								local438 = Static689.method8980("", Static689.anInt10357, (String) local15.anObject12);
								local15.anObject13 = local438;
							} else if (this.aBoolean781 && local42 == 14) {
								@Pc(460) int local460 = local15.anInt6788;
								@Pc(463) int local463 = local15.anInt6787;
								if (this.aBoolean779) {
									this.aCallback_Sub1_1.method6431(local460, local463);
								} else {
									Class.forName("Class238").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.anObject20, Integer.valueOf(local460), new Integer(local463));
								}
							} else if (this.aBoolean781 && local42 == 15) {
								@Pc(534) boolean local534 = local15.anInt6788 != 0;
								@Pc(538) Component local538 = (Component) local15.anObject12;
								if (this.aBoolean779) {
									this.aCallback_Sub1_1.method6432(local534, local538);
								} else {
									Class.forName("Class238").getDeclaredMethod("showcursor", Static689.aClass25 == null ? (Static689.aClass25 = Class.forName("java.awt.Component")) : Static689.aClass25, Boolean.TYPE).invoke(this.anObject20, local538, Boolean.valueOf(local534));
								}
							} else if (!this.aBoolean779 && local42 == 17) {
								local102 = (Object[]) local15.anObject12;
								Class.forName("Class238").getDeclaredMethod("setcustomcursor", Static689.aClass25 == null ? (Static689.aClass25 = Class.forName("java.awt.Component")) : Static689.aClass25, Static689.aClass26 == null ? (Static689.aClass26 = Class.forName("[I")) : Static689.aClass26, Integer.TYPE, Integer.TYPE, Static689.aClass27 == null ? (Static689.aClass27 = Class.forName("java.awt.Point")) : Static689.aClass27).invoke(this.anObject20, (Component) local102[0], (int[]) local102[1], Integer.valueOf(local15.anInt6788), new Integer(local15.anInt6787), (Point) local102[2]);
							} else if (local42 == 16) {
								try {
									if (!Static689.aString119.startsWith("win")) {
										throw new Exception();
									}
									local220 = (String) local15.anObject12;
									if (!local220.startsWith("http://") && !local220.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(754) String local754 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(756) int local756 = 0; local220.length() > local756; local756++) {
										if (local754.indexOf(local220.charAt(local756)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local220 + "\"");
									local15.anObject13 = null;
								} catch (@Pc(793) Exception local793) {
									local15.anObject13 = local793;
									throw local793;
								}
							} else {
								throw new Exception("");
							}
						} else if (this.aBoolean779) {
							this.aClass15_1.method249((Frame) local15.anObject12);
						} else {
							Class.forName("Class66").getMethod("exit").invoke(this.anObject19);
						}
					} else {
						throw new Exception("");
					}
				}
				local15.anInt6789 = 1;
			} catch (@Pc(958) ThreadDeath local958) {
				throw local958;
			} catch (@Pc(961) Throwable local961) {
				local15.anInt6789 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}
}
