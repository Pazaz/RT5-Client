import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class170 {

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public final int anInt4690;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I)V")
	public Class170(@OriginalArg(0) int arg0) {
		this.anInt4690 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
