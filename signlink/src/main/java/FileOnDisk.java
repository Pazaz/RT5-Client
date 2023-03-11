import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rl")
public final class FileOnDisk {

	@OriginalMember(owner = "loader!rl", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile randomAccessFile;

	@OriginalMember(owner = "loader!rl", name = "d", descriptor = "Ljava/io/File;")
	private File file;

	@OriginalMember(owner = "loader!rl", name = "b", descriptor = "J")
	private long position;

	@OriginalMember(owner = "loader!rl", name = "c", descriptor = "J")
	private long maxLength;

	@OriginalMember(owner = "loader!rl", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public FileOnDisk(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.randomAccessFile = new RandomAccessFile(arg0, arg1);
		this.file = arg0;
		this.position = 0L;
		this.maxLength = arg2;
		@Pc(42) int local42 = this.randomAccessFile.read();
		if (local42 != -1 && !arg1.equals("r")) {
			this.randomAccessFile.seek(0L);
			this.randomAccessFile.write(local42);
		}
		this.randomAccessFile.seek(0L);
	}

	@OriginalMember(owner = "loader!rl", name = "a", descriptor = "(B)V")
	public void close() throws IOException {
		if (this.randomAccessFile != null) {
			this.randomAccessFile.close();
			this.randomAccessFile = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[BZ)I")
	public int read(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(11) int local11 = this.randomAccessFile.read(arg2, arg1, arg0);
		if (local11 > 0) {
			this.position += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "loader!rl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.randomAccessFile != null) {
			System.out.println("Warning! fileondisk " + this.file + " not closed correctly using close(). Auto-closing instead. ");
			this.close();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[BII)V")
	public void write(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.maxLength < (long) arg1 + this.position) {
			this.randomAccessFile.seek(this.maxLength);
			this.randomAccessFile.write(1);
			throw new EOFException();
		} else {
			this.randomAccessFile.write(arg0, arg2, arg1);
			this.position += arg1;
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)J")
	public long length() throws IOException {
		return this.randomAccessFile.length();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IJ)V")
	public void seek(@OriginalArg(1) long arg0) throws IOException {
		this.randomAccessFile.seek(arg0);
		this.position = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Ljava/io/File;")
	public File getFile() {
		return this.file;
	}
}
