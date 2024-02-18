import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public final class Class57_Sub6 extends Class57 {

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub6(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8353(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Z)I")
	public int method2714() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IB)I")
	@Override
	public int method8352(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub34_34.method5111()) {
			return 3;
		} else if (super.aClass2_Sub34_34.method5105() == Static673.aClass377_8) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(B)Z")
	public boolean method2715() {
		if (super.aClass2_Sub34_34.method5111()) {
			return false;
		} else {
			return super.aClass2_Sub34_34.method5105() == Static673.aClass377_8;
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)I")
	@Override
	protected int method8354() {
		return 1;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)V")
	@Override
	public void method8350() {
		if (super.aClass2_Sub34_34.method5105() != Static673.aClass377_8) {
			super.anInt9489 = 1;
		} else if (super.aClass2_Sub34_34.method5111()) {
			super.anInt9489 = 0;
		}
		if (super.anInt9489 != 0 && super.anInt9489 != 1) {
			super.anInt9489 = this.method8354();
		}
	}
}
