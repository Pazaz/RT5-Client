import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class35 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_7;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	public final int anInt1010;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!bf;II)V")
	public Class35(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub1_7 = arg0;
		this.anInt1010 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub1_7.method820(this.anInt1010);
		super.finalize();
	}
}
