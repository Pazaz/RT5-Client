import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class SpotAnimTypeList {

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	public int anInt5958;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_50 = new LruHashTable(64);

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!hu;")
	public final LruHashTable aClass98_51 = new LruHashTable(30);

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!r;")
	private final Js5 aClass197_82;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!r;")
	public final Js5 aClass197_81;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public SpotAnimTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aClass197_82 = arg2;
		this.aClass197_81 = arg3;
		@Pc(26) int local26 = this.aClass197_82.capacity() - 1;
		this.aClass197_82.getGroupCapacity(local26);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lclient!hf;")
	public SpotAnimType method5407(@OriginalArg(0) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_50;
		@Pc(25) SpotAnimType local25;
		synchronized (this.aClass98_50) {
			local25 = (SpotAnimType) this.aClass98_50.get((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(48) byte[] local48 = this.aClass197_82.fetchFile(Static298.method2427(arg0), Static117.method2370(arg0));
		local25 = new SpotAnimType();
		local25.aClass211_1 = this;
		local25.anInt2453 = arg0;
		if (local48 != null) {
			local25.decode(new Buffer(local48));
		}
		local6 = this.aClass98_50;
		synchronized (this.aClass98_50) {
			this.aClass98_50.put((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public void method5408() {
		@Pc(2) LruHashTable local2 = this.aClass98_50;
		synchronized (this.aClass98_50) {
			this.aClass98_50.method2621();
		}
		local2 = this.aClass98_51;
		synchronized (this.aClass98_51) {
			this.aClass98_51.method2621();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
	public void method5410() {
		@Pc(6) LruHashTable local6 = this.aClass98_50;
		synchronized (this.aClass98_50) {
			this.aClass98_50.method2614();
		}
		local6 = this.aClass98_51;
		synchronized (this.aClass98_51) {
			this.aClass98_51.method2614();
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V")
	public void method5411() {
		@Pc(14) LruHashTable local14 = this.aClass98_50;
		synchronized (this.aClass98_50) {
			this.aClass98_50.clean(5);
		}
		local14 = this.aClass98_51;
		synchronized (this.aClass98_51) {
			this.aClass98_51.clean(5);
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)V")
	public void method5412(@OriginalArg(1) int arg0) {
		this.anInt5958 = arg0;
		@Pc(13) LruHashTable local13 = this.aClass98_51;
		synchronized (this.aClass98_51) {
			this.aClass98_51.method2614();
		}
	}
}
