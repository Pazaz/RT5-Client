import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class46_Sub2 extends Class46 implements Interface7 {

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
	private int anInt7283;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	private int anInt7282;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!ih;I[BI)V")
	public Class46_Sub2(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7283 = arg1;
		this.anInt7282 = this.aClass40_Sub2_41.method2854(this.anInt7283);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
	@Override
	public int method6093() {
		return 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
	@Override
	public void method6095(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass40_Sub2_41.anOpengl1.glDrawElements(4, arg1, this.anInt7283, this.aByteBuffer7.position(arg0 * this.anInt7282));
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method6094(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method6092(arg0, arg1);
		this.anInt7283 = 5123;
		this.anInt7282 = this.aClass40_Sub2_41.method2854(this.anInt7283);
	}
}
