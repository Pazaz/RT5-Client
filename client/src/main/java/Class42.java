import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class42 implements Runnable {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "Lclient!or;")
	private Class145 aClass145_3;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	private int anInt1454 = 0;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "I")
	private int anInt1464 = 0;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!ud;")
	private final Class199 aClass199_4;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ud;)V")
	public Class42(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class199 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass199_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)I")
	public int method1263() throws IOException {
		return this.aBoolean93 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!db", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1271();
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	public void method1267() throws IOException {
		if (!this.aBoolean93 && this.aBoolean95) {
			this.aBoolean95 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!db", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(37) int local37;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt1464 == this.anInt1454) {
							if (this.aBoolean93) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt1454 >= this.anInt1464) {
							local37 = this.anInt1454 - this.anInt1464;
						} else {
							local37 = 5000 - this.anInt1464;
						}
						local48 = this.anInt1464;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray8, local48, local37);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean95 = true;
					}
					this.anInt1464 = (local37 + this.anInt1464) % 5000;
					try {
						if (this.anInt1454 == this.anInt1464) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean95 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray8 = null;
				break;
			}
		} catch (@Pc(122) Exception local122) {
			Static58.method1402(null, local122);
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)I")
	public int method1269() throws IOException {
		return this.aBoolean93 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II[BI)V")
	public void method1270(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean93) {
			return;
		}
		while (arg2 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg0 += local23;
			arg2 -= local23;
		}
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
	public void method1271() {
		if (this.aBoolean93) {
			return;
		}
		synchronized (this) {
			this.aBoolean93 = true;
			this.notifyAll();
		}
		if (this.aClass145_3 != null) {
			while (this.aClass145_3.anInt5065 == 0) {
				Static295.method5212(1L);
			}
			if (this.aClass145_3.anInt5065 == 1) {
				try {
					((Thread) this.aClass145_3.anObject6).join();
				} catch (@Pc(61) InterruptedException local61) {
				}
			}
		}
		this.aClass145_3 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III[B)V")
	public void method1273(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean93) {
			return;
		}
		if (this.aBoolean95) {
			this.aBoolean95 = false;
			throw new IOException();
		}
		if (this.aByteArray8 == null) {
			this.aByteArray8 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray8[this.anInt1454] = arg1[local32];
				this.anInt1454 = (this.anInt1454 + 1) % 5000;
				if ((this.anInt1464 + 4900) % 5000 == this.anInt1454) {
					throw new IOException();
				}
			}
			if (this.aClass145_3 == null) {
				this.aClass145_3 = this.aClass199_4.method5482(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
	public void method1274() {
		if (!this.aBoolean93) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}
}
