import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class348_Sub1 extends Class348 {

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Lclient!je;")
	private final Class190 aClass190_1;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!vja;")
	private final Class385 aClass385_1;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class348_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass190_1 = new Class190(this.aSocket2.getInputStream(), arg1);
		this.aClass385_1 = new Class385(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([BIBI)V")
	@Override
	public void method7931(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aClass385_1.method8916(arg0, arg1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B[BII)I")
	@Override
	public int method7929(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass190_1.method4229(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7932(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass190_1.method4224(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	@Override
	public void method7926() {
		try {
			this.aSocket2.close();
		} catch (@Pc(11) IOException local11) {
		}
		this.aClass190_1.method4227();
		this.aClass385_1.method8915();
	}

	@OriginalMember(owner = "client!tc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7926();
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	@Override
	public void method7927() {
		this.aClass190_1.method4225();
		this.aClass385_1.method8918();
	}
}
