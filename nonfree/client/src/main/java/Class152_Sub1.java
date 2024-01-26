import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class152_Sub1 extends Class152 {

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	public Class152_Sub1() {
		super(true);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!cka;B)V")
	@Override
	protected void method9086(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1) {
		Static315.method4577(arg0, arg1);
	}
}
