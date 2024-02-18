import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public final class Class57_Sub19 extends Class57 {

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub19(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)I")
	@Override
	protected int method8354() {
		return super.aClass2_Sub34_34.method5105() == Static673.aClass377_8 && super.aClass2_Sub34_34.method5111() ? 0 : 1;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	@Override
	public void method8350() {
		super.anInt9489 = this.method8354();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)I")
	public int method5960() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)I")
	@Override
	public int method8352(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8353(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}
}
