import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class111 implements Runnable {

	@OriginalMember(owner = "client!iu", name = "q", descriptor = "Lclient!cc;")
	private PrivilegedRequest aClass32_6;

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
	private int anInt2814 = 0;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
	private int anInt2821 = 0;

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!iu", name = "u", descriptor = "Lclient!ml;")
	private final Signlink aClass152_2;

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ml;)V")
	public Class111(@OriginalArg(0) Socket arg0, @OriginalArg(1) Signlink arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass152_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
	public void method2792() throws IOException {
		if (!this.aBoolean197 && this.aBoolean196) {
			this.aBoolean196 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!iu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2799();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([BIII)V")
	public void method2793(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean197) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg1 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)I")
	public int method2795() throws IOException {
		return this.aBoolean197 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZII[B)V")
	public void method2797(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean197) {
			return;
		}
		if (this.aBoolean196) {
			this.aBoolean196 = false;
			throw new IOException();
		}
		if (this.aByteArray29 == null) {
			this.aByteArray29 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray29[this.anInt2821] = arg1[local38];
				this.anInt2821 = (this.anInt2821 + 1) % 5000;
				if (this.anInt2821 == (this.anInt2814 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass32_6 == null) {
				this.aClass32_6 = this.aClass152_2.startThread(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
	public void method2799() {
		if (this.aBoolean197) {
			return;
		}
		synchronized (this) {
			this.aBoolean197 = true;
			this.notifyAll();
		}
		if (this.aClass32_6 != null) {
			while (this.aClass32_6.status == 0) {
				Static231.method4023(1L);
			}
			if (this.aClass32_6.status == 1) {
				try {
					((Thread) this.aClass32_6.result).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass32_6 = null;
	}

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)I")
	public int method2800() throws IOException {
		return this.aBoolean197 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!iu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(37) int local37;
					@Pc(47) int local47;
					synchronized (this) {
						if (this.anInt2821 == this.anInt2814) {
							if (this.aBoolean197) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2814 <= this.anInt2821) {
							local37 = this.anInt2821 - this.anInt2814;
						} else {
							local37 = 5000 - this.anInt2814;
						}
						local47 = this.anInt2814;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray29, local47, local37);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean196 = true;
					}
					this.anInt2814 = (local37 + this.anInt2814) % 5000;
					try {
						if (this.anInt2821 == this.anInt2814) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean196 = true;
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
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray29 = null;
				break;
			}
		} catch (@Pc(121) Exception local121) {
			Static262.method6253(local121, null);
		}
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)V")
	public void method2801() {
		if (!this.aBoolean197) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}
}
