import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class MelTypeList {

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!hu;")
	private LruHashTable aClass98_26 = new LruHashTable(128);

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "Lclient!hu;")
	public LruHashTable aClass98_27 = new LruHashTable(64);

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Lclient!r;")
	private final Js5 aClass197_49;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "Lclient!r;")
	public final Js5 aClass197_50;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public MelTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aClass197_49 = arg2;
		this.aClass197_50 = arg3;
		this.aClass197_49.getGroupCapacity(36);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	public void method3373() {
		@Pc(11) LruHashTable local11 = this.aClass98_26;
		synchronized (this.aClass98_26) {
			this.aClass98_26.method2621();
		}
		local11 = this.aClass98_27;
		synchronized (this.aClass98_27) {
			this.aClass98_27.method2621();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
	public void method3376() {
		@Pc(2) LruHashTable local2 = this.aClass98_26;
		synchronized (this.aClass98_26) {
			this.aClass98_26.clean(5);
		}
		local2 = this.aClass98_27;
		synchronized (this.aClass98_27) {
			this.aClass98_27.clean(5);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
	public void method3377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass98_26 = new LruHashTable(arg1);
		this.aClass98_27 = new LruHashTable(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)Lclient!np;")
	public MelType method3379(@OriginalArg(1) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_26;
		@Pc(16) MelType local16;
		synchronized (this.aClass98_26) {
			local16 = (MelType) this.aClass98_26.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_49.fetchFile(arg0, 36);
		local16 = new MelType();
		local16.anInt4430 = arg0;
		local16.aClass125_2 = this;
		if (local33 != null) {
			local16.decode(new Buffer(local33));
		}
		local16.method4187();
		@Pc(65) LruHashTable local65 = this.aClass98_26;
		synchronized (this.aClass98_26) {
			this.aClass98_26.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	public void method3380() {
		@Pc(2) LruHashTable local2 = this.aClass98_26;
		synchronized (this.aClass98_26) {
			this.aClass98_26.method2614();
		}
		local2 = this.aClass98_27;
		synchronized (this.aClass98_27) {
			this.aClass98_27.method2614();
		}
	}
}
