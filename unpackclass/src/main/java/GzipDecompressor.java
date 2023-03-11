import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!k")
public final class GzipDecompressor {

	@OriginalMember(owner = "unpackclass!k", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater2;

	@OriginalMember(owner = "unpackclass!k", name = "<init>", descriptor = "()V")
	public GzipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "unpackclass!k", name = "<init>", descriptor = "(III)V")
	private GzipDecompressor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "unpackclass!k", name = "a", descriptor = "(Lunpackclass!e;[B)V")
	public void method6596(@OriginalArg(0) SimpleBuffer arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray100[arg0.anInt7287] != 31 || arg0.aByteArray100[arg0.anInt7287 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater2 == null) {
			this.anInflater2 = new Inflater(true);
		}
		try {
			this.anInflater2.setInput(arg0.aByteArray100, arg0.anInt7287 + 10, arg0.aByteArray100.length - (arg0.anInt7287 + 10 + 8));
			this.anInflater2.inflate(arg1);
		} catch (@Pc(55) Exception local55) {
			this.anInflater2.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater2.reset();
	}
}
