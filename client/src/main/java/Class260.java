import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class260 {

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!dla;")
	private final Class82 aClass82_138 = new Class82(64);

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!sb;")
	private final Class330 aClass330_86;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public final int anInt6462;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class260(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
		this.aClass330_86 = arg2;
		if (this.aClass330_86 == null) {
			this.anInt6462 = 0;
		} else {
			this.anInt6462 = this.aClass330_86.method7608(16);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	public void method5781() {
		@Pc(2) Class82 local2 = this.aClass82_138;
		synchronized (this.aClass82_138) {
			this.aClass82_138.method2151();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Lclient!rha;")
	public Class321 method5782(@OriginalArg(1) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_138;
		@Pc(16) Class321 local16;
		synchronized (this.aClass82_138) {
			local16 = (Class321) this.aClass82_138.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class330 local30 = this.aClass330_86;
		@Pc(39) byte[] local39;
		synchronized (this.aClass330_86) {
			local39 = this.aClass330_86.method7595(arg0, 16);
		}
		local16 = new Class321();
		if (local39 != null) {
			local16.method7294(new Packet(local39));
		}
		@Pc(63) Class82 local63 = this.aClass82_138;
		synchronized (this.aClass82_138) {
			this.aClass82_138.method2150(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public void method5784() {
		@Pc(13) Class82 local13 = this.aClass82_138;
		synchronized (this.aClass82_138) {
			this.aClass82_138.method2157();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
	public void method5785() {
		@Pc(11) Class82 local11 = this.aClass82_138;
		synchronized (this.aClass82_138) {
			this.aClass82_138.method2147(5);
		}
	}
}
