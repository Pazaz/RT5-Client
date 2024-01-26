import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public final class Class397 {

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
	public final int anInt10568;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(I)V")
	public Class397(@OriginalArg(0) int arg0) {
		this.anInt10568 = arg0;
	}

	@OriginalMember(owner = "client!wda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
