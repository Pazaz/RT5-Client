import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class80 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_15;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
	public final int anInt2621;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!ih;II)V")
	public Class80(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass40_Sub2_15 = arg0;
		this.anInt2621 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass40_Sub2_15.method2861(this.anInt2621);
		super.finalize();
	}
}
