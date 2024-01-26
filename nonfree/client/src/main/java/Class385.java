import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vja")
public final class Class385 implements Runnable {

	@OriginalMember(owner = "client!vja", name = "i", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!vja", name = "g", descriptor = "I")
	private int anInt10282 = 0;

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "I")
	private int anInt10283 = 0;

	@OriginalMember(owner = "client!vja", name = "j", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "I")
	private final int anInt10287;

	@OriginalMember(owner = "client!vja", name = "e", descriptor = "[B")
	private final byte[] aByteArray108;

	@OriginalMember(owner = "client!vja", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class385(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream2 = arg0;
		this.anInt10287 = arg1 + 1;
		this.aByteArray108 = new byte[this.anInt10287];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(I)V")
	public void method8915() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}

	@OriginalMember(owner = "client!vja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt10283 < this.anInt10282) {
						local34 = this.anInt10283 + this.anInt10287 - this.anInt10282;
					} else {
						local34 = this.anInt10283 - this.anInt10282;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(54) IOException local54) {
						this.anIOException2 = local54;
						return;
					}
					try {
						this.wait();
					} catch (@Pc(64) InterruptedException local64) {
					}
				}
			}
			try {
				if (this.anInt10287 < this.anInt10282 + local34) {
					@Pc(90) int local90 = this.anInt10287 - this.anInt10282;
					this.anOutputStream2.write(this.aByteArray108, this.anInt10282, local90);
					this.anOutputStream2.write(this.aByteArray108, 0, local34 - local90);
				} else {
					this.anOutputStream2.write(this.aByteArray108, this.anInt10282, local34);
				}
			} catch (@Pc(119) IOException local119x) {
				@Pc(119) IOException local119 = local119x;
				synchronized (this) {
					this.anIOException2 = local119;
					return;
				}
			}
			synchronized (this) {
				this.anInt10282 = (this.anInt10282 + local34) % this.anInt10287;
			}
		}
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "([BIII)V")
	public void method8916(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg1 < 0 || 0 < 0 || arg0.length < arg1) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(60) int local60;
			if (this.anInt10283 < this.anInt10282) {
				local60 = this.anInt10282 - this.anInt10283 - 1;
			} else {
				local60 = this.anInt10282 + this.anInt10287 - this.anInt10283 - 1;
			}
			if (arg1 > local60) {
				throw new IOException("");
			}
			if (arg1 + this.anInt10283 > this.anInt10287) {
				@Pc(101) int local101 = this.anInt10287 - this.anInt10283;
				Static734.method7694(arg0, 0, this.aByteArray108, this.anInt10283, local101);
				Static734.method7694(arg0, local101, this.aByteArray108, 0, arg1 - local101);
			} else {
				Static734.method7694(arg0, 0, this.aByteArray108, this.anInt10283, arg1);
			}
			this.anInt10283 = (arg1 + this.anInt10283) % this.anInt10287;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(I)V")
	public void method8918() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}
}
