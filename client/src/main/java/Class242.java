import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class242 {

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public final int anInt7038;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(II)V")
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7038 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
