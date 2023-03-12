import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class NpcTypeList {

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
	public int anInt6108;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_53 = new LruHashTable(64);

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!hu;")
	public final LruHashTable aClass98_54 = new LruHashTable(50);

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Lclient!hu;")
	public final LruHashTable aClass98_55 = new LruHashTable(5);

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "Lclient!r;")
	private final Js5 aClass197_87;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Lclient!r;")
	public final Js5 aClass197_88;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Z")
	public boolean aBoolean410;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!dn;IZLclient!r;Lclient!r;)V")
	public NpcTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.aClass197_87 = arg3;
		this.aClass197_88 = arg4;
		this.aBoolean410 = arg2;
		if (this.aClass197_87 != null) {
			@Pc(38) int local38 = this.aClass197_87.capacity() - 1;
			this.aClass197_87.getGroupCapacity(local38);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lclient!fk;")
	public NpcType method5570(@OriginalArg(0) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_53;
		@Pc(16) NpcType local16;
		synchronized (this.aClass98_53) {
			local16 = (NpcType) this.aClass98_53.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass197_87.fetchFile(Static349.method5831(arg0), Static65.method1732(arg0));
		local16 = new NpcType();
		local16.aClass219_2 = this;
		local16.anInt2048 = arg0;
		if (local37 != null) {
			local16.decode(new Buffer(local37));
		}
		local16.method2089();
		@Pc(67) LruHashTable local67 = this.aClass98_53;
		synchronized (this.aClass98_53) {
			this.aClass98_53.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public void method5571() {
		@Pc(2) LruHashTable local2 = this.aClass98_53;
		synchronized (this.aClass98_53) {
			this.aClass98_53.method2614();
		}
		local2 = this.aClass98_54;
		synchronized (this.aClass98_54) {
			this.aClass98_54.method2614();
		}
		local2 = this.aClass98_55;
		synchronized (this.aClass98_55) {
			this.aClass98_55.method2614();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public void method5572() {
		@Pc(6) LruHashTable local6 = this.aClass98_54;
		synchronized (this.aClass98_54) {
			this.aClass98_54.method2614();
		}
		local6 = this.aClass98_55;
		synchronized (this.aClass98_55) {
			this.aClass98_55.method2614();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZB)V")
	public void setAllowMembers(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean410) {
			this.aBoolean410 = arg0;
			this.method5571();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
	public void method5575() {
		@Pc(2) LruHashTable local2 = this.aClass98_53;
		synchronized (this.aClass98_53) {
			this.aClass98_53.clean(5);
		}
		local2 = this.aClass98_54;
		synchronized (this.aClass98_54) {
			this.aClass98_54.clean(5);
		}
		local2 = this.aClass98_55;
		synchronized (this.aClass98_55) {
			this.aClass98_55.clean(5);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
	public void method5578(@OriginalArg(1) int arg0) {
		this.anInt6108 = arg0;
		@Pc(9) LruHashTable local9 = this.aClass98_54;
		synchronized (this.aClass98_54) {
			this.aClass98_54.method2614();
		}
		local9 = this.aClass98_55;
		synchronized (this.aClass98_55) {
			this.aClass98_55.method2614();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public void method5579() {
		@Pc(2) LruHashTable local2 = this.aClass98_53;
		synchronized (this.aClass98_53) {
			this.aClass98_53.method2621();
		}
		local2 = this.aClass98_54;
		synchronized (this.aClass98_54) {
			this.aClass98_54.method2621();
		}
		local2 = this.aClass98_55;
		synchronized (this.aClass98_55) {
			this.aClass98_55.method2621();
		}
	}
}
