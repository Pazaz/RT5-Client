import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class Class33 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!bf;")
	protected final Class19_Sub1 aClass19_Sub1_35;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class33(@OriginalArg(0) Class19_Sub1 arg0) {
		this.aClass19_Sub1_35 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!kq;)V")
	public abstract void method5710(@OriginalArg(0) Class8 arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()Z")
	public abstract boolean method5711();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public abstract void method5712(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public abstract void method5713(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V")
	public abstract void method5714(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "()V")
	public abstract void method5715();
}
