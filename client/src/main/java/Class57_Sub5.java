import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dma")
public final class Class57_Sub5 extends Class57 {

	@OriginalMember(owner = "client!dma", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dma", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub5(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8353(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(Z)I")
	public int method2172() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!dma", name = "b", descriptor = "(B)Z")
	public boolean method2173() {
		@Pc(10) int local10 = super.aClass2_Sub34_34.method5108().method5197();
		return local10 >= 96;
	}

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(B)V")
	@Override
	public void method8350() {
		@Pc(17) int local17 = super.aClass2_Sub34_34.method5108().method5197();
		if (local17 < 96) {
			super.anInt9489 = 0;
		}
		if (super.anInt9489 > 1 && local17 < 128) {
			super.anInt9489 = 1;
		}
		if (super.anInt9489 > 2 && local17 < 192) {
			super.anInt9489 = 2;
		}
		if (super.anInt9489 < 0 || super.anInt9489 > 3) {
			super.anInt9489 = this.method8354();
		}
	}

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(I)I")
	@Override
	protected int method8354() {
		return 0;
	}

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(IB)I")
	@Override
	public int method8352(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = super.aClass2_Sub34_34.method5108().method5197();
		if (local10 < 96) {
			return 3;
		} else if (arg0 > 1 && local10 < 128) {
			return 3;
		} else if (arg0 > 3 && local10 < 192) {
			return 3;
		} else {
			return 1;
		}
	}
}
