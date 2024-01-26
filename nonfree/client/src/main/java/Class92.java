import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public final class Class92 {

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
	public final int anInt2416;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(I)V")
	public Class92(@OriginalArg(0) int arg0) {
		this.anInt2416 = arg0;
	}

	@OriginalMember(owner = "client!eba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
