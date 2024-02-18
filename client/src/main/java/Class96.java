import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class96 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!dla;")
	private final Class82 aClass82_55 = new Class82(64);

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	public int anInt2509 = 0;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!sb;")
	private final Class330 aClass330_23;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
	public final int anInt2506;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class96(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
		this.aClass330_23 = arg2;
		this.anInt2506 = this.aClass330_23.method7608(4);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public void method2349() {
		@Pc(2) Class82 local2 = this.aClass82_55;
		synchronized (this.aClass82_55) {
			this.aClass82_55.method2157();
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public void method2351() {
		@Pc(9) Class82 local9 = this.aClass82_55;
		synchronized (this.aClass82_55) {
			this.aClass82_55.method2151();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Lclient!re;")
	public Class318 method2352(@OriginalArg(0) int arg0) {
		@Pc(15) Class82 local15 = this.aClass82_55;
		@Pc(25) Class318 local25;
		synchronized (this.aClass82_55) {
			local25 = (Class318) this.aClass82_55.method2156((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(39) Class330 local39 = this.aClass330_23;
		@Pc(48) byte[] local48;
		synchronized (this.aClass330_23) {
			local48 = this.aClass330_23.method7595(arg0, 4);
		}
		local25 = new Class318();
		local25.aClass96_5 = this;
		local25.anInt8253 = arg0;
		if (local48 != null) {
			local25.method7256(new Class2_Sub21(local48));
		}
		local25.method7254();
		@Pc(81) Class82 local81 = this.aClass82_55;
		synchronized (this.aClass82_55) {
			this.aClass82_55.method2150(local25, (long) arg0);
			return local25;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public void method2355() {
		@Pc(2) Class82 local2 = this.aClass82_55;
		synchronized (this.aClass82_55) {
			this.aClass82_55.method2147(5);
		}
	}
}
