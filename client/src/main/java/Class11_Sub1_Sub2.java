import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class11_Sub1_Sub2 extends Class11_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!ap", name = "F", descriptor = "Lclient!ql;")
	public final Class192 aClass192_1;

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "Z")
	private final boolean aBoolean25;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIIZIII)V")
	public Class11_Sub1_Sub2(@OriginalArg(0) Class19 arg0, @OriginalArg(1) LocType arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static177.method3349(arg8, arg9));
		this.aClass192_1 = new Class192(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt3486, super.anInt3485, arg7, arg10);
		this.aBoolean25 = arg1.anInt1335 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6076() {
		return false;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)I")
	@Override
	public int method6084() {
		return this.aClass192_1.anInt5429;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)I")
	@Override
	public int method6081() {
		return this.aClass192_1.anInt5433;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;")
	@Override
	public Model method6088(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return this.aClass192_1.method4941(false, false, arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLclient!wm;)V")
	@Override
	public void method6087(@OriginalArg(1) Class19 arg0) {
		this.aClass192_1.method4930(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!wm;I)V")
	@Override
	public void method6083(@OriginalArg(0) Class19 arg0) {
		this.aClass192_1.method4940(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6086() {
		return this.aClass192_1.method4938();
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)I")
	@Override
	public int method6085() {
		return this.aClass192_1.anInt5432;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(21) Model local21 = this.aClass192_1.method4941(false, false, arg2, 65536, super.anInt3485, super.anInt3486);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class14 local28 = arg2.method2808();
			local28.method3922(super.anInt3486, super.anInt3484, super.anInt3485);
			return local21.method3820(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) BaseEntity arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6070(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Model local16 = this.aClass192_1.method4941(true, true, arg0, 131072, super.anInt3485, super.anInt3486);
		if (local16 != null) {
			this.aClass192_1.method4935(arg0, super.anInt3485 >> 7, local16, super.anInt3486 >> 7, super.anInt3485 >> 7, false, super.anInt3486 >> 7);
		}
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(I)V")
	@Override
	public void method6069() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
	@Override
	public void method6082() {
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6073(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Model local16 = this.aClass192_1.method4941(true, false, arg0, 1024, super.anInt3485, super.anInt3486);
		if (local16 == null) {
			return null;
		}
		@Pc(30) Class14 local30 = arg0.method2808();
		local30.method3922(super.anInt3486, super.anInt3484, super.anInt3485);
		@Pc(40) Class12_Sub4 local40 = null;
		if (this.aBoolean25) {
			local40 = Static147.method2706(1);
		}
		if (this.aClass192_1.aClass12_Sub5_5 == null) {
			local16.method3835(local30, local40 == null ? null : local40.aClass12_Sub2Array1[0], 0);
		} else {
			@Pc(70) Class224 local70 = this.aClass192_1.aClass12_Sub5_5.method4358();
			arg0.method2824(local16, local70, local30, local40 == null ? null : local40.aClass12_Sub2Array1[0]);
		}
		this.aClass192_1.method4935(arg0, super.anInt3485 >> 7, local16, super.anInt3486 >> 7, super.anInt3485 >> 7, true, super.anInt3486 >> 7);
		return local40;
	}
}
