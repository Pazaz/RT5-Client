import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kka")
public final class Class210 {

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "Lclient!dla;")
	private final Class82 aClass82_112 = new Class82(64);

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "Lclient!sb;")
	private final Class330 aClass330_67;

	@OriginalMember(owner = "client!kka", name = "f", descriptor = "I")
	public final int anInt5473;

	@OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class210(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
		this.aClass330_67 = arg2;
		this.anInt5473 = this.aClass330_67.method7608(19);
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(II)Lclient!paa;")
	public Class284 method4947(@OriginalArg(0) int arg0) {
		@Pc(12) Class82 local12 = this.aClass82_112;
		@Pc(22) Class284 local22;
		synchronized (this.aClass82_112) {
			local22 = (Class284) this.aClass82_112.method2156((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(36) Class330 local36 = this.aClass330_67;
		@Pc(45) byte[] local45;
		synchronized (this.aClass330_67) {
			local45 = this.aClass330_67.method7595(arg0, 19);
		}
		local22 = new Class284();
		if (local45 != null) {
			local22.method6449(new Class2_Sub21(local45));
		}
		@Pc(69) Class82 local69 = this.aClass82_112;
		synchronized (this.aClass82_112) {
			this.aClass82_112.method2150(local22, (long) arg0);
			return local22;
		}
	}
}
