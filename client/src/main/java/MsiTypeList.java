import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class MsiTypeList {

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "Lclient!hu;")
	private LruHashTable aClass98_19 = new LruHashTable(64);

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Lclient!hu;")
	public LruHashTable aClass98_20 = new LruHashTable(64);

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!r;")
	public final Js5 aClass197_39;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Lclient!r;")
	private final Js5 aClass197_40;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public MsiTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aClass197_39 = arg3;
		this.aClass197_40 = arg2;
		this.aClass197_40.getGroupCapacity(34);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)V")
	public void method2702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass98_19 = new LruHashTable(arg0);
		this.aClass98_20 = new LruHashTable(arg1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
	public void method2704() {
		@Pc(6) LruHashTable local6 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.clean(5);
		}
		local6 = this.aClass98_20;
		synchronized (this.aClass98_20) {
			this.aClass98_20.clean(5);
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
	public void method2705() {
		@Pc(2) LruHashTable local2 = this.aClass98_19;
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
		@Pc(8) LruHashTable local8 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.method2614();
		}
		local8 = this.aClass98_20;
		synchronized (this.aClass98_20) {
			this.aClass98_20.method2614();
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lclient!md;")
	public MsiType method2708(@OriginalArg(1) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_19;
		@Pc(16) MsiType local16;
		synchronized (this.aClass98_19) {
			local16 = (MsiType) this.aClass98_19.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_40.fetchFile(arg0, 34);
		local16 = new MsiType();
		local16.aClass104_1 = this;
		if (local33 != null) {
			local16.decode(new Packet(local33));
		}
		@Pc(52) LruHashTable local52 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.put((long) arg0, local16);
			return local16;
		}
	}
}
