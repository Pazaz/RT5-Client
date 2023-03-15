import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class11_Sub2_Sub1 extends Class11_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!bm", name = "T", descriptor = "B")
	private final byte aByte3;

	@OriginalMember(owner = "client!bm", name = "L", descriptor = "B")
	private final byte aByte2;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "Z")
	private final boolean aBoolean63;

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "Z")
	private final boolean aBoolean65;

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "Z")
	private boolean aBoolean64;

	@OriginalMember(owner = "client!bm", name = "J", descriptor = "S")
	private final short aShort1;

	@OriginalMember(owner = "client!bm", name = "P", descriptor = "Z")
	private final boolean aBoolean66;

	@OriginalMember(owner = "client!bm", name = "O", descriptor = "Lclient!gn;")
	private Model aClass31_1;

	@OriginalMember(owner = "client!bm", name = "Q", descriptor = "Lclient!kb;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIZIZ)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) RasteriserBase arg0, @OriginalArg(1) LocType arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean109, arg1.aBoolean108);
		this.aByte3 = (byte) arg7;
		this.aByte2 = (byte) arg2;
		this.aBoolean63 = arg1.anInt1335 != 0 && !arg6;
		super.anInt3710 = (short) arg3;
		super.anInt3708 = (short) arg5;
		this.aBoolean65 = arg6;
		this.aBoolean64 = arg8;
		this.aShort1 = (short) arg1.anInt1351;
		this.aBoolean66 = arg0.method2878() && arg1.aBoolean110 && !this.aBoolean65 && client.preferences.sceneryShadowsType != 0;
		@Pc(70) int local70 = 1024;
		if (this.aBoolean64) {
			local70 |= 0x8000;
		}
		@Pc(85) Class105 local85 = this.method940(local70, this.aBoolean66, arg0);
		if (local85 != null) {
			this.aClass31_1 = local85.aClass31_3;
			this.aClass2_Sub2_Sub4_1 = local85.aClass2_Sub2_Sub4_3;
			if (this.aBoolean64) {
				this.aClass31_1 = this.aClass31_1.method3800((byte) 0, local70, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)V")
	@Override
	public void method6069() {
		this.aBoolean64 = false;
		if (this.aClass31_1 != null) {
			this.aClass31_1.method3814(this.aClass31_1.method3827() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6076() {
		return this.aBoolean64;
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)I")
	@Override
	public int method6085() {
		return this.aShort1 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILclient!wm;)Lclient!gn;")
	private Model method936(@OriginalArg(0) int arg0, @OriginalArg(2) RasteriserBase arg1) {
		if (this.aClass31_1 != null && arg1.method2863(this.aClass31_1.method3827(), arg0) == 0) {
			return this.aClass31_1;
		} else {
			@Pc(32) Class105 local32 = this.method940(arg0, false, arg1);
			return local32 == null ? null : local32.aClass31_3;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6073(@OriginalArg(0) RasteriserBase arg0) {
		if (this.aClass31_1 == null) {
			return null;
		}
		@Pc(11) Class14 local11 = arg0.method2808();
		local11.method3922(super.anInt3710, super.anInt3706, super.anInt3708);
		@Pc(21) Class12_Sub4 local21 = null;
		if (this.aBoolean63) {
			local21 = Static147.method2706(1);
		}
		this.aClass31_1.method3835(local11, local21 == null ? null : local21.aClass12_Sub2Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RasteriserBase arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) BaseEntity arg5) {
		if (arg5 instanceof Class11_Sub2_Sub1) {
			@Pc(12) Class11_Sub2_Sub1 local12 = (Class11_Sub2_Sub1) arg5;
			if (this.aClass31_1 != null && local12.aClass31_1 != null) {
				this.aClass31_1.method3803(local12.aClass31_1, arg0, arg2, arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLclient!wm;)V")
	@Override
	public void method6087(@OriginalArg(1) RasteriserBase arg0) {
		@Pc(32) Class2_Sub2_Sub4 local32;
		if (this.aClass2_Sub2_Sub4_1 == null && this.aBoolean66) {
			@Pc(25) Class105 local25 = this.method940(131072, true, arg0);
			local32 = local25 == null ? null : local25.aClass2_Sub2_Sub4_3;
		} else {
			local32 = this.aClass2_Sub2_Sub4_1;
			this.aClass2_Sub2_Sub4_1 = null;
		}
		if (local32 != null) {
			Static57.method1619(local32, this.aByte2, super.anInt3710, super.anInt3708, null);
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
	@Override
	public void method6082() {
		if (this.aClass31_1 != null) {
			this.aClass31_1.method3810();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;")
	@Override
	public Model method6088(@OriginalArg(0) int arg0, @OriginalArg(1) RasteriserBase arg1) {
		return this.method936(arg0, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)I")
	@Override
	public int method6084() {
		return this.aByte3;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)I")
	@Override
	public int method6081() {
		return 22;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!wm;I)V")
	@Override
	public void method6083(@OriginalArg(0) RasteriserBase arg0) {
		@Pc(29) Class2_Sub2_Sub4 local29;
		if (this.aClass2_Sub2_Sub4_1 == null && this.aBoolean66) {
			@Pc(22) Class105 local22 = this.method940(131072, true, arg0);
			local29 = local22 == null ? null : local22.aClass2_Sub2_Sub4_3;
		} else {
			local29 = this.aClass2_Sub2_Sub4_1;
			this.aClass2_Sub2_Sub4_1 = null;
		}
		if (local29 != null) {
			Static154.method2780(local29, this.aByte2, super.anInt3710, super.anInt3708, null);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZLclient!wm;I)Lclient!ij;")
	private Class105 method940(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) RasteriserBase arg2) {
		@Pc(18) LocType local18 = client.LocTypes.get(this.aShort1 & 0xFFFF);
		@Pc(26) Class6 local26;
		@Pc(34) Class6 local34;
		if (this.aBoolean65) {
			local26 = Scene.aClass6Array2[this.aByte2];
			local34 = Scene.aClass6Array3[0];
		} else {
			local26 = Scene.aClass6Array3[this.aByte2];
			if (this.aByte2 >= 3) {
				local34 = null;
			} else {
				local34 = Scene.aClass6Array3[this.aByte2 + 1];
			}
		}
		return local18.method1519(super.anInt3706, local26, this.aByte3, super.anInt3708, super.anInt3710, arg0, arg1, arg2, local34, 22);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6070(@OriginalArg(0) RasteriserBase arg0) {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) RasteriserBase arg2) {
		@Pc(14) Model local14 = this.method936(65536, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class14 local19 = arg2.method2808();
			local19.method3922(super.anInt3710, super.anInt3706, super.anInt3708);
			return local14.method3820(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6086() {
		return this.aBoolean66;
	}
}
