import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class128 {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
	public int anInt2921;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!dla;")
	private final Class82 aClass82_61 = new Class82(64);

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!dla;")
	public final Class82 aClass82_62 = new Class82(60);

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!sb;")
	public final Class330 aClass330_34;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!sb;")
	private final Class330 aClass330_33;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public Class128(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(3) Class330 arg3) {
		this.aClass330_34 = arg3;
		this.aClass330_33 = arg2;
		@Pc(26) int local26 = this.aClass330_33.method7597() - 1;
		this.aClass330_33.method7608(local26);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Lclient!lia;")
	public Class227 method2694(@OriginalArg(1) int arg0) {
		@Pc(14) Class82 local14 = this.aClass82_61;
		@Pc(24) Class227 local24;
		synchronized (this.aClass82_61) {
			local24 = (Class227) this.aClass82_61.method2156((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class330 local38 = this.aClass330_33;
		@Pc(51) byte[] local51;
		synchronized (this.aClass330_33) {
			local51 = this.aClass330_33.method7595(Static560.method7429(arg0), Static359.method5224(arg0));
		}
		local24 = new Class227();
		local24.anInt5833 = arg0;
		local24.aClass128_2 = this;
		if (local51 != null) {
			local24.method5246(new Class2_Sub21(local51));
		}
		@Pc(81) Class82 local81 = this.aClass82_61;
		synchronized (this.aClass82_61) {
			this.aClass82_61.method2150(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)V")
	public void method2695(@OriginalArg(1) int arg0) {
		this.anInt2921 = arg0;
		@Pc(9) Class82 local9 = this.aClass82_62;
		synchronized (this.aClass82_62) {
			this.aClass82_62.method2157();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	public void method2697() {
		@Pc(6) Class82 local6 = this.aClass82_61;
		synchronized (this.aClass82_61) {
			this.aClass82_61.method2151();
		}
		local6 = this.aClass82_62;
		synchronized (this.aClass82_62) {
			this.aClass82_62.method2151();
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	public void method2698() {
		@Pc(2) Class82 local2 = this.aClass82_61;
		synchronized (this.aClass82_61) {
			this.aClass82_61.method2147(5);
		}
		@Pc(30) Class82 local30 = this.aClass82_62;
		synchronized (this.aClass82_62) {
			this.aClass82_62.method2147(5);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public void method2699() {
		@Pc(6) Class82 local6 = this.aClass82_61;
		synchronized (this.aClass82_61) {
			this.aClass82_61.method2157();
		}
		local6 = this.aClass82_62;
		synchronized (this.aClass82_62) {
			this.aClass82_62.method2157();
		}
	}
}
