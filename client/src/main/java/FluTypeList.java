import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class FluTypeList {

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_64 = new LruHashTable(128);

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "Lclient!r;")
	private final Js5 aClass197_93;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public FluTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_93 = arg2;
		this.aClass197_93.getGroupCapacity(1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	public void method6268() {
		@Pc(14) LruHashTable local14 = this.aClass98_64;
		synchronized (this.aClass98_64) {
			this.aClass98_64.method2621();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)V")
	public void method6269() {
		@Pc(6) LruHashTable local6 = this.aClass98_64;
		synchronized (this.aClass98_64) {
			this.aClass98_64.clean(5);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public void method6270() {
		@Pc(2) LruHashTable local2 = this.aClass98_64;
		synchronized (this.aClass98_64) {
			this.aClass98_64.method2614();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Lclient!tq;")
	public FluType method6271(@OriginalArg(1) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_64;
		@Pc(16) FluType local16;
		synchronized (this.aClass98_64) {
			local16 = (FluType) this.aClass98_64.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_93.fetchFile(arg0, 1);
		local16 = new FluType();
		if (local33 != null) {
			local16.decode(new Buffer(local33));
		}
		@Pc(49) LruHashTable local49 = this.aClass98_64;
		synchronized (this.aClass98_64) {
			this.aClass98_64.put((long) arg0, local16);
			return local16;
		}
	}
}
