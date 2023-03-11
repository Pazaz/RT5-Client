import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class92 {

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class92() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V")
	private Class92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([BILclient!bt;)V")
	public void method2436(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg1.aByteArray73[arg1.anInt5300] != 31 || arg1.aByteArray73[arg1.anInt5300 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray73, arg1.anInt5300 + 10, -arg1.anInt5300 + -18 + arg1.aByteArray73.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
