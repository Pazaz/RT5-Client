import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class83 {

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "J")
	private long aLong88;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "J")
	private final long aLong87;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class83(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong88 = 0L;
		this.aFile1 = arg0;
		this.aLong87 = arg2;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
	public void method2158() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZJ)V")
	public void method2160(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong88 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)J")
	public long method2161() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!dm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2158();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B[BII)V")
	public void method2162(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong88 + (long) arg2 > this.aLong87) {
			this.aRandomAccessFile1.seek(this.aLong87);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong88 += (long) arg2;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BI[BI)I")
	public int method2163(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(19) int local19 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local19 > 0) {
			this.aLong88 += (long) local19;
		}
		return local19;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)Ljava/io/File;")
	public File method2164() {
		return this.aFile1;
	}
}
