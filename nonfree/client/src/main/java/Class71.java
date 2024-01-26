import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class71 {

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_2;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
	public final int anInt1805;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!qha;II)V")
	public Class71(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub3_2 = arg0;
		this.anInt1805 = arg2;
	}

	@OriginalMember(owner = "client!cn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub3_2.method7007(this.anInt1805);
		super.finalize();
	}
}
