import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class7_Sub5_Sub2 extends Class7_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!ko", name = "Q", descriptor = "Z")
	private boolean aBoolean281;

	@OriginalMember(owner = "client!ko", name = "y", descriptor = "Z")
	private final boolean aBoolean280;

	@OriginalMember(owner = "client!ko", name = "Z", descriptor = "B")
	private final byte aByte39;

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "S")
	private final short aShort59;

	@OriginalMember(owner = "client!ko", name = "ab", descriptor = "Z")
	private final boolean aBoolean283;

	@OriginalMember(owner = "client!ko", name = "H", descriptor = "B")
	private final byte aByte38;

	@OriginalMember(owner = "client!ko", name = "S", descriptor = "Z")
	private final boolean aBoolean282;

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "Lclient!qc;")
	private Class86 aClass86_2;

	@OriginalMember(owner = "client!ko", name = "T", descriptor = "Lclient!oc;")
	private Class1_Sub1_Sub6 aClass1_Sub1_Sub6_2;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!nr;Lclient!ta;IIIIZIZ)V")
	public Class7_Sub5_Sub2(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean435, arg1.aBoolean436);
		this.aBoolean281 = arg8;
		this.aBoolean280 = arg6;
		this.aByte39 = (byte) arg7;
		this.aShort59 = (short) arg1.anInt6205;
		super.anInt3944 = (short) arg5;
		this.aBoolean283 = arg1.anInt6170 != 0 && !arg6;
		this.aByte38 = (byte) arg2;
		super.anInt3946 = (short) arg3;
		this.aBoolean282 = arg0.method2803() && arg1.aBoolean443 && !this.aBoolean280 && Static102.anInt2545 != 0;
		@Pc(66) int local66 = 1024;
		if (this.aBoolean281) {
			local66 |= 0x8000;
		}
		@Pc(81) Class17 local81 = this.method3408(this.aBoolean282, arg0, local66);
		if (local81 != null) {
			this.aClass86_2 = local81.aClass86_1;
			this.aClass1_Sub1_Sub6_2 = local81.aClass1_Sub1_Sub6_1;
			if (this.aBoolean281) {
				this.aClass86_2 = this.aClass86_2.method5565((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!nr;II)Lclient!qc;")
	private Class86 method3405(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass86_2 != null && arg0.method2752(this.aClass86_2.method5531(), arg1) == 0) {
			return this.aClass86_2;
		} else {
			@Pc(31) Class17 local31 = this.method3408(false, arg0, arg1);
			return local31 == null ? null : local31.aClass86_1;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Lclient!nr;Z)Lclient!g;")
	@Override
	public Class2_Sub3 method5951(@OriginalArg(0) Class40 arg0) {
		if (this.aClass86_2 == null) {
			return null;
		}
		@Pc(11) Class11 local11 = arg0.method2782();
		local11.method5496(super.anInt3946, super.anInt3947, super.anInt3944);
		@Pc(21) Class2_Sub3 local21 = null;
		if (this.aBoolean283) {
			local21 = Static159.method3981(1);
		}
		this.aClass86_2.method5539(local11, local21 == null ? null : local21.aClass2_Sub6Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5682() {
		return this.aBoolean282;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BILclient!nr;)Lclient!qc;")
	@Override
	public Class86 method5681(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1) {
		return this.method3405(arg1, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)I")
	@Override
	public int method5687() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)I")
	@Override
	public int method5686() {
		return this.aShort59 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5952() {
		return this.aBoolean281;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLclient!nr;IIZLclient!cb;I)V")
	@Override
	public void method5956(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class7_Sub5_Sub2) {
			@Pc(9) Class7_Sub5_Sub2 local9 = (Class7_Sub5_Sub2) arg4;
			if (this.aClass86_2 != null && local9.aClass86_2 != null) {
				this.aClass86_2.method5553(local9.aClass86_2, arg2, arg5, arg1, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!nr;)V")
	@Override
	public void method5685(@OriginalArg(1) Class40 arg0) {
		@Pc(14) Class1_Sub1_Sub6 local14;
		if (this.aClass1_Sub1_Sub6_2 == null && this.aBoolean282) {
			@Pc(25) Class17 local25 = this.method3408(true, arg0, 131072);
			local14 = local25 == null ? null : local25.aClass1_Sub1_Sub6_1;
		} else {
			local14 = this.aClass1_Sub1_Sub6_2;
			this.aClass1_Sub1_Sub6_2 = null;
		}
		if (local14 != null) {
			Static162.method3411(local14, this.aByte38, super.anInt3946, super.anInt3944, null);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLclient!nr;IB)Lclient!bc;")
	private Class17 method3408(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class189 local17 = Static83.method1840(this.aShort59 & 0xFFFF);
		@Pc(25) Class77 local25;
		@Pc(33) Class77 local33;
		if (this.aBoolean280) {
			local25 = Static137.aClass77Array2[this.aByte38];
			local33 = Static336.aClass77Array3[0];
		} else {
			local25 = Static336.aClass77Array3[this.aByte38];
			if (this.aByte38 >= 3) {
				local33 = null;
			} else {
				local33 = Static336.aClass77Array3[this.aByte38 + 1];
			}
		}
		return local17.method5206(22, arg1, local25, this.aByte39, super.anInt3944, super.anInt3946, super.anInt3947, arg2, local33, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!nr;Z)V")
	@Override
	public void method5683(@OriginalArg(0) Class40 arg0) {
		@Pc(25) Class1_Sub1_Sub6 local25;
		if (this.aClass1_Sub1_Sub6_2 == null && this.aBoolean282) {
			@Pc(18) Class17 local18 = this.method3408(true, arg0, 131072);
			local25 = local18 == null ? null : local18.aClass1_Sub1_Sub6_1;
		} else {
			local25 = this.aClass1_Sub1_Sub6_2;
			this.aClass1_Sub1_Sub6_2 = null;
		}
		if (local25 != null) {
			Static104.method2157(local25, this.aByte38, super.anInt3946, super.anInt3944, null);
		}
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)V")
	@Override
	public void method5688() {
		if (this.aClass86_2 != null) {
			this.aClass86_2.method5524();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!nr;II)Z")
	@Override
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class86 local9 = this.method3405(arg1, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class11 local19 = arg1.method2782();
			local19.method5496(super.anInt3946, super.anInt3947, super.anInt3944);
			return local9.method5556(arg2, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)I")
	@Override
	public int method5684() {
		return 22;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!nr;I)V")
	@Override
	public void method5957(@OriginalArg(0) Class40 arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
	@Override
	public void method5958() {
		this.aBoolean281 = false;
		if (this.aClass86_2 != null) {
			this.aClass86_2.method5526(this.aClass86_2.method5531() & 0xFFFF7FFF);
		}
	}
}
