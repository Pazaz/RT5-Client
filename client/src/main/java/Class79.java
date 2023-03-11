import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class79 {

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray17;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class79(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray17 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!gd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method2267(@OriginalArg(0) int arg0) {
		return this.aStringArray17[arg0];
	}
}
