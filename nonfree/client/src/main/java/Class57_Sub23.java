import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public final class Class57_Sub23 extends Class57 {

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub23(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IB)I")
	@Override
	public int method8352(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub34_34.method5111()) {
			return 3;
		} else if (super.aClass2_Sub34_34.method5105() == Static673.aClass377_8) {
			if (arg0 == 0) {
				if (super.aClass2_Sub34_34.aClass57_Sub16_1.method5507() == 1) {
					return 2;
				}
				if (super.aClass2_Sub34_34.aClass57_Sub30_1.method8356() == 1) {
					return 2;
				}
				if (super.aClass2_Sub34_34.aClass57_Sub26_1.method7463() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V")
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

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8353(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "(B)Z")
	public boolean method7053() {
		if (super.aClass2_Sub34_34.method5111()) {
			return false;
		} else {
			return super.aClass2_Sub34_34.method5105() == Static673.aClass377_8;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)I")
	@Override
	protected int method8354() {
		return 1;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Z)I")
	public int method7054() {
		return super.anInt9489;
	}
}
