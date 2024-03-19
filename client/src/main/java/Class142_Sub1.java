import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class142_Sub1 extends Class142 {

	@OriginalMember(owner = "client!on", name = "w", descriptor = "[I")
	public final int[] anIntArray372;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "[I")
	public final int[] anIntArray371;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(II[I[I)V")
	public Class142_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray372 = arg3;
		this.anIntArray371 = arg2;
	}
}
