import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class1_Sub2_Sub26 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		return Static207.anIntArray360;
	}
}
