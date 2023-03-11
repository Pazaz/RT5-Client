import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class89 {

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	public final int anInt2405;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	private final int anInt2404;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V")
	public Class89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2405 = arg1;
		this.anInt2404 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)I")
	public int method2399() {
		return this.anInt2404;
	}
}
