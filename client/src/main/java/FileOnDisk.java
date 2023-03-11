import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class FileOnDisk {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "J")
	private long aLong166;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "J")
	private long aLong167;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
	public void close() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[BZ)I")
	public int method5194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local11 > 0) {
			this.aLong167 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!rl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.close();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[BII)V")
	public void method5195(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong166 < (long) arg1 + this.aLong167) {
			this.aRandomAccessFile1.seek(this.aLong166);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong167 += arg1;
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)J")
	public long method5196() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IJ)V")
	public void method5197(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong167 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method5198() {
		return this.aFile1;
	}
}
