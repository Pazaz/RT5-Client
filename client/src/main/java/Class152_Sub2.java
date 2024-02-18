import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class Class152_Sub2 extends Class152 {

	@OriginalMember(owner = "client!wq", name = "P", descriptor = "Lclient!eo;")
	private final Class8_Sub2 aClass8_Sub2_24;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!eo;Z)V")
	public Class152_Sub2(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass8_Sub2_24 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!cka;B)V")
	@Override
	protected final void method9086(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1) {
		Static431.method5827(arg1, arg0, this.aClass8_Sub2_24);
	}
}
