import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class300 {

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(III)V")
	private Class300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "()V")
	public Class300() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILclient!ge;[B)V")
	public void method6761(@OriginalArg(1) Packet arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.data[arg0.pos] != 31 || arg0.data[arg0.pos + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.data, arg0.pos + 10, -8 - arg0.pos - (10 - arg0.data.length));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "([BZ)[B")
	public byte[] method6762(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Packet local8 = new Packet(arg0);
		local8.pos = arg0.length - 4;
		@Pc(24) int local24 = local8.ig4();
		@Pc(27) byte[] local27 = new byte[local24];
		local8.pos = 0;
		this.method6761(local8, local27);
		return local27;
	}
}
