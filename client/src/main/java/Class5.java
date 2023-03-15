import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class Class5 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)J")
	public abstract long method4405();

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
	public abstract void method4408();

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)I")
	public abstract int method4409(@OriginalArg(1) int arg0);
}
