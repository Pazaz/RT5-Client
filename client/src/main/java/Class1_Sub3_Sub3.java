import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "Lclient!mi;")
	private final Class130 aClass130_24 = new Class130();

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "Lclient!mi;")
	private final Class130 aClass130_25 = new Class130();

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
	private int anInt4115 = 0;

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
	private int anInt4116 = -1;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "()I")
	@Override
	public int method4456() {
		return 0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "()Lclient!af;")
	@Override
	public Class1_Sub3 method4451() {
		return (Class1_Sub3) this.aClass130_24.method3756();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!af;)V")
	public synchronized void method3522(@OriginalArg(0) Class1_Sub3 arg0) {
		arg0.method6172();
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "()Lclient!af;")
	@Override
	public Class1_Sub3 method4453() {
		return (Class1_Sub3) this.aClass130_24.method3749();
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "()V")
	private void method3523() {
		if (this.anInt4115 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub17 local8 = (Class1_Sub17) this.aClass130_25.method3749(); local8 != null; local8 = (Class1_Sub17) this.aClass130_25.method3756()) {
			local8.anInt3457 -= this.anInt4115;
		}
		this.anInt4116 -= this.anInt4115;
		this.anInt4115 = 0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!o;Lclient!jf;)V")
	private void method3524(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub17 arg1) {
		while (arg0 != this.aClass130_25.aClass1_138 && ((Class1_Sub17) arg0).anInt3457 <= arg1.anInt3457) {
			arg0 = arg0.aClass1_247;
		}
		Static355.method3606(arg0, arg1);
		this.anInt4116 = ((Class1_Sub17) this.aClass130_25.aClass1_138.aClass1_247).anInt3457;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4457(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4116 < 0) {
				this.method3526(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4115 + arg2 < this.anInt4116) {
				this.anInt4115 += arg2;
				this.method3526(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4116 - this.anInt4115;
			this.method3526(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4115 += local33;
			this.method3523();
			@Pc(60) Class1_Sub17 local60 = (Class1_Sub17) this.aClass130_25.method3749();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3074(this);
				if (local68 < 0) {
					local60.anInt3457 = 0;
					this.method3528(local60);
				} else {
					local60.anInt3457 = local68;
					this.method3524(local60.aClass1_247, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
	private void method3525(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass130_24.method3749(); local5 != null; local5 = (Class1_Sub3) this.aClass130_24.method3756()) {
			local5.method4454(arg0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4454(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4116 < 0) {
				this.method3525(arg0);
				return;
			}
			if (this.anInt4115 + arg0 < this.anInt4116) {
				this.anInt4115 += arg0;
				this.method3525(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4116 - this.anInt4115;
			this.method3525(local29);
			arg0 -= local29;
			this.anInt4115 += local29;
			this.method3523();
			@Pc(50) Class1_Sub17 local50 = (Class1_Sub17) this.aClass130_25.method3749();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3074(this);
				if (local58 < 0) {
					local50.anInt3457 = 0;
					this.method3528(local50);
				} else {
					local50.anInt3457 = local58;
					this.method3524(local50.aClass1_247, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "([III)V")
	private void method3526(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass130_24.method3749(); local5 != null; local5 = (Class1_Sub3) this.aClass130_24.method3756()) {
			local5.method4452(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lclient!af;)V")
	public synchronized void method3527(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aClass130_24.method3758(arg0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!jf;)V")
	private void method3528(@OriginalArg(0) Class1_Sub17 arg0) {
		arg0.method6172();
		arg0.method3075();
		@Pc(9) Class1 local9 = this.aClass130_25.aClass1_138.aClass1_247;
		if (local9 == this.aClass130_25.aClass1_138) {
			this.anInt4116 = -1;
		} else {
			this.anInt4116 = ((Class1_Sub17) local9).anInt3457;
		}
	}
}
