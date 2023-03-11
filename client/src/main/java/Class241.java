import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class241 {

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!hu;")
	private final Class98 aClass98_64 = new Class98(128);

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "Lclient!r;")
	private final Class197 aClass197_93;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class241(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_93 = arg2;
		this.aClass197_93.method5081(1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	public void method6268() {
		@Pc(14) Class98 local14 = this.aClass98_64;
		synchronized (this.aClass98_64) {
			this.aClass98_64.method2621();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)V")
	public void method6269() {
		@Pc(6) Class98 local6 = this.aClass98_64;
		synchronized (this.aClass98_64) {
			this.aClass98_64.method2615(5);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public void method6270() {
		@Pc(2) Class98 local2 = this.aClass98_64;
		synchronized (this.aClass98_64) {
			this.aClass98_64.method2614();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Lclient!tq;")
	public Class225 method6271(@OriginalArg(1) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_64;
		@Pc(16) Class225 local16;
		synchronized (this.aClass98_64) {
			local16 = (Class225) this.aClass98_64.method2612((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_93.method5089(arg0, 1);
		local16 = new Class225();
		if (local33 != null) {
			local16.method5773(new Class2_Sub4(local33));
		}
		@Pc(49) Class98 local49 = this.aClass98_64;
		synchronized (this.aClass98_64) {
			this.aClass98_64.method2624((long) arg0, local16);
			return local16;
		}
	}
}
