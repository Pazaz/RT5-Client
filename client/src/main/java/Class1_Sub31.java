import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "Ljava/lang/String;")
	public String aString205;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	private Class1_Sub31() {
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub31(@OriginalArg(0) String arg0) {
		this.aString205 = arg0;
	}
}
