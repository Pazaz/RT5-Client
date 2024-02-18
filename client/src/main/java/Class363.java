import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class363 {

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!dla;")
	private Class82 aClass82_201 = new Class82(64);

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!dla;")
	public Class82 aClass82_202 = new Class82(64);

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Lclient!sb;")
	public final Class330 aClass330_116;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!sb;")
	private final Class330 aClass330_115;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public Class363(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(3) Class330 arg3) {
		this.aClass330_116 = arg3;
		this.aClass330_115 = arg2;
		this.aClass330_115.method7608(34);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public void method8360() {
		@Pc(2) Class82 local2 = this.aClass82_201;
		synchronized (this.aClass82_201) {
			this.aClass82_201.method2151();
		}
		local2 = this.aClass82_202;
		synchronized (this.aClass82_202) {
			this.aClass82_202.method2151();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public void method8361() {
		@Pc(10) Class82 local10 = this.aClass82_201;
		synchronized (this.aClass82_201) {
			this.aClass82_201.method2157();
		}
		local10 = this.aClass82_202;
		synchronized (this.aClass82_202) {
			this.aClass82_202.method2157();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Lclient!ia;")
	public Class173 method8362(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_201;
		@Pc(16) Class173 local16;
		synchronized (this.aClass82_201) {
			local16 = (Class173) this.aClass82_201.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class330 local30 = this.aClass330_115;
		@Pc(39) byte[] local39;
		synchronized (this.aClass330_115) {
			local39 = this.aClass330_115.method7595(arg0, 34);
		}
		local16 = new Class173();
		local16.aClass363_2 = this;
		if (local39 != null) {
			local16.method3694(new Packet(local39));
		}
		@Pc(68) Class82 local68 = this.aClass82_201;
		synchronized (this.aClass82_201) {
			this.aClass82_201.method2150(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	public void method8365(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass82_201 = new Class82(arg1);
		this.aClass82_202 = new Class82(arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	public void method8367() {
		@Pc(6) Class82 local6 = this.aClass82_201;
		synchronized (this.aClass82_201) {
			this.aClass82_201.method2147(5);
		}
		local6 = this.aClass82_202;
		synchronized (this.aClass82_202) {
			this.aClass82_202.method2147(5);
		}
	}
}
