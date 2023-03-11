import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class127 {

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
	public final int anInt3427;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class127(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3427 = arg1;
	}

	@OriginalMember(owner = "client!kk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
