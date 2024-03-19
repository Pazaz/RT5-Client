import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class10 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	private Class10() {
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I[BII)I")
	public int method354(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong19 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)J")
	public long method355() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
	public void method356() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(JI)V")
	public void method357(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong19 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([BIII)V")
	public void method358(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg2 + this.aLong19 > this.aLong20) {
			this.aRandomAccessFile1.seek(this.aLong20);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong19 += arg2;
		}
	}

	@OriginalMember(owner = "client!an", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method356();
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method359() {
		return this.aFile1;
	}
}
