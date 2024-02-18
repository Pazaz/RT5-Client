import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
	public final int anInt1958;

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
	public int anInt1959;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(II)V")
	public Class2_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1958 = arg0;
		this.anInt1959 = arg1;
	}
}
