import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class145 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	private final int anInt3739;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V")
	public Class145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3739 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)I")
	public int method3702() {
		return this.anInt3739;
	}
}
