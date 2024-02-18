import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
public final class unpack_Sub1 extends unpack {

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "([BZ)[B")
	private static byte[] method9468(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(5) byte[] local5 = new byte[arg0.length + 2];
		local5[0] = 31;
		local5[1] = -117;
		System.arraycopy(arg0, 0, local5, 2, arg0.length);
		@Pc(30) ByteArrayOutputStream local30 = new ByteArrayOutputStream();
		Pack200.newUnpacker().unpack(new GZIPInputStream(new ByteArrayInputStream(local5)), new JarOutputStream(local30));
		return local30.toByteArray();
	}

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "([B)V")
	public unpack_Sub1(@OriginalArg(0) byte[] arg0) throws IOException {
		super(method9468(arg0));
	}
}
