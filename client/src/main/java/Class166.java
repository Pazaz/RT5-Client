import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class166 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_25;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
	public final int anInt4504;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!bf;I[Lclient!cg;)V")
	public Class166(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35[] arg2) {
		this.aClass19_Sub1_25 = arg0;
		this.anInt4504 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub1_25.method820(this.anInt4504);
		super.finalize();
	}
}
