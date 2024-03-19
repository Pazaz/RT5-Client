import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class58 {

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "Lclient!aa;")
	private Class2 aClass2_10;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "Lclient!aa;")
	private final Class2 aClass2_9 = new Class2();

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
	public Class58() {
		this.aClass2_9.aClass2_23 = this.aClass2_9;
		this.aClass2_9.aClass2_24 = this.aClass2_9;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)Lclient!aa;")
	public Class2 method1668() {
		@Pc(7) Class2 local7 = this.aClass2_9.aClass2_24;
		if (local7 == this.aClass2_9) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local7.aClass2_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Z")
	public boolean method1669() {
		return this.aClass2_9 == this.aClass2_9.aClass2_23;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!aa;B)V")
	public void method1670(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_24 != null) {
			arg0.method5802();
		}
		arg0.aClass2_23 = this.aClass2_9;
		arg0.aClass2_24 = this.aClass2_9.aClass2_24;
		arg0.aClass2_24.aClass2_23 = arg0;
		arg0.aClass2_23.aClass2_24 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)I")
	public int method1671() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class2 local16 = this.aClass2_9.aClass2_23;
		while (local16 != this.aClass2_9) {
			local16 = local16.aClass2_23;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)Lclient!aa;")
	public Class2 method1672() {
		@Pc(7) Class2 local7 = this.aClass2_9.aClass2_23;
		if (this.aClass2_9 == local7) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local7.aClass2_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(I)V")
	public void method1673() {
		while (true) {
			@Pc(9) Class2 local9 = this.aClass2_9.aClass2_23;
			if (local9 == this.aClass2_9) {
				this.aClass2_10 = null;
				return;
			}
			local9.method5802();
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)Lclient!aa;")
	public Class2 method1674() {
		@Pc(15) Class2 local15 = this.aClass2_9.aClass2_23;
		if (local15 == this.aClass2_9) {
			return null;
		} else {
			local15.method5802();
			return local15;
		}
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)Lclient!aa;")
	public Class2 method1675() {
		@Pc(14) Class2 local14 = this.aClass2_10;
		if (local14 == this.aClass2_9) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local14.aClass2_23;
			return local14;
		}
	}
}
