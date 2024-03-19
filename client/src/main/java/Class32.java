import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class32 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_5;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	public final int anInt1058;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!ih;I[Lclient!ha;)V")
	public Class32(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80[] arg2) {
		this.aClass40_Sub2_5 = arg0;
		this.anInt1058 = arg1;
	}

	@OriginalMember(owner = "client!cf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass40_Sub2_5.method2861(this.anInt1058);
		super.finalize();
	}
}
