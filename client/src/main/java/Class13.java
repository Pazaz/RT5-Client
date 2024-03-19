import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public abstract class Class13 {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "Lclient!ih;")
	protected final Class40_Sub2 aClass40_Sub2_32;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class13(@OriginalArg(0) Class40_Sub2 arg0) {
		this.aClass40_Sub2_32 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "()V")
	public abstract void method4588();

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	public abstract void method4589(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!dg;)V")
	public abstract void method4590(@OriginalArg(0) Class44 arg0);

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
	public abstract void method4591(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "()Z")
	public abstract boolean method4592();

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(Z)V")
	public abstract void method4593(@OriginalArg(0) boolean arg0);
}
