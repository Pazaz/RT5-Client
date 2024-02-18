import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public final class Class45 {

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "Lclient!dla;")
	private final Class82 aClass82_17 = new Class82(64);

	@OriginalMember(owner = "client!bka", name = "h", descriptor = "Lclient!sb;")
	private final Class330 aClass330_9;

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class45(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
		this.aClass330_9 = arg2;
		if (this.aClass330_9 != null) {
			this.aClass330_9.method7608(35);
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)V")
	public void method1093() {
		@Pc(6) Class82 local6 = this.aClass82_17;
		synchronized (this.aClass82_17) {
			this.aClass82_17.method2151();
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IB)Lclient!la;")
	public Class218 method1094(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_17;
		@Pc(16) Class218 local16;
		synchronized (this.aClass82_17) {
			local16 = (Class218) this.aClass82_17.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class330 local30 = this.aClass330_9;
		@Pc(39) byte[] local39;
		synchronized (this.aClass330_9) {
			local39 = this.aClass330_9.method7595(arg0, 35);
		}
		local16 = new Class218();
		if (local39 != null) {
			local16.method5127(new Class2_Sub21(local39));
		}
		local16.method5123();
		@Pc(66) Class82 local66 = this.aClass82_17;
		synchronized (this.aClass82_17) {
			this.aClass82_17.method2150(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(II)V")
	public void method1096() {
		@Pc(11) Class82 local11 = this.aClass82_17;
		synchronized (this.aClass82_17) {
			this.aClass82_17.method2147(5);
		}
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)V")
	public void method1098() {
		@Pc(2) Class82 local2 = this.aClass82_17;
		synchronized (this.aClass82_17) {
			this.aClass82_17.method2157();
		}
	}
}
