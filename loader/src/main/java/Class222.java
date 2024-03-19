import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!an")
public final class Class222 {

	@OriginalMember(owner = "loader!an", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!an", name = "d", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!an", name = "b", descriptor = "J")
	private long aLong237;

	@OriginalMember(owner = "loader!an", name = "a", descriptor = "J")
	private long aLong236;

	@OriginalMember(owner = "loader!an", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class222(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong237 = arg2;
		this.aLong236 = 0L;
		@Pc(41) int local41 = this.aRandomAccessFile2.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local41);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!an", name = "a", descriptor = "([BIII)V")
	private void method6176(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong237 < (long) arg3 + this.aLong236) {
			this.aRandomAccessFile2.seek(this.aLong237);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else if (arg1 == 1) {
			this.aRandomAccessFile2.write(arg0, arg2, arg3);
			this.aLong236 += arg3;
		}
	}

	@OriginalMember(owner = "loader!an", name = "a", descriptor = "(JI)V")
	private void method6177(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		if (arg1 != -16156) {
			this.aLong236 = 36L;
		}
		this.aLong236 = arg0;
	}

	@OriginalMember(owner = "loader!an", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6178(1);
		}
	}

	@OriginalMember(owner = "loader!an", name = "b", descriptor = "(I)V")
	public void method6178(@OriginalArg(0) int arg0) throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!an", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method6179(@OriginalArg(0) byte arg0) {
		if (arg0 != -114) {
			this.aLong237 = 119L;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!an", name = "a", descriptor = "(I)J")
	private long method6180(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 >= -91) {
			this.aFile2 = null;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!an", name = "a", descriptor = "(I[BII)I")
	private int method6181(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg3 != 0) {
			this.aLong237 = -91L;
		}
		@Pc(11) int local11 = this.aRandomAccessFile2.read(arg1, arg2, arg0);
		if (local11 > 0) {
			this.aLong236 += local11;
		}
		return local11;
	}
}
