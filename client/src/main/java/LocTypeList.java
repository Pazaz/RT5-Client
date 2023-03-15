import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class LocTypeList {

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
	public int anInt5669;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "Z")
	public boolean aBoolean400 = false;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "Lclient!hu;")
	private LruHashTable aClass98_45 = new LruHashTable(64);

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "Lclient!hu;")
	public final LruHashTable aClass98_46 = new LruHashTable(500);

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "Lclient!hu;")
	public final LruHashTable aClass98_47 = new LruHashTable(30);

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "Lclient!hu;")
	public final LruHashTable aClass98_48 = new LruHashTable(50);

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "Lclient!r;")
	private final Js5 aClass197_79;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "Z")
	public boolean aBoolean401;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "Lclient!r;")
	public final Js5 aClass197_78;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!dn;IZLclient!r;Lclient!r;)V")
	public LocTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.aClass197_79 = arg3;
		this.aBoolean401 = arg2;
		this.aClass197_78 = arg4;
		if (this.aClass197_79 != null) {
			@Pc(47) int local47 = this.aClass197_79.capacity() - 1;
			this.aClass197_79.getGroupCapacity(local47);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public void method5155(@OriginalArg(0) int arg0) {
		this.anInt5669 = arg0;
		@Pc(9) LruHashTable local9 = this.aClass98_46;
		synchronized (this.aClass98_46) {
			this.aClass98_46.method2614();
		}
		local9 = this.aClass98_47;
		synchronized (this.aClass98_47) {
			this.aClass98_47.method2614();
		}
		local9 = this.aClass98_48;
		synchronized (this.aClass98_48) {
			this.aClass98_48.method2614();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BZ)V")
	public void setAllowMembers(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean401) {
			this.aBoolean401 = arg0;
			this.method5159();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
	public void method5158() {
		@Pc(2) LruHashTable local2 = this.aClass98_45;
		synchronized (this.aClass98_45) {
			this.aClass98_45.method2621();
		}
		local2 = this.aClass98_46;
		synchronized (this.aClass98_46) {
			this.aClass98_46.method2621();
		}
		local2 = this.aClass98_47;
		synchronized (this.aClass98_47) {
			this.aClass98_47.method2621();
		}
		local2 = this.aClass98_48;
		synchronized (this.aClass98_48) {
			this.aClass98_48.method2621();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public void method5159() {
		@Pc(2) LruHashTable local2 = this.aClass98_45;
		synchronized (this.aClass98_45) {
			this.aClass98_45.method2614();
		}
		local2 = this.aClass98_46;
		synchronized (this.aClass98_46) {
			this.aClass98_46.method2614();
		}
		local2 = this.aClass98_47;
		synchronized (this.aClass98_47) {
			this.aClass98_47.method2614();
		}
		local2 = this.aClass98_48;
		synchronized (this.aClass98_48) {
			this.aClass98_48.method2614();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V")
	public void method5160(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean400) {
			this.aBoolean400 = arg0;
			this.method5159();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)V")
	public void method5161(@OriginalArg(0) int arg0) {
		this.aClass98_45 = new LruHashTable(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
	public void method5162() {
		@Pc(6) LruHashTable local6 = this.aClass98_45;
		synchronized (this.aClass98_45) {
			this.aClass98_45.clean(5);
		}
		local6 = this.aClass98_46;
		synchronized (this.aClass98_46) {
			this.aClass98_46.clean(5);
		}
		local6 = this.aClass98_47;
		synchronized (this.aClass98_47) {
			this.aClass98_47.clean(5);
		}
		local6 = this.aClass98_48;
		synchronized (this.aClass98_48) {
			this.aClass98_48.clean(5);
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(IB)Lclient!ct;")
	public LocType get(@OriginalArg(0) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_45;
		@Pc(16) LocType local16;
		synchronized (this.aClass98_45) {
			local16 = (LocType) this.aClass98_45.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass197_79.fetchFile(Static381.method6348(arg0), Static324.method5540(arg0));
		local16 = new LocType();
		local16.anInt1351 = arg0;
		local16.aClass202_1 = this;
		if (local37 != null) {
			local16.decode(new Buffer(local37));
		}
		local16.method1516();
		if (local16.aBoolean105) {
			local16.anInt1324 = 0;
			local16.aBoolean114 = false;
		}
		if (!this.aBoolean401 && local16.aBoolean111) {
			local16.anIntArray96 = null;
			local16.aStringArray10 = null;
		}
		@Pc(91) LruHashTable local91 = this.aClass98_45;
		synchronized (this.aClass98_45) {
			this.aClass98_45.put((long) arg0, local16);
			return local16;
		}
	}
}
