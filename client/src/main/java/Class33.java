import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class33 {

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_6;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public final int anInt1059;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ih;II)V")
	public Class33(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass40_Sub2_6 = arg0;
		this.anInt1059 = arg2;
	}

	@OriginalMember(owner = "client!ch", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass40_Sub2_6.method2844(this.anInt1059);
		super.finalize();
	}
}
