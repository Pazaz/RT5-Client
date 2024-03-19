import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
	public int anInt3986;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
	public final int anInt3991;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(II)V")
	public Class1_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3986 = arg1;
		this.anInt3991 = arg0;
	}
}
