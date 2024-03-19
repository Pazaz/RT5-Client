import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class7_Sub1_Sub5 extends Class7_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "Z")
	private boolean aBoolean382;

	@OriginalMember(owner = "client!ql", name = "D", descriptor = "S")
	private final short aShort69;

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "Z")
	private final boolean aBoolean384;

	@OriginalMember(owner = "client!ql", name = "W", descriptor = "B")
	private final byte aByte51;

	@OriginalMember(owner = "client!ql", name = "cb", descriptor = "Z")
	private final boolean aBoolean385;

	@OriginalMember(owner = "client!ql", name = "Z", descriptor = "B")
	private final byte aByte52;

	@OriginalMember(owner = "client!ql", name = "U", descriptor = "B")
	private final byte aByte50;

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "Z")
	private final boolean aBoolean383;

	@OriginalMember(owner = "client!ql", name = "R", descriptor = "Lclient!oc;")
	private Class1_Sub1_Sub6 aClass1_Sub1_Sub6_3;

	@OriginalMember(owner = "client!ql", name = "Y", descriptor = "Lclient!qc;")
	public Class86 aClass86_3;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!nr;Lclient!ta;IIIIIZIIIIIIZ)V")
	public Class7_Sub1_Sub5(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt6196 == 1, Static75.method1743(arg12, arg13));
		this.aBoolean382 = arg14;
		this.aShort69 = (short) arg1.anInt6205;
		this.aBoolean384 = arg7;
		this.aByte51 = (byte) arg13;
		this.aBoolean385 = arg1.anInt6170 != 0 && !arg7;
		this.aByte52 = (byte) arg12;
		this.aByte50 = (byte) arg3;
		this.aBoolean383 = arg0.method2803() && arg1.aBoolean443 && !this.aBoolean384 && Static102.anInt2545 != 0;
		@Pc(74) int local74 = 1024;
		if (this.aBoolean382) {
			local74 |= 0x8000;
		}
		@Pc(89) Class17 local89 = this.method4678(arg0, this.aBoolean383, local74);
		if (local89 != null) {
			this.aClass1_Sub1_Sub6_3 = local89.aClass1_Sub1_Sub6_1;
			this.aClass86_3 = local89.aClass86_1;
			if (this.aBoolean382) {
				this.aClass86_3 = this.aClass86_3.method5565((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V")
	@Override
	public void method5958() {
		this.aBoolean382 = false;
		if (this.aClass86_3 != null) {
			this.aClass86_3.method5526(this.aClass86_3.method5531() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!nr;Z)V")
	@Override
	public void method5683(@OriginalArg(0) Class40 arg0) {
		@Pc(21) Class1_Sub1_Sub6 local21;
		if (this.aClass1_Sub1_Sub6_3 == null && this.aBoolean383) {
			@Pc(32) Class17 local32 = this.method4678(arg0, true, 131072);
			local21 = local32 == null ? null : local32.aClass1_Sub1_Sub6_1;
		} else {
			local21 = this.aClass1_Sub1_Sub6_3;
			this.aClass1_Sub1_Sub6_3 = null;
		}
		if (local21 != null) {
			Static104.method2157(local21, this.aByte50, super.anInt7027, super.anInt7032, null);
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lclient!nr;Z)Lclient!g;")
	@Override
	public Class2_Sub3 method5951(@OriginalArg(0) Class40 arg0) {
		if (this.aClass86_3 == null) {
			return null;
		}
		@Pc(17) Class11 local17 = arg0.method2782();
		local17.method5496(super.anInt7027, super.anInt7031, super.anInt7032);
		@Pc(27) Class2_Sub3 local27 = null;
		if (this.aBoolean385) {
			local27 = Static159.method3981(1);
		}
		this.aClass86_3.method5539(local17, local27 == null ? null : local27.aClass2_Sub6Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)V")
	@Override
	public void method5688() {
		if (this.aClass86_3 != null) {
			this.aClass86_3.method5524();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLclient!nr;IIZLclient!cb;I)V")
	@Override
	public void method5956(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class7_Sub2_Sub2) {
			@Pc(28) Class7_Sub2_Sub2 local28 = (Class7_Sub2_Sub2) arg4;
			if (this.aClass86_3 != null && local28.aClass86_5 != null) {
				this.aClass86_3.method5553(local28.aClass86_5, arg2, arg5, arg1, arg3);
			}
		} else if (arg4 instanceof Class7_Sub1_Sub5) {
			@Pc(8) Class7_Sub1_Sub5 local8 = (Class7_Sub1_Sub5) arg4;
			if (this.aClass86_3 != null && local8.aClass86_3 != null) {
				this.aClass86_3.method5553(local8.aClass86_3, arg2, arg5, arg1, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!nr;ZI)Lclient!bc;")
	private Class17 method4678(@OriginalArg(1) Class40 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class189 local17 = Static83.method1840(this.aShort69 & 0xFFFF);
		@Pc(29) Class77 local29;
		@Pc(24) Class77 local24;
		if (this.aBoolean384) {
			local24 = Static336.aClass77Array3[0];
			local29 = Static137.aClass77Array2[this.aByte50];
		} else {
			local29 = Static336.aClass77Array3[this.aByte50];
			if (this.aByte50 < 3) {
				local24 = Static336.aClass77Array3[this.aByte50 + 1];
			} else {
				local24 = null;
			}
		}
		return local17.method5206(this.aByte52 == 11 ? 10 : this.aByte52, arg0, local29, this.aByte52 == 11 ? this.aByte51 + 4 : this.aByte51, super.anInt7032, super.anInt7027, super.anInt7031, arg2, local24, arg1);
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)I")
	@Override
	public int method5687() {
		return this.aByte51;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5952() {
		return this.aBoolean382;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)I")
	@Override
	public int method5686() {
		return this.aShort69 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)I")
	@Override
	public int method5684() {
		return this.aByte52;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!nr;I)V")
	@Override
	public void method5957(@OriginalArg(0) Class40 arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!nr;BI)Lclient!qc;")
	private Class86 method4681(@OriginalArg(0) Class40 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass86_3 != null && arg0.method2752(this.aClass86_3.method5531(), arg1) == 0) {
			return this.aClass86_3;
		} else {
			@Pc(29) Class17 local29 = this.method4678(arg0, false, arg1);
			return local29 == null ? null : local29.aClass86_1;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!nr;II)Z")
	@Override
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class86 local9 = this.method4681(arg1, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class11 local14 = arg1.method2782();
			local14.method5496(super.anInt7027, super.anInt7031, super.anInt7032);
			return local9.method5556(arg2, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)I")
	@Override
	public int method5961() {
		return this.aClass86_3 == null ? 0 : this.aClass86_3.method5534();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!nr;)V")
	@Override
	public void method5685(@OriginalArg(1) Class40 arg0) {
		@Pc(21) Class1_Sub1_Sub6 local21;
		if (this.aClass1_Sub1_Sub6_3 == null && this.aBoolean383) {
			@Pc(32) Class17 local32 = this.method4678(arg0, true, 131072);
			local21 = local32 == null ? null : local32.aClass1_Sub1_Sub6_1;
		} else {
			local21 = this.aClass1_Sub1_Sub6_3;
			this.aClass1_Sub1_Sub6_3 = null;
		}
		if (local21 != null) {
			Static162.method3411(local21, this.aByte50, super.anInt7027, super.anInt7032, null);
		}
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(B)I")
	public int method4682() {
		return this.aClass86_3 == null ? 15 : this.aClass86_3.method5537() / 4;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5682() {
		return this.aBoolean383;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BILclient!nr;)Lclient!qc;")
	@Override
	public Class86 method5681(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1) {
		return this.method4681(arg1, arg0);
	}
}
