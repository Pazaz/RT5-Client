import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class VarbitTypeList {

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!hu;")
	private LruHashTable aClass98_28 = new LruHashTable(64);

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Lclient!r;")
	private final Js5 aClass197_51;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public VarbitTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_51 = arg2;
		if (this.aClass197_51 != null) {
			@Pc(20) int local20 = this.aClass197_51.capacity() - 1;
			this.aClass197_51.getGroupCapacity(local20);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
	public void method3390() {
		@Pc(2) LruHashTable local2 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.clean(5);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)V")
	public void method3392(@OriginalArg(0) int arg0) {
		@Pc(7) LruHashTable local7 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2614();
			this.aClass98_28 = new LruHashTable(arg0);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public void method3393() {
		@Pc(2) LruHashTable local2 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2621();
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(II)Lclient!la;")
	public VarbitType method3394(@OriginalArg(0) int arg0) {
		@Pc(14) LruHashTable local14 = this.aClass98_28;
		@Pc(24) VarbitType local24;
		synchronized (this.aClass98_28) {
			local24 = (VarbitType) this.aClass98_28.get((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(45) byte[] local45 = this.aClass197_51.fetchFile(Static75.method1837(arg0), Static319.method5431(arg0));
		local24 = new VarbitType();
		if (local45 != null) {
			local24.decode(new Buffer(local45));
		}
		@Pc(61) LruHashTable local61 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.put((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
	public void method3395() {
		@Pc(6) LruHashTable local6 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2614();
		}
	}
}
