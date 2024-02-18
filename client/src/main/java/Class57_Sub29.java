import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public final class Class57_Sub29 extends Class57 {

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "Z")
	public boolean aBoolean674 = false;

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "Z")
	private boolean aBoolean675 = true;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub29(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)Z")
	public boolean method7913() {
		return this.aBoolean675;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)I")
	public int method7915() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
	@Override
	public void method8350() {
		if (!super.aClass2_Sub34_34.method5108().method5203()) {
			super.anInt9489 = 0;
		}
		if (super.anInt9489 < 0 || super.anInt9489 > 5) {
			super.anInt9489 = this.method8354();
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)I")
	@Override
	protected int method8354() {
		this.aBoolean674 = true;
		return super.aClass2_Sub34_34.method5108().method5203() ? 2 : 0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8353(@OriginalArg(1) int arg0) {
		this.aBoolean674 = false;
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(B)Z")
	public boolean method7917() {
		return super.aClass2_Sub34_34.method5108().method5203();
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZB)V")
	public void method7918(@OriginalArg(0) boolean arg0) {
		this.aBoolean675 = arg0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IB)I")
	@Override
	public int method8352(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub34_34.method5108().method5203()) {
			return arg0 == 3 && !Static436.method3417("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}
}
