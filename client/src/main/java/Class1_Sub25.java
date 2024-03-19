import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "Z")
	public boolean aBoolean320;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "Lclient!ih;")
	protected final Class40_Sub2 aClass40_Sub2_28;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class1_Sub25(@OriginalArg(0) Class40_Sub2 arg0) {
		this.aClass40_Sub2_28 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)Z")
	public final boolean method3927() {
		return false;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "()Z")
	public abstract boolean method3928();

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "()V")
	public abstract void method3929();

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)I")
	public final int method3930() {
		return 1;
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "()Z")
	public abstract boolean method3931();

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "()I")
	public int method3932() {
		return 0;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)Z")
	public final boolean method3933() {
		return this.aBoolean320;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)V")
	public abstract void method3934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!eq;Lclient!eq;)V")
	public abstract void method3935(@OriginalArg(0) int arg0, @OriginalArg(1) Class44_Sub1 arg1, @OriginalArg(2) Class44_Sub1 arg2);

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V")
	public abstract void method3936(@OriginalArg(0) int arg0);
}
