import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class36 {

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "Lclient!ss;")
	private Class12 aClass12_10;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "Lclient!ss;")
	private final Class12 aClass12_9 = new Class12();

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class36() {
		this.aClass12_9.aClass12_24 = this.aClass12_9;
		this.aClass12_9.aClass12_23 = this.aClass12_9;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z")
	public boolean method1414() {
		return this.aClass12_9.aClass12_24 == this.aClass12_9;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Lclient!ss;")
	public Class12 method1415() {
		@Pc(15) Class12 local15 = this.aClass12_9.aClass12_24;
		if (local15 == this.aClass12_9) {
			this.aClass12_10 = null;
			return null;
		} else {
			this.aClass12_10 = local15.aClass12_24;
			return local15;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
	public void method1416() {
		while (true) {
			@Pc(9) Class12 local9 = this.aClass12_9.aClass12_24;
			if (this.aClass12_9 == local9) {
				this.aClass12_10 = null;
				return;
			}
			local9.method5684();
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Lclient!ss;")
	public Class12 method1417() {
		@Pc(7) Class12 local7 = this.aClass12_9.aClass12_23;
		if (this.aClass12_9 == local7) {
			this.aClass12_10 = null;
			return null;
		} else {
			this.aClass12_10 = local7.aClass12_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!ss;)V")
	public void method1418(@OriginalArg(1) Class12 arg0) {
		if (arg0.aClass12_23 != null) {
			arg0.method5684();
		}
		arg0.aClass12_23 = this.aClass12_9.aClass12_23;
		arg0.aClass12_24 = this.aClass12_9;
		arg0.aClass12_23.aClass12_24 = arg0;
		arg0.aClass12_24.aClass12_23 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)I")
	public int method1419() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class12 local16 = this.aClass12_9.aClass12_24; local16 != this.aClass12_9; local16 = local16.aClass12_24) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Lclient!ss;")
	public Class12 method1420() {
		@Pc(6) Class12 local6 = this.aClass12_10;
		if (this.aClass12_9 == local6) {
			this.aClass12_10 = null;
			return null;
		} else {
			this.aClass12_10 = local6.aClass12_24;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)Lclient!ss;")
	public Class12 method1424() {
		@Pc(13) Class12 local13 = this.aClass12_9.aClass12_24;
		if (this.aClass12_9 == local13) {
			return null;
		} else {
			local13.method5684();
			return local13;
		}
	}
}
