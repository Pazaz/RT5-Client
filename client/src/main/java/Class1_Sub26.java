import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
	public int anInt4811;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	private Class1_Sub26() {
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(I)V")
	public Class1_Sub26(@OriginalArg(0) int arg0) {
		this.anInt4811 = arg0;
	}
}
