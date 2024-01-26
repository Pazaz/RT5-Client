import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public final class Class317 {

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "J")
	public final long aLong253;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "Lclient!tca;")
	private final Class19_Sub1_Sub2 aClass19_Sub1_Sub2_10;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!tca;J[Lclient!ns;)V")
	public Class317(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class265[] arg2) {
		this.aLong253 = arg1;
		this.aClass19_Sub1_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub1_Sub2_10.method8165(this.aLong253);
		super.finalize();
	}
}
