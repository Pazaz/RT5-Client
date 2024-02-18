import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class Class134 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_40;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!qha;[BI)V")
	protected Class134(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub3_40 = arg0;
		this.aBuffer3 = this.aClass19_Sub3_40.lb.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!qha;Lclient!jaclib/memory/Buffer;)V")
	protected Class134(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass19_Sub3_40 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([BI)V")
	protected final void method9351(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass19_Sub3_40.lb.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
