import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!nw", name = "l", descriptor = "[I")
	public final int[] anIntArray531;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(I)V")
	public Class2_Sub40(@OriginalArg(0) int arg0) {
		this.anIntArray531 = new int[arg0];
	}
}
