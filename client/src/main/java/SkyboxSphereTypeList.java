import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class SkyboxSphereTypeList {

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_35 = new LruHashTable(16);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!r;")
	private final Js5 aClass197_62;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public SkyboxSphereTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_62 = arg2;
		this.aClass197_62.getGroupCapacity(30);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
	public void method4029() {
		@Pc(11) LruHashTable local11 = this.aClass98_35;
		synchronized (this.aClass98_35) {
			this.aClass98_35.clean(5);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	public void method4030() {
		@Pc(6) LruHashTable local6 = this.aClass98_35;
		synchronized (this.aClass98_35) {
			this.aClass98_35.method2621();
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Lclient!ie;")
	public SkyboxSphereType method4031(@OriginalArg(0) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_35;
		@Pc(16) SkyboxSphereType local16;
		synchronized (this.aClass98_35) {
			local16 = (SkyboxSphereType) this.aClass98_35.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass197_62.fetchFile(arg0, 30);
		local16 = new SkyboxSphereType();
		if (local38 != null) {
			local16.decode(new Buffer(local38));
		}
		@Pc(56) LruHashTable local56 = this.aClass98_35;
		synchronized (this.aClass98_35) {
			this.aClass98_35.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
	public void method4033() {
		@Pc(7) LruHashTable local7 = this.aClass98_35;
		synchronized (this.aClass98_35) {
			this.aClass98_35.method2614();
		}
	}
}
