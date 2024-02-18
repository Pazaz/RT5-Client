import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class57_Sub28 extends Class57 {

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub28(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
		Static690.method8996(super.anInt9489);
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
		Static690.method8996(super.anInt9489);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)I")
	@Override
	protected int method8354() {
		return super.aClass2_Sub34_34.method5108().method5197() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)I")
	@Override
	public int method8352(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub34_34.method5108().method5197() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8353(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
		Static690.method8996(super.anInt9489);
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(B)Z")
	public boolean method7837() {
		return super.aClass2_Sub34_34.method5108().method5197() >= 96;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)I")
	public int method7838() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	@Override
	public void method8350() {
		if (super.aClass2_Sub34_34.method5108().method5197() < 96) {
			super.anInt9489 = 0;
		}
		if (super.anInt9489 < 0 || super.anInt9489 > 2) {
			super.anInt9489 = this.method8354();
		}
	}
}
