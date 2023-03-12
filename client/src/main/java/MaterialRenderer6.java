import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class MaterialRenderer6 extends MaterialRenderer {

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!bf;)V")
	public MaterialRenderer6(@OriginalArg(0) Class19_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "()Z")
	@Override
	public boolean method5711() {
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
	@Override
	public void method5714(@OriginalArg(0) boolean arg0) {
		this.aClass19_Sub1_35.method800(true);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	@Override
	public void method5712(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	@Override
	public void method5713(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!kq;)V")
	@Override
	public void method5710(@OriginalArg(0) Class8 arg0) {
		this.aClass19_Sub1_35.method848(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "()V")
	@Override
	public void method5715() {
		this.aClass19_Sub1_35.method800(false);
	}
}
