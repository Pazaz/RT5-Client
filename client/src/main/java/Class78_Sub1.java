import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "[I")
	public final int[] anIntArray139;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
	public final int[] anIntArray140;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(II[I[I)V")
	public Class78_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray139 = arg2;
		this.anIntArray140 = arg3;
	}
}
