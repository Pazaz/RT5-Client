import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class Class225 {

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
	private final int anInt5824;

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
	public final int anInt5822;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(II)V")
	public Class225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5824 = arg0;
		this.anInt5822 = arg1;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
	public int method5239() {
		return this.anInt5824;
	}

	@OriginalMember(owner = "client!lga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
