import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class192 {

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "Lclient!cm;")
	private Class2_Sub2 aClass2_Sub2_37;

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "Lclient!cm;")
	public final Class2_Sub2 aClass2_Sub2_36 = new Class2_Sub2();

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "()V")
	public Class192() {
		this.aClass2_Sub2_36.aClass2_Sub2_66 = this.aClass2_Sub2_36;
		this.aClass2_Sub2_36.aClass2_Sub2_67 = this.aClass2_Sub2_36;
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)Lclient!cm;")
	public Class2_Sub2 method4346() {
		@Pc(7) Class2_Sub2 local7 = this.aClass2_Sub2_36.aClass2_Sub2_66;
		if (this.aClass2_Sub2_36 == local7) {
			return null;
		} else {
			local7.method9260();
			return local7;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZLclient!cm;)V")
	public void method4348(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_67 != null) {
			arg0.method9260();
		}
		arg0.aClass2_Sub2_66 = this.aClass2_Sub2_36;
		arg0.aClass2_Sub2_67 = this.aClass2_Sub2_36.aClass2_Sub2_67;
		arg0.aClass2_Sub2_67.aClass2_Sub2_66 = arg0;
		arg0.aClass2_Sub2_66.aClass2_Sub2_67 = arg0;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)I")
	public int method4349() {
		@Pc(5) int local5 = 0;
		@Pc(17) Class2_Sub2 local17 = this.aClass2_Sub2_36.aClass2_Sub2_66;
		while (this.aClass2_Sub2_36 != local17) {
			local17 = local17.aClass2_Sub2_66;
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)Lclient!cm;")
	public Class2_Sub2 method4350() {
		@Pc(11) Class2_Sub2 local11 = this.aClass2_Sub2_37;
		if (local11 == this.aClass2_Sub2_36) {
			this.aClass2_Sub2_37 = null;
			return null;
		} else {
			this.aClass2_Sub2_37 = local11.aClass2_Sub2_66;
			return local11;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)V")
	public void method4351() {
		while (true) {
			@Pc(3) Class2_Sub2 local3 = this.aClass2_Sub2_36.aClass2_Sub2_66;
			if (local3 == this.aClass2_Sub2_36) {
				this.aClass2_Sub2_37 = null;
				return;
			}
			local3.method9260();
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)Lclient!cm;")
	public Class2_Sub2 method4352() {
		@Pc(18) Class2_Sub2 local18 = this.aClass2_Sub2_36.aClass2_Sub2_66;
		if (local18 == this.aClass2_Sub2_36) {
			this.aClass2_Sub2_37 = null;
			return null;
		} else {
			this.aClass2_Sub2_37 = local18.aClass2_Sub2_66;
			return local18;
		}
	}
}
