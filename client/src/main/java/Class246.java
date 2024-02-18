import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class246 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!dla;")
	private Class82 aClass82_134 = new Class82(128);

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Lclient!dla;")
	public Class82 aClass82_135 = new Class82(64);

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Lclient!sb;")
	public final Class330 aClass330_83;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "Lclient!sb;")
	private final Class330 aClass330_82;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public Class246(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(3) Class330 arg3) {
		this.aClass330_83 = arg3;
		this.aClass330_82 = arg2;
		this.aClass330_82.method7608(36);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V")
	public void method5581() {
		@Pc(12) Class82 local12 = this.aClass82_134;
		synchronized (this.aClass82_134) {
			this.aClass82_134.method2147(5);
		}
		local12 = this.aClass82_135;
		synchronized (this.aClass82_135) {
			this.aClass82_135.method2147(5);
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
	public void method5583(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass82_134 = new Class82(arg0);
		this.aClass82_135 = new Class82(arg1);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)Lclient!el;")
	public Class105 method5584(@OriginalArg(1) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_134;
		@Pc(16) Class105 local16;
		synchronized (this.aClass82_134) {
			local16 = (Class105) this.aClass82_134.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class330 local30 = this.aClass330_82;
		@Pc(39) byte[] local39;
		synchronized (this.aClass330_82) {
			local39 = this.aClass330_82.method7595(arg0, 36);
		}
		local16 = new Class105();
		local16.aClass246_2 = this;
		local16.anInt2590 = arg0;
		if (local39 != null) {
			local16.method2423(new Packet(local39));
		}
		local16.method2430();
		@Pc(72) Class82 local72 = this.aClass82_134;
		synchronized (this.aClass82_134) {
			this.aClass82_134.method2150(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method5585() {
		@Pc(6) Class82 local6 = this.aClass82_134;
		synchronized (this.aClass82_134) {
			this.aClass82_134.method2151();
		}
		local6 = this.aClass82_135;
		synchronized (this.aClass82_135) {
			this.aClass82_135.method2151();
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	public void method5586() {
		@Pc(6) Class82 local6 = this.aClass82_134;
		synchronized (this.aClass82_134) {
			this.aClass82_134.method2157();
		}
		local6 = this.aClass82_135;
		synchronized (this.aClass82_135) {
			this.aClass82_135.method2157();
		}
	}
}
