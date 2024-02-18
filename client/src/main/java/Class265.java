import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class265 {

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!tca;")
	private final Class19_Sub1_Sub2 aClass19_Sub1_Sub2_8;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "J")
	public final long aLong213;

	static {
		new Class242("", 76);
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!tca;JI)V")
	public Class265(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub1_Sub2_8 = arg0;
		this.aLong213 = arg1;
	}

	@OriginalMember(owner = "client!ns", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub1_Sub2_8.method8165(this.aLong213);
		super.finalize();
	}
}
