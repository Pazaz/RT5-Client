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
public final class BufferedSocket implements Runnable {

	@OriginalMember(owner = "client!iu", name = "q", descriptor = "Lclient!cc;")
	private PrivilegedRequest thread;

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "[B")
	private byte[] buffer;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "Z")
	private boolean error = false;

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "Z")
	private boolean closed = false;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
	private int readPointer = 0;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
	private int writePointer = 0;

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket socket;

	@OriginalMember(owner = "client!iu", name = "u", descriptor = "Lclient!ml;")
	private final Signlink signlink;

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "Ljava/io/InputStream;")
	private InputStream in;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream out;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ml;)V")
	public BufferedSocket(@OriginalArg(0) Socket arg0, @OriginalArg(1) Signlink arg1) throws IOException {
		this.socket = arg0;
		this.signlink = arg1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
	public void checkError() throws IOException {
		if (!this.closed && this.error) {
			this.error = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!iu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.close();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([BIII)V")
	public void read(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.closed) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.in.read(arg0, arg2, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg1 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)I")
	public int available() throws IOException {
		return this.closed ? 0 : this.in.available();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZII[B)V")
	public void write(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.closed) {
			return;
		}
		if (this.error) {
			this.error = false;
			throw new IOException();
		}
		if (this.buffer == null) {
			this.buffer = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.buffer[this.writePointer] = arg1[local38];
				this.writePointer = (this.writePointer + 1) % 5000;
				if (this.writePointer == (this.readPointer + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.thread == null) {
				this.thread = this.signlink.startThread(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
	public void close() {
		if (this.closed) {
			return;
		}
		synchronized (this) {
			this.closed = true;
			this.notifyAll();
		}
		if (this.thread != null) {
			while (this.thread.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (this.thread.status == 1) {
				try {
					((Thread) this.thread.result).join();
				} catch (@Pc(54) InterruptedException ignored) {
				}
			}
		}
		this.thread = null;
	}

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)I")
	public int read() throws IOException {
		return this.closed ? 0 : this.in.read();
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
						if (this.writePointer == this.readPointer) {
							if (this.closed) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.readPointer <= this.writePointer) {
							local37 = this.writePointer - this.readPointer;
						} else {
							local37 = 5000 - this.readPointer;
						}
						local47 = this.readPointer;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.out.write(this.buffer, local47, local37);
					} catch (@Pc(67) IOException local67) {
						this.error = true;
					}
					this.readPointer = (local37 + this.readPointer) % 5000;
					try {
						if (this.writePointer == this.readPointer) {
							this.out.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.error = true;
					}
					continue;
				}
				try {
					if (this.in != null) {
						this.in.close();
					}
					if (this.out != null) {
						this.out.close();
					}
					if (this.socket != null) {
						this.socket.close();
					}
				} catch (@Pc(116) IOException local116) {
				}
				this.buffer = null;
				break;
			}
		} catch (@Pc(121) Exception local121) {
			TracingException.report(local121, null);
		}
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)V")
	public void breakConnection() {
		if (!this.closed) {
			this.in = new BrokenInputStream();
			this.out = new BrokenOutputStream();
		}
	}
}
