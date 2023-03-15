import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class InvTypeList {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_6 = new LruHashTable(64);

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!r;")
	private final Js5 aClass197_15;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public InvTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_15 = arg2;
		this.aClass197_15.getGroupCapacity(5);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)Lclient!hl;")
	public InvType get(@OriginalArg(0) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_6;
		@Pc(16) InvType local16;
		synchronized (this.aClass98_6) {
			local16 = (InvType) this.aClass98_6.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass197_15.fetchFile(arg0, 5);
		local16 = new InvType();
		if (local38 != null) {
			local16.decode(new Buffer(local38));
		}
		@Pc(54) LruHashTable local54 = this.aClass98_6;
		synchronized (this.aClass98_6) {
			this.aClass98_6.put((long) arg0, local16);
			return local16;
		}
	}
}
