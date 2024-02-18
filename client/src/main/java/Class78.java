import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class78 {

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Lclient!dla;")
	private final Class82 aClass82_45 = new Class82(16);

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!sb;")
	private final Class330 aClass330_17;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class78(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
		this.aClass330_17 = arg2;
		this.aClass330_17.method7608(30);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Lclient!afa;")
	public Class10 method2051(@OriginalArg(1) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_45;
		@Pc(16) Class10 local16;
		synchronized (this.aClass82_45) {
			local16 = (Class10) this.aClass82_45.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class330 local30 = this.aClass330_17;
		@Pc(39) byte[] local39;
		synchronized (this.aClass330_17) {
			local39 = this.aClass330_17.method7595(arg0, 30);
		}
		local16 = new Class10();
		if (local39 != null) {
			local16.method131(new Packet(local39));
		}
		@Pc(63) Class82 local63 = this.aClass82_45;
		synchronized (this.aClass82_45) {
			this.aClass82_45.method2150(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public void method2052() {
		@Pc(14) Class82 local14 = this.aClass82_45;
		synchronized (this.aClass82_45) {
			this.aClass82_45.method2157();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public void method2053() {
		@Pc(2) Class82 local2 = this.aClass82_45;
		synchronized (this.aClass82_45) {
			this.aClass82_45.method2151();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
	public void method2055() {
		@Pc(9) Class82 local9 = this.aClass82_45;
		synchronized (this.aClass82_45) {
			this.aClass82_45.method2147(5);
		}
	}
}
