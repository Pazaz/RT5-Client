import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class191 {

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Lclient!bs;")
	private Class12_Sub1 aClass12_Sub1_8;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!bs;")
	public final Class12_Sub1 aClass12_Sub1_7 = new Class12_Sub1();

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class191() {
		this.aClass12_Sub1_7.aClass12_Sub1_5 = this.aClass12_Sub1_7;
		this.aClass12_Sub1_7.aClass12_Sub1_6 = this.aClass12_Sub1_7;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)Lclient!bs;")
	public Class12_Sub1 method4888() {
		@Pc(14) Class12_Sub1 local14 = this.aClass12_Sub1_8;
		if (this.aClass12_Sub1_7 == local14) {
			this.aClass12_Sub1_8 = null;
			return null;
		} else {
			this.aClass12_Sub1_8 = local14.aClass12_Sub1_5;
			return local14;
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Lclient!bs;")
	public Class12_Sub1 method4890() {
		@Pc(11) Class12_Sub1 local11 = this.aClass12_Sub1_7.aClass12_Sub1_5;
		if (local11 == this.aClass12_Sub1_7) {
			this.aClass12_Sub1_8 = null;
			return null;
		} else {
			this.aClass12_Sub1_8 = local11.aClass12_Sub1_5;
			return local11;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!bs;I)V")
	public void method4891(@OriginalArg(0) Class12_Sub1 arg0) {
		if (arg0.aClass12_Sub1_6 != null) {
			arg0.method4206();
		}
		arg0.aClass12_Sub1_6 = this.aClass12_Sub1_7.aClass12_Sub1_6;
		arg0.aClass12_Sub1_5 = this.aClass12_Sub1_7;
		arg0.aClass12_Sub1_6.aClass12_Sub1_5 = arg0;
		arg0.aClass12_Sub1_5.aClass12_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
	public void method4892() {
		while (true) {
			@Pc(13) Class12_Sub1 local13 = this.aClass12_Sub1_7.aClass12_Sub1_5;
			if (this.aClass12_Sub1_7 == local13) {
				this.aClass12_Sub1_8 = null;
				return;
			}
			local13.method4206();
		}
	}
}
