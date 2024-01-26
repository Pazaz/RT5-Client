import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class190 implements Runnable {

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	private int anInt4665 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	private int anInt4669 = 0;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "I")
	private final int anInt4666;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "[B")
	private final byte[] aByteArray47;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class190(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt4666 = arg1 + 1;
		this.aByteArray47 = new byte[this.anInt4666];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z")
	public boolean method4224(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt4666) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(48) int local48;
			if (this.anInt4665 > this.anInt4669) {
				local48 = this.anInt4666 + this.anInt4669 - this.anInt4665;
			} else {
				local48 = this.anInt4669 - this.anInt4665;
			}
			if (arg0 <= local48) {
				return true;
			} else if (this.anIOException1 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public void method4225() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public void method4227() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}

	@OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(33) int local33;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4665 == 0) {
						local33 = this.anInt4666 - this.anInt4669 - 1;
					} else if (this.anInt4669 >= this.anInt4665) {
						local33 = this.anInt4666 - this.anInt4669;
					} else {
						local33 = this.anInt4665 - this.anInt4669 - 1;
					}
					if (local33 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(71) InterruptedException local71) {
					}
				}
			}
			@Pc(88) int local88;
			try {
				local88 = this.anInputStream1.read(this.aByteArray47, this.anInt4669, local33);
				if (local88 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(97) IOException local97) {
				@Pc(97) IOException local97x = local97;
				synchronized (this) {
					this.anIOException1 = local97x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4669 = (local88 + this.anInt4669) % this.anInt4666;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III[B)I")
	public int method4229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg0 < 0 || arg1 < 0 || arg0 + arg1 > arg2.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(49) int local49;
			if (this.anInt4669 >= this.anInt4665) {
				local49 = this.anInt4669 - this.anInt4665;
			} else {
				local49 = this.anInt4669 + this.anInt4666 - this.anInt4665;
			}
			if (local49 < arg0) {
				arg0 = local49;
			}
			if (arg0 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt4666 >= this.anInt4665 + arg0) {
				Static734.method7694(this.aByteArray47, this.anInt4665, arg2, arg1, arg0);
			} else {
				@Pc(117) int local117 = this.anInt4666 - this.anInt4665;
				Static734.method7694(this.aByteArray47, this.anInt4665, arg2, arg1, local117);
				Static734.method7694(this.aByteArray47, 0, arg2, local117 + arg1, arg0 + -local117);
			}
			this.anInt4665 = (arg0 + this.anInt4665) % this.anInt4666;
			this.notifyAll();
			return arg0;
		}
	}
}
