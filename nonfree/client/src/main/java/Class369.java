import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public final class Class369 {

	@OriginalMember(owner = "client!uea", name = "f", descriptor = "[I")
	public final int[] anIntArray750;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "[[F")
	public final float[][] aFloatArrayArray19;

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "[I")
	public final int[] anIntArray751;

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "[I")
	public final int[] anIntArray749;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class369(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray750 = arg0;
		this.aFloatArrayArray19 = arg3;
		this.anIntArray751 = arg1;
		this.anIntArray749 = arg2;
	}
}
