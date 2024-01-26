import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public final class Class167 {

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "I")
	public final int anInt3973;

	@OriginalMember(owner = "client!hja", name = "<init>", descriptor = "(II)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3973 = arg0;
	}

	@OriginalMember(owner = "client!hja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
