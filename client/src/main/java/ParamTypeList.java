import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class ParamTypeList {

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_2 = new LruHashTable(64);

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!r;")
	private final Js5 aClass197_2;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public ParamTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_2 = arg2;
		if (this.aClass197_2 != null) {
			this.aClass197_2.getGroupCapacity(11);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public void method563() {
		@Pc(2) LruHashTable local2 = this.aClass98_2;
		synchronized (this.aClass98_2) {
			this.aClass98_2.method2614();
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public void method564() {
		@Pc(14) LruHashTable local14 = this.aClass98_2;
		synchronized (this.aClass98_2) {
			this.aClass98_2.method2621();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!vp;")
	public ParamType method565(@OriginalArg(1) int arg0) {
		@Pc(11) LruHashTable local11 = this.aClass98_2;
		@Pc(21) ParamType local21;
		synchronized (this.aClass98_2) {
			local21 = (ParamType) this.aClass98_2.get((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass197_2.fetchFile(arg0, 11);
		local21 = new ParamType();
		if (local38 != null) {
			local21.decode(new Buffer(local38));
		}
		@Pc(54) LruHashTable local54 = this.aClass98_2;
		synchronized (this.aClass98_2) {
			this.aClass98_2.put((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)V")
	public void method566() {
		@Pc(6) LruHashTable local6 = this.aClass98_2;
		synchronized (this.aClass98_2) {
			this.aClass98_2.clean(5);
		}
	}
}
