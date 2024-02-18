import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class135 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "Lclient!tca;")
	private final Class19_Sub1_Sub2 aClass19_Sub1_Sub2_5;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
	public final int anInt3106;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!tca;II)V")
	public Class135(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub1_Sub2_5 = arg0;
		this.anInt3106 = arg2;
	}

	@OriginalMember(owner = "client!fr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub1_Sub2_5.method8162(this.anInt3106);
		super.finalize();
	}
}
