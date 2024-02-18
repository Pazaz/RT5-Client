import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public final class Class240 {

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_29;

	@OriginalMember(owner = "client!mfa", name = "e", descriptor = "J")
	public final long aLong189;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lclient!qha;JI)V")
	public Class240(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub3_29 = arg0;
		this.aLong189 = arg1;
	}

	@OriginalMember(owner = "client!mfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub3_29.method7042(this.aLong189);
		super.finalize();
	}
}
