import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!iia", name = "k", descriptor = "I")
	public final int anInt4356;

	@OriginalMember(owner = "client!iia", name = "p", descriptor = "I")
	public final int anInt4352;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(II)V")
	public Class2_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4356 = arg0;
		this.anInt4352 = arg1;
	}
}
