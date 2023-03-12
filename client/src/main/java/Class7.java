import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class7 {

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "Lclient!hu;")
	private final Class98 aClass98_1 = new Class98(64);

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "Lclient!r;")
	private final Js5 aClass197_1;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class7(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_1 = arg2;
		this.aClass197_1.getGroupCapacity(32);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public void method241() {
		@Pc(11) Class98 local11 = this.aClass98_1;
		synchronized (this.aClass98_1) {
			this.aClass98_1.method2614();
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public void method242() {
		@Pc(2) Class98 local2 = this.aClass98_1;
		synchronized (this.aClass98_1) {
			this.aClass98_1.method2621();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
	public void method243() {
		@Pc(2) Class98 local2 = this.aClass98_1;
		synchronized (this.aClass98_1) {
			this.aClass98_1.method2615(5);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lclient!ti;")
	public Class222 method245(@OriginalArg(0) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_1;
		@Pc(16) Class222 local16;
		synchronized (this.aClass98_1) {
			local16 = (Class222) this.aClass98_1.method2612((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_1.fetchFile(arg0, 32);
		local16 = new Class222();
		if (local33 != null) {
			local16.method5690(new Buffer(local33));
		}
		@Pc(49) Class98 local49 = this.aClass98_1;
		synchronized (this.aClass98_1) {
			this.aClass98_1.method2624((long) arg0, local16);
			return local16;
		}
	}
}
