import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class345 {

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
	private final int anInt8829;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	public final int anInt8827;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(II)V")
	public Class345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8829 = arg0;
		this.anInt8827 = arg1;
	}

	@OriginalMember(owner = "client!ss", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)I")
	public int method7826() {
		return this.anInt8829;
	}
}
