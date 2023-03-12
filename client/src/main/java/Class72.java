import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class72 {

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Lclient!hu;")
	private final Class98 aClass98_11 = new Class98(64);

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
	public int anInt2060 = 0;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Lclient!r;")
	private final Js5 aClass197_22;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
	public final int anInt2059;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class72(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_22 = arg2;
		this.anInt2059 = this.aClass197_22.getGroupCapacity(4);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V")
	public void method2102() {
		@Pc(10) Class98 local10 = this.aClass98_11;
		synchronized (this.aClass98_11) {
			this.aClass98_11.method2615(5);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public void method2103() {
		@Pc(6) Class98 local6 = this.aClass98_11;
		synchronized (this.aClass98_11) {
			this.aClass98_11.method2614();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)Lclient!mg;")
	public Class148 method2105(@OriginalArg(1) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_11;
		@Pc(16) Class148 local16;
		synchronized (this.aClass98_11) {
			local16 = (Class148) this.aClass98_11.method2612((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass197_22.fetchFile(arg0, 4);
		local16 = new Class148();
		local16.aClass72_4 = this;
		local16.anInt3756 = arg0;
		if (local41 != null) {
			local16.method3718(new Buffer(local41));
		}
		local16.method3716();
		@Pc(66) Class98 local66 = this.aClass98_11;
		synchronized (this.aClass98_11) {
			this.aClass98_11.method2624((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method2108() {
		@Pc(6) Class98 local6 = this.aClass98_11;
		synchronized (this.aClass98_11) {
			this.aClass98_11.method2621();
		}
	}
}
