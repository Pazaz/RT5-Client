import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class7_Sub2_Sub2 extends Class7_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!to", name = "J", descriptor = "B")
	private final byte aByte64;

	@OriginalMember(owner = "client!to", name = "O", descriptor = "B")
	private final byte aByte65;

	@OriginalMember(owner = "client!to", name = "M", descriptor = "Z")
	private boolean aBoolean462;

	@OriginalMember(owner = "client!to", name = "t", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!to", name = "Z", descriptor = "S")
	private final short aShort80;

	@OriginalMember(owner = "client!to", name = "U", descriptor = "Z")
	private final boolean aBoolean464;

	@OriginalMember(owner = "client!to", name = "R", descriptor = "Z")
	private final boolean aBoolean463;

	@OriginalMember(owner = "client!to", name = "W", descriptor = "Z")
	private final boolean aBoolean466;

	@OriginalMember(owner = "client!to", name = "u", descriptor = "Lclient!qc;")
	public Class86 aClass86_5;

	@OriginalMember(owner = "client!to", name = "I", descriptor = "Lclient!oc;")
	private Class1_Sub1_Sub6 aClass1_Sub1_Sub6_5;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!nr;Lclient!ta;IIIIZIIZ)V")
	public Class7_Sub2_Sub2(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static104.method2151(arg8, arg7));
		this.aByte64 = (byte) arg2;
		super.anInt6405 = (short) arg3;
		this.aByte65 = (byte) arg8;
		this.aBoolean462 = arg9;
		this.aByte63 = (byte) arg7;
		this.aShort80 = (short) arg1.anInt6205;
		super.anInt6403 = (short) arg5;
		this.aBoolean464 = arg6;
		this.aBoolean463 = arg1.anInt6170 != 0 && !arg6;
		this.aBoolean466 = arg0.method2803() && arg1.aBoolean443 && !this.aBoolean464 && Static102.anInt2545 != 0;
		@Pc(67) int local67 = 1024;
		if (this.aBoolean462) {
			local67 |= 0x8000;
		}
		@Pc(82) Class17 local82 = this.method5405(this.aBoolean466, arg0, local67);
		if (local82 != null) {
			this.aClass86_5 = local82.aClass86_1;
			this.aClass1_Sub1_Sub6_5 = local82.aClass1_Sub1_Sub6_1;
			if (this.aBoolean462) {
				this.aClass86_5 = this.aClass86_5.method5565((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Lclient!nr;Z)Lclient!g;")
	@Override
	public Class2_Sub3 method5951(@OriginalArg(0) Class40 arg0) {
		if (this.aClass86_5 == null) {
			return null;
		}
		@Pc(17) Class11 local17 = arg0.method2782();
		local17.method5496(super.anInt6405, super.anInt6407, super.anInt6403);
		@Pc(27) Class2_Sub3 local27 = null;
		if (this.aBoolean463) {
			local27 = Static159.method3981(1);
		}
		this.aClass86_5.method5539(local17, local27 == null ? null : local27.aClass2_Sub6Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
	@Override
	public int method5684() {
		return this.aByte63;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!nr;II)Z")
	@Override
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class86 local14 = this.method5408(arg1, 65536);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class11 local19 = arg1.method2782();
			local19.method5496(super.anInt6405, super.anInt6407, super.anInt6403);
			return local14.method5556(arg2, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!nr;IIZLclient!cb;I)V")
	@Override
	public void method5956(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class7_Sub2_Sub2) {
			@Pc(41) Class7_Sub2_Sub2 local41 = (Class7_Sub2_Sub2) arg4;
			if (this.aClass86_5 == null || local41.aClass86_5 == null) {
				return;
			}
			this.aClass86_5.method5553(local41.aClass86_5, arg2, arg5, arg1, arg3);
		} else if (arg4 instanceof Class7_Sub1_Sub5) {
			@Pc(22) Class7_Sub1_Sub5 local22 = (Class7_Sub1_Sub5) arg4;
			if (this.aClass86_5 != null && local22.aClass86_3 != null) {
				this.aClass86_5.method5553(local22.aClass86_3, arg2, arg5, arg1, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BZLclient!nr;I)Lclient!bc;")
	private Class17 method5405(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class189 local12 = Static83.method1840(this.aShort80 & 0xFFFF);
		@Pc(25) Class77 local25;
		@Pc(36) Class77 local36;
		if (this.aBoolean464) {
			local25 = Static137.aClass77Array2[this.aByte64];
			local36 = Static336.aClass77Array3[0];
		} else {
			local25 = Static336.aClass77Array3[this.aByte64];
			if (this.aByte64 < 3) {
				local36 = Static336.aClass77Array3[this.aByte64 + 1];
			} else {
				local36 = null;
			}
		}
		return local12.method5206(this.aByte63, arg1, local25, this.aByte65, super.anInt6403, super.anInt6405, super.anInt6407, arg2, local36, arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BILclient!nr;)Lclient!qc;")
	@Override
	public Class86 method5681(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1) {
		return this.method5408(arg1, arg0);
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(B)V")
	@Override
	public void method5688() {
		if (this.aClass86_5 != null) {
			this.aClass86_5.method5524();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!nr;Z)V")
	@Override
	public void method5683(@OriginalArg(0) Class40 arg0) {
		@Pc(30) Class1_Sub1_Sub6 local30;
		if (this.aClass1_Sub1_Sub6_5 == null && this.aBoolean466) {
			@Pc(23) Class17 local23 = this.method5405(true, arg0, 131072);
			local30 = local23 == null ? null : local23.aClass1_Sub1_Sub6_1;
		} else {
			local30 = this.aClass1_Sub1_Sub6_5;
			this.aClass1_Sub1_Sub6_5 = null;
		}
		if (local30 != null) {
			Static104.method2157(local30, this.aByte64, super.anInt6405, super.anInt6403, null);
		}
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(B)I")
	@Override
	public int method5687() {
		return this.aByte65;
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5952() {
		return this.aBoolean462;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!nr;)V")
	@Override
	public void method5685(@OriginalArg(1) Class40 arg0) {
		@Pc(31) Class1_Sub1_Sub6 local31;
		if (this.aClass1_Sub1_Sub6_5 == null && this.aBoolean466) {
			@Pc(24) Class17 local24 = this.method5405(true, arg0, 131072);
			local31 = local24 == null ? null : local24.aClass1_Sub1_Sub6_1;
		} else {
			local31 = this.aClass1_Sub1_Sub6_5;
			this.aClass1_Sub1_Sub6_5 = null;
		}
		if (local31 != null) {
			Static162.method3411(local31, this.aByte64, super.anInt6405, super.anInt6403, null);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!nr;I)Lclient!qc;")
	private Class86 method5408(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass86_5 != null && arg0.method2752(this.aClass86_5.method5531(), arg1) == 0) {
			return this.aClass86_5;
		} else {
			@Pc(23) Class17 local23 = this.method5405(false, arg0, arg1);
			return local23 == null ? null : local23.aClass86_1;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5682() {
		return this.aBoolean466;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(B)I")
	@Override
	public int method5686() {
		return this.aShort80 & 0xFFFF;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!nr;I)V")
	@Override
	public void method5957(@OriginalArg(0) Class40 arg0) {
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
	@Override
	public void method5958() {
		this.aBoolean462 = false;
		if (this.aClass86_5 != null) {
			this.aClass86_5.method5526(this.aClass86_5.method5531() & 0xFFFF7FFF);
		}
	}
}
