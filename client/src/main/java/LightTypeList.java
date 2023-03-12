import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class LightTypeList {

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_41 = new LruHashTable(64);

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Lclient!r;")
	private final Js5 aClass197_69;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public LightTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_69 = arg2;
		this.aClass197_69.getGroupCapacity(31);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!et;")
	public LightType method4878(@OriginalArg(0) int arg0) {
		@Pc(11) LruHashTable local11 = this.aClass98_41;
		@Pc(21) LightType local21;
		synchronized (this.aClass98_41) {
			local21 = (LightType) this.aClass98_41.get((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass197_69.fetchFile(arg0, 31);
		local21 = new LightType();
		if (local38 != null) {
			local21.decode(new Buffer(local38));
		}
		@Pc(54) LruHashTable local54 = this.aClass98_41;
		synchronized (this.aClass98_41) {
			this.aClass98_41.put((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)V")
	public void method4879() {
		@Pc(6) LruHashTable local6 = this.aClass98_41;
		synchronized (this.aClass98_41) {
			this.aClass98_41.clean(5);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	public void method4884() {
		@Pc(2) LruHashTable local2 = this.aClass98_41;
		synchronized (this.aClass98_41) {
			this.aClass98_41.method2621();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public void method4885() {
		@Pc(2) LruHashTable local2 = this.aClass98_41;
		synchronized (this.aClass98_41) {
			this.aClass98_41.method2614();
		}
	}
}
