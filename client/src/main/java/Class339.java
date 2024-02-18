import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class Class339 {

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "Lclient!ie;")
	private Class2 aClass2_272;

	@OriginalMember(owner = "client!sia", name = "x", descriptor = "Lclient!ie;")
	public final Class2 aClass2_271 = new Class2();

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "()V")
	public Class339() {
		this.aClass2_271.aClass2_346 = this.aClass2_271;
		this.aClass2_271.aClass2_345 = this.aClass2_271;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!ie;I)V")
	public void method7697(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_345 != null) {
			arg0.method9457();
		}
		arg0.aClass2_346 = this.aClass2_271.aClass2_346;
		arg0.aClass2_345 = this.aClass2_271;
		arg0.aClass2_345.aClass2_346 = arg0;
		arg0.aClass2_346.aClass2_345 = arg0;
	}

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "(I)Lclient!ie;")
	public Class2 method7699(@OriginalArg(0) int arg0) {
		@Pc(7) Class2 local7 = this.aClass2_271.aClass2_346;
		if (arg0 != 65280) {
			this.aClass2_272 = null;
		}
		if (local7 == this.aClass2_271) {
			this.aClass2_272 = null;
			return null;
		} else {
			this.aClass2_272 = local7.aClass2_346;
			return local7;
		}
	}

	@OriginalMember(owner = "client!sia", name = "f", descriptor = "(I)V")
	public void method7700() {
		while (true) {
			@Pc(7) Class2 local7 = this.aClass2_271.aClass2_346;
			if (this.aClass2_271 == local7) {
				this.aClass2_272 = null;
				return;
			}
			local7.method9457();
		}
	}

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "(I)I")
	public int method7701() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class2 local17 = this.aClass2_271.aClass2_346;
		while (local17 != this.aClass2_271) {
			local17 = local17.aClass2_346;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!sia", name = "d", descriptor = "(I)Z")
	public boolean method7702() {
		return this.aClass2_271 == this.aClass2_271.aClass2_346;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!ie;Lclient!sia;B)V")
	private void method7703(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class339 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_271.aClass2_345;
		this.aClass2_271.aClass2_345 = arg0.aClass2_345;
		arg0.aClass2_345.aClass2_346 = this.aClass2_271;
		if (arg0 != this.aClass2_271) {
			arg0.aClass2_345 = arg1.aClass2_271.aClass2_345;
			arg0.aClass2_345.aClass2_346 = arg0;
			local7.aClass2_346 = arg1.aClass2_271;
			arg1.aClass2_271.aClass2_345 = local7;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)Lclient!ie;")
	public Class2 method7705() {
		@Pc(7) Class2 local7 = this.aClass2_271.aClass2_346;
		if (local7 == this.aClass2_271) {
			return null;
		} else {
			local7.method9457();
			return local7;
		}
	}

	@OriginalMember(owner = "client!sia", name = "h", descriptor = "(I)Lclient!ie;")
	public Class2 method7706() {
		@Pc(13) Class2 local13 = this.aClass2_272;
		if (local13 == this.aClass2_271) {
			this.aClass2_272 = null;
			return null;
		} else {
			this.aClass2_272 = local13.aClass2_346;
			return local13;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ILclient!sia;)V")
	public void method7707(@OriginalArg(1) Class339 arg0) {
		this.method7703(this.aClass2_271.aClass2_346, arg0);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)Lclient!ie;")
	public Class2 method7708() {
		@Pc(14) Class2 local14 = this.aClass2_271.aClass2_345;
		if (local14 == this.aClass2_271) {
			this.aClass2_272 = null;
			return null;
		} else {
			this.aClass2_272 = local14.aClass2_345;
			return local14;
		}
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(B)Lclient!ie;")
	public Class2 method7709() {
		@Pc(6) Class2 local6 = this.aClass2_272;
		if (local6 == this.aClass2_271) {
			this.aClass2_272 = null;
			return null;
		} else {
			this.aClass2_272 = local6.aClass2_345;
			return local6;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(BLclient!ie;)V")
	public void method7711(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_345 != null) {
			arg0.method9457();
		}
		arg0.aClass2_346 = this.aClass2_271;
		arg0.aClass2_345 = this.aClass2_271.aClass2_345;
		arg0.aClass2_345.aClass2_346 = arg0;
		arg0.aClass2_346.aClass2_345 = arg0;
	}
}
