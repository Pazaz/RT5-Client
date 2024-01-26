import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public final class Class179 {

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "J")
	public final long aLong136;

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_19;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lclient!qha;J[Lclient!mfa;)V")
	public Class179(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class240[] arg2) {
		this.aLong136 = arg1;
		this.aClass19_Sub3_19 = arg0;
	}

	@OriginalMember(owner = "client!iha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub3_19.method7042(this.aLong136);
		super.finalize();
	}
}
