import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
	protected final int anInt6348;

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
	public int anInt6350;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
	public int anInt6347;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
	public int anInt6342;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
	public int anInt6344;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
	public final int anInt6346;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
	public final int anInt6341;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class11_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6348 = arg1;
		this.anInt6350 = arg5;
		this.anInt6347 = arg4;
		this.anInt6342 = arg2;
		this.anInt6344 = arg0;
		this.anInt6346 = arg6;
		this.anInt6341 = arg3;
	}

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "(I)I")
	public abstract int method5748();

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
	@Override
	public final void method6069() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method6076() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public final void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	public boolean method6086() {
		return false;
	}

	public void method6087(Class19 arg0) {
		throw new IllegalStateException();
	}
}
