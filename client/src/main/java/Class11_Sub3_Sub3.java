import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class11_Sub3_Sub3 extends Class11_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!to", name = "t", descriptor = "Lclient!ql;")
	public final Class192 aClass192_3;

	@OriginalMember(owner = "client!to", name = "A", descriptor = "Z")
	private final boolean aBoolean428;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIIZIIIIII)V")
	public Class11_Sub3_Sub3(@OriginalArg(0) TextureProvider arg0, @OriginalArg(1) LocType arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static238.method4121(arg11, arg12));
		this.aClass192_3 = new Class192(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean428 = arg1.anInt1335 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) TextureProvider arg2) {
		@Pc(16) Model local16 = this.aClass192_3.method4941(false, false, arg2, 65536, super.anInt6342, super.anInt6344);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class14 local29 = arg2.method2808();
			local29.method3922(super.anInt6347 + super.anInt6344, super.anInt6348, super.anInt6350 + super.anInt6342);
			return local16.method3820(arg0, arg1, local29, false);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6086() {
		return this.aClass192_3.method4938();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
	@Override
	public int method6081() {
		return this.aClass192_3.anInt5433;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	@Override
	public void method6082() {
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)I")
	@Override
	public int method6085() {
		return this.aClass192_3.anInt5432;
	}

	@OriginalMember(owner = "client!to", name = "h", descriptor = "(I)I")
	@Override
	public int method5748() {
		return this.aClass192_3.method4936();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;")
	@Override
	public Model method6088(@OriginalArg(0) int arg0, @OriginalArg(1) TextureProvider arg1) {
		return this.aClass192_3.method4941(false, false, arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!wm;I)V")
	@Override
	public void method6083(@OriginalArg(0) TextureProvider arg0) {
		this.aClass192_3.method4940(arg0);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6073(@OriginalArg(0) TextureProvider arg0) {
		@Pc(16) Model local16 = this.aClass192_3.method4941(true, false, arg0, 1024, super.anInt6342, super.anInt6344);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class14 local23 = arg0.method2808();
		local23.method3922(super.anInt6344 + super.anInt6347, super.anInt6348, super.anInt6350 + super.anInt6342);
		@Pc(47) Class12_Sub4 local47 = null;
		if (this.aBoolean428) {
			local47 = Static147.method2706(1);
		}
		if (this.aClass192_3.aClass12_Sub5_5 == null) {
			local16.method3835(local23, local47 == null ? null : local47.aClass12_Sub2Array1[0], 0);
		} else {
			@Pc(63) Class224 local63 = this.aClass192_3.aClass12_Sub5_5.method4358();
			arg0.method2824(local16, local63, local23, local47 == null ? null : local47.aClass12_Sub2Array1[0]);
		}
		this.aClass192_3.method4935(arg0, super.anInt6342 >> 7, local16, super.anInt6344 >> 7, super.anInt6342 >> 7, true, super.anInt6344 >> 7);
		return local47;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)I")
	@Override
	public int method6084() {
		return this.aClass192_3.anInt5429;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!wm;)V")
	@Override
	public void method6087(@OriginalArg(1) TextureProvider arg0) {
		this.aClass192_3.method4930(arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6070(@OriginalArg(0) TextureProvider arg0) {
		@Pc(21) Model local21 = this.aClass192_3.method4941(true, false, arg0, 131072, super.anInt6342, super.anInt6344);
		if (local21 != null) {
			this.aClass192_3.method4935(arg0, super.anInt6342 >> 7, local21, super.anInt6344 >> 7, super.anInt6342 >> 7, false, super.anInt6344 >> 7);
		}
	}
}
