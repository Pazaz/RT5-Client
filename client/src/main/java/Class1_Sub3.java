import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!af;")
	public Class1_Sub3 aClass1_Sub3_7;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	public int anInt5220;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Lclient!i;")
	public Class1_Sub13 aClass1_Sub13_5;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Z")
	public volatile boolean aBoolean361 = true;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "()Lclient!af;")
	public abstract Class1_Sub3 method4451();

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([III)V")
	protected final void method4452(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean361) {
			this.method4457(arg0, arg1, arg2);
		} else {
			this.method4454(arg2);
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "()Lclient!af;")
	public abstract Class1_Sub3 method4453();

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	public abstract void method4454(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!af", name = "c", descriptor = "()I")
	public int method4455() {
		return 255;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "()I")
	public abstract int method4456();

	@OriginalMember(owner = "client!af", name = "b", descriptor = "([III)V")
	public abstract void method4457(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
