import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class2_Sub3_Sub27 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		return Static334.anIntArray424;
	}
}
