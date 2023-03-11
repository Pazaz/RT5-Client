import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class128 {

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!hu;")
	private Class98 aClass98_28 = new Class98(64);

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Lclient!r;")
	private final Class197 aClass197_51;

	static {
		new Class79("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class128(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_51 = arg2;
		if (this.aClass197_51 != null) {
			@Pc(20) int local20 = this.aClass197_51.method5092() - 1;
			this.aClass197_51.method5081(local20);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
	public void method3390() {
		@Pc(2) Class98 local2 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2615(5);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)V")
	public void method3392(@OriginalArg(0) int arg0) {
		@Pc(7) Class98 local7 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2614();
			this.aClass98_28 = new Class98(arg0);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public void method3393() {
		@Pc(2) Class98 local2 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2621();
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(II)Lclient!la;")
	public Class134 method3394(@OriginalArg(0) int arg0) {
		@Pc(14) Class98 local14 = this.aClass98_28;
		@Pc(24) Class134 local24;
		synchronized (this.aClass98_28) {
			local24 = (Class134) this.aClass98_28.method2612((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(45) byte[] local45 = this.aClass197_51.method5089(Static75.method1837(arg0), Static319.method5431(arg0));
		local24 = new Class134();
		if (local45 != null) {
			local24.method3509(new Buffer(local45));
		}
		@Pc(61) Class98 local61 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2624((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
	public void method3395() {
		@Pc(6) Class98 local6 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2614();
		}
	}
}
