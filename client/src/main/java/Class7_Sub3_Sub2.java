import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class7_Sub3_Sub2 extends Class7_Sub3 {

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "B")
	private final byte aByte69;

	@OriginalMember(owner = "client!vc", name = "G", descriptor = "Z")
	private final boolean aBoolean485;

	@OriginalMember(owner = "client!vc", name = "N", descriptor = "S")
	private final short aShort89;

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!vc", name = "db", descriptor = "Z")
	private final boolean aBoolean488;

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "Z")
	private final boolean aBoolean486;

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "Lclient!oc;")
	private Class1_Sub1_Sub6 aClass1_Sub1_Sub6_6;

	@OriginalMember(owner = "client!vc", name = "X", descriptor = "Lclient!qc;")
	private Class86 aClass86_7;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!nr;Lclient!ta;IIIIZIIIII)V")
	public Class7_Sub3_Sub2(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static164.method3435(arg10, arg11));
		this.aByte69 = (byte) arg2;
		super.anInt6683 = (short) arg3;
		this.aBoolean485 = arg6;
		super.anInt6685 = (short) arg5;
		this.aShort89 = (short) arg1.anInt6205;
		this.aByte70 = (byte) arg11;
		this.aByte68 = (byte) arg10;
		this.aBoolean488 = arg1.anInt6170 != 0 && !arg6;
		this.aBoolean486 = arg0.method2803() && arg1.aBoolean443 && !this.aBoolean485 && Static102.anInt2545 != 0;
		@Pc(76) Class17 local76 = this.method5691(1024, arg0, this.aBoolean486);
		if (local76 != null) {
			this.aClass1_Sub1_Sub6_6 = local76.aClass1_Sub1_Sub6_1;
			this.aClass86_7 = local76.aClass86_1;
		}
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V")
	@Override
	public void method5688() {
		if (this.aClass86_7 != null) {
			this.aClass86_7.method5524();
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lclient!nr;Z)Lclient!g;")
	@Override
	public Class2_Sub3 method5951(@OriginalArg(0) Class40 arg0) {
		if (this.aClass86_7 == null) {
			return null;
		}
		@Pc(18) Class11 local18 = arg0.method2782();
		local18.method5496(super.anInt6684 + super.anInt6683, super.anInt6681, super.anInt6680 + super.anInt6685);
		@Pc(34) Class2_Sub3 local34 = null;
		if (this.aBoolean488) {
			local34 = Static159.method3981(1);
		}
		this.aClass86_7.method5539(local18, local34 == null ? null : local34.aClass2_Sub6Array1[0], 0);
		return local34;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BILclient!nr;Z)Lclient!bc;")
	private Class17 method5691(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class189 local12 = Static83.method1840(this.aShort89 & 0xFFFF);
		@Pc(34) Class77 local34;
		@Pc(29) Class77 local29;
		if (this.aBoolean485) {
			local29 = Static336.aClass77Array3[0];
			local34 = Static137.aClass77Array2[this.aByte69];
		} else {
			local34 = Static336.aClass77Array3[this.aByte69];
			if (this.aByte69 < 3) {
				local29 = Static336.aClass77Array3[this.aByte69 + 1];
			} else {
				local29 = null;
			}
		}
		return local12.method5206(this.aByte68, arg1, local34, this.aByte70, super.anInt6685, super.anInt6683, super.anInt6681, arg0, local29, arg2);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BILclient!nr;)Lclient!qc;")
	@Override
	public Class86 method5681(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1) {
		return this.method5692(arg1, arg0);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)I")
	@Override
	public int method5686() {
		return this.aShort89 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!nr;I)Lclient!qc;")
	private Class86 method5692(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass86_7 != null && arg0.method2752(this.aClass86_7.method5531(), arg1) == 0) {
			return this.aClass86_7;
		} else {
			@Pc(27) Class17 local27 = this.method5691(arg1, arg0, false);
			return local27 == null ? null : local27.aClass86_1;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!nr;Z)V")
	@Override
	public void method5683(@OriginalArg(0) Class40 arg0) {
		@Pc(25) Class1_Sub1_Sub6 local25;
		if (this.aClass1_Sub1_Sub6_6 == null && this.aBoolean486) {
			@Pc(18) Class17 local18 = this.method5691(131072, arg0, true);
			local25 = local18 == null ? null : local18.aClass1_Sub1_Sub6_1;
		} else {
			local25 = this.aClass1_Sub1_Sub6_6;
			this.aClass1_Sub1_Sub6_6 = null;
		}
		if (local25 != null) {
			Static104.method2157(local25, this.aByte69, super.anInt6683, super.anInt6685, null);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5682() {
		return this.aBoolean486;
	}

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)I")
	@Override
	public int method5680() {
		return this.aClass86_7 == null ? 0 : this.aClass86_7.method5534();
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)I")
	@Override
	public int method5687() {
		return this.aByte70;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)I")
	@Override
	public int method5684() {
		return this.aByte68;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!nr;II)Z")
	@Override
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class86 local9 = this.method5692(arg1, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class11 local14 = arg1.method2782();
			local14.method5496(super.anInt6683, super.anInt6681, super.anInt6685);
			return local9.method5556(arg2, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!nr;)V")
	@Override
	public void method5685(@OriginalArg(1) Class40 arg0) {
		@Pc(21) Class1_Sub1_Sub6 local21;
		if (this.aClass1_Sub1_Sub6_6 == null && this.aBoolean486) {
			@Pc(32) Class17 local32 = this.method5691(131072, arg0, true);
			local21 = local32 == null ? null : local32.aClass1_Sub1_Sub6_1;
		} else {
			local21 = this.aClass1_Sub1_Sub6_6;
			this.aClass1_Sub1_Sub6_6 = null;
		}
		if (local21 != null) {
			Static162.method3411(local21, this.aByte69, super.anInt6683, super.anInt6685, null);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!nr;I)V")
	@Override
	public void method5957(@OriginalArg(0) Class40 arg0) {
	}
}
