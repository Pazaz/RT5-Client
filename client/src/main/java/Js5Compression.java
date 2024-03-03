import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Js5Compression {

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	public static final int MAX_LENGTH = 0;
	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!hg;")
	public static final GzipDecompressor GZIP_DECOMPRESSOR = new GzipDecompressor();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([BI)[B")
	public static byte[] uncompress(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Packet local8 = new Packet(arg0);
		@Pc(12) int local12 = local8.g1();
		@Pc(23) int local23 = local8.g4();
		if (local23 < 0 || MAX_LENGTH != 0 && MAX_LENGTH < local23) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(45) byte[] local45 = new byte[local23];
			local8.gdata(local45, local23);
			return local45;
		} else {
			@Pc(57) int local57 = local8.g4();
			if (local57 < 0 || MAX_LENGTH != 0 && MAX_LENGTH < local57) {
				throw new RuntimeException();
			}
			@Pc(71) byte[] local71 = new byte[local57];
			if (local12 == 1) {
				BZip2InputStream.bunzip2(local71, local57, arg0, local23);
			} else {
				GZIP_DECOMPRESSOR.gunzip(local71, local8);
			}
			return local71;
		}
	}

}
