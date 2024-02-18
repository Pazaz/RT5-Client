import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class267 {

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "Lclient!dla;")
	private final Class82 aClass82_142 = new Class82(64);

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "Lclient!dla;")
	public final Class82 aClass82_143 = new Class82(2);

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Lclient!sb;")
	public final Class330 aClass330_88;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "Lclient!sb;")
	private final Class330 aClass330_89;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public Class267(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(3) Class330 arg3) {
		this.aClass330_88 = arg3;
		this.aClass330_89 = arg2;
		this.aClass330_89.method7608(33);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)V")
	public void method5970() {
		@Pc(11) Class82 local11 = this.aClass82_142;
		synchronized (this.aClass82_142) {
			this.aClass82_142.method2147(5);
		}
		local11 = this.aClass82_143;
		synchronized (this.aClass82_143) {
			this.aClass82_143.method2147(5);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	public void method5972() {
		@Pc(9) Class82 local9 = this.aClass82_142;
		synchronized (this.aClass82_142) {
			this.aClass82_142.method2151();
		}
		local9 = this.aClass82_143;
		synchronized (this.aClass82_143) {
			this.aClass82_143.method2151();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Lclient!vla;")
	public Class389 method5973(@OriginalArg(1) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_142;
		@Pc(18) Class389 local18;
		synchronized (this.aClass82_142) {
			local18 = (Class389) this.aClass82_142.method2156((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class330 local32 = this.aClass330_89;
		@Pc(41) byte[] local41;
		synchronized (this.aClass330_89) {
			local41 = this.aClass330_89.method7595(arg0, 33);
		}
		local18 = new Class389();
		local18.aClass267_2 = this;
		if (local41 != null) {
			local18.method8935(new Packet(local41));
		}
		@Pc(70) Class82 local70 = this.aClass82_142;
		synchronized (this.aClass82_142) {
			this.aClass82_142.method2150(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
	public void method5974() {
		@Pc(7) Class82 local7 = this.aClass82_142;
		synchronized (this.aClass82_142) {
			this.aClass82_142.method2157();
		}
		local7 = this.aClass82_143;
		synchronized (this.aClass82_143) {
			this.aClass82_143.method2157();
		}
	}
}
