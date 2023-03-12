import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class211 {

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	public int anInt5958;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!hu;")
	private final Class98 aClass98_50 = new Class98(64);

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!hu;")
	public final Class98 aClass98_51 = new Class98(30);

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!r;")
	private final Js5 aClass197_82;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!r;")
	public final Js5 aClass197_81;

	static {
		new LocalizedString(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
		new LocalizedString("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public Class211(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aClass197_82 = arg2;
		this.aClass197_81 = arg3;
		@Pc(26) int local26 = this.aClass197_82.capacity() - 1;
		this.aClass197_82.getGroupCapacity(local26);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lclient!hf;")
	public Class91 method5407(@OriginalArg(0) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_50;
		@Pc(25) Class91 local25;
		synchronized (this.aClass98_50) {
			local25 = (Class91) this.aClass98_50.method2612((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(48) byte[] local48 = this.aClass197_82.fetchFile(Static298.method2427(arg0), Static117.method2370(arg0));
		local25 = new Class91();
		local25.aClass211_1 = this;
		local25.anInt2453 = arg0;
		if (local48 != null) {
			local25.method2430(new Buffer(local48));
		}
		local6 = this.aClass98_50;
		synchronized (this.aClass98_50) {
			this.aClass98_50.method2624((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public void method5408() {
		@Pc(2) Class98 local2 = this.aClass98_50;
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
		@Pc(6) Class98 local6 = this.aClass98_50;
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
		@Pc(14) Class98 local14 = this.aClass98_50;
		synchronized (this.aClass98_50) {
			this.aClass98_50.method2615(5);
		}
		local14 = this.aClass98_51;
		synchronized (this.aClass98_51) {
			this.aClass98_51.method2615(5);
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)V")
	public void method5412(@OriginalArg(1) int arg0) {
		this.anInt5958 = arg0;
		@Pc(13) Class98 local13 = this.aClass98_51;
		synchronized (this.aClass98_51) {
			this.aClass98_51.method2614();
		}
	}
}
