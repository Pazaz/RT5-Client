import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class220 {

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!dla;")
	public final Class82 aClass82_121 = new Class82(20);

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!dla;")
	private final Class82 aClass82_122 = new Class82(64);

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Lclient!sb;")
	private final Class330 aClass330_75;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!sb;")
	public final Class330 aClass330_76;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public Class220(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(3) Class330 arg3) {
		this.aClass330_75 = arg2;
		this.aClass330_76 = arg3;
		this.aClass330_75.method7608(46);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void method5182() {
		@Pc(2) Class82 local2 = this.aClass82_122;
		synchronized (this.aClass82_122) {
			this.aClass82_122.method2157();
		}
		local2 = this.aClass82_121;
		synchronized (this.aClass82_121) {
			this.aClass82_121.method2157();
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public void method5183() {
		@Pc(2) Class82 local2 = this.aClass82_122;
		synchronized (this.aClass82_122) {
			this.aClass82_122.method2151();
		}
		local2 = this.aClass82_121;
		synchronized (this.aClass82_121) {
			this.aClass82_121.method2151();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	public void method5184() {
		@Pc(6) Class82 local6 = this.aClass82_122;
		synchronized (this.aClass82_122) {
			this.aClass82_122.method2147(5);
		}
		local6 = this.aClass82_121;
		synchronized (this.aClass82_121) {
			this.aClass82_121.method2147(5);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Lclient!pb;")
	public Class285 method5186(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_122;
		@Pc(16) Class285 local16;
		synchronized (this.aClass82_122) {
			local16 = (Class285) this.aClass82_122.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class330 local30 = this.aClass330_75;
		@Pc(39) byte[] local39;
		synchronized (this.aClass330_75) {
			local39 = this.aClass330_75.method7595(arg0, 46);
		}
		local16 = new Class285();
		local16.aClass220_1 = this;
		if (local39 != null) {
			local16.method6458(new Class2_Sub21(local39));
		}
		@Pc(66) Class82 local66 = this.aClass82_122;
		synchronized (this.aClass82_122) {
			this.aClass82_122.method2150(local16, (long) arg0);
			return local16;
		}
	}
}
