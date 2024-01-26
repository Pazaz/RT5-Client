import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class155 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public final int anInt3714;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V")
	public Class155(@OriginalArg(0) int arg0) {
		this.anInt3714 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
