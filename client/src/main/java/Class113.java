import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class113 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Lclient!fi;")
	private Class8_Sub4 aClass8_Sub4_2;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "Lclient!fi;")
	public final Class8_Sub4 aClass8_Sub4_1 = new Class8_Sub4();

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	public Class113() {
		this.aClass8_Sub4_1.aClass8_Sub4_10 = this.aClass8_Sub4_1;
		this.aClass8_Sub4_1.aClass8_Sub4_9 = this.aClass8_Sub4_1;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V")
	public void method2487() {
		while (true) {
			@Pc(16) Class8_Sub4 local16 = this.aClass8_Sub4_1.aClass8_Sub4_10;
			if (local16 == this.aClass8_Sub4_1) {
				this.aClass8_Sub4_2 = null;
				return;
			}
			local16.method6686();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!fi;)V")
	public void method2488(@OriginalArg(1) Class8_Sub4 arg0) {
		if (arg0.aClass8_Sub4_9 != null) {
			arg0.method6686();
		}
		arg0.aClass8_Sub4_10 = this.aClass8_Sub4_1;
		arg0.aClass8_Sub4_9 = this.aClass8_Sub4_1.aClass8_Sub4_9;
		arg0.aClass8_Sub4_9.aClass8_Sub4_10 = arg0;
		arg0.aClass8_Sub4_10.aClass8_Sub4_9 = arg0;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)I")
	public int method2489() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class8_Sub4 local19 = this.aClass8_Sub4_1.aClass8_Sub4_10; local19 != this.aClass8_Sub4_1; local19 = local19.aClass8_Sub4_10) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)Lclient!fi;")
	public Class8_Sub4 method2490() {
		@Pc(6) Class8_Sub4 local6 = this.aClass8_Sub4_2;
		if (local6 == this.aClass8_Sub4_1) {
			this.aClass8_Sub4_2 = null;
			return null;
		} else {
			this.aClass8_Sub4_2 = local6.aClass8_Sub4_10;
			return local6;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)Lclient!fi;")
	public Class8_Sub4 method2491() {
		@Pc(15) Class8_Sub4 local15 = this.aClass8_Sub4_1.aClass8_Sub4_10;
		if (local15 == this.aClass8_Sub4_1) {
			this.aClass8_Sub4_2 = null;
			return null;
		} else {
			this.aClass8_Sub4_2 = local15.aClass8_Sub4_10;
			return local15;
		}
	}
}
