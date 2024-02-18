import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tka")
public final class Class355 {

	@OriginalMember(owner = "client!tka", name = "f", descriptor = "I")
	public final int anInt9458;

	@OriginalMember(owner = "client!tka", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public Class355(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		this.anInt9458 = arg3;
	}

	@OriginalMember(owner = "client!tka", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
