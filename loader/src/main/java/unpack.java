import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!unpack")
public class unpack {

	@OriginalMember(owner = "loader!unpack", name = "cache", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable cache = new Hashtable();

	@OriginalMember(owner = "loader!unpack", name = "<init>", descriptor = "()V")
	public unpack() {
	}

	@OriginalMember(owner = "loader!unpack", name = "<init>", descriptor = "([B)V")
	public unpack(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(14) ZipInputStream local14 = new ZipInputStream(new ByteArrayInputStream(arg0));
		@Pc(17) byte[] local17 = new byte[1000];
		while (true) {
			@Pc(27) String local27;
			do {
				@Pc(20) ZipEntry local20 = local14.getNextEntry();
				if (local20 == null) {
					local14.close();
					return;
				}
				local27 = local20.getName();
			} while (!local27.endsWith(".class"));
			local27 = local27.substring(0, local27.length() - 6);
			local27 = local27.replace('/', '.');
			@Pc(48) ByteArrayOutputStream local48 = new ByteArrayOutputStream();
			while (true) {
				@Pc(54) int local54 = local14.read(local17, 0, 1000);
				if (local54 == -1) {
					@Pc(67) byte[] local67 = local48.toByteArray();
					this.cache.put(local27, local67);
					break;
				}
				local48.write(local17, 0, local54);
			}
		}
	}

	@OriginalMember(owner = "loader!unpack", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public final byte[] method6193(@OriginalArg(1) String arg0) {
		return (byte[]) this.cache.remove(arg0);
	}
}
