import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class12_Sub1 extends Class12 implements Interface7 {

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
	private int anInt551;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
	private int anInt552;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!ih;I[BIZ)V")
	public Class12_Sub1(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt551 = arg1;
		this.anInt552 = this.aClass40_Sub2_22.method2854(this.anInt551);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method6094(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method3536(arg0, arg1);
		this.anInt551 = 5123;
		this.anInt552 = this.aClass40_Sub2_22.method2854(this.anInt551);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)V")
	@Override
	public void method6095(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass40_Sub2_22.anOpengl1.glDrawElements(4, arg1, this.anInt551, (long) (arg0 * this.anInt552));
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "()I")
	@Override
	public int method6093() {
		return super.method6093();
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "()V")
	@Override
	protected void method3535() {
		this.aClass40_Sub2_22.method2845(this);
	}
}
