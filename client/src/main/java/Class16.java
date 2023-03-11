import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class16 implements Interface10 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public final int anInt538;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class16(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt538 = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
