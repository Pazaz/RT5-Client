import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class151 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class151() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(III)V")
	private Class151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!il;[BZ)V")
	public void method4386(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray86[arg0.anInt6813] != 31 || arg0.aByteArray86[arg0.anInt6813 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray86, arg0.anInt6813 + 10, -10 - arg0.anInt6813 - (8 - arg0.aByteArray86.length));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
