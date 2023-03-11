import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class104 {

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "Lclient!hu;")
	private Class98 aClass98_19 = new Class98(64);

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Lclient!hu;")
	public Class98 aClass98_20 = new Class98(64);

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!r;")
	public final Class197 aClass197_39;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Lclient!r;")
	private final Class197 aClass197_40;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public Class104(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2, @OriginalArg(3) Class197 arg3) {
		this.aClass197_39 = arg3;
		this.aClass197_40 = arg2;
		this.aClass197_40.method5081(34);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)V")
	public void method2702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass98_19 = new Class98(arg0);
		this.aClass98_20 = new Class98(arg1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
	public void method2704() {
		@Pc(6) Class98 local6 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.method2615(5);
		}
		local6 = this.aClass98_20;
		synchronized (this.aClass98_20) {
			this.aClass98_20.method2615(5);
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
	public void method2705() {
		@Pc(2) Class98 local2 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.method2621();
		}
		local2 = this.aClass98_20;
		synchronized (this.aClass98_20) {
			this.aClass98_20.method2621();
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V")
	public void method2707() {
		@Pc(8) Class98 local8 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.method2614();
		}
		local8 = this.aClass98_20;
		synchronized (this.aClass98_20) {
			this.aClass98_20.method2614();
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lclient!md;")
	public Class146 method2708(@OriginalArg(1) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_19;
		@Pc(16) Class146 local16;
		synchronized (this.aClass98_19) {
			local16 = (Class146) this.aClass98_19.method2612((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_40.method5089(arg0, 34);
		local16 = new Class146();
		local16.aClass104_1 = this;
		if (local33 != null) {
			local16.method3706(new Buffer(local33));
		}
		@Pc(52) Class98 local52 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.method2624((long) arg0, local16);
			return local16;
		}
	}
}
