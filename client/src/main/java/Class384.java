import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class Class384 {

	@OriginalMember(owner = "client!vga", name = "l", descriptor = "Lclient!dla;")
	private final Class82 aClass82_219 = new Class82(64);

	@OriginalMember(owner = "client!vga", name = "k", descriptor = "Lclient!sb;")
	private final Class330 aClass330_120;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class384(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
		this.aClass330_120 = arg2;
		this.aClass330_120.method7608(31);
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V")
	public void method8812() {
		@Pc(2) Class82 local2 = this.aClass82_219;
		synchronized (this.aClass82_219) {
			this.aClass82_219.method2157();
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)V")
	public void method8813() {
		@Pc(6) Class82 local6 = this.aClass82_219;
		synchronized (this.aClass82_219) {
			this.aClass82_219.method2147(5);
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IB)Lclient!vt;")
	public Class392 method8814(@OriginalArg(0) int arg0) {
		@Pc(13) Class82 local13 = this.aClass82_219;
		@Pc(23) Class392 local23;
		synchronized (this.aClass82_219) {
			local23 = (Class392) this.aClass82_219.method2156((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(37) Class330 local37 = this.aClass330_120;
		@Pc(46) byte[] local46;
		synchronized (this.aClass330_120) {
			local46 = this.aClass330_120.method7595(arg0, 31);
		}
		local23 = new Class392();
		if (local46 != null) {
			local23.method9006(new Packet(local46));
		}
		@Pc(70) Class82 local70 = this.aClass82_219;
		synchronized (this.aClass82_219) {
			this.aClass82_219.method2150(local23, (long) arg0);
			return local23;
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V")
	public void method8815() {
		@Pc(2) Class82 local2 = this.aClass82_219;
		synchronized (this.aClass82_219) {
			this.aClass82_219.method2151();
		}
	}
}
