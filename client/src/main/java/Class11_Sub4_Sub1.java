import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class11_Sub4_Sub1 extends Class11_Sub4 {

	@OriginalMember(owner = "client!n", name = "v", descriptor = "I")
	public int anInt3978;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "I")
	public int anInt3982;

	@OriginalMember(owner = "client!n", name = "D", descriptor = "I")
	public int anInt3984;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "I")
	public int anInt3985;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "I")
	public int anInt3980 = -1;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "I")
	public int anInt3981 = -1;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6073(@OriginalArg(0) Class19 arg0) {
		@Pc(6) Class14 local6 = arg0.method2808();
		local6.method3922(super.anInt3968, super.anInt3965, super.anInt3967);
		@Pc(18) Class12_Sub4 local18 = Static147.method2706(3);
		@Pc(40) Model local40;
		if (this.anInt3981 != -1) {
			local40 = client.ObjTypes.get(this.anInt3981).method4776(0, 1024, -1, null, arg0, this.anInt3982, null, 0);
			if (local40 != null) {
				local40.method3835(local6, local18.aClass12_Sub2Array1[2], 0);
			}
		}
		if (this.anInt3980 != -1) {
			local40 = client.ObjTypes.get(this.anInt3980).method4776(0, 1024, -1, null, arg0, this.anInt3978, null, 0);
			if (local40 != null) {
				local40.method3835(local6, local18.aClass12_Sub2Array1[1], 0);
			}
		}
		local40 = client.ObjTypes.get(this.anInt3985).method4776(0, 1024, -1, null, arg0, this.anInt3984, null, 0);
		if (local40 != null) {
			local40.method3835(local6, local18.aClass12_Sub2Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(11) Class14 local11 = arg2.method2808();
		local11.method3922(super.anInt3968, super.anInt3965, super.anInt3967);
		@Pc(36) Model local36 = client.ObjTypes.get(this.anInt3985).method4776(0, 65536, -1, null, arg2, this.anInt3984, null, 0);
		if (local36 != null && local36.method3820(arg0, arg1, local11, true)) {
			return true;
		}
		if (this.anInt3980 != -1) {
			local36 = client.ObjTypes.get(this.anInt3980).method4776(0, 65536, -1, null, arg2, this.anInt3978, null, 0);
			if (local36 != null && local36.method3820(arg0, arg1, local11, true)) {
				return true;
			}
		}
		if (this.anInt3981 != -1) {
			local36 = client.ObjTypes.get(this.anInt3981).method4776(0, 65536, -1, null, arg2, this.anInt3982, null, 0);
			if (local36 != null && local36.method3820(arg0, arg1, local11, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6070(@OriginalArg(0) Class19 arg0) {
	}
}
