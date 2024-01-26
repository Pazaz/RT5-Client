import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class Class2_Sub48 extends Class2 {

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "J")
	public long aLong264;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	private Class2_Sub48() {
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(J)V")
	public Class2_Sub48(@OriginalArg(0) long arg0) {
		this.aLong264 = arg0;
	}
}
