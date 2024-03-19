import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class13_Sub1(@OriginalArg(0) Class40_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "()Z")
	@Override
	public boolean method4592() {
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "()V")
	@Override
	public void method4588() {
		this.aClass40_Sub2_32.method2881(false);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!dg;)V")
	@Override
	public void method4590(@OriginalArg(0) Class44 arg0) {
		this.aClass40_Sub2_32.method2882(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	@Override
	public void method4589(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
	@Override
	public void method4591(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
	@Override
	public void method4593(@OriginalArg(0) boolean arg0) {
		this.aClass40_Sub2_32.method2881(true);
	}
}
