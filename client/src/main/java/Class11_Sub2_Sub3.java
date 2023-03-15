import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class11_Sub2_Sub3 extends Class11_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "Lclient!ql;")
	public final Class192 aClass192_2;

	@OriginalMember(owner = "client!lq", name = "C", descriptor = "Z")
	private final boolean aBoolean240;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIIZII)V")
	public Class11_Sub2_Sub3(@OriginalArg(0) Class19 arg0, @OriginalArg(1) LocType arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean109, arg1.aBoolean108);
		this.aClass192_2 = new Class192(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean240 = arg1.anInt1335 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!wm;)V")
	@Override
	public void method6087(@OriginalArg(1) Class19 arg0) {
		this.aClass192_2.method4930(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V")
	@Override
	public void method6069() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)I")
	@Override
	public int method6084() {
		return this.aClass192_2.anInt5429;
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)I")
	@Override
	public int method6085() {
		return this.aClass192_2.anInt5432;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(16) Model local16 = this.aClass192_2.method4941(false, false, arg2, 65536, super.anInt3708, super.anInt3710);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class14 local23 = arg2.method2808();
			local23.method3922(super.anInt3710, super.anInt3706, super.anInt3708);
			return local16.method3820(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6086() {
		return this.aClass192_2.method4938();
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
	@Override
	public void method6082() {
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6070(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Model local16 = this.aClass192_2.method4941(true, true, arg0, 131072, super.anInt3708, super.anInt3710);
		if (local16 != null) {
			this.aClass192_2.method4935(arg0, super.anInt3708 >> 7, local16, super.anInt3710 >> 7, super.anInt3708 >> 7, false, super.anInt3710 >> 7);
		}
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6076() {
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;")
	@Override
	public Model method6088(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return this.aClass192_2.method4941(false, false, arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
	@Override
	public int method6081() {
		return this.aClass192_2.anInt5433;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) BaseEntity arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6073(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Model local16 = this.aClass192_2.method4941(true, false, arg0, 1024, super.anInt3708, super.anInt3710);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class14 local23 = arg0.method2808();
		local23.method3922(super.anInt3710, super.anInt3706, super.anInt3708);
		@Pc(38) Class12_Sub4 local38 = null;
		if (this.aBoolean240) {
			local38 = Static147.method2706(1);
		}
		if (this.aClass192_2.aClass12_Sub5_5 == null) {
			local16.method3835(local23, local38 == null ? null : local38.aClass12_Sub2Array1[0], 0);
		} else {
			@Pc(68) Class224 local68 = this.aClass192_2.aClass12_Sub5_5.method4358();
			arg0.method2824(local16, local68, local23, local38 == null ? null : local38.aClass12_Sub2Array1[0]);
		}
		this.aClass192_2.method4935(arg0, super.anInt3708 >> 7, local16, super.anInt3710 >> 7, super.anInt3708 >> 7, true, super.anInt3710 >> 7);
		return local38;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!wm;I)V")
	@Override
	public void method6083(@OriginalArg(0) Class19 arg0) {
		this.aClass192_2.method4940(arg0);
	}
}
