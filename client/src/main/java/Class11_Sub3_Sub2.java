import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class11_Sub3_Sub2 extends Class11_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!ni", name = "M", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!ni", name = "O", descriptor = "S")
	private final short aShort60;

	@OriginalMember(owner = "client!ni", name = "H", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!ni", name = "R", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "Z")
	private final boolean aBoolean277;

	@OriginalMember(owner = "client!ni", name = "D", descriptor = "Z")
	private final boolean aBoolean278;

	@OriginalMember(owner = "client!ni", name = "L", descriptor = "Z")
	private final boolean aBoolean279;

	@OriginalMember(owner = "client!ni", name = "T", descriptor = "Lclient!kb;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_5;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "Lclient!gn;")
	private Class31 aClass31_6;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIZIIIII)V")
	public Class11_Sub3_Sub2(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static385.method6429(arg10, arg11));
		this.aByte42 = (byte) arg2;
		this.aShort60 = (short) arg1.anInt1351;
		this.aByte41 = (byte) arg11;
		super.anInt6342 = (short) arg5;
		super.anInt6344 = (short) arg3;
		this.aByte43 = (byte) arg10;
		this.aBoolean277 = arg6;
		this.aBoolean278 = arg1.anInt1335 != 0 && !arg6;
		this.aBoolean279 = arg0.method2878() && arg1.aBoolean110 && !this.aBoolean277 && client.preferences.anInt4886 != 0;
		@Pc(74) Class105 local74 = this.method4097(1024, this.aBoolean279, arg0);
		if (local74 != null) {
			this.aClass2_Sub2_Sub4_5 = local74.aClass2_Sub2_Sub4_3;
			this.aClass31_6 = local74.aClass31_3;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!wm;I)V")
	@Override
	public void method6083(@OriginalArg(0) Class19 arg0) {
		@Pc(31) Class2_Sub2_Sub4 local31;
		if (this.aClass2_Sub2_Sub4_5 == null && this.aBoolean279) {
			@Pc(24) Class105 local24 = this.method4097(131072, true, arg0);
			local31 = local24 == null ? null : local24.aClass2_Sub2_Sub4_3;
		} else {
			local31 = this.aClass2_Sub2_Sub4_5;
			this.aClass2_Sub2_Sub4_5 = null;
		}
		if (local31 != null) {
			Static154.method2780(local31, this.aByte42, super.anInt6344, super.anInt6342, null);
		}
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)I")
	@Override
	public int method6085() {
		return this.aShort60 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6070(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLclient!wm;)V")
	@Override
	public void method6087(@OriginalArg(1) Class19 arg0) {
		@Pc(14) Class2_Sub2_Sub4 local14;
		if (this.aClass2_Sub2_Sub4_5 == null && this.aBoolean279) {
			@Pc(25) Class105 local25 = this.method4097(131072, true, arg0);
			local14 = local25 == null ? null : local25.aClass2_Sub2_Sub4_3;
		} else {
			local14 = this.aClass2_Sub2_Sub4_5;
			this.aClass2_Sub2_Sub4_5 = null;
		}
		if (local14 != null) {
			Static57.method1619(local14, this.aByte42, super.anInt6344, super.anInt6342, null);
		}
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)I")
	@Override
	public int method6084() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6086() {
		return this.aBoolean279;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I")
	@Override
	public int method6081() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)I")
	@Override
	public int method5748() {
		return this.aClass31_6 == null ? 0 : this.aClass31_6.method3802();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!wm;II)Lclient!gn;")
	private Class31 method4096(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass31_6 != null && arg0.method2863(this.aClass31_6.method3827(), arg1) == 0) {
			return this.aClass31_6;
		} else {
			@Pc(28) Class105 local28 = this.method4097(arg1, false, arg0);
			return local28 == null ? null : local28.aClass31_3;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(14) Class31 local14 = this.method4096(arg2, 65536);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class14 local19 = arg2.method2808();
			local19.method3922(super.anInt6344, super.anInt6348, super.anInt6342);
			return local14.method3820(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBZLclient!wm;)Lclient!ij;")
	private Class105 method4097(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(13) Class41 local13 = Static359.LocTypeList.method5163(this.aShort60 & 0xFFFF);
		@Pc(21) Class6 local21;
		@Pc(27) Class6 local27;
		if (this.aBoolean277) {
			local27 = Static330.aClass6Array3[0];
			local21 = Static186.aClass6Array2[this.aByte42];
		} else {
			local21 = Static330.aClass6Array3[this.aByte42];
			if (this.aByte42 >= 3) {
				local27 = null;
			} else {
				local27 = Static330.aClass6Array3[this.aByte42 + 1];
			}
		}
		return local13.method1519(super.anInt6348, local21, this.aByte41, super.anInt6342, super.anInt6344, arg0, arg1, arg2, local27, this.aByte43);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;")
	@Override
	public Class31 method6088(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return this.method4096(arg1, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6073(@OriginalArg(0) Class19 arg0) {
		if (this.aClass31_6 == null) {
			return null;
		}
		@Pc(11) Class14 local11 = arg0.method2808();
		local11.method3922(super.anInt6344 + super.anInt6347, super.anInt6348, super.anInt6350 + super.anInt6342);
		@Pc(35) Class12_Sub4 local35 = null;
		if (this.aBoolean278) {
			local35 = Static147.method2706(1);
		}
		this.aClass31_6.method3835(local11, local35 == null ? null : local35.aClass12_Sub2Array1[0], 0);
		return local35;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	@Override
	public void method6082() {
		if (this.aClass31_6 != null) {
			this.aClass31_6.method3810();
		}
	}
}
