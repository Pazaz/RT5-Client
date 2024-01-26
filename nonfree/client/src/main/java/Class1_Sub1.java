import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
	public final int[] anIntArray335;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "[I")
	public final int[] anIntArray334;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray335 = arg3;
		this.anIntArray334 = arg2;
	}
}
