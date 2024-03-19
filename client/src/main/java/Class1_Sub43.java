import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
	public final int anInt7381;

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
	public final int anInt7383;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(II)V")
	public Class1_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7381 = arg1;
		this.anInt7383 = arg0;
	}
}
