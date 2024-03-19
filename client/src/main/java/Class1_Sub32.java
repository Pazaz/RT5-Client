import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
	public volatile int anInt5877 = -1;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Ljava/lang/String;")
	public final String aString220;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub32(@OriginalArg(0) String arg0) {
		this.aString220 = arg0;
	}
}
